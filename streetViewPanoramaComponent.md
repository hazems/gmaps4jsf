Beside the JSF UIComponent standard attributes
| Component Attribute   | Required | Description | Default value |
|:----------------------|:---------|:------------|:--------------|
| longitude | false | The longitude you wish the Streetviewpanaroma to point to. | -71.098326 |
| latitude | false | The latitude you wish the Streetviewpanaroma to point to. | 42.345573 |
| width | false | The width of the Streetviewpanaroma. | 500 |
| height | false | The height of the Streetviewpanaroma. | 500 |
| zoom | false | The zoom value of the Streetviewpanaroma. zoom defines the zoom level of this view (effectively proscribing the "field of view") with 0 being fully zoomed-out. Different Street View locations may provide higher or lower zoom levels. | 0 |
| yaw | false | The yaw value of the Streetviewpanaroma. yaw defines the rotation angle around the camera locus in degrees relative from true north. Yaw angles are measured clockwise (90 degrees is true east). | 0 |
| pitch | false | The pitch value of the Streetviewpanaroma. pitch defines the angle variance "up" or "down" from the camera's initial default pitch, which is often (but not always) flat horizontal. (For example, an image taken on a hill will likely exhibit a default pitch that is not horizontal.) Pitch angles are measured with negative values looking up (to -90 degrees straight up and orthogonal to the default pitch) and positive values looking down (to +90 degrees straight down and orthogonal to the default pitch). | 0 |
| renderOnWindowLoad | false | This flag determines whether to render the Streetviewpanaroma on window load. This flag should be set to false if the map is inside a zone that will be updated by Ajax. | true |
| jsVariable | false | This flag determines the Javascript variable you want to use for referring to the Streetviewpanaroma.It should unique. Use this attribute if you want to use write additional Javascript code for the map to customize it. | NA |
| showLocationNotFoundMessage (new in 1.1.2) | false | This attribute determines whether to show an error message when the location is not found. | false |