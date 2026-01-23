package com.robinhood.android.trade.directipo.p260ui.order;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Space;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment;
import com.robinhood.android.lib.trade.view.OrderConfirmationRowItem;
import com.robinhood.android.lib.trade.view.OrderConfirmationRowView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.android.trade.directipo.C29323R;
import com.robinhood.android.trade.directipo.databinding.MergeDirectIpoOrderConfirmationBinding;
import com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager;
import com.robinhood.directipo.models.p293ui.UiDirectIpoOrderResponse;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p355ui.bonfire.UiDirectIpoPostCobFollowup;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: DirectIpoOrderConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Q2\u00020\u00012 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00022\u00020\b:\u0003OPQB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010:\u001a\u0002042\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u001a\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020?2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010@\u001a\u000204H\u0016J\"\u0010A\u001a\u0002042\u0018\u0010B\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003j\u0002`\u0006H\u0016J\u0010\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u000207H\u0016J\u0010\u0010F\u001a\u0002042\u0006\u0010G\u001a\u00020HH\u0002J\t\u0010I\u001a\u00020DH\u0096\u0001R\u001e\u0010\u000b\u001a\u00020\u00078\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010*\u001a\u0004\u0018\u00010\u00052\b\u0010)\u001a\u0004\u0018\u00010\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u00101\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020402X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010J\u001a\b\u0012\u0004\u0012\u00020L0KX\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "Lkotlin/Pair;", "Lcom/robinhood/directipo/models/ui/UiDirectIpoOrderResponse;", "Lcom/robinhood/models/ui/bonfire/UiDirectIpoPostCobFollowup;", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderResponse;", "Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "<init>", "()V", "orderManager", "getOrderManager", "()Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager;", "setOrderManager", "(Lcom/robinhood/android/trade/directipo/util/DirectIpoOrderSubmissionManager;)V", "confirmationLayoutId", "", "getConfirmationLayoutId", "()I", "callbacks", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bindings", "Lcom/robinhood/android/trade/directipo/databinding/MergeDirectIpoOrderConfirmationBinding;", "getBindings", "()Lcom/robinhood/android/trade/directipo/databinding/MergeDirectIpoOrderConfirmationBinding;", "bindings$delegate", "duxo", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "itemAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/lib/trade/view/OrderConfirmationRowView;", "Lcom/robinhood/android/lib/trade/view/OrderConfirmationRowItem;", "<set-?>", "postCobFollowup", "getPostCobFollowup", "()Lcom/robinhood/models/ui/bonfire/UiDirectIpoPostCobFollowup;", "setPostCobFollowup", "(Lcom/robinhood/models/ui/bonfire/UiDirectIpoPostCobFollowup;)V", "postCobFollowup$delegate", "Lkotlin/properties/ReadWriteProperty;", "spaceAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Landroid/widget/Space;", "", "buttonAdapter", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onOrderReceived", Card.Icon.ORDER, "onActionClicked", "", "button", "setViewState", "viewState", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationViewState;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DirectIpoOrderConfirmationFragment extends BaseOrderConfirmationFragment<Tuples2<? extends UiDirectIpoOrderResponse, ? extends UiDirectIpoPostCobFollowup>, DirectIpoOrderSubmissionManager> implements RegionGated, ClientComponentButtonView.Callbacks {
    private final CompositeAdapter adapter;
    private final GenericListAdapter<ClientComponentButtonView, ServerDrivenButton> buttonAdapter;
    private final GenericListAdapter<OrderConfirmationRowView, OrderConfirmationRowItem> itemAdapter;
    public DirectIpoOrderSubmissionManager orderManager;

    /* renamed from: postCobFollowup$delegate, reason: from kotlin metadata */
    private final Interfaces3 postCobFollowup;
    private final SingleItemAdapter<Space, Unit> spaceAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoOrderConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(DirectIpoOrderConfirmationFragment.class, "bindings", "getBindings()Lcom/robinhood/android/trade/directipo/databinding/MergeDirectIpoOrderConfirmationBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DirectIpoOrderConfirmationFragment.class, "postCobFollowup", "getPostCobFollowup()Lcom/robinhood/models/ui/bonfire/UiDirectIpoPostCobFollowup;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
    private final int confirmationLayoutId = C29323R.layout.merge_direct_ipo_order_confirmation;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderConfirmationFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings = ViewBinding5.viewBinding(this, DirectIpoOrderConfirmationFragment2.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, DirectIpoOrderConfirmationDuxo.class);

    /* compiled from: DirectIpoOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationFragment$Callbacks;", "", "onOrderCompleted", "", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onOrderCompleted();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public /* bridge */ /* synthetic */ void onOrderReceived(Tuples2<? extends UiDirectIpoOrderResponse, ? extends UiDirectIpoPostCobFollowup> tuples2) {
        onOrderReceived2((Tuples2<UiDirectIpoOrderResponse, UiDirectIpoPostCobFollowup>) tuples2);
    }

    public DirectIpoOrderConfirmationFragment() {
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        OrderConfirmationRowView.Companion companion2 = OrderConfirmationRowView.INSTANCE;
        DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        GenericListAdapter<OrderConfirmationRowView, OrderConfirmationRowItem> genericListAdapterM2986of = companion.m2986of(companion2, equality);
        this.itemAdapter = genericListAdapterM2986of;
        this.postCobFollowup = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[2]);
        SingleItemAdapter<Space, Unit> singleItemAdapterOfUnit$default = SingleItemAdapter.Companion.ofUnit$default(SingleItemAdapter.INSTANCE, C29323R.layout.include_direct_ipo_confirmation_space, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);
        this.spaceAdapter = singleItemAdapterOfUnit$default;
        ClientComponentButtonView.Companion companion3 = ClientComponentButtonView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        GenericListAdapter<ClientComponentButtonView, ServerDrivenButton> genericListAdapterM2987of = companion.m2987of(companion3, equality, new Function2() { // from class: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoOrderConfirmationFragment.buttonAdapter$lambda$0(this.f$0, (ClientComponentButtonView) obj, (ServerDrivenButton) obj2);
            }
        });
        this.buttonAdapter = genericListAdapterM2987of;
        this.adapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{genericListAdapterM2986of, singleItemAdapterOfUnit$default, genericListAdapterM2987of});
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public DirectIpoOrderSubmissionManager getOrderManager() {
        DirectIpoOrderSubmissionManager directIpoOrderSubmissionManager = this.orderManager;
        if (directIpoOrderSubmissionManager != null) {
            return directIpoOrderSubmissionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public void setOrderManager(DirectIpoOrderSubmissionManager directIpoOrderSubmissionManager) {
        Intrinsics.checkNotNullParameter(directIpoOrderSubmissionManager, "<set-?>");
        this.orderManager = directIpoOrderSubmissionManager;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public int getConfirmationLayoutId() {
        return this.confirmationLayoutId;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final MergeDirectIpoOrderConfirmationBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeDirectIpoOrderConfirmationBinding) value;
    }

    private final DirectIpoOrderConfirmationDuxo getDuxo() {
        return (DirectIpoOrderConfirmationDuxo) this.duxo.getValue();
    }

    private final UiDirectIpoPostCobFollowup getPostCobFollowup() {
        return (UiDirectIpoPostCobFollowup) this.postCobFollowup.getValue(this, $$delegatedProperties[2]);
    }

    private final void setPostCobFollowup(UiDirectIpoPostCobFollowup uiDirectIpoPostCobFollowup) {
        this.postCobFollowup.setValue(this, $$delegatedProperties[2], uiDirectIpoPostCobFollowup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonAdapter$lambda$0(DirectIpoOrderConfirmationFragment directIpoOrderConfirmationFragment, ClientComponentButtonView of, ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(button, "button");
        of.bind(button);
        of.setCallbacks(directIpoOrderConfirmationFragment);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IdlingResourceCounters2.setBusy(IdlingResourceType.ORDER_FINAL, true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View root = getBindings().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RecyclerView recyclerView = getBindings().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        bindAdapter(recyclerView, this.adapter);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C293361(this));
    }

    /* compiled from: DirectIpoOrderConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.directipo.ui.order.DirectIpoOrderConfirmationFragment$onStart$1 */
    /* synthetic */ class C293361 extends FunctionReferenceImpl implements Function1<DirectIpoOrderConfirmationViewState, Unit> {
        C293361(Object obj) {
            super(1, obj, DirectIpoOrderConfirmationFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DirectIpoOrderConfirmationViewState directIpoOrderConfirmationViewState) {
            invoke2(directIpoOrderConfirmationViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DirectIpoOrderConfirmationViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectIpoOrderConfirmationFragment) this.receiver).setViewState(p0);
        }
    }

    /* renamed from: onOrderReceived, reason: avoid collision after fix types in other method */
    public void onOrderReceived2(Tuples2<UiDirectIpoOrderResponse, UiDirectIpoPostCobFollowup> order) {
        Intrinsics.checkNotNullParameter(order, "order");
        UiDirectIpoOrderResponse uiDirectIpoOrderResponseComponent1 = order.component1();
        setPostCobFollowup(order.component2());
        getDuxo().setOrder(uiDirectIpoOrderResponseComponent1);
        IdlingResourceCounters2.setBusy(IdlingResourceType.ORDER_FINAL, false);
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        getCallbacks().onOrderCompleted();
        GenericAction typedAction = button.getTypedAction();
        if (typedAction instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, ((GenericAction.DeeplinkAction) typedAction).getUri(), null, null, false, null, 60, null);
            return true;
        }
        UiDirectIpoPostCobFollowup postCobFollowup = getPostCobFollowup();
        if (postCobFollowup == null) {
            return true;
        }
        Navigator navigator2 = getNavigator();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, new HostIntentKey.DialogFragmentHost(new LegacyDialogFragmentKey.DirectIpoPostCobFollowup(postCobFollowup)), null, false, null, null, 60, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(DirectIpoOrderConfirmationViewState viewState) {
        getBindings().orderTitleTxt.setText(viewState.getTitle());
        getBindings().orderDescriptionTxt.setText(viewState.getDescription());
        this.itemAdapter.submitList(viewState.getItems());
        this.buttonAdapter.submitList(viewState.getButtons());
    }

    /* compiled from: DirectIpoOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationFragment$Args;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID instrumentId;

        /* compiled from: DirectIpoOrderConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.instrumentId;
            }
            return args.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final Args copy(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Args(instrumentId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.instrumentId, ((Args) other).instrumentId);
        }

        public int hashCode() {
            return this.instrumentId.hashCode();
        }

        public String toString() {
            return "Args(instrumentId=" + this.instrumentId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
        }

        public Args(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }
    }

    /* compiled from: DirectIpoOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationFragment;", "Lcom/robinhood/android/trade/directipo/ui/order/DirectIpoOrderConfirmationFragment$Args;", "<init>", "()V", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoOrderConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DirectIpoOrderConfirmationFragment directIpoOrderConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoOrderConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoOrderConfirmationFragment newInstance(Args args) {
            return (DirectIpoOrderConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoOrderConfirmationFragment directIpoOrderConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoOrderConfirmationFragment, args);
        }
    }
}
