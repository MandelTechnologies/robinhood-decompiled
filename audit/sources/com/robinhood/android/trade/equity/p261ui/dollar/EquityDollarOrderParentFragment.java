package com.robinhood.android.trade.equity.p261ui.dollar;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderCallbacks;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment;
import com.robinhood.android.lib.trade.BaseOrderParentFragment;
import com.robinhood.android.trade.equity.p261ui.confirmation.OrderConfirmationFragment;
import com.robinhood.android.trade.equity.p261ui.dollar.EquityDollarOrderFragment;
import com.robinhood.android.trade.equity.p261ui.dollar.EquityDollarOrderParentFragment;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.Buildable;
import com.robinhood.android.trading.contracts.configuration.DollarBased;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.EquityOrderSide3;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.i18n.car.CarSuitabilityType;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow2;
import timber.log.Timber;

/* compiled from: EquityDollarOrderParentFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 _2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002^_B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\u0010\u0010P\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030QH\u0016J\b\u0010R\u001a\u00020JH\u0014J\u0010\u0010S\u001a\u00020J2\u0006\u0010\u0007\u001a\u00020TH\u0016J\u0010\u0010U\u001a\u00020J2\u0006\u0010\u0007\u001a\u00020VH\u0016J\u001a\u0010W\u001a\u00020J2\u0006\u0010$\u001a\u00020\u001c2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\b\u0010Z\u001a\u00020!H\u0016J\u0012\u0010[\u001a\u00020J2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0016R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b \u0010\"R\u001b\u0010$\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b%\u0010\u001eR\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b-\u0010\u0010R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u001eR\u001e\u00107\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001c0=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR$\u0010E\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010\u0010\"\u0004\bG\u0010HR\u001b\u0010M\u001a\u00020!8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010\f\u001a\u0004\bN\u0010\"¨\u0006`"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderParentFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragment;", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderFragment$Callbacks;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationFragment$Callbacks;", "<init>", "()V", EquityDollarOrderParentFragment.ARG_ORDER_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "getOrderConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "orderConfiguration$delegate", "Lkotlin/Lazy;", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "instrumentId$delegate", EquityDollarOrderParentFragment.ARG_SIDE, "Lcom/robinhood/models/db/OrderSide;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "equitySide", "Lcom/robinhood/models/db/EquityOrderSide;", "getEquitySide", "()Lcom/robinhood/models/db/EquityOrderSide;", "equitySide$delegate", EquityDollarOrderParentFragment.ARG_COMPLETION_URL, "", "getCompletionUrl", "()Ljava/lang/String;", "completionUrl$delegate", EquityDollarOrderParentFragment.ARG_IS_PRE_IPO, "", "()Z", "isPreIpo$delegate", "accountNumber", "getAccountNumber", "accountNumber$delegate", EquityDollarOrderParentFragment.ARG_FLOW_SOURCE, "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "flowSource$delegate", EquityDollarOrderParentFragment.ARG_REF_ID, "getRefId", "refId$delegate", "callbacks", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderParentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderParentFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "analyticsErrorString", "getAnalyticsErrorString", "orderManager", "getOrderManager", "()Lcom/robinhood/android/equity/submission/EquityOrderManager;", "setOrderManager", "(Lcom/robinhood/android/equity/submission/EquityOrderManager;)V", "accountNumberObs", "Lio/reactivex/Observable;", "getAccountNumberObs", "()Lio/reactivex/Observable;", "carSuitabilityType", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "getCarSuitabilityType", "()Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "_", "orderUuid", "getOrderUuid", "setOrderUuid", "(Ljava/util/UUID;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "dismissImmediately", "getDismissImmediately", "dismissImmediately$delegate", "createOrderConfirmationFragment", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "onShowOrderConfirmation", "setOrderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "startOrderBuilder", "Lcom/robinhood/android/trading/contracts/configuration/Buildable;", "startOrderSelectMenu", "shareQuantity", "Ljava/math/BigDecimal;", "onBackPressed", "onOrderCompleted", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "Callbacks", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EquityDollarOrderParentFragment extends BaseOrderParentFragment<EquityOrderManager> implements EquityDollarOrderFragment.Callbacks, OrderConfirmationFragment.Callbacks {
    private static final String ARG_ACCOUNT_NUMBER = "accountNumber";
    private static final String ARG_COMPLETION_URL = "completionUrl";
    private static final String ARG_FLOW_SOURCE = "flowSource";
    private static final String ARG_INSTRUMENT_ID = "instrumentId";
    private static final String ARG_IS_PRE_IPO = "isPreIpo";
    private static final String ARG_ORDER_CONFIGURATION = "orderConfiguration";
    private static final String ARG_REF_ID = "refId";
    private static final String ARG_SIDE = "side";
    private static final String ARG_SKIP_CONFIRMATION = "skipConfirmation";
    public EquityOrderManager orderManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EquityDollarOrderParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderParentFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: orderConfiguration$delegate, reason: from kotlin metadata */
    private final Lazy orderConfiguration = Fragments2.argument(this, ARG_ORDER_CONFIGURATION);

    /* renamed from: instrumentId$delegate, reason: from kotlin metadata */
    private final Lazy instrumentId = Fragments2.argument(this, "instrumentId");

    /* renamed from: equitySide$delegate, reason: from kotlin metadata */
    private final Lazy equitySide = Fragments2.argument(this, ARG_SIDE);

    /* renamed from: completionUrl$delegate, reason: from kotlin metadata */
    private final Lazy completionUrl = Fragments2.argument(this, ARG_COMPLETION_URL);

    /* renamed from: isPreIpo$delegate, reason: from kotlin metadata */
    private final Lazy isPreIpo = Fragments2.argument(this, ARG_IS_PRE_IPO);

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final Lazy accountNumber = Fragments2.argument(this, "accountNumber");

    /* renamed from: flowSource$delegate, reason: from kotlin metadata */
    private final Lazy flowSource = Fragments2.argument(this, ARG_FLOW_SOURCE);

    /* renamed from: refId$delegate, reason: from kotlin metadata */
    private final Lazy refId = Fragments2.argument(this, ARG_REF_ID);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderParentFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof EquityDollarOrderParentFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: dismissImmediately$delegate, reason: from kotlin metadata */
    private final Lazy dismissImmediately = Fragments2.argument(this, ARG_SKIP_CONFIRMATION);

    /* compiled from: EquityDollarOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderParentFragment$Callbacks;", "Lcom/robinhood/android/equity/ordertypeselector/callbacks/EquityOrderCallbacks;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends EquityOrderCallbacks {
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public void setOrderUuid(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "_");
    }

    public final DollarBased getOrderConfiguration() {
        return (DollarBased) this.orderConfiguration.getValue();
    }

    private final UUID getInstrumentId() {
        return (UUID) this.instrumentId.getValue();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public OrderSide getSide() {
        return EquityOrderSide3.toOrderSide(getEquitySide());
    }

    public final EquityOrderSide getEquitySide() {
        return (EquityOrderSide) this.equitySide.getValue();
    }

    private final String getCompletionUrl() {
        return (String) this.completionUrl.getValue();
    }

    private final boolean isPreIpo() {
        return ((Boolean) this.isPreIpo.getValue()).booleanValue();
    }

    private final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    private final EquityOrderFlowSource getFlowSource() {
        return (EquityOrderFlowSource) this.flowSource.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getRefId() {
        return (UUID) this.refId.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public String getAnalyticsErrorString() {
        return AnalyticsStrings.ERROR_PLACE_ORDER;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public EquityOrderManager getOrderManager() {
        EquityOrderManager equityOrderManager = this.orderManager;
        if (equityOrderManager != null) {
            return equityOrderManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public void setOrderManager(EquityOrderManager equityOrderManager) {
        Intrinsics.checkNotNullParameter(equityOrderManager, "<set-?>");
        this.orderManager = equityOrderManager;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public Observable<String> getAccountNumberObs() {
        Observable<String> observableJust = Observable.just(getAccountNumber());
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public CarSuitabilityType getCarSuitabilityType() {
        return new CarSuitabilityType.Equity(CollectionsKt.listOf(getInstrumentId()), !getEquitySide().isSell());
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment, com.robinhood.android.lib.trade.BaseOrderFragment.Callbacks
    public UUID getOrderUuid() {
        return getRefId();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            EquityDollarOrderFragment.Companion companion = EquityDollarOrderFragment.INSTANCE;
            DollarBased orderConfiguration = getOrderConfiguration();
            UUID instrumentId = getInstrumentId();
            EquityOrderSide equitySide = getEquitySide();
            setFragment(i, companion.newInstance((Parcelable) new EquityDollarOrderFragment.Args(getCompletionUrl(), getAccountNumber(), instrumentId, isPreIpo(), orderConfiguration, equitySide, getFlowSource())));
        }
    }

    public final boolean getDismissImmediately() {
        return ((Boolean) this.dismissImmediately.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public BaseOrderConfirmationFragment<?, ?> createOrderConfirmationFragment() {
        return (BaseOrderConfirmationFragment) OrderConfirmationFragment.INSTANCE.newInstance((Parcelable) new OrderConfirmationFragment.Args(isPreIpo(), false, getDismissImmediately(), 2, null));
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    protected void onShowOrderConfirmation() {
        UUID value;
        UUID uuid;
        super.onShowOrderConfirmation();
        StateFlow2<UUID> abortedRefIds = getOrderManager().getAbortedRefIds();
        do {
            value = abortedRefIds.getValue();
            uuid = value;
            if (Intrinsics.areEqual(uuid, getRefId())) {
                uuid = null;
            }
        } while (!abortedRefIds.compareAndSet(value, uuid));
    }

    @Override // com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderCallbacks
    public void setOrderConfiguration(EquityOrderConfiguration orderConfiguration) {
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        getCallbacks().setOrderConfiguration(orderConfiguration);
    }

    @Override // com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderCallbacks
    public void startOrderBuilder(Buildable orderConfiguration) {
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        getCallbacks().startOrderBuilder(orderConfiguration);
    }

    @Override // com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderCallbacks
    public void startOrderSelectMenu(String accountNumber, BigDecimal shareQuantity) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        getCallbacks().startOrderSelectMenu(accountNumber, shareQuantity);
    }

    /* compiled from: EquityDollarOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderParentFragment$onBackPressed$1", m3645f = "EquityDollarOrderParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderParentFragment$onBackPressed$1 */
    static final class C295781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C295781(Continuation<? super C295781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityDollarOrderParentFragment.this.new C295781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2<UUID> abortedRefIds = EquityDollarOrderParentFragment.this.getOrderManager().getAbortedRefIds();
                UUID refId = EquityDollarOrderParentFragment.this.getRefId();
                this.label = 1;
                if (abortedRefIds.emit(refId, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C295781(null), 3, null);
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.trade.equity.EquityOrderCompletionCallbacks
    public void onOrderCompleted(Order order) {
        if (getCompletionUrl() != null) {
            Uri.Builder builderBuildUpon = Uri.parse(getCompletionUrl()).buildUpon();
            Intrinsics.checkNotNull(order);
            Uri uriBuild = builderBuildUpon.appendQueryParameter("order_url", order.getOrderUrl()).build();
            Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
            intent.addFlags(268435456);
            try {
                startActivity(intent);
            } catch (Exception unused) {
                Timber.INSTANCE.mo3353e("Invalid completion url: %s", uriBuild);
            }
        }
        onOrderFlowFinished();
    }

    /* compiled from: EquityDollarOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderParentFragment$Companion;", "", "<init>", "()V", "ARG_INSTRUMENT_ID", "", "ARG_ORDER_CONFIGURATION", "ARG_SIDE", "ARG_COMPLETION_URL", "ARG_IS_PRE_IPO", "ARG_ACCOUNT_NUMBER", "ARG_FLOW_SOURCE", "ARG_REF_ID", "ARG_SKIP_CONFIRMATION", "newInstance", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderParentFragment;", EquityDollarOrderParentFragment.ARG_ORDER_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "instrumentId", "Ljava/util/UUID;", EquityDollarOrderParentFragment.ARG_SIDE, "Lcom/robinhood/models/db/EquityOrderSide;", EquityDollarOrderParentFragment.ARG_COMPLETION_URL, EquityDollarOrderParentFragment.ARG_IS_PRE_IPO, "", "accountNumber", EquityDollarOrderParentFragment.ARG_FLOW_SOURCE, "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", EquityDollarOrderParentFragment.ARG_REF_ID, EquityDollarOrderParentFragment.ARG_SKIP_CONFIRMATION, "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EquityDollarOrderParentFragment newInstance(DollarBased orderConfiguration, UUID instrumentId, EquityOrderSide side, String completionUrl, boolean isPreIpo, String accountNumber, EquityOrderFlowSource flowSource, UUID refId, boolean skipConfirmation) {
            Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            Intrinsics.checkNotNullParameter(refId, "refId");
            EquityDollarOrderParentFragment equityDollarOrderParentFragment = new EquityDollarOrderParentFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(EquityDollarOrderParentFragment.ARG_ORDER_CONFIGURATION, orderConfiguration);
            bundle.putSerializable("instrumentId", instrumentId);
            bundle.putSerializable(EquityDollarOrderParentFragment.ARG_SIDE, side);
            bundle.putString(EquityDollarOrderParentFragment.ARG_COMPLETION_URL, completionUrl);
            bundle.putBoolean(EquityDollarOrderParentFragment.ARG_IS_PRE_IPO, isPreIpo);
            bundle.putString("accountNumber", accountNumber);
            bundle.putSerializable(EquityDollarOrderParentFragment.ARG_FLOW_SOURCE, flowSource);
            bundle.putSerializable(EquityDollarOrderParentFragment.ARG_REF_ID, refId);
            bundle.putBoolean(EquityDollarOrderParentFragment.ARG_SKIP_CONFIRMATION, skipConfirmation);
            equityDollarOrderParentFragment.setArguments(bundle);
            return equityDollarOrderParentFragment;
        }
    }
}
