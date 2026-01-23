package com.robinhood.shared.trade.crypto.activity;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoMessagingStore;
import com.robinhood.models.api.ApiCryptoSduiMessageScreen;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.ErrorResponse3;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p314db.CryptoAccountPreferences;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.contracts.lib.TradeAction;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityEvent;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeFeeEstimationService;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService;
import com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderFailure;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import contracts.crypto.trade.proto.p431v1.CryptoTradeUserInputsService;
import java.util.UUID;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.service.ManagedServiceExtension2;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTradeFeeEstimationService;

/* compiled from: CryptoOrderActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001'BY\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0016\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityViewState;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "application", "Landroid/app/Application;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoMessagingStore", "Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoAccountPreferencesStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "cryptoTradeFeeEstimationService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;", "cryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "<init>", "(Landroid/app/Application;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;Lcom/robinhood/android/microgramsdui/MicrogramManager;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onShowOrderTypeSelector", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "isRecurringOrder", "", "onSubmissionFailure", "result", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Failure;", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoOrderActivityDuxo extends BaseDuxo5<CryptoOrderActivityViewState, CryptoOrderActivityEvent> implements HasSavedState {
    private final AppType appType;
    private final Application application;
    private final CryptoAccountPreferencesStore cryptoAccountPreferencesStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoMessagingStore cryptoMessagingStore;
    private final RealCryptoTradeFeeEstimationService cryptoTradeFeeEstimationService;
    private final RealCryptoTradeUserInputsService cryptoTradeUserInputsService;
    private final MicrogramManager microgramManager;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOrderActivityDuxo(Application application, AppType appType, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, CryptoMessagingStore cryptoMessagingStore, CryptoExperimentsStore cryptoExperimentsStore, CryptoAccountPreferencesStore cryptoAccountPreferencesStore, RealCryptoTradeFeeEstimationService cryptoTradeFeeEstimationService, RealCryptoTradeUserInputsService cryptoTradeUserInputsService, MicrogramManager microgramManager) {
        super(new CryptoOrderActivityViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoMessagingStore, "cryptoMessagingStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
        Intrinsics.checkNotNullParameter(cryptoTradeFeeEstimationService, "cryptoTradeFeeEstimationService");
        Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        this.application = application;
        this.appType = appType;
        this.savedStateHandle = savedStateHandle;
        this.cryptoMessagingStore = cryptoMessagingStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoAccountPreferencesStore = cryptoAccountPreferencesStore;
        this.cryptoTradeFeeEstimationService = cryptoTradeFeeEstimationService;
        this.cryptoTradeUserInputsService = cryptoTradeUserInputsService;
        this.microgramManager = microgramManager;
        if (appType == AppType.RHC) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C400991(null), 3, null);
        }
    }

    /* compiled from: CryptoOrderActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityDuxo$1", m3645f = "CryptoOrderActivityDuxo.kt", m3646l = {63}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityDuxo$1 */
    static final class C400991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C400991(Continuation<? super C400991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderActivityDuxo.this.new C400991(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C400991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoMessagingStore cryptoMessagingStore = CryptoOrderActivityDuxo.this.cryptoMessagingStore;
                    ApiCryptoSduiMessageScreen.TouchPoint touchPoint = ApiCryptoSduiMessageScreen.TouchPoint.PRE_TRADING;
                    UUID currencyPairId = ((CryptoOrderIntentKey) CryptoOrderActivityDuxo.INSTANCE.getExtras((HasSavedState) CryptoOrderActivityDuxo.this)).getCurrencyPairId();
                    this.label = 1;
                    obj = cryptoMessagingStore.forceFetchMessaging(touchPoint, currencyPairId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ApiCryptoSduiMessageScreen apiCryptoSduiMessageScreen = (ApiCryptoSduiMessageScreen) obj;
                if (apiCryptoSduiMessageScreen != null) {
                    CryptoOrderActivityDuxo.this.submit(new CryptoOrderActivityEvent.ShowScreen(apiCryptoSduiMessageScreen));
                }
            } catch (Exception e) {
                if (Throwables.isNetworkRelated(e)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, true, null, 4, null);
                } else {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C401001(null), 3, null);
        AppType appType = this.appType;
        AppType appType2 = AppType.TRADER;
        if (appType == appType2) {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C401012(null));
        }
        if (((CryptoOrderIntentKey) INSTANCE.getExtras((HasSavedState) this)).getAction() == TradeAction.SELL && this.appType == appType2) {
            MicrogramManager microgramManager = this.microgramManager;
            LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
            MicrogramLaunchId microgramLaunchId = new MicrogramLaunchId(new RemoteMicrogramApplication("app-crypto-trading-tax-lots", null, 2, null), null, 2, null);
            microgramLaunchId.setExtensions(MapsKt.mapOf(ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(CryptoTradeFeeEstimationService.class), this.cryptoTradeFeeEstimationService), ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(CryptoTradeUserInputsService.class), this.cryptoTradeUserInputsService)));
            Unit unit = Unit.INSTANCE;
            MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(microgramManager, lifecycleScope, microgramLaunchId, null, 4, null);
        }
    }

    /* compiled from: CryptoOrderActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityDuxo$onCreate$1", m3645f = "CryptoOrderActivityDuxo.kt", m3646l = {87}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityDuxo$onCreate$1 */
    static final class C401001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C401001(Continuation<? super C401001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderActivityDuxo.this.new C401001(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C401001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoUsVolumeTierEngagementExperiment = CryptoOrderActivityDuxo.this.cryptoExperimentsStore.streamCryptoUsVolumeTierEngagementExperiment();
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamCryptoUsVolumeTierEngagementExperiment, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (Intrinsics.areEqual(obj, boxing.boxBoolean(true))) {
                LottieUrl.CRYPTO_BOUNCING_BALL.prefetch(CryptoOrderActivityDuxo.this.application);
                LottieUrl.CRYPTO_ALERTS_NOTIFICATION.prefetch(CryptoOrderActivityDuxo.this.application);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoOrderActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityDuxo$onCreate$2", m3645f = "CryptoOrderActivityDuxo.kt", m3646l = {100}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityDuxo$onCreate$2 */
    static final class C401012 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C401012(Continuation<? super C401012> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderActivityDuxo.this.new C401012(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C401012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<CryptoAccountPreferences> flowStreamAccountPreferences = CryptoOrderActivityDuxo.this.cryptoAccountPreferencesStore.streamAccountPreferences();
                Flow<MonetizationModel> flow = new Flow<MonetizationModel>() { // from class: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityDuxo$onCreate$2$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2 */
                    public static final class C400982<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoOrderActivityDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityDuxo$onCreate$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C400982.this.emit(null, this);
                            }
                        }

                        public C400982(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
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
                                MonetizationModel monetizationModel = ((CryptoAccountPreferences) obj).getMonetizationModel();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(monetizationModel, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super MonetizationModel> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamAccountPreferences.collect(new C400982(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                final CryptoOrderActivityDuxo cryptoOrderActivityDuxo = CryptoOrderActivityDuxo.this;
                FlowCollector<? super MonetizationModel> flowCollector = new FlowCollector() { // from class: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityDuxo.onCreate.2.2

                    /* compiled from: CryptoOrderActivityDuxo.kt */
                    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityDuxo$onCreate$2$2$1", m3645f = "CryptoOrderActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityDuxo$onCreate$2$2$1, reason: invalid class name */
                    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoOrderActivityViewState, Continuation<? super CryptoOrderActivityViewState>, Object> {
                        final /* synthetic */ MonetizationModel $it;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(MonetizationModel monetizationModel, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$it = monetizationModel;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CryptoOrderActivityViewState cryptoOrderActivityViewState, Continuation<? super CryptoOrderActivityViewState> continuation) {
                            return ((AnonymousClass1) create(cryptoOrderActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return ((CryptoOrderActivityViewState) this.L$0).copy(this.$it);
                        }
                    }

                    public final Object emit(MonetizationModel monetizationModel, Continuation<? super Unit> continuation) {
                        cryptoOrderActivityDuxo.applyMutation(new AnonymousClass1(monetizationModel, null));
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((MonetizationModel) obj2, (Continuation<? super Unit>) continuation);
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    public final void onShowOrderTypeSelector(final CryptoOrderType orderType, final boolean isRecurringOrder) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        withDataState(new Function1() { // from class: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderActivityDuxo.onShowOrderTypeSelector$lambda$1(this.f$0, orderType, isRecurringOrder, (CryptoOrderActivityViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onShowOrderTypeSelector$lambda$1(CryptoOrderActivityDuxo cryptoOrderActivityDuxo, CryptoOrderType cryptoOrderType, boolean z, CryptoOrderActivityViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoOrderActivityDuxo.submit(new CryptoOrderActivityEvent.ShowCryptoOrderTypeSelector(cryptoOrderType, z, it.getMonetizationModelPreference()));
        return Unit.INSTANCE;
    }

    public final void onSubmissionFailure(OrderSubmissionManager.Result.Failure result) {
        Object showBillingOrderFailureAlert;
        Intrinsics.checkNotNullParameter(result, "result");
        Throwable throwable = result.getThrowable();
        if (throwable instanceof BillingCryptoOrderFailure) {
            BillingCryptoOrderFailure.Reason reason = ((BillingCryptoOrderFailure) throwable).getReason();
            if (reason == BillingCryptoOrderFailure.Reason.CRYPTO_FEE_UNAVAILABLE) {
                showBillingOrderFailureAlert = CryptoOrderActivityEvent.ShowFeeOrderSubmissionFailedAlert.INSTANCE;
            } else {
                showBillingOrderFailureAlert = new CryptoOrderActivityEvent.ShowBillingOrderFailureAlert(reason);
            }
            submit(showBillingOrderFailureAlert);
            return;
        }
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(throwable);
        if ((errorResponseExtractErrorResponse instanceof ErrorResponse3) && ((ErrorResponse3) errorResponseExtractErrorResponse).getError_code() == ErrorResponse3.ErrorCode.CRYPTO_FEE_UNAVAILABLE) {
            submit(CryptoOrderActivityEvent.ShowFeeOrderSubmissionFailedAlert.INSTANCE);
        } else {
            submit(new CryptoOrderActivityEvent.ShowGenericSubmissionFailureAlert(result, Throwables.isNetworkRelated(throwable)));
        }
    }

    /* compiled from: CryptoOrderActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityDuxo;", "Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<CryptoOrderActivityDuxo, CryptoOrderIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public CryptoOrderIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (CryptoOrderIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public CryptoOrderIntentKey getExtras(CryptoOrderActivityDuxo cryptoOrderActivityDuxo) {
            return (CryptoOrderIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, cryptoOrderActivityDuxo);
        }
    }
}
