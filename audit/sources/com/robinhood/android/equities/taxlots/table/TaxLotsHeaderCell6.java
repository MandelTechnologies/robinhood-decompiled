package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.equities.taxlots.UtilsKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotsHeaderCell.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsHeaderCellKt$TaxLotsHeaderCellComposable$3, reason: use source file name */
/* loaded from: classes3.dex */
final class TaxLotsHeaderCell6 implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ C2002Dp $height;
    final /* synthetic */ TaxLotsHeaderCell $taxLotsHeaderCell;
    final /* synthetic */ C2002Dp $width;

    TaxLotsHeaderCell6(C2002Dp c2002Dp, TaxLotsHeaderCell taxLotsHeaderCell, C2002Dp c2002Dp2) {
        this.$width = c2002Dp;
        this.$taxLotsHeaderCell = taxLotsHeaderCell;
        this.$height = c2002Dp2;
    }

    private static final long invoke$lambda$1(SnapshotState<IntSize> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final void invoke$lambda$2(SnapshotState<IntSize> snapshotState, long j) {
        snapshotState.setValue(IntSize.m8055boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6$lambda$5(SnapshotState snapshotState, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        invoke$lambda$2(snapshotState, it.getSize());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope TaxLotsBaseCell, Composer composer, int i) {
        int i2;
        long jM21426getFg20d7_KjU;
        Intrinsics.checkNotNullParameter(TaxLotsBaseCell, "$this$TaxLotsBaseCell");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(TaxLotsBaseCell) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1555692497, i2, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsHeaderCellComposable.<anonymous> (TaxLotsHeaderCell.kt:100)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(IntSize.m8055boximpl(IntSize.INSTANCE.m8064getZeroYbymL2g()), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(companion2, 0.0f, !IntSize.m8058equalsimpl0(invoke$lambda$1(snapshotState), IntSize.INSTANCE.m8064getZeroYbymL2g()) ? C2002Dp.m7995constructorimpl(density.mo5013toDpu2uoSUM((int) (invoke$lambda$1(snapshotState) >> 32)) + C2002Dp.m7995constructorimpl(16)) : C2002Dp.m7995constructorimpl(Integer.MAX_VALUE), 1, null);
        C2002Dp c2002Dp = this.$width;
        if (c2002Dp != null) {
            c2002Dp.getValue();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierM5176widthInVpY3zN4$default, 0.0f, 1, null);
            if (modifierFillMaxWidth$default != null) {
                modifierM5176widthInVpY3zN4$default = modifierFillMaxWidth$default;
            }
        }
        Modifier modifierAlign = TaxLotsBaseCell.align(modifierM5176widthInVpY3zN4$default, this.$taxLotsHeaderCell.getContentAlignment());
        Alignment centerEnd = this.$taxLotsHeaderCell.getValue() != TaxLotSort.SHARES ? Alignment.INSTANCE.getCenterEnd() : Alignment.INSTANCE.getCenterStart();
        TaxLotsHeaderCell taxLotsHeaderCell = this.$taxLotsHeaderCell;
        C2002Dp c2002Dp2 = this.$height;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAlign);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceGroup(911834891);
        if (taxLotsHeaderCell.isSortable()) {
            TaxLotsHeaderCell5.m13650SortDirectionWithGradientBackgroundl39uw8o(boxScopeInstance, taxLotsHeaderCell, c2002Dp2, composer, 6);
        }
        composer.endReplaceGroup();
        String strStringValue = UtilsKt.stringValue(taxLotsHeaderCell.getValue(), composer, 0);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i3).getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
        if (taxLotsHeaderCell.isActiveSort() && taxLotsHeaderCell.isSortable()) {
            composer.startReplaceGroup(-1797500709);
            jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1797435206);
            jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU();
            composer.endReplaceGroup();
        }
        Color colorM6701boximpl = Color.m6701boximpl(jM21426getFg20d7_KjU);
        composer.startReplaceGroup(5004770);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsHeaderCellKt$TaxLotsHeaderCellComposable$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotsHeaderCell6.invoke$lambda$7$lambda$6$lambda$5(snapshotState, (TextLayoutResult) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(strStringValue, companion2, colorM6701boximpl, null, null, null, null, 0, false, 1, 0, (Function1) objRememberedValue2, 0, textStyleM7655copyp1EtxEg$default, composer, 805306416, 48, 5624);
        composer.endNode();
        if (this.$width != null) {
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(TaxLotsBaseCell.align(companion2, Alignment.INSTANCE.getTopCenter()), bentoTheme.getColors(composer, i3).m21373getBg30d7_KjU(), 0.0f, composer, 0, 4);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
