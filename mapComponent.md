Beside the JSF UIComponent and UICommand standard attributes
| Component Attribute   | Required | Description | Default value |
|:----------------------|:---------|:------------|:--------------|
| longitude | false | The longitude you wish the map to point to. | 30.01 |
| latitude| false | The latitude you wish the map to point to. | 31.14 |
| address| false | The address you wish the map to point to. If you use this attribute donot longitude or latitude attributes. | NA |
| locationNotFoundErrorMessage | false | The error message that should appear if the address location doesnot exist. | (GClientGeocoder) service not found the address location |
| width| false | The width of the map. | 500 |
| height| false | The height of the map. | 500 |
| zoom | false | The zoom value of the map. | 11 |
| type | false | The type of the map. It can be one of the following values before GMaps4JSF 1.1.4 (G\_NORMAL\_MAP, G\_SATELLITE\_MAP and G\_HYBRID\_MAP). Since GMaps4JSF 3.0.0, the available values are (HYBRID, ROADMAP, and SATELLITE, TERRAIN) | G\_HYBRID\_MAP (since GMaps4JSF 3.0.0, it is ROADMAP) |
| partiallyTriggered (since 1.1.4) | false | This flag determines whether to render the map will be updated by Ajax. This flag should be set to true if the map is inside a zone that will be updated by Ajax. | false |
| enableDragging | false | This flag determines whether to support map dragging. | true |
| ~~addStreetOverlay (removed since GMaps4JSF 3.0.0)~~  | ~~false~~ | ~~Setting this flag to true enables the map to work directly with the streetViewPanorama component.~~|~~false~~|
| jsVariable | false | This flag determines the Javascript variable you want to use for referring to the map. It should unique. Use this attribute if you want to use write additional Javascript code for the map to customize it. | NA |
| showLocationNotFoundMessage (since 1.1.2) | false | This attribute determines whether to show an error message when the location is not found. | false |
| autoReshape (since 1.1.2) | false | Setting this flag to true enables the map to be resized to view all of the markers on it. | true |
| enableScrollWheelZoom (since 1.1.3) | false | Setting this flag to true enables the map to be zoomed on mouse scroll wheel. | false |
| submitOnClick (since 1.1.4-preRelease3) | false | This attribute determines whether to submit the map on server when it is clicked. | false |
| actionListener (since 1.1.4-preRelease3) | false | The action listener that will be executed when the map is clicked. | NA |