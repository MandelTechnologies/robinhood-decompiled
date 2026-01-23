package com.robinhood.shared.trade.crypto.p397ui.fee.preference;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.trade.crypto.p397ui.fee.preference.toggle.CryptoMonetizationModelPreferenceToggleComposable;
import com.robinhood.shared.trade.crypto.p397ui.fee.preference.unsupported.CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable3;
import com.robinhood.shared.trade.crypto.p397ui.fee.preference.unsupported.CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoMonetizationModelPreferenceParentComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\"\u0016\u0010\r\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0011\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, m3636d2 = {"CryptoMonetizationModelPreferenceParentComposable", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "onShowFeeTierScreen", "Lkotlin/Function0;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "isMonetizationModelPreferenceFee", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lkotlin/jvm/functions/Function0;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_MONETIZATION_MODEL_PREFERENCE_TOGGLE_TEST_TAG", "", "getCRYPTO_MONETIZATION_MODEL_PREFERENCE_TOGGLE_TEST_TAG$annotations", "()V", "CRYPTO_MONETIZATION_MODEL_PREFERENCE_UNSUPPORTED_CURRENCY_PAIR_TEST_TAG", "getCRYPTO_MONETIZATION_MODEL_PREFERENCE_UNSUPPORTED_CURRENCY_PAIR_TEST_TAG$annotations", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.fee.preference.CryptoMonetizationModelPreferenceParentComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoMonetizationModelPreferenceParentComposable {
    public static final String CRYPTO_MONETIZATION_MODEL_PREFERENCE_TOGGLE_TEST_TAG = "crypto_monetization_model_preference_toggle_test_tag";

    /* renamed from: CRYPTO_MONETIZATION_MODEL_PREFERENCE_UNSUPPORTED_CURRENCY_PAIR_TEST_TAG */
    public static final String f6294x444a44c4 = "crypto_monetization_model_preference_unsupported_currency_pair_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoMonetizationModelPreferenceParentComposable$lambda$4(Screen screen, Function0 function0, UiCurrencyPair uiCurrencyPair, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoMonetizationModelPreferenceParentComposable(screen, function0, uiCurrencyPair, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: getCRYPTO_MONETIZATION_MODEL_PREFERENCE_TOGGLE_TEST_TAG$annotations */
    public static /* synthetic */ void m2853xa3855678() {
    }

    /* renamed from: getCRYPTO_MONETIZATION_MODEL_PREFERENCE_UNSUPPORTED_CURRENCY_PAIR_TEST_TAG$annotations */
    public static /* synthetic */ void m2854x9eddc02e() {
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoMonetizationModelPreferenceParentComposable(final Screen eventScreen, final Function0<Unit> onShowFeeTierScreen, final UiCurrencyPair uiCurrencyPair, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(onShowFeeTierScreen, "onShowFeeTierScreen");
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Composer composerStartRestartGroup = composer.startRestartGroup(1602028154);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventScreen) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onShowFeeTierScreen) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(uiCurrencyPair) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1602028154, i3, -1, "com.robinhood.shared.trade.crypto.ui.fee.preference.CryptoMonetizationModelPreferenceParentComposable (CryptoMonetizationModelPreferenceParentComposable.kt:21)");
                }
                if (!uiCurrencyPair.isFeeSupported()) {
                    composerStartRestartGroup.startReplaceGroup(344451145);
                    Modifier modifierTestTag = TestTag3.testTag(modifier3, CRYPTO_MONETIZATION_MODEL_PREFERENCE_TOGGLE_TEST_TAG);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.fee.preference.CryptoMonetizationModelPreferenceParentComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoMonetizationModelPreferenceParentComposable.m2851xf64912f0((SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    CryptoMonetizationModelPreferenceToggleComposable.CryptoMonetizationModelPreferenceToggleComposable(eventScreen, onShowFeeTierScreen, SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue, 1, null), null, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 8);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (z) {
                    composerStartRestartGroup.startReplaceGroup(344881332);
                    Modifier modifierTestTag2 = TestTag3.testTag(modifier3, f6294x444a44c4);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.fee.preference.CryptoMonetizationModelPreferenceParentComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoMonetizationModelPreferenceParentComposable.m2852xdedbf530((SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    CryptoMonetizationModelPreferenceUnsupportedCurrencyPairComposable3.m2855xda4794f3(new CryptoMonetizationModelPreferenceUnsupportedCurrencyPairViewState(uiCurrencyPair.getAssetCurrency().getCode(), uiCurrencyPair.isRebateMarketMakersSupported()), SemanticsModifier6.semantics$default(modifierTestTag2, false, (Function1) objRememberedValue2, 1, null), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(345454088);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.fee.preference.CryptoMonetizationModelPreferenceParentComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoMonetizationModelPreferenceParentComposable.CryptoMonetizationModelPreferenceParentComposable$lambda$4(eventScreen, onShowFeeTierScreen, uiCurrencyPair, z, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!uiCurrencyPair.isFeeSupported()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoMonetizationModelPreferenceParentComposable$lambda$1$lambda$0 */
    public static final Unit m2851xf64912f0(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoMonetizationModelPreferenceParentComposable$lambda$3$lambda$2 */
    public static final Unit m2852xdedbf530(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }
}
