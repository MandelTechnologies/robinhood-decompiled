package com.robinhood.android.cash.rhy.tab.p077v2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.databinding.FragmentRhyPendingScreenBinding;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.BaseFragments;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyActionRowView;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyHeroAssetView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.tabs.Scrollable;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.librobinhood.data.store.bonfire.RhyTabStateStore;
import com.robinhood.models.p320db.rhy.RhyTabState;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhyPendingScreenFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u00018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020!H\u0016J\t\u00102\u001a\u00020\u0013H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyPendingScreenFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/tabs/Scrollable;", "<init>", "()V", "binding", "Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhyPendingScreenBinding;", "getBinding", "()Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhyPendingScreenBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "rhyTabStateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;", "getRhyTabStateStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;", "setRhyTabStateStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "actionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "Lkotlin/Lazy;", "onResume", "", "actionsListAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/RhyActionRowView;", "Lcom/robinhood/models/db/rhy/RhyTabState$Action;", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "scrollToTop", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RhyPendingScreenFragment extends BaseFragment implements RegionGated, Scrollable {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final ActivityResultLauncher<Intent> actionLauncher;
    private final GenericListAdapter<RhyActionRowView, RhyTabState.Action> actionsListAdapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public RhyTabStateStore rhyTabStateStore;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyPendingScreenFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhyPendingScreenBinding;", 0))};

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

    public RhyPendingScreenFragment() {
        super(C10285R.layout.fragment_rhy_pending_screen);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, RhyPendingScreenFragment3.INSTANCE);
        this.useDesignSystemToolbar = true;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyPendingScreenFragment$actionLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.getRhyTabStateStore().refresh(true);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.actionLauncher = activityResultLauncherRegisterForActivityResult;
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyPendingScreenFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyPendingScreenFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RhyActionRowView.Companion companion2 = RhyActionRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.actionsListAdapter = companion.m2987of(companion2, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyPendingScreenFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RhyPendingScreenFragment.actionsListAdapter$lambda$2(this.f$0, (RhyActionRowView) obj, (RhyTabState.Action) obj2);
            }
        });
    }

    private final FragmentRhyPendingScreenBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhyPendingScreenBinding) value;
    }

    public final RhyTabStateStore getRhyTabStateStore() {
        RhyTabStateStore rhyTabStateStore = this.rhyTabStateStore;
        if (rhyTabStateStore != null) {
            return rhyTabStateStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyTabStateStore");
        return null;
    }

    public final void setRhyTabStateStore(RhyTabStateStore rhyTabStateStore) {
        Intrinsics.checkNotNullParameter(rhyTabStateStore, "<set-?>");
        this.rhyTabStateStore = rhyTabStateStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(RhyPendingScreenFragment rhyPendingScreenFragment) {
        RhToolbar rhToolbar = rhyPendingScreenFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, rhyPendingScreenFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 60, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getToolbarScrollAnimator().onScroll(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit actionsListAdapter$lambda$2(final RhyPendingScreenFragment rhyPendingScreenFragment, final RhyActionRowView of, final RhyTabState.Action state) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(state, "state");
        of.bind(state);
        of.onClick(new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyPendingScreenFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyPendingScreenFragment.actionsListAdapter$lambda$2$lambda$1(this.f$0, of, state);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit actionsListAdapter$lambda$2$lambda$1(RhyPendingScreenFragment rhyPendingScreenFragment, RhyActionRowView rhyActionRowView, RhyTabState.Action action) {
        ActivityResultLauncher<Intent> activityResultLauncher = rhyPendingScreenFragment.actionLauncher;
        Navigator navigator = rhyActionRowView.getNavigator();
        Context context = rhyActionRowView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Uri uri = Uri.parse(action.getAction());
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        activityResultLauncher.launch(ArraysKt.last(Navigator.DefaultImpls.resolveDeepLink$default(navigator, context, uri, Boolean.TRUE, DeepLinkOrigin.Internal.INSTANCE, false, 16, null)));
        return Unit.INSTANCE;
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
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhyHeroAssetView rhyHeroAssetView = getBinding().rhyPendingScreenHeroAssetView;
        Companion companion = INSTANCE;
        rhyHeroAssetView.bindHeroAsset(((LegacyFragmentKey.RhyPendingScreen) companion.getArgs((Fragment) this)).getInfo().getHeroAsset());
        getBinding().rhyPendingScreenTitle.setText(((LegacyFragmentKey.RhyPendingScreen) companion.getArgs((Fragment) this)).getInfo().getTitle());
        getBinding().rhyPendingScreenMessage.setText(((LegacyFragmentKey.RhyPendingScreen) companion.getArgs((Fragment) this)).getInfo().getMessage());
        RecyclerView rhyPendingScreenActionsRecyclerView = getBinding().rhyPendingScreenActionsRecyclerView;
        Intrinsics.checkNotNullExpressionValue(rhyPendingScreenActionsRecyclerView, "rhyPendingScreenActionsRecyclerView");
        bindAdapter(rhyPendingScreenActionsRecyclerView, this.actionsListAdapter);
        this.actionsListAdapter.submitList(((LegacyFragmentKey.RhyPendingScreen) companion.getArgs((Fragment) this)).getInfo().getActions());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        BaseFragments.configureRhyToolbar(this, toolbar);
    }

    @Override // com.robinhood.android.common.p088ui.tabs.Scrollable
    public void scrollToTop() {
        getBinding().rhyPendingScreenScrollView.smoothScrollTo(0, 0);
    }

    /* compiled from: RhyPendingScreenFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyPendingScreenFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyPendingScreenFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyPendingScreen;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhyPendingScreenFragment, LegacyFragmentKey.RhyPendingScreen>, FragmentResolver<LegacyFragmentKey.RhyPendingScreen> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.RhyPendingScreen getArgs(RhyPendingScreenFragment rhyPendingScreenFragment) {
            return (LegacyFragmentKey.RhyPendingScreen) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhyPendingScreenFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyPendingScreenFragment newInstance(LegacyFragmentKey.RhyPendingScreen rhyPendingScreen) {
            return (RhyPendingScreenFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, rhyPendingScreen);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyPendingScreenFragment rhyPendingScreenFragment, LegacyFragmentKey.RhyPendingScreen rhyPendingScreen) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhyPendingScreenFragment, rhyPendingScreen);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.RhyPendingScreen key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return RhyPendingScreenFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
