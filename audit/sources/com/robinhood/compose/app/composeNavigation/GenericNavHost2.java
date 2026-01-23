package com.robinhood.compose.app.composeNavigation;

import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHost;
import com.robinhood.android.navigation.compose.destination.BaseComposableDestination;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableSet;

/* compiled from: GenericNavHost.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.app.composeNavigation.GenericNavHostKt$GenericNavHost$1, reason: use source file name */
/* loaded from: classes15.dex */
final class GenericNavHost2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> $navGraphBuilders;
    final /* synthetic */ long $navHostBackgroundColor;
    final /* synthetic */ BaseComposableDestination $startDestination;

    /* JADX WARN: Multi-variable type inference failed */
    GenericNavHost2(long j, BaseComposableDestination baseComposableDestination, NavHostController navHostController, ImmutableSet<? extends Function2<? super NavGraphBuilder, ? super NavHostController, Unit>> immutableSet) {
        this.$navHostBackgroundColor = j;
        this.$startDestination = baseComposableDestination;
        this.$navController = navHostController;
        this.$navGraphBuilders = immutableSet;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650635020, i, -1, "com.robinhood.compose.app.composeNavigation.GenericNavHost.<anonymous> (GenericNavHost.kt:47)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.$navHostBackgroundColor, null, 2, null);
        String routePath = this.$startDestination.getRoutePath();
        NavHostController navHostController = this.$navController;
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$navGraphBuilders) | composer.changedInstance(this.$navController);
        final ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> immutableSet = this.$navGraphBuilders;
        final NavHostController navHostController2 = this.$navController;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.compose.app.composeNavigation.GenericNavHostKt$GenericNavHost$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GenericNavHost2.invoke$lambda$2$lambda$1(immutableSet, navHostController2, (NavGraphBuilder) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        NavHost.NavHost(navHostController, routePath, modifierM4872backgroundbw27NRU$default, null, "nav_host_route", null, null, null, null, (Function1) objRememberedValue, composer, 24576, 488);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(ImmutableSet immutableSet, NavHostController navHostController, NavGraphBuilder NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        Iterator<E> it = immutableSet.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(NavHost, navHostController);
        }
        return Unit.INSTANCE;
    }
}
