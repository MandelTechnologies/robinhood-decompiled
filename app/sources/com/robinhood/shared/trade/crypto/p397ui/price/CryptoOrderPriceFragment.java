package com.robinhood.shared.trade.crypto.p397ui.price;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.accessibility.RhAccessibilityManager;
import com.robinhood.shared.trade.crypto.p397ui.price.CryptoOrderPriceFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import rosetta.order.Side;

/* compiled from: CryptoOrderPriceFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003CDEB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u00108\u001a\u0002032\u0006\u00109\u001a\u00020:H\u0002J\r\u0010;\u001a\u000203H\u0017¢\u0006\u0002\u0010<J\t\u0010=\u001a\u00020-H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020-X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006F"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "getExperimentsProvider", "()Lcom/robinhood/experiments/ExperimentsProvider;", "setExperimentsProvider", "(Lcom/robinhood/experiments/ExperimentsProvider;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "rhAccessibilityManager", "Lcom/robinhood/shared/accessibility/RhAccessibilityManager;", "getRhAccessibilityManager", "()Lcom/robinhood/shared/accessibility/RhAccessibilityManager;", "setRhAccessibilityManager", "(Lcom/robinhood/shared/accessibility/RhAccessibilityManager;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "callbacks", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDuxo;", "getDuxo", "()Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "popNearestParentBackStackOnBackPressed", "getPopNearestParentBackStackOnBackPressed", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceViewState;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoOrderPriceFragment extends GenericComposeFragment implements AutoLoggableFragment, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof CryptoOrderPriceFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CryptoOrderPriceDuxo.class);
    public EventLogger eventLogger;
    public ExperimentsProvider experimentsProvider;
    public RhAccessibilityManager rhAccessibilityManager;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoOrderPriceFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoOrderPriceFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceFragment$Callbacks;", "", "onLimitOrderPriceSelected", "", "limitPrice", "Ljava/math/BigDecimal;", "onStopLossOrderPriceSelected", "stopPrice", "onStopLimitOrderStopPriceSelected", "onStopLimitOrderLimitPriceSelected", "onOrderTypeInfoClicked", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onLimitOrderPriceSelected(BigDecimal limitPrice);

        void onOrderTypeInfoClicked(Order.Configuration configuration, OrderSide orderSide);

        void onStopLimitOrderLimitPriceSelected(BigDecimal stopPrice, BigDecimal limitPrice);

        void onStopLimitOrderStopPriceSelected(BigDecimal stopPrice);

        void onStopLossOrderPriceSelected(BigDecimal stopPrice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CryptoOrderPriceFragment cryptoOrderPriceFragment, int i, Composer composer, int i2) {
        cryptoOrderPriceFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public boolean getPopNearestParentBackStackOnBackPressed() {
        return true;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public final ExperimentsProvider getExperimentsProvider() {
        ExperimentsProvider experimentsProvider = this.experimentsProvider;
        if (experimentsProvider != null) {
            return experimentsProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsProvider");
        return null;
    }

    public final void setExperimentsProvider(ExperimentsProvider experimentsProvider) {
        Intrinsics.checkNotNullParameter(experimentsProvider, "<set-?>");
        this.experimentsProvider = experimentsProvider;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final RhAccessibilityManager getRhAccessibilityManager() {
        RhAccessibilityManager rhAccessibilityManager = this.rhAccessibilityManager;
        if (rhAccessibilityManager != null) {
            return rhAccessibilityManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhAccessibilityManager");
        return null;
    }

    public final void setRhAccessibilityManager(RhAccessibilityManager rhAccessibilityManager) {
        Intrinsics.checkNotNullParameter(rhAccessibilityManager, "<set-?>");
        this.rhAccessibilityManager = rhAccessibilityManager;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return getDuxo().getEventScreen();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        Companion companion = INSTANCE;
        Side protobuf = Orders2.toProtobuf(((Args) companion.getArgs((Fragment) this)).getSide());
        CryptoOrderContext.CryptoOrderType protobuf2 = Orders2.toProtobuf(((Args) companion.getArgs((Fragment) this)).getPriceGroup().getOrderType());
        String string2 = ((Args) companion.getArgs((Fragment) this)).getOrderUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = ((Args) companion.getArgs((Fragment) this)).getPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoOrderContext(protobuf2, protobuf, string3, string2, 0.0d, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 1048560, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoOrderPriceDuxo getDuxo() {
        return (CryptoOrderPriceDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C405271(null), 1, null);
    }

    /* compiled from: CryptoOrderPriceFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment$onViewCreated$1", m3645f = "CryptoOrderPriceFragment.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment$onViewCreated$1 */
    static final class C405271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C405271(Continuation<? super C405271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderPriceFragment.this.new C405271(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C405271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoOrderPriceFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ CryptoOrderPriceFragment $tmp0;

            AnonymousClass1(CryptoOrderPriceFragment cryptoOrderPriceFragment) {
                this.$tmp0 = cryptoOrderPriceFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, CryptoOrderPriceFragment.class, "bind", "bind(Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(CryptoOrderPriceViewState cryptoOrderPriceViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bind = C405271.invokeSuspend$bind(this.$tmp0, cryptoOrderPriceViewState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((CryptoOrderPriceViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<CryptoOrderPriceViewState> stateFlow = CryptoOrderPriceFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderPriceFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(CryptoOrderPriceFragment cryptoOrderPriceFragment, CryptoOrderPriceViewState cryptoOrderPriceViewState, Continuation continuation) {
            cryptoOrderPriceFragment.bind(cryptoOrderPriceViewState);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoOrderPriceFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment$bind$1", m3645f = "CryptoOrderPriceFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment$bind$1 */
    static final class C405261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CryptoOrderPriceViewState $viewState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C405261(CryptoOrderPriceViewState cryptoOrderPriceViewState, Continuation<? super C405261> continuation) {
            super(2, continuation);
            this.$viewState = cryptoOrderPriceViewState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderPriceFragment.this.new C405261(this.$viewState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C405261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoOrderPriceFragment.this.getDuxo().emitBottomSheetData(this.$viewState.getBottomSheetTypeDtos());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(CryptoOrderPriceViewState viewState) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C405261(viewState, null), 3, null);
    }

    /* compiled from: CryptoOrderPriceFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceFragment$Args;", "Landroid/os/Parcelable;", "side", "Lcom/robinhood/models/db/OrderSide;", "pairId", "Ljava/util/UUID;", "orderUuid", "priceGroup", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup;", "<init>", "(Lcom/robinhood/models/db/OrderSide;Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup;)V", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getPairId", "()Ljava/util/UUID;", "getOrderUuid", "getPriceGroup", "()Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID orderUuid;
        private final UUID pairId;
        private final CryptoOrderPriceGroup priceGroup;
        private final OrderSide side;

        /* compiled from: CryptoOrderPriceFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(OrderSide.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), (CryptoOrderPriceGroup) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.side.name());
            dest.writeSerializable(this.pairId);
            dest.writeSerializable(this.orderUuid);
            dest.writeParcelable(this.priceGroup, flags);
        }

        public Args(OrderSide side, UUID pairId, UUID orderUuid, CryptoOrderPriceGroup priceGroup) {
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(pairId, "pairId");
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            Intrinsics.checkNotNullParameter(priceGroup, "priceGroup");
            this.side = side;
            this.pairId = pairId;
            this.orderUuid = orderUuid;
            this.priceGroup = priceGroup;
        }

        public final OrderSide getSide() {
            return this.side;
        }

        public final UUID getPairId() {
            return this.pairId;
        }

        public final UUID getOrderUuid() {
            return this.orderUuid;
        }

        public final CryptoOrderPriceGroup getPriceGroup() {
            return this.priceGroup;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(589831313);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(589831313, i2, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment.ComposeContent (CryptoOrderPriceFragment.kt:100)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1489566135, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment.ComposeContent.1

                /* compiled from: CryptoOrderPriceFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ CryptoOrderPriceFragment this$0;

                    AnonymousClass1(CryptoOrderPriceFragment cryptoOrderPriceFragment) {
                        this.this$0 = cryptoOrderPriceFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1588096308, i, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment.ComposeContent.<anonymous>.<anonymous> (CryptoOrderPriceFragment.kt:103)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final CryptoOrderPriceFragment cryptoOrderPriceFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoOrderPriceFragment.C405251.AnonymousClass1.invoke$lambda$1$lambda$0(cryptoOrderPriceFragment, (BigDecimal) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final CryptoOrderPriceFragment cryptoOrderPriceFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CryptoOrderPriceFragment.C405251.AnonymousClass1.invoke$lambda$3$lambda$2(cryptoOrderPriceFragment2, (Order.Configuration) obj, (OrderSide) obj2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function2 function2 = (Function2) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                        final CryptoOrderPriceFragment cryptoOrderPriceFragment3 = this.this$0;
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment$ComposeContent$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CryptoOrderPriceFragment.C405251.AnonymousClass1.invoke$lambda$5$lambda$4(cryptoOrderPriceFragment3, (BigDecimal) obj, (BigDecimal) obj2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function2 function22 = (Function2) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composer.changedInstance(this.this$0);
                        final CryptoOrderPriceFragment cryptoOrderPriceFragment4 = this.this$0;
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment$ComposeContent$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoOrderPriceFragment.C405251.AnonymousClass1.invoke$lambda$7$lambda$6(cryptoOrderPriceFragment4, (BigDecimal) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        Function1 function12 = (Function1) objRememberedValue4;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance5 = composer.changedInstance(this.this$0);
                        final CryptoOrderPriceFragment cryptoOrderPriceFragment5 = this.this$0;
                        Object objRememberedValue5 = composer.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment$ComposeContent$1$1$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoOrderPriceFragment.C405251.AnonymousClass1.invoke$lambda$9$lambda$8(cryptoOrderPriceFragment5, (BigDecimal) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        Function1 function13 = (Function1) objRememberedValue5;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance6 = composer.changedInstance(this.this$0);
                        final CryptoOrderPriceFragment cryptoOrderPriceFragment6 = this.this$0;
                        Object objRememberedValue6 = composer.rememberedValue();
                        if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment$ComposeContent$1$1$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoOrderPriceFragment.C405251.AnonymousClass1.invoke$lambda$11$lambda$10(cryptoOrderPriceFragment6, (DialogFragmentKey) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue6);
                        }
                        composer.endReplaceGroup();
                        CryptoOrderPriceComposableKt.CryptoOrderPriceComposable(function1, function2, function22, function12, function13, (Function1) objRememberedValue6, null, null, composer, 0, 192);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(CryptoOrderPriceFragment cryptoOrderPriceFragment, BigDecimal limitPrice) {
                        Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
                        cryptoOrderPriceFragment.getCallbacks().onLimitOrderPriceSelected(limitPrice);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(CryptoOrderPriceFragment cryptoOrderPriceFragment, Order.Configuration configuration, OrderSide orderSide) {
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
                        cryptoOrderPriceFragment.getCallbacks().onOrderTypeInfoClicked(configuration, orderSide);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(CryptoOrderPriceFragment cryptoOrderPriceFragment, BigDecimal stopPrice, BigDecimal limitPrice) {
                        Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
                        Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
                        cryptoOrderPriceFragment.getCallbacks().onStopLimitOrderLimitPriceSelected(stopPrice, limitPrice);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$6(CryptoOrderPriceFragment cryptoOrderPriceFragment, BigDecimal stopPrice) {
                        Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
                        cryptoOrderPriceFragment.getCallbacks().onStopLimitOrderStopPriceSelected(stopPrice);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$9$lambda$8(CryptoOrderPriceFragment cryptoOrderPriceFragment, BigDecimal stopPrice) {
                        Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
                        cryptoOrderPriceFragment.getCallbacks().onStopLossOrderPriceSelected(stopPrice);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$11$lambda$10(CryptoOrderPriceFragment cryptoOrderPriceFragment, DialogFragmentKey dialogFragmentKey) {
                        Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
                        Navigator.DefaultImpls.createDialogFragment$default(cryptoOrderPriceFragment.getNavigator(), dialogFragmentKey, null, 2, null).show(cryptoOrderPriceFragment.getChildFragmentManager(), "microgramCryptoOrderPriceDialogFragment");
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1489566135, i3, -1, "com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment.ComposeContent.<anonymous> (CryptoOrderPriceFragment.kt:102)");
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, CryptoOrderPriceFragment.this.getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1588096308, true, new AnonymousClass1(CryptoOrderPriceFragment.this), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoOrderPriceFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CryptoOrderPriceFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceFragment;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceFragment$Args;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoOrderPriceFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoOrderPriceFragment cryptoOrderPriceFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoOrderPriceFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoOrderPriceFragment newInstance(Args args) {
            return (CryptoOrderPriceFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoOrderPriceFragment cryptoOrderPriceFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoOrderPriceFragment, args);
        }
    }
}
