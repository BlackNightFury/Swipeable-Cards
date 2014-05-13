/**
 * AndTinder v0.1 for Android
 *
 * @Author: Enrique López Mañas <eenriquelopez@gmail.com>
 * http://www.lopez-manas.com
 *
 * TAndTinder is a native library for Android that provide a
 * Tinder card like effect. A card can be constructed using an
 * image and displayed with animation effects, dismiss-to-like
 * and dismiss-to-unlike, and use different sorting mechanisms.
 *
 * AndTinder is compatible with API Level 13 and upwards
 *
 * @copyright: Enrique López Mañas
 * @license: Apache License 2.0
 */

package com.andtinder.model;

public class Orientations {
	 public enum Orientation {
	        Ordered(0), Disordered(1);

	        public final int value;

	        private Orientation(int value) {
	            this.value = value;
	        }

	        public static Orientation fromValue(int value) {
	            for (Orientation style : Orientation.values()) {
	                if (style.value == value) {
	                    return style;
	                }
	            }
	            return null;
	        }
	    }
}
