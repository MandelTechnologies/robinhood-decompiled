package com.robinhood.android.common.portfolio.position;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.instrumentrow.PspRow3;
import com.robinhood.android.instrumentrow.PspRowState;
import com.robinhood.android.instrumentrow.models.BackgroundColor;
import com.robinhood.android.instrumentrow.models.Text;
import com.robinhood.android.models.portfolio.PositionDetails;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionPspRow.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"PositionPspRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/common/portfolio/position/PositionRowState;", "onClick", "Lkotlin/Function0;", "isStale", "", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/common/portfolio/position/PositionRowState;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "pspRowState", "Lcom/robinhood/android/instrumentrow/PspRowState;", "Lcom/robinhood/android/models/portfolio/PositionDetails;", "(Lcom/robinhood/android/models/portfolio/PositionDetails;ZLandroidx/compose/runtime/Composer;I)Lcom/robinhood/android/instrumentrow/PspRowState;", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.portfolio.position.PositionPspRowKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PositionPspRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionPspRow$lambda$0(Modifier modifier, PositionRowState positionRowState, Function0 function0, boolean z, int i, int i2, Composer composer, int i3) {
        PositionPspRow(modifier, positionRowState, function0, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PositionPspRow(Modifier modifier, final PositionRowState state, final Function0<Unit> onClick, final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(852222557);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(852222557, i5, -1, "com.robinhood.android.common.portfolio.position.PositionPspRow (PositionPspRow.kt:19)");
            }
            Modifier modifier4 = modifier3;
            modifier2 = modifier4;
            composer2 = composerStartRestartGroup;
            PspRow3.PspRow(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, onClick, 7, null), pspRowState(state.getDetails(), z, composerStartRestartGroup, (i5 >> 6) & 112), onClick, composer2, (PspRowState.$stable << 3) | (i5 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.position.PositionPspRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PositionPspRow.PositionPspRow$lambda$0(modifier5, state, onClick, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final PspRowState pspRowState(PositionDetails positionDetails, boolean z, Composer composer, int i) {
        long jM18896toComposeColorDefaultediJQMabo;
        long jM18896toComposeColorDefaultediJQMabo2;
        composer.startReplaceGroup(873270005);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(873270005, i, -1, "com.robinhood.android.common.portfolio.position.pspRowState (PositionPspRow.kt:31)");
        }
        Text text = new Text(positionDetails.getTitle().getValue(), SduiColors2.m18896toComposeColorDefaultediJQMabo(positionDetails.getTitle().getColor(), 0L, composer, 0, 1), null);
        Text text2 = new Text(positionDetails.getSubtitle().getValue(), SduiColors2.m18896toComposeColorDefaultediJQMabo(positionDetails.getSubtitle().getColor(), 0L, composer, 0, 1), null);
        long jM18896toComposeColorDefaultediJQMabo3 = SduiColors2.m18896toComposeColorDefaultediJQMabo(positionDetails.getValue().getText().getColor(), 0L, composer, 0, 1);
        if (z) {
            composer.startReplaceGroup(1693869816);
            jM18896toComposeColorDefaultediJQMabo = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
        } else {
            composer.startReplaceGroup(1693870830);
            jM18896toComposeColorDefaultediJQMabo = SduiColors2.m18896toComposeColorDefaultediJQMabo(positionDetails.getValue().getBackgroundColor(), 0L, composer, 0, 1);
        }
        composer.endReplaceGroup();
        long j = jM18896toComposeColorDefaultediJQMabo;
        if (z) {
            composer.startReplaceGroup(1693873496);
            jM18896toComposeColorDefaultediJQMabo2 = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1693874382);
            jM18896toComposeColorDefaultediJQMabo2 = SduiColors2.m18896toComposeColorDefaultediJQMabo(positionDetails.getValue().getBorderColor(), 0L, composer, 0, 1);
            composer.endReplaceGroup();
        }
        PspRowState pspRowState = new PspRowState(text, text2, jM18896toComposeColorDefaultediJQMabo3, new BackgroundColor(j, jM18896toComposeColorDefaultediJQMabo2, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return pspRowState;
    }
}
