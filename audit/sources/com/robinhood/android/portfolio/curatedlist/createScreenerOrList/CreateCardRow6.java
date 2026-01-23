package com.robinhood.android.portfolio.curatedlist.createScreenerOrList;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreateCardRow.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0015"}, m3636d2 = {"CreateCardRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "title", "", "subtitle", "imagePainter", "Landroidx/compose/ui/graphics/painter/Painter;", "imageBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "badge", "Lcom/robinhood/android/portfolio/curatedlist/createScreenerOrList/BadgeData;", "CreateCardRow-cd68TDI", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;JLcom/robinhood/android/portfolio/curatedlist/createScreenerOrList/BadgeData;Landroidx/compose/runtime/Composer;II)V", "CreateCardRowNoBadgePreview", "(Landroidx/compose/runtime/Composer;I)V", "CreateCardRowBadgedPreview", "CreateCardRowBadgedNarrowDevicePreview", "lib-curated-list_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateCardRowKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class CreateCardRow6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateCardRowBadgedNarrowDevicePreview$lambda$5(int i, Composer composer, int i2) {
        CreateCardRowBadgedNarrowDevicePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateCardRowBadgedPreview$lambda$4(int i, Composer composer, int i2) {
        CreateCardRowBadgedPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateCardRowNoBadgePreview$lambda$3(int i, Composer composer, int i2) {
        CreateCardRowNoBadgePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateCardRow_cd68TDI$lambda$2(Modifier modifier, Function0 function0, String str, String str2, Painter painter, long j, BadgeData badgeData, int i, int i2, Composer composer, int i3) {
        m17643CreateCardRowcd68TDI(modifier, function0, str, str2, painter, j, badgeData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2 A[PHI: r15
      0x00c2: PHI (r15v13 int) = (r15v0 int), (r15v6 int), (r15v7 int) binds: [B:66:0x00c0, B:76:0x00da, B:75:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01af  */
    /* renamed from: CreateCardRow-cd68TDI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17643CreateCardRowcd68TDI(Modifier modifier, Function0<Unit> function0, final String title, final String subtitle, final Painter imagePainter, final long j, BadgeData badgeData, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function0<Unit> function02;
        int i4;
        Function0<Unit> function03;
        Composer composer2;
        final Modifier modifier3;
        final Function0<Unit> function04;
        final BadgeData badgeData2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        BadgeData badgeData3 = badgeData;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(imagePainter, "imagePainter");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1002612418);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(title) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(subtitle) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(imagePainter) ? 16384 : 8192;
            }
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
                }
                i4 = i2 & 64;
                int i7 = 1572864;
                if (i4 != 0) {
                    i3 |= i7;
                } else if ((1572864 & i) == 0) {
                    i7 = (2097152 & i) == 0 ? composerStartRestartGroup.changed(badgeData3) : composerStartRestartGroup.changedInstance(badgeData3) ? 1048576 : 524288;
                    i3 |= i7;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i6 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateCardRowKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function03 = (Function0) objRememberedValue;
                    } else {
                        function03 = function02;
                    }
                    if (i4 != 0) {
                        badgeData3 = null;
                    }
                    final BadgeData badgeData4 = badgeData3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1002612418, i3, -1, "com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateCardRow (CreateCardRow.kt:51)");
                    }
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, function03, 7, null);
                    Modifier modifier5 = modifier4;
                    Function0<Unit> function05 = function03;
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    CardKt.Card(modifierM4893clickableXHw0xAI$default, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardDefaults.m5729cardColorsro_MJ88(bentoTheme.getColors(composerStartRestartGroup, i8).m21371getBg0d7_KjU(), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14), null, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i8).m21373getBg30d7_KjU()), ComposableLambda3.rememberComposableLambda(1311942668, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateCardRowKt$CreateCardRow$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                            invoke(column5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 Card, Composer composer3, int i9) {
                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            if ((i9 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1311942668, i9, -1, "com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateCardRow.<anonymous> (CreateCardRow.kt:60)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            float f = 103;
                            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(f));
                            long j2 = j;
                            Painter painter = imagePainter;
                            String str = subtitle;
                            String str2 = title;
                            BadgeData badgeData5 = badgeData4;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Horizontal start = arrangement.getStart();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5156height3ABfNKs);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            ImageKt.Image(painter, (String) null, Background3.m4872backgroundbw27NRU$default(row6.align(SizeKt.m5171sizeVpY3zN4(companion, C2002Dp.m7995constructorimpl(86), C2002Dp.m7995constructorimpl(f)), companion2.getCenterVertically()), j2, null, 2, null), companion2.getCenter(), ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer3, 27696, 96);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i10 = BentoTheme.$stable;
                            Modifier modifierWeight$default = Row5.weight$default(row6, PaddingKt.m5142padding3ABfNKs(companion, bentoTheme2.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM()), 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composer3, 6);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer3, 0);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                            Modifier modifierWeight = row6.weight(companion, 1.0f, false);
                            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
                            int iM7959getEllipsisgIe3tQ8 = companion4.m7959getEllipsisgIe3tQ8();
                            BentoText2.m20747BentoText38GnDrw(str2, modifierWeight, Color.m6701boximpl(bentoTheme2.getColors(composer3, i10).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, bentoTheme2.getTypography(composer3, i10).getTextM(), composer3, 817913856, 0, 7528);
                            composer3.startReplaceGroup(1974842004);
                            if (badgeData5 != null) {
                                InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(badgeData5.getText(), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme2.getSpacing(composer3, i10).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Integer.valueOf(badgeData5.getIcon().getAsset().getResourceId()), null, null, false, null, null, composer3, 12582912, 120);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme2.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(bentoTheme2.getColors(composer3, i10).m21425getFg0d7_KjU()), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i10).getTextS(), composer3, 12582912, 0, 8056);
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 8);
                    composer2 = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    function04 = function05;
                    badgeData2 = badgeData4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    badgeData2 = badgeData3;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    function04 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateCardRowKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CreateCardRow6.CreateCardRow_cd68TDI$lambda$2(modifier3, function04, title, subtitle, imagePainter, j, badgeData2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            i4 = i2 & 64;
            int i72 = 1572864;
            if (i4 != 0) {
            }
            if ((599187 & i3) != 599186) {
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i4 != 0) {
                }
                final BadgeData badgeData42 = badgeData3;
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, function03, 7, null);
                Modifier modifier52 = modifier4;
                Function0<Unit> function052 = function03;
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i82 = BentoTheme.$stable;
                CardKt.Card(modifierM4893clickableXHw0xAI$default2, roundedCornerShapeM5327RoundedCornerShape0680j_42, cardDefaults2.m5729cardColorsro_MJ88(bentoTheme2.getColors(composerStartRestartGroup, i82).m21371getBg0d7_KjU(), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14), null, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composerStartRestartGroup, i82).m21373getBg30d7_KjU()), ComposableLambda3.rememberComposableLambda(1311942668, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateCardRowKt$CreateCardRow$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                        invoke(column5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 Card, Composer composer3, int i9) {
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i9 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1311942668, i9, -1, "com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateCardRow.<anonymous> (CreateCardRow.kt:60)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        float f = 103;
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(f));
                        long j2 = j;
                        Painter painter = imagePainter;
                        String str = subtitle;
                        String str2 = title;
                        BadgeData badgeData5 = badgeData42;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Horizontal start = arrangement.getStart();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5156height3ABfNKs);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        ImageKt.Image(painter, (String) null, Background3.m4872backgroundbw27NRU$default(row6.align(SizeKt.m5171sizeVpY3zN4(companion, C2002Dp.m7995constructorimpl(86), C2002Dp.m7995constructorimpl(f)), companion2.getCenterVertically()), j2, null, 2, null), companion2.getCenter(), ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer3, 27696, 96);
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        Modifier modifierWeight$default = Row5.weight$default(row6, PaddingKt.m5142padding3ABfNKs(companion, bentoTheme22.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM()), 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composer3, 6);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer3, 0);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                        Modifier modifierWeight = row6.weight(companion, 1.0f, false);
                        TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
                        int iM7959getEllipsisgIe3tQ8 = companion4.m7959getEllipsisgIe3tQ8();
                        BentoText2.m20747BentoText38GnDrw(str2, modifierWeight, Color.m6701boximpl(bentoTheme22.getColors(composer3, i10).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, bentoTheme22.getTypography(composer3, i10).getTextM(), composer3, 817913856, 0, 7528);
                        composer3.startReplaceGroup(1974842004);
                        if (badgeData5 != null) {
                            InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(badgeData5.getText(), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme22.getSpacing(composer3, i10).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Integer.valueOf(badgeData5.getIcon().getAsset().getResourceId()), null, null, false, null, null, composer3, 12582912, 120);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme22.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(bentoTheme22.getColors(composer3, i10).m21425getFg0d7_KjU()), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i10).getTextS(), composer3, 12582912, 0, 8056);
                        composer3.endNode();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 8);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                function04 = function052;
                badgeData2 = badgeData42;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i4 = i2 & 64;
        int i722 = 1572864;
        if (i4 != 0) {
        }
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void CreateCardRowNoBadgePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(807183934);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(807183934, i, -1, "com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateCardRowNoBadgePreview (CreateCardRow.kt:123)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CreateCardRow2.INSTANCE.m17640getLambda$1852785786$lib_curated_list_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateCardRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateCardRow6.CreateCardRowNoBadgePreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CreateCardRowBadgedPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(221320829);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(221320829, i, -1, "com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateCardRowBadgedPreview (CreateCardRow.kt:137)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CreateCardRow2.INSTANCE.m17639getLambda$1111410635$lib_curated_list_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateCardRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateCardRow6.CreateCardRowBadgedPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CreateCardRowBadgedNarrowDevicePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1078446418);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1078446418, i, -1, "com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateCardRowBadgedNarrowDevicePreview (CreateCardRow.kt:155)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CreateCardRow2.INSTANCE.getLambda$1783333990$lib_curated_list_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateCardRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateCardRow6.CreateCardRowBadgedNarrowDevicePreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
