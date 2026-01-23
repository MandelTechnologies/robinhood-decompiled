package com.robinhood.android.crypto.tab.p093ui.disclosures;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHomeDisclosuresComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"CryptoHomeDisclosuresComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.disclosures.CryptoHomeDisclosuresComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeDisclosuresComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeDisclosuresComposable$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoHomeDisclosuresComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CryptoHomeDisclosuresComposable(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(194293063);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(194293063, i3, -1, "com.robinhood.android.crypto.tab.ui.disclosures.CryptoHomeDisclosuresComposable (CryptoHomeDisclosuresComposable.kt:13)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C13013R.string.crypto_home_tab_disclosure, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 0, 0, 8184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.disclosures.CryptoHomeDisclosuresComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeDisclosuresComposable.CryptoHomeDisclosuresComposable$lambda$0(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
