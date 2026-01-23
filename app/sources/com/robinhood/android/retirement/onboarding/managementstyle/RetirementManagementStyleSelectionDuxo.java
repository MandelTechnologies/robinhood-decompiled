package com.robinhood.android.retirement.onboarding.managementstyle;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionFragment;
import com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.p304db.onboarding.IraManagementStyleSelectionData;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.store.advisory.AdvisoryOnboardingStore;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RetirementManagementStyleSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/managementstyle/RetirementManagementStyleSelectionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/retirement/onboarding/managementstyle/RetirementManagementStyleSelectionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "onboardingStore", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementManagementStyleSelectionDuxo extends BaseDuxo4<RetirementManagementStyleSelectionViewState> implements HasSavedState {
    private final AdvisoryOnboardingStore onboardingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementManagementStyleSelectionDuxo(SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, AdvisoryOnboardingStore onboardingStore) {
        super(RetirementManagementStyleSelectionViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(onboardingStore, "onboardingStore");
        this.savedStateHandle = savedStateHandle;
        this.onboardingStore = onboardingStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C271141(null));
    }

    /* compiled from: RetirementManagementStyleSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionDuxo$onCreate$1", m3645f = "RetirementManagementStyleSelectionDuxo.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionDuxo$onCreate$1 */
    static final class C271141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C271141(Continuation<? super C271141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementManagementStyleSelectionDuxo.this.new C271141(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C271141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvisoryOnboardingStore advisoryOnboardingStore = RetirementManagementStyleSelectionDuxo.this.onboardingStore;
                BrokerageAccountType brokerageAccountType = ((RetirementManagementStyleSelectionFragment.Args) RetirementManagementStyleSelectionDuxo.INSTANCE.getArgs((HasSavedState) RetirementManagementStyleSelectionDuxo.this)).getBrokerageAccountType();
                this.label = 1;
                obj = advisoryOnboardingStore.streamIraManagementStyleSelection(brokerageAccountType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RetirementManagementStyleSelectionDuxo.this.applyMutation(new AnonymousClass1((IraManagementStyleSelectionData) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: RetirementManagementStyleSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/onboarding/managementstyle/RetirementManagementStyleSelectionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionDuxo$onCreate$1$1", m3645f = "RetirementManagementStyleSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RetirementManagementStyleSelectionViewState, Continuation<? super RetirementManagementStyleSelectionViewState>, Object> {
            final /* synthetic */ IraManagementStyleSelectionData $response;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IraManagementStyleSelectionData iraManagementStyleSelectionData, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = iraManagementStyleSelectionData;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$response, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RetirementManagementStyleSelectionViewState retirementManagementStyleSelectionViewState, Continuation<? super RetirementManagementStyleSelectionViewState> continuation) {
                return ((AnonymousClass1) create(retirementManagementStyleSelectionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new RetirementManagementStyleSelectionViewState.Loaded(this.$response);
            }
        }
    }

    /* compiled from: RetirementManagementStyleSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/managementstyle/RetirementManagementStyleSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/retirement/onboarding/managementstyle/RetirementManagementStyleSelectionDuxo;", "Lcom/robinhood/android/retirement/onboarding/managementstyle/RetirementManagementStyleSelectionFragment$Args;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RetirementManagementStyleSelectionDuxo, RetirementManagementStyleSelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementManagementStyleSelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RetirementManagementStyleSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementManagementStyleSelectionFragment.Args getArgs(RetirementManagementStyleSelectionDuxo retirementManagementStyleSelectionDuxo) {
            return (RetirementManagementStyleSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, retirementManagementStyleSelectionDuxo);
        }
    }
}
