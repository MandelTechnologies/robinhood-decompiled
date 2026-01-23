package com.robinhood.android.onboarding.p205ui.postfundupsell.loading;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.onboarding.p205ui.postfundupsell.OnboardingUpsellVariant;
import com.robinhood.android.onboarding.p205ui.postfundupsell.loading.OnboardingUpsellLoadingEvent;
import com.robinhood.android.onboarding.p205ui.postfundupsell.loading.OnboardingUpsellLoadingFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.OnboardingUpsellStore;
import com.robinhood.models.onboardingupsell.ApiOnboardingUpsellFlow;
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

/* compiled from: OnboardingUpsellLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postfundupsell/loading/OnboardingUpsellLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/onboarding/ui/postfundupsell/loading/OnboardingUpsellLoadingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "onboardingUpsellStore", "Lcom/robinhood/librobinhood/data/store/OnboardingUpsellStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/OnboardingUpsellStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class OnboardingUpsellLoadingDuxo extends BaseDuxo5<Unit, OnboardingUpsellLoadingEvent> implements HasSavedState {
    private final OnboardingUpsellStore onboardingUpsellStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUpsellLoadingDuxo(OnboardingUpsellStore onboardingUpsellStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(onboardingUpsellStore, "onboardingUpsellStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.onboardingUpsellStore = onboardingUpsellStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C228171(null), 3, null);
    }

    /* compiled from: OnboardingUpsellLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postfundupsell.loading.OnboardingUpsellLoadingDuxo$onCreate$1", m3645f = "OnboardingUpsellLoadingDuxo.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postfundupsell.loading.OnboardingUpsellLoadingDuxo$onCreate$1 */
    static final class C228171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C228171(Continuation<? super C228171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnboardingUpsellLoadingDuxo.this.new C228171(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C228171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    OnboardingUpsellStore onboardingUpsellStore = OnboardingUpsellLoadingDuxo.this.onboardingUpsellStore;
                    Companion companion = OnboardingUpsellLoadingDuxo.INSTANCE;
                    String source = ((OnboardingUpsellLoadingFragment.Args) companion.getArgs((HasSavedState) OnboardingUpsellLoadingDuxo.this)).getSource();
                    String amount = ((OnboardingUpsellLoadingFragment.Args) companion.getArgs((HasSavedState) OnboardingUpsellLoadingDuxo.this)).getAmount();
                    this.label = 1;
                    obj = onboardingUpsellStore.getOnboardingUpsellFlow(source, amount, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ApiOnboardingUpsellFlow apiOnboardingUpsellFlow = (ApiOnboardingUpsellFlow) obj;
                OnboardingUpsellVariant onboardingUpsellVariant = OnboardingUpsellVariant.CONTROL;
                if (apiOnboardingUpsellFlow.getRetirementNativeFundingViewModel() != null) {
                    onboardingUpsellVariant = OnboardingUpsellVariant.GOLD_NATIVE_FUNDING_UPSELL;
                } else if (apiOnboardingUpsellFlow.getOnboarding_funding_upsell_choose_apy_view_model() != null) {
                    onboardingUpsellVariant = OnboardingUpsellVariant.RETIREMENT_VARIANT2;
                }
                OnboardingUpsellLoadingDuxo.this.submit(new OnboardingUpsellLoadingEvent.Loaded(apiOnboardingUpsellFlow, onboardingUpsellVariant));
            } catch (Throwable th) {
                OnboardingUpsellLoadingDuxo.this.submit(new OnboardingUpsellLoadingEvent.Error(th));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: OnboardingUpsellLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postfundupsell/loading/OnboardingUpsellLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/onboarding/ui/postfundupsell/loading/OnboardingUpsellLoadingDuxo;", "Lcom/robinhood/android/onboarding/ui/postfundupsell/loading/OnboardingUpsellLoadingFragment$Args;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OnboardingUpsellLoadingDuxo, OnboardingUpsellLoadingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OnboardingUpsellLoadingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OnboardingUpsellLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OnboardingUpsellLoadingFragment.Args getArgs(OnboardingUpsellLoadingDuxo onboardingUpsellLoadingDuxo) {
            return (OnboardingUpsellLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, onboardingUpsellLoadingDuxo);
        }
    }
}
