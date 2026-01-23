package com.robinhood.android.cortex.digest.portfolio.sources;

import android.content.res.Resources;
import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverlfowComposable3;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations2;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations3;
import com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowComposable;
import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.SheetDestinationWithArgs;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CortexPortfolioDigestContext;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PortfolioDigestArticleSourceOverflowComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, m3636d2 = {"PortfolioDigestArticleSourceOverflowComposable", "", "args", "Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestArticleSourceOverflowDest$Args;", "duxo", "Lcom/robinhood/android/cortex/digest/portfolio/sources/PortfolioDigestArticleSourceOverflowDuxo;", "(Lcom/robinhood/android/cortex/digest/portfolio/PortfolioDigestArticleSourceOverflowDest$Args;Lcom/robinhood/android/cortex/digest/portfolio/sources/PortfolioDigestArticleSourceOverflowDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-cortex-digest-portfolio_externalDebug", "viewState", "Lcom/robinhood/android/cortex/digest/portfolio/sources/PortfolioDigestArticleSourceOverflowViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PortfolioDigestArticleSourceOverflowComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioDigestArticleSourceOverflowComposable$lambda$1(PortfolioDigestDestinations2.Args args, PortfolioDigestArticleSourceOverflowDuxo portfolioDigestArticleSourceOverflowDuxo, int i, int i2, Composer composer, int i3) {
        PortfolioDigestArticleSourceOverflowComposable(args, portfolioDigestArticleSourceOverflowDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x035f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioDigestArticleSourceOverflowComposable(final PortfolioDigestDestinations2.Args args, PortfolioDigestArticleSourceOverflowDuxo portfolioDigestArticleSourceOverflowDuxo, Composer composer, final int i, final int i2) {
        int i3;
        PortfolioDigestArticleSourceOverflowDuxo portfolioDigestArticleSourceOverflowDuxo2;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        final PortfolioDigestArticleSourceOverflowDuxo portfolioDigestArticleSourceOverflowDuxo3;
        Composer composer3;
        String source;
        Intrinsics.checkNotNullParameter(args, "args");
        Composer composerStartRestartGroup = composer.startRestartGroup(481629819);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(args) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                portfolioDigestArticleSourceOverflowDuxo2 = portfolioDigestArticleSourceOverflowDuxo;
                int i4 = composerStartRestartGroup.changedInstance(portfolioDigestArticleSourceOverflowDuxo2) ? 32 : 16;
                i3 |= i4;
            } else {
                portfolioDigestArticleSourceOverflowDuxo2 = portfolioDigestArticleSourceOverflowDuxo;
            }
            i3 |= i4;
        } else {
            portfolioDigestArticleSourceOverflowDuxo2 = portfolioDigestArticleSourceOverflowDuxo;
        }
        int i5 = i3;
        if ((i5 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(2050738472);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
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
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    composer2 = composerStartRestartGroup;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PortfolioDigestArticleSourceOverflowDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowComposableKt$PortfolioDigestArticleSourceOverflowComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowComposableKt$PortfolioDigestArticleSourceOverflowComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                    composer2.endReplaceGroup();
                    i5 &= -113;
                    portfolioDigestArticleSourceOverflowDuxo3 = (PortfolioDigestArticleSourceOverflowDuxo) baseDuxo;
                } else {
                    composer2 = composerStartRestartGroup;
                    portfolioDigestArticleSourceOverflowDuxo3 = portfolioDigestArticleSourceOverflowDuxo2;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(481629819, i5, -1, "com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowComposable (PortfolioDigestArticleSourceOverflowComposable.kt:23)");
                }
                OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composer2, BackHandler5.$stable);
                OnBackPressedDispatcher onBackPressedDispatcher = current2 == null ? current2.getOnBackPressedDispatcher() : null;
                LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer2.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                Composer composer4 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(portfolioDigestArticleSourceOverflowDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer3 = composer4;
                Screen screen = new Screen(Screen.Name.CORTEX_DIGEST_SOURCE_LIST, null, null, null, 14, null);
                String accountNumber = args.getAccountNumber();
                String digestId = args.getDigestId();
                source = args.getSource();
                if (source == null) {
                    source = "";
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CortexPortfolioDigestContext(accountNumber, digestId, source, null, 8, null), null, null, -1, -1, -1, -1, -1, -1, 14335, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-836587600, true, new C121511(lifecycleAwareNavigator, args, onBackPressedDispatcher, snapshotState4CollectAsStateWithLifecycle), composer3, 54), composer3, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                    portfolioDigestArticleSourceOverflowDuxo3 = portfolioDigestArticleSourceOverflowDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                OnBackPressedDispatcherOwner current22 = BackHandler5.INSTANCE.getCurrent(composer2, BackHandler5.$stable);
                if (current22 == null) {
                }
                LifecycleAwareNavigator lifecycleAwareNavigator2 = (LifecycleAwareNavigator) composer2.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                Composer composer42 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(portfolioDigestArticleSourceOverflowDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                composer3 = composer42;
                Screen screen2 = new Screen(Screen.Name.CORTEX_DIGEST_SOURCE_LIST, null, null, null, 14, null);
                String accountNumber2 = args.getAccountNumber();
                String digestId2 = args.getDigestId();
                source = args.getSource();
                if (source == null) {
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen2, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CortexPortfolioDigestContext(accountNumber2, digestId2, source, null, 8, null), null, null, -1, -1, -1, -1, -1, -1, 14335, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-836587600, true, new C121511(lifecycleAwareNavigator2, args, onBackPressedDispatcher, snapshotState4CollectAsStateWithLifecycle2), composer3, 54), composer3, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            portfolioDigestArticleSourceOverflowDuxo3 = portfolioDigestArticleSourceOverflowDuxo2;
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PortfolioDigestArticleSourceOverflowComposable.PortfolioDigestArticleSourceOverflowComposable$lambda$1(args, portfolioDigestArticleSourceOverflowDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PortfolioDigestArticleSourceOverflowComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowComposableKt$PortfolioDigestArticleSourceOverflowComposable$1 */
    static final class C121511 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ PortfolioDigestDestinations2.Args $args;
        final /* synthetic */ LifecycleAwareNavigator $navigator;
        final /* synthetic */ OnBackPressedDispatcher $onBackPressedDispatcher;
        final /* synthetic */ SnapshotState4<PortfolioDigestArticleSourceOverflowViewState> $viewState$delegate;

        C121511(LifecycleAwareNavigator lifecycleAwareNavigator, PortfolioDigestDestinations2.Args args, OnBackPressedDispatcher onBackPressedDispatcher, SnapshotState4<PortfolioDigestArticleSourceOverflowViewState> snapshotState4) {
            this.$navigator = lifecycleAwareNavigator;
            this.$args = args;
            this.$onBackPressedDispatcher = onBackPressedDispatcher;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-836587600, i, -1, "com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowComposable.<anonymous> (PortfolioDigestArticleSourceOverflowComposable.kt:44)");
            }
            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
            ImmutableList<ArticleSource> articleSources = PortfolioDigestArticleSourceOverflowComposable.PortfolioDigestArticleSourceOverflowComposable$lambda$0(this.$viewState$delegate).getArticleSources();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$navigator) | composer.changed(this.$args);
            final LifecycleAwareNavigator lifecycleAwareNavigator = this.$navigator;
            final PortfolioDigestDestinations2.Args args = this.$args;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowComposableKt$PortfolioDigestArticleSourceOverflowComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PortfolioDigestArticleSourceOverflowComposable.C121511.invoke$lambda$1$lambda$0(lifecycleAwareNavigator, args, (ArticleSource) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$onBackPressedDispatcher);
            final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBackPressedDispatcher;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cortex.digest.portfolio.sources.PortfolioDigestArticleSourceOverflowComposableKt$PortfolioDigestArticleSourceOverflowComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PortfolioDigestArticleSourceOverflowComposable.C121511.invoke$lambda$3$lambda$2(onBackPressedDispatcher);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            CortexArticleSourceOverlfowComposable3.CortexArticleSourceOverflowComposable(articleSources, function1, (Function0) objRememberedValue2, modifierLogScreenTransitions$default, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator, PortfolioDigestDestinations2.Args args, ArticleSource articleSource) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(articleSource, "articleSource");
            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (SheetDestinationWithArgs) PortfolioDigestDestinations3.INSTANCE, (Parcelable) new PortfolioDigestDestinations3.Args(articleSource, Screen.Name.CORTEX_DIGEST_SOURCE_LIST, args.getAccountNumber(), args.getDigestId(), args.getSource()), false, (Function1) null, 12, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(OnBackPressedDispatcher onBackPressedDispatcher) {
            if (onBackPressedDispatcher != null) {
                onBackPressedDispatcher.onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortfolioDigestArticleSourceOverflowViewState PortfolioDigestArticleSourceOverflowComposable$lambda$0(SnapshotState4<PortfolioDigestArticleSourceOverflowViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
