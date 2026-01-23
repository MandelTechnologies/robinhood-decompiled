package com.robinhood.android.jointaccounts.onboarding.creation;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.jointaccounts.onboarding.C20005R;
import com.robinhood.android.jointaccounts.onboarding.Components5;
import com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreen4;
import com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenAnimationData;
import com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenState;
import com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreenTextStyleData;
import com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset;
import com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen2;
import com.robinhood.android.jointaccounts.onboarding.creation.InvitationState;
import com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCreatedViewState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: AccountCreationScreen.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"FallbackRetryLoggingId", "", "FallbackContactSupportLoggingId", "AccountCreationScreen", "", "state", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState;", "callbacks", "Lcom/robinhood/android/jointaccounts/onboarding/creation/AccountCreationScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState;Lcom/robinhood/android/jointaccounts/onboarding/creation/AccountCreationScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AccountCreationScreen2 {
    private static final String FallbackContactSupportLoggingId = "account-creation-contact-support";
    private static final String FallbackRetryLoggingId = "account-creation-try-again";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountCreationScreen$lambda$0(JointAccountCreatedViewState jointAccountCreatedViewState, AccountCreationScreen accountCreationScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountCreationScreen(jointAccountCreatedViewState, accountCreationScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountCreationScreen(final JointAccountCreatedViewState state, final AccountCreationScreen callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        boolean z;
        JointAccountOnboardingAsset jointAccountOnboardingAsset;
        String titleText;
        String bodyText;
        JointAccountCta cta;
        JointAccountCta jointAccountCta;
        JointAccountCta contactSupportCta;
        Integer textAnimationFrame;
        Integer ctaAnimationFrame;
        Integer animationLoopStartFrame;
        Integer num;
        TextStyle displayCapsuleMedium;
        float fM21593getSmallD9Ej5fM;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1465122936);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1465122936, i3, -1, "com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen (AccountCreationScreen.kt:44)");
                }
                z = state instanceof JointAccountCreatedViewState.InitializationError;
                if (!z || (state instanceof JointAccountCreatedViewState.LoadAccountError) || (state instanceof JointAccountCreatedViewState.Loading)) {
                    jointAccountOnboardingAsset = JointAccountOnboardingAsset.Hero.Created.INSTANCE;
                } else {
                    if (!(state instanceof JointAccountCreatedViewState.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InvitationState invitationState = ((JointAccountCreatedViewState.Success) state).getInvitationState();
                    if (invitationState instanceof InvitationState.Complete) {
                        jointAccountOnboardingAsset = JointAccountOnboardingAsset.Hero.Created.INSTANCE;
                    } else {
                        if (!(invitationState instanceof InvitationState.Incomplete)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jointAccountOnboardingAsset = JointAccountOnboardingAsset.Hero.Confirmation.INSTANCE;
                    }
                }
                JointAccountOnboardingAsset jointAccountOnboardingAsset2 = jointAccountOnboardingAsset;
                composerStartRestartGroup.startReplaceGroup(-766105400);
                if (!z) {
                    titleText = StringResources_androidKt.stringResource(C11048R.string.error_description_something_went_wrong, composerStartRestartGroup, 0);
                } else if (state instanceof JointAccountCreatedViewState.LoadAccountError) {
                    titleText = ((JointAccountCreatedViewState.LoadAccountError) state).getTitleText();
                } else if (state instanceof JointAccountCreatedViewState.Loading) {
                    titleText = ((JointAccountCreatedViewState.Loading) state).getTitleText();
                } else {
                    if (!(state instanceof JointAccountCreatedViewState.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    titleText = ((JointAccountCreatedViewState.Success) state).getTitleText();
                }
                String str = titleText;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-766091930);
                if (!z) {
                    bodyText = StringResources_androidKt.stringResource(C20005R.string.joint_account_creation_fallback_error_message, composerStartRestartGroup, 0);
                } else if (state instanceof JointAccountCreatedViewState.LoadAccountError) {
                    bodyText = ((JointAccountCreatedViewState.LoadAccountError) state).getBodyText();
                } else if (state instanceof JointAccountCreatedViewState.Loading) {
                    bodyText = ((JointAccountCreatedViewState.Loading) state).getBodyText();
                } else {
                    if (!(state instanceof JointAccountCreatedViewState.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bodyText = ((JointAccountCreatedViewState.Success) state).getBodyText();
                }
                String str2 = bodyText;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-766078395);
                if (!z) {
                    cta = new JointAccountCta(StringResources_androidKt.stringResource(C11048R.string.error_try_again, composerStartRestartGroup, 0), FallbackRetryLoggingId, null, 4, null);
                } else if (state instanceof JointAccountCreatedViewState.LoadAccountError) {
                    cta = ((JointAccountCreatedViewState.LoadAccountError) state).getRefreshCta();
                } else if (state instanceof JointAccountCreatedViewState.Loading) {
                    cta = null;
                } else {
                    if (!(state instanceof JointAccountCreatedViewState.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cta = ((JointAccountCreatedViewState.Success) state).getCta();
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-766062812);
                if (!z) {
                    contactSupportCta = new JointAccountCta(StringResources_androidKt.stringResource(C11048R.string.general_label_contact_support, composerStartRestartGroup, 0), FallbackContactSupportLoggingId, null, 4, null);
                } else if (state instanceof JointAccountCreatedViewState.LoadAccountError) {
                    contactSupportCta = ((JointAccountCreatedViewState.LoadAccountError) state).getContactSupportCta();
                } else {
                    if (!(state instanceof JointAccountCreatedViewState.Loading) && !(state instanceof JointAccountCreatedViewState.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jointAccountCta = null;
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z2 = state instanceof JointAccountCreatedViewState.Loading;
                    boolean z3 = !z2;
                    if (z || (state instanceof JointAccountCreatedViewState.LoadAccountError) || z2) {
                        textAnimationFrame = null;
                    } else {
                        if (!(state instanceof JointAccountCreatedViewState.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textAnimationFrame = ((JointAccountCreatedViewState.Success) state).getTextAnimationFrame();
                    }
                    if (!z || (state instanceof JointAccountCreatedViewState.LoadAccountError) || z2) {
                        ctaAnimationFrame = null;
                    } else {
                        if (!(state instanceof JointAccountCreatedViewState.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ctaAnimationFrame = ((JointAccountCreatedViewState.Success) state).getCtaAnimationFrame();
                    }
                    if (!z || (state instanceof JointAccountCreatedViewState.LoadAccountError) || z2) {
                        animationLoopStartFrame = null;
                    } else {
                        if (!(state instanceof JointAccountCreatedViewState.Success)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        animationLoopStartFrame = ((JointAccountCreatedViewState.Success) state).getAnimationLoopStartFrame();
                    }
                    if (!z || (state instanceof JointAccountCreatedViewState.LoadAccountError) || (state instanceof JointAccountCreatedViewState.Success)) {
                        num = null;
                    } else {
                        if (!z2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        num = 204;
                    }
                    JointAccountCelebrationScreenAnimationData jointAccountCelebrationScreenAnimationData = new JointAccountCelebrationScreenAnimationData(animationLoopStartFrame, num, textAnimationFrame, ctaAnimationFrame);
                    if (!z || (state instanceof JointAccountCreatedViewState.LoadAccountError) || z2) {
                        composerStartRestartGroup.startReplaceGroup(-765983860);
                        displayCapsuleMedium = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!(state instanceof JointAccountCreatedViewState.Success)) {
                            composerStartRestartGroup.startReplaceGroup(-765991430);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-765980563);
                        displayCapsuleMedium = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getBookCoverCapsuleSmall();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (!z || (state instanceof JointAccountCreatedViewState.LoadAccountError) || z2) {
                        composerStartRestartGroup.startReplaceGroup(-765970467);
                        fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!(state instanceof JointAccountCreatedViewState.Success)) {
                            composerStartRestartGroup.startReplaceGroup(-765977961);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-765967745);
                        fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    final JointAccountCelebrationScreenState jointAccountCelebrationScreenState = new JointAccountCelebrationScreenState(str, str2, jointAccountOnboardingAsset2, cta, jointAccountCta, z3, jointAccountCelebrationScreenAnimationData, new JointAccountCelebrationScreenTextStyleData(displayCapsuleMedium, fM21593getSmallD9Ej5fM, null));
                    Components5.JointAccountStatusBarWrapper(false, ComposableLambda3.rememberComposableLambda(-25393797, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreenKt.AccountCreationScreen.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                            invoke(composer2, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-25393797, i5, -1, "com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen.<anonymous> (AccountCreationScreen.kt:150)");
                            }
                            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), state.getDescriptor()), ComposableLambda3.rememberComposableLambda(585431398, true, new AnonymousClass1(callbacks, jointAccountCelebrationScreenState, state, modifier3), composer2, 54), composer2, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: AccountCreationScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreenKt$AccountCreationScreen$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ AccountCreationScreen $callbacks;
                            final /* synthetic */ Modifier $modifier;
                            final /* synthetic */ JointAccountCelebrationScreenState $screenState;
                            final /* synthetic */ JointAccountCreatedViewState $state;

                            AnonymousClass1(AccountCreationScreen accountCreationScreen, JointAccountCelebrationScreenState jointAccountCelebrationScreenState, JointAccountCreatedViewState jointAccountCreatedViewState, Modifier modifier) {
                                this.$callbacks = accountCreationScreen;
                                this.$screenState = jointAccountCelebrationScreenState;
                                this.$state = jointAccountCreatedViewState;
                                this.$modifier = modifier;
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
                                    ComposerKt.traceEventStart(585431398, i, -1, "com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen.<anonymous>.<anonymous> (AccountCreationScreen.kt:153)");
                                }
                                AccountCreationScreen accountCreationScreen = this.$callbacks;
                                composer.startReplaceGroup(5004770);
                                boolean zChanged = composer.changed(accountCreationScreen);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new AccountCreationScreen3(accountCreationScreen);
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                KFunction kFunction = (KFunction) objRememberedValue;
                                composer.endReplaceGroup();
                                AccountCreationScreen accountCreationScreen2 = this.$callbacks;
                                composer.startReplaceGroup(5004770);
                                boolean zChanged2 = composer.changed(accountCreationScreen2);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new AccountCreationScreen4(accountCreationScreen2);
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                KFunction kFunction2 = (KFunction) objRememberedValue2;
                                composer.endReplaceGroup();
                                JointAccountCelebrationScreenState jointAccountCelebrationScreenState = this.$screenState;
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changed(this.$callbacks);
                                final JointAccountCreatedViewState jointAccountCreatedViewState = this.$state;
                                final AccountCreationScreen accountCreationScreen3 = this.$callbacks;
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreenKt$AccountCreationScreen$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return AccountCreationScreen2.C200421.AnonymousClass1.invoke$lambda$3$lambda$2(jointAccountCreatedViewState, accountCreationScreen3, (String) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                JointAccountCelebrationScreen4.JointAccountCelebrationContent(jointAccountCelebrationScreenState, (Function1) objRememberedValue3, (Function0) kFunction, this.$modifier, (Function0) kFunction2, composer, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(JointAccountCreatedViewState jointAccountCreatedViewState, AccountCreationScreen accountCreationScreen, String str) {
                                if (jointAccountCreatedViewState instanceof JointAccountCreatedViewState.InitializationError) {
                                    accountCreationScreen.onRetryInitializationClicked();
                                } else if (jointAccountCreatedViewState instanceof JointAccountCreatedViewState.LoadAccountError) {
                                    accountCreationScreen.onRetryFetchingAccountClicked();
                                } else {
                                    if (jointAccountCreatedViewState instanceof JointAccountCreatedViewState.Loading) {
                                        throw new IllegalStateException("Primary CTA callback invoked on loading screen");
                                    }
                                    if (!(jointAccountCreatedViewState instanceof JointAccountCreatedViewState.Success)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    accountCreationScreen.onContinueClicked(((JointAccountCreatedViewState.Success) jointAccountCreatedViewState).getInvitationState(), str);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                jointAccountCta = contactSupportCta;
                composerStartRestartGroup.endReplaceGroup();
                boolean z22 = state instanceof JointAccountCreatedViewState.Loading;
                boolean z32 = !z22;
                if (z) {
                    textAnimationFrame = null;
                    if (z) {
                        ctaAnimationFrame = null;
                        if (z) {
                            animationLoopStartFrame = null;
                            if (z) {
                                num = null;
                                JointAccountCelebrationScreenAnimationData jointAccountCelebrationScreenAnimationData2 = new JointAccountCelebrationScreenAnimationData(animationLoopStartFrame, num, textAnimationFrame, ctaAnimationFrame);
                                if (!z) {
                                    composerStartRestartGroup.startReplaceGroup(-765983860);
                                    displayCapsuleMedium = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium();
                                    composerStartRestartGroup.endReplaceGroup();
                                    if (!z) {
                                        composerStartRestartGroup.startReplaceGroup(-765970467);
                                        fM21593getSmallD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                                        composerStartRestartGroup.endReplaceGroup();
                                        final JointAccountCelebrationScreenState jointAccountCelebrationScreenState2 = new JointAccountCelebrationScreenState(str, str2, jointAccountOnboardingAsset2, cta, jointAccountCta, z32, jointAccountCelebrationScreenAnimationData2, new JointAccountCelebrationScreenTextStyleData(displayCapsuleMedium, fM21593getSmallD9Ej5fM, null));
                                        Components5.JointAccountStatusBarWrapper(false, ComposableLambda3.rememberComposableLambda(-25393797, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreenKt.AccountCreationScreen.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                                                invoke(composer2, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i5) {
                                                if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-25393797, i5, -1, "com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen.<anonymous> (AccountCreationScreen.kt:150)");
                                                }
                                                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), state.getDescriptor()), ComposableLambda3.rememberComposableLambda(585431398, true, new AnonymousClass1(callbacks, jointAccountCelebrationScreenState2, state, modifier3), composer2, 54), composer2, 48);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            /* compiled from: AccountCreationScreen.kt */
                                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                            @SourceDebugExtension
                                            /* renamed from: com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreenKt$AccountCreationScreen$1$1, reason: invalid class name */
                                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                                final /* synthetic */ AccountCreationScreen $callbacks;
                                                final /* synthetic */ Modifier $modifier;
                                                final /* synthetic */ JointAccountCelebrationScreenState $screenState;
                                                final /* synthetic */ JointAccountCreatedViewState $state;

                                                AnonymousClass1(AccountCreationScreen accountCreationScreen, JointAccountCelebrationScreenState jointAccountCelebrationScreenState, JointAccountCreatedViewState jointAccountCreatedViewState, Modifier modifier) {
                                                    this.$callbacks = accountCreationScreen;
                                                    this.$screenState = jointAccountCelebrationScreenState;
                                                    this.$state = jointAccountCreatedViewState;
                                                    this.$modifier = modifier;
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
                                                        ComposerKt.traceEventStart(585431398, i, -1, "com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen.<anonymous>.<anonymous> (AccountCreationScreen.kt:153)");
                                                    }
                                                    AccountCreationScreen accountCreationScreen = this.$callbacks;
                                                    composer.startReplaceGroup(5004770);
                                                    boolean zChanged = composer.changed(accountCreationScreen);
                                                    Object objRememberedValue = composer.rememberedValue();
                                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = new AccountCreationScreen3(accountCreationScreen);
                                                        composer.updateRememberedValue(objRememberedValue);
                                                    }
                                                    KFunction kFunction = (KFunction) objRememberedValue;
                                                    composer.endReplaceGroup();
                                                    AccountCreationScreen accountCreationScreen2 = this.$callbacks;
                                                    composer.startReplaceGroup(5004770);
                                                    boolean zChanged2 = composer.changed(accountCreationScreen2);
                                                    Object objRememberedValue2 = composer.rememberedValue();
                                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue2 = new AccountCreationScreen4(accountCreationScreen2);
                                                        composer.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    KFunction kFunction2 = (KFunction) objRememberedValue2;
                                                    composer.endReplaceGroup();
                                                    JointAccountCelebrationScreenState jointAccountCelebrationScreenState = this.$screenState;
                                                    composer.startReplaceGroup(-1633490746);
                                                    boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changed(this.$callbacks);
                                                    final JointAccountCreatedViewState jointAccountCreatedViewState = this.$state;
                                                    final AccountCreationScreen accountCreationScreen3 = this.$callbacks;
                                                    Object objRememberedValue3 = composer.rememberedValue();
                                                    if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreenKt$AccountCreationScreen$1$1$$ExternalSyntheticLambda0
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                return AccountCreationScreen2.C200421.AnonymousClass1.invoke$lambda$3$lambda$2(jointAccountCreatedViewState, accountCreationScreen3, (String) obj);
                                                            }
                                                        };
                                                        composer.updateRememberedValue(objRememberedValue3);
                                                    }
                                                    composer.endReplaceGroup();
                                                    JointAccountCelebrationScreen4.JointAccountCelebrationContent(jointAccountCelebrationScreenState, (Function1) objRememberedValue3, (Function0) kFunction, this.$modifier, (Function0) kFunction2, composer, 0, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                /* JADX INFO: Access modifiers changed from: private */
                                                public static final Unit invoke$lambda$3$lambda$2(JointAccountCreatedViewState jointAccountCreatedViewState, AccountCreationScreen accountCreationScreen, String str) {
                                                    if (jointAccountCreatedViewState instanceof JointAccountCreatedViewState.InitializationError) {
                                                        accountCreationScreen.onRetryInitializationClicked();
                                                    } else if (jointAccountCreatedViewState instanceof JointAccountCreatedViewState.LoadAccountError) {
                                                        accountCreationScreen.onRetryFetchingAccountClicked();
                                                    } else {
                                                        if (jointAccountCreatedViewState instanceof JointAccountCreatedViewState.Loading) {
                                                            throw new IllegalStateException("Primary CTA callback invoked on loading screen");
                                                        }
                                                        if (!(jointAccountCreatedViewState instanceof JointAccountCreatedViewState.Success)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        accountCreationScreen.onContinueClicked(((JointAccountCreatedViewState.Success) jointAccountCreatedViewState).getInvitationState(), str);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountCreationScreen2.AccountCreationScreen$lambda$0(state, callbacks, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            z = state instanceof JointAccountCreatedViewState.InitializationError;
            if (!z) {
                jointAccountOnboardingAsset = JointAccountOnboardingAsset.Hero.Created.INSTANCE;
                JointAccountOnboardingAsset jointAccountOnboardingAsset22 = jointAccountOnboardingAsset;
                composerStartRestartGroup.startReplaceGroup(-766105400);
                if (!z) {
                }
                String str3 = titleText;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-766091930);
                if (!z) {
                }
                String str22 = bodyText;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-766078395);
                if (!z) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-766062812);
                if (!z) {
                }
                jointAccountCta = contactSupportCta;
                composerStartRestartGroup.endReplaceGroup();
                boolean z222 = state instanceof JointAccountCreatedViewState.Loading;
                boolean z322 = !z222;
                if (z) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
