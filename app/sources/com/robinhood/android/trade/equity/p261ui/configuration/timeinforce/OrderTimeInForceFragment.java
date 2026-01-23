package com.robinhood.android.trade.equity.p261ui.configuration.timeinforce;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewGroup2;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.databinding.FragmentOrderTimeInForceBinding;
import com.robinhood.android.trade.equity.p261ui.configuration.toolbar.OrderConfigurationToolbar;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.Iterator;
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
import kotlin.jvm.functions.Function0;
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
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OrderTimeInForceFragment.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u0002:\u0003234B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020-H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/trade/equity/databinding/FragmentOrderTimeInForceBinding;", "getBinding", "()Lcom/robinhood/android/trade/equity/databinding/FragmentOrderTimeInForceBinding;", "binding$delegate", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onTimeInForceSelected", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "setViewState", "viewState", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceViewState;", "setDefaultTimeInForce", "Callbacks", "Args", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderTimeInForceFragment extends BaseFragment implements AutoLoggableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderTimeInForceFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(OrderTimeInForceFragment.class, "binding", "getBinding()Lcom/robinhood/android/trade/equity/databinding/FragmentOrderTimeInForceBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OrderTimeInForceFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceFragment$Callbacks;", "", "onTimeInForceClicked", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onTimeInForceClicked(Order.Configuration configuration, OrderTimeInForce timeInForce);
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

    public OrderTimeInForceFragment() {
        super(C29365R.layout.fragment_order_time_in_force);
        this.duxo = DuxosKt.duxo(this, OrderTimeInForceDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.binding = ViewBinding5.viewBinding(this, OrderTimeInForceFragment2.INSTANCE);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.EQUITY_SET_TIME_IN_FORCE_PAGE;
        Companion companion = INSTANCE;
        return new Screen(name, ((Args) companion.getArgs((Fragment) this)).getFlowSource().getLoggingValue(), ((Args) companion.getArgs((Fragment) this)).getConfiguration().name(), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderTimeInForceDuxo getDuxo() {
        return (OrderTimeInForceDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentOrderTimeInForceBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOrderTimeInForceBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof Callbacks) {
            return;
        }
        throw new IllegalArgumentException((parentFragment + " must implement " + Callbacks.class.getName()).toString());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        OrderConfigurationToolbar.INSTANCE.configureToolbar(toolbar, new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTimeInForceFragment.configureToolbar$lambda$1(this.f$0, (TextView) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$1(final OrderTimeInForceFragment orderTimeInForceFragment, final TextView titleText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        LifecycleHost.DefaultImpls.bind$default(orderTimeInForceFragment, ObservablesAndroid.observeOnMainThread(orderTimeInForceFragment.asObservable(orderTimeInForceFragment.getDuxo().getStateFlow())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTimeInForceFragment.configureToolbar$lambda$1$lambda$0(titleText, orderTimeInForceFragment, (OrderTimeInForceViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$1$lambda$0(TextView textView, OrderTimeInForceFragment orderTimeInForceFragment, OrderTimeInForceViewState state) throws Resources.NotFoundException {
        CharSequence text;
        Intrinsics.checkNotNullParameter(state, "state");
        StringResource toolbarTitle = state.getToolbarTitle();
        if (toolbarTitle != null) {
            Resources resources = orderTimeInForceFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = toolbarTitle.getText(resources);
        } else {
            text = null;
        }
        TextViewsKt.setVisibilityText(textView, text);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C29365R.layout.fragment_order_time_in_force, container, false);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LinearLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C294481(null), 1, null);
        final FragmentOrderTimeInForceBinding binding = getBinding();
        binding.radioGroup.onCheckedChange(new Function2() { // from class: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderTimeInForceFragment.onViewCreated$lambda$3$lambda$2(binding, this, (NewRdsRadioGroup) obj, ((Integer) obj2).intValue());
            }
        });
        binding.gfdRow.setTag(OrderTimeInForce.GFD);
        binding.gtcRow.setTag(OrderTimeInForce.GTC);
    }

    /* compiled from: OrderTimeInForceFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceFragment$onViewCreated$1", m3645f = "OrderTimeInForceFragment.kt", m3646l = {87}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceFragment$onViewCreated$1 */
    static final class C294481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C294481(Continuation<? super C294481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderTimeInForceFragment.this.new C294481(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OrderTimeInForceFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ OrderTimeInForceFragment $tmp0;

            AnonymousClass1(OrderTimeInForceFragment orderTimeInForceFragment) {
                this.$tmp0 = orderTimeInForceFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, OrderTimeInForceFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(OrderTimeInForceViewState orderTimeInForceViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                Object objInvokeSuspend$setViewState = C294481.invokeSuspend$setViewState(this.$tmp0, orderTimeInForceViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((OrderTimeInForceViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setViewState(OrderTimeInForceFragment orderTimeInForceFragment, OrderTimeInForceViewState orderTimeInForceViewState, Continuation continuation) throws Resources.NotFoundException {
            orderTimeInForceFragment.setViewState(orderTimeInForceViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<OrderTimeInForceViewState> stateFlow = OrderTimeInForceFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OrderTimeInForceFragment.this);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(FragmentOrderTimeInForceBinding fragmentOrderTimeInForceBinding, OrderTimeInForceFragment orderTimeInForceFragment, NewRdsRadioGroup newRdsRadioGroup, int i) {
        Intrinsics.checkNotNullParameter(newRdsRadioGroup, "<unused var>");
        Object tag = ((RdsRadioButtonRowView) fragmentOrderTimeInForceBinding.radioGroup.findViewById(i)).getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.robinhood.models.db.OrderTimeInForce");
        OrderTimeInForce orderTimeInForce = (OrderTimeInForce) tag;
        orderTimeInForceFragment.getDuxo().selectTimeInForce(orderTimeInForce);
        orderTimeInForceFragment.getDuxo().saveDefaultTimeInForce(orderTimeInForce);
        return Unit.INSTANCE;
    }

    private final void onTimeInForceSelected(OrderTimeInForce timeInForce) {
        getCallbacks().onTimeInForceClicked(((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration(), timeInForce);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final OrderTimeInForceViewState viewState) throws Resources.NotFoundException {
        CharSequence text;
        CharSequence text2;
        CharSequence text3;
        OrderTimeInForce orderTimeInForceConsume;
        FragmentOrderTimeInForceBinding binding = getBinding();
        RhTextView rhTextView = binding.detailTxt;
        StringResource timeInForceDetail = viewState.getTimeInForceDetail();
        CharSequence text4 = null;
        if (timeInForceDetail != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = timeInForceDetail.getText(resources);
        } else {
            text = null;
        }
        rhTextView.setText(text);
        RdsRadioButtonRowView rdsRadioButtonRowView = binding.gfdRow;
        StringResource goodForDayTitle = viewState.getGoodForDayTitle();
        if (goodForDayTitle != null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text2 = goodForDayTitle.getText(resources2);
        } else {
            text2 = null;
        }
        rdsRadioButtonRowView.setPrimaryText(text2);
        RdsRadioButtonRowView rdsRadioButtonRowView2 = binding.gfdRow;
        StringResource goodForDayDetailText = viewState.getGoodForDayDetailText();
        if (goodForDayDetailText != null) {
            Resources resources3 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            text3 = goodForDayDetailText.getText(resources3);
        } else {
            text3 = null;
        }
        rdsRadioButtonRowView2.setSecondaryText(text3);
        RdsRadioButtonRowView rdsRadioButtonRowView3 = binding.gtcRow;
        StringResource goodTilCanceledTitle = viewState.getGoodTilCanceledTitle();
        if (goodTilCanceledTitle != null) {
            Resources resources4 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            text4 = goodTilCanceledTitle.getText(resources4);
        }
        rdsRadioButtonRowView3.setPrimaryText(text4);
        binding.continueButton.setEnabled(viewState.getContinueButtonEnabled());
        RdsButton continueButton = binding.continueButton;
        Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
        OnClickListeners.onClick(continueButton, new Function0() { // from class: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderTimeInForceFragment.setViewState$lambda$6$lambda$5(viewState, this);
            }
        });
        UiEvent<OrderTimeInForce> defaultTimeInForceUiEvent = viewState.getDefaultTimeInForceUiEvent();
        if (defaultTimeInForceUiEvent == null || (orderTimeInForceConsume = defaultTimeInForceUiEvent.consume()) == null) {
            return;
        }
        setDefaultTimeInForce(orderTimeInForceConsume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$6$lambda$5(OrderTimeInForceViewState orderTimeInForceViewState, OrderTimeInForceFragment orderTimeInForceFragment) {
        OrderTimeInForce selectedTimeInForce = orderTimeInForceViewState.getSelectedTimeInForce();
        if (selectedTimeInForce != null) {
            orderTimeInForceFragment.onTimeInForceSelected(selectedTimeInForce);
        }
        return Unit.INSTANCE;
    }

    private final void setDefaultTimeInForce(OrderTimeInForce timeInForce) {
        Object next;
        FragmentOrderTimeInForceBinding binding = getBinding();
        NewRdsRadioGroup radioGroup = binding.radioGroup;
        Intrinsics.checkNotNullExpressionValue(radioGroup, "radioGroup");
        Iterator itIterator2 = SequencesKt.filterIsInstance(ViewGroup2.getChildren(radioGroup), RdsRadioButtonRowView.class).iterator2();
        while (true) {
            if (!itIterator2.hasNext()) {
                next = null;
                break;
            } else {
                next = itIterator2.next();
                if (((View) next).getTag() == timeInForce) {
                    break;
                }
            }
        }
        RdsRadioButtonRowView rdsRadioButtonRowView = (RdsRadioButtonRowView) next;
        if (rdsRadioButtonRowView != null) {
            binding.radioGroup.check(rdsRadioButtonRowView.getId());
        }
    }

    /* compiled from: OrderTimeInForceFragment.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceFragment$Args;", "Landroid/os/Parcelable;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "defaultTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "isOrderReplacement", "", "<init>", "(Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Z)V", "getConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "getDefaultTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Order.Configuration configuration;
        private final OrderTimeInForce defaultTimeInForce;
        private final EquityOrderFlowSource flowSource;
        private final boolean isOrderReplacement;

        /* compiled from: OrderTimeInForceFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(Order.Configuration.valueOf(parcel.readString()), (OrderTimeInForce) parcel.readParcelable(Args.class.getClassLoader()), EquityOrderFlowSource.valueOf(parcel.readString()), parcel.readInt() != 0);
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
            dest.writeString(this.configuration.name());
            dest.writeParcelable(this.defaultTimeInForce, flags);
            dest.writeString(this.flowSource.name());
            dest.writeInt(this.isOrderReplacement ? 1 : 0);
        }

        public Args(Order.Configuration configuration, OrderTimeInForce orderTimeInForce, EquityOrderFlowSource flowSource, boolean z) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            this.configuration = configuration;
            this.defaultTimeInForce = orderTimeInForce;
            this.flowSource = flowSource;
            this.isOrderReplacement = z;
        }

        public final Order.Configuration getConfiguration() {
            return this.configuration;
        }

        public final OrderTimeInForce getDefaultTimeInForce() {
            return this.defaultTimeInForce;
        }

        public final EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        /* renamed from: isOrderReplacement, reason: from getter */
        public final boolean getIsOrderReplacement() {
            return this.isOrderReplacement;
        }
    }

    /* compiled from: OrderTimeInForceFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceFragment;", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceFragment$Args;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OrderTimeInForceFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OrderTimeInForceFragment orderTimeInForceFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, orderTimeInForceFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OrderTimeInForceFragment newInstance(Args args) {
            return (OrderTimeInForceFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OrderTimeInForceFragment orderTimeInForceFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, orderTimeInForceFragment, args);
        }
    }
}
