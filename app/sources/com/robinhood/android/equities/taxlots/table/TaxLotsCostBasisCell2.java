package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsCostBasisCell.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsCostBasisCellKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsCostBasisCell2 {
    public static final TaxLotsCostBasisCell2 INSTANCE = new TaxLotsCostBasisCell2();

    /* renamed from: lambda$-2061946515, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8888lambda$2061946515 = ComposableLambda3.composableLambdaInstance(-2061946515, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsCostBasisCellKt$lambda$-2061946515$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2061946515, i, -1, "com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsCostBasisCellKt.lambda$-2061946515.<anonymous> (TaxLotsCostBasisCell.kt:55)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
            Column6 column6 = Column6.INSTANCE;
            float f = 100;
            float f2 = 50;
            TaxLotsCostBasisCell4.m13642TaxLotsCostBasisCellComposableUmHF5L4(new TaxLotsCostBasisCell("$140.12", true, null), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f)), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f2)), null, composer, 432, 8);
            TaxLotsCostBasisCell4.m13642TaxLotsCostBasisCellComposableUmHF5L4(new TaxLotsCostBasisCell("$140.12", false, null), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f)), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f2)), null, composer, 432, 8);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2061946515$lib_tax_lots_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13623getLambda$2061946515$lib_tax_lots_externalDebug() {
        return f8888lambda$2061946515;
    }
}
