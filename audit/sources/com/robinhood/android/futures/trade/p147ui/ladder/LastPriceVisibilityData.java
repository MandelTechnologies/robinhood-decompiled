package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Ladder.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LastPriceVisibilityData;", "", "visibility", "Lcom/robinhood/android/futures/trade/ui/ladder/LastPriceVisibility;", "lastPriceOffset", "", "<init>", "(Lcom/robinhood/android/futures/trade/ui/ladder/LastPriceVisibility;F)V", "getVisibility", "()Lcom/robinhood/android/futures/trade/ui/ladder/LastPriceVisibility;", "getLastPriceOffset", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LastPriceVisibilityData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final float lastPriceOffset;
    private final LastPriceVisibility visibility;

    public static /* synthetic */ LastPriceVisibilityData copy$default(LastPriceVisibilityData lastPriceVisibilityData, LastPriceVisibility lastPriceVisibility, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            lastPriceVisibility = lastPriceVisibilityData.visibility;
        }
        if ((i & 2) != 0) {
            f = lastPriceVisibilityData.lastPriceOffset;
        }
        return lastPriceVisibilityData.copy(lastPriceVisibility, f);
    }

    /* renamed from: component1, reason: from getter */
    public final LastPriceVisibility getVisibility() {
        return this.visibility;
    }

    /* renamed from: component2, reason: from getter */
    public final float getLastPriceOffset() {
        return this.lastPriceOffset;
    }

    public final LastPriceVisibilityData copy(LastPriceVisibility visibility, float lastPriceOffset) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new LastPriceVisibilityData(visibility, lastPriceOffset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastPriceVisibilityData)) {
            return false;
        }
        LastPriceVisibilityData lastPriceVisibilityData = (LastPriceVisibilityData) other;
        return this.visibility == lastPriceVisibilityData.visibility && Float.compare(this.lastPriceOffset, lastPriceVisibilityData.lastPriceOffset) == 0;
    }

    public int hashCode() {
        return (this.visibility.hashCode() * 31) + Float.hashCode(this.lastPriceOffset);
    }

    public String toString() {
        return "LastPriceVisibilityData(visibility=" + this.visibility + ", lastPriceOffset=" + this.lastPriceOffset + ")";
    }

    public LastPriceVisibilityData(LastPriceVisibility visibility, float f) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.visibility = visibility;
        this.lastPriceOffset = f;
    }

    public final LastPriceVisibility getVisibility() {
        return this.visibility;
    }

    public final float getLastPriceOffset() {
        return this.lastPriceOffset;
    }

    /* compiled from: Ladder.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LastPriceVisibilityData$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/futures/trade/ui/ladder/LastPriceVisibilityData;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "lastPriceIndex", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* compiled from: Ladder.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LastPriceVisibility.values().length];
                try {
                    iArr[LastPriceVisibility.ONSCREEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LastPriceVisibility.OFFSCREEN_TOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LastPriceVisibility.OFFSCREEN_BOTTOM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LastPriceVisibilityData create(LazyListState lazyListState, int lastPriceIndex) {
            LastPriceVisibility lastPriceVisibility;
            float offset;
            Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
            List<LazyListItemInfo> visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.firstOrNull((List) visibleItemsInfo);
            int index = lazyListItemInfo != null ? lazyListItemInfo.getIndex() : -1;
            LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt.lastOrNull((List) visibleItemsInfo);
            int index2 = lazyListItemInfo2 != null ? lazyListItemInfo2.getIndex() : -1;
            if (lastPriceIndex <= index) {
                lastPriceVisibility = LastPriceVisibility.OFFSCREEN_TOP;
            } else if (lastPriceIndex >= index2) {
                lastPriceVisibility = LastPriceVisibility.OFFSCREEN_BOTTOM;
            } else {
                lastPriceVisibility = LastPriceVisibility.ONSCREEN;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[lastPriceVisibility.ordinal()];
            if (i == 1) {
                Iterator<T> it = visibleItemsInfo.iterator();
                while (it.hasNext()) {
                    if (((LazyListItemInfo) it.next()).getIndex() == lastPriceIndex) {
                        offset = r2.getOffset() / ((int) (lazyListState.getLayoutInfo().mo5206getViewportSizeYbymL2g() & 4294967295L));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (i == 2) {
                offset = -1.0f;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                offset = 2.0f;
            }
            return new LastPriceVisibilityData(lastPriceVisibility, offset);
        }
    }
}
