package com.robinhood.android.equities.tradesettings;

import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: TimeInForceViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TimeInForceViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/equities/tradesettings/TimeInForceViewState$Loaded;", "Lcom/robinhood/android/equities/tradesettings/TimeInForceViewState$Loading;", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface TimeInForceViewState {

    /* compiled from: TimeInForceViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TimeInForceViewState$Loading;", "Lcom/robinhood/android/equities/tradesettings/TimeInForceViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements TimeInForceViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1764071647;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: TimeInForceViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TimeInForceViewState$Loaded;", "Lcom/robinhood/android/equities/tradesettings/TimeInForceViewState;", "orderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "selectionOptions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equities/tradesettings/ui/SelectionRowState;", "<init>", "(Lcom/robinhood/models/db/OrderTimeInForce;Lkotlinx/collections/immutable/ImmutableList;)V", "getOrderTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getSelectionOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements TimeInForceViewState {
        public static final int $stable = StringResource.$stable;
        private final OrderTimeInForce orderTimeInForce;
        private final ImmutableList<SelectionRowState<OrderTimeInForce>> selectionOptions;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, OrderTimeInForce orderTimeInForce, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                orderTimeInForce = loaded.orderTimeInForce;
            }
            if ((i & 2) != 0) {
                immutableList = loaded.selectionOptions;
            }
            return loaded.copy(orderTimeInForce, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderTimeInForce getOrderTimeInForce() {
            return this.orderTimeInForce;
        }

        public final ImmutableList<SelectionRowState<OrderTimeInForce>> component2() {
            return this.selectionOptions;
        }

        public final Loaded copy(OrderTimeInForce orderTimeInForce, ImmutableList<SelectionRowState<OrderTimeInForce>> selectionOptions) {
            Intrinsics.checkNotNullParameter(orderTimeInForce, "orderTimeInForce");
            Intrinsics.checkNotNullParameter(selectionOptions, "selectionOptions");
            return new Loaded(orderTimeInForce, selectionOptions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.orderTimeInForce == loaded.orderTimeInForce && Intrinsics.areEqual(this.selectionOptions, loaded.selectionOptions);
        }

        public int hashCode() {
            return (this.orderTimeInForce.hashCode() * 31) + this.selectionOptions.hashCode();
        }

        public String toString() {
            return "Loaded(orderTimeInForce=" + this.orderTimeInForce + ", selectionOptions=" + this.selectionOptions + ")";
        }

        public Loaded(OrderTimeInForce orderTimeInForce, ImmutableList<SelectionRowState<OrderTimeInForce>> selectionOptions) {
            Intrinsics.checkNotNullParameter(orderTimeInForce, "orderTimeInForce");
            Intrinsics.checkNotNullParameter(selectionOptions, "selectionOptions");
            this.orderTimeInForce = orderTimeInForce;
            this.selectionOptions = selectionOptions;
        }

        public final OrderTimeInForce getOrderTimeInForce() {
            return this.orderTimeInForce;
        }

        public final ImmutableList<SelectionRowState<OrderTimeInForce>> getSelectionOptions() {
            return this.selectionOptions;
        }
    }
}
