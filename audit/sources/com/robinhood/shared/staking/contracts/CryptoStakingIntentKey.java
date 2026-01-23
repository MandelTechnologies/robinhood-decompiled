package com.robinhood.shared.staking.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.utils.Preconditions;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingIntentKey.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001,BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020!HÖ\u0001J\t\u0010&\u001a\u00020\u000bHÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006-"}, m3636d2 = {"Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "orderType", "Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey$OrderType;", "showIntroScreen", "", "receiptUuid", "prefilledAssetAmount", "", "entryPointIdentifier", "<init>", "(Ljava/util/UUID;Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey$OrderType;ZLjava/util/UUID;Ljava/lang/String;Ljava/lang/String;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getOrderType", "()Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey$OrderType;", "getShowIntroScreen", "()Z", "getReceiptUuid", "getPrefilledAssetAmount", "()Ljava/lang/String;", "getEntryPointIdentifier", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OrderType", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoStakingIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<CryptoStakingIntentKey> CREATOR = new Creator();
    private final UUID currencyPairId;
    private final String entryPointIdentifier;
    private final OrderType orderType;
    private final String prefilledAssetAmount;
    private final UUID receiptUuid;
    private final boolean showIntroScreen;

    /* compiled from: CryptoStakingIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CryptoStakingIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoStakingIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoStakingIntentKey((UUID) parcel.readSerializable(), OrderType.valueOf(parcel.readString()), parcel.readInt() != 0, (UUID) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoStakingIntentKey[] newArray(int i) {
            return new CryptoStakingIntentKey[i];
        }
    }

    public static /* synthetic */ CryptoStakingIntentKey copy$default(CryptoStakingIntentKey cryptoStakingIntentKey, UUID uuid, OrderType orderType, boolean z, UUID uuid2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoStakingIntentKey.currencyPairId;
        }
        if ((i & 2) != 0) {
            orderType = cryptoStakingIntentKey.orderType;
        }
        if ((i & 4) != 0) {
            z = cryptoStakingIntentKey.showIntroScreen;
        }
        if ((i & 8) != 0) {
            uuid2 = cryptoStakingIntentKey.receiptUuid;
        }
        if ((i & 16) != 0) {
            str = cryptoStakingIntentKey.prefilledAssetAmount;
        }
        if ((i & 32) != 0) {
            str2 = cryptoStakingIntentKey.entryPointIdentifier;
        }
        String str3 = str;
        String str4 = str2;
        return cryptoStakingIntentKey.copy(uuid, orderType, z, uuid2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderType getOrderType() {
        return this.orderType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowIntroScreen() {
        return this.showIntroScreen;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getReceiptUuid() {
        return this.receiptUuid;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPrefilledAssetAmount() {
        return this.prefilledAssetAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    public final CryptoStakingIntentKey copy(UUID currencyPairId, OrderType orderType, boolean showIntroScreen, UUID receiptUuid, String prefilledAssetAmount, String entryPointIdentifier) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return new CryptoStakingIntentKey(currencyPairId, orderType, showIntroScreen, receiptUuid, prefilledAssetAmount, entryPointIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoStakingIntentKey)) {
            return false;
        }
        CryptoStakingIntentKey cryptoStakingIntentKey = (CryptoStakingIntentKey) other;
        return Intrinsics.areEqual(this.currencyPairId, cryptoStakingIntentKey.currencyPairId) && this.orderType == cryptoStakingIntentKey.orderType && this.showIntroScreen == cryptoStakingIntentKey.showIntroScreen && Intrinsics.areEqual(this.receiptUuid, cryptoStakingIntentKey.receiptUuid) && Intrinsics.areEqual(this.prefilledAssetAmount, cryptoStakingIntentKey.prefilledAssetAmount) && Intrinsics.areEqual(this.entryPointIdentifier, cryptoStakingIntentKey.entryPointIdentifier);
    }

    public int hashCode() {
        int iHashCode = ((((this.currencyPairId.hashCode() * 31) + this.orderType.hashCode()) * 31) + Boolean.hashCode(this.showIntroScreen)) * 31;
        UUID uuid = this.receiptUuid;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str = this.prefilledAssetAmount;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entryPointIdentifier;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CryptoStakingIntentKey(currencyPairId=" + this.currencyPairId + ", orderType=" + this.orderType + ", showIntroScreen=" + this.showIntroScreen + ", receiptUuid=" + this.receiptUuid + ", prefilledAssetAmount=" + this.prefilledAssetAmount + ", entryPointIdentifier=" + this.entryPointIdentifier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.currencyPairId);
        dest.writeString(this.orderType.name());
        dest.writeInt(this.showIntroScreen ? 1 : 0);
        dest.writeSerializable(this.receiptUuid);
        dest.writeString(this.prefilledAssetAmount);
        dest.writeString(this.entryPointIdentifier);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public CryptoStakingIntentKey(UUID currencyPairId, OrderType orderType, boolean z, UUID uuid, String str, String str2) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.currencyPairId = currencyPairId;
        this.orderType = orderType;
        this.showIntroScreen = z;
        this.receiptUuid = uuid;
        this.prefilledAssetAmount = str;
        this.entryPointIdentifier = str2;
    }

    public /* synthetic */ CryptoStakingIntentKey(UUID uuid, OrderType orderType, boolean z, UUID uuid2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, orderType, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : uuid2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2);
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final OrderType getOrderType() {
        return this.orderType;
    }

    public final boolean getShowIntroScreen() {
        return this.showIntroScreen;
    }

    public final UUID getReceiptUuid() {
        return this.receiptUuid;
    }

    public final String getPrefilledAssetAmount() {
        return this.prefilledAssetAmount;
    }

    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoStakingIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey$OrderType;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "DEPOSIT", "WITHDRAW", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderType DEPOSIT = new OrderType("DEPOSIT", 0, CryptoCostBasisDetailsListDuxo.SOURCE_TYPE);
        public static final OrderType WITHDRAW = new OrderType("WITHDRAW", 1, "withdraw");
        private final String serverValue;

        private static final /* synthetic */ OrderType[] $values() {
            return new OrderType[]{DEPOSIT, WITHDRAW};
        }

        public static EnumEntries<OrderType> getEntries() {
            return $ENTRIES;
        }

        private OrderType(String str, int i, String str2) {
            this.serverValue = str2;
        }

        public final String getServerValue() {
            return this.serverValue;
        }

        static {
            OrderType[] orderTypeArr$values = $values();
            $VALUES = orderTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderTypeArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: CryptoStakingIntentKey.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey$OrderType$Companion;", "", "<init>", "()V", "fromQueryParam", "Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey$OrderType;", "queryParam", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final OrderType fromQueryParam(String queryParam) {
                if (queryParam == null) {
                    return null;
                }
                OrderType orderType = OrderType.DEPOSIT;
                if (Intrinsics.areEqual(queryParam, orderType.getServerValue())) {
                    return orderType;
                }
                OrderType orderType2 = OrderType.WITHDRAW;
                if (Intrinsics.areEqual(queryParam, orderType2.getServerValue())) {
                    return orderType2;
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this);
                throw new ExceptionsH();
            }
        }

        public static OrderType valueOf(String str) {
            return (OrderType) Enum.valueOf(OrderType.class, str);
        }

        public static OrderType[] values() {
            return (OrderType[]) $VALUES.clone();
        }
    }
}
