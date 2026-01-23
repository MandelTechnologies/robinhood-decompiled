package com.robinhood.shared.trade.crypto.validation;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p315ui.UiCryptoTradeBonusEligibility;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RequestInputs.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003./0BQ\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0001\u000212¨\u00063"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "Landroid/os/Parcelable;", "orderPrices", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "side", "Lcom/robinhood/models/db/OrderSide;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "hasSeenPdtWarning", "", "tradeBonusEligibility", "Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "shouldReviewOrder", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;", "monetizationModel", "Lcom/robinhood/models/api/fee/MonetizationModel;", "nullableMonetizationModel", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/db/OrderTimeInForce;ZLcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;Lcom/robinhood/models/api/fee/MonetizationModel;Lcom/robinhood/models/api/fee/MonetizationModel;)V", "getOrderPrices", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getHasSeenPdtWarning", "()Z", "getTradeBonusEligibility", "()Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "getShouldReviewOrder", "()Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;", "getMonetizationModel", "()Lcom/robinhood/models/api/fee/MonetizationModel;", "getNullableMonetizationModel", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "entryType", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$EntryType;", "getEntryType", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext$EntryType;", "cryptoAccountSwitcherLocation", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;", "currencyPairId", "Ljava/util/UUID;", "AsQuote", "AsAsset", "TaxLot", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsQuote;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class RequestInputs implements Parcelable {
    public static final int $stable = 8;
    private final boolean hasSeenPdtWarning;
    private final MonetizationModel monetizationModel;
    private final MonetizationModel nullableMonetizationModel;
    private final CryptoOrderPrices orderPrices;
    private final CryptoOrderUiEvent shouldReviewOrder;
    private final OrderSide side;
    private final OrderTimeInForce timeInForce;
    private final UiCryptoTradeBonusEligibility tradeBonusEligibility;

    /* compiled from: RequestInputs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ RequestInputs(CryptoOrderPrices cryptoOrderPrices, OrderSide orderSide, OrderTimeInForce orderTimeInForce, boolean z, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, CryptoOrderUiEvent cryptoOrderUiEvent, MonetizationModel monetizationModel, MonetizationModel monetizationModel2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoOrderPrices, orderSide, orderTimeInForce, z, uiCryptoTradeBonusEligibility, cryptoOrderUiEvent, monetizationModel, monetizationModel2);
    }

    private RequestInputs(CryptoOrderPrices cryptoOrderPrices, OrderSide orderSide, OrderTimeInForce orderTimeInForce, boolean z, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, CryptoOrderUiEvent cryptoOrderUiEvent, MonetizationModel monetizationModel, MonetizationModel monetizationModel2) {
        this.orderPrices = cryptoOrderPrices;
        this.side = orderSide;
        this.timeInForce = orderTimeInForce;
        this.hasSeenPdtWarning = z;
        this.tradeBonusEligibility = uiCryptoTradeBonusEligibility;
        this.shouldReviewOrder = cryptoOrderUiEvent;
        this.monetizationModel = monetizationModel;
        this.nullableMonetizationModel = monetizationModel2;
    }

    public /* synthetic */ RequestInputs(CryptoOrderPrices cryptoOrderPrices, OrderSide orderSide, OrderTimeInForce orderTimeInForce, boolean z, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, CryptoOrderUiEvent cryptoOrderUiEvent, MonetizationModel monetizationModel, MonetizationModel monetizationModel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoOrderPrices, orderSide, orderTimeInForce, z, uiCryptoTradeBonusEligibility, (i & 32) != 0 ? null : cryptoOrderUiEvent, monetizationModel, monetizationModel2, null);
    }

    public CryptoOrderPrices getOrderPrices() {
        return this.orderPrices;
    }

    public OrderSide getSide() {
        return this.side;
    }

    public OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    public boolean getHasSeenPdtWarning() {
        return this.hasSeenPdtWarning;
    }

    public UiCryptoTradeBonusEligibility getTradeBonusEligibility() {
        return this.tradeBonusEligibility;
    }

    public CryptoOrderUiEvent getShouldReviewOrder() {
        return this.shouldReviewOrder;
    }

    public MonetizationModel getMonetizationModel() {
        return this.monetizationModel;
    }

    public MonetizationModel getNullableMonetizationModel() {
        return this.nullableMonetizationModel;
    }

    /* compiled from: RequestInputs.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003J_\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00068"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsQuote;", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "purchaseCost", "Ljava/math/BigDecimal;", "cryptoOrderMonetizationModel", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "orderPrices", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "side", "Lcom/robinhood/models/db/OrderSide;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "hasSeenPdtWarning", "", "tradeBonusEligibility", "Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "shouldReviewOrder", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/db/OrderTimeInForce;ZLcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;)V", "getPurchaseCost", "()Ljava/math/BigDecimal;", "getOrderPrices", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getHasSeenPdtWarning", "()Z", "getTradeBonusEligibility", "()Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "getShouldReviewOrder", "()Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AsQuote extends RequestInputs {
        public static final int $stable = 8;
        public static final Parcelable.Creator<AsQuote> CREATOR = new Creator();
        private final CryptoOrderMonetizationModel cryptoOrderMonetizationModel;
        private final boolean hasSeenPdtWarning;
        private final CryptoOrderPrices orderPrices;
        private final BigDecimal purchaseCost;
        private final CryptoOrderUiEvent shouldReviewOrder;
        private final OrderSide side;
        private final OrderTimeInForce timeInForce;
        private final UiCryptoTradeBonusEligibility tradeBonusEligibility;

        /* compiled from: RequestInputs.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AsQuote> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AsQuote createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AsQuote((BigDecimal) parcel.readSerializable(), (CryptoOrderMonetizationModel) parcel.readParcelable(AsQuote.class.getClassLoader()), (CryptoOrderPrices) parcel.readParcelable(AsQuote.class.getClassLoader()), OrderSide.valueOf(parcel.readString()), (OrderTimeInForce) parcel.readParcelable(AsQuote.class.getClassLoader()), parcel.readInt() != 0, (UiCryptoTradeBonusEligibility) parcel.readParcelable(AsQuote.class.getClassLoader()), parcel.readInt() == 0 ? null : CryptoOrderUiEvent.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AsQuote[] newArray(int i) {
                return new AsQuote[i];
            }
        }

        /* renamed from: component2, reason: from getter */
        private final CryptoOrderMonetizationModel getCryptoOrderMonetizationModel() {
            return this.cryptoOrderMonetizationModel;
        }

        public static /* synthetic */ AsQuote copy$default(AsQuote asQuote, BigDecimal bigDecimal, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, CryptoOrderPrices cryptoOrderPrices, OrderSide orderSide, OrderTimeInForce orderTimeInForce, boolean z, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, CryptoOrderUiEvent cryptoOrderUiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = asQuote.purchaseCost;
            }
            if ((i & 2) != 0) {
                cryptoOrderMonetizationModel = asQuote.cryptoOrderMonetizationModel;
            }
            if ((i & 4) != 0) {
                cryptoOrderPrices = asQuote.orderPrices;
            }
            if ((i & 8) != 0) {
                orderSide = asQuote.side;
            }
            if ((i & 16) != 0) {
                orderTimeInForce = asQuote.timeInForce;
            }
            if ((i & 32) != 0) {
                z = asQuote.hasSeenPdtWarning;
            }
            if ((i & 64) != 0) {
                uiCryptoTradeBonusEligibility = asQuote.tradeBonusEligibility;
            }
            if ((i & 128) != 0) {
                cryptoOrderUiEvent = asQuote.shouldReviewOrder;
            }
            UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility2 = uiCryptoTradeBonusEligibility;
            CryptoOrderUiEvent cryptoOrderUiEvent2 = cryptoOrderUiEvent;
            OrderTimeInForce orderTimeInForce2 = orderTimeInForce;
            boolean z2 = z;
            return asQuote.copy(bigDecimal, cryptoOrderMonetizationModel, cryptoOrderPrices, orderSide, orderTimeInForce2, z2, uiCryptoTradeBonusEligibility2, cryptoOrderUiEvent2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getPurchaseCost() {
            return this.purchaseCost;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoOrderPrices getOrderPrices() {
            return this.orderPrices;
        }

        /* renamed from: component4, reason: from getter */
        public final OrderSide getSide() {
            return this.side;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getHasSeenPdtWarning() {
            return this.hasSeenPdtWarning;
        }

        /* renamed from: component7, reason: from getter */
        public final UiCryptoTradeBonusEligibility getTradeBonusEligibility() {
            return this.tradeBonusEligibility;
        }

        /* renamed from: component8, reason: from getter */
        public final CryptoOrderUiEvent getShouldReviewOrder() {
            return this.shouldReviewOrder;
        }

        public final AsQuote copy(BigDecimal purchaseCost, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, CryptoOrderPrices orderPrices, OrderSide side, OrderTimeInForce timeInForce, boolean hasSeenPdtWarning, UiCryptoTradeBonusEligibility tradeBonusEligibility, CryptoOrderUiEvent shouldReviewOrder) {
            Intrinsics.checkNotNullParameter(purchaseCost, "purchaseCost");
            Intrinsics.checkNotNullParameter(orderPrices, "orderPrices");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            return new AsQuote(purchaseCost, cryptoOrderMonetizationModel, orderPrices, side, timeInForce, hasSeenPdtWarning, tradeBonusEligibility, shouldReviewOrder);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AsQuote)) {
                return false;
            }
            AsQuote asQuote = (AsQuote) other;
            return Intrinsics.areEqual(this.purchaseCost, asQuote.purchaseCost) && Intrinsics.areEqual(this.cryptoOrderMonetizationModel, asQuote.cryptoOrderMonetizationModel) && Intrinsics.areEqual(this.orderPrices, asQuote.orderPrices) && this.side == asQuote.side && this.timeInForce == asQuote.timeInForce && this.hasSeenPdtWarning == asQuote.hasSeenPdtWarning && Intrinsics.areEqual(this.tradeBonusEligibility, asQuote.tradeBonusEligibility) && Intrinsics.areEqual(this.shouldReviewOrder, asQuote.shouldReviewOrder);
        }

        public int hashCode() {
            int iHashCode = this.purchaseCost.hashCode() * 31;
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel = this.cryptoOrderMonetizationModel;
            int iHashCode2 = (((((((((iHashCode + (cryptoOrderMonetizationModel == null ? 0 : cryptoOrderMonetizationModel.hashCode())) * 31) + this.orderPrices.hashCode()) * 31) + this.side.hashCode()) * 31) + this.timeInForce.hashCode()) * 31) + Boolean.hashCode(this.hasSeenPdtWarning)) * 31;
            UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility = this.tradeBonusEligibility;
            int iHashCode3 = (iHashCode2 + (uiCryptoTradeBonusEligibility == null ? 0 : uiCryptoTradeBonusEligibility.hashCode())) * 31;
            CryptoOrderUiEvent cryptoOrderUiEvent = this.shouldReviewOrder;
            return iHashCode3 + (cryptoOrderUiEvent != null ? cryptoOrderUiEvent.hashCode() : 0);
        }

        public String toString() {
            return "AsQuote(purchaseCost=" + this.purchaseCost + ", cryptoOrderMonetizationModel=" + this.cryptoOrderMonetizationModel + ", orderPrices=" + this.orderPrices + ", side=" + this.side + ", timeInForce=" + this.timeInForce + ", hasSeenPdtWarning=" + this.hasSeenPdtWarning + ", tradeBonusEligibility=" + this.tradeBonusEligibility + ", shouldReviewOrder=" + this.shouldReviewOrder + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.purchaseCost);
            dest.writeParcelable(this.cryptoOrderMonetizationModel, flags);
            dest.writeParcelable(this.orderPrices, flags);
            dest.writeString(this.side.name());
            dest.writeParcelable(this.timeInForce, flags);
            dest.writeInt(this.hasSeenPdtWarning ? 1 : 0);
            dest.writeParcelable(this.tradeBonusEligibility, flags);
            CryptoOrderUiEvent cryptoOrderUiEvent = this.shouldReviewOrder;
            if (cryptoOrderUiEvent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cryptoOrderUiEvent.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ AsQuote(BigDecimal bigDecimal, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, CryptoOrderPrices cryptoOrderPrices, OrderSide orderSide, OrderTimeInForce orderTimeInForce, boolean z, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, CryptoOrderUiEvent cryptoOrderUiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bigDecimal, (i & 2) != 0 ? null : cryptoOrderMonetizationModel, cryptoOrderPrices, orderSide, orderTimeInForce, z, (i & 64) != 0 ? null : uiCryptoTradeBonusEligibility, (i & 128) != 0 ? null : cryptoOrderUiEvent);
        }

        public final BigDecimal getPurchaseCost() {
            return this.purchaseCost;
        }

        @Override // com.robinhood.shared.trade.crypto.validation.RequestInputs
        public CryptoOrderPrices getOrderPrices() {
            return this.orderPrices;
        }

        @Override // com.robinhood.shared.trade.crypto.validation.RequestInputs
        public OrderSide getSide() {
            return this.side;
        }

        @Override // com.robinhood.shared.trade.crypto.validation.RequestInputs
        public OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @Override // com.robinhood.shared.trade.crypto.validation.RequestInputs
        public boolean getHasSeenPdtWarning() {
            return this.hasSeenPdtWarning;
        }

        @Override // com.robinhood.shared.trade.crypto.validation.RequestInputs
        public UiCryptoTradeBonusEligibility getTradeBonusEligibility() {
            return this.tradeBonusEligibility;
        }

        @Override // com.robinhood.shared.trade.crypto.validation.RequestInputs
        public CryptoOrderUiEvent getShouldReviewOrder() {
            return this.shouldReviewOrder;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public AsQuote(BigDecimal purchaseCost, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, CryptoOrderPrices orderPrices, OrderSide side, OrderTimeInForce timeInForce, boolean z, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, CryptoOrderUiEvent cryptoOrderUiEvent) {
            MonetizationModel monetizationModel;
            Intrinsics.checkNotNullParameter(purchaseCost, "purchaseCost");
            Intrinsics.checkNotNullParameter(orderPrices, "orderPrices");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            super(orderPrices, side, timeInForce, z, uiCryptoTradeBonusEligibility, cryptoOrderUiEvent, (cryptoOrderMonetizationModel == null || (monetizationModel = cryptoOrderMonetizationModel.getMonetizationModel()) == null) ? MonetizationModel.REBATE : monetizationModel, cryptoOrderMonetizationModel != null ? cryptoOrderMonetizationModel.getMonetizationModel() : null, null);
            this.purchaseCost = purchaseCost;
            this.cryptoOrderMonetizationModel = cryptoOrderMonetizationModel;
            this.orderPrices = orderPrices;
            this.side = side;
            this.timeInForce = timeInForce;
            this.hasSeenPdtWarning = z;
            this.tradeBonusEligibility = uiCryptoTradeBonusEligibility;
            this.shouldReviewOrder = cryptoOrderUiEvent;
        }
    }

    /* compiled from: RequestInputs.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J{\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0001J\u0006\u00103\u001a\u000204J\u0013\u00105\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000204HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000204R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010!R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006@"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "purchaseSize", "Ljava/math/BigDecimal;", "cryptoOrderMonetizationModel", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "orderPrices", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "side", "Lcom/robinhood/models/db/OrderSide;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "hasSeenPdtWarning", "", "tradeBonusEligibility", "Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "shouldReviewOrder", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;", "isSellAllOrder", "selectedTaxLots", "", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$TaxLot;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/db/OrderTimeInForce;ZLcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;ZLjava/util/List;)V", "getPurchaseSize", "()Ljava/math/BigDecimal;", "getOrderPrices", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getHasSeenPdtWarning", "()Z", "getTradeBonusEligibility", "()Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "getShouldReviewOrder", "()Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;", "getSelectedTaxLots", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AsAsset extends RequestInputs {
        public static final int $stable = 8;
        public static final Parcelable.Creator<AsAsset> CREATOR = new Creator();
        private final CryptoOrderMonetizationModel cryptoOrderMonetizationModel;
        private final boolean hasSeenPdtWarning;
        private final boolean isSellAllOrder;
        private final CryptoOrderPrices orderPrices;
        private final BigDecimal purchaseSize;
        private final List<TaxLot> selectedTaxLots;
        private final CryptoOrderUiEvent shouldReviewOrder;
        private final OrderSide side;
        private final OrderTimeInForce timeInForce;
        private final UiCryptoTradeBonusEligibility tradeBonusEligibility;

        /* compiled from: RequestInputs.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AsAsset> {
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final AsAsset createFromParcel(Parcel parcel) {
                int i;
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                CryptoOrderMonetizationModel cryptoOrderMonetizationModel = (CryptoOrderMonetizationModel) parcel.readParcelable(AsAsset.class.getClassLoader());
                CryptoOrderPrices cryptoOrderPrices = (CryptoOrderPrices) parcel.readParcelable(AsAsset.class.getClassLoader());
                OrderSide orderSideValueOf = OrderSide.valueOf(parcel.readString());
                OrderTimeInForce orderTimeInForce = (OrderTimeInForce) parcel.readParcelable(AsAsset.class.getClassLoader());
                boolean z = false;
                if (parcel.readInt() != 0) {
                    i = 0;
                    z = true;
                } else {
                    i = 0;
                }
                UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility = (UiCryptoTradeBonusEligibility) parcel.readParcelable(AsAsset.class.getClassLoader());
                CryptoOrderUiEvent cryptoOrderUiEventCreateFromParcel = parcel.readInt() == 0 ? null : CryptoOrderUiEvent.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt() == 0 ? i : 1;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i3 = parcel.readInt();
                    arrayList = new ArrayList(i3);
                    while (i != i3) {
                        arrayList.add(TaxLot.CREATOR.createFromParcel(parcel));
                        i++;
                    }
                }
                return new AsAsset(bigDecimal, cryptoOrderMonetizationModel, cryptoOrderPrices, orderSideValueOf, orderTimeInForce, z, uiCryptoTradeBonusEligibility, cryptoOrderUiEventCreateFromParcel, i2, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AsAsset[] newArray(int i) {
                return new AsAsset[i];
            }
        }

        /* renamed from: component2, reason: from getter */
        private final CryptoOrderMonetizationModel getCryptoOrderMonetizationModel() {
            return this.cryptoOrderMonetizationModel;
        }

        public static /* synthetic */ AsAsset copy$default(AsAsset asAsset, BigDecimal bigDecimal, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, CryptoOrderPrices cryptoOrderPrices, OrderSide orderSide, OrderTimeInForce orderTimeInForce, boolean z, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, CryptoOrderUiEvent cryptoOrderUiEvent, boolean z2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = asAsset.purchaseSize;
            }
            if ((i & 2) != 0) {
                cryptoOrderMonetizationModel = asAsset.cryptoOrderMonetizationModel;
            }
            if ((i & 4) != 0) {
                cryptoOrderPrices = asAsset.orderPrices;
            }
            if ((i & 8) != 0) {
                orderSide = asAsset.side;
            }
            if ((i & 16) != 0) {
                orderTimeInForce = asAsset.timeInForce;
            }
            if ((i & 32) != 0) {
                z = asAsset.hasSeenPdtWarning;
            }
            if ((i & 64) != 0) {
                uiCryptoTradeBonusEligibility = asAsset.tradeBonusEligibility;
            }
            if ((i & 128) != 0) {
                cryptoOrderUiEvent = asAsset.shouldReviewOrder;
            }
            if ((i & 256) != 0) {
                z2 = asAsset.isSellAllOrder;
            }
            if ((i & 512) != 0) {
                list = asAsset.selectedTaxLots;
            }
            boolean z3 = z2;
            List list2 = list;
            UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility2 = uiCryptoTradeBonusEligibility;
            CryptoOrderUiEvent cryptoOrderUiEvent2 = cryptoOrderUiEvent;
            OrderTimeInForce orderTimeInForce2 = orderTimeInForce;
            boolean z4 = z;
            return asAsset.copy(bigDecimal, cryptoOrderMonetizationModel, cryptoOrderPrices, orderSide, orderTimeInForce2, z4, uiCryptoTradeBonusEligibility2, cryptoOrderUiEvent2, z3, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getPurchaseSize() {
            return this.purchaseSize;
        }

        public final List<TaxLot> component10() {
            return this.selectedTaxLots;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoOrderPrices getOrderPrices() {
            return this.orderPrices;
        }

        /* renamed from: component4, reason: from getter */
        public final OrderSide getSide() {
            return this.side;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getHasSeenPdtWarning() {
            return this.hasSeenPdtWarning;
        }

        /* renamed from: component7, reason: from getter */
        public final UiCryptoTradeBonusEligibility getTradeBonusEligibility() {
            return this.tradeBonusEligibility;
        }

        /* renamed from: component8, reason: from getter */
        public final CryptoOrderUiEvent getShouldReviewOrder() {
            return this.shouldReviewOrder;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsSellAllOrder() {
            return this.isSellAllOrder;
        }

        public final AsAsset copy(BigDecimal purchaseSize, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, CryptoOrderPrices orderPrices, OrderSide side, OrderTimeInForce timeInForce, boolean hasSeenPdtWarning, UiCryptoTradeBonusEligibility tradeBonusEligibility, CryptoOrderUiEvent shouldReviewOrder, boolean isSellAllOrder, List<TaxLot> selectedTaxLots) {
            Intrinsics.checkNotNullParameter(purchaseSize, "purchaseSize");
            Intrinsics.checkNotNullParameter(orderPrices, "orderPrices");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            return new AsAsset(purchaseSize, cryptoOrderMonetizationModel, orderPrices, side, timeInForce, hasSeenPdtWarning, tradeBonusEligibility, shouldReviewOrder, isSellAllOrder, selectedTaxLots);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AsAsset)) {
                return false;
            }
            AsAsset asAsset = (AsAsset) other;
            return Intrinsics.areEqual(this.purchaseSize, asAsset.purchaseSize) && Intrinsics.areEqual(this.cryptoOrderMonetizationModel, asAsset.cryptoOrderMonetizationModel) && Intrinsics.areEqual(this.orderPrices, asAsset.orderPrices) && this.side == asAsset.side && this.timeInForce == asAsset.timeInForce && this.hasSeenPdtWarning == asAsset.hasSeenPdtWarning && Intrinsics.areEqual(this.tradeBonusEligibility, asAsset.tradeBonusEligibility) && Intrinsics.areEqual(this.shouldReviewOrder, asAsset.shouldReviewOrder) && this.isSellAllOrder == asAsset.isSellAllOrder && Intrinsics.areEqual(this.selectedTaxLots, asAsset.selectedTaxLots);
        }

        public int hashCode() {
            int iHashCode = this.purchaseSize.hashCode() * 31;
            CryptoOrderMonetizationModel cryptoOrderMonetizationModel = this.cryptoOrderMonetizationModel;
            int iHashCode2 = (((((((((iHashCode + (cryptoOrderMonetizationModel == null ? 0 : cryptoOrderMonetizationModel.hashCode())) * 31) + this.orderPrices.hashCode()) * 31) + this.side.hashCode()) * 31) + this.timeInForce.hashCode()) * 31) + Boolean.hashCode(this.hasSeenPdtWarning)) * 31;
            UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility = this.tradeBonusEligibility;
            int iHashCode3 = (iHashCode2 + (uiCryptoTradeBonusEligibility == null ? 0 : uiCryptoTradeBonusEligibility.hashCode())) * 31;
            CryptoOrderUiEvent cryptoOrderUiEvent = this.shouldReviewOrder;
            int iHashCode4 = (((iHashCode3 + (cryptoOrderUiEvent == null ? 0 : cryptoOrderUiEvent.hashCode())) * 31) + Boolean.hashCode(this.isSellAllOrder)) * 31;
            List<TaxLot> list = this.selectedTaxLots;
            return iHashCode4 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "AsAsset(purchaseSize=" + this.purchaseSize + ", cryptoOrderMonetizationModel=" + this.cryptoOrderMonetizationModel + ", orderPrices=" + this.orderPrices + ", side=" + this.side + ", timeInForce=" + this.timeInForce + ", hasSeenPdtWarning=" + this.hasSeenPdtWarning + ", tradeBonusEligibility=" + this.tradeBonusEligibility + ", shouldReviewOrder=" + this.shouldReviewOrder + ", isSellAllOrder=" + this.isSellAllOrder + ", selectedTaxLots=" + this.selectedTaxLots + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.purchaseSize);
            dest.writeParcelable(this.cryptoOrderMonetizationModel, flags);
            dest.writeParcelable(this.orderPrices, flags);
            dest.writeString(this.side.name());
            dest.writeParcelable(this.timeInForce, flags);
            dest.writeInt(this.hasSeenPdtWarning ? 1 : 0);
            dest.writeParcelable(this.tradeBonusEligibility, flags);
            CryptoOrderUiEvent cryptoOrderUiEvent = this.shouldReviewOrder;
            if (cryptoOrderUiEvent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cryptoOrderUiEvent.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isSellAllOrder ? 1 : 0);
            List<TaxLot> list = this.selectedTaxLots;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<TaxLot> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ AsAsset(BigDecimal bigDecimal, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, CryptoOrderPrices cryptoOrderPrices, OrderSide orderSide, OrderTimeInForce orderTimeInForce, boolean z, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, CryptoOrderUiEvent cryptoOrderUiEvent, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bigDecimal, (i & 2) != 0 ? null : cryptoOrderMonetizationModel, cryptoOrderPrices, orderSide, orderTimeInForce, z, (i & 64) != 0 ? null : uiCryptoTradeBonusEligibility, (i & 128) != 0 ? null : cryptoOrderUiEvent, z2, (i & 512) != 0 ? null : list);
        }

        public final BigDecimal getPurchaseSize() {
            return this.purchaseSize;
        }

        @Override // com.robinhood.shared.trade.crypto.validation.RequestInputs
        public CryptoOrderPrices getOrderPrices() {
            return this.orderPrices;
        }

        @Override // com.robinhood.shared.trade.crypto.validation.RequestInputs
        public OrderSide getSide() {
            return this.side;
        }

        @Override // com.robinhood.shared.trade.crypto.validation.RequestInputs
        public OrderTimeInForce getTimeInForce() {
            return this.timeInForce;
        }

        @Override // com.robinhood.shared.trade.crypto.validation.RequestInputs
        public boolean getHasSeenPdtWarning() {
            return this.hasSeenPdtWarning;
        }

        @Override // com.robinhood.shared.trade.crypto.validation.RequestInputs
        public UiCryptoTradeBonusEligibility getTradeBonusEligibility() {
            return this.tradeBonusEligibility;
        }

        @Override // com.robinhood.shared.trade.crypto.validation.RequestInputs
        public CryptoOrderUiEvent getShouldReviewOrder() {
            return this.shouldReviewOrder;
        }

        public final boolean isSellAllOrder() {
            return this.isSellAllOrder;
        }

        public final List<TaxLot> getSelectedTaxLots() {
            return this.selectedTaxLots;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public AsAsset(BigDecimal purchaseSize, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, CryptoOrderPrices orderPrices, OrderSide side, OrderTimeInForce timeInForce, boolean z, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, CryptoOrderUiEvent cryptoOrderUiEvent, boolean z2, List<TaxLot> list) {
            MonetizationModel monetizationModel;
            Intrinsics.checkNotNullParameter(purchaseSize, "purchaseSize");
            Intrinsics.checkNotNullParameter(orderPrices, "orderPrices");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
            super(orderPrices, side, timeInForce, z, uiCryptoTradeBonusEligibility, cryptoOrderUiEvent, (cryptoOrderMonetizationModel == null || (monetizationModel = cryptoOrderMonetizationModel.getMonetizationModel()) == null) ? MonetizationModel.REBATE : monetizationModel, cryptoOrderMonetizationModel != null ? cryptoOrderMonetizationModel.getMonetizationModel() : null, null);
            this.purchaseSize = purchaseSize;
            this.cryptoOrderMonetizationModel = cryptoOrderMonetizationModel;
            this.orderPrices = orderPrices;
            this.side = side;
            this.timeInForce = timeInForce;
            this.hasSeenPdtWarning = z;
            this.tradeBonusEligibility = uiCryptoTradeBonusEligibility;
            this.shouldReviewOrder = cryptoOrderUiEvent;
            this.isSellAllOrder = z2;
            this.selectedTaxLots = list;
        }
    }

    /* compiled from: RequestInputs.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$TaxLot;", "Landroid/os/Parcelable;", "id", "Ljava/util/UUID;", "quantity", "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/UUID;Ljava/math/BigDecimal;)V", "getId", "()Ljava/util/UUID;", "getQuantity", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TaxLot implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<TaxLot> CREATOR = new Creator();
        private final UUID id;
        private final BigDecimal quantity;

        /* compiled from: RequestInputs.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<TaxLot> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TaxLot createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxLot((UUID) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TaxLot[] newArray(int i) {
                return new TaxLot[i];
            }
        }

        public static /* synthetic */ TaxLot copy$default(TaxLot taxLot, UUID uuid, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = taxLot.id;
            }
            if ((i & 2) != 0) {
                bigDecimal = taxLot.quantity;
            }
            return taxLot.copy(uuid, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final TaxLot copy(UUID id, BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            return new TaxLot(id, quantity);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TaxLot)) {
                return false;
            }
            TaxLot taxLot = (TaxLot) other;
            return Intrinsics.areEqual(this.id, taxLot.id) && Intrinsics.areEqual(this.quantity, taxLot.quantity);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.quantity.hashCode();
        }

        public String toString() {
            return "TaxLot(id=" + this.id + ", quantity=" + this.quantity + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.id);
            dest.writeSerializable(this.quantity);
        }

        public TaxLot(UUID id, BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            this.id = id;
            this.quantity = quantity;
        }

        public final UUID getId() {
            return this.id;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }
    }

    public final CryptoInputMode getInputMode() {
        if (this instanceof AsQuote) {
            return CryptoInputMode.QUOTE_CURRENCY;
        }
        if (this instanceof AsAsset) {
            return CryptoInputMode.ASSET_CURRENCY;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final CryptoOrderContext.EntryType getEntryType() {
        if (this instanceof AsQuote) {
            return CryptoOrderContext.EntryType.QUOTE;
        }
        if (this instanceof AsAsset) {
            return CryptoOrderContext.EntryType.ASSET;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final CryptoAccountSwitcherLocation.WithCurrencyPair cryptoAccountSwitcherLocation(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        int i = WhenMappings.$EnumSwitchMapping$0[getSide().ordinal()];
        if (i == 1) {
            return new CryptoAccountSwitcherLocation.Buy(currencyPairId);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (this instanceof AsAsset) {
            return new CryptoAccountSwitcherLocation.SellAsset(currencyPairId);
        }
        if (this instanceof AsQuote) {
            return new CryptoAccountSwitcherLocation.SellQuote(currencyPairId);
        }
        throw new NoWhenBranchMatchedException();
    }
}
