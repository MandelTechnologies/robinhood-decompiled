package com.robinhood.android.equities.rhvtrailer;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraph;
import com.robinhood.android.equities.rhvtrailer.landing.RhvTrailerLandingSceen3;
import com.robinhood.android.equities.rhvtrailer.post.RhvPostTrailerScreen3;
import com.robinhood.android.equities.rhvtrailer.video.RhvTrailerVideoScreen4;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavControllers;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import com.robinhood.android.navigation.compose.NavOptionsBuilders;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import ventures.trailer.proto.p551v1.GetTrailerResponseDto;

/* compiled from: RhvTrailerNavGraph.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0000¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, m3636d2 = {"rhvTrailerNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "onExitNavGraph", "Lkotlin/Function0;", "feature-rhv-trailer_externalDebug", "viewState", "Lcom/robinhood/android/equities/rhvtrailer/RhvTrailerViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraphKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class RhvTrailerNavGraph {

    /* compiled from: RhvTrailerNavGraph.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraphKt$rhvTrailerNavGraph$1 */
    static final class C147561 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ Function0<Unit> $onExitNavGraph;

        C147561(NavHostController navHostController, Function0<Unit> function0) {
            this.$navController = navHostController;
            this.$onExitNavGraph = function0;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry backStackEntry, LifecycleAwareNavigator navigator, Composer composer, int i) {
            Result resultM28549boximpl;
            String redirect_deeplink_url;
            Object objM28550constructorimpl;
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-729962001, i, -1, "com.robinhood.android.equities.rhvtrailer.rhvTrailerNavGraph.<anonymous> (RhvTrailerNavGraph.kt:23)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(backStackEntry);
            NavHostController navHostController = this.$navController;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = navHostController.getBackStackEntry(navHostController.getGraph().getId());
                composer.updateRememberedValue(objRememberedValue);
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-747520797);
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(navBackStackEntry, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(RhvTrailerDuxo.class), navBackStackEntry, (String) null, factoryCreateViewModelFactory, navBackStackEntry != null ? navBackStackEntry.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraphKt$rhvTrailerNavGraph$1$invoke$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraphKt$rhvTrailerNavGraph$1$invoke$$inlined$duxo$1.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle2.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
            composer.endReplaceGroup();
            RhvTrailerDuxo rhvTrailerDuxo = (RhvTrailerDuxo) baseDuxo;
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(rhvTrailerDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7);
            UriHandler uriHandler = (UriHandler) composer.consume(CompositionLocalsKt.getLocalUriHandler());
            GetTrailerResponseDto trailerData = invoke$lambda$1(snapshotState4CollectAsStateWithLifecycle).getTrailerData();
            if (trailerData == null || (redirect_deeplink_url = trailerData.getRedirect_deeplink_url()) == null) {
                resultM28549boximpl = null;
            } else {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    uriHandler.openUri(redirect_deeplink_url);
                    objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                resultM28549boximpl = Result.m28549boximpl(objM28550constructorimpl);
            }
            if (resultM28549boximpl == null) {
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(this.$navController);
                final NavHostController navHostController2 = this.$navController;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraphKt$rhvTrailerNavGraph$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RhvTrailerNavGraph.C147561.invoke$lambda$5$lambda$4(navHostController2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                RhvTrailerLandingSceen3.RhvTrailerLandingScreen((Function0) objRememberedValue3, this.$onExitNavGraph, rhvTrailerDuxo, null, composer, 0, 8);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(NavHostController navHostController) throws Resources.NotFoundException {
            NavControllers.navigate$default(navHostController, TrailerVideoDestination.INSTANCE, null, null, null, 14, null);
            return Unit.INSTANCE;
        }

        private static final RhvTrailerViewState invoke$lambda$1(SnapshotState4<RhvTrailerViewState> snapshotState4) {
            return snapshotState4.getValue();
        }
    }

    public static final void rhvTrailerNavGraph(NavGraphBuilder navGraphBuilder, final NavHostController navController, final Function0<Unit> onExitNavGraph) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(onExitNavGraph, "onExitNavGraph");
        NavGraphBuilders.composable(navGraphBuilder, navController, TrailerLandingDestination.INSTANCE, ComposableLambda3.composableLambdaInstance(-729962001, true, new C147561(navController, onExitNavGraph)));
        NavGraphBuilders.composable(navGraphBuilder, navController, TrailerVideoDestination.INSTANCE, ComposableLambda3.composableLambdaInstance(-560765736, true, new C147572(navController)));
        NavGraphBuilders.composable(navGraphBuilder, navController, PostTrailerDestination.INSTANCE, ComposableLambda3.composableLambdaInstance(-1222355209, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraphKt.rhvTrailerNavGraph.3
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
                invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry backStackEntry, LifecycleAwareNavigator navigator, Composer composer, int i) {
                CreationExtras defaultViewModelCreationExtras;
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1222355209, i, -1, "com.robinhood.android.equities.rhvtrailer.rhvTrailerNavGraph.<anonymous> (RhvTrailerNavGraph.kt:71)");
                }
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(backStackEntry);
                NavHostController navHostController = navController;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = navHostController.getBackStackEntry(navHostController.getGraph().getId());
                    composer.updateRememberedValue(objRememberedValue);
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-747520797);
                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(navBackStackEntry, composer, 0);
                composer.startReplaceableGroup(1729797275);
                if (navBackStackEntry != null) {
                    defaultViewModelCreationExtras = navBackStackEntry.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(RhvTrailerDuxo.class), navBackStackEntry, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer, 0, 0);
                composer.endReplaceableGroup();
                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraphKt$rhvTrailerNavGraph$3$invoke$$inlined$duxo$1
                        @Override // kotlin.jvm.functions.Function1
                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                            lifecycle.addObserver(duxoLifecycleObserver);
                            final Lifecycle lifecycle2 = lifecycle;
                            return new DisposableEffectResult() { // from class: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraphKt$rhvTrailerNavGraph$3$invoke$$inlined$duxo$1.1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    lifecycle2.removeObserver(duxoLifecycleObserver);
                                }
                            };
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
                composer.endReplaceGroup();
                RhvPostTrailerScreen3.RhvPostTrailerScreen(onExitNavGraph, (RhvTrailerDuxo) baseDuxo, null, composer, 0, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* compiled from: RhvTrailerNavGraph.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraphKt$rhvTrailerNavGraph$2 */
    static final class C147572 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
        final /* synthetic */ NavHostController $navController;

        C147572(NavHostController navHostController) {
            this.$navController = navHostController;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry backStackEntry, final LifecycleAwareNavigator navigator, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-560765736, i, -1, "com.robinhood.android.equities.rhvtrailer.rhvTrailerNavGraph.<anonymous> (RhvTrailerNavGraph.kt:47)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(backStackEntry);
            NavHostController navHostController = this.$navController;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = navHostController.getBackStackEntry(navHostController.getGraph().getId());
                composer.updateRememberedValue(objRememberedValue);
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-747520797);
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(navBackStackEntry, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(RhvTrailerDuxo.class), navBackStackEntry, (String) null, factoryCreateViewModelFactory, navBackStackEntry != null ? navBackStackEntry.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraphKt$rhvTrailerNavGraph$2$invoke$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraphKt$rhvTrailerNavGraph$2$invoke$$inlined$duxo$1.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle2.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
            composer.endReplaceGroup();
            RhvTrailerDuxo rhvTrailerDuxo = (RhvTrailerDuxo) baseDuxo;
            composer.startReplaceGroup(5004770);
            boolean z = (((i & 896) ^ 384) > 256 && composer.changed(navigator)) || (i & 384) == 256;
            Object objRememberedValue3 = composer.rememberedValue();
            if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraphKt$rhvTrailerNavGraph$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhvTrailerNavGraph.C147572.invoke$lambda$3$lambda$2(navigator);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(this.$navController);
            final NavHostController navHostController2 = this.$navController;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraphKt$rhvTrailerNavGraph$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhvTrailerNavGraph.C147572.invoke$lambda$5$lambda$4(navHostController2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            RhvTrailerVideoScreen4.RhvTrailerVideoScreen(function0, (Function0) objRememberedValue4, rhvTrailerDuxo, null, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(NavHostController navHostController) {
            navHostController.popBackStack();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(LifecycleAwareNavigator lifecycleAwareNavigator) throws Resources.NotFoundException {
            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, PostTrailerDestination.INSTANCE, null, null, false, new Function1() { // from class: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavGraphKt$rhvTrailerNavGraph$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhvTrailerNavGraph.C147572.invoke$lambda$3$lambda$2$lambda$1((NavOptionsBuilder) obj);
                }
            }, 14, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(NavOptionsBuilder navigate) {
            Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
            NavOptionsBuilders.popUpTo(navigate, TrailerLandingDestination.INSTANCE.getRoutePath(), true);
            navigate.setLaunchSingleTop(true);
            return Unit.INSTANCE;
        }
    }
}
