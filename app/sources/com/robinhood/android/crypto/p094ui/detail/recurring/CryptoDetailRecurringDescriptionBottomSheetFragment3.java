package com.robinhood.android.crypto.p094ui.detail.recurring;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhContentBottomSheet2;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailRecurringDescriptionBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"RecurringDescriptionBottomSheetComposable", "", "dismiss", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDescriptionBottomSheetFragmentKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoDetailRecurringDescriptionBottomSheetFragment3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringDescriptionBottomSheetComposable$lambda$0(Function0 function0, int i, Composer composer, int i2) {
        RecurringDescriptionBottomSheetComposable(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RecurringDescriptionBottomSheetComposable(final Function0<Unit> dismiss, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1636110770);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(dismiss) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1636110770, i2, -1, "com.robinhood.android.crypto.ui.detail.recurring.RecurringDescriptionBottomSheetComposable (CryptoDetailRecurringDescriptionBottomSheetFragment.kt:30)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1310120089, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDescriptionBottomSheetFragmentKt.RecurringDescriptionBottomSheetComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1310120089, i3, -1, "com.robinhood.android.crypto.ui.detail.recurring.RecurringDescriptionBottomSheetComposable.<anonymous> (CryptoDetailRecurringDescriptionBottomSheetFragment.kt:32)");
                    }
                    RhContentBottomSheet2.RhContentBottomSheetLayout(StringResources_androidKt.stringResource(C12757R.string.rhc_crypto_detail_recurring_bottom_sheet_title, composer2, 0), null, StringResources_androidKt.stringResource(C12757R.string.rhc_crypto_detail_recurring_bottom_sheet_description, new Object[]{3}, composer2, 0), StringResources_androidKt.stringResource(C11048R.string.general_label_ok, composer2, 0), null, dismiss, null, null, null, null, composer2, 24624, 960);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDescriptionBottomSheetFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoDetailRecurringDescriptionBottomSheetFragment3.RecurringDescriptionBottomSheetComposable$lambda$0(dismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
