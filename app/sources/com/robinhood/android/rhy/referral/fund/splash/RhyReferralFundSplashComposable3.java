package com.robinhood.android.rhy.referral.fund.splash;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.rhy.referral.C27406R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralFundSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"RhyReferralFundSplashComposable", "", "onClickCta", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-rhy-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyReferralFundSplashComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyReferralFundSplashComposable$lambda$0(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RhyReferralFundSplashComposable(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void RhyReferralFundSplashComposable(final Function0<Unit> onClickCta, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-512563895);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClickCta) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-512563895, i3, -1, "com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashComposable (RhyReferralFundSplashComposable.kt:27)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(942142302, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashComposableKt.RhyReferralFundSplashComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(942142302, i5, -1, "com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashComposable.<anonymous> (RhyReferralFundSplashComposable.kt:29)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(modifier, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
                    final Function0<Unit> function0 = onClickCta;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierFillMaxSize$default, false, ComposableLambda3.rememberComposableLambda(-942622189, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashComposableKt.RhyReferralFundSplashComposable.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                            invoke(bentoButtonBar3, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-942622189, i6, -1, "com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashComposable.<anonymous>.<anonymous> (RhyReferralFundSplashComposable.kt:34)");
                            }
                            BentoButtonBar2.BentoButtonBar(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer3, 6, 1), null, null, false, null, null, function0, StringResources_androidKt.stringResource(C27406R.string.rhy_referral_funding_splash_cta, composer3, 0), false, null, false, null, null, false, null, false, composer3, 0, 0, 65342);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), RhyReferralFundSplashComposable.INSTANCE.m18281getLambda$1368377786$feature_rhy_referral_externalDebug(), composer2, 3456, 2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.fund.splash.RhyReferralFundSplashComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralFundSplashComposable3.RhyReferralFundSplashComposable$lambda$0(onClickCta, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
