package com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.accounts;

import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo4;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.ManageCreditApplicationAssetReportResponse;
import com.robinhood.android.models.creditcard.api.plaid.underwriting.Account;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$onAccountSelected$1", m3645f = "AccountListDuxo.kt", m3646l = {37, 43}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$onAccountSelected$1, reason: use source file name */
/* loaded from: classes2.dex */
final class AccountListDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Account $account;
    int label;
    final /* synthetic */ AccountListDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountListDuxo2(AccountListDuxo accountListDuxo, Account account, Continuation<? super AccountListDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = accountListDuxo;
        this.$account = account;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountListDuxo2(this.this$0, this.$account, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountListDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: AccountListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/accounts/AccountListViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$onAccountSelected$1$1", m3645f = "AccountListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$onAccountSelected$1$1 */
    static final class C124921 extends ContinuationImpl7 implements Function2<AccountListViewState, Continuation<? super AccountListViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C124921(Continuation<? super C124921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C124921 c124921 = new C124921(continuation);
            c124921.L$0 = obj;
            return c124921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountListViewState accountListViewState, Continuation<? super AccountListViewState> continuation) {
            return ((C124921) create(accountListViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((AccountListViewState) this.L$0).copy(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r6.startReportStatusPolling(r1, r5) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C124921(null));
            CreditCardStore creditCardStore = this.this$0.creditCardStore;
            Account account = this.$account;
            this.label = 1;
            obj = creditCardStore.createAssetReport(account, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        ManageCreditApplicationAssetReportResponse.Response.ManageCreditApplicationAssetReport manageCreditApplicationAssetReport = (ManageCreditApplicationAssetReportResponse.Response.ManageCreditApplicationAssetReport) obj;
        String updatedAccountLinkId = manageCreditApplicationAssetReport != null ? manageCreditApplicationAssetReport.getUpdatedAccountLinkId() : null;
        String plaidLinkToken = manageCreditApplicationAssetReport != null ? manageCreditApplicationAssetReport.getPlaidLinkToken() : null;
        if (updatedAccountLinkId != null && plaidLinkToken != null) {
            this.this$0.submit(new AccountListDuxo4.Run(new CreditApplicationDuxo8.PlaidSdkScreen(plaidLinkToken, this.$account.getId(), updatedAccountLinkId)));
        } else {
            AccountListDuxo accountListDuxo = this.this$0;
            Account account2 = this.$account;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
