package com.robinhood.android.trade.equity.p261ui.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.equity.ordertypeselector.callbacks.EquityOrderCallbacks;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment;
import com.robinhood.android.lib.trade.BaseOrderParentFragment;
import com.robinhood.android.trade.equity.p261ui.confirmation.OrderConfirmationFragment;
import com.robinhood.android.trade.equity.p261ui.preipo.OrderPreIpoBidPriceFragment;
import com.robinhood.android.trade.equity.p261ui.share.EquityShareOrderFragment;
import com.robinhood.android.trade.equity.p261ui.share.EquityShareOrderParentFragment;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.Buildable;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.ShareLimit;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.EquityOrderSide3;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
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

/* compiled from: EquityShareOrderParentFragment.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 j2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002ijB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\u0010\u0010X\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030YH\u0016J\b\u0010Z\u001a\u00020RH\u0014J\b\u0010[\u001a\u00020RH\u0016J\u0010\u0010\\\u001a\u00020R2\u0006\u0010\b\u001a\u00020]H\u0016J\u0010\u0010^\u001a\u00020R2\u0006\u0010\b\u001a\u00020_H\u0016J\u001a\u0010`\u001a\u00020R2\u0006\u0010%\u001a\u00020\u001d2\b\u0010a\u001a\u0004\u0018\u00010bH\u0016J\u0010\u0010c\u001a\u00020R2\u0006\u0010d\u001a\u00020bH\u0016J\b\u0010e\u001a\u00020\"H\u0016J\u0012\u0010f\u001a\u00020R2\b\u0010g\u001a\u0004\u0018\u00010hH\u0016R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b!\u0010#R\u001b\u0010%\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\r\u001a\u0004\b&\u0010\u001fR\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u001b\u0010.\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\r\u001a\u0004\b.\u0010#R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\r\u001a\u0004\b2\u00103R\u001b\u00105\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\r\u001a\u0004\b6\u0010\u0011R\u001b\u00108\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\r\u001a\u0004\b9\u0010\u0011R\u001b\u0010;\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\r\u001a\u0004\b;\u0010#R\u001e\u0010=\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001d0C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\u001fR$\u0010M\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bN\u0010\u0011\"\u0004\bO\u0010PR\u001b\u0010U\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010\r\u001a\u0004\bV\u0010#¨\u0006k"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderParentFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderParentFragment;", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderFragment$Callbacks;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationFragment$Callbacks;", "Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceFragment$Callbacks;", "<init>", "()V", EquityShareOrderParentFragment.ARG_ORDER_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "getOrderConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "orderConfiguration$delegate", "Lkotlin/Lazy;", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "instrumentId$delegate", EquityShareOrderParentFragment.ARG_SIDE, "Lcom/robinhood/models/db/OrderSide;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "equitySide", "Lcom/robinhood/models/db/EquityOrderSide;", "getEquitySide", "()Lcom/robinhood/models/db/EquityOrderSide;", "equitySide$delegate", EquityShareOrderParentFragment.ARG_COMPLETION_URL, "", "getCompletionUrl", "()Ljava/lang/String;", "completionUrl$delegate", EquityShareOrderParentFragment.ARG_IS_PRE_IPO, "", "()Z", "isPreIpo$delegate", "accountNumber", "getAccountNumber", "accountNumber$delegate", "callbacks", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderParentFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderParentFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", EquityShareOrderParentFragment.ARG_IS_STREAMLINED, "isStreamlined$delegate", EquityShareOrderParentFragment.ARG_FLOW_SOURCE, "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "flowSource$delegate", EquityShareOrderParentFragment.ARG_ORDER_TO_REPLACE_ID, "getOrderToReplaceId", "orderToReplaceId$delegate", "refId", "getRefId", "refId$delegate", EquityShareOrderParentFragment.ARG_IS_TAX_LOTS, "isTaxLots$delegate", "orderManager", "getOrderManager", "()Lcom/robinhood/android/equity/submission/EquityOrderManager;", "setOrderManager", "(Lcom/robinhood/android/equity/submission/EquityOrderManager;)V", "accountNumberObs", "Lio/reactivex/Observable;", "getAccountNumberObs", "()Lio/reactivex/Observable;", "carSuitabilityType", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "getCarSuitabilityType", "()Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "analyticsErrorString", "getAnalyticsErrorString", "_", "orderUuid", "getOrderUuid", "setOrderUuid", "(Ljava/util/UUID;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "dismissImmediately", "getDismissImmediately", "dismissImmediately$delegate", "createOrderConfirmationFragment", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "onShowOrderConfirmation", "showPreIpoFlow", "setOrderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "startOrderBuilder", "Lcom/robinhood/android/trading/contracts/configuration/Buildable;", "startOrderSelectMenu", "shareQuantity", "Ljava/math/BigDecimal;", "onPreIpoBidPriceFragmentFinished", "limitPrice", "onBackPressed", "onOrderCompleted", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "Callbacks", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class EquityShareOrderParentFragment extends BaseOrderParentFragment<EquityOrderManager> implements EquityShareOrderFragment.Callbacks, OrderConfirmationFragment.Callbacks, OrderPreIpoBidPriceFragment.Callbacks {
    private static final String ARGS_REF_ID = "advancedOrderFormRefId";
    private static final String ARG_ACCOUNT_NUMBER = "accountNumber";
    private static final String ARG_COMPLETION_URL = "completionUrl";
    private static final String ARG_FLOW_SOURCE = "flowSource";
    private static final String ARG_INSTRUMENT_ID = "instrumentId";
    private static final String ARG_IS_PRE_IPO = "isPreIpo";
    private static final String ARG_IS_STREAMLINED = "isStreamlined";
    private static final String ARG_IS_TAX_LOTS = "isTaxLots";
    private static final String ARG_ORDER_CONFIGURATION = "orderConfiguration";
    private static final String ARG_ORDER_TO_REPLACE_ID = "orderToReplaceId";
    private static final String ARG_SIDE = "side";
    private static final String ARG_SKIP_CONFIRMATION = "skipConfirmation";
    public EquityOrderManager orderManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EquityShareOrderParentFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderParentFragment$Callbacks;", 0))};

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

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderParentFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof EquityShareOrderParentFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: isStreamlined$delegate, reason: from kotlin metadata */
    private final Lazy isStreamlined = Fragments2.argument(this, ARG_IS_STREAMLINED);

    /* renamed from: flowSource$delegate, reason: from kotlin metadata */
    private final Lazy flowSource = Fragments2.argument(this, ARG_FLOW_SOURCE);

    /* renamed from: orderToReplaceId$delegate, reason: from kotlin metadata */
    private final Lazy orderToReplaceId = Fragments2.argument(this, ARG_ORDER_TO_REPLACE_ID);

    /* renamed from: refId$delegate, reason: from kotlin metadata */
    private final Lazy refId = Fragments2.argument(this, ARGS_REF_ID);

    /* renamed from: isTaxLots$delegate, reason: from kotlin metadata */
    private final Lazy isTaxLots = Fragments2.argument(this, ARG_IS_TAX_LOTS);
    private final String analyticsErrorString = AnalyticsStrings.ERROR_PLACE_ORDER;

    /* renamed from: dismissImmediately$delegate, reason: from kotlin metadata */
    private final Lazy dismissImmediately = Fragments2.argument(this, ARG_SKIP_CONFIRMATION);

    /* compiled from: EquityShareOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderParentFragment$Callbacks;", "Lcom/robinhood/android/equity/ordertypeselector/callbacks/EquityOrderCallbacks;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends EquityOrderCallbacks {
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public void setOrderUuid(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "_");
    }

    public final ShareBasedOrderConfiguration getOrderConfiguration() {
        return (ShareBasedOrderConfiguration) this.orderConfiguration.getValue();
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final boolean isStreamlined() {
        return ((Boolean) this.isStreamlined.getValue()).booleanValue();
    }

    private final EquityOrderFlowSource getFlowSource() {
        return (EquityOrderFlowSource) this.flowSource.getValue();
    }

    private final UUID getOrderToReplaceId() {
        return (UUID) this.orderToReplaceId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getRefId() {
        return (UUID) this.refId.getValue();
    }

    private final boolean isTaxLots() {
        return ((Boolean) this.isTaxLots.getValue()).booleanValue();
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

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public String getAnalyticsErrorString() {
        return this.analyticsErrorString;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment, com.robinhood.android.lib.trade.BaseOrderFragment.Callbacks
    public UUID getOrderUuid() {
        return getRefId();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, EquityShareOrderFragment.INSTANCE.newInstance((Parcelable) new EquityShareOrderFragment.Args(getOrderConfiguration(), getInstrumentId(), getEquitySide(), getCompletionUrl(), isPreIpo(), getAccountNumber(), isStreamlined(), getFlowSource(), getOrderToReplaceId(), getRefId())));
        }
    }

    private final boolean getDismissImmediately() {
        return ((Boolean) this.dismissImmediately.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderParentFragment
    public BaseOrderConfirmationFragment<?, ?> createOrderConfirmationFragment() {
        return (BaseOrderConfirmationFragment) OrderConfirmationFragment.INSTANCE.newInstance((Parcelable) new OrderConfirmationFragment.Args(isPreIpo(), isTaxLots(), getDismissImmediately()));
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

    @Override // com.robinhood.android.trade.equity.ui.share.EquityShareOrderFragment.Callbacks
    public void showPreIpoFlow() {
        replaceFragment(OrderPreIpoBidPriceFragment.INSTANCE.newInstance((Parcelable) new OrderPreIpoBidPriceFragment.Args(getInstrumentId())));
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

    @Override // com.robinhood.android.trade.equity.ui.preipo.OrderPreIpoBidPriceFragment.Callbacks
    public void onPreIpoBidPriceFragmentFinished(BigDecimal limitPrice) {
        Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
        BaseFragment.popEntireFragmentBackstack$default(this, false, 1, null);
        getCallbacks().setOrderConfiguration(new ShareLimit.New(getAccountNumber(), null, limitPrice, OrderTimeInForce.GTC, null, 2, null));
    }

    /* compiled from: EquityShareOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderParentFragment$onBackPressed$1", m3645f = "EquityShareOrderParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.share.EquityShareOrderParentFragment$onBackPressed$1 */
    static final class C296621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C296621(Continuation<? super C296621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityShareOrderParentFragment.this.new C296621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C296621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2<UUID> abortedRefIds = EquityShareOrderParentFragment.this.getOrderManager().getAbortedRefIds();
                UUID refId = EquityShareOrderParentFragment.this.getRefId();
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
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C296621(null), 3, null);
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

    /* compiled from: EquityShareOrderParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderParentFragment$Companion;", "", "<init>", "()V", "ARG_ORDER_CONFIGURATION", "", "ARG_INSTRUMENT_ID", "ARG_SIDE", "ARG_COMPLETION_URL", "ARG_IS_PRE_IPO", "ARG_ACCOUNT_NUMBER", "ARG_IS_STREAMLINED", "ARG_FLOW_SOURCE", "ARG_ORDER_TO_REPLACE_ID", "ARGS_REF_ID", "ARG_IS_TAX_LOTS", "ARG_SKIP_CONFIRMATION", "newInstance", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderParentFragment;", EquityShareOrderParentFragment.ARG_ORDER_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "instrumentId", "Ljava/util/UUID;", EquityShareOrderParentFragment.ARG_SIDE, "Lcom/robinhood/models/db/EquityOrderSide;", EquityShareOrderParentFragment.ARG_COMPLETION_URL, EquityShareOrderParentFragment.ARG_IS_PRE_IPO, "", "accountNumber", EquityShareOrderParentFragment.ARG_IS_STREAMLINED, EquityShareOrderParentFragment.ARG_FLOW_SOURCE, "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", EquityShareOrderParentFragment.ARG_ORDER_TO_REPLACE_ID, EquityShareOrderParentFragment.ARGS_REF_ID, EquityShareOrderParentFragment.ARG_IS_TAX_LOTS, EquityShareOrderParentFragment.ARG_SKIP_CONFIRMATION, "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EquityShareOrderParentFragment newInstance(ShareBasedOrderConfiguration orderConfiguration, UUID instrumentId, EquityOrderSide side, String completionUrl, boolean isPreIpo, String accountNumber, boolean isStreamlined, EquityOrderFlowSource flowSource, UUID orderToReplaceId, UUID advancedOrderFormRefId, boolean isTaxLots, boolean skipConfirmation) {
            Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            Intrinsics.checkNotNullParameter(advancedOrderFormRefId, "advancedOrderFormRefId");
            EquityShareOrderParentFragment equityShareOrderParentFragment = new EquityShareOrderParentFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(EquityShareOrderParentFragment.ARG_ORDER_CONFIGURATION, orderConfiguration);
            bundle.putSerializable("instrumentId", instrumentId);
            bundle.putSerializable(EquityShareOrderParentFragment.ARG_SIDE, side);
            bundle.putString(EquityShareOrderParentFragment.ARG_COMPLETION_URL, completionUrl);
            bundle.putBoolean(EquityShareOrderParentFragment.ARG_IS_PRE_IPO, isPreIpo);
            bundle.putString("accountNumber", accountNumber);
            bundle.putBoolean(EquityShareOrderParentFragment.ARG_IS_STREAMLINED, isStreamlined);
            bundle.putSerializable(EquityShareOrderParentFragment.ARG_FLOW_SOURCE, flowSource);
            bundle.putSerializable(EquityShareOrderParentFragment.ARG_ORDER_TO_REPLACE_ID, orderToReplaceId);
            bundle.putSerializable(EquityShareOrderParentFragment.ARGS_REF_ID, advancedOrderFormRefId);
            bundle.putBoolean(EquityShareOrderParentFragment.ARG_IS_TAX_LOTS, isTaxLots);
            bundle.putBoolean(EquityShareOrderParentFragment.ARG_SKIP_CONFIRMATION, skipConfirmation);
            equityShareOrderParentFragment.setArguments(bundle);
            return equityShareOrderParentFragment;
        }
    }
}
