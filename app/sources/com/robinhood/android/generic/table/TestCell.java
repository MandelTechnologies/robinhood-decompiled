package com.robinhood.android.generic.table;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericTable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/generic/table/TestCell;", "Lcom/robinhood/android/generic/table/GenericCell;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "key", "getKey", "relativeWidth", "", "getRelativeWidth", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TestCell implements GenericCell {
    public static final int $stable = 0;
    private final String text;

    public static /* synthetic */ TestCell copy$default(TestCell testCell, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = testCell.text;
        }
        return testCell.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final TestCell copy(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TestCell(text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TestCell) && Intrinsics.areEqual(this.text, ((TestCell) other).text);
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public String toString() {
        return "TestCell(text=" + this.text + ")";
    }

    public TestCell(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
    }

    public final String getText() {
        return this.text;
    }

    @Override // com.robinhood.android.generic.table.GenericCell
    public String getKey() {
        return this.text;
    }

    @Override // com.robinhood.android.generic.table.GenericCell
    public int getRelativeWidth() {
        return this.text.length();
    }
}
