package com.robinhood.android.equities.tradesettings;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.android.tradinghourvisual.lib.p263ui.SetTradingHourVisualizerArgs;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TradingSessionViewState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TradingSessionViewState;", "Landroid/os/Parcelable;", "orderTradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "selectionOptions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equities/tradesettings/ui/SelectionRowState;", "tradingSessionVisualizer", "Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "showDisclosure", "", "showDoneButton", "<init>", "(Lcom/robinhood/models/db/OrderMarketHours;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;ZZ)V", "getOrderTradingSession", "()Lcom/robinhood/models/db/OrderMarketHours;", "getSelectionOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "getTradingSessionVisualizer", "()Lcom/robinhood/android/tradinghourvisual/lib/ui/SetTradingHourVisualizerArgs;", "getShowDisclosure", "()Z", "getShowDoneButton", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TradingSessionViewState implements Parcelable {
    public static final int $stable;
    public static final Parcelable.Creator<TradingSessionViewState> CREATOR;
    private final OrderMarketHours orderTradingSession;
    private final ImmutableList<SelectionRowState<OrderMarketHours>> selectionOptions;
    private final boolean showDisclosure;
    private final boolean showDoneButton;
    private final SetTradingHourVisualizerArgs tradingSessionVisualizer;

    /* compiled from: TradingSessionViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<TradingSessionViewState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradingSessionViewState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OrderMarketHours orderMarketHours = (OrderMarketHours) parcel.readParcelable(TradingSessionViewState.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SelectionRowState.CREATOR.createFromParcel(parcel));
            }
            return new TradingSessionViewState(orderMarketHours, extensions2.toPersistentList(arrayList), (SetTradingHourVisualizerArgs) parcel.readParcelable(TradingSessionViewState.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradingSessionViewState[] newArray(int i) {
            return new TradingSessionViewState[i];
        }
    }

    static {
        int i = SetTradingHourVisualizerArgs.$stable;
        int i2 = StringResource.$stable;
        $stable = i | i2 | i2;
        CREATOR = new Creator();
    }

    public static /* synthetic */ TradingSessionViewState copy$default(TradingSessionViewState tradingSessionViewState, OrderMarketHours orderMarketHours, ImmutableList immutableList, SetTradingHourVisualizerArgs setTradingHourVisualizerArgs, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            orderMarketHours = tradingSessionViewState.orderTradingSession;
        }
        if ((i & 2) != 0) {
            immutableList = tradingSessionViewState.selectionOptions;
        }
        if ((i & 4) != 0) {
            setTradingHourVisualizerArgs = tradingSessionViewState.tradingSessionVisualizer;
        }
        if ((i & 8) != 0) {
            z = tradingSessionViewState.showDisclosure;
        }
        if ((i & 16) != 0) {
            z2 = tradingSessionViewState.showDoneButton;
        }
        boolean z3 = z2;
        SetTradingHourVisualizerArgs setTradingHourVisualizerArgs2 = setTradingHourVisualizerArgs;
        return tradingSessionViewState.copy(orderMarketHours, immutableList, setTradingHourVisualizerArgs2, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderMarketHours getOrderTradingSession() {
        return this.orderTradingSession;
    }

    public final ImmutableList<SelectionRowState<OrderMarketHours>> component2() {
        return this.selectionOptions;
    }

    /* renamed from: component3, reason: from getter */
    public final SetTradingHourVisualizerArgs getTradingSessionVisualizer() {
        return this.tradingSessionVisualizer;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowDisclosure() {
        return this.showDisclosure;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowDoneButton() {
        return this.showDoneButton;
    }

    public final TradingSessionViewState copy(OrderMarketHours orderTradingSession, ImmutableList<SelectionRowState<OrderMarketHours>> selectionOptions, SetTradingHourVisualizerArgs tradingSessionVisualizer, boolean showDisclosure, boolean showDoneButton) {
        Intrinsics.checkNotNullParameter(selectionOptions, "selectionOptions");
        Intrinsics.checkNotNullParameter(tradingSessionVisualizer, "tradingSessionVisualizer");
        return new TradingSessionViewState(orderTradingSession, selectionOptions, tradingSessionVisualizer, showDisclosure, showDoneButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradingSessionViewState)) {
            return false;
        }
        TradingSessionViewState tradingSessionViewState = (TradingSessionViewState) other;
        return this.orderTradingSession == tradingSessionViewState.orderTradingSession && Intrinsics.areEqual(this.selectionOptions, tradingSessionViewState.selectionOptions) && Intrinsics.areEqual(this.tradingSessionVisualizer, tradingSessionViewState.tradingSessionVisualizer) && this.showDisclosure == tradingSessionViewState.showDisclosure && this.showDoneButton == tradingSessionViewState.showDoneButton;
    }

    public int hashCode() {
        OrderMarketHours orderMarketHours = this.orderTradingSession;
        return ((((((((orderMarketHours == null ? 0 : orderMarketHours.hashCode()) * 31) + this.selectionOptions.hashCode()) * 31) + this.tradingSessionVisualizer.hashCode()) * 31) + Boolean.hashCode(this.showDisclosure)) * 31) + Boolean.hashCode(this.showDoneButton);
    }

    public String toString() {
        return "TradingSessionViewState(orderTradingSession=" + this.orderTradingSession + ", selectionOptions=" + this.selectionOptions + ", tradingSessionVisualizer=" + this.tradingSessionVisualizer + ", showDisclosure=" + this.showDisclosure + ", showDoneButton=" + this.showDoneButton + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.orderTradingSession, flags);
        ImmutableList<SelectionRowState<OrderMarketHours>> immutableList = this.selectionOptions;
        dest.writeInt(immutableList.size());
        Iterator<SelectionRowState<OrderMarketHours>> it = immutableList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.tradingSessionVisualizer, flags);
        dest.writeInt(this.showDisclosure ? 1 : 0);
        dest.writeInt(this.showDoneButton ? 1 : 0);
    }

    public TradingSessionViewState(OrderMarketHours orderMarketHours, ImmutableList<SelectionRowState<OrderMarketHours>> selectionOptions, SetTradingHourVisualizerArgs tradingSessionVisualizer, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(selectionOptions, "selectionOptions");
        Intrinsics.checkNotNullParameter(tradingSessionVisualizer, "tradingSessionVisualizer");
        this.orderTradingSession = orderMarketHours;
        this.selectionOptions = selectionOptions;
        this.tradingSessionVisualizer = tradingSessionVisualizer;
        this.showDisclosure = z;
        this.showDoneButton = z2;
    }

    public final OrderMarketHours getOrderTradingSession() {
        return this.orderTradingSession;
    }

    public final ImmutableList<SelectionRowState<OrderMarketHours>> getSelectionOptions() {
        return this.selectionOptions;
    }

    public final SetTradingHourVisualizerArgs getTradingSessionVisualizer() {
        return this.tradingSessionVisualizer;
    }

    public final boolean getShowDisclosure() {
        return this.showDisclosure;
    }

    public final boolean getShowDoneButton() {
        return this.showDoneButton;
    }
}
