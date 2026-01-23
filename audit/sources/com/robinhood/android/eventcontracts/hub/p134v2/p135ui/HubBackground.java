package com.robinhood.android.eventcontracts.hub.p134v2.p135ui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.eventcontracts.sharedeventui.sports.SportsHubBackground4;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcImageStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: HubBackground.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"HubBackground", "", ResourceTypes.STYLE, "Lcom/robinhood/android/models/event/db/predictionmarkets/EcImageStyle;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/models/event/db/predictionmarkets/EcImageStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-hub-v2_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.ui.HubBackgroundKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubBackground {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubBackground$lambda$0(EcImageStyle ecImageStyle, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HubBackground(ecImageStyle, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubBackground$lambda$1(EcImageStyle ecImageStyle, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HubBackground(ecImageStyle, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void HubBackground(final EcImageStyle ecImageStyle, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1557339921);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(ecImageStyle == null ? -1 : ecImageStyle.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1557339921, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.ui.HubBackground (HubBackground.kt:8)");
            }
            if (ecImageStyle == null || ecImageStyle == EcImageStyle.GENERIC) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.HubBackgroundKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HubBackground.HubBackground$lambda$0(ecImageStyle, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (ecImageStyle != EcImageStyle.SPORTS) {
                throw new NoWhenBranchMatchedException();
            }
            SportsHubBackground4.SportsHubBackground(modifier, composerStartRestartGroup, (i3 >> 3) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.ui.HubBackgroundKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HubBackground.HubBackground$lambda$1(ecImageStyle, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
