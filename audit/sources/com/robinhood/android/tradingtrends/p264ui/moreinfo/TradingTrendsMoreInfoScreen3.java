package com.robinhood.android.tradingtrends.p264ui.moreinfo;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.Divider5;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.tradingtrends.C29966R;
import com.robinhood.android.tradingtrends.microgram.TradingTrendsCachedService;
import com.robinhood.android.tradingtrends.p264ui.moreinfo.TradingTrendsMoreInfoScreen3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TradingTrendsMoreInfoScreen.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"TradingTrendsMoreInfoScreen", "", "tradingTrendsService", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;", "onBackPressed", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-trading-trends_externalDebug", "moreInfoMarkdown", "", "dividerAlpha", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreenKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TradingTrendsMoreInfoScreen3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradingTrendsMoreInfoScreen$lambda$4(TradingTrendsCachedService tradingTrendsCachedService, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradingTrendsMoreInfoScreen(tradingTrendsCachedService, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradingTrendsMoreInfoScreen(final TradingTrendsCachedService tradingTrendsService, final Function0<Unit> onBackPressed, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(tradingTrendsService, "tradingTrendsService");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1667996215);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(tradingTrendsService) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1667996215, i3, -1, "com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreen (TradingTrendsMoreInfoScreen.kt:41)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Boolean bool = Boolean.TRUE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(tradingTrendsService);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new TradingTrendsMoreInfoScreen4(tradingTrendsService, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-630427149, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreenKt.TradingTrendsMoreInfoScreen.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-630427149, i5, -1, "com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreen.<anonymous> (TradingTrendsMoreInfoScreen.kt:55)");
                        }
                        boolean showDivider = topBarScrollStateRememberTopBarScrollState.getShowDivider();
                        Modifier modifierScrollableTopBarState = TopBarScrollState3.scrollableTopBarState(modifier4, lazyListStateRememberLazyListState, topBarScrollStateRememberTopBarScrollState);
                        Function2<Composer, Integer, Unit> function2M19531getLambda$1746163930$lib_trading_trends_externalDebug = TradingTrendsMoreInfoScreen.INSTANCE.m19531getLambda$1746163930$lib_trading_trends_externalDebug();
                        final Function0<Unit> function0 = onBackPressed;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M19531getLambda$1746163930$lib_trading_trends_externalDebug, modifierScrollableTopBarState, ComposableLambda3.rememberComposableLambda(1612251218, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreenKt.TradingTrendsMoreInfoScreen.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i6) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i6 & 6) == 0) {
                                    i6 |= (i6 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1612251218, i6, -1, "com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreen.<anonymous>.<anonymous> (TradingTrendsMoreInfoScreen.kt:57)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, showDivider, null, null, 0L, null, composer3, 390, 0, 1976);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1703644280, true, new C300233(lazyListStateRememberLazyListState, onBackPressed, snapshotState), composerStartRestartGroup, 54), composer2, 805306416, 509);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TradingTrendsMoreInfoScreen3.TradingTrendsMoreInfoScreen$lambda$4(tradingTrendsService, onBackPressed, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Boolean bool2 = Boolean.TRUE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(tradingTrendsService);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new TradingTrendsMoreInfoScreen4(tradingTrendsService, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(bool2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                final TopBarScrollState topBarScrollStateRememberTopBarScrollState2 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                final LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-630427149, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreenKt.TradingTrendsMoreInfoScreen.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-630427149, i5, -1, "com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreen.<anonymous> (TradingTrendsMoreInfoScreen.kt:55)");
                        }
                        boolean showDivider = topBarScrollStateRememberTopBarScrollState2.getShowDivider();
                        Modifier modifierScrollableTopBarState = TopBarScrollState3.scrollableTopBarState(modifier4, lazyListStateRememberLazyListState2, topBarScrollStateRememberTopBarScrollState2);
                        Function2<Composer, Integer, Unit> function2M19531getLambda$1746163930$lib_trading_trends_externalDebug = TradingTrendsMoreInfoScreen.INSTANCE.m19531getLambda$1746163930$lib_trading_trends_externalDebug();
                        final Function0<Unit> function0 = onBackPressed;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M19531getLambda$1746163930$lib_trading_trends_externalDebug, modifierScrollableTopBarState, ComposableLambda3.rememberComposableLambda(1612251218, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreenKt.TradingTrendsMoreInfoScreen.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i6) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i6 & 6) == 0) {
                                    i6 |= (i6 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1612251218, i6, -1, "com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreen.<anonymous>.<anonymous> (TradingTrendsMoreInfoScreen.kt:57)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, showDivider, null, null, 0L, null, composer3, 390, 0, 1976);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1703644280, true, new C300233(lazyListStateRememberLazyListState2, onBackPressed, snapshotState), composerStartRestartGroup, 54), composer2, 805306416, 509);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: TradingTrendsMoreInfoScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreenKt$TradingTrendsMoreInfoScreen$3 */
    static final class C300233 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ LazyListState $lazyListState;
        final /* synthetic */ SnapshotState<String> $moreInfoMarkdown$delegate;
        final /* synthetic */ Function0<Unit> $onBackPressed;

        C300233(LazyListState lazyListState, Function0<Unit> function0, SnapshotState<String> snapshotState) {
            this.$lazyListState = lazyListState;
            this.$onBackPressed = function0;
            this.$moreInfoMarkdown$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$1$lambda$0(final SnapshotState snapshotState, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-836325165, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreenKt$TradingTrendsMoreInfoScreen$3$1$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-836325165, i, -1, "com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TradingTrendsMoreInfoScreen.kt:78)");
                    }
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), composer, 6, 0);
                    SnapshotState<String> snapshotState2 = snapshotState;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, 0, 0L, 0L, false, composer, (BentoMarkdownText.$stable << 15) | 24576, 15);
                    String strTradingTrendsMoreInfoScreen$lambda$1 = TradingTrendsMoreInfoScreen3.TradingTrendsMoreInfoScreen$lambda$1(snapshotState2);
                    if (strTradingTrendsMoreInfoScreen$lambda$1 == null) {
                        strTradingTrendsMoreInfoScreen$lambda$1 = "";
                    }
                    BentoMarkdownText2.BentoMarkdownText(strTradingTrendsMoreInfoScreen$lambda$1, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            return Unit.INSTANCE;
        }

        private static final float invoke$lambda$5$lambda$2(SnapshotState4<Float> snapshotState4) {
            return snapshotState4.getValue().floatValue();
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1703644280, i2, -1, "com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreen.<anonymous> (TradingTrendsMoreInfoScreen.kt:72)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues);
            LazyListState lazyListState = this.$lazyListState;
            final Function0<Unit> function0 = this.$onBackPressed;
            final SnapshotState<String> snapshotState = this.$moreInfoMarkdown$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
            Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreenKt$TradingTrendsMoreInfoScreen$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TradingTrendsMoreInfoScreen3.C300233.invoke$lambda$5$lambda$1$lambda$0(snapshotState, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierWeight$default, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 805306368, 508);
            Divider5.m5851HorizontalDivider9IZ8Weo(Alpha.alpha(companion, invoke$lambda$5$lambda$2(AnimateAsState.animateFloatAsState(TopBarScrollState3.isScrolledToTheEnd(lazyListState) ? 0.0f : 1.0f, null, 0.0f, "FooterDividerAlpha", null, composer, 3072, 22))), 0.0f, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), composer, 0, 2);
            String strStringResource = StringResources_androidKt.stringResource(C29966R.string.trading_trends_more_info_ok, composer, 0);
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoScreenKt$TradingTrendsMoreInfoScreen$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TradingTrendsMoreInfoScreen3.C300233.invoke$lambda$5$lambda$4$lambda$3(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, (Function0) objRememberedValue2, strStringResource, false, null, false, null, null, false, null, false, composer, 0, 0, 65342);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TradingTrendsMoreInfoScreen$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }
}
