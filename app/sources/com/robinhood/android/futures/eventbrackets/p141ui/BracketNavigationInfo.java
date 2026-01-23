package com.robinhood.android.futures.eventbrackets.p141ui;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BracketNavigationInfo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0007J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0007J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0007J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\fJ\u0016\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\fHÖ\u0001J\t\u0010$\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;", "", "navigationRounds", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/futures/eventbrackets/ui/NavigationRound;", "regions", "", "<init>", "(Lkotlinx/collections/immutable/PersistentList;Lkotlinx/collections/immutable/PersistentList;)V", "getRegions", "()Lkotlinx/collections/immutable/PersistentList;", "numberOfRounds", "", "getNumberOfRounds", "()I", "currentRegionIndex", "roundIndex", "yPercentage", "", "(IF)Ljava/lang/Integer;", "currentRegionName", "regionIndex", "currentRoundName", "availableRoundsNames", "Lkotlinx/collections/immutable/ImmutableList;", "currentRoundHasRegions", "", "getRegionTargetPercentage", "getRegionIndexByPercentage", "percentage", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class BracketNavigationInfo {
    public static final int $stable = 0;
    private final ImmutableList3<NavigationRound> navigationRounds;
    private final int numberOfRounds;
    private final ImmutableList3<String> regions;

    private final ImmutableList3<NavigationRound> component1() {
        return this.navigationRounds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BracketNavigationInfo copy$default(BracketNavigationInfo bracketNavigationInfo, ImmutableList3 immutableList3, ImmutableList3 immutableList32, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList3 = bracketNavigationInfo.navigationRounds;
        }
        if ((i & 2) != 0) {
            immutableList32 = bracketNavigationInfo.regions;
        }
        return bracketNavigationInfo.copy(immutableList3, immutableList32);
    }

    public final ImmutableList3<String> component2() {
        return this.regions;
    }

    public final BracketNavigationInfo copy(ImmutableList3<NavigationRound> navigationRounds, ImmutableList3<String> regions) {
        Intrinsics.checkNotNullParameter(navigationRounds, "navigationRounds");
        Intrinsics.checkNotNullParameter(regions, "regions");
        return new BracketNavigationInfo(navigationRounds, regions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BracketNavigationInfo)) {
            return false;
        }
        BracketNavigationInfo bracketNavigationInfo = (BracketNavigationInfo) other;
        return Intrinsics.areEqual(this.navigationRounds, bracketNavigationInfo.navigationRounds) && Intrinsics.areEqual(this.regions, bracketNavigationInfo.regions);
    }

    public int hashCode() {
        return (this.navigationRounds.hashCode() * 31) + this.regions.hashCode();
    }

    public String toString() {
        return "BracketNavigationInfo(navigationRounds=" + this.navigationRounds + ", regions=" + this.regions + ")";
    }

    public BracketNavigationInfo(ImmutableList3<NavigationRound> navigationRounds, ImmutableList3<String> regions) {
        Intrinsics.checkNotNullParameter(navigationRounds, "navigationRounds");
        Intrinsics.checkNotNullParameter(regions, "regions");
        this.navigationRounds = navigationRounds;
        this.regions = regions;
        this.numberOfRounds = navigationRounds.size();
    }

    public final ImmutableList3<String> getRegions() {
        return this.regions;
    }

    public final int getNumberOfRounds() {
        return this.numberOfRounds;
    }

    public final Integer currentRegionIndex(int roundIndex, float yPercentage) {
        NavigationRound navigationRound = (NavigationRound) CollectionsKt.getOrNull(this.navigationRounds, roundIndex);
        if (navigationRound != null && navigationRound.getHasRegions()) {
            return Integer.valueOf(getRegionIndexByPercentage(yPercentage));
        }
        return null;
    }

    public final String currentRegionName(int roundIndex, int regionIndex) {
        NavigationRound navigationRound = (NavigationRound) CollectionsKt.getOrNull(this.navigationRounds, roundIndex);
        if (navigationRound != null && navigationRound.getHasRegions()) {
            return (String) CollectionsKt.getOrNull(this.regions, regionIndex);
        }
        return null;
    }

    public final String currentRoundName(int roundIndex) {
        NavigationRound navigationRound = (NavigationRound) CollectionsKt.getOrNull(this.navigationRounds, roundIndex);
        if (navigationRound != null) {
            return navigationRound.getName();
        }
        return null;
    }

    public final ImmutableList<String> availableRoundsNames() {
        ImmutableList3<NavigationRound> immutableList3 = this.navigationRounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList3, 10));
        Iterator<NavigationRound> it = immutableList3.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return extensions2.toImmutableList(arrayList);
    }

    public final boolean currentRoundHasRegions(int roundIndex) {
        NavigationRound navigationRound = (NavigationRound) CollectionsKt.getOrNull(this.navigationRounds, roundIndex);
        if (navigationRound != null) {
            return navigationRound.getHasRegions();
        }
        return false;
    }

    public final float getRegionTargetPercentage(int roundIndex, int regionIndex) {
        if (this.regions.isEmpty() || !currentRoundHasRegions(roundIndex)) {
            return 0.0f;
        }
        return regionIndex * (1.0f / this.regions.size());
    }

    private final int getRegionIndexByPercentage(float percentage) {
        if (this.regions.isEmpty()) {
            return 0;
        }
        return RangesKt.coerceIn(MathKt.roundToInt(percentage / (1.0f / this.regions.size())), 0, CollectionsKt.getLastIndex(this.regions));
    }
}
