package com.robinhood.shared.discover.section;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.models.p080db.ChartLine;
import com.robinhood.android.charts.segmented.ScrubLineType;
import com.robinhood.android.charts.segmented.SegmentedLine;
import com.robinhood.android.charts.segmented.SegmentedLineChart;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout8;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.shared.discover.section.DiscoverRow;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: DiscoverRow.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002"}, m3636d2 = {"DiscoverRowComposable", "", "state", "Lcom/robinhood/shared/discover/section/DiscoverRow$Loaded;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/discover/section/DiscoverRow$Loaded;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-discover_externalDebug", "showBackupText", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.discover.section.DiscoverRowKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class DiscoverRow2 {

    /* compiled from: DiscoverRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.discover.section.DiscoverRowKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.f5855UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverRowComposable$lambda$12(DiscoverRow.Loaded loaded, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DiscoverRowComposable(loaded, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DiscoverRowComposable(final DiscoverRow.Loaded state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Row6 row6;
        Modifier modifier3;
        int i4;
        Modifier.Companion companion2;
        Modifier.Companion companion3;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        BentoTheme bentoTheme;
        int i5;
        Composer composer2;
        List<ChartLine> chartLines;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        Composer composer3;
        int currentCompositeKeyHash5;
        Composer composerM6388constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        int i6;
        int i7;
        long jM21426getFg20d7_KjU;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        long jM21456getPositive0d7_KjU;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(80388563);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(state) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(80388563, i3, -1, "com.robinhood.shared.discover.section.DiscoverRowComposable (DiscoverRow.kt:46)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    String logoUrl = state.getLogoUrl();
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(logoUrl == null || StringsKt.isBlank(logoUrl)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.discover.section.DiscoverRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DiscoverRow2.DiscoverRowComposable$lambda$4$lambda$3((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue2, 1, null);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics$default);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically = companion4.getCenterVertically();
                Modifier.Companion companion6 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                BentoBaseRowLayout8 bentoBaseRowLayout8 = BentoBaseRowLayout8.INSTANCE;
                Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoBaseRowLayout8.m21050getPaddingHorizontalD9Ej5fM(), bentoBaseRowLayout8.m21051getPaddingVerticalD9Ej5fM()), companion4.getCenterStart());
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
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
                row6 = Row6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-913502633);
                if (state.isCrypto()) {
                    modifier3 = modifier4;
                    i4 = 0;
                    companion2 = companion6;
                } else {
                    if (DiscoverRowComposable$lambda$1(snapshotState)) {
                        composerStartRestartGroup.startReplaceGroup(1746226217);
                        modifier3 = modifier4;
                        i4 = 0;
                        BentoPogKt.m20686BentoTextPogTYpPzmw(String.valueOf(StringsKt.first(state.getSecondaryText())), LocalShowPlaceholder.withBentoCirclePlaceholder$default(companion6, false, 1, null), false, false, null, BentoPogSize.Number, null, null, composerStartRestartGroup, 196608, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                        companion2 = companion6;
                    } else {
                        modifier3 = modifier4;
                        i4 = 0;
                        composerStartRestartGroup.startReplaceGroup(1746509867);
                        Modifier modifierWithBentoCirclePlaceholder$default = LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(companion6, BentoBaseRowState.Start.Image.ImageSize.Small.getValue()), false, 1, null);
                        String logoUrl2 = state.getLogoUrl();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.discover.section.DiscoverRowKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return DiscoverRow2.DiscoverRowComposable$lambda$11$lambda$10$lambda$6$lambda$5(snapshotState, (AsyncImagePainter.State.Error) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        companion2 = companion6;
                        composerStartRestartGroup = composerStartRestartGroup;
                        ImageKt.Image(SingletonAsyncImagePainter.m9121rememberAsyncImagePainterHtA5bXE(logoUrl2, null, null, null, null, null, (Function1) objRememberedValue3, null, 0, null, composerStartRestartGroup, 1572864, 958), state.getPrimaryText(), modifierWithBentoCirclePlaceholder$default, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, 120);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, i4);
                }
                composerStartRestartGroup.endReplaceGroup();
                companion3 = companion2;
                Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, i4);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String primaryText = state.getPrimaryText();
                bentoTheme = BentoTheme.INSTANCE;
                i5 = BentoTheme.$stable;
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                TextOverflow.Companion companion7 = TextOverflow.INSTANCE;
                Composer composer4 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(primaryText, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, companion7.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM, composer4, 817889280, 0, 7546);
                BentoText2.m20747BentoText38GnDrw(state.getSecondaryText(), null, Color.m6701boximpl(bentoTheme.getColors(composer4, i5).m21426getFg20d7_KjU()), null, null, null, null, companion7.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer4, i5).getTextS(), composer4, 817889280, 0, 7546);
                composer2 = composer4;
                composer2.endNode();
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                composer2.startReplaceGroup(-913449751);
                chartLines = state.getChartLines();
                if (chartLines != null && !chartLines.isEmpty() && !state.isCrypto()) {
                    SegmentedLineChart.SegmentedLineChart(extensions2.toPersistentList(SduiChartMappersKt.m18604mapSdcSegmentedLinesRxXgDco(state.getChartLines(), 0.0f, null, composer2, 0, 6)), PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(Row5.weight$default(row6, Clip.clipToBounds(companion3), 1.0f, false, 2, null), C2002Dp.m7995constructorimpl(48)), 0.0f, bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, null, null, ScrubLineType.SCRUBBING_DISABLED, false, null, composer2, SegmentedLine.$stable | 100663296, 0, 1788);
                    composer2 = composer2;
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                }
                composer2.endReplaceGroup();
                Modifier modifierWeight$default2 = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getEnd(), composer2, 48);
                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default2);
                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor4);
                }
                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
                composer3 = composer2;
                BentoText2.m20747BentoText38GnDrw(state.getMetaText(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU()), null, null, null, null, companion7.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer3, 817889280, 0, 7546);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(bentoTheme.getSpacing(composer3, i5).m21597getXxsmallD9Ej5fM()), companion4.getCenterVertically(), composer3, 48);
                currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer3, companion3);
                Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                if (composer3.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.useNode();
                } else {
                    composer3.createNode(constructor5);
                }
                composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion5.getSetModifier());
                composer3.startReplaceGroup(1778873523);
                if (state.getChartDirection() == null) {
                    Direction chartDirection = state.getChartDirection();
                    int i9 = chartDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[chartDirection.ordinal()];
                    if (i9 != 1) {
                        i6 = 2;
                        if (i9 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_DOWN_12;
                    } else {
                        i6 = 2;
                        serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.STOCK_UP_12;
                    }
                    BentoIcon4.Size12 size12 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
                    Direction chartDirection2 = state.getChartDirection();
                    int i10 = chartDirection2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[chartDirection2.ordinal()];
                    if (i10 == 1) {
                        composer3.startReplaceGroup(1778891936);
                        jM21456getPositive0d7_KjU = bentoTheme.getColors(composer3, i5).m21456getPositive0d7_KjU();
                        composer3.endReplaceGroup();
                    } else {
                        if (i10 != i6) {
                            composer3.startReplaceGroup(1778889067);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(1778894400);
                        jM21456getPositive0d7_KjU = bentoTheme.getColors(composer3, i5).m21452getNegative0d7_KjU();
                        composer3.endReplaceGroup();
                    }
                    BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21456getPositive0d7_KjU, null, null, false, composer3, BentoIcon4.Size12.$stable | 48, 56);
                } else {
                    i6 = 2;
                }
                composer3.endReplaceGroup();
                String secondaryMetaText = state.getSecondaryMetaText();
                TextStyle textS = bentoTheme.getTypography(composer3, i5).getTextS();
                Direction chartDirection3 = state.getChartDirection();
                i7 = chartDirection3 != null ? -1 : WhenMappings.$EnumSwitchMapping$0[chartDirection3.ordinal()];
                if (i7 != -1) {
                    composer3.startReplaceGroup(1778910267);
                    jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i5).m21426getFg20d7_KjU();
                    composer3.endReplaceGroup();
                } else if (i7 == 1) {
                    composer3.startReplaceGroup(1778905920);
                    jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i5).m21456getPositive0d7_KjU();
                    composer3.endReplaceGroup();
                } else {
                    if (i7 != i6) {
                        composer3.startReplaceGroup(1778903225);
                        composer3.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer3.startReplaceGroup(1778908256);
                    jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i5).m21452getNegative0d7_KjU();
                    composer3.endReplaceGroup();
                }
                BentoText2.m20747BentoText38GnDrw(secondaryMetaText, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, companion7.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textS, composer3, 817889280, 0, 7546);
                composerStartRestartGroup = composer3;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.discover.section.DiscoverRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DiscoverRow2.DiscoverRowComposable$lambda$12(state, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue2, 1, null);
            Alignment.Companion companion42 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion42.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics$default2);
            ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor6 = companion52.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion52.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap6, companion52.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion52.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier6, companion52.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically2 = companion42.getCenterVertically();
                Modifier.Companion companion62 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion62, 0.0f, 1, null);
                BentoBaseRowLayout8 bentoBaseRowLayout82 = BentoBaseRowLayout8.INSTANCE;
                Modifier modifierAlign2 = boxScopeInstance2.align(PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default2, bentoBaseRowLayout82.m21050getPaddingHorizontalD9Ej5fM(), bentoBaseRowLayout82.m21051getPaddingVerticalD9Ej5fM()), companion42.getCenterStart());
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign2);
                Function0<ComposeUiNode> constructor22 = companion52.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion52.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion52.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion52.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion52.getSetModifier());
                    row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-913502633);
                    if (state.isCrypto()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    companion3 = companion2;
                    Modifier modifierWeight$default3 = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion42.getStart(), composerStartRestartGroup, i4);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default3);
                    Function0<ComposeUiNode> constructor32 = companion52.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion52.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion52.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion52.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion52.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        String primaryText2 = state.getPrimaryText();
                        bentoTheme = BentoTheme.INSTANCE;
                        i5 = BentoTheme.$stable;
                        TextStyle textM2 = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
                        long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                        TextOverflow.Companion companion72 = TextOverflow.INSTANCE;
                        Composer composer42 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(primaryText2, null, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, companion72.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM2, composer42, 817889280, 0, 7546);
                        BentoText2.m20747BentoText38GnDrw(state.getSecondaryText(), null, Color.m6701boximpl(bentoTheme.getColors(composer42, i5).m21426getFg20d7_KjU()), null, null, null, null, companion72.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer42, i5).getTextS(), composer42, 817889280, 0, 7546);
                        composer2 = composer42;
                        composer2.endNode();
                        Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                        composer2.startReplaceGroup(-913449751);
                        chartLines = state.getChartLines();
                        if (chartLines != null) {
                            SegmentedLineChart.SegmentedLineChart(extensions2.toPersistentList(SduiChartMappersKt.m18604mapSdcSegmentedLinesRxXgDco(state.getChartLines(), 0.0f, null, composer2, 0, 6)), PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(Row5.weight$default(row6, Clip.clipToBounds(companion3), 1.0f, false, 2, null), C2002Dp.m7995constructorimpl(48)), 0.0f, bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, null, null, ScrubLineType.SCRUBBING_DISABLED, false, null, composer2, SegmentedLine.$stable | 100663296, 0, 1788);
                            composer2 = composer2;
                            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierWeight$default22 = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion42.getEnd(), composer2, 48);
                        currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap42 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default22);
                        Function0<ComposeUiNode> constructor42 = companion52.getConstructor();
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy22, companion52.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion52.getSetResolvedCompositionLocals());
                        setCompositeKeyHash4 = companion52.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl4.getInserting()) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion52.getSetModifier());
                            composer3 = composer2;
                            BentoText2.m20747BentoText38GnDrw(state.getMetaText(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU()), null, null, null, null, companion72.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer3, 817889280, 0, 7546);
                            MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(bentoTheme.getSpacing(composer3, i5).m21597getXxsmallD9Ej5fM()), companion42.getCenterVertically(), composer3, 48);
                            currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap52 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composer3, companion3);
                            Function0<ComposeUiNode> constructor52 = companion52.getConstructor();
                            if (composer3.getApplier() == null) {
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                            }
                            composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy22, companion52.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap52, companion52.getSetResolvedCompositionLocals());
                            setCompositeKeyHash5 = companion52.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl5.getInserting()) {
                                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier52, companion52.getSetModifier());
                                composer3.startReplaceGroup(1778873523);
                                if (state.getChartDirection() == null) {
                                }
                                composer3.endReplaceGroup();
                                String secondaryMetaText2 = state.getSecondaryMetaText();
                                TextStyle textS2 = bentoTheme.getTypography(composer3, i5).getTextS();
                                Direction chartDirection32 = state.getChartDirection();
                                if (chartDirection32 != null) {
                                }
                                if (i7 != -1) {
                                }
                                BentoText2.m20747BentoText38GnDrw(secondaryMetaText2, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, companion72.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textS2, composer3, 817889280, 0, 7546);
                                composerStartRestartGroup = composer3;
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = modifier3;
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

    private static final void DiscoverRowComposable$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverRowComposable$lambda$4$lambda$3(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.selectableGroup(semantics);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverRowComposable$lambda$11$lambda$10$lambda$6$lambda$5(SnapshotState snapshotState, AsyncImagePainter.State.Error it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DiscoverRowComposable$lambda$2(snapshotState, true);
        return Unit.INSTANCE;
    }

    private static final boolean DiscoverRowComposable$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
