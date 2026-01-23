package com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.accounts;

import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo4;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
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
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$onAddAccountClicked$1", m3645f = "AccountListDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$onAddAccountClicked$1, reason: use source file name */
/* loaded from: classes2.dex */
final class AccountListDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AccountListDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountListDuxo3(AccountListDuxo accountListDuxo, Continuation<? super AccountListDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = accountListDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountListDuxo3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountListDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: AccountListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/accounts/AccountListViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$onAddAccountClicked$1$1", m3645f = "AccountListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$onAddAccountClicked$1$1 */
    static final class C124931 extends ContinuationImpl7 implements Function2<AccountListViewState, Continuation<? super AccountListViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C124931(Continuation<? super C124931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C124931 c124931 = new C124931(continuation);
            c124931.L$0 = obj;
            return c124931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountListViewState accountListViewState, Continuation<? super AccountListViewState> continuation) {
            return ((C124931) create(accountListViewState, continuation)).invokeSuspend(Unit.INSTANCE);
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

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C124931(null));
            CreditCardStore creditCardStore = this.this$0.creditCardStore;
            this.label = 1;
            obj = creditCardStore.getPlaidLinkToken(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        this.this$0.applyMutation(new C124942(null));
        if (str == null) {
            this.this$0.submit(new AccountListDuxo4.Run(CreditApplicationDuxo8.Error.INSTANCE));
        } else {
            this.this$0.submit(new AccountListDuxo4.Run(new CreditApplicationDuxo8.PlaidSdkScreen(str, null, null)));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AccountListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/accounts/AccountListViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$onAddAccountClicked$1$2", m3645f = "AccountListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListDuxo$onAddAccountClicked$1$2 */
    static final class C124942 extends ContinuationImpl7 implements Function2<AccountListViewState, Continuation<? super AccountListViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C124942(Continuation<? super C124942> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C124942 c124942 = new C124942(continuation);
            c124942.L$0 = obj;
            return c124942;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountListViewState accountListViewState, Continuation<? super AccountListViewState> continuation) {
            return ((C124942) create(accountListViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((AccountListViewState) this.L$0).copy(false);
        }
    }
}
