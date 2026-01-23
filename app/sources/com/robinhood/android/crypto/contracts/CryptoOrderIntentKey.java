package com.robinhood.android.crypto.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.shared.crypto.contracts.lib.TradeAction;
import com.robinhood.utils.Preconditions;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntentKeys.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u0003012B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JA\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020\fHÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "action", "Lcom/robinhood/shared/crypto/contracts/lib/TradeAction;", "orderType", "Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$OrderType;", "recurringAction", "Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$RecurringAction;", "source", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/shared/crypto/contracts/lib/TradeAction;Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$OrderType;Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$RecurringAction;Ljava/lang/String;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getAction", "()Lcom/robinhood/shared/crypto/contracts/lib/TradeAction;", "getOrderType", "()Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$OrderType;", "getRecurringAction", "()Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$RecurringAction;", "getSource", "()Ljava/lang/String;", "navigationType", "Lcom/robinhood/android/navigation/NavigationType;", "getNavigationType", "()Lcom/robinhood/android/navigation/NavigationType;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OrderType", "RecurringAction", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CryptoOrderIntentKey implements IntentKey, Parcelable {
    public static final String ENTRYPOINT_STAKING = "entrypoint_staking";
    private final TradeAction action;
    private final UUID currencyPairId;
    private final OrderType orderType;
    private final RecurringAction recurringAction;
    private final String source;
    public static final Parcelable.Creator<CryptoOrderIntentKey> CREATOR = new Creator();

    /* compiled from: IntentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<CryptoOrderIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoOrderIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoOrderIntentKey((UUID) parcel.readSerializable(), TradeAction.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : OrderType.valueOf(parcel.readString()), (RecurringAction) parcel.readParcelable(CryptoOrderIntentKey.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoOrderIntentKey[] newArray(int i) {
            return new CryptoOrderIntentKey[i];
        }
    }

    public static /* synthetic */ CryptoOrderIntentKey copy$default(CryptoOrderIntentKey cryptoOrderIntentKey, UUID uuid, TradeAction tradeAction, OrderType orderType, RecurringAction recurringAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoOrderIntentKey.currencyPairId;
        }
        if ((i & 2) != 0) {
            tradeAction = cryptoOrderIntentKey.action;
        }
        if ((i & 4) != 0) {
            orderType = cryptoOrderIntentKey.orderType;
        }
        if ((i & 8) != 0) {
            recurringAction = cryptoOrderIntentKey.recurringAction;
        }
        if ((i & 16) != 0) {
            str = cryptoOrderIntentKey.source;
        }
        String str2 = str;
        OrderType orderType2 = orderType;
        return cryptoOrderIntentKey.copy(uuid, tradeAction, orderType2, recurringAction, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component2, reason: from getter */
    public final TradeAction getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final OrderType getOrderType() {
        return this.orderType;
    }

    /* renamed from: component4, reason: from getter */
    public final RecurringAction getRecurringAction() {
        return this.recurringAction;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final CryptoOrderIntentKey copy(UUID currencyPairId, TradeAction action, OrderType orderType, RecurringAction recurringAction, String source) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(action, "action");
        return new CryptoOrderIntentKey(currencyPairId, action, orderType, recurringAction, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderIntentKey)) {
            return false;
        }
        CryptoOrderIntentKey cryptoOrderIntentKey = (CryptoOrderIntentKey) other;
        return Intrinsics.areEqual(this.currencyPairId, cryptoOrderIntentKey.currencyPairId) && this.action == cryptoOrderIntentKey.action && this.orderType == cryptoOrderIntentKey.orderType && Intrinsics.areEqual(this.recurringAction, cryptoOrderIntentKey.recurringAction) && Intrinsics.areEqual(this.source, cryptoOrderIntentKey.source);
    }

    public int hashCode() {
        int iHashCode = ((this.currencyPairId.hashCode() * 31) + this.action.hashCode()) * 31;
        OrderType orderType = this.orderType;
        int iHashCode2 = (iHashCode + (orderType == null ? 0 : orderType.hashCode())) * 31;
        RecurringAction recurringAction = this.recurringAction;
        int iHashCode3 = (iHashCode2 + (recurringAction == null ? 0 : recurringAction.hashCode())) * 31;
        String str = this.source;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CryptoOrderIntentKey(currencyPairId=" + this.currencyPairId + ", action=" + this.action + ", orderType=" + this.orderType + ", recurringAction=" + this.recurringAction + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.currencyPairId);
        dest.writeString(this.action.name());
        OrderType orderType = this.orderType;
        if (orderType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(orderType.name());
        }
        dest.writeParcelable(this.recurringAction, flags);
        dest.writeString(this.source);
    }

    public CryptoOrderIntentKey(UUID currencyPairId, TradeAction action, OrderType orderType, RecurringAction recurringAction, String str) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.currencyPairId = currencyPairId;
        this.action = action;
        this.orderType = orderType;
        this.recurringAction = recurringAction;
        this.source = str;
    }

    public /* synthetic */ CryptoOrderIntentKey(UUID uuid, TradeAction tradeAction, OrderType orderType, RecurringAction recurringAction, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, tradeAction, (i & 4) != 0 ? null : orderType, (i & 8) != 0 ? null : recurringAction, (i & 16) != 0 ? null : str);
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final TradeAction getAction() {
        return this.action;
    }

    public final OrderType getOrderType() {
        return this.orderType;
    }

    public final RecurringAction getRecurringAction() {
        return this.recurringAction;
    }

    public final String getSource() {
        return this.source;
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return NavigationType.PRESENT;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntentKeys.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$OrderType;", "", "queryParamString", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "STOP_LIMIT", "LIMIT", "MARKET", "STOP_LOSS", "RECURRING", "TAX_LOTS", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class OrderType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String queryParamString;
        public static final OrderType STOP_LIMIT = new OrderType("STOP_LIMIT", 0, "stop_limit");
        public static final OrderType LIMIT = new OrderType("LIMIT", 1, "limit");
        public static final OrderType MARKET = new OrderType("MARKET", 2, "market");
        public static final OrderType STOP_LOSS = new OrderType("STOP_LOSS", 3, "stop_loss");
        public static final OrderType RECURRING = new OrderType("RECURRING", 4, "recurring");
        public static final OrderType TAX_LOTS = new OrderType("TAX_LOTS", 5, "tax_lots");

        private static final /* synthetic */ OrderType[] $values() {
            return new OrderType[]{STOP_LIMIT, LIMIT, MARKET, STOP_LOSS, RECURRING, TAX_LOTS};
        }

        public static EnumEntries<OrderType> getEntries() {
            return $ENTRIES;
        }

        private OrderType(String str, int i, String str2) {
            this.queryParamString = str2;
        }

        static {
            OrderType[] orderTypeArr$values = $values();
            $VALUES = orderTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderTypeArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: IntentKeys.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$OrderType$Companion;", "", "<init>", "()V", "fromQueryParam", "Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$OrderType;", "queryParam", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                OrderType orderType = OrderType.TAX_LOTS;
                if (Intrinsics.areEqual(queryParam, orderType.queryParamString)) {
                    return orderType;
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin(queryParam);
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

    /* compiled from: IntentKeys.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$RecurringAction;", "Landroid/os/Parcelable;", "ShowOrderConfiguration", "Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$RecurringAction$ShowOrderConfiguration;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public interface RecurringAction extends Parcelable {

        /* compiled from: IntentKeys.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$RecurringAction$ShowOrderConfiguration;", "Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$RecurringAction;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "<init>", "(Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;)V", "getConfiguration", "()Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowOrderConfiguration implements RecurringAction {
            public static final Parcelable.Creator<ShowOrderConfiguration> CREATOR = new Creator();
            private final RecurringOrderConfiguration configuration;

            /* compiled from: IntentKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ShowOrderConfiguration> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShowOrderConfiguration createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ShowOrderConfiguration((RecurringOrderConfiguration) parcel.readParcelable(ShowOrderConfiguration.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShowOrderConfiguration[] newArray(int i) {
                    return new ShowOrderConfiguration[i];
                }
            }

            public static /* synthetic */ ShowOrderConfiguration copy$default(ShowOrderConfiguration showOrderConfiguration, RecurringOrderConfiguration recurringOrderConfiguration, int i, Object obj) {
                if ((i & 1) != 0) {
                    recurringOrderConfiguration = showOrderConfiguration.configuration;
                }
                return showOrderConfiguration.copy(recurringOrderConfiguration);
            }

            /* renamed from: component1, reason: from getter */
            public final RecurringOrderConfiguration getConfiguration() {
                return this.configuration;
            }

            public final ShowOrderConfiguration copy(RecurringOrderConfiguration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                return new ShowOrderConfiguration(configuration);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowOrderConfiguration) && Intrinsics.areEqual(this.configuration, ((ShowOrderConfiguration) other).configuration);
            }

            public int hashCode() {
                return this.configuration.hashCode();
            }

            public String toString() {
                return "ShowOrderConfiguration(configuration=" + this.configuration + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.configuration, flags);
            }

            public ShowOrderConfiguration(RecurringOrderConfiguration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.configuration = configuration;
            }

            public final RecurringOrderConfiguration getConfiguration() {
                return this.configuration;
            }
        }
    }
}
