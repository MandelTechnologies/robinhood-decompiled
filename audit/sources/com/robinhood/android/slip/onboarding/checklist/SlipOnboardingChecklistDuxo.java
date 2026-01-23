package com.robinhood.android.slip.onboarding.checklist;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistEvent;
import com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.SlipEligibilityStore;
import com.robinhood.models.p355ui.UiSlipOnboardingEligibility;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;

/* compiled from: SlipOnboardingChecklistDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistViewState;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "slipEligibilityStore", "Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SlipOnboardingChecklistDuxo extends BaseDuxo5<SlipOnboardingChecklistViewState, SlipOnboardingChecklistEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final SavedStateHandle savedStateHandle;
    private final SlipEligibilityStore slipEligibilityStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipOnboardingChecklistDuxo(AccountProvider accountProvider, SlipEligibilityStore slipEligibilityStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new SlipOnboardingChecklistViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(slipEligibilityStore, "slipEligibilityStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.slipEligibilityStore = slipEligibilityStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C286291(null), 3, null);
    }

    /* compiled from: SlipOnboardingChecklistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistDuxo$onStart$1", m3645f = "SlipOnboardingChecklistDuxo.kt", m3646l = {60, 64, 66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.checklist.SlipOnboardingChecklistDuxo$onStart$1 */
    static final class C286291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C286291(Continuation<? super C286291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C286291 c286291 = SlipOnboardingChecklistDuxo.this.new C286291(continuation);
            c286291.L$0 = obj;
            return c286291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C286291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
        
            if (r15 != r0) goto L30;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Deferred deferred;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                SlipOnboardingChecklistDuxo.this.submit(new SlipOnboardingChecklistEvent.Error(e));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new SlipOnboardingChecklistDuxo2(SlipOnboardingChecklistDuxo.this, null), 3, null);
                this.L$0 = deferredAsync$default;
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deferred = deferredAsync$default;
            } else if (i == 1) {
                deferred = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    UiSlipOnboardingEligibility uiSlipOnboardingEligibility = (UiSlipOnboardingEligibility) obj;
                    SlipOnboardingChecklistDuxo.this.submit(new SlipOnboardingChecklistEvent.EligibilityLoaded(uiSlipOnboardingEligibility));
                    if (uiSlipOnboardingEligibility != null && uiSlipOnboardingEligibility.getIsEligible()) {
                        SlipOnboardingChecklistDuxo.this.submit(new SlipOnboardingChecklistEvent.PortfolioCheckPassed(uiSlipOnboardingEligibility.getIsRecommended()));
                    } else {
                        SlipOnboardingChecklistDuxo.this.submit(SlipOnboardingChecklistEvent.CheckFailed.INSTANCE);
                    }
                    return Unit.INSTANCE;
                }
                deferred = (Deferred) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 3;
                obj = deferred.await(this);
            }
            SlipOnboardingChecklistDuxo.this.submit(SlipOnboardingChecklistEvent.ProfileCheckPassed.INSTANCE);
            this.L$0 = deferred;
            this.label = 2;
            if (DelayKt.delay(1000L, this) != coroutine_suspended) {
                this.L$0 = null;
                this.label = 3;
                obj = deferred.await(this);
            }
            return coroutine_suspended;
        }
    }

    /* compiled from: SlipOnboardingChecklistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistDuxo;", "Lcom/robinhood/android/slip/onboarding/checklist/SlipOnboardingChecklistFragment$Args;", "<init>", "()V", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SlipOnboardingChecklistDuxo, SlipOnboardingChecklistFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SlipOnboardingChecklistFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (SlipOnboardingChecklistFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SlipOnboardingChecklistFragment.Args getArgs(SlipOnboardingChecklistDuxo slipOnboardingChecklistDuxo) {
            return (SlipOnboardingChecklistFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, slipOnboardingChecklistDuxo);
        }
    }
}
