package com.robinhood.android.equityscreener.table;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.generic.table.DisplayDetails;
import com.robinhood.android.lib.screener.DisplayScreenerCellsKt;
import com.robinhood.android.lib.screener.ScreenTableCells;
import com.robinhood.equityscreener.models.p294db.Screener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityScreenerTableFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$1 implements Function6<ScreenTableCells, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> {
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ EquityScreenerTableViewState $this_with;
    final /* synthetic */ EquityScreenerTableFragment this$0;

    EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$1(EquityScreenerTableFragment equityScreenerTableFragment, EquityScreenerTableViewState equityScreenerTableViewState, CoroutineScope coroutineScope) {
        this.this$0 = equityScreenerTableFragment;
        this.$this_with = equityScreenerTableViewState;
        this.$scope = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Unit invoke(ScreenTableCells screenTableCells, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer, Integer num) {
        m14006invokeC8IHX40(screenTableCells, c2002Dp, c2002Dp2, displayDetails, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-C8IHX40, reason: not valid java name */
    public final void m14006invokeC8IHX40(ScreenTableCells cell, C2002Dp c2002Dp, C2002Dp c2002Dp2, final DisplayDetails displayDetails, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(displayDetails, "displayDetails");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-895372213, i, -1, "com.robinhood.android.equityscreener.table.EquityScreenerTableFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EquityScreenerTableFragment.kt:312)");
        }
        EquityScreenerTableDuxo duxo = this.this$0.getDuxo();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(duxo);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$1$1$1(duxo);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Function2 function2 = (Function2) ((KFunction) objRememberedValue);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(this.this$0) | composer.changedInstance(this.$this_with);
        final EquityScreenerTableFragment equityScreenerTableFragment = this.this$0;
        final EquityScreenerTableViewState equityScreenerTableViewState = this.$this_with;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$1.invoke_C8IHX40$lambda$2$lambda$1(equityScreenerTableFragment, equityScreenerTableViewState);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        int i2 = i & 7168;
        boolean zChangedInstance3 = composer.changedInstance(this.$scope) | (((i2 ^ 3072) > 2048 && composer.changedInstance(displayDetails)) || (i & 3072) == 2048);
        final CoroutineScope coroutineScope = this.$scope;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equityscreener.table.EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$1.invoke_C8IHX40$lambda$4$lambda$3(coroutineScope, displayDetails);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        DisplayScreenerCellsKt.m15870DisplayScreenerCellwYrrvMY(cell, c2002Dp, c2002Dp2, displayDetails, function2, function0, (Function0) objRememberedValue3, composer, (i & 1022) | (DisplayDetails.$stable << 9) | i2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke_C8IHX40$lambda$2$lambda$1(EquityScreenerTableFragment equityScreenerTableFragment, EquityScreenerTableViewState equityScreenerTableViewState) {
        Screener screener = equityScreenerTableViewState.getScreener();
        equityScreenerTableFragment.onDataDisplayClicked(screener != null ? screener.getId() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke_C8IHX40$lambda$4$lambda$3(CoroutineScope coroutineScope, DisplayDetails displayDetails) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$1$3$1$1(displayDetails, null), 3, null);
        return Unit.INSTANCE;
    }
}
