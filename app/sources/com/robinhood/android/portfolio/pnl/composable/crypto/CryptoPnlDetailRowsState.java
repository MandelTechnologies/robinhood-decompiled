package com.robinhood.android.portfolio.pnl.composable.crypto;

import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossOrderDetails;
import com.robinhood.models.util.Money;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoPnlDetails.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003Ja\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/composable/crypto/CryptoPnlDetailRowsState;", "", "quantity", "Ljava/math/BigDecimal;", "openAmount", "Lcom/robinhood/models/util/Money;", "openAveragePrice", "closeAmount", "closeAveragePrice", "realizedProfitAndLoss", "realizedProfitAndLossPercentage", "realizedProfitAndLossExcludesTransfers", "", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;Z)V", "realizedGainLossItemComponent", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$CryptoOrderDetails$RealizedGainLossItemComponent;", "(Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossOrderDetails$CryptoOrderDetails$RealizedGainLossItemComponent;Z)V", "getQuantity", "()Ljava/math/BigDecimal;", "getOpenAmount", "()Lcom/robinhood/models/util/Money;", "getOpenAveragePrice", "getCloseAmount", "getCloseAveragePrice", "getRealizedProfitAndLoss", "getRealizedProfitAndLossPercentage", "getRealizedProfitAndLossExcludesTransfers", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-profit-and-loss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
final /* data */ class CryptoPnlDetailRowsState {
    private final Money closeAmount;
    private final Money closeAveragePrice;
    private final Money openAmount;
    private final Money openAveragePrice;
    private final BigDecimal quantity;
    private final Money realizedProfitAndLoss;
    private final boolean realizedProfitAndLossExcludesTransfers;
    private final BigDecimal realizedProfitAndLossPercentage;

    public static /* synthetic */ CryptoPnlDetailRowsState copy$default(CryptoPnlDetailRowsState cryptoPnlDetailRowsState, BigDecimal bigDecimal, Money money, Money money2, Money money3, Money money4, Money money5, BigDecimal bigDecimal2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = cryptoPnlDetailRowsState.quantity;
        }
        if ((i & 2) != 0) {
            money = cryptoPnlDetailRowsState.openAmount;
        }
        if ((i & 4) != 0) {
            money2 = cryptoPnlDetailRowsState.openAveragePrice;
        }
        if ((i & 8) != 0) {
            money3 = cryptoPnlDetailRowsState.closeAmount;
        }
        if ((i & 16) != 0) {
            money4 = cryptoPnlDetailRowsState.closeAveragePrice;
        }
        if ((i & 32) != 0) {
            money5 = cryptoPnlDetailRowsState.realizedProfitAndLoss;
        }
        if ((i & 64) != 0) {
            bigDecimal2 = cryptoPnlDetailRowsState.realizedProfitAndLossPercentage;
        }
        if ((i & 128) != 0) {
            z = cryptoPnlDetailRowsState.realizedProfitAndLossExcludesTransfers;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        boolean z2 = z;
        Money money6 = money4;
        Money money7 = money5;
        return cryptoPnlDetailRowsState.copy(bigDecimal, money, money2, money3, money6, money7, bigDecimal3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getOpenAmount() {
        return this.openAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getOpenAveragePrice() {
        return this.openAveragePrice;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getCloseAmount() {
        return this.closeAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final Money getCloseAveragePrice() {
        return this.closeAveragePrice;
    }

    /* renamed from: component6, reason: from getter */
    public final Money getRealizedProfitAndLoss() {
        return this.realizedProfitAndLoss;
    }

    /* renamed from: component7, reason: from getter */
    public final BigDecimal getRealizedProfitAndLossPercentage() {
        return this.realizedProfitAndLossPercentage;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getRealizedProfitAndLossExcludesTransfers() {
        return this.realizedProfitAndLossExcludesTransfers;
    }

    public final CryptoPnlDetailRowsState copy(BigDecimal quantity, Money openAmount, Money openAveragePrice, Money closeAmount, Money closeAveragePrice, Money realizedProfitAndLoss, BigDecimal realizedProfitAndLossPercentage, boolean realizedProfitAndLossExcludesTransfers) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(closeAmount, "closeAmount");
        Intrinsics.checkNotNullParameter(closeAveragePrice, "closeAveragePrice");
        return new CryptoPnlDetailRowsState(quantity, openAmount, openAveragePrice, closeAmount, closeAveragePrice, realizedProfitAndLoss, realizedProfitAndLossPercentage, realizedProfitAndLossExcludesTransfers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoPnlDetailRowsState)) {
            return false;
        }
        CryptoPnlDetailRowsState cryptoPnlDetailRowsState = (CryptoPnlDetailRowsState) other;
        return Intrinsics.areEqual(this.quantity, cryptoPnlDetailRowsState.quantity) && Intrinsics.areEqual(this.openAmount, cryptoPnlDetailRowsState.openAmount) && Intrinsics.areEqual(this.openAveragePrice, cryptoPnlDetailRowsState.openAveragePrice) && Intrinsics.areEqual(this.closeAmount, cryptoPnlDetailRowsState.closeAmount) && Intrinsics.areEqual(this.closeAveragePrice, cryptoPnlDetailRowsState.closeAveragePrice) && Intrinsics.areEqual(this.realizedProfitAndLoss, cryptoPnlDetailRowsState.realizedProfitAndLoss) && Intrinsics.areEqual(this.realizedProfitAndLossPercentage, cryptoPnlDetailRowsState.realizedProfitAndLossPercentage) && this.realizedProfitAndLossExcludesTransfers == cryptoPnlDetailRowsState.realizedProfitAndLossExcludesTransfers;
    }

    public int hashCode() {
        int iHashCode = this.quantity.hashCode() * 31;
        Money money = this.openAmount;
        int iHashCode2 = (iHashCode + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.openAveragePrice;
        int iHashCode3 = (((((iHashCode2 + (money2 == null ? 0 : money2.hashCode())) * 31) + this.closeAmount.hashCode()) * 31) + this.closeAveragePrice.hashCode()) * 31;
        Money money3 = this.realizedProfitAndLoss;
        int iHashCode4 = (iHashCode3 + (money3 == null ? 0 : money3.hashCode())) * 31;
        BigDecimal bigDecimal = this.realizedProfitAndLossPercentage;
        return ((iHashCode4 + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31) + Boolean.hashCode(this.realizedProfitAndLossExcludesTransfers);
    }

    public String toString() {
        return "CryptoPnlDetailRowsState(quantity=" + this.quantity + ", openAmount=" + this.openAmount + ", openAveragePrice=" + this.openAveragePrice + ", closeAmount=" + this.closeAmount + ", closeAveragePrice=" + this.closeAveragePrice + ", realizedProfitAndLoss=" + this.realizedProfitAndLoss + ", realizedProfitAndLossPercentage=" + this.realizedProfitAndLossPercentage + ", realizedProfitAndLossExcludesTransfers=" + this.realizedProfitAndLossExcludesTransfers + ")";
    }

    public CryptoPnlDetailRowsState(BigDecimal quantity, Money money, Money money2, Money closeAmount, Money closeAveragePrice, Money money3, BigDecimal bigDecimal, boolean z) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(closeAmount, "closeAmount");
        Intrinsics.checkNotNullParameter(closeAveragePrice, "closeAveragePrice");
        this.quantity = quantity;
        this.openAmount = money;
        this.openAveragePrice = money2;
        this.closeAmount = closeAmount;
        this.closeAveragePrice = closeAveragePrice;
        this.realizedProfitAndLoss = money3;
        this.realizedProfitAndLossPercentage = bigDecimal;
        this.realizedProfitAndLossExcludesTransfers = z;
    }

    public /* synthetic */ CryptoPnlDetailRowsState(BigDecimal bigDecimal, Money money, Money money2, Money money3, Money money4, Money money5, BigDecimal bigDecimal2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, money, money2, money3, money4, money5, bigDecimal2, (i & 128) != 0 ? false : z);
    }

    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public final Money getOpenAmount() {
        return this.openAmount;
    }

    public final Money getOpenAveragePrice() {
        return this.openAveragePrice;
    }

    public final Money getCloseAmount() {
        return this.closeAmount;
    }

    public final Money getCloseAveragePrice() {
        return this.closeAveragePrice;
    }

    public final Money getRealizedProfitAndLoss() {
        return this.realizedProfitAndLoss;
    }

    public final BigDecimal getRealizedProfitAndLossPercentage() {
        return this.realizedProfitAndLossPercentage;
    }

    public final boolean getRealizedProfitAndLossExcludesTransfers() {
        return this.realizedProfitAndLossExcludesTransfers;
    }

    public /* synthetic */ CryptoPnlDetailRowsState(ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent realizedGainLossItemComponent, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(realizedGainLossItemComponent, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoPnlDetailRowsState(ProfitAndLossOrderDetails.CryptoOrderDetails.RealizedGainLossItemComponent realizedGainLossItemComponent, boolean z) {
        this(BigDecimals7.orZero(realizedGainLossItemComponent.getQuantity()), realizedGainLossItemComponent.getOpeningAmount(), realizedGainLossItemComponent.getAverageOpenPrice(), realizedGainLossItemComponent.getClosingAmount(), realizedGainLossItemComponent.getAverageClosePrice(), realizedGainLossItemComponent.getRealizedReturn(), realizedGainLossItemComponent.getRealizedReturnPercentage(), z);
        Intrinsics.checkNotNullParameter(realizedGainLossItemComponent, "realizedGainLossItemComponent");
    }
}
