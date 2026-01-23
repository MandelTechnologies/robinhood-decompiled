package com.robinhood.android.equities.tradesettings.equity.p119ts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.equities.tradesettings.p120ui.SelectionRowState;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EquityTradingSessionViewState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003Jm\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020$HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionViewState;", "Landroid/os/Parcelable;", "longOrderTradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "longSelectionOptions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equities/tradesettings/ui/SelectionRowState;", "shortingEnabled", "", "shortOrderTradingSession", "shortSelectionOptions", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/utils/resource/StringResource;", "showDoneButton", "<init>", "(Lcom/robinhood/models/db/OrderMarketHours;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/models/db/OrderMarketHours;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/utils/resource/StringResource;Z)V", "getLongOrderTradingSession", "()Lcom/robinhood/models/db/OrderMarketHours;", "getLongSelectionOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "getShortingEnabled", "()Z", "getShortOrderTradingSession", "getShortSelectionOptions", "getDisclosure", "()Lcom/robinhood/utils/resource/StringResource;", "getShowDoneButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EquityTradingSessionViewState implements Parcelable {
    public static final int $stable = StringResource.$stable;
    public static final Parcelable.Creator<EquityTradingSessionViewState> CREATOR = new Creator();
    private final StringResource disclosure;
    private final OrderMarketHours longOrderTradingSession;
    private final ImmutableList<SelectionRowState<OrderMarketHours>> longSelectionOptions;
    private final OrderMarketHours shortOrderTradingSession;
    private final ImmutableList<SelectionRowState<OrderMarketHours>> shortSelectionOptions;
    private final boolean shortingEnabled;
    private final boolean showDoneButton;

    /* compiled from: EquityTradingSessionViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EquityTradingSessionViewState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EquityTradingSessionViewState createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OrderMarketHours orderMarketHours = (OrderMarketHours) parcel.readParcelable(EquityTradingSessionViewState.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SelectionRowState.CREATOR.createFromParcel(parcel));
            }
            ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            OrderMarketHours orderMarketHours2 = (OrderMarketHours) parcel.readParcelable(EquityTradingSessionViewState.class.getClassLoader());
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(SelectionRowState.CREATOR.createFromParcel(parcel));
            }
            return new EquityTradingSessionViewState(orderMarketHours, persistentList, z2, orderMarketHours2, extensions2.toPersistentList(arrayList2), (StringResource) parcel.readParcelable(EquityTradingSessionViewState.class.getClassLoader()), parcel.readInt() != 0 ? z : false);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EquityTradingSessionViewState[] newArray(int i) {
            return new EquityTradingSessionViewState[i];
        }
    }

    public static /* synthetic */ EquityTradingSessionViewState copy$default(EquityTradingSessionViewState equityTradingSessionViewState, OrderMarketHours orderMarketHours, ImmutableList immutableList, boolean z, OrderMarketHours orderMarketHours2, ImmutableList immutableList2, StringResource stringResource, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            orderMarketHours = equityTradingSessionViewState.longOrderTradingSession;
        }
        if ((i & 2) != 0) {
            immutableList = equityTradingSessionViewState.longSelectionOptions;
        }
        if ((i & 4) != 0) {
            z = equityTradingSessionViewState.shortingEnabled;
        }
        if ((i & 8) != 0) {
            orderMarketHours2 = equityTradingSessionViewState.shortOrderTradingSession;
        }
        if ((i & 16) != 0) {
            immutableList2 = equityTradingSessionViewState.shortSelectionOptions;
        }
        if ((i & 32) != 0) {
            stringResource = equityTradingSessionViewState.disclosure;
        }
        if ((i & 64) != 0) {
            z2 = equityTradingSessionViewState.showDoneButton;
        }
        StringResource stringResource2 = stringResource;
        boolean z3 = z2;
        ImmutableList immutableList3 = immutableList2;
        boolean z4 = z;
        return equityTradingSessionViewState.copy(orderMarketHours, immutableList, z4, orderMarketHours2, immutableList3, stringResource2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderMarketHours getLongOrderTradingSession() {
        return this.longOrderTradingSession;
    }

    public final ImmutableList<SelectionRowState<OrderMarketHours>> component2() {
        return this.longSelectionOptions;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShortingEnabled() {
        return this.shortingEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final OrderMarketHours getShortOrderTradingSession() {
        return this.shortOrderTradingSession;
    }

    public final ImmutableList<SelectionRowState<OrderMarketHours>> component5() {
        return this.shortSelectionOptions;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowDoneButton() {
        return this.showDoneButton;
    }

    public final EquityTradingSessionViewState copy(OrderMarketHours longOrderTradingSession, ImmutableList<SelectionRowState<OrderMarketHours>> longSelectionOptions, boolean shortingEnabled, OrderMarketHours shortOrderTradingSession, ImmutableList<SelectionRowState<OrderMarketHours>> shortSelectionOptions, StringResource disclosure, boolean showDoneButton) {
        Intrinsics.checkNotNullParameter(longSelectionOptions, "longSelectionOptions");
        Intrinsics.checkNotNullParameter(shortSelectionOptions, "shortSelectionOptions");
        return new EquityTradingSessionViewState(longOrderTradingSession, longSelectionOptions, shortingEnabled, shortOrderTradingSession, shortSelectionOptions, disclosure, showDoneButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityTradingSessionViewState)) {
            return false;
        }
        EquityTradingSessionViewState equityTradingSessionViewState = (EquityTradingSessionViewState) other;
        return this.longOrderTradingSession == equityTradingSessionViewState.longOrderTradingSession && Intrinsics.areEqual(this.longSelectionOptions, equityTradingSessionViewState.longSelectionOptions) && this.shortingEnabled == equityTradingSessionViewState.shortingEnabled && this.shortOrderTradingSession == equityTradingSessionViewState.shortOrderTradingSession && Intrinsics.areEqual(this.shortSelectionOptions, equityTradingSessionViewState.shortSelectionOptions) && Intrinsics.areEqual(this.disclosure, equityTradingSessionViewState.disclosure) && this.showDoneButton == equityTradingSessionViewState.showDoneButton;
    }

    public int hashCode() {
        OrderMarketHours orderMarketHours = this.longOrderTradingSession;
        int iHashCode = (((((orderMarketHours == null ? 0 : orderMarketHours.hashCode()) * 31) + this.longSelectionOptions.hashCode()) * 31) + Boolean.hashCode(this.shortingEnabled)) * 31;
        OrderMarketHours orderMarketHours2 = this.shortOrderTradingSession;
        int iHashCode2 = (((iHashCode + (orderMarketHours2 == null ? 0 : orderMarketHours2.hashCode())) * 31) + this.shortSelectionOptions.hashCode()) * 31;
        StringResource stringResource = this.disclosure;
        return ((iHashCode2 + (stringResource != null ? stringResource.hashCode() : 0)) * 31) + Boolean.hashCode(this.showDoneButton);
    }

    public String toString() {
        return "EquityTradingSessionViewState(longOrderTradingSession=" + this.longOrderTradingSession + ", longSelectionOptions=" + this.longSelectionOptions + ", shortingEnabled=" + this.shortingEnabled + ", shortOrderTradingSession=" + this.shortOrderTradingSession + ", shortSelectionOptions=" + this.shortSelectionOptions + ", disclosure=" + this.disclosure + ", showDoneButton=" + this.showDoneButton + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.longOrderTradingSession, flags);
        ImmutableList<SelectionRowState<OrderMarketHours>> immutableList = this.longSelectionOptions;
        dest.writeInt(immutableList.size());
        Iterator<SelectionRowState<OrderMarketHours>> it = immutableList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.shortingEnabled ? 1 : 0);
        dest.writeParcelable(this.shortOrderTradingSession, flags);
        ImmutableList<SelectionRowState<OrderMarketHours>> immutableList2 = this.shortSelectionOptions;
        dest.writeInt(immutableList2.size());
        Iterator<SelectionRowState<OrderMarketHours>> it2 = immutableList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.disclosure, flags);
        dest.writeInt(this.showDoneButton ? 1 : 0);
    }

    public EquityTradingSessionViewState(OrderMarketHours orderMarketHours, ImmutableList<SelectionRowState<OrderMarketHours>> longSelectionOptions, boolean z, OrderMarketHours orderMarketHours2, ImmutableList<SelectionRowState<OrderMarketHours>> shortSelectionOptions, StringResource stringResource, boolean z2) {
        Intrinsics.checkNotNullParameter(longSelectionOptions, "longSelectionOptions");
        Intrinsics.checkNotNullParameter(shortSelectionOptions, "shortSelectionOptions");
        this.longOrderTradingSession = orderMarketHours;
        this.longSelectionOptions = longSelectionOptions;
        this.shortingEnabled = z;
        this.shortOrderTradingSession = orderMarketHours2;
        this.shortSelectionOptions = shortSelectionOptions;
        this.disclosure = stringResource;
        this.showDoneButton = z2;
    }

    public final OrderMarketHours getLongOrderTradingSession() {
        return this.longOrderTradingSession;
    }

    public final ImmutableList<SelectionRowState<OrderMarketHours>> getLongSelectionOptions() {
        return this.longSelectionOptions;
    }

    public final boolean getShortingEnabled() {
        return this.shortingEnabled;
    }

    public final OrderMarketHours getShortOrderTradingSession() {
        return this.shortOrderTradingSession;
    }

    public final ImmutableList<SelectionRowState<OrderMarketHours>> getShortSelectionOptions() {
        return this.shortSelectionOptions;
    }

    public final StringResource getDisclosure() {
        return this.disclosure;
    }

    public final boolean getShowDoneButton() {
        return this.showDoneButton;
    }
}
