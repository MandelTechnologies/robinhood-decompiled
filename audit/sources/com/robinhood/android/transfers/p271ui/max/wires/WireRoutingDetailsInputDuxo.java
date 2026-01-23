package com.robinhood.android.transfers.p271ui.max.wires;

import android.net.Uri;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.lib.transfers.ScamPreventionPageManagedServiceImpl;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.plaidconnect.api.PlaidConnectApi;
import com.robinhood.android.plaidconnect.models.PreparePaymentInstrumentRequest;
import com.robinhood.android.plaidconnect.models.PreparePaymentInstrumentRequest2;
import com.robinhood.android.transfers.p271ui.max.wires.WireRoutingDetailsInputDuxo;
import com.robinhood.android.transfers.p271ui.max.wires.WireRoutingDetailsInputEvent;
import com.robinhood.android.transfers.p271ui.max.wires.WireRoutingDetailsInputFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2Request;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2RequestDetails;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentsV22;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentConstants;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.api.bonfire.paymentinstruments.PreparePaymentInstrumentDetails;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: WireRoutingDetailsInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 -2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001-B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u0019J\u001e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+H\u0002J\u0006\u0010,\u001a\u00020\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDataState;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputViewState;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "plaidConnectApi", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "paymentInstrumentBonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "stateProvider", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "source", "Lmicrogram/android/RemoteMicrogramApplication;", "onCreate", "", "onRoutingNumberChange", "routingNumber", "", "onAccountNumberChange", "accountNumber", "onAgreementCheckChange", "checked", "", "onContinueButtonClick", "handleOutgoingWirePath", "state", "(Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDataState;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "navigateAfterLink", "response", "Lcom/robinhood/models/api/bonfire/paymentinstruments/ApiUkPaymentInstrumentsV2Response;", "handleScamPreventionSelection", "selection", "Lcom/robinhood/wiretransfers/contracts/ScamPreventionButtonType;", "moveToEnterInformationMode", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WireRoutingDetailsInputDuxo extends BaseDuxo3<WireRoutingDetailsInputDataState, WireRoutingDetailsInputViewState, WireRoutingDetailsInputEvent> implements HasSavedState {
    private final MicrogramManager microgramManager;
    private final PaymentInstrumentBonfireApi paymentInstrumentBonfireApi;
    private final PlaidConnectApi plaidConnectApi;
    private final SavedStateHandle savedStateHandle;
    private final RemoteMicrogramApplication source;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WireRoutingDetailsInputDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WireRoutingDetailsInputDataState3.values().length];
            try {
                iArr[WireRoutingDetailsInputDataState3.ENTER_INFORMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WireRoutingDetailsInputDataState3.CONFIRM_INFORMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WireRoutingDetailsInputDataState3.SCAM_PREVENTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ScamPreventionButtonType.values().length];
            try {
                iArr2[ScamPreventionButtonType.CONTINUE_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ScamPreventionButtonType.REPORT_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: WireRoutingDetailsInputDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo", m3645f = "WireRoutingDetailsInputDuxo.kt", m3646l = {116, 155}, m3647m = "handleOutgoingWirePath")
    /* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$handleOutgoingWirePath$1 */
    static final class C309991 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C309991(Continuation<? super C309991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WireRoutingDetailsInputDuxo.this.handleOutgoingWirePath(null, null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WireRoutingDetailsInputDuxo(PlaidConnectApi plaidConnectApi, PaymentInstrumentBonfireApi paymentInstrumentBonfireApi, MicrogramManager microgramManager, WireRoutingDetailsInputStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new WireRoutingDetailsInputDataState(((WireRoutingDetailsInputFragment.Args) INSTANCE.getArgs(savedStateHandle)).getTransferAccount(), null, null, false, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
        Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.plaidConnectApi = plaidConnectApi;
        this.paymentInstrumentBonfireApi = paymentInstrumentBonfireApi;
        this.microgramManager = microgramManager;
        this.savedStateHandle = savedStateHandle;
        this.source = new RemoteMicrogramApplication("app-wire-transfers", null, 2, null);
    }

    /* compiled from: WireRoutingDetailsInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onCreate$1", m3645f = "WireRoutingDetailsInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onCreate$1 */
    static final class C310061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C310061(Continuation<? super C310061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WireRoutingDetailsInputDuxo.this.new C310061(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C310061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WireRoutingDetailsInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onCreate$1$1", m3645f = "WireRoutingDetailsInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<WireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ WireRoutingDetailsInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WireRoutingDetailsInputDuxo wireRoutingDetailsInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = wireRoutingDetailsInputDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState> continuation) {
                return ((AnonymousClass1) create(wireRoutingDetailsInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState = (WireRoutingDetailsInputDataState) this.L$0;
                    Object hostImplementation = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(this.this$0.microgramManager, this.this$0.getLifecycleScope(), new MicrogramLaunchId(this.this$0.source, null, 2, null), null, 4, null).getComponent().getServiceLocator().getHostImplementation(ScamPreventionPageManagedService.class);
                    Intrinsics.checkNotNull(hostImplementation, "null cannot be cast to non-null type com.robinhood.android.lib.transfers.ScamPreventionPageManagedServiceImpl");
                    final WireRoutingDetailsInputDuxo wireRoutingDetailsInputDuxo = this.this$0;
                    ((ScamPreventionPageManagedServiceImpl) hostImplementation).setBottomSelectedCallback(new Function1() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onCreate$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return WireRoutingDetailsInputDuxo.C310061.AnonymousClass1.invokeSuspend$lambda$0(wireRoutingDetailsInputDuxo, (ScamPreventionButtonType) obj2);
                        }
                    });
                    this.this$0.submit(new WireRoutingDetailsInputEvent.NavigateToScamPrevention(this.this$0.source));
                    this.this$0.submit(WireRoutingDetailsInputEvent.LogEvent.ScreenAppearScamPrevention.INSTANCE);
                    this.this$0.submit(WireRoutingDetailsInputEvent.LaunchFormDuxo.INSTANCE);
                    return WireRoutingDetailsInputDataState.copy$default(wireRoutingDetailsInputDataState, null, null, null, false, false, true, WireRoutingDetailsInputDataState3.SCAM_PREVENTION, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(WireRoutingDetailsInputDuxo wireRoutingDetailsInputDuxo, ScamPreventionButtonType scamPreventionButtonType) {
                wireRoutingDetailsInputDuxo.handleScamPreventionSelection(scamPreventionButtonType);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WireRoutingDetailsInputDuxo wireRoutingDetailsInputDuxo = WireRoutingDetailsInputDuxo.this;
            wireRoutingDetailsInputDuxo.applyMutation(new AnonymousClass1(wireRoutingDetailsInputDuxo, null));
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C310061(null), 3, null);
    }

    /* compiled from: WireRoutingDetailsInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onRoutingNumberChange$1", m3645f = "WireRoutingDetailsInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onRoutingNumberChange$1 */
    static final class C310071 extends ContinuationImpl7 implements Function2<WireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState>, Object> {
        final /* synthetic */ String $routingNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310071(String str, Continuation<? super C310071> continuation) {
            super(2, continuation);
            this.$routingNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310071 c310071 = new C310071(this.$routingNumber, continuation);
            c310071.L$0 = obj;
            return c310071;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState> continuation) {
            return ((C310071) create(wireRoutingDetailsInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WireRoutingDetailsInputDataState.copy$default((WireRoutingDetailsInputDataState) this.L$0, null, null, this.$routingNumber, false, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
        }
    }

    public final void onRoutingNumberChange(String routingNumber) {
        applyMutation(new C310071(routingNumber, null));
    }

    /* compiled from: WireRoutingDetailsInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onAccountNumberChange$1", m3645f = "WireRoutingDetailsInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onAccountNumberChange$1 */
    static final class C310031 extends ContinuationImpl7 implements Function2<WireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState>, Object> {
        final /* synthetic */ String $accountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310031(String str, Continuation<? super C310031> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310031 c310031 = new C310031(this.$accountNumber, continuation);
            c310031.L$0 = obj;
            return c310031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState> continuation) {
            return ((C310031) create(wireRoutingDetailsInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WireRoutingDetailsInputDataState.copy$default((WireRoutingDetailsInputDataState) this.L$0, null, this.$accountNumber, null, false, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        }
    }

    public final void onAccountNumberChange(String accountNumber) {
        applyMutation(new C310031(accountNumber, null));
    }

    /* compiled from: WireRoutingDetailsInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onAgreementCheckChange$1", m3645f = "WireRoutingDetailsInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onAgreementCheckChange$1 */
    static final class C310041 extends ContinuationImpl7 implements Function2<WireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState>, Object> {
        final /* synthetic */ boolean $checked;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310041(boolean z, Continuation<? super C310041> continuation) {
            super(2, continuation);
            this.$checked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310041 c310041 = WireRoutingDetailsInputDuxo.this.new C310041(this.$checked, continuation);
            c310041.L$0 = obj;
            return c310041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState> continuation) {
            return ((C310041) create(wireRoutingDetailsInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState = (WireRoutingDetailsInputDataState) this.L$0;
            WireRoutingDetailsInputDuxo.this.submit(WireRoutingDetailsInputEvent.LogEvent.ConfirmCheckbox.INSTANCE);
            ConfirmModeData confirmModeData = wireRoutingDetailsInputDataState.getConfirmModeData();
            return WireRoutingDetailsInputDataState.copy$default(wireRoutingDetailsInputDataState, null, null, null, false, false, false, null, confirmModeData != null ? ConfirmModeData.copy$default(confirmModeData, this.$checked, null, null, null, 14, null) : null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }
    }

    public final void onAgreementCheckChange(boolean checked) {
        applyMutation(new C310041(checked, null));
    }

    /* compiled from: WireRoutingDetailsInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onContinueButtonClick$1", m3645f = "WireRoutingDetailsInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onContinueButtonClick$1 */
    static final class C310051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C310051(Continuation<? super C310051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WireRoutingDetailsInputDuxo.this.new C310051(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C310051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WireRoutingDetailsInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onContinueButtonClick$1$1", m3645f = "WireRoutingDetailsInputDuxo.kt", m3646l = {100}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$onContinueButtonClick$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<WireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ WireRoutingDetailsInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WireRoutingDetailsInputDuxo wireRoutingDetailsInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = wireRoutingDetailsInputDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState> continuation) {
                return ((AnonymousClass1) create(wireRoutingDetailsInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState = (WireRoutingDetailsInputDataState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    return wireRoutingDetailsInputDataState;
                }
                ResultKt.throwOnFailure(obj);
                WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState2 = (WireRoutingDetailsInputDataState) this.L$0;
                if (wireRoutingDetailsInputDataState2.getAccountNumber() == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (wireRoutingDetailsInputDataState2.getRoutingNumber() == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                WireRoutingDetailsInputDuxo wireRoutingDetailsInputDuxo = this.this$0;
                String routingNumber = wireRoutingDetailsInputDataState2.getRoutingNumber();
                this.L$0 = wireRoutingDetailsInputDataState2;
                this.label = 1;
                return wireRoutingDetailsInputDuxo.handleOutgoingWirePath(wireRoutingDetailsInputDataState2, routingNumber, this) == coroutine_suspended ? coroutine_suspended : wireRoutingDetailsInputDataState2;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WireRoutingDetailsInputDuxo wireRoutingDetailsInputDuxo = WireRoutingDetailsInputDuxo.this;
            wireRoutingDetailsInputDuxo.applyMutation(new AnonymousClass1(wireRoutingDetailsInputDuxo, null));
            return Unit.INSTANCE;
        }
    }

    public final void onContinueButtonClick() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C310051(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        if (r2 == r4) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleOutgoingWirePath(WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState, String str, Continuation<? super Unit> continuation) {
        C309991 c309991;
        String str2 = str;
        if (continuation instanceof C309991) {
            c309991 = (C309991) continuation;
            int i = c309991.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c309991.label = i - Integer.MIN_VALUE;
            } else {
                c309991 = new C309991(continuation);
            }
        }
        Object objPrepare = c309991.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c309991.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPrepare);
                int i3 = WhenMappings.$EnumSwitchMapping$0[wireRoutingDetailsInputDataState.getMode().ordinal()];
                if (i3 == 1) {
                    submit(WireRoutingDetailsInputEvent.LogEvent.ContinueTap.INSTANCE);
                    submit(WireRoutingDetailsInputEvent.LogEvent.ScreenAppearConfirm.INSTANCE);
                    PlaidConnectApi plaidConnectApi = this.plaidConnectApi;
                    PreparePaymentInstrumentRequest preparePaymentInstrumentRequest = new PreparePaymentInstrumentRequest(new PreparePaymentInstrumentRequest2.PrepareOutgoingWireAccountRequestDetails(str2, null, 2, null), PaymentInstrumentConstants.OUTGOING_WIRE_SERVER_VALUE);
                    c309991.L$0 = str2;
                    c309991.label = 1;
                    objPrepare = plaidConnectApi.prepare(preparePaymentInstrumentRequest, c309991);
                } else if (i3 == 2) {
                    submit(WireRoutingDetailsInputEvent.LogEvent.ConfirmContinue.INSTANCE);
                    if (wireRoutingDetailsInputDataState.getAccountNumber() != null && wireRoutingDetailsInputDataState.getRoutingNumber() != null) {
                        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.paymentInstrumentBonfireApi;
                        ApiPaymentInstrumentV2Request apiPaymentInstrumentV2Request = new ApiPaymentInstrumentV2Request(PaymentInstrumentType.OUTGOING_WIRE, null, new ApiPaymentInstrumentV2RequestDetails.LinkOutgoingWireAccountRequestDetails(wireRoutingDetailsInputDataState.getAccountNumber(), wireRoutingDetailsInputDataState.getRoutingNumber(), null, 4, null), null, 8, null);
                        c309991.label = 2;
                        objPrepare = paymentInstrumentBonfireApi.linkPaymentInstrument(apiPaymentInstrumentV2Request, c309991);
                        if (objPrepare == coroutine_suspended) {
                        }
                        navigateAfterLink((ApiPaymentInstrumentsV22) objPrepare);
                    }
                } else if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                str2 = (String) c309991.L$0;
                ResultKt.throwOnFailure(objPrepare);
                Response response = (Response) objPrepare;
                if (response.isSuccessful()) {
                    Object objBody = response.body();
                    Intrinsics.checkNotNull(objBody, "null cannot be cast to non-null type com.robinhood.models.api.bonfire.paymentinstruments.PreparePaymentInstrumentDetails.OutgoingWireWrapperPaymentInstrumentDetails");
                    applyMutation(new C310002(((PreparePaymentInstrumentDetails.OutgoingWireWrapperPaymentInstrumentDetails) objBody).getPayment_instrument_details(), str2, null));
                } else {
                    submit(new WireRoutingDetailsInputEvent.TellerError(new HttpException(response)));
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPrepare);
                navigateAfterLink((ApiPaymentInstrumentsV22) objPrepare);
            }
        } catch (HttpException e) {
            submit(new WireRoutingDetailsInputEvent.TellerError(e));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: WireRoutingDetailsInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$handleOutgoingWirePath$2", m3645f = "WireRoutingDetailsInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$handleOutgoingWirePath$2 */
    static final class C310002 extends ContinuationImpl7 implements Function2<WireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState>, Object> {
        final /* synthetic */ PreparePaymentInstrumentDetails.OutgoingWirePaymentInstrumentDetails $result;
        final /* synthetic */ String $routingNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310002(PreparePaymentInstrumentDetails.OutgoingWirePaymentInstrumentDetails outgoingWirePaymentInstrumentDetails, String str, Continuation<? super C310002> continuation) {
            super(2, continuation);
            this.$result = outgoingWirePaymentInstrumentDetails;
            this.$routingNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310002 c310002 = new C310002(this.$result, this.$routingNumber, continuation);
            c310002.L$0 = obj;
            return c310002;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState> continuation) {
            return ((C310002) create(wireRoutingDetailsInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState = (WireRoutingDetailsInputDataState) this.L$0;
            return WireRoutingDetailsInputDataState.copy$default(wireRoutingDetailsInputDataState, null, wireRoutingDetailsInputDataState.getAccountNumber(), this.$routingNumber, false, false, false, WireRoutingDetailsInputDataState3.CONFIRM_INFORMATION, new ConfirmModeData(false, this.$result.getBank_name(), this.$result.getUser_recipient_name(), this.$result.getUser_recipient_address()), 57, null);
        }
    }

    private final void navigateAfterLink(final ApiPaymentInstrumentsV22 response) {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WireRoutingDetailsInputDuxo.navigateAfterLink$lambda$0(this.f$0, response, (WireRoutingDetailsInputDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigateAfterLink$lambda$0(WireRoutingDetailsInputDuxo wireRoutingDetailsInputDuxo, ApiPaymentInstrumentsV22 apiPaymentInstrumentsV22, WireRoutingDetailsInputDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (((WireRoutingDetailsInputFragment.Args) INSTANCE.getArgs((HasSavedState) wireRoutingDetailsInputDuxo)).getNeedNewAccountResult()) {
            String string2 = apiPaymentInstrumentsV22.getPaymentInstrument().getInstrumentId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            wireRoutingDetailsInputDuxo.submit(new WireRoutingDetailsInputEvent.ReturnSelectedAccountResult(string2));
        } else {
            ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.RHS;
            ApiTransferAccount.TransferAccountType transferAccountType2 = ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT;
            String string3 = apiPaymentInstrumentsV22.getPaymentInstrument().getInstrumentId().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            wireRoutingDetailsInputDuxo.submit(new WireRoutingDetailsInputEvent.NavigateToTransferScreen(transferAccountType, transferAccountType2, string3, it.getRoutingNumber(), it.getAccountNumber()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleScamPreventionSelection(ScamPreventionButtonType selection) {
        int i = WhenMappings.$EnumSwitchMapping$1[selection.ordinal()];
        if (i == 1) {
            submit(WireRoutingDetailsInputEvent.LogEvent.AcknowledgeScamPrevention.INSTANCE);
            submit(WireRoutingDetailsInputEvent.LogEvent.ScreenAppearV2.INSTANCE);
            applyMutation(new C310011(null));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            submit(WireRoutingDetailsInputEvent.LogEvent.ReportAScam.INSTANCE);
            submit(new WireRoutingDetailsInputEvent.ReportScam(Uri.parse("robinhood://web?url=https://robinhood.com/us/en/support/articles/how-to-identify-and-report-scams/")));
        }
    }

    /* compiled from: WireRoutingDetailsInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$handleScamPreventionSelection$1", m3645f = "WireRoutingDetailsInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$handleScamPreventionSelection$1 */
    static final class C310011 extends ContinuationImpl7 implements Function2<WireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C310011(Continuation<? super C310011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310011 c310011 = new C310011(continuation);
            c310011.L$0 = obj;
            return c310011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState> continuation) {
            return ((C310011) create(wireRoutingDetailsInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WireRoutingDetailsInputDataState.copy$default((WireRoutingDetailsInputDataState) this.L$0, null, null, null, false, false, false, WireRoutingDetailsInputDataState3.ENTER_INFORMATION, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, null);
        }
    }

    /* compiled from: WireRoutingDetailsInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$moveToEnterInformationMode$1", m3645f = "WireRoutingDetailsInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputDuxo$moveToEnterInformationMode$1 */
    static final class C310021 extends ContinuationImpl7 implements Function2<WireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C310021(Continuation<? super C310021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310021 c310021 = new C310021(continuation);
            c310021.L$0 = obj;
            return c310021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState, Continuation<? super WireRoutingDetailsInputDataState> continuation) {
            return ((C310021) create(wireRoutingDetailsInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WireRoutingDetailsInputDataState.copy$default((WireRoutingDetailsInputDataState) this.L$0, null, null, null, false, false, false, WireRoutingDetailsInputDataState3.ENTER_INFORMATION, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
        }
    }

    public final void moveToEnterInformationMode() {
        applyMutation(new C310021(null));
    }

    /* compiled from: WireRoutingDetailsInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDuxo;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputFragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<WireRoutingDetailsInputDuxo, WireRoutingDetailsInputFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public WireRoutingDetailsInputFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (WireRoutingDetailsInputFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public WireRoutingDetailsInputFragment.Args getArgs(WireRoutingDetailsInputDuxo wireRoutingDetailsInputDuxo) {
            return (WireRoutingDetailsInputFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, wireRoutingDetailsInputDuxo);
        }
    }
}
