package com.robinhood.android.cash.transaction.p079ui.rhytransaction;

import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTransaction;
import com.robinhood.models.p320db.bonfire.InnerRhyTransaction;
import com.robinhood.models.p320db.bonfire.RhyTransaction;
import com.robinhood.models.util.Money;
import com.robinhood.shared.history.formatters.legacy.C39006R;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: RhyTransactionDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState;", "", "Loading", "Loaded", "Companion", "Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState$Loaded;", "Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState$Loading;", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface RhyTransactionDetailViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: RhyTransactionDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState$Loading;", "Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState;", "mock", "Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState$Loaded;", "<init>", "(Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState$Loaded;)V", "getMock", "()Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState$Loaded;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements RhyTransactionDetailViewState {
        public static final int $stable = 8;
        private final Loaded mock;

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Loading copy$default(Loading loading, Loaded loaded, int i, Object obj) {
            if ((i & 1) != 0) {
                loaded = loading.mock;
            }
            return loading.copy(loaded);
        }

        /* renamed from: component1, reason: from getter */
        public final Loaded getMock() {
            return this.mock;
        }

        public final Loading copy(Loaded mock) {
            Intrinsics.checkNotNullParameter(mock, "mock");
            return new Loading(mock);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.mock, ((Loading) other).mock);
        }

        public int hashCode() {
            return this.mock.hashCode();
        }

        public String toString() {
            return "Loading(mock=" + this.mock + ")";
        }

        public Loading(Loaded mock) {
            Intrinsics.checkNotNullParameter(mock, "mock");
            this.mock = mock;
        }

        public /* synthetic */ Loading(Loaded loaded, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? RhyTransactionDetailViewState.INSTANCE.getLoadingMock() : loaded);
        }

        public final Loaded getMock() {
            return this.mock;
        }
    }

    /* compiled from: RhyTransactionDetailViewState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u001c\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState$Loaded;", "Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState;", "transaction", "Lcom/robinhood/models/db/bonfire/RhyTransaction;", "<init>", "(Lcom/robinhood/models/db/bonfire/RhyTransaction;)V", "amount", "", "getAmount", "()Ljava/lang/String;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "status", "getStatus", "originalTransactionAmount", "getOriginalTransactionAmount", "originalTransactionDetails", "getOriginalTransactionDetails", InquiryField.DateField.TYPE, "getDate", "adjustmentType", "getAdjustmentType", "showOriginalTransactionCta", "", "getShowOriginalTransactionCta", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Loaded implements RhyTransactionDetailViewState {
        public static final int $stable = 8;
        private final RhyTransaction transaction;

        /* compiled from: RhyTransactionDetailViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[HistoryTransactionType.values().length];
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_FEDERAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_STATE_CALIFORNIA.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_STATE_MAINE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_STATE_VERMONT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_NRA.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_FEDERAL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_CALIFORNIA.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_MAINE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_STATE_VERMONT.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_NRA.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_MANUAL_ADJUSTMENT.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[HistoryTransactionType.TAX_WITHHOLDING_REVERSAL_MANUAL_ADJUSTMENT.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[HistoryTransactionType.ADJUSTMENT_CREDIT.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[HistoryTransactionType.ADJUSTMENT_DEBIT.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_ADR_FEE_CREDIT.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_GOLD_FEE_CREDIT.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_MARGIN_INTEREST_CREDIT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_NEGATIVE_EQUITY_REPAYMENT_DEBIT.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_NEGATIVE_EQUITY_WRITEOFF.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_REFERRAL_CREDIT.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_REVERSED_ACH_CREDIT.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_WRITEOFF.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_CX_GOODWILL_CREDIT.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_ACAT_FEE_CREDIT.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_OTHER.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_INCOMING_ACAT_FEE_REIMBURSEMENT.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_SETTLEMENT_AGREEMENT_TAXABLE.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_SETTLEMENT_AGREEMENT_NON_TAXABLE.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_OTHER_TAXABLE.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_OTHER_NON_TAXABLE.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_CASH_BACK_OFFERS_CREDIT.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_MERCHANT_OFFERS_CREDIT.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[HistoryTransactionType.AUTOPOST_P2P_REFERRAL_CREDIT.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[HistoryTransactionType.CASH_BALANCE_TRANSFER.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[HistoryTransactionType.CASH_BALANCE_TRANSFER_TAXABLE.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[HistoryTransactionType.CASH_BALANCE_TRANSFER_NON_TAXABLE.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[HistoryTransactionType.FEE.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[HistoryTransactionType.WIRE.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[ApiRhyTransaction.Action.values().length];
                try {
                    iArr2[ApiRhyTransaction.Action.COMPLETE.ordinal()] = 1;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr2[ApiRhyTransaction.Action.CANCEL.ordinal()] = 2;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr2[ApiRhyTransaction.Action.PLACE.ordinal()] = 3;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr2[ApiRhyTransaction.Action.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused42) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[Money.Direction.values().length];
                try {
                    iArr3[Money.Direction.CREDIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr3[Money.Direction.DEBIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused44) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        /* renamed from: component1, reason: from getter */
        private final RhyTransaction getTransaction() {
            return this.transaction;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, RhyTransaction rhyTransaction, int i, Object obj) {
            if ((i & 1) != 0) {
                rhyTransaction = loaded.transaction;
            }
            return loaded.copy(rhyTransaction);
        }

        public final Loaded copy(RhyTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            return new Loaded(transaction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.transaction, ((Loaded) other).transaction);
        }

        public int hashCode() {
            return this.transaction.hashCode();
        }

        public String toString() {
            return "Loaded(transaction=" + this.transaction + ")";
        }

        public Loaded(RhyTransaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.transaction = transaction;
        }

        public final String getAmount() {
            return Money.Adjustment.format$default(this.transaction.getAdjustment(), false, null, 2, null);
        }

        public final StringResource getSubtitle() {
            switch (WhenMappings.$EnumSwitchMapping$0[this.transaction.getTransactionType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    InnerRhyTransaction originalTaxIncurringTransaction = this.transaction.getOriginalTaxIncurringTransaction();
                    String description = originalTaxIncurringTransaction != null ? originalTaxIncurringTransaction.getDescription() : null;
                    if (description == null) {
                        return StringResource.INSTANCE.invoke(C39006R.string.history_rhy_tax_withholding, new Object[0]);
                    }
                    return StringResource.INSTANCE.invoke(C39006R.string.history_rhy_tax_withholding_with_original, description);
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                    return StringResource.INSTANCE.invoke(C39006R.string.history_rhy_adjustment, new Object[0]);
                case 34:
                case 35:
                case 36:
                    return StringResource.INSTANCE.invoke(C39006R.string.history_rhy_cash_balance_transfer, new Object[0]);
                case 37:
                    return StringResource.INSTANCE.invoke(C39006R.string.history_rhy_fee, new Object[0]);
                case 38:
                    return StringResource.INSTANCE.invoke(C39006R.string.history_rhy_wire, new Object[0]);
                default:
                    throw new IllegalStateException(("Unknown transaction type: " + this.transaction.getTransactionType() + " for RHY transaction").toString());
            }
        }

        public final StringResource getStatus() {
            int i = WhenMappings.$EnumSwitchMapping$1[this.transaction.getAction().ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C10421R.string.rhy_transaction_detail_completed, new Object[0]);
            }
            if (i == 2) {
                return StringResource.INSTANCE.invoke(C10421R.string.rhy_transaction_detail_cancelled, new Object[0]);
            }
            if (i == 3) {
                return StringResource.INSTANCE.invoke(C10421R.string.rhy_transaction_detail_pending, new Object[0]);
            }
            if (i == 4) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final String getOriginalTransactionAmount() {
            Money.Adjustment adjustment;
            InnerRhyTransaction originalTaxIncurringTransaction = this.transaction.getOriginalTaxIncurringTransaction();
            if (originalTaxIncurringTransaction == null || (adjustment = originalTaxIncurringTransaction.getAdjustment()) == null) {
                return null;
            }
            return Money.Adjustment.format$default(adjustment, false, null, 2, null);
        }

        public final String getOriginalTransactionDetails() {
            InnerRhyTransaction originalTaxIncurringTransaction = this.transaction.getOriginalTaxIncurringTransaction();
            if (originalTaxIncurringTransaction != null) {
                return originalTaxIncurringTransaction.getDescription();
            }
            return null;
        }

        public final String getDate() {
            return LocalDateFormatter.LONG.format((LocalDateFormatter) Instants.toLocalDate$default(this.transaction.getCreatedAt(), null, 1, null));
        }

        public final StringResource getAdjustmentType() {
            switch (WhenMappings.$EnumSwitchMapping$0[this.transaction.getTransactionType().ordinal()]) {
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                    int i = WhenMappings.$EnumSwitchMapping$2[this.transaction.getDirection().ordinal()];
                    if (i == 1) {
                        return StringResource.INSTANCE.invoke(C10421R.string.rhy_transaction_detail_credit, new Object[0]);
                    }
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return StringResource.INSTANCE.invoke(C10421R.string.rhy_transaction_detail_debit, new Object[0]);
                default:
                    return null;
            }
        }

        public final boolean getShowOriginalTransactionCta() {
            return this.transaction.getOriginalTaxIncurringTransaction() != null;
        }
    }

    /* compiled from: RhyTransactionDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState$Loaded;", "getLoadingMock", "()Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState$Loaded;", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Loaded loadingMock;

        private Companion() {
        }

        static {
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            UUID uuidRandomUUID2 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
            UUID uuidRandomUUID3 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID3, "randomUUID(...)");
            UUID uuidRandomUUID4 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID4, "randomUUID(...)");
            HistoryTransactionType historyTransactionType = HistoryTransactionType.TAX_WITHHOLDING_FEDERAL;
            Currency currency = Currencies.USD;
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            Money money = new Money(currency, ZERO);
            Money.Direction direction = Money.Direction.DEBIT;
            ApiRhyTransaction.Action action = ApiRhyTransaction.Action.COMPLETE;
            Instant instantNow = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            Instant instantNow2 = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow2, "now(...)");
            loadingMock = new Loaded(new RhyTransaction(uuidRandomUUID, new InnerRhyTransaction(uuidRandomUUID2, uuidRandomUUID3, uuidRandomUUID4, historyTransactionType, money, direction, "------- --- -----------", action, instantNow, instantNow2), null));
        }

        public final Loaded getLoadingMock() {
            return loadingMock;
        }
    }
}
