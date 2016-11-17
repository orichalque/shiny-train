## Sirius Project

You will need to use Obeo Design 9.1 for this project

### Getting started

Import the projects of the dart meta-model in the workspace of a first Eclipse

* org.obeonetwork.dsl.dart
* org.obeonetwork.dsl.dart.edit
* org.obeonetwork.dsl.dart.editor

Then launch a second Eclipse using a run configuration. Inside this second Eclipse, create a Modeling Project named fr.univnantes.alma.dsl.dart.sample and copy/paste inside the file sample.dartspec. In this second Eclipse, you will create a new Viewpoint Specification Project named fr.univnantes.alma.dsl.dart.design. Most of the work of this project will be realized in this project in a similar fashion as the Sirius tutorial.

Copy the folder icons to the root of your Viewpoint Specification Project named fr.univnantes.alma.dsl.dart.design.

### First viewpoint

Create a viewpoint with the ID "Architect" and create a diagram representation in this viewpoint with the ID "Class_Diagram" for the domain class "dart.Folder".

Do not forget to register the dart meta-model for this representation and do not forget to always specify an ID for all the elements that you will create.

This basic representation will display concepts with the domain class dart.Class as containers with a list appearance using a gradient. You will also have to define child nodes in this container in order to display concepts like variable and functions. Create a new color in a color palette for the two colors to use in your gradient. You can use a website like [Colour Lover](http://www.colourlovers.com/palettes/most-loved/all-time/meta) in order to select a set of colors which are not completely ugly.

Using a conditional style, change the color of the class if it is abstract.

### Tools

Define the necessary tools to create:

* a new class
* a new variable in a class
* a new function in a class

All these concepts should be created with default values (for example for their name) that you will choose.

### Direct editor

Create a direct edit tool to rename a class.

### Layers and edges

In a new layer named "Relationships", define a relation based edge between classes to show the inheritance relationship using the expression "feature:extends". Create a new tool to add an inheritance relationship between two classes.

### Filters

Create a filter to hide the variables and functions of a class

### Validation rules

Create a validation operation ensuring that a class has a name

### Second viewpoint

Create a second viewpoint with the ID "Developer" with a diagram representation inside with the ID "Explorer_Diagram" for the domain class "dart.Folder".

Display the sub folders of a folder using a node with a workspace image style. Use the icon folder_512x512.png if the folder is empty (aql:self.assets->size() = 0) and the icon folder_documents_512x512.png otherwise. You can use a conditional style or a style customization to achieve this behavior.

### Customizing styles

Create other nodes with workspace images to display various kind of assets available in a folder:

* classes
* components
* decorators
* controllers
* images
* css files
* etc...

Just like before, you can use conditional styles or style customizations.

### Navigation

Create a double click tool to create and navigate to another Explorer diagram representation when the user double click on a folder.

### Additional tools

Define the tools necessary to create classes and some assets in the Explorer diagram.

### Additional navigation

Define the tool necessary to navigate between a Class diagram and an Explorer diagram

### Properties view

Creates a Properties View Description in order to display the properties of a class. 

### Widgets

* create a text widget allowing you to edit the name of the class
* create a checkbox allowing you to mark a Class as abstract
* use a reference widget to edit the "extends" reference of a class.

### validation

* create a validation rule showing a warning on the text widget showing the name of the class. This validation rule will ensure that an abstract class should have a name starting by "Abstract". Create a quick fix to prefix the name of the class by "Abstract".


### Going further

You are free to add additional features to your designer if you want, if done properly, you can gain extra points. The appearance of the designer can also be a source of extra points but a beautiful designer without any features at all will not be very rewarding.


PS: [Google](http://lmgtfy.com/?q=eclipse+sirius) is your friend, as is the [Sirius documentation](http://help.eclipse.org/neon/topic/org.eclipse.sirius.doc/doc/specifier/Sirius%20Specifier%20Manual.html?cp=73_2)

