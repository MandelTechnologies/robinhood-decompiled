package com.robinhood.android.trade.equity.p261ui.configuration.trailingstop;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDialog;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.databinding.FragmentTrailingStopBinding;
import com.robinhood.android.trade.equity.p261ui.configuration.OrderTrailTypeDialogFragment;
import com.robinhood.android.trade.equity.p261ui.configuration.price.OrderPriceFragment;
import com.robinhood.android.trade.equity.p261ui.configuration.trailingstop.TrailingStopEvent;
import com.robinhood.android.trade.equity.p261ui.configuration.trailingstop.TrailingStopViewState;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.PriceTextWatcher;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.p408rx.transformer.CharSequenceToBigDecimalTransformer;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: TrailingStopFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0003:;<B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0018\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0014J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u001a\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020/2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u00100\u001a\u00020!H\u0016J\u0015\u00101\u001a\u00020!2\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4J\u0010\u00105\u001a\u00020!2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020!H\u0002J\b\u00109\u001a\u00020!H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/trade/equity/databinding/FragmentTrailingStopBinding;", "getBinding", "()Lcom/robinhood/android/trade/equity/databinding/FragmentTrailingStopBinding;", "binding$delegate", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onViewCreated", "view", "Landroid/view/View;", "onResume", "handleDuxoEvents", "event", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopEvent;", "handleDuxoEvents$feature_trade_equity_externalDebug", "setViewState", "state", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState;", "showTrailingAmountTypeDialog", "showTrailingStopErrorDialog", "Callbacks", "Args", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TrailingStopFragment extends BaseFragment implements AutoLoggableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TrailingStopFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(TrailingStopFragment.class, "binding", "getBinding()Lcom/robinhood/android/trade/equity/databinding/FragmentTrailingStopBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TrailingStopFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopFragment$Callbacks;", "", "onOrderTypeEducationAction", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "taxLots", "", "onOrderTrailAmountValidated", "Lcom/robinhood/models/db/Order$Configuration;", "trailingPeg", "Lcom/robinhood/models/db/OrderTrailingPeg;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onOrderTrailAmountValidated(Order.Configuration configuration, OrderTrailingPeg trailingPeg);

        void onOrderTypeEducationAction(DirectOrder configuration, boolean taxLots);
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public TrailingStopFragment() {
        super(C29365R.layout.fragment_trailing_stop);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = DuxosKt.duxo(this, TrailingStopDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, TrailingStopFragment2.INSTANCE);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.EQUITY_ENTER_TRAIL_AMOUNT_PAGE, null, "TRAILING_STOP", null, 10, null);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrailingStopDuxo getDuxo() {
        return (TrailingStopDuxo) this.duxo.getValue();
    }

    private final FragmentTrailingStopBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTrailingStopBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        String simpleName = OrderPriceFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return "TRAILING_STOP " + ((Args) INSTANCE.getArgs((Fragment) this)).getScreenType().name();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(((Args) INSTANCE.getArgs((Fragment) this)).getShowEducation());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C29365R.menu.menu_order_price, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C29365R.id.action_education) {
            getCallbacks().onOrderTypeEducationAction(((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration(), false);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        getBinding().trailAmountEdt.addTextChangedListener(new PriceTextWatcher());
        RhTextView trailAmountLabelGroup = getBinding().trailAmountLabelGroup;
        Intrinsics.checkNotNullExpressionValue(trailAmountLabelGroup, "trailAmountLabelGroup");
        OnClickListeners.onClick(trailAmountLabelGroup, new C294531(this));
        RdsNumpadContainerView rdsNumpadContainerView = getBinding().numpad;
        rdsNumpadContainerView.useDefaultKeyHandler();
        rdsNumpadContainerView.setOnButtonClick(new TrailingStopFragment3(getDuxo()));
        BaseFragment.collectDuxoState$default(this, null, new C294543(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C294554(null), 1, null);
    }

    /* compiled from: TrailingStopFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment$onViewCreated$1 */
    /* synthetic */ class C294531 extends FunctionReferenceImpl implements Function0<Unit> {
        C294531(Object obj) {
            super(0, obj, TrailingStopFragment.class, "showTrailingAmountTypeDialog", "showTrailingAmountTypeDialog()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((TrailingStopFragment) this.receiver).showTrailingAmountTypeDialog();
        }
    }

    /* compiled from: TrailingStopFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment$onViewCreated$3", m3645f = "TrailingStopFragment.kt", m3646l = {117}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment$onViewCreated$3 */
    static final class C294543 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C294543(Continuation<? super C294543> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrailingStopFragment.this.new C294543(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294543) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TrailingStopFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment$onViewCreated$3$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ TrailingStopFragment $tmp0;

            AnonymousClass1(TrailingStopFragment trailingStopFragment) {
                this.$tmp0 = trailingStopFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, TrailingStopFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(TrailingStopViewState trailingStopViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                Object objInvokeSuspend$setViewState = C294543.invokeSuspend$setViewState(this.$tmp0, trailingStopViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((TrailingStopViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<TrailingStopViewState> stateFlow = TrailingStopFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(TrailingStopFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$setViewState(TrailingStopFragment trailingStopFragment, TrailingStopViewState trailingStopViewState, Continuation continuation) throws Resources.NotFoundException {
            trailingStopFragment.setViewState(trailingStopViewState);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: TrailingStopFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment$onViewCreated$4", m3645f = "TrailingStopFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment$onViewCreated$4 */
    static final class C294554 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C294554(Continuation<? super C294554> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrailingStopFragment.this.new C294554(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294554) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<TrailingStopEvent>> eventFlow = TrailingStopFragment.this.getDuxo().getEventFlow();
                final TrailingStopFragment trailingStopFragment = TrailingStopFragment.this;
                FlowCollector<? super Event<TrailingStopEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment.onViewCreated.4.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<TrailingStopEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<TrailingStopEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<TrailingStopEvent> eventConsumerInvoke;
                        if (event != null) {
                            final TrailingStopFragment trailingStopFragment2 = trailingStopFragment;
                            if ((event.getData() instanceof TrailingStopEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment$onViewCreated$4$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m19291invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19291invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        trailingStopFragment2.handleDuxoEvents$feature_trade_equity_externalDebug((TrailingStopEvent) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RhEditText trailAmountEdt = getBinding().trailAmountEdt;
        Intrinsics.checkNotNullExpressionValue(trailAmountEdt, "trailAmountEdt");
        Observable observableDistinctUntilChanged = RxTextView.textChanges(trailAmountEdt).compose(CharSequenceToBigDecimalTransformer.INSTANCE).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrailingStopFragment.onResume$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(TrailingStopFragment trailingStopFragment, Optional optional) {
        trailingStopFragment.getDuxo().setTrailAmount((BigDecimal) optional.component1());
        return Unit.INSTANCE;
    }

    public final void handleDuxoEvents$feature_trade_equity_externalDebug(TrailingStopEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof TrailingStopEvent.ClearInputEvent) {
            getBinding().trailAmountEdt.setText((CharSequence) null);
            return;
        }
        if (!(event instanceof TrailingStopEvent.ValidationResultEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        TrailingStopViewState.ValidationResult validationResultConsume = ((TrailingStopEvent.ValidationResultEvent) event).getEventContext().consume();
        if (validationResultConsume != null) {
            if (validationResultConsume instanceof TrailingStopViewState.ValidationResult.Success) {
                getCallbacks().onOrderTrailAmountValidated(((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration().getOrderConfiguration(), ((TrailingStopViewState.ValidationResult.Success) validationResultConsume).getTrailingPeg());
            } else {
                if (!Intrinsics.areEqual(validationResultConsume, TrailingStopViewState.ValidationResult.Failure.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                showTrailingStopErrorDialog();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(TrailingStopViewState state) throws Resources.NotFoundException {
        TrailingStopViewState.ValidationResult validationResultConsume;
        UiEvent<Unit> clearInputEvent = state.getClearInputEvent();
        CharSequence text = null;
        if ((clearInputEvent != null ? clearInputEvent.consume() : null) != null) {
            getBinding().trailAmountEdt.setText((CharSequence) null);
        }
        getBinding().trailAmountEdt.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(state.getAmountMaxLength())});
        final MarketDataDisclosureDialog.Args marketDataDisclosureDialogArgs = state.getMarketDataDisclosureDialogArgs();
        if (marketDataDisclosureDialogArgs != null) {
            LinearLayout currentPriceGroup = getBinding().currentPriceGroup;
            Intrinsics.checkNotNullExpressionValue(currentPriceGroup, "currentPriceGroup");
            OnClickListeners.onClick(currentPriceGroup, new Function0() { // from class: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TrailingStopFragment.setViewState$lambda$4$lambda$3(marketDataDisclosureDialogArgs, this);
                }
            });
        } else {
            getBinding().currentPriceGroup.setOnClickListener(null);
        }
        UiEvent<TrailingStopViewState.ValidationResult> validationResult = state.getValidationResult();
        if (validationResult != null && (validationResultConsume = validationResult.consume()) != null) {
            if (validationResultConsume instanceof TrailingStopViewState.ValidationResult.Success) {
                getCallbacks().onOrderTrailAmountValidated(((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration().getOrderConfiguration(), ((TrailingStopViewState.ValidationResult.Success) validationResultConsume).getTrailingPeg());
            } else {
                if (!Intrinsics.areEqual(validationResultConsume, TrailingStopViewState.ValidationResult.Failure.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                showTrailingStopErrorDialog();
            }
        }
        RhTextView trailAmountDollarPrefix = getBinding().trailAmountDollarPrefix;
        Intrinsics.checkNotNullExpressionValue(trailAmountDollarPrefix, "trailAmountDollarPrefix");
        trailAmountDollarPrefix.setVisibility(state.getTrailAmountDollarPrefixVisible() ? 0 : 8);
        RhTextView trailAmountPercentagePostfix = getBinding().trailAmountPercentagePostfix;
        Intrinsics.checkNotNullExpressionValue(trailAmountPercentagePostfix, "trailAmountPercentagePostfix");
        trailAmountPercentagePostfix.setVisibility(state.getTrailAmountPercentagePostfixVisible() ? 0 : 8);
        RhTextView rhTextView = getBinding().trailAmountLabelGroup;
        StringResource trailAmountLabel = state.getTrailAmountLabel();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(trailAmountLabel.getText(resources));
        String instrumentSymbol = state.getInstrumentSymbol();
        if (instrumentSymbol != null) {
            getBinding().orderPricePromptTxt.setText(getString(((Args) INSTANCE.getArgs((Fragment) this)).getScreenType().getPromptRes(), instrumentSymbol));
        }
        getBinding().currentPriceValueTxt.setText(state.getLastTradePrice());
        RhTextView rhTextView2 = getBinding().priceDisplayTxt;
        StringResource priceDisplayText = state.getPriceDisplayText();
        if (priceDisplayText != null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text = priceDisplayText.getText(resources2);
        }
        rhTextView2.setText(text);
        getBinding().numpad.setDelimiterEnabled(state.getNumpadDelimiterEnabled());
        getBinding().numpad.setButtonEnabled(state.getIsContinueButtonEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$4$lambda$3(MarketDataDisclosureDialog.Args args, TrailingStopFragment trailingStopFragment) {
        MarketDataDisclosureDialog marketDataDisclosureDialog = (MarketDataDisclosureDialog) MarketDataDisclosureDialog.INSTANCE.newInstance((Parcelable) args);
        FragmentManager parentFragmentManager = trailingStopFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        marketDataDisclosureDialog.show(parentFragmentManager, "market-data-disclosures");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTrailingAmountTypeDialog() {
        getParentFragmentManager().setFragmentResultListener(OrderTrailTypeDialogFragment.TRAIL_TYPE_REQUEST_KEY, this, new FragmentResultListener() { // from class: com.robinhood.android.trade.equity.ui.configuration.trailingstop.TrailingStopFragment.showTrailingAmountTypeDialog.1
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                OrderTrailingPeg.TrailingPegType trailingPegTypeFromServerValue;
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                String string2 = bundle.getString(OrderTrailTypeDialogFragment.TRAIL_TYPE_REQUEST_KEY);
                if (string2 == null || (trailingPegTypeFromServerValue = OrderTrailingPeg.TrailingPegType.INSTANCE.fromServerValue(string2)) == null) {
                    return;
                }
                TrailingStopFragment.this.getDuxo().setTrailType(trailingPegTypeFromServerValue);
            }
        });
        ((OrderTrailTypeDialogFragment) DialogFragmentWithArgsCompanion.DefaultImpls.newInstance$default(OrderTrailTypeDialogFragment.INSTANCE, new OrderTrailTypeDialogFragment.Args(((Args) INSTANCE.getArgs((Fragment) this)).getScreenType().getSide()), 0, 2, null)).show(getParentFragmentManager(), "trailAmountType");
    }

    private final void showTrailingStopErrorDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTitle(C20649R.string.order_create_trailing_stop_price_below_zero_dialog_title, new Object[0]).setMessage(C20649R.string.order_create_trailing_stop_price_below_zero_dialog_body, new Object[0]).setPositiveButton(C20649R.string.order_create_trailing_stop_price_below_zero_action, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "aggressive-stop-price", false, 4, null);
    }

    /* compiled from: TrailingStopFragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopFragment$Args;", "Landroid/os/Parcelable;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "screenType", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopScreenType;", "instrumentId", "Ljava/util/UUID;", "showEducation", "", "<init>", "(Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopScreenType;Ljava/util/UUID;Z)V", "getConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "getScreenType", "()Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopScreenType;", "getInstrumentId", "()Ljava/util/UUID;", "getShowEducation", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DirectOrder configuration;
        private final UUID instrumentId;
        private final TrailingStopScreenType screenType;
        private final boolean showEducation;

        /* compiled from: TrailingStopFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((DirectOrder) parcel.readParcelable(Args.class.getClassLoader()), TrailingStopScreenType.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, DirectOrder directOrder, TrailingStopScreenType trailingStopScreenType, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                directOrder = args.configuration;
            }
            if ((i & 2) != 0) {
                trailingStopScreenType = args.screenType;
            }
            if ((i & 4) != 0) {
                uuid = args.instrumentId;
            }
            if ((i & 8) != 0) {
                z = args.showEducation;
            }
            return args.copy(directOrder, trailingStopScreenType, uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final DirectOrder getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component2, reason: from getter */
        public final TrailingStopScreenType getScreenType() {
            return this.screenType;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowEducation() {
            return this.showEducation;
        }

        public final Args copy(DirectOrder configuration, TrailingStopScreenType screenType, UUID instrumentId, boolean showEducation) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Args(configuration, screenType, instrumentId, showEducation);
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
            return Intrinsics.areEqual(this.configuration, args.configuration) && this.screenType == args.screenType && Intrinsics.areEqual(this.instrumentId, args.instrumentId) && this.showEducation == args.showEducation;
        }

        public int hashCode() {
            return (((((this.configuration.hashCode() * 31) + this.screenType.hashCode()) * 31) + this.instrumentId.hashCode()) * 31) + Boolean.hashCode(this.showEducation);
        }

        public String toString() {
            return "Args(configuration=" + this.configuration + ", screenType=" + this.screenType + ", instrumentId=" + this.instrumentId + ", showEducation=" + this.showEducation + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.configuration, flags);
            dest.writeString(this.screenType.name());
            dest.writeSerializable(this.instrumentId);
            dest.writeInt(this.showEducation ? 1 : 0);
        }

        public Args(DirectOrder configuration, TrailingStopScreenType screenType, UUID instrumentId, boolean z) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(screenType, "screenType");
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.configuration = configuration;
            this.screenType = screenType;
            this.instrumentId = instrumentId;
            this.showEducation = z;
        }

        public final DirectOrder getConfiguration() {
            return this.configuration;
        }

        public final TrailingStopScreenType getScreenType() {
            return this.screenType;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final boolean getShowEducation() {
            return this.showEducation;
        }
    }

    /* compiled from: TrailingStopFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopFragment;", "Lcom/robinhood/android/trade/equity/ui/configuration/trailingstop/TrailingStopFragment$Args;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<TrailingStopFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(TrailingStopFragment trailingStopFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, trailingStopFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TrailingStopFragment newInstance(Args args) {
            return (TrailingStopFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TrailingStopFragment trailingStopFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, trailingStopFragment, args);
        }
    }
}
