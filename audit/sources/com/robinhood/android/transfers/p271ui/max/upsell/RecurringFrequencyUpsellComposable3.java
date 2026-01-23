package com.robinhood.android.transfers.p271ui.max.upsell;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.transfers.p271ui.max.upsell.RecurringFrequencyUpsellFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringFrequencyUpsellComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt$RecurringFrequencyUpsellContent$1$1$1$1$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class RecurringFrequencyUpsellComposable3 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ RecurringFrequencyUpsellFragment.TransferFrequencyRow $row;
    final /* synthetic */ SnapshotState<RecurringFrequencyUpsellFragment.TransferFrequencyRow> $selectedFrequency;

    RecurringFrequencyUpsellComposable3(RecurringFrequencyUpsellFragment.TransferFrequencyRow transferFrequencyRow, SnapshotState<RecurringFrequencyUpsellFragment.TransferFrequencyRow> snapshotState) {
        this.$row = transferFrequencyRow;
        this.$selectedFrequency = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-282926342, i, -1, "com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecurringFrequencyUpsellComposable.kt:159)");
        }
        RecurringFrequencyUpsellFragment.TransferFrequencyRow transferFrequencyRow = this.$row;
        boolean z = transferFrequencyRow.getFrequency() == this.$selectedFrequency.getValue().getFrequency();
        String strStringResource = StringResources_androidKt.stringResource(this.$row.getDescription(), composer, 0);
        composer.startReplaceGroup(5004770);
        final SnapshotState<RecurringFrequencyUpsellFragment.TransferFrequencyRow> snapshotState = this.$selectedFrequency;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt$RecurringFrequencyUpsellContent$1$1$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringFrequencyUpsellComposable3.invoke$lambda$1$lambda$0(snapshotState, (RecurringFrequencyUpsellFragment.TransferFrequencyRow) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        RecurringFrequencyUpsellComposable2.FrequencySelectionRow(transferFrequencyRow, z, strStringResource, (Function1) objRememberedValue, null, composer, 3072, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, RecurringFrequencyUpsellFragment.TransferFrequencyRow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }
}
