package com.robinhood.android.dashboard.lib.header.brokerage.pill;

import android.content.Context;
import android.net.Uri;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.android.dashboard.lib.header.brokerage.pill.NuxPillVisibilityExperiment;
import com.robinhood.android.dashboardpill.DashboardPillData;
import com.robinhood.android.dashboardpill.DashboardPillData2;
import com.robinhood.android.dashboardpill.p096ui.DashboardPillButton5;
import com.robinhood.android.dashboardpill.p096ui.VisibilityTracking2;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;

/* compiled from: UpsellPillComponent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"UpsellPillComponent", "", "dashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "modifier", "Landroidx/compose/ui/Modifier;", "showPillInNuxVariant", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/NuxPillVisibilityExperiment$Variant;", "duxo", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDuxo;", "(Lcom/robinhood/android/home/contracts/HomeDashboardType;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/NuxPillVisibilityExperiment$Variant;Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-account-home_externalDebug", "viewState", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.header.brokerage.pill.UpsellPillComponentKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class UpsellPillComponent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpsellPillComponent$lambda$8(HomeDashboardType homeDashboardType, Modifier modifier, NuxPillVisibilityExperiment.Variant variant, DashboardHeaderPillDuxo dashboardHeaderPillDuxo, int i, int i2, Composer composer, int i3) {
        UpsellPillComponent(homeDashboardType, modifier, variant, dashboardHeaderPillDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpsellPillComponent(final HomeDashboardType dashboardType, Modifier modifier, NuxPillVisibilityExperiment.Variant variant, DashboardHeaderPillDuxo dashboardHeaderPillDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        DashboardHeaderPillDuxo dashboardHeaderPillDuxo2;
        Modifier modifier3;
        NuxPillVisibilityExperiment.Variant variant2;
        int i5;
        int i6;
        final DashboardHeaderPillDuxo dashboardHeaderPillDuxo3;
        int i7;
        Object objRememberedValue;
        Continuation continuation;
        Object objRememberedValue2;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        Context context;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final DashboardPillData dashboardPillData;
        final DashboardHeaderPillDuxo dashboardHeaderPillDuxo4;
        final Modifier modifier4;
        final NuxPillVisibilityExperiment.Variant variant3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
        Composer composerStartRestartGroup = composer.startRestartGroup(2024327432);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(dashboardType) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(variant == null ? -1 : variant.ordinal()) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    dashboardHeaderPillDuxo2 = dashboardHeaderPillDuxo;
                    int i9 = composerStartRestartGroup.changedInstance(dashboardHeaderPillDuxo2) ? 2048 : 1024;
                    i3 |= i9;
                } else {
                    dashboardHeaderPillDuxo2 = dashboardHeaderPillDuxo;
                }
                i3 |= i9;
            } else {
                dashboardHeaderPillDuxo2 = dashboardHeaderPillDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    variant2 = i4 == 0 ? null : variant;
                    if ((i2 & 8) == 0) {
                        String str = "brokerage_dashboard_" + dashboardType.getAccountNumber();
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i5 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DashboardHeaderPillDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.pill.UpsellPillComponentKt$UpsellPillComponent$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.pill.UpsellPillComponentKt$UpsellPillComponent$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        DashboardHeaderPillDuxo dashboardHeaderPillDuxo5 = (DashboardHeaderPillDuxo) baseDuxo;
                        i6 = i3 & (-7169);
                        dashboardHeaderPillDuxo3 = dashboardHeaderPillDuxo5;
                    } else {
                        i5 = 0;
                        i6 = i3;
                        dashboardHeaderPillDuxo3 = dashboardHeaderPillDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i6 = i3;
                    modifier3 = modifier2;
                    dashboardHeaderPillDuxo3 = dashboardHeaderPillDuxo2;
                    i5 = 0;
                    variant2 = variant;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2024327432, i6, -1, "com.robinhood.android.dashboard.lib.header.brokerage.pill.UpsellPillComponent (UpsellPillComponent.kt:27)");
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                i7 = (composerStartRestartGroup.changedInstance(dashboardHeaderPillDuxo3) ? 1 : 0) | (composerStartRestartGroup.changedInstance(dashboardType) ? 1 : 0) | ((i6 & 896) != 256 ? 1 : i5);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i7 == 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    continuation = null;
                    objRememberedValue = new UpsellPillComponent2(dashboardHeaderPillDuxo3, dashboardType, variant2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    continuation = null;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(dashboardType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i6 & 14);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                coroutineScope = (CoroutineScope) objRememberedValue2;
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(dashboardHeaderPillDuxo3) | composerStartRestartGroup.changedInstance(coroutineScope);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new UpsellPillComponent3(context, dashboardHeaderPillDuxo3, coroutineScope, continuation);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(coroutineScope, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i5);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(dashboardHeaderPillDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                dashboardPillData = UpsellPillComponent$lambda$2(snapshotState4CollectAsStateWithLifecycle).getDashboardPillData();
                if (dashboardPillData != null) {
                    Clock clock = dashboardHeaderPillDuxo3.getClock();
                    Modifier modifierTrackDashboardPillVisibility = VisibilityTracking2.trackDashboardPillVisibility(modifier3, DashboardPillData2.HOME_TAB);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(dashboardPillData) | composerStartRestartGroup.changedInstance(dashboardHeaderPillDuxo3) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context2);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.pill.UpsellPillComponentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UpsellPillComponent.UpsellPillComponent$lambda$7$lambda$6$lambda$5(dashboardPillData, navigator, context2, dashboardHeaderPillDuxo3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    DashboardPillButton5.DashboardPillButton(clock, dashboardPillData, modifierTrackDashboardPillVisibility, (Function0) objRememberedValue5, composerStartRestartGroup, DashboardPillData.$stable << 3, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                NuxPillVisibilityExperiment.Variant variant4 = variant2;
                dashboardHeaderPillDuxo4 = dashboardHeaderPillDuxo3;
                modifier4 = modifier3;
                variant3 = variant4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                variant3 = variant;
                modifier4 = modifier2;
                dashboardHeaderPillDuxo4 = dashboardHeaderPillDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.header.brokerage.pill.UpsellPillComponentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UpsellPillComponent.UpsellPillComponent$lambda$8(dashboardType, modifier4, variant3, dashboardHeaderPillDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                i7 = (composerStartRestartGroup.changedInstance(dashboardHeaderPillDuxo3) ? 1 : 0) | (composerStartRestartGroup.changedInstance(dashboardType) ? 1 : 0) | ((i6 & 896) != 256 ? 1 : i5);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i7 == 0) {
                    continuation = null;
                    objRememberedValue = new UpsellPillComponent2(dashboardHeaderPillDuxo3, dashboardType, variant2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(dashboardType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i6 & 14);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue2;
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(dashboardHeaderPillDuxo3) | composerStartRestartGroup.changedInstance(coroutineScope);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue3 = new UpsellPillComponent3(context, dashboardHeaderPillDuxo3, coroutineScope, continuation);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(coroutineScope, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i5);
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(dashboardHeaderPillDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        final Context context22 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        dashboardPillData = UpsellPillComponent$lambda$2(snapshotState4CollectAsStateWithLifecycle2).getDashboardPillData();
                        if (dashboardPillData != null) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        NuxPillVisibilityExperiment.Variant variant42 = variant2;
                        dashboardHeaderPillDuxo4 = dashboardHeaderPillDuxo3;
                        modifier4 = modifier3;
                        variant3 = variant42;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpsellPillComponent$lambda$7$lambda$6$lambda$5(DashboardPillData dashboardPillData, Navigator navigator, Context context, DashboardHeaderPillDuxo dashboardHeaderPillDuxo) {
        IntentKey defaultNavigationKey;
        String pillIdentifier;
        if (Intrinsics.areEqual(dashboardPillData.getShowNotificationDot(), Boolean.TRUE) && (pillIdentifier = dashboardPillData.getPillIdentifier()) != null) {
            dashboardHeaderPillDuxo.onNotificationDotCleared(pillIdentifier);
        }
        String actionUrl = dashboardPillData.getActionUrl();
        if (!Navigator.DefaultImpls.handleDeepLink$default(navigator, context, actionUrl != null ? Uri.parse(actionUrl) : null, null, null, false, null, 44, null) && (defaultNavigationKey = dashboardPillData.getDefaultNavigationKey()) != null) {
            Navigator.DefaultImpls.startActivity$default(navigator, context, defaultNavigationKey, null, false, null, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    private static final DashboardHeaderPillViewState UpsellPillComponent$lambda$2(SnapshotState4<DashboardHeaderPillViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
