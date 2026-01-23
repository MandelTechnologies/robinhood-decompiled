package com.robinhood.shared.taxLots.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.generic.table.DisplayDetails;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import com.robinhood.shared.taxLots.views.TaxLotDisplayCellState;
import com.robinhood.shared.taxLots.views.TaxLotLoadingTable3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotLoadingTable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotLoadingTableKt$lambda$-641038409$1, reason: use source file name */
/* loaded from: classes6.dex */
final class TaxLotLoadingTable2 implements Function6<TaxLotLoadingTable3, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> {
    public static final TaxLotLoadingTable2 INSTANCE = new TaxLotLoadingTable2();

    TaxLotLoadingTable2() {
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Unit invoke(TaxLotLoadingTable3 taxLotLoadingTable3, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer, Integer num) {
        m25779invokeC8IHX40(taxLotLoadingTable3, c2002Dp, c2002Dp2, displayDetails, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-C8IHX40, reason: not valid java name */
    public final void m25779invokeC8IHX40(TaxLotLoadingTable3 cell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails unused$var$, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(cell) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 8195) == 8194 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-641038409, i2, -1, "com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotLoadingTableKt.lambda$-641038409.<anonymous> (TaxLotLoadingTable.kt:57)");
        }
        if (cell instanceof TaxLotLoadingTable3.DisplayCell) {
            composer.startReplaceGroup(-1750484076);
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
            TaxLotDisplayCellState taxLotDisplayCellState = new TaxLotDisplayCellState(new TaxLotDisplayCellState.TextContent("------------", null, null, 6, null), ((TaxLotLoadingTable3.DisplayCell) cell).getShowSecondaryText() ? new TaxLotDisplayCellState.TextContent(OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, null, null, 6, null) : null, TaxLotDisplayCellState.ContentAlignment.START, null, false, 24, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotLoadingTableKt$lambda$-641038409$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TaxLotLoadingTable2.invoke_C8IHX40$lambda$1$lambda$0((Unit) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            TaxLotTableDisplayCell2.TaxLotTableDisplayCell(taxLotDisplayCellState, (Function1) objRememberedValue, modifierWrapContentSize$default, composer, BentoIcon4.$stable | 432, 0);
            composer.endReplaceGroup();
        } else if (cell instanceof TaxLotLoadingTable3.HeaderCell) {
            composer.startReplaceGroup(-1749666420);
            Modifier modifierWrapContentSize$default2 = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
            TaxLotTableHeaderCellState taxLotTableHeaderCellState = new TaxLotTableHeaderCellState(null, "--------", null, 4, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotLoadingTableKt$lambda$-641038409$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TaxLotLoadingTable2.invoke_C8IHX40$lambda$3$lambda$2((String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            TaxLotTableHeaderCell.TaxLotTableHeaderCell(taxLotTableHeaderCellState, (Function1) objRememberedValue2, modifierWrapContentSize$default2, composer, 432, 0);
            composer.endReplaceGroup();
        } else {
            if (!(cell instanceof TaxLotLoadingTable3.InputCell)) {
                composer.startReplaceGroup(-1857584446);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1749324025);
            Modifier modifierWrapContentSize$default3 = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
            TaxLotTableInputCellState taxLotTableInputCellState = new TaxLotTableInputCellState("", "", "", ToggleableState.Off, false, false, null, false, 224, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotLoadingTableKt$lambda$-641038409$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TaxLotLoadingTable2.invoke_C8IHX40$lambda$5$lambda$4((Unit) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function1 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function2() { // from class: com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotLoadingTableKt$lambda$-641038409$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TaxLotLoadingTable2.invoke_C8IHX40$lambda$7$lambda$6((String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            TaxLotTableInputCell3.TaxLotTableInputCell(taxLotTableInputCellState, function1, (Function2) objRememberedValue4, modifierWrapContentSize$default3, composer, 3504, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke_C8IHX40$lambda$1$lambda$0(Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke_C8IHX40$lambda$3$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke_C8IHX40$lambda$5$lambda$4(Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke_C8IHX40$lambda$7$lambda$6(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }
}
