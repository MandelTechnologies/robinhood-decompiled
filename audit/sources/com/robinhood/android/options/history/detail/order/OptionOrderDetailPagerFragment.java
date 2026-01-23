package com.robinhood.android.options.history.detail.order;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.options.history.detail.extensions.UiOptionOrders;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.common.strings.C32428R;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionOrderDetailPagerFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0002*+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\t\u0010#\u001a\u00020$H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailPagerFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "tabLayout$delegate", "Lkotlin/properties/ReadOnlyProperty;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "getViewPager", "()Landroidx/viewpager/widget/ViewPager;", "viewPager$delegate", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "getOptionOrderStore", "()Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "setOptionOrderStore", "(Lcom/robinhood/librobinhood/data/store/OptionOrderStore;)V", "adapter", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailPagerFragment$OptionOrderDetailPagerAdapter;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "OptionOrderDetailPagerAdapter", "Companion", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionOrderDetailPagerFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private OptionOrderDetailPagerAdapter adapter;
    public OptionOrderStore optionOrderStore;

    /* renamed from: tabLayout$delegate, reason: from kotlin metadata */
    private final Interfaces2 tabLayout;

    /* renamed from: viewPager$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewPager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOrderDetailPagerFragment.class, "tabLayout", "getTabLayout()Lcom/google/android/material/tabs/TabLayout;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderDetailPagerFragment.class, "viewPager", "getViewPager()Landroidx/viewpager/widget/ViewPager;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionOrderDetailPagerFragment() {
        super(C18359R.layout.fragment_order_detail_pager);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.tabLayout = bindView(C18359R.id.tab_layout);
        this.viewPager = bindView(C18359R.id.viewpager);
    }

    private final TabLayout getTabLayout() {
        return (TabLayout) this.tabLayout.getValue(this, $$delegatedProperties[0]);
    }

    private final ViewPager getViewPager() {
        return (ViewPager) this.viewPager.getValue(this, $$delegatedProperties[1]);
    }

    public final OptionOrderStore getOptionOrderStore() {
        OptionOrderStore optionOrderStore = this.optionOrderStore;
        if (optionOrderStore != null) {
            return optionOrderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionOrderStore");
        return null;
    }

    public final void setOptionOrderStore(OptionOrderStore optionOrderStore) {
        Intrinsics.checkNotNullParameter(optionOrderStore, "<set-?>");
        this.optionOrderStore = optionOrderStore;
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
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.adapter = new OptionOrderDetailPagerAdapter(fragmentActivityRequireActivity);
        getViewPager().setAdapter(this.adapter);
        getTabLayout().setupWithViewPager(getViewPager());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getOptionOrderStore().refreshAll(false);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getOptionOrderStore().getOptionOrders(((LegacyFragmentKey.OptionOrderDetail) INSTANCE.getArgs((Fragment) this)).getOptionOrderIds())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailPagerFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderDetailPagerFragment.onResume$lambda$2(this.f$0, (List) obj);
            }
        });
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        RhToolbar rhToolbar = baseActivity.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setElevation(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(OptionOrderDetailPagerFragment optionOrderDetailPagerFragment, List uiOptionOrders) {
        BaseActivity baseActivity;
        RhToolbar rhToolbar;
        Intrinsics.checkNotNullParameter(uiOptionOrders, "uiOptionOrders");
        OptionOrderDetailPagerAdapter optionOrderDetailPagerAdapter = optionOrderDetailPagerFragment.adapter;
        if (optionOrderDetailPagerAdapter != null) {
            optionOrderDetailPagerAdapter.setUiOptionOrders(uiOptionOrders);
        }
        UiOptionOrder uiOptionOrder = (UiOptionOrder) CollectionsKt.firstOrNull(uiOptionOrders);
        if (uiOptionOrder != null && (baseActivity = optionOrderDetailPagerFragment.getBaseActivity()) != null && (rhToolbar = baseActivity.getRhToolbar()) != null) {
            Resources resources = optionOrderDetailPagerFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rhToolbar.setTitle(UiOptionOrders.getDayTradeTitle(uiOptionOrder, resources));
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

    /* compiled from: OptionOrderDetailPagerFragment.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u0014H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailPagerFragment$OptionOrderDetailPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "buyString", "", "sellString", "value", "", "Lcom/robinhood/models/ui/UiOptionOrder;", "uiOptionOrders", "getUiOptionOrders", "()Ljava/util/List;", "setUiOptionOrders", "(Ljava/util/List;)V", "getCount", "", "instantiateItem", "", "container", "Landroid/view/ViewGroup;", "position", "destroyItem", "", WebsocketGatewayConstants.DATA_KEY, "getPageTitle", "", "isViewFromObject", "", "view", "Landroid/view/View;", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class OptionOrderDetailPagerAdapter extends PagerAdapter {
        private final String buyString;
        private final String sellString;
        private List<UiOptionOrder> uiOptionOrders;

        /* compiled from: OptionOrderDetailPagerFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderDirection.values().length];
                try {
                    iArr[OrderDirection.DEBIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderDirection.CREDIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object data) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(data, "data");
            return view == data;
        }

        public OptionOrderDetailPagerAdapter(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string2 = context.getString(C32428R.string.general_label_buy);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.buyString = string2;
            String string3 = context.getString(C32428R.string.general_label_sell);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            this.sellString = string3;
            this.uiOptionOrders = CollectionsKt.emptyList();
        }

        public final List<UiOptionOrder> getUiOptionOrders() {
            return this.uiOptionOrders;
        }

        public final void setUiOptionOrders(List<UiOptionOrder> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.uiOptionOrders = value;
            notifyDataSetChanged();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.uiOptionOrders.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup container, int position) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(container, "container");
            Context context = container.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            OptionOrderDetailView optionOrderDetailView = new OptionOrderDetailView(context);
            optionOrderDetailView.bind(this.uiOptionOrders.get(position));
            container.addView(optionOrderDetailView);
            return optionOrderDetailView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup container, int position, Object data) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(data, "data");
            if (data instanceof OptionOrderDetailView) {
                container.removeView((View) data);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int position) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.uiOptionOrders.get(position).getOptionOrder().getDirection().ordinal()];
            if (i == 1) {
                return this.buyString;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return this.sellString;
        }
    }

    /* compiled from: OptionOrderDetailPagerFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailPagerFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailPagerFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$OptionOrderDetail;", "<init>", "()V", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OptionOrderDetailPagerFragment, LegacyFragmentKey.OptionOrderDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.OptionOrderDetail optionOrderDetail) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, optionOrderDetail);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.OptionOrderDetail getArgs(OptionOrderDetailPagerFragment optionOrderDetailPagerFragment) {
            return (LegacyFragmentKey.OptionOrderDetail) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionOrderDetailPagerFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOrderDetailPagerFragment newInstance(LegacyFragmentKey.OptionOrderDetail optionOrderDetail) {
            return (OptionOrderDetailPagerFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, optionOrderDetail);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOrderDetailPagerFragment optionOrderDetailPagerFragment, LegacyFragmentKey.OptionOrderDetail optionOrderDetail) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionOrderDetailPagerFragment, optionOrderDetail);
        }
    }
}
