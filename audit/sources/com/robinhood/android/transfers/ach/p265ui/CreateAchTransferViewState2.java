package com.robinhood.android.transfers.ach.p265ui;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.transfers.ach.C30082R;
import com.robinhood.android.transfers.lib.C30383R;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreateAchTransferViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ValidationResult;", "", "<init>", "()V", "Valid", "Invalid", "Companion", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Valid;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.ValidationResult, reason: use source file name */
/* loaded from: classes9.dex */
public abstract class CreateAchTransferViewState2 {
    public static final int $stable = 0;
    private static final String TAG_MARGIN_UPGRADE = "marginUpgradeDialog";
    private static final String TAG_WITHDRAWAL_ERROR_MARGIN = "withdrawal-error-margin";
    private static final String TAG_WITHDRAWAL_ERROR_PENDING_ORDERS = "withdrawal-error-pending-orders";
    private static final String TAG_WITHDRAWAL_ERROR_PENDING_ORDERS_AND_MARGIN = "withdrawal-error-pending-orders-and-margin";
    private static final String TAG_WITHDRAWAL_EXCEEDS_LIMIT = "withdrawal-exceeds-limit";
    private static final String TAG_WITHDRAWAL_EXCEEDS_MARGIN_RECOMMENDED = "withdrawal-exceeds-margin-amount";
    private static final String TAG_WITHDRAWAL_GENERIC_ERROR = "withdrawal-general-error";

    public /* synthetic */ CreateAchTransferViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CreateAchTransferViewState2() {
    }

