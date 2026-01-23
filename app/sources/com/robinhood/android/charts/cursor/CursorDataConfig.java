package com.robinhood.android.charts.cursor;

import kotlin.Metadata;

/* compiled from: ChartCursorDataHeader.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/charts/cursor/CursorDataConfig;", "", "alwaysAllowTertiary", "", "showPlaceholder", "hasPrivacy", "headerClearSemanticsOnChildren", "subheaderClearSemanticsOnChildren", "shouldAddScrimOverlayToSubheader", "<init>", "(ZZZZZZ)V", "getAlwaysAllowTertiary", "()Z", "getShowPlaceholder", "getHasPrivacy", "getHeaderClearSemanticsOnChildren", "getSubheaderClearSemanticsOnChildren", "getShouldAddScrimOverlayToSubheader", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CursorDataConfig {
    public static final int $stable = 0;
    private final boolean alwaysAllowTertiary;
    private final boolean hasPrivacy;
    private final boolean headerClearSemanticsOnChildren;
    private final boolean shouldAddScrimOverlayToSubheader;
    private final boolean showPlaceholder;
    private final boolean subheaderClearSemanticsOnChildren;

    public CursorDataConfig() {
        this(false, false, false, false, false, false, 63, null);
    }

    public static /* synthetic */ CursorDataConfig copy$default(CursorDataConfig cursorDataConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cursorDataConfig.alwaysAllowTertiary;
        }
        if ((i & 2) != 0) {
            z2 = cursorDataConfig.showPlaceholder;
        }
        if ((i & 4) != 0) {
            z3 = cursorDataConfig.hasPrivacy;
        }
        if ((i & 8) != 0) {
            z4 = cursorDataConfig.headerClearSemanticsOnChildren;
        }
        if ((i & 16) != 0) {
            z5 = cursorDataConfig.subheaderClearSemanticsOnChildren;
        }
        if ((i & 32) != 0) {
            z6 = cursorDataConfig.shouldAddScrimOverlayToSubheader;
        }
        boolean z7 = z5;
        boolean z8 = z6;
        return cursorDataConfig.copy(z, z2, z3, z4, z7, z8);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAlwaysAllowTertiary() {
        return this.alwaysAllowTertiary;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowPlaceholder() {
        return this.showPlaceholder;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasPrivacy() {
        return this.hasPrivacy;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHeaderClearSemanticsOnChildren() {
        return this.headerClearSemanticsOnChildren;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSubheaderClearSemanticsOnChildren() {
        return this.subheaderClearSemanticsOnChildren;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldAddScrimOverlayToSubheader() {
        return this.shouldAddScrimOverlayToSubheader;
    }

    public final CursorDataConfig copy(boolean alwaysAllowTertiary, boolean showPlaceholder, boolean hasPrivacy, boolean headerClearSemanticsOnChildren, boolean subheaderClearSemanticsOnChildren, boolean shouldAddScrimOverlayToSubheader) {
        return new CursorDataConfig(alwaysAllowTertiary, showPlaceholder, hasPrivacy, headerClearSemanticsOnChildren, subheaderClearSemanticsOnChildren, shouldAddScrimOverlayToSubheader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CursorDataConfig)) {
            return false;
        }
        CursorDataConfig cursorDataConfig = (CursorDataConfig) other;
        return this.alwaysAllowTertiary == cursorDataConfig.alwaysAllowTertiary && this.showPlaceholder == cursorDataConfig.showPlaceholder && this.hasPrivacy == cursorDataConfig.hasPrivacy && this.headerClearSemanticsOnChildren == cursorDataConfig.headerClearSemanticsOnChildren && this.subheaderClearSemanticsOnChildren == cursorDataConfig.subheaderClearSemanticsOnChildren && this.shouldAddScrimOverlayToSubheader == cursorDataConfig.shouldAddScrimOverlayToSubheader;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.alwaysAllowTertiary) * 31) + Boolean.hashCode(this.showPlaceholder)) * 31) + Boolean.hashCode(this.hasPrivacy)) * 31) + Boolean.hashCode(this.headerClearSemanticsOnChildren)) * 31) + Boolean.hashCode(this.subheaderClearSemanticsOnChildren)) * 31) + Boolean.hashCode(this.shouldAddScrimOverlayToSubheader);
    }

    public String toString() {
        return "CursorDataConfig(alwaysAllowTertiary=" + this.alwaysAllowTertiary + ", showPlaceholder=" + this.showPlaceholder + ", hasPrivacy=" + this.hasPrivacy + ", headerClearSemanticsOnChildren=" + this.headerClearSemanticsOnChildren + ", subheaderClearSemanticsOnChildren=" + this.subheaderClearSemanticsOnChildren + ", shouldAddScrimOverlayToSubheader=" + this.shouldAddScrimOverlayToSubheader + ")";
    }

    public CursorDataConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.alwaysAllowTertiary = z;
        this.showPlaceholder = z2;
        this.hasPrivacy = z3;
        this.headerClearSemanticsOnChildren = z4;
        this.subheaderClearSemanticsOnChildren = z5;
        this.shouldAddScrimOverlayToSubheader = z6;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ CursorDataConfig(boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 1
        L5:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = r0
        L15:
            r9 = r8 & 16
            if (r9 == 0) goto L1a
            r6 = r0
        L1a:
            r8 = r8 & 32
            if (r8 == 0) goto L26
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2d
        L26:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2d:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.charts.cursor.CursorDataConfig.<init>(boolean, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean getAlwaysAllowTertiary() {
        return this.alwaysAllowTertiary;
    }

    public final boolean getShowPlaceholder() {
        return this.showPlaceholder;
    }

    public final boolean getHasPrivacy() {
        return this.hasPrivacy;
    }

    public final boolean getHeaderClearSemanticsOnChildren() {
        return this.headerClearSemanticsOnChildren;
    }

    public final boolean getSubheaderClearSemanticsOnChildren() {
        return this.subheaderClearSemanticsOnChildren;
    }

    public final boolean getShouldAddScrimOverlayToSubheader() {
        return this.shouldAddScrimOverlayToSubheader;
    }
}
