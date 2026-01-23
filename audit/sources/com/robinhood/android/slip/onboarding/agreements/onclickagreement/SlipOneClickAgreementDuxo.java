package com.robinhood.android.slip.onboarding.agreements.onclickagreement;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.slip.contracts.SlipOneClickAgreementFragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SlipOneClickAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001aB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementDataState;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "slipAgreementsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipAgreementsStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "loadAgreement", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logCtaTap", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "Companion", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SlipOneClickAgreementDuxo extends BaseDuxo<SlipOneClickAgreementDataState, SlipOneClickAgreementViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final EventLogger eventLogger;
    private final SavedStateHandle savedStateHandle;
    private final SlipAgreementsStore slipAgreementsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SlipOneClickAgreementDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementDuxo", m3645f = "SlipOneClickAgreementDuxo.kt", m3646l = {45, 47}, m3647m = "loadAgreement")
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementDuxo$loadAgreement$1 */
    static final class C285841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C285841(Continuation<? super C285841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SlipOneClickAgreementDuxo.this.loadAgreement(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipOneClickAgreementDuxo(SavedStateHandle savedStateHandle, AccountProvider accountProvider, SlipAgreementsStore slipAgreementsStore, EventLogger eventLogger, DuxoBundle duxoBundle) {
        super(new SlipOneClickAgreementDataState(null, null, 3, null), SlipOneClickAgreementViewState3.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(slipAgreementsStore, "slipAgreementsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.accountProvider = accountProvider;
        this.slipAgreementsStore = slipAgreementsStore;
        this.eventLogger = eventLogger;
    }

    /* compiled from: SlipOneClickAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementDuxo$onCreate$1", m3645f = "SlipOneClickAgreementDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementDuxo$onCreate$1 */
    static final class C285881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C285881(Continuation<? super C285881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SlipOneClickAgreementDuxo.this.new C285881(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C285881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SlipOneClickAgreementDuxo slipOneClickAgreementDuxo = SlipOneClickAgreementDuxo.this;
                this.label = 1;
                if (slipOneClickAgreementDuxo.loadAgreement(this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C285881(null));
    }

    /* compiled from: SlipOneClickAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementDuxo$loadAgreement$2", m3645f = "SlipOneClickAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementDuxo$loadAgreement$2 */
    static final class C285852 extends ContinuationImpl7 implements Function2<SlipOneClickAgreementDataState, Continuation<? super SlipOneClickAgreementDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C285852(Continuation<? super C285852> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C285852 c285852 = new C285852(continuation);
            c285852.L$0 = obj;
            return c285852;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SlipOneClickAgreementDataState slipOneClickAgreementDataState, Continuation<? super SlipOneClickAgreementDataState> continuation) {
            return ((C285852) create(slipOneClickAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SlipOneClickAgreementDataState.copy$default((SlipOneClickAgreementDataState) this.L$0, null, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r11 != r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAgreement(Continuation<? super Unit> continuation) {
        C285841 c285841;
        String accountNumber;
        if (continuation instanceof C285841) {
            c285841 = (C285841) continuation;
            int i = c285841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c285841.label = i - Integer.MIN_VALUE;
            } else {
                c285841 = new C285841(continuation);
            }
        }
        C285841 c2858412 = c285841;
        Object individualAccountNumberForced = c2858412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2858412.label;
        try {
        } catch (Exception e) {
            applyMutation(new C285874(e, null));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(individualAccountNumberForced);
            applyMutation(new C285852(null));
            accountNumber = ((SlipOneClickAgreementFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber();
            if (accountNumber == null) {
                AccountProvider accountProvider = this.accountProvider;
                c2858412.label = 1;
                individualAccountNumberForced = accountProvider.getIndividualAccountNumberForced(c2858412);
                if (individualAccountNumberForced == coroutine_suspended) {
                }
            } else {
                SlipAgreementsStore slipAgreementsStore = this.slipAgreementsStore;
                String source = ((SlipOneClickAgreementFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getSource();
                c2858412.label = 2;
                individualAccountNumberForced = SlipAgreementsStore.getSlipAgreementsInUI$default(slipAgreementsStore, accountNumber, source, null, true, c2858412, 4, null);
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(individualAccountNumberForced);
            applyMutation(new C285863((UiSlipAgreements) individualAccountNumberForced, null));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(individualAccountNumberForced);
        accountNumber = (String) individualAccountNumberForced;
        SlipAgreementsStore slipAgreementsStore2 = this.slipAgreementsStore;
        String source2 = ((SlipOneClickAgreementFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getSource();
        c2858412.label = 2;
        individualAccountNumberForced = SlipAgreementsStore.getSlipAgreementsInUI$default(slipAgreementsStore2, accountNumber, source2, null, true, c2858412, 4, null);
    }

    /* compiled from: SlipOneClickAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementDuxo$loadAgreement$3", m3645f = "SlipOneClickAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementDuxo$loadAgreement$3 */
    static final class C285863 extends ContinuationImpl7 implements Function2<SlipOneClickAgreementDataState, Continuation<? super SlipOneClickAgreementDataState>, Object> {
        final /* synthetic */ UiSlipAgreements $agreements;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C285863(UiSlipAgreements uiSlipAgreements, Continuation<? super C285863> continuation) {
            super(2, continuation);
            this.$agreements = uiSlipAgreements;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C285863 c285863 = new C285863(this.$agreements, continuation);
            c285863.L$0 = obj;
            return c285863;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SlipOneClickAgreementDataState slipOneClickAgreementDataState, Continuation<? super SlipOneClickAgreementDataState> continuation) {
            return ((C285863) create(slipOneClickAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SlipOneClickAgreementDataState.copy$default((SlipOneClickAgreementDataState) this.L$0, this.$agreements, null, 2, null);
        }
    }

    /* compiled from: SlipOneClickAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementDuxo$loadAgreement$4", m3645f = "SlipOneClickAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementDuxo$loadAgreement$4 */
    static final class C285874 extends ContinuationImpl7 implements Function2<SlipOneClickAgreementDataState, Continuation<? super SlipOneClickAgreementDataState>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Exception f4969$e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C285874(Exception exc, Continuation<? super C285874> continuation) {
            super(2, continuation);
            this.f4969$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C285874 c285874 = new C285874(this.f4969$e, continuation);
            c285874.L$0 = obj;
            return c285874;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SlipOneClickAgreementDataState slipOneClickAgreementDataState, Continuation<? super SlipOneClickAgreementDataState> continuation) {
            return ((C285874) create(slipOneClickAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SlipOneClickAgreementDataState.copy$default((SlipOneClickAgreementDataState) this.L$0, null, this.f4969$e, 1, null);
        }
    }

    public final void logCtaTap(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.DONE, screen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
    }

    /* compiled from: SlipOneClickAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementDuxo;", "Lcom/robinhood/android/slip/contracts/SlipOneClickAgreementFragmentKey;", "<init>", "()V", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SlipOneClickAgreementDuxo, SlipOneClickAgreementFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SlipOneClickAgreementFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (SlipOneClickAgreementFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SlipOneClickAgreementFragmentKey getArgs(SlipOneClickAgreementDuxo slipOneClickAgreementDuxo) {
            return (SlipOneClickAgreementFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, slipOneClickAgreementDuxo);
        }
    }
}
