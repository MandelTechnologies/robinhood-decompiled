package com.robinhood.android.retirement.p239ui.error;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementDashboardErrorScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"RetirementDashboardErrorScreen", "", "reason", "Lcom/robinhood/android/retirement/ui/error/RetirementDashboardErrorReason;", "callbacks", "Lcom/robinhood/android/retirement/ui/error/RetirementDashboardErrorScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/retirement/ui/error/RetirementDashboardErrorReason;Lcom/robinhood/android/retirement/ui/error/RetirementDashboardErrorScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-retirement-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.ui.error.RetirementDashboardErrorScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementDashboardErrorScreen2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementDashboardErrorScreen$lambda$2(RetirementDashboardErrorReason retirementDashboardErrorReason, RetirementDashboardErrorScreen retirementDashboardErrorScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RetirementDashboardErrorScreen(retirementDashboardErrorReason, retirementDashboardErrorScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RetirementDashboardErrorScreen(final RetirementDashboardErrorReason reason, final RetirementDashboardErrorScreen callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1644085368);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(reason.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1644085368, i3, -1, "com.robinhood.android.retirement.ui.error.RetirementDashboardErrorScreen (RetirementDashboardErrorScreen.kt:20)");
                }
                String strStringResource = StringResources_androidKt.stringResource(reason.getTitle(), composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(reason.getCta(), composerStartRestartGroup, 0);
                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                int i5 = C11048R.drawable.svg_ic_caution_tube_white_no_shadow;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, (i3 >> 6) & 14, 1);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = ((i3 & 112) != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | ((i3 & 14) == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.ui.error.RetirementDashboardErrorScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RetirementDashboardErrorScreen2.RetirementDashboardErrorScreen$lambda$1$lambda$0(callbacks, reason);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                ErrorScreenComposable.ErrorScreenComposable(modifierM21623defaultHorizontalPaddingrAjV9yQ, (Function0) objRememberedValue, i5, strStringResource, null, strStringResource2, type2, false, composerStartRestartGroup, 1597440, 128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.error.RetirementDashboardErrorScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementDashboardErrorScreen2.RetirementDashboardErrorScreen$lambda$2(reason, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String strStringResource3 = StringResources_androidKt.stringResource(reason.getTitle(), composerStartRestartGroup, 0);
            String strStringResource22 = StringResources_androidKt.stringResource(reason.getCta(), composerStartRestartGroup, 0);
            BentoButtons.Type type22 = BentoButtons.Type.Primary;
            int i52 = C11048R.drawable.svg_ic_caution_tube_white_no_shadow;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, (i3 >> 6) & 14, 1);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            if ((i3 & 112) != 32) {
                z = ((i3 & 112) != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | ((i3 & 14) == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.ui.error.RetirementDashboardErrorScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RetirementDashboardErrorScreen2.RetirementDashboardErrorScreen$lambda$1$lambda$0(callbacks, reason);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier4;
                    ErrorScreenComposable.ErrorScreenComposable(modifierM21623defaultHorizontalPaddingrAjV9yQ2, (Function0) objRememberedValue, i52, strStringResource3, null, strStringResource22, type22, false, composerStartRestartGroup, 1597440, 128);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementDashboardErrorScreen$lambda$1$lambda$0(RetirementDashboardErrorScreen retirementDashboardErrorScreen, RetirementDashboardErrorReason retirementDashboardErrorReason) {
        retirementDashboardErrorScreen.onErrorCtaClicked(retirementDashboardErrorReason);
        return Unit.INSTANCE;
    }
}
