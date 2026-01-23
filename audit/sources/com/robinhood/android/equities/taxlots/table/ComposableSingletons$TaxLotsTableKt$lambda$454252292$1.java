package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.robinhood.android.generic.table.GenericTableData;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV22;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TaxLotsTable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ComposableSingletons$TaxLotsTableKt$lambda$454252292$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$TaxLotsTableKt$lambda$454252292$1 INSTANCE = new ComposableSingletons$TaxLotsTableKt$lambda$454252292$1();

    ComposableSingletons$TaxLotsTableKt$lambda$454252292$1() {
    }

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
            ComposerKt.traceEventStart(454252292, i, -1, "com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableKt.lambda$454252292.<anonymous> (TaxLotsTable.kt:134)");
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        UUID uuidRandomUUID2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
        List<SelectableTaxLot> mockLaxLotData = TaxLotsTableKt.getMockLaxLotData();
        TaxLotSort taxLotSort = TaxLotSort.DATE;
        TaxLotSortDirection taxLotSortDirection = TaxLotSortDirection.DESCENDING;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableKt$lambda$454252292$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$TaxLotsTableKt$lambda$454252292$1.invoke$lambda$1$lambda$0((TaxLotSort) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableKt$lambda$454252292$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposableSingletons$TaxLotsTableKt$lambda$454252292$1.invoke$lambda$3$lambda$2((SelectableTaxLot) obj, (BigDecimal) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        GenericTableData<TaxLotsTableHelpers4> genericTableDataTableDataV2FromTaxLots = TaxLotsTableHelpers5.tableDataV2FromTaxLots(taxLotSort, taxLotSortDirection, false, mockLaxLotData, function1, (Function2) objRememberedValue2, uuidRandomUUID2, "123456789", uuidRandomUUID, 0, null, null, 30);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
            composer.updateRememberedValue(objRememberedValue3);
        }
        BentoNumpadScopeV22 bentoNumpadScopeV22 = new BentoNumpadScopeV22((CoroutineScope) objRememberedValue3);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableKt$lambda$454252292$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$TaxLotsTableKt$lambda$454252292$1.invoke$lambda$5$lambda$4(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Function1 function12 = (Function1) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableKt$lambda$454252292$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        Function0 function0 = (Function0) objRememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableKt$lambda$454252292$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$TaxLotsTableKt$lambda$454252292$1.invoke$lambda$9$lambda$8((BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        TaxLotsTableKt.TaxLotsTable(genericTableDataTableDataV2FromTaxLots, false, function12, function0, bentoNumpadScopeV22, modifierFillMaxSize$default, null, (Function1) objRememberedValue6, composer, 12783024 | GenericTableData.$stable | (BentoNumpadScopeV22.$stable << 12), 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(SelectableTaxLot selectableTaxLot, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(selectableTaxLot, "<unused var>");
        Intrinsics.checkNotNullParameter(bigDecimal, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(TaxLotSort it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(BigDecimal bigDecimal) {
        return Unit.INSTANCE;
    }
}
