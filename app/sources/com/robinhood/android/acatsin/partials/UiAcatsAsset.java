package com.robinhood.android.acatsin.partials;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: UiAcatsAsset.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "Landroid/os/Parcelable;", "<init>", "()V", "convertToApiModel", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset;", "CashAsset", "EquityAsset", "OptionAsset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class UiAcatsAsset implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ UiAcatsAsset(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract ApiAcatsTransfer.Asset convertToApiModel();

    private UiAcatsAsset() {
    }

    /* compiled from: UiAcatsAsset.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset;", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "Landroid/os/Parcelable;", "amount", "Lcom/robinhood/models/util/Money;", "cashType", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset$CashType;", "isMarginSupported", "", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset$CashType;Z)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getCashType", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset$CashType;", "()Z", "convertToApiModel", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CashType", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CashAsset extends UiAcatsAsset implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<CashAsset> CREATOR = new Creator();
        private final Money amount;
        private final CashType cashType;
        private final boolean isMarginSupported;

        /* compiled from: UiAcatsAsset.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CashAsset> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CashAsset createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashAsset((Money) parcel.readParcelable(CashAsset.class.getClassLoader()), CashType.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CashAsset[] newArray(int i) {
                return new CashAsset[i];
            }
        }

        /* compiled from: UiAcatsAsset.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CashType.values().length];
                try {
                    iArr[CashType.CASH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CashType.MARGIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ CashAsset copy$default(CashAsset cashAsset, Money money, CashType cashType, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                money = cashAsset.amount;
            }
            if ((i & 2) != 0) {
                cashType = cashAsset.cashType;
            }
            if ((i & 4) != 0) {
                z = cashAsset.isMarginSupported;
            }
            return cashAsset.copy(money, cashType, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final CashType getCashType() {
            return this.cashType;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsMarginSupported() {
            return this.isMarginSupported;
        }

        public final CashAsset copy(Money amount, CashType cashType, boolean isMarginSupported) {
            Intrinsics.checkNotNullParameter(cashType, "cashType");
            return new CashAsset(amount, cashType, isMarginSupported);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CashAsset)) {
                return false;
            }
            CashAsset cashAsset = (CashAsset) other;
            return Intrinsics.areEqual(this.amount, cashAsset.amount) && this.cashType == cashAsset.cashType && this.isMarginSupported == cashAsset.isMarginSupported;
        }

        public int hashCode() {
            Money money = this.amount;
            return ((((money == null ? 0 : money.hashCode()) * 31) + this.cashType.hashCode()) * 31) + Boolean.hashCode(this.isMarginSupported);
        }

        public String toString() {
            return "CashAsset(amount=" + this.amount + ", cashType=" + this.cashType + ", isMarginSupported=" + this.isMarginSupported + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            dest.writeString(this.cashType.name());
            dest.writeInt(this.isMarginSupported ? 1 : 0);
        }

        public final Money getAmount() {
            return this.amount;
        }

        public final CashType getCashType() {
            return this.cashType;
        }

        public final boolean isMarginSupported() {
            return this.isMarginSupported;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CashAsset(Money money, CashType cashType, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(cashType, "cashType");
            this.amount = money;
            this.cashType = cashType;
            this.isMarginSupported = z;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UiAcatsAsset.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$CashAsset$CashType;", "", "<init>", "(Ljava/lang/String;I)V", "CASH", "MARGIN", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class CashType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ CashType[] $VALUES;
            public static final CashType CASH = new CashType("CASH", 0);
            public static final CashType MARGIN = new CashType("MARGIN", 1);

            private static final /* synthetic */ CashType[] $values() {
                return new CashType[]{CASH, MARGIN};
            }

            public static EnumEntries<CashType> getEntries() {
                return $ENTRIES;
            }

            private CashType(String str, int i) {
            }

            static {
                CashType[] cashTypeArr$values = $values();
                $VALUES = cashTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(cashTypeArr$values);
            }

            public static CashType valueOf(String str) {
                return (CashType) Enum.valueOf(CashType.class, str);
            }

            public static CashType[] values() {
                return (CashType[]) $VALUES.clone();
            }
        }

        @Override // com.robinhood.android.acatsin.partials.UiAcatsAsset
        public ApiAcatsTransfer.Asset convertToApiModel() {
            ApiAcatsTransfer.Asset.Direction direction;
            ApiAcatsTransfer.Asset.AssetType assetType = ApiAcatsTransfer.Asset.AssetType.CASH;
            int i = WhenMappings.$EnumSwitchMapping$0[this.cashType.ordinal()];
            if (i == 1) {
                direction = ApiAcatsTransfer.Asset.Direction.LONG;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                direction = ApiAcatsTransfer.Asset.Direction.SHORT;
            }
            ApiAcatsTransfer.Asset.Direction direction2 = direction;
            Money money = this.amount;
            return new ApiAcatsTransfer.Asset(assetType, null, direction2, money != null ? money.getDecimalValue() : null, null, null, 32, null);
        }
    }

    /* compiled from: UiAcatsAsset.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001f\u001a\u00020 H\u0016J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003JN\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\tJ\u0013\u0010*\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\tHÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001e¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "symbol", "", "name", "numShares", "", "direction", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "borrowFee", "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;Ljava/math/BigDecimal;)V", "getInstrumentId", "()Ljava/util/UUID;", "getSymbol", "()Ljava/lang/String;", "getName", "getNumShares", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDirection", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "getBorrowFee", "()Ljava/math/BigDecimal;", "isShortPosition", "", "()Z", "convertToApiModel", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;Ljava/math/BigDecimal;)Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EquityAsset extends UiAcatsAsset implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<EquityAsset> CREATOR = new Creator();
        private final BigDecimal borrowFee;
        private final ApiAcatsTransfer.Asset.Direction direction;
        private final UUID instrumentId;
        private final String name;
        private final Integer numShares;
        private final String symbol;

        /* compiled from: UiAcatsAsset.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<EquityAsset> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EquityAsset createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EquityAsset((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), ApiAcatsTransfer.Asset.Direction.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EquityAsset[] newArray(int i) {
                return new EquityAsset[i];
            }
        }

        public static /* synthetic */ EquityAsset copy$default(EquityAsset equityAsset, UUID uuid, String str, String str2, Integer num, ApiAcatsTransfer.Asset.Direction direction, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = equityAsset.instrumentId;
            }
            if ((i & 2) != 0) {
                str = equityAsset.symbol;
            }
            if ((i & 4) != 0) {
                str2 = equityAsset.name;
            }
            if ((i & 8) != 0) {
                num = equityAsset.numShares;
            }
            if ((i & 16) != 0) {
                direction = equityAsset.direction;
            }
            if ((i & 32) != 0) {
                bigDecimal = equityAsset.borrowFee;
            }
            ApiAcatsTransfer.Asset.Direction direction2 = direction;
            BigDecimal bigDecimal2 = bigDecimal;
            return equityAsset.copy(uuid, str, str2, num, direction2, bigDecimal2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getNumShares() {
            return this.numShares;
        }

        /* renamed from: component5, reason: from getter */
        public final ApiAcatsTransfer.Asset.Direction getDirection() {
            return this.direction;
        }

        /* renamed from: component6, reason: from getter */
        public final BigDecimal getBorrowFee() {
            return this.borrowFee;
        }

        public final EquityAsset copy(UUID instrumentId, String symbol, String name, Integer numShares, ApiAcatsTransfer.Asset.Direction direction, BigDecimal borrowFee) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(direction, "direction");
            return new EquityAsset(instrumentId, symbol, name, numShares, direction, borrowFee);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EquityAsset)) {
                return false;
            }
            EquityAsset equityAsset = (EquityAsset) other;
            return Intrinsics.areEqual(this.instrumentId, equityAsset.instrumentId) && Intrinsics.areEqual(this.symbol, equityAsset.symbol) && Intrinsics.areEqual(this.name, equityAsset.name) && Intrinsics.areEqual(this.numShares, equityAsset.numShares) && this.direction == equityAsset.direction && Intrinsics.areEqual(this.borrowFee, equityAsset.borrowFee);
        }

        public int hashCode() {
            int iHashCode = ((((this.instrumentId.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.name.hashCode()) * 31;
            Integer num = this.numShares;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.direction.hashCode()) * 31;
            BigDecimal bigDecimal = this.borrowFee;
            return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
        }

        public String toString() {
            return "EquityAsset(instrumentId=" + this.instrumentId + ", symbol=" + this.symbol + ", name=" + this.name + ", numShares=" + this.numShares + ", direction=" + this.direction + ", borrowFee=" + this.borrowFee + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.symbol);
            dest.writeString(this.name);
            Integer num = this.numShares;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
            dest.writeString(this.direction.name());
            dest.writeSerializable(this.borrowFee);
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getName() {
            return this.name;
        }

        public final Integer getNumShares() {
            return this.numShares;
        }

        public /* synthetic */ EquityAsset(UUID uuid, String str, String str2, Integer num, ApiAcatsTransfer.Asset.Direction direction, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, str, str2, num, (i & 16) != 0 ? ApiAcatsTransfer.Asset.Direction.LONG : direction, (i & 32) != 0 ? null : bigDecimal);
        }

        public final ApiAcatsTransfer.Asset.Direction getDirection() {
            return this.direction;
        }

        public final BigDecimal getBorrowFee() {
            return this.borrowFee;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EquityAsset(UUID instrumentId, String symbol, String name, Integer num, ApiAcatsTransfer.Asset.Direction direction, BigDecimal bigDecimal) {
            super(null);
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.instrumentId = instrumentId;
            this.symbol = symbol;
            this.name = name;
            this.numShares = num;
            this.direction = direction;
            this.borrowFee = bigDecimal;
        }

        public final boolean isShortPosition() {
            return this.direction == ApiAcatsTransfer.Asset.Direction.SHORT;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        @Override // com.robinhood.android.acatsin.partials.UiAcatsAsset
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ApiAcatsTransfer.Asset convertToApiModel() {
            BigDecimal bigDecimalAbs;
            ApiAcatsTransfer.Asset.AssetType assetType = ApiAcatsTransfer.Asset.AssetType.EQUITY;
            UUID uuid = this.instrumentId;
            ApiAcatsTransfer.Asset.Direction direction = this.direction;
            if (this.numShares != null) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(r4.intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                bigDecimalAbs = bigDecimalValueOf != null ? bigDecimalValueOf.abs() : null;
            }
            return new ApiAcatsTransfer.Asset(assetType, uuid, direction, bigDecimalAbs, null, this.borrowFee);
        }
    }

    /* compiled from: UiAcatsAsset.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-Jb\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b0\u0010#J\u0010\u00101\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b1\u0010\u001eJ\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b8\u0010 R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b9\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010+R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010-¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "Landroid/os/Parcelable;", "Ljava/util/UUID;", "optionId", "instrumentId", "", "symbol", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "direction", "", "numContracts", "Lcom/robinhood/models/db/OptionContractType;", "optionType", "Lcom/robinhood/models/util/Money;", "strikePrice", "j$/time/LocalDate", "expirationDate", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionContractType;Lcom/robinhood/models/util/Money;Lj$/time/LocalDate;)V", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset;", "convertToApiModel", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/UUID;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "component5", "()Ljava/lang/Integer;", "component6", "()Lcom/robinhood/models/db/OptionContractType;", "component7", "()Lcom/robinhood/models/util/Money;", "component8", "()Lj$/time/LocalDate;", "copy", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;Ljava/lang/Integer;Lcom/robinhood/models/db/OptionContractType;Lcom/robinhood/models/util/Money;Lj$/time/LocalDate;)Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getOptionId", "getInstrumentId", "Ljava/lang/String;", "getSymbol", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "getDirection", "Ljava/lang/Integer;", "getNumContracts", "Lcom/robinhood/models/db/OptionContractType;", "getOptionType", "Lcom/robinhood/models/util/Money;", "getStrikePrice", "Lj$/time/LocalDate;", "getExpirationDate", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionAsset extends UiAcatsAsset implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<OptionAsset> CREATOR = new Creator();
        private final ApiAcatsTransfer.Asset.Direction direction;
        private final LocalDate expirationDate;
        private final UUID instrumentId;
        private final Integer numContracts;
        private final UUID optionId;
        private final OptionContractType optionType;
        private final Money strikePrice;
        private final String symbol;

        /* compiled from: UiAcatsAsset.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<OptionAsset> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionAsset createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionAsset((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString(), ApiAcatsTransfer.Asset.Direction.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), OptionContractType.valueOf(parcel.readString()), (Money) parcel.readParcelable(OptionAsset.class.getClassLoader()), (LocalDate) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OptionAsset[] newArray(int i) {
                return new OptionAsset[i];
            }
        }

        public static /* synthetic */ OptionAsset copy$default(OptionAsset optionAsset, UUID uuid, UUID uuid2, String str, ApiAcatsTransfer.Asset.Direction direction, Integer num, OptionContractType optionContractType, Money money, LocalDate localDate, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = optionAsset.optionId;
            }
            if ((i & 2) != 0) {
                uuid2 = optionAsset.instrumentId;
            }
            if ((i & 4) != 0) {
                str = optionAsset.symbol;
            }
            if ((i & 8) != 0) {
                direction = optionAsset.direction;
            }
            if ((i & 16) != 0) {
                num = optionAsset.numContracts;
            }
            if ((i & 32) != 0) {
                optionContractType = optionAsset.optionType;
            }
            if ((i & 64) != 0) {
                money = optionAsset.strikePrice;
            }
            if ((i & 128) != 0) {
                localDate = optionAsset.expirationDate;
            }
            Money money2 = money;
            LocalDate localDate2 = localDate;
            Integer num2 = num;
            OptionContractType optionContractType2 = optionContractType;
            return optionAsset.copy(uuid, uuid2, str, direction, num2, optionContractType2, money2, localDate2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getOptionId() {
            return this.optionId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component4, reason: from getter */
        public final ApiAcatsTransfer.Asset.Direction getDirection() {
            return this.direction;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getNumContracts() {
            return this.numContracts;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionContractType getOptionType() {
            return this.optionType;
        }

        /* renamed from: component7, reason: from getter */
        public final Money getStrikePrice() {
            return this.strikePrice;
        }

        /* renamed from: component8, reason: from getter */
        public final LocalDate getExpirationDate() {
            return this.expirationDate;
        }

        public final OptionAsset copy(UUID optionId, UUID instrumentId, String symbol, ApiAcatsTransfer.Asset.Direction direction, Integer numContracts, OptionContractType optionType, Money strikePrice, LocalDate expirationDate) {
            Intrinsics.checkNotNullParameter(optionId, "optionId");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(optionType, "optionType");
            Intrinsics.checkNotNullParameter(strikePrice, "strikePrice");
            Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
            return new OptionAsset(optionId, instrumentId, symbol, direction, numContracts, optionType, strikePrice, expirationDate);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionAsset)) {
                return false;
            }
            OptionAsset optionAsset = (OptionAsset) other;
            return Intrinsics.areEqual(this.optionId, optionAsset.optionId) && Intrinsics.areEqual(this.instrumentId, optionAsset.instrumentId) && Intrinsics.areEqual(this.symbol, optionAsset.symbol) && this.direction == optionAsset.direction && Intrinsics.areEqual(this.numContracts, optionAsset.numContracts) && this.optionType == optionAsset.optionType && Intrinsics.areEqual(this.strikePrice, optionAsset.strikePrice) && Intrinsics.areEqual(this.expirationDate, optionAsset.expirationDate);
        }

        public int hashCode() {
            int iHashCode = ((((((this.optionId.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.direction.hashCode()) * 31;
            Integer num = this.numContracts;
            return ((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.optionType.hashCode()) * 31) + this.strikePrice.hashCode()) * 31) + this.expirationDate.hashCode();
        }

        public String toString() {
            return "OptionAsset(optionId=" + this.optionId + ", instrumentId=" + this.instrumentId + ", symbol=" + this.symbol + ", direction=" + this.direction + ", numContracts=" + this.numContracts + ", optionType=" + this.optionType + ", strikePrice=" + this.strikePrice + ", expirationDate=" + this.expirationDate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.optionId);
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.symbol);
            dest.writeString(this.direction.name());
            Integer num = this.numContracts;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
            dest.writeString(this.optionType.name());
            dest.writeParcelable(this.strikePrice, flags);
            dest.writeSerializable(this.expirationDate);
        }

        public final UUID getOptionId() {
            return this.optionId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final ApiAcatsTransfer.Asset.Direction getDirection() {
            return this.direction;
        }

        public final Integer getNumContracts() {
            return this.numContracts;
        }

        public final OptionContractType getOptionType() {
            return this.optionType;
        }

        public final Money getStrikePrice() {
            return this.strikePrice;
        }

        public final LocalDate getExpirationDate() {
            return this.expirationDate;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionAsset(UUID optionId, UUID instrumentId, String symbol, ApiAcatsTransfer.Asset.Direction direction, Integer num, OptionContractType optionType, Money strikePrice, LocalDate expirationDate) {
            super(null);
            Intrinsics.checkNotNullParameter(optionId, "optionId");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(optionType, "optionType");
            Intrinsics.checkNotNullParameter(strikePrice, "strikePrice");
            Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
            this.optionId = optionId;
            this.instrumentId = instrumentId;
            this.symbol = symbol;
            this.direction = direction;
            this.numContracts = num;
            this.optionType = optionType;
            this.strikePrice = strikePrice;
            this.expirationDate = expirationDate;
        }

        @Override // com.robinhood.android.acatsin.partials.UiAcatsAsset
        public ApiAcatsTransfer.Asset convertToApiModel() {
            BigDecimal bigDecimalValueOf;
            ApiAcatsTransfer.Asset.AssetType assetType = ApiAcatsTransfer.Asset.AssetType.OPTION;
            UUID uuid = this.optionId;
            ApiAcatsTransfer.Asset.Direction direction = this.direction;
            if (this.numContracts != null) {
                bigDecimalValueOf = BigDecimal.valueOf(r4.intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            } else {
                bigDecimalValueOf = null;
            }
            return new ApiAcatsTransfer.Asset(assetType, uuid, direction, bigDecimalValueOf, null, null, 32, null);
        }
    }
}
