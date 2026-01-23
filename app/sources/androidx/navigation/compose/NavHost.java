package androidx.navigation.compose;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.p011ui.Alignment;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolder7;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import androidx.view.compose.BackHandler;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.bento.component.rows.Timeline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NavHost.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\u001aÜ\u0001\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u001f\b\u0002\u0010\u000e\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r2\u001f\b\u0002\u0010\u0010\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0002\b\r2\u001f\b\u0002\u0010\u0011\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r2\u001f\b\u0002\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0002\b\r2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\t¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a·\u0001\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001f\b\u0002\u0010\u000e\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r2\u001f\b\u0002\u0010\u0010\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0002\b\r2\u001f\b\u0002\u0010\u0011\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r2\u001f\b\u0002\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0016\u0010\u001a\u001a#\u0010\u001d\u001a\u0004\u0018\u00010\f*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010\u001f\u001a\u0004\u0018\u00010\u000f*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010!\u001a\u0004\u0018\u00010\f*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b!\u0010\u001e\u001a#\u0010\"\u001a\u0004\u0018\u00010\u000f*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\"\u0010 ¨\u0006'²\u0006\u0012\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0#8\nX\u008a\u0084\u0002²\u0006\u0012\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0#8\nX\u008a\u0084\u0002²\u0006\u0012\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0#8\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/navigation/NavHostController;", "navController", "", "startDestination", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", PlaceTypes.ROUTE, "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/ExtensionFunctionType;", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "popEnterTransition", "popExitTransition", "Landroidx/navigation/NavGraphBuilder;", "", "builder", "NavHost", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/navigation/NavGraph;", "graph", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/navigation/NavDestination;", "scope", "createEnterTransition", "(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;", "createExitTransition", "(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ExitTransition;", "createPopEnterTransition", "createPopExitTransition", "", "currentBackStack", "allVisibleEntries", "visibleEntries", "navigation-compose_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.navigation.compose.NavHostKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class NavHost {
    public static final void NavHost(final NavHostController navHostController, final String str, Modifier modifier, Alignment alignment, String str2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function12, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function13, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function14, final Function1<? super NavGraphBuilder, Unit> function15, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function16;
        int i3;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function17;
        Composer composerStartRestartGroup = composer.startRestartGroup(410432995);
        final Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final Alignment center = (i2 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        final String str3 = (i2 & 16) != 0 ? null : str2;
        final Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function18 = (i2 & 32) != 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.3
            @Override // kotlin.jvm.functions.Function1
            public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(Timeline.MIDDLE_META_OFFSET_ANIMATION_DURATION, 0, null, 6, null), 0.0f, 2, null);
            }
        } : function1;
        final Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function19 = (i2 & 64) != 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.4
            @Override // kotlin.jvm.functions.Function1
            public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(Timeline.MIDDLE_META_OFFSET_ANIMATION_DURATION, 0, null, 6, null), 0.0f, 2, null);
            }
        } : function12;
        if ((i2 & 128) != 0) {
            i3 = i & (-29360129);
            function16 = function18;
        } else {
            function16 = function13;
            i3 = i;
        }
        if ((i2 & 256) != 0) {
            i3 &= -234881025;
            function17 = function19;
        } else {
            function17 = function14;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(410432995, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:126)");
        }
        composerStartRestartGroup.startReplaceableGroup(1618982084);
        boolean zChanged = composerStartRestartGroup.changed(str3) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function15);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str3);
            function15.invoke(navGraphBuilder);
            objRememberedValue = navGraphBuilder.build();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i4 = (i3 & 896) | 72 | (i3 & 7168);
        int i5 = i3 >> 3;
        NavHost(navHostController, (NavGraph) objRememberedValue, modifier2, center, function18, function19, function16, function17, composerStartRestartGroup, i4 | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (i5 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function110 = function16;
        final Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function111 = function17;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i6) throws Resources.NotFoundException {
                NavHost.NavHost(navHostController, str, modifier2, center, str3, function18, function19, function110, function111, function15, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
            }
        });
    }

    @SuppressLint({"StateFlowValueCalledInComposition"})
    public static final void NavHost(final NavHostController navHostController, final NavGraph navGraph, Modifier modifier, Alignment alignment, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function12, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function13, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function14, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function15;
        int i3;
        int i4;
        final Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function16;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function17;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1818191915);
        final Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final Alignment center = (i2 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        final Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function18 = (i2 & 16) != 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.8
            @Override // kotlin.jvm.functions.Function1
            public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(Timeline.MIDDLE_META_OFFSET_ANIMATION_DURATION, 0, null, 6, null), 0.0f, 2, null);
            }
        } : function1;
        final Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function19 = (i2 & 32) != 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.9
            @Override // kotlin.jvm.functions.Function1
            public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(Timeline.MIDDLE_META_OFFSET_ANIMATION_DURATION, 0, null, 6, null), 0.0f, 2, null);
            }
        } : function12;
        if ((i2 & 64) != 0) {
            i3 = i & (-3670017);
            function15 = function18;
        } else {
            function15 = function13;
            i3 = i;
        }
        if ((i2 & 128) != 0) {
            i4 = i3 & (-29360129);
            function16 = function19;
        } else {
            i4 = i3;
            function16 = function14;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1818191915, i4, -1, "androidx.navigation.compose.NavHost (NavHost.kt:195)");
        }
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
        }
        navHostController.setViewModelStore(current.getStore());
        navHostController.setGraph(navGraph);
        Navigator navigator = navHostController.get_navigatorProvider().getNavigator("composable");
        final ComposeNavigator composeNavigator = navigator instanceof ComposeNavigator ? (ComposeNavigator) navigator : null;
        if (composeNavigator == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function110 = function15;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$composeNavigator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) throws Resources.NotFoundException {
                    NavHost.NavHost(navHostController, navGraph, modifier2, center, function18, function19, function110, function16, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
            return;
        }
        final Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function111 = function15;
        final Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function112 = function18;
        final Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function113 = function19;
        final Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function114 = function16;
        BackHandler.BackHandler(NavHost$lambda$3(SnapshotStateKt.collectAsState(composeNavigator.getBackStack(), null, composerStartRestartGroup, 8, 1)).size() > 1, new Function0<Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.10
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                navHostController.popBackStack();
            }
        }, composerStartRestartGroup, 0, 0);
        EffectsKt.DisposableEffect(lifecycleOwner, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                navHostController.setLifecycleOwner(lifecycleOwner);
                return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$11$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }
        }, composerStartRestartGroup, 8);
        final SaveableStateHolder saveableStateHolderRememberSaveableStateHolder = SaveableStateHolder7.rememberSaveableStateHolder(composerStartRestartGroup, 0);
        final SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(navHostController.getVisibleEntries(), null, composerStartRestartGroup, 8, 1);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<List<? extends NavBackStackEntry>>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$visibleEntries$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends NavBackStackEntry> invoke() {
                    List listNavHost$lambda$4 = NavHost.NavHost$lambda$4(snapshotState4CollectAsState);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listNavHost$lambda$4) {
                        if (Intrinsics.areEqual(((NavBackStackEntry) obj).getDestination().getNavigatorName(), "composable")) {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList;
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull((List) NavHost$lambda$6(snapshotState4));
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new LinkedHashMap();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Map map = (Map) objRememberedValue2;
        composerStartRestartGroup.startReplaceableGroup(1822177954);
        if (navBackStackEntry != null) {
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged = composerStartRestartGroup.changed(composeNavigator) | composerStartRestartGroup.changed(function111) | composerStartRestartGroup.changed(function112);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$finalEnter$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                        NavDestination destination = animatedContentTransitionScope.getTargetState().getDestination();
                        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                        ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
                        EnterTransition enterTransition = null;
                        if (composeNavigator.isPop$navigation_compose_release().getValue().booleanValue()) {
                            Iterator<NavDestination> itIterator2 = NavDestination.INSTANCE.getHierarchy(destination2).iterator2();
                            while (true) {
                                if (!itIterator2.hasNext()) {
                                    break;
                                }
                                EnterTransition enterTransitionCreatePopEnterTransition = NavHost.createPopEnterTransition(itIterator2.next(), animatedContentTransitionScope);
                                if (enterTransitionCreatePopEnterTransition != null) {
                                    enterTransition = enterTransitionCreatePopEnterTransition;
                                    break;
                                }
                            }
                            return enterTransition == null ? function111.invoke(animatedContentTransitionScope) : enterTransition;
                        }
                        Iterator<NavDestination> itIterator22 = NavDestination.INSTANCE.getHierarchy(destination2).iterator2();
                        while (true) {
                            if (!itIterator22.hasNext()) {
                                break;
                            }
                            EnterTransition enterTransitionCreateEnterTransition = NavHost.createEnterTransition(itIterator22.next(), animatedContentTransitionScope);
                            if (enterTransitionCreateEnterTransition != null) {
                                enterTransition = enterTransitionCreateEnterTransition;
                                break;
                            }
                        }
                        return enterTransition == null ? function112.invoke(animatedContentTransitionScope) : enterTransition;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final Function1 function115 = (Function1) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged2 = composerStartRestartGroup.changed(composeNavigator) | composerStartRestartGroup.changed(function114) | composerStartRestartGroup.changed(function113);
            Modifier modifier3 = modifier2;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$finalExit$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                        NavDestination destination = animatedContentTransitionScope.getInitialState().getDestination();
                        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                        ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
                        ExitTransition exitTransition = null;
                        if (composeNavigator.isPop$navigation_compose_release().getValue().booleanValue()) {
                            Iterator<NavDestination> itIterator2 = NavDestination.INSTANCE.getHierarchy(destination2).iterator2();
                            while (true) {
                                if (!itIterator2.hasNext()) {
                                    break;
                                }
                                ExitTransition exitTransitionCreatePopExitTransition = NavHost.createPopExitTransition(itIterator2.next(), animatedContentTransitionScope);
                                if (exitTransitionCreatePopExitTransition != null) {
                                    exitTransition = exitTransitionCreatePopExitTransition;
                                    break;
                                }
                            }
                            return exitTransition == null ? function114.invoke(animatedContentTransitionScope) : exitTransition;
                        }
                        Iterator<NavDestination> itIterator22 = NavDestination.INSTANCE.getHierarchy(destination2).iterator2();
                        while (true) {
                            if (!itIterator22.hasNext()) {
                                break;
                            }
                            ExitTransition exitTransitionCreateExitTransition = NavHost.createExitTransition(itIterator22.next(), animatedContentTransitionScope);
                            if (exitTransitionCreateExitTransition != null) {
                                exitTransition = exitTransitionCreateExitTransition;
                                break;
                            }
                        }
                        return exitTransition == null ? function113.invoke(animatedContentTransitionScope) : exitTransition;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final Function1 function116 = (Function1) objRememberedValue4;
            function17 = function114;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(navBackStackEntry, "entry", composerStartRestartGroup, 56, 0);
            final ComposeNavigator composeNavigator2 = composeNavigator;
            i5 = 0;
            AnimatedContentKt.AnimatedContent(transitionUpdateTransition, modifier3, new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ContentTransform>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final ContentTransform invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                    float fFloatValue;
                    if (NavHost.NavHost$lambda$6(snapshotState4).contains(animatedContentTransitionScope.getInitialState())) {
                        Float f = map.get(animatedContentTransitionScope.getInitialState().getId());
                        if (f != null) {
                            fFloatValue = f.floatValue();
                        } else {
                            map.put(animatedContentTransitionScope.getInitialState().getId(), Float.valueOf(0.0f));
                            fFloatValue = 0.0f;
                        }
                        if (!Intrinsics.areEqual(animatedContentTransitionScope.getTargetState().getId(), animatedContentTransitionScope.getInitialState().getId())) {
                            fFloatValue = composeNavigator2.isPop$navigation_compose_release().getValue().booleanValue() ? fFloatValue - 1.0f : fFloatValue + 1.0f;
                        }
                        float f2 = fFloatValue;
                        map.put(animatedContentTransitionScope.getTargetState().getId(), Float.valueOf(f2));
                        return new ContentTransform(function115.invoke(animatedContentTransitionScope), function116.invoke(animatedContentTransitionScope), f2, null, 8, null);
                    }
                    return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
                }
            }, center, new Function1<NavBackStackEntry, Object>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(NavBackStackEntry navBackStackEntry2) {
                    return navBackStackEntry2.getId();
                }
            }, ComposableLambda3.composableLambda(composerStartRestartGroup, -1440061047, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.14
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry2, Composer composer2, Integer num) {
                    invoke(animatedContentScope, navBackStackEntry2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry2, Composer composer2, int i6) {
                    Object objPrevious;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1440061047, i6, -1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:301)");
                    }
                    List listNavHost$lambda$6 = NavHost.NavHost$lambda$6(snapshotState4);
                    ListIterator listIterator = listNavHost$lambda$6.listIterator(listNavHost$lambda$6.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        } else {
                            objPrevious = listIterator.previous();
                            if (Intrinsics.areEqual(navBackStackEntry2, (NavBackStackEntry) objPrevious)) {
                                break;
                            }
                        }
                    }
                    final NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) objPrevious;
                    if (navBackStackEntry3 != null) {
                        NavBackStackEntryProvider2.LocalOwnersProvider(navBackStackEntry3, saveableStateHolderRememberSaveableStateHolder, ComposableLambda3.composableLambda(composer2, -1425390790, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.14.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1425390790, i7, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:306)");
                                    }
                                    NavDestination destination = navBackStackEntry3.getDestination();
                                    Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    ((ComposeNavigator.Destination) destination).getContent$navigation_compose_release().invoke(animatedContentScope, navBackStackEntry3, composer3, 72);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i4 & 7168) | ((i4 >> 3) & 112) | 221184, 0);
            modifier2 = modifier3;
            EffectsKt.LaunchedEffect(transitionUpdateTransition.getCurrentState(), transitionUpdateTransition.getTargetState(), new C271815(transitionUpdateTransition, map, snapshotState4, composeNavigator, null), composerStartRestartGroup, 584);
            Boolean bool = Boolean.TRUE;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged3 = composerStartRestartGroup.changed(snapshotState4) | composerStartRestartGroup.changed(composeNavigator);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$16$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final SnapshotState4<List<NavBackStackEntry>> snapshotState42 = snapshotState4;
                        final ComposeNavigator composeNavigator3 = composeNavigator;
                        return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$16$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                Iterator it = NavHost.NavHost$lambda$6(snapshotState42).iterator();
                                while (it.hasNext()) {
                                    composeNavigator3.onTransitionComplete((NavBackStackEntry) it.next());
                                }
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(bool, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 6);
        } else {
            function17 = function114;
            i5 = 0;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Navigator navigator2 = navHostController.get_navigatorProvider().getNavigator("dialog");
        DialogNavigator dialogNavigator = navigator2 instanceof DialogNavigator ? (DialogNavigator) navigator2 : null;
        if (dialogNavigator == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            final Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function117 = function17;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$dialogNavigator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) throws Resources.NotFoundException {
                    NavHost.NavHost(navHostController, navGraph, modifier2, center, function112, function113, function111, function117, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
            return;
        }
        final Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function118 = function17;
        DialogHost.DialogHost(dialogNavigator, composerStartRestartGroup, i5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup3.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.17
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i6) throws Resources.NotFoundException {
                NavHost.NavHost(navHostController, navGraph, modifier2, center, function112, function113, function111, function118, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* compiled from: NavHost.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.navigation.compose.NavHostKt$NavHost$15", m3645f = "NavHost.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$15 */
    static final class C271815 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ComposeNavigator $composeNavigator;
        final /* synthetic */ Transition<NavBackStackEntry> $transition;
        final /* synthetic */ SnapshotState4<List<NavBackStackEntry>> $visibleEntries$delegate;
        final /* synthetic */ Map<String, Float> $zIndices;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C271815(Transition<NavBackStackEntry> transition, Map<String, Float> map, SnapshotState4<? extends List<NavBackStackEntry>> snapshotState4, ComposeNavigator composeNavigator, Continuation<? super C271815> continuation) {
            super(2, continuation);
            this.$transition = transition;
            this.$zIndices = map;
            this.$visibleEntries$delegate = snapshotState4;
            this.$composeNavigator = composeNavigator;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C271815(this.$transition, this.$zIndices, this.$visibleEntries$delegate, this.$composeNavigator, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C271815) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(this.$transition.getCurrentState(), this.$transition.getTargetState())) {
                List listNavHost$lambda$6 = NavHost.NavHost$lambda$6(this.$visibleEntries$delegate);
                ComposeNavigator composeNavigator = this.$composeNavigator;
                Iterator it = listNavHost$lambda$6.iterator();
                while (it.hasNext()) {
                    composeNavigator.onTransitionComplete((NavBackStackEntry) it.next());
                }
                Map<String, Float> map = this.$zIndices;
                Transition<NavBackStackEntry> transition = this.$transition;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Float> entry : map.entrySet()) {
                    if (!Intrinsics.areEqual(entry.getKey(), transition.getTargetState().getId())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Map<String, Float> map2 = this.$zIndices;
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    map2.remove(((Map.Entry) it2.next()).getKey());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition createEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getEnterTransition$navigation_compose_release();
            if (enterTransition$navigation_compose_release2 != null) {
                return enterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (enterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return enterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition createExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getExitTransition$navigation_compose_release();
            if (exitTransition$navigation_compose_release2 != null) {
                return exitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (exitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return exitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition createPopEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopEnterTransition$navigation_compose_release();
            if (popEnterTransition$navigation_compose_release2 != null) {
                return popEnterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popEnterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return popEnterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition createPopExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopExitTransition$navigation_compose_release();
            if (popExitTransition$navigation_compose_release2 != null) {
                return popExitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popExitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return popExitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    private static final List<NavBackStackEntry> NavHost$lambda$3(SnapshotState4<? extends List<NavBackStackEntry>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$4(SnapshotState4<? extends List<NavBackStackEntry>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$6(SnapshotState4<? extends List<NavBackStackEntry>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
