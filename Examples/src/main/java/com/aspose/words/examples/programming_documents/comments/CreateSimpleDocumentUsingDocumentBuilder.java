/* 
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Words. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.words.examples.programming_documents.comments;

import com.aspose.words.*;
import com.aspose.words.examples.Utils;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class CreateSimpleDocumentUsingDocumentBuilder {
    public static void main(String[] args) throws Exception {
        //ExStart:1
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CreateSimpleDocumentUsingDocumentBuilder.class);

        // Open the document.
        Document doc = new Document();
        DocumentBuilder builder = new DocumentBuilder(doc);
        builder.write("Aspose_Words_Java");
        doc.save(dataDir + "output.doc");
        //ExEnd:1
    }
}