package com.robinhood.android.transfers.limits.p267ui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.bonfire.transfer.limitsv1.details.ApiLimitsHubDetailsSubtitle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LimitsHubDetailsSubtitleComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"LimitsHubDetailsSubtitleComposable", "", "inlineLinkTextOnClick", "Lkotlin/Function0;", "subtitle", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/details/ApiLimitsHubDetailsSubtitle;", "(Lkotlin/jvm/functions/Function0;Lcom/robinhood/models/api/bonfire/transfer/limitsv1/details/ApiLimitsHubDetailsSubtitle;Landroidx/compose/runtime/Composer;I)V", "LimitsHubSubtitleWithLink", "", "LimitsHubSubtitle", "feature-transfer-limits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.limits.ui.LimitsHubDetailsSubtitleComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class LimitsHubDetailsSubtitleComposable {
    public static final String LimitsHubSubtitle = "limitsHubSubtitle";
    public static final String LimitsHubSubtitleWithLink = "limitsHubSubtitleWithLink";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LimitsHubDetailsSubtitleComposable$lambda$0(Function0 function0, ApiLimitsHubDetailsSubtitle apiLimitsHubDetailsSubtitle, int i, Composer composer, int i2) {
        LimitsHubDetailsSubtitleComposable(function0, apiLimitsHubDetailsSubtitle, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LimitsHubDetailsSubtitleComposable$lambda$2(Function0 function0, ApiLimitsHubDetailsSubtitle apiLimitsHubDetailsSubtitle, int i, Composer composer, int i2) {
        LimitsHubDetailsSubtitleComposable(function0, apiLimitsHubDetailsSubtitle, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LimitsHubDetailsSubtitleComposable(final Function0<Unit> inlineLinkTextOnClick, final ApiLimitsHubDetailsSubtitle apiLimitsHubDetailsSubtitle, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(inlineLinkTextOnClick, "inlineLinkTextOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1034914287);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(inlineLinkTextOnClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(apiLimitsHubDetailsSubtitle) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1034914287, i2, -1, "com.robinhood.android.transfers.limits.ui.LimitsHubDetailsSubtitleComposable (LimitsHubDetailsSubtitleComposable.kt:15)");
            }
            if (apiLimitsHubDetailsSubtitle == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.limits.ui.LimitsHubDetailsSubtitleComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LimitsHubDetailsSubtitleComposable.LimitsHubDetailsSubtitleComposable$lambda$0(inlineLinkTextOnClick, apiLimitsHubDetailsSubtitle, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (apiLimitsHubDetailsSubtitle.getLink_text() != null) {
                composerStartRestartGroup.startReplaceGroup(1013581020);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
                int i4 = i2;
                String link_text = apiLimitsHubDetailsSubtitle.getLink_text();
                Intrinsics.checkNotNull(link_text);
                BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(apiLimitsHubDetailsSubtitle.getText(), link_text, inlineLinkTextOnClick, TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1), LimitsHubSubtitleWithLink), jM21425getFg0d7_KjU, 0L, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), 0, composerStartRestartGroup, (i4 << 6) & 896, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1014010556);
                BentoText2.m20747BentoText38GnDrw(apiLimitsHubDetailsSubtitle.getText(), TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1), LimitsHubSubtitle), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.transfers.limits.ui.LimitsHubDetailsSubtitleComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LimitsHubDetailsSubtitleComposable.LimitsHubDetailsSubtitleComposable$lambda$2(inlineLinkTextOnClick, apiLimitsHubDetailsSubtitle, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
