package com.robinhood.android.acats.plaid.transfer.partial;

import androidx.compose.material.Chip5;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;

/* compiled from: AcatsPlaidPartialTransferReadyComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0002\u0010\nJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0002\u0010\n¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialChipSortColors;", "Landroidx/compose/material/SelectableChipColors;", "<init>", "()V", "backgroundColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "enabled", "", "selected", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor", "leadingIconColor", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsPlaidPartialChipSortColors implements Chip5 {
    public static final int $stable = 0;
    public static final AcatsPlaidPartialChipSortColors INSTANCE = new AcatsPlaidPartialChipSortColors();

    private AcatsPlaidPartialChipSortColors() {
    }

    @Override // androidx.compose.material.Chip5
    public SnapshotState4<Color> backgroundColor(boolean z, boolean z2, Composer composer, int i) {
        long jM21371getBg0d7_KjU;
        composer.startReplaceGroup(1418968143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1418968143, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialChipSortColors.backgroundColor (AcatsPlaidPartialTransferReadyComposable.kt:444)");
        }
        if (z2) {
            composer.startReplaceGroup(1412005023);
            jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1412062559);
            jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
            composer.endReplaceGroup();
        }
        SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(jM21371getBg0d7_KjU), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4RememberUpdatedState;
    }

    @Override // androidx.compose.material.Chip5
    public SnapshotState4<Color> contentColor(boolean z, boolean z2, Composer composer, int i) {
        composer.startReplaceGroup(-1553756864);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1553756864, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialChipSortColors.contentColor (AcatsPlaidPartialTransferReadyComposable.kt:455)");
        }
        SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU()), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4RememberUpdatedState;
    }

    @Override // androidx.compose.material.Chip5
    public SnapshotState4<Color> leadingIconColor(boolean z, boolean z2, Composer composer, int i) {
        composer.startReplaceGroup(1753179354);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1753179354, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialChipSortColors.leadingIconColor (AcatsPlaidPartialTransferReadyComposable.kt:464)");
        }
        SnapshotState4<Color> snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU()), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return snapshotState4RememberUpdatedState;
    }
}
