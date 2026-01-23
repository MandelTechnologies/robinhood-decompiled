package com.robinhood.shared.trade.crypto.p397ui.disclosures;

import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.utils.UiCurrencyPairs2;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.resource.StringResource;
import contracts.crypto.trade.proto.p431v1.CryptoDisclosuresService;
import contracts.crypto.trade.proto.p431v1.CryptoTradeUserInputsService;
import contracts.crypto.trade.proto.p431v1.StreamCryptoDisclosuresRequestDto;
import contracts.crypto.trade.proto.p431v1.StreamCryptoDisclosuresResponseDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import microgram.android.MicrogramLaunchId;
import microgram.android.Monitoring;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.android.service.ManagedServiceExtension2;
import rh_server_driven_ui.p531v1.MarkdownTextDto;
import rh_server_driven_ui.p531v1.RenderableTextDto;
import rh_server_driven_ui.p531v1.TextDto;

/* compiled from: CryptoTradeDisclosuresProvider.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u000e\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010\"\u001a\u0004\u0018\u00010#J\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "cryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;)V", "microgramInstance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "lifecycleScope", "microgramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "getMicrogramComponent", "()Lmicrogram/android/inject/MicrogramComponent;", "microgramComponent$delegate", "Lkotlin/Lazy;", "cryptoDisclosuresService", "Lcontracts/crypto/trade/proto/v1/CryptoDisclosuresService;", "getCryptoDisclosuresService", "()Lcontracts/crypto/trade/proto/v1/CryptoDisclosuresService;", "cryptoDisclosuresService$delegate", "suspendUntilReady", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamCryptoOrderReviewMessageAndDisclosuresState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "streamMicrogramDisclosures", "streamClientDisclosures", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoTradeDisclosuresProvider {
    public static final int $stable = 8;
    private final AppType appType;

    /* renamed from: cryptoDisclosuresService$delegate, reason: from kotlin metadata */
    private final Lazy cryptoDisclosuresService;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final RealCryptoTradeUserInputsService cryptoTradeUserInputsService;

    /* renamed from: microgramComponent$delegate, reason: from kotlin metadata */
    private final Lazy microgramComponent;
    private final CoroutineScope microgramCoroutineScope;
    private final MicrogramManager microgramManager;

    /* compiled from: CryptoTradeDisclosuresProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.TRADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CryptoTradeDisclosuresProvider(AppType appType, CryptoExperimentsStore cryptoExperimentsStore, MicrogramManager microgramManager, @RootCoroutineScope CoroutineScope microgramCoroutineScope, RealCryptoTradeUserInputsService cryptoTradeUserInputsService) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
        Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
        this.appType = appType;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.microgramManager = microgramManager;
        this.microgramCoroutineScope = microgramCoroutineScope;
        this.cryptoTradeUserInputsService = cryptoTradeUserInputsService;
        this.microgramComponent = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.disclosures.CryptoTradeDisclosuresProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoTradeDisclosuresProvider.microgramComponent_delegate$lambda$1(this.f$0);
            }
        });
        this.cryptoDisclosuresService = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.disclosures.CryptoTradeDisclosuresProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoTradeDisclosuresProvider.cryptoDisclosuresService_delegate$lambda$2(this.f$0);
            }
        });
    }

    private final MicrogramManager2 microgramInstance(CoroutineScope lifecycleScope) {
        MicrogramManager microgramManager = this.microgramManager;
        MicrogramLaunchId microgramLaunchId = new MicrogramLaunchId(new RemoteMicrogramApplication("app-crypto-disclosures", null, 2, null), null, 2, null);
        microgramLaunchId.setExtensions(MapsKt.mapOf(ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(CryptoTradeUserInputsService.class), this.cryptoTradeUserInputsService)));
        Unit unit = Unit.INSTANCE;
        return MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, lifecycleScope, microgramLaunchId, null, 4, null);
    }

    private final MicrogramComponent getMicrogramComponent() {
        return (MicrogramComponent) this.microgramComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MicrogramComponent microgramComponent_delegate$lambda$1(CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider) {
        return cryptoTradeDisclosuresProvider.microgramInstance(cryptoTradeDisclosuresProvider.microgramCoroutineScope).getComponent();
    }

    private final CryptoDisclosuresService getCryptoDisclosuresService() {
        return (CryptoDisclosuresService) this.cryptoDisclosuresService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoDisclosuresService cryptoDisclosuresService_delegate$lambda$2(CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider) {
        return (CryptoDisclosuresService) cryptoTradeDisclosuresProvider.getMicrogramComponent().getServiceLocator().getClient(CryptoDisclosuresService.class);
    }

    /* compiled from: CryptoTradeDisclosuresProvider.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmicrogram/android/MicrogramState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.disclosures.CryptoTradeDisclosuresProvider$suspendUntilReady$2", m3645f = "CryptoTradeDisclosuresProvider.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.disclosures.CryptoTradeDisclosuresProvider$suspendUntilReady$2 */
    static final class C401742 extends ContinuationImpl7 implements Function2<Monitoring, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C401742(Continuation<? super C401742> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C401742 c401742 = new C401742(continuation);
            c401742.L$0 = obj;
            return c401742;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Monitoring monitoring, Continuation<? super Boolean> continuation) {
            return ((C401742) create(monitoring, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(Intrinsics.areEqual((Monitoring) this.L$0, Monitoring.Ready.INSTANCE));
        }
    }

    public final Object suspendUntilReady(Continuation<? super Unit> continuation) {
        Object objFirst = FlowKt.first(getMicrogramComponent().getMicrogramMonitor().getState(), new C401742(null), continuation);
        return objFirst == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFirst : Unit.INSTANCE;
    }

    public final Flow<CryptoOrderReviewMessageAndDisclosuresState> streamCryptoOrderReviewMessageAndDisclosuresState(CryptoOrderContext cryptoOrderContext) {
        return FlowKt.transformLatest(this.cryptoExperimentsStore.streamCryptoTradeFlowMicrogramDisclosureExperiment(), new C40172xaac5574e(null, this, cryptoOrderContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<CryptoOrderReviewMessageAndDisclosuresState> streamMicrogramDisclosures(CryptoOrderContext cryptoOrderContext) {
        CryptoOrderContext.RequestContext requestContext;
        if (cryptoOrderContext == null || (requestContext = cryptoOrderContext.getRequestContext()) == null) {
            return FlowKt.emptyFlow();
        }
        final Flow<StreamCryptoDisclosuresResponseDto> flowStreamCryptoDisclosures = getCryptoDisclosuresService().StreamCryptoDisclosures(new StreamCryptoDisclosuresRequestDto(new StreamCryptoDisclosuresRequestDto.LocationDto.CryptoTrading(new StreamCryptoDisclosuresRequestDto.CryptoTradingDto(UiCurrencyPairs2.toDto(requestContext.getCurrencyPair()), null, null, false, 14, null))));
        return new Flow<CryptoOrderReviewMessageAndDisclosuresState>() { // from class: com.robinhood.shared.trade.crypto.ui.disclosures.CryptoTradeDisclosuresProvider$streamMicrogramDisclosures$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.trade.crypto.ui.disclosures.CryptoTradeDisclosuresProvider$streamMicrogramDisclosures$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.disclosures.CryptoTradeDisclosuresProvider$streamMicrogramDisclosures$$inlined$map$1$2", m3645f = "CryptoTradeDisclosuresProvider.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.trade.crypto.ui.disclosures.CryptoTradeDisclosuresProvider$streamMicrogramDisclosures$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    RenderableTextDto text;
                    MarkdownTextDto markdown_text;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        StreamCryptoDisclosuresResponseDto streamCryptoDisclosuresResponseDto = (StreamCryptoDisclosuresResponseDto) obj;
                        String disclosure_title = streamCryptoDisclosuresResponseDto.getDisclosure_title();
                        String text2 = null;
                        StringResource stringResourceInvoke = disclosure_title != null ? StringResource.INSTANCE.invoke(disclosure_title) : null;
                        StringResource.Companion companion = StringResource.INSTANCE;
                        TextDto disclosure_text = streamCryptoDisclosuresResponseDto.getDisclosure_text();
                        if (disclosure_text != null && (text = disclosure_text.getText()) != null && (markdown_text = text.getMarkdown_text()) != null) {
                            text2 = markdown_text.getText();
                        }
                        if (text2 == null) {
                            text2 = "";
                        }
                        CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState = new CryptoOrderReviewMessageAndDisclosuresState(stringResourceInvoke, companion.invoke(text2), null, false, 8, null);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(cryptoOrderReviewMessageAndDisclosuresState, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super CryptoOrderReviewMessageAndDisclosuresState> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamCryptoDisclosures.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Flow<CryptoOrderReviewMessageAndDisclosuresState> streamClientDisclosures(CryptoOrderContext cryptoOrderContext) {
        StringResource stringResourceInvoke;
        CryptoOrderReviewMessageAndDisclosuresState.DisclosuresContent disclosuresContent;
        if (cryptoOrderContext != null) {
            stringResourceInvoke = CryptoOrderContexts.getReviewMessage(cryptoOrderContext, this.appType == AppType.RHC);
            if (stringResourceInvoke == null) {
            }
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke("");
        }
        StringResource stringResource = stringResourceInvoke;
        boolean z = cryptoOrderContext == null;
        if (WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()] == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            disclosuresContent = new CryptoOrderReviewMessageAndDisclosuresState.DisclosuresContent(companion.invoke(C38572R.string.crypto_general_label_disclosures, new Object[0]), companion.invoke(C40095R.string.crypto_order_create_summary_disclosures_url, new Object[0]));
        } else {
            disclosuresContent = null;
        }
        return FlowKt.flowOf(new CryptoOrderReviewMessageAndDisclosuresState(null, stringResource, disclosuresContent, z, 1, null));
    }
}
