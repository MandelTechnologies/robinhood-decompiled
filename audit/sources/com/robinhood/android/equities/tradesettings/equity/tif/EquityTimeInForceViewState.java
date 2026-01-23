package com.robinhood.android.equities.tradesettings.equity.tif;

import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EquityTimeInForceViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceViewState$Loaded;", "Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceViewState$Loading;", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EquityTimeInForceViewState {

    /* compiled from: EquityTimeInForceViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceViewState$Loading;", "Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements EquityTimeInForceViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1191158286;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: EquityTimeInForceViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005HÆ\u0003JS\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceViewState$Loaded;", "Lcom/robinhood/android/equities/tradesettings/equity/tif/EquityTimeInForceViewState;", "longOrderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "longSelectionOptions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equities/tradesettings/ui/SelectionRowState;", "shortingEnabled", "", "shortOrderTimeInForce", "shortSelectionOptions", "<init>", "(Lcom/robinhood/models/db/OrderTimeInForce;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/models/db/OrderTimeInForce;Lkotlinx/collections/immutable/ImmutableList;)V", "getLongOrderTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getLongSelectionOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "getShortingEnabled", "()Z", "getShortOrderTimeInForce", "getShortSelectionOptions", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements EquityTimeInForceViewState {
        public static final int $stable = StringResource.$stable;
        private final OrderTimeInForce longOrderTimeInForce;
        private final ImmutableList<SelectionRowState<OrderTimeInForce>> longSelectionOptions;
        private final OrderTimeInForce shortOrderTimeInForce;
        private final ImmutableList<SelectionRowState<OrderTimeInForce>> shortSelectionOptions;
        private final boolean shortingEnabled;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, OrderTimeInForce orderTimeInForce, ImmutableList immutableList, boolean z, OrderTimeInForce orderTimeInForce2, ImmutableList immutableList2, int i, Object obj) {
            if ((i & 1) != 0) {
                orderTimeInForce = loaded.longOrderTimeInForce;
            }
            if ((i & 2) != 0) {
                immutableList = loaded.longSelectionOptions;
            }
            if ((i & 4) != 0) {
                z = loaded.shortingEnabled;
            }
            if ((i & 8) != 0) {
                orderTimeInForce2 = loaded.shortOrderTimeInForce;
            }
            if ((i & 16) != 0) {
                immutableList2 = loaded.shortSelectionOptions;
            }
            ImmutableList immutableList3 = immutableList2;
            boolean z2 = z;
            return loaded.copy(orderTimeInForce, immutableList, z2, orderTimeInForce2, immutableList3);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderTimeInForce getLongOrderTimeInForce() {
            return this.longOrderTimeInForce;
        }

        public final ImmutableList<SelectionRowState<OrderTimeInForce>> component2() {
            return this.longSelectionOptions;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShortingEnabled() {
            return this.shortingEnabled;
        }

        /* renamed from: component4, reason: from getter */
        public final OrderTimeInForce getShortOrderTimeInForce() {
            return this.shortOrderTimeInForce;
        }

        public final ImmutableList<SelectionRowState<OrderTimeInForce>> component5() {
            return this.shortSelectionOptions;
        }

        public final Loaded copy(OrderTimeInForce longOrderTimeInForce, ImmutableList<SelectionRowState<OrderTimeInForce>> longSelectionOptions, boolean shortingEnabled, OrderTimeInForce shortOrderTimeInForce, ImmutableList<SelectionRowState<OrderTimeInForce>> shortSelectionOptions) {
            Intrinsics.checkNotNullParameter(longOrderTimeInForce, "longOrderTimeInForce");
            Intrinsics.checkNotNullParameter(longSelectionOptions, "longSelectionOptions");
            Intrinsics.checkNotNullParameter(shortOrderTimeInForce, "shortOrderTimeInForce");
            Intrinsics.checkNotNullParameter(shortSelectionOptions, "shortSelectionOptions");
            return new Loaded(longOrderTimeInForce, longSelectionOptions, shortingEnabled, shortOrderTimeInForce, shortSelectionOptions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.longOrderTimeInForce == loaded.longOrderTimeInForce && Intrinsics.areEqual(this.longSelectionOptions, loaded.longSelectionOptions) && this.shortingEnabled == loaded.shortingEnabled && this.shortOrderTimeInForce == loaded.shortOrderTimeInForce && Intrinsics.areEqual(this.shortSelectionOptions, loaded.shortSelectionOptions);
        }

        public int hashCode() {
            return (((((((this.longOrderTimeInForce.hashCode() * 31) + this.longSelectionOptions.hashCode()) * 31) + Boolean.hashCode(this.shortingEnabled)) * 31) + this.shortOrderTimeInForce.hashCode()) * 31) + this.shortSelectionOptions.hashCode();
        }

        public String toString() {
            return "Loaded(longOrderTimeInForce=" + this.longOrderTimeInForce + ", longSelectionOptions=" + this.longSelectionOptions + ", shortingEnabled=" + this.shortingEnabled + ", shortOrderTimeInForce=" + this.shortOrderTimeInForce + ", shortSelectionOptions=" + this.shortSelectionOptions + ")";
        }

        public Loaded(OrderTimeInForce longOrderTimeInForce, ImmutableList<SelectionRowState<OrderTimeInForce>> longSelectionOptions, boolean z, OrderTimeInForce shortOrderTimeInForce, ImmutableList<SelectionRowState<OrderTimeInForce>> shortSelectionOptions) {
            Intrinsics.checkNotNullParameter(longOrderTimeInForce, "longOrderTimeInForce");
            Intrinsics.checkNotNullParameter(longSelectionOptions, "longSelectionOptions");
            Intrinsics.checkNotNullParameter(shortOrderTimeInForce, "shortOrderTimeInForce");
            Intrinsics.checkNotNullParameter(shortSelectionOptions, "shortSelectionOptions");
            this.longOrderTimeInForce = longOrderTimeInForce;
            this.longSelectionOptions = longSelectionOptions;
            this.shortingEnabled = z;
            this.shortOrderTimeInForce = shortOrderTimeInForce;
            this.shortSelectionOptions = shortSelectionOptions;
        }

        public final OrderTimeInForce getLongOrderTimeInForce() {
            return this.longOrderTimeInForce;
        }

        public final ImmutableList<SelectionRowState<OrderTimeInForce>> getLongSelectionOptions() {
            return this.longSelectionOptions;
        }

        public final boolean getShortingEnabled() {
            return this.shortingEnabled;
        }

        public final OrderTimeInForce getShortOrderTimeInForce() {
            return this.shortOrderTimeInForce;
        }

        public final ImmutableList<SelectionRowState<OrderTimeInForce>> getShortSelectionOptions() {
            return this.shortSelectionOptions;
        }
    }
}
