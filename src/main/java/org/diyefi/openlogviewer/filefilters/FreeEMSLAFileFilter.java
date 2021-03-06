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

package org.diyefi.openlogviewer.filefilters;

import java.io.*;
import javax.swing.filechooser.FileFilter;
import org.diyefi.openlogviewer.utils.Utilities;

/**
 *
 * @author Bryan
 */
public class FreeEMSLAFileFilter extends FileFilter {
    public FreeEMSLAFileFilter () {
        super();
    }

    @Override
    public String getDescription() {
       return "FreeEMS LA Binary Logs";
    }

    @Override
    public boolean accept(File f) {
        if(f.isDirectory()) {
            return true;
        }
        String extension = Utilities.getExtension(f);
        if(extension != null && extension.equals("la")) return true;

        //if nothing is satisfied return false
        return false;
    }
}
