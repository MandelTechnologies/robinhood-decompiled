package com.robinhood.android.retirement.p239ui.funded;

import androidx.fragment.app.Fragment;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.retirement.p239ui.funded.RetirementDashboardFundedFragment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RetirementDashboardFundedFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment$ComposeContent$1$1", m3645f = "RetirementDashboardFundedFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementDashboardFundedFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RetirementDashboardFundedFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementDashboardFundedFragment2(RetirementDashboardFundedFragment retirementDashboardFundedFragment, Continuation<? super RetirementDashboardFundedFragment2> continuation) {
        super(2, continuation);
        this.this$0 = retirementDashboardFundedFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RetirementDashboardFundedFragment2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RetirementDashboardFundedFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            RetirementDashboardDuxo duxo = this.this$0.getDuxo();
            RetirementDashboardFundedFragment.Companion companion = RetirementDashboardFundedFragment.INSTANCE;
            AccountSelectorTabArgs accountSelectorTabArgs = ((RetirementDashboardFundedFragment.Args) companion.getArgs((Fragment) this.this$0)).getAccountSelectorTabArgs();
            boolean z = false;
            if (accountSelectorTabArgs != null && accountSelectorTabArgs.isEmbedded()) {
                z = true;
            }
            duxo.initialize(z, ((RetirementDashboardFundedFragment.Args) companion.getArgs((Fragment) this.this$0)).getAccountNumber());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
