package com.robinhood.android.history.p153ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.databinding.FragmentOrderDetailPagerBinding;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.common.strings.C32428R;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.equities.history.OrderDetailView;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* compiled from: OrderDetailPagerFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/history/ui/OrderDetailPagerFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/history/databinding/FragmentOrderDetailPagerBinding;", "getBinding", "()Lcom/robinhood/android/history/databinding/FragmentOrderDetailPagerBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "getOrderStore", "()Lcom/robinhood/librobinhood/data/store/OrderStore;", "setOrderStore", "(Lcom/robinhood/librobinhood/data/store/OrderStore;)V", "adapter", "Lcom/robinhood/android/history/ui/OrderDetailPagerFragment$OrderDetailPagerAdapter;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "onPause", "OrderDetailPagerAdapter", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class OrderDetailPagerFragment extends BaseFragment {
    private OrderDetailPagerAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public OrderStore orderStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderDetailPagerFragment.class, "binding", "getBinding()Lcom/robinhood/android/history/databinding/FragmentOrderDetailPagerBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public OrderDetailPagerFragment() {
        super(C18359R.layout.fragment_order_detail_pager);
        this.binding = ViewBinding5.viewBinding(this, OrderDetailPagerFragment2.INSTANCE);
    }

    private final FragmentOrderDetailPagerBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOrderDetailPagerBinding) value;
    }

    public final OrderStore getOrderStore() {
        OrderStore orderStore = this.orderStore;
        if (orderStore != null) {
            return orderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderStore");
        return null;
    }

    public final void setOrderStore(OrderStore orderStore) {
        Intrinsics.checkNotNullParameter(orderStore, "<set-?>");
        this.orderStore = orderStore;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.adapter = new OrderDetailPagerAdapter(fragmentActivityRequireActivity, ((LegacyFragmentKey.OrderDetail) INSTANCE.getArgs((Fragment) this)).getOrderIds());
        getBinding().viewpager.setAdapter(this.adapter);
        getBinding().tabLayout.setupWithViewPager(getBinding().viewpager);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(((LegacyFragmentKey.OrderDetail) INSTANCE.getArgs((Fragment) this)).getName());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getOrderStore().refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getOrderStore().getOrders()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailPagerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailPagerFragment.onResume$lambda$3(this.f$0, (List) obj);
            }
        });
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        RhToolbar rhToolbar = baseActivity.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setElevation(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(OrderDetailPagerFragment orderDetailPagerFragment, List orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        OrderDetailPagerAdapter orderDetailPagerAdapter = orderDetailPagerFragment.adapter;
        if (orderDetailPagerAdapter != null) {
            List<Order> list = orders;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Order order : list) {
                linkedHashMap.put(order.getId(), Boolean.valueOf(order.getSide() == EquityOrderSide.BUY));
            }
            orderDetailPagerAdapter.setOrderBuyMap(linkedHashMap);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (isRemoving()) {
            BaseActivity baseActivity = getBaseActivity();
            Intrinsics.checkNotNull(baseActivity);
            RhToolbar rhToolbar = baseActivity.getRhToolbar();
            Intrinsics.checkNotNull(rhToolbar);
            rhToolbar.setElevation(getResources().getDimensionPixelOffset(C11048R.dimen.toolbar_elevation));
        }
    }

    /* compiled from: OrderDetailPagerFragment.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R<\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OrderDetailPagerFragment$OrderDetailPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "orderIds", "", "Ljava/util/UUID;", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "getOrderIds", "()Ljava/util/List;", "buyString", "", "sellString", "value", "", "", "isOrderBuyMap", "()Ljava/util/Map;", "setOrderBuyMap", "(Ljava/util/Map;)V", "getCount", "", "instantiateItem", "", "container", "Landroid/view/ViewGroup;", "position", "destroyItem", "", "view", "getPageTitle", "", "isViewFromObject", "Landroid/view/View;", WebsocketGatewayConstants.DATA_KEY, "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class OrderDetailPagerAdapter extends PagerAdapter {
        private final String buyString;
        private Map<UUID, Boolean> isOrderBuyMap;
        private final List<UUID> orderIds;
        private final String sellString;

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object data) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(data, "data");
            return view == data;
        }

        public OrderDetailPagerAdapter(Context context, List<UUID> orderIds) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(orderIds, "orderIds");
            this.orderIds = orderIds;
            String string2 = context.getString(C32428R.string.general_label_buy);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.buyString = string2;
            String string3 = context.getString(C32428R.string.general_label_sell);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            this.sellString = string3;
            this.isOrderBuyMap = MapsKt.emptyMap();
        }

        public final List<UUID> getOrderIds() {
            return this.orderIds;
        }

        public final Map<UUID, Boolean> isOrderBuyMap() {
            return this.isOrderBuyMap;
        }

        public final void setOrderBuyMap(Map<UUID, Boolean> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.isOrderBuyMap = value;
            notifyDataSetChanged();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.orderIds.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup container, int position) {
            Intrinsics.checkNotNullParameter(container, "container");
            OrderDetailView orderDetailViewInflate = OrderDetailView.INSTANCE.inflate(container);
            orderDetailViewInflate.bindOrder(this.orderIds.get(position));
            container.addView(orderDetailViewInflate);
            return orderDetailViewInflate;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup container, int position, Object view) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(view, "view");
            if (view instanceof OrderDetailView) {
                container.removeView((View) view);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int position) {
            Map<UUID, Boolean> map = this.isOrderBuyMap;
            if (map != null) {
                Boolean bool = map.get(this.orderIds.get(position));
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    return this.buyString;
                }
                if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                    return this.sellString;
                }
            }
            return null;
        }
    }

    /* compiled from: OrderDetailPagerFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OrderDetailPagerFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/history/ui/OrderDetailPagerFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OrderDetail;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OrderDetailPagerFragment, LegacyFragmentKey.OrderDetail>, FragmentResolver<LegacyFragmentKey.OrderDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.OrderDetail getArgs(OrderDetailPagerFragment orderDetailPagerFragment) {
            return (LegacyFragmentKey.OrderDetail) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, orderDetailPagerFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OrderDetailPagerFragment newInstance(LegacyFragmentKey.OrderDetail orderDetail) {
            return (OrderDetailPagerFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, orderDetail);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OrderDetailPagerFragment orderDetailPagerFragment, LegacyFragmentKey.OrderDetail orderDetail) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, orderDetailPagerFragment, orderDetail);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.OrderDetail key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) key);
        }
    }
}
