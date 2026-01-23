package com.robinhood.android.retirement.p239ui.signup.enoki;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpEnokiInfoResponse;
import com.robinhood.compose.infoscreen.InfoScreenCallbacks;
import com.robinhood.compose.infoscreen.InfoScreenKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EnokiInfoScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"EnokiInfoScreen", "", "enokiInfo", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpEnokiInfoResponse;", "callbacks", "Lcom/robinhood/compose/infoscreen/InfoScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpEnokiInfoResponse;Lcom/robinhood/compose/infoscreen/InfoScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-retirement-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.ui.signup.enoki.EnokiInfoScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class EnokiInfoScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnokiInfoScreen$lambda$0(ApiRetirementSignUpEnokiInfoResponse apiRetirementSignUpEnokiInfoResponse, InfoScreenCallbacks infoScreenCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EnokiInfoScreen(apiRetirementSignUpEnokiInfoResponse, infoScreenCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EnokiInfoScreen(final ApiRetirementSignUpEnokiInfoResponse enokiInfo, final InfoScreenCallbacks callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(enokiInfo, "enokiInfo");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1382184576);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(enokiInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1382184576, i3, -1, "com.robinhood.android.retirement.ui.signup.enoki.EnokiInfoScreen (EnokiInfoScreen.kt:14)");
                }
                InfoScreenKt.m21677InfoScreendNgdfXs(enokiInfo.getTitle(), enokiInfo.getHeader_image(), extensions2.toPersistentList(enokiInfo.getContent()), callbacks, modifier2, 0L, 0L, false, null, composerStartRestartGroup, (i3 << 6) & 64512, 480);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.enoki.EnokiInfoScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EnokiInfoScreen.EnokiInfoScreen$lambda$0(enokiInfo, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            InfoScreenKt.m21677InfoScreendNgdfXs(enokiInfo.getTitle(), enokiInfo.getHeader_image(), extensions2.toPersistentList(enokiInfo.getContent()), callbacks, modifier2, 0L, 0L, false, null, composerStartRestartGroup, (i3 << 6) & 64512, 480);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
