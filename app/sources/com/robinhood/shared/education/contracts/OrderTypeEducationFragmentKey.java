package com.robinhood.shared.education.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeEducationFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "Landroid/os/Parcelable;", "config", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "<init>", "(Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;)V", "getConfig", "()Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "NavIconType", "OrderTypeEducationConfiguration", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class OrderTypeEducationFragmentKey implements TabFragmentKey, Parcelable {
    public static final Parcelable.Creator<OrderTypeEducationFragmentKey> CREATOR = new Creator();
    private final OrderTypeEducationConfiguration config;

    /* compiled from: OrderTypeEducationFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<OrderTypeEducationFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderTypeEducationFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderTypeEducationFragmentKey((OrderTypeEducationConfiguration) parcel.readParcelable(OrderTypeEducationFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderTypeEducationFragmentKey[] newArray(int i) {
            return new OrderTypeEducationFragmentKey[i];
        }
    }

    public static /* synthetic */ OrderTypeEducationFragmentKey copy$default(OrderTypeEducationFragmentKey orderTypeEducationFragmentKey, OrderTypeEducationConfiguration orderTypeEducationConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            orderTypeEducationConfiguration = orderTypeEducationFragmentKey.config;
        }
        return orderTypeEducationFragmentKey.copy(orderTypeEducationConfiguration);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderTypeEducationConfiguration getConfig() {
        return this.config;
    }

    public final OrderTypeEducationFragmentKey copy(OrderTypeEducationConfiguration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new OrderTypeEducationFragmentKey(config);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderTypeEducationFragmentKey) && Intrinsics.areEqual(this.config, ((OrderTypeEducationFragmentKey) other).config);
    }

    public int hashCode() {
        return this.config.hashCode();
    }

    public String toString() {
        return "OrderTypeEducationFragmentKey(config=" + this.config + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.config, flags);
    }

    public OrderTypeEducationFragmentKey(OrderTypeEducationConfiguration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    public final OrderTypeEducationConfiguration getConfig() {
        return this.config;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.BROWSE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrderTypeEducationFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$NavIconType;", "", "<init>", "(Ljava/lang/String;I)V", "BACK_BUTTON", "CLOSE_BUTTON", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class NavIconType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NavIconType[] $VALUES;
        public static final NavIconType BACK_BUTTON = new NavIconType("BACK_BUTTON", 0);
        public static final NavIconType CLOSE_BUTTON = new NavIconType("CLOSE_BUTTON", 1);

        private static final /* synthetic */ NavIconType[] $values() {
            return new NavIconType[]{BACK_BUTTON, CLOSE_BUTTON};
        }

        public static EnumEntries<NavIconType> getEntries() {
            return $ENTRIES;
        }

        private NavIconType(String str, int i) {
        }

        static {
            NavIconType[] navIconTypeArr$values = $values();
            $VALUES = navIconTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(navIconTypeArr$values);
        }

        public static NavIconType valueOf(String str) {
            return (NavIconType) Enum.valueOf(NavIconType.class, str);
        }

        public static NavIconType[] values() {
            return (NavIconType[]) $VALUES.clone();
        }
    }

    /* compiled from: OrderTypeEducationFragmentKey.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0016B1\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "showDismissBtn", "", "showContinueBtn", "toolbarNavIconType", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$NavIconType;", "<init>", "(Ljava/util/UUID;ZZLcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$NavIconType;)V", "getInstrumentId", "()Ljava/util/UUID;", "getShowDismissBtn", "()Z", "getShowContinueBtn", "getToolbarNavIconType", "()Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$NavIconType;", "EquityOrder", "Recurring", "CryptoOrder", "PerpetualContract", "TokenizedStocks", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration$CryptoOrder;", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration$EquityOrder;", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration$PerpetualContract;", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration$Recurring;", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration$TokenizedStocks;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class OrderTypeEducationConfiguration implements Parcelable {
        private final UUID instrumentId;
        private final boolean showContinueBtn;
        private final boolean showDismissBtn;
        private final NavIconType toolbarNavIconType;

        public /* synthetic */ OrderTypeEducationConfiguration(UUID uuid, boolean z, boolean z2, NavIconType navIconType, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, z, z2, navIconType);
        }

        private OrderTypeEducationConfiguration(UUID uuid, boolean z, boolean z2, NavIconType navIconType) {
            this.instrumentId = uuid;
            this.showDismissBtn = z;
            this.showContinueBtn = z2;
            this.toolbarNavIconType = navIconType;
        }

        public UUID getInstrumentId() {
            return this.instrumentId;
        }

        public boolean getShowDismissBtn() {
            return this.showDismissBtn;
        }

        public boolean getShowContinueBtn() {
            return this.showContinueBtn;
        }

        public /* synthetic */ OrderTypeEducationConfiguration(UUID uuid, boolean z, boolean z2, NavIconType navIconType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? NavIconType.BACK_BUTTON : navIconType, null);
        }

        public NavIconType getToolbarNavIconType() {
            return this.toolbarNavIconType;
        }

        /* compiled from: OrderTypeEducationFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration$EquityOrder;", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "directOrder", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "taxLots", "", "instrumentId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;Lcom/robinhood/models/db/EquityOrderSide;ZLjava/util/UUID;)V", "getDirectOrder", "()Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getTaxLots", "()Z", "getInstrumentId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EquityOrder extends OrderTypeEducationConfiguration {
            public static final Parcelable.Creator<EquityOrder> CREATOR = new Creator();
            private final DirectOrder directOrder;
            private final UUID instrumentId;
            private final EquityOrderSide side;
            private final boolean taxLots;

            /* compiled from: OrderTypeEducationFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<EquityOrder> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EquityOrder createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new EquityOrder((DirectOrder) parcel.readParcelable(EquityOrder.class.getClassLoader()), EquityOrderSide.valueOf(parcel.readString()), parcel.readInt() != 0, (UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EquityOrder[] newArray(int i) {
                    return new EquityOrder[i];
                }
            }

            public static /* synthetic */ EquityOrder copy$default(EquityOrder equityOrder, DirectOrder directOrder, EquityOrderSide equityOrderSide, boolean z, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    directOrder = equityOrder.directOrder;
                }
                if ((i & 2) != 0) {
                    equityOrderSide = equityOrder.side;
                }
                if ((i & 4) != 0) {
                    z = equityOrder.taxLots;
                }
                if ((i & 8) != 0) {
                    uuid = equityOrder.instrumentId;
                }
                return equityOrder.copy(directOrder, equityOrderSide, z, uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final DirectOrder getDirectOrder() {
                return this.directOrder;
            }

            /* renamed from: component2, reason: from getter */
            public final EquityOrderSide getSide() {
                return this.side;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getTaxLots() {
                return this.taxLots;
            }

            /* renamed from: component4, reason: from getter */
            public final UUID getInstrumentId() {
                return this.instrumentId;
            }

            public final EquityOrder copy(DirectOrder directOrder, EquityOrderSide side, boolean taxLots, UUID instrumentId) {
                Intrinsics.checkNotNullParameter(directOrder, "directOrder");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                return new EquityOrder(directOrder, side, taxLots, instrumentId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EquityOrder)) {
                    return false;
                }
                EquityOrder equityOrder = (EquityOrder) other;
                return Intrinsics.areEqual(this.directOrder, equityOrder.directOrder) && this.side == equityOrder.side && this.taxLots == equityOrder.taxLots && Intrinsics.areEqual(this.instrumentId, equityOrder.instrumentId);
            }

            public int hashCode() {
                return (((((this.directOrder.hashCode() * 31) + this.side.hashCode()) * 31) + Boolean.hashCode(this.taxLots)) * 31) + this.instrumentId.hashCode();
            }

            public String toString() {
                return "EquityOrder(directOrder=" + this.directOrder + ", side=" + this.side + ", taxLots=" + this.taxLots + ", instrumentId=" + this.instrumentId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.directOrder, flags);
                dest.writeString(this.side.name());
                dest.writeInt(this.taxLots ? 1 : 0);
                dest.writeSerializable(this.instrumentId);
            }

            public final DirectOrder getDirectOrder() {
                return this.directOrder;
            }

            public final EquityOrderSide getSide() {
                return this.side;
            }

            public final boolean getTaxLots() {
                return this.taxLots;
            }

            @Override // com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration
            public UUID getInstrumentId() {
                return this.instrumentId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EquityOrder(DirectOrder directOrder, EquityOrderSide side, boolean z, UUID instrumentId) {
                super(instrumentId, false, false, null, 14, null);
                Intrinsics.checkNotNullParameter(directOrder, "directOrder");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                this.directOrder = directOrder;
                this.side = side;
                this.taxLots = z;
                this.instrumentId = instrumentId;
            }
        }

        /* compiled from: OrderTypeEducationFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration$Recurring;", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "instrumentId", "Ljava/util/UUID;", "showDismissBtn", "", "isFromHook", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "<init>", "(Ljava/util/UUID;ZZLcom/robinhood/recurring/models/db/InvestmentTarget;)V", "getInstrumentId", "()Ljava/util/UUID;", "getShowDismissBtn", "()Z", "getInvestmentTarget", "()Lcom/robinhood/recurring/models/db/InvestmentTarget;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Recurring extends OrderTypeEducationConfiguration {
            public static final Parcelable.Creator<Recurring> CREATOR = new Creator();
            private final UUID instrumentId;
            private final InvestmentTarget investmentTarget;
            private final boolean isFromHook;
            private final boolean showDismissBtn;

            /* compiled from: OrderTypeEducationFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Recurring> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Recurring createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Recurring((UUID) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, (InvestmentTarget) parcel.readParcelable(Recurring.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Recurring[] newArray(int i) {
                    return new Recurring[i];
                }
            }

            public Recurring() {
                this(null, false, false, null, 15, null);
            }

            public static /* synthetic */ Recurring copy$default(Recurring recurring, UUID uuid, boolean z, boolean z2, InvestmentTarget investmentTarget, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = recurring.instrumentId;
                }
                if ((i & 2) != 0) {
                    z = recurring.showDismissBtn;
                }
                if ((i & 4) != 0) {
                    z2 = recurring.isFromHook;
                }
                if ((i & 8) != 0) {
                    investmentTarget = recurring.investmentTarget;
                }
                return recurring.copy(uuid, z, z2, investmentTarget);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getInstrumentId() {
                return this.instrumentId;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowDismissBtn() {
                return this.showDismissBtn;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsFromHook() {
                return this.isFromHook;
            }

            /* renamed from: component4, reason: from getter */
            public final InvestmentTarget getInvestmentTarget() {
                return this.investmentTarget;
            }

            public final Recurring copy(UUID instrumentId, boolean showDismissBtn, boolean isFromHook, InvestmentTarget investmentTarget) {
                Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
                return new Recurring(instrumentId, showDismissBtn, isFromHook, investmentTarget);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Recurring)) {
                    return false;
                }
                Recurring recurring = (Recurring) other;
                return Intrinsics.areEqual(this.instrumentId, recurring.instrumentId) && this.showDismissBtn == recurring.showDismissBtn && this.isFromHook == recurring.isFromHook && Intrinsics.areEqual(this.investmentTarget, recurring.investmentTarget);
            }

            public int hashCode() {
                UUID uuid = this.instrumentId;
                return ((((((uuid == null ? 0 : uuid.hashCode()) * 31) + Boolean.hashCode(this.showDismissBtn)) * 31) + Boolean.hashCode(this.isFromHook)) * 31) + this.investmentTarget.hashCode();
            }

            public String toString() {
                return "Recurring(instrumentId=" + this.instrumentId + ", showDismissBtn=" + this.showDismissBtn + ", isFromHook=" + this.isFromHook + ", investmentTarget=" + this.investmentTarget + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.instrumentId);
                dest.writeInt(this.showDismissBtn ? 1 : 0);
                dest.writeInt(this.isFromHook ? 1 : 0);
                dest.writeParcelable(this.investmentTarget, flags);
            }

            @Override // com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration
            public UUID getInstrumentId() {
                return this.instrumentId;
            }

            @Override // com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration
            public boolean getShowDismissBtn() {
                return this.showDismissBtn;
            }

            public final boolean isFromHook() {
                return this.isFromHook;
            }

            public final InvestmentTarget getInvestmentTarget() {
                return this.investmentTarget;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Recurring(UUID uuid, boolean z, boolean z2, InvestmentTarget investmentTarget, int i, DefaultConstructorMarker defaultConstructorMarker) {
                uuid = (i & 1) != 0 ? null : uuid;
                this(uuid, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? new InvestmentTarget(uuid, null, ApiAssetType.EQUITY) : investmentTarget);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Recurring(UUID uuid, boolean z, boolean z2, InvestmentTarget investmentTarget) {
                super(uuid, false, false, null, 14, null);
                Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
                this.instrumentId = uuid;
                this.showDismissBtn = z;
                this.isFromHook = z2;
                this.investmentTarget = investmentTarget;
            }
        }

        /* compiled from: OrderTypeEducationFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003JQ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020%HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration$CryptoOrder;", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "side", "Lcom/robinhood/models/db/OrderSide;", "instrumentId", "Ljava/util/UUID;", "orderUuid", "showContinueBtn", "", "toolbarNavIconType", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$NavIconType;", "replaceWithoutBackStack", "<init>", "(Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderSide;Ljava/util/UUID;Ljava/util/UUID;ZLcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$NavIconType;Z)V", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getInstrumentId", "()Ljava/util/UUID;", "getOrderUuid", "getShowContinueBtn", "()Z", "getToolbarNavIconType", "()Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$NavIconType;", "getReplaceWithoutBackStack", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CryptoOrder extends OrderTypeEducationConfiguration {
            public static final Parcelable.Creator<CryptoOrder> CREATOR = new Creator();
            private final UUID instrumentId;
            private final Order.Configuration orderConfiguration;
            private final UUID orderUuid;
            private final boolean replaceWithoutBackStack;
            private final boolean showContinueBtn;
            private final OrderSide side;
            private final NavIconType toolbarNavIconType;

            /* compiled from: OrderTypeEducationFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<CryptoOrder> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CryptoOrder createFromParcel(Parcel parcel) {
                    boolean z;
                    NavIconType navIconType;
                    boolean z2;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Order.Configuration configurationValueOf = Order.Configuration.valueOf(parcel.readString());
                    OrderSide orderSideValueOf = OrderSide.valueOf(parcel.readString());
                    UUID uuid = (UUID) parcel.readSerializable();
                    UUID uuid2 = (UUID) parcel.readSerializable();
                    boolean z3 = false;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                    }
                    NavIconType navIconTypeValueOf = NavIconType.valueOf(parcel.readString());
                    if (parcel.readInt() != 0) {
                        z2 = true;
                        navIconType = navIconTypeValueOf;
                    } else {
                        navIconType = navIconTypeValueOf;
                        z2 = z;
                    }
                    return new CryptoOrder(configurationValueOf, orderSideValueOf, uuid, uuid2, z3, navIconType, z2);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CryptoOrder[] newArray(int i) {
                    return new CryptoOrder[i];
                }
            }

            public static /* synthetic */ CryptoOrder copy$default(CryptoOrder cryptoOrder, Order.Configuration configuration, OrderSide orderSide, UUID uuid, UUID uuid2, boolean z, NavIconType navIconType, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    configuration = cryptoOrder.orderConfiguration;
                }
                if ((i & 2) != 0) {
                    orderSide = cryptoOrder.side;
                }
                if ((i & 4) != 0) {
                    uuid = cryptoOrder.instrumentId;
                }
                if ((i & 8) != 0) {
                    uuid2 = cryptoOrder.orderUuid;
                }
                if ((i & 16) != 0) {
                    z = cryptoOrder.showContinueBtn;
                }
                if ((i & 32) != 0) {
                    navIconType = cryptoOrder.toolbarNavIconType;
                }
                if ((i & 64) != 0) {
                    z2 = cryptoOrder.replaceWithoutBackStack;
                }
                NavIconType navIconType2 = navIconType;
                boolean z3 = z2;
                boolean z4 = z;
                UUID uuid3 = uuid;
                return cryptoOrder.copy(configuration, orderSide, uuid3, uuid2, z4, navIconType2, z3);
            }

            /* renamed from: component1, reason: from getter */
            public final Order.Configuration getOrderConfiguration() {
                return this.orderConfiguration;
            }

            /* renamed from: component2, reason: from getter */
            public final OrderSide getSide() {
                return this.side;
            }

            /* renamed from: component3, reason: from getter */
            public final UUID getInstrumentId() {
                return this.instrumentId;
            }

            /* renamed from: component4, reason: from getter */
            public final UUID getOrderUuid() {
                return this.orderUuid;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowContinueBtn() {
                return this.showContinueBtn;
            }

            /* renamed from: component6, reason: from getter */
            public final NavIconType getToolbarNavIconType() {
                return this.toolbarNavIconType;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getReplaceWithoutBackStack() {
                return this.replaceWithoutBackStack;
            }

            public final CryptoOrder copy(Order.Configuration orderConfiguration, OrderSide side, UUID instrumentId, UUID orderUuid, boolean showContinueBtn, NavIconType toolbarNavIconType, boolean replaceWithoutBackStack) {
                Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
                Intrinsics.checkNotNullParameter(toolbarNavIconType, "toolbarNavIconType");
                return new CryptoOrder(orderConfiguration, side, instrumentId, orderUuid, showContinueBtn, toolbarNavIconType, replaceWithoutBackStack);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CryptoOrder)) {
                    return false;
                }
                CryptoOrder cryptoOrder = (CryptoOrder) other;
                return this.orderConfiguration == cryptoOrder.orderConfiguration && this.side == cryptoOrder.side && Intrinsics.areEqual(this.instrumentId, cryptoOrder.instrumentId) && Intrinsics.areEqual(this.orderUuid, cryptoOrder.orderUuid) && this.showContinueBtn == cryptoOrder.showContinueBtn && this.toolbarNavIconType == cryptoOrder.toolbarNavIconType && this.replaceWithoutBackStack == cryptoOrder.replaceWithoutBackStack;
            }

            public int hashCode() {
                int iHashCode = ((this.orderConfiguration.hashCode() * 31) + this.side.hashCode()) * 31;
                UUID uuid = this.instrumentId;
                return ((((((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.orderUuid.hashCode()) * 31) + Boolean.hashCode(this.showContinueBtn)) * 31) + this.toolbarNavIconType.hashCode()) * 31) + Boolean.hashCode(this.replaceWithoutBackStack);
            }

            public String toString() {
                return "CryptoOrder(orderConfiguration=" + this.orderConfiguration + ", side=" + this.side + ", instrumentId=" + this.instrumentId + ", orderUuid=" + this.orderUuid + ", showContinueBtn=" + this.showContinueBtn + ", toolbarNavIconType=" + this.toolbarNavIconType + ", replaceWithoutBackStack=" + this.replaceWithoutBackStack + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.orderConfiguration.name());
                dest.writeString(this.side.name());
                dest.writeSerializable(this.instrumentId);
                dest.writeSerializable(this.orderUuid);
                dest.writeInt(this.showContinueBtn ? 1 : 0);
                dest.writeString(this.toolbarNavIconType.name());
                dest.writeInt(this.replaceWithoutBackStack ? 1 : 0);
            }

            public /* synthetic */ CryptoOrder(Order.Configuration configuration, OrderSide orderSide, UUID uuid, UUID uuid2, boolean z, NavIconType navIconType, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(configuration, orderSide, uuid, uuid2, z, navIconType, (i & 64) != 0 ? false : z2);
            }

            public final Order.Configuration getOrderConfiguration() {
                return this.orderConfiguration;
            }

            public final OrderSide getSide() {
                return this.side;
            }

            @Override // com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration
            public UUID getInstrumentId() {
                return this.instrumentId;
            }

            public final UUID getOrderUuid() {
                return this.orderUuid;
            }

            @Override // com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration
            public boolean getShowContinueBtn() {
                return this.showContinueBtn;
            }

            @Override // com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration
            public NavIconType getToolbarNavIconType() {
                return this.toolbarNavIconType;
            }

            public final boolean getReplaceWithoutBackStack() {
                return this.replaceWithoutBackStack;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CryptoOrder(Order.Configuration orderConfiguration, OrderSide side, UUID uuid, UUID orderUuid, boolean z, NavIconType toolbarNavIconType, boolean z2) {
                super(uuid, false, z, toolbarNavIconType, null);
                Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
                Intrinsics.checkNotNullParameter(toolbarNavIconType, "toolbarNavIconType");
                this.orderConfiguration = orderConfiguration;
                this.side = side;
                this.instrumentId = uuid;
                this.orderUuid = orderUuid;
                this.showContinueBtn = z;
                this.toolbarNavIconType = toolbarNavIconType;
                this.replaceWithoutBackStack = z2;
            }
        }

        /* compiled from: OrderTypeEducationFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003JQ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u000eHÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration$PerpetualContract;", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "side", "Lcom/robinhood/models/db/OrderSide;", "instrumentId", "Ljava/util/UUID;", "orderUuid", "showContinueBtn", "", "toolbarNavIconType", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$NavIconType;", "instrumentSymbol", "", "<init>", "(Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderSide;Ljava/util/UUID;Ljava/util/UUID;ZLcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$NavIconType;Ljava/lang/String;)V", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getInstrumentId", "()Ljava/util/UUID;", "getOrderUuid", "getShowContinueBtn", "()Z", "getToolbarNavIconType", "()Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$NavIconType;", "getInstrumentSymbol", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PerpetualContract extends OrderTypeEducationConfiguration {
            public static final Parcelable.Creator<PerpetualContract> CREATOR = new Creator();
            private final UUID instrumentId;
            private final String instrumentSymbol;
            private final Order.Configuration orderConfiguration;
            private final UUID orderUuid;
            private final boolean showContinueBtn;
            private final OrderSide side;
            private final NavIconType toolbarNavIconType;

            /* compiled from: OrderTypeEducationFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<PerpetualContract> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PerpetualContract createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PerpetualContract(Order.Configuration.valueOf(parcel.readString()), OrderSide.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readInt() != 0, NavIconType.valueOf(parcel.readString()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PerpetualContract[] newArray(int i) {
                    return new PerpetualContract[i];
                }
            }

            public static /* synthetic */ PerpetualContract copy$default(PerpetualContract perpetualContract, Order.Configuration configuration, OrderSide orderSide, UUID uuid, UUID uuid2, boolean z, NavIconType navIconType, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    configuration = perpetualContract.orderConfiguration;
                }
                if ((i & 2) != 0) {
                    orderSide = perpetualContract.side;
                }
                if ((i & 4) != 0) {
                    uuid = perpetualContract.instrumentId;
                }
                if ((i & 8) != 0) {
                    uuid2 = perpetualContract.orderUuid;
                }
                if ((i & 16) != 0) {
                    z = perpetualContract.showContinueBtn;
                }
                if ((i & 32) != 0) {
                    navIconType = perpetualContract.toolbarNavIconType;
                }
                if ((i & 64) != 0) {
                    str = perpetualContract.instrumentSymbol;
                }
                NavIconType navIconType2 = navIconType;
                String str2 = str;
                boolean z2 = z;
                UUID uuid3 = uuid;
                return perpetualContract.copy(configuration, orderSide, uuid3, uuid2, z2, navIconType2, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final Order.Configuration getOrderConfiguration() {
                return this.orderConfiguration;
            }

            /* renamed from: component2, reason: from getter */
            public final OrderSide getSide() {
                return this.side;
            }

            /* renamed from: component3, reason: from getter */
            public final UUID getInstrumentId() {
                return this.instrumentId;
            }

            /* renamed from: component4, reason: from getter */
            public final UUID getOrderUuid() {
                return this.orderUuid;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowContinueBtn() {
                return this.showContinueBtn;
            }

            /* renamed from: component6, reason: from getter */
            public final NavIconType getToolbarNavIconType() {
                return this.toolbarNavIconType;
            }

            /* renamed from: component7, reason: from getter */
            public final String getInstrumentSymbol() {
                return this.instrumentSymbol;
            }

            public final PerpetualContract copy(Order.Configuration orderConfiguration, OrderSide side, UUID instrumentId, UUID orderUuid, boolean showContinueBtn, NavIconType toolbarNavIconType, String instrumentSymbol) {
                Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
                Intrinsics.checkNotNullParameter(toolbarNavIconType, "toolbarNavIconType");
                Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
                return new PerpetualContract(orderConfiguration, side, instrumentId, orderUuid, showContinueBtn, toolbarNavIconType, instrumentSymbol);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PerpetualContract)) {
                    return false;
                }
                PerpetualContract perpetualContract = (PerpetualContract) other;
                return this.orderConfiguration == perpetualContract.orderConfiguration && this.side == perpetualContract.side && Intrinsics.areEqual(this.instrumentId, perpetualContract.instrumentId) && Intrinsics.areEqual(this.orderUuid, perpetualContract.orderUuid) && this.showContinueBtn == perpetualContract.showContinueBtn && this.toolbarNavIconType == perpetualContract.toolbarNavIconType && Intrinsics.areEqual(this.instrumentSymbol, perpetualContract.instrumentSymbol);
            }

            public int hashCode() {
                int iHashCode = ((this.orderConfiguration.hashCode() * 31) + this.side.hashCode()) * 31;
                UUID uuid = this.instrumentId;
                return ((((((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.orderUuid.hashCode()) * 31) + Boolean.hashCode(this.showContinueBtn)) * 31) + this.toolbarNavIconType.hashCode()) * 31) + this.instrumentSymbol.hashCode();
            }

            public String toString() {
                return "PerpetualContract(orderConfiguration=" + this.orderConfiguration + ", side=" + this.side + ", instrumentId=" + this.instrumentId + ", orderUuid=" + this.orderUuid + ", showContinueBtn=" + this.showContinueBtn + ", toolbarNavIconType=" + this.toolbarNavIconType + ", instrumentSymbol=" + this.instrumentSymbol + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.orderConfiguration.name());
                dest.writeString(this.side.name());
                dest.writeSerializable(this.instrumentId);
                dest.writeSerializable(this.orderUuid);
                dest.writeInt(this.showContinueBtn ? 1 : 0);
                dest.writeString(this.toolbarNavIconType.name());
                dest.writeString(this.instrumentSymbol);
            }

            public final Order.Configuration getOrderConfiguration() {
                return this.orderConfiguration;
            }

            public final OrderSide getSide() {
                return this.side;
            }

            @Override // com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration
            public UUID getInstrumentId() {
                return this.instrumentId;
            }

            public final UUID getOrderUuid() {
                return this.orderUuid;
            }

            @Override // com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration
            public boolean getShowContinueBtn() {
                return this.showContinueBtn;
            }

            @Override // com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration
            public NavIconType getToolbarNavIconType() {
                return this.toolbarNavIconType;
            }

            public final String getInstrumentSymbol() {
                return this.instrumentSymbol;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerpetualContract(Order.Configuration orderConfiguration, OrderSide side, UUID uuid, UUID orderUuid, boolean z, NavIconType toolbarNavIconType, String instrumentSymbol) {
                super(uuid, false, z, toolbarNavIconType, null);
                Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
                Intrinsics.checkNotNullParameter(toolbarNavIconType, "toolbarNavIconType");
                Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
                this.orderConfiguration = orderConfiguration;
                this.side = side;
                this.instrumentId = uuid;
                this.orderUuid = orderUuid;
                this.showContinueBtn = z;
                this.toolbarNavIconType = toolbarNavIconType;
                this.instrumentSymbol = instrumentSymbol;
            }
        }

        /* compiled from: OrderTypeEducationFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration$TokenizedStocks;", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "orderConfiguration", "Lcom/robinhood/models/db/Order$Configuration;", "side", "Lcom/robinhood/models/db/OrderSide;", "instrumentId", "Ljava/util/UUID;", "showContinueBtn", "", "toolbarNavIconType", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$NavIconType;", "<init>", "(Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderSide;Ljava/util/UUID;ZLcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$NavIconType;)V", "getOrderConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getInstrumentId", "()Ljava/util/UUID;", "getShowContinueBtn", "()Z", "getToolbarNavIconType", "()Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$NavIconType;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TokenizedStocks extends OrderTypeEducationConfiguration {
            public static final Parcelable.Creator<TokenizedStocks> CREATOR = new Creator();
            private final UUID instrumentId;
            private final Order.Configuration orderConfiguration;
            private final boolean showContinueBtn;
            private final OrderSide side;
            private final NavIconType toolbarNavIconType;

            /* compiled from: OrderTypeEducationFragmentKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<TokenizedStocks> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TokenizedStocks createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TokenizedStocks(Order.Configuration.valueOf(parcel.readString()), OrderSide.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readInt() != 0, NavIconType.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TokenizedStocks[] newArray(int i) {
                    return new TokenizedStocks[i];
                }
            }

            public static /* synthetic */ TokenizedStocks copy$default(TokenizedStocks tokenizedStocks, Order.Configuration configuration, OrderSide orderSide, UUID uuid, boolean z, NavIconType navIconType, int i, Object obj) {
                if ((i & 1) != 0) {
                    configuration = tokenizedStocks.orderConfiguration;
                }
                if ((i & 2) != 0) {
                    orderSide = tokenizedStocks.side;
                }
                if ((i & 4) != 0) {
                    uuid = tokenizedStocks.instrumentId;
                }
                if ((i & 8) != 0) {
                    z = tokenizedStocks.showContinueBtn;
                }
                if ((i & 16) != 0) {
                    navIconType = tokenizedStocks.toolbarNavIconType;
                }
                NavIconType navIconType2 = navIconType;
                UUID uuid2 = uuid;
                return tokenizedStocks.copy(configuration, orderSide, uuid2, z, navIconType2);
            }

            /* renamed from: component1, reason: from getter */
            public final Order.Configuration getOrderConfiguration() {
                return this.orderConfiguration;
            }

            /* renamed from: component2, reason: from getter */
            public final OrderSide getSide() {
                return this.side;
            }

            /* renamed from: component3, reason: from getter */
            public final UUID getInstrumentId() {
                return this.instrumentId;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowContinueBtn() {
                return this.showContinueBtn;
            }

            /* renamed from: component5, reason: from getter */
            public final NavIconType getToolbarNavIconType() {
                return this.toolbarNavIconType;
            }

            public final TokenizedStocks copy(Order.Configuration orderConfiguration, OrderSide side, UUID instrumentId, boolean showContinueBtn, NavIconType toolbarNavIconType) {
                Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(toolbarNavIconType, "toolbarNavIconType");
                return new TokenizedStocks(orderConfiguration, side, instrumentId, showContinueBtn, toolbarNavIconType);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TokenizedStocks)) {
                    return false;
                }
                TokenizedStocks tokenizedStocks = (TokenizedStocks) other;
                return this.orderConfiguration == tokenizedStocks.orderConfiguration && this.side == tokenizedStocks.side && Intrinsics.areEqual(this.instrumentId, tokenizedStocks.instrumentId) && this.showContinueBtn == tokenizedStocks.showContinueBtn && this.toolbarNavIconType == tokenizedStocks.toolbarNavIconType;
            }

            public int hashCode() {
                int iHashCode = ((this.orderConfiguration.hashCode() * 31) + this.side.hashCode()) * 31;
                UUID uuid = this.instrumentId;
                return ((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + Boolean.hashCode(this.showContinueBtn)) * 31) + this.toolbarNavIconType.hashCode();
            }

            public String toString() {
                return "TokenizedStocks(orderConfiguration=" + this.orderConfiguration + ", side=" + this.side + ", instrumentId=" + this.instrumentId + ", showContinueBtn=" + this.showContinueBtn + ", toolbarNavIconType=" + this.toolbarNavIconType + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.orderConfiguration.name());
                dest.writeString(this.side.name());
                dest.writeSerializable(this.instrumentId);
                dest.writeInt(this.showContinueBtn ? 1 : 0);
                dest.writeString(this.toolbarNavIconType.name());
            }

            public final Order.Configuration getOrderConfiguration() {
                return this.orderConfiguration;
            }

            public final OrderSide getSide() {
                return this.side;
            }

            @Override // com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration
            public UUID getInstrumentId() {
                return this.instrumentId;
            }

            @Override // com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration
            public boolean getShowContinueBtn() {
                return this.showContinueBtn;
            }

            @Override // com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration
            public NavIconType getToolbarNavIconType() {
                return this.toolbarNavIconType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokenizedStocks(Order.Configuration orderConfiguration, OrderSide side, UUID uuid, boolean z, NavIconType toolbarNavIconType) {
                super(uuid, false, z, toolbarNavIconType, null);
                Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(toolbarNavIconType, "toolbarNavIconType");
                this.orderConfiguration = orderConfiguration;
                this.side = side;
                this.instrumentId = uuid;
                this.showContinueBtn = z;
                this.toolbarNavIconType = toolbarNavIconType;
            }
        }
    }
}
