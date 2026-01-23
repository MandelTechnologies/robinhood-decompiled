package com.robinhood.android.search.highlights.p249ui.sportherocarousel.components;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.robinhood.android.eventcontracts.sharedeventui.ContractImage;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.search.highlights.p249ui.common.ProbabilityBar3;
import com.robinhood.android.search.highlights.p249ui.common.UtilsKt;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.SearchHighlightSportsHeroCardViewState;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.delta.FloatingOpenInterestDelta;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import p479j$.time.Instant;

/* compiled from: DuelRow.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\u0014\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a_\u0010 \u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010!\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&²\u0006\u000e\u0010#\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\f\u0010$\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState;", "viewState", "", "showSportIcons", "Landroidx/compose/ui/Modifier;", "modifier", "", "SearchHighlightsDuelRow", "(Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/delta/FloatingOpenInterestDelta;", "deltas", "Landroidx/compose/ui/graphics/Color;", ResourceTypes.COLOR, "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "", "maxConcurrentDeltas", "FloatingOpenInterest-X6Ktr_Q", "(Lkotlinx/collections/immutable/ImmutableList;JILandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "FloatingOpenInterest", "delta", "Lkotlinx/coroutines/flow/SharedFlow;", "j$/time/Instant", "timeFlow", "", "startAlpha", "endAlpha", "Landroidx/compose/ui/unit/Dp;", "travelDistance", "FloatingDeltaText-q-7THEk", "(Lcom/robinhood/android/search/highlights/ui/sportherocarousel/delta/FloatingOpenInterestDelta;JLkotlinx/coroutines/flow/SharedFlow;Landroidx/compose/ui/Modifier;FFFILandroidx/compose/runtime/Composer;II)V", "FloatingDeltaText", "MAX_CONCURRENT_DELTAS", "I", "progress", "calculatedAlpha", "yOffset", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.sportherocarousel.components.DuelRowKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class DuelRow {
    private static final int MAX_CONCURRENT_DELTAS = 10;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingDeltaText_q_7THEk$lambda$19(FloatingOpenInterestDelta floatingOpenInterestDelta, long j, SharedFlow sharedFlow, Modifier modifier, float f, float f2, float f3, int i, int i2, int i3, Composer composer, int i4) {
        m18655FloatingDeltaTextq7THEk(floatingOpenInterestDelta, j, sharedFlow, modifier, f, f2, f3, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingDeltaText_q_7THEk$lambda$22(FloatingOpenInterestDelta floatingOpenInterestDelta, long j, SharedFlow sharedFlow, Modifier modifier, float f, float f2, float f3, int i, int i2, int i3, Composer composer, int i4) {
        m18655FloatingDeltaTextq7THEk(floatingOpenInterestDelta, j, sharedFlow, modifier, f, f2, f3, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingOpenInterest_X6Ktr_Q$lambda$7(ImmutableList immutableList, long j, int i, Modifier modifier, int i2, int i3, int i4, Composer composer, int i5) {
        m18656FloatingOpenInterestX6Ktr_Q(immutableList, j, i, modifier, i2, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchHighlightsDuelRow$lambda$3(SearchHighlightSportsHeroCardViewState searchHighlightSportsHeroCardViewState, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SearchHighlightsDuelRow(searchHighlightSportsHeroCardViewState, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchHighlightsDuelRow(final SearchHighlightSportsHeroCardViewState viewState, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        SearchHighlightSportsHeroCardViewState.EventSideInfo leftSide;
        Modifier modifier3;
        int i4;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier4;
        String displayName;
        Modifier.Companion companion;
        BentoTheme bentoTheme;
        int i5;
        Modifier.Companion companion2;
        ImmutableList<FloatingOpenInterestDelta> immutableListPersistentListOf;
        ImmutableList<FloatingOpenInterestDelta> immutableListPersistentListOf2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-524855758);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-524855758, i3, -1, "com.robinhood.android.search.highlights.ui.sportherocarousel.components.SearchHighlightsDuelRow (DuelRow.kt:57)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical bottom = arrangement.getBottom();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(bottom, companion3.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                leftSide = viewState.getLeftSide();
                SearchHighlightSportsHeroCardViewState.EventSideInfo rightSide = viewState.getRightSide();
                composerStartRestartGroup.startReplaceGroup(1923450751);
                if (z) {
                    modifier3 = modifier5;
                    i4 = 0;
                } else {
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getBottom(), composerStartRestartGroup, 48);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier2, companion4.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    String imageUrl = leftSide != null ? leftSide.getImageUrl() : null;
                    String displayName2 = leftSide != null ? leftSide.getDisplayName() : null;
                    DayNightColor color = leftSide != null ? leftSide.getColor() : null;
                    composerStartRestartGroup.startReplaceGroup(-1592368958);
                    Color colorM6701boximpl = color == null ? null : Color.m6701boximpl(color.getColor(composerStartRestartGroup, 0));
                    composerStartRestartGroup.endReplaceGroup();
                    float f = 24;
                    modifier3 = modifier5;
                    i4 = 0;
                    ContractImage.m14359ContractImageMKkPZoM(imageUrl, displayName2, colorM6701boximpl, companion5, C2002Dp.m7995constructorimpl(f), false, composerStartRestartGroup, 224256, 0);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    UtilsKt.m18632SpacerColumnkHDZbjc(bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.startReplaceGroup(-1592361529);
                    if (viewState.getIncludeOpenInterestDeltas()) {
                        if (leftSide == null || (immutableListPersistentListOf2 = leftSide.getDeltas()) == null) {
                            immutableListPersistentListOf2 = extensions2.persistentListOf();
                        }
                        DayNightColor color2 = leftSide != null ? leftSide.getColor() : null;
                        composerStartRestartGroup.startReplaceGroup(-1592355294);
                        Color colorM6701boximpl2 = color2 == null ? null : Color.m6701boximpl(color2.getColor(composerStartRestartGroup, 0));
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1592355802);
                        long jFallbackColor = colorM6701boximpl2 == null ? UtilsKt.fallbackColor(composerStartRestartGroup, 0) : colorM6701boximpl2.getValue();
                        composerStartRestartGroup.endReplaceGroup();
                        companion = companion5;
                        i5 = i7;
                        bentoTheme = bentoTheme2;
                        m18656FloatingOpenInterestX6Ktr_Q(immutableListPersistentListOf2, jFallbackColor, TextAlign.INSTANCE.m7924getStarte0LSkKk(), row6.align(companion5, companion3.getBottom()), 0, composerStartRestartGroup, 0, 16);
                    } else {
                        companion = companion5;
                        bentoTheme = bentoTheme2;
                        i5 = i7;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion6 = companion;
                    Spacer2.Spacer(Row5.weight$default(row6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1592346553);
                    if (viewState.getIncludeOpenInterestDeltas()) {
                        if (rightSide == null || (immutableListPersistentListOf = rightSide.getDeltas()) == null) {
                            immutableListPersistentListOf = extensions2.persistentListOf();
                        }
                        DayNightColor color3 = rightSide != null ? rightSide.getColor() : null;
                        composerStartRestartGroup.startReplaceGroup(-1592340254);
                        Color colorM6701boximpl3 = color3 == null ? null : Color.m6701boximpl(color3.getColor(composerStartRestartGroup, 0));
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1592340793);
                        long jFallbackColor2 = colorM6701boximpl3 == null ? UtilsKt.fallbackColor(composerStartRestartGroup, 0) : colorM6701boximpl3.getValue();
                        composerStartRestartGroup.endReplaceGroup();
                        companion2 = companion6;
                        m18656FloatingOpenInterestX6Ktr_Q(immutableListPersistentListOf, jFallbackColor2, TextAlign.INSTANCE.m7920getEnde0LSkKk(), row6.align(companion6, companion3.getBottom()), 0, composerStartRestartGroup, 0, 16);
                    } else {
                        companion2 = companion6;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    UtilsKt.m18632SpacerColumnkHDZbjc(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0);
                    String imageUrl2 = rightSide != null ? rightSide.getImageUrl() : null;
                    String displayName3 = rightSide != null ? rightSide.getDisplayName() : null;
                    DayNightColor color4 = rightSide != null ? rightSide.getColor() : null;
                    composerStartRestartGroup.startReplaceGroup(-1592325950);
                    Color colorM6701boximpl4 = color4 == null ? null : Color.m6701boximpl(color4.getColor(composerStartRestartGroup, 0));
                    composerStartRestartGroup.endReplaceGroup();
                    ContractImage.m14359ContractImageMKkPZoM(imageUrl2, displayName3, colorM6701boximpl4, companion2, C2002Dp.m7995constructorimpl(f), true, composerStartRestartGroup, 224256, 0);
                    composerStartRestartGroup.endNode();
                    UtilsKt.m18633SpacerRowkHDZbjc(C2002Dp.m7995constructorimpl(12), composerStartRestartGroup, 6, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                ProbabilityBar3.m18629ProbabilityBarDH4mp8Y(viewState.getProbabilitySegments(), null, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 0, 62);
                UtilsKt.m18633SpacerRowkHDZbjc(C2002Dp.m7995constructorimpl(8), composerStartRestartGroup, 6, i4);
                Modifier.Companion companion7 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, i4);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion7);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier3, companion4.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                if (leftSide != null || (displayName = leftSide.getDisplayName()) == null) {
                    String displayName4 = "—";
                }
                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                Modifier modifier6 = modifier3;
                BentoText2.m20747BentoText38GnDrw(displayName4, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i8).getTextL(), composerStartRestartGroup, 0, 0, 8190);
                Spacer2.Spacer(Row5.weight$default(row62, companion7, 1.0f, false, 2, null), composerStartRestartGroup, i4);
                BentoText2.m20747BentoText38GnDrw((rightSide != null || (displayName = rightSide.getDisplayName()) == null) ? "—" : displayName, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i8).getTextL(), composerStartRestartGroup, 0, 0, 8190);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.components.DuelRowKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DuelRow.SearchHighlightsDuelRow$lambda$3(viewState, z, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical bottom2 = arrangement2.getBottom();
            Alignment.Companion companion32 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(bottom2, companion32.getStart(), composerStartRestartGroup, 6);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion42.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion42.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion42.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion42.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion42.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                leftSide = viewState.getLeftSide();
                SearchHighlightSportsHeroCardViewState.EventSideInfo rightSide2 = viewState.getRightSide();
                composerStartRestartGroup.startReplaceGroup(1923450751);
                if (z) {
                }
                composerStartRestartGroup.endReplaceGroup();
                ProbabilityBar3.m18629ProbabilityBarDH4mp8Y(viewState.getProbabilitySegments(), null, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 0, 62);
                UtilsKt.m18633SpacerRowkHDZbjc(C2002Dp.m7995constructorimpl(8), composerStartRestartGroup, 6, i4);
                Modifier.Companion companion72 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion32.getTop(), composerStartRestartGroup, i4);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion72);
                Function0<ComposeUiNode> constructor32 = companion42.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy22, companion42.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap32, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier32, companion42.getSetModifier());
                    Row6 row622 = Row6.INSTANCE;
                    if (leftSide != null) {
                        String displayName42 = "—";
                        BentoTheme bentoTheme32 = BentoTheme.INSTANCE;
                        int i82 = BentoTheme.$stable;
                        Modifier modifier62 = modifier3;
                        BentoText2.m20747BentoText38GnDrw(displayName42, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme32.getTypography(composerStartRestartGroup, i82).getTextL(), composerStartRestartGroup, 0, 0, 8190);
                        Spacer2.Spacer(Row5.weight$default(row622, companion72, 1.0f, false, 2, null), composerStartRestartGroup, i4);
                        if (rightSide2 != null) {
                            BentoText2.m20747BentoText38GnDrw((rightSide2 != null || (displayName = rightSide2.getDisplayName()) == null) ? "—" : displayName, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme32.getTypography(composerStartRestartGroup, i82).getTextL(), composerStartRestartGroup, 0, 0, 8190);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier62;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final float FloatingDeltaText_q_7THEk$lambda$15(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float FloatingDeltaText_q_7THEk$lambda$18(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019d A[LOOP:0: B:96:0x0197->B:98:0x019d, LOOP_END] */
    @SuppressLint({"NowWithoutClock"})
    /* renamed from: FloatingOpenInterest-X6Ktr_Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m18656FloatingOpenInterestX6Ktr_Q(final ImmutableList<FloatingOpenInterestDelta> immutableList, final long j, final int i, Modifier modifier, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        long j2;
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        SharedFlow2 sharedFlow2;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        final int i10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-105963996);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i3 & 48) == 0) {
                i5 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else {
            if ((i3 & 384) == 0) {
                i6 = i;
                i5 |= composerStartRestartGroup.changed(i6) ? 256 : 128;
            }
            i7 = i4 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    modifier2 = modifier;
                    i5 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                    if ((i3 & 24576) == 0) {
                        i9 = i2;
                        i5 |= composerStartRestartGroup.changed(i9) ? 16384 : 8192;
                    }
                    if ((i5 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        i10 = i9;
                    } else {
                        Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        int i11 = i8 == 0 ? 10 : i9;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-105963996, i5, -1, "com.robinhood.android.search.highlights.ui.sportherocarousel.components.FloatingOpenInterest (DuelRow.kt:146)");
                        }
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SharedFlow4.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        sharedFlow2 = (SharedFlow2) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance = composerStartRestartGroup.changedInstance(sharedFlow2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new DuelRow3(sharedFlow2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(sharedFlow2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                        List<FloatingOpenInterestDelta> listTakeLast = immutableList.size() <= i11 ? CollectionsKt.takeLast(immutableList, i11) : immutableList;
                        composerStartRestartGroup.startReplaceGroup(-341508836);
                        for (FloatingOpenInterestDelta floatingOpenInterestDelta : listTakeLast) {
                            composerStartRestartGroup.startMovableGroup(-341507513, floatingOpenInterestDelta);
                            Composer composer3 = composerStartRestartGroup;
                            m18655FloatingDeltaTextq7THEk(floatingOpenInterestDelta, j2, sharedFlow2, null, 0.0f, 0.0f, 0.0f, i6, composer3, (i5 & 112) | ((i5 << 15) & 29360128), 120);
                            composer3.endMovableGroup();
                            j2 = j;
                            i6 = i;
                            i11 = i11;
                            composerStartRestartGroup = composer3;
                        }
                        composer2 = composerStartRestartGroup;
                        int i12 = i11;
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        i10 = i12;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.components.DuelRowKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return DuelRow.FloatingOpenInterest_X6Ktr_Q$lambda$7(immutableList, j, i, modifier3, i10, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 24576;
                i9 = i2;
                if ((i5 & 9363) != 9362) {
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        sharedFlow2 = (SharedFlow2) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance = composerStartRestartGroup.changedInstance(sharedFlow2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue2 = new DuelRow3(sharedFlow2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(sharedFlow2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                            if (immutableList.size() <= i11) {
                            }
                            composerStartRestartGroup.startReplaceGroup(-341508836);
                            while (r0.hasNext()) {
                            }
                            composer2 = composerStartRestartGroup;
                            int i122 = i11;
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                            i10 = i122;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i2;
            if ((i5 & 9363) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i6 = i;
        i7 = i4 & 8;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i2;
        if ((i5 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* renamed from: FloatingDeltaText-q-7THEk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m18655FloatingDeltaTextq7THEk(final FloatingOpenInterestDelta floatingOpenInterestDelta, final long j, final SharedFlow<Instant> sharedFlow, Modifier modifier, float f, float f2, float f3, int i, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        float f4;
        int i7;
        float f5;
        int i8;
        float f6;
        float fM7995constructorimpl;
        final int iM7924getStarte0LSkKk;
        int i9;
        final float f7;
        final float f8;
        final float f9;
        final float f10;
        final float f11;
        final int i10;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(528965765);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(floatingOpenInterestDelta) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(j) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(sharedFlow) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        f4 = f;
                        i4 |= composerStartRestartGroup.changed(f4) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 != 0) {
                        if ((196608 & i2) == 0) {
                            f5 = f2;
                            i4 |= composerStartRestartGroup.changed(f5) ? 131072 : 65536;
                        }
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            i4 |= 1572864;
                            f6 = f3;
                        } else {
                            f6 = f3;
                            if ((i2 & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(f6) ? 1048576 : 524288;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(i)) ? 8388608 : 4194304;
                        }
                        int i11 = i4;
                        if ((i4 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            i10 = i;
                            modifier3 = modifier2;
                            f10 = f4;
                            f11 = f5;
                            f9 = f6;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i5 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i6 != 0) {
                                    f4 = 0.25f;
                                }
                                if (i7 != 0) {
                                    f5 = 0.0f;
                                }
                                fM7995constructorimpl = i8 == 0 ? C2002Dp.m7995constructorimpl(40) : f6;
                                if ((i3 & 128) == 0) {
                                    iM7924getStarte0LSkKk = TextAlign.INSTANCE.m7924getStarte0LSkKk();
                                    i9 = i11 & (-29360129);
                                    f7 = f4;
                                    f8 = f5;
                                } else {
                                    iM7924getStarte0LSkKk = i;
                                    f7 = f4;
                                    f8 = f5;
                                    i9 = i11;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 128) != 0) {
                                    float f12 = f6;
                                    i9 = i11 & (-29360129);
                                    fM7995constructorimpl = f12;
                                    iM7924getStarte0LSkKk = i;
                                    f7 = f4;
                                    f8 = f5;
                                } else {
                                    iM7924getStarte0LSkKk = i;
                                    fM7995constructorimpl = f6;
                                    f7 = f4;
                                    f8 = f5;
                                    i9 = i11;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(528965765, i9, -1, "com.robinhood.android.search.highlights.ui.sportherocarousel.components.FloatingDeltaText (DuelRow.kt:192)");
                            }
                            final float fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fM7995constructorimpl);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            final SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(sharedFlow) | composerStartRestartGroup.changedInstance(floatingOpenInterestDelta);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            final float f13 = fM7995constructorimpl;
                            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new DuelRow2(sharedFlow, floatingOpenInterestDelta, snapshotFloatState2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(sharedFlow, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, (i9 >> 6) & 14);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.components.DuelRowKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(DuelRow.FloatingDeltaText_q_7THEk$lambda$14$lambda$13(floatingOpenInterestDelta, f7, f8, snapshotFloatState2));
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.components.DuelRowKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(DuelRow.FloatingDeltaText_q_7THEk$lambda$17$lambda$16(fMo5016toPx0680j_4, snapshotFloatState2));
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            final SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            if (snapshotFloatState2.getFloatValue() >= 1.0f) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup2 != null) {
                                    final Modifier modifier4 = modifier2;
                                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.components.DuelRowKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return DuelRow.FloatingDeltaText_q_7THEk$lambda$19(floatingOpenInterestDelta, j, sharedFlow, modifier4, f7, f8, f13, iM7924getStarte0LSkKk, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            float f14 = f7;
                            float f15 = f8;
                            Modifier modifier5 = modifier2;
                            int i12 = iM7924getStarte0LSkKk;
                            String str = "+" + floatingOpenInterestDelta.getValue().abs();
                            TextStyle textS = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS();
                            FontWeight bold = FontWeight.INSTANCE.getBold();
                            Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(modifier5, C2002Dp.m7995constructorimpl(30), 0.0f, 2, null);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.components.DuelRowKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return DuelRow.FloatingDeltaText_q_7THEk$lambda$21$lambda$20(snapshotState42, snapshotState4, (GraphicsLayerScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i13 = i9;
                            BentoText2.m20747BentoText38GnDrw(str, GraphicsLayerModifier6.graphicsLayer(modifierM5176widthInVpY3zN4$default, (Function1) objRememberedValue5), Color.m6701boximpl(j), null, bold, null, TextAlign.m7912boximpl(i12), 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, ((i13 << 3) & 896) | 24576 | (3670016 & (i13 >> 3)), 0, 8104);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f9 = f13;
                            f10 = f14;
                            f11 = f15;
                            i10 = i12;
                            modifier3 = modifier5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.components.DuelRowKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return DuelRow.FloatingDeltaText_q_7THEk$lambda$22(floatingOpenInterestDelta, j, sharedFlow, modifier3, f10, f11, f9, i10, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 196608;
                    f5 = f2;
                    i8 = i3 & 64;
                    if (i8 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    int i112 = i4;
                    if ((i4 & 4793491) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if ((i3 & 128) == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                f4 = f;
                i7 = i3 & 32;
                if (i7 != 0) {
                }
                f5 = f2;
                i8 = i3 & 64;
                if (i8 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                int i1122 = i4;
                if ((i4 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            f4 = f;
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            f5 = f2;
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            int i11222 = i4;
            if ((i4 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        f4 = f;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        f5 = f2;
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        int i112222 = i4;
        if ((i4 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float FloatingDeltaText_q_7THEk$lambda$14$lambda$13(FloatingOpenInterestDelta floatingOpenInterestDelta, float f, float f2, SnapshotFloatState2 snapshotFloatState2) {
        return floatingOpenInterestDelta.alpha(snapshotFloatState2.getFloatValue(), f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float FloatingDeltaText_q_7THEk$lambda$17$lambda$16(float f, SnapshotFloatState2 snapshotFloatState2) {
        return 20 - (f * snapshotFloatState2.getFloatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingDeltaText_q_7THEk$lambda$21$lambda$20(SnapshotState4 snapshotState4, SnapshotState4 snapshotState42, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationY(FloatingDeltaText_q_7THEk$lambda$18(snapshotState4));
        graphicsLayer.setAlpha(FloatingDeltaText_q_7THEk$lambda$15(snapshotState42));
        return Unit.INSTANCE;
    }
}
