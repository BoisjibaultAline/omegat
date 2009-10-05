/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool 
          with fuzzy matching, translation memory, keyword search, 
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2009 Alex Buloichik
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

 This program is free software; you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 **************************************************************************/

package org.omegat.core.statistics;

import org.omegat.core.Core;
import org.omegat.core.data.IProject;
import org.omegat.core.threads.LongProcessThread;
import org.omegat.gui.stat.StatisticsWindow;
import org.omegat.util.OStrings;

/**
 * Thread for calculate standard statistics.
 * 
 * @author Alex Buloichik (alex73mail@gmail.com)
 */
public class CalcStandardStatistics extends LongProcessThread {
    private String[] header = new String[] { "",
            OStrings.getString("CT_STATS_Segments"),
            OStrings.getString("CT_STATS_Words"),
            OStrings.getString("CT_STATS_Characters_NOSP"),
            OStrings.getString("CT_STATS_Characters") };
    private boolean[] align = new boolean[] { false, true, true, true, true };

    private StatisticsWindow callback;

    public CalcStandardStatistics(StatisticsWindow callback) {
        this.callback = callback;
    }

    public void run() {
        IProject p = Core.getProject();
        String result = Statistics.buildProjectStats(p.getUniqueEntries(), p
                .getAllEntries(), p.getProjectProperties(),
                p.getStatistics().numberofTranslatedSegments);
        callback.displayData(result);
    }

    public static class FileData {
        public StatCount total, remaining;

        public FileData() {
            total = new StatCount();
            remaining = new StatCount();
        }
    }
}
