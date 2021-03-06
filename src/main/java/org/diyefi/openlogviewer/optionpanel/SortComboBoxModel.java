/* OpenLogViewer
 *
 * Copyright 2011
 *
 * This file is part of the OpenLogViewer project.
 *
 * OpenLogViewer software is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenLogViewer software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with any OpenLogViewer software.  If not, see http://www.gnu.org/licenses/
 *
 * I ask that if you make any changes to this file you fork the code on github.com!
 *
 */

package org.diyefi.openlogviewer.optionpanel;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Bryan Harris
 */
public class SortComboBoxModel extends DefaultComboBoxModel{
	
	public SortComboBoxModel()
	{
		super();
	}


	@Override
	public void addElement(Object element)
	{
		insertElementAt(element, 0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void insertElementAt(Object element, int index)
	{
		int size = getSize();
		for (index = 0; index < size; index++)
		{
				Comparable c = (Comparable)getElementAt( index );
				if (c.compareTo(element) > 0)
					break;
		}
		super.insertElementAt(element, index);
	}


}
