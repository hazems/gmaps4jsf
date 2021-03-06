/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.googlecode.gmaps4jsf.component.overlay;

import junit.framework.TestCase;

/**
 *
 * @author Jose Noheda [jose.noheda@gmail.com]
 */
public class GroundOverlayRendererTest extends TestCase {

    private GroundOverlayRenderer renderer = new GroundOverlayRenderer();

    public void testConvertToJavascriptObject() {
        GroundOverlay overlay = new GroundOverlay();
        overlay.setImageURL("http://www.jroller.com/HazemBlog/resource/gmaps4jsf-logo.png");
        overlay.setStartLatitude("7");
        overlay.setStartLongitude("-54");
        overlay.setEndLatitude("23");
        overlay.setEndLongitude("84");
        assertEquals("A ground overlay", "{imageURL: 'http://www.jroller.com/HazemBlog/resource/gmaps4jsf-logo.png', startLatitude: 7, startLongitude: -54, endLatitude: 23, endLongitude: 84, jsVariable: ''}", renderer.convertToJavascriptObject(overlay));
        overlay.setJsVariable("something");
        assertEquals("Client side reference to overlay", "{imageURL: 'http://www.jroller.com/HazemBlog/resource/gmaps4jsf-logo.png', startLatitude: 7, startLongitude: -54, endLatitude: 23, endLongitude: 84, jsVariable: 'something'}", renderer.convertToJavascriptObject(overlay));
    }

}
