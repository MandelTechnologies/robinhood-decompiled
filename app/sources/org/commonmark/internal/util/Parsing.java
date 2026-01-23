package org.commonmark.internal.util;

/* loaded from: classes23.dex */
public class Parsing {
    public static int CODE_BLOCK_INDENT = 4;

    public static int columnsToNextTabStop(int i) {
        return 4 - (i % 4);
    }
}
