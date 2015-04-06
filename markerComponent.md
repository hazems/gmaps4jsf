It can be a child of the (map) component.

## Attributes ##
Beside the JSF UIComponent standard attributes.
| Component Attribute   | Required | Description | Default value |
|:----------------------|:---------|:------------|:--------------|
| longitude | false | The longitude of the marker. If not set then the parent map longitude will be taken. | NA |
| latitude| false | The latitude of the marker. If not set then the parent map latitude will be taken. | NA |
| address | false | The address of the marker. If not set then the parent map address will be taken. | NA |
| draggable | false | This flag determines whether the marker is draggable. | false |
| jsVariable | false | This flag determines the Javascript variable you want to use for referring to the marker. Use this attribute if you want to use write additional Javascript code for the marker to customize it. | NA |
| showInformationEvent (since 1.1.1) | false | This attribute determines the event on which the marker information will be shown. The marker information should be represented as a child htmlInformationWindow component of the marker component.| click |
| showLocationNotFoundMessage (since 1.1.2) | false | This attribute determines whether to show an error message when the location is not found. | false |
| submitOnValueChange (since 1.1.2) | false | This attribute determines whether to submit when the marker value changed. | false |