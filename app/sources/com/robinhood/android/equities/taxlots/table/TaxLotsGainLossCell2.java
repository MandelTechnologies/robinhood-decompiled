package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equities.taxlots.C14807R;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsGainLossCell.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsGainLossCellKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsGainLossCell2 {
    public static final TaxLotsGainLossCell2 INSTANCE = new TaxLotsGainLossCell2();

    /* renamed from: lambda$-1332229592, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8889lambda$1332229592 = ComposableLambda3.composableLambdaInstance(-1332229592, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsGainLossCellKt$lambda$-1332229592$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1332229592, i, -1, "com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsGainLossCellKt.lambda$-1332229592.<anonymous> (TaxLotsGainLossCell.kt:125)");
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
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            UUID uuidRandomUUID2 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
            TaxLotsGainLossCell5.m13647TaxLotsGainLossCellComposablewYrrvMY(new TaxLotsGainLossCell("123456", uuidRandomUUID, uuidRandomUUID2, "lotId", true, null), null, null, null, null, null, composer, 432, 56);
            UUID uuidRandomUUID3 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID3, "randomUUID(...)");
            UUID uuidRandomUUID4 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID4, "randomUUID(...)");
            float f = 100;
            float f2 = 50;
            TaxLotsGainLossCell5.m13647TaxLotsGainLossCellComposablewYrrvMY(new TaxLotsGainLossCell("123456", uuidRandomUUID3, uuidRandomUUID4, "lotId", true, null), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f)), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f2)), null, null, null, composer, 432, 56);
            UUID uuidRandomUUID5 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID5, "randomUUID(...)");
            UUID uuidRandomUUID6 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID6, "randomUUID(...)");
            TaxLotsGainLossCell taxLotsGainLossCell = new TaxLotsGainLossCell("123456", uuidRandomUUID5, uuidRandomUUID6, "lotId", true, null);
            C2002Dp c2002DpM7993boximpl = C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f));
            C2002Dp c2002DpM7993boximpl2 = C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f2));
            StringResource.Companion companion3 = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion3.invoke("-$140.12");
            Boolean bool = Boolean.FALSE;
            int i2 = StringResource.$stable;
            TaxLotsGainLossCell5.m13647TaxLotsGainLossCellComposablewYrrvMY(taxLotsGainLossCell, c2002DpM7993boximpl, c2002DpM7993boximpl2, null, stringResourceInvoke, bool, composer, (i2 << 12) | 197040, 8);
            UUID uuidRandomUUID7 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID7, "randomUUID(...)");
            UUID uuidRandomUUID8 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID8, "randomUUID(...)");
            TaxLotsGainLossCell5.m13647TaxLotsGainLossCellComposablewYrrvMY(new TaxLotsGainLossCell("123456", uuidRandomUUID7, uuidRandomUUID8, "lotId", true, null), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f)), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f2)), null, companion3.invoke("+$132.12"), Boolean.TRUE, composer, (i2 << 12) | 197040, 8);
            UUID uuidRandomUUID9 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID9, "randomUUID(...)");
            UUID uuidRandomUUID10 = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID10, "randomUUID(...)");
            TaxLotsGainLossCell5.m13647TaxLotsGainLossCellComposablewYrrvMY(new TaxLotsGainLossCell("123456", uuidRandomUUID9, uuidRandomUUID10, "lotId", false, null), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f)), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(f2)), null, companion3.invoke(C14807R.string.tax_lots_table_empty_text, new Object[0]), null, composer, (i2 << 12) | 197040, 8);
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
    });
    private static Function2<Composer, Integer, Unit> lambda$1673434856 = ComposableLambda3.composableLambdaInstance(1673434856, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsGainLossCellKt$lambda$1673434856$1
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
                ComposerKt.traceEventStart(1673434856, i, -1, "com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsGainLossCellKt.lambda$1673434856.<anonymous> (TaxLotsGainLossCell.kt:122)");
            }
            CompositionLocal3.CompositionLocalProvider(InspectionMode.getLocalInspectionMode().provides(Boolean.TRUE), TaxLotsGainLossCell2.INSTANCE.m13624getLambda$1332229592$lib_tax_lots_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1332229592$lib_tax_lots_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13624getLambda$1332229592$lib_tax_lots_externalDebug() {
        return f8889lambda$1332229592;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1673434856$lib_tax_lots_externalDebug() {
        return lambda$1673434856;
    }
}
