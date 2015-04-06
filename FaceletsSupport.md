**In GMaps4JSF 1.1.1, Facelets is automatically supported. No extra configurations are needed!**

---

**In GMaps4JSF 1.1.0,** GMaps4JSF can work with Facelets with the following instructions:
  * Create an XML file (gmaps4jsf-facelets-taglib.xml), then copy the following content to it:
```
<?xml version="1.0"?>
<!DOCTYPE facelet-taglib PUBLIC
  "-//Sun Microsystems, Inc.//DTD Facelet Taglib 1.0//EN"
  "facelet-taglib_1_0.dtd">

<facelet-taglib>
    <namespace>http://code.google.com/p/gmaps4jsf/</namespace>
    <tag>
		<tag-name>map</tag-name>
		<component>
			<component-type>com.googlecode.gmaps4jsf.Map</component-type>
		</component>
    </tag>
    <tag>
		<tag-name>marker</tag-name>
		<component>
			<component-type>com.googlecode.gmaps4jsf.Marker</component-type>
		</component>
    </tag>
    <tag>
		<tag-name>htmlInformationWindow</tag-name>
		<component>
			<component-type>com.googlecode.gmaps4jsf.HTMLInformationWindow</component-type>
		</component>
    </tag>
    <tag>
                <tag-name>eventListener</tag-name>
                <component>
                        <component-type>com.googlecode.gmaps4jsf.EventListener</component-type>
                </component>
    </tag>
    <tag>
                <tag-name>groundoverlay</tag-name>
                <component>
                        <component-type>com.googlecode.gmaps4jsf.Groundoverlay</component-type>
                </component>
    </tag>
    <tag>
                <tag-name>mapControl</tag-name>
                <component>
                        <component-type>com.googlecode.gmaps4jsf.MapControl</component-type>
                </component>
    </tag>
    <tag>
                <tag-name>point</tag-name>
                <component>
                        <component-type>com.googlecode.gmaps4jsf.Point</component-type>
                </component>
    </tag>
    <tag>
                <tag-name>polygon</tag-name>
                <component>
                        <component-type>com.googlecode.gmaps4jsf.Polygon</component-type>
                </component>
    </tag>
    <tag>
                <tag-name>polyline</tag-name>
                <component>
                        <component-type>com.googlecode.gmaps4jsf.Polyline</component-type>
                </component>
    </tag>
    <tag>
                <tag-name>icon</tag-name>
                <component>
                        <component-type>com.googlecode.gmaps4jsf.Icon</component-type>
                </component>
    </tag>
    <tag>
                <tag-name>streetViewPanorama</tag-name>
                <component>
                        <component-type>com.googlecode.gmaps4jsf.StreetViewPanorama</component-type>
                </component>
    </tag>
</facelet-taglib>
```
  * Copy the (gmaps4jsf-facelets-taglib.xml) file to the WEB-INF folder of your application.
  * In the (web.xml) file of your application, add the following context parameter:
```
    <context-param>
        <param-name>facelets.LIBRARIES</param-name>
        <param-value>/WEB-INF/gmaps4jsf-facelets-taglib.xml</param-value>
    </context-param>
```
  * Add the following declaration to your Facelets XHTML file, and try the map ;):
```
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:ui="http://java.sun.com/jsf/facelets"
      xmlns:f="http://java.sun.com/jsf/core"
      xmlns:h="http://java.sun.com/jsf/html"
      xmlns:m="http://code.google.com/p/gmaps4jsf/">
...
      <m:map width="500px" height="500px" latitude="30.01" longitude="31.14">
    		<m:marker  latitude="30.01" longitude="31.14"/>
    		<m:htmlInformationWindow latitude="30.01" longitude="31.14" 
    			   htmlText="&lt;b&gt;This is Egypt&lt;b&gt;"/>
      </m:map>
...
</html>
```
  * Enjoy working with Facelets!!!.