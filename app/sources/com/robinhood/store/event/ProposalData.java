package com.robinhood.store.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.models.event.p186db.SharedEventQuote;
import com.robinhood.android.models.event.p186db.order.EventOrderPositionEffect;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposable2;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventComboStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u001aJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r¨\u0006'"}, m3636d2 = {"Lcom/robinhood/store/event/ProposalData;", "Lcom/robinhood/android/models/event/db/SharedEventQuote;", "yesBid", "Lcom/robinhood/store/event/ProposalData$Proposal;", "noBid", "<init>", "(Lcom/robinhood/store/event/ProposalData$Proposal;Lcom/robinhood/store/event/ProposalData$Proposal;)V", "getYesBid", "()Lcom/robinhood/store/event/ProposalData$Proposal;", "getNoBid", "yesAskPrice", "Ljava/math/BigDecimal;", "getYesAskPrice", "()Ljava/math/BigDecimal;", "noAskPrice", "getNoAskPrice", "yesBidPrice", "getYesBidPrice", "noBidPrice", "getNoBidPrice", "buyMorePrice", "getBuyMorePrice", PnlTradeDetailComposable2.TEST_TAG_CLOSE_PRICE, "getClosePrice", "getProposal", "side", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Proposal", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class ProposalData implements SharedEventQuote {
    private final Proposal noBid;
    private final Proposal yesBid;

    /* compiled from: EventComboStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventOrderSide.values().length];
            try {
                iArr[EventOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ ProposalData copy$default(ProposalData proposalData, Proposal proposal, Proposal proposal2, int i, Object obj) {
        if ((i & 1) != 0) {
            proposal = proposalData.yesBid;
        }
        if ((i & 2) != 0) {
            proposal2 = proposalData.noBid;
        }
        return proposalData.copy(proposal, proposal2);
    }

    /* renamed from: component1, reason: from getter */
    public final Proposal getYesBid() {
        return this.yesBid;
    }

    /* renamed from: component2, reason: from getter */
    public final Proposal getNoBid() {
        return this.noBid;
    }

    public final ProposalData copy(Proposal yesBid, Proposal noBid) {
        return new ProposalData(yesBid, noBid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProposalData)) {
            return false;
        }
        ProposalData proposalData = (ProposalData) other;
        return Intrinsics.areEqual(this.yesBid, proposalData.yesBid) && Intrinsics.areEqual(this.noBid, proposalData.noBid);
    }

    public int hashCode() {
        Proposal proposal = this.yesBid;
        int iHashCode = (proposal == null ? 0 : proposal.hashCode()) * 31;
        Proposal proposal2 = this.noBid;
        return iHashCode + (proposal2 != null ? proposal2.hashCode() : 0);
    }

    public String toString() {
        return "ProposalData(yesBid=" + this.yesBid + ", noBid=" + this.noBid + ")";
    }

    public ProposalData(Proposal proposal, Proposal proposal2) {
        this.yesBid = proposal;
        this.noBid = proposal2;
    }

    @Override // com.robinhood.android.models.event.p186db.SharedEventQuote
    public BigDecimal getAskPrice(EventOrderPositionEffect eventOrderPositionEffect, EventOrderSide eventOrderSide) {
        return SharedEventQuote.DefaultImpls.getAskPrice(this, eventOrderPositionEffect, eventOrderSide);
    }

    @Override // com.robinhood.android.models.event.p186db.SharedEventQuote
    public BigDecimal getAskPriceWithContractSide(ContractSide contractSide) {
        return SharedEventQuote.DefaultImpls.getAskPriceWithContractSide(this, contractSide);
    }

    @Override // com.robinhood.android.models.event.p186db.SharedEventQuote
    public BigDecimal getBidPrice(EventOrderPositionEffect eventOrderPositionEffect, EventOrderSide eventOrderSide) {
        return SharedEventQuote.DefaultImpls.getBidPrice(this, eventOrderPositionEffect, eventOrderSide);
    }

    @Override // com.robinhood.android.models.event.p186db.SharedEventQuote
    public BigDecimal getBidPriceWithContractSide(ContractSide contractSide) {
        return SharedEventQuote.DefaultImpls.getBidPriceWithContractSide(this, contractSide);
    }

    @Override // com.robinhood.android.models.event.p186db.SharedEventQuote
    public BigDecimal getDisplayQuotePrice(EventOrderPositionEffect eventOrderPositionEffect, EventOrderSide eventOrderSide) {
        return SharedEventQuote.DefaultImpls.getDisplayQuotePrice(this, eventOrderPositionEffect, eventOrderSide);
    }

    @Override // com.robinhood.android.models.event.p186db.SharedEventQuote
    public BigDecimal getOrderSubmissionPrice(EventOrderSide eventOrderSide) {
        return SharedEventQuote.DefaultImpls.getOrderSubmissionPrice(this, eventOrderSide);
    }

    public final Proposal getYesBid() {
        return this.yesBid;
    }

    public final Proposal getNoBid() {
        return this.noBid;
    }

    @Override // com.robinhood.android.models.event.p186db.SharedEventQuote
    public BigDecimal getYesAskPrice() {
        BigDecimal price;
        Proposal proposal = this.noBid;
        if (proposal == null || (price = proposal.getPrice()) == null) {
            return null;
        }
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalSubtract = ONE.subtract(price);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    @Override // com.robinhood.android.models.event.p186db.SharedEventQuote
    public BigDecimal getNoAskPrice() {
        BigDecimal price;
        Proposal proposal = this.yesBid;
        if (proposal == null || (price = proposal.getPrice()) == null) {
            return null;
        }
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalSubtract = ONE.subtract(price);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    @Override // com.robinhood.android.models.event.p186db.SharedEventQuote
    public BigDecimal getYesBidPrice() {
        Proposal proposal = this.yesBid;
        if (proposal != null) {
            return proposal.getPrice();
        }
        return null;
    }

    @Override // com.robinhood.android.models.event.p186db.SharedEventQuote
    public BigDecimal getNoBidPrice() {
        Proposal proposal = this.noBid;
        if (proposal != null) {
            return proposal.getPrice();
        }
        return null;
    }

    public final BigDecimal getBuyMorePrice() {
        if (this.noBid == null) {
            return null;
        }
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalSubtract = ONE.subtract(this.noBid.getPrice());
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    public final BigDecimal getClosePrice() {
        Proposal proposal = this.yesBid;
        if (proposal != null) {
            return proposal.getPrice();
        }
        return null;
    }

    /* compiled from: EventComboStore.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/store/event/ProposalData$Proposal;", "", "quoteId", "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "quantity", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getQuoteId", "()Ljava/lang/String;", "getPrice", "()Ljava/math/BigDecimal;", "getQuantity", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Proposal {
        private final BigDecimal price;
        private final BigDecimal quantity;
        private final String quoteId;

        public static /* synthetic */ Proposal copy$default(Proposal proposal, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = proposal.quoteId;
            }
            if ((i & 2) != 0) {
                bigDecimal = proposal.price;
            }
            if ((i & 4) != 0) {
                bigDecimal2 = proposal.quantity;
            }
            return proposal.copy(str, bigDecimal, bigDecimal2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getQuoteId() {
            return this.quoteId;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final Proposal copy(String quoteId, BigDecimal price, BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(quoteId, "quoteId");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            return new Proposal(quoteId, price, quantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Proposal)) {
                return false;
            }
            Proposal proposal = (Proposal) other;
            return Intrinsics.areEqual(this.quoteId, proposal.quoteId) && Intrinsics.areEqual(this.price, proposal.price) && Intrinsics.areEqual(this.quantity, proposal.quantity);
        }

        public int hashCode() {
            return (((this.quoteId.hashCode() * 31) + this.price.hashCode()) * 31) + this.quantity.hashCode();
        }

        public String toString() {
            return "Proposal(quoteId=" + this.quoteId + ", price=" + this.price + ", quantity=" + this.quantity + ")";
        }

        public Proposal(String quoteId, BigDecimal price, BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(quoteId, "quoteId");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            this.quoteId = quoteId;
            this.price = price;
            this.quantity = quantity;
        }

        public final String getQuoteId() {
            return this.quoteId;
        }

        public final BigDecimal getPrice() {
            return this.price;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }
    }

    public final Proposal getProposal(EventOrderSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            return this.noBid;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.yesBid;
    }
}
