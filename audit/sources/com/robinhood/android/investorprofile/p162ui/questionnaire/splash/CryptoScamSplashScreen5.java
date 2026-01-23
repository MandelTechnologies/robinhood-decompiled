package com.robinhood.android.investorprofile.p162ui.questionnaire.splash;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoScamSplashScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t¨\u0006\u000b"}, m3636d2 = {"CryptoScamSplashScreen", "", "onContinue", "Lkotlin/Function0;", "onSkip", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewNotBlocking", "(Landroidx/compose/runtime/Composer;I)V", "PreviewBlocking", "feature-investor-profile_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.splash.CryptoScamSplashScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class CryptoScamSplashScreen5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoScamSplashScreen$lambda$0(Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoScamSplashScreen(function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBlocking$lambda$2(int i, Composer composer, int i2) {
        PreviewBlocking(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewNotBlocking$lambda$1(int i, Composer composer, int i2) {
        PreviewNotBlocking(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CryptoScamSplashScreen(final Function0<Unit> onContinue, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(-767243946);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onContinue) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-767243946, i3, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.CryptoScamSplashScreen (CryptoScamSplashScreen.kt:35)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier3, false, ComposableLambda3.rememberComposableLambda(1844705793, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.CryptoScamSplashScreenKt.CryptoScamSplashScreen.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1844705793, i5, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.CryptoScamSplashScreen.<anonymous> (CryptoScamSplashScreen.kt:79)");
                    }
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                    String strStringResource = StringResources_androidKt.stringResource(C19641R.string.questionnaire_continue_cta, composer2, 0);
                    composer2.startReplaceGroup(-1059217243);
                    String strStringResource2 = function0 != null ? StringResources_androidKt.stringResource(C19641R.string.questionnaire_splash_cta_exit, composer2, 0) : null;
                    composer2.endReplaceGroup();
                    BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, onContinue, strStringResource, false, null, false, function0, strStringResource2, false, null, false, composer2, 0, 0, 59198);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), CryptoScamSplashScreen.INSTANCE.m15696getLambda$1293018770$feature_investor_profile_externalDebug(), composerStartRestartGroup, ((i3 >> 6) & 14) | 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.CryptoScamSplashScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoScamSplashScreen5.CryptoScamSplashScreen$lambda$0(onContinue, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewNotBlocking(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1740591449);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1740591449, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.PreviewNotBlocking (CryptoScamSplashScreen.kt:96)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, CryptoScamSplashScreen.INSTANCE.m15697getLambda$1688347041$feature_investor_profile_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.CryptoScamSplashScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoScamSplashScreen5.PreviewNotBlocking$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewBlocking(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2069140038);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2069140038, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.splash.PreviewBlocking (CryptoScamSplashScreen.kt:107)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, CryptoScamSplashScreen.INSTANCE.m15695getLambda$1246478962$feature_investor_profile_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.splash.CryptoScamSplashScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoScamSplashScreen5.PreviewBlocking$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
