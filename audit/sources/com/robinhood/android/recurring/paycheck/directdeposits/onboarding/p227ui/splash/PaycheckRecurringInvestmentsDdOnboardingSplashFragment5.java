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
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment5;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$onViewCreated$1$6, reason: use source file name */
/* loaded from: classes11.dex */
final class PaycheckRecurringInvestmentsDdOnboardingSplashFragment5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ PaycheckRecurringInvestmentsDdOnboardingSplashFragment this$0;

    PaycheckRecurringInvestmentsDdOnboardingSplashFragment5(PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment) {
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
            ComposerKt.traceEventStart(1908484591, i, -1, "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment.onViewCreated.<anonymous>.<anonymous> (PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt:191)");
        }
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(this.this$0.getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7);
        ScarletContextWrapper scarletContextWrapper = this.this$0.getScarletContextWrapper();
        if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
            scarletManager = this.this$0.getScarletManager();
        }
        Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(scarletManager);
        final PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment = this.this$0;
        BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-1493855455, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$onViewCreated$1$6.1

            /* compiled from: PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$onViewCreated$1$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504881 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ SnapshotState4<PaycheckRecurringInvestmentsDdOnboardingSplashViewState> $viewState$delegate;
                final /* synthetic */ PaycheckRecurringInvestmentsDdOnboardingSplashFragment this$0;

                C504881(PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment, SnapshotState4<PaycheckRecurringInvestmentsDdOnboardingSplashViewState> snapshotState4) {
                    this.this$0 = paycheckRecurringInvestmentsDdOnboardingSplashFragment;
                    this.$viewState$delegate = snapshotState4;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(573709676, i, -1, "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt:195)");
                    }
                    PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment = this.this$0;
                    StringResource disclosure = PaycheckRecurringInvestmentsDdOnboardingSplashFragment5.invoke$lambda$0(this.$viewState$delegate).getDisclosure();
                    ServerToBentoAssetMapper2 disclosureLeadingIcon = PaycheckRecurringInvestmentsDdOnboardingSplashFragment5.invoke$lambda$0(this.$viewState$delegate).getDisclosureLeadingIcon();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.this$0);
                    final SnapshotState4<PaycheckRecurringInvestmentsDdOnboardingSplashViewState> snapshotState4 = this.$viewState$delegate;
                    final PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment2 = this.this$0;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment$onViewCreated$1$6$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PaycheckRecurringInvestmentsDdOnboardingSplashFragment5.AnonymousClass1.C504881.invoke$lambda$2$lambda$1(snapshotState4, paycheckRecurringInvestmentsDdOnboardingSplashFragment2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    paycheckRecurringInvestmentsDdOnboardingSplashFragment.Disclosure(null, disclosure, disclosureLeadingIcon, (Function0) objRememberedValue, composer, StringResource.$stable << 3, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$2$lambda$1(SnapshotState4 snapshotState4, PaycheckRecurringInvestmentsDdOnboardingSplashFragment paycheckRecurringInvestmentsDdOnboardingSplashFragment) {
                    DisclosureContent disclosureContent = PaycheckRecurringInvestmentsDdOnboardingSplashFragment5.invoke$lambda$0(snapshotState4).getDisclosureContent();
                    if (disclosureContent != null) {
                        paycheckRecurringInvestmentsDdOnboardingSplashFragment.showDisclosureSheet(disclosureContent);
                    }
                    return Unit.INSTANCE;
                }
            }

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
                    ComposerKt.traceEventStart(-1493855455, i2, -1, "com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (PaycheckRecurringInvestmentsDdOnboardingSplashFragment.kt:194)");
                }
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(573709676, true, new C504881(paycheckRecurringInvestmentsDdOnboardingSplashFragment, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 6);
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
