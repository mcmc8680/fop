/* $Id$
 * Copyright (C) 2001 The Apache Software Foundation. All rights reserved.
 * For details on use and redistribution please refer to the
 * LICENSE file included with these sources.
 */

package org.apache.fop.layout;

import org.apache.fop.fo.properties.*;

// Represents region-body viewport/reference areas.
// The areas generated by fo:region-body are sufficiently dissimilar to
// the other 4 regions that we employ a different class

public class BodyRegionArea extends RegionArea {

	// the column count and column-gap
	private int columnCount;
	private int columnGap;
	
    public BodyRegionArea(int xPosition, int yPosition, int width, int height) {
		super(xPosition, yPosition, width, height);
    }

    public BodyAreaContainer makeBodyAreaContainer() {
	return new BodyAreaContainer(null, xPosition, yPosition, width, height,
		Position.ABSOLUTE, columnCount, columnGap);
    }
	
	public void setColumnCount(int columnCount) {
		this.columnCount = columnCount;
	}
	
	public int getColumnCount()
	{
		return columnCount;
	}

	public void setColumnGap(int columnGap) {
		this.columnGap = columnGap;
	}
	
	public int getColumnGap()
	{
		return columnGap;
	}
}
