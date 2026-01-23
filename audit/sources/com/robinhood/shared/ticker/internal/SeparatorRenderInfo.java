package com.robinhood.shared.ticker.internal;

import kotlin.Metadata;

/* compiled from: SeparatorRenderInfo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/ticker/internal/SeparatorRenderInfo;", "", "insertBeforeColumnIndex", "", "isEntering", "", "isExiting", "separatorChar", "", "<init>", "(IZZC)V", "getInsertBeforeColumnIndex", "()I", "()Z", "getSeparatorChar", "()C", "toColumnSnapshot", "Lcom/robinhood/shared/ticker/internal/TickerColumnSnapshot;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "lib-ticker-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SeparatorRenderInfo {
    public static final int $stable = 0;
    private final int insertBeforeColumnIndex;
    private final boolean isEntering;
    private final boolean isExiting;
    private final char separatorChar;

    public static /* synthetic */ SeparatorRenderInfo copy$default(SeparatorRenderInfo separatorRenderInfo, int i, boolean z, boolean z2, char c, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = separatorRenderInfo.insertBeforeColumnIndex;
        }
        if ((i2 & 2) != 0) {
            z = separatorRenderInfo.isEntering;
        }
        if ((i2 & 4) != 0) {
            z2 = separatorRenderInfo.isExiting;
        }
        if ((i2 & 8) != 0) {
            c = separatorRenderInfo.separatorChar;
        }
        return separatorRenderInfo.copy(i, z, z2, c);
    }

    /* renamed from: component1, reason: from getter */
    public final int getInsertBeforeColumnIndex() {
        return this.insertBeforeColumnIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEntering() {
        return this.isEntering;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsExiting() {
        return this.isExiting;
    }

    /* renamed from: component4, reason: from getter */
    public final char getSeparatorChar() {
        return this.separatorChar;
    }

    public final SeparatorRenderInfo copy(int insertBeforeColumnIndex, boolean isEntering, boolean isExiting, char separatorChar) {
        return new SeparatorRenderInfo(insertBeforeColumnIndex, isEntering, isExiting, separatorChar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeparatorRenderInfo)) {
            return false;
        }
        SeparatorRenderInfo separatorRenderInfo = (SeparatorRenderInfo) other;
        return this.insertBeforeColumnIndex == separatorRenderInfo.insertBeforeColumnIndex && this.isEntering == separatorRenderInfo.isEntering && this.isExiting == separatorRenderInfo.isExiting && this.separatorChar == separatorRenderInfo.separatorChar;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.insertBeforeColumnIndex) * 31) + Boolean.hashCode(this.isEntering)) * 31) + Boolean.hashCode(this.isExiting)) * 31) + Character.hashCode(this.separatorChar);
    }

    public String toString() {
        return "SeparatorRenderInfo(insertBeforeColumnIndex=" + this.insertBeforeColumnIndex + ", isEntering=" + this.isEntering + ", isExiting=" + this.isExiting + ", separatorChar=" + this.separatorChar + ")";
    }

    public SeparatorRenderInfo(int i, boolean z, boolean z2, char c) {
        this.insertBeforeColumnIndex = i;
        this.isEntering = z;
        this.isExiting = z2;
        this.separatorChar = c;
    }

    public final int getInsertBeforeColumnIndex() {
        return this.insertBeforeColumnIndex;
    }

    public final boolean isEntering() {
        return this.isEntering;
    }

    public final boolean isExiting() {
        return this.isExiting;
    }

    public final char getSeparatorChar() {
        return this.separatorChar;
    }

    public final TickerColumnSnapshot toColumnSnapshot() {
        return new TickerColumnSnapshot(null, this.separatorChar, ScrollDirection.f6278UP, this.isExiting, this.isEntering);
    }
}
