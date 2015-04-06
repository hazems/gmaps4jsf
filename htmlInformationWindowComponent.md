It can be a child of the (map or marker) components.

## Attributes ##
Beside the JSF UIComponent standard attributes.
| Component Attribute   | Required | Description | Default value |
|:----------------------|:---------|:------------|:--------------|
| longitude | false | The longitude of the HTML information window. If not set then the parent map longitude will be taken. | NA |
| latitude| false | The latitude of the HTML information window If not set then the parent map latitude will be taken. | NA |
| htmlText | true | The Information Window HTML Text. | NA |
| jsVariable (Added in 1.1.1)| false | This flag determines the Javascript variable you want to use for referring to the htmlInformationWindow. Use this attribute if you want to use write additional Javascript code for the htmlInformationWindow to customize it. | NA  |