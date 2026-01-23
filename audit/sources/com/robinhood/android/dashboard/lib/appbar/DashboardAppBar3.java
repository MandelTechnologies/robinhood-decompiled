package com.robinhood.android.dashboard.lib.appbar;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.IconButton5;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.assethomes.AssetHomeTopAppBar;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.dashboard.lib.appbar.DashboardAppBar3;
import com.robinhood.android.dashboard.lib.appbar.NavigationIcon;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcher;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherLocation;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.util.extensions.BannerVisibility;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.appbar.InboxIconButton4;
import com.robinhood.compose.common.appbar.SearchIconButton3;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DashboardAppBar.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aK\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"CurrencySwitcherTestTag", "", "DashboardAppBar", "", "dashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "topBarScrollState", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/dashboard/lib/appbar/DashboardAppBarDuxo;", "onFxSwitcherClicked", "Lkotlin/Function0;", "bannerVisible", "", "(Lcom/robinhood/android/home/contracts/HomeDashboardType;Lcom/robinhood/compose/bento/component/TopBarScrollState;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/dashboard/lib/appbar/DashboardAppBarDuxo;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "lib-account-home_externalDebug", "viewState", "Lcom/robinhood/android/dashboard/lib/appbar/DashboardAppBarViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.appbar.DashboardAppBarKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DashboardAppBar3 {
    public static final String CurrencySwitcherTestTag = "currency_switcher_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardAppBar$lambda$4(HomeDashboardType homeDashboardType, TopBarScrollState topBarScrollState, Modifier modifier, DashboardAppBarDuxo dashboardAppBarDuxo, Function0 function0, boolean z, int i, int i2, Composer composer, int i3) {
        DashboardAppBar(homeDashboardType, topBarScrollState, modifier, dashboardAppBarDuxo, function0, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DashboardAppBar(final HomeDashboardType dashboardType, final TopBarScrollState topBarScrollState, Modifier modifier, DashboardAppBarDuxo dashboardAppBarDuxo, Function0<Unit> function0, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DashboardAppBarDuxo dashboardAppBarDuxo2;
        int i4;
        Function0<Unit> function02;
        boolean z2;
        Modifier modifier3;
        Function0<Unit> function03;
        boolean zBooleanValue;
        int i5;
        Function0<Unit> function04;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier4;
        final Function0<Unit> function05;
        final DashboardAppBarDuxo dashboardAppBarDuxo3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
        Intrinsics.checkNotNullParameter(topBarScrollState, "topBarScrollState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-43567565);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(dashboardType) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(topBarScrollState) : composerStartRestartGroup.changedInstance(topBarScrollState) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    dashboardAppBarDuxo2 = dashboardAppBarDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(dashboardAppBarDuxo2) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    dashboardAppBarDuxo2 = dashboardAppBarDuxo;
                }
                i3 |= i7;
            } else {
                dashboardAppBarDuxo2 = dashboardAppBarDuxo;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        z2 = z;
                        int i8 = composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                        i3 |= i8;
                    } else {
                        z2 = z;
                    }
                    i3 |= i8;
                } else {
                    z2 = z;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    dashboardAppBarDuxo3 = dashboardAppBarDuxo2;
                    function05 = function02;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) == 0) {
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DashboardAppBarDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.dashboard.lib.appbar.DashboardAppBarKt$DashboardAppBar$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.dashboard.lib.appbar.DashboardAppBarKt$DashboardAppBar$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            dashboardAppBarDuxo2 = (DashboardAppBarDuxo) baseDuxo;
                            i3 &= -7169;
                        }
                        if (i4 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.dashboard.lib.appbar.DashboardAppBarKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            function03 = (Function0) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function03 = function0;
                        }
                        if ((i2 & 32) == 0) {
                            i5 = i3 & (-458753);
                            function04 = function03;
                            zBooleanValue = ((Boolean) composerStartRestartGroup.consume(BannerVisibility.getLocalBannerVisible())).booleanValue();
                        } else {
                            zBooleanValue = z;
                            i5 = i3;
                            function04 = function03;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        i5 = i3;
                        modifier3 = modifier2;
                        function04 = function02;
                        zBooleanValue = z2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-43567565, i5, -1, "com.robinhood.android.dashboard.lib.appbar.DashboardAppBar (DashboardAppBar.kt:54)");
                    }
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(dashboardAppBarDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceGroup(1081259791);
                    WindowInsets windowInsetsWindowInsets$default = !zBooleanValue ? WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 13, null) : TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, TopAppBarDefaults.$stable);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier3;
                    Function0<Unit> function06 = function04;
                    Composer composer2 = composerStartRestartGroup;
                    int i9 = i5;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-976967642, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.appbar.DashboardAppBarKt.DashboardAppBar.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-976967642, i10, -1, "com.robinhood.android.dashboard.lib.appbar.DashboardAppBar.<anonymous> (DashboardAppBar.kt:68)");
                            }
                            Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, topBarScrollState.getOpacity());
                            Alignment.Horizontal centerHorizontally = DashboardAppBar3.DashboardAppBar$lambda$2(snapshotState4CollectAsStateWithLifecycle).getNavigationIcon() instanceof NavigationIcon.CurrencySwitcher ? Alignment.INSTANCE.getCenterHorizontally() : Alignment.INSTANCE.getStart();
                            SnapshotState4<DashboardAppBarViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAlpha);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String string2 = StringResource2.getString(DashboardAppBar3.DashboardAppBar$lambda$2(snapshotState4).getPrimaryText(), composer3, StringResource.$stable);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i11).getTextL(), composer3, 0, 0, 8190);
                            String secondaryText = DashboardAppBar3.DashboardAppBar$lambda$2(snapshotState4).getSecondaryText();
                            composer3.startReplaceGroup(-202529541);
                            if (secondaryText != null) {
                                BentoText2.m20747BentoText38GnDrw(secondaryText, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i11).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i11).getTextS(), composer3, 0, 0, 8186);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ModifiersKt.performanceIndicator(modifier3, DashboardAppBar$lambda$2(snapshotState4CollectAsStateWithLifecycle).loadedState()), ComposableLambda3.rememberComposableLambda(-955642798, true, new C137043(function04, navigator, context, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1859875247, true, new C137054(navigator, context, snapshotState4CollectAsStateWithLifecycle, dashboardType), composerStartRestartGroup, 54), null, false, topBarScrollState.getShowDivider(), !(DashboardAppBar$lambda$2(snapshotState4CollectAsStateWithLifecycle).getNavigationIcon() instanceof NavigationIcon.CurrencySwitcher) ? AppBarType.CENTER_ALIGNED : AppBarType.DEFAULT, null, 0L, windowInsetsWindowInsets$default, composer2, 3462, 0, 816);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(dashboardAppBarDuxo2) | composerStartRestartGroup.changedInstance(dashboardType);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DashboardAppBar4(dashboardAppBarDuxo2, dashboardType, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(dashboardType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i9 & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    function05 = function06;
                    dashboardAppBarDuxo3 = dashboardAppBarDuxo2;
                    z3 = zBooleanValue;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.appbar.DashboardAppBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return DashboardAppBar3.DashboardAppBar$lambda$4(dashboardType, topBarScrollState, modifier4, dashboardAppBarDuxo3, function05, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            function02 = function0;
            if ((196608 & i) == 0) {
            }
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 8) == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 32) == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final SnapshotState4<DashboardAppBarViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(dashboardAppBarDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceGroup(1081259791);
                    WindowInsets windowInsetsWindowInsets$default2 = !zBooleanValue ? WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 13, null) : TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, TopAppBarDefaults.$stable);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier3;
                    Function0<Unit> function062 = function04;
                    Composer composer22 = composerStartRestartGroup;
                    int i92 = i5;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-976967642, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.appbar.DashboardAppBarKt.DashboardAppBar.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-976967642, i10, -1, "com.robinhood.android.dashboard.lib.appbar.DashboardAppBar.<anonymous> (DashboardAppBar.kt:68)");
                            }
                            Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, topBarScrollState.getOpacity());
                            Alignment.Horizontal centerHorizontally = DashboardAppBar3.DashboardAppBar$lambda$2(snapshotState4CollectAsStateWithLifecycle2).getNavigationIcon() instanceof NavigationIcon.CurrencySwitcher ? Alignment.INSTANCE.getCenterHorizontally() : Alignment.INSTANCE.getStart();
                            SnapshotState4<DashboardAppBarViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAlpha);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String string2 = StringResource2.getString(DashboardAppBar3.DashboardAppBar$lambda$2(snapshotState4).getPrimaryText(), composer3, StringResource.$stable);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i11).getTextL(), composer3, 0, 0, 8190);
                            String secondaryText = DashboardAppBar3.DashboardAppBar$lambda$2(snapshotState4).getSecondaryText();
                            composer3.startReplaceGroup(-202529541);
                            if (secondaryText != null) {
                                BentoText2.m20747BentoText38GnDrw(secondaryText, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i11).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i11).getTextS(), composer3, 0, 0, 8186);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ModifiersKt.performanceIndicator(modifier3, DashboardAppBar$lambda$2(snapshotState4CollectAsStateWithLifecycle2).loadedState()), ComposableLambda3.rememberComposableLambda(-955642798, true, new C137043(function04, navigator2, context2, snapshotState4CollectAsStateWithLifecycle2), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1859875247, true, new C137054(navigator2, context2, snapshotState4CollectAsStateWithLifecycle2, dashboardType), composerStartRestartGroup, 54), null, false, topBarScrollState.getShowDivider(), !(DashboardAppBar$lambda$2(snapshotState4CollectAsStateWithLifecycle2).getNavigationIcon() instanceof NavigationIcon.CurrencySwitcher) ? AppBarType.CENTER_ALIGNED : AppBarType.DEFAULT, null, 0L, windowInsetsWindowInsets$default2, composer22, 3462, 0, 816);
                    composerStartRestartGroup = composer22;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(dashboardAppBarDuxo2) | composerStartRestartGroup.changedInstance(dashboardType);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new DashboardAppBar4(dashboardAppBarDuxo2, dashboardType, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(dashboardType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i92 & 14);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier52;
                        function05 = function062;
                        dashboardAppBarDuxo3 = dashboardAppBarDuxo2;
                        z3 = zBooleanValue;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((196608 & i) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DashboardAppBarViewState DashboardAppBar$lambda$2(SnapshotState4<DashboardAppBarViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: DashboardAppBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.appbar.DashboardAppBarKt$DashboardAppBar$4 */
    static final class C137054 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ HomeDashboardType $dashboardType;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ SnapshotState4<DashboardAppBarViewState> $viewState$delegate;

        C137054(Navigator navigator, Context context, SnapshotState4<DashboardAppBarViewState> snapshotState4, HomeDashboardType homeDashboardType) {
            this.$navigator = navigator;
            this.$context = context;
            this.$viewState$delegate = snapshotState4;
            this.$dashboardType = homeDashboardType;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, HomeDashboardType homeDashboardType, SnapshotState4 snapshotState4) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new SearchFragmentKey(null, null, homeDashboardType.getAccountNumber(), DashboardAppBar3.DashboardAppBar$lambda$2(snapshotState4).getSearchSource(), null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1859875247, i, -1, "com.robinhood.android.dashboard.lib.appbar.DashboardAppBar.<anonymous> (DashboardAppBar.kt:92)");
            }
            composer.startReplaceGroup(-633715939);
            if (DashboardAppBar3.DashboardAppBar$lambda$2(this.$viewState$delegate).getShowSearch()) {
                Modifier modifierAutoLogEventsWith$default = com.robinhood.android.dashboard.lib.ModifiersKt.autoLogEventsWith$default(Modifier.INSTANCE, false, false, null, null, UserInteractionEventData.Action.VIEW_SEARCH, null, new Component(Component.ComponentType.BUTTON, AssetHomeTopAppBar.SEARCH_IDENTIFIER, null, 4, null), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, null);
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$dashboardType);
                final Navigator navigator = this.$navigator;
                final Context context = this.$context;
                final HomeDashboardType homeDashboardType = this.$dashboardType;
                final SnapshotState4<DashboardAppBarViewState> snapshotState4 = this.$viewState$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.lib.appbar.DashboardAppBarKt$DashboardAppBar$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DashboardAppBar3.C137054.invoke$lambda$1$lambda$0(navigator, context, homeDashboardType, snapshotState4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                SearchIconButton3.SearchIconButton((Function0) objRememberedValue, modifierAutoLogEventsWith$default, composer, 0, 0);
            }
            composer.endReplaceGroup();
            Modifier modifierAutoLogEventsWith$default2 = com.robinhood.android.dashboard.lib.ModifiersKt.autoLogEventsWith$default(Modifier.INSTANCE, false, false, null, null, UserInteractionEventData.Action.VIEW_INBOX, null, new Component(Component.ComponentType.BUTTON, "top_nav-inbox", null, 4, null), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, null);
            boolean shouldShowInboxBadge = DashboardAppBar3.DashboardAppBar$lambda$2(this.$viewState$delegate).getShouldShowInboxBadge();
            boolean inboxBadgeIsCritical = DashboardAppBar3.DashboardAppBar$lambda$2(this.$viewState$delegate).getInboxBadgeIsCritical();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
            final Navigator navigator2 = this.$navigator;
            final Context context2 = this.$context;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.dashboard.lib.appbar.DashboardAppBarKt$DashboardAppBar$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DashboardAppBar3.C137054.invoke$lambda$3$lambda$2(navigator2, context2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            InboxIconButton4.InboxIconButton(shouldShowInboxBadge, inboxBadgeIsCritical, (Function0) objRememberedValue2, modifierAutoLogEventsWith$default2, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Navigator navigator, Context context) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, LegacyFragmentKey.InboxThreadList.INSTANCE, false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: DashboardAppBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.appbar.DashboardAppBarKt$DashboardAppBar$3 */
    static final class C137043 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function0<Unit> $onFxSwitcherClicked;
        final /* synthetic */ SnapshotState4<DashboardAppBarViewState> $viewState$delegate;

        C137043(Function0<Unit> function0, Navigator navigator, Context context, SnapshotState4<DashboardAppBarViewState> snapshotState4) {
            this.$onFxSwitcherClicked = function0;
            this.$navigator = navigator;
            this.$context = context;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-955642798, i, -1, "com.robinhood.android.dashboard.lib.appbar.DashboardAppBar.<anonymous> (DashboardAppBar.kt:132)");
            }
            final NavigationIcon navigationIcon = DashboardAppBar3.DashboardAppBar$lambda$2(this.$viewState$delegate).getNavigationIcon();
            if (navigationIcon instanceof NavigationIcon.CurrencySwitcher) {
                composer.startReplaceGroup(1783758396);
                DisplayCurrencySwitcher.DisplayCurrencySwitcher(((NavigationIcon.CurrencySwitcher) navigationIcon).getAccountNumber(), DisplayCurrencySwitcherLocation.HOME_TAB, TestTag3.testTag(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), DashboardAppBar3.CurrencySwitcherTestTag), null, false, false, false, this.$onFxSwitcherClicked, null, composer, 432, 376);
                composer.endReplaceGroup();
            } else if (navigationIcon instanceof NavigationIcon.Settings) {
                composer.startReplaceGroup(1784258240);
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(navigationIcon);
                final Navigator navigator = this.$navigator;
                final Context context = this.$context;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.lib.appbar.DashboardAppBarKt$DashboardAppBar$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DashboardAppBar3.C137043.invoke$lambda$1$lambda$0(navigator, context, navigationIcon);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                IconButton5.IconButton((Function0) objRememberedValue, com.robinhood.android.dashboard.lib.ModifiersKt.autoLogEventsWith$default(Modifier.INSTANCE, false, false, null, null, UserInteractionEventData.Action.VIEW_SETTINGS, null, new Component(Component.ComponentType.BUTTON, "top_nav-settings", null, 4, null), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, null), false, null, null, DashboardAppBar.INSTANCE.m13188getLambda$7930348$lib_account_home_externalDebug(), composer, 196608, 28);
                composer.endReplaceGroup();
            } else {
                if (navigationIcon != null) {
                    composer.startReplaceGroup(750276215);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(1785314286);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, NavigationIcon navigationIcon) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, ((NavigationIcon.Settings) navigationIcon).getKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }
    }
}
