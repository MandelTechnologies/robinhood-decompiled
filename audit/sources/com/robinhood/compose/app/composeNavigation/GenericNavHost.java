package com.robinhood.compose.app.composeNavigation;

import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.google.accompanist.navigation.material.BottomSheet3;
import com.google.accompanist.navigation.material.BottomSheetNavigator;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.compose.RememberBottomSheetNavigator;
import com.robinhood.android.navigation.compose.destination.BaseComposableDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;

/* compiled from: GenericNavHost.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001ai\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000326\u0010\u0004\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00010\u0006j\u0002`\u000b¢\u0006\u0002\b\n0\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"GenericNavHost", "", "navController", "Landroidx/navigation/NavHostController;", "navGraphBuilders", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Lkotlin/ParameterName;", "name", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "startDestination", "Lcom/robinhood/android/navigation/compose/destination/BaseComposableDestination;", "navHostBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "GenericNavHost-uDo3WH8", "(Landroidx/navigation/NavHostController;Lkotlinx/collections/immutable/ImmutableSet;Lcom/robinhood/android/navigation/compose/destination/BaseComposableDestination;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NavHostRoute", "", "lib-compose-app_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.app.composeNavigation.GenericNavHostKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class GenericNavHost {
    private static final String NavHostRoute = "nav_host_route";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericNavHost_uDo3WH8$lambda$0(NavHostController navHostController, ImmutableSet immutableSet, BaseComposableDestination baseComposableDestination, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m20570GenericNavHostuDo3WH8(navHostController, immutableSet, baseComposableDestination, j, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* renamed from: GenericNavHost-uDo3WH8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20570GenericNavHostuDo3WH8(final NavHostController navController, final ImmutableSet<? extends Function2<? super NavGraphBuilder, ? super NavHostController, Unit>> navGraphBuilders, final BaseComposableDestination startDestination, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        int i4;
        Modifier modifier2;
        int i5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(navGraphBuilders, "navGraphBuilders");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Composer composerStartRestartGroup = composer.startRestartGroup(2136110009);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(navController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(navGraphBuilders) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(startDestination) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                j2 = j;
                i3 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                i5 = i3;
                if ((i5 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2136110009, i5, -1, "com.robinhood.compose.app.composeNavigation.GenericNavHost (GenericNavHost.kt:38)");
                    }
                    BottomSheetNavigator bottomSheetNavigatorRememberBottomSheetNavigator = RememberBottomSheetNavigator.rememberBottomSheetNavigator(ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, true, composerStartRestartGroup, 3078, 6), composerStartRestartGroup, ModalBottomSheetState.$stable);
                    navController.get_navigatorProvider().addNavigator(bottomSheetNavigatorRememberBottomSheetNavigator);
                    modifier2 = modifier3;
                    BottomSheet3.m9189ModalBottomSheetLayout4erKP6g(bottomSheetNavigatorRememberBottomSheetNavigator, modifier2, null, 0.0f, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1650635020, true, new GenericNavHost2(j2, startDestination, navController, navGraphBuilders), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912 | BottomSheetNavigator.$stable | ((i5 >> 9) & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                final Modifier modifier4 = modifier2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.app.composeNavigation.GenericNavHostKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GenericNavHost.GenericNavHost_uDo3WH8$lambda$0(navController, navGraphBuilders, startDestination, j, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            i5 = i3;
            if ((i5 & 9363) != 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BottomSheetNavigator bottomSheetNavigatorRememberBottomSheetNavigator2 = RememberBottomSheetNavigator.rememberBottomSheetNavigator(ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, true, composerStartRestartGroup, 3078, 6), composerStartRestartGroup, ModalBottomSheetState.$stable);
                navController.get_navigatorProvider().addNavigator(bottomSheetNavigatorRememberBottomSheetNavigator2);
                modifier2 = modifier3;
                BottomSheet3.m9189ModalBottomSheetLayout4erKP6g(bottomSheetNavigatorRememberBottomSheetNavigator2, modifier2, null, 0.0f, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1650635020, true, new GenericNavHost2(j2, startDestination, navController, navGraphBuilders), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912 | BottomSheetNavigator.$stable | ((i5 >> 9) & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            final Modifier modifier42 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        j2 = j;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((i5 & 9363) != 9362) {
        }
        final Modifier modifier422 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
