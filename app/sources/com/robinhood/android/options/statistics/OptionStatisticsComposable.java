package com.robinhood.android.options.statistics;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.statistics.OptionStatisticsComposable;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoSegmentedControl2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.Segment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.lists.quickadd.extensions.OptionStrategySecurity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionStatisticsComposable.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\n\u001ao\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019\"\u0010\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001c\"\u0010\u0010\u001d\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001c\"\u000e\u0010\u001e\u001a\u00020\u001fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u001fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u001fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u001fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020$X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020$X\u0086T¢\u0006\u0002\n\u0000¨\u0006&²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020$X\u008a\u008e\u0002"}, m3636d2 = {"OptionStatisticsComposable", "", "duxo", "Lcom/robinhood/android/options/statistics/OptionStatisticsDuxo;", "onTradeButtonClicked", "Lkotlin/Function0;", "addToOrRemoveFromWatchlist", "Lkotlin/Function2;", "Lcom/robinhood/models/ui/OptionWatchlistItemState;", "Lcom/robinhood/shared/lists/quickadd/extensions/OptionStrategySecurity;", "(Lcom/robinhood/android/options/statistics/OptionStatisticsDuxo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "OptionStatisticsInnerComposable", "viewState", "Lcom/robinhood/android/options/statistics/OptionStatisticsViewState;", "onPreTradeSimulatedReturnShown", "onSimulatedReturnSegmentTapped", "modifier", "Landroidx/compose/ui/Modifier;", "inComposableTest", "", "(Lcom/robinhood/android/options/statistics/OptionStatisticsViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "drawSimulatedReturnNuxDot", "nuxDotFillColor", "Landroidx/compose/ui/graphics/Color;", "drawSimulatedReturnNuxDot-4WTKRHQ", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "preTradeStatNuxDotRadius", "Landroidx/compose/ui/unit/Dp;", "F", "preTradeStatNuxDotStartPadding", "TEST_TAG_TITLE", "", "TEST_TAG_SEGMENTED_CONTROL", "TEST_TAG_STATS_PAGE", "TEST_TAG_SIMULATED_RETURN_PAGE", "STATS_PAGE_INDEX", "", "SIMULATED_RETURN_PAGE_INDEX", "feature-lib-options-statistics_externalDebug", "selectedSegmentIndex"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.statistics.OptionStatisticsComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionStatisticsComposable {
    public static final int SIMULATED_RETURN_PAGE_INDEX = 1;
    public static final int STATS_PAGE_INDEX = 0;
    public static final String TEST_TAG_SEGMENTED_CONTROL = "statistics segmented control";
    public static final String TEST_TAG_SIMULATED_RETURN_PAGE = "simulated return page";
    public static final String TEST_TAG_STATS_PAGE = "statistics page";
    public static final String TEST_TAG_TITLE = "statistics title";
    private static final float preTradeStatNuxDotRadius = C2002Dp.m7995constructorimpl(3);
    private static final float preTradeStatNuxDotStartPadding = C2002Dp.m7995constructorimpl(15);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionStatisticsComposable$lambda$5(OptionStatisticsDuxo optionStatisticsDuxo, Function0 function0, Function2 function2, int i, Composer composer, int i2) {
        OptionStatisticsComposable(optionStatisticsDuxo, function0, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionStatisticsInnerComposable$lambda$13(OptionStatisticsViewState optionStatisticsViewState, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        OptionStatisticsInnerComposable(optionStatisticsViewState, function0, function02, function03, modifier, z, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void OptionStatisticsComposable(final OptionStatisticsDuxo duxo, Function0<Unit> onTradeButtonClicked, Function2<? super OptionWatchlistItemState, ? super OptionStrategySecurity, Unit> addToOrRemoveFromWatchlist, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function0;
        final Function2<? super OptionWatchlistItemState, ? super OptionStrategySecurity, Unit> function2;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onTradeButtonClicked, "onTradeButtonClicked");
        Intrinsics.checkNotNullParameter(addToOrRemoveFromWatchlist, "addToOrRemoveFromWatchlist");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1849515209);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTradeButtonClicked) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(addToOrRemoveFromWatchlist) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1849515209, i2, -1, "com.robinhood.android.options.statistics.OptionStatisticsComposable (OptionStatisticsComposable.kt:45)");
            }
            OptionStatisticsViewState optionStatisticsViewStateOptionStatisticsComposable$lambda$0 = OptionStatisticsComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionStatisticsComposable.OptionStatisticsComposable$lambda$2$lambda$1(duxo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionStatisticsComposable.OptionStatisticsComposable$lambda$4$lambda$3(duxo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            function0 = onTradeButtonClicked;
            function2 = addToOrRemoveFromWatchlist;
            OptionStatisticsInnerComposable(optionStatisticsViewStateOptionStatisticsComposable$lambda$0, function02, function0, (Function0) objRememberedValue2, null, false, function2, composerStartRestartGroup, ((i2 << 3) & 896) | ((i2 << 12) & 3670016), 48);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = onTradeButtonClicked;
            function2 = addToOrRemoveFromWatchlist;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionStatisticsComposable.OptionStatisticsComposable$lambda$5(duxo, function0, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionStatisticsComposable$lambda$2$lambda$1(OptionStatisticsDuxo optionStatisticsDuxo) {
        optionStatisticsDuxo.onPreTradeSimulatedReturnShown();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionStatisticsComposable$lambda$4$lambda$3(OptionStatisticsDuxo optionStatisticsDuxo) {
        optionStatisticsDuxo.onSimulatedReturnSegmentTapped();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionStatisticsInnerComposable(final OptionStatisticsViewState viewState, final Function0<Unit> onPreTradeSimulatedReturnShown, final Function0<Unit> onTradeButtonClicked, final Function0<Unit> onSimulatedReturnSegmentTapped, Modifier modifier, boolean z, final Function2<? super OptionWatchlistItemState, ? super OptionStrategySecurity, Unit> addToOrRemoveFromWatchlist, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z2;
        Resources resources;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotIntState2 snapshotIntState2;
        long jM21456getPositive0d7_KjU;
        boolean zChanged;
        Object objRememberedValue2;
        final List list;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final PagerState pagerStateRememberPagerState;
        Object objRememberedValue4;
        boolean zChangedInstance2;
        Object objRememberedValue5;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onPreTradeSimulatedReturnShown, "onPreTradeSimulatedReturnShown");
        Intrinsics.checkNotNullParameter(onTradeButtonClicked, "onTradeButtonClicked");
        Intrinsics.checkNotNullParameter(onSimulatedReturnSegmentTapped, "onSimulatedReturnSegmentTapped");
        Intrinsics.checkNotNullParameter(addToOrRemoveFromWatchlist, "addToOrRemoveFromWatchlist");
        Composer composerStartRestartGroup = composer.startRestartGroup(-618950362);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPreTradeSimulatedReturnShown) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTradeButtonClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSimulatedReturnSegmentTapped) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(addToOrRemoveFromWatchlist) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-618950362, i3, -1, "com.robinhood.android.options.statistics.OptionStatisticsInnerComposable (OptionStatisticsComposable.kt:66)");
                    }
                    resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU();
                    boolean zIsPreTradeStatNuxDotShown = viewState.isPreTradeStatNuxDotShown();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(zIsPreTradeStatNuxDotShown);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = CollectionsKt.listOf((Object[]) new Segment[]{new Segment(null, resources.getString(C23799R.string.option_statistics_segment_stats), null, 5, null), new Segment(null, resources.getString(C23799R.string.option_statistics_segment_simulated_returns), viewState.isPreTradeStatNuxDotShown() ? m17022drawSimulatedReturnNuxDot4WTKRHQ(Modifier.INSTANCE, jM21456getPositive0d7_KjU) : Modifier.INSTANCE, 1, null)});
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    list = (List) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(list);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(list.size());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue3, composerStartRestartGroup, 6, 2);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue4;
                    Boolean boolValueOf = Boolean.valueOf(viewState.getShouldDefaultToSimulatedReturnTab());
                    Boolean boolValueOf2 = Boolean.valueOf(viewState.getShowSimulatedReturnSegment());
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changed(pagerStateRememberPagerState);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new OptionStatisticsComposable2(viewState, pagerStateRememberPagerState, snapshotIntState2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, boolValueOf2, (Function2) objRememberedValue5, composerStartRestartGroup, 0);
                    final Modifier modifier4 = modifier2;
                    composer2 = composerStartRestartGroup;
                    BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-429580578, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt.OptionStatisticsInnerComposable.2

                        /* compiled from: OptionStatisticsComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$OptionStatisticsInnerComposable$2$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                            final /* synthetic */ boolean $inComposableTest;
                            final /* synthetic */ Function0<Unit> $onPreTradeSimulatedReturnShown;
                            final /* synthetic */ Function0<Unit> $onSimulatedReturnSegmentTapped;
                            final /* synthetic */ PagerState $pagerState;
                            final /* synthetic */ CoroutineScope $scope;
                            final /* synthetic */ List<Segment> $segments;
                            final /* synthetic */ SnapshotIntState2 $selectedSegmentIndex$delegate;
                            final /* synthetic */ OptionStatisticsViewState $viewState;

                            AnonymousClass2(OptionStatisticsViewState optionStatisticsViewState, List<Segment> list, CoroutineScope coroutineScope, PagerState pagerState, Function0<Unit> function0, Function0<Unit> function02, SnapshotIntState2 snapshotIntState2, boolean z) {
                                this.$viewState = optionStatisticsViewState;
                                this.$segments = list;
                                this.$scope = coroutineScope;
                                this.$pagerState = pagerState;
                                this.$onSimulatedReturnSegmentTapped = function0;
                                this.$onPreTradeSimulatedReturnShown = function02;
                                this.$selectedSegmentIndex$delegate = snapshotIntState2;
                                this.$inComposableTest = z;
                            }

                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
                                List<Segment> list;
                                PagerState pagerState;
                                Function0<Unit> function0;
                                Function0<Unit> function02;
                                SnapshotIntState2 snapshotIntState2;
                                boolean z;
                                Composer composer2;
                                CoroutineScope coroutineScope;
                                final PagerState pagerState2;
                                Modifier.Companion companion;
                                Continuation continuation;
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-326680330, i, -1, "com.robinhood.android.options.statistics.OptionStatisticsInnerComposable.<anonymous>.<anonymous> (OptionStatisticsComposable.kt:112)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                final OptionStatisticsViewState optionStatisticsViewState = this.$viewState;
                                List<Segment> list2 = this.$segments;
                                CoroutineScope coroutineScope2 = this.$scope;
                                PagerState pagerState3 = this.$pagerState;
                                Function0<Unit> function03 = this.$onSimulatedReturnSegmentTapped;
                                Function0<Unit> function04 = this.$onPreTradeSimulatedReturnShown;
                                SnapshotIntState2 snapshotIntState22 = this.$selectedSegmentIndex$delegate;
                                boolean z2 = this.$inComposableTest;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composer.startReplaceGroup(-744670380);
                                if (optionStatisticsViewState.getUntradableInfoBannerMessage() != null) {
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    list = list2;
                                    pagerState = pagerState3;
                                    snapshotIntState2 = snapshotIntState22;
                                    z = z2;
                                    function0 = function03;
                                    function02 = function04;
                                    coroutineScope = coroutineScope2;
                                    BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(ModifiersKt.autoLogEvents$default(PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.OPTION_STATISTICS_BOTTOM_SHEET, null, null, null, 14, null), null, null, new Component(Component.ComponentType.OPTION_UNTRADABLE_INFO_BAR, null, null, 6, null), null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), optionStatisticsViewState.getUntradableInfoBannerMessage(), new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24), null, null, null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i2).m21372getBg20d7_KjU(), composer, (BentoIcon4.Size24.$stable << 6) | 3072, 48);
                                    composer2 = composer;
                                } else {
                                    list = list2;
                                    pagerState = pagerState3;
                                    function0 = function03;
                                    function02 = function04;
                                    snapshotIntState2 = snapshotIntState22;
                                    z = z2;
                                    composer2 = composer;
                                    coroutineScope = coroutineScope2;
                                }
                                composer2.endReplaceGroup();
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i3 = BentoTheme.$stable;
                                final CoroutineScope coroutineScope3 = coroutineScope;
                                BentoText2.m20747BentoText38GnDrw(optionStatisticsViewState.getTitle(), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme2.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), 2, null), OptionStatisticsComposable.TEST_TAG_TITLE), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i3).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                                composer.startReplaceGroup(-744612853);
                                if (optionStatisticsViewState.getShowSimulatedReturnSegment()) {
                                    companion = companion2;
                                    continuation = null;
                                    Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(ModifiersKt.autoLogEvents$default(companion2, OptionStatisticsLoggings.getSegmentedControlEventDescriptor(optionStatisticsViewState.getOptionChainId()), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), OptionStatisticsComposable.TEST_TAG_SEGMENTED_CONTROL);
                                    int iOptionStatisticsInnerComposable$lambda$7 = OptionStatisticsComposable.OptionStatisticsInnerComposable$lambda$7(snapshotIntState2);
                                    composer.startReplaceGroup(-1224400529);
                                    pagerState2 = pagerState;
                                    final Function0<Unit> function05 = function0;
                                    boolean zChangedInstance = composer.changedInstance(coroutineScope3) | composer.changed(pagerState2) | composer.changed(function05);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        final SnapshotIntState2 snapshotIntState23 = snapshotIntState2;
                                        objRememberedValue = new Function1() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$OptionStatisticsInnerComposable$2$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return OptionStatisticsComposable.C237682.AnonymousClass2.invoke$lambda$3$lambda$1$lambda$0(coroutineScope3, function05, snapshotIntState23, pagerState2, ((Integer) obj).intValue());
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoSegmentedControl2.BentoSegmentedControl(list, iOptionStatisticsInnerComposable$lambda$7, (Function1) objRememberedValue, modifierTestTag, false, composer, 0, 16);
                                } else {
                                    pagerState2 = pagerState;
                                    companion = companion2;
                                    continuation = null;
                                }
                                composer.endReplaceGroup();
                                Integer numValueOf = Integer.valueOf(pagerState2.getCurrentPage());
                                composer.startReplaceGroup(-1633490746);
                                Function0<Unit> function06 = function02;
                                boolean zChanged = composer.changed(pagerState2) | composer.changed(function06);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new OptionStatisticsComposable4(pagerState2, function06, continuation);
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
                                final boolean z3 = z;
                                PagerKt.m5301HorizontalPager8jOkeI(pagerState2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, continuation), null, null, 1, 0.0f, null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1067276257, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$OptionStatisticsInnerComposable$2$2$1$3
                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer3, Integer num2) {
                                        invoke(pagerScope, num.intValue(), composer3, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PagerScope HorizontalPager, int i4, Composer composer3, int i5) {
                                        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1067276257, i5, -1, "com.robinhood.android.options.statistics.OptionStatisticsInnerComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionStatisticsComposable.kt:181)");
                                        }
                                        composer3.startReplaceGroup(844702028);
                                        if (i4 == 0) {
                                            OptionStatisticsStatsComposable.OptionStatisticsStatsComposable(optionStatisticsViewState, null, z3, composer3, 0, 2);
                                        }
                                        composer3.endReplaceGroup();
                                        if (i4 == 1) {
                                            OptionStatisticsSimulatedReturnComposable4.OptionStatisticsSimulatedReturnComposable(optionStatisticsViewState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), z3, composer3, 48, 0);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), composer, 100687920, 24576, 16108);
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
                                invoke(boxScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$1$lambda$0(CoroutineScope coroutineScope, Function0 function0, SnapshotIntState2 snapshotIntState2, PagerState pagerState, int i) {
                                OptionStatisticsComposable.OptionStatisticsInnerComposable$lambda$8(snapshotIntState2, i);
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OptionStatisticsComposable3(pagerState, i, null), 3, null);
                                if (i == 1) {
                                    function0.invoke();
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-429580578, i6, -1, "com.robinhood.android.options.statistics.OptionStatisticsInnerComposable.<anonymous> (OptionStatisticsComposable.kt:95)");
                            }
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier4, false, ComposableLambda3.rememberComposableLambda(-1788762167, true, new AnonymousClass1(viewState, onTradeButtonClicked, addToOrRemoveFromWatchlist), composer3, 54), ComposableLambda3.rememberComposableLambda(-326680330, true, new AnonymousClass2(viewState, list, coroutineScope, pagerStateRememberPagerState, onSimulatedReturnSegmentTapped, onPreTradeSimulatedReturnShown, snapshotIntState2, z2), composer3, 54), composer3, 3456, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: OptionStatisticsComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$OptionStatisticsInnerComposable$2$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                            final /* synthetic */ Function2<OptionWatchlistItemState, OptionStrategySecurity, Unit> $addToOrRemoveFromWatchlist;
                            final /* synthetic */ Function0<Unit> $onTradeButtonClicked;
                            final /* synthetic */ OptionStatisticsViewState $viewState;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(OptionStatisticsViewState optionStatisticsViewState, Function0<Unit> function0, Function2<? super OptionWatchlistItemState, ? super OptionStrategySecurity, Unit> function2) {
                                this.$viewState = optionStatisticsViewState;
                                this.$onTradeButtonClicked = function0;
                                this.$addToOrRemoveFromWatchlist = function2;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                                invoke(bentoButtonBar3, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1788762167, i, -1, "com.robinhood.android.options.statistics.OptionStatisticsInnerComposable.<anonymous>.<anonymous> (OptionStatisticsComposable.kt:99)");
                                }
                                if (this.$viewState.getPrimaryButtonText() != null || this.$viewState.getSecondaryButtonText() != null) {
                                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                    Function0<Unit> function0 = this.$onTradeButtonClicked;
                                    String primaryButtonText = this.$viewState.getPrimaryButtonText();
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer.changed(this.$addToOrRemoveFromWatchlist) | composer.changedInstance(this.$viewState);
                                    final Function2<OptionWatchlistItemState, OptionStrategySecurity, Unit> function2 = this.$addToOrRemoveFromWatchlist;
                                    final OptionStatisticsViewState optionStatisticsViewState = this.$viewState;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$OptionStatisticsInnerComposable$2$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return OptionStatisticsComposable.C237682.AnonymousClass1.invoke$lambda$1$lambda$0(function2, optionStatisticsViewState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, function0, primaryButtonText, false, null, false, (Function0) objRememberedValue, this.$viewState.getSecondaryButtonText(), false, null, false, composer, 0, 0, 59198);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Function2 function2, OptionStatisticsViewState optionStatisticsViewState) {
                                function2.invoke(optionStatisticsViewState.getWatchlistItemState(), optionStatisticsViewState.getOptionStrategySecurity());
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                final boolean z3 = z2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionStatisticsComposable.OptionStatisticsInnerComposable$lambda$13(viewState, onPreTradeSimulatedReturnShown, onTradeButtonClicked, onSimulatedReturnSegmentTapped, modifier3, z3, addToOrRemoveFromWatchlist, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            z2 = z;
            if ((i2 & 64) != 0) {
            }
            if ((599187 & i3) == 599186) {
                if (i5 != 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                jM21456getPositive0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU();
                boolean zIsPreTradeStatNuxDotShown2 = viewState.isPreTradeStatNuxDotShown();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(zIsPreTradeStatNuxDotShown2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = CollectionsKt.listOf((Object[]) new Segment[]{new Segment(null, resources.getString(C23799R.string.option_statistics_segment_stats), null, 5, null), new Segment(null, resources.getString(C23799R.string.option_statistics_segment_simulated_returns), viewState.isPreTradeStatNuxDotShown() ? m17022drawSimulatedReturnNuxDot4WTKRHQ(Modifier.INSTANCE, jM21456getPositive0d7_KjU) : Modifier.INSTANCE, 1, null)});
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    list = (List) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(list);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(list.size());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue3, composerStartRestartGroup, 6, 2);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                        }
                        final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue4;
                        Boolean boolValueOf3 = Boolean.valueOf(viewState.getShouldDefaultToSimulatedReturnTab());
                        Boolean boolValueOf22 = Boolean.valueOf(viewState.getShowSimulatedReturnSegment());
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changed(pagerStateRememberPagerState);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2) {
                            objRememberedValue5 = new OptionStatisticsComposable2(viewState, pagerStateRememberPagerState, snapshotIntState2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf3, boolValueOf22, (Function2) objRememberedValue5, composerStartRestartGroup, 0);
                            final Modifier modifier42 = modifier2;
                            composer2 = composerStartRestartGroup;
                            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-429580578, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt.OptionStatisticsInnerComposable.2

                                /* compiled from: OptionStatisticsComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$OptionStatisticsInnerComposable$2$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                                    final /* synthetic */ boolean $inComposableTest;
                                    final /* synthetic */ Function0<Unit> $onPreTradeSimulatedReturnShown;
                                    final /* synthetic */ Function0<Unit> $onSimulatedReturnSegmentTapped;
                                    final /* synthetic */ PagerState $pagerState;
                                    final /* synthetic */ CoroutineScope $scope;
                                    final /* synthetic */ List<Segment> $segments;
                                    final /* synthetic */ SnapshotIntState2 $selectedSegmentIndex$delegate;
                                    final /* synthetic */ OptionStatisticsViewState $viewState;

                                    AnonymousClass2(OptionStatisticsViewState optionStatisticsViewState, List<Segment> list, CoroutineScope coroutineScope, PagerState pagerState, Function0<Unit> function0, Function0<Unit> function02, SnapshotIntState2 snapshotIntState2, boolean z) {
                                        this.$viewState = optionStatisticsViewState;
                                        this.$segments = list;
                                        this.$scope = coroutineScope;
                                        this.$pagerState = pagerState;
                                        this.$onSimulatedReturnSegmentTapped = function0;
                                        this.$onPreTradeSimulatedReturnShown = function02;
                                        this.$selectedSegmentIndex$delegate = snapshotIntState2;
                                        this.$inComposableTest = z;
                                    }

                                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
                                        List<Segment> list;
                                        PagerState pagerState;
                                        Function0<Unit> function0;
                                        Function0<Unit> function02;
                                        SnapshotIntState2 snapshotIntState2;
                                        boolean z;
                                        Composer composer2;
                                        CoroutineScope coroutineScope;
                                        final PagerState pagerState2;
                                        Modifier.Companion companion;
                                        Continuation continuation;
                                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-326680330, i, -1, "com.robinhood.android.options.statistics.OptionStatisticsInnerComposable.<anonymous>.<anonymous> (OptionStatisticsComposable.kt:112)");
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                        final OptionStatisticsViewState optionStatisticsViewState = this.$viewState;
                                        List<Segment> list2 = this.$segments;
                                        CoroutineScope coroutineScope2 = this.$scope;
                                        PagerState pagerState3 = this.$pagerState;
                                        Function0<Unit> function03 = this.$onSimulatedReturnSegmentTapped;
                                        Function0<Unit> function04 = this.$onPreTradeSimulatedReturnShown;
                                        SnapshotIntState2 snapshotIntState22 = this.$selectedSegmentIndex$delegate;
                                        boolean z2 = this.$inComposableTest;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        composer.startReplaceGroup(-744670380);
                                        if (optionStatisticsViewState.getUntradableInfoBannerMessage() != null) {
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i2 = BentoTheme.$stable;
                                            list = list2;
                                            pagerState = pagerState3;
                                            snapshotIntState2 = snapshotIntState22;
                                            z = z2;
                                            function0 = function03;
                                            function02 = function04;
                                            coroutineScope = coroutineScope2;
                                            BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(ModifiersKt.autoLogEvents$default(PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.OPTION_STATISTICS_BOTTOM_SHEET, null, null, null, 14, null), null, null, new Component(Component.ComponentType.OPTION_UNTRADABLE_INFO_BAR, null, null, 6, null), null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), optionStatisticsViewState.getUntradableInfoBannerMessage(), new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24), null, null, null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i2).m21372getBg20d7_KjU(), composer, (BentoIcon4.Size24.$stable << 6) | 3072, 48);
                                            composer2 = composer;
                                        } else {
                                            list = list2;
                                            pagerState = pagerState3;
                                            function0 = function03;
                                            function02 = function04;
                                            snapshotIntState2 = snapshotIntState22;
                                            z = z2;
                                            composer2 = composer;
                                            coroutineScope = coroutineScope2;
                                        }
                                        composer2.endReplaceGroup();
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i3 = BentoTheme.$stable;
                                        final CoroutineScope coroutineScope3 = coroutineScope;
                                        BentoText2.m20747BentoText38GnDrw(optionStatisticsViewState.getTitle(), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme2.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), 2, null), OptionStatisticsComposable.TEST_TAG_TITLE), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i3).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                                        composer.startReplaceGroup(-744612853);
                                        if (optionStatisticsViewState.getShowSimulatedReturnSegment()) {
                                            companion = companion2;
                                            continuation = null;
                                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(ModifiersKt.autoLogEvents$default(companion2, OptionStatisticsLoggings.getSegmentedControlEventDescriptor(optionStatisticsViewState.getOptionChainId()), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), OptionStatisticsComposable.TEST_TAG_SEGMENTED_CONTROL);
                                            int iOptionStatisticsInnerComposable$lambda$7 = OptionStatisticsComposable.OptionStatisticsInnerComposable$lambda$7(snapshotIntState2);
                                            composer.startReplaceGroup(-1224400529);
                                            pagerState2 = pagerState;
                                            final Function0 function05 = function0;
                                            boolean zChangedInstance = composer.changedInstance(coroutineScope3) | composer.changed(pagerState2) | composer.changed(function05);
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                final SnapshotIntState2 snapshotIntState23 = snapshotIntState2;
                                                objRememberedValue = new Function1() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$OptionStatisticsInnerComposable$2$2$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return OptionStatisticsComposable.C237682.AnonymousClass2.invoke$lambda$3$lambda$1$lambda$0(coroutineScope3, function05, snapshotIntState23, pagerState2, ((Integer) obj).intValue());
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            BentoSegmentedControl2.BentoSegmentedControl(list, iOptionStatisticsInnerComposable$lambda$7, (Function1) objRememberedValue, modifierTestTag, false, composer, 0, 16);
                                        } else {
                                            pagerState2 = pagerState;
                                            companion = companion2;
                                            continuation = null;
                                        }
                                        composer.endReplaceGroup();
                                        Integer numValueOf = Integer.valueOf(pagerState2.getCurrentPage());
                                        composer.startReplaceGroup(-1633490746);
                                        Function0<Unit> function06 = function02;
                                        boolean zChanged = composer.changed(pagerState2) | composer.changed(function06);
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new OptionStatisticsComposable4(pagerState2, function06, continuation);
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
                                        final boolean z3 = z;
                                        PagerKt.m5301HorizontalPager8jOkeI(pagerState2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, continuation), null, null, 1, 0.0f, null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1067276257, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$OptionStatisticsInnerComposable$2$2$1$3
                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer3, Integer num2) {
                                                invoke(pagerScope, num.intValue(), composer3, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(PagerScope HorizontalPager, int i4, Composer composer3, int i5) {
                                                Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1067276257, i5, -1, "com.robinhood.android.options.statistics.OptionStatisticsInnerComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionStatisticsComposable.kt:181)");
                                                }
                                                composer3.startReplaceGroup(844702028);
                                                if (i4 == 0) {
                                                    OptionStatisticsStatsComposable.OptionStatisticsStatsComposable(optionStatisticsViewState, null, z3, composer3, 0, 2);
                                                }
                                                composer3.endReplaceGroup();
                                                if (i4 == 1) {
                                                    OptionStatisticsSimulatedReturnComposable4.OptionStatisticsSimulatedReturnComposable(optionStatisticsViewState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), z3, composer3, 48, 0);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer, 54), composer, 100687920, 24576, 16108);
                                        composer.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
                                        invoke(boxScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$1$lambda$0(CoroutineScope coroutineScope, Function0 function0, SnapshotIntState2 snapshotIntState2, PagerState pagerState, int i) {
                                        OptionStatisticsComposable.OptionStatisticsInnerComposable$lambda$8(snapshotIntState2, i);
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OptionStatisticsComposable3(pagerState, i, null), 3, null);
                                        if (i == 1) {
                                            function0.invoke();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i6) {
                                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-429580578, i6, -1, "com.robinhood.android.options.statistics.OptionStatisticsInnerComposable.<anonymous> (OptionStatisticsComposable.kt:95)");
                                    }
                                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier42, false, ComposableLambda3.rememberComposableLambda(-1788762167, true, new AnonymousClass1(viewState, onTradeButtonClicked, addToOrRemoveFromWatchlist), composer3, 54), ComposableLambda3.rememberComposableLambda(-326680330, true, new AnonymousClass2(viewState, list, coroutineScope2, pagerStateRememberPagerState, onSimulatedReturnSegmentTapped, onPreTradeSimulatedReturnShown, snapshotIntState2, z2), composer3, 54), composer3, 3456, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: OptionStatisticsComposable.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$OptionStatisticsInnerComposable$2$1, reason: invalid class name */
                                static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                                    final /* synthetic */ Function2<OptionWatchlistItemState, OptionStrategySecurity, Unit> $addToOrRemoveFromWatchlist;
                                    final /* synthetic */ Function0<Unit> $onTradeButtonClicked;
                                    final /* synthetic */ OptionStatisticsViewState $viewState;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    AnonymousClass1(OptionStatisticsViewState optionStatisticsViewState, Function0<Unit> function0, Function2<? super OptionWatchlistItemState, ? super OptionStrategySecurity, Unit> function2) {
                                        this.$viewState = optionStatisticsViewState;
                                        this.$onTradeButtonClicked = function0;
                                        this.$addToOrRemoveFromWatchlist = function2;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                                        invoke(bentoButtonBar3, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1788762167, i, -1, "com.robinhood.android.options.statistics.OptionStatisticsInnerComposable.<anonymous>.<anonymous> (OptionStatisticsComposable.kt:99)");
                                        }
                                        if (this.$viewState.getPrimaryButtonText() != null || this.$viewState.getSecondaryButtonText() != null) {
                                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                            Function0<Unit> function0 = this.$onTradeButtonClicked;
                                            String primaryButtonText = this.$viewState.getPrimaryButtonText();
                                            composer.startReplaceGroup(-1633490746);
                                            boolean zChanged = composer.changed(this.$addToOrRemoveFromWatchlist) | composer.changedInstance(this.$viewState);
                                            final Function2 function2 = this.$addToOrRemoveFromWatchlist;
                                            final OptionStatisticsViewState optionStatisticsViewState = this.$viewState;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$OptionStatisticsInnerComposable$2$1$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return OptionStatisticsComposable.C237682.AnonymousClass1.invoke$lambda$1$lambda$0(function2, optionStatisticsViewState);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, function0, primaryButtonText, false, null, false, (Function0) objRememberedValue, this.$viewState.getSecondaryButtonText(), false, null, false, composer, 0, 0, 59198);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(Function2 function2, OptionStatisticsViewState optionStatisticsViewState) {
                                        function2.invoke(optionStatisticsViewState.getWatchlistItemState(), optionStatisticsViewState.getOptionStrategySecurity());
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composerStartRestartGroup, 54), composer2, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                        }
                    }
                }
            }
            final boolean z32 = z2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        final boolean z322 = z2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int OptionStatisticsInnerComposable$lambda$7(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    private static final OptionStatisticsViewState OptionStatisticsComposable$lambda$0(SnapshotState4<OptionStatisticsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionStatisticsInnerComposable$lambda$8(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    /* renamed from: drawSimulatedReturnNuxDot-4WTKRHQ, reason: not valid java name */
    public static final Modifier m17022drawSimulatedReturnNuxDot4WTKRHQ(Modifier drawSimulatedReturnNuxDot, final long j) {
        Intrinsics.checkNotNullParameter(drawSimulatedReturnNuxDot, "$this$drawSimulatedReturnNuxDot");
        return DrawModifierKt.drawWithCache(drawSimulatedReturnNuxDot, new Function1() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStatisticsComposable.drawSimulatedReturnNuxDot_4WTKRHQ$lambda$15(j, (CacheDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawSimulatedReturnNuxDot_4WTKRHQ$lambda$15(final long j, CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        final float fMo5016toPx0680j_4 = drawWithCache.mo5016toPx0680j_4(preTradeStatNuxDotRadius);
        final float fMo5016toPx0680j_42 = drawWithCache.mo5016toPx0680j_4(preTradeStatNuxDotStartPadding);
        return drawWithCache.onDrawWithContent(new Function1() { // from class: com.robinhood.android.options.statistics.OptionStatisticsComposableKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStatisticsComposable.drawSimulatedReturnNuxDot_4WTKRHQ$lambda$15$lambda$14(j, fMo5016toPx0680j_4, fMo5016toPx0680j_42, (ContentDrawScope) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawSimulatedReturnNuxDot_4WTKRHQ$lambda$15$lambda$14(long j, float f, float f2, ContentDrawScope onDrawWithContent) {
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (onDrawWithContent.mo6963getSizeNHjbRc() & 4294967295L)) / 2;
        DrawScope.m6947drawCircleVaOC9Bg$default(onDrawWithContent, j, f, Offset.m6535constructorimpl((Float.floatToRawIntBits(f2) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat))), 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }
}
