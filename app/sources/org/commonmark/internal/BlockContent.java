package org.commonmark.internal;

/* loaded from: classes25.dex */
class BlockContent {
    private int lineCount = 0;

    /* renamed from: sb */
    private final StringBuilder f8096sb = new StringBuilder();

    public void add(CharSequence charSequence) {
        if (this.lineCount != 0) {
            this.f8096sb.append('\n');
        }
        this.f8096sb.append(charSequence);
        this.lineCount++;
    }

    public String getString() {
        return this.f8096sb.toString();
    }
}
