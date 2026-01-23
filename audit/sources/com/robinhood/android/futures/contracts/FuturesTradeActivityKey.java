package com.robinhood.android.futures.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesNavigationKeys.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData;", "<init>", "(Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData;)V", "getData", "()Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeData", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FuturesTradeActivityKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<FuturesTradeActivityKey> CREATOR = new Creator();
    private final TradeData data;

    /* compiled from: FuturesNavigationKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<FuturesTradeActivityKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FuturesTradeActivityKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FuturesTradeActivityKey((TradeData) parcel.readParcelable(FuturesTradeActivityKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FuturesTradeActivityKey[] newArray(int i) {
            return new FuturesTradeActivityKey[i];
        }
    }

    public static /* synthetic */ FuturesTradeActivityKey copy$default(FuturesTradeActivityKey futuresTradeActivityKey, TradeData tradeData, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeData = futuresTradeActivityKey.data;
        }
        return futuresTradeActivityKey.copy(tradeData);
    }

    /* renamed from: component1, reason: from getter */
    public final TradeData getData() {
        return this.data;
    }

    public final FuturesTradeActivityKey copy(TradeData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new FuturesTradeActivityKey(data);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FuturesTradeActivityKey) && Intrinsics.areEqual(this.data, ((FuturesTradeActivityKey) other).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "FuturesTradeActivityKey(data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.data, flags);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public FuturesTradeActivityKey(TradeData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public final TradeData getData() {
        return this.data;
    }

    /* compiled from: FuturesNavigationKeys.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData;", "Landroid/os/Parcelable;", "<init>", "()V", "futuresContractId", "Ljava/util/UUID;", "getFuturesContractId", "()Ljava/util/UUID;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "retainAdvancedChart", "", "getRetainAdvancedChart", "()Z", "Ladder", "OrderForm", "Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData$Ladder;", "Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData$OrderForm;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class TradeData implements Parcelable {
        public /* synthetic */ TradeData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract UUID getFuturesContractId();

        public abstract boolean getRetainAdvancedChart();

        public abstract Screen getSourceScreen();

        private TradeData() {
        }

        /* compiled from: FuturesNavigationKeys.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData$Ladder;", "Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData;", "futuresContractId", "Ljava/util/UUID;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "retainAdvancedChart", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Screen;Z)V", "getFuturesContractId", "()Ljava/util/UUID;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getRetainAdvancedChart", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Ladder extends TradeData {
            public static final Parcelable.Creator<Ladder> CREATOR = new Creator();
            private final UUID futuresContractId;
            private final boolean retainAdvancedChart;
            private final Screen sourceScreen;

            /* compiled from: FuturesNavigationKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Ladder> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Ladder createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Ladder((UUID) parcel.readSerializable(), (Screen) parcel.readSerializable(), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Ladder[] newArray(int i) {
                    return new Ladder[i];
                }
            }

            public static /* synthetic */ Ladder copy$default(Ladder ladder, UUID uuid, Screen screen, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = ladder.futuresContractId;
                }
                if ((i & 2) != 0) {
                    screen = ladder.sourceScreen;
                }
                if ((i & 4) != 0) {
                    z = ladder.retainAdvancedChart;
                }
                return ladder.copy(uuid, screen, z);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getFuturesContractId() {
                return this.futuresContractId;
            }

            /* renamed from: component2, reason: from getter */
            public final Screen getSourceScreen() {
                return this.sourceScreen;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getRetainAdvancedChart() {
                return this.retainAdvancedChart;
            }

            public final Ladder copy(UUID futuresContractId, Screen sourceScreen, boolean retainAdvancedChart) {
                Intrinsics.checkNotNullParameter(futuresContractId, "futuresContractId");
                Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
                return new Ladder(futuresContractId, sourceScreen, retainAdvancedChart);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Ladder)) {
                    return false;
                }
                Ladder ladder = (Ladder) other;
                return Intrinsics.areEqual(this.futuresContractId, ladder.futuresContractId) && Intrinsics.areEqual(this.sourceScreen, ladder.sourceScreen) && this.retainAdvancedChart == ladder.retainAdvancedChart;
            }

            public int hashCode() {
                return (((this.futuresContractId.hashCode() * 31) + this.sourceScreen.hashCode()) * 31) + Boolean.hashCode(this.retainAdvancedChart);
            }

            public String toString() {
                return "Ladder(futuresContractId=" + this.futuresContractId + ", sourceScreen=" + this.sourceScreen + ", retainAdvancedChart=" + this.retainAdvancedChart + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.futuresContractId);
                dest.writeSerializable(this.sourceScreen);
                dest.writeInt(this.retainAdvancedChart ? 1 : 0);
            }

            public /* synthetic */ Ladder(UUID uuid, Screen screen, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(uuid, screen, (i & 4) != 0 ? false : z);
            }

            @Override // com.robinhood.android.futures.contracts.FuturesTradeActivityKey.TradeData
            public UUID getFuturesContractId() {
                return this.futuresContractId;
            }

            @Override // com.robinhood.android.futures.contracts.FuturesTradeActivityKey.TradeData
            public Screen getSourceScreen() {
                return this.sourceScreen;
            }

            @Override // com.robinhood.android.futures.contracts.FuturesTradeActivityKey.TradeData
            public boolean getRetainAdvancedChart() {
                return this.retainAdvancedChart;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ladder(UUID futuresContractId, Screen sourceScreen, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(futuresContractId, "futuresContractId");
                Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
                this.futuresContractId = futuresContractId;
                this.sourceScreen = sourceScreen;
                this.retainAdvancedChart = z;
            }
        }

        /* compiled from: FuturesNavigationKeys.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\tJ\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData$OrderForm;", "Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData;", "futuresContractId", "Ljava/util/UUID;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "defaultQuantity", "", "retainAdvancedChart", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Ljava/lang/Integer;Z)V", "getFuturesContractId", "()Ljava/util/UUID;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "getDefaultQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRetainAdvancedChart", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;Ljava/lang/Integer;Z)Lcom/robinhood/android/futures/contracts/FuturesTradeActivityKey$TradeData$OrderForm;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OrderForm extends TradeData {
            public static final Parcelable.Creator<OrderForm> CREATOR = new Creator();
            private final Integer defaultQuantity;
            private final UUID futuresContractId;
            private final boolean retainAdvancedChart;
            private final FuturesOrderSide side;
            private final Screen sourceScreen;

            /* compiled from: FuturesNavigationKeys.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<OrderForm> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OrderForm createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OrderForm((UUID) parcel.readSerializable(), (Screen) parcel.readSerializable(), FuturesOrderSide.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OrderForm[] newArray(int i) {
                    return new OrderForm[i];
                }
            }

            public static /* synthetic */ OrderForm copy$default(OrderForm orderForm, UUID uuid, Screen screen, FuturesOrderSide futuresOrderSide, Integer num, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = orderForm.futuresContractId;
                }
                if ((i & 2) != 0) {
                    screen = orderForm.sourceScreen;
                }
                if ((i & 4) != 0) {
                    futuresOrderSide = orderForm.side;
                }
                if ((i & 8) != 0) {
                    num = orderForm.defaultQuantity;
                }
                if ((i & 16) != 0) {
                    z = orderForm.retainAdvancedChart;
                }
                boolean z2 = z;
                FuturesOrderSide futuresOrderSide2 = futuresOrderSide;
                return orderForm.copy(uuid, screen, futuresOrderSide2, num, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getFuturesContractId() {
                return this.futuresContractId;
            }

            /* renamed from: component2, reason: from getter */
            public final Screen getSourceScreen() {
                return this.sourceScreen;
            }

            /* renamed from: component3, reason: from getter */
            public final FuturesOrderSide getSide() {
                return this.side;
            }

            /* renamed from: component4, reason: from getter */
            public final Integer getDefaultQuantity() {
                return this.defaultQuantity;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getRetainAdvancedChart() {
                return this.retainAdvancedChart;
            }

            public final OrderForm copy(UUID futuresContractId, Screen sourceScreen, FuturesOrderSide side, Integer defaultQuantity, boolean retainAdvancedChart) {
                Intrinsics.checkNotNullParameter(futuresContractId, "futuresContractId");
                Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
                Intrinsics.checkNotNullParameter(side, "side");
                return new OrderForm(futuresContractId, sourceScreen, side, defaultQuantity, retainAdvancedChart);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderForm)) {
                    return false;
                }
                OrderForm orderForm = (OrderForm) other;
                return Intrinsics.areEqual(this.futuresContractId, orderForm.futuresContractId) && Intrinsics.areEqual(this.sourceScreen, orderForm.sourceScreen) && this.side == orderForm.side && Intrinsics.areEqual(this.defaultQuantity, orderForm.defaultQuantity) && this.retainAdvancedChart == orderForm.retainAdvancedChart;
            }

            public int hashCode() {
                int iHashCode = ((((this.futuresContractId.hashCode() * 31) + this.sourceScreen.hashCode()) * 31) + this.side.hashCode()) * 31;
                Integer num = this.defaultQuantity;
                return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.retainAdvancedChart);
            }

            public String toString() {
                return "OrderForm(futuresContractId=" + this.futuresContractId + ", sourceScreen=" + this.sourceScreen + ", side=" + this.side + ", defaultQuantity=" + this.defaultQuantity + ", retainAdvancedChart=" + this.retainAdvancedChart + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                int iIntValue;
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.futuresContractId);
                dest.writeSerializable(this.sourceScreen);
                dest.writeString(this.side.name());
                Integer num = this.defaultQuantity;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    dest.writeInt(1);
                    iIntValue = num.intValue();
                }
                dest.writeInt(iIntValue);
                dest.writeInt(this.retainAdvancedChart ? 1 : 0);
            }

            public /* synthetic */ OrderForm(UUID uuid, Screen screen, FuturesOrderSide futuresOrderSide, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(uuid, screen, futuresOrderSide, (i & 8) != 0 ? null : num, (i & 16) != 0 ? false : z);
            }

            @Override // com.robinhood.android.futures.contracts.FuturesTradeActivityKey.TradeData
            public UUID getFuturesContractId() {
                return this.futuresContractId;
            }

            @Override // com.robinhood.android.futures.contracts.FuturesTradeActivityKey.TradeData
            public Screen getSourceScreen() {
                return this.sourceScreen;
            }

            public final FuturesOrderSide getSide() {
                return this.side;
            }

            public final Integer getDefaultQuantity() {
                return this.defaultQuantity;
            }

            @Override // com.robinhood.android.futures.contracts.FuturesTradeActivityKey.TradeData
            public boolean getRetainAdvancedChart() {
                return this.retainAdvancedChart;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderForm(UUID futuresContractId, Screen sourceScreen, FuturesOrderSide side, Integer num, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(futuresContractId, "futuresContractId");
                Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
                Intrinsics.checkNotNullParameter(side, "side");
                this.futuresContractId = futuresContractId;
                this.sourceScreen = sourceScreen;
                this.side = side;
                this.defaultQuantity = num;
                this.retainAdvancedChart = z;
            }
        }
    }
}
