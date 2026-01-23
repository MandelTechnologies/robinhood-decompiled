package com.robinhood.android.retirement.p239ui.funded;

import androidx.compose.foundation.lazy.LazyListState;
import com.plaid.internal.EnumC7081g;
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
@DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment$ComposeContent$2$1", m3645f = "RetirementDashboardFundedFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.ui.funded.RetirementDashboardFundedFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementDashboardFundedFragment3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    int label;
    final /* synthetic */ RetirementDashboardFundedFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementDashboardFundedFragment3(LazyListState lazyListState, RetirementDashboardFundedFragment retirementDashboardFundedFragment, Continuation<? super RetirementDashboardFundedFragment3> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.this$0 = retirementDashboardFundedFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RetirementDashboardFundedFragment3(this.$listState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RetirementDashboardFundedFragment3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        RetirementDashboardFundedFragment3 retirementDashboardFundedFragment3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$listState;
            this.label = 1;
            retirementDashboardFundedFragment3 = this;
            if (LazyListState.animateScrollToItem$default(lazyListState, 0, 0, retirementDashboardFundedFragment3, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            retirementDashboardFundedFragment3 = this;
        }
        retirementDashboardFundedFragment3.this$0.setAnimateScrollToTop(false);
        return Unit.INSTANCE;
    }
}
