package com.truelayer.payments.p419ui.screens.confirmation.components;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.p011ui.graphics.vector.ImageVector;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Dp2;
import androidx.compose.p011ui.unit.Dp5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ExplanationDialogHeader.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"ExplanationDialogHeader", "", "text", "", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.confirmation.components.ExplanationDialogHeaderKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ExplanationDialogHeader {
    public static final void ExplanationDialogHeader(final String text, final ImageVector imageVector, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(imageVector, "imageVector");
        Composer composerStartRestartGroup = composer.startRestartGroup(1713954036);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(imageVector) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1713954036, i2, -1, "com.truelayer.payments.ui.screens.confirmation.components.ExplanationDialogHeader (ExplanationDialogHeader.kt:12)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i3 = MaterialTheme.$stable;
            float f = 20;
            TextWithIcon.m27095TextWithIcon1sVaVRk(text, null, imageVector, materialTheme.getColorScheme(composerStartRestartGroup, i3).getSecondary(), Dp5.m8017boximpl(Dp2.m8006DpSizeYgX7TsA(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f))), materialTheme.getTypography(composerStartRestartGroup, i3).getTitleMedium(), 0L, composerStartRestartGroup, (i2 & 14) | 24576 | ((i2 << 3) & 896), 66);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.components.ExplanationDialogHeaderKt.ExplanationDialogHeader.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ExplanationDialogHeader.ExplanationDialogHeader(text, imageVector, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
