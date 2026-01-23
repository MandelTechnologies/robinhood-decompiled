package com.robinhood.android.optionsexercise.validation;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.extensions.LearnMoresKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.doc.p109ui.photo.DocUploadReviewPdfFragment;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.optionsexercise.OptionExerciseContext;
import com.robinhood.android.optionsexercise.validation.OptionExerciseValidationFailureResolver;
import com.robinhood.common.strings.C32428R;
import com.robinhood.librobinhood.data.store.TraderDayTradeStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.DayTradeCheck;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.resource.StringResource;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: OptionExerciseDayTradeCheck.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0004\u000e\u000f\u0010\u0011B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J(\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bj\u0002`\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/OptionExerciseDayTradeCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailure;", "input", "getOrderErrorForDayTradeBlock", "side", "Lcom/robinhood/models/db/OrderSide;", "PdfBlockExemptFailure", "PdfBlockNotExemptFailure", "DayTradeBlockDueToPdtError", "DayTradeBlockError", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionExerciseDayTradeCheck implements Validator.Check<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
    public static final int $stable = 0;

    /* compiled from: OptionExerciseDayTradeCheck.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayTradeCheck.CheckStatus.values().length];
            try {
                iArr[DayTradeCheck.CheckStatus.f5679OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayTradeCheck.CheckStatus.DAY_TRADE_BLOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DayTradeCheck.CheckStatus.DAY_TRADE_BLOCK_CANCELABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DayTradeCheck.CheckStatus.PDT_BLOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DayTradeCheck.CheckStatus.PDT_BLOCK_CANCELABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> check(OptionExerciseContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getExerciseRequestContext().getOverrideDayTradeChecks()) {
            return null;
        }
        Portfolio equityPortfolio = input.getExerciseRequestContext().getEquityPortfolio();
        TraderDayTradeStore.DayTradeCheckState dayTradeCheck = input.getExerciseRequestContext().getDayTradeCheck();
        if (!(dayTradeCheck instanceof TraderDayTradeStore.DayTradeCheckState.HasValue)) {
            if (dayTradeCheck instanceof TraderDayTradeStore.DayTradeCheckState.SkipBecauseCashAccount) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        DayTradeCheck value = ((TraderDayTradeStore.DayTradeCheckState.HasValue) dayTradeCheck).getValue();
        OrderSide side = input.getSide();
        MarketHours marketHours = input.getExerciseRequestContext().getMarketHours();
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        boolean zIsExtendedHours = marketHours.isExtendedHours(instantNow);
        Boolean cashSweepEnrolled = input.getExerciseRequestContext().getCashSweepEnrolled();
        boolean hasMultipleAccounts = input.getExerciseRequestContext().getHasMultipleAccounts();
        boolean zIsMcwEnabled = input.getExerciseRequestContext().isMcwEnabled();
        DayTradeCheck.CheckStatus checkStatus = value.getCheckStatus(side, zIsExtendedHours);
        int i = WhenMappings.$EnumSwitchMapping$0[checkStatus.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2 || i == 3) {
            return getOrderErrorForDayTradeBlock(input, side);
        }
        if (i == 4 || i == 5) {
            if (equityPortfolio.isExemptFromPdtRules()) {
                return new PdfBlockExemptFailure(input.getExerciseRequestContext().getAccount(), cashSweepEnrolled, hasMultipleAccounts, zIsMcwEnabled);
            }
            return new PdfBlockNotExemptFailure(input.getExerciseRequestContext().getAccount(), cashSweepEnrolled, hasMultipleAccounts, zIsMcwEnabled);
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(checkStatus);
        throw new ExceptionsH();
    }

    private final Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> getOrderErrorForDayTradeBlock(OptionExerciseContext input, OrderSide side) {
        Account.Balances balances = input.getExerciseRequestContext().getAccount().getBalances();
        if (side == OrderSide.SELL) {
            return new DayTradeBlockError(input.getExerciseRequestContext().getAccount(), input.getExerciseRequestContext().getHasMultipleAccounts());
        }
        if (balances.isPatternDayTrader()) {
            return new DayTradeBlockDueToPdtError(input.getExerciseRequestContext().getAccount());
        }
        return new DayTradeBlockError(input.getExerciseRequestContext().getAccount(), input.getExerciseRequestContext().getHasMultipleAccounts());
    }

    /* compiled from: OptionExerciseDayTradeCheck.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B+\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\t\u0010\u001d\u001a\u00020\u0006HÂ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010 \u001a\u00020\bHÂ\u0003J\t\u0010!\u001a\u00020\bHÂ\u0003J8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u000fHÖ\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/OptionExerciseDayTradeCheck$PdfBlockExemptFailure;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailure;", "account", "Lcom/robinhood/models/db/Account;", "cashSweepEnrolled", "", "hasMultipleAccounts", "isMcwEnabled", "<init>", "(Lcom/robinhood/models/db/Account;Ljava/lang/Boolean;ZZ)V", "Ljava/lang/Boolean;", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "resolver", "passthroughArgs", "Landroid/os/Bundle;", "onNegativeResponse", "component1", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "copy", "(Lcom/robinhood/models/db/Account;Ljava/lang/Boolean;ZZ)Lcom/robinhood/android/optionsexercise/validation/OptionExerciseDayTradeCheck$PdfBlockExemptFailure;", "equals", "other", "", "hashCode", "", "toString", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class PdfBlockExemptFailure implements Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
        public static final int $stable = 8;
        private final Account account;
        private final Boolean cashSweepEnrolled;
        private final String checkIdentifier;
        private final boolean hasMultipleAccounts;
        private final boolean isMcwEnabled;

        /* renamed from: component1, reason: from getter */
        private final Account getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        private final Boolean getCashSweepEnrolled() {
            return this.cashSweepEnrolled;
        }

        /* renamed from: component3, reason: from getter */
        private final boolean getHasMultipleAccounts() {
            return this.hasMultipleAccounts;
        }

        /* renamed from: component4, reason: from getter */
        private final boolean getIsMcwEnabled() {
            return this.isMcwEnabled;
        }

        public static /* synthetic */ PdfBlockExemptFailure copy$default(PdfBlockExemptFailure pdfBlockExemptFailure, Account account, Boolean bool, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                account = pdfBlockExemptFailure.account;
            }
            if ((i & 2) != 0) {
                bool = pdfBlockExemptFailure.cashSweepEnrolled;
            }
            if ((i & 4) != 0) {
                z = pdfBlockExemptFailure.hasMultipleAccounts;
            }
            if ((i & 8) != 0) {
                z2 = pdfBlockExemptFailure.isMcwEnabled;
            }
            return pdfBlockExemptFailure.copy(account, bool, z, z2);
        }

        public final PdfBlockExemptFailure copy(Account account, Boolean cashSweepEnrolled, boolean hasMultipleAccounts, boolean isMcwEnabled) {
            Intrinsics.checkNotNullParameter(account, "account");
            return new PdfBlockExemptFailure(account, cashSweepEnrolled, hasMultipleAccounts, isMcwEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PdfBlockExemptFailure)) {
                return false;
            }
            PdfBlockExemptFailure pdfBlockExemptFailure = (PdfBlockExemptFailure) other;
            return Intrinsics.areEqual(this.account, pdfBlockExemptFailure.account) && Intrinsics.areEqual(this.cashSweepEnrolled, pdfBlockExemptFailure.cashSweepEnrolled) && this.hasMultipleAccounts == pdfBlockExemptFailure.hasMultipleAccounts && this.isMcwEnabled == pdfBlockExemptFailure.isMcwEnabled;
        }

        public int hashCode() {
            int iHashCode = this.account.hashCode() * 31;
            Boolean bool = this.cashSweepEnrolled;
            return ((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.hasMultipleAccounts)) * 31) + Boolean.hashCode(this.isMcwEnabled);
        }

        public String toString() {
            return "PdfBlockExemptFailure(account=" + this.account + ", cashSweepEnrolled=" + this.cashSweepEnrolled + ", hasMultipleAccounts=" + this.hasMultipleAccounts + ", isMcwEnabled=" + this.isMcwEnabled + ")";
        }

        public PdfBlockExemptFailure(Account account, Boolean bool, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
            this.cashSweepEnrolled = bool;
            this.hasMultipleAccounts = z;
            this.isMcwEnabled = z2;
            this.checkIdentifier = OptionExerciseValidator.CHECK_ID_OPTION_EXERCISE_PDT_BLOCK_EXEMPT_ERROR;
        }

        public /* synthetic */ PdfBlockExemptFailure(Account account, Boolean bool, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(account, bool, z, (i & 8) != 0 ? false : z2);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(final BaseActivity activity, OptionExerciseContext input) {
            String string2;
            int i;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            final Resources resources = activity.getResources();
            if (this.hasMultipleAccounts) {
                if (this.isMcwEnabled) {
                    i = C24704R.string.mcw_option_exercise_error_pdt_block_message_multiple_accounts;
                } else {
                    i = C24704R.string.option_exercise_error_pdt_block_message_multiple_accounts;
                }
                StringResource inSentence = AccountDisplayNames.getDisplayName(this.account).getWithAccount().getInSentence();
                Intrinsics.checkNotNull(resources);
                string2 = activity.getString(i, inSentence.getText(resources));
            } else if (this.isMcwEnabled) {
                string2 = activity.getString(C24704R.string.mcw_option_exercise_error_pdt_block_message);
            } else {
                string2 = activity.getString(C24704R.string.option_exercise_error_pdt_block_message);
            }
            Intrinsics.checkNotNull(string2);
            if (Intrinsics.areEqual(this.cashSweepEnrolled, Boolean.TRUE)) {
                string2 = string2 + activity.getString(C24704R.string.option_exercise_error_pdt_block_message_cash_sweep_appendix);
            }
            String str = string2;
            RhDialogFragment.Builder title = RhDialogFragment.INSTANCE.create(activity).setTitle(C20649R.string.order_create_error_pdt_title, new Object[0]);
            Intrinsics.checkNotNull(resources);
            RhDialogFragment.Builder negativeButton = title.setMessage(LearnMoresKt.buildTextWithLearnMore$default(resources, str, false, null, false, null, new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.optionsexercise.validation.OptionExerciseDayTradeCheck$PdfBlockExemptFailure$showAlert$$inlined$buildTextWithLearnMore$default$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws Resources.NotFoundException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws Resources.NotFoundException {
                    String string3 = resources.getString(C24704R.string.option_exercise_pdt_help_center);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    Navigators3.showHelpCenterWebViewFragment(activity.getNavigator(), activity, string3);
                }
            }, 1, (DefaultConstructorMarker) null), 4, null)).setId(C24704R.id.dialog_id_exercise_validation_error).setPositiveButton(C32428R.string.exercise_cancel_label, new Object[0]).setNegativeButton(C24704R.string.option_exercise_cta_disable_pdt_protection, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, DocUploadReviewPdfFragment.ERROR_DIALOG_TAG, false, 4, null);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<OptionExerciseContext> onPositiveResponse(OptionExerciseValidationFailureResolver resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return Validator.Action.Abort.INSTANCE;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<OptionExerciseContext> onNegativeResponse(OptionExerciseValidationFailureResolver resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            resolver.launchDayTradeOverview(this.account.getAccountNumber());
            return Validator.Action.Abort.INSTANCE;
        }
    }

    /* compiled from: OptionExerciseDayTradeCheck.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B+\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\t\u0010\u001d\u001a\u00020\u0006HÂ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010 \u001a\u00020\bHÂ\u0003J\t\u0010!\u001a\u00020\bHÂ\u0003J8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u000fHÖ\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/OptionExerciseDayTradeCheck$PdfBlockNotExemptFailure;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailure;", "account", "Lcom/robinhood/models/db/Account;", "cashSweepEnrolled", "", "hasMultipleAccounts", "isMcwEnabled", "<init>", "(Lcom/robinhood/models/db/Account;Ljava/lang/Boolean;ZZ)V", "Ljava/lang/Boolean;", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "resolver", "passthroughArgs", "Landroid/os/Bundle;", "onNegativeResponse", "component1", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "copy", "(Lcom/robinhood/models/db/Account;Ljava/lang/Boolean;ZZ)Lcom/robinhood/android/optionsexercise/validation/OptionExerciseDayTradeCheck$PdfBlockNotExemptFailure;", "equals", "other", "", "hashCode", "", "toString", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class PdfBlockNotExemptFailure implements Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
        public static final int $stable = 8;
        private final Account account;
        private final Boolean cashSweepEnrolled;
        private final String checkIdentifier;
        private final boolean hasMultipleAccounts;
        private final boolean isMcwEnabled;

        /* renamed from: component1, reason: from getter */
        private final Account getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        private final Boolean getCashSweepEnrolled() {
            return this.cashSweepEnrolled;
        }

        /* renamed from: component3, reason: from getter */
        private final boolean getHasMultipleAccounts() {
            return this.hasMultipleAccounts;
        }

        /* renamed from: component4, reason: from getter */
        private final boolean getIsMcwEnabled() {
            return this.isMcwEnabled;
        }

        public static /* synthetic */ PdfBlockNotExemptFailure copy$default(PdfBlockNotExemptFailure pdfBlockNotExemptFailure, Account account, Boolean bool, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                account = pdfBlockNotExemptFailure.account;
            }
            if ((i & 2) != 0) {
                bool = pdfBlockNotExemptFailure.cashSweepEnrolled;
            }
            if ((i & 4) != 0) {
                z = pdfBlockNotExemptFailure.hasMultipleAccounts;
            }
            if ((i & 8) != 0) {
                z2 = pdfBlockNotExemptFailure.isMcwEnabled;
            }
            return pdfBlockNotExemptFailure.copy(account, bool, z, z2);
        }

        public final PdfBlockNotExemptFailure copy(Account account, Boolean cashSweepEnrolled, boolean hasMultipleAccounts, boolean isMcwEnabled) {
            Intrinsics.checkNotNullParameter(account, "account");
            return new PdfBlockNotExemptFailure(account, cashSweepEnrolled, hasMultipleAccounts, isMcwEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PdfBlockNotExemptFailure)) {
                return false;
            }
            PdfBlockNotExemptFailure pdfBlockNotExemptFailure = (PdfBlockNotExemptFailure) other;
            return Intrinsics.areEqual(this.account, pdfBlockNotExemptFailure.account) && Intrinsics.areEqual(this.cashSweepEnrolled, pdfBlockNotExemptFailure.cashSweepEnrolled) && this.hasMultipleAccounts == pdfBlockNotExemptFailure.hasMultipleAccounts && this.isMcwEnabled == pdfBlockNotExemptFailure.isMcwEnabled;
        }

        public int hashCode() {
            int iHashCode = this.account.hashCode() * 31;
            Boolean bool = this.cashSweepEnrolled;
            return ((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.hasMultipleAccounts)) * 31) + Boolean.hashCode(this.isMcwEnabled);
        }

        public String toString() {
            return "PdfBlockNotExemptFailure(account=" + this.account + ", cashSweepEnrolled=" + this.cashSweepEnrolled + ", hasMultipleAccounts=" + this.hasMultipleAccounts + ", isMcwEnabled=" + this.isMcwEnabled + ")";
        }

        public PdfBlockNotExemptFailure(Account account, Boolean bool, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
            this.cashSweepEnrolled = bool;
            this.hasMultipleAccounts = z;
            this.isMcwEnabled = z2;
            this.checkIdentifier = OptionExerciseValidator.CHECK_ID_OPTION_EXERCISE_PDT_BLOCK_NOT_EXEMPT;
        }

        public /* synthetic */ PdfBlockNotExemptFailure(Account account, Boolean bool, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(account, bool, z, (i & 8) != 0 ? false : z2);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(final BaseActivity activity, OptionExerciseContext input) {
            String string2;
            int i;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            final Resources resources = activity.getResources();
            if (this.hasMultipleAccounts) {
                if (this.isMcwEnabled) {
                    i = C24704R.string.mcw_option_exercise_error_pdt_block_message_multiple_accounts;
                } else {
                    i = C24704R.string.option_exercise_error_pdt_block_message_multiple_accounts;
                }
                StringResource inSentence = AccountDisplayNames.getDisplayName(this.account).getWithAccount().getInSentence();
                Intrinsics.checkNotNull(resources);
                string2 = activity.getString(i, inSentence.getText(resources));
            } else if (this.isMcwEnabled) {
                string2 = activity.getString(C24704R.string.mcw_option_exercise_error_pdt_block_message);
            } else {
                string2 = activity.getString(C24704R.string.option_exercise_error_pdt_block_message);
            }
            Intrinsics.checkNotNull(string2);
            if (Intrinsics.areEqual(this.cashSweepEnrolled, Boolean.TRUE)) {
                string2 = string2 + activity.getString(C24704R.string.option_exercise_error_pdt_block_message_cash_sweep_appendix);
            }
            String str = string2;
            RhDialogFragment.Builder title = RhDialogFragment.INSTANCE.create(activity).setTitle(C20649R.string.order_create_error_pdt_title, new Object[0]);
            Intrinsics.checkNotNull(resources);
            RhDialogFragment.Builder negativeButton = title.setMessage(LearnMoresKt.buildTextWithLearnMore$default(resources, str, false, null, false, null, new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.optionsexercise.validation.OptionExerciseDayTradeCheck$PdfBlockNotExemptFailure$showAlert$$inlined$buildTextWithLearnMore$default$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws Resources.NotFoundException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws Resources.NotFoundException {
                    String string3 = resources.getString(C24704R.string.option_exercise_pdt_help_center);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    Navigators3.showHelpCenterWebViewFragment(activity.getNavigator(), activity, string3);
                }
            }, 1, (DefaultConstructorMarker) null), 4, null)).setImage(C20649R.drawable.svg_ic_pdt_warning).setId(C24704R.id.dialog_id_exercise_validation_error).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Negative).setPositiveButton(C32428R.string.exercise_cancel_label, new Object[0]).setNegativeButton(C24704R.string.option_exercise_cta_disable_pdt_protection, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, DocUploadReviewPdfFragment.ERROR_DIALOG_TAG, false, 4, null);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<OptionExerciseContext> onPositiveResponse(OptionExerciseValidationFailureResolver resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return Validator.Action.Abort.INSTANCE;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<OptionExerciseContext> onNegativeResponse(OptionExerciseValidationFailureResolver resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            resolver.launchDayTradeOverview(this.account.getAccountNumber());
            return Validator.Action.Abort.INSTANCE;
        }
    }

    /* compiled from: OptionExerciseDayTradeCheck.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/OptionExerciseDayTradeCheck$DayTradeBlockDueToPdtError;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailure;", "account", "Lcom/robinhood/models/db/Account;", "<init>", "(Lcom/robinhood/models/db/Account;)V", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "resolver", "passthroughArgs", "Landroid/os/Bundle;", "onNegativeResponse", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DayTradeBlockDueToPdtError implements Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
        public static final int $stable = 8;
        private final Account account;
        private final String checkIdentifier;

        public DayTradeBlockDueToPdtError(Account account) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
            this.checkIdentifier = OptionExerciseValidator.CHECK_ID_OPTION_EXERCISE_DAY_TRADE_BLOCK_DUE_TO_PDT;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(final BaseActivity activity, OptionExerciseContext input) {
            String string2;
            String string3;
            int i;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            final Resources resources = activity.getResources();
            boolean hasMultipleAccounts = input.getExerciseRequestContext().getHasMultipleAccounts();
            boolean zIsMcwEnabled = input.getExerciseRequestContext().isMcwEnabled();
            if (hasMultipleAccounts) {
                int i2 = C24704R.string.option_exercise_day_trade_multiple_account_block_by_pdt_title;
                StringResource inSentence = AccountDisplayNames.getDisplayName(this.account).getWithInvesting().getInSentence();
                Intrinsics.checkNotNull(resources);
                string2 = activity.getString(i2, inSentence.getText(resources));
            } else {
                string2 = activity.getString(C24704R.string.option_exercise_day_trade_block_by_pdt_title);
            }
            Intrinsics.checkNotNull(string2);
            if (hasMultipleAccounts) {
                if (zIsMcwEnabled) {
                    i = C24704R.string.f4808xe720a422;
                } else {
                    i = C24704R.string.option_exercise_day_trade_block_by_pdt_multiple_account_message;
                }
                StringResource inSentence2 = AccountDisplayNames.getDisplayName(this.account).getWithAccount().getInSentence();
                Intrinsics.checkNotNull(resources);
                string3 = activity.getString(i, inSentence2.getText(resources));
            } else if (zIsMcwEnabled) {
                string3 = activity.getString(C24704R.string.mcw_option_exercise_day_trade_block_by_pdt_message);
            } else {
                string3 = activity.getString(C24704R.string.option_exercise_day_trade_block_by_pdt_message);
            }
            Intrinsics.checkNotNull(string3);
            RhDialogFragment.Builder title = RhDialogFragment.INSTANCE.create(activity).setId(C24704R.id.dialog_id_exercise_validation_error).setTitle(string2);
            Intrinsics.checkNotNull(resources);
            RhDialogFragment.Builder negativeButton = title.setMessage(LearnMoresKt.buildTextWithLearnMore$default(resources, string3, false, null, false, null, new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.optionsexercise.validation.OptionExerciseDayTradeCheck$DayTradeBlockDueToPdtError$showAlert$$inlined$buildTextWithLearnMore$default$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws Resources.NotFoundException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws Resources.NotFoundException {
                    String string4 = resources.getString(C24704R.string.option_exercise_pdt_help_center);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    Navigators3.showHelpCenterWebViewFragment(activity.getNavigator(), activity, string4);
                }
            }, 1, (DefaultConstructorMarker) null), 4, null)).setPositiveButton(C11048R.string.general_action_deposit_funds, new Object[0]).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, DocUploadReviewPdfFragment.ERROR_DIALOG_TAG, false, 4, null);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<OptionExerciseContext> onPositiveResponse(OptionExerciseValidationFailureResolver resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            OptionExerciseValidationFailureResolver.DefaultImpls.launchTransfers$default(resolver, null, this.account.getBrokerageAccountType(), ApiTransferAccount.TransferAccountType.INSTANCE.fromBrokerageAccountType(this.account.getBrokerageAccountType()), this.account.getAccountNumberRhs(), 1, null);
            return Validator.Action.Abort.INSTANCE;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<OptionExerciseContext> onNegativeResponse(OptionExerciseValidationFailureResolver resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return Validator.Action.Abort.INSTANCE;
        }
    }

    /* compiled from: OptionExerciseDayTradeCheck.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\t\u0010\u001a\u001a\u00020\u0006HÂ\u0003J\t\u0010\u001b\u001a\u00020\bHÂ\u0003J\u001d\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/validation/OptionExerciseDayTradeCheck$DayTradeBlockError;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailureResolver;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationFailure;", "account", "Lcom/robinhood/models/db/Account;", "hasMultipleAccounts", "", "<init>", "(Lcom/robinhood/models/db/Account;Z)V", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "resolver", "passthroughArgs", "Landroid/os/Bundle;", "onNegativeResponse", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DayTradeBlockError implements Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> {
        public static final int $stable = 8;
        private final Account account;
        private final String checkIdentifier;
        private final boolean hasMultipleAccounts;

        /* renamed from: component1, reason: from getter */
        private final Account getAccount() {
            return this.account;
        }

        /* renamed from: component2, reason: from getter */
        private final boolean getHasMultipleAccounts() {
            return this.hasMultipleAccounts;
        }

        public static /* synthetic */ DayTradeBlockError copy$default(DayTradeBlockError dayTradeBlockError, Account account, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                account = dayTradeBlockError.account;
            }
            if ((i & 2) != 0) {
                z = dayTradeBlockError.hasMultipleAccounts;
            }
            return dayTradeBlockError.copy(account, z);
        }

        public final DayTradeBlockError copy(Account account, boolean hasMultipleAccounts) {
            Intrinsics.checkNotNullParameter(account, "account");
            return new DayTradeBlockError(account, hasMultipleAccounts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DayTradeBlockError)) {
                return false;
            }
            DayTradeBlockError dayTradeBlockError = (DayTradeBlockError) other;
            return Intrinsics.areEqual(this.account, dayTradeBlockError.account) && this.hasMultipleAccounts == dayTradeBlockError.hasMultipleAccounts;
        }

        public int hashCode() {
            return (this.account.hashCode() * 31) + Boolean.hashCode(this.hasMultipleAccounts);
        }

        public String toString() {
            return "DayTradeBlockError(account=" + this.account + ", hasMultipleAccounts=" + this.hasMultipleAccounts + ")";
        }

        public DayTradeBlockError(Account account, boolean z) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
            this.hasMultipleAccounts = z;
            this.checkIdentifier = OptionExerciseValidator.CHECK_ID_OPTION_EXERCISE_DAY_TRADE_BLOCK_ERROR;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(BaseActivity activity, OptionExerciseContext input) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            int i = C24704R.string.option_exercise_day_trade_restricted_message;
            StringResource inSentence = AccountDisplayNames.getDisplayName(this.account).getWithAccount().getInSentence();
            Resources resources = activity.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String string2 = activity.getString(i, inSentence.getText(resources));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(activity).setTitle(C24704R.string.option_exercise_day_trade_restricted_title, new Object[0]).setMessage(string2).setId(C24704R.id.dialog_id_exercise_validation_error).setPositiveButton(C24704R.string.option_exercise_day_trade_restricted_positive_button, new Object[0]).setNegativeButton(C24704R.string.option_exercise_day_trade_restricted_negative_button, new Object[0]);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, DocUploadReviewPdfFragment.ERROR_DIALOG_TAG, false, 4, null);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<OptionExerciseContext> onPositiveResponse(OptionExerciseValidationFailureResolver resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return Validator.Action.Abort.INSTANCE;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<OptionExerciseContext> onNegativeResponse(OptionExerciseValidationFailureResolver resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return Validator.Action.Skip.INSTANCE;
        }
    }
}
