package com.robinhood.android.eventcontracts.sharedeventui.combos;

import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.EventOrderPositionEffect;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.store.event.ProposalData;
import com.robinhood.store.event.RfqResult;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.robinhood.websocket.p410dx.models.DxFeedData;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StreamComboQuoteUseCase.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fJ\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;", "", "getDisplayQuotePrice", "Ljava/math/BigDecimal;", "positionEffect", "Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;", "side", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "getSubmissionPrice", "Error", "Proposals", "Timeout", DxFeedData.TYPE_QUOTE, "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult$Error;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult$Proposals;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult$Quote;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult$Timeout;", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.ComboQuoteResult, reason: use source file name */
/* loaded from: classes3.dex */
public interface StreamComboQuoteUseCase3 {

    /* compiled from: StreamComboQuoteUseCase.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.ComboQuoteResult$DefaultImpls */
    public static final class DefaultImpls {
        public static BigDecimal getDisplayQuotePrice(StreamComboQuoteUseCase3 streamComboQuoteUseCase3, EventOrderPositionEffect positionEffect, EventOrderSide side) {
            Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
            Intrinsics.checkNotNullParameter(side, "side");
            return null;
        }

        public static BigDecimal getSubmissionPrice(StreamComboQuoteUseCase3 streamComboQuoteUseCase3, EventOrderSide side) {
            Intrinsics.checkNotNullParameter(side, "side");
            return null;
        }
    }

    BigDecimal getDisplayQuotePrice(EventOrderPositionEffect positionEffect, EventOrderSide side);

    BigDecimal getSubmissionPrice(EventOrderSide side);

