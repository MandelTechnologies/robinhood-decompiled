package com.robinhood.android.trade.options.configuration;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionConfigurationSelectionDiscoveryHeaderComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"OptionConfigurationSelectionDiscoveryHeaderComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "disabled", "", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "feature-trade-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDiscoveryHeaderComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionConfigurationSelectionDiscoveryHeaderComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionConfigurationSelectionDiscoveryHeaderComposable$lambda$0(Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        OptionConfigurationSelectionDiscoveryHeaderComposable(modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionConfigurationSelectionDiscoveryHeaderComposable(Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final boolean z2;
        boolean z3;
        final Modifier modifier3;
        long prime;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1199175179);
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
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                z3 = i5 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1199175179, i3, -1, "com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDiscoveryHeaderComposable (OptionConfigurationSelectionDiscoveryHeaderComposable.kt:14)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                modifier3 = modifier4;
                String strStringResource = StringResources_androidKt.stringResource(C29757R.string.option_order_configuration_stop_market_discovery_header, composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C29757R.string.option_order_configuration_stop_market_discovery_header, composerStartRestartGroup, 0);
                if (z3) {
                    composerStartRestartGroup.startReplaceGroup(-1356094150);
                    prime = bentoTheme.getColors(composerStartRestartGroup, i6).getPrime();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1356095016);
                    prime = bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(strStringResource, modifierM5146paddingqDBjuR0$default, null, Color.m6701boximpl(prime), strStringResource2, false, null, null, composerStartRestartGroup, 12582912, 100);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionDiscoveryHeaderComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionConfigurationSelectionDiscoveryHeaderComposable.OptionConfigurationSelectionDiscoveryHeaderComposable$lambda$0(modifier3, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        z2 = z;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            modifier3 = modifier4;
            String strStringResource3 = StringResources_androidKt.stringResource(C29757R.string.option_order_configuration_stop_market_discovery_header, composerStartRestartGroup, 0);
            String strStringResource22 = StringResources_androidKt.stringResource(C29757R.string.option_order_configuration_stop_market_discovery_header, composerStartRestartGroup, 0);
            if (z3) {
            }
            composerStartRestartGroup.endReplaceGroup();
            InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(strStringResource3, modifierM5146paddingqDBjuR0$default2, null, Color.m6701boximpl(prime), strStringResource22, false, null, null, composerStartRestartGroup, 12582912, 100);
            if (ComposerKt.isTraceInProgress()) {
            }
            z2 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
