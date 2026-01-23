package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.portfolioriskanalyzer.C23462R;
import com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposable3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.appbar.NavIconButton;
import com.robinhood.compose.duxo.DuxosKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchPageComposable.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a`\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2#\b\u0002\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0085\u0001\u0010\u0010\u001a\u00020\u00012#\b\u0002\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\t2#\b\u0002\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0003\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0019\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u0012X\u008a\u008e\u0002"}, m3636d2 = {"OptionsPortfolioRiskAnalyzerSearchPageComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDuxo;", "initialFocusSet", "", "onCloseClick", "Lkotlin/Function0;", "onFocusChanged", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "focused", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDuxo;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SearchBarComposable", "onQueryChanged", "", "query", "onQueryCleared", "emptyTitleStr", "", "initialQueryInput", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "TEST_TAG_TEXT_INPUT", NavIconButton.TEST_TAG_CLOSE_BUTTON, "searchRegex", "Lkotlin/text/Regex;", "feature-options-portfolio-risk-analyzer_externalDebug", "viewState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchViewState;", "isQueryInputFocused", "input"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerSearchPageComposable3 {
    public static final String TEST_TAG_CLOSE_BUTTON = "close button";
    public static final String TEST_TAG_TEXT_INPUT = "text input";
    private static final Regex searchRegex = new Regex("^[/@]?[-a-zA-Z0-9\\s]{0,20}$");

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsPortfolioRiskAnalyzerSearchPageComposable$lambda$5(Modifier modifier, OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo, boolean z, Function0 function0, Function1 function1, int i, int i2, Composer composer, int i3) {
        OptionsPortfolioRiskAnalyzerSearchPageComposable(modifier, optionsPortfolioRiskAnalyzerSearchDuxo, z, function0, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBarComposable$lambda$30(Function1 function1, Function0 function0, Function1 function12, int i, boolean z, String str, int i2, int i3, Composer composer, int i4) {
        SearchBarComposable(function1, function0, function12, i, z, str, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerSearchPageComposable$lambda$3$lambda$2 */
    public static final Unit m2272xa26bb802(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsPortfolioRiskAnalyzerSearchPageComposable(Modifier modifier, OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo, boolean z, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo2;
        boolean z2;
        Function0<Unit> function02;
        int i4;
        Function1<? super Boolean, Unit> function12;
        int i5;
        Composer composer2;
        Function0<Unit> function03;
        final Function1<? super Boolean, Unit> function13;
        final Modifier modifier3;
        final OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo3;
        final Function0<Unit> function04;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        final Modifier modifier4;
        final Function0<Unit> function05;
        final OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo4;
        final Function1<? super Boolean, Unit> function14;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-788062484);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                optionsPortfolioRiskAnalyzerSearchDuxo2 = optionsPortfolioRiskAnalyzerSearchDuxo;
                int i7 = composerStartRestartGroup.changedInstance(optionsPortfolioRiskAnalyzerSearchDuxo2) ? 32 : 16;
                i3 |= i7;
            } else {
                optionsPortfolioRiskAnalyzerSearchDuxo2 = optionsPortfolioRiskAnalyzerSearchDuxo;
            }
            i3 |= i7;
        } else {
            optionsPortfolioRiskAnalyzerSearchDuxo2 = optionsPortfolioRiskAnalyzerSearchDuxo;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 2) == 0) {
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            composer2 = composerStartRestartGroup;
                            i5 = 0;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsPortfolioRiskAnalyzerSearchDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer2, 0, 0);
                            composer2.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$$inlined$duxo$1.1
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
                            optionsPortfolioRiskAnalyzerSearchDuxo2 = (OptionsPortfolioRiskAnalyzerSearchDuxo) baseDuxo;
                            i3 &= -113;
                        } else {
                            i5 = 0;
                            composer2 = composerStartRestartGroup;
                        }
                        if (i8 != 0) {
                            z2 = i5 == true ? 1 : 0;
                        }
                        if (i9 == 0) {
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            function03 = (Function0) objRememberedValue2;
                            composer2.endReplaceGroup();
                        } else {
                            function03 = function0;
                        }
                        if (i4 == 0) {
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return OptionsPortfolioRiskAnalyzerSearchPageComposable3.m2272xa26bb802(((Boolean) obj).booleanValue());
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            modifier3 = modifier5;
                            optionsPortfolioRiskAnalyzerSearchDuxo3 = optionsPortfolioRiskAnalyzerSearchDuxo2;
                            function13 = (Function1) objRememberedValue3;
                        } else {
                            function13 = function1;
                            modifier3 = modifier5;
                            optionsPortfolioRiskAnalyzerSearchDuxo3 = optionsPortfolioRiskAnalyzerSearchDuxo2;
                        }
                        function04 = function03;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        modifier3 = modifier2;
                        optionsPortfolioRiskAnalyzerSearchDuxo3 = optionsPortfolioRiskAnalyzerSearchDuxo2;
                        function04 = function02;
                        function13 = function12;
                        i5 = 0;
                        composer2 = composerStartRestartGroup;
                    }
                    final boolean z4 = z2;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-788062484, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposable (OptionsPortfolioRiskAnalyzerSearchPageComposable.kt:55)");
                    }
                    final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(i5, i5, composer2, i5, 3);
                    Composer composer4 = composer2;
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(optionsPortfolioRiskAnalyzerSearchDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                    composer3 = composer4;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1880820287, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt.OptionsPortfolioRiskAnalyzerSearchPageComposable.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i10) {
                            if ((i10 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1880820287, i10, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposable.<anonymous> (OptionsPortfolioRiskAnalyzerSearchPageComposable.kt:60)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer5, i11).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer5, i11).m21425getFg0d7_KjU();
                            final Function0<Unit> function06 = function04;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, ComposableLambda3.rememberComposableLambda(1730107517, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt.OptionsPortfolioRiskAnalyzerSearchPageComposable.3.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                    invoke(composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer6, int i12) {
                                    if ((i12 & 3) == 2 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1730107517, i12, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposable.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerSearchPageComposable.kt:66)");
                                    }
                                    Function2<Composer, Integer, Unit> function2M2270x249e9a8d = OptionsPortfolioRiskAnalyzerSearchPageComposable.INSTANCE.m2270x249e9a8d();
                                    final Function0<Unit> function07 = function06;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2270x249e9a8d, null, ComposableLambda3.rememberComposableLambda(931419548, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt.OptionsPortfolioRiskAnalyzerSearchPageComposable.3.1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer7, Integer num) {
                                            invoke(bentoAppBarScope, composer7, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer7, int i13) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i13 & 6) == 0) {
                                                i13 |= (i13 & 8) == 0 ? composer7.changed(BentoAppBar) : composer7.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i13 & 19) == 18 && composer7.getSkipping()) {
                                                composer7.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(931419548, i13, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposable.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerSearchPageComposable.kt:74)");
                                            }
                                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, OptionsPortfolioRiskAnalyzerSearchPageComposable3.TEST_TAG_CLOSE_BUTTON), false, 0L, function07, composer7, (BentoAppBarScope.$stable << 12) | 6 | ((i13 << 12) & 57344), 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer6, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer6, 12583302, 0, 1914);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-1521714094, true, new AnonymousClass2(optionsPortfolioRiskAnalyzerSearchDuxo3, function13, z4, lazyListStateRememberLazyListState, snapshotState4CollectAsStateWithLifecycle), composer5, 54), composer5, 805306416, 316);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: OptionsPortfolioRiskAnalyzerSearchPageComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ OptionsPortfolioRiskAnalyzerSearchDuxo $duxo;
                            final /* synthetic */ boolean $initialFocusSet;
                            final /* synthetic */ LazyListState $listState;
                            final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
                            final /* synthetic */ SnapshotState4<OptionsPortfolioRiskAnalyzerSearchViewState> $viewState$delegate;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass2(OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo, Function1<? super Boolean, Unit> function1, boolean z, LazyListState lazyListState, SnapshotState4<OptionsPortfolioRiskAnalyzerSearchViewState> snapshotState4) {
                                this.$duxo = optionsPortfolioRiskAnalyzerSearchDuxo;
                                this.$onFocusChanged = function1;
                                this.$initialFocusSet = z;
                                this.$listState = lazyListState;
                                this.$viewState$delegate = snapshotState4;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues contentPadding, Composer composer, int i) {
                                int i2;
                                Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                                if ((i & 6) == 0) {
                                    i2 = i | (composer.changed(contentPadding) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1521714094, i2, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposable.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerSearchPageComposable.kt:83)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(contentPadding.getTop() - C2002Dp.m7995constructorimpl(10));
                                float bottom = contentPadding.getBottom();
                                LayoutDirection layoutDirection = LayoutDirection.Ltr;
                                Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(companion, contentPadding.mo5118calculateLeftPaddingu2uoSUM(layoutDirection), fM7995constructorimpl, PaddingKt.calculateEndPadding(contentPadding, layoutDirection), bottom);
                                final OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo = this.$duxo;
                                Function1<Boolean, Unit> function1 = this.$onFocusChanged;
                                boolean z = this.$initialFocusSet;
                                LazyListState lazyListState = this.$listState;
                                final SnapshotState4<OptionsPortfolioRiskAnalyzerSearchViewState> snapshotState4 = this.$viewState$delegate;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5145paddingqDBjuR0);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(optionsPortfolioRiskAnalyzerSearchDuxo);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new OptionsPortfolioRiskAnalyzerSearchPageComposable4(optionsPortfolioRiskAnalyzerSearchDuxo);
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                Function1 function12 = (Function1) ((KFunction) objRememberedValue);
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer.changedInstance(optionsPortfolioRiskAnalyzerSearchDuxo);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new OptionsPortfolioRiskAnalyzerSearchPageComposable5(optionsPortfolioRiskAnalyzerSearchDuxo);
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                OptionsPortfolioRiskAnalyzerSearchPageComposable3.SearchBarComposable(function12, (Function0) ((KFunction) objRememberedValue2), function1, 0, z, OptionsPortfolioRiskAnalyzerSearchPageComposable3.OptionsPortfolioRiskAnalyzerSearchPageComposable$lambda$4(snapshotState4).getQuery(), composer, 0, 8);
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged = composer.changed(snapshotState4) | composer.changedInstance(optionsPortfolioRiskAnalyzerSearchDuxo);
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return OptionsPortfolioRiskAnalyzerSearchPageComposable3.C236373.AnonymousClass2.invoke$lambda$7$lambda$6$lambda$5(snapshotState4, optionsPortfolioRiskAnalyzerSearchDuxo, (LazyListScope) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                LazyDslKt.LazyColumn(modifierFillMaxSize$default, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue3, composer, 6, 508);
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$7$lambda$6$lambda$5(SnapshotState4 snapshotState4, final OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                final ImmutableList<OptionsPortfolioRiskAnalyzerSearchPositionRowViewState> positionRowsViewState = OptionsPortfolioRiskAnalyzerSearchPageComposable3.OptionsPortfolioRiskAnalyzerSearchPageComposable$lambda$4(snapshotState4).getPositionRowsViewState();
                                final Function1 function1 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return OptionsPortfolioRiskAnalyzerSearchPageComposable3.C236373.AnonymousClass2.invoke$lambda$7$lambda$6$lambda$5$lambda$2((OptionsPortfolioRiskAnalyzerSearchPositionRowViewState) obj);
                                    }
                                };
                                final Function1 function12 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return OptionsPortfolioRiskAnalyzerSearchPageComposable3.C236373.AnonymousClass2.invoke$lambda$7$lambda$6$lambda$5$lambda$3((OptionsPortfolioRiskAnalyzerSearchPositionRowViewState) obj);
                                    }
                                };
                                LazyColumn.items(positionRowsViewState.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2$invoke$lambda$7$lambda$6$lambda$5$$inlined$items$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i) {
                                        return function1.invoke(positionRowsViewState.get(i));
                                    }
                                }, new Function1<Integer, Object>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2$invoke$lambda$7$lambda$6$lambda$5$$inlined$items$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i) {
                                        return function12.invoke(positionRowsViewState.get(i));
                                    }
                                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2$invoke$lambda$7$lambda$6$lambda$5$$inlined$items$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                        int i3;
                                        if ((i2 & 6) == 0) {
                                            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                                        } else {
                                            i3 = i2;
                                        }
                                        if ((i2 & 48) == 0) {
                                            i3 |= composer.changed(i) ? 32 : 16;
                                        }
                                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                        }
                                        OptionsPortfolioRiskAnalyzerSearchPositionRowViewState optionsPortfolioRiskAnalyzerSearchPositionRowViewState = (OptionsPortfolioRiskAnalyzerSearchPositionRowViewState) positionRowsViewState.get(i);
                                        composer.startReplaceGroup(860429911);
                                        OptionsPortfolioRiskAnalyzerSearchRowComposable.OptionsPortfolioRiskAnalyzerSearchRowComposable(optionsPortfolioRiskAnalyzerSearchPositionRowViewState, null, optionsPortfolioRiskAnalyzerSearchDuxo, composer, 0, 2);
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Object invoke$lambda$7$lambda$6$lambda$5$lambda$2(OptionsPortfolioRiskAnalyzerSearchPositionRowViewState it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return it.getUnderlyingId();
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Object invoke$lambda$7$lambda$6$lambda$5$lambda$3(OptionsPortfolioRiskAnalyzerSearchPositionRowViewState it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return "position row item";
                            }
                        }
                    }, composer3, 54), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    function05 = function04;
                    optionsPortfolioRiskAnalyzerSearchDuxo4 = optionsPortfolioRiskAnalyzerSearchDuxo3;
                    function14 = function13;
                    z3 = z4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    optionsPortfolioRiskAnalyzerSearchDuxo4 = optionsPortfolioRiskAnalyzerSearchDuxo2;
                    function05 = function02;
                    function14 = function12;
                    composer3 = composerStartRestartGroup;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionsPortfolioRiskAnalyzerSearchPageComposable3.OptionsPortfolioRiskAnalyzerSearchPageComposable$lambda$5(modifier4, optionsPortfolioRiskAnalyzerSearchDuxo4, z3, function05, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            function12 = function1;
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 2) == 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    function04 = function03;
                    final boolean z42 = z2;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(i5, i5, composer2, i5, 3);
                    Composer composer42 = composer2;
                    final SnapshotState4<OptionsPortfolioRiskAnalyzerSearchViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(optionsPortfolioRiskAnalyzerSearchDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                    composer3 = composer42;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1880820287, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt.OptionsPortfolioRiskAnalyzerSearchPageComposable.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i10) {
                            if ((i10 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1880820287, i10, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposable.<anonymous> (OptionsPortfolioRiskAnalyzerSearchPageComposable.kt:60)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer5, i11).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer5, i11).m21425getFg0d7_KjU();
                            final Function0<Unit> function06 = function04;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, ComposableLambda3.rememberComposableLambda(1730107517, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt.OptionsPortfolioRiskAnalyzerSearchPageComposable.3.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                    invoke(composer6, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer6, int i12) {
                                    if ((i12 & 3) == 2 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1730107517, i12, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposable.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerSearchPageComposable.kt:66)");
                                    }
                                    Function2<Composer, Integer, Unit> function2M2270x249e9a8d = OptionsPortfolioRiskAnalyzerSearchPageComposable.INSTANCE.m2270x249e9a8d();
                                    final Function0<Unit> function07 = function06;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2270x249e9a8d, null, ComposableLambda3.rememberComposableLambda(931419548, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt.OptionsPortfolioRiskAnalyzerSearchPageComposable.3.1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer7, Integer num) {
                                            invoke(bentoAppBarScope, composer7, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer7, int i13) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i13 & 6) == 0) {
                                                i13 |= (i13 & 8) == 0 ? composer7.changed(BentoAppBar) : composer7.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i13 & 19) == 18 && composer7.getSkipping()) {
                                                composer7.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(931419548, i13, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposable.<anonymous>.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerSearchPageComposable.kt:74)");
                                            }
                                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, OptionsPortfolioRiskAnalyzerSearchPageComposable3.TEST_TAG_CLOSE_BUTTON), false, 0L, function07, composer7, (BentoAppBarScope.$stable << 12) | 6 | ((i13 << 12) & 57344), 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer6, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer6, 12583302, 0, 1914);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer5, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-1521714094, true, new AnonymousClass2(optionsPortfolioRiskAnalyzerSearchDuxo3, function13, z42, lazyListStateRememberLazyListState2, snapshotState4CollectAsStateWithLifecycle2), composer5, 54), composer5, 805306416, 316);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: OptionsPortfolioRiskAnalyzerSearchPageComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ OptionsPortfolioRiskAnalyzerSearchDuxo $duxo;
                            final /* synthetic */ boolean $initialFocusSet;
                            final /* synthetic */ LazyListState $listState;
                            final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
                            final /* synthetic */ SnapshotState4<OptionsPortfolioRiskAnalyzerSearchViewState> $viewState$delegate;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass2(OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo, Function1<? super Boolean, Unit> function1, boolean z, LazyListState lazyListState, SnapshotState4<OptionsPortfolioRiskAnalyzerSearchViewState> snapshotState4) {
                                this.$duxo = optionsPortfolioRiskAnalyzerSearchDuxo;
                                this.$onFocusChanged = function1;
                                this.$initialFocusSet = z;
                                this.$listState = lazyListState;
                                this.$viewState$delegate = snapshotState4;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues contentPadding, Composer composer, int i) {
                                int i2;
                                Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                                if ((i & 6) == 0) {
                                    i2 = i | (composer.changed(contentPadding) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1521714094, i2, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposable.<anonymous>.<anonymous> (OptionsPortfolioRiskAnalyzerSearchPageComposable.kt:83)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(contentPadding.getTop() - C2002Dp.m7995constructorimpl(10));
                                float bottom = contentPadding.getBottom();
                                LayoutDirection layoutDirection = LayoutDirection.Ltr;
                                Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(companion, contentPadding.mo5118calculateLeftPaddingu2uoSUM(layoutDirection), fM7995constructorimpl, PaddingKt.calculateEndPadding(contentPadding, layoutDirection), bottom);
                                final OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo = this.$duxo;
                                Function1<Boolean, Unit> function1 = this.$onFocusChanged;
                                boolean z = this.$initialFocusSet;
                                LazyListState lazyListState = this.$listState;
                                final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5145paddingqDBjuR0);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(optionsPortfolioRiskAnalyzerSearchDuxo);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new OptionsPortfolioRiskAnalyzerSearchPageComposable4(optionsPortfolioRiskAnalyzerSearchDuxo);
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                Function1 function12 = (Function1) ((KFunction) objRememberedValue);
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer.changedInstance(optionsPortfolioRiskAnalyzerSearchDuxo);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new OptionsPortfolioRiskAnalyzerSearchPageComposable5(optionsPortfolioRiskAnalyzerSearchDuxo);
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                OptionsPortfolioRiskAnalyzerSearchPageComposable3.SearchBarComposable(function12, (Function0) ((KFunction) objRememberedValue2), function1, 0, z, OptionsPortfolioRiskAnalyzerSearchPageComposable3.OptionsPortfolioRiskAnalyzerSearchPageComposable$lambda$4(snapshotState4).getQuery(), composer, 0, 8);
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged = composer.changed(snapshotState4) | composer.changedInstance(optionsPortfolioRiskAnalyzerSearchDuxo);
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return OptionsPortfolioRiskAnalyzerSearchPageComposable3.C236373.AnonymousClass2.invoke$lambda$7$lambda$6$lambda$5(snapshotState4, optionsPortfolioRiskAnalyzerSearchDuxo, (LazyListScope) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                LazyDslKt.LazyColumn(modifierFillMaxSize$default, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue3, composer, 6, 508);
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$7$lambda$6$lambda$5(SnapshotState4 snapshotState4, final OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                final List positionRowsViewState = OptionsPortfolioRiskAnalyzerSearchPageComposable3.OptionsPortfolioRiskAnalyzerSearchPageComposable$lambda$4(snapshotState4).getPositionRowsViewState();
                                final Function1 function1 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return OptionsPortfolioRiskAnalyzerSearchPageComposable3.C236373.AnonymousClass2.invoke$lambda$7$lambda$6$lambda$5$lambda$2((OptionsPortfolioRiskAnalyzerSearchPositionRowViewState) obj);
                                    }
                                };
                                final Function1 function12 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return OptionsPortfolioRiskAnalyzerSearchPageComposable3.C236373.AnonymousClass2.invoke$lambda$7$lambda$6$lambda$5$lambda$3((OptionsPortfolioRiskAnalyzerSearchPositionRowViewState) obj);
                                    }
                                };
                                LazyColumn.items(positionRowsViewState.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2$invoke$lambda$7$lambda$6$lambda$5$$inlined$items$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i) {
                                        return function1.invoke(positionRowsViewState.get(i));
                                    }
                                }, new Function1<Integer, Object>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2$invoke$lambda$7$lambda$6$lambda$5$$inlined$items$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i) {
                                        return function12.invoke(positionRowsViewState.get(i));
                                    }
                                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$OptionsPortfolioRiskAnalyzerSearchPageComposable$3$2$invoke$lambda$7$lambda$6$lambda$5$$inlined$items$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                        int i3;
                                        if ((i2 & 6) == 0) {
                                            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                                        } else {
                                            i3 = i2;
                                        }
                                        if ((i2 & 48) == 0) {
                                            i3 |= composer.changed(i) ? 32 : 16;
                                        }
                                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                        }
                                        OptionsPortfolioRiskAnalyzerSearchPositionRowViewState optionsPortfolioRiskAnalyzerSearchPositionRowViewState = (OptionsPortfolioRiskAnalyzerSearchPositionRowViewState) positionRowsViewState.get(i);
                                        composer.startReplaceGroup(860429911);
                                        OptionsPortfolioRiskAnalyzerSearchRowComposable.OptionsPortfolioRiskAnalyzerSearchRowComposable(optionsPortfolioRiskAnalyzerSearchPositionRowViewState, null, optionsPortfolioRiskAnalyzerSearchDuxo, composer, 0, 2);
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Object invoke$lambda$7$lambda$6$lambda$5$lambda$2(OptionsPortfolioRiskAnalyzerSearchPositionRowViewState it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return it.getUnderlyingId();
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Object invoke$lambda$7$lambda$6$lambda$5$lambda$3(OptionsPortfolioRiskAnalyzerSearchPositionRowViewState it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return "position row item";
                            }
                        }
                    }, composer3, 54), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    function05 = function04;
                    optionsPortfolioRiskAnalyzerSearchDuxo4 = optionsPortfolioRiskAnalyzerSearchDuxo3;
                    function14 = function13;
                    z3 = z42;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        function12 = function1;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsPortfolioRiskAnalyzerSearchViewState OptionsPortfolioRiskAnalyzerSearchPageComposable$lambda$4(SnapshotState4<OptionsPortfolioRiskAnalyzerSearchViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean SearchBarComposable$lambda$29$lambda$14(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final String SearchBarComposable$lambda$29$lambda$18(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBarComposable$lambda$7$lambda$6(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBarComposable$lambda$11$lambda$10(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchBarComposable(Function1<? super String, Unit> function1, Function0<Unit> function0, Function1<? super Boolean, Unit> function12, int i, boolean z, String str, Composer composer, final int i2, final int i3) {
        Function1<? super String, Unit> function13;
        int i4;
        Function0<Unit> function02;
        int i5;
        Function1<? super Boolean, Unit> function14;
        int i6;
        int i7;
        boolean z2;
        int i8;
        String str2;
        final Function1<? super String, Unit> function15;
        boolean z3;
        final Function1<? super Boolean, Unit> function16;
        final String str3;
        final Function0<Unit> function03;
        boolean z4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Composer.Companion companion2;
        final SnapshotState snapshotState;
        boolean z5;
        Object objRememberedValue3;
        final SnapshotState snapshotState2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean z6;
        Object objRememberedValue4;
        boolean zChanged;
        Object objRememberedValue5;
        boolean zChanged2;
        Object objRememberedValue6;
        final String str4;
        final Function1<? super Boolean, Unit> function17;
        final int i9;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-377795276);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            function13 = function1;
        } else if ((i2 & 6) == 0) {
            function13 = function1;
            i4 = (composerStartRestartGroup.changedInstance(function13) ? 4 : 2) | i2;
        } else {
            function13 = function1;
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function02 = function0;
                i4 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    function14 = function12;
                    i4 |= composerStartRestartGroup.changedInstance(function14) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        i6 = i;
                        int i12 = composerStartRestartGroup.changed(i6) ? 2048 : 1024;
                        i4 |= i12;
                    } else {
                        i6 = i;
                    }
                    i4 |= i12;
                } else {
                    i6 = i;
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                    if ((i2 & 24576) == 0) {
                        z2 = z;
                        i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= 196608;
                        str2 = str;
                    } else {
                        str2 = str;
                        if ((i2 & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(str2) ? 131072 : 65536;
                        }
                    }
                    if ((i4 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i10 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return OptionsPortfolioRiskAnalyzerSearchPageComposable3.SearchBarComposable$lambda$7$lambda$6((String) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                }
                                function15 = (Function1) objRememberedValue7;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function15 = function13;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue8 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function02 = (Function0) objRememberedValue8;
                            }
                            if (i5 != 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue9 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return OptionsPortfolioRiskAnalyzerSearchPageComposable3.SearchBarComposable$lambda$11$lambda$10(((Boolean) obj).booleanValue());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function14 = (Function1) objRememberedValue9;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                                i6 = C23462R.string.options_pra_search_hint;
                            }
                            if (i7 != 0) {
                                z2 = false;
                            }
                            if (i8 == 0) {
                                z3 = z2;
                                function16 = function14;
                                str3 = "";
                                function03 = function02;
                            }
                            int i13 = i4;
                            int i14 = i6;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-377795276, i13, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.SearchBarComposable (OptionsPortfolioRiskAnalyzerSearchPageComposable.kt:128)");
                            }
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i15 = BentoTheme.$stable;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion3, bentoTheme.getColors(composerStartRestartGroup, i15).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            z4 = z3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion5.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new FocusRequester();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 != companion.getEmpty()) {
                                companion2 = companion;
                                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z4), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                companion2 = companion;
                            }
                            snapshotState = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            Object[] objArr = new Object[0];
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            z5 = (i13 & 458752) != 131072;
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!z5 || objRememberedValue3 == companion2.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OptionsPortfolioRiskAnalyzerSearchPageComposable3.SearchBarComposable$lambda$29$lambda$17$lambda$16(str3);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 6);
                            String str5 = str3;
                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i15).m21590getDefaultD9Ej5fM());
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i15).m21590getDefaultD9Ej5fM()), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor2);
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(TestTag3.testTag(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), TEST_TAG_TEXT_INPUT), focusRequester);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            z6 = (i13 & 896) != 256;
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!z6 || objRememberedValue4 == companion2.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return OptionsPortfolioRiskAnalyzerSearchPageComposable3.SearchBarComposable$lambda$29$lambda$27$lambda$21$lambda$20(function16, snapshotState, (FocusState) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue4);
                            String strSearchBarComposable$lambda$29$lambda$18 = SearchBarComposable$lambda$29$lambda$18(snapshotState2);
                            String strStringResource = StringResources_androidKt.stringResource(i14, composerStartRestartGroup, (i13 >> 9) & 14);
                            BentoTextInput8.Icon.Size24 size24 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null);
                            BentoTextInput8.Icon.Size24 size242 = SearchBarComposable$lambda$29$lambda$18(snapshotState2).length() <= 0 ? new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.CLOSE_24, null, null, 6, null) : null;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChanged = composerStartRestartGroup.changed(snapshotState2) | ((i13 & 14) != 4);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue5 == companion2.getEmpty()) {
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return OptionsPortfolioRiskAnalyzerSearchPageComposable3.SearchBarComposable$lambda$29$lambda$27$lambda$24$lambda$23(function15, snapshotState2, (String) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            Function1 function18 = (Function1) objRememberedValue5;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChanged2 = ((i13 & 112) != 32) | composerStartRestartGroup.changed(snapshotState2);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2 || objRememberedValue6 == companion2.getEmpty()) {
                                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OptionsPortfolioRiskAnalyzerSearchPageComposable3.SearchBarComposable$lambda$29$lambda$27$lambda$26$lambda$25(function03, snapshotState2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i16 = BentoTextInput8.Icon.Size24.$stable;
                            BentoTextInput4.BentoTextInput(strSearchBarComposable$lambda$29$lambda$18, function18, modifierOnFocusChanged, null, strStringResource, null, null, size24, size242, (Function0) objRememberedValue6, null, null, null, false, false, composerStartRestartGroup, (i16 << 24) | (i16 << 21), 0, 31848);
                            composerStartRestartGroup = composerStartRestartGroup;
                            AnimatedVisibilityKt.AnimatedVisibility(row6, (SearchBarComposable$lambda$29$lambda$14(snapshotState) && StringsKt.isBlank(SearchBarComposable$lambda$29$lambda$18(snapshotState2))) ? false : true, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-493621694, true, new OptionsPortfolioRiskAnalyzerSearchPageComposable6(snapshotState2, focusManager, function03), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 30);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.startReplaceGroup(1880755376);
                            if (z4) {
                                Unit unit = Unit.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue10 == companion2.getEmpty()) {
                                    objRememberedValue10 = new OptionsPortfolioRiskAnalyzerSearchPageComposable7(focusRequester, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 6);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str4 = str5;
                            function17 = function16;
                            i9 = i14;
                            z7 = z4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            function15 = function13;
                        }
                        z3 = z2;
                        function03 = function02;
                        function16 = function14;
                        str3 = str;
                        int i132 = i4;
                        int i142 = i6;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i152 = BentoTheme.$stable;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion32, bentoTheme2.getColors(composerStartRestartGroup, i152).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        Arrangement.Vertical top2 = arrangement2.getTop();
                        Alignment.Companion companion42 = Alignment.INSTANCE;
                        z4 = z3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion42.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                        ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion52.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion52.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion52.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion52.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion52.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 != companion.getEmpty()) {
                            }
                            snapshotState = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            Object[] objArr2 = new Object[0];
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            if ((i132 & 458752) != 131072) {
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!z5) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OptionsPortfolioRiskAnalyzerSearchPageComposable3.SearchBarComposable$lambda$29$lambda$17$lambda$16(str3);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 6);
                                String str52 = str3;
                                Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs2 = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i152).m21590getDefaultD9Ej5fM());
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i152).m21590getDefaultD9Ej5fM()), companion42.getCenterVertically(), composerStartRestartGroup, 48);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21618defaultFillMaxWidthPadding3ABfNKs2);
                                Function0<ComposeUiNode> constructor22 = companion52.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion52.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion52.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion52.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion52.getSetModifier());
                                    Row6 row62 = Row6.INSTANCE;
                                    Modifier modifierFocusRequester2 = FocusRequesterModifier3.focusRequester(TestTag3.testTag(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), TEST_TAG_TEXT_INPUT), focusRequester2);
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    if ((i132 & 896) != 256) {
                                    }
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!z6) {
                                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return OptionsPortfolioRiskAnalyzerSearchPageComposable3.SearchBarComposable$lambda$29$lambda$27$lambda$21$lambda$20(function16, snapshotState, (FocusState) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        composerStartRestartGroup.endReplaceGroup();
                                        Modifier modifierOnFocusChanged2 = FocusChangedModifier2.onFocusChanged(modifierFocusRequester2, (Function1) objRememberedValue4);
                                        String strSearchBarComposable$lambda$29$lambda$182 = SearchBarComposable$lambda$29$lambda$18(snapshotState2);
                                        String strStringResource2 = StringResources_androidKt.stringResource(i142, composerStartRestartGroup, (i132 >> 9) & 14);
                                        BentoTextInput8.Icon.Size24 size243 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null);
                                        if (SearchBarComposable$lambda$29$lambda$18(snapshotState2).length() <= 0) {
                                        }
                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                        zChanged = composerStartRestartGroup.changed(snapshotState2) | ((i132 & 14) != 4);
                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged) {
                                            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda9
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return OptionsPortfolioRiskAnalyzerSearchPageComposable3.SearchBarComposable$lambda$29$lambda$27$lambda$24$lambda$23(function15, snapshotState2, (String) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                            Function1 function182 = (Function1) objRememberedValue5;
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                                            zChanged2 = ((i132 & 112) != 32) | composerStartRestartGroup.changed(snapshotState2);
                                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                            if (!zChanged2) {
                                                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda10
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return OptionsPortfolioRiskAnalyzerSearchPageComposable3.SearchBarComposable$lambda$29$lambda$27$lambda$26$lambda$25(function03, snapshotState2);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                                composerStartRestartGroup.endReplaceGroup();
                                                int i162 = BentoTextInput8.Icon.Size24.$stable;
                                                BentoTextInput4.BentoTextInput(strSearchBarComposable$lambda$29$lambda$182, function182, modifierOnFocusChanged2, null, strStringResource2, null, null, size243, size242, (Function0) objRememberedValue6, null, null, null, false, false, composerStartRestartGroup, (i162 << 24) | (i162 << 21), 0, 31848);
                                                composerStartRestartGroup = composerStartRestartGroup;
                                                if (SearchBarComposable$lambda$29$lambda$14(snapshotState)) {
                                                    AnimatedVisibilityKt.AnimatedVisibility(row62, (SearchBarComposable$lambda$29$lambda$14(snapshotState) && StringsKt.isBlank(SearchBarComposable$lambda$29$lambda$18(snapshotState2))) ? false : true, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-493621694, true, new OptionsPortfolioRiskAnalyzerSearchPageComposable6(snapshotState2, focusManager2, function03), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 30);
                                                    composerStartRestartGroup.endNode();
                                                    composerStartRestartGroup.startReplaceGroup(1880755376);
                                                    if (z4) {
                                                    }
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    composerStartRestartGroup.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    str4 = str52;
                                                    function17 = function16;
                                                    i9 = i142;
                                                    z7 = z4;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function15 = function13;
                        z7 = z2;
                        function03 = function02;
                        str4 = str2;
                        function17 = function14;
                        i9 = i6;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return OptionsPortfolioRiskAnalyzerSearchPageComposable3.SearchBarComposable$lambda$30(function15, function03, function17, i9, z7, str4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 24576;
                z2 = z;
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                if ((i4 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i10 == 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                            z3 = z2;
                            function03 = function02;
                            function16 = function14;
                            str3 = str;
                        }
                        int i1322 = i4;
                        int i1422 = i6;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier.Companion companion322 = Modifier.INSTANCE;
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i1522 = BentoTheme.$stable;
                        Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion322, bentoTheme22.getColors(composerStartRestartGroup, i1522).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
                        Arrangement arrangement22 = Arrangement.INSTANCE;
                        Arrangement.Vertical top22 = arrangement22.getTop();
                        Alignment.Companion companion422 = Alignment.INSTANCE;
                        z4 = z3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(top22, companion422.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default22);
                        ComposeUiNode.Companion companion522 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor32 = companion522.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy22, companion522.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap32, companion522.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion522.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting()) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function14 = function12;
            if ((i2 & 3072) == 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            z2 = z;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            if ((i4 & 74899) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function02 = function0;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function14 = function12;
        if ((i2 & 3072) == 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        z2 = z;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        if ((i4 & 74899) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void SearchBarComposable$lambda$29$lambda$15(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState SearchBarComposable$lambda$29$lambda$17$lambda$16(String str) {
        return SnapshotState3.mutableStateOf$default(str, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBarComposable$lambda$29$lambda$27$lambda$21$lambda$20(Function1 function1, SnapshotState snapshotState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(Boolean.valueOf(it.isFocused()));
        SearchBarComposable$lambda$29$lambda$15(snapshotState, it.isFocused());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBarComposable$lambda$29$lambda$27$lambda$26$lambda$25(Function0 function0, SnapshotState snapshotState) {
        snapshotState.setValue("");
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchBarComposable$lambda$29$lambda$27$lambda$24$lambda$23(Function1 function1, SnapshotState snapshotState, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (query.length() == 0) {
            snapshotState.setValue(query);
            function1.invoke(query);
        } else {
            String strJoinToString$default = SequencesKt.joinToString$default(Regex.findAll$default(searchRegex, query, 0, 2, null), "", null, null, 0, null, new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchPageComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsPortfolioRiskAnalyzerSearchPageComposable3.m2273xbaf18124((MatchResult) obj);
                }
            }, 30, null);
            if (strJoinToString$default.length() > 0) {
                snapshotState.setValue(strJoinToString$default);
                function1.invoke(strJoinToString$default);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SearchBarComposable$lambda$29$lambda$27$lambda$24$lambda$23$lambda$22 */
    public static final CharSequence m2273xbaf18124(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getValue();
    }
}
