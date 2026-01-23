package com.robinhood.android.transfers.p271ui.max.i18n;

import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferEvent;
import com.robinhood.models.crypto.p314db.BrokerageBalances;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PdtWarningCheck.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/PdtWarningCheck;", "", "<init>", "()V", "hasShownWarning", "", "check", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent;", "input", "Lcom/robinhood/android/transfers/ui/max/i18n/PdtWarningCheck$Input;", "Input", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PdtWarningCheck {
    public static final int $stable = 8;
    private boolean hasShownWarning;

    /* compiled from: PdtWarningCheck.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/PdtWarningCheck$Input;", "", "amount", "Ljava/math/BigDecimal;", "brokerageBalances", "Lcom/robinhood/models/crypto/db/BrokerageBalances;", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Lcom/robinhood/models/db/Portfolio;", "transferDirection", "Lcom/robinhood/models/db/TransferDirection;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/crypto/db/BrokerageBalances;Lcom/robinhood/models/db/Portfolio;Lcom/robinhood/models/db/TransferDirection;)V", "getAmount", "()Ljava/math/BigDecimal;", "getBrokerageBalances", "()Lcom/robinhood/models/crypto/db/BrokerageBalances;", "getPortfolio", "()Lcom/robinhood/models/db/Portfolio;", "getTransferDirection", "()Lcom/robinhood/models/db/TransferDirection;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Input {
        public static final int $stable = 8;
        private final BigDecimal amount;
        private final BrokerageBalances brokerageBalances;
        private final Portfolio portfolio;
        private final TransferDirection transferDirection;

        public static /* synthetic */ Input copy$default(Input input, BigDecimal bigDecimal, BrokerageBalances brokerageBalances, Portfolio portfolio, TransferDirection transferDirection, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = input.amount;
            }
            if ((i & 2) != 0) {
                brokerageBalances = input.brokerageBalances;
            }
            if ((i & 4) != 0) {
                portfolio = input.portfolio;
            }
            if ((i & 8) != 0) {
                transferDirection = input.transferDirection;
            }
            return input.copy(bigDecimal, brokerageBalances, portfolio, transferDirection);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageBalances getBrokerageBalances() {
            return this.brokerageBalances;
        }

        /* renamed from: component3, reason: from getter */
        public final Portfolio getPortfolio() {
            return this.portfolio;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferDirection getTransferDirection() {
            return this.transferDirection;
        }

        public final Input copy(BigDecimal amount, BrokerageBalances brokerageBalances, Portfolio portfolio, TransferDirection transferDirection) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
            return new Input(amount, brokerageBalances, portfolio, transferDirection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.areEqual(this.amount, input.amount) && Intrinsics.areEqual(this.brokerageBalances, input.brokerageBalances) && Intrinsics.areEqual(this.portfolio, input.portfolio) && this.transferDirection == input.transferDirection;
        }

        public int hashCode() {
            int iHashCode = this.amount.hashCode() * 31;
            BrokerageBalances brokerageBalances = this.brokerageBalances;
            int iHashCode2 = (iHashCode + (brokerageBalances == null ? 0 : brokerageBalances.hashCode())) * 31;
            Portfolio portfolio = this.portfolio;
            return ((iHashCode2 + (portfolio != null ? portfolio.hashCode() : 0)) * 31) + this.transferDirection.hashCode();
        }

        public String toString() {
            return "Input(amount=" + this.amount + ", brokerageBalances=" + this.brokerageBalances + ", portfolio=" + this.portfolio + ", transferDirection=" + this.transferDirection + ")";
        }

        public Input(BigDecimal amount, BrokerageBalances brokerageBalances, Portfolio portfolio, TransferDirection transferDirection) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
            this.amount = amount;
            this.brokerageBalances = brokerageBalances;
            this.portfolio = portfolio;
            this.transferDirection = transferDirection;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final BrokerageBalances getBrokerageBalances() {
            return this.brokerageBalances;
        }

        public final Portfolio getPortfolio() {
            return this.portfolio;
        }

        public final TransferDirection getTransferDirection() {
            return this.transferDirection;
        }
    }

    public final InternationalTransferEvent check(Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.hasShownWarning || input.getTransferDirection() != TransferDirection.WITHDRAW || input.getBrokerageBalances() == null || input.getPortfolio() == null || !input.getBrokerageBalances().isPatternDayTrader()) {
            return null;
        }
        BigDecimal bigDecimalSubtract = input.getPortfolio().getEquity().subtract(input.getAmount());
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        if (bigDecimalSubtract.compareTo(Portfolio.MINIMUM_BALANCE_FOR_PDT_EXEMPTION) >= 0) {
            return null;
        }
        this.hasShownWarning = true;
        int i = C30383R.id.dialog_id_ach_transfer_pdt_warning;
        StringResource.Companion companion = StringResource.INSTANCE;
        return new InternationalTransferEvent.ShowTransferCreationGenericError(i, null, companion.invoke(C30383R.string.margin_day_trade_pdt_withdrawal_warning, companion.invoke(C8179R.string.account_type_individual, new Object[0])), companion.invoke(C11048R.string.general_label_ok, new Object[0]), null, 16, null);
    }
}
