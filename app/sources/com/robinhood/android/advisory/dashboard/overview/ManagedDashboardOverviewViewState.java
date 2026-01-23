package com.robinhood.android.advisory.dashboard.overview;

import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.rosetta.eventlogging.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ManagedDashboardOverviewViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewViewState$Loaded;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewViewState$Loading;", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface ManagedDashboardOverviewViewState {

    /* compiled from: ManagedDashboardOverviewViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewViewState$Loading;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements ManagedDashboardOverviewViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 533752306;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: ManagedDashboardOverviewViewState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JM\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewViewState$Loaded;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewViewState;", "defaultValueText", "", "availableCharts", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewChartState;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "activeCursorData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "hasPrivacy", "", "showReturnsBreakdownIcon", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/models/serverdriven/experimental/api/CursorData;ZZ)V", "getDefaultValueText", "()Ljava/lang/String;", "getAvailableCharts", "()Lkotlinx/collections/immutable/ImmutableList;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getActiveCursorData", "()Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "getHasPrivacy", "()Z", "getShowReturnsBreakdownIcon", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements ManagedDashboardOverviewViewState {
        public static final int $stable = 8;
        private final CursorData activeCursorData;
        private final ImmutableList<ManagedDashboardOverviewChartState> availableCharts;
        private final String defaultValueText;
        private final Context eventContext;
        private final boolean hasPrivacy;
        private final boolean showReturnsBreakdownIcon;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, ImmutableList immutableList, Context context, CursorData cursorData, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.defaultValueText;
            }
            if ((i & 2) != 0) {
                immutableList = loaded.availableCharts;
            }
            if ((i & 4) != 0) {
                context = loaded.eventContext;
            }
            if ((i & 8) != 0) {
                cursorData = loaded.activeCursorData;
            }
            if ((i & 16) != 0) {
                z = loaded.hasPrivacy;
            }
            if ((i & 32) != 0) {
                z2 = loaded.showReturnsBreakdownIcon;
            }
            boolean z3 = z;
            boolean z4 = z2;
            return loaded.copy(str, immutableList, context, cursorData, z3, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDefaultValueText() {
            return this.defaultValueText;
        }

        public final ImmutableList<ManagedDashboardOverviewChartState> component2() {
            return this.availableCharts;
        }

        /* renamed from: component3, reason: from getter */
        public final Context getEventContext() {
            return this.eventContext;
        }

        /* renamed from: component4, reason: from getter */
        public final CursorData getActiveCursorData() {
            return this.activeCursorData;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasPrivacy() {
            return this.hasPrivacy;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowReturnsBreakdownIcon() {
            return this.showReturnsBreakdownIcon;
        }

        public final Loaded copy(String defaultValueText, ImmutableList<? extends ManagedDashboardOverviewChartState> availableCharts, Context eventContext, CursorData activeCursorData, boolean hasPrivacy, boolean showReturnsBreakdownIcon) {
            Intrinsics.checkNotNullParameter(defaultValueText, "defaultValueText");
            Intrinsics.checkNotNullParameter(availableCharts, "availableCharts");
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            return new Loaded(defaultValueText, availableCharts, eventContext, activeCursorData, hasPrivacy, showReturnsBreakdownIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.defaultValueText, loaded.defaultValueText) && Intrinsics.areEqual(this.availableCharts, loaded.availableCharts) && Intrinsics.areEqual(this.eventContext, loaded.eventContext) && Intrinsics.areEqual(this.activeCursorData, loaded.activeCursorData) && this.hasPrivacy == loaded.hasPrivacy && this.showReturnsBreakdownIcon == loaded.showReturnsBreakdownIcon;
        }

        public int hashCode() {
            int iHashCode = ((((this.defaultValueText.hashCode() * 31) + this.availableCharts.hashCode()) * 31) + this.eventContext.hashCode()) * 31;
            CursorData cursorData = this.activeCursorData;
            return ((((iHashCode + (cursorData == null ? 0 : cursorData.hashCode())) * 31) + Boolean.hashCode(this.hasPrivacy)) * 31) + Boolean.hashCode(this.showReturnsBreakdownIcon);
        }

        public String toString() {
            return "Loaded(defaultValueText=" + this.defaultValueText + ", availableCharts=" + this.availableCharts + ", eventContext=" + this.eventContext + ", activeCursorData=" + this.activeCursorData + ", hasPrivacy=" + this.hasPrivacy + ", showReturnsBreakdownIcon=" + this.showReturnsBreakdownIcon + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(String defaultValueText, ImmutableList<? extends ManagedDashboardOverviewChartState> availableCharts, Context eventContext, CursorData cursorData, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(defaultValueText, "defaultValueText");
            Intrinsics.checkNotNullParameter(availableCharts, "availableCharts");
            Intrinsics.checkNotNullParameter(eventContext, "eventContext");
            this.defaultValueText = defaultValueText;
            this.availableCharts = availableCharts;
            this.eventContext = eventContext;
            this.activeCursorData = cursorData;
            this.hasPrivacy = z;
            this.showReturnsBreakdownIcon = z2;
        }

        public final String getDefaultValueText() {
            return this.defaultValueText;
        }

        public final ImmutableList<ManagedDashboardOverviewChartState> getAvailableCharts() {
            return this.availableCharts;
        }

        public final Context getEventContext() {
            return this.eventContext;
        }

        public final CursorData getActiveCursorData() {
            return this.activeCursorData;
        }

        public final boolean getHasPrivacy() {
            return this.hasPrivacy;
        }

        public final boolean getShowReturnsBreakdownIcon() {
            return this.showReturnsBreakdownIcon;
        }
    }
}
