package com.robinhood.android.creditcard.p091ui.waitlist;

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
import kotlinx.coroutines.DelayKt;

/* compiled from: CreditCardWaitlistFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$toNextScreen$1", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CreditCardWaitlistFragmentDuxo$toNextScreen$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Screen $screen;
    int label;
    final /* synthetic */ CreditCardWaitlistFragmentDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreditCardWaitlistFragmentDuxo$toNextScreen$1(CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo, Screen screen, Continuation<? super CreditCardWaitlistFragmentDuxo$toNextScreen$1> continuation) {
        super(2, continuation);
        this.this$0 = creditCardWaitlistFragmentDuxo;
        this.$screen = screen;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreditCardWaitlistFragmentDuxo$toNextScreen$1(this.this$0, this.$screen, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreditCardWaitlistFragmentDuxo$toNextScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.lastScreen != this.$screen) {
                this.this$0.applyMutation(new C126851(null));
                this.label = 1;
                if (DelayKt.delay(150L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.lastScreen = this.$screen;
        this.this$0.applyMutation(new C126862(this.$screen, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$toNextScreen$1$1", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$toNextScreen$1$1 */
    static final class C126851 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C126851(Continuation<? super C126851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126851 c126851 = new C126851(continuation);
            c126851.L$0 = obj;
            return c126851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
            return ((C126851) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
            return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : Screen.TRANSITION, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : null, (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
        }
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$toNextScreen$1$2", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$toNextScreen$1$2 */
    static final class C126862 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
        final /* synthetic */ Screen $screen;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C126862(Screen screen, Continuation<? super C126862> continuation) {
            super(2, continuation);
            this.$screen = screen;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126862 c126862 = new C126862(this.$screen, continuation);
            c126862.L$0 = obj;
            return c126862;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
            return ((C126862) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
            return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : this.$screen, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : null, (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
        }
    }
}
