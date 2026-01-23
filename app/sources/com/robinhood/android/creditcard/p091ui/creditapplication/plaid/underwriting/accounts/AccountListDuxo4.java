package com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.accounts;

import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/accounts/AccountListEvent;", "", "Run", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/accounts/AccountListEvent$Run;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListEvent, reason: use source file name */
/* loaded from: classes2.dex */
public interface AccountListDuxo4 {

    /* compiled from: AccountListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/accounts/AccountListEvent$Run;", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/accounts/AccountListEvent;", "fxn", "Lcom/robinhood/android/creditcard/ui/creditapplication/Fxn;", "<init>", "(Lcom/robinhood/android/creditcard/ui/creditapplication/Fxn;)V", "getFxn", "()Lcom/robinhood/android/creditcard/ui/creditapplication/Fxn;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListEvent$Run, reason: from toString */
    public static final /* data */ class Run implements AccountListDuxo4 {
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
}
