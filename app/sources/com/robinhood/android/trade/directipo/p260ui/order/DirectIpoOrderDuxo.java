package com.robinhood.android.trade.directipo.p260ui.order;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.lib.trade.validation.ValidationDuxo;
import com.robinhood.android.trade.directipo.p260ui.order.DirectIpoOrderDuxo;
import com.robinhood.android.trade.directipo.p260ui.order.DirectIpoOrderFragment;
import com.robinhood.android.trade.directipo.p260ui.order.DirectIpoOrderViewState;
import com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager;
import com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager2;
import com.robinhood.android.trade.directipo.validation.DirectIpoOrderContext;
import com.robinhood.android.trade.directipo.validation.DirectIpoOrderFailureResolver;
import com.robinhood.android.trade.directipo.validation.DirectIpoOrderValidator;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.directipo.models.DirectIpoOrderSource;
import com.robinhood.directipo.models.api.ApiDirectIpoOrderConfiguration;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.IpoAccessStatus;
import com.robinhood.models.serverdriven.api.ApiGenericAlert;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.EquityOrderMeta;
import com.robinhood.rosetta.eventlogging.OrderFormStep;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p408rx.Poll;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.math.BigDecimal;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DirectIpoOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 >2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002=>B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0002H\u0016J\u0006\u0010#\u001a\u00020\u001fJ\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010,J\u000e\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u001604H\u0002J\u0018\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020<H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R)\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo;", "Lcom/robinhood/android/lib/trade/validation/ValidationDuxo;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderFailureResolver;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "api", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "orderSubmissionManager", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "validator", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderValidator;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager;Lcom/robinhood/analytics/TraderEventLogger;Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderValidator;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "initialOrderRequest", "Lio/reactivex/Observable;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo$Result;", "kotlin.jvm.PlatformType", "getInitialOrderRequest", "()Lio/reactivex/Observable;", "initialOrderRequest$delegate", "Lkotlin/Lazy;", RecurringOrderBackupPaymentMethodFragment.ARG_LOGGING_SOURCE, "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "onCreate", "", "onResume", "onPreValidate", "input", "submitOrder", "setShareQuantity", "shareQuantity", "Ljava/math/BigDecimal;", "setFormState", "formState", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "setCustomPrice", "customPrice", "Lcom/robinhood/models/util/Money;", "setPriceType", "priceType", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration$IpoAccessPriceType;", "logInitialLoad", "initialLoad", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderViewState$InitialLoad;", "getOrderConfigurationRequest", "Lio/reactivex/Single;", "logOrderRequest", "step", "Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "orderRequest", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderRequest;", "mapOrderConfigurationToResult", "orderConfiguration", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration;", "Result", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DirectIpoOrderDuxo extends ValidationDuxo<DirectIpoOrderContext, DirectIpoOrderFailureResolver, DirectIpoOrderViewState> implements HasSavedState {
    private final DirectIpoApi api;
    private final TraderEventLogger eventLogger;

    /* renamed from: initialOrderRequest$delegate, reason: from kotlin metadata */
    private final Lazy initialOrderRequest;
    private final EquityOrderMeta.Source loggingSource;
    private final DirectIpoOrderSubmissionManager orderSubmissionManager;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectIpoOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DirectIpoOrderSource.values().length];
            try {
                iArr[DirectIpoOrderSource.STOCK_DETAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DirectIpoOrderSource.ORDER_DETAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DirectIpoOrderSource.INBOX_DEEPLINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DirectIpoOrderSource.PUSH_NOTIFICATION_DEEPLINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DirectIpoOrderSource.EMAIL_DEEPLINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DirectIpoOrderSource.UNSPECIFIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.values().length];
            try {
                iArr2[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.LISTED_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.NAMED_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ApiDirectIpoOrderConfiguration.IpoAccessPriceType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[IpoAccessStatus.values().length];
            try {
                iArr3[IpoAccessStatus.PRICE_FINALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[IpoAccessStatus.PRICE_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[IpoAccessStatus.S1_FILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[IpoAccessStatus.PUBLIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[IpoAccessStatus.CANCELED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[IpoAccessStatus.DELAYED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[IpoAccessStatus.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectIpoOrderDuxo(DirectIpoApi api, DirectIpoOrderSubmissionManager orderSubmissionManager, TraderEventLogger eventLogger, DirectIpoOrderValidator validator, SavedStateHandle savedStateHandle) {
        EquityOrderMeta.Source source;
        super(validator, new DirectIpoOrderViewState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null));
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(orderSubmissionManager, "orderSubmissionManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.api = api;
        this.orderSubmissionManager = orderSubmissionManager;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
        this.initialOrderRequest = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoOrderDuxo.initialOrderRequest_delegate$lambda$0(this.f$0);
            }
        });
        DirectIpoOrderSource source2 = ((DirectIpoOrderFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getSource();
        switch (source2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[source2.ordinal()]) {
            case -1:
            case 6:
                source = EquityOrderMeta.Source.SOURCE_UNSPECIFIED;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                source = EquityOrderMeta.Source.SOURCE_STOCK_DETAIL;
                break;
            case 2:
                source = EquityOrderMeta.Source.SOURCE_ORDER_DETAIL;
                break;
            case 3:
                source = EquityOrderMeta.Source.SOURCE_INBOX_DEEPLINK;
                break;
            case 4:
                source = EquityOrderMeta.Source.SOURCE_PUSH_NOTIFICATION_DEEPLINK;
                break;
            case 5:
                source = EquityOrderMeta.Source.SOURCE_EMAIL_DEEPLINK;
                break;
        }
        this.loggingSource = source;
    }

    private final Observable<Result> getInitialOrderRequest() {
        return (Observable) this.initialOrderRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable initialOrderRequest_delegate$lambda$0(DirectIpoOrderDuxo directIpoOrderDuxo) {
        return directIpoOrderDuxo.getOrderConfigurationRequest().onErrorReturn(new Function() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$initialOrderRequest$2$1
            @Override // io.reactivex.functions.Function
            public final DirectIpoOrderDuxo.Result.Failure apply(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new DirectIpoOrderDuxo.Result.Failure(p0);
            }
        }).toObservable().replay(1).refCount();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Companion companion = INSTANCE;
        final DirectIpoOrderContext.StaticInputs staticInputs = new DirectIpoOrderContext.StaticInputs(((DirectIpoOrderFragment.Args) companion.getArgs((HasSavedState) this)).getRefId(), ((DirectIpoOrderFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber());
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderDuxo.onCreate$lambda$1(staticInputs, (DirectIpoOrderViewState) obj);
            }
        });
        Observable map = getStates().map(new Function() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$onCreate$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((DirectIpoOrderViewState) it).getValidationInput());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((DirectIpoOrderDuxo$onCreate$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(map);
        final DirectIpoOrderContext.Companion companion2 = DirectIpoOrderContext.INSTANCE;
        Observable observableDebounce = observableFilterIsPresent.distinctUntilChanged(new BiPredicate() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo.onCreate.3
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(DirectIpoOrderContext p0, DirectIpoOrderContext p1) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p1, "p1");
                return companion2.isInputIdentical(p0, p1);
            }
        }).skip(1L).debounce(1L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(observableDebounce, "debounce(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDebounce, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderDuxo.onCreate$lambda$2(this.f$0, (DirectIpoOrderContext) obj);
            }
        });
        Observable<U> observableCast = getInitialOrderRequest().filter(new Predicate() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$onCreate$$inlined$filterSubtype$1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(DirectIpoOrderDuxo.Result it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it instanceof DirectIpoOrderDuxo.Result.Success;
            }
        }).cast(Result.Success.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableCast, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderDuxo.onCreate$lambda$6(this.f$0, staticInputs, (DirectIpoOrderDuxo.Result.Success) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoOrderViewState onCreate$lambda$1(DirectIpoOrderContext.StaticInputs staticInputs, DirectIpoOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoOrderViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, null, staticInputs, null, 12287, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(DirectIpoOrderDuxo directIpoOrderDuxo, DirectIpoOrderContext directIpoOrderContext) {
        directIpoOrderDuxo.logOrderRequest(OrderFormStep.EDIT_VALUES, directIpoOrderContext.getRequest());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(DirectIpoOrderDuxo directIpoOrderDuxo, final DirectIpoOrderContext.StaticInputs staticInputs, Result.Success result) {
        final Money money;
        Intrinsics.checkNotNullParameter(result, "result");
        final ApiDirectIpoOrderConfiguration orderConfiguration = result.getOrderConfiguration();
        final BigDecimal startingQuantity = orderConfiguration.getStartingQuantity();
        final Money startingCustomPrice = orderConfiguration.getStartingCustomPrice();
        final BigDecimal bigDecimalOrZero = BigDecimals7.orZero(startingQuantity);
        if (startingCustomPrice == null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            money = Money3.toMoney(ZERO, Currencies.USD);
        } else {
            money = startingCustomPrice;
        }
        directIpoOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderDuxo.onCreate$lambda$6$lambda$5(orderConfiguration, money, bigDecimalOrZero, staticInputs, startingQuantity, startingCustomPrice, (DirectIpoOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoOrderViewState onCreate$lambda$6$lambda$5(ApiDirectIpoOrderConfiguration apiDirectIpoOrderConfiguration, Money money, BigDecimal bigDecimal, DirectIpoOrderContext.StaticInputs staticInputs, BigDecimal bigDecimal2, Money money2, DirectIpoOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        UiEvent uiEvent = new UiEvent(new DirectIpoOrderViewState.InitialLoad(apiDirectIpoOrderConfiguration, apiDirectIpoOrderConfiguration.getStartingPriceType(), money, bigDecimal, staticInputs));
        return DirectIpoOrderViewState.copy$default(applyMutation, null, apiDirectIpoOrderConfiguration, bigDecimal, money, apiDirectIpoOrderConfiguration.getStartingPriceType(), null, new UiEvent(DirectIpoOrderViewState.FocusState.SHARES_INPUT), uiEvent, bigDecimal2 != null ? new UiEvent(bigDecimal2) : null, money2 != null ? new UiEvent(money2) : null, null, null, null, null, 15393, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        Single<Result> orderConfigurationRequest = getOrderConfigurationRequest();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Observable<Result> observable = orderConfigurationRequest.toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable<R> observableCompose = observable.compose(new Poll(10L, timeUnit, false));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        Observable observableRefCount = observableCompose.onErrorReturn(new Function() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$onResume$orderConfigurationPollObservable$1
            @Override // io.reactivex.functions.Function
            public final DirectIpoOrderDuxo.Result.Failure apply(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new DirectIpoOrderDuxo.Result.Failure(p0);
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable<Result> observableTakeUntil = getInitialOrderRequest().concatWith(observableRefCount).takeUntil(new Predicate() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo.onResume.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Result result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof Result.Success) {
                    return false;
                }
                if (Intrinsics.areEqual(result, Result.UnsupportedFeature.INSTANCE) || (result instanceof Result.Failure)) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTakeUntil, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderDuxo.onResume$lambda$10(this.f$0, (DirectIpoOrderDuxo.Result) obj);
            }
        });
        Observable map = observableRefCount.map(new Function() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                DirectIpoOrderDuxo.Result result = (DirectIpoOrderDuxo.Result) it;
                return Optional3.asOptional(result instanceof DirectIpoOrderDuxo.Result.Success ? (DirectIpoOrderDuxo.Result.Success) result : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((DirectIpoOrderDuxo$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable map2 = ObservablesKt.filterIsPresent(map).map(new Function() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$onResume$formStatePollObservable$2
            @Override // io.reactivex.functions.Function
            public final ApiDirectIpoOrderConfiguration.ApiFormState apply(DirectIpoOrderDuxo.Result.Success it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOrderConfiguration().getForm_state();
            }
        });
        Observable<U> observableCast = getInitialOrderRequest().filter(new Predicate() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$onResume$$inlined$filterSubtype$1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(DirectIpoOrderDuxo.Result it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it instanceof DirectIpoOrderDuxo.Result.Success;
            }
        }).cast(Result.Success.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        Observable observableSkip = observableCast.map(new Function() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo.onResume.3
            @Override // io.reactivex.functions.Function
            public final ApiDirectIpoOrderConfiguration.ApiFormState apply(Result.Success it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOrderConfiguration().getForm_state();
            }
        }).concatWith(map2).distinctUntilChanged(new BiPredicate() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo.onResume.4
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(ApiDirectIpoOrderConfiguration.ApiFormState a, ApiDirectIpoOrderConfiguration.ApiFormState b) {
                Intrinsics.checkNotNullParameter(a, "a");
                Intrinsics.checkNotNullParameter(b, "b");
                return Intrinsics.areEqual(a.getForm_state_id(), b.getForm_state_id());
            }
        }).skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip, "skip(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSkip, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderDuxo.onResume$lambda$14(this.f$0, (ApiDirectIpoOrderConfiguration.ApiFormState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(DirectIpoOrderDuxo directIpoOrderDuxo, final Result result) {
        if (result instanceof Result.Success) {
            directIpoOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DirectIpoOrderDuxo.onResume$lambda$10$lambda$7(result, (DirectIpoOrderViewState) obj);
                }
            });
        } else if (result instanceof Result.Failure) {
            directIpoOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DirectIpoOrderDuxo.onResume$lambda$10$lambda$8(result, (DirectIpoOrderViewState) obj);
                }
            });
        } else {
            if (!Intrinsics.areEqual(result, Result.UnsupportedFeature.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            directIpoOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DirectIpoOrderDuxo.onResume$lambda$10$lambda$9((DirectIpoOrderViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoOrderViewState onResume$lambda$10$lambda$7(Result result, DirectIpoOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoOrderViewState.copy$default(applyMutation, null, ((Result.Success) result).getOrderConfiguration(), null, null, null, null, null, null, null, null, null, null, null, null, 16381, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoOrderViewState onResume$lambda$10$lambda$8(Result result, DirectIpoOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoOrderViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, new UiEvent(((Result.Failure) result).getThrowable()), null, null, 14335, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoOrderViewState onResume$lambda$10$lambda$9(DirectIpoOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoOrderViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, new UiEvent(Unit.INSTANCE), null, null, null, 15359, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$14(DirectIpoOrderDuxo directIpoOrderDuxo, ApiDirectIpoOrderConfiguration.ApiFormState apiFormState) {
        ApiGenericAlert form_invalid_alert = apiFormState.getForm_invalid_alert();
        final GenericAlert dbModel = form_invalid_alert != null ? form_invalid_alert.toDbModel() : null;
        directIpoOrderDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderDuxo.onResume$lambda$14$lambda$13(dbModel, (DirectIpoOrderViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoOrderViewState onResume$lambda$14$lambda$13(GenericAlert genericAlert, DirectIpoOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoOrderViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, null, null, genericAlert != null ? new UiEvent(genericAlert) : null, 8191, null);
    }

    @Override // com.robinhood.android.lib.trade.validation.ValidationDuxo
    public void onPreValidate(DirectIpoOrderContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        super.onPreValidate((DirectIpoOrderDuxo) input);
        logOrderRequest(OrderFormStep.REVIEW, input.getRequest());
    }

    public final void submitOrder() {
        Observable observableTake = getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderDuxo.submitOrder$lambda$16(this.f$0, (DirectIpoOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitOrder$lambda$16(DirectIpoOrderDuxo directIpoOrderDuxo, DirectIpoOrderViewState directIpoOrderViewState) {
        DirectIpoOrderContext validationInput = directIpoOrderViewState.getValidationInput();
        if (validationInput != null) {
            directIpoOrderDuxo.logOrderRequest(OrderFormStep.SUBMIT, validationInput.getRequest());
            OrderSubmissionManager.submit$default(directIpoOrderDuxo.orderSubmissionManager, validationInput.getRequest(), null, false, 6, null);
        }
        return Unit.INSTANCE;
    }

    public final void setShareQuantity(final BigDecimal shareQuantity) {
        Intrinsics.checkNotNullParameter(shareQuantity, "shareQuantity");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderDuxo.setShareQuantity$lambda$17(shareQuantity, (DirectIpoOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoOrderViewState setShareQuantity$lambda$17(BigDecimal bigDecimal, DirectIpoOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoOrderViewState.copy$default(applyMutation, null, null, bigDecimal, null, null, null, null, null, null, null, null, null, null, null, 16379, null);
    }

    public final void setFormState(final DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderDuxo.setFormState$lambda$18(formState, (DirectIpoOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoOrderViewState setFormState$lambda$18(DefaultOrderState defaultOrderState, DirectIpoOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.setFormState(defaultOrderState);
    }

    public final void setCustomPrice(final Money customPrice) {
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderDuxo.setCustomPrice$lambda$19(customPrice, (DirectIpoOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoOrderViewState setCustomPrice$lambda$19(Money money, DirectIpoOrderViewState applyMutation) {
        Money money2;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (money == null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            money2 = Money3.toMoney(ZERO, Currencies.USD);
        } else {
            money2 = money;
        }
        return DirectIpoOrderViewState.copy$default(applyMutation, null, null, null, money2, null, null, null, null, null, null, null, null, null, null, 16375, null);
    }

    public final void setPriceType(final ApiDirectIpoOrderConfiguration.IpoAccessPriceType priceType) {
        Intrinsics.checkNotNullParameter(priceType, "priceType");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoOrderDuxo.setPriceType$lambda$20(priceType, (DirectIpoOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoOrderViewState setPriceType$lambda$20(ApiDirectIpoOrderConfiguration.IpoAccessPriceType ipoAccessPriceType, DirectIpoOrderViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.setPriceType(ipoAccessPriceType);
    }

    public final void logInitialLoad(DirectIpoOrderViewState.InitialLoad initialLoad) {
        Intrinsics.checkNotNullParameter(initialLoad, "initialLoad");
        logOrderRequest(OrderFormStep.INITIAL_LOAD, new DirectIpoOrderContext(initialLoad.getOrderConfiguration(), initialLoad.getPriceType(), initialLoad.getCustomPrice(), initialLoad.getQuantity(), initialLoad.getStaticInputs()).getRequest());
    }

    /* compiled from: DirectIpoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$getOrderConfigurationRequest$1", m3645f = "DirectIpoOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderDuxo$getOrderConfigurationRequest$1 */
    static final class C293371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result>, Object> {
        Object L$0;
        int label;

        C293371(Continuation<? super C293371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DirectIpoOrderDuxo.this.new C293371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result> continuation) {
            return ((C293371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            DirectIpoOrderDuxo directIpoOrderDuxo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DirectIpoOrderDuxo directIpoOrderDuxo2 = DirectIpoOrderDuxo.this;
                DirectIpoApi directIpoApi = directIpoOrderDuxo2.api;
                UUID instrumentId = ((DirectIpoOrderFragment.Args) DirectIpoOrderDuxo.INSTANCE.getArgs((HasSavedState) DirectIpoOrderDuxo.this)).getInstrumentId();
                this.L$0 = directIpoOrderDuxo2;
                this.label = 1;
                Object directIpoOrderConfiguration = directIpoApi.getDirectIpoOrderConfiguration(instrumentId, this);
                if (directIpoOrderConfiguration == coroutine_suspended) {
                    return coroutine_suspended;
                }
                directIpoOrderDuxo = directIpoOrderDuxo2;
                obj = directIpoOrderConfiguration;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                directIpoOrderDuxo = (DirectIpoOrderDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return directIpoOrderDuxo.mapOrderConfigurationToResult((ApiDirectIpoOrderConfiguration) obj);
        }
    }

    private final Single<Result> getOrderConfigurationRequest() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C293371(null), 1, null);
    }

    private final void logOrderRequest(OrderFormStep step, DirectIpoOrderSubmissionManager2 orderRequest) {
        if (orderRequest instanceof DirectIpoOrderSubmissionManager2.Create) {
            TraderEventLogger.DefaultImpls.logEquityOrderEvent$default(this.eventLogger, step, IpoRosettaConverters.toIpoOrderPayload(((DirectIpoOrderSubmissionManager2.Create) orderRequest).getOrderRequest()), BrokerageAccountType.INDIVIDUAL, this.loggingSource, null, null, null, 112, null);
            return;
        }
        if (!(orderRequest instanceof DirectIpoOrderSubmissionManager2.Update)) {
            throw new NoWhenBranchMatchedException();
        }
        DirectIpoOrderSubmissionManager2.Update update = (DirectIpoOrderSubmissionManager2.Update) orderRequest;
        this.eventLogger.logEquityOrderUpdateEvent(step, update.getOrderId(), IpoRosettaConverters.toIpoOrderPayload(update.getIpoOrderUpdateRequest()), BrokerageAccountType.INDIVIDUAL, this.loggingSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result mapOrderConfigurationToResult(ApiDirectIpoOrderConfiguration orderConfiguration) {
        switch (WhenMappings.$EnumSwitchMapping$2[orderConfiguration.getPhase().ordinal()]) {
            case 1:
            case 2:
                int i = WhenMappings.$EnumSwitchMapping$1[orderConfiguration.getStartingPriceType().ordinal()];
                if (i == 1 || i == 2) {
                    return new Result.Success(orderConfiguration);
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return Result.UnsupportedFeature.INSTANCE;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return Result.UnsupportedFeature.INSTANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: DirectIpoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo$Result;", "", "<init>", "()V", "UnsupportedFeature", "Success", "Failure", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo$Result$Failure;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo$Result$Success;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo$Result$UnsupportedFeature;", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Result {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Result() {
        }

        /* compiled from: DirectIpoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo$Result$UnsupportedFeature;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UnsupportedFeature extends Result {
            public static final int $stable = 0;
            public static final UnsupportedFeature INSTANCE = new UnsupportedFeature();

            public boolean equals(Object other) {
                return this == other || (other instanceof UnsupportedFeature);
            }

            public int hashCode() {
                return 1151979304;
            }

            public String toString() {
                return "UnsupportedFeature";
            }

            private UnsupportedFeature() {
                super(null);
            }
        }

        /* compiled from: DirectIpoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo$Result$Success;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo$Result;", "orderConfiguration", "Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration;", "<init>", "(Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration;)V", "getOrderConfiguration", "()Lcom/robinhood/directipo/models/api/ApiDirectIpoOrderConfiguration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Result {
            public static final int $stable = 8;
            private final ApiDirectIpoOrderConfiguration orderConfiguration;

            public static /* synthetic */ Success copy$default(Success success, ApiDirectIpoOrderConfiguration apiDirectIpoOrderConfiguration, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiDirectIpoOrderConfiguration = success.orderConfiguration;
                }
                return success.copy(apiDirectIpoOrderConfiguration);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiDirectIpoOrderConfiguration getOrderConfiguration() {
                return this.orderConfiguration;
            }

            public final Success copy(ApiDirectIpoOrderConfiguration orderConfiguration) {
                Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
                return new Success(orderConfiguration);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.orderConfiguration, ((Success) other).orderConfiguration);
            }

            public int hashCode() {
                return this.orderConfiguration.hashCode();
            }

            public String toString() {
                return "Success(orderConfiguration=" + this.orderConfiguration + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(ApiDirectIpoOrderConfiguration orderConfiguration) {
                super(null);
                Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
                this.orderConfiguration = orderConfiguration;
            }

            public final ApiDirectIpoOrderConfiguration getOrderConfiguration() {
                return this.orderConfiguration;
            }
        }

        /* compiled from: DirectIpoOrderDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo$Result$Failure;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo$Result;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Failure extends Result {
            public static final int $stable = 8;
            private final Throwable throwable;

            public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = failure.throwable;
                }
                return failure.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Failure copy(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new Failure(throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Failure) && Intrinsics.areEqual(this.throwable, ((Failure) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "Failure(throwable=" + this.throwable + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }
    }

    /* compiled from: DirectIpoOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderDuxo;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderFragment$Args;", "<init>", "()V", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DirectIpoOrderDuxo, DirectIpoOrderFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DirectIpoOrderFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DirectIpoOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DirectIpoOrderFragment.Args getArgs(DirectIpoOrderDuxo directIpoOrderDuxo) {
            return (DirectIpoOrderFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, directIpoOrderDuxo);
        }
    }
}
