package com.robinhood.shared.trade.crypto.p397ui.fee.preference.unsupported;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable", "", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/fee/preference/unsupported/CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/trade/crypto/ui/fee/preference/unsupported/CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.fee.preference.unsupported.CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable$lambda$0 */
    public static final Unit m2856x94246b24(CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState cryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m2855xda4794f3(cryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2855xda4794f3(final CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState viewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1314171084);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1314171084, i3, -1, "com.robinhood.shared.trade.crypto.ui.fee.preference.unsupported.CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable (CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable.kt:19)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                modifier3 = modifier4;
                BentoBaseRowLayout.BentoBaseRowLayout(Background3.m4871backgroundbw27NRU(modifier4, bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM())), null, CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable.INSTANCE.m25832getLambda$98847760$feature_trade_crypto_externalDebug(), ComposableLambda3.rememberComposableLambda(-48162767, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.fee.preference.unsupported.CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposableKt.CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-48162767, i6, -1, "com.robinhood.shared.trade.crypto.ui.fee.preference.unsupported.CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable.<anonymous> (CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable.kt:34)");
                        }
                        BentoMarkdownText2.BentoMarkdownText(StringResource2.getString(viewState.getStartTextMarkdown(), composer2, StringResource.$stable), (Modifier) null, MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer2, BentoMarkdownText.$stable), null, null, null, null, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS(), null, null, 0L, null, 0, null, 2031, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, false, false, false, null, composerStartRestartGroup, 12586368, 0, 1906);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.fee.preference.unsupported.CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable3.m2856x94246b24(viewState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            modifier3 = modifier4;
            BentoBaseRowLayout.BentoBaseRowLayout(Background3.m4871backgroundbw27NRU(modifier4, bentoTheme2.getColors(composerStartRestartGroup, i52).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM())), null, CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable.INSTANCE.m25832getLambda$98847760$feature_trade_crypto_externalDebug(), ComposableLambda3.rememberComposableLambda(-48162767, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.fee.preference.unsupported.CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposableKt.CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-48162767, i6, -1, "com.robinhood.shared.trade.crypto.ui.fee.preference.unsupported.CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable.<anonymous> (CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable.kt:34)");
                    }
                    BentoMarkdownText2.BentoMarkdownText(StringResource2.getString(viewState.getStartTextMarkdown(), composer2, StringResource.$stable), (Modifier) null, MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer2, BentoMarkdownText.$stable), null, null, null, null, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS(), null, null, 0L, null, 0, null, 2031, null), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, false, false, false, null, composerStartRestartGroup, 12586368, 0, 1906);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
