package com.robinhood.shared.trade.crypto.p397ui.fee.unsupported.coin;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.trade.crypto.C40095R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoFeeUnsupportedCoinBannerComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\"\u001c\u0010\u000b\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"CryptoFeeUnsupportedCoinBannerComposable", "", "assetCurrencyCode", "", "isRebateMarketMakersSupported", "", "onDismissClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feeUnsupportedBannerEventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getFeeUnsupportedBannerEventComponent$annotations", "()V", "getFeeUnsupportedBannerEventComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.fee.unsupported.coin.CryptoFeeUnsupportedCoinBannerComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoFeeUnsupportedCoinBannerComposable {
    private static final Component feeUnsupportedBannerEventComponent = new Component(Component.ComponentType.INFO_BANNER, "crypto_fees_coin_unsupported", null, 4, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeUnsupportedCoinBannerComposable$lambda$2(String str, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoFeeUnsupportedCoinBannerComposable(str, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getFeeUnsupportedBannerEventComponent$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoFeeUnsupportedCoinBannerComposable(final String assetCurrencyCode, final boolean z, final Function0<Unit> onDismissClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Context context;
        final Navigator navigator;
        final EventLogger current;
        final String strStringResource;
        int i4;
        String strStringResource2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
        Intrinsics.checkNotNullParameter(onDismissClicked, "onDismissClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(337412715);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(assetCurrencyCode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissClicked) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(337412715, i3, -1, "com.robinhood.shared.trade.crypto.ui.fee.unsupported.coin.CryptoFeeUnsupportedCoinBannerComposable (CryptoFeeUnsupportedCoinBannerComposable.kt:25)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                strStringResource = StringResources_androidKt.stringResource(C40095R.string.us_crypto_fee_help_center_url, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_ORDER_ENTRY, null, null, null, 14, null), null, null, feeUnsupportedBannerEventComponent, null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(1639597413);
                    i4 = 0;
                    strStringResource2 = StringResources_androidKt.stringResource(C40095R.string.crypto_fee_unsupported_banner_text_volume_tier, new Object[]{assetCurrencyCode}, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    i4 = 0;
                    composerStartRestartGroup.startReplaceGroup(1639718468);
                    strStringResource2 = StringResources_androidKt.stringResource(C40095R.string.crypto_fee_unsupported_non_market_makers_banner_text_volume_tier, new Object[]{assetCurrencyCode}, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                String strStringResource3 = StringResources_androidKt.stringResource(C40095R.string.crypto_fee_unsupported_banner_cta_text, composerStartRestartGroup, i4);
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                long jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21372getBg20d7_KjU();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(strStringResource);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.fee.unsupported.coin.CryptoFeeUnsupportedCoinBannerComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoFeeUnsupportedCoinBannerComposable.CryptoFeeUnsupportedCoinBannerComposable$lambda$1$lambda$0(current, navigator, context, strStringResource);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierAutoLogEvents$default, strStringResource2, null, strStringResource3, (Function0) objRememberedValue, onDismissClicked, jM21425getFg0d7_KjU, jM21372getBg20d7_KjU, composerStartRestartGroup, (i3 << 9) & 458752, 4);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.fee.unsupported.coin.CryptoFeeUnsupportedCoinBannerComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoFeeUnsupportedCoinBannerComposable.CryptoFeeUnsupportedCoinBannerComposable$lambda$2(assetCurrencyCode, z, onDismissClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            strStringResource = StringResources_androidKt.stringResource(C40095R.string.us_crypto_fee_help_center_url, composerStartRestartGroup, 0);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 2, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_ORDER_ENTRY, null, null, null, 14, null), null, null, feeUnsupportedBannerEventComponent, null, 45, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            if (!z) {
            }
            String strStringResource32 = StringResources_androidKt.stringResource(C40095R.string.crypto_fee_unsupported_banner_cta_text, composerStartRestartGroup, i4);
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU();
            long jM21372getBg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21372getBg20d7_KjU();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(strStringResource);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.fee.unsupported.coin.CryptoFeeUnsupportedCoinBannerComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoFeeUnsupportedCoinBannerComposable.CryptoFeeUnsupportedCoinBannerComposable$lambda$1$lambda$0(current, navigator, context, strStringResource);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierAutoLogEvents$default2, strStringResource2, null, strStringResource32, (Function0) objRememberedValue, onDismissClicked, jM21425getFg0d7_KjU2, jM21372getBg20d7_KjU2, composerStartRestartGroup, (i3 << 9) & 458752, 4);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoFeeUnsupportedCoinBannerComposable$lambda$1$lambda$0(EventLogger eventLogger, Navigator navigator, Context context, String str) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.CRYPTO_ORDER_ENTRY, null, null, null, 14, null), feeUnsupportedBannerEventComponent, null, null, false, 57, null);
        Navigators3.showHelpCenterWebViewFragment(navigator, context, str);
        return Unit.INSTANCE;
    }

    public static final Component getFeeUnsupportedBannerEventComponent() {
        return feeUnsupportedBannerEventComponent;
    }
}
