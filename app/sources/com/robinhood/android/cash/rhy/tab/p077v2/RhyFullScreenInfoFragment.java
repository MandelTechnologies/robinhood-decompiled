package com.robinhood.android.cash.rhy.tab.p077v2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.databinding.FragmentRhyFullScreenInfoBinding;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.BaseFragments;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.tabs.Scrollable;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.p320db.rhy.RhyTabState;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhyFullScreenInfoFragment.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u001a\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0013H\u0016J\t\u0010&\u001a\u00020\rH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyFullScreenInfoFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/tabs/Scrollable;", "<init>", "()V", "binding", "Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhyFullScreenInfoBinding;", "getBinding", "()Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhyFullScreenInfoBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "onAttach", "", "context", "Landroid/content/Context;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "Lkotlin/Lazy;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "scrollToTop", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RhyFullScreenInfoFragment extends BaseFragment implements RegionGated, Scrollable {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final boolean childFragmentsShouldNotConfigureToolbar;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyFullScreenInfoFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhyFullScreenInfoBinding;", 0))};

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

    public RhyFullScreenInfoFragment() {
        super(C10285R.layout.fragment_rhy_full_screen_info);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, RhyFullScreenInfoFragment2.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.childFragmentsShouldNotConfigureToolbar = true;
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyFullScreenInfoFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyFullScreenInfoFragment.toolbarScrollAnimator_delegate$lambda$1(this.f$0);
            }
        });
    }

    private final FragmentRhyFullScreenInfoBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyFullScreenInfoBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$1(RhyFullScreenInfoFragment rhyFullScreenInfoFragment) {
        RhToolbar rhToolbar = rhyFullScreenInfoFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, rhyFullScreenInfoFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 60, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getToolbarScrollAnimator().onScroll(0);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView rhTextView = getBinding().rhyFullScreenInfoTitle;
        Companion companion = INSTANCE;
        rhTextView.setText(((LegacyFragmentKey.RhyFullScreenInfo) companion.getArgs((Fragment) this)).getInfo().getTitle());
        getBinding().rhyFullScreenInfoMessage.setText(((LegacyFragmentKey.RhyFullScreenInfo) companion.getArgs((Fragment) this)).getInfo().getMessage());
        getBinding().rhyFullScreenInfoHeroAssetView.bindHeroAsset(((LegacyFragmentKey.RhyFullScreenInfo) companion.getArgs((Fragment) this)).getInfo().getHeroAsset());
        if (!((LegacyFragmentKey.RhyFullScreenInfo) companion.getArgs((Fragment) this)).getInfo().getActions().isEmpty()) {
            final RhyTabState.Action action = (RhyTabState.Action) CollectionsKt.first((List) ((LegacyFragmentKey.RhyFullScreenInfo) companion.getArgs((Fragment) this)).getInfo().getActions());
            final RdsButton rdsButton = getBinding().rhyFullScreenInfoButton;
            Intrinsics.checkNotNull(rdsButton);
            rdsButton.setVisibility(0);
            rdsButton.setText(action.getTitle());
            rdsButton.setIconResource(action.getIcon().getResourceId());
            OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyFullScreenInfoFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyFullScreenInfoFragment.onViewCreated$lambda$3$lambda$2(this.f$0, rdsButton, action);
                }
            });
            Intrinsics.checkNotNull(rdsButton);
            return;
        }
        RdsButton rhyFullScreenInfoButton = getBinding().rhyFullScreenInfoButton;
        Intrinsics.checkNotNullExpressionValue(rhyFullScreenInfoButton, "rhyFullScreenInfoButton");
        rhyFullScreenInfoButton.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(RhyFullScreenInfoFragment rhyFullScreenInfoFragment, RdsButton rdsButton, RhyTabState.Action action) {
        Navigator navigator = rhyFullScreenInfoFragment.getNavigator();
        Context context = rdsButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(action.getAction()), Boolean.FALSE, null, false, null, 56, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        BaseFragments.configureRhyToolbar(this, toolbar);
    }

    @Override // com.robinhood.android.common.p088ui.tabs.Scrollable
    public void scrollToTop() {
        getBinding().rhyFullScreenInfoScrollView.smoothScrollTo(0, 0);
    }

    /* compiled from: RhyFullScreenInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyFullScreenInfoFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyFullScreenInfoFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyFullScreenInfo;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhyFullScreenInfoFragment, LegacyFragmentKey.RhyFullScreenInfo>, FragmentResolver<LegacyFragmentKey.RhyFullScreenInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.RhyFullScreenInfo getArgs(RhyFullScreenInfoFragment rhyFullScreenInfoFragment) {
            return (LegacyFragmentKey.RhyFullScreenInfo) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhyFullScreenInfoFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyFullScreenInfoFragment newInstance(LegacyFragmentKey.RhyFullScreenInfo rhyFullScreenInfo) {
            return (RhyFullScreenInfoFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, rhyFullScreenInfo);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyFullScreenInfoFragment rhyFullScreenInfoFragment, LegacyFragmentKey.RhyFullScreenInfo rhyFullScreenInfo) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhyFullScreenInfoFragment, rhyFullScreenInfo);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.RhyFullScreenInfo key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) key);
        }
    }
}
