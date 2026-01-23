package com.robinhood.android.futures.eventbrackets.p141ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BracketNavigationInfo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/NavigationRound;", "", "name", "", "hasRegions", "", "<init>", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getHasRegions", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NavigationRound {
    public static final int $stable = 0;
    private final boolean hasRegions;
    private final String name;

    public static /* synthetic */ NavigationRound copy$default(NavigationRound navigationRound, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = navigationRound.name;
        }
        if ((i & 2) != 0) {
            z = navigationRound.hasRegions;
        }
        return navigationRound.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasRegions() {
        return this.hasRegions;
    }

    public final NavigationRound copy(String name, boolean hasRegions) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new NavigationRound(name, hasRegions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationRound)) {
            return false;
        }
        NavigationRound navigationRound = (NavigationRound) other;
        return Intrinsics.areEqual(this.name, navigationRound.name) && this.hasRegions == navigationRound.hasRegions;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Boolean.hashCode(this.hasRegions);
    }

    public String toString() {
        return "NavigationRound(name=" + this.name + ", hasRegions=" + this.hasRegions + ")";
    }

    public NavigationRound(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.hasRegions = z;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getHasRegions() {
        return this.hasRegions;
    }
}
