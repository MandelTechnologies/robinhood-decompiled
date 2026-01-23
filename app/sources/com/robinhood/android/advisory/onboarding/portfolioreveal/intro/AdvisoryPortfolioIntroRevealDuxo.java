package com.robinhood.android.advisory.onboarding.portfolioreveal.intro;

import advisory.portfolio_reveal.proto.p007v1.AdvisoryPortfolioRevealService;
import advisory.portfolio_reveal.proto.p007v1.GetPortfolioRevealRequestDto;
import advisory.portfolio_reveal.proto.p007v1.GetPortfolioRevealResponseDto;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioRevealIntroFragment;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import rosetta.account.BrokerageAccountTypeDto;

/* compiled from: AdvisoryPortfolioIntroRevealDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/intro/AdvisoryPortfolioIntroRevealDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/intro/PortfolioRevealIntroDataState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "advisoryPortfolioRevealComponent", "Lmicrogram/android/inject/MicrogramComponent;", "portfolioRevealService", "Ladvisory/portfolio_reveal/proto/v1/AdvisoryPortfolioRevealService;", "onStart", "", "markLoadingAnimationComplete", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryPortfolioIntroRevealDuxo extends BaseDuxo4<PortfolioRevealIntroDataState> implements HasSavedState {
    private final MicrogramComponent advisoryPortfolioRevealComponent;
    private final AdvisoryPortfolioRevealService portfolioRevealService;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdvisoryPortfolioIntroRevealDuxo(SavedStateHandle savedStateHandle, MicrogramComponent.Factory microgramComponentFactory, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new PortfolioRevealIntroDataState(((AdvisoryPortfolioRevealIntroFragment.Args) companion.getArgs(savedStateHandle)).getBrokerageAccountType(), ((AdvisoryPortfolioRevealIntroFragment.Args) companion.getArgs(savedStateHandle)).getSource(), null, false, 12, null), duxoBundle);
        this.savedStateHandle = savedStateHandle;
        MicrogramComponent microgramComponentCreate$default = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication("app-advisory-portfolio-reveal", null, 2, null), null, 4, null);
        this.advisoryPortfolioRevealComponent = microgramComponentCreate$default;
        this.portfolioRevealService = (AdvisoryPortfolioRevealService) microgramComponentCreate$default.getServiceLocator().getClient(AdvisoryPortfolioRevealService.class);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C90231(null), 3, null);
    }

    /* compiled from: AdvisoryPortfolioIntroRevealDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioIntroRevealDuxo$onStart$1", m3645f = "AdvisoryPortfolioIntroRevealDuxo.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioIntroRevealDuxo$onStart$1 */
    static final class C90231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C90231(Continuation<? super C90231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvisoryPortfolioIntroRevealDuxo.this.new C90231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C90231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvisoryPortfolioRevealService advisoryPortfolioRevealService = AdvisoryPortfolioIntroRevealDuxo.this.portfolioRevealService;
                BrokerageAccountTypeDto.Companion companion = BrokerageAccountTypeDto.INSTANCE;
                Companion companion2 = AdvisoryPortfolioIntroRevealDuxo.INSTANCE;
                BrokerageAccountTypeDto brokerageAccountTypeDtoFromProto = companion.fromProto(BrokerageAccountTypes3.toProtobuf(((AdvisoryPortfolioRevealIntroFragment.Args) companion2.getArgs((HasSavedState) AdvisoryPortfolioIntroRevealDuxo.this)).getBrokerageAccountType()));
                String string2 = ((AdvisoryPortfolioRevealIntroFragment.Args) companion2.getArgs((HasSavedState) AdvisoryPortfolioIntroRevealDuxo.this)).getApplicationId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                GetPortfolioRevealRequestDto getPortfolioRevealRequestDto = new GetPortfolioRevealRequestDto(brokerageAccountTypeDtoFromProto, string2);
                this.label = 1;
                obj = advisoryPortfolioRevealService.GetPortfolioReveal(getPortfolioRevealRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AdvisoryPortfolioIntroRevealDuxo.this.applyMutation(new AnonymousClass1((GetPortfolioRevealResponseDto) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: AdvisoryPortfolioIntroRevealDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/intro/PortfolioRevealIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioIntroRevealDuxo$onStart$1$1", m3645f = "AdvisoryPortfolioIntroRevealDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioIntroRevealDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PortfolioRevealIntroDataState, Continuation<? super PortfolioRevealIntroDataState>, Object> {
            final /* synthetic */ GetPortfolioRevealResponseDto $portfolioReveal;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GetPortfolioRevealResponseDto getPortfolioRevealResponseDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$portfolioReveal = getPortfolioRevealResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$portfolioReveal, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PortfolioRevealIntroDataState portfolioRevealIntroDataState, Continuation<? super PortfolioRevealIntroDataState> continuation) {
                return ((AnonymousClass1) create(portfolioRevealIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PortfolioRevealIntroDataState.copy$default((PortfolioRevealIntroDataState) this.L$0, null, null, this.$portfolioReveal, false, 11, null);
            }
        }
    }

    /* compiled from: AdvisoryPortfolioIntroRevealDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/intro/PortfolioRevealIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioIntroRevealDuxo$markLoadingAnimationComplete$1", m3645f = "AdvisoryPortfolioIntroRevealDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.AdvisoryPortfolioIntroRevealDuxo$markLoadingAnimationComplete$1 */
    static final class C90221 extends ContinuationImpl7 implements Function2<PortfolioRevealIntroDataState, Continuation<? super PortfolioRevealIntroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C90221(Continuation<? super C90221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C90221 c90221 = new C90221(continuation);
            c90221.L$0 = obj;
            return c90221;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PortfolioRevealIntroDataState portfolioRevealIntroDataState, Continuation<? super PortfolioRevealIntroDataState> continuation) {
            return ((C90221) create(portfolioRevealIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PortfolioRevealIntroDataState.copy$default((PortfolioRevealIntroDataState) this.L$0, null, null, null, true, 7, null);
        }
    }

    public final void markLoadingAnimationComplete() {
        applyMutation(new C90221(null));
    }

    /* compiled from: AdvisoryPortfolioIntroRevealDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/intro/AdvisoryPortfolioIntroRevealDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/intro/AdvisoryPortfolioIntroRevealDuxo;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/intro/AdvisoryPortfolioRevealIntroFragment$Args;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvisoryPortfolioIntroRevealDuxo, AdvisoryPortfolioRevealIntroFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryPortfolioRevealIntroFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AdvisoryPortfolioRevealIntroFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryPortfolioRevealIntroFragment.Args getArgs(AdvisoryPortfolioIntroRevealDuxo advisoryPortfolioIntroRevealDuxo) {
            return (AdvisoryPortfolioRevealIntroFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, advisoryPortfolioIntroRevealDuxo);
        }
    }
}
