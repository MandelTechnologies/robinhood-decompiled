package com.robinhood.android.chart.blackwidowadvancedchart.composables;

import android.content.Context;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.view.compose.BackHandler;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreen;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.search.contracts.SearchSelector;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.android.search.selector.SearchSelectorFragment;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.search.SearchContentType;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChartSearchScreen.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a-\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u008e\u0002"}, m3636d2 = {"ChartSearchScreen", "", "searchContentTypes", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/api/search/SearchContentType;", "chartCallbacks", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-black-widow-advanced-chart_externalDebug", "internalVisibility", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartSearchScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartSearchScreen$lambda$10(ImmutableList immutableList, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ChartSearchScreen(immutableList, blackWidowAdvanceChartCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ChartSearchScreen$lambda$4$lambda$3(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ChartSearchScreen$lambda$6$lambda$5(int i) {
        return -i;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartSearchScreen(final ImmutableList<? extends SearchContentType> searchContentTypes, final BlackWidowAdvanceChartCallbacks chartCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final SoftwareKeyboardController softwareKeyboardController;
        Object objRememberedValue;
        Composer.Companion companion;
        final FocusManager focusManager;
        Object objRememberedValue2;
        Object objRememberedValue3;
        boolean zChangedInstance;
        Object objRememberedValue4;
        Modifier modifier3;
        Composer composer2;
        Object objRememberedValue5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(searchContentTypes, "searchContentTypes");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(224373181);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(searchContentTypes) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(chartCallbacks) : composerStartRestartGroup.changedInstance(chartCallbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(224373181, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreen (ChartSearchScreen.kt:40)");
                }
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                Modifier modifierZIndex = ZIndexModifier2.zIndex(Modifier.INSTANCE, 999.0f);
                boolean zChartSearchScreen$lambda$1 = ChartSearchScreen$lambda$1(snapshotState);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(ChartSearchScreen.ChartSearchScreen$lambda$4$lambda$3(((Integer) obj).intValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EnterTransition enterTransitionSlideInVertically$default = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue2, 1, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(ChartSearchScreen.ChartSearchScreen$lambda$6$lambda$5(((Integer) obj).intValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                ExitTransition exitTransitionSlideOutVertically$default = EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue3, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changed(softwareKeyboardController) | ((i3 & 112) != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(chartCallbacks)));
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChartSearchScreen.ChartSearchScreen$lambda$8$lambda$7(focusManager, softwareKeyboardController, chartCallbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                Helpers3.BwAnimateVisibility(zChartSearchScreen$lambda$1, (Function0) objRememberedValue4, modifierZIndex, enterTransitionSlideInVertically$default, exitTransitionSlideOutVertically$default, 0L, ComposableLambda3.rememberComposableLambda(1510643654, true, new C106314(modifier3, currentCompositeKeyHash, focusManager, softwareKeyboardController, chartCallbacks, searchContentTypes), composerStartRestartGroup, 54), composerStartRestartGroup, 1600896, 32);
                composer2 = composerStartRestartGroup;
                Unit unit = Unit.INSTANCE;
                composer2.startReplaceGroup(5004770);
                objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new ChartSearchScreen2(snapshotState, null);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChartSearchScreen.ChartSearchScreen$lambda$10(searchContentTypes, chartCallbacks, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Modifier modifierZIndex2 = ZIndexModifier2.zIndex(Modifier.INSTANCE, 999.0f);
            boolean zChartSearchScreen$lambda$12 = ChartSearchScreen$lambda$1(snapshotState2);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            EnterTransition enterTransitionSlideInVertically$default2 = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue2, 1, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            ExitTransition exitTransitionSlideOutVertically$default2 = EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue3, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            if ((i3 & 112) != 32) {
                zChangedInstance = composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changed(softwareKeyboardController) | ((i3 & 112) != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(chartCallbacks)));
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChartSearchScreen.ChartSearchScreen$lambda$8$lambda$7(focusManager, softwareKeyboardController, chartCallbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier4;
                    Helpers3.BwAnimateVisibility(zChartSearchScreen$lambda$12, (Function0) objRememberedValue4, modifierZIndex2, enterTransitionSlideInVertically$default2, exitTransitionSlideOutVertically$default2, 0L, ComposableLambda3.rememberComposableLambda(1510643654, true, new C106314(modifier3, currentCompositeKeyHash2, focusManager, softwareKeyboardController, chartCallbacks, searchContentTypes), composerStartRestartGroup, 54), composerStartRestartGroup, 1600896, 32);
                    composer2 = composerStartRestartGroup;
                    Unit unit2 = Unit.INSTANCE;
                    composer2.startReplaceGroup(5004770);
                    objRememberedValue5 = composer2.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartSearchScreen$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartSearchScreen$lambda$8$lambda$7(FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks) {
        focusManager.clearFocus(true);
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        BlackWidowAdvanceChartCallbacks.DefaultImpls.advanceScreenState$default(blackWidowAdvanceChartCallbacks, null, 1, null);
        return Unit.INSTANCE;
    }

    /* compiled from: ChartSearchScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreenKt$ChartSearchScreen$4 */
    static final class C106314 implements Function3<Helpers, Composer, Integer, Unit> {
        final /* synthetic */ BlackWidowAdvanceChartCallbacks $chartCallbacks;
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ int $hashKey;
        final /* synthetic */ SoftwareKeyboardController $keyboardController;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ ImmutableList<SearchContentType> $searchContentTypes;

        /* JADX WARN: Multi-variable type inference failed */
        C106314(Modifier modifier, int i, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, ImmutableList<? extends SearchContentType> immutableList) {
            this.$modifier = modifier;
            this.$hashKey = i;
            this.$focusManager = focusManager;
            this.$keyboardController = softwareKeyboardController;
            this.$chartCallbacks = blackWidowAdvanceChartCallbacks;
            this.$searchContentTypes = immutableList;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Helpers helpers, Composer composer, Integer num) {
            invoke(helpers, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Helpers helpers) {
            helpers.dismiss();
            return Unit.INSTANCE;
        }

        public final void invoke(final Helpers BwAnimateVisibility, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BwAnimateVisibility, "$this$BwAnimateVisibility");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(BwAnimateVisibility) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1510643654, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreen.<anonymous> (ChartSearchScreen.kt:56)");
            }
            composer.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composer.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreenKt$ChartSearchScreen$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChartSearchScreen.C106314.invoke$lambda$1$lambda$0(BwAnimateVisibility);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BackHandler.BackHandler(true, (Function0) objRememberedValue, composer, 6, 0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, ComposableLambda3.rememberComposableLambda(-623530358, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreenKt.ChartSearchScreen.4.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-623530358, i4, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreen.<anonymous>.<anonymous> (ChartSearchScreen.kt:62)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ChartSearchScreen3.INSTANCE.m1749xa238e5a0(), null, ComposableLambda3.rememberComposableLambda(-70883893, true, new AnonymousClass1(BwAnimateVisibility), composer2, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, 12583302, 0, 1914);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: ChartSearchScreen.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreenKt$ChartSearchScreen$4$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ Helpers $this_BwAnimateVisibility;

                    AnonymousClass1(Helpers helpers) {
                        this.$this_BwAnimateVisibility = helpers;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-70883893, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreen.<anonymous>.<anonymous>.<anonymous> (ChartSearchScreen.kt:65)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChanged = composer.changed(this.$this_BwAnimateVisibility);
                        final Helpers helpers = this.$this_BwAnimateVisibility;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreenKt$ChartSearchScreen$4$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ChartSearchScreen.C106314.AnonymousClass2.AnonymousClass1.invoke$lambda$1$lambda$0(helpers);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(Helpers helpers) {
                        helpers.dismiss();
                        return Unit.INSTANCE;
                    }
                }
            }, composer, 54), null, null, null, 0, bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-187827499, true, new AnonymousClass3(this.$hashKey, this.$focusManager, this.$keyboardController, this.$chartCallbacks, BwAnimateVisibility, this.$searchContentTypes), composer, 54), composer, 805306416, 316);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: ChartSearchScreen.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreenKt$ChartSearchScreen$4$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
            final /* synthetic */ BlackWidowAdvanceChartCallbacks $chartCallbacks;
            final /* synthetic */ FocusManager $focusManager;
            final /* synthetic */ int $hashKey;
            final /* synthetic */ SoftwareKeyboardController $keyboardController;
            final /* synthetic */ ImmutableList<SearchContentType> $searchContentTypes;
            final /* synthetic */ Helpers $this_BwAnimateVisibility;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(int i, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, Helpers helpers, ImmutableList<? extends SearchContentType> immutableList) {
                this.$hashKey = i;
                this.$focusManager = focusManager;
                this.$keyboardController = softwareKeyboardController;
                this.$chartCallbacks = blackWidowAdvanceChartCallbacks;
                this.$this_BwAnimateVisibility = helpers;
                this.$searchContentTypes = immutableList;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                invoke(paddingValues, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                if ((i & 6) == 0) {
                    i |= composer.changed(paddingValues) ? 4 : 2;
                }
                if ((i & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-187827499, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreen.<anonymous>.<anonymous> (ChartSearchScreen.kt:79)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null);
                composer.startReplaceGroup(-1224400529);
                boolean zChanged = composer.changed(this.$hashKey) | composer.changedInstance(this.$focusManager) | composer.changed(this.$keyboardController) | composer.changedInstance(this.$chartCallbacks) | composer.changed(this.$this_BwAnimateVisibility) | composer.changed(this.$searchContentTypes);
                final ImmutableList<SearchContentType> immutableList = this.$searchContentTypes;
                final int i2 = this.$hashKey;
                final FocusManager focusManager = this.$focusManager;
                final SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
                final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks = this.$chartCallbacks;
                final Helpers helpers = this.$this_BwAnimateVisibility;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreenKt$ChartSearchScreen$4$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ChartSearchScreen.C106314.AnonymousClass3.invoke$lambda$3$lambda$2(immutableList, i2, focusManager, softwareKeyboardController, blackWidowAdvanceChartCallbacks, helpers, (Context) obj);
                        }
                    };
                    composer.updateRememberedValue(function1);
                    objRememberedValue = function1;
                }
                composer.endReplaceGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifierFillMaxSize$default, null, composer, 0, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final FragmentContainerView invoke$lambda$3$lambda$2(ImmutableList immutableList, int i, final FocusManager focusManager, final SoftwareKeyboardController softwareKeyboardController, final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, final Helpers helpers, Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                FragmentManager supportFragmentManager = BaseContexts.requireActivityBaseContext(it).getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                FragmentContainerView fragmentContainerView = new FragmentContainerView(it);
                fragmentContainerView.setId(i);
                supportFragmentManager.beginTransaction().add(fragmentContainerView, SearchSelectorFragment.INSTANCE.createFragment((FragmentKey) new SearchSelector(new SearchSelectorLaunchMode.BwAdvanceChart(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.ChartSearchScreenKt$ChartSearchScreen$4$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChartSearchScreen.C106314.AnonymousClass3.invoke$lambda$3$lambda$2$lambda$1(focusManager, softwareKeyboardController, blackWidowAdvanceChartCallbacks, helpers, (UUID) obj, (BlackWidowAdvancedChartFragmentKey2) obj2);
                    }
                }, immutableList), null, null, 6, null)), "SearchSelectorFragment").commitNow();
                return fragmentContainerView;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$2$lambda$1(FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, Helpers helpers, UUID instrumentId, BlackWidowAdvancedChartFragmentKey2 instrumentType) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
                focusManager.clearFocus(true);
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.hide();
                }
                blackWidowAdvanceChartCallbacks.onSearchItemSelected(instrumentId, instrumentType);
                helpers.dismiss();
                return Unit.INSTANCE;
            }
        }
    }

    private static final boolean ChartSearchScreen$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
