/**
 * @author Tijs Slaats
 * 
 * DisCoveR: The DCR Graphs process miner.
 * Copyright (C) 2021 Tijs Slaats
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Additional terms under GNU AGPL version 3 section 7:
 * - By using the program, you provide the copyright holder with permission to mention, discuss, and describe your use of the program in academic publications and accept your responsibility to assist the copyright holder in such publications by providing relevant information.
 *  
 */
package dk.ku.di.discover.client.tests;

import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import dk.ku.di.dcrgraphs.DCRGraph;
import dk.ku.di.discover.client.Classifier;

class ClassifierTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testCheckCompliance() throws Exception, IOException {
		Classifier.classify("./logs/classifytest.xes", "./dcrcsv/classifytest.csv", "./logs/classifytest_output.xes",
				false);
	}

	@Test
	void testLoadCSV() throws Exception, IOException {
		DCRGraph g = DCRGraph.fromCSVFormat("./dcrcsv/dcr.csv");
		System.out.println(g.toString());
	}

}
