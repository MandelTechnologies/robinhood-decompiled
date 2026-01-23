package com.robinhood.android.creditcard.p091ui.waitlist;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.creditcard.p091ui.waitlist.CreditCardWaitlistEvent;
import com.robinhood.android.lib.store.creditcard.CreditCardWaitlistStore;
import com.robinhood.models.api.bonfire.waitlist.ApiEmailWaitlistSpot;
import com.robinhood.models.api.bonfire.waitlist.EmailWaitlistSpotStatus;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: CreditCardWaitlistFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$joinWaitlist$1", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {514, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CreditCardWaitlistFragmentDuxo$joinWaitlist$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CreditCardWaitlistFragmentDuxo this$0;

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailWaitlistSpotStatus.values().length];
            try {
                iArr[EmailWaitlistSpotStatus.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreditCardWaitlistFragmentDuxo$joinWaitlist$1(CreditCardWaitlistFragmentDuxo creditCardWaitlistFragmentDuxo, Continuation<? super CreditCardWaitlistFragmentDuxo$joinWaitlist$1> continuation) {
        super(2, continuation);
        this.this$0 = creditCardWaitlistFragmentDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreditCardWaitlistFragmentDuxo$joinWaitlist$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreditCardWaitlistFragmentDuxo$joinWaitlist$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$joinWaitlist$1$1", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$joinWaitlist$1$1 */
    static final class C126771 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C126771(Continuation<? super C126771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126771 c126771 = new C126771(continuation);
            c126771.L$0 = obj;
            return c126771;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
            return ((C126771) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
            return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : null, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : true, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : null, (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r1 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objAwaitFirst;
        Object objJoinWaitlist$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            this.this$0.applyMutation(new C126804(null));
            this.this$0.submit(CreditCardWaitlistEvent.Error.INSTANCE);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C126771(null));
            Observable<User> user = this.this$0.userStore.getUser();
            this.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(user, this);
            if (objAwaitFirst != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objJoinWaitlist$default = obj;
            ApiEmailWaitlistSpot apiEmailWaitlistSpot = (ApiEmailWaitlistSpot) objJoinWaitlist$default;
            if (WhenMappings.$EnumSwitchMapping$0[apiEmailWaitlistSpot.getState().ordinal()] == 1) {
                this.this$0.applyMutation(new C126782(apiEmailWaitlistSpot, null));
                this.this$0.toNextScreen$feature_credit_card_externalDebug(Screen.CONFIRMATION);
            } else {
                this.this$0.applyMutation(new C126793(null));
                this.this$0.submit(CreditCardWaitlistEvent.Error.INSTANCE);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        objAwaitFirst = obj;
        String email = ((User) objAwaitFirst).getEmail();
        CreditCardWaitlistStore creditCardWaitlistStore = this.this$0.waitlistStore;
        this.label = 2;
        objJoinWaitlist$default = CreditCardWaitlistStore.joinWaitlist$default(creditCardWaitlistStore, email, null, this, 2, null);
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$joinWaitlist$1$2", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$joinWaitlist$1$2 */
    static final class C126782 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
        final /* synthetic */ ApiEmailWaitlistSpot $res;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C126782(ApiEmailWaitlistSpot apiEmailWaitlistSpot, Continuation<? super C126782> continuation) {
            super(2, continuation);
            this.$res = apiEmailWaitlistSpot;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126782 c126782 = new C126782(this.$res, continuation);
            c126782.L$0 = obj;
            return c126782;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
            return ((C126782) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
            return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : null, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : this.$res.getReferral_code(), (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
        }
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$joinWaitlist$1$3", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$joinWaitlist$1$3 */
    static final class C126793 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C126793(Continuation<? super C126793> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126793 c126793 = new C126793(continuation);
            c126793.L$0 = obj;
            return c126793;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
            return ((C126793) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
            return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : null, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : null, (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
        }
    }

    /* compiled from: CreditCardWaitlistFragmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$joinWaitlist$1$4", m3645f = "CreditCardWaitlistFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragmentDuxo$joinWaitlist$1$4 */
    static final class C126804 extends ContinuationImpl7 implements Function2<CreditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C126804(Continuation<? super C126804> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126804 c126804 = new C126804(continuation);
            c126804.L$0 = obj;
            return c126804;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreditCardWaitlistViewState creditCardWaitlistViewState, Continuation<? super CreditCardWaitlistViewState> continuation) {
            return ((C126804) create(creditCardWaitlistViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) this.L$0;
            return creditCardWaitlistViewState.copy((32703 & 1) != 0 ? creditCardWaitlistViewState.screen : null, (32703 & 2) != 0 ? creditCardWaitlistViewState.joiningWaitlist : false, (32703 & 4) != 0 ? creditCardWaitlistViewState.goldSubscriptionState : null, (32703 & 8) != 0 ? creditCardWaitlistViewState.inBlockGoldFlowExperiment : false, (32703 & 16) != 0 ? creditCardWaitlistViewState.videos : null, (32703 & 32) != 0 ? creditCardWaitlistViewState.referralCode : null, (32703 & 64) != 0 ? creditCardWaitlistViewState.referralsBlocked : false, (32703 & 128) != 0 ? creditCardWaitlistViewState.referralContext : null, (32703 & 256) != 0 ? creditCardWaitlistViewState.canApply : false, (32703 & 512) != 0 ? creditCardWaitlistViewState.hasInvite : false, (32703 & 1024) != 0 ? creditCardWaitlistViewState.hasValidCreditCard : false, (32703 & 2048) != 0 ? creditCardWaitlistViewState.referrerFirstName : null, (32703 & 4096) != 0 ? creditCardWaitlistViewState.waitlistFlowSimplified : false, (32703 & 8192) != 0 ? creditCardWaitlistViewState.entryPointSource : null, (32703 & 16384) != 0 ? creditCardWaitlistViewState.isLoadingWaitlistState : false);
        }
    }
}
