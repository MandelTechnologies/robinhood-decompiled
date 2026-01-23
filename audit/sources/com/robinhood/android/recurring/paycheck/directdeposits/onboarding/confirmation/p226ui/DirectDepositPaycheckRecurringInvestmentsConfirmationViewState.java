package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.p226ui;

import com.robinhood.android.common.directdeposit.C11131R;
import com.robinhood.android.common.directdeposit.DirectDepositSource;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositPaycheckRecurringInvestmentsConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÂ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/confirmation/ui/DirectDepositPaycheckRecurringInvestmentsConfirmationViewState;", "", "directDepositSource", "Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "paycheckInvestmentSchedule", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "symbol", "", "<init>", "(Lcom/robinhood/android/common/directdeposit/DirectDepositSource;Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;Ljava/lang/String;)V", "description", "Lcom/robinhood/utils/resource/StringResource;", "getDescription", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-recurring-paycheck-dd-onboarding-confirmation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DirectDepositPaycheckRecurringInvestmentsConfirmationViewState {
    private final DirectDepositSource directDepositSource;
    private final UiPaycheckInvestmentSchedule paycheckInvestmentSchedule;
    private final String symbol;

    /* compiled from: DirectDepositPaycheckRecurringInvestmentsConfirmationViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DirectDepositSource.values().length];
            try {
                iArr[DirectDepositSource.ALREADY_SET_UP_DD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DirectDepositSource.MANUAL_ACCOUNT_ROUTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DirectDepositSource.MANUAL_FORM_HR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DirectDepositSource.SWITCHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final DirectDepositSource getDirectDepositSource() {
        return this.directDepositSource;
    }

    /* renamed from: component2, reason: from getter */
    private final UiPaycheckInvestmentSchedule getPaycheckInvestmentSchedule() {
        return this.paycheckInvestmentSchedule;
    }

    /* renamed from: component3, reason: from getter */
    private final String getSymbol() {
        return this.symbol;
    }

    public static /* synthetic */ DirectDepositPaycheckRecurringInvestmentsConfirmationViewState copy$default(DirectDepositPaycheckRecurringInvestmentsConfirmationViewState directDepositPaycheckRecurringInvestmentsConfirmationViewState, DirectDepositSource directDepositSource, UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            directDepositSource = directDepositPaycheckRecurringInvestmentsConfirmationViewState.directDepositSource;
        }
        if ((i & 2) != 0) {
            uiPaycheckInvestmentSchedule = directDepositPaycheckRecurringInvestmentsConfirmationViewState.paycheckInvestmentSchedule;
        }
        if ((i & 4) != 0) {
            str = directDepositPaycheckRecurringInvestmentsConfirmationViewState.symbol;
        }
        return directDepositPaycheckRecurringInvestmentsConfirmationViewState.copy(directDepositSource, uiPaycheckInvestmentSchedule, str);
    }

    public final DirectDepositPaycheckRecurringInvestmentsConfirmationViewState copy(DirectDepositSource directDepositSource, UiPaycheckInvestmentSchedule paycheckInvestmentSchedule, String symbol) {
        Intrinsics.checkNotNullParameter(directDepositSource, "directDepositSource");
        return new DirectDepositPaycheckRecurringInvestmentsConfirmationViewState(directDepositSource, paycheckInvestmentSchedule, symbol);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectDepositPaycheckRecurringInvestmentsConfirmationViewState)) {
            return false;
        }
        DirectDepositPaycheckRecurringInvestmentsConfirmationViewState directDepositPaycheckRecurringInvestmentsConfirmationViewState = (DirectDepositPaycheckRecurringInvestmentsConfirmationViewState) other;
        return this.directDepositSource == directDepositPaycheckRecurringInvestmentsConfirmationViewState.directDepositSource && Intrinsics.areEqual(this.paycheckInvestmentSchedule, directDepositPaycheckRecurringInvestmentsConfirmationViewState.paycheckInvestmentSchedule) && Intrinsics.areEqual(this.symbol, directDepositPaycheckRecurringInvestmentsConfirmationViewState.symbol);
    }

    public int hashCode() {
        int iHashCode = this.directDepositSource.hashCode() * 31;
        UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule = this.paycheckInvestmentSchedule;
        int iHashCode2 = (iHashCode + (uiPaycheckInvestmentSchedule == null ? 0 : uiPaycheckInvestmentSchedule.hashCode())) * 31;
        String str = this.symbol;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DirectDepositPaycheckRecurringInvestmentsConfirmationViewState(directDepositSource=" + this.directDepositSource + ", paycheckInvestmentSchedule=" + this.paycheckInvestmentSchedule + ", symbol=" + this.symbol + ")";
    }

    public DirectDepositPaycheckRecurringInvestmentsConfirmationViewState(DirectDepositSource directDepositSource, UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule, String str) {
        Intrinsics.checkNotNullParameter(directDepositSource, "directDepositSource");
        this.directDepositSource = directDepositSource;
        this.paycheckInvestmentSchedule = uiPaycheckInvestmentSchedule;
        this.symbol = str;
    }

    public /* synthetic */ DirectDepositPaycheckRecurringInvestmentsConfirmationViewState(DirectDepositSource directDepositSource, UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(directDepositSource, (i & 2) != 0 ? null : uiPaycheckInvestmentSchedule, (i & 4) != 0 ? null : str);
    }

    public final StringResource getDescription() {
        int i;
        UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule = this.paycheckInvestmentSchedule;
        if (uiPaycheckInvestmentSchedule == null || this.symbol == null) {
            return null;
        }
        InvestmentScheduleAmount investmentScheduleAmount = uiPaycheckInvestmentSchedule.getInvestmentScheduleAmount();
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.directDepositSource.ordinal()];
        if (i2 == 1) {
            i = C11131R.string.f3980x27cc51ef;
        } else if (i2 == 2 || i2 == 3) {
            if (investmentScheduleAmount instanceof InvestmentScheduleAmount.Dollar) {
                i = C11131R.string.f3982x28d25acc;
            } else {
                if (!(investmentScheduleAmount instanceof InvestmentScheduleAmount.Percentage)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C11131R.string.f3983x22be2e83;
            }
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (investmentScheduleAmount instanceof InvestmentScheduleAmount.Dollar) {
                i = C11131R.string.f3984x9e55841c;
            } else {
                if (!(investmentScheduleAmount instanceof InvestmentScheduleAmount.Percentage)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C11131R.string.f3985xa69c0733;
            }
        }
        return companion.invoke(i, investmentScheduleAmount.format(), this.symbol);
    }
}
