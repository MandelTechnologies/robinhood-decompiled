package com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.additional.verification;

import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.models.creditcard.api.plaid.underwriting.Account;
import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdditionalVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationEvent;", "", "Run", "AccountSelection", BentoAlertSheet6.button2Title, "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationEvent$AccountSelection;", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationEvent$Dismiss;", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationEvent$Run;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationEvent, reason: use source file name */
/* loaded from: classes2.dex */
public interface AdditionalVerificationDuxo4 {

    /* compiled from: AdditionalVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationEvent$Run;", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationEvent;", "fxn", "Lcom/robinhood/android/creditcard/ui/creditapplication/Fxn;", "<init>", "(Lcom/robinhood/android/creditcard/ui/creditapplication/Fxn;)V", "getFxn", "()Lcom/robinhood/android/creditcard/ui/creditapplication/Fxn;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationEvent$Run, reason: from toString */
    public static final /* data */ class Run implements AdditionalVerificationDuxo4 {
        public static final int $stable = 8;
        private final CreditApplicationDuxo8 fxn;

        public static /* synthetic */ Run copy$default(Run run, CreditApplicationDuxo8 creditApplicationDuxo8, int i, Object obj) {
            if ((i & 1) != 0) {
                creditApplicationDuxo8 = run.fxn;
            }
            return run.copy(creditApplicationDuxo8);
        }

        /* renamed from: component1, reason: from getter */
        public final CreditApplicationDuxo8 getFxn() {
            return this.fxn;
        }

        public final Run copy(CreditApplicationDuxo8 fxn) {
            Intrinsics.checkNotNullParameter(fxn, "fxn");
            return new Run(fxn);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Run) && Intrinsics.areEqual(this.fxn, ((Run) other).fxn);
        }

        public int hashCode() {
            return this.fxn.hashCode();
        }

        public String toString() {
            return "Run(fxn=" + this.fxn + ")";
        }

        public Run(CreditApplicationDuxo8 fxn) {
            Intrinsics.checkNotNullParameter(fxn, "fxn");
            this.fxn = fxn;
        }

        public final CreditApplicationDuxo8 getFxn() {
            return this.fxn;
        }
    }

    /* compiled from: AdditionalVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationEvent$AccountSelection;", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationEvent;", "accounts", "", "Lcom/robinhood/android/models/creditcard/api/plaid/underwriting/Account;", "<init>", "(Ljava/util/List;)V", "getAccounts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationEvent$AccountSelection, reason: from toString */
    public static final /* data */ class AccountSelection implements AdditionalVerificationDuxo4 {
        public static final int $stable = 8;
        private final List<Account> accounts;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AccountSelection copy$default(AccountSelection accountSelection, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = accountSelection.accounts;
            }
            return accountSelection.copy(list);
        }

        public final List<Account> component1() {
            return this.accounts;
        }

        public final AccountSelection copy(List<Account> accounts2) {
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            return new AccountSelection(accounts2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccountSelection) && Intrinsics.areEqual(this.accounts, ((AccountSelection) other).accounts);
        }

        public int hashCode() {
            return this.accounts.hashCode();
        }

        public String toString() {
            return "AccountSelection(accounts=" + this.accounts + ")";
        }

        public AccountSelection(List<Account> accounts2) {
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            this.accounts = accounts2;
        }

        public final List<Account> getAccounts() {
            return this.accounts;
        }
    }

    /* compiled from: AdditionalVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationEvent$Dismiss;", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationEvent$Dismiss */
    public static final /* data */ class Dismiss implements AdditionalVerificationDuxo4 {
        public static final int $stable = 0;
        public static final Dismiss INSTANCE = new Dismiss();

        public boolean equals(Object other) {
            return this == other || (other instanceof Dismiss);
        }

        public int hashCode() {
            return 818901228;
        }

        public String toString() {
            return BentoAlertSheet6.button2Title;
        }

        private Dismiss() {
        }
    }
}
