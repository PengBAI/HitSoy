package org.document;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test pour DocumentRow
 * @author HitSoy
 * */
public class DocumentRowTest{
	
	private Document doc;
	private DocumentRowUtil docUtil;
	@Before
	public void setUp() throws Exception {
		doc = new Document();
		docUtil = new DocumentRowUtil();
	}

	@After
	public void tearDown() throws Exception {
		doc = null;
	}
	
	@Test
	public void testDocument(){

	docUtil.DocumentRowList_pushBack(doc.rows, docUtil.DocumentRow_create());
	docUtil.DocumentRowList_pushBack(doc.rows, docUtil.DocumentRow_create());
	docUtil.DocumentRowList_pushBack(doc.rows, docUtil.DocumentRow_create());
	docUtil.DocumentRowList_pushBack(doc.rows, docUtil.DocumentRow_create());
	docUtil.DocumentRowList_pushBack(doc.rows, docUtil.DocumentRow_create());

	docUtil.Document_saveToFile(doc, "../document-unittest.db");

    assertEquals(docUtil.DocumentRowList_getRowCount(doc.rows), 0);
    docUtil.Document_loadFromFile(doc, "../document-unittest.db");
    assertEquals(docUtil.DocumentRowList_getRowCount(doc.rows), 5);	
	}
}
