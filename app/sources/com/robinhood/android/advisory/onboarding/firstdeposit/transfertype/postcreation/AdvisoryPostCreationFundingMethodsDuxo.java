package com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.AdvisoryPostCreationFundingMethodsKey;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsDataState;
import com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsViewState;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.store.advisory.AdvisoryOnboardingStore;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdvisoryPostCreationFundingMethodsDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0006\u0010\u0013\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/postcreation/AdvisoryPostCreationFundingMethodsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsDataState;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "advisoryOnboardingStore", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "fetchViewModel", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisoryPostCreationFundingMethodsDuxo extends BaseDuxo<AdvisoryFundingMethodsDataState, AdvisoryFundingMethodsViewState> implements HasSavedState {
    private final AdvisoryOnboardingStore advisoryOnboardingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AdvisoryPostCreationFundingMethodsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation.AdvisoryPostCreationFundingMethodsDuxo", m3645f = "AdvisoryPostCreationFundingMethodsDuxo.kt", m3646l = {39}, m3647m = "fetchViewModel")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation.AdvisoryPostCreationFundingMethodsDuxo$fetchViewModel$1 */
    static final class C88641 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C88641(Continuation<? super C88641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdvisoryPostCreationFundingMethodsDuxo.this.fetchViewModel(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryPostCreationFundingMethodsDuxo(AdvisoryOnboardingStore advisoryOnboardingStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AdvisoryFundingMethodsDataState(null, null, 3, null), AdvisoryFundingMethodsDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(advisoryOnboardingStore, "advisoryOnboardingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.advisoryOnboardingStore = advisoryOnboardingStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchViewModel(Continuation<? super Unit> continuation) {
        C88641 c88641;
        if (continuation instanceof C88641) {
            c88641 = (C88641) continuation;
            int i = c88641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c88641.label = i - Integer.MIN_VALUE;
            } else {
                c88641 = new C88641(continuation);
            }
        }
        Object objStreamFirstTimeContributionViewModel = c88641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c88641.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objStreamFirstTimeContributionViewModel);
                AdvisoryOnboardingStore advisoryOnboardingStore = this.advisoryOnboardingStore;
                BrokerageAccountType brokerageAccountType = ((AdvisoryPostCreationFundingMethodsKey) INSTANCE.getArgs((HasSavedState) this)).getBrokerageAccountType();
                c88641.label = 1;
                objStreamFirstTimeContributionViewModel = advisoryOnboardingStore.streamFirstTimeContributionViewModel(brokerageAccountType, c88641);
                if (objStreamFirstTimeContributionViewModel == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objStreamFirstTimeContributionViewModel);
            }
            applyMutation(new C88652((ApiAdvisoryFirstTimeContributionViewModel) objStreamFirstTimeContributionViewModel, null));
        } catch (Exception e) {
            applyMutation(new C88663(e, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AdvisoryPostCreationFundingMethodsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation.AdvisoryPostCreationFundingMethodsDuxo$fetchViewModel$2", m3645f = "AdvisoryPostCreationFundingMethodsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation.AdvisoryPostCreationFundingMethodsDuxo$fetchViewModel$2 */
    static final class C88652 extends ContinuationImpl7 implements Function2<AdvisoryFundingMethodsDataState, Continuation<? super AdvisoryFundingMethodsDataState>, Object> {
        final /* synthetic */ ApiAdvisoryFirstTimeContributionViewModel $viewModel;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C88652(ApiAdvisoryFirstTimeContributionViewModel apiAdvisoryFirstTimeContributionViewModel, Continuation<? super C88652> continuation) {
            super(2, continuation);
            this.$viewModel = apiAdvisoryFirstTimeContributionViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C88652 c88652 = new C88652(this.$viewModel, continuation);
            c88652.L$0 = obj;
            return c88652;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryFundingMethodsDataState advisoryFundingMethodsDataState, Continuation<? super AdvisoryFundingMethodsDataState> continuation) {
            return ((C88652) create(advisoryFundingMethodsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdvisoryFundingMethodsDataState.copy$default((AdvisoryFundingMethodsDataState) this.L$0, ApiAdvisoryFirstTimeContributionViewModel.copy$default(this.$viewModel, null, null, null, null, null, null, null, 63, null), null, 2, null);
        }
    }

    /* compiled from: AdvisoryPostCreationFundingMethodsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation.AdvisoryPostCreationFundingMethodsDuxo$fetchViewModel$3", m3645f = "AdvisoryPostCreationFundingMethodsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation.AdvisoryPostCreationFundingMethodsDuxo$fetchViewModel$3 */
    static final class C88663 extends ContinuationImpl7 implements Function2<AdvisoryFundingMethodsDataState, Continuation<? super AdvisoryFundingMethodsDataState>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Exception f3913$e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C88663(Exception exc, Continuation<? super C88663> continuation) {
            super(2, continuation);
            this.f3913$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C88663 c88663 = new C88663(this.f3913$e, continuation);
            c88663.L$0 = obj;
            return c88663;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryFundingMethodsDataState advisoryFundingMethodsDataState, Continuation<? super AdvisoryFundingMethodsDataState> continuation) {
            return ((C88663) create(advisoryFundingMethodsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdvisoryFundingMethodsDataState.copy$default((AdvisoryFundingMethodsDataState) this.L$0, null, this.f3913$e, 1, null);
        }
    }

    /* compiled from: AdvisoryPostCreationFundingMethodsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation.AdvisoryPostCreationFundingMethodsDuxo$onStart$1", m3645f = "AdvisoryPostCreationFundingMethodsDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation.AdvisoryPostCreationFundingMethodsDuxo$onStart$1 */
    static final class C88671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C88671(Continuation<? super C88671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvisoryPostCreationFundingMethodsDuxo.this.new C88671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C88671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!(AdvisoryPostCreationFundingMethodsDuxo.this.getStateFlow().getValue() instanceof AdvisoryFundingMethodsViewState.Loaded)) {
                    AdvisoryPostCreationFundingMethodsDuxo advisoryPostCreationFundingMethodsDuxo = AdvisoryPostCreationFundingMethodsDuxo.this;
                    this.label = 1;
                    if (advisoryPostCreationFundingMethodsDuxo.fetchViewModel(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C88671(null));
    }

    /* compiled from: AdvisoryPostCreationFundingMethodsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation.AdvisoryPostCreationFundingMethodsDuxo$retry$1", m3645f = "AdvisoryPostCreationFundingMethodsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.postcreation.AdvisoryPostCreationFundingMethodsDuxo$retry$1 */
    static final class C88681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C88681(Continuation<? super C88681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvisoryPostCreationFundingMethodsDuxo.this.new C88681(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C88681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvisoryPostCreationFundingMethodsDuxo advisoryPostCreationFundingMethodsDuxo = AdvisoryPostCreationFundingMethodsDuxo.this;
                this.label = 1;
                if (advisoryPostCreationFundingMethodsDuxo.fetchViewModel(this) == coroutine_suspended) {
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

    public final void retry() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C88681(null), 3, null);
    }

    /* compiled from: AdvisoryPostCreationFundingMethodsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/postcreation/AdvisoryPostCreationFundingMethodsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/postcreation/AdvisoryPostCreationFundingMethodsDuxo;", "Lcom/robinhood/android/advisory/contracts/AdvisoryPostCreationFundingMethodsKey;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvisoryPostCreationFundingMethodsDuxo, AdvisoryPostCreationFundingMethodsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryPostCreationFundingMethodsKey getArgs(SavedStateHandle savedStateHandle) {
            return (AdvisoryPostCreationFundingMethodsKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryPostCreationFundingMethodsKey getArgs(AdvisoryPostCreationFundingMethodsDuxo advisoryPostCreationFundingMethodsDuxo) {
            return (AdvisoryPostCreationFundingMethodsKey) DuxoCompanion.DefaultImpls.getArgs(this, advisoryPostCreationFundingMethodsDuxo);
        }
    }
}
