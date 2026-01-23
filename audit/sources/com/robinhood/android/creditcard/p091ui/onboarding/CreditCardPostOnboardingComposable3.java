package com.robinhood.android.creditcard.p091ui.onboarding;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.creditcard.p091ui.onboarding.CreditCardPostOnboardingComposable3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.notification.NotificationUtils;
import com.robinhood.utils.notifications.Channels;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreditCardPostOnboardingComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0004\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, m3636d2 = {"PostOnboarding", "", "onContinue", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BottomBar", "POST_ONBOARDING_TITLE_TEST_TAG", "", "POST_ONBOARDING_SUBTITLE_TEST_TAG", "POST_ONBOARDING_CTA_TEST_TAG", "POST_ONBOARDING_BOTTOM_CTA_TEST_TAG", "feature-credit-card_externalDebug", "clicked", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.onboarding.CreditCardPostOnboardingComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CreditCardPostOnboardingComposable3 {
    public static final String POST_ONBOARDING_BOTTOM_CTA_TEST_TAG = "post-onboarding-bottom-cta-test-tag";
    public static final String POST_ONBOARDING_CTA_TEST_TAG = "post-onboarding-cta-test-tag";
    public static final String POST_ONBOARDING_SUBTITLE_TEST_TAG = "post-onboarding-subtitle-test-tag";
    public static final String POST_ONBOARDING_TITLE_TEST_TAG = "post-onboarding-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$4(Function0 function0, int i, Composer composer, int i2) {
        BottomBar(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostOnboarding$lambda$0(Function0 function0, int i, Composer composer, int i2) {
        PostOnboarding(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PostOnboarding(final Function0<Unit> onContinue, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(-584281660);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onContinue) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-584281660, i2, -1, "com.robinhood.android.creditcard.ui.onboarding.PostOnboarding (CreditCardPostOnboardingComposable.kt:43)");
            }
            composer2 = composerStartRestartGroup;
            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_POST_ONBOARDING, null, null, null, 14, null), null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-160229928, true, new C126161(AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), onContinue), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1527879263, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.onboarding.CreditCardPostOnboardingComposableKt.PostOnboarding.2
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
                        ComposerKt.traceEventStart(1527879263, i3, -1, "com.robinhood.android.creditcard.ui.onboarding.PostOnboarding.<anonymous> (CreditCardPostOnboardingComposable.kt:65)");
                    }
                    CreditCardPostOnboardingComposable3.BottomBar(onContinue, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, true, false, CreditCardPostOnboardingComposable.INSTANCE.m12853getLambda$1845185392$feature_credit_card_externalDebug(), composer2, 14155776, 390, 2878);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.onboarding.CreditCardPostOnboardingComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreditCardPostOnboardingComposable3.PostOnboarding$lambda$0(onContinue, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CreditCardPostOnboardingComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.onboarding.CreditCardPostOnboardingComposableKt$PostOnboarding$1 */
    static final class C126161 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Function0<Unit> $onContinue;

        C126161(EventLogger eventLogger, Function0<Unit> function0) {
            this.$eventLogger = eventLogger;
            this.$onContinue = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 CreditApplicationScaffold, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(CreditApplicationScaffold, "$this$CreditApplicationScaffold");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160229928, i, -1, "com.robinhood.android.creditcard.ui.onboarding.PostOnboarding.<anonymous> (CreditCardPostOnboardingComposable.kt:49)");
            }
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), CreditCardPostOnboardingComposable3.POST_ONBOARDING_CTA_TEST_TAG);
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_skip, composer, 0);
            long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue);
            final EventLogger eventLogger = this.$eventLogger;
            final Function0<Unit> function0 = this.$onContinue;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.onboarding.CreditCardPostOnboardingComposableKt$PostOnboarding$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreditCardPostOnboardingComposable3.C126161.invoke$lambda$1$lambda$0(eventLogger, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierTestTag, null, null, false, Color.m6701boximpl(jM21425getFg0d7_KjU), composer, 0, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SKIP, loggingUtils.getCcScreen(), new Component(Component.ComponentType.SKIP_BUTTON, null, null, 6, null), null, null, false, 56, null);
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BottomBar$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    public static final void BottomBar(final Function0<Unit> onContinue, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(752655219);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onContinue) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(752655219, i2, -1, "com.robinhood.android.creditcard.ui.onboarding.BottomBar (CreditCardPostOnboardingComposable.kt:103)");
            }
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-862363451, true, new C126151(current, onContinue, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), (SnapshotState) objRememberedValue), composerStartRestartGroup, 54), composer2, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.onboarding.CreditCardPostOnboardingComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreditCardPostOnboardingComposable3.BottomBar$lambda$4(onContinue, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomBar$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CreditCardPostOnboardingComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.onboarding.CreditCardPostOnboardingComposableKt$BottomBar$1 */
    static final class C126151 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $clicked$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Function0<Unit> $onContinue;

        C126151(EventLogger eventLogger, Function0<Unit> function0, Context context, SnapshotState<Boolean> snapshotState) {
            this.$eventLogger = eventLogger;
            this.$onContinue = function0;
            this.$context = context;
            this.$clicked$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            String strStringResource;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-862363451, i, -1, "com.robinhood.android.creditcard.ui.onboarding.BottomBar.<anonymous> (CreditCardPostOnboardingComposable.kt:108)");
            }
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer, 6, 0), CreditCardPostOnboardingComposable3.POST_ONBOARDING_BOTTOM_CTA_TEST_TAG);
            if (CreditCardPostOnboardingComposable3.BottomBar$lambda$2(this.$clicked$delegate)) {
                composer.startReplaceGroup(1825048552);
                strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1825138979);
                strStringResource = StringResources_androidKt.stringResource(C12201R.string.post_onboarding_notifications_cta, composer, 0);
                composer.endReplaceGroup();
            }
            String str = strStringResource;
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue) | composer.changedInstance(this.$context);
            final EventLogger eventLogger = this.$eventLogger;
            final Function0<Unit> function0 = this.$onContinue;
            final Context context = this.$context;
            final SnapshotState<Boolean> snapshotState = this.$clicked$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.onboarding.CreditCardPostOnboardingComposableKt$BottomBar$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreditCardPostOnboardingComposable3.C126151.invoke$lambda$1$lambda$0(eventLogger, function0, context, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, str, modifierTestTag, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0, Context context, SnapshotState snapshotState) {
            if (CreditCardPostOnboardingComposable3.BottomBar$lambda$2(snapshotState)) {
                loggingUtils.logContinue$default(eventLogger, null, 1, null);
                function0.invoke();
            } else {
                Intent disabledSystemNotificationOrChannelSettingsIntent = NotificationUtils.getDisabledSystemNotificationOrChannelSettingsIntent(context, Channels.DEFAULT.getId());
                disabledSystemNotificationOrChannelSettingsIntent.addFlags(268435456);
                context.startActivity(disabledSystemNotificationOrChannelSettingsIntent);
                CreditCardPostOnboardingComposable3.BottomBar$lambda$3(snapshotState, true);
            }
            return Unit.INSTANCE;
        }
    }
}
