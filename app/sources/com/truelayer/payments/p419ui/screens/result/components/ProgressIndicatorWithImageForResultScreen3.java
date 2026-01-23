package com.truelayer.payments.p419ui.screens.result.components;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.truelayer.payments.p419ui.screens.wait.components.ProgressIndicatorWithImage;
import com.truelayer.payments.p419ui.theme.Theme5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProgressIndicatorWithImageForResultScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a!\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"ProgressIndicatorWithImageForResultScreen", "", "imageUri", "", "extendedImageUri", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ProgressIndicatorWithImagePreview", "(Landroidx/compose/runtime/Composer;I)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.result.components.ProgressIndicatorWithImageForResultScreenKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ProgressIndicatorWithImageForResultScreen3 {
    public static final void ProgressIndicatorWithImageForResultScreen(String str, String str2, Composer composer, final int i) {
        int i2;
        final String str3;
        final String str4;
        Composer composerStartRestartGroup = composer.startRestartGroup(814115313);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(814115313, i2, -1, "com.truelayer.payments.ui.screens.result.components.ProgressIndicatorWithImageForResultScreen (ProgressIndicatorWithImageForResultScreen.kt:12)");
            }
            str3 = str;
            str4 = str2;
            ProgressIndicatorWithImage.m27157ProgressIndicatorWithImageCxxc4bg(str3, str4, C2002Dp.m7995constructorimpl(48), C2002Dp.m7995constructorimpl(64), C2002Dp.m7995constructorimpl(5), false, composerStartRestartGroup, (i2 & 14) | 28032 | (i2 & 112), 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str;
            str4 = str2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.components.ProgressIndicatorWithImageForResultScreenKt.ProgressIndicatorWithImageForResultScreen.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ProgressIndicatorWithImageForResultScreen3.ProgressIndicatorWithImageForResultScreen(str3, str4, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ProgressIndicatorWithImagePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1177259291);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1177259291, i, -1, "com.truelayer.payments.ui.screens.result.components.ProgressIndicatorWithImagePreview (ProgressIndicatorWithImageForResultScreen.kt:24)");
            }
            Theme5.Theme(null, false, null, ProgressIndicatorWithImageForResultScreen.INSTANCE.m27150getLambda1$payments_ui_release(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.components.ProgressIndicatorWithImageForResultScreenKt.ProgressIndicatorWithImagePreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ProgressIndicatorWithImageForResultScreen3.ProgressIndicatorWithImagePreview(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
