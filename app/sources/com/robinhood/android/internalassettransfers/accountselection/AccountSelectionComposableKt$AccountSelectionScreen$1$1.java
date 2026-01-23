package com.robinhood.android.internalassettransfers.accountselection;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: AccountSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$AccountSelectionScreen$1$1", m3645f = "AccountSelectionComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AccountSelectionComposableKt$AccountSelectionScreen$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccountSelectionCallbacks $callbacks;
    final /* synthetic */ Function2<String, AccountSelectionListFragment.AccountSelectionType, Unit> $onAccountSelected;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AccountSelectionComposableKt$AccountSelectionScreen$1$1(AccountSelectionCallbacks accountSelectionCallbacks, Function2<? super String, ? super AccountSelectionListFragment.AccountSelectionType, Unit> function2, Continuation<? super AccountSelectionComposableKt$AccountSelectionScreen$1$1> continuation) {
        super(2, continuation);
        this.$callbacks = accountSelectionCallbacks;
        this.$onAccountSelected = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectionComposableKt$AccountSelectionScreen$1$1(this.$callbacks, this.$onAccountSelected, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectionComposableKt$AccountSelectionScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowFilterNotNull = FlowKt.filterNotNull(this.$callbacks.getAccountSelectionFlow());
            C189901 c189901 = new C189901(this.$onAccountSelected, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFilterNotNull, c189901, this) == coroutine_suspended) {
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

    /* compiled from: AccountSelectionComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$AccountSelectionScreen$1$1$1", m3645f = "AccountSelectionComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.AccountSelectionComposableKt$AccountSelectionScreen$1$1$1 */
    static final class C189901 extends ContinuationImpl7 implements Function2<Tuples2<? extends AccountSelectionListFragment.AccountSelectionType, ? extends String>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<String, AccountSelectionListFragment.AccountSelectionType, Unit> $onAccountSelected;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C189901(Function2<? super String, ? super AccountSelectionListFragment.AccountSelectionType, Unit> function2, Continuation<? super C189901> continuation) {
            super(2, continuation);
            this.$onAccountSelected = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189901 c189901 = new C189901(this.$onAccountSelected, continuation);
            c189901.L$0 = obj;
            return c189901;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends AccountSelectionListFragment.AccountSelectionType, ? extends String> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<? extends AccountSelectionListFragment.AccountSelectionType, String>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<? extends AccountSelectionListFragment.AccountSelectionType, String> tuples2, Continuation<? super Unit> continuation) {
            return ((C189901) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            AccountSelectionListFragment.AccountSelectionType accountSelectionType = (AccountSelectionListFragment.AccountSelectionType) tuples2.component1();
            this.$onAccountSelected.invoke((String) tuples2.component2(), accountSelectionType);
            return Unit.INSTANCE;
        }
    }
}
