package com.robinhood.android.common.options.tradebar;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.accountswitcher.OptionsAccountSwitcherState;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarEvent;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarViewState;
import com.robinhood.android.common.options.tradebar.databinding.IncludeOptionsDetailPageTradeBarBinding;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.LearnMoresKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks2;
import com.robinhood.android.lib.trade.view.TradeBarOverlayView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.SduiAccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import java.util.Iterator;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionsDetailPageTradebarFragment.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003MNOB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0014\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u000202H\u0016J\u0018\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020\u001fH\u0016J\b\u00109\u001a\u00020\u001fH\u0016J\u0010\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020<H\u0016J\u001a\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010#H\u0016J\u000e\u0010B\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020DJ\u000e\u0010E\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020FJ\t\u0010G\u001a\u00020>H\u0096\u0001R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IX\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$Listener;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCombinedCallbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDuxo;", "getDuxo", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/common/options/tradebar/databinding/IncludeOptionsDetailPageTradeBarBinding;", "getBinding", "()Lcom/robinhood/android/common/options/tradebar/databinding/IncludeOptionsDetailPageTradeBarBinding;", "binding$delegate", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureTradebar", "tradebar", "Lcom/robinhood/android/lib/trade/view/TradeBarOverlayView;", "state", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState;", "configureTradebarError", "", "errorState", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError;", "onAccountSwitcherCtaClicked", "args", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "showSduiAccountSwitcher", "surface", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "onAccountSelected", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onRefreshAccountsClicked", "onTradeClicked", "onActionClicked", "action", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "onNegativeButtonClicked", "", "id", "", "passthroughArgs", "onTradebarDataFetched", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$PassIn;", "passInTradebarSelfFetchData", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$SelfFetch;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionsDetailPageTradebarFragment extends BaseFragment implements AbstractTradeBarOverlayView.Listener, AccountSwitcherCallbacks2, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionsDetailPageTradebarFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(OptionsDetailPageTradebarFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/options/tradebar/databinding/IncludeOptionsDetailPageTradeBarBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionsDetailPageTradebarFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment$Callbacks;", "", "onTradebarHeightUpdated", "", "newHeight", "", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onTradebarHeightUpdated(int newHeight);
    }

    /* compiled from: OptionsDetailPageTradebarFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAllAccountsSelected() {
        AccountSwitcherCallbacks2.DefaultImpls.onAllAccountsSelected(this);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onPendingApplicationClicked(String str, BrokerageAccountType brokerageAccountType) {
        AccountSwitcherCallbacks2.DefaultImpls.onPendingApplicationClicked(this, str, brokerageAccountType);
    }

    public OptionsDetailPageTradebarFragment() {
        super(C11453R.layout.include_options_detail_page_trade_bar);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = DuxosKt.duxo(this, OptionsDetailPageTradebarDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, OptionsDetailPageTradebarFragment2.INSTANCE);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionsDetailPageTradebarDuxo getDuxo() {
        return (OptionsDetailPageTradebarDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IncludeOptionsDetailPageTradeBarBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeOptionsDetailPageTradeBarBinding) value;
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        getBinding().buySellOverlay.hideTradeTxtShadow();
        getBinding().buySellOverlay.setListener(this);
        LifecycleHost.DefaultImpls.bind$default(this, getBinding().buySellOverlay.footerHeight(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageTradebarFragment.onViewCreated$lambda$0(this.f$0, ((Integer) obj).intValue());
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C114522(null), 1, null);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(contextRequireContext).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageTradebarFragment.onViewCreated$lambda$1(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(OptionsDetailPageTradebarFragment optionsDetailPageTradebarFragment, int i) {
        optionsDetailPageTradebarFragment.getCallbacks().onTradebarHeightUpdated(i);
        View tradeBarTopDivider = optionsDetailPageTradebarFragment.getBinding().tradeBarTopDivider;
        Intrinsics.checkNotNullExpressionValue(tradeBarTopDivider, "tradeBarTopDivider");
        tradeBarTopDivider.setVisibility(0);
        View tradeBarTopDivider2 = optionsDetailPageTradebarFragment.getBinding().tradeBarTopDivider;
        Intrinsics.checkNotNullExpressionValue(tradeBarTopDivider2, "tradeBarTopDivider");
        ViewsKt.setMargins(tradeBarTopDivider2, 0, 0, 0, i);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionsDetailPageTradebarFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$onViewCreated$2", m3645f = "OptionsDetailPageTradebarFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$onViewCreated$2 */
    static final class C114522 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C114522(Continuation<? super C114522> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114522 c114522 = OptionsDetailPageTradebarFragment.this.new C114522(continuation);
            c114522.L$0 = obj;
            return c114522;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C114522) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionsDetailPageTradebarFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$onViewCreated$2$1", m3645f = "OptionsDetailPageTradebarFragment.kt", m3646l = {84}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$onViewCreated$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionsDetailPageTradebarFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageTradebarFragment optionsDetailPageTradebarFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<OptionsDetailPageTradebarViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    final OptionsDetailPageTradebarFragment optionsDetailPageTradebarFragment = this.this$0;
                    FlowCollector<? super OptionsDetailPageTradebarViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment.onViewCreated.2.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((OptionsDetailPageTradebarViewState) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(OptionsDetailPageTradebarViewState optionsDetailPageTradebarViewState, Continuation<? super Unit> continuation) {
                            OptionsDetailPageTradebarFragment optionsDetailPageTradebarFragment2 = optionsDetailPageTradebarFragment;
                            TradeBarOverlayView buySellOverlay = optionsDetailPageTradebarFragment2.getBinding().buySellOverlay;
                            Intrinsics.checkNotNullExpressionValue(buySellOverlay, "buySellOverlay");
                            optionsDetailPageTradebarFragment2.configureTradebar(buySellOverlay, optionsDetailPageTradebarViewState);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(OptionsDetailPageTradebarFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(OptionsDetailPageTradebarFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: OptionsDetailPageTradebarFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$onViewCreated$2$2", m3645f = "OptionsDetailPageTradebarFragment.kt", m3646l = {94}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$onViewCreated$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionsDetailPageTradebarFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsDetailPageTradebarFragment optionsDetailPageTradebarFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageTradebarFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    final StateFlow<OptionsDetailPageTradebarViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowCombine = Operators.combine(flowFilterNotNull, FlowKt.distinctUntilChanged(new Flow<OptionsAccountSwitcherId>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$onViewCreated$2$2$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$onViewCreated$2$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$onViewCreated$2$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageTradebarFragment.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$onViewCreated$2$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    OptionsAccountSwitcherId optionsAccountSwitcherId = ((OptionsDetailPageTradebarViewState) obj).getOptionsAccountSwitcherId();
                                    if (optionsAccountSwitcherId != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(optionsAccountSwitcherId, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
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
                        public Object collect(FlowCollector<? super OptionsAccountSwitcherId> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }));
                    final OptionsDetailPageTradebarFragment optionsDetailPageTradebarFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment.onViewCreated.2.2.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Tuples2<Event<OptionsDetailPageTradebarEvent>, ? extends OptionsAccountSwitcherId>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(Tuples2<Event<OptionsDetailPageTradebarEvent>, ? extends OptionsAccountSwitcherId> tuples2, Continuation<? super Unit> continuation) {
                            EventConsumer<OptionsDetailPageTradebarEvent> eventConsumerInvoke;
                            final Event<OptionsDetailPageTradebarEvent> eventComponent1 = tuples2.component1();
                            final OptionsAccountSwitcherId optionsAccountSwitcherIdComponent2 = tuples2.component2();
                            final OptionsDetailPageTradebarFragment optionsDetailPageTradebarFragment2 = optionsDetailPageTradebarFragment;
                            if ((eventComponent1.getData() instanceof OptionsDetailPageTradebarEvent.AccountSwitcherRefreshed) && (eventConsumerInvoke = eventComponent1.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(eventComponent1, new Function1() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$onViewCreated$2$2$2$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m12291invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m12291invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        OptionsDetailPageTradebarEvent.AccountSwitcherRefreshed accountSwitcherRefreshed = (OptionsDetailPageTradebarEvent.AccountSwitcherRefreshed) eventComponent1.getData();
                                        if (Intrinsics.areEqual(accountSwitcherRefreshed.getId(), optionsAccountSwitcherIdComponent2)) {
                                            Either<AccountSwitcherData, Throwable> result = accountSwitcherRefreshed.getResult();
                                            if (result instanceof Either.Left) {
                                                optionsDetailPageTradebarFragment2.onAccountSwitcherCtaClicked((AccountSwitcherData) ((Either.Left) accountSwitcherRefreshed.getResult()).getValue());
                                            } else {
                                                if (!(result instanceof Either.Right)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                AbsErrorHandler.handleError$default(optionsDetailPageTradebarFragment2.getActivityErrorHandler(), (Throwable) ((Either.Right) accountSwitcherRefreshed.getResult()).getValue(), false, 2, null);
                                            }
                                        }
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowCombine.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(OptionsDetailPageTradebarFragment optionsDetailPageTradebarFragment, DayNightOverlay dayNightOverlay) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        TradeBarOverlayView buySellOverlay = optionsDetailPageTradebarFragment.getBinding().buySellOverlay;
        Intrinsics.checkNotNullExpressionValue(buySellOverlay, "buySellOverlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(buySellOverlay), dayNightOverlay, null, 2, null);
        int i2 = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
        if (i2 == 1) {
            i = C20690R.color.mobius_background_3_day;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C20690R.color.mobius_background_3_night;
        }
        optionsDetailPageTradebarFragment.getBinding().tradeBarTopDivider.setBackgroundColor(optionsDetailPageTradebarFragment.getResources().getColor(i, optionsDetailPageTradebarFragment.requireBaseActivity().getTheme()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureTradebar(TradeBarOverlayView tradebar, OptionsDetailPageTradebarViewState state) {
        Object next;
        Either<OptionsDetailPageTradebarViewState.StatState, OptionsAccountSwitcherState> infoState = state != null ? state.getInfoState() : null;
        if (infoState instanceof Either.Left) {
            OptionsDetailPageTradebarViewState.StatState statState = (OptionsDetailPageTradebarViewState.StatState) ((Either.Left) infoState).getValue();
            if (statState != null && statState.getHideStatLabel()) {
                if (statState.getIndexInstrumentId() != null) {
                    tradebar.bindIndexUnderlyingLinkRow(statState.getIndexInstrumentId(), statState.getLinkLabel(), ((Args) INSTANCE.getArgs((Fragment) this)).getAnalyticsSource().toIndexDetailPageSource());
                } else {
                    tradebar.bindEquityUnderlyingLinkRow(statState.getEquityInstrumentId(), statState.getLinkLabel());
                }
            } else {
                if ((statState != null ? statState.getIndexInstrumentId() : null) != null) {
                    tradebar.bindIndexUnderlyingStat(statState.getIndexInstrumentId(), statState.getLabel(), statState.getLinkLabel(), ((Args) INSTANCE.getArgs((Fragment) this)).getAnalyticsSource().toIndexDetailPageSource());
                } else {
                    tradebar.bindEquityUnderlyingStat(statState != null ? statState.getEquityInstrumentId() : null, statState != null ? statState.getLabel() : null, statState != null ? statState.getLinkLabel() : null);
                }
            }
        } else if (!(infoState instanceof Either.Right)) {
            if (infoState != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        } else {
            tradebar.setInfoState(TradeBarOverlayView.InfoState.ACCOUNT_SWITCHER);
            OptionsAccountSwitcherState optionsAccountSwitcherState = (OptionsAccountSwitcherState) ((Either.Right) infoState).getValue();
            if (optionsAccountSwitcherState != null) {
                tradebar.getAccountSwitcherBtn().bind(optionsAccountSwitcherState, this, true);
            }
        }
        Iterator<T> it = state.getActionItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((OptionsDetailPageTradebarViewState.ActionItem) next).getType() == OptionsDetailPageTradebarViewState.ActionType.OPTION_CHAIN) {
                    break;
                }
            }
        }
        if (next == null) {
            EventLogger eventLogger = getEventLogger();
            OptionsTradeBarSource analyticsSource = ((Args) INSTANCE.getArgs((Fragment) this)).getAnalyticsSource();
            String strategyCode = getDuxo().getStateFlow().getValue().getStrategyCode();
            if (strategyCode == null) {
                strategyCode = "";
            }
            OptionsDetailPageTradebarLoggings.logOptionsDetailPageOptionChainMissing(eventLogger, analyticsSource, strategyCode);
        }
        tradebar.setActions(state.getTradebarActions());
        tradebar.setError(configureTradebarError(state.getError()));
        TradeBarOverlayView.refreshPanelVisibility$default(tradebar, false, 1, null);
    }

    private final CharSequence configureTradebarError(final OptionsDetailPageTradebarViewState.TradebarError errorState) {
        if (errorState instanceof OptionsDetailPageTradebarViewState.TradebarError.GoToOpposingPosition) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            OptionsDetailPageTradebarViewState.TradebarError.GoToOpposingPosition goToOpposingPosition = (OptionsDetailPageTradebarViewState.TradebarError.GoToOpposingPosition) errorState;
            return LearnMoresKt.buildTextWithLearnMore$default(resources, goToOpposingPosition.getError(), false, null, false, goToOpposingPosition.getErrorCta(), new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$configureTradebarError$$inlined$buildTextWithLearnMore$default$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Navigator navigator = this.this$0.getNavigator();
                    Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, ((OptionsDetailPageTradebarViewState.TradebarError.GoToOpposingPosition) errorState).getLearnMoreFragmentKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
                }
            }, 1, (DefaultConstructorMarker) null), 4, null);
        }
        if (errorState instanceof OptionsDetailPageTradebarViewState.TradebarError.GoToTradeOnExpirationSettings) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            OptionsDetailPageTradebarViewState.TradebarError.GoToTradeOnExpirationSettings goToTradeOnExpirationSettings = (OptionsDetailPageTradebarViewState.TradebarError.GoToTradeOnExpirationSettings) errorState;
            return LearnMoresKt.buildTextWithLearnMore$default(resources2, goToTradeOnExpirationSettings.getError(), false, null, false, goToTradeOnExpirationSettings.getErrorCta(), new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$configureTradebarError$$inlined$buildTextWithLearnMore$default$2
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                    Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setId(C11453R.id.dialog_id_trade_on_expiration_settings).setTitle(C11453R.string.option_detail_trade_bar_enable_ft_title, new Object[0]).setMessage(C11453R.string.option_detail_trade_bar_enable_ft_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setNegativeButton(C11453R.string.option_detail_trade_bar_enable_ft_cta, new Object[0]);
                    FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, "TAG_FRIDAY_TRADING_EXPIRATION_DIALOG", false, 4, null);
                }
            }, 1, (DefaultConstructorMarker) null), 4, null);
        }
        if (errorState instanceof OptionsDetailPageTradebarViewState.TradebarError.NoCtaError) {
            return ((OptionsDetailPageTradebarViewState.TradebarError.NoCtaError) errorState).getError();
        }
        if (errorState == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3
    public void onAccountSwitcherCtaClicked(AccountSwitcherData args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new AccountSwitcherBottomSheetFragmentKey(args), null, 2, null).show(getChildFragmentManager(), "account-switcher");
    }

    @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3
    public void showSduiAccountSwitcher(SurfaceDto surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new SduiAccountSwitcherBottomSheetFragmentKey(surface), null, 2, null).show(getChildFragmentManager(), "sdui-account-switcher");
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        getDuxo().onAccountSelected(accountNumber);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onRefreshAccountsClicked() {
        getDuxo().refreshAccountSwitcher();
    }

    @Override // com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.Listener
    public void onTradeClicked() {
        getDuxo().onTradeClicked();
    }

    @Override // com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.Listener
    public void onActionClicked(AbstractTradeBarOverlayView.ExpandAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        IntentKey intentKeyOnTradebarActionClicked = getDuxo().onTradebarActionClicked(action);
        if (intentKeyOnTradebarActionClicked != null) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, intentKeyOnTradebarActionClicked, null, false, null, null, 60, null);
        }
        getBinding().buySellOverlay.collapse(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11453R.id.dialog_id_trade_on_expiration_settings) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_OPTIONS_SETTINGS, false, false, false, null, null, null, null, false, 510, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    public final void onTradebarDataFetched(OptionsDetailPageTradebarDataState.DataFetchMode.PassIn data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getDuxo().setData(data);
    }

    public final void passInTradebarSelfFetchData(OptionsDetailPageTradebarDataState.DataFetchMode.SelfFetch data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getDuxo().setData(data);
    }

    /* compiled from: OptionsDetailPageTradebarFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment$Args;", "Landroid/os/Parcelable;", "fixedAccountNumber", "", "analyticsSource", "Lcom/robinhood/android/common/options/tradebar/OptionsTradeBarSource;", "shouldHideErrorBanner", "", "shouldHideStatLabelForSingleAccount", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/common/options/tradebar/OptionsTradeBarSource;ZZ)V", "getFixedAccountNumber", "()Ljava/lang/String;", "getAnalyticsSource", "()Lcom/robinhood/android/common/options/tradebar/OptionsTradeBarSource;", "getShouldHideErrorBanner", "()Z", "getShouldHideStatLabelForSingleAccount", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OptionsTradeBarSource analyticsSource;
        private final String fixedAccountNumber;
        private final boolean shouldHideErrorBanner;
        private final boolean shouldHideStatLabelForSingleAccount;

        /* compiled from: OptionsDetailPageTradebarFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), OptionsTradeBarSource.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, OptionsTradeBarSource optionsTradeBarSource, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.fixedAccountNumber;
            }
            if ((i & 2) != 0) {
                optionsTradeBarSource = args.analyticsSource;
            }
            if ((i & 4) != 0) {
                z = args.shouldHideErrorBanner;
            }
            if ((i & 8) != 0) {
                z2 = args.shouldHideStatLabelForSingleAccount;
            }
            return args.copy(str, optionsTradeBarSource, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFixedAccountNumber() {
            return this.fixedAccountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionsTradeBarSource getAnalyticsSource() {
            return this.analyticsSource;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldHideErrorBanner() {
            return this.shouldHideErrorBanner;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShouldHideStatLabelForSingleAccount() {
            return this.shouldHideStatLabelForSingleAccount;
        }

        public final Args copy(String fixedAccountNumber, OptionsTradeBarSource analyticsSource, boolean shouldHideErrorBanner, boolean shouldHideStatLabelForSingleAccount) {
            Intrinsics.checkNotNullParameter(analyticsSource, "analyticsSource");
            return new Args(fixedAccountNumber, analyticsSource, shouldHideErrorBanner, shouldHideStatLabelForSingleAccount);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.fixedAccountNumber, args.fixedAccountNumber) && this.analyticsSource == args.analyticsSource && this.shouldHideErrorBanner == args.shouldHideErrorBanner && this.shouldHideStatLabelForSingleAccount == args.shouldHideStatLabelForSingleAccount;
        }

        public int hashCode() {
            String str = this.fixedAccountNumber;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + this.analyticsSource.hashCode()) * 31) + Boolean.hashCode(this.shouldHideErrorBanner)) * 31) + Boolean.hashCode(this.shouldHideStatLabelForSingleAccount);
        }

        public String toString() {
            return "Args(fixedAccountNumber=" + this.fixedAccountNumber + ", analyticsSource=" + this.analyticsSource + ", shouldHideErrorBanner=" + this.shouldHideErrorBanner + ", shouldHideStatLabelForSingleAccount=" + this.shouldHideStatLabelForSingleAccount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.fixedAccountNumber);
            dest.writeString(this.analyticsSource.name());
            dest.writeInt(this.shouldHideErrorBanner ? 1 : 0);
            dest.writeInt(this.shouldHideStatLabelForSingleAccount ? 1 : 0);
        }

        public Args(String str, OptionsTradeBarSource analyticsSource, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(analyticsSource, "analyticsSource");
            this.fixedAccountNumber = str;
            this.analyticsSource = analyticsSource;
            this.shouldHideErrorBanner = z;
            this.shouldHideStatLabelForSingleAccount = z2;
        }

        public /* synthetic */ Args(String str, OptionsTradeBarSource optionsTradeBarSource, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, optionsTradeBarSource, z, z2);
        }

        public final String getFixedAccountNumber() {
            return this.fixedAccountNumber;
        }

        public final OptionsTradeBarSource getAnalyticsSource() {
            return this.analyticsSource;
        }

        public final boolean getShouldHideErrorBanner() {
            return this.shouldHideErrorBanner;
        }

        public final boolean getShouldHideStatLabelForSingleAccount() {
            return this.shouldHideStatLabelForSingleAccount;
        }
    }

    /* compiled from: OptionsDetailPageTradebarFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarFragment$Args;", "<init>", "()V", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionsDetailPageTradebarFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionsDetailPageTradebarFragment optionsDetailPageTradebarFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionsDetailPageTradebarFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionsDetailPageTradebarFragment newInstance(Args args) {
            return (OptionsDetailPageTradebarFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionsDetailPageTradebarFragment optionsDetailPageTradebarFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionsDetailPageTradebarFragment, args);
        }
    }
}
