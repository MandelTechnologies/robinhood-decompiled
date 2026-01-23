package com.robinhood.android.event.detail.contractselector;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.event.detail.builders.ContractSelectorRowTreatmentViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: ContractSelectorRow.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/event/detail/builders/ContractSelectorRowTreatmentViewState;", "state", "Lkotlin/Function2;", "Lcom/robinhood/android/event/detail/contractselector/ContractSelectorButtonViewState;", "", "", "onTradeClicked", "Landroidx/compose/runtime/State;", "j$/time/Instant", "now", "Landroidx/compose/ui/Modifier;", "modifier", "ContractSelectorRow", "(Lcom/robinhood/android/event/detail/builders/ContractSelectorRowTreatmentViewState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/State;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-event-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.contractselector.ContractSelectorRowKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ContractSelectorRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorRow$lambda$0(ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewState, Function2 function2, SnapshotState4 snapshotState4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContractSelectorRow(contractSelectorRowTreatmentViewState, function2, snapshotState4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ContractSelectorRow(ContractSelectorRowTreatmentViewState state, Function2<? super ContractSelectorButtonViewState, ? super Integer, Unit> onTradeClicked, final SnapshotState4<Instant> now, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super ContractSelectorButtonViewState, ? super Integer, Unit> function2;
        final ContractSelectorRowTreatmentViewState contractSelectorRowTreatmentViewState;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTradeClicked, "onTradeClicked");
        Intrinsics.checkNotNullParameter(now, "now");
        Composer composerStartRestartGroup = composer.startRestartGroup(564454163);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTradeClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(now) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(564454163, i3, -1, "com.robinhood.android.event.detail.contractselector.ContractSelectorRow (ContractSelectorRow.kt:14)");
            }
            function2 = onTradeClicked;
            ContractSelectorCenterAlignedVariantKt.ContractSelectorCenterAlignedVariant(state, now.getValue(), modifier3, function2, composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & 896) | ((i3 << 6) & 7168), 0);
            contractSelectorRowTreatmentViewState = state;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function2 = onTradeClicked;
            modifier2 = modifier;
            contractSelectorRowTreatmentViewState = state;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super ContractSelectorButtonViewState, ? super Integer, Unit> function22 = function2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.contractselector.ContractSelectorRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContractSelectorRow.ContractSelectorRow$lambda$0(contractSelectorRowTreatmentViewState, function22, now, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
