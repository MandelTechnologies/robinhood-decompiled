package com.robinhood.android.search.highlights.p249ui.sportherocarousel.components;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.search.highlights.p249ui.sportherocarousel.SearchHighlightSportsHeroCardViewState;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OngoingGameStatusBox.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"OnGoingGameStatusBox", "", "leftSide", "Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState$EventSideInfo;", "rightSide", "primaryStatusText", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState$EventSideInfo;Lcom/robinhood/android/search/highlights/ui/sportherocarousel/SearchHighlightSportsHeroCardViewState$EventSideInfo;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-search-highlights_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.search.highlights.ui.sportherocarousel.components.OngoingGameStatusBoxKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class OngoingGameStatusBox {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnGoingGameStatusBox$lambda$3(SearchHighlightSportsHeroCardViewState.EventSideInfo eventSideInfo, SearchHighlightSportsHeroCardViewState.EventSideInfo eventSideInfo2, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OnGoingGameStatusBox(eventSideInfo, eventSideInfo2, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnGoingGameStatusBox(final SearchHighlightSportsHeroCardViewState.EventSideInfo eventSideInfo, final SearchHighlightSportsHeroCardViewState.EventSideInfo eventSideInfo2, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        boolean z;
        boolean z2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(516918755);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(eventSideInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(eventSideInfo2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(516918755, i3, -1, "com.robinhood.android.search.highlights.ui.sportherocarousel.components.OnGoingGameStatusBox (OngoingGameStatusBox.kt:33)");
                }
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4));
                Modifier modifierClip = Clip.clip(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), roundedCornerShapeM5327RoundedCornerShape0680j_4);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                float f = 12;
                Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(Background3.m4871backgroundbw27NRU(modifierClip, bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_4), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(16), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(f));
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String str2 = str != null ? "" : str;
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textS, composerStartRestartGroup, 817889280, 0, 7546);
                Spacer2.Spacer(PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), companion.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.isInvisible(companion3, !(eventSideInfo == null && eventSideInfo.getShowIndicator())), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.DOT_12;
                BentoIcon4.Size12 size12 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
                DayNightColor color = eventSideInfo == null ? eventSideInfo.getColor() : null;
                composerStartRestartGroup.startReplaceGroup(-2093631990);
                Color colorM6701boximpl = color != null ? null : Color.m6701boximpl(color.getColor(composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-2093632492);
                long jM21426getFg20d7_KjU = colorM6701boximpl != null ? bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU() : colorM6701boximpl.getValue();
                composerStartRestartGroup.endReplaceGroup();
                int i6 = BentoIcon4.Size12.$stable;
                BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21426getFg20d7_KjU, modifierM5146paddingqDBjuR0$default, null, false, composerStartRestartGroup, i6 | 48, 48);
                if (eventSideInfo != null || (score = eventSideInfo.getScore()) == null) {
                    String score = "";
                }
                BentoText2.m20747BentoText38GnDrw(score, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall(), composerStartRestartGroup, 12582912, 0, 8058);
                float f2 = 2;
                BoxKt.Box(Background3.m4871backgroundbw27NRU(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion3, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f2)), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2))), composerStartRestartGroup, 0);
                if (eventSideInfo2 != null || (score = eventSideInfo2.getScore()) == null) {
                    String score2 = "";
                }
                BentoText2.m20747BentoText38GnDrw(score2, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall(), composerStartRestartGroup, 12582912, 0, 8058);
                composerStartRestartGroup = composerStartRestartGroup;
                if (eventSideInfo2 == null) {
                    z = true;
                    if (eventSideInfo2.getShowIndicator()) {
                        z2 = true;
                    }
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.isInvisible(companion3, z2 ^ z), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                    BentoIcon4.Size12 size122 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
                    DayNightColor color2 = eventSideInfo2 != null ? eventSideInfo2.getColor() : null;
                    composerStartRestartGroup.startReplaceGroup(-2093588822);
                    Color colorM6701boximpl2 = color2 != null ? Color.m6701boximpl(color2.getColor(composerStartRestartGroup, 0)) : null;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-2093589355);
                    long jM21426getFg20d7_KjU2 = colorM6701boximpl2 == null ? bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU() : colorM6701boximpl2.getValue();
                    composerStartRestartGroup.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(size122, null, jM21426getFg20d7_KjU2, modifierM5146paddingqDBjuR0$default2, null, false, composerStartRestartGroup, i6 | 48, 48);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    z = true;
                }
                z2 = false;
                Modifier modifierM5146paddingqDBjuR0$default22 = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.isInvisible(companion3, z2 ^ z), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                BentoIcon4.Size12 size1222 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
                if (eventSideInfo2 != null) {
                }
                composerStartRestartGroup.startReplaceGroup(-2093588822);
                if (color2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-2093589355);
                long jM21426getFg20d7_KjU22 = colorM6701boximpl2 == null ? bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU() : colorM6701boximpl2.getValue();
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(size1222, null, jM21426getFg20d7_KjU22, modifierM5146paddingqDBjuR0$default22, null, false, composerStartRestartGroup, i6 | 48, 48);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.search.highlights.ui.sportherocarousel.components.OngoingGameStatusBoxKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OngoingGameStatusBox.OnGoingGameStatusBox$lambda$3(eventSideInfo, eventSideInfo2, str, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4));
            Modifier modifierClip2 = Clip.clip(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), roundedCornerShapeM5327RoundedCornerShape0680j_42);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            float f3 = 12;
            Modifier modifierM5145paddingqDBjuR02 = PaddingKt.m5145paddingqDBjuR0(Background3.m4871backgroundbw27NRU(modifierClip2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21372getBg20d7_KjU(), roundedCornerShapeM5327RoundedCornerShape0680j_42), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(16), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(f3));
            Alignment.Companion companion5 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion5.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR02);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Spacer2.Spacer(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion5.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    if (str != null) {
                    }
                    TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                    long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                    TextOverflow.Companion companion42 = TextOverflow.INSTANCE;
                    Modifier modifier52 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, companion42.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textS2, composerStartRestartGroup, 817889280, 0, 7546);
                    Spacer2.Spacer(PaddingKt.m5142padding3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                    MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), companion5.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                    Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                        Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.isInvisible(companion32, !(eventSideInfo == null && eventSideInfo.getShowIndicator())), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = ServerToBentoAssetMapper2.DOT_12;
                        BentoIcon4.Size12 size123 = new BentoIcon4.Size12(serverToBentoAssetMapper22);
                        if (eventSideInfo == null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(-2093631990);
                        if (color != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-2093632492);
                        long jM21426getFg20d7_KjU3 = colorM6701boximpl != null ? bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU() : colorM6701boximpl.getValue();
                        composerStartRestartGroup.endReplaceGroup();
                        int i62 = BentoIcon4.Size12.$stable;
                        BentoIcon2.m20644BentoIconFU0evQE(size123, null, jM21426getFg20d7_KjU3, modifierM5146paddingqDBjuR0$default3, null, false, composerStartRestartGroup, i62 | 48, 48);
                        if (eventSideInfo != null) {
                            String score3 = "";
                            BentoText2.m20747BentoText38GnDrw(score3, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, null, null, null, companion42.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall(), composerStartRestartGroup, 12582912, 0, 8058);
                            float f22 = 2;
                            BoxKt.Box(Background3.m4871backgroundbw27NRU(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion32, C2002Dp.m7995constructorimpl(f3)), C2002Dp.m7995constructorimpl(f22)), bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f22))), composerStartRestartGroup, 0);
                            if (eventSideInfo2 != null) {
                                String score22 = "";
                                BentoText2.m20747BentoText38GnDrw(score22, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, null, null, null, companion42.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall(), composerStartRestartGroup, 12582912, 0, 8058);
                                composerStartRestartGroup = composerStartRestartGroup;
                                if (eventSideInfo2 == null) {
                                }
                                z2 = false;
                                Modifier modifierM5146paddingqDBjuR0$default222 = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.isInvisible(companion32, z2 ^ z), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                                BentoIcon4.Size12 size12222 = new BentoIcon4.Size12(serverToBentoAssetMapper22);
                                if (eventSideInfo2 != null) {
                                }
                                composerStartRestartGroup.startReplaceGroup(-2093588822);
                                if (color2 != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-2093589355);
                                long jM21426getFg20d7_KjU222 = colorM6701boximpl2 == null ? bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU() : colorM6701boximpl2.getValue();
                                composerStartRestartGroup.endReplaceGroup();
                                BentoIcon2.m20644BentoIconFU0evQE(size12222, null, jM21426getFg20d7_KjU222, modifierM5146paddingqDBjuR0$default222, null, false, composerStartRestartGroup, i62 | 48, 48);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                Spacer2.Spacer(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
