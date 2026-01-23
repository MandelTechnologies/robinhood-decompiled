package com.robinhood.android.portfolio.pnl.p214db;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.util.Money;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitAndLossOrderDetails.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails;", "Landroid/os/Parcelable;", "<init>", "()V", "instrumentToView", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$Instrument;", "getInstrumentToView", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$Instrument;", "EquityOrderDetails", "OptionOrderDetails", "CryptoOrderDetails", "Instrument", "AdapterModule", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$CryptoOrderDetails;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$EquityOrderDetails;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$OptionOrderDetails;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class ProfitAndLossOrderDetails implements Parcelable {
    public /* synthetic */ ProfitAndLossOrderDetails(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Instrument getInstrumentToView();

    private ProfitAndLossOrderDetails() {
    }

    /* compiled from: ProfitAndLossOrderDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$EquityOrderDetails;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "instrumentToView", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$Instrument;", "getInstrumentToView", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$Instrument;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EquityOrderDetails extends ProfitAndLossOrderDetails implements Parcelable {
        public static final Parcelable.Creator<EquityOrderDetails> CREATOR = new Creator();
        private final UUID instrumentId;

        /* compiled from: ProfitAndLossOrderDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<EquityOrderDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EquityOrderDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EquityOrderDetails((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EquityOrderDetails[] newArray(int i) {
                return new EquityOrderDetails[i];
            }
        }

        public static /* synthetic */ EquityOrderDetails copy$default(EquityOrderDetails equityOrderDetails, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = equityOrderDetails.instrumentId;
            }
            return equityOrderDetails.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final EquityOrderDetails copy(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new EquityOrderDetails(instrumentId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EquityOrderDetails) && Intrinsics.areEqual(this.instrumentId, ((EquityOrderDetails) other).instrumentId);
        }

        public int hashCode() {
            return this.instrumentId.hashCode();
        }

        public String toString() {
            return "EquityOrderDetails(instrumentId=" + this.instrumentId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EquityOrderDetails(UUID instrumentId) {
            super(null);
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        @Override // com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossOrderDetails
        public Instrument getInstrumentToView() {
            return new Instrument(this.instrumentId, Instrument.Type.EQUITY, null);
        }
    }

    /* compiled from: ProfitAndLossOrderDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0004J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$OptionOrderDetails;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails;", "Landroid/os/Parcelable;", "tradeValueMultiplier", "", "underlyings", "", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$Instrument;", "<init>", "(ILjava/util/List;)V", "getTradeValueMultiplier", "()I", "getUnderlyings", "()Ljava/util/List;", "instrumentToView", "getInstrumentToView", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$Instrument;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionOrderDetails extends ProfitAndLossOrderDetails implements Parcelable {
        public static final Parcelable.Creator<OptionOrderDetails> CREATOR = new Creator();
        private final int tradeValueMultiplier;
        private final List<Instrument> underlyings;

        /* compiled from: ProfitAndLossOrderDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<OptionOrderDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionOrderDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(Instrument.CREATOR.createFromParcel(parcel));
                }
                return new OptionOrderDetails(i, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionOrderDetails[] newArray(int i) {
                return new OptionOrderDetails[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OptionOrderDetails copy$default(OptionOrderDetails optionOrderDetails, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = optionOrderDetails.tradeValueMultiplier;
            }
            if ((i2 & 2) != 0) {
                list = optionOrderDetails.underlyings;
            }
            return optionOrderDetails.copy(i, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTradeValueMultiplier() {
            return this.tradeValueMultiplier;
        }

        public final List<Instrument> component2() {
            return this.underlyings;
        }

        public final OptionOrderDetails copy(int tradeValueMultiplier, List<Instrument> underlyings) {
            Intrinsics.checkNotNullParameter(underlyings, "underlyings");
            return new OptionOrderDetails(tradeValueMultiplier, underlyings);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionOrderDetails)) {
                return false;
            }
            OptionOrderDetails optionOrderDetails = (OptionOrderDetails) other;
            return this.tradeValueMultiplier == optionOrderDetails.tradeValueMultiplier && Intrinsics.areEqual(this.underlyings, optionOrderDetails.underlyings);
        }

        public int hashCode() {
            return (Integer.hashCode(this.tradeValueMultiplier) * 31) + this.underlyings.hashCode();
        }

        public String toString() {
            return "OptionOrderDetails(tradeValueMultiplier=" + this.tradeValueMultiplier + ", underlyings=" + this.underlyings + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.tradeValueMultiplier);
            List<Instrument> list = this.underlyings;
            dest.writeInt(list.size());
            Iterator<Instrument> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }

        public final int getTradeValueMultiplier() {
            return this.tradeValueMultiplier;
        }

        public final List<Instrument> getUnderlyings() {
            return this.underlyings;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionOrderDetails(int i, List<Instrument> underlyings) {
            super(null);
            Intrinsics.checkNotNullParameter(underlyings, "underlyings");
            this.tradeValueMultiplier = i;
            this.underlyings = underlyings;
        }

        @Override // com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossOrderDetails
        public Instrument getInstrumentToView() {
            return (Instrument) CollectionsKt.firstOrNull((List) this.underlyings);
        }
    }

    /* compiled from: ProfitAndLossOrderDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001)B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$CryptoOrderDetails;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "assetSymbol", "", "acquired", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$CryptoOrderDetails$RealizedGainLossItemComponent;", "transferred", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$CryptoOrderDetails$RealizedGainLossItemComponent;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$CryptoOrderDetails$RealizedGainLossItemComponent;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getAssetSymbol", "()Ljava/lang/String;", "getAcquired", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$CryptoOrderDetails$RealizedGainLossItemComponent;", "getTransferred", "instrumentToView", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$Instrument;", "getInstrumentToView", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$Instrument;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "RealizedGainLossItemComponent", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class CryptoOrderDetails extends ProfitAndLossOrderDetails implements Parcelable {
        public static final Parcelable.Creator<CryptoOrderDetails> CREATOR = new Creator();
        private final RealizedGainLossItemComponent acquired;
        private final String assetSymbol;
        private final UUID currencyPairId;
        private final RealizedGainLossItemComponent transferred;

        /* compiled from: ProfitAndLossOrderDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CryptoOrderDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CryptoOrderDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoOrderDetails((UUID) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : RealizedGainLossItemComponent.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RealizedGainLossItemComponent.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CryptoOrderDetails[] newArray(int i) {
                return new CryptoOrderDetails[i];
            }
        }

        public static /* synthetic */ CryptoOrderDetails copy$default(CryptoOrderDetails cryptoOrderDetails, UUID uuid, String str, RealizedGainLossItemComponent realizedGainLossItemComponent, RealizedGainLossItemComponent realizedGainLossItemComponent2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = cryptoOrderDetails.currencyPairId;
            }
            if ((i & 2) != 0) {
                str = cryptoOrderDetails.assetSymbol;
            }
            if ((i & 4) != 0) {
                realizedGainLossItemComponent = cryptoOrderDetails.acquired;
            }
            if ((i & 8) != 0) {
                realizedGainLossItemComponent2 = cryptoOrderDetails.transferred;
            }
            return cryptoOrderDetails.copy(uuid, str, realizedGainLossItemComponent, realizedGainLossItemComponent2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAssetSymbol() {
            return this.assetSymbol;
        }

        /* renamed from: component3, reason: from getter */
        public final RealizedGainLossItemComponent getAcquired() {
            return this.acquired;
        }

        /* renamed from: component4, reason: from getter */
        public final RealizedGainLossItemComponent getTransferred() {
            return this.transferred;
        }

        public final CryptoOrderDetails copy(UUID currencyPairId, String assetSymbol, RealizedGainLossItemComponent acquired, RealizedGainLossItemComponent transferred) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
            return new CryptoOrderDetails(currencyPairId, assetSymbol, acquired, transferred);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CryptoOrderDetails)) {
                return false;
            }
            CryptoOrderDetails cryptoOrderDetails = (CryptoOrderDetails) other;
            return Intrinsics.areEqual(this.currencyPairId, cryptoOrderDetails.currencyPairId) && Intrinsics.areEqual(this.assetSymbol, cryptoOrderDetails.assetSymbol) && Intrinsics.areEqual(this.acquired, cryptoOrderDetails.acquired) && Intrinsics.areEqual(this.transferred, cryptoOrderDetails.transferred);
        }

        public int hashCode() {
            int iHashCode = ((this.currencyPairId.hashCode() * 31) + this.assetSymbol.hashCode()) * 31;
            RealizedGainLossItemComponent realizedGainLossItemComponent = this.acquired;
            int iHashCode2 = (iHashCode + (realizedGainLossItemComponent == null ? 0 : realizedGainLossItemComponent.hashCode())) * 31;
            RealizedGainLossItemComponent realizedGainLossItemComponent2 = this.transferred;
            return iHashCode2 + (realizedGainLossItemComponent2 != null ? realizedGainLossItemComponent2.hashCode() : 0);
        }

        public String toString() {
            return "CryptoOrderDetails(currencyPairId=" + this.currencyPairId + ", assetSymbol=" + this.assetSymbol + ", acquired=" + this.acquired + ", transferred=" + this.transferred + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
            dest.writeString(this.assetSymbol);
            RealizedGainLossItemComponent realizedGainLossItemComponent = this.acquired;
            if (realizedGainLossItemComponent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                realizedGainLossItemComponent.writeToParcel(dest, flags);
            }
            RealizedGainLossItemComponent realizedGainLossItemComponent2 = this.transferred;
            if (realizedGainLossItemComponent2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                realizedGainLossItemComponent2.writeToParcel(dest, flags);
            }
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final RealizedGainLossItemComponent getAcquired() {
            return this.acquired;
        }

        public final RealizedGainLossItemComponent getTransferred() {
            return this.transferred;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoOrderDetails(UUID currencyPairId, String assetSymbol, RealizedGainLossItemComponent realizedGainLossItemComponent, RealizedGainLossItemComponent realizedGainLossItemComponent2) {
            super(null);
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
            this.currencyPairId = currencyPairId;
            this.assetSymbol = assetSymbol;
            this.acquired = realizedGainLossItemComponent;
            this.transferred = realizedGainLossItemComponent2;
        }

        @Override // com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossOrderDetails
        public Instrument getInstrumentToView() {
            return new Instrument(this.currencyPairId, Instrument.Type.CRYPTO, this.assetSymbol);
        }

        /* compiled from: ProfitAndLossOrderDetails.kt */
        @JsonClass(generateAdapter = true)
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$CryptoOrderDetails$RealizedGainLossItemComponent;", "Landroid/os/Parcelable;", "quantity", "Ljava/math/BigDecimal;", "averageOpenPrice", "Lcom/robinhood/models/util/Money;", "averageClosePrice", "openingAmount", "closingAmount", "realizedReturn", "realizedReturnPercentage", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;)V", "getQuantity", "()Ljava/math/BigDecimal;", "getAverageOpenPrice", "()Lcom/robinhood/models/util/Money;", "getAverageClosePrice", "getOpeningAmount", "getClosingAmount", "getRealizedReturn", "getRealizedReturnPercentage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RealizedGainLossItemComponent implements Parcelable {
            public static final Parcelable.Creator<RealizedGainLossItemComponent> CREATOR = new Creator();
            private final Money averageClosePrice;
            private final Money averageOpenPrice;
            private final Money closingAmount;
            private final Money openingAmount;
            private final BigDecimal quantity;
            private final Money realizedReturn;
            private final BigDecimal realizedReturnPercentage;

            /* compiled from: ProfitAndLossOrderDetails.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<RealizedGainLossItemComponent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RealizedGainLossItemComponent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RealizedGainLossItemComponent((BigDecimal) parcel.readSerializable(), (Money) parcel.readParcelable(RealizedGainLossItemComponent.class.getClassLoader()), (Money) parcel.readParcelable(RealizedGainLossItemComponent.class.getClassLoader()), (Money) parcel.readParcelable(RealizedGainLossItemComponent.class.getClassLoader()), (Money) parcel.readParcelable(RealizedGainLossItemComponent.class.getClassLoader()), (Money) parcel.readParcelable(RealizedGainLossItemComponent.class.getClassLoader()), (BigDecimal) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RealizedGainLossItemComponent[] newArray(int i) {
                    return new RealizedGainLossItemComponent[i];
                }
            }

            public static /* synthetic */ RealizedGainLossItemComponent copy$default(RealizedGainLossItemComponent realizedGainLossItemComponent, BigDecimal bigDecimal, Money money, Money money2, Money money3, Money money4, Money money5, BigDecimal bigDecimal2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = realizedGainLossItemComponent.quantity;
                }
                if ((i & 2) != 0) {
                    money = realizedGainLossItemComponent.averageOpenPrice;
                }
                if ((i & 4) != 0) {
                    money2 = realizedGainLossItemComponent.averageClosePrice;
                }
                if ((i & 8) != 0) {
                    money3 = realizedGainLossItemComponent.openingAmount;
                }
                if ((i & 16) != 0) {
                    money4 = realizedGainLossItemComponent.closingAmount;
                }
                if ((i & 32) != 0) {
                    money5 = realizedGainLossItemComponent.realizedReturn;
                }
                if ((i & 64) != 0) {
                    bigDecimal2 = realizedGainLossItemComponent.realizedReturnPercentage;
                }
                Money money6 = money5;
                BigDecimal bigDecimal3 = bigDecimal2;
                Money money7 = money4;
                Money money8 = money2;
                return realizedGainLossItemComponent.copy(bigDecimal, money, money8, money3, money7, money6, bigDecimal3);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getQuantity() {
                return this.quantity;
            }

            /* renamed from: component2, reason: from getter */
            public final Money getAverageOpenPrice() {
                return this.averageOpenPrice;
            }

            /* renamed from: component3, reason: from getter */
            public final Money getAverageClosePrice() {
                return this.averageClosePrice;
            }

            /* renamed from: component4, reason: from getter */
            public final Money getOpeningAmount() {
                return this.openingAmount;
            }

            /* renamed from: component5, reason: from getter */
            public final Money getClosingAmount() {
                return this.closingAmount;
            }

            /* renamed from: component6, reason: from getter */
            public final Money getRealizedReturn() {
                return this.realizedReturn;
            }

            /* renamed from: component7, reason: from getter */
            public final BigDecimal getRealizedReturnPercentage() {
                return this.realizedReturnPercentage;
            }

            public final RealizedGainLossItemComponent copy(BigDecimal quantity, Money averageOpenPrice, Money averageClosePrice, Money openingAmount, Money closingAmount, Money realizedReturn, BigDecimal realizedReturnPercentage) {
                Intrinsics.checkNotNullParameter(quantity, "quantity");
                Intrinsics.checkNotNullParameter(averageClosePrice, "averageClosePrice");
                Intrinsics.checkNotNullParameter(closingAmount, "closingAmount");
                return new RealizedGainLossItemComponent(quantity, averageOpenPrice, averageClosePrice, openingAmount, closingAmount, realizedReturn, realizedReturnPercentage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RealizedGainLossItemComponent)) {
                    return false;
                }
                RealizedGainLossItemComponent realizedGainLossItemComponent = (RealizedGainLossItemComponent) other;
                return Intrinsics.areEqual(this.quantity, realizedGainLossItemComponent.quantity) && Intrinsics.areEqual(this.averageOpenPrice, realizedGainLossItemComponent.averageOpenPrice) && Intrinsics.areEqual(this.averageClosePrice, realizedGainLossItemComponent.averageClosePrice) && Intrinsics.areEqual(this.openingAmount, realizedGainLossItemComponent.openingAmount) && Intrinsics.areEqual(this.closingAmount, realizedGainLossItemComponent.closingAmount) && Intrinsics.areEqual(this.realizedReturn, realizedGainLossItemComponent.realizedReturn) && Intrinsics.areEqual(this.realizedReturnPercentage, realizedGainLossItemComponent.realizedReturnPercentage);
            }

            public int hashCode() {
                int iHashCode = this.quantity.hashCode() * 31;
                Money money = this.averageOpenPrice;
                int iHashCode2 = (((iHashCode + (money == null ? 0 : money.hashCode())) * 31) + this.averageClosePrice.hashCode()) * 31;
                Money money2 = this.openingAmount;
                int iHashCode3 = (((iHashCode2 + (money2 == null ? 0 : money2.hashCode())) * 31) + this.closingAmount.hashCode()) * 31;
                Money money3 = this.realizedReturn;
                int iHashCode4 = (iHashCode3 + (money3 == null ? 0 : money3.hashCode())) * 31;
                BigDecimal bigDecimal = this.realizedReturnPercentage;
                return iHashCode4 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
            }

            public String toString() {
                return "RealizedGainLossItemComponent(quantity=" + this.quantity + ", averageOpenPrice=" + this.averageOpenPrice + ", averageClosePrice=" + this.averageClosePrice + ", openingAmount=" + this.openingAmount + ", closingAmount=" + this.closingAmount + ", realizedReturn=" + this.realizedReturn + ", realizedReturnPercentage=" + this.realizedReturnPercentage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.quantity);
                dest.writeParcelable(this.averageOpenPrice, flags);
                dest.writeParcelable(this.averageClosePrice, flags);
                dest.writeParcelable(this.openingAmount, flags);
                dest.writeParcelable(this.closingAmount, flags);
                dest.writeParcelable(this.realizedReturn, flags);
                dest.writeSerializable(this.realizedReturnPercentage);
            }

            public RealizedGainLossItemComponent(BigDecimal quantity, Money money, Money averageClosePrice, Money money2, Money closingAmount, Money money3, BigDecimal bigDecimal) {
                Intrinsics.checkNotNullParameter(quantity, "quantity");
                Intrinsics.checkNotNullParameter(averageClosePrice, "averageClosePrice");
                Intrinsics.checkNotNullParameter(closingAmount, "closingAmount");
                this.quantity = quantity;
                this.averageOpenPrice = money;
                this.averageClosePrice = averageClosePrice;
                this.openingAmount = money2;
                this.closingAmount = closingAmount;
                this.realizedReturn = money3;
                this.realizedReturnPercentage = bigDecimal;
            }

            public final BigDecimal getQuantity() {
                return this.quantity;
            }

            public final Money getAverageOpenPrice() {
                return this.averageOpenPrice;
            }

            public final Money getAverageClosePrice() {
                return this.averageClosePrice;
            }

            public final Money getOpeningAmount() {
                return this.openingAmount;
            }

            public final Money getClosingAmount() {
                return this.closingAmount;
            }

            public final Money getRealizedReturn() {
                return this.realizedReturn;
            }

            public final BigDecimal getRealizedReturnPercentage() {
                return this.realizedReturnPercentage;
            }
        }
    }

    /* compiled from: ProfitAndLossOrderDetails.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$Instrument;", "Landroid/os/Parcelable;", "id", "Ljava/util/UUID;", "type", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$Instrument$Type;", "symbol", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$Instrument$Type;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getType", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$Instrument$Type;", "getSymbol", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Type", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Instrument implements Parcelable {
        public static final Parcelable.Creator<Instrument> CREATOR = new Creator();
        private final UUID id;
        private final String symbol;
        private final Type type;

        /* compiled from: ProfitAndLossOrderDetails.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Instrument> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Instrument createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Instrument((UUID) parcel.readSerializable(), Type.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Instrument[] newArray(int i) {
                return new Instrument[i];
            }
        }

        public static /* synthetic */ Instrument copy$default(Instrument instrument, UUID uuid, Type type2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = instrument.id;
            }
            if ((i & 2) != 0) {
                type2 = instrument.type;
            }
            if ((i & 4) != 0) {
                str = instrument.symbol;
            }
            return instrument.copy(uuid, type2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public final Instrument copy(UUID id, Type type2, String symbol) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new Instrument(id, type2, symbol);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Instrument)) {
                return false;
            }
            Instrument instrument = (Instrument) other;
            return Intrinsics.areEqual(this.id, instrument.id) && this.type == instrument.type && Intrinsics.areEqual(this.symbol, instrument.symbol);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.type.hashCode()) * 31;
            String str = this.symbol;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Instrument(id=" + this.id + ", type=" + this.type + ", symbol=" + this.symbol + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
            dest.writeString(this.type.name());
            dest.writeString(this.symbol);
        }

        public Instrument(UUID id, Type type2, String str) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.id = id;
            this.type = type2;
            this.symbol = str;
        }

        public final UUID getId() {
            return this.id;
        }

        public final Type getType() {
            return this.type;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ProfitAndLossOrderDetails.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$Instrument$Type;", "", "<init>", "(Ljava/lang/String;I)V", "EQUITY", "INDEX", "CRYPTO", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Type {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type EQUITY = new Type("EQUITY", 0);
            public static final Type INDEX = new Type("INDEX", 1);
            public static final Type CRYPTO = new Type("CRYPTO", 2);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{EQUITY, INDEX, CRYPTO};
            }

            public static EnumEntries<Type> getEntries() {
                return $ENTRIES;
            }

            private Type(String str, int i) {
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: ProfitAndLossOrderDetails.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$AdapterModule;", "", "<init>", "()V", "provideAdapterFactory", "Lcom/squareup/moshi/JsonAdapter$Factory;", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AdapterModule {
        public static final AdapterModule INSTANCE = new AdapterModule();

        private AdapterModule() {
        }

        public final JsonAdapter.Factory provideAdapterFactory() {
            PolymorphicJsonAdapterFactory polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.m3154of(ProfitAndLossOrderDetails.class, "type").withSubtype(EquityOrderDetails.class, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY).withSubtype(OptionOrderDetails.class, AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION).withSubtype(CryptoOrderDetails.class, AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO);
            Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "withSubtype(...)");
            return polymorphicJsonAdapterFactoryWithSubtype;
        }
    }
}
