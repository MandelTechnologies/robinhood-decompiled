package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.splash;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$onViewCreated$1$5, reason: use source file name */
/* loaded from: classes11.dex */
final class PaycheckRecurringInvestmentsDdOnboardingSplashFragment4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ PaycheckRecurringInvestmentsDdOnboardingSplashFragment this$0;

    PaycheckRecurringInvestmentsDdOnboardingSplashFragment4(PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment) {
        this.this$0 = paycheckRecurringInvestmentsDdOnboardingSplashFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaycheckRecurringInvestmentsDdOnboardingSplashViewState invoke$lambda$0(SnapshotState4<PaycheckRecurringInvestmentsDdOnboardingSplashViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ScarletManager scarletManager;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1981850376, i, -1, "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment.onViewCreated.<anonymous>.<anonymous> (PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt:181)");
        }
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(this.this$0.getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7);
        ScarletContextWrapper scarletContextWrapper = this.this$0.getScarletContextWrapper();
        if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
            scarletManager = this.this$0.getScarletManager();
        }
        Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(scarletManager);
        final PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment = this.this$0;
        BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(186673834, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$onViewCreated$1$5.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(186673834, i2, -1, "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt:184)");
                }
                final PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment2 = paycheckRecurringInvestmentsDdOnboardingSplashFragment;
                final SnapshotState4<PaycheckRecurringInvestmentsDdOnboardingSplashViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1006701493, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment.onViewCreated.1.5.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i3) {
                        if ((i3 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1006701493, i3, -1, "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt:185)");
                        }
                        paycheckRecurringInvestmentsDdOnboardingSplashFragment2.Bullets(null, PaycheckRecurringInvestmentsDdOnboardingSplashFragment4.invoke$lambda$0(snapshotState4).getBullets(), composer3, 0, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 384, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
