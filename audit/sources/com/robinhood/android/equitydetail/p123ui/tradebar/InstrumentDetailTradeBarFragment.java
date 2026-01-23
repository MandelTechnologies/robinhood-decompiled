package com.robinhood.android.equitydetail.p123ui.tradebar;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.AbstractTradeBarOverlayView;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.equities.ladderftux.EquityTradeLadderFtuxManager;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.FragmentInstrumentDetailTradeBarBinding;
import com.robinhood.android.equitydetail.p123ui.analystreports.AnalystReportHint;
import com.robinhood.android.equitydetail.p123ui.analystreports.AnalystReportHintDuxo;
import com.robinhood.android.equitydetail.p123ui.analystreports.AnalystReportHintState;
import com.robinhood.android.equitydetail.p123ui.tradebar.InstrumentDetailTradeBarViewState3;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks2;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.lib.trade.view.TradeBarOverlayView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.SduiAccountSwitcherBottomSheetFragmentKey;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import dispatch.core.Flow7;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: InstrumentDetailTradeBarFragment.kt */
@Metadata(m3635d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003^_`B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u001a\u00106\u001a\u0002032\u0006\u00107\u001a\u0002082\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00109\u001a\u000203H\u0016J\b\u0010:\u001a\u000203H\u0016J\u0010\u0010;\u001a\u0002032\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u0002032\u0006\u0010<\u001a\u00020?H\u0002J\u000e\u0010@\u001a\u0002032\u0006\u0010A\u001a\u00020BJ\u0006\u0010C\u001a\u000203J\u000e\u0010D\u001a\u0002032\u0006\u0010E\u001a\u00020FJ\u000e\u0010G\u001a\u0002032\u0006\u0010H\u001a\u00020IJ\f\u0010J\u001a\b\u0012\u0004\u0012\u00020'0KJ\b\u0010L\u001a\u000203H\u0016J\u0010\u0010M\u001a\u0002032\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010M\u001a\u00020.2\u0006\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u0002032\u0006\u0010S\u001a\u00020TH\u0016J\u0010\u0010U\u001a\u0002032\u0006\u0010V\u001a\u00020WH\u0016J\u0018\u0010X\u001a\u0002032\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\H\u0016J\b\u0010]\u001a\u000203H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b\"\u0010#R\u001c\u0010%\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010'0'0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0082\u0004¢\u0006\u0004\n\u0002\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u00020.X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006a"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$Listener;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCombinedCallbacks;", "<init>", "()V", "equityLadderFtuxManager", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;", "getEquityLadderFtuxManager", "()Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;", "setEquityLadderFtuxManager", "(Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;)V", "analystReportHintText", "Landroid/widget/TextView;", "duxo", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarDuxo;", "getDuxo", "()Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/equitydetail/databinding/FragmentInstrumentDetailTradeBarBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/FragmentInstrumentDetailTradeBarBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment$Callbacks;", "callbacks$delegate", "analystReportHintDuxo", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintDuxo;", "getAnalystReportHintDuxo", "()Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintDuxo;", "analystReportHintDuxo$delegate", "footerHeightRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "kotlin.jvm.PlatformType", "actionItems", "", "Lcom/robinhood/android/equitydetail/ui/tradebar/ActionItem;", "[Lcom/robinhood/android/equitydetail/ui/tradebar/ActionItem;", "collapseOnRestart", "", "excludeFromAnalyticsLogging", "getExcludeFromAnalyticsLogging", "()Z", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onResume", "setState", "state", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;", "setAnalystReportHintState", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintState;", "bindInstrument", "instrument", "Lcom/robinhood/models/db/Instrument;", "disallowAnalystReportHint", "setDisplayType", "displayType", "Lcom/robinhood/android/equitydetail/ui/tradebar/DisplayType;", "setAnalyticsData", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/equitydetail/ui/tradebar/AnalyticsData;", "footerHeight", "Lio/reactivex/Observable;", "onTradeClicked", "onActionClicked", "action", "Lcom/robinhood/android/common/ui/view/AbstractTradeBarOverlayView$ExpandAction;", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "showSduiAccountSwitcher", "surface", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "onAccountSwitcherCtaClicked", "args", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "onAccountSelected", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onRefreshAccountsClicked", "Callbacks", "Args", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentDetailTradeBarFragment extends BaseFragment implements AbstractTradeBarOverlayView.Listener, ClientComponentButtonView.Callbacks, AccountSwitcherCallbacks2 {
    private static final String SAVE_COLLAPSE_ON_RESTART = "saveCollapseOnRestart";
    private final ActionItem[] actionItems;

    /* renamed from: analystReportHintDuxo$delegate, reason: from kotlin metadata */
    private final Lazy analystReportHintDuxo;
    private TextView analystReportHintText;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private boolean collapseOnRestart;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EquityTradeLadderFtuxManager equityLadderFtuxManager;
    private final boolean excludeFromAnalyticsLogging;
    private final BehaviorRelay<Integer> footerHeightRelay;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InstrumentDetailTradeBarFragment.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/FragmentInstrumentDetailTradeBarBinding;", 0)), Reflection.property1(new PropertyReference1Impl(InstrumentDetailTradeBarFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAllAccountsSelected() {
        AccountSwitcherCallbacks2.DefaultImpls.onAllAccountsSelected(this);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onPendingApplicationClicked(String str, BrokerageAccountType brokerageAccountType) {
        AccountSwitcherCallbacks2.DefaultImpls.onPendingApplicationClicked(this, str, brokerageAccountType);
    }

    public InstrumentDetailTradeBarFragment() {
        super(C15314R.layout.fragment_instrument_detail_trade_bar);
        this.duxo = DuxosKt.duxo(this, InstrumentDetailTradeBarDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, InstrumentDetailTradeBarFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.analystReportHintDuxo = OldDuxos.oldDuxo(this, AnalystReportHintDuxo.class);
        BehaviorRelay<Integer> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.footerHeightRelay = behaviorRelayCreate;
        this.actionItems = ActionItem.values();
        this.excludeFromAnalyticsLogging = true;
    }

    /* compiled from: InstrumentDetailTradeBarFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment$Callbacks;", "", "onInitiateOrder", "", "instrumentId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "accountNumber", "", "onAnalystReportHintClicked", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAnalystReportHintClicked();

        void onInitiateOrder(UUID instrumentId, EquityOrderSide side, String accountNumber);

        /* compiled from: InstrumentDetailTradeBarFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onInitiateOrder$default(Callbacks callbacks, UUID uuid, EquityOrderSide equityOrderSide, String str, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onInitiateOrder");
                }
                if ((i & 4) != 0) {
                    str = null;
                }
                callbacks.onInitiateOrder(uuid, equityOrderSide, str);
            }
        }
    }

    public final EquityTradeLadderFtuxManager getEquityLadderFtuxManager() {
        EquityTradeLadderFtuxManager equityTradeLadderFtuxManager = this.equityLadderFtuxManager;
        if (equityTradeLadderFtuxManager != null) {
            return equityTradeLadderFtuxManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("equityLadderFtuxManager");
        return null;
    }

    public final void setEquityLadderFtuxManager(EquityTradeLadderFtuxManager equityTradeLadderFtuxManager) {
        Intrinsics.checkNotNullParameter(equityTradeLadderFtuxManager, "<set-?>");
        this.equityLadderFtuxManager = equityTradeLadderFtuxManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InstrumentDetailTradeBarDuxo getDuxo() {
        return (InstrumentDetailTradeBarDuxo) this.duxo.getValue();
    }

    private final FragmentInstrumentDetailTradeBarBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInstrumentDetailTradeBarBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final AnalystReportHintDuxo getAnalystReportHintDuxo() {
        return (AnalystReportHintDuxo) this.analystReportHintDuxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getDuxo().setAccountNumber(((Args) INSTANCE.getArgs((Fragment) this)).getAccountNumber());
        }
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C156361(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C156372(null));
        getEquityLadderFtuxManager().prefetchFirstLottie(getContext(), DayNightChanges.isDay(getScarletManager()));
    }

    /* compiled from: InstrumentDetailTradeBarFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$onCreate$1", m3645f = "InstrumentDetailTradeBarFragment.kt", m3646l = {89}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$onCreate$1 */
    static final class C156361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C156361(Continuation<? super C156361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailTradeBarFragment.this.new C156361(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFlowOnMain = Flow7.flowOnMain(InstrumentDetailTradeBarFragment.this.getDuxo().getStateFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InstrumentDetailTradeBarFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFlowOnMain, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: InstrumentDetailTradeBarFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$onCreate$1$1", m3645f = "InstrumentDetailTradeBarFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InstrumentDetailTradeBarFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailTradeBarFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.setState((InstrumentDetailTradeBarViewState) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: InstrumentDetailTradeBarFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$onCreate$2", m3645f = "InstrumentDetailTradeBarFragment.kt", m3646l = {98}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$onCreate$2 */
    static final class C156372 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C156372(Continuation<? super C156372> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailTradeBarFragment.this.new C156372(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156372) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<InstrumentDetailTradeBarViewState> stateFlow = InstrumentDetailTradeBarFragment.this.getDuxo().getStateFlow();
                Flow flowFlowOnMain = Flow7.flowOnMain(FlowKt.take(new Flow<InstrumentDetailTradeBarViewState>() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$onCreate$2$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$onCreate$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$onCreate$2$invokeSuspend$$inlined$filter$1$2", m3645f = "InstrumentDetailTradeBarFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$onCreate$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
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
                                if (((InstrumentDetailTradeBarViewState) obj).getBuySellPositionsAvailable()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super InstrumentDetailTradeBarViewState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, 1));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFlowOnMain, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: InstrumentDetailTradeBarFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$onCreate$2$2", m3645f = "InstrumentDetailTradeBarFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
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
            public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((InstrumentDetailTradeBarViewState) this.L$0).getSellEnabled()) {
                    IdlingResourceCounters2.setBusy(IdlingResourceType.EQUITY_TRADE_BUTTON_VISIBLE, true);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.analystReportHintText = (TextView) ViewCompat.requireViewById(getBinding().buySellOverlay, C15314R.id.analyst_report_hint_text);
        boolean z = false;
        if (savedInstanceState != null && savedInstanceState.getBoolean(SAVE_COLLAPSE_ON_RESTART)) {
            z = true;
        }
        this.collapseOnRestart = z;
        getBinding().buySellOverlay.setListener(this);
        getBinding().buySellOverlay.setServerDrivenTradeButtonCallbacks(this);
        if (((Args) INSTANCE.getArgs((Fragment) this)).getHideTopShadow()) {
            getBinding().buySellOverlay.hideTradeTxtShadow();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, getBinding().buySellOverlay.footerHeight(), (LifecycleEvent) null, 1, (Object) null), this.footerHeightRelay, null, null, 6, null);
        if (this.collapseOnRestart) {
            getBinding().buySellOverlay.collapse(false);
            this.collapseOnRestart = false;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getAnalystReportHintDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C156381(this));
    }

    /* compiled from: InstrumentDetailTradeBarFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$onResume$1 */
    /* synthetic */ class C156381 extends FunctionReferenceImpl implements Function1<AnalystReportHintState, Unit> {
        C156381(Object obj) {
            super(1, obj, InstrumentDetailTradeBarFragment.class, "setAnalystReportHintState", "setAnalystReportHintState(Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnalystReportHintState analystReportHintState) {
            invoke2(analystReportHintState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AnalystReportHintState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InstrumentDetailTradeBarFragment) this.receiver).setAnalystReportHintState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(InstrumentDetailTradeBarViewState state) {
        String strConsume;
        IntentKey intentKeyConsume;
        IntentKey intentKeyConsume2;
        EquityOrderSide equityOrderSideConsume;
        Instrument instrument;
        UUID id;
        Account account;
        String accountNumber;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        InstrumentDetailTradeBarViewState3 data = state.getData(contextRequireContext);
        TradeBarOverlayView tradeBarOverlayView = getBinding().buySellOverlay;
        if (state.getShouldShowAccountSwitcher()) {
            tradeBarOverlayView.setInfoState(TradeBarOverlayView.InfoState.ACCOUNT_SWITCHER);
        } else {
            TradeBarOverlayView.InfoState infoState = TradeBarOverlayView.InfoState.STATS;
        }
        InstrumentAccountSwitcherState accountSwitcherState = state.getAccountSwitcherState();
        if (accountSwitcherState != null) {
            tradeBarOverlayView.getAccountSwitcherBtn().bind(accountSwitcherState, this, true);
        }
        tradeBarOverlayView.setLabelText(data.getTitle());
        tradeBarOverlayView.setValueText(data.getSubtitle());
        tradeBarOverlayView.startTransition();
        if (data instanceof InstrumentDetailTradeBarViewState3.ServerDriven) {
            tradeBarOverlayView.bindServerDrivenTradeButton(((InstrumentDetailTradeBarViewState3.ServerDriven) data).getTradeButton());
        } else {
            if (!(data instanceof InstrumentDetailTradeBarViewState3.ClientDriven)) {
                throw new NoWhenBranchMatchedException();
            }
            InstrumentDetailTradeBarViewState3.ClientDriven clientDriven = (InstrumentDetailTradeBarViewState3.ClientDriven) data;
            tradeBarOverlayView.setError(clientDriven.getErrorMessage());
            tradeBarOverlayView.setActions(clientDriven.getExpandActions());
            TradeBarOverlayView.refreshPanelVisibility$default(tradeBarOverlayView, false, 1, null);
            tradeBarOverlayView.setAreDisabledActionsRemovable(true);
            tradeBarOverlayView.setServerDrivenTradeBarVisible(false);
        }
        getDuxo().logTradeBarLoaded();
        UiEvent<EquityOrderSide> initiateOrderEvent = state.getInitiateOrderEvent();
        if (initiateOrderEvent != null && (equityOrderSideConsume = initiateOrderEvent.consume()) != null && (instrument = state.getInstrument()) != null && (id = instrument.getId()) != null && (account = state.getAccount()) != null && (accountNumber = account.getAccountNumber()) != null) {
            getCallbacks().onInitiateOrder(id, equityOrderSideConsume, accountNumber);
            this.collapseOnRestart = true;
        }
        UiEvent<IntentKey> optionsActionIntentEvent = state.getOptionsActionIntentEvent();
        if (optionsActionIntentEvent != null && (intentKeyConsume2 = optionsActionIntentEvent.consume()) != null) {
            Navigator navigator = getNavigator();
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext2, intentKeyConsume2, null, false, null, null, 60, null);
            this.collapseOnRestart = true;
        }
        UiEvent<IntentKey> ladderActionIntentEvent = state.getLadderActionIntentEvent();
        if (ladderActionIntentEvent != null && (intentKeyConsume = ladderActionIntentEvent.consume()) != null) {
            Navigator navigator2 = getNavigator();
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext3, intentKeyConsume, null, false, null, null, 60, null);
            this.collapseOnRestart = true;
        }
        UiEvent<String> showSubzeroFtuxEvent = state.getShowSubzeroFtuxEvent();
        if (showSubzeroFtuxEvent != null && (strConsume = showSubzeroFtuxEvent.consume()) != null) {
            Navigator navigator3 = getNavigator();
            Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator3, contextRequireContext4, Uri.parse(strConsume), null, null, false, null, 60, null);
            this.collapseOnRestart = true;
        }
        UiEvent<Either<AccountSwitcherData, Throwable>> accountSwitcherRefreshedEvent = state.getAccountSwitcherRefreshedEvent();
        Either<AccountSwitcherData, Throwable> eitherConsume = accountSwitcherRefreshedEvent != null ? accountSwitcherRefreshedEvent.consume() : null;
        if (eitherConsume instanceof Either.Left) {
            onAccountSwitcherCtaClicked((AccountSwitcherData) ((Either.Left) eitherConsume).getValue());
        } else if (eitherConsume instanceof Either.Right) {
            AbsErrorHandler.handleError$default(getActivityErrorHandler(), (Throwable) ((Either.Right) eitherConsume).getValue(), false, 2, null);
        } else if (eitherConsume != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnalystReportHintState(AnalystReportHintState state) {
        UiEvent<AnalystReportHint> showEvent = state.getShowEvent();
        if ((showEvent != null ? showEvent.consume() : null) != null) {
            TextView textView = this.analystReportHintText;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("analystReportHintText");
                textView = null;
            }
            textView.setText(C15314R.string.instrument_detail_research_report_new_hint);
            TextView textView2 = this.analystReportHintText;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("analystReportHintText");
                textView2 = null;
            }
            OnClickListeners.onClick(textView2, new Function0() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InstrumentDetailTradeBarFragment.setAnalystReportHintState$lambda$6(this.f$0);
                }
            });
            getBinding().buySellOverlay.showHintContainer();
        }
        UiEvent<Unit> hideEvent = state.getHideEvent();
        if ((hideEvent != null ? hideEvent.consume() : null) != null) {
            getBinding().buySellOverlay.hideHintContainer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAnalystReportHintState$lambda$6(InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment) {
        instrumentDetailTradeBarFragment.getAnalystReportHintDuxo().hintClicked();
        instrumentDetailTradeBarFragment.getCallbacks().onAnalystReportHintClicked();
        return Unit.INSTANCE;
    }

    public final void bindInstrument(Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        getDuxo().setInstrument(instrument);
        getAnalystReportHintDuxo().setInstrumentId(instrument.getId());
    }

    public final void disallowAnalystReportHint() {
        getAnalystReportHintDuxo().forceHideHint();
    }

    public final void setDisplayType(DisplayType displayType) {
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        getDuxo().setDisplayType(displayType);
    }

    public final void setAnalyticsData(AnalyticsData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getDuxo().setAnalyticsData(data);
    }

    public final Observable<Integer> footerHeight() {
        Observable<Integer> observableDistinctUntilChanged = this.footerHeightRelay.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    @Override // com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.Listener
    public void onTradeClicked() {
        getDuxo().onClientDrivenTradeButtonClicked();
    }

    @Override // com.robinhood.android.common.ui.view.AbstractTradeBarOverlayView.Listener
    public void onActionClicked(AbstractTradeBarOverlayView.ExpandAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AbstractTradeBarOverlayView.ExpandAction.LegacyExpandAction) {
            getDuxo().onExpandedActionClick(this.actionItems[((AbstractTradeBarOverlayView.ExpandAction.LegacyExpandAction) action).getId()]);
            return;
        }
        if (!(action instanceof AbstractTradeBarOverlayView.ExpandAction.DeeplinkExpandAction)) {
            throw new NoWhenBranchMatchedException();
        }
        getBinding().buySellOverlay.collapse(true);
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, ((AbstractTradeBarOverlayView.ExpandAction.DeeplinkExpandAction) action).getUri(), null, null, false, null, 60, null);
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        GenericAction typedAction = button.getTypedAction();
        GenericAction.DeeplinkAction deeplinkAction = typedAction instanceof GenericAction.DeeplinkAction ? (GenericAction.DeeplinkAction) typedAction : null;
        if (deeplinkAction == null) {
            return false;
        }
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, deeplinkAction.getUri(), null, null, false, null, 60, null);
    }

    @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3
    public void showSduiAccountSwitcher(SurfaceDto surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new SduiAccountSwitcherBottomSheetFragmentKey(surface), null, 2, null).show(getChildFragmentManager(), "sdui-account-switcher");
    }

    @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3
    public void onAccountSwitcherCtaClicked(AccountSwitcherData args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new AccountSwitcherBottomSheetFragmentKey(args), null, 2, null).show(getChildFragmentManager(), "account-switcher");
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        getDuxo().setAccountNumber(accountNumber);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onRefreshAccountsClicked() {
        getDuxo().refreshAccountSwitcher();
    }

    /* compiled from: InstrumentDetailTradeBarFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "hideTopShadow", "", "<init>", "(Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getHideTopShadow", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean hideTopShadow;

        /* compiled from: InstrumentDetailTradeBarFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                z = args.hideTopShadow;
            }
            return args.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHideTopShadow() {
            return this.hideTopShadow;
        }

        public final Args copy(String accountNumber, boolean hideTopShadow) {
            return new Args(accountNumber, hideTopShadow);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && this.hideTopShadow == args.hideTopShadow;
        }

        public int hashCode() {
            String str = this.accountNumber;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.hideTopShadow);
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", hideTopShadow=" + this.hideTopShadow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeInt(this.hideTopShadow ? 1 : 0);
        }

        public Args(String str, boolean z) {
            this.accountNumber = str;
            this.hideTopShadow = z;
        }

        public /* synthetic */ Args(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean getHideTopShadow() {
            return this.hideTopShadow;
        }
    }

    /* compiled from: InstrumentDetailTradeBarFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment;", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment$Args;", "<init>", "()V", "SAVE_COLLAPSE_ON_RESTART", "", "newInstance", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InstrumentDetailTradeBarFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, instrumentDetailTradeBarFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InstrumentDetailTradeBarFragment newInstance(Args args) {
            return (InstrumentDetailTradeBarFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, instrumentDetailTradeBarFragment, args);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final InstrumentDetailTradeBarFragment newInstance() {
            return (InstrumentDetailTradeBarFragment) newInstance((Parcelable) new Args(null, false, 2, 0 == true ? 1 : 0));
        }
    }
}
