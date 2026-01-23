package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
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
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.android.options.portfolioriskanalyzer.C23462R;
import com.robinhood.android.options.portfolioriskanalyzer.OptionsPortfolioRiskAnalyzerNavDestinations2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchRowComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u0084\u0002"}, m3636d2 = {"OptionsPortfolioRiskAnalyzerSearchRowComposable", "", "state", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchPositionRowViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDuxo;", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchPositionRowViewState;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDuxo;Landroidx/compose/runtime/Composer;II)V", "TEST_TAG_SEARCH_ROW_ITEM", "", "feature-options-portfolio-risk-analyzer_externalDebug", "pnlState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/PnLUiState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerSearchRowComposable {
    public static final String TEST_TAG_SEARCH_ROW_ITEM = "search_row_item";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$4(OptionsPortfolioRiskAnalyzerSearchPositionRowViewState optionsPortfolioRiskAnalyzerSearchPositionRowViewState, Modifier modifier, OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo, int i, int i2, Composer composer, int i3) {
        OptionsPortfolioRiskAnalyzerSearchRowComposable(optionsPortfolioRiskAnalyzerSearchPositionRowViewState, modifier, optionsPortfolioRiskAnalyzerSearchDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsPortfolioRiskAnalyzerSearchRowComposable(final OptionsPortfolioRiskAnalyzerSearchPositionRowViewState state, Modifier modifier, OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo2;
        Modifier modifier3;
        int i4;
        OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo3;
        boolean zChanged;
        Object objRememberedValue;
        final LifecycleAwareNavigator lifecycleAwareNavigator;
        boolean zChanged2;
        Object objRememberedValue2;
        Composer composer2;
        final OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1907749937);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    optionsPortfolioRiskAnalyzerSearchDuxo2 = optionsPortfolioRiskAnalyzerSearchDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(optionsPortfolioRiskAnalyzerSearchDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    optionsPortfolioRiskAnalyzerSearchDuxo2 = optionsPortfolioRiskAnalyzerSearchDuxo;
                }
                i3 |= i6;
            } else {
                optionsPortfolioRiskAnalyzerSearchDuxo2 = optionsPortfolioRiskAnalyzerSearchDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionsPortfolioRiskAnalyzerSearchDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposableKt$OptionsPortfolioRiskAnalyzerSearchRowComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposableKt$OptionsPortfolioRiskAnalyzerSearchRowComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        OptionsPortfolioRiskAnalyzerSearchDuxo optionsPortfolioRiskAnalyzerSearchDuxo5 = (OptionsPortfolioRiskAnalyzerSearchDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        optionsPortfolioRiskAnalyzerSearchDuxo3 = optionsPortfolioRiskAnalyzerSearchDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1907749937, i4, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposable (OptionsPortfolioRiskAnalyzerSearchRowComposable.kt:28)");
                    }
                    Object underlyingId = state.getUnderlyingId();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(underlyingId);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = optionsPortfolioRiskAnalyzerSearchDuxo3.pnlFlow(state.getUnderlyingId(), state.isEquity());
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle((StateFlow) objRememberedValue, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                    String str = "search_row_item-" + state.getUnderlyingId();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged2 = composerStartRestartGroup.changed(lifecycleAwareNavigator) | composerStartRestartGroup.changedInstance(state);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionsPortfolioRiskAnalyzerSearchRowComposable.m2274x5088525f(lifecycleAwareNavigator, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BentoBaseRowLayout.BentoBaseRowLayout(TestTag3.testTag(ClickableKt.m4893clickableXHw0xAI$default(modifier5, false, null, null, (Function0) objRememberedValue2, 7, null), str), null, null, ComposableLambda3.rememberComposableLambda(1099283374, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposableKt.OptionsPortfolioRiskAnalyzerSearchRowComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1099283374, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposable.<anonymous> (OptionsPortfolioRiskAnalyzerSearchRowComposable.kt:49)");
                            }
                            String name = state.getName();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(name, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextM(), composer3, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1201760367, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposableKt.OptionsPortfolioRiskAnalyzerSearchRowComposable.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) throws Resources.NotFoundException {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1201760367, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposable.<anonymous> (OptionsPortfolioRiskAnalyzerSearchRowComposable.kt:56)");
                            }
                            String strPluralStringResource = StringResources_androidKt.pluralStringResource(C23462R.plurals.options_pra_number_of_positions, state.getPositionCount(), new Object[]{state.getSymbol(), Integer.valueOf(state.getPositionCount())}, composer3, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(strPluralStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextS(), composer3, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1406714353, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposableKt.OptionsPortfolioRiskAnalyzerSearchRowComposable.4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            String str2;
                            String str3;
                            long jM21452getNegative0d7_KjU;
                            BigDecimal pnlPercentage;
                            BigDecimal pnlPercentage2;
                            BigDecimal pnlPercentage3;
                            BigDecimal pnlNumeric;
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1406714353, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposable.<anonymous> (OptionsPortfolioRiskAnalyzerSearchRowComposable.kt:68)");
                            }
                            Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                            SnapshotState4<PnLUiState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer3, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            PnLUiState pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1 = OptionsPortfolioRiskAnalyzerSearchRowComposable.OptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1(snapshotState4);
                            if (pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1 == null || (pnlNumeric = pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1.getPnlNumeric()) == null || (str2 = Formats.getPriceDeltaWithHundredthDecimalFormat().format(pnlNumeric)) == null) {
                                str2 = "-";
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextM(), composer3, 0, 0, 8186);
                            PnLUiState pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$12 = OptionsPortfolioRiskAnalyzerSearchRowComposable.OptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1(snapshotState4);
                            if (pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$12 == null || (pnlPercentage3 = pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$12.getPnlPercentage()) == null || (str3 = Formats.getPercentDeltaWithHundredthDecimalFormat().format(pnlPercentage3)) == null) {
                                str3 = "-";
                            }
                            TextStyle textS = bentoTheme.getTypography(composer3, i8).getTextS();
                            PnLUiState pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$13 = OptionsPortfolioRiskAnalyzerSearchRowComposable.OptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1(snapshotState4);
                            if (pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$13 == null || (pnlPercentage2 = pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$13.getPnlPercentage()) == null || pnlPercentage2.signum() != 0) {
                                PnLUiState pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$14 = OptionsPortfolioRiskAnalyzerSearchRowComposable.OptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1(snapshotState4);
                                if (pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$14 == null || (pnlPercentage = pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$14.getPnlPercentage()) == null || pnlPercentage.compareTo(BigDecimal.ZERO) != 1) {
                                    composer3.startReplaceGroup(-1175360111);
                                    jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i8).m21452getNegative0d7_KjU();
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-1175439471);
                                    jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i8).m21456getPositive0d7_KjU();
                                    composer3.endReplaceGroup();
                                }
                            } else {
                                composer3.startReplaceGroup(-1175574569);
                                jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU();
                                composer3.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(jM21452getNegative0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8186);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), false, false, false, null, composer2, 1600512, 0, 1958);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    optionsPortfolioRiskAnalyzerSearchDuxo4 = optionsPortfolioRiskAnalyzerSearchDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                optionsPortfolioRiskAnalyzerSearchDuxo3 = optionsPortfolioRiskAnalyzerSearchDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object underlyingId2 = state.getUnderlyingId();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(underlyingId2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = optionsPortfolioRiskAnalyzerSearchDuxo3.pnlFlow(state.getUnderlyingId(), state.isEquity());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    final SnapshotState4<PnLUiState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle((StateFlow) objRememberedValue, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    lifecycleAwareNavigator = (LifecycleAwareNavigator) composerStartRestartGroup.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
                    String str2 = "search_row_item-" + state.getUnderlyingId();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged2 = composerStartRestartGroup.changed(lifecycleAwareNavigator) | composerStartRestartGroup.changedInstance(state);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionsPortfolioRiskAnalyzerSearchRowComposable.m2274x5088525f(lifecycleAwareNavigator, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier3;
                        composer2 = composerStartRestartGroup;
                        BentoBaseRowLayout.BentoBaseRowLayout(TestTag3.testTag(ClickableKt.m4893clickableXHw0xAI$default(modifier52, false, null, null, (Function0) objRememberedValue2, 7, null), str2), null, null, ComposableLambda3.rememberComposableLambda(1099283374, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposableKt.OptionsPortfolioRiskAnalyzerSearchRowComposable.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1099283374, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposable.<anonymous> (OptionsPortfolioRiskAnalyzerSearchRowComposable.kt:49)");
                                }
                                String name = state.getName();
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(name, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextM(), composer3, 0, 0, 8186);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1201760367, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposableKt.OptionsPortfolioRiskAnalyzerSearchRowComposable.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) throws Resources.NotFoundException {
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1201760367, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposable.<anonymous> (OptionsPortfolioRiskAnalyzerSearchRowComposable.kt:56)");
                                }
                                String strPluralStringResource = StringResources_androidKt.pluralStringResource(C23462R.plurals.options_pra_number_of_positions, state.getPositionCount(), new Object[]{state.getSymbol(), Integer.valueOf(state.getPositionCount())}, composer3, 0);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(strPluralStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextS(), composer3, 0, 0, 8186);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1406714353, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposableKt.OptionsPortfolioRiskAnalyzerSearchRowComposable.4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                String str22;
                                String str3;
                                long jM21452getNegative0d7_KjU;
                                BigDecimal pnlPercentage;
                                BigDecimal pnlPercentage2;
                                BigDecimal pnlPercentage3;
                                BigDecimal pnlNumeric;
                                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1406714353, i7, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposable.<anonymous> (OptionsPortfolioRiskAnalyzerSearchRowComposable.kt:68)");
                                }
                                Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                                SnapshotState4<PnLUiState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer3, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                PnLUiState pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1 = OptionsPortfolioRiskAnalyzerSearchRowComposable.OptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1(snapshotState4);
                                if (pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1 == null || (pnlNumeric = pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1.getPnlNumeric()) == null || (str22 = Formats.getPriceDeltaWithHundredthDecimalFormat().format(pnlNumeric)) == null) {
                                    str22 = "-";
                                }
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(str22, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getTextM(), composer3, 0, 0, 8186);
                                PnLUiState pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$12 = OptionsPortfolioRiskAnalyzerSearchRowComposable.OptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1(snapshotState4);
                                if (pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$12 == null || (pnlPercentage3 = pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$12.getPnlPercentage()) == null || (str3 = Formats.getPercentDeltaWithHundredthDecimalFormat().format(pnlPercentage3)) == null) {
                                    str3 = "-";
                                }
                                TextStyle textS = bentoTheme.getTypography(composer3, i8).getTextS();
                                PnLUiState pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$13 = OptionsPortfolioRiskAnalyzerSearchRowComposable.OptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1(snapshotState4);
                                if (pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$13 == null || (pnlPercentage2 = pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$13.getPnlPercentage()) == null || pnlPercentage2.signum() != 0) {
                                    PnLUiState pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$14 = OptionsPortfolioRiskAnalyzerSearchRowComposable.OptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1(snapshotState4);
                                    if (pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$14 == null || (pnlPercentage = pnLUiStateOptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$14.getPnlPercentage()) == null || pnlPercentage.compareTo(BigDecimal.ZERO) != 1) {
                                        composer3.startReplaceGroup(-1175360111);
                                        jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i8).m21452getNegative0d7_KjU();
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(-1175439471);
                                        jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i8).m21456getPositive0d7_KjU();
                                        composer3.endReplaceGroup();
                                    }
                                } else {
                                    composer3.startReplaceGroup(-1175574569);
                                    jM21452getNegative0d7_KjU = bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU();
                                    composer3.endReplaceGroup();
                                }
                                BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(jM21452getNegative0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8186);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), false, false, false, null, composer2, 1600512, 0, 1958);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        optionsPortfolioRiskAnalyzerSearchDuxo4 = optionsPortfolioRiskAnalyzerSearchDuxo3;
                        modifier4 = modifier52;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                optionsPortfolioRiskAnalyzerSearchDuxo4 = optionsPortfolioRiskAnalyzerSearchDuxo2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.search.OptionsPortfolioRiskAnalyzerSearchRowComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionsPortfolioRiskAnalyzerSearchRowComposable.OptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$4(state, modifier4, optionsPortfolioRiskAnalyzerSearchDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                    i4 = i3;
                    optionsPortfolioRiskAnalyzerSearchDuxo3 = optionsPortfolioRiskAnalyzerSearchDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object underlyingId22 = state.getUnderlyingId();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(underlyingId22);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$3$lambda$2 */
    public static final Unit m2274x5088525f(LifecycleAwareNavigator lifecycleAwareNavigator, OptionsPortfolioRiskAnalyzerSearchPositionRowViewState optionsPortfolioRiskAnalyzerSearchPositionRowViewState) {
        LifecycleAwareNavigator.setResultAndPop$default(lifecycleAwareNavigator, optionsPortfolioRiskAnalyzerSearchPositionRowViewState.getUnderlyingId(), OptionsPortfolioRiskAnalyzerNavDestinations2.KEY_POSITION_ROW_SELECTION, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PnLUiState OptionsPortfolioRiskAnalyzerSearchRowComposable$lambda$1(SnapshotState4<PnLUiState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
