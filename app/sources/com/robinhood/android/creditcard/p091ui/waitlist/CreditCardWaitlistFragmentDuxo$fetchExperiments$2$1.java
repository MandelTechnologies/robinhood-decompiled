package com.robinhood.android.creditcard.p091ui.waitlist;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CreditCardWaitlistFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$fetchExperiments$2$1", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CreditCardWaitlistFragmentDuxo$fetchExperiments$2$1 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
    final /* synthetic */ boolean $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreditCardWaitlistFragmentDuxo$fetchExperiments$2$1(boolean z, Continuation<? super CreditCardWaitlistFragmentDuxo$fetchExperiments$2$1> continuation) {
        super(2, continuation);
        this.$it = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreditCardWaitlistFragmentDuxo$fetchExperiments$2$1 creditCardWaitlistFragmentDuxo$fetchExperiments$2$1 = new CreditCardWaitlistFragmentDuxo$fetchExperiments$2$1(this.$it, continuation);
        creditCardWaitlistFragmentDuxo$fetchExperiments$2$1.L$0 = obj;
        return creditCardWaitlistFragmentDuxo$fetchExperiments$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
        return ((CreditCardWaitlistFragmentDuxo$fetchExperiments$2$1) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
        return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : null, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : null, (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : this.$it, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
    }
}
