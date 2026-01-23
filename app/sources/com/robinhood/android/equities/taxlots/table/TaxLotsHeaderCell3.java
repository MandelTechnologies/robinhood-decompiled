package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotsHeaderCell.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsHeaderCellKt$lambda$-1600596424$1, reason: use source file name */
/* loaded from: classes3.dex */
final class TaxLotsHeaderCell3 implements Function2<Composer, Integer, Unit> {
    public static final TaxLotsHeaderCell3 INSTANCE = new TaxLotsHeaderCell3();

    TaxLotsHeaderCell3() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1600596424, i, -1, "com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsHeaderCellKt.lambda$-1600596424.<anonymous> (TaxLotsHeaderCell.kt:260)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        TaxLotSort taxLotSort = TaxLotSort.DATE;
        TaxLotSortDirection taxLotSortDirection = TaxLotSortDirection.DESCENDING;
        Alignment center = companion2.getCenter();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion4 = Composer.INSTANCE;
        if (objRememberedValue == companion4.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsHeaderCellKt$lambda$-1600596424$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotsHeaderCell3.invoke$lambda$8$lambda$1$lambda$0((TaxLotSort) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        float f = 48;
        TaxLotsHeaderCell5.m13651TaxLotsHeaderCellComposableUmHF5L4(new TaxLotsHeaderCell(taxLotSort, true, false, taxLotSortDirection, center, (Function1) objRememberedValue), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(100)), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f)), null, composer, 432, 8);
        TaxLotSort taxLotSort2 = TaxLotSort.COST_BASIS;
        TaxLotSortDirection taxLotSortDirection2 = TaxLotSortDirection.TAX_LOT_SORT_DIRECTION_UNSPECIFIED;
        Alignment center2 = companion2.getCenter();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion4.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsHeaderCellKt$lambda$-1600596424$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotsHeaderCell3.invoke$lambda$8$lambda$3$lambda$2((TaxLotSort) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        TaxLotsHeaderCell5.m13651TaxLotsHeaderCellComposableUmHF5L4(new TaxLotsHeaderCell(taxLotSort2, false, false, taxLotSortDirection2, center2, (Function1) objRememberedValue2), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(110)), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f)), null, composer, 432, 8);
        TaxLotSort taxLotSort3 = TaxLotSort.GAIN_LOSS;
        TaxLotSortDirection taxLotSortDirection3 = TaxLotSortDirection.ACCENDING;
        Alignment centerEnd = companion2.getCenterEnd();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion4.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsHeaderCellKt$lambda$-1600596424$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotsHeaderCell3.invoke$lambda$8$lambda$5$lambda$4((TaxLotSort) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        TaxLotsHeaderCell5.m13651TaxLotsHeaderCellComposableUmHF5L4(new TaxLotsHeaderCell(taxLotSort3, true, false, taxLotSortDirection3, centerEnd, (Function1) objRememberedValue3), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(90)), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f)), null, composer, 432, 8);
        TaxLotSort taxLotSort4 = TaxLotSort.SHARES;
        Alignment centerEnd2 = companion2.getCenterEnd();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion4.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsHeaderCellKt$lambda$-1600596424$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotsHeaderCell3.invoke$lambda$8$lambda$7$lambda$6((TaxLotSort) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        TaxLotsHeaderCell5.m13651TaxLotsHeaderCellComposableUmHF5L4(new TaxLotsHeaderCell(taxLotSort4, true, false, taxLotSortDirection, centerEnd2, (Function1) objRememberedValue4), null, null, null, composer, 432, 8);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$1$lambda$0(TaxLotSort it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$3$lambda$2(TaxLotSort it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$5$lambda$4(TaxLotSort it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7$lambda$6(TaxLotSort it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
