package com.robinhood.android.eventcontracts.hub.p134v2.navigation;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import com.robinhood.android.eventcontracts.hub.p134v2.root.HubInitialLoadingComposable6;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: HubRootNavGraph.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\u001a+\u0010\t\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"hubRootNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "initialEntryPointIdentifier", "", "initialNodeId", "Ljava/util/UUID;", "HubRootComposeNavigationComposable", "(Ljava/lang/String;Landroidx/navigation/NavHostController;Ljava/util/UUID;Landroidx/compose/runtime/Composer;II)V", "feature-hub-v2_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.navigation.HubRootNavGraphKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubRootNavGraph3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubRootComposeNavigationComposable$lambda$3(String str, NavHostController navHostController, UUID uuid, int i, int i2, Composer composer, int i3) {
        HubRootComposeNavigationComposable(str, navHostController, uuid, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void hubRootNavGraph$default(NavGraphBuilder navGraphBuilder, NavHostController navHostController, String str, UUID uuid, int i, Object obj) {
        if ((i & 4) != 0) {
            uuid = null;
        }
        hubRootNavGraph(navGraphBuilder, navHostController, str, uuid);
    }

    public static final void hubRootNavGraph(NavGraphBuilder navGraphBuilder, final NavHostController navController, final String initialEntryPointIdentifier, final UUID uuid) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(initialEntryPointIdentifier, "initialEntryPointIdentifier");
        NavGraphBuilders.navigation(navGraphBuilder, HubRootNavGraphDestinations.INSTANCE, HubRootNavGraphDestinations3.INSTANCE, new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.navigation.HubRootNavGraphKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HubRootNavGraph3.hubRootNavGraph$lambda$0(navController, initialEntryPointIdentifier, uuid, (NavGraphBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hubRootNavGraph$lambda$0(NavHostController navHostController, final String str, final UUID uuid, NavGraphBuilder navigation) {
        Intrinsics.checkNotNullParameter(navigation, "$this$navigation");
        NavGraphBuilders.composable(navigation, navHostController, HubRootNavGraphDestinations.INSTANCE, ComposableLambda3.composableLambdaInstance(-1887761202, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.navigation.HubRootNavGraphKt$hubRootNavGraph$1$1
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
                invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, LifecycleAwareNavigator unused$var$2, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
                Intrinsics.checkNotNullParameter(unused$var$2, "$unused$var$");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1887761202, i, -1, "com.robinhood.android.eventcontracts.hub.v2.navigation.hubRootNavGraph.<anonymous>.<anonymous> (HubRootNavGraph.kt:29)");
                }
                HubInitialLoadingComposable6.HubInitialLoadingComposable(str, uuid, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navigation, navHostController, HubRootNavGraphDestinations2.INSTANCE, HubRootNavGraph.INSTANCE.getLambda$2096202629$feature_hub_v2_externalDebug());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HubRootComposeNavigationComposable(final String initialEntryPointIdentifier, NavHostController navHostController, UUID uuid, Composer composer, final int i, final int i2) {
        int i3;
        NavHostController navHostControllerRememberNavController;
        UUID uuid2;
        int i4;
        final UUID uuid3;
        final NavHostController navHostController2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final UUID uuid4;
        final NavHostController navHostController3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(initialEntryPointIdentifier, "initialEntryPointIdentifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1513895121);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(initialEntryPointIdentifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                navHostControllerRememberNavController = navHostController;
                int i5 = composerStartRestartGroup.changedInstance(navHostControllerRememberNavController) ? 32 : 16;
                i3 |= i5;
            } else {
                navHostControllerRememberNavController = navHostController;
            }
            i3 |= i5;
        } else {
            navHostControllerRememberNavController = navHostController;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                uuid2 = uuid;
                i3 |= composerStartRestartGroup.changedInstance(uuid2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if ((i2 & 2) != 0) {
                        navHostControllerRememberNavController = NavHostController2.rememberNavController(new Navigator[0], composerStartRestartGroup, 0);
                        i3 &= -113;
                    }
                    if (i6 == 0) {
                        NavHostController navHostController4 = navHostControllerRememberNavController;
                        i4 = i3;
                        uuid3 = null;
                        navHostController2 = navHostController4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1513895121, i4, -1, "com.robinhood.android.eventcontracts.hub.v2.navigation.HubRootComposeNavigationComposable (HubRootNavGraph.kt:44)");
                    }
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(navHostController2) | ((i4 & 14) == 4) | composerStartRestartGroup.changedInstance(uuid3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.navigation.HubRootNavGraphKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return HubRootNavGraph3.HubRootComposeNavigationComposable$lambda$2$lambda$1(navHostController2, initialEntryPointIdentifier, uuid3, (NavGraphBuilder) obj, (NavHostController) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    GenericNavHost.m20570GenericNavHostuDo3WH8(navHostController2, extensions2.persistentSetOf((Function2) objRememberedValue), HubRootNavGraphDestinations3.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, composerStartRestartGroup, ((i4 >> 3) & 14) | (ComposableDestination.$stable << 6), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    uuid4 = uuid3;
                    navHostController3 = navHostController2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                }
                navHostController2 = navHostControllerRememberNavController;
                i4 = i3;
                uuid3 = uuid2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(navHostController2) | ((i4 & 14) == 4) | composerStartRestartGroup.changedInstance(uuid3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue = new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.navigation.HubRootNavGraphKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HubRootNavGraph3.HubRootComposeNavigationComposable$lambda$2$lambda$1(navHostController2, initialEntryPointIdentifier, uuid3, (NavGraphBuilder) obj, (NavHostController) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    GenericNavHost.m20570GenericNavHostuDo3WH8(navHostController2, extensions2.persistentSetOf((Function2) objRememberedValue), HubRootNavGraphDestinations3.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, composerStartRestartGroup, ((i4 >> 3) & 14) | (ComposableDestination.$stable << 6), 16);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    uuid4 = uuid3;
                    navHostController3 = navHostController2;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                navHostController3 = navHostControllerRememberNavController;
                uuid4 = uuid2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.navigation.HubRootNavGraphKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HubRootNavGraph3.HubRootComposeNavigationComposable$lambda$3(initialEntryPointIdentifier, navHostController3, uuid4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        uuid2 = uuid;
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                }
                if (i6 == 0) {
                    navHostController2 = navHostControllerRememberNavController;
                    i4 = i3;
                    uuid3 = uuid2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(navHostController2) | ((i4 & 14) == 4) | composerStartRestartGroup.changedInstance(uuid3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubRootComposeNavigationComposable$lambda$2$lambda$1(NavHostController navHostController, String str, UUID uuid, NavGraphBuilder persistentSetOf, NavHostController it) {
        Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
        Intrinsics.checkNotNullParameter(it, "it");
        hubRootNavGraph(persistentSetOf, navHostController, str, uuid);
        return Unit.INSTANCE;
    }
}
