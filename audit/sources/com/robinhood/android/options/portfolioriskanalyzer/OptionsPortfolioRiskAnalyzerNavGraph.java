package com.robinhood.android.options.portfolioriskanalyzer;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.contracts.OptionsPortfolioRiskAnalyzer;
import com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerNavGraph;
import com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchDuxo;
import com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposable3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: OptionsPortfolioRiskAnalyzerNavGraph.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aT\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0000¨\u0006\r"}, m3636d2 = {"optionsPortfolioRiskAnalyzerNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "extras", "Lcom/robinhood/android/options/contracts/OptionsPortfolioRiskAnalyzer$WithAccountNumber;", "navController", "Landroidx/navigation/NavHostController;", "onParentComposableBackPressed", "Lkotlin/Function0;", "onOpenStockDetailPage", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "onOpenAggregateOptionsDetailPage", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerNavGraphKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerNavGraph {
    public static /* synthetic */ void optionsPortfolioRiskAnalyzerNavGraph$default(NavGraphBuilder navGraphBuilder, OptionsPortfolioRiskAnalyzer.WithAccountNumber withAccountNumber, NavHostController navHostController, Function0 function0, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerNavGraphKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        optionsPortfolioRiskAnalyzerNavGraph(navGraphBuilder, withAccountNumber, navHostController, function0, function1, function12);
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerNavGraph.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerNavGraphKt$optionsPortfolioRiskAnalyzerNavGraph$2 */
    static final class C234602 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
        final /* synthetic */ OptionsPortfolioRiskAnalyzer.WithAccountNumber $extras;
        final /* synthetic */ Function1<FragmentKey, Unit> $onOpenAggregateOptionsDetailPage;
        final /* synthetic */ Function1<FragmentKey, Unit> $onOpenStockDetailPage;
        final /* synthetic */ Function0<Unit> $onParentComposableBackPressed;

        /* JADX WARN: Multi-variable type inference failed */
        C234602(Function0<Unit> function0, Function1<? super FragmentKey, Unit> function1, Function1<? super FragmentKey, Unit> function12, OptionsPortfolioRiskAnalyzer.WithAccountNumber withAccountNumber) {
            this.$onParentComposableBackPressed = function0;
            this.$onOpenStockDetailPage = function1;
            this.$onOpenAggregateOptionsDetailPage = function12;
            this.$extras = withAccountNumber;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, final LifecycleAwareNavigator navigator, Composer composer, int i) {
            CreationExtras defaultViewModelCreationExtras;
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-559725954, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.optionsPortfolioRiskAnalyzerNavGraph.<anonymous> (OptionsPortfolioRiskAnalyzerNavGraph.kt:19)");
            }
            SavedStateHandle savedStateHandle = entry.getSavedStateHandle();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = ((((i & 896) ^ 384) > 256 && composer.changed(navigator)) || (i & 384) == 256) | composer.changed(this.$onParentComposableBackPressed);
            final Function0<Unit> function0 = this.$onParentComposableBackPressed;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerNavGraphKt$optionsPortfolioRiskAnalyzerNavGraph$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsPortfolioRiskAnalyzerNavGraph.C234602.invoke$lambda$1$lambda$0(navigator, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            Function1<FragmentKey, Unit> function1 = this.$onOpenStockDetailPage;
            Function1<FragmentKey, Unit> function12 = this.$onOpenAggregateOptionsDetailPage;
            OptionsPortfolioRiskAnalyzer.WithAccountNumber withAccountNumber = this.$extras;
            composer.startReplaceGroup(2050738472);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, withAccountNumber)));
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsPortfolioRiskAnalyzerDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerNavGraphKt$optionsPortfolioRiskAnalyzerNavGraph$2$invoke$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerNavGraphKt$optionsPortfolioRiskAnalyzerNavGraph$2$invoke$$inlined$duxo$1.1
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
            OptionsPortfolioRiskAnalyzerComposableKt.OptionsPortfolioRiskAnalyzerComposable(savedStateHandle, function02, function1, function12, (OptionsPortfolioRiskAnalyzerDuxo) baseDuxo, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator, Function0 function0) {
            if (!LifecycleAwareNavigator.popBackStack$default(lifecycleAwareNavigator, OptionsPortfolioRiskAnalyzerNavDestinations.INSTANCE, true, false, false, 12, null)) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void optionsPortfolioRiskAnalyzerNavGraph(NavGraphBuilder navGraphBuilder, OptionsPortfolioRiskAnalyzer.WithAccountNumber extras, NavHostController navController, Function0<Unit> onParentComposableBackPressed, Function1<? super FragmentKey, Unit> onOpenStockDetailPage, Function1<? super FragmentKey, Unit> onOpenAggregateOptionsDetailPage) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(onParentComposableBackPressed, "onParentComposableBackPressed");
        Intrinsics.checkNotNullParameter(onOpenStockDetailPage, "onOpenStockDetailPage");
        Intrinsics.checkNotNullParameter(onOpenAggregateOptionsDetailPage, "onOpenAggregateOptionsDetailPage");
        NavGraphBuilders.composable(navGraphBuilder, navController, OptionsPortfolioRiskAnalyzerNavDestinations.INSTANCE, ComposableLambda3.composableLambdaInstance(-559725954, true, new C234602(onParentComposableBackPressed, onOpenStockDetailPage, onOpenAggregateOptionsDetailPage, extras)));
        NavGraphBuilders.composable(navGraphBuilder, navController, OptionsPortfolioRiskAnalyzerNavDestinations2.INSTANCE, ComposableLambda3.composableLambdaInstance(301442791, true, new C234613(extras)));
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerNavGraph.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerNavGraphKt$optionsPortfolioRiskAnalyzerNavGraph$3 */
    static final class C234613 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
        final /* synthetic */ OptionsPortfolioRiskAnalyzer.WithAccountNumber $extras;

        C234613(OptionsPortfolioRiskAnalyzer.WithAccountNumber withAccountNumber) {
            this.$extras = withAccountNumber;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, final LifecycleAwareNavigator navigator, Composer composer, int i) {
            CreationExtras defaultViewModelCreationExtras;
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(301442791, i, -1, "com.robinhood.android.options.portfolioriskanalyzer.optionsPortfolioRiskAnalyzerNavGraph.<anonymous> (OptionsPortfolioRiskAnalyzerNavGraph.kt:36)");
            }
            OptionsPortfolioRiskAnalyzerSearchDuxo.Args args = new OptionsPortfolioRiskAnalyzerSearchDuxo.Args(this.$extras.getAccountNumber());
            composer.startReplaceGroup(2050738472);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, args)));
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsPortfolioRiskAnalyzerSearchDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerNavGraphKt$optionsPortfolioRiskAnalyzerNavGraph$3$invoke$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerNavGraphKt$optionsPortfolioRiskAnalyzerNavGraph$3$invoke$$inlined$duxo$1.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle2.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
            composer.endReplaceGroup();
            OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo = (OptionsPortfolioRiskAnalyzerSearchDuxo) baseDuxo;
            composer.startReplaceGroup(5004770);
            boolean z = (((i & 896) ^ 384) > 256 && composer.changed(navigator)) || (i & 384) == 256;
            Object objRememberedValue2 = composer.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerNavGraphKt$optionsPortfolioRiskAnalyzerNavGraph$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsPortfolioRiskAnalyzerNavGraph.C234613.invoke$lambda$1$lambda$0(navigator);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            OptionsPortfolioRiskAnalyzerSearchPageComposable3.OptionsPortfolioRiskAnalyzerSearchPageComposable(null, optionsPortfolioRiskAnalyzerSearchDuxo, false, (Function0) objRememberedValue2, null, composer, 0, 21);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator) {
            LifecycleAwareNavigator.popBackStack$default(lifecycleAwareNavigator, false, 1, null);
            return Unit.INSTANCE;
        }
    }
}
