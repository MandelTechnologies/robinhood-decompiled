package com.robinhood.android.eventcontracts.sharedeventui.sports;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.eventcontracts.sharedeventui.C16594R;
import com.robinhood.android.eventcontracts.sharedeventui.ImageBackground4;
import com.robinhood.android.eventcontracts.sharedeventui.wavebackground.SportsBackgroundData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SportsOrderFlowBackground.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"SportsOrderFlowBackground", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewSportsOrderFlowBackground", "(Landroidx/compose/runtime/Composer;I)V", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.sports.SportsOrderFlowBackgroundKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SportsOrderFlowBackground {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSportsOrderFlowBackground$lambda$1(int i, Composer composer, int i2) {
        PreviewSportsOrderFlowBackground(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SportsOrderFlowBackground$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        SportsOrderFlowBackground(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SportsOrderFlowBackground(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2100717344);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100717344, i3, -1, "com.robinhood.android.eventcontracts.sharedeventui.sports.SportsOrderFlowBackground (SportsOrderFlowBackground.kt:17)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(C16594R.drawable.receipt_sports_pattern, composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.sports.SportsOrderFlowBackgroundKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportsOrderFlowBackground.SportsOrderFlowBackground$lambda$0(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewSportsOrderFlowBackground(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1795229589);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1795229589, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.sports.PreviewSportsOrderFlowBackground (SportsOrderFlowBackground.kt:29)");
            }
            ImageBackground4.EventContractBackground(new SportsBackgroundData(Color2.Color(4287062508L), null), null, null, null, composerStartRestartGroup, 0, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.sports.SportsOrderFlowBackgroundKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SportsOrderFlowBackground.PreviewSportsOrderFlowBackground$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
