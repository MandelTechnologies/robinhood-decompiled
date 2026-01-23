package org.commonmark.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.commonmark.node.SourceSpan;

/* loaded from: classes23.dex */
public class SourceLines {
    private final List<SourceLine> lines = new ArrayList();

    public static SourceLines empty() {
        return new SourceLines();
    }

    /* renamed from: of */
    public static SourceLines m3986of(SourceLine sourceLine) {
        SourceLines sourceLines = new SourceLines();
        sourceLines.addLine(sourceLine);
        return sourceLines;
    }

    /* renamed from: of */
    public static SourceLines m3985of(List<SourceLine> list) {
        SourceLines sourceLines = new SourceLines();
        sourceLines.lines.addAll(list);
        return sourceLines;
    }

    public void addLine(SourceLine sourceLine) {
        this.lines.add(sourceLine);
    }

    public List<SourceLine> getLines() {
        return this.lines;
    }

    public boolean isEmpty() {
        return this.lines.isEmpty();
    }

    public String getContent() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.lines.size(); i++) {
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(this.lines.get(i).getContent());
        }
        return sb.toString();
    }

    public List<SourceSpan> getSourceSpans() {
        ArrayList arrayList = new ArrayList();
        Iterator<SourceLine> it = this.lines.iterator();
        while (it.hasNext()) {
            SourceSpan sourceSpan = it.next().getSourceSpan();
            if (sourceSpan != null) {
                arrayList.add(sourceSpan);
            }
        }
        return arrayList;
    }
}
