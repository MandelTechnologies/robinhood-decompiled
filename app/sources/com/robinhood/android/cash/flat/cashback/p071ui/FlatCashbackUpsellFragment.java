package com.robinhood.android.cash.flat.cashback.p071ui;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.R$attr;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.cash.flat.cashback.C10067R;
import com.robinhood.android.cash.flat.cashback.p071ui.FlatCashbackUpsellFragment;
import com.robinhood.android.cash.flat.cashback.p071ui.common.BaseFlatCashbackViewState;
import com.robinhood.android.cash.flat.cashback.p071ui.common.FlatCashbackLoadableComposable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhyrewards.p246ui.MerchantRewardsOfferDetailsBottomSheet;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.prefs.HasVisitedFlatCashbackUpsellPref;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: FlatCashbackUpsellFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001CB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0016J\u001a\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0018\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020\"H\u0016J\b\u00106\u001a\u00020\"H\u0016J\r\u00107\u001a\u00020\"H\u0017¢\u0006\u0002\u00108J\b\u00109\u001a\u00020\"H\u0002J\b\u0010:\u001a\u00020\"H\u0002J\u0010\u0010;\u001a\u00020\"2\u0006\u0010<\u001a\u00020\u0012H\u0002J\t\u0010=\u001a\u00020\u0012H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D²\u0006\u0010\u0010E\u001a\b\u0012\u0004\u0012\u00020G0FX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Landroidx/core/view/MenuProvider;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "hasVisitedFlatCashbackUpsellPref", "Lcom/robinhood/prefs/BooleanPreference;", "getHasVisitedFlatCashbackUpsellPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasVisitedFlatCashbackUpsellPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "duxo", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateMenu", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onMenuItemSelected", "menuItem", "Landroid/view/MenuItem;", "onStop", "onResume", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "setFlatCashbackUpsellToolbarStyle", "removeFlatCashbackUpsellToolbarStyle", "showToolbarBackButton", "shouldShow", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "feature-cash-flat-cashback_externalDebug", "viewState", "Lcom/robinhood/android/cash/flat/cashback/ui/common/BaseFlatCashbackViewState;", "Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FlatCashbackUpsellFragment extends GenericComposeFragment implements RegionGated, MenuProvider, AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FlatCashbackUpsellFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellFragment$Callbacks;", 0))};
    public static final int $stable = 8;

    @HasVisitedFlatCashbackUpsellPref
    public BooleanPreference hasVisitedFlatCashbackUpsellPref;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    private final Screen eventScreen = new Screen(null, null, getScreenName(), null, 11, null);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, FlatCashbackUpsellDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: FlatCashbackUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/cash/flat/cashback/ui/FlatCashbackUpsellFragment$Callbacks;", "", "onDirectDepositSelected", "", "onRecurringAchSelected", "feature-cash-flat-cashback_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDirectDepositSelected();

        void onRecurringAchSelected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(FlatCashbackUpsellFragment flatCashbackUpsellFragment, int i, Composer composer, int i2) {
        flatCashbackUpsellFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onMenuClosed(Menu menu) {
        super.onMenuClosed(menu);
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onPrepareMenu(Menu menu) {
        super.onPrepareMenu(menu);
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

    public final BooleanPreference getHasVisitedFlatCashbackUpsellPref() {
        BooleanPreference booleanPreference = this.hasVisitedFlatCashbackUpsellPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasVisitedFlatCashbackUpsellPref");
        return null;
    }

    public final void setHasVisitedFlatCashbackUpsellPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasVisitedFlatCashbackUpsellPref = booleanPreference;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final FlatCashbackUpsellDuxo getDuxo() {
        return (FlatCashbackUpsellDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
        getHasVisitedFlatCashbackUpsellPref().set(true);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        fragmentActivityRequireActivity.addMenuProvider(this, getViewLifecycleOwner(), Lifecycle.State.RESUMED);
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
        menuInflater.inflate(C11048R.menu.menu_skip, menu);
    }

    private static final BaseFlatCashbackViewState<FlatCashbackUpsellViewState> ComposeContent$lambda$2(SnapshotState4<? extends BaseFlatCashbackViewState<FlatCashbackUpsellViewState>> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        requireBaseActivity().finish();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        removeFlatCashbackUpsellToolbarStyle();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlatCashbackUpsellFragment.onResume$lambda$1(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(FlatCashbackUpsellFragment flatCashbackUpsellFragment, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (flatCashbackUpsellFragment.getDuxo().getStateFlow().getValue() instanceof BaseFlatCashbackViewState.Loaded) {
            flatCashbackUpsellFragment.setFlatCashbackUpsellToolbarStyle();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1076720351);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1076720351, i2, -1, "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellFragment.ComposeContent (FlatCashbackUpsellFragment.kt:108)");
            }
            BaseFlatCashbackViewState<FlatCashbackUpsellViewState> baseFlatCashbackViewStateComposeContent$lambda$2 = ComposeContent$lambda$2(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            FlatCashbackUpsellDuxo duxo = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FlatCashbackUpsellFragment2(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            FlatCashbackLoadableComposable.FlatCashbackLoadableComposable(baseFlatCashbackViewStateComposeContent$lambda$2, (Function0) ((KFunction) objRememberedValue), null, ComposableLambda3.rememberComposableLambda(1875962151, true, new C100882(), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FlatCashbackUpsellFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: FlatCashbackUpsellFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellFragment$ComposeContent$2 */
    static final class C100882 implements Function3<FlatCashbackUpsellViewState, Composer, Integer, Unit> {
        C100882() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(FlatCashbackUpsellViewState flatCashbackUpsellViewState, Composer composer, Integer num) {
            invoke(flatCashbackUpsellViewState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final FlatCashbackUpsellViewState loadedViewState, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(loadedViewState, "loadedViewState");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1875962151, i, -1, "com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellFragment.ComposeContent.<anonymous> (FlatCashbackUpsellFragment.kt:114)");
            }
            FlatCashbackUpsellFragment.this.setFlatCashbackUpsellToolbarStyle();
            Callbacks callbacks = FlatCashbackUpsellFragment.this.getCallbacks();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(callbacks);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FlatCashbackUpsellFragment3(callbacks);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
            Callbacks callbacks2 = FlatCashbackUpsellFragment.this.getCallbacks();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(callbacks2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new FlatCashbackUpsellFragment4(callbacks2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Function0 function02 = (Function0) ((KFunction) objRememberedValue2);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composer.changedInstance(loadedViewState) | composer.changedInstance(FlatCashbackUpsellFragment.this);
            final FlatCashbackUpsellFragment flatCashbackUpsellFragment = FlatCashbackUpsellFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellFragment$ComposeContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FlatCashbackUpsellFragment.C100882.invoke$lambda$3$lambda$2(loadedViewState, flatCashbackUpsellFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            FlatCashbackUpsellComposable.FlatCashbackUpsellComposable(function0, function02, (Function0) objRememberedValue3, loadedViewState, composer, (i << 9) & 7168);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(FlatCashbackUpsellViewState flatCashbackUpsellViewState, FlatCashbackUpsellFragment flatCashbackUpsellFragment) {
            MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet = (MerchantRewardsOfferDetailsBottomSheet) MerchantRewardsOfferDetailsBottomSheet.INSTANCE.newInstance((Parcelable) new MerchantRewardsOfferDetailsBottomSheet.Args(flatCashbackUpsellViewState.getMerchantOffer(), false, 2, null));
            FragmentManager childFragmentManager = flatCashbackUpsellFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            merchantRewardsOfferDetailsBottomSheet.show(childFragmentManager, "MerchantRewardsOfferDetailsBottomSheetDialogFragment");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFlatCashbackUpsellToolbarStyle() {
        int i;
        if (DayNightChanges.isDay(ScarletManager2.getScarletManager(requireToolbar()))) {
            i = C10067R.color.flatCashbackUpsellImageDayBackgroundColor;
        } else {
            i = C10067R.color.flatCashbackUpsellImageNightBackgroundColor;
        }
        RhToolbar rhToolbarRequireToolbar = requireToolbar();
        ResourceReferences4.Companion companion = ResourceReferences4.INSTANCE;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        ScarletManager2.overrideAttribute(rhToolbarRequireToolbar, R.attr.backgroundTint, companion.from(resources, ResourceType.COLOR.INSTANCE, i));
        showToolbarBackButton(false);
    }

    private final void removeFlatCashbackUpsellToolbarStyle() {
        ScarletManager2.overrideAttribute(requireToolbar(), R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, R$attr.backgroundTint));
        showToolbarBackButton(true);
    }

    private final void showToolbarBackButton(boolean shouldShow) {
        ActionBar supportActionBar = requireBaseActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setHomeButtonEnabled(shouldShow);
            supportActionBar.setDisplayHomeAsUpEnabled(shouldShow);
        }
    }
}
