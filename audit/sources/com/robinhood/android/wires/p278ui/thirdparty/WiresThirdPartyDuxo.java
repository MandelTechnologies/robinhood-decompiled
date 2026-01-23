package com.robinhood.android.wires.p278ui.thirdparty;

import android.net.Uri;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.formentry.FormEntryDuxo;
import com.robinhood.android.lib.transfers.ScamPreventionPageManagedServiceImpl;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.plaidconnect.api.PlaidConnectApi;
import com.robinhood.android.plaidconnect.models.PreparePaymentInstrumentRequest;
import com.robinhood.android.plaidconnect.models.PreparePaymentInstrumentRequest2;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.wires.p278ui.thirdparty.WiresThirdPartyEvent;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentDetailsV2;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2Request;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2RequestDetails;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentsV22;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiThirdPartyRecipientType;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentConstants;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.api.bonfire.transfer.ApiThirdPartyWireDocumentRequestIdResponse;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.wiretransfers.contracts.ScamPreventionButtonType;
import com.robinhood.wiretransfers.contracts.ScamPreventionPageManagedService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.MicrogramLaunchId;
import microgram.android.MicrogramSource;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.service.ServiceLocator;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: WiresThirdPartyDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 72\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u00017BA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J.\u0010\u001d\u001a\u0002H\u001e\"\n\b\u0000\u0010\u001e\u0018\u0001*\u00020\u001f*\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0082\b¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0019H\u0016J\b\u0010&\u001a\u00020\u0019H\u0016J\u0015\u0010'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010)¢\u0006\u0002\u0010*J\u000e\u0010+\u001a\u00020\u00192\u0006\u0010+\u001a\u00020)J\u000e\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u00100J\u0006\u00101\u001a\u00020\u0019J\u0016\u00102\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.H\u0082@¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\u00192\b\u00105\u001a\u0004\u0018\u000106R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyViewState;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyEvent;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "plaidConnectApi", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "paymentInstrumentBonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/analytics/EventLogger;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "handleScamPreventionSelection", "selection", "Lcom/robinhood/wiretransfers/contracts/ScamPreventionButtonType;", "getWireService", "ServiceType", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "microgramSource", "Lmicrogram/android/MicrogramSource;", "(Lcom/robinhood/android/microgramsdui/MicrogramManager;Lkotlinx/coroutines/CoroutineScope;Lmicrogram/android/MicrogramSource;)Ljava/lang/Object;", "onStart", "onStop", "stateChanged", "canContinue", "", "(Ljava/lang/Boolean;)V", "checkboxClicked", "continueClicked", "formEntryDuxo", "Lcom/robinhood/android/formentry/FormEntryDuxo;", "moveToDocumentUploadMode", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitTitleDocumentsFinished", "attemptToFinishFlow", "(Lcom/robinhood/android/formentry/FormEntryDuxo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attemptToMoveToReviewState", "payload", "", "Companion", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class WiresThirdPartyDuxo extends BaseDuxo3<WiresThirdPartyDataState, WiresThirdPartyViewState, WiresThirdPartyEvent> implements HasSavedState {
    private final EventLogger eventLogger;
    private final MicrogramManager microgramManager;
    private final PaymentInstrumentBonfireApi paymentInstrumentBonfireApi;
    private final PlaidConnectApi plaidConnectApi;
    private final SavedStateHandle savedStateHandle;
    private final TransfersBonfireApi transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WiresThirdPartyDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScamPreventionButtonType.values().length];
            try {
                iArr[ScamPreventionButtonType.CONTINUE_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScamPreventionButtonType.REPORT_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: WiresThirdPartyDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE}, m3647m = "attemptToFinishFlow")
    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$attemptToFinishFlow$1 */
    static final class C315311 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C315311(Continuation<? super C315311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WiresThirdPartyDuxo.this.attemptToFinishFlow(null, this);
        }
    }

    /* compiled from: WiresThirdPartyDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m3647m = "moveToDocumentUploadMode")
    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$moveToDocumentUploadMode$1 */
    static final class C315391 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C315391(Continuation<? super C315391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WiresThirdPartyDuxo.this.moveToDocumentUploadMode(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WiresThirdPartyDuxo(DuxoBundle duxoBundle, PlaidConnectApi plaidConnectApi, PaymentInstrumentBonfireApi paymentInstrumentBonfireApi, MicrogramManager microgramManager, TransfersBonfireApi transfersBonfireApi, EventLogger eventLogger, SavedStateHandle savedStateHandle) {
        super(new WiresThirdPartyDataState(new RemoteMicrogramApplication("app-wire-transfers", null, 2, null), WiresThirdPartyPageMode.SCAM_PREVENTION, false, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), new WiresThirdPartyStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
        Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.plaidConnectApi = plaidConnectApi;
        this.paymentInstrumentBonfireApi = paymentInstrumentBonfireApi;
        this.microgramManager = microgramManager;
        this.transfersBonfireApi = transfersBonfireApi;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        withDataState(new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WiresThirdPartyDuxo.onCreate$lambda$0(this.f$0, (WiresThirdPartyDataState) obj);
            }
        });
        Object hostImplementation = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(this.microgramManager, getLifecycleScope(), new MicrogramLaunchId(new RemoteMicrogramApplication("app-wire-transfers", null, 2, null), null, 2, null), null, 4, null).getComponent().getServiceLocator().getHostImplementation(ScamPreventionPageManagedService.class);
        Intrinsics.checkNotNull(hostImplementation, "null cannot be cast to non-null type com.robinhood.android.lib.transfers.ScamPreventionPageManagedServiceImpl");
        ((ScamPreventionPageManagedServiceImpl) hostImplementation).setBottomSelectedCallback(new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WiresThirdPartyDuxo.onCreate$lambda$1(this.f$0, (ScamPreventionButtonType) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(WiresThirdPartyDuxo wiresThirdPartyDuxo, WiresThirdPartyDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getMode() == WiresThirdPartyPageMode.SCAM_PREVENTION) {
            wiresThirdPartyDuxo.submit(WiresThirdPartyEvent.ShowScamPrevention.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(WiresThirdPartyDuxo wiresThirdPartyDuxo, ScamPreventionButtonType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        wiresThirdPartyDuxo.handleScamPreventionSelection(it);
        return Unit.INSTANCE;
    }

    private final void handleScamPreventionSelection(ScamPreventionButtonType selection) {
        int i = WhenMappings.$EnumSwitchMapping$0[selection.ordinal()];
        if (i == 1) {
            applyMutation(new C315381(null));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            submit(new WiresThirdPartyEvent.ReportScam(Uri.parse("robinhood://web?url=https://robinhood.com/us/en/support/articles/how-to-identify-and-report-scams/")));
        }
    }

    /* compiled from: WiresThirdPartyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$handleScamPreventionSelection$1", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$handleScamPreventionSelection$1 */
    static final class C315381 extends ContinuationImpl7 implements Function2<WiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C315381(Continuation<? super C315381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315381 c315381 = new C315381(continuation);
            c315381.L$0 = obj;
            return c315381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WiresThirdPartyDataState wiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState> continuation) {
            return ((C315381) create(wiresThirdPartyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WiresThirdPartyDataState.copy$default((WiresThirdPartyDataState) this.L$0, null, null, false, false, false, false, true, 63, null);
        }
    }

    private final /* synthetic */ <ServiceType> ServiceType getWireService(MicrogramManager microgramManager, CoroutineScope coroutineScope, MicrogramSource microgramSource) {
        ServiceLocator serviceLocator = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, coroutineScope, new MicrogramLaunchId(microgramSource, null, 2, null), null, 4, null).getComponent().getServiceLocator();
        Intrinsics.reifiedOperationMarker(4, "ServiceType");
        return (ServiceType) serviceLocator.getHostImplementation(Object.class);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        withDataState(new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WiresThirdPartyDuxo.onStart$lambda$2(this.f$0, (WiresThirdPartyDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(WiresThirdPartyDuxo wiresThirdPartyDuxo, WiresThirdPartyDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getMode() == WiresThirdPartyPageMode.SCAM_PREVENTION && state.getShowedScamPrevention()) {
            if (state.getContinueScamButtonClicked()) {
                if (((ThirdPartyWireKey) INSTANCE.getArgs((HasSavedState) wiresThirdPartyDuxo)).getUseGenericMode()) {
                    wiresThirdPartyDuxo.submitTitleDocumentsFinished();
                } else {
                    wiresThirdPartyDuxo.applyMutation(new WiresThirdPartyDuxo2(wiresThirdPartyDuxo, null));
                }
            } else {
                wiresThirdPartyDuxo.submit(WiresThirdPartyEvent.CloseFlow.INSTANCE);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        super.onStop();
        withDataState(new Function1() { // from class: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WiresThirdPartyDuxo.onStop$lambda$3(this.f$0, (WiresThirdPartyDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStop$lambda$3(WiresThirdPartyDuxo wiresThirdPartyDuxo, WiresThirdPartyDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getMode() == WiresThirdPartyPageMode.SCAM_PREVENTION) {
            wiresThirdPartyDuxo.applyMutation(new WiresThirdPartyDuxo3(null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: WiresThirdPartyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$stateChanged$1", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$stateChanged$1 */
    static final class C315411 extends ContinuationImpl7 implements Function2<WiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState>, Object> {
        final /* synthetic */ Boolean $canContinue;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C315411(Boolean bool, Continuation<? super C315411> continuation) {
            super(2, continuation);
            this.$canContinue = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315411 c315411 = new C315411(this.$canContinue, continuation);
            c315411.L$0 = obj;
            return c315411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WiresThirdPartyDataState wiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState> continuation) {
            return ((C315411) create(wiresThirdPartyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WiresThirdPartyDataState.copy$default((WiresThirdPartyDataState) this.L$0, null, null, Intrinsics.areEqual(this.$canContinue, boxing.boxBoolean(true)), false, false, false, false, 123, null);
        }
    }

    public final void stateChanged(Boolean canContinue) {
        applyMutation(new C315411(canContinue, null));
    }

    /* compiled from: WiresThirdPartyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$checkboxClicked$1", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$checkboxClicked$1 */
    static final class C315361 extends ContinuationImpl7 implements Function2<WiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState>, Object> {
        final /* synthetic */ boolean $checkboxClicked;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C315361(boolean z, Continuation<? super C315361> continuation) {
            super(2, continuation);
            this.$checkboxClicked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315361 c315361 = new C315361(this.$checkboxClicked, continuation);
            c315361.L$0 = obj;
            return c315361;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WiresThirdPartyDataState wiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState> continuation) {
            return ((C315361) create(wiresThirdPartyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WiresThirdPartyDataState.copy$default((WiresThirdPartyDataState) this.L$0, null, null, false, this.$checkboxClicked, false, false, false, 119, null);
        }
    }

    public final void checkboxClicked(boolean checkboxClicked) {
        applyMutation(new C315361(checkboxClicked, null));
    }

    /* compiled from: WiresThirdPartyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$continueClicked$1", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$continueClicked$1 */
    static final class C315371 extends ContinuationImpl7 implements Function2<WiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState>, Object> {
        final /* synthetic */ FormEntryDuxo $formEntryDuxo;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* compiled from: WiresThirdPartyDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$continueClicked$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WiresThirdPartyPageMode.values().length];
                try {
                    iArr[WiresThirdPartyPageMode.INFORMATION_INTAKE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WiresThirdPartyPageMode.SUBMIT_TITLE_DOCUMENTS_PROMPT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[WiresThirdPartyPageMode.REVIEW_SCREEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C315371(FormEntryDuxo formEntryDuxo, Continuation<? super C315371> continuation) {
            super(2, continuation);
            this.$formEntryDuxo = formEntryDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315371 c315371 = WiresThirdPartyDuxo.this.new C315371(this.$formEntryDuxo, continuation);
            c315371.L$0 = obj;
            return c315371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WiresThirdPartyDataState wiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState> continuation) {
            return ((C315371) create(wiresThirdPartyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            WiresThirdPartyDataState wiresThirdPartyDataState;
            WiresThirdPartyDuxo wiresThirdPartyDuxo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                wiresThirdPartyDataState = (WiresThirdPartyDataState) this.L$0;
                int i2 = WhenMappings.$EnumSwitchMapping$0[wiresThirdPartyDataState.getMode().ordinal()];
                if (i2 == 1) {
                    WiresThirdPartyDuxo wiresThirdPartyDuxo2 = WiresThirdPartyDuxo.this;
                    FormEntryDuxo formEntryDuxo = this.$formEntryDuxo;
                    this.L$0 = wiresThirdPartyDataState;
                    this.L$1 = wiresThirdPartyDuxo2;
                    this.label = 1;
                    Object payloadForRequests = formEntryDuxo.getPayloadForRequests(this);
                    if (payloadForRequests != coroutine_suspended) {
                        wiresThirdPartyDuxo = wiresThirdPartyDuxo2;
                        obj = payloadForRequests;
                    }
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            WiresThirdPartyDuxo wiresThirdPartyDuxo3 = WiresThirdPartyDuxo.this;
                            FormEntryDuxo formEntryDuxo2 = this.$formEntryDuxo;
                            this.L$0 = wiresThirdPartyDataState;
                            this.label = 3;
                            if (wiresThirdPartyDuxo3.attemptToFinishFlow(formEntryDuxo2, this) == coroutine_suspended) {
                            }
                        }
                        return wiresThirdPartyDataState;
                    }
                    WiresThirdPartyDuxo wiresThirdPartyDuxo4 = WiresThirdPartyDuxo.this;
                    this.L$0 = wiresThirdPartyDataState;
                    this.label = 2;
                    if (wiresThirdPartyDuxo4.moveToDocumentUploadMode(this) != coroutine_suspended) {
                        return wiresThirdPartyDataState;
                    }
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                WiresThirdPartyDataState wiresThirdPartyDataState2 = (WiresThirdPartyDataState) this.L$0;
                ResultKt.throwOnFailure(obj);
                return wiresThirdPartyDataState2;
            }
            wiresThirdPartyDuxo = (WiresThirdPartyDuxo) this.L$1;
            wiresThirdPartyDataState = (WiresThirdPartyDataState) this.L$0;
            ResultKt.throwOnFailure(obj);
            wiresThirdPartyDuxo.attemptToMoveToReviewState((String) obj);
            return wiresThirdPartyDataState;
        }
    }

    public final void continueClicked(FormEntryDuxo formEntryDuxo) {
        Intrinsics.checkNotNullParameter(formEntryDuxo, "formEntryDuxo");
        applyMutation(new C315371(formEntryDuxo, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object moveToDocumentUploadMode(Continuation<? super Unit> continuation) {
        C315391 c315391;
        if (continuation instanceof C315391) {
            c315391 = (C315391) continuation;
            int i = c315391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c315391.label = i - Integer.MIN_VALUE;
            } else {
                c315391 = new C315391(continuation);
            }
        }
        Object thirdPartyWireDocumentRequestId = c315391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c315391.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(thirdPartyWireDocumentRequestId);
                TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
                c315391.label = 1;
                thirdPartyWireDocumentRequestId = transfersBonfireApi.getThirdPartyWireDocumentRequestId(c315391);
                if (thirdPartyWireDocumentRequestId == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(thirdPartyWireDocumentRequestId);
            }
            String document_request_id = ((ApiThirdPartyWireDocumentRequestIdResponse) thirdPartyWireDocumentRequestId).getDocument_request_id();
            if (document_request_id.length() > 0) {
                submit(new WiresThirdPartyEvent.StartDocumentRequest(document_request_id));
                applyMutation(new C315402(null));
            } else {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception("Blank document id received third party wire"), false, null, 4, null);
                submit(WiresThirdPartyEvent.ShowError.INSTANCE);
            }
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
            submit(WiresThirdPartyEvent.ShowError.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: WiresThirdPartyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$moveToDocumentUploadMode$2", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$moveToDocumentUploadMode$2 */
    static final class C315402 extends ContinuationImpl7 implements Function2<WiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C315402(Continuation<? super C315402> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315402 c315402 = new C315402(continuation);
            c315402.L$0 = obj;
            return c315402;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WiresThirdPartyDataState wiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState> continuation) {
            return ((C315402) create(wiresThirdPartyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WiresThirdPartyDataState.copy$default((WiresThirdPartyDataState) this.L$0, null, WiresThirdPartyPageMode.DOCUMENT_UPLOAD, false, false, false, false, false, 125, null);
        }
    }

    public final void submitTitleDocumentsFinished() {
        submit(WiresThirdPartyEvent.StartFormEntry.INSTANCE);
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, new Screen(Screen.Name.WIRE_TRANSFER_ENTER_BANK_DETAILS, null, null, null, 14, null), null, null, null, 29, null);
        applyMutation(new C315421(null));
    }

    /* compiled from: WiresThirdPartyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$submitTitleDocumentsFinished$1", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$submitTitleDocumentsFinished$1 */
    static final class C315421 extends ContinuationImpl7 implements Function2<WiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C315421(Continuation<? super C315421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315421 c315421 = new C315421(continuation);
            c315421.L$0 = obj;
            return c315421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WiresThirdPartyDataState wiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState> continuation) {
            return ((C315421) create(wiresThirdPartyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WiresThirdPartyDataState.copy$default((WiresThirdPartyDataState) this.L$0, null, WiresThirdPartyPageMode.INFORMATION_INTAKE, false, false, false, false, false, 125, null);
        }
    }

    /* compiled from: WiresThirdPartyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$attemptToFinishFlow$2", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$attemptToFinishFlow$2 */
    static final class C315322 extends ContinuationImpl7 implements Function2<WiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C315322(Continuation<? super C315322> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315322 c315322 = new C315322(continuation);
            c315322.L$0 = obj;
            return c315322;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WiresThirdPartyDataState wiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState> continuation) {
            return ((C315322) create(wiresThirdPartyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WiresThirdPartyDataState.copy$default((WiresThirdPartyDataState) this.L$0, null, null, false, false, false, true, false, 95, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptToFinishFlow(FormEntryDuxo formEntryDuxo, Continuation<? super Unit> continuation) {
        C315311 c315311;
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi;
        FormEntryDuxo formEntryDuxo2;
        PaymentInstrumentType paymentInstrumentType;
        FormEntryDuxo formEntryDuxo3;
        if (continuation instanceof C315311) {
            c315311 = (C315311) continuation;
            int i = c315311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c315311.label = i - Integer.MIN_VALUE;
            } else {
                c315311 = new C315311(continuation);
            }
        }
        Object objLinkPaymentInstrument = c315311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c315311.label;
        try {
        } catch (Exception e) {
            if (Throwables.isHttpException(e)) {
                submit(new WiresThirdPartyEvent.TellerError(e));
            } else {
                submit(WiresThirdPartyEvent.ShowError.INSTANCE);
            }
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLinkPaymentInstrument);
            applyMutation(new C315322(null));
            paymentInstrumentBonfireApi = this.paymentInstrumentBonfireApi;
            PaymentInstrumentType paymentInstrumentType2 = PaymentInstrumentType.OUTGOING_WIRE;
            c315311.L$0 = formEntryDuxo;
            c315311.L$1 = paymentInstrumentBonfireApi;
            c315311.L$2 = paymentInstrumentType2;
            c315311.label = 1;
            Object payloadForRequests = formEntryDuxo.getPayloadForRequests(c315311);
            if (payloadForRequests == coroutine_suspended) {
                return coroutine_suspended;
            }
            formEntryDuxo2 = formEntryDuxo;
            paymentInstrumentType = paymentInstrumentType2;
            objLinkPaymentInstrument = payloadForRequests;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                formEntryDuxo3 = (FormEntryDuxo) c315311.L$0;
                ResultKt.throwOnFailure(objLinkPaymentInstrument);
                ApiPaymentInstrumentsV22 apiPaymentInstrumentsV22 = (ApiPaymentInstrumentsV22) objLinkPaymentInstrument;
                ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.RHS;
                ApiTransferAccount.TransferAccountType transferAccountType2 = ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT;
                String string2 = apiPaymentInstrumentsV22.getPaymentInstrument().getInstrumentId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                ApiPaymentInstrumentDetailsV2 details = apiPaymentInstrumentsV22.getPaymentInstrument().getDetails();
                Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentDetailsV2.OutgoingWire");
                submit(new WiresThirdPartyEvent.NavigateToTransfer(transferAccountType, transferAccountType2, string2, ((ApiPaymentInstrumentDetailsV2.OutgoingWire) details).getBank_name(), formEntryDuxo3.fields()));
                applyMutation(new C315333(null));
                return Unit.INSTANCE;
            }
            paymentInstrumentType = (PaymentInstrumentType) c315311.L$2;
            paymentInstrumentBonfireApi = (PaymentInstrumentBonfireApi) c315311.L$1;
            formEntryDuxo2 = (FormEntryDuxo) c315311.L$0;
            ResultKt.throwOnFailure(objLinkPaymentInstrument);
        }
        ApiPaymentInstrumentV2Request apiPaymentInstrumentV2Request = new ApiPaymentInstrumentV2Request(paymentInstrumentType, null, new ApiPaymentInstrumentV2RequestDetails.LinkOutgoingWireV3AccountRequestDetails((String) objLinkPaymentInstrument), ((ThirdPartyWireKey) INSTANCE.getArgs((HasSavedState) this)).getUseGenericMode() ? ApiThirdPartyRecipientType.THIRD_PARTY_OTHERS : null);
        c315311.L$0 = formEntryDuxo2;
        c315311.L$1 = null;
        c315311.L$2 = null;
        c315311.label = 2;
        objLinkPaymentInstrument = paymentInstrumentBonfireApi.linkPaymentInstrument(apiPaymentInstrumentV2Request, c315311);
        if (objLinkPaymentInstrument != coroutine_suspended) {
            formEntryDuxo3 = formEntryDuxo2;
            ApiPaymentInstrumentsV22 apiPaymentInstrumentsV222 = (ApiPaymentInstrumentsV22) objLinkPaymentInstrument;
            ApiTransferAccount.TransferAccountType transferAccountType3 = ApiTransferAccount.TransferAccountType.RHS;
            ApiTransferAccount.TransferAccountType transferAccountType22 = ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT;
            String string22 = apiPaymentInstrumentsV222.getPaymentInstrument().getInstrumentId().toString();
            Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
            ApiPaymentInstrumentDetailsV2 details2 = apiPaymentInstrumentsV222.getPaymentInstrument().getDetails();
            Intrinsics.checkNotNull(details2, "null cannot be cast to non-null type com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentDetailsV2.OutgoingWire");
            submit(new WiresThirdPartyEvent.NavigateToTransfer(transferAccountType3, transferAccountType22, string22, ((ApiPaymentInstrumentDetailsV2.OutgoingWire) details2).getBank_name(), formEntryDuxo3.fields()));
            applyMutation(new C315333(null));
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* compiled from: WiresThirdPartyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$attemptToFinishFlow$3", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$attemptToFinishFlow$3 */
    static final class C315333 extends ContinuationImpl7 implements Function2<WiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C315333(Continuation<? super C315333> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315333 c315333 = new C315333(continuation);
            c315333.L$0 = obj;
            return c315333;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WiresThirdPartyDataState wiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState> continuation) {
            return ((C315333) create(wiresThirdPartyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WiresThirdPartyDataState.copy$default((WiresThirdPartyDataState) this.L$0, null, null, false, false, false, false, false, 95, null);
        }
    }

    /* compiled from: WiresThirdPartyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$attemptToMoveToReviewState$1", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$attemptToMoveToReviewState$1 */
    static final class C315341 extends ContinuationImpl7 implements Function2<WiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C315341(Continuation<? super C315341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C315341 c315341 = new C315341(continuation);
            c315341.L$0 = obj;
            return c315341;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WiresThirdPartyDataState wiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState> continuation) {
            return ((C315341) create(wiresThirdPartyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WiresThirdPartyDataState.copy$default((WiresThirdPartyDataState) this.L$0, null, null, false, false, false, true, false, 95, null);
        }
    }

    public final void attemptToMoveToReviewState(String payload) {
        applyMutation(new C315341(null));
        try {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C315352(payload, null), 3, null);
        } catch (HttpException e) {
            submit(new WiresThirdPartyEvent.TellerError(e));
        }
    }

    /* compiled from: WiresThirdPartyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$attemptToMoveToReviewState$2", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$attemptToMoveToReviewState$2 */
    static final class C315352 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $payload;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C315352(String str, Continuation<? super C315352> continuation) {
            super(2, continuation);
            this.$payload = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WiresThirdPartyDuxo.this.new C315352(this.$payload, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C315352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PlaidConnectApi plaidConnectApi = WiresThirdPartyDuxo.this.plaidConnectApi;
                PreparePaymentInstrumentRequest preparePaymentInstrumentRequest = new PreparePaymentInstrumentRequest(new PreparePaymentInstrumentRequest2.PrepareOutgoingWireAccountRequestDetails("", this.$payload), PaymentInstrumentConstants.OUTGOING_WIRE_SERVER_VALUE);
                this.label = 1;
                obj = plaidConnectApi.prepare(preparePaymentInstrumentRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                EventLogger.DefaultImpls.logAppear$default(WiresThirdPartyDuxo.this.eventLogger, null, new Screen(Screen.Name.WIRE_TRANSFER_CONFIRM_BANK_DETAILS, null, null, null, 14, null), null, null, null, 29, null);
                WiresThirdPartyDuxo.this.submit(WiresThirdPartyEvent.MoveToReviewScreen.INSTANCE);
                WiresThirdPartyDuxo.this.applyMutation(new AnonymousClass1(null));
            } else {
                WiresThirdPartyDuxo.this.submit(new WiresThirdPartyEvent.TellerError(new HttpException(response)));
            }
            WiresThirdPartyDuxo.this.applyMutation(new AnonymousClass2(null));
            return Unit.INSTANCE;
        }

        /* compiled from: WiresThirdPartyDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$attemptToMoveToReviewState$2$1", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$attemptToMoveToReviewState$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<WiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(WiresThirdPartyDataState wiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState> continuation) {
                return ((AnonymousClass1) create(wiresThirdPartyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return WiresThirdPartyDataState.copy$default((WiresThirdPartyDataState) this.L$0, null, WiresThirdPartyPageMode.REVIEW_SCREEN, false, false, false, false, false, 125, null);
            }
        }

        /* compiled from: WiresThirdPartyDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$attemptToMoveToReviewState$2$2", m3645f = "WiresThirdPartyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyDuxo$attemptToMoveToReviewState$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<WiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(WiresThirdPartyDataState wiresThirdPartyDataState, Continuation<? super WiresThirdPartyDataState> continuation) {
                return ((AnonymousClass2) create(wiresThirdPartyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return WiresThirdPartyDataState.copy$default((WiresThirdPartyDataState) this.L$0, null, null, false, false, false, false, false, 95, null);
            }
        }
    }

    /* compiled from: WiresThirdPartyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDuxo;", "Lcom/robinhood/android/wires/ui/thirdparty/ThirdPartyWireKey;", "<init>", "()V", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<WiresThirdPartyDuxo, ThirdPartyWireKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ThirdPartyWireKey getArgs(SavedStateHandle savedStateHandle) {
            return (ThirdPartyWireKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ThirdPartyWireKey getArgs(WiresThirdPartyDuxo wiresThirdPartyDuxo) {
            return (ThirdPartyWireKey) DuxoCompanion.DefaultImpls.getArgs(this, wiresThirdPartyDuxo);
        }
    }
}
