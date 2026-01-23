package com.robinhood.android.internalassettransfers.accountselection;

import com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AccountSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment$ComposeContent$1$1", m3645f = "AccountSelectionFragment.kt", m3646l = {51}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class AccountSelectionFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AccountSelectionFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectionFragment2(AccountSelectionFragment accountSelectionFragment, Continuation<? super AccountSelectionFragment2> continuation) {
        super(2, continuation);
        this.this$0 = accountSelectionFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectionFragment2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectionFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: AccountSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment$ComposeContent$1$1$1", m3645f = "AccountSelectionFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionFragment$ComposeContent$1$1$1 */
    static final class C190161 extends ContinuationImpl7 implements Function2<Tuples2<? extends AccountSelectionListFragment.AccountSelectionType, ? extends String>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AccountSelectionFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C190161(AccountSelectionFragment accountSelectionFragment, Continuation<? super C190161> continuation) {
            super(2, continuation);
            this.this$0 = accountSelectionFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190161 c190161 = new C190161(this.this$0, continuation);
            c190161.L$0 = obj;
            return c190161;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends AccountSelectionListFragment.AccountSelectionType, ? extends String> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<? extends AccountSelectionListFragment.AccountSelectionType, String>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<? extends AccountSelectionListFragment.AccountSelectionType, String> tuples2, Continuation<? super Unit> continuation) {
            return ((C190161) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                AccountSelectionListFragment.AccountSelectionType accountSelectionType = (AccountSelectionListFragment.AccountSelectionType) tuples2.component1();
                this.this$0.getDuxo().onAccountSelected((String) tuples2.component2(), accountSelectionType);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getCallbacks().getAccountSelectionFlow());
            C190161 c190161 = new C190161(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFilterNotNull, c190161, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
