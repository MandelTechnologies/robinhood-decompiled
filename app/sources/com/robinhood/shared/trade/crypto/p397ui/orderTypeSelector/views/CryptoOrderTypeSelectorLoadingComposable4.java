package com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.views;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoOrderTypeSelectorLoadingComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"CryptoOrderTypeSelectorLoadingComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ORDER_TYPE_HEADER_LOADING_TEXT_PLACEHOLDER", "", "ORDER_TYPE_PRIMARY_LOADING_TEXT_PLACEHOLDER", "ORDER_TYPE_SECONDARY_LOADING_TEXT_PLACEHOLDER", "CryptoOrderTypeSelectorLoadingComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.views.CryptoOrderTypeSelectorLoadingComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderTypeSelectorLoadingComposable4 {
    private static final String ORDER_TYPE_HEADER_LOADING_TEXT_PLACEHOLDER = "-------------";
    private static final String ORDER_TYPE_PRIMARY_LOADING_TEXT_PLACEHOLDER = "--------------------";
    private static final String ORDER_TYPE_SECONDARY_LOADING_TEXT_PLACEHOLDER = "----------------------------------------";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderTypeSelectorLoadingComposable$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoOrderTypeSelectorLoadingComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderTypeSelectorLoadingComposablePreview$lambda$1(int i, Composer composer, int i2) {
        CryptoOrderTypeSelectorLoadingComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CryptoOrderTypeSelectorLoadingComposable(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1348414875);
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
                ComposerKt.traceEventStart(-1348414875, i3, -1, "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.views.CryptoOrderTypeSelectorLoadingComposable (CryptoOrderTypeSelectorLoadingComposable.kt:20)");
            }
            int i5 = ((i3 << 3) & 112) | 3078;
            Modifier modifier2 = modifier;
            LocalShowPlaceholder.Loadable(true, modifier2, null, CryptoOrderTypeSelectorLoadingComposable.INSTANCE.getLambda$735668949$feature_trade_crypto_externalDebug(), composerStartRestartGroup, i5, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.views.CryptoOrderTypeSelectorLoadingComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoOrderTypeSelectorLoadingComposable4.CryptoOrderTypeSelectorLoadingComposable$lambda$0(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CryptoOrderTypeSelectorLoadingComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1675933986);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1675933986, i, -1, "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.views.CryptoOrderTypeSelectorLoadingComposablePreview (CryptoOrderTypeSelectorLoadingComposable.kt:95)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoOrderTypeSelectorLoadingComposable.INSTANCE.getLambda$1494427354$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.views.CryptoOrderTypeSelectorLoadingComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoOrderTypeSelectorLoadingComposable4.CryptoOrderTypeSelectorLoadingComposablePreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
