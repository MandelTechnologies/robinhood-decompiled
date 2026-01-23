package com.robinhood.android.advisory.onboarding.portfolioreveal.allocation;

import advisory.portfolio_reveal.proto.p007v1.AdvisoryPortfolioRevealService;
import advisory.portfolio_reveal.proto.p007v1.GetPortfolioRevealRequestDto;
import advisory.portfolio_reveal.proto.p007v1.GetPortfolioRevealResponseDto;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.AdvisoryPortfolioRevealAllocationFragment;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import rosetta.account.BrokerageAccountTypeDto;

/* compiled from: PortfolioRevealAllocationDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/PortfolioRevealAllocationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/PortfolioRevealAllocationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "advisoryPortfolioRevealComponent", "Lmicrogram/android/inject/MicrogramComponent;", "portfolioRevealService", "Ladvisory/portfolio_reveal/proto/v1/AdvisoryPortfolioRevealService;", "onStart", "", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PortfolioRevealAllocationDuxo extends BaseDuxo4<PortfolioRevealAllocationViewState> implements HasSavedState {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioRevealAllocationDuxo(MicrogramComponent.Factory microgramComponentFactory, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new PortfolioRevealAllocationViewState(((AdvisoryPortfolioRevealAllocationFragment.Args) INSTANCE.getArgs(savedStateHandle)).getPortfolioReveal()), duxoBundle);
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        MicrogramComponent microgramComponentCreate$default = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication("app-advisory-portfolio-reveal", null, 2, null), null, 4, null);
        this.advisoryPortfolioRevealComponent = microgramComponentCreate$default;
        this.portfolioRevealService = (AdvisoryPortfolioRevealService) microgramComponentCreate$default.getServiceLocator().getClient(AdvisoryPortfolioRevealService.class);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Companion companion = INSTANCE;
        UUID applicationId = ((AdvisoryPortfolioRevealAllocationFragment.Args) companion.getArgs(getSavedStateHandle())).getApplicationId();
        if (((AdvisoryPortfolioRevealAllocationFragment.Args) companion.getArgs(getSavedStateHandle())).getScreenTitle() == null || applicationId == null) {
            return;
        }
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C89741(applicationId, null));
    }

    /* compiled from: PortfolioRevealAllocationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.PortfolioRevealAllocationDuxo$onStart$1", m3645f = "PortfolioRevealAllocationDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.PortfolioRevealAllocationDuxo$onStart$1 */
    static final class C89741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $applicationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C89741(UUID uuid, Continuation<? super C89741> continuation) {
            super(2, continuation);
            this.$applicationId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PortfolioRevealAllocationDuxo.this.new C89741(this.$applicationId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C89741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvisoryPortfolioRevealService advisoryPortfolioRevealService = PortfolioRevealAllocationDuxo.this.portfolioRevealService;
                BrokerageAccountTypeDto brokerageAccountTypeDtoFromProto = BrokerageAccountTypeDto.INSTANCE.fromProto(BrokerageAccountTypes3.toProtobuf(((AdvisoryPortfolioRevealAllocationFragment.Args) PortfolioRevealAllocationDuxo.INSTANCE.getArgs(PortfolioRevealAllocationDuxo.this.getSavedStateHandle())).getBrokerageAccountType()));
                String string2 = this.$applicationId.toString();
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
            PortfolioRevealAllocationDuxo.this.applyMutation(new AnonymousClass1((GetPortfolioRevealResponseDto) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: PortfolioRevealAllocationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/PortfolioRevealAllocationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.PortfolioRevealAllocationDuxo$onStart$1$1", m3645f = "PortfolioRevealAllocationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.PortfolioRevealAllocationDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PortfolioRevealAllocationViewState, Continuation<? super PortfolioRevealAllocationViewState>, Object> {
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
            public final Object invoke(PortfolioRevealAllocationViewState portfolioRevealAllocationViewState, Continuation<? super PortfolioRevealAllocationViewState> continuation) {
                return ((AnonymousClass1) create(portfolioRevealAllocationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((PortfolioRevealAllocationViewState) this.L$0).copy(this.$portfolioReveal);
            }
        }
    }

    /* compiled from: PortfolioRevealAllocationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/PortfolioRevealAllocationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/PortfolioRevealAllocationDuxo;", "Lcom/robinhood/android/advisory/onboarding/portfolioreveal/allocation/AdvisoryPortfolioRevealAllocationFragment$Args;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PortfolioRevealAllocationDuxo, AdvisoryPortfolioRevealAllocationFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryPortfolioRevealAllocationFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AdvisoryPortfolioRevealAllocationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryPortfolioRevealAllocationFragment.Args getArgs(PortfolioRevealAllocationDuxo portfolioRevealAllocationDuxo) {
            return (AdvisoryPortfolioRevealAllocationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, portfolioRevealAllocationDuxo);
        }
    }
}