    /* compiled from: StreamComboQuoteUseCase.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult$Error;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.ComboQuoteResult$Error, reason: from toString */
    public static final /* data */ class Error implements StreamComboQuoteUseCase3 {
        public static final int $stable = 0;
        private final String message;

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Error copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Error(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.message + ")";
        }

        public Error(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        @Override // com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3
        public BigDecimal getDisplayQuotePrice(EventOrderPositionEffect eventOrderPositionEffect, EventOrderSide eventOrderSide) {
            return DefaultImpls.getDisplayQuotePrice(this, eventOrderPositionEffect, eventOrderSide);
        }

        @Override // com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3
        public BigDecimal getSubmissionPrice(EventOrderSide eventOrderSide) {
            return DefaultImpls.getSubmissionPrice(this, eventOrderSide);
        }

        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: StreamComboQuoteUseCase.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult$Proposals;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;", "rfq", "Lcom/robinhood/store/event/RfqResult$RfqData;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/store/event/ProposalData;", "<init>", "(Lcom/robinhood/store/event/RfqResult$RfqData;Lcom/robinhood/store/event/ProposalData;)V", "getRfq", "()Lcom/robinhood/store/event/RfqResult$RfqData;", "getData", "()Lcom/robinhood/store/event/ProposalData;", "getDisplayQuotePrice", "Ljava/math/BigDecimal;", "positionEffect", "Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;", "side", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "getSubmissionPrice", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.ComboQuoteResult$Proposals, reason: from toString */
    public static final /* data */ class Proposals implements StreamComboQuoteUseCase3 {
        public static final int $stable = 8;
        private final ProposalData data;
        private final RfqResult.RfqData rfq;

        public static /* synthetic */ Proposals copy$default(Proposals proposals, RfqResult.RfqData rfqData, ProposalData proposalData, int i, Object obj) {
            if ((i & 1) != 0) {
                rfqData = proposals.rfq;
            }
            if ((i & 2) != 0) {
                proposalData = proposals.data;
            }
            return proposals.copy(rfqData, proposalData);
        }

        /* renamed from: component1, reason: from getter */
        public final RfqResult.RfqData getRfq() {
            return this.rfq;
        }

        /* renamed from: component2, reason: from getter */
        public final ProposalData getData() {
            return this.data;
        }

        public final Proposals copy(RfqResult.RfqData rfq, ProposalData data) {
            Intrinsics.checkNotNullParameter(rfq, "rfq");
            return new Proposals(rfq, data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Proposals)) {
                return false;
            }
            Proposals proposals = (Proposals) other;
            return Intrinsics.areEqual(this.rfq, proposals.rfq) && Intrinsics.areEqual(this.data, proposals.data);
        }

        public int hashCode() {
            int iHashCode = this.rfq.hashCode() * 31;
            ProposalData proposalData = this.data;
            return iHashCode + (proposalData == null ? 0 : proposalData.hashCode());
        }

        public String toString() {
            return "Proposals(rfq=" + this.rfq + ", data=" + this.data + ")";
        }

        public Proposals(RfqResult.RfqData rfq, ProposalData proposalData) {
            Intrinsics.checkNotNullParameter(rfq, "rfq");
            this.rfq = rfq;
            this.data = proposalData;
        }

        public final RfqResult.RfqData getRfq() {
            return this.rfq;
        }

        public final ProposalData getData() {
            return this.data;
        }

        @Override // com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3
        public BigDecimal getDisplayQuotePrice(EventOrderPositionEffect positionEffect, EventOrderSide side) {
            Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
            Intrinsics.checkNotNullParameter(side, "side");
            ProposalData proposalData = this.data;
            if (proposalData != null) {
                return proposalData.getDisplayQuotePrice(positionEffect, side);
            }
            return null;
        }

        @Override // com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3
        public BigDecimal getSubmissionPrice(EventOrderSide side) {
            Intrinsics.checkNotNullParameter(side, "side");
            ProposalData proposalData = this.data;
            if (proposalData != null) {
                return proposalData.getOrderSubmissionPrice(side);
            }
            return null;
        }
    }

    /* compiled from: StreamComboQuoteUseCase.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult$Timeout;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.ComboQuoteResult$Timeout */
    public static final /* data */ class Timeout implements StreamComboQuoteUseCase3 {
        public static final int $stable = 0;
        public static final Timeout INSTANCE = new Timeout();

        public boolean equals(Object other) {
            return this == other || (other instanceof Timeout);
        }

        public int hashCode() {
            return 1297475727;
        }

        public String toString() {
            return "Timeout";
        }

        private Timeout() {
        }

        @Override // com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3
        public BigDecimal getDisplayQuotePrice(EventOrderPositionEffect eventOrderPositionEffect, EventOrderSide eventOrderSide) {
            return DefaultImpls.getDisplayQuotePrice(this, eventOrderPositionEffect, eventOrderSide);
        }

        @Override // com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3
        public BigDecimal getSubmissionPrice(EventOrderSide eventOrderSide) {
            return DefaultImpls.getSubmissionPrice(this, eventOrderSide);
        }
    }

    /* compiled from: StreamComboQuoteUseCase.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult$Quote;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "<init>", "(Lcom/robinhood/android/models/event/db/marketdata/EventQuote;)V", "getData", "()Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "getDisplayQuotePrice", "Ljava/math/BigDecimal;", "positionEffect", "Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;", "side", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "getSubmissionPrice", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.ComboQuoteResult$Quote, reason: from toString */
    public static final /* data */ class Quote implements StreamComboQuoteUseCase3 {
        public static final int $stable = 8;
        private final EventQuote data;

        public static /* synthetic */ Quote copy$default(Quote quote, EventQuote eventQuote, int i, Object obj) {
            if ((i & 1) != 0) {
                eventQuote = quote.data;
            }
            return quote.copy(eventQuote);
        }

        /* renamed from: component1, reason: from getter */
        public final EventQuote getData() {
            return this.data;
        }

        public final Quote copy(EventQuote data) {
            return new Quote(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Quote) && Intrinsics.areEqual(this.data, ((Quote) other).data);
        }

        public int hashCode() {
            EventQuote eventQuote = this.data;
            if (eventQuote == null) {
                return 0;
            }
            return eventQuote.hashCode();
        }

        public String toString() {
            return "Quote(data=" + this.data + ")";
        }

        public Quote(EventQuote eventQuote) {
            this.data = eventQuote;
        }

        public final EventQuote getData() {
            return this.data;
        }

        @Override // com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3
        public BigDecimal getDisplayQuotePrice(EventOrderPositionEffect positionEffect, EventOrderSide side) {
            Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
            Intrinsics.checkNotNullParameter(side, "side");
            EventQuote eventQuote = this.data;
            if (eventQuote != null) {
                return eventQuote.getDisplayQuotePrice(positionEffect, side);
            }
            return null;
        }

        @Override // com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3
        public BigDecimal getSubmissionPrice(EventOrderSide side) {
            Intrinsics.checkNotNullParameter(side, "side");
            EventQuote eventQuote = this.data;
            if (eventQuote != null) {
                return eventQuote.getOrderSubmissionPrice(side);
            }
            return null;
        }
    }
}
