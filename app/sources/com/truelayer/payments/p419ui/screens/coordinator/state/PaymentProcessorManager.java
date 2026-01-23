package com.truelayer.payments.p419ui.screens.coordinator.state;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.http.HttpStatusCode;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.core.domain.experience.localisation.LocalisedText;
import com.truelayer.payments.core.domain.payments.AuthorizationFlow;
import com.truelayer.payments.core.domain.payments.AuthorizationFlow2;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentMethod;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.core.domain.payments.RecentAdditionalInput;
import com.truelayer.payments.core.domain.payments.User;
import com.truelayer.payments.core.domain.payments.UserAccount;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.domain.utils.Outcome4;
import com.truelayer.payments.core.logger.Logger6;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.core.network.experience.TranslationProvider;
import com.truelayer.payments.core.store.AdditionalInputs;
import com.truelayer.payments.core.store.Store;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.errors.InternalError;
import com.truelayer.payments.p419ui.models.PaymentContext;
import com.truelayer.payments.p419ui.screens.FormInputWrapper;
import com.truelayer.payments.p419ui.screens.LastInputError;
import com.truelayer.payments.p419ui.screens.Screen;
import com.truelayer.payments.p419ui.screens.ScreenKt;
import com.truelayer.payments.p419ui.screens.coordinator.state.PaymentProcessorState;
import com.truelayer.payments.p419ui.screens.formflows.model.FormScreensCreator;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: PaymentProcessorManager.kt */
@Metadata(m3635d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 z2\u00020\u0001:\u0001zB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010+\u001a\u00020,H\u0082@¢\u0006\u0002\u0010-J\u000e\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u000200J2\u00101\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u000203022\u000e\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00020$052\u0006\u00106\u001a\u000207H\u0082@¢\u0006\u0002\u00108J7\u00109\u001a\u00020,2(\u0010:\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u0017020<\u0012\u0006\u0012\u0004\u0018\u00010\u00010;H\u0002¢\u0006\u0002\u0010>J*\u0010?\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0017022\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010DJ\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001702H\u0082@¢\u0006\u0002\u0010-J\u001a\u0010E\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u001702H\u0082@¢\u0006\u0002\u0010-J$\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00162\u0006\u0010I\u001a\u00020F2\u0006\u0010J\u001a\u00020KH\u0082@¢\u0006\u0002\u0010LJ0\u0010M\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020O0N\u0012\u0004\u0012\u00020\u0017022\b\u0010A\u001a\u0004\u0018\u00010BH\u0082@¢\u0006\u0002\u0010PJ\"\u0010Q\u001a\u00020,2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u001702H\u0082@¢\u0006\u0002\u0010SJ\u0016\u0010T\u001a\u00020,2\u0006\u0010U\u001a\u00020$H\u0082@¢\u0006\u0002\u0010VJ\"\u0010W\u001a\u00020,2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u001702H\u0082@¢\u0006\u0002\u0010SJ\u0012\u0010X\u001a\u00020\u000f2\b\u0010I\u001a\u0004\u0018\u00010FH\u0002J\u0006\u0010Y\u001a\u00020,J\u000e\u0010Z\u001a\u00020,2\u0006\u0010I\u001a\u00020FJ2\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0\u00162\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020B0N2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020aH\u0002J\u0006\u0010b\u001a\u00020,J\u000e\u0010c\u001a\u00020,H\u0082@¢\u0006\u0002\u0010-J\u0006\u0010d\u001a\u00020,J\u0006\u0010e\u001a\u00020,J\u000e\u0010f\u001a\u00020,2\u0006\u0010g\u001a\u00020hJ\u000e\u0010i\u001a\u00020,2\u0006\u0010/\u001a\u000200J\u0006\u0010j\u001a\u00020,J2\u0010k\u001a\u00020,2\u0006\u0010^\u001a\u00020_2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020B0N2\u0006\u0010l\u001a\u00020HH\u0082@¢\u0006\u0002\u0010mJ$\u0010n\u001a\u00020,2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020B0N2\b\u0010^\u001a\u0004\u0018\u00010_J\b\u0010o\u001a\u00020,H\u0002J\u0010\u0010p\u001a\u00020,2\u0006\u0010q\u001a\u00020BH\u0002J\u0006\u0010r\u001a\u00020,J\u0018\u0010s\u001a\u00020,2\b\b\u0002\u0010t\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010uJ\u0010\u0010v\u001a\u00020,2\u0006\u0010w\u001a\u00020HH\u0002J\u0016\u0010v\u001a\u00020,2\u0006\u0010x\u001a\u00020BH\u0082@¢\u0006\u0002\u0010PJ\u0006\u0010y\u001a\u00020,R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082D¢\u0006\u0002\n\u0000R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020$0'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006{"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorManager;", "", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "api", "Lcom/truelayer/payments/core/network/Network;", PlaceTypes.STORE, "Lcom/truelayer/payments/core/store/Store;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/truelayer/payments/ui/models/PaymentContext;Lkotlinx/coroutines/CoroutineScope;Lcom/truelayer/payments/core/network/Network;Lcom/truelayer/payments/core/store/Store;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "canRetry", "getCanRetry", "()Z", WebsocketGatewayConstants.DATA_KEY, "Lcom/truelayer/payments/ui/screens/coordinator/state/ManagerData;", "errors", "", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "maxRetryCount", "", "maxWaitTimeMillis", "", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "paymentProcessorManagerState", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;", "retryCount", "state", "Lkotlinx/coroutines/flow/SharedFlow;", "getState", "()Lkotlinx/coroutines/flow/SharedFlow;", "waitTimeMillis", "clearErrors", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUserAccount", "account", "Lcom/truelayer/payments/core/domain/payments/UserAccount;", "ensureDataForStep", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState$Error;", "step", "Ljava/lang/Class;", "snapshot", "Lcom/truelayer/payments/ui/screens/coordinator/state/ManagerDataSnapshot;", "(Ljava/lang/Class;Lcom/truelayer/payments/ui/screens/coordinator/state/ManagerDataSnapshot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeAuthorizationFlowApiCall", "call", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "(Lkotlin/jvm/functions/Function1;)V", "getLegals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "selectedProviderCountryCode", "", "isSignupPlus", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPayment", "Lcom/truelayer/payments/core/domain/payments/Payment;", "getRecommendedProviders", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", Card.Icon.PAYMENT, "action", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$ProviderSelection;", "(Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowActionNext$ProviderSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTranslations", "", "Lcom/truelayer/payments/core/domain/experience/localisation/LocalisedText;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleAuthorizationFlowResponse", "response", "(Lcom/truelayer/payments/core/domain/utils/Outcome;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handlePaymentProcessorState", "processorState", "(Lcom/truelayer/payments/ui/screens/coordinator/state/PaymentProcessorState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handlePaymentResponse", "isPaymentInFlowBrakingState", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "notifyPaymentStateChanged", "produceInputMapForScreenWithError", "Lcom/truelayer/payments/ui/screens/FormInputWrapper;", "inputsMap", "screen", "Lcom/truelayer/payments/ui/screens/Screen$Form;", "error", "Lcom/truelayer/payments/core/domain/errors/CoreError$HttpError$InvalidParameters;", "redirectFailed", "reloadPayment", "reset", "saveUserAccount", "selectProvider", "selectionResult", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;", "selectUserAccount", "startAuthorization", "storeAdditionalInputs", "selectedProvider", "(Lcom/truelayer/payments/ui/screens/Screen$Form;Ljava/util/Map;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitAdditionalInputs", "submitConsent", "submitSchemeSelection", "schemeId", "successfulRedirect", "tryToProduceNextState", "recurrenceDepth", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSelectedProvider", "provider", "providerId", "useNewAccount", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PaymentProcessorManager {
    private static final String API_TAG = "MGR-API";
    private final StateFlow2<Boolean> _isLoading;
    private final Network api;
    private final ManagerData data;
    private final CoroutineDispatcher dispatcher;
    private final StateFlow2<List<CoreError>> errors;
    private final StateFlow<Boolean> isLoading;
    private int maxRetryCount;
    private final long maxWaitTimeMillis;
    private final PaymentContext paymentContext;
    private final StateFlow2<PaymentProcessorState> paymentProcessorManagerState;
    private int retryCount;
    private final CoroutineScope scope;
    private final SharedFlow<PaymentProcessorState> state;
    private final Store store;
    private long waitTimeMillis;
    public static final int $stable = 8;

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormScreensCreator.SelectType.values().length];
            try {
                iArr[FormScreensCreator.SelectType.SearchSelect.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormScreensCreator.SelectType.RadioButtonSelect.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager", m3645f = "PaymentProcessorManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE}, m3647m = "ensureDataForStep")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$ensureDataForStep$1 */
    static final class C430531 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C430531(Continuation<? super C430531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentProcessorManager.this.ensureDataForStep(null, null, this);
        }
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager", m3645f = "PaymentProcessorManager.kt", m3646l = {464}, m3647m = "getLegals")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$getLegals$1 */
    static final class C430551 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C430551(Continuation<? super C430551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentProcessorManager.this.getLegals(null, false, this);
        }
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager", m3645f = "PaymentProcessorManager.kt", m3646l = {412, 419}, m3647m = "getPayment")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$getPayment$1 */
    static final class C430561 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C430561(Continuation<? super C430561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentProcessorManager.this.getPayment(this);
        }
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager", m3645f = "PaymentProcessorManager.kt", m3646l = {438}, m3647m = "getRecommendedProviders")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$getRecommendedProviders$1 */
    static final class C430571 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C430571(Continuation<? super C430571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentProcessorManager.this.getRecommendedProviders(null, null, this);
        }
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager", m3645f = "PaymentProcessorManager.kt", m3646l = {454}, m3647m = "getTranslations")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$getTranslations$1 */
    static final class C430581 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C430581(Continuation<? super C430581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentProcessorManager.this.getTranslations(null, this);
        }
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager", m3645f = "PaymentProcessorManager.kt", m3646l = {84, 94, 103, 112, 120, 125, 136, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "handlePaymentProcessorState")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$handlePaymentProcessorState$1 */
    static final class C430591 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C430591(Continuation<? super C430591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentProcessorManager.this.handlePaymentProcessorState(null, this);
        }
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager", m3645f = "PaymentProcessorManager.kt", m3646l = {349, 358, 362, 370, 375, 383, 384, 393}, m3647m = "tryToProduceNextState")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$tryToProduceNextState$1 */
    static final class C430741 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C430741(Continuation<? super C430741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentProcessorManager.this.tryToProduceNextState(0, this);
        }
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager", m3645f = "PaymentProcessorManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m3647m = "updateSelectedProvider")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$updateSelectedProvider$1 */
    static final class C430751 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C430751(Continuation<? super C430751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentProcessorManager.this.updateSelectedProvider(null, this);
        }
    }

    public PaymentProcessorManager(PaymentContext paymentContext, CoroutineScope scope, Network api, Store store, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.paymentContext = paymentContext;
        this.scope = scope;
        this.api = api;
        this.store = store;
        this.dispatcher = dispatcher;
        this.data = new ManagerData();
        StateFlow2<PaymentProcessorState> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(PaymentProcessorState.Uninitialized.INSTANCE);
        this.paymentProcessorManagerState = stateFlow2MutableStateFlow;
        this.state = FlowKt.shareIn(stateFlow2MutableStateFlow, scope, SharingStarted.INSTANCE.getEagerly(), 1);
        StateFlow2<Boolean> stateFlow2MutableStateFlow2 = StateFlow4.MutableStateFlow(Boolean.TRUE);
        this._isLoading = stateFlow2MutableStateFlow2;
        this.isLoading = stateFlow2MutableStateFlow2;
        this.errors = StateFlow4.MutableStateFlow(CollectionsKt.emptyList());
        this.maxWaitTimeMillis = 5000L;
        this.waitTimeMillis = 5000L;
        this.maxRetryCount = 2;
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C430501(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(scope, dispatcher, null, new C430512(null), 2, null);
    }

    public /* synthetic */ PaymentProcessorManager(PaymentContext paymentContext, CoroutineScope coroutineScope, Network network, Store store, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentContext, coroutineScope, network, store, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final SharedFlow<PaymentProcessorState> getState() {
        return this.state;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    private final boolean getCanRetry() {
        return this.retryCount < this.maxRetryCount;
    }

    public final MerchantConfig getMerchantConfig() {
        Outcome<MerchantConfig, CoreError> merchantConfigOutcome = this.data.getMerchantConfigOutcome();
        if (merchantConfigOutcome != null) {
            return (MerchantConfig) Outcome4.okOrNull(merchantConfigOutcome);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b3, code lost:
    
        if (r12.emit(r11, r0) == r1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r11.emit(r3, r0) == r1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (r12.emit(r11, r0) == r1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        if (r12.emit(r11, r0) == r1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0105, code lost:
    
        if (r12.emit(r11, r0) == r1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0155, code lost:
    
        if (r12.emit(r11, r0) != r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0182, code lost:
    
        if (r12.emit(r11, r0) == r1) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handlePaymentProcessorState(PaymentProcessorState paymentProcessorState, Continuation<? super Unit> continuation) {
        C430591 c430591;
        PaymentProcessorManager paymentProcessorManager;
        if (continuation instanceof C430591) {
            c430591 = (C430591) continuation;
            int i = c430591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c430591.label = i - Integer.MIN_VALUE;
            } else {
                c430591 = new C430591(continuation);
            }
        }
        Object obj = c430591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c430591.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                Logger6.i$default(Logger6.INSTANCE, "Manager State: " + paymentProcessorState, "MGR-Collector", null, 4, null);
                if (!(paymentProcessorState instanceof PaymentProcessorState.AuthorizationRequired)) {
                    if (!(paymentProcessorState instanceof PaymentProcessorState.MoreDataRequiredToExecuteStep)) {
                        if (!(paymentProcessorState instanceof PaymentProcessorState.Authorizing.Consent)) {
                            if (!(paymentProcessorState instanceof PaymentProcessorState.Authorizing.Form)) {
                                if (!(paymentProcessorState instanceof PaymentProcessorState.Authorizing.SchemeSelection)) {
                                    if (!(paymentProcessorState instanceof PaymentProcessorState.Authorizing.Wait)) {
                                        if (!(paymentProcessorState instanceof PaymentProcessorState.Uninitialized)) {
                                            if (!(paymentProcessorState instanceof PaymentProcessorState.Authorizing.ProviderSelection)) {
                                                if (paymentProcessorState instanceof PaymentProcessorState.FinishedProcessingRedirect ? true : paymentProcessorState instanceof PaymentProcessorState.PaymentSuccess ? true : paymentProcessorState instanceof PaymentProcessorState.Authorizing.Redirect ? true : paymentProcessorState instanceof PaymentProcessorState.Error ? true : paymentProcessorState instanceof PaymentProcessorState.PaymentFailed ? true : paymentProcessorState instanceof PaymentProcessorState.Authorizing.UserAccountSelection) {
                                                    StateFlow2<PaymentProcessorState> stateFlow2 = this.paymentProcessorManagerState;
                                                    c430591.label = 8;
                                                    break;
                                                }
                                            } else {
                                                PaymentProcessorState.Authorizing.ProviderSelection providerSelection = (PaymentProcessorState.Authorizing.ProviderSelection) paymentProcessorState;
                                                if (providerSelection.getProviderSelectionResult() == null) {
                                                    StateFlow2<PaymentProcessorState> stateFlow22 = this.paymentProcessorManagerState;
                                                    c430591.label = 7;
                                                    break;
                                                } else {
                                                    selectProvider(providerSelection.getProviderSelectionResult());
                                                }
                                            }
                                        } else {
                                            load();
                                        }
                                    } else {
                                        TranslationProvider translationProvider = this.api.getTranslationProvider();
                                        com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = this.paymentContext.intoDomain$payments_ui_release();
                                        PaymentProcessorState.Authorizing.Wait wait = (PaymentProcessorState.Authorizing.Wait) paymentProcessorState;
                                        String countryCode = wait.getSelectedProvider().getCountryCode();
                                        boolean zIsSignupPlus = wait.getPayment().isSignupPlus();
                                        c430591.L$0 = this;
                                        c430591.L$1 = paymentProcessorState;
                                        c430591.label = 5;
                                        if (translationProvider.updateLegalsSync(paymentContextIntoDomain$payments_ui_release, countryCode, zIsSignupPlus, c430591) != coroutine_suspended) {
                                            paymentProcessorManager = this;
                                            StateFlow2<PaymentProcessorState> stateFlow23 = paymentProcessorManager.paymentProcessorManagerState;
                                            c430591.L$0 = null;
                                            c430591.L$1 = null;
                                            c430591.label = 6;
                                            break;
                                        }
                                    }
                                } else {
                                    PaymentProcessorState.Authorizing.SchemeSelection schemeSelection = (PaymentProcessorState.Authorizing.SchemeSelection) paymentProcessorState;
                                    if (schemeSelection.getSelectedSchemeId() == null) {
                                        StateFlow2<PaymentProcessorState> stateFlow24 = this.paymentProcessorManagerState;
                                        c430591.label = 4;
                                        break;
                                    } else {
                                        submitSchemeSelection(schemeSelection.getSelectedSchemeId());
                                    }
                                }
                            } else if (!((PaymentProcessorState.Authorizing.Form) paymentProcessorState).getMandatoryInputs().isEmpty()) {
                                StateFlow2<PaymentProcessorState> stateFlow25 = this.paymentProcessorManagerState;
                                c430591.label = 3;
                                break;
                            } else {
                                submitAdditionalInputs(MapsKt.emptyMap(), null);
                            }
                        } else if (((PaymentProcessorState.Authorizing.Consent) paymentProcessorState).getRequiresCollectingUserConsent()) {
                            StateFlow2<PaymentProcessorState> stateFlow26 = this.paymentProcessorManagerState;
                            c430591.label = 2;
                            break;
                        } else {
                            submitConsent();
                        }
                    } else {
                        StateFlow2<PaymentProcessorState> stateFlow27 = this.paymentProcessorManagerState;
                        PaymentProcessorState.Error.Internal internal = new PaymentProcessorState.Error.Internal(InternalError.FlowCoordinatorInternalInconsistency, null, "State MoreDataRequiredToExecuteStep is invalid here", 2, null);
                        c430591.label = 1;
                        break;
                    }
                    return coroutine_suspended;
                }
                startAuthorization();
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 5:
                paymentProcessorState = (PaymentProcessorState) c430591.L$1;
                paymentProcessorManager = (PaymentProcessorManager) c430591.L$0;
                ResultKt.throwOnFailure(obj);
                StateFlow2<PaymentProcessorState> stateFlow232 = paymentProcessorManager.paymentProcessorManagerState;
                c430591.L$0 = null;
                c430591.L$1 = null;
                c430591.label = 6;
                break;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 8:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$1", m3645f = "PaymentProcessorManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$1 */
    static final class C430501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C430501(Continuation<? super C430501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentProcessorManager.this.new C430501(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<PaymentProcessorState> state = PaymentProcessorManager.this.getState();
                final PaymentProcessorManager paymentProcessorManager = PaymentProcessorManager.this;
                FlowCollector<? super PaymentProcessorState> flowCollector = new FlowCollector() { // from class: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PaymentProcessorState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PaymentProcessorState paymentProcessorState, Continuation<? super Unit> continuation) {
                        if (!(paymentProcessorState instanceof PaymentProcessorState.Uninitialized)) {
                            Object objEmit = paymentProcessorManager._isLoading.emit(boxing.boxBoolean(false), continuation);
                            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (state.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$2", m3645f = "PaymentProcessorManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$2 */
    static final class C430512 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C430512(Continuation<? super C430512> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentProcessorManager.this.new C430512(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430512) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlowIsLoading = PaymentProcessorManager.this.isLoading();
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        Logger6.v$default(Logger6.INSTANCE, "isLoading: " + z, "MGR-Collector", null, 4, null);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowIsLoading.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    public final void reset() {
        this.data.reset();
        this.retryCount = 0;
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C430641(null), 3, null);
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$reset$1", m3645f = "PaymentProcessorManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$reset$1 */
    static final class C430641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C430641(Continuation<? super C430641> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentProcessorManager.this.new C430641(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentProcessorManager paymentProcessorManager = PaymentProcessorManager.this;
                this.label = 1;
                if (paymentProcessorManager.clearErrors(this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearErrors(Continuation<? super Unit> continuation) {
        Object objEmit = this.errors.emit(CollectionsKt.emptyList(), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$load$1", m3645f = "PaymentProcessorManager.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, 192, EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$load$1 */
    static final class C430601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C430601(Continuation<? super C430601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C430601 c430601 = PaymentProcessorManager.this.new C430601(continuation);
            c430601.L$0 = obj;
            return c430601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
        
            if (r13.handlePaymentResponse(r0, r12) != r1) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
          0x003e: PHI (r0v12 kotlinx.coroutines.CoroutineScope) = (r0v9 kotlinx.coroutines.CoroutineScope), (r0v16 kotlinx.coroutines.CoroutineScope) binds: [B:25:0x0072, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a2 A[Catch: Exception -> 0x0021, PHI: r0 r13
          0x00a2: PHI (r0v17 kotlinx.coroutines.Deferred) = (r0v14 kotlinx.coroutines.Deferred), (r0v21 kotlinx.coroutines.Deferred) binds: [B:29:0x009f, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r13v16 java.lang.Object) = (r13v15 java.lang.Object), (r13v0 java.lang.Object) binds: [B:29:0x009f, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0021, blocks: (B:7:0x001c, B:12:0x002a, B:35:0x00bc, B:15:0x0033, B:31:0x00a2, B:28:0x0096), top: B:45:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            CoroutineScope coroutineScope;
            PaymentProcessorManager paymentProcessorManager;
            Deferred deferredAsync$default;
            Object objAwait;
            Outcome<? extends Payment, ? extends CoreError> outcome;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
            } catch (Exception e) {
                Logger6.INSTANCE.m3171e("Failed to load payment", PaymentProcessorManager.API_TAG, e);
                StateFlow2 stateFlow2 = PaymentProcessorManager.this.errors;
                List listListOf = CollectionsKt.listOf(new CoreError.ConnectionError(e, null, null, "PaymentProcessorManager.load()", 6, null));
                this.L$0 = e;
                this.label = 6;
                if (stateFlow2.emit(listListOf, this) != coroutine_suspended) {
                    exc = e;
                }
            }
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    StateFlow2 stateFlow22 = PaymentProcessorManager.this._isLoading;
                    Boolean boolBoxBoolean = boxing.boxBoolean(true);
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    if (stateFlow22.emit(boolBoxBoolean, this) != coroutine_suspended) {
                        coroutineScope = coroutineScope2;
                        paymentProcessorManager = PaymentProcessorManager.this;
                        this.L$0 = coroutineScope;
                        this.label = 2;
                        if (paymentProcessorManager.clearErrors(this) != coroutine_suspended) {
                            CoroutineScope coroutineScope3 = coroutineScope;
                            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new PaymentProcessorManager3(PaymentProcessorManager.this, null), 3, null);
                            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new PaymentProcessorManager2(PaymentProcessorManager.this, null), 3, null);
                            deferredAsync$default2.start();
                            deferredAsync$default.start();
                            this.L$0 = deferredAsync$default;
                            this.label = 3;
                            obj = deferredAsync$default2.await(this);
                            if (obj == coroutine_suspended) {
                                Outcome<? extends Payment, ? extends CoreError> outcome2 = (Outcome) obj;
                                PaymentProcessorManager.this.data.setPaymentOutcome(outcome2);
                                this.L$0 = outcome2;
                                this.label = 4;
                                objAwait = deferredAsync$default.await(this);
                                if (objAwait == coroutine_suspended) {
                                    outcome = outcome2;
                                    obj = objAwait;
                                    PaymentProcessorManager.this.data.setMerchantConfigOutcome((Outcome) obj);
                                    PaymentProcessorManager paymentProcessorManager2 = PaymentProcessorManager.this;
                                    this.L$0 = null;
                                    this.label = 5;
                                    break;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    paymentProcessorManager = PaymentProcessorManager.this;
                    this.L$0 = coroutineScope;
                    this.label = 2;
                    if (paymentProcessorManager.clearErrors(this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 2:
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope32 = coroutineScope;
                    Deferred deferredAsync$default22 = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new PaymentProcessorManager3(PaymentProcessorManager.this, null), 3, null);
                    deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope32, null, null, new PaymentProcessorManager2(PaymentProcessorManager.this, null), 3, null);
                    deferredAsync$default22.start();
                    deferredAsync$default.start();
                    this.L$0 = deferredAsync$default;
                    this.label = 3;
                    obj = deferredAsync$default22.await(this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    deferredAsync$default = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Outcome<? extends Payment, ? extends CoreError> outcome22 = (Outcome) obj;
                    PaymentProcessorManager.this.data.setPaymentOutcome(outcome22);
                    this.L$0 = outcome22;
                    this.label = 4;
                    objAwait = deferredAsync$default.await(this);
                    if (objAwait == coroutine_suspended) {
                    }
                    break;
                case 4:
                    outcome = (Outcome) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    PaymentProcessorManager.this.data.setMerchantConfigOutcome((Outcome) obj);
                    PaymentProcessorManager paymentProcessorManager22 = PaymentProcessorManager.this;
                    this.L$0 = null;
                    this.label = 5;
                    break;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 6:
                    Exception exc2 = (Exception) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    exc = exc2;
                    PaymentProcessorManager.this.data.setPaymentOutcome(new Fail(new CoreError.ConnectionError(exc, null, null, "PaymentProcessorManager.load()", 6, null)));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void load() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, this.dispatcher, null, new C430601(null), 2, null);
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$notifyPaymentStateChanged$1", m3645f = "PaymentProcessorManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$notifyPaymentStateChanged$1 */
    static final class C430611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Payment $payment;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C430611(Payment payment, Continuation<? super C430611> continuation) {
            super(2, continuation);
            this.$payment = payment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentProcessorManager.this.new C430611(this.$payment, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
        
            if (r11.emit(r4, r10) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
        
            if (r11.handlePaymentResponse(r1, r10) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            PaymentProcessorManager.this.data.setAuthorizationFlowResponseOutcome(null);
            if (Intrinsics.areEqual(this.$payment, Outcome4.okOrNull(PaymentProcessorManager.this.data.getPaymentOutcome()))) {
                StateFlow2 stateFlow2 = PaymentProcessorManager.this.paymentProcessorManagerState;
                PaymentProcessorState.Error.Internal internal = new PaymentProcessorState.Error.Internal(InternalError.FlowCoordinatorInternalInconsistency, null, "notifyPaymentStateChanged returned the same payment as already present in the manager", 2, null);
                this.label = 1;
            } else {
                PaymentProcessorManager.this.data.setPaymentOutcome(new Ok(this.$payment));
                PaymentProcessorManager paymentProcessorManager = PaymentProcessorManager.this;
                Ok ok = new Ok(this.$payment);
                this.label = 2;
            }
            return coroutine_suspended;
        }
    }

    public final void notifyPaymentStateChanged(Payment payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        BuildersKt__Builders_commonKt.launch$default(this.scope, this.dispatcher, null, new C430611(payment, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectedProvider(PaymentProvider provider) {
        this.data.setPreSelectedProviderOutcome(new Ok(provider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateSelectedProvider(String str, Continuation<? super Unit> continuation) {
        C430751 c430751;
        PaymentProcessorManager paymentProcessorManager;
        PaymentProvider paymentProvider;
        if (continuation instanceof C430751) {
            c430751 = (C430751) continuation;
            int i = c430751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c430751.label = i - Integer.MIN_VALUE;
            } else {
                c430751 = new C430751(continuation);
            }
        }
        Object paymentProvider2 = c430751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c430751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(paymentProvider2);
            Outcome<PaymentProvider, CoreError> selectedProviderOutcome = this.data.createSnapshot().getSelectedProviderOutcome();
            if (Intrinsics.areEqual((selectedProviderOutcome == null || (paymentProvider = (PaymentProvider) Outcome4.okOrNull(selectedProviderOutcome)) == null) ? null : paymentProvider.getId(), str)) {
                return Unit.INSTANCE;
            }
            this._isLoading.tryEmit(boxing.boxBoolean(true));
            Logger6.i$default(Logger6.INSTANCE, "API -> getPaymentProvider " + str, API_TAG, null, 4, null);
            Network network = this.api;
            com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = this.paymentContext.intoDomain$payments_ui_release();
            c430751.L$0 = this;
            c430751.label = 1;
            paymentProvider2 = network.getPaymentProvider(paymentContextIntoDomain$payments_ui_release, str, c430751);
            if (paymentProvider2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentProcessorManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentProcessorManager = (PaymentProcessorManager) c430751.L$0;
            ResultKt.throwOnFailure(paymentProvider2);
        }
        Outcome outcome = (Outcome) paymentProvider2;
        boolean z = outcome instanceof Ok;
        if (!z) {
            if (!(outcome instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            paymentProcessorManager.data.setPreSelectedProviderOutcome(new Fail((CoreError) ((Fail) outcome).getError()));
        }
        if (!z) {
            if (!(outcome instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            paymentProcessorManager.updateSelectedProvider((PaymentProvider) ((Ok) outcome).getValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (getRecommendedProviders(r10, r6, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0102, code lost:
    
        if (r2.getLegals(r8, r9, r0) != r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ensureDataForStep(Class<? extends PaymentProcessorState> cls, ManagerDataSnapshot managerDataSnapshot, Continuation<? super Outcome<Unit, ? extends PaymentProcessorState.Error>> continuation) {
        C430531 c430531;
        PaymentProvider selectedProvider;
        PaymentProcessorManager paymentProcessorManager;
        Payment payment;
        if (continuation instanceof C430531) {
            c430531 = (C430531) continuation;
            int i = c430531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c430531.label = i - Integer.MIN_VALUE;
            } else {
                c430531 = new C430531(continuation);
            }
        }
        Object obj = c430531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c430531.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Payment payment2 = (Payment) Outcome4.okOrNull(managerDataSnapshot.getPayment());
            MerchantConfig merchantConfig = (MerchantConfig) Outcome4.okOrNull(managerDataSnapshot.getMerchantConfig());
            if (payment2 == null || merchantConfig == null) {
                return new Fail(new PaymentProcessorState.Error.Internal(InternalError.FlowCoordinatorInternalInconsistency, null, "Payment or merchant config data is not available"));
            }
            if (Intrinsics.areEqual(cls, PaymentProcessorState.Authorizing.ProviderSelection.class)) {
                AuthorizationFlow2 authorizationFlowActionNext = managerDataSnapshot.getAuthorizationFlowActionNext();
                AuthorizationFlow2.ProviderSelection providerSelection = authorizationFlowActionNext instanceof AuthorizationFlow2.ProviderSelection ? (AuthorizationFlow2.ProviderSelection) authorizationFlowActionNext : null;
                if (providerSelection != null) {
                    c430531.label = 1;
                } else {
                    return new Fail(new PaymentProcessorState.Error.Internal(InternalError.FlowCoordinatorInternalInconsistency, null, "Payment or provider selection action is null", 2, null));
                }
            } else {
                if (Intrinsics.areEqual(cls, PaymentProcessorState.Authorizing.Consent.class)) {
                    if (managerDataSnapshot.getSelectedProvider() == null) {
                        return new Fail(new PaymentProcessorState.Error.Internal(InternalError.FlowCoordinatorInternalInconsistency, null, "Selected provider is null", 2, null));
                    }
                } else if (Intrinsics.areEqual(cls, PaymentProcessorState.Authorizing.Wait.class)) {
                    selectedProvider = managerDataSnapshot.getSelectedProvider();
                    if (selectedProvider == null) {
                        return new Fail(new PaymentProcessorState.Error.Internal(InternalError.FlowCoordinatorInternalInconsistency, null, "Selected provider is null not valid for Wait state.", 2, null));
                    }
                    String countryCode = selectedProvider.getCountryCode();
                    c430531.L$0 = this;
                    c430531.L$1 = payment2;
                    c430531.L$2 = selectedProvider;
                    c430531.label = 2;
                    if (getTranslations(countryCode, c430531) != coroutine_suspended) {
                        paymentProcessorManager = this;
                        payment = payment2;
                        String countryCode2 = selectedProvider.getCountryCode();
                        boolean zIsSignupPlus = payment.isSignupPlus();
                        c430531.L$0 = null;
                        c430531.L$1 = null;
                        c430531.L$2 = null;
                        c430531.label = 3;
                    }
                    return coroutine_suspended;
                }
                return new Ok(Unit.INSTANCE);
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    selectedProvider = (PaymentProvider) c430531.L$2;
                    payment = (Payment) c430531.L$1;
                    paymentProcessorManager = (PaymentProcessorManager) c430531.L$0;
                    ResultKt.throwOnFailure(obj);
                    String countryCode22 = selectedProvider.getCountryCode();
                    boolean zIsSignupPlus2 = payment.isSignupPlus();
                    c430531.L$0 = null;
                    c430531.L$1 = null;
                    c430531.L$2 = null;
                    c430531.label = 3;
                } else if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            return new Ok(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handlePaymentResponse(Outcome<? extends Payment, ? extends CoreError> outcome, Continuation<? super Unit> continuation) {
        this.data.setPaymentOutcome(outcome);
        if (isPaymentInFlowBrakingState((Payment) Outcome4.okOrNull(outcome)) && getCanRetry()) {
            Object objReloadPayment = reloadPayment(continuation);
            return objReloadPayment == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objReloadPayment : Unit.INSTANCE;
        }
        Object objTryToProduceNextState$default = tryToProduceNextState$default(this, 0, continuation, 1, null);
        return objTryToProduceNextState$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTryToProduceNextState$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object reloadPayment(Continuation<? super Unit> continuation) {
        Logger6 logger6 = Logger6.INSTANCE;
        Logger6.v$default(logger6, "reloadPayment with delay(" + (this.waitTimeMillis / this.maxRetryCount) + ")", API_TAG, null, 4, null);
        if (!getCanRetry()) {
            Logger6.e$default(logger6, "Unable to reload payment", API_TAG, null, 4, null);
            Object objEmit = this.paymentProcessorManagerState.emit(new PaymentProcessorState.Error.Internal(InternalError.FlowCoordinatorInternalInconsistency, null, "Unable to reload payment", 2, null), continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
        }
        this.retryCount++;
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C430632(null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$reloadPayment$2", m3645f = "PaymentProcessorManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE, 331, 330}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$reloadPayment$2 */
    static final class C430632 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C430632(Continuation<? super C430632> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentProcessorManager.this.new C430632(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        
            if (r1.handlePaymentResponse((com.truelayer.payments.core.domain.utils.Outcome) r10, r9) != r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PaymentProcessorManager paymentProcessorManager;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = PaymentProcessorManager.this.waitTimeMillis / PaymentProcessorManager.this.maxRetryCount;
                this.label = 1;
                if (DelayKt.delay(j, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                paymentProcessorManager = (PaymentProcessorManager) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 3;
            }
            paymentProcessorManager = PaymentProcessorManager.this;
            this.L$0 = paymentProcessorManager;
            this.label = 2;
            obj = paymentProcessorManager.getPayment(this);
            if (obj != coroutine_suspended) {
                this.L$0 = null;
                this.label = 3;
            }
            return coroutine_suspended;
        }
    }

    private final boolean isPaymentInFlowBrakingState(Payment payment) {
        if (!(payment instanceof Payment.Authorizing)) {
            return false;
        }
        AuthorizationFlow.FlowActions actions = ((Payment.Authorizing) payment).getAuthorizationFlow().getActions();
        return (actions != null ? actions.getNext() : null) instanceof AuthorizationFlow2.Redirect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleAuthorizationFlowResponse(Outcome<? extends AuthorizationFlowResponse, ? extends CoreError> outcome, Continuation<? super Unit> continuation) {
        this.data.setAuthorizationFlowResponseOutcome(outcome);
        Object objTryToProduceNextState$default = tryToProduceNextState$default(this, 0, continuation, 1, null);
        return objTryToProduceNextState$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTryToProduceNextState$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:
    
        if (r14.emit(r7, r0) == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e8, code lost:
    
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f6, code lost:
    
        if (r2.tryToProduceNextState(r14 + 1, r0) == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        if (r15.emit(r6, r0) == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0175, code lost:
    
        if (r15.emit(r4, r0) != r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0193, code lost:
    
        if (r6.handlePaymentProcessorState(r15, r0) == r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryToProduceNextState(int i, Continuation<? super Unit> continuation) {
        C430741 c430741;
        ManagerDataSnapshot managerDataSnapshotCreateSnapshot;
        PaymentProcessorManager paymentProcessorManager;
        PaymentProcessorState paymentProcessorState;
        PaymentProcessorManager paymentProcessorManager2;
        Outcome outcome;
        PaymentProcessorManager paymentProcessorManager3;
        Outcome outcome2;
        PaymentProcessorState.Error error;
        if (continuation instanceof C430741) {
            c430741 = (C430741) continuation;
            int i2 = c430741.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c430741.label = i2 - Integer.MIN_VALUE;
            } else {
                c430741 = new C430741(continuation);
            }
        }
        Object objProduceState = c430741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c430741.label) {
            case 0:
                ResultKt.throwOnFailure(objProduceState);
                managerDataSnapshotCreateSnapshot = this.data.createSnapshot();
                PaymentProcessorState.Companion companion = PaymentProcessorState.INSTANCE;
                PaymentContext paymentContext = this.paymentContext;
                Store store = this.store;
                c430741.L$0 = this;
                c430741.L$1 = managerDataSnapshotCreateSnapshot;
                c430741.I$0 = i;
                c430741.label = 1;
                objProduceState = companion.produceState(paymentContext, store, managerDataSnapshotCreateSnapshot, c430741);
                if (objProduceState != coroutine_suspended) {
                    paymentProcessorManager = this;
                    paymentProcessorState = (PaymentProcessorState) objProduceState;
                    if (!(paymentProcessorState instanceof PaymentProcessorState.MoreDataRequiredToExecuteStep)) {
                        Class<? extends PaymentProcessorState> clazz = ((PaymentProcessorState.MoreDataRequiredToExecuteStep) paymentProcessorState).getClazz();
                        c430741.L$0 = paymentProcessorManager;
                        c430741.L$1 = null;
                        c430741.I$0 = i;
                        c430741.label = 2;
                        objProduceState = paymentProcessorManager.ensureDataForStep(clazz, managerDataSnapshotCreateSnapshot, c430741);
                        if (objProduceState != coroutine_suspended) {
                            paymentProcessorManager2 = paymentProcessorManager;
                            outcome = (Outcome) objProduceState;
                            if (!(outcome instanceof Ok)) {
                                if (i > 3) {
                                    Logger6.e$default(Logger6.INSTANCE, "Recurrence depth is too high", API_TAG, null, 4, null);
                                    StateFlow2<PaymentProcessorState> stateFlow2 = paymentProcessorManager2.paymentProcessorManagerState;
                                    PaymentProcessorState.Error.Internal internal = new PaymentProcessorState.Error.Internal(InternalError.FlowCoordinatorInternalInconsistency, null, "Recurrence depth is too high", 2, null);
                                    c430741.L$0 = paymentProcessorManager2;
                                    c430741.L$1 = outcome;
                                    c430741.label = 3;
                                    break;
                                } else {
                                    c430741.L$0 = paymentProcessorManager2;
                                    c430741.L$1 = outcome;
                                    c430741.label = 4;
                                    break;
                                }
                                paymentProcessorManager3 = paymentProcessorManager2;
                                outcome2 = outcome;
                                if (!(outcome2 instanceof Ok)) {
                                    if (outcome2 instanceof Fail) {
                                        error = (PaymentProcessorState.Error) ((Fail) outcome2).getError();
                                        if (error instanceof PaymentProcessorState.Error.Internal) {
                                            StateFlow2<PaymentProcessorState> stateFlow22 = paymentProcessorManager3.paymentProcessorManagerState;
                                            PaymentProcessorState.Error.Internal internal2 = (PaymentProcessorState.Error.Internal) error;
                                            PaymentProcessorState.Error.Internal internal3 = new PaymentProcessorState.Error.Internal(internal2.getCode(), null, internal2.getDebugMessage(), 2, null);
                                            c430741.L$0 = outcome2;
                                            c430741.L$1 = null;
                                            c430741.label = 5;
                                            break;
                                        } else if (error instanceof PaymentProcessorState.Error.Core) {
                                            StateFlow2<List<CoreError>> stateFlow23 = paymentProcessorManager3.errors;
                                            List<CoreError> listListOf = CollectionsKt.listOf(((PaymentProcessorState.Error.Core) error).getError());
                                            c430741.L$0 = paymentProcessorManager3;
                                            c430741.L$1 = outcome2;
                                            c430741.L$2 = error;
                                            c430741.label = 6;
                                            if (stateFlow23.emit(listListOf, c430741) != coroutine_suspended) {
                                                StateFlow2<PaymentProcessorState> stateFlow24 = paymentProcessorManager3.paymentProcessorManagerState;
                                                PaymentProcessorState.Error.Core core = new PaymentProcessorState.Error.Core(((PaymentProcessorState.Error.Core) error).getError(), null, 2, null);
                                                c430741.L$0 = outcome2;
                                                c430741.L$1 = null;
                                                c430741.L$2 = null;
                                                c430741.label = 7;
                                                break;
                                            }
                                        }
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            if (!(outcome instanceof Fail)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            paymentProcessorManager3 = paymentProcessorManager2;
                            outcome2 = outcome;
                            if (!(outcome2 instanceof Ok)) {
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        c430741.L$0 = null;
                        c430741.L$1 = null;
                        c430741.label = 8;
                        break;
                    }
                }
                return coroutine_suspended;
            case 1:
                i = c430741.I$0;
                managerDataSnapshotCreateSnapshot = (ManagerDataSnapshot) c430741.L$1;
                paymentProcessorManager = (PaymentProcessorManager) c430741.L$0;
                ResultKt.throwOnFailure(objProduceState);
                paymentProcessorState = (PaymentProcessorState) objProduceState;
                if (!(paymentProcessorState instanceof PaymentProcessorState.MoreDataRequiredToExecuteStep)) {
                }
                return coroutine_suspended;
            case 2:
                i = c430741.I$0;
                paymentProcessorManager2 = (PaymentProcessorManager) c430741.L$0;
                ResultKt.throwOnFailure(objProduceState);
                outcome = (Outcome) objProduceState;
                if (!(outcome instanceof Ok)) {
                }
                break;
            case 3:
            case 4:
                Outcome outcome3 = (Outcome) c430741.L$1;
                paymentProcessorManager2 = (PaymentProcessorManager) c430741.L$0;
                ResultKt.throwOnFailure(objProduceState);
                paymentProcessorManager3 = paymentProcessorManager2;
                outcome2 = outcome3;
                if (!(outcome2 instanceof Ok)) {
                }
                return Unit.INSTANCE;
            case 5:
            case 7:
                ResultKt.throwOnFailure(objProduceState);
                return Unit.INSTANCE;
            case 6:
                error = (PaymentProcessorState.Error) c430741.L$2;
                outcome2 = (Outcome) c430741.L$1;
                paymentProcessorManager3 = (PaymentProcessorManager) c430741.L$0;
                ResultKt.throwOnFailure(objProduceState);
                StateFlow2<PaymentProcessorState> stateFlow242 = paymentProcessorManager3.paymentProcessorManagerState;
                PaymentProcessorState.Error.Core core2 = new PaymentProcessorState.Error.Core(((PaymentProcessorState.Error.Core) error).getError(), null, 2, null);
                c430741.L$0 = outcome2;
                c430741.L$1 = null;
                c430741.L$2 = null;
                c430741.label = 7;
                break;
            case 8:
                ResultKt.throwOnFailure(objProduceState);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static /* synthetic */ Object tryToProduceNextState$default(PaymentProcessorManager paymentProcessorManager, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return paymentProcessorManager.tryToProduceNextState(i, continuation);
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$executeAuthorizationFlowApiCall$1", m3645f = "PaymentProcessorManager.kt", m3646l = {402, HttpStatusCode.FORBIDDEN, 404}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$executeAuthorizationFlowApiCall$1 */
    static final class C430541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> $call;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C430541(Function1<? super Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, ? extends Object> function1, Continuation<? super C430541> continuation) {
            super(2, continuation);
            this.$call = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentProcessorManager.this.new C430541(this.$call, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (r1.handleAuthorizationFlowResponse((com.truelayer.payments.core.domain.utils.Outcome) r6, r5) != r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = PaymentProcessorManager.this._isLoading;
                Boolean boolBoxBoolean = boxing.boxBoolean(true);
                this.label = 1;
                if (stateFlow2.emit(boolBoxBoolean, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                PaymentProcessorManager paymentProcessorManager = PaymentProcessorManager.this;
                this.label = 3;
            }
            Function1<Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> function1 = this.$call;
            this.label = 2;
            obj = function1.invoke(this);
            if (obj != coroutine_suspended) {
                PaymentProcessorManager paymentProcessorManager2 = PaymentProcessorManager.this;
                this.label = 3;
            }
            return coroutine_suspended;
        }
    }

    private final void executeAuthorizationFlowApiCall(Function1<? super Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, ? extends Object> call) {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C430541(call, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPayment(Continuation<? super Outcome<? extends Payment, ? extends CoreError>> continuation) {
        C430561 c430561;
        PaymentProcessorManager paymentProcessorManager;
        Payment payment;
        Payment payment2;
        PaymentProcessorManager paymentProcessorManager2;
        if (continuation instanceof C430561) {
            c430561 = (C430561) continuation;
            int i = c430561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c430561.label = i - Integer.MIN_VALUE;
            } else {
                c430561 = new C430561(continuation);
            }
        }
        Object payment3 = c430561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c430561.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(payment3);
            Logger6.i$default(Logger6.INSTANCE, "API -> getPayment " + this.paymentContext.getId(), API_TAG, null, 4, null);
            Network network = this.api;
            com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = this.paymentContext.intoDomain$payments_ui_release();
            c430561.L$0 = this;
            c430561.label = 1;
            payment3 = network.getPayment(paymentContextIntoDomain$payments_ui_release, c430561);
            if (payment3 != coroutine_suspended) {
                paymentProcessorManager = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            payment2 = (Payment) c430561.L$1;
            paymentProcessorManager2 = (PaymentProcessorManager) c430561.L$0;
            ResultKt.throwOnFailure(payment3);
            paymentProcessorManager = paymentProcessorManager2;
            payment = payment2;
            Logger6.i$default(Logger6.INSTANCE, "API RESULT <- getPayment " + paymentProcessorManager.paymentContext.getId() + " - " + payment.getClass().getSimpleName(), API_TAG, null, 4, null);
            return new Ok(payment);
        }
        paymentProcessorManager = (PaymentProcessorManager) c430561.L$0;
        ResultKt.throwOnFailure(payment3);
        Outcome outcome = (Outcome) payment3;
        if (!(outcome instanceof Ok)) {
            if (outcome instanceof Fail) {
                return outcome;
            }
            throw new NoWhenBranchMatchedException();
        }
        payment = (Payment) ((Ok) outcome).getValue();
        TrueLayerAnalytics.Companion companion = TrueLayerAnalytics.INSTANCE;
        TrueLayerAnalytics.AnalyticsContext analyticsContext = companion.getAnalyticsContext();
        if (analyticsContext != null) {
            PaymentMethod paymentMethod = payment.getPaymentMethod();
            PaymentMethod.BankTransfer bankTransfer = paymentMethod instanceof PaymentMethod.BankTransfer ? (PaymentMethod.BankTransfer) paymentMethod : null;
            analyticsContext.setAmountInMinor(bankTransfer != null ? boxing.boxLong(bankTransfer.getAmountInMinor()) : null);
        }
        TrueLayerAnalytics.AnalyticsContext analyticsContext2 = companion.getAnalyticsContext();
        if (analyticsContext2 != null) {
            analyticsContext2.setCurrency(payment.getCurrency().getCurrencyCode());
        }
        String selectedProviderId = payment.getSelectedProviderId();
        if (selectedProviderId != null) {
            c430561.L$0 = paymentProcessorManager;
            c430561.L$1 = payment;
            c430561.label = 2;
            if (paymentProcessorManager.updateSelectedProvider(selectedProviderId, c430561) != coroutine_suspended) {
                payment2 = payment;
                paymentProcessorManager2 = paymentProcessorManager;
                paymentProcessorManager = paymentProcessorManager2;
                payment = payment2;
            }
            return coroutine_suspended;
        }
        Logger6.i$default(Logger6.INSTANCE, "API RESULT <- getPayment " + paymentProcessorManager.paymentContext.getId() + " - " + payment.getClass().getSimpleName(), API_TAG, null, 4, null);
        return new Ok(payment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getMerchantConfig(Continuation<? super Outcome<MerchantConfig, ? extends CoreError>> continuation) {
        Logger6.i$default(Logger6.INSTANCE, "API -> getMerchantConfig", API_TAG, null, 4, null);
        return this.api.getMerchantConfig(this.paymentContext.intoDomain$payments_ui_release(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRecommendedProviders(Payment payment, AuthorizationFlow2.ProviderSelection providerSelection, Continuation<? super List<PaymentProvider>> continuation) {
        C430571 c430571;
        PaymentProcessorManager paymentProcessorManager;
        String userId;
        List listEmptyList;
        Object objEmptyList;
        if (continuation instanceof C430571) {
            c430571 = (C430571) continuation;
            int i = c430571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c430571.label = i - Integer.MIN_VALUE;
            } else {
                c430571 = new C430571(continuation);
            }
        }
        Object recommendedProvidersIds = c430571.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c430571.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(recommendedProvidersIds);
            Logger6.i$default(Logger6.INSTANCE, "API -> getRecommendedProviders", API_TAG, null, 4, null);
            User user = payment.getUser();
            if (user != null && (userId = user.getUserId()) != null) {
                Network network = this.api;
                com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = this.paymentContext.intoDomain$payments_ui_release();
                c430571.L$0 = this;
                c430571.L$1 = providerSelection;
                c430571.label = 1;
                recommendedProvidersIds = network.getRecommendedProvidersIds(paymentContextIntoDomain$payments_ui_release, userId, c430571);
                if (recommendedProvidersIds == coroutine_suspended) {
                    return coroutine_suspended;
                }
                paymentProcessorManager = this;
            } else {
                paymentProcessorManager = this;
                listEmptyList = CollectionsKt.emptyList();
                paymentProcessorManager.data.setRecommendedProvidersOutcome(new Ok(listEmptyList));
                return listEmptyList;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            providerSelection = (AuthorizationFlow2.ProviderSelection) c430571.L$1;
            paymentProcessorManager = (PaymentProcessorManager) c430571.L$0;
            ResultKt.throwOnFailure(recommendedProvidersIds);
        }
        Object ok = (Outcome) recommendedProvidersIds;
        if (!(ok instanceof Ok)) {
            if (!(ok instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            List list = (List) ((Ok) ok).getValue();
            List<PaymentProvider> providers = providerSelection.getProviders();
            ArrayList arrayList = new ArrayList();
            for (Object obj : providers) {
                if (list.contains(((PaymentProvider) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            ok = new Ok(arrayList);
        }
        if (ok instanceof Ok) {
            objEmptyList = ((Ok) ok).getValue();
        } else {
            if (!(ok instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            objEmptyList = CollectionsKt.emptyList();
        }
        listEmptyList = (List) objEmptyList;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        paymentProcessorManager.data.setRecommendedProvidersOutcome(new Ok(listEmptyList));
        return listEmptyList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTranslations(String str, Continuation<? super Outcome<? extends Map<String, LocalisedText>, ? extends CoreError>> continuation) {
        C430581 c430581;
        PaymentProcessorManager paymentProcessorManager;
        if (continuation instanceof C430581) {
            c430581 = (C430581) continuation;
            int i = c430581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c430581.label = i - Integer.MIN_VALUE;
            } else {
                c430581 = new C430581(continuation);
            }
        }
        Object objUpdateInputsSync = c430581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c430581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateInputsSync);
            Logger6.i$default(Logger6.INSTANCE, "API -> translations.updateInputsSync", API_TAG, null, 4, null);
            TranslationProvider translationProvider = this.api.getTranslationProvider();
            com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = this.paymentContext.intoDomain$payments_ui_release();
            c430581.L$0 = this;
            c430581.label = 1;
            objUpdateInputsSync = translationProvider.updateInputsSync(paymentContextIntoDomain$payments_ui_release, str, c430581);
            if (objUpdateInputsSync == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentProcessorManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentProcessorManager = (PaymentProcessorManager) c430581.L$0;
            ResultKt.throwOnFailure(objUpdateInputsSync);
        }
        Outcome<? extends Map<String, LocalisedText>, ? extends CoreError> outcome = (Outcome) objUpdateInputsSync;
        paymentProcessorManager.data.setTranslations(outcome);
        return outcome;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getLegals(String str, boolean z, Continuation<? super Outcome<Legals, ? extends CoreError>> continuation) {
        C430551 c430551;
        PaymentProcessorManager paymentProcessorManager;
        if (continuation instanceof C430551) {
            c430551 = (C430551) continuation;
            int i = c430551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c430551.label = i - Integer.MIN_VALUE;
            } else {
                c430551 = new C430551(continuation);
            }
        }
        Object objUpdateLegalsSync = c430551.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c430551.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateLegalsSync);
            Logger6.i$default(Logger6.INSTANCE, "API -> translations.updateLegalsSync", API_TAG, null, 4, null);
            TranslationProvider translationProvider = this.api.getTranslationProvider();
            com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = this.paymentContext.intoDomain$payments_ui_release();
            c430551.L$0 = this;
            c430551.label = 1;
            objUpdateLegalsSync = translationProvider.updateLegalsSync(paymentContextIntoDomain$payments_ui_release, str, z, c430551);
            if (objUpdateLegalsSync == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentProcessorManager = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentProcessorManager = (PaymentProcessorManager) c430551.L$0;
            ResultKt.throwOnFailure(objUpdateLegalsSync);
        }
        Outcome<Legals, ? extends CoreError> outcome = (Outcome) objUpdateLegalsSync;
        paymentProcessorManager.data.setLegals(outcome);
        return outcome;
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$redirectFailed$1", m3645f = "PaymentProcessorManager.kt", m3646l = {475}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$redirectFailed$1 */
    static final class C430621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C430621(Continuation<? super C430621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentProcessorManager.this.new C430621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = PaymentProcessorManager.this.paymentProcessorManagerState;
                PaymentProcessorState.Error.Internal internal = new PaymentProcessorState.Error.Internal(InternalError.ActivityNotFound, null, "Unable to find activity to handle redirect", 2, null);
                this.label = 1;
                if (stateFlow2.emit(internal, this) == coroutine_suspended) {
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

    public final void redirectFailed() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, this.dispatcher, null, new C430621(null), 2, null);
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$successfulRedirect$1", m3645f = "PaymentProcessorManager.kt", m3646l = {491, 499}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$successfulRedirect$1 */
    static final class C430731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C430731(Continuation<? super C430731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentProcessorManager.this.new C430731(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        
            if (r3.emit(r4, r10) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
        
            if (r11.emit(r4, r10) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ManagerDataSnapshot managerDataSnapshotCreateSnapshot = PaymentProcessorManager.this.data.createSnapshot();
            Payment payment = (Payment) Outcome4.okOrNull(managerDataSnapshotCreateSnapshot.getPayment());
            MerchantConfig merchantConfig = (MerchantConfig) Outcome4.okOrNull(managerDataSnapshotCreateSnapshot.getMerchantConfig());
            if (payment != null && merchantConfig != null) {
                StateFlow2 stateFlow2 = PaymentProcessorManager.this.paymentProcessorManagerState;
                AuthorizationFlow2 authorizationFlowActionNext = managerDataSnapshotCreateSnapshot.getAuthorizationFlowActionNext();
                AuthorizationFlow2.Redirect redirect = authorizationFlowActionNext instanceof AuthorizationFlow2.Redirect ? (AuthorizationFlow2.Redirect) authorizationFlowActionNext : null;
                PaymentProcessorState.FinishedProcessingRedirect finishedProcessingRedirect = new PaymentProcessorState.FinishedProcessingRedirect(payment, redirect != null ? redirect.getUrl() : null, (PaymentProvider) Outcome4.okOrNull(managerDataSnapshotCreateSnapshot.getSelectedProviderOutcome()));
                this.label = 2;
            } else {
                Logger6.e$default(Logger6.INSTANCE, "Payment or merchant config is null", PaymentProcessorManager.API_TAG, null, 4, null);
                StateFlow2 stateFlow22 = PaymentProcessorManager.this.paymentProcessorManagerState;
                PaymentProcessorState.Error.Internal internal = new PaymentProcessorState.Error.Internal(InternalError.FlowCoordinatorInternalInconsistency, null, "Payment or merchant config is null", 2, null);
                this.label = 1;
            }
            return coroutine_suspended;
        }
    }

    public final void successfulRedirect() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, this.dispatcher, null, new C430731(null), 2, null);
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$submitConsent$1", m3645f = "PaymentProcessorManager.kt", m3646l = {514}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$submitConsent$1 */
    static final class C430711 extends ContinuationImpl7 implements Function1<Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        int label;

        C430711(Continuation<? super C430711> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PaymentProcessorManager.this.new C430711(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C430711) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Logger6.i$default(Logger6.INSTANCE, "API -> submitConsent", PaymentProcessorManager.API_TAG, null, 4, null);
            Network network = PaymentProcessorManager.this.api;
            com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = PaymentProcessorManager.this.paymentContext.intoDomain$payments_ui_release();
            this.label = 1;
            Object objSubmitConsent = network.submitConsent(paymentContextIntoDomain$payments_ui_release, this);
            return objSubmitConsent == coroutine_suspended ? coroutine_suspended : objSubmitConsent;
        }
    }

    private final void submitConsent() {
        executeAuthorizationFlowApiCall(new C430711(null));
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$submitSchemeSelection$1", m3645f = "PaymentProcessorManager.kt", m3646l = {HttpStatusCode.DOWNTIME_ERROR}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$submitSchemeSelection$1 */
    static final class C430721 extends ContinuationImpl7 implements Function1<Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        final /* synthetic */ String $schemeId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C430721(String str, Continuation<? super C430721> continuation) {
            super(1, continuation);
            this.$schemeId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PaymentProcessorManager.this.new C430721(this.$schemeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C430721) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Logger6.i$default(Logger6.INSTANCE, "API -> submitSchemeSelection", PaymentProcessorManager.API_TAG, null, 4, null);
            Network network = PaymentProcessorManager.this.api;
            com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = PaymentProcessorManager.this.paymentContext.intoDomain$payments_ui_release();
            String str = this.$schemeId;
            this.label = 1;
            Object objSubmitSchemeSelection = network.submitSchemeSelection(paymentContextIntoDomain$payments_ui_release, str, this);
            return objSubmitSchemeSelection == coroutine_suspended ? coroutine_suspended : objSubmitSchemeSelection;
        }
    }

    private final void submitSchemeSelection(String schemeId) {
        executeAuthorizationFlowApiCall(new C430721(schemeId, null));
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$startAuthorization$1", m3645f = "PaymentProcessorManager.kt", m3646l = {531}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$startAuthorization$1 */
    static final class C430691 extends ContinuationImpl7 implements Function1<Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        int label;

        C430691(Continuation<? super C430691> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PaymentProcessorManager.this.new C430691(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C430691) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Logger6.i$default(Logger6.INSTANCE, "API -> startAuthorizationFlow", PaymentProcessorManager.API_TAG, null, 4, null);
            Network network = PaymentProcessorManager.this.api;
            com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = PaymentProcessorManager.this.paymentContext.intoDomain$payments_ui_release();
            this.label = 1;
            Object objStartAuthorizationFlow = network.startAuthorizationFlow(paymentContextIntoDomain$payments_ui_release, this);
            return objStartAuthorizationFlow == coroutine_suspended ? coroutine_suspended : objStartAuthorizationFlow;
        }
    }

    public final void startAuthorization() {
        executeAuthorizationFlowApiCall(new C430691(null));
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$selectUserAccount$1", m3645f = "PaymentProcessorManager.kt", m3646l = {538}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$selectUserAccount$1 */
    static final class C430681 extends ContinuationImpl7 implements Function1<Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        final /* synthetic */ UserAccount $account;
        int label;
        final /* synthetic */ PaymentProcessorManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C430681(UserAccount userAccount, PaymentProcessorManager paymentProcessorManager, Continuation<? super C430681> continuation) {
            super(1, continuation);
            this.$account = userAccount;
            this.this$0 = paymentProcessorManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C430681(this.$account, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C430681) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Logger6.i$default(Logger6.INSTANCE, "API -> submitUserAccountSelection " + this.$account.getId(), PaymentProcessorManager.API_TAG, null, 4, null);
                Network network = this.this$0.api;
                com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = this.this$0.paymentContext.intoDomain$payments_ui_release();
                String id = this.$account.getId();
                this.label = 1;
                obj = network.submitUserAccountSelection(paymentContextIntoDomain$payments_ui_release, id, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Outcome outcome = (Outcome) obj;
            PaymentProcessorManager paymentProcessorManager = this.this$0;
            UserAccount userAccount = this.$account;
            if (outcome instanceof Ok) {
                paymentProcessorManager.updateSelectedProvider(userAccount.getProvider());
                return outcome;
            }
            if (outcome instanceof Fail) {
                return outcome;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void selectUserAccount(UserAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        executeAuthorizationFlowApiCall(new C430681(account, this, null));
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$deleteUserAccount$1", m3645f = "PaymentProcessorManager.kt", m3646l = {550}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$deleteUserAccount$1 */
    static final class C430521 extends ContinuationImpl7 implements Function1<Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        final /* synthetic */ UserAccount $account;
        int label;
        final /* synthetic */ PaymentProcessorManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C430521(UserAccount userAccount, PaymentProcessorManager paymentProcessorManager, Continuation<? super C430521> continuation) {
            super(1, continuation);
            this.$account = userAccount;
            this.this$0 = paymentProcessorManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C430521(this.$account, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C430521) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Logger6.i$default(Logger6.INSTANCE, "API -> deleteSavedUserAccount " + this.$account.getId(), PaymentProcessorManager.API_TAG, null, 4, null);
            Network network = this.this$0.api;
            com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = this.this$0.paymentContext.intoDomain$payments_ui_release();
            String id = this.$account.getId();
            this.label = 1;
            Object objDeleteSavedUserAccount = network.deleteSavedUserAccount(paymentContextIntoDomain$payments_ui_release, id, this);
            return objDeleteSavedUserAccount == coroutine_suspended ? coroutine_suspended : objDeleteSavedUserAccount;
        }
    }

    public final void deleteUserAccount(UserAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        executeAuthorizationFlowApiCall(new C430521(account, this, null));
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$useNewAccount$1", m3645f = "PaymentProcessorManager.kt", m3646l = {560}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$useNewAccount$1 */
    static final class C430761 extends ContinuationImpl7 implements Function1<Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        int label;

        C430761(Continuation<? super C430761> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PaymentProcessorManager.this.new C430761(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C430761) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Logger6.i$default(Logger6.INSTANCE, "API -> useNewUserAccount", PaymentProcessorManager.API_TAG, null, 4, null);
            Network network = PaymentProcessorManager.this.api;
            com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = PaymentProcessorManager.this.paymentContext.intoDomain$payments_ui_release();
            this.label = 1;
            Object objUseNewUserAccount = network.useNewUserAccount(paymentContextIntoDomain$payments_ui_release, this);
            return objUseNewUserAccount == coroutine_suspended ? coroutine_suspended : objUseNewUserAccount;
        }
    }

    public final void useNewAccount() {
        executeAuthorizationFlowApiCall(new C430761(null));
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$saveUserAccount$1", m3645f = "PaymentProcessorManager.kt", m3646l = {571}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$saveUserAccount$1 */
    static final class C430651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C430651(Continuation<? super C430651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentProcessorManager.this.new C430651(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C430651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Logger6.i$default(Logger6.INSTANCE, "API -> saveUserAccount", PaymentProcessorManager.API_TAG, null, 4, null);
                Network network = PaymentProcessorManager.this.api;
                com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = PaymentProcessorManager.this.paymentContext.intoDomain$payments_ui_release();
                this.label = 1;
                obj = network.saveUserAccount(paymentContextIntoDomain$payments_ui_release, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Outcome outcome = (Outcome) obj;
            if (!(outcome instanceof Ok)) {
                if (outcome instanceof Fail) {
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void saveUserAccount() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, this.dispatcher, null, new C430651(null), 2, null);
    }

    public final void selectProvider(ProviderSelectionResult selectionResult) {
        Intrinsics.checkNotNullParameter(selectionResult, "selectionResult");
        if (selectionResult.getSaveUserAccount()) {
            saveUserAccount();
        }
        Outcome<PaymentProvider, CoreError> preSelectedProviderOutcome = this.data.getPreSelectedProviderOutcome();
        if ((preSelectedProviderOutcome != null ? (PaymentProvider) Outcome4.okOrNull(preSelectedProviderOutcome) : null) != null) {
            Logger6.e$default(Logger6.INSTANCE, "Pre-selected provider path is not yet supported", null, null, 6, null);
            this.data.setProviderSelectionResult(selectionResult);
            updateSelectedProvider(selectionResult.getProvider());
            executeAuthorizationFlowApiCall(new C430661(null));
            return;
        }
        this.data.setProviderSelectionResult(selectionResult);
        executeAuthorizationFlowApiCall(new C430672(selectionResult, this, null));
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$selectProvider$1", m3645f = "PaymentProcessorManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$selectProvider$1 */
    static final class C430661 extends ContinuationImpl7 implements Function1<Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        int label;

        C430661(Continuation<? super C430661> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PaymentProcessorManager.this.new C430661(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C430661) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Logger6.i$default(Logger6.INSTANCE, "re-execute the same action once user selection data is updated", PaymentProcessorManager.API_TAG, null, 4, null);
            Outcome<AuthorizationFlowResponse, CoreError> authorizationFlowResponseOutcome = PaymentProcessorManager.this.data.getAuthorizationFlowResponseOutcome();
            return authorizationFlowResponseOutcome == null ? new Fail(CoreError.HttpError.ServerError.copy$default(CoreError.INSTANCE.mo27021default(), 0, null, null, null, 0, "PaymentProcessorManager.selectProvider", null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null)) : authorizationFlowResponseOutcome;
        }
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$selectProvider$2", m3645f = "PaymentProcessorManager.kt", m3646l = {594}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$selectProvider$2 */
    static final class C430672 extends ContinuationImpl7 implements Function1<Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        final /* synthetic */ ProviderSelectionResult $selectionResult;
        int label;
        final /* synthetic */ PaymentProcessorManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C430672(ProviderSelectionResult providerSelectionResult, PaymentProcessorManager paymentProcessorManager, Continuation<? super C430672> continuation) {
            super(1, continuation);
            this.$selectionResult = providerSelectionResult;
            this.this$0 = paymentProcessorManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C430672(this.$selectionResult, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C430672) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Logger6.i$default(Logger6.INSTANCE, "API -> submitProviderSelection " + this.$selectionResult.getProvider().getId(), PaymentProcessorManager.API_TAG, null, 4, null);
                Network network = this.this$0.api;
                com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = this.this$0.paymentContext.intoDomain$payments_ui_release();
                String id = this.$selectionResult.getProvider().getId();
                this.label = 1;
                obj = network.submitProviderSelection(paymentContextIntoDomain$payments_ui_release, id, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Outcome outcome = (Outcome) obj;
            PaymentProcessorManager paymentProcessorManager = this.this$0;
            ProviderSelectionResult providerSelectionResult = this.$selectionResult;
            if (outcome instanceof Ok) {
                paymentProcessorManager.updateSelectedProvider(providerSelectionResult.getProvider());
                return outcome;
            }
            if (outcome instanceof Fail) {
                return outcome;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object storeAdditionalInputs(Screen.Form form, Map<String, String> map, PaymentProvider paymentProvider, Continuation<? super Unit> continuation) {
        List<FormInputWrapper> inputs = form.getInputs();
        ArrayList arrayList = new ArrayList();
        for (Object obj : inputs) {
            FormInputWrapper formInputWrapper = (FormInputWrapper) obj;
            boolean z = false;
            if (formInputWrapper instanceof FormInputWrapper.Select) {
                int i = WhenMappings.$EnumSwitchMapping$0[FormScreensCreator.INSTANCE.selectType(((FormInputWrapper.Select) formInputWrapper).getInput().getOptions().size()).ordinal()];
                if (i == 1) {
                    z = true;
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!(formInputWrapper instanceof FormInputWrapper.Text ? true : formInputWrapper instanceof FormInputWrapper.TextWithImage)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FormInputWrapper) it.next()).getId());
        }
        Date date = new Date();
        ArrayList arrayList3 = new ArrayList();
        for (String str : arrayList2) {
            String str2 = map.get(str);
            RecentAdditionalInput recentAdditionalInput = str2 != null ? new RecentAdditionalInput(str, str2, date) : null;
            if (recentAdditionalInput != null) {
                arrayList3.add(recentAdditionalInput);
            }
        }
        Object objM27025addOrUpdateSpDDLgk$default = AdditionalInputs.DefaultImpls.m27025addOrUpdateSpDDLgk$default(this.store.getAdditionalInputs(), paymentProvider.getId(), arrayList3, (byte) 0, continuation, 4, (Object) null);
        return objM27025addOrUpdateSpDDLgk$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM27025addOrUpdateSpDDLgk$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<FormInputWrapper> produceInputMapForScreenWithError(Map<String, String> inputsMap, Screen.Form screen, CoreError.HttpError.InvalidParameters error) {
        List<FormInputWrapper> inputs = screen.getInputs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(inputs, 10));
        for (FormInputWrapper formInputWrapperCopy$default : inputs) {
            String str = inputsMap.get(formInputWrapperCopy$default.getInput().getId());
            List<String> list = error.getInvalidParameters().get("inputs." + formInputWrapperCopy$default.getInput().getId());
            if (list == null) {
                list = error.getInvalidParameters().get(formInputWrapperCopy$default.getInput().getId());
            }
            if (str != null && list != null) {
                List<String> listListOf = list;
                if (listListOf.isEmpty()) {
                    listListOf = CollectionsKt.listOf(error.getMessage());
                }
                formInputWrapperCopy$default = ScreenKt.copy$default(formInputWrapperCopy$default, null, new LastInputError(str, listListOf), 1, null);
            }
            arrayList.add(formInputWrapperCopy$default);
        }
        return arrayList;
    }

    /* compiled from: PaymentProcessorManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$submitAdditionalInputs$1", m3645f = "PaymentProcessorManager.kt", m3646l = {664, 669}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.coordinator.state.PaymentProcessorManager$submitAdditionalInputs$1 */
    static final class C430701 extends ContinuationImpl7 implements Function1<Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
        final /* synthetic */ Map<String, String> $inputsMap;
        final /* synthetic */ Screen.Form $screen;
        final /* synthetic */ PaymentProvider $selectedProvider;
        Object L$0;
        int label;
        final /* synthetic */ PaymentProcessorManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C430701(Map<String, String> map, PaymentProcessorManager paymentProcessorManager, Screen.Form form, PaymentProvider paymentProvider, Continuation<? super C430701> continuation) {
            super(1, continuation);
            this.$inputsMap = map;
            this.this$0 = paymentProcessorManager;
            this.$screen = form;
            this.$selectedProvider = paymentProvider;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C430701(this.$inputsMap, this.this$0, this.$screen, this.$selectedProvider, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
            return ((C430701) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Outcome outcome;
            Outcome outcome2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Logger6.i$default(Logger6.INSTANCE, "API -> submitAdditionalInputs keys: " + this.$inputsMap.keySet(), PaymentProcessorManager.API_TAG, null, 4, null);
                this.this$0.data.setOverrideCurrentFormFields(null);
                Network network = this.this$0.api;
                com.truelayer.payments.core.domain.payments.PaymentContext paymentContextIntoDomain$payments_ui_release = this.this$0.paymentContext.intoDomain$payments_ui_release();
                Map<String, String> map = this.$inputsMap;
                this.label = 1;
                obj = network.submitForm(paymentContextIntoDomain$payments_ui_release, map, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                outcome2 = (Outcome) this.L$0;
                ResultKt.throwOnFailure(obj);
                outcome = outcome2;
                Screen.Form form = this.$screen;
                PaymentProcessorManager paymentProcessorManager = this.this$0;
                Map<String, String> map2 = this.$inputsMap;
                if (!(outcome instanceof Ok)) {
                    if (outcome instanceof Fail) {
                        CoreError coreError = (CoreError) ((Fail) outcome).getError();
                        if ((coreError instanceof CoreError.HttpError.InvalidParameters) && form != null) {
                            CoreError.HttpError.InvalidParameters invalidParameters = (CoreError.HttpError.InvalidParameters) coreError;
                            List<? extends FormInputWrapper> listProduceInputMapForScreenWithError = paymentProcessorManager.produceInputMapForScreenWithError(map2, form, invalidParameters);
                            Set<String> setKeySet = invalidParameters.getInvalidParameters().keySet();
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
                            Iterator<T> it = setKeySet.iterator();
                            while (it.hasNext()) {
                                arrayList.add(StringsKt.replace$default((String) it.next(), "inputs.", "", false, 4, (Object) null));
                            }
                            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.AdditionalInputsServerValidationError(arrayList, null, 2, null));
                            paymentProcessorManager.data.setOverrideCurrentFormFields(listProduceInputMapForScreenWithError);
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                Outcome<AuthorizationFlowResponse, CoreError> authorizationFlowResponseOutcome = this.this$0.data.getAuthorizationFlowResponseOutcome();
                return (this.this$0.data.getOverrideCurrentFormFields() != null || authorizationFlowResponseOutcome == null) ? outcome : authorizationFlowResponseOutcome;
            }
            ResultKt.throwOnFailure(obj);
            outcome = (Outcome) obj;
            Screen.Form form2 = this.$screen;
            PaymentProvider paymentProvider = this.$selectedProvider;
            PaymentProcessorManager paymentProcessorManager2 = this.this$0;
            Map<String, String> map3 = this.$inputsMap;
            if (outcome instanceof Ok) {
                if (form2 != null && paymentProvider != null) {
                    this.L$0 = outcome;
                    this.label = 2;
                    if (paymentProcessorManager2.storeAdditionalInputs(form2, map3, paymentProvider, this) != coroutine_suspended) {
                        outcome2 = outcome;
                        outcome = outcome2;
                    }
                    return coroutine_suspended;
                }
            } else if (!(outcome instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            Screen.Form form3 = this.$screen;
            PaymentProcessorManager paymentProcessorManager3 = this.this$0;
            Map<String, String> map22 = this.$inputsMap;
            if (!(outcome instanceof Ok)) {
            }
            Outcome<AuthorizationFlowResponse, CoreError> authorizationFlowResponseOutcome2 = this.this$0.data.getAuthorizationFlowResponseOutcome();
            if (this.this$0.data.getOverrideCurrentFormFields() != null) {
            }
        }
    }

    public final void submitAdditionalInputs(Map<String, String> inputsMap, Screen.Form screen) {
        Intrinsics.checkNotNullParameter(inputsMap, "inputsMap");
        Outcome<PaymentProvider, CoreError> preSelectedProviderOutcome = this.data.getPreSelectedProviderOutcome();
        executeAuthorizationFlowApiCall(new C430701(inputsMap, this, screen, preSelectedProviderOutcome != null ? (PaymentProvider) Outcome4.okOrNull(preSelectedProviderOutcome) : null, null));
    }
}
