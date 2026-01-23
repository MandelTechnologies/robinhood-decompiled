package com.robinhood.android.advisory.onboarding.questionnaire;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.advisory.p030v1.AdvisoryOnboardingService;
import bonfire.proto.idl.advisory.p030v1.CreateAdvisoryApplicationErrorDto;
import bonfire.proto.idl.advisory.p030v1.CreateAdvisoryApplicationRequestDto;
import bonfire.proto.idl.advisory.p030v1.CreateAdvisoryApplicationResponseDto;
import com.robinhood.android.advisory.contracts.AdvisoryOnboardingKey;
import com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroEvent;
import com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroFragmentV2;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.store.advisory.AdvisoryFirstDepositConfig;
import com.robinhood.store.advisory.AdvisoryOnboardingStore;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
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
import rosetta.account.BrokerageAccountTypeDto;

/* compiled from: PortfolioQuestionnaireIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0014B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroDataState;", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState;", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "onboardingStore", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "advisoryOnboardingService", "Lbonfire/proto/idl/advisory/v1/AdvisoryOnboardingService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;Lbonfire/proto/idl/advisory/v1/AdvisoryOnboardingService;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class PortfolioQuestionnaireIntroDuxo extends BaseDuxo3<PortfolioQuestionnaireIntroDataState, PortfolioQuestionnaireIntroViewState, PortfolioQuestionnaireIntroEvent> implements HasSavedState {
    private final AdvisoryOnboardingService advisoryOnboardingService;
    private final AdvisoryOnboardingStore onboardingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PortfolioQuestionnaireIntroDuxo(AdvisoryOnboardingStore onboardingStore, AdvisoryOnboardingService advisoryOnboardingService, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(onboardingStore, "onboardingStore");
        Intrinsics.checkNotNullParameter(advisoryOnboardingService, "advisoryOnboardingService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        AdvisoryOnboardingKey.EntryPoint entryPoint = ((PortfolioQuestionnaireIntroFragmentV2.Args) companion.getArgs(savedStateHandle)).getEntryPoint();
        BrokerageAccountType brokerageAccountType = ((PortfolioQuestionnaireIntroFragmentV2.Args) companion.getArgs(savedStateHandle)).getBrokerageAccountType();
        String source = ((PortfolioQuestionnaireIntroFragmentV2.Args) companion.getArgs(savedStateHandle)).getSource();
        super(new PortfolioQuestionnaireIntroDataState(entryPoint, brokerageAccountType, source == null ? "" : source, null, null, 24, null), PortfolioQuestionnaireIntroDataState.INSTANCE, duxoBundle);
        this.onboardingStore = onboardingStore;
        this.advisoryOnboardingService = advisoryOnboardingService;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: PortfolioQuestionnaireIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroDuxo$onStart$1", m3645f = "PortfolioQuestionnaireIntroDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroDuxo$onStart$1 */
    static final class C90451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C90451(Continuation<? super C90451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PortfolioQuestionnaireIntroDuxo.this.new C90451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C90451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                PortfolioQuestionnaireIntroDuxo.this.submit(new PortfolioQuestionnaireIntroEvent.ApplicationCreationFailed(e));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (PortfolioQuestionnaireIntroDuxo.this.getStateFlow().getValue().getApplicationId() == null) {
                    AdvisoryOnboardingService advisoryOnboardingService = PortfolioQuestionnaireIntroDuxo.this.advisoryOnboardingService;
                    CreateAdvisoryApplicationRequestDto createAdvisoryApplicationRequestDto = new CreateAdvisoryApplicationRequestDto(BrokerageAccountTypeDto.INSTANCE.fromProto(BrokerageAccountTypes3.toProtobuf(((PortfolioQuestionnaireIntroFragmentV2.Args) PortfolioQuestionnaireIntroDuxo.INSTANCE.getArgs((HasSavedState) PortfolioQuestionnaireIntroDuxo.this)).getBrokerageAccountType())));
                    this.label = 1;
                    obj = advisoryOnboardingService.CreateAdvisoryApplication(createAdvisoryApplicationRequestDto, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateAdvisoryApplicationResponseDto createAdvisoryApplicationResponseDto = (CreateAdvisoryApplicationResponseDto) obj;
            CreateAdvisoryApplicationErrorDto error = createAdvisoryApplicationResponseDto.getError();
            ErrorDialogData errorDialogData = error != null ? new ErrorDialogData(error.getTitle(), error.getMessage(), error.getCta_text()) : null;
            if (errorDialogData != null) {
                PortfolioQuestionnaireIntroDuxo.this.applyMutation(new AnonymousClass1(errorDialogData, null));
            } else {
                UUID uuid = StringsKt.toUuid(createAdvisoryApplicationResponseDto.getApplication_id());
                PortfolioQuestionnaireIntroDuxo.this.applyMutation(new AnonymousClass2(uuid, null));
                AdvisoryOnboardingKey.EntryPoint entryPoint = ((PortfolioQuestionnaireIntroFragmentV2.Args) PortfolioQuestionnaireIntroDuxo.INSTANCE.getArgs((HasSavedState) PortfolioQuestionnaireIntroDuxo.this)).getEntryPoint();
                if (!(entryPoint instanceof AdvisoryOnboardingKey.EntryPoint.RxRSunset)) {
                    PortfolioQuestionnaireIntroDuxo.this.onboardingStore.clearFirstDepositConfig(uuid);
                } else {
                    PortfolioQuestionnaireIntroDuxo.this.onboardingStore.setFirstDepositConfig(uuid, new AdvisoryFirstDepositConfig.IraMigration(((AdvisoryOnboardingKey.EntryPoint.RxRSunset) entryPoint).getSelfDirectedAccountNumber()));
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: PortfolioQuestionnaireIntroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroDuxo$onStart$1$1", m3645f = "PortfolioQuestionnaireIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PortfolioQuestionnaireIntroDataState, Continuation<? super PortfolioQuestionnaireIntroDataState>, Object> {
            final /* synthetic */ ErrorDialogData $errorData;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ErrorDialogData errorDialogData, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$errorData = errorDialogData;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$errorData, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PortfolioQuestionnaireIntroDataState portfolioQuestionnaireIntroDataState, Continuation<? super PortfolioQuestionnaireIntroDataState> continuation) {
                return ((AnonymousClass1) create(portfolioQuestionnaireIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PortfolioQuestionnaireIntroDataState.copy$default((PortfolioQuestionnaireIntroDataState) this.L$0, null, null, null, null, this.$errorData, 15, null);
            }
        }

        /* compiled from: PortfolioQuestionnaireIntroDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroDuxo$onStart$1$2", m3645f = "PortfolioQuestionnaireIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PortfolioQuestionnaireIntroDataState, Continuation<? super PortfolioQuestionnaireIntroDataState>, Object> {
            final /* synthetic */ UUID $applicationId;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(UUID uuid, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$applicationId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$applicationId, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PortfolioQuestionnaireIntroDataState portfolioQuestionnaireIntroDataState, Continuation<? super PortfolioQuestionnaireIntroDataState> continuation) {
                return ((AnonymousClass2) create(portfolioQuestionnaireIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PortfolioQuestionnaireIntroDataState.copy$default((PortfolioQuestionnaireIntroDataState) this.L$0, null, null, null, this.$applicationId, null, 23, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C90451(null));
    }

    /* compiled from: PortfolioQuestionnaireIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroDuxo;", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroFragmentV2$Args;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PortfolioQuestionnaireIntroDuxo, PortfolioQuestionnaireIntroFragmentV2.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PortfolioQuestionnaireIntroFragmentV2.Args getArgs(SavedStateHandle savedStateHandle) {
            return (PortfolioQuestionnaireIntroFragmentV2.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PortfolioQuestionnaireIntroFragmentV2.Args getArgs(PortfolioQuestionnaireIntroDuxo portfolioQuestionnaireIntroDuxo) {
            return (PortfolioQuestionnaireIntroFragmentV2.Args) DuxoCompanion.DefaultImpls.getArgs(this, portfolioQuestionnaireIntroDuxo);
        }
    }
}
