package fr.obeo.dsl.tuto.mindstorms.design;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.obeo.dsl.tuto.mindstorms.Choreography;
import fr.obeo.dsl.tuto.mindstorms.Instruction;
import fr.obeo.dsl.tuto.mindstorms.Rotate;

/**
 * The services class used by VSM.
 */
public class Services {

	/**
	 * See
	 * http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24
	 * for documentation on how to write service methods.
	 */
	public EObject myService(EObject self, String arg) {
		// TODO Auto-generated code
		return self;
	}

	public Instruction getNextInstruction(Instruction instruction) {
		Choreography parentChoreography = (Choreography) instruction.eContainer();
		List<Instruction> actions = parentChoreography.getInstructions();
		int position = actions.indexOf(instruction);
		if (position == actions.size() - 1) {
			return null;
		} else {
			return actions.get(position + 1);
		}
	}

	public void setNextInstruction(Instruction i1, Instruction i2) {
		if (i1 != i2) {
			Choreography parentChoreography = (Choreography) i1.eContainer();
			List<Instruction> instructions = parentChoreography.getInstructions();
			parentChoreography.getInstructions().remove(i2);
			parentChoreography.getInstructions().add(instructions.indexOf(i1) + 1, i2);
		}
	}

	public void setFirstInstruction(Choreography parentChoreography, Instruction instruction) {
		parentChoreography.getInstructions().remove(instruction);
		parentChoreography.getInstructions().add(0, instruction);
	}

	public void editRotateLabel(Rotate rotate, String label) {
		String valueOf = String.valueOf(label.replaceAll("°", ""));
		if ("?".equalsIgnoreCase(valueOf)) {
			rotate.setRandom(true);
			rotate.setDegrees(0);
		} else
			try {
				int parseInt = Integer.parseInt(valueOf);
				if (parseInt < 360 && parseInt > -360) {
					rotate.setDegrees(parseInt);
					rotate.setRandom(false);
					return;
				}
			} catch (NumberFormatException e) {
				// Do nothing
			}
	}
}
