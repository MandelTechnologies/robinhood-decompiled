package com.robinhood.android.common.recurring.agreement.paycheck;

import android.text.Spanned;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckRecurringInvestmentAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState;", "", "<init>", "()V", "isLoading", "", "()Z", "isFooterVisible", "AcceptedAgreement", "Loading", "Loaded", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState$AcceptedAgreement;", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState$Loaded;", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState$Loading;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class PaycheckRecurringInvestmentAgreementViewState {
    public static final int $stable = 0;
    private final boolean isFooterVisible;
    private final boolean isLoading;

    public /* synthetic */ PaycheckRecurringInvestmentAgreementViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaycheckRecurringInvestmentAgreementViewState() {
        this.isLoading = true;
    }

    /* renamed from: isLoading, reason: from getter */
    public boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: isFooterVisible, reason: from getter */
    public boolean getIsFooterVisible() {
        return this.isFooterVisible;
    }

    /* compiled from: PaycheckRecurringInvestmentAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState$AcceptedAgreement;", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AcceptedAgreement extends PaycheckRecurringInvestmentAgreementViewState {
        public static final int $stable = 0;
        public static final AcceptedAgreement INSTANCE = new AcceptedAgreement();

        private AcceptedAgreement() {
            super(null);
        }
    }

    /* compiled from: PaycheckRecurringInvestmentAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState$Loading;", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState;", "<init>", "()V", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends PaycheckRecurringInvestmentAgreementViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: PaycheckRecurringInvestmentAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState$Loaded;", "Lcom/robinhood/android/common/recurring/agreement/paycheck/PaycheckRecurringInvestmentAgreementViewState;", "title", "", "agreement", "Landroid/text/Spanned;", "<init>", "(Ljava/lang/String;Landroid/text/Spanned;)V", "getTitle", "()Ljava/lang/String;", "getAgreement", "()Landroid/text/Spanned;", "isLoading", "", "()Z", "isFooterVisible", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loaded extends PaycheckRecurringInvestmentAgreementViewState {
        public static final int $stable = 8;
        private final Spanned agreement;
        private final boolean isFooterVisible;
        private final boolean isLoading;
        private final String title;

        public final String getTitle() {
            return this.title;
        }

        public final Spanned getAgreement() {
            return this.agreement;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(String title, Spanned agreement) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(agreement, "agreement");
            this.title = title;
            this.agreement = agreement;
            this.isFooterVisible = true;
        }

        @Override // com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementViewState
        /* renamed from: isLoading, reason: from getter */
        public boolean getIsLoading() {
            return this.isLoading;
        }

        @Override // com.robinhood.android.common.recurring.agreement.paycheck.PaycheckRecurringInvestmentAgreementViewState
        /* renamed from: isFooterVisible, reason: from getter */
        public boolean getIsFooterVisible() {
            return this.isFooterVisible;
        }
    }
}
