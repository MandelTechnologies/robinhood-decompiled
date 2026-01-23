package com.robinhood.android.transfers.limits.p267ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.bonfire.transfer.limitsv1.details.ApiLimitResetDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LimitsHubResetDetailsBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"LimitsHubResetDetailsBottomSheetComposable", "", "limitsResetDetails", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/details/ApiLimitResetDetails;", "onButtonClick", "Lkotlin/Function0;", "(Lcom/robinhood/models/api/bonfire/transfer/limitsv1/details/ApiLimitResetDetails;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ResetDetailRowTagPrefix", "", "feature-transfer-limits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.limits.ui.LimitsHubResetDetailsBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class LimitsHubResetDetailsBottomSheetComposable {
    public static final String ResetDetailRowTagPrefix = "resetDetailRow_";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LimitsHubResetDetailsBottomSheetComposable$lambda$1(ApiLimitResetDetails apiLimitResetDetails, Function0 function0, int i, Composer composer, int i2) {
        LimitsHubResetDetailsBottomSheetComposable(apiLimitResetDetails, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LimitsHubResetDetailsBottomSheetComposable(final ApiLimitResetDetails limitsResetDetails, final Function0<Unit> onButtonClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(limitsResetDetails, "limitsResetDetails");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-586878656);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(limitsResetDetails) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onButtonClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-586878656, i2, -1, "com.robinhood.android.transfers.limits.ui.LimitsHubResetDetailsBottomSheetComposable (LimitsHubResetDetailsBottomSheetComposable.kt:27)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1368023509, true, new LimitsHubResetDetailsBottomSheetComposable2(limitsResetDetails, onButtonClick), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.limits.ui.LimitsHubResetDetailsBottomSheetComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LimitsHubResetDetailsBottomSheetComposable.LimitsHubResetDetailsBottomSheetComposable$lambda$1(limitsResetDetails, onButtonClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
