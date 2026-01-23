package com.robinhood.android.support.supporthub;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.shared.support.C39996R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConciergeOnboardingErrorComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"ConciergeOnboardingErrorComposable", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "onClickClose", "Lkotlin/Function0;", "(Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingErrorComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ConciergeOnboardingErrorComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeOnboardingErrorComposable$lambda$0(PaddingValues paddingValues, Function0 function0, int i, Composer composer, int i2) {
        ConciergeOnboardingErrorComposable(paddingValues, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ConciergeOnboardingErrorComposable(final PaddingValues paddingValues, final Function0<Unit> onClickClose, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(onClickClose, "onClickClose");
        Composer composerStartRestartGroup = composer.startRestartGroup(1321542630);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickClose) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1321542630, i2, -1, "com.robinhood.android.support.supporthub.ConciergeOnboardingErrorComposable (ConciergeOnboardingErrorComposable.kt:26)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(TestTag3.testTag(Modifier.INSTANCE, "ErrorScreen"), 0.0f, composerStartRestartGroup, 0, 1), 0.0f, paddingValues.getTop(), 0.0f, 0.0f, 13, null), false, ComposableLambda3.rememberComposableLambda(-414284975, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingErrorComposableKt.ConciergeOnboardingErrorComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-414284975, i3, -1, "com.robinhood.android.support.supporthub.ConciergeOnboardingErrorComposable.<anonymous> (ConciergeOnboardingErrorComposable.kt:53)");
                    }
                    BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, onClickClose, StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_cta_close, composer2, 0), false, null, false, null, null, false, null, false, composer2, 0, 0, 65343);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ConciergeOnboardingErrorComposable.INSTANCE.getLambda$288594430$feature_support_externalRelease(), composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingErrorComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConciergeOnboardingErrorComposable3.ConciergeOnboardingErrorComposable$lambda$0(paddingValues, onClickClose, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
