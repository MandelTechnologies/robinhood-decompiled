package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.DisclosureLocation;
import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.banking.experiments.McwGbQueuedDepositRollout;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.p166fx.provider.FxRatesProvider;
import com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferCurrencyUtils;
import com.robinhood.android.transfers.p271ui.max.i18n.MoneyInputConsumer;
import com.robinhood.android.transfers.p271ui.max.i18n.TransferMode;
import com.robinhood.android.transfers.p271ui.max.i18n.creation.InternationalCreateTransferRequestFactory;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.TransferData;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.TransferRequestCreator;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.UkQueuedDepositEvent;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.UkQueuedDepositFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2Request;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentV2RequestDetails;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentsV22;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentProviderType;
import com.robinhood.models.api.bonfire.transfer.ApiDisclosureUIResponse;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.api.identi.ApiSortingHatUserState;
import com.robinhood.models.api.sortinghat.SortingHatApi;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.money.Currencies;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.models.ProcessorStatus;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;
import p479j$.time.Instant;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: UkQueuedDepositDuxo.kt */
@Metadata(m3635d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 O2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0003MNOBq\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0016J\u0006\u0010'\u001a\u00020%J\u000e\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020%J\u0006\u0010,\u001a\u00020%J\u0006\u0010-\u001a\u00020%J(\u0010.\u001a\u00020%2\f\b\u0002\u0010/\u001a\u000600j\u0002`12\n\u00102\u001a\u000603j\u0002`42\u0006\u00105\u001a\u000206J\u0015\u00107\u001a\u00020%2\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\b:J \u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0082@¢\u0006\u0002\u0010@J(\u0010A\u001a\u00020B2\u0006\u0010<\u001a\u00020=2\u0006\u0010C\u001a\u00020D2\b\u0010>\u001a\u0004\u0018\u00010?H\u0082@¢\u0006\u0002\u0010EJ8\u0010F\u001a\b\u0012\u0004\u0012\u00020H0G2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010C\u001a\u00020D2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0004\bI\u0010JJ\u001a\u0010K\u001a\u00020\u0004*\u00020\u00022\u0006\u00108\u001a\u000209H\u0082@¢\u0006\u0002\u0010LR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "stateProvider", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositStateProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "fxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "paymentInstrumentBonfireApi", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "ukCreateTransferRequestFactory", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory;", "mcwTransferRequestCreator", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferRequestCreator;", "sortingHatApi", "Lcom/robinhood/models/api/sortinghat/SortingHatApi;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositStateProvider;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory;Lcom/robinhood/android/transfers/ui/max/i18n/mcw/TransferRequestCreator;Lcom/robinhood/models/api/sortinghat/SortingHatApi;Lcom/robinhood/android/common/util/CardManager;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onResume", "toggleCurrency", "handleNumpadKeyPress", "keyEvent", "Landroid/view/KeyEvent;", "handleReviewClick", "handleEditClick", "handleSubmitClick", "logDialogEvent", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "eventType", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "Lcom/robinhood/rosetta/eventlogging/EventType;", "identifier", "", "setPendingPostTransferPage", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;", "setPendingPostTransferPage$feature_transfers_externalRelease", "linkInstrumentAndSubmitDeposit", "amount", "Lcom/robinhood/models/util/Money;", "fxQuote", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/fx/api/ApiFxQuote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitDepositForUserState", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo$SubmitDepositResult;", "instrumentId", "Ljava/util/UUID;", "(Lcom/robinhood/models/util/Money;Ljava/util/UUID;Lcom/robinhood/models/fx/api/ApiFxQuote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createStandardDeposit", "Lkotlin/Result;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "createStandardDeposit-yxL6bBk", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/fx/api/ApiFxQuote;Ljava/util/UUID;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMandateStatusAndCreateEvent", "(Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$UkQueuedDeposit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TrueLayerGetMandateStatusFailure", "SubmitDepositResult", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class UkQueuedDepositDuxo extends BaseDuxo3<UkQueuedDepositDataState, UkQueuedDepositViewState, UkQueuedDepositEvent> implements HasSavedState {
    private static final String SAVED_STATE_PENDING_POST_TRANSFER_PAGE = "pendingPostTransferPage";
    private final AccountProvider accountProvider;
    private final CardManager cardManager;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final FxRatesProvider fxRatesProvider;
    private final TransferRequestCreator mcwTransferRequestCreator;
    private final PaymentInstrumentBonfireApi paymentInstrumentBonfireApi;
    private final SavedStateHandle savedStateHandle;
    private final SortingHatApi sortingHatApi;
    private final TransfersBonfireApi transfersBonfireApi;
    private final InternationalCreateTransferRequestFactory ukCreateTransferRequestFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final MoneyInputConsumer inputKeyEventConsumer = new MoneyInputConsumer(new BigDecimal(InvestFlowConstants.MAX_ONE_TIME_AMOUNT), true);

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {351}, m3647m = "getMandateStatusAndCreateEvent")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$getMandateStatusAndCreateEvent$1 */
    static final class C308321 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C308321(Continuation<? super C308321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UkQueuedDepositDuxo.this.getMandateStatusAndCreateEvent(null, null, this);
        }
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE}, m3647m = "linkInstrumentAndSubmitDeposit")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$linkInstrumentAndSubmitDeposit$1 */
    static final class C308381 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C308381(Continuation<? super C308381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UkQueuedDepositDuxo.this.linkInstrumentAndSubmitDeposit(null, null, this);
        }
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE}, m3647m = "submitDepositForUserState")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$submitDepositForUserState$1 */
    static final class C308441 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C308441(Continuation<? super C308441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UkQueuedDepositDuxo.this.submitDepositForUserState(null, null, null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UkQueuedDepositDuxo(UkQueuedDepositStateProvider stateProvider, AccountProvider accountProvider, EventLogger eventLogger, ExperimentsStore experimentsStore, FxRatesProvider fxRatesProvider, TransfersBonfireApi transfersBonfireApi, PaymentInstrumentBonfireApi paymentInstrumentBonfireApi, InternationalCreateTransferRequestFactory ukCreateTransferRequestFactory, TransferRequestCreator mcwTransferRequestCreator, SortingHatApi sortingHatApi, CardManager cardManager, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(paymentInstrumentBonfireApi, "paymentInstrumentBonfireApi");
        Intrinsics.checkNotNullParameter(ukCreateTransferRequestFactory, "ukCreateTransferRequestFactory");
        Intrinsics.checkNotNullParameter(mcwTransferRequestCreator, "mcwTransferRequestCreator");
        Intrinsics.checkNotNullParameter(sortingHatApi, "sortingHatApi");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Currency currency = Currencies.GBP;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        super(new UkQueuedDepositDataState(new Money(currency, ZERO), "£0", null, false, null, null, null, false, false, (UiPostTransferPage.UkQueuedDeposit) savedStateHandle.get(SAVED_STATE_PENDING_POST_TRANSFER_PAGE), ((UkQueuedDepositFragment.Args) INSTANCE.getArgs(savedStateHandle)).getEntryPoint(), false, 2556, null), stateProvider, duxoBundle);
        this.accountProvider = accountProvider;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.fxRatesProvider = fxRatesProvider;
        this.transfersBonfireApi = transfersBonfireApi;
        this.paymentInstrumentBonfireApi = paymentInstrumentBonfireApi;
        this.ukCreateTransferRequestFactory = ukCreateTransferRequestFactory;
        this.mcwTransferRequestCreator = mcwTransferRequestCreator;
        this.sortingHatApi = sortingHatApi;
        this.cardManager = cardManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C308391(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C308402(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C308413(null));
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {93}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$1 */
    static final class C308391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C308391(Continuation<? super C308391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkQueuedDepositDuxo.this.new C308391(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C308391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FxRatesProvider fxRatesProvider = UkQueuedDepositDuxo.this.fxRatesProvider;
                Duration durationOfSeconds = Duration.ofSeconds(15L);
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                Flow<ApiFxQuote> flowStreamFxRate = fxRatesProvider.streamFxRate(durationOfSeconds);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(UkQueuedDepositDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamFxRate, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: UkQueuedDepositDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/fx/api/ApiFxQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$1$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ApiFxQuote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ UkQueuedDepositDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UkQueuedDepositDuxo ukQueuedDepositDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ukQueuedDepositDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiFxQuote apiFxQuote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(apiFxQuote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: UkQueuedDepositDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$1$1$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506191 extends ContinuationImpl7 implements Function2<UkQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState>, Object> {
                final /* synthetic */ ApiFxQuote $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506191(ApiFxQuote apiFxQuote, Continuation<? super C506191> continuation) {
                    super(2, continuation);
                    this.$it = apiFxQuote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506191 c506191 = new C506191(this.$it, continuation);
                    c506191.L$0 = obj;
                    return c506191;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UkQueuedDepositDataState ukQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState> continuation) {
                    return ((C506191) create(ukQueuedDepositDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return UkQueuedDepositDataState.copy$default((UkQueuedDepositDataState) this.L$0, null, null, null, false, this.$it, Instant.now(), null, false, false, null, null, false, 4047, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506191((ApiFxQuote) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$2", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {104}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$2 */
    static final class C308402 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C308402(Continuation<? super C308402> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkQueuedDepositDuxo.this.new C308402(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C308402) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C308402 c308402;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TransfersBonfireApi transfersBonfireApi = UkQueuedDepositDuxo.this.transfersBonfireApi;
                DisclosureLocation disclosureLocation = DisclosureLocation.UK_QUEUED_DEPOSIT;
                this.label = 1;
                c308402 = this;
                obj = TransfersBonfireApi.DefaultImpls.getDisclosure$default(transfersBonfireApi, disclosureLocation, null, null, null, null, null, c308402, 62, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c308402 = this;
            }
            UkQueuedDepositDuxo.this.applyMutation(new AnonymousClass1((ApiDisclosureUIResponse) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: UkQueuedDepositDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$2$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UkQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState>, Object> {
            final /* synthetic */ ApiDisclosureUIResponse $disclosureResponse;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiDisclosureUIResponse apiDisclosureUIResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$disclosureResponse = apiDisclosureUIResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$disclosureResponse, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UkQueuedDepositDataState ukQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState> continuation) {
                return ((AnonymousClass1) create(ukQueuedDepositDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return UkQueuedDepositDataState.copy$default((UkQueuedDepositDataState) this.L$0, null, null, null, false, null, null, this.$disclosureResponse, false, false, null, null, false, 4031, null);
            }
        }
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$3", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {115}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$3 */
    static final class C308413 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C308413(Continuation<? super C308413> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkQueuedDepositDuxo.this.new C308413(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C308413) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(UkQueuedDepositDuxo.this.experimentsStore, new Experiment[]{McwGbQueuedDepositRollout.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(UkQueuedDepositDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: UkQueuedDepositDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$3$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ UkQueuedDepositDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UkQueuedDepositDuxo ukQueuedDepositDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ukQueuedDepositDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: UkQueuedDepositDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$3$1$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506201 extends ContinuationImpl7 implements Function2<UkQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506201(boolean z, Continuation<? super C506201> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506201 c506201 = new C506201(this.$it, continuation);
                    c506201.L$0 = obj;
                    return c506201;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UkQueuedDepositDataState ukQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState> continuation) {
                    return ((C506201) create(ukQueuedDepositDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return UkQueuedDepositDataState.copy$default((UkQueuedDepositDataState) this.L$0, null, null, null, false, null, null, null, false, false, null, null, this.$it, 2047, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506201(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UkQueuedDepositDuxo.onResume$lambda$0(this.f$0, (UkQueuedDepositDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(UkQueuedDepositDuxo ukQueuedDepositDuxo, UkQueuedDepositDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        UiPostTransferPage.UkQueuedDeposit pendingPostTransferPage = it.getPendingPostTransferPage();
        if (pendingPostTransferPage != null) {
            BuildersKt__Builders_commonKt.launch$default(ukQueuedDepositDuxo.getLifecycleScope(), null, null, new UkQueuedDepositDuxo4(ukQueuedDepositDuxo, it, pendingPostTransferPage, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$toggleCurrency$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$toggleCurrency$1 */
    static final class C308451 extends ContinuationImpl7 implements Function2<UkQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C308451(Continuation<? super C308451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308451 c308451 = new C308451(continuation);
            c308451.L$0 = obj;
            return c308451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UkQueuedDepositDataState ukQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState> continuation) {
            return ((C308451) create(ukQueuedDepositDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UkQueuedDepositDataState ukQueuedDepositDataState = (UkQueuedDepositDataState) this.L$0;
            Tuples2<Money, String> toggledCurrencyAmountAndString = InternationalTransferCurrencyUtils.getToggledCurrencyAmountAndString(ukQueuedDepositDataState.getAmount(), Currencies.GBP, TransferDirection.DEPOSIT, ukQueuedDepositDataState.getFxQuote());
            return UkQueuedDepositDataState.copy$default(ukQueuedDepositDataState, toggledCurrencyAmountAndString.component1(), toggledCurrencyAmountAndString.component2(), null, false, null, null, null, false, false, null, null, false, 4084, null);
        }
    }

    public final void toggleCurrency() {
        applyMutation(new C308451(null));
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$handleNumpadKeyPress$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$handleNumpadKeyPress$1 */
    static final class C308341 extends ContinuationImpl7 implements Function2<UkQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C308341(KeyEvent keyEvent, Continuation<? super C308341> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308341 c308341 = new C308341(this.$keyEvent, continuation);
            c308341.L$0 = obj;
            return c308341;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UkQueuedDepositDataState ukQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState> continuation) {
            return ((C308341) create(ukQueuedDepositDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                UkQueuedDepositDataState ukQueuedDepositDataState = (UkQueuedDepositDataState) this.L$0;
                MoneyInputConsumer moneyInputConsumer = UkQueuedDepositDuxo.inputKeyEventConsumer;
                BigDecimal decimalValue = ukQueuedDepositDataState.getAmount().getDecimalValue();
                char[] charArray = ukQueuedDepositDataState.getInputChars().toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                InputKeyEventConsumer.InputState<BigDecimal> inputStateConsume = moneyInputConsumer.consume(new InputKeyEventConsumer.InputState(decimalValue, charArray), this.$keyEvent);
                return UkQueuedDepositDataState.copy$default(ukQueuedDepositDataState, Money.copy$default(ukQueuedDepositDataState.getAmount(), null, inputStateConsume.component1(), 1, null), new String(inputStateConsume.getInput()), null, true, null, null, null, false, false, null, null, false, 4084, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void handleNumpadKeyPress(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C308341(keyEvent, null));
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$handleReviewClick$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$handleReviewClick$1 */
    static final class C308351 extends ContinuationImpl7 implements Function2<UkQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C308351(Continuation<? super C308351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308351 c308351 = UkQueuedDepositDuxo.this.new C308351(continuation);
            c308351.L$0 = obj;
            return c308351;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UkQueuedDepositDataState ukQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState> continuation) {
            return ((C308351) create(ukQueuedDepositDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UkQueuedDepositDataState ukQueuedDepositDataState = (UkQueuedDepositDataState) this.L$0;
            if (Intrinsics.areEqual(ukQueuedDepositDataState.getAmount().getCurrency(), Currencies.USD)) {
                UkQueuedDepositDuxo.this.toggleCurrency();
            }
            return UkQueuedDepositDataState.copy$default(ukQueuedDepositDataState, null, null, TransferMode.REVIEW, false, null, null, null, false, false, null, null, false, 4091, null);
        }
    }

    public final void handleReviewClick() {
        applyMutation(new C308351(null));
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$handleEditClick$1", m3645f = "UkQueuedDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$handleEditClick$1 */
    static final class C308331 extends ContinuationImpl7 implements Function2<UkQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C308331(Continuation<? super C308331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C308331 c308331 = new C308331(continuation);
            c308331.L$0 = obj;
            return c308331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UkQueuedDepositDataState ukQueuedDepositDataState, Continuation<? super UkQueuedDepositDataState> continuation) {
            return ((C308331) create(ukQueuedDepositDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UkQueuedDepositDataState.copy$default((UkQueuedDepositDataState) this.L$0, null, null, TransferMode.EDIT, false, null, null, null, false, false, null, null, false, 4091, null);
        }
    }

    public final void handleEditClick() {
        applyMutation(new C308331(null));
    }

    public final void handleSubmitClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UkQueuedDepositDuxo.handleSubmitClick$lambda$1(this.f$0, (UkQueuedDepositDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleSubmitClick$lambda$1(UkQueuedDepositDuxo ukQueuedDepositDuxo, UkQueuedDepositDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        UiPostTransferPage.UkQueuedDeposit pendingPostTransferPage = state.getPendingPostTransferPage();
        if (pendingPostTransferPage == null) {
            BuildersKt__Builders_commonKt.launch$default(ukQueuedDepositDuxo.getLifecycleScope(), null, null, new UkQueuedDepositDuxo3(ukQueuedDepositDuxo, state, null), 3, null);
            return Unit.INSTANCE;
        }
        ukQueuedDepositDuxo.submit(new UkQueuedDepositEvent.ProcessTrueLayerMandate(pendingPostTransferPage.getMandateId(), pendingPostTransferPage.getResourceToken()));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void logDialogEvent$default(UkQueuedDepositDuxo ukQueuedDepositDuxo, UserInteractionEventData.Action action, UserInteractionEventData.EventType eventType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        ukQueuedDepositDuxo.logDialogEvent(action, eventType, str);
    }

    public final void logDialogEvent(final UserInteractionEventData.Action action, final UserInteractionEventData.EventType eventType, final String identifier) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UkQueuedDepositDuxo.logDialogEvent$lambda$2(this.f$0, action, identifier, eventType, (UkQueuedDepositDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logDialogEvent$lambda$2(UkQueuedDepositDuxo ukQueuedDepositDuxo, UserInteractionEventData.Action action, String str, UserInteractionEventData.EventType eventType, UkQueuedDepositDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(ukQueuedDepositDuxo.eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(dataState.getUserInteractionEventDescriptor(), null, null, action, null, new Component(Component.ComponentType.ALERT, str, null, 4, null), null, 43, null), eventType), false, false, 6, null);
        return Unit.INSTANCE;
    }

    public final void setPendingPostTransferPage$feature_transfers_externalRelease(UiPostTransferPage.UkQueuedDeposit data) {
        Intrinsics.checkNotNullParameter(data, "data");
        applyMutation(new UkQueuedDepositDuxo5(data, null));
        getSavedStateHandle().set(SAVED_STATE_PENDING_POST_TRANSFER_PAGE, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r15 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object linkInstrumentAndSubmitDeposit(Money money, ApiFxQuote apiFxQuote, Continuation<? super UkQueuedDepositEvent> continuation) {
        C308381 c308381;
        if (continuation instanceof C308381) {
            c308381 = (C308381) continuation;
            int i = c308381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c308381.label = i - Integer.MIN_VALUE;
            } else {
                c308381 = new C308381(continuation);
            }
        }
        Object objLinkPaymentInstrument = c308381.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c308381.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objLinkPaymentInstrument);
                PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.paymentInstrumentBonfireApi;
                ApiPaymentInstrumentV2Request apiPaymentInstrumentV2Request = new ApiPaymentInstrumentV2Request(PaymentInstrumentType.UK_BANK_ACCOUNT, PaymentProviderType.TRUELAYER, new ApiPaymentInstrumentV2RequestDetails.UkBankAccount(), null, 8, null);
                c308381.L$0 = money;
                c308381.L$1 = apiFxQuote;
                c308381.label = 1;
                objLinkPaymentInstrument = paymentInstrumentBonfireApi.linkPaymentInstrument(apiPaymentInstrumentV2Request, c308381);
                if (objLinkPaymentInstrument == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objLinkPaymentInstrument);
                return UkQueuedDepositDuxo6.toDuxoEvent((SubmitDepositResult) objLinkPaymentInstrument, this);
            }
            apiFxQuote = (ApiFxQuote) c308381.L$1;
            money = (Money) c308381.L$0;
            ResultKt.throwOnFailure(objLinkPaymentInstrument);
            UUID instrumentId = ((ApiPaymentInstrumentsV22) objLinkPaymentInstrument).getPaymentInstrument().getInstrumentId();
            c308381.L$0 = null;
            c308381.L$1 = null;
            c308381.label = 2;
            objLinkPaymentInstrument = submitDepositForUserState(money, instrumentId, apiFxQuote, c308381);
        } catch (Exception e) {
            return new UkQueuedDepositEvent.Error(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        if (r8 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        if (r8 == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitDepositForUserState(Money money, UUID uuid, ApiFxQuote apiFxQuote, Continuation<? super SubmitDepositResult> continuation) {
        C308441 c308441;
        Exception exc;
        Object objCreateQueuedDeposit;
        Object objM19880createStandardDeposityxL6bBk;
        if (continuation instanceof C308441) {
            c308441 = (C308441) continuation;
            int i = c308441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c308441.label = i - Integer.MIN_VALUE;
            } else {
                c308441 = new C308441(continuation);
            }
        }
        C308441 c3084412 = c308441;
        Object sortingHatUserState = c3084412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3084412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(sortingHatUserState);
            try {
                SortingHatApi sortingHatApi = this.sortingHatApi;
                c3084412.L$0 = money;
                c3084412.L$1 = uuid;
                c3084412.L$2 = apiFxQuote;
                c3084412.label = 1;
                sortingHatUserState = sortingHatApi.getSortingHatUserState(null, c3084412);
                if (sortingHatUserState == coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (Exception e) {
                exc = e;
                return new SubmitDepositResult.Error(exc);
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(sortingHatUserState);
                objM19880createStandardDeposityxL6bBk = ((Result) sortingHatUserState).getValue();
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM19880createStandardDeposityxL6bBk);
                if (thM28553exceptionOrNullimpl == null) {
                    return new SubmitDepositResult.StandardDepositCreated((ApiCreateTransferResponse) objM19880createStandardDeposityxL6bBk);
                }
                return new SubmitDepositResult.Error(thM28553exceptionOrNullimpl);
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(sortingHatUserState);
            objCreateQueuedDeposit = ((Result) sortingHatUserState).getValue();
            Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(objCreateQueuedDeposit);
            if (thM28553exceptionOrNullimpl2 == null) {
                return new SubmitDepositResult.QueuedDepositCreated((ApiPostTransferPage.UkQueuedDeposit) objCreateQueuedDeposit);
            }
            return new SubmitDepositResult.Error(thM28553exceptionOrNullimpl2);
        }
        apiFxQuote = (ApiFxQuote) c3084412.L$2;
        uuid = (UUID) c3084412.L$1;
        money = (Money) c3084412.L$0;
        try {
            ResultKt.throwOnFailure(sortingHatUserState);
        } catch (Exception e2) {
            exc = e2;
            return new SubmitDepositResult.Error(exc);
        }
        UUID uuid2 = uuid;
        if (((ApiSortingHatUserState) sortingHatUserState).getBrokerage().is_approved()) {
            TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
            c3084412.L$0 = null;
            c3084412.L$1 = null;
            c3084412.L$2 = null;
            c3084412.label = 2;
            objM19880createStandardDeposityxL6bBk = m19880createStandardDeposityxL6bBk(money, apiFxQuote, uuid2, transfersBonfireApi, c3084412);
        } else {
            ApiFxQuote apiFxQuote2 = apiFxQuote;
            TransfersBonfireApi transfersBonfireApi2 = this.transfersBonfireApi;
            c3084412.L$0 = null;
            c3084412.L$1 = null;
            c3084412.L$2 = null;
            c3084412.label = 3;
            objCreateQueuedDeposit = UkQueuedDepositCreateUtils.createQueuedDeposit(money, apiFxQuote2, uuid2, transfersBonfireApi2, c3084412);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ed, code lost:
    
        if (r3 != r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: createStandardDeposit-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m19880createStandardDeposityxL6bBk(Money money, ApiFxQuote apiFxQuote, UUID uuid, TransfersBonfireApi transfersBonfireApi, Continuation<? super Result<ApiCreateTransferResponse>> continuation) {
        UkQueuedDepositDuxo2 ukQueuedDepositDuxo2;
        TransfersBonfireApi transfersBonfireApi2;
        TransferRequestCreator transferRequestCreator;
        TransferDirectionV2 transferDirectionV2;
        ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount;
        Money money2 = money;
        if (continuation instanceof UkQueuedDepositDuxo2) {
            ukQueuedDepositDuxo2 = (UkQueuedDepositDuxo2) continuation;
            int i = ukQueuedDepositDuxo2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ukQueuedDepositDuxo2.label = i - Integer.MIN_VALUE;
            } else {
                ukQueuedDepositDuxo2 = new UkQueuedDepositDuxo2(this, continuation);
            }
        }
        Object objCreateTransferRequest = ukQueuedDepositDuxo2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ukQueuedDepositDuxo2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateTransferRequest);
            if (apiFxQuote == null) {
                transferRequestCreator = this.mcwTransferRequestCreator;
                transferDirectionV2 = TransferDirectionV2.DEPOSIT;
                String string2 = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                apiTransferAccount = new ApiCreateTransferRequest.ApiTransferAccount(string2, ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT, null, null, 12, null);
                AccountProvider accountProvider = this.accountProvider;
                ukQueuedDepositDuxo2.L$0 = transferRequestCreator;
                ukQueuedDepositDuxo2.L$1 = money2;
                ukQueuedDepositDuxo2.L$2 = transferDirectionV2;
                ukQueuedDepositDuxo2.L$3 = apiTransferAccount;
                ukQueuedDepositDuxo2.label = 1;
                objCreateTransferRequest = accountProvider.getIndividualAccountNumberForced(ukQueuedDepositDuxo2);
                if (objCreateTransferRequest != coroutine_suspended) {
                    TransferData transferData = new TransferData(money2, transferDirectionV2, apiTransferAccount, new ApiCreateTransferRequest.ApiTransferAccount((String) objCreateTransferRequest, ApiTransferAccount.TransferAccountType.RHS, null, null, 12, null));
                    ukQueuedDepositDuxo2.L$0 = null;
                    ukQueuedDepositDuxo2.L$1 = null;
                    ukQueuedDepositDuxo2.L$2 = null;
                    ukQueuedDepositDuxo2.L$3 = null;
                    ukQueuedDepositDuxo2.label = 2;
                    Object objM19870createTransfergIAlus$feature_transfers_externalRelease = transferRequestCreator.m19870createTransfergIAlus$feature_transfers_externalRelease(transferData, ukQueuedDepositDuxo2);
                    if (objM19870createTransfergIAlus$feature_transfers_externalRelease != coroutine_suspended) {
                    }
                }
            } else {
                InternationalCreateTransferRequestFactory internationalCreateTransferRequestFactory = this.ukCreateTransferRequestFactory;
                InternationalCreateTransferRequestFactory.TransferData transferData2 = new InternationalCreateTransferRequestFactory.TransferData(money2, uuid.toString(), apiFxQuote, TransferDirection.DEPOSIT);
                transfersBonfireApi2 = transfersBonfireApi;
                ukQueuedDepositDuxo2.L$0 = transfersBonfireApi2;
                ukQueuedDepositDuxo2.label = 3;
                objCreateTransferRequest = internationalCreateTransferRequestFactory.createTransferRequest(transferData2, ukQueuedDepositDuxo2);
                if (objCreateTransferRequest != coroutine_suspended) {
                    ukQueuedDepositDuxo2.L$0 = null;
                    ukQueuedDepositDuxo2.label = 4;
                    objCreateTransferRequest = transfersBonfireApi2.createTransfer((ApiCreateTransferRequest) objCreateTransferRequest, ukQueuedDepositDuxo2);
                }
            }
        }
        if (i2 == 1) {
            ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount2 = (ApiCreateTransferRequest.ApiTransferAccount) ukQueuedDepositDuxo2.L$3;
            transferDirectionV2 = (TransferDirectionV2) ukQueuedDepositDuxo2.L$2;
            Money money3 = (Money) ukQueuedDepositDuxo2.L$1;
            transferRequestCreator = (TransferRequestCreator) ukQueuedDepositDuxo2.L$0;
            ResultKt.throwOnFailure(objCreateTransferRequest);
            apiTransferAccount = apiTransferAccount2;
            money2 = money3;
            TransferData transferData3 = new TransferData(money2, transferDirectionV2, apiTransferAccount, new ApiCreateTransferRequest.ApiTransferAccount((String) objCreateTransferRequest, ApiTransferAccount.TransferAccountType.RHS, null, null, 12, null));
            ukQueuedDepositDuxo2.L$0 = null;
            ukQueuedDepositDuxo2.L$1 = null;
            ukQueuedDepositDuxo2.L$2 = null;
            ukQueuedDepositDuxo2.L$3 = null;
            ukQueuedDepositDuxo2.label = 2;
            Object objM19870createTransfergIAlus$feature_transfers_externalRelease2 = transferRequestCreator.m19870createTransfergIAlus$feature_transfers_externalRelease(transferData3, ukQueuedDepositDuxo2);
            return objM19870createTransfergIAlus$feature_transfers_externalRelease2 != coroutine_suspended ? coroutine_suspended : objM19870createTransfergIAlus$feature_transfers_externalRelease2;
        }
        if (i2 == 2) {
            ResultKt.throwOnFailure(objCreateTransferRequest);
            return ((Result) objCreateTransferRequest).getValue();
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateTransferRequest);
            Response response = (Response) objCreateTransferRequest;
            ApiCreateTransferResponse apiCreateTransferResponse = (ApiCreateTransferResponse) response.body();
            if (response.isSuccessful() && apiCreateTransferResponse != null) {
                return Result.m28550constructorimpl(apiCreateTransferResponse);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new HttpException(response)));
        }
        transfersBonfireApi2 = (TransfersBonfireApi) ukQueuedDepositDuxo2.L$0;
        ResultKt.throwOnFailure(objCreateTransferRequest);
        ukQueuedDepositDuxo2.L$0 = null;
        ukQueuedDepositDuxo2.label = 4;
        objCreateTransferRequest = transfersBonfireApi2.createTransfer((ApiCreateTransferRequest) objCreateTransferRequest, ukQueuedDepositDuxo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getMandateStatusAndCreateEvent(UkQueuedDepositDataState ukQueuedDepositDataState, UiPostTransferPage.UkQueuedDeposit ukQueuedDeposit, Continuation<? super UkQueuedDepositEvent> continuation) {
        C308321 c308321;
        if (continuation instanceof C308321) {
            c308321 = (C308321) continuation;
            int i = c308321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c308321.label = i - Integer.MIN_VALUE;
            } else {
                c308321 = new C308321(continuation);
            }
        }
        C308321 c3083212 = c308321;
        Object mandateStatus$default = c3083212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3083212.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(mandateStatus$default);
            TrueLayerUI.Companion companion = TrueLayerUI.INSTANCE;
            String mandateId = ukQueuedDeposit.getMandateId();
            String resourceToken = ukQueuedDeposit.getResourceToken();
            c3083212.L$0 = ukQueuedDepositDataState;
            c3083212.L$1 = ukQueuedDeposit;
            c3083212.label = 1;
            mandateStatus$default = TrueLayerUI.Companion.getMandateStatus$default(companion, mandateId, resourceToken, null, c3083212, 4, null);
            if (mandateStatus$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ukQueuedDeposit = (UiPostTransferPage.UkQueuedDeposit) c3083212.L$1;
            ukQueuedDepositDataState = (UkQueuedDepositDataState) c3083212.L$0;
            ResultKt.throwOnFailure(mandateStatus$default);
        }
        Outcome outcome = (Outcome) mandateStatus$default;
        if (outcome instanceof Ok) {
            return UkQueuedDepositDuxo6.toDuxoEvent((ProcessorStatus) ((Ok) outcome).getValue(), ukQueuedDeposit, ukQueuedDepositDataState);
        }
        if (!(outcome instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        CoreError coreError = (CoreError) ((Fail) outcome).getError();
        CrashReporter.Companion companion2 = CrashReporter.INSTANCE;
        Throwable cause = coreError.getCause();
        if (cause == null) {
            cause = new TrueLayerGetMandateStatusFailure(coreError.getMessage());
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(companion2, cause, false, null, 6, null);
        return UkQueuedDepositEvent.TrueLayerMandateNotAuthorized.INSTANCE;
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo$TrueLayerGetMandateStatusFailure;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "<init>", "(Ljava/lang/String;)V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class TrueLayerGetMandateStatusFailure extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrueLayerGetMandateStatusFailure(String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo$SubmitDepositResult;", "", "QueuedDepositCreated", "StandardDepositCreated", "Error", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo$SubmitDepositResult$Error;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo$SubmitDepositResult$QueuedDepositCreated;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo$SubmitDepositResult$StandardDepositCreated;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface SubmitDepositResult {

        /* compiled from: UkQueuedDepositDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo$SubmitDepositResult$QueuedDepositCreated;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo$SubmitDepositResult;", "response", "Lcom/robinhood/models/api/bonfire/ApiPostTransferPage$UkQueuedDeposit;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiPostTransferPage$UkQueuedDeposit;)V", "getResponse", "()Lcom/robinhood/models/api/bonfire/ApiPostTransferPage$UkQueuedDeposit;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QueuedDepositCreated implements SubmitDepositResult {
            public static final int $stable = 8;
            private final ApiPostTransferPage.UkQueuedDeposit response;

            public static /* synthetic */ QueuedDepositCreated copy$default(QueuedDepositCreated queuedDepositCreated, ApiPostTransferPage.UkQueuedDeposit ukQueuedDeposit, int i, Object obj) {
                if ((i & 1) != 0) {
                    ukQueuedDeposit = queuedDepositCreated.response;
                }
                return queuedDepositCreated.copy(ukQueuedDeposit);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiPostTransferPage.UkQueuedDeposit getResponse() {
                return this.response;
            }

            public final QueuedDepositCreated copy(ApiPostTransferPage.UkQueuedDeposit response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return new QueuedDepositCreated(response);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof QueuedDepositCreated) && Intrinsics.areEqual(this.response, ((QueuedDepositCreated) other).response);
            }

            public int hashCode() {
                return this.response.hashCode();
            }

            public String toString() {
                return "QueuedDepositCreated(response=" + this.response + ")";
            }

            public QueuedDepositCreated(ApiPostTransferPage.UkQueuedDeposit response) {
                Intrinsics.checkNotNullParameter(response, "response");
                this.response = response;
            }

            public final ApiPostTransferPage.UkQueuedDeposit getResponse() {
                return this.response;
            }
        }

        /* compiled from: UkQueuedDepositDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo$SubmitDepositResult$StandardDepositCreated;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo$SubmitDepositResult;", "response", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;)V", "getResponse", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StandardDepositCreated implements SubmitDepositResult {
            public static final int $stable = 8;
            private final ApiCreateTransferResponse response;

            public static /* synthetic */ StandardDepositCreated copy$default(StandardDepositCreated standardDepositCreated, ApiCreateTransferResponse apiCreateTransferResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiCreateTransferResponse = standardDepositCreated.response;
                }
                return standardDepositCreated.copy(apiCreateTransferResponse);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiCreateTransferResponse getResponse() {
                return this.response;
            }

            public final StandardDepositCreated copy(ApiCreateTransferResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return new StandardDepositCreated(response);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StandardDepositCreated) && Intrinsics.areEqual(this.response, ((StandardDepositCreated) other).response);
            }

            public int hashCode() {
                return this.response.hashCode();
            }

            public String toString() {
                return "StandardDepositCreated(response=" + this.response + ")";
            }

            public StandardDepositCreated(ApiCreateTransferResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                this.response = response;
            }

            public final ApiCreateTransferResponse getResponse() {
                return this.response;
            }
        }

        /* compiled from: UkQueuedDepositDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo$SubmitDepositResult$Error;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo$SubmitDepositResult;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements SubmitDepositResult {
            public static final int $stable = 8;
            private final Throwable throwable;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.throwable;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Error copy(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new Error(throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "Error(throwable=" + this.throwable + ")";
            }

            public Error(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }
    }

    /* compiled from: UkQueuedDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositDuxo;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositFragment$Args;", "<init>", "()V", "SAVED_STATE_PENDING_POST_TRANSFER_PAGE", "", "inputKeyEventConsumer", "Lcom/robinhood/android/transfers/ui/max/i18n/MoneyInputConsumer;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<UkQueuedDepositDuxo, UkQueuedDepositFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UkQueuedDepositFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (UkQueuedDepositFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UkQueuedDepositFragment.Args getArgs(UkQueuedDepositDuxo ukQueuedDepositDuxo) {
            return (UkQueuedDepositFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, ukQueuedDepositDuxo);
        }
    }
}
