package com.robinhood.android.navigation.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomBarConfigNavArgs.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/BottomBarConfigNavArgs;", "", "bottomBarVisibility", "Lcom/robinhood/android/navigation/compose/BottomBarVisibility;", "isTabHost", "", "tabHostId", "", "<init>", "(Lcom/robinhood/android/navigation/compose/BottomBarVisibility;Ljava/lang/Boolean;Ljava/lang/String;)V", "getBottomBarVisibility", "()Lcom/robinhood/android/navigation/compose/BottomBarVisibility;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTabHostId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Lcom/robinhood/android/navigation/compose/BottomBarVisibility;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/robinhood/android/navigation/compose/BottomBarConfigNavArgs;", "equals", "other", "hashCode", "", "toString", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BottomBarConfigNavArgs {
    public static final int $stable = 0;
    private final BottomBarConfigNavArgs3 bottomBarVisibility;
    private final Boolean isTabHost;
    private final String tabHostId;

    public static /* synthetic */ BottomBarConfigNavArgs copy$default(BottomBarConfigNavArgs bottomBarConfigNavArgs, BottomBarConfigNavArgs3 bottomBarConfigNavArgs3, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bottomBarConfigNavArgs3 = bottomBarConfigNavArgs.bottomBarVisibility;
        }
        if ((i & 2) != 0) {
            bool = bottomBarConfigNavArgs.isTabHost;
        }
        if ((i & 4) != 0) {
            str = bottomBarConfigNavArgs.tabHostId;
        }
        return bottomBarConfigNavArgs.copy(bottomBarConfigNavArgs3, bool, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BottomBarConfigNavArgs3 getBottomBarVisibility() {
        return this.bottomBarVisibility;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsTabHost() {
        return this.isTabHost;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTabHostId() {
        return this.tabHostId;
    }

    public final BottomBarConfigNavArgs copy(BottomBarConfigNavArgs3 bottomBarVisibility, Boolean isTabHost, String tabHostId) {
        Intrinsics.checkNotNullParameter(bottomBarVisibility, "bottomBarVisibility");
        return new BottomBarConfigNavArgs(bottomBarVisibility, isTabHost, tabHostId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomBarConfigNavArgs)) {
            return false;
        }
        BottomBarConfigNavArgs bottomBarConfigNavArgs = (BottomBarConfigNavArgs) other;
        return this.bottomBarVisibility == bottomBarConfigNavArgs.bottomBarVisibility && Intrinsics.areEqual(this.isTabHost, bottomBarConfigNavArgs.isTabHost) && Intrinsics.areEqual(this.tabHostId, bottomBarConfigNavArgs.tabHostId);
    }

    public int hashCode() {
        int iHashCode = this.bottomBarVisibility.hashCode() * 31;
        Boolean bool = this.isTabHost;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.tabHostId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "BottomBarConfigNavArgs(bottomBarVisibility=" + this.bottomBarVisibility + ", isTabHost=" + this.isTabHost + ", tabHostId=" + this.tabHostId + ")";
    }

    public BottomBarConfigNavArgs(BottomBarConfigNavArgs3 bottomBarVisibility, Boolean bool, String str) {
        Intrinsics.checkNotNullParameter(bottomBarVisibility, "bottomBarVisibility");
        this.bottomBarVisibility = bottomBarVisibility;
        this.isTabHost = bool;
        this.tabHostId = str;
    }

    public final BottomBarConfigNavArgs3 getBottomBarVisibility() {
        return this.bottomBarVisibility;
    }

    public final Boolean isTabHost() {
        return this.isTabHost;
    }

    public final String getTabHostId() {
        return this.tabHostId;
    }
}
