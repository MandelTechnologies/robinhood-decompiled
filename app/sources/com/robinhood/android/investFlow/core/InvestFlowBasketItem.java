package com.robinhood.android.investFlow.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p320db.Instrument;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowBasketItem.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/investFlow/core/InvestFlowBasketItem;", "Landroid/os/Parcelable;", "<init>", "()V", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "toCuratedListChipItem", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "isCloseable", "", "symbol", "", "getSymbol", "()Ljava/lang/String;", "Equity", "Lcom/robinhood/android/investFlow/core/InvestFlowBasketItem$Equity;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class InvestFlowBasketItem implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ InvestFlowBasketItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract UUID getId();

    public abstract String getSymbol();

    public abstract CuratedListChipItem toCuratedListChipItem(boolean isCloseable);

    private InvestFlowBasketItem() {
    }

    /* compiled from: InvestFlowBasketItem.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\rHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/investFlow/core/InvestFlowBasketItem$Equity;", "Lcom/robinhood/android/investFlow/core/InvestFlowBasketItem;", "instrument", "Lcom/robinhood/models/db/Instrument;", "<init>", "(Lcom/robinhood/models/db/Instrument;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "toCuratedListChipItem", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "isCloseable", "", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Equity extends InvestFlowBasketItem {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Equity> CREATOR = new Creator();
        private final Instrument instrument;

        /* compiled from: InvestFlowBasketItem.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Equity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Equity createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Equity((Instrument) parcel.readParcelable(Equity.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Equity[] newArray(int i) {
                return new Equity[i];
            }
        }

        public static /* synthetic */ Equity copy$default(Equity equity, Instrument instrument, int i, Object obj) {
            if ((i & 1) != 0) {
                instrument = equity.instrument;
            }
            return equity.copy(instrument);
        }

        /* renamed from: component1, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final Equity copy(Instrument instrument) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            return new Equity(instrument);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Equity) && Intrinsics.areEqual(this.instrument, ((Equity) other).instrument);
        }

        public int hashCode() {
            return this.instrument.hashCode();
        }

        public String toString() {
            return "Equity(instrument=" + this.instrument + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.instrument, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Equity(Instrument instrument) {
            super(null);
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.instrument = instrument;
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        @Override // com.robinhood.android.investFlow.core.InvestFlowBasketItem
        public UUID getId() {
            return this.instrument.getId();
        }

        @Override // com.robinhood.android.investFlow.core.InvestFlowBasketItem
        public String getSymbol() {
            return this.instrument.getSymbol();
        }

        @Override // com.robinhood.android.investFlow.core.InvestFlowBasketItem
        public CuratedListChipItem toCuratedListChipItem(boolean isCloseable) {
            return new CuratedListChipItem(this.instrument.getId(), this.instrument.getDisplayName(), ApiCuratedList.OwnerType.ROBINHOOD, null, null, null, null, false, false, null, true, 504, null);
        }
    }
}