    /* compiled from: CreateAchTransferViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Valid;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult;", "amount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.ValidationResult$Valid, reason: from toString */
    public static final /* data */ class Valid extends CreateAchTransferViewState2 {
        public static final int $stable = 8;
        private final BigDecimal amount;

        public static /* synthetic */ Valid copy$default(Valid valid, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = valid.amount;
            }
            return valid.copy(bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final Valid copy(BigDecimal amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            return new Valid(amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Valid) && Intrinsics.areEqual(this.amount, ((Valid) other).amount);
        }

        public int hashCode() {
            return this.amount.hashCode();
        }

        public String toString() {
            return "Valid(amount=" + this.amount + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Valid(BigDecimal amount) {
            super(null);
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.amount = amount;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }
    }

    /* compiled from: CreateAchTransferViewState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019B%\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0007\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult;", "dialogId", "", "title", "fragmentTag", "", "<init>", "(IILjava/lang/String;)V", "getDialogId", "()I", "getTitle", "getFragmentTag", "()Ljava/lang/String;", "getMessage", "resources", "Landroid/content/res/Resources;", "getPositiveButton", "getNegativeButton", "DepositBelowMarginMin", "WithdrawalExceedsMarginRecommended", "WithdrawalExceedsLimit", "WithdrawalErrorPendingOrders", "WithdrawalErrorGoldTier", "WithdrawalErrorPendingOrdersAndGoldTier", "WithdrawalGenericError", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid$DepositBelowMarginMin;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid$WithdrawalErrorGoldTier;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid$WithdrawalErrorPendingOrders;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid$WithdrawalErrorPendingOrdersAndGoldTier;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid$WithdrawalExceedsLimit;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid$WithdrawalExceedsMarginRecommended;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid$WithdrawalGenericError;", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ach.ui.ValidationResult$Invalid */
    public static abstract class Invalid extends CreateAchTransferViewState2 {
        public static final int $stable = 0;
        private final int dialogId;
        private final String fragmentTag;
        private final int title;

        public /* synthetic */ Invalid(int i, int i2, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, str);
        }

        public abstract String getMessage(Resources resources);

        public String getNegativeButton(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            return null;
        }

        public String getPositiveButton(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            return null;
        }

        public final int getDialogId() {
            return this.dialogId;
        }

        public final int getTitle() {
            return this.title;
        }

        public final String getFragmentTag() {
            return this.fragmentTag;
        }

        private Invalid(int i, int i2, String str) {
            super(null);
            this.dialogId = i;
            this.title = i2;
            this.fragmentTag = str;
        }

        /* compiled from: CreateAchTransferViewState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid$DepositBelowMarginMin;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid;", "minAmount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getMessage", "", "resources", "Landroid/content/res/Resources;", "getPositiveButton", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.transfers.ach.ui.ValidationResult$Invalid$DepositBelowMarginMin, reason: from toString */
        public static final /* data */ class DepositBelowMarginMin extends Invalid {
            public static final int $stable = 8;
            private final BigDecimal minAmount;

            /* renamed from: component1, reason: from getter */
            private final BigDecimal getMinAmount() {
                return this.minAmount;
            }

            public static /* synthetic */ DepositBelowMarginMin copy$default(DepositBelowMarginMin depositBelowMarginMin, BigDecimal bigDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = depositBelowMarginMin.minAmount;
                }
                return depositBelowMarginMin.copy(bigDecimal);
            }

            public final DepositBelowMarginMin copy(BigDecimal minAmount) {
                return new DepositBelowMarginMin(minAmount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DepositBelowMarginMin) && Intrinsics.areEqual(this.minAmount, ((DepositBelowMarginMin) other).minAmount);
            }

            public int hashCode() {
                BigDecimal bigDecimal = this.minAmount;
                if (bigDecimal == null) {
                    return 0;
                }
                return bigDecimal.hashCode();
            }

            public String toString() {
                return "DepositBelowMarginMin(minAmount=" + this.minAmount + ")";
            }

            public DepositBelowMarginMin(BigDecimal bigDecimal) {
                super(C30383R.id.dialog_id_ach_transfer_margin_upgrade_min_amount, C30383R.string.margin_upgrade_min_amount_dialog_title, CreateAchTransferViewState2.TAG_MARGIN_UPGRADE, null);
                this.minAmount = bigDecimal;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getMessage(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                int i = C30383R.string.margin_upgrade_min_amount_dialog_msg;
                BigDecimal bigDecimal = this.minAmount;
                String string2 = resources.getString(i, bigDecimal != null ? Formats.getCurrencyFormat().format(bigDecimal) : null);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getPositiveButton(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C11048R.string.general_label_ok);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
        }

        /* compiled from: CreateAchTransferViewState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid$WithdrawalExceedsMarginRecommended;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid;", "amount", "Ljava/math/BigDecimal;", "recommendedAmount", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getMessage", "", "resources", "Landroid/content/res/Resources;", "getPositiveButton", "getNegativeButton", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ach.ui.ValidationResult$Invalid$WithdrawalExceedsMarginRecommended, reason: from toString */
        public static final /* data */ class WithdrawalExceedsMarginRecommended extends Invalid {
            public static final int $stable = 8;
            private final BigDecimal amount;
            private final BigDecimal recommendedAmount;

            /* renamed from: component1, reason: from getter */
            private final BigDecimal getAmount() {
                return this.amount;
            }

            /* renamed from: component2, reason: from getter */
            private final BigDecimal getRecommendedAmount() {
                return this.recommendedAmount;
            }

            public static /* synthetic */ WithdrawalExceedsMarginRecommended copy$default(WithdrawalExceedsMarginRecommended withdrawalExceedsMarginRecommended, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = withdrawalExceedsMarginRecommended.amount;
                }
                if ((i & 2) != 0) {
                    bigDecimal2 = withdrawalExceedsMarginRecommended.recommendedAmount;
                }
                return withdrawalExceedsMarginRecommended.copy(bigDecimal, bigDecimal2);
            }

            public final WithdrawalExceedsMarginRecommended copy(BigDecimal amount, BigDecimal recommendedAmount) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
                return new WithdrawalExceedsMarginRecommended(amount, recommendedAmount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WithdrawalExceedsMarginRecommended)) {
                    return false;
                }
                WithdrawalExceedsMarginRecommended withdrawalExceedsMarginRecommended = (WithdrawalExceedsMarginRecommended) other;
                return Intrinsics.areEqual(this.amount, withdrawalExceedsMarginRecommended.amount) && Intrinsics.areEqual(this.recommendedAmount, withdrawalExceedsMarginRecommended.recommendedAmount);
            }

            public int hashCode() {
                return (this.amount.hashCode() * 31) + this.recommendedAmount.hashCode();
            }

            public String toString() {
                return "WithdrawalExceedsMarginRecommended(amount=" + this.amount + ", recommendedAmount=" + this.recommendedAmount + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithdrawalExceedsMarginRecommended(BigDecimal amount, BigDecimal recommendedAmount) {
                super(C30383R.id.dialog_id_ach_transfer_market_volatility, C30383R.string.ach_transfer_error_market_volatility_title, CreateAchTransferViewState2.TAG_WITHDRAWAL_EXCEEDS_MARGIN_RECOMMENDED, null);
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
                this.amount = amount;
                this.recommendedAmount = recommendedAmount;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getMessage(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C30383R.string.ach_transfer_error_market_volatility_summary, Formats.getCurrencyFormat().format(this.recommendedAmount));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getPositiveButton(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C30383R.string.ach_transfer_error_market_volatility_positive_action, Formats.getCurrencyFormat().format(this.amount));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getNegativeButton(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C11048R.string.general_label_cancel);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
        }

        /* compiled from: CreateAchTransferViewState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid$WithdrawalExceedsLimit;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid;", "maxTransferSize", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getMessage", "", "resources", "Landroid/content/res/Resources;", "getPositiveButton", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ach.ui.ValidationResult$Invalid$WithdrawalExceedsLimit, reason: from toString */
        public static final /* data */ class WithdrawalExceedsLimit extends Invalid {
            public static final int $stable = 8;
            private final BigDecimal maxTransferSize;

            /* renamed from: component1, reason: from getter */
            private final BigDecimal getMaxTransferSize() {
                return this.maxTransferSize;
            }

            public static /* synthetic */ WithdrawalExceedsLimit copy$default(WithdrawalExceedsLimit withdrawalExceedsLimit, BigDecimal bigDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = withdrawalExceedsLimit.maxTransferSize;
                }
                return withdrawalExceedsLimit.copy(bigDecimal);
            }

            public final WithdrawalExceedsLimit copy(BigDecimal maxTransferSize) {
                Intrinsics.checkNotNullParameter(maxTransferSize, "maxTransferSize");
                return new WithdrawalExceedsLimit(maxTransferSize);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WithdrawalExceedsLimit) && Intrinsics.areEqual(this.maxTransferSize, ((WithdrawalExceedsLimit) other).maxTransferSize);
            }

            public int hashCode() {
                return this.maxTransferSize.hashCode();
            }

            public String toString() {
                return "WithdrawalExceedsLimit(maxTransferSize=" + this.maxTransferSize + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithdrawalExceedsLimit(BigDecimal maxTransferSize) {
                super(C30082R.id.dialog_id_ach_transfer_limit, C30082R.string.ach_transfer_error_not_enough_funds_title, CreateAchTransferViewState2.TAG_WITHDRAWAL_EXCEEDS_LIMIT, null);
                Intrinsics.checkNotNullParameter(maxTransferSize, "maxTransferSize");
                this.maxTransferSize = maxTransferSize;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getMessage(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C30383R.string.transfer_error_limit, this.maxTransferSize.toPlainString());
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getPositiveButton(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C11048R.string.general_label_dismiss);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
        }

        /* compiled from: CreateAchTransferViewState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid$WithdrawalErrorPendingOrders;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid;", "amount", "Ljava/math/BigDecimal;", "withdrawalLimit", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getMessage", "", "resources", "Landroid/content/res/Resources;", "getPositiveButton", "getNegativeButton", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ach.ui.ValidationResult$Invalid$WithdrawalErrorPendingOrders, reason: from toString */
        public static final /* data */ class WithdrawalErrorPendingOrders extends Invalid {
            public static final int $stable = 8;
            private final BigDecimal amount;
            private final BigDecimal withdrawalLimit;

            /* renamed from: component1, reason: from getter */
            private final BigDecimal getAmount() {
                return this.amount;
            }

            /* renamed from: component2, reason: from getter */
            private final BigDecimal getWithdrawalLimit() {
                return this.withdrawalLimit;
            }

            public static /* synthetic */ WithdrawalErrorPendingOrders copy$default(WithdrawalErrorPendingOrders withdrawalErrorPendingOrders, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = withdrawalErrorPendingOrders.amount;
                }
                if ((i & 2) != 0) {
                    bigDecimal2 = withdrawalErrorPendingOrders.withdrawalLimit;
                }
                return withdrawalErrorPendingOrders.copy(bigDecimal, bigDecimal2);
            }

            public final WithdrawalErrorPendingOrders copy(BigDecimal amount, BigDecimal withdrawalLimit) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(withdrawalLimit, "withdrawalLimit");
                return new WithdrawalErrorPendingOrders(amount, withdrawalLimit);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WithdrawalErrorPendingOrders)) {
                    return false;
                }
                WithdrawalErrorPendingOrders withdrawalErrorPendingOrders = (WithdrawalErrorPendingOrders) other;
                return Intrinsics.areEqual(this.amount, withdrawalErrorPendingOrders.amount) && Intrinsics.areEqual(this.withdrawalLimit, withdrawalErrorPendingOrders.withdrawalLimit);
            }

            public int hashCode() {
                return (this.amount.hashCode() * 31) + this.withdrawalLimit.hashCode();
            }

            public String toString() {
                return "WithdrawalErrorPendingOrders(amount=" + this.amount + ", withdrawalLimit=" + this.withdrawalLimit + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithdrawalErrorPendingOrders(BigDecimal amount, BigDecimal withdrawalLimit) {
                super(C30082R.id.dialog_id_ach_transfer_pending_orders, C30082R.string.ach_transfer_error_not_enough_funds_title, CreateAchTransferViewState2.TAG_WITHDRAWAL_ERROR_PENDING_ORDERS, null);
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(withdrawalLimit, "withdrawalLimit");
                this.amount = amount;
                this.withdrawalLimit = withdrawalLimit;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getMessage(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C30082R.string.ach_transfer_error_pending_orders, Formats.getCurrencyFormat().format(this.withdrawalLimit), Formats.getCurrencyFormat().format(this.amount));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getPositiveButton(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C11048R.string.general_label_dismiss);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getNegativeButton(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C30082R.string.ach_transfer_error_pending_orders_action);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
        }

        /* compiled from: CreateAchTransferViewState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid$WithdrawalErrorGoldTier;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid;", "amount", "Ljava/math/BigDecimal;", "withdrawalLimit", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getMessage", "", "resources", "Landroid/content/res/Resources;", "getPositiveButton", "getNegativeButton", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ach.ui.ValidationResult$Invalid$WithdrawalErrorGoldTier, reason: from toString */
        public static final /* data */ class WithdrawalErrorGoldTier extends Invalid {
            public static final int $stable = 8;
            private final BigDecimal amount;
            private final BigDecimal withdrawalLimit;

            /* renamed from: component1, reason: from getter */
            private final BigDecimal getAmount() {
                return this.amount;
            }

            /* renamed from: component2, reason: from getter */
            private final BigDecimal getWithdrawalLimit() {
                return this.withdrawalLimit;
            }

            public static /* synthetic */ WithdrawalErrorGoldTier copy$default(WithdrawalErrorGoldTier withdrawalErrorGoldTier, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = withdrawalErrorGoldTier.amount;
                }
                if ((i & 2) != 0) {
                    bigDecimal2 = withdrawalErrorGoldTier.withdrawalLimit;
                }
                return withdrawalErrorGoldTier.copy(bigDecimal, bigDecimal2);
            }

            public final WithdrawalErrorGoldTier copy(BigDecimal amount, BigDecimal withdrawalLimit) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(withdrawalLimit, "withdrawalLimit");
                return new WithdrawalErrorGoldTier(amount, withdrawalLimit);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WithdrawalErrorGoldTier)) {
                    return false;
                }
                WithdrawalErrorGoldTier withdrawalErrorGoldTier = (WithdrawalErrorGoldTier) other;
                return Intrinsics.areEqual(this.amount, withdrawalErrorGoldTier.amount) && Intrinsics.areEqual(this.withdrawalLimit, withdrawalErrorGoldTier.withdrawalLimit);
            }

            public int hashCode() {
                return (this.amount.hashCode() * 31) + this.withdrawalLimit.hashCode();
            }

            public String toString() {
                return "WithdrawalErrorGoldTier(amount=" + this.amount + ", withdrawalLimit=" + this.withdrawalLimit + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithdrawalErrorGoldTier(BigDecimal amount, BigDecimal withdrawalLimit) {
                super(C30082R.id.dialog_id_ach_transfer_gold_tier, C30082R.string.ach_transfer_error_not_enough_funds_title, CreateAchTransferViewState2.TAG_WITHDRAWAL_ERROR_MARGIN, null);
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(withdrawalLimit, "withdrawalLimit");
                this.amount = amount;
                this.withdrawalLimit = withdrawalLimit;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getMessage(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C30082R.string.ach_transfer_error_gold_tier, Formats.getCurrencyFormat().format(this.withdrawalLimit), Formats.getCurrencyFormat().format(this.amount));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getPositiveButton(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C11048R.string.general_label_dismiss);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getNegativeButton(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C30082R.string.ach_transfer_error_gold_tier_action);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
        }

        /* compiled from: CreateAchTransferViewState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid$WithdrawalErrorPendingOrdersAndGoldTier;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid;", "amount", "Ljava/math/BigDecimal;", "withdrawalLimit", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getMessage", "", "resources", "Landroid/content/res/Resources;", "getPositiveButton", "getNegativeButton", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ach.ui.ValidationResult$Invalid$WithdrawalErrorPendingOrdersAndGoldTier, reason: from toString */
        public static final /* data */ class WithdrawalErrorPendingOrdersAndGoldTier extends Invalid {
            public static final int $stable = 8;
            private final BigDecimal amount;
            private final BigDecimal withdrawalLimit;

            /* renamed from: component1, reason: from getter */
            private final BigDecimal getAmount() {
                return this.amount;
            }

            /* renamed from: component2, reason: from getter */
            private final BigDecimal getWithdrawalLimit() {
                return this.withdrawalLimit;
            }

            public static /* synthetic */ WithdrawalErrorPendingOrdersAndGoldTier copy$default(WithdrawalErrorPendingOrdersAndGoldTier withdrawalErrorPendingOrdersAndGoldTier, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = withdrawalErrorPendingOrdersAndGoldTier.amount;
                }
                if ((i & 2) != 0) {
                    bigDecimal2 = withdrawalErrorPendingOrdersAndGoldTier.withdrawalLimit;
                }
                return withdrawalErrorPendingOrdersAndGoldTier.copy(bigDecimal, bigDecimal2);
            }

            public final WithdrawalErrorPendingOrdersAndGoldTier copy(BigDecimal amount, BigDecimal withdrawalLimit) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(withdrawalLimit, "withdrawalLimit");
                return new WithdrawalErrorPendingOrdersAndGoldTier(amount, withdrawalLimit);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WithdrawalErrorPendingOrdersAndGoldTier)) {
                    return false;
                }
                WithdrawalErrorPendingOrdersAndGoldTier withdrawalErrorPendingOrdersAndGoldTier = (WithdrawalErrorPendingOrdersAndGoldTier) other;
                return Intrinsics.areEqual(this.amount, withdrawalErrorPendingOrdersAndGoldTier.amount) && Intrinsics.areEqual(this.withdrawalLimit, withdrawalErrorPendingOrdersAndGoldTier.withdrawalLimit);
            }

            public int hashCode() {
                return (this.amount.hashCode() * 31) + this.withdrawalLimit.hashCode();
            }

            public String toString() {
                return "WithdrawalErrorPendingOrdersAndGoldTier(amount=" + this.amount + ", withdrawalLimit=" + this.withdrawalLimit + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithdrawalErrorPendingOrdersAndGoldTier(BigDecimal amount, BigDecimal withdrawalLimit) {
                super(C30082R.id.dialog_id_ach_transfer_pending_orders_and_gold_tier, C30082R.string.ach_transfer_error_not_enough_funds_title, CreateAchTransferViewState2.TAG_WITHDRAWAL_ERROR_PENDING_ORDERS_AND_MARGIN, null);
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(withdrawalLimit, "withdrawalLimit");
                this.amount = amount;
                this.withdrawalLimit = withdrawalLimit;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getMessage(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C30082R.string.gated_gold_ach_transfer_error_pending_orders_and_gold_tier, Formats.getCurrencyFormat().format(this.withdrawalLimit), Formats.getCurrencyFormat().format(this.amount));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getPositiveButton(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C11048R.string.general_label_dismiss);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getNegativeButton(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C11048R.string.general_action_learn_more);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
        }

        /* compiled from: CreateAchTransferViewState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid$WithdrawalGenericError;", "Lcom/robinhood/android/transfers/ach/ui/ValidationResult$Invalid;", "withdrawalLimit", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getMessage", "", "resources", "Landroid/content/res/Resources;", "getPositiveButton", "getNegativeButton", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ach.ui.ValidationResult$Invalid$WithdrawalGenericError, reason: from toString */
        public static final /* data */ class WithdrawalGenericError extends Invalid {
            public static final int $stable = 8;
            private final BigDecimal withdrawalLimit;

            /* renamed from: component1, reason: from getter */
            private final BigDecimal getWithdrawalLimit() {
                return this.withdrawalLimit;
            }

            public static /* synthetic */ WithdrawalGenericError copy$default(WithdrawalGenericError withdrawalGenericError, BigDecimal bigDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = withdrawalGenericError.withdrawalLimit;
                }
                return withdrawalGenericError.copy(bigDecimal);
            }

            public final WithdrawalGenericError copy(BigDecimal withdrawalLimit) {
                Intrinsics.checkNotNullParameter(withdrawalLimit, "withdrawalLimit");
                return new WithdrawalGenericError(withdrawalLimit);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WithdrawalGenericError) && Intrinsics.areEqual(this.withdrawalLimit, ((WithdrawalGenericError) other).withdrawalLimit);
            }

            public int hashCode() {
                return this.withdrawalLimit.hashCode();
            }

            public String toString() {
                return "WithdrawalGenericError(withdrawalLimit=" + this.withdrawalLimit + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithdrawalGenericError(BigDecimal withdrawalLimit) {
                super(C30082R.id.dialog_id_ach_transfer_generic_withdrawal, C30082R.string.ach_transfer_error_not_enough_funds_title, CreateAchTransferViewState2.TAG_WITHDRAWAL_GENERIC_ERROR, null);
                Intrinsics.checkNotNullParameter(withdrawalLimit, "withdrawalLimit");
                this.withdrawalLimit = withdrawalLimit;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getMessage(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C30082R.string.ach_transfer_error_generic, Formats.getCurrencyFormat().format(this.withdrawalLimit));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getPositiveButton(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C11048R.string.general_label_dismiss);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.transfers.ach.p265ui.CreateAchTransferViewState2.Invalid
            public String getNegativeButton(Resources resources) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(resources, "resources");
                String string2 = resources.getString(C11048R.string.general_action_learn_more);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
        }
    }
}
