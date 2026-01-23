package com.robinhood.android.jointaccounts.onboarding.outro.primary;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.view.compose.BackHandler;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.jointaccounts.onboarding.Components5;
import com.robinhood.android.jointaccounts.onboarding.JointAccountCelebrationScreen4;
import com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutro4;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.jointaccounts.api.onboarding.ApiJointAccountCelebrationPageViewModel;
import com.robinhood.models.jointaccounts.api.onboarding.ApiJointAccountOnboardingPrimaryPostAgreementsViewModel;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.store.AsyncResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: JointAccountPrimaryOutro.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a-\u0010\t\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002"}, m3636d2 = {"LoadedJointAccountPrimaryOutro", "", "state", "Lcom/robinhood/android/jointaccounts/onboarding/outro/primary/PrimaryOutroViewState;", "callbacks", "Lcom/robinhood/android/jointaccounts/onboarding/outro/primary/JointAccountPrimaryOutroCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/jointaccounts/onboarding/outro/primary/PrimaryOutroViewState;Lcom/robinhood/android/jointaccounts/onboarding/outro/primary/JointAccountPrimaryOutroCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "JointAccountPrimaryOutro", "Lcom/robinhood/store/AsyncResult;", "(Lcom/robinhood/store/AsyncResult;Lcom/robinhood/android/jointaccounts/onboarding/outro/primary/JointAccountPrimaryOutroCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-joint-account-onboarding_externalDebug", "hasShownShareSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class JointAccountPrimaryOutro4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JointAccountPrimaryOutro$lambda$13(AsyncResult asyncResult, JointAccountPrimaryOutro3 jointAccountPrimaryOutro3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        JointAccountPrimaryOutro(asyncResult, jointAccountPrimaryOutro3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedJointAccountPrimaryOutro$lambda$9(PrimaryOutroViewState primaryOutroViewState, JointAccountPrimaryOutro3 jointAccountPrimaryOutro3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedJointAccountPrimaryOutro(primaryOutroViewState, jointAccountPrimaryOutro3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadedJointAccountPrimaryOutro(final PrimaryOutroViewState state, final JointAccountPrimaryOutro3 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        final SystemUiController systemUiControllerRememberSystemUiController;
        final long jM21255getDayXrayLight0d7_KjU;
        final long jM21371getBg0d7_KjU;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        Screen.Name name;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1148726613);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
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
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1148726613, i3, -1, "com.robinhood.android.jointaccounts.onboarding.outro.primary.LoadedJointAccountPrimaryOutro (JointAccountPrimaryOutro.kt:49)");
                }
                ApiJointAccountOnboardingPrimaryPostAgreementsViewModel viewModel = state.getViewModel();
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return JointAccountPrimaryOutro4.LoadedJointAccountPrimaryOutro$lambda$1$lambda$0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                jM21255getDayXrayLight0d7_KjU = BentoColor.INSTANCE.m21255getDayXrayLight0d7_KjU();
                jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(jM21255getDayXrayLight0d7_KjU) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return JointAccountPrimaryOutro4.LoadedJointAccountPrimaryOutro$lambda$6$lambda$5(systemUiControllerRememberSystemUiController, jM21255getDayXrayLight0d7_KjU, jM21371getBg0d7_KjU, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue2 = function1;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
                boolean zLoadedJointAccountPrimaryOutro$lambda$2 = LoadedJointAccountPrimaryOutro$lambda$2(snapshotState);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(snapshotState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return JointAccountPrimaryOutro4.LoadedJointAccountPrimaryOutro$lambda$8$lambda$7(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandler.BackHandler(zLoadedJointAccountPrimaryOutro$lambda$2, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 0);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                if (!LoadedJointAccountPrimaryOutro$lambda$2(snapshotState)) {
                    name = Screen.Name.JOINT_ACCOUNT_INVITE_SENT_CELEBRATION;
                } else {
                    name = Screen.Name.JOINT_ACCOUNT_SEND_INVITE;
                }
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, state.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null)), ComposableLambda3.rememberComposableLambda(-1304285686, true, new C201573(modifier4, snapshotState, viewModel, callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return JointAccountPrimaryOutro4.LoadedJointAccountPrimaryOutro$lambda$9(state, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            ApiJointAccountOnboardingPrimaryPostAgreementsViewModel viewModel2 = state.getViewModel();
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
            jM21255getDayXrayLight0d7_KjU = BentoColor.INSTANCE.m21255getDayXrayLight0d7_KjU();
            jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(jM21255getDayXrayLight0d7_KjU) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                Function1 function12 = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return JointAccountPrimaryOutro4.LoadedJointAccountPrimaryOutro$lambda$6$lambda$5(systemUiControllerRememberSystemUiController, jM21255getDayXrayLight0d7_KjU, jM21371getBg0d7_KjU, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function12);
                objRememberedValue2 = function12;
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
                boolean zLoadedJointAccountPrimaryOutro$lambda$22 = LoadedJointAccountPrimaryOutro$lambda$2(snapshotState);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(snapshotState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return JointAccountPrimaryOutro4.LoadedJointAccountPrimaryOutro$lambda$8$lambda$7(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    BackHandler.BackHandler(zLoadedJointAccountPrimaryOutro$lambda$22, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 0);
                    UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    if (!LoadedJointAccountPrimaryOutro$lambda$2(snapshotState)) {
                    }
                    AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, state.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null)), ComposableLambda3.rememberComposableLambda(-1304285686, true, new C201573(modifier4, snapshotState, viewModel2, callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState LoadedJointAccountPrimaryOutro$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedJointAccountPrimaryOutro$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LoadedJointAccountPrimaryOutro$lambda$6$lambda$5(final SystemUiController systemUiController, long j, final long j2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j, false, null, 6, null);
        return new DisposableEffectResult() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$LoadedJointAccountPrimaryOutro$lambda$6$lambda$5$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j2, false, null, 6, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult JointAccountPrimaryOutro$lambda$12$lambda$11(final SystemUiController systemUiController, final long j, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$JointAccountPrimaryOutro$lambda$12$lambda$11$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j, false, null, 6, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedJointAccountPrimaryOutro$lambda$8$lambda$7(SnapshotState snapshotState) {
        LoadedJointAccountPrimaryOutro$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* compiled from: JointAccountPrimaryOutro.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$LoadedJointAccountPrimaryOutro$3 */
    static final class C201573 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ JointAccountPrimaryOutro3 $callbacks;
        final /* synthetic */ SnapshotState<Boolean> $hasShownShareSheet$delegate;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ ApiJointAccountOnboardingPrimaryPostAgreementsViewModel $viewModel;

        C201573(Modifier modifier, SnapshotState<Boolean> snapshotState, ApiJointAccountOnboardingPrimaryPostAgreementsViewModel apiJointAccountOnboardingPrimaryPostAgreementsViewModel, JointAccountPrimaryOutro3 jointAccountPrimaryOutro3) {
            this.$modifier = modifier;
            this.$hasShownShareSheet$delegate = snapshotState;
            this.$viewModel = apiJointAccountOnboardingPrimaryPostAgreementsViewModel;
            this.$callbacks = jointAccountPrimaryOutro3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$5$lambda$4$lambda$0(int i) {
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$5$lambda$4$lambda$1(int i) {
            return -i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$5$lambda$4$lambda$2(int i) {
            return -i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$5$lambda$4$lambda$3(int i) {
            return i;
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
                ComposerKt.traceEventStart(-1304285686, i, -1, "com.robinhood.android.jointaccounts.onboarding.outro.primary.LoadedJointAccountPrimaryOutro.<anonymous> (JointAccountPrimaryOutro.kt:84)");
            }
            Boolean boolValueOf = Boolean.valueOf(JointAccountPrimaryOutro4.LoadedJointAccountPrimaryOutro$lambda$2(this.$hasShownShareSheet$delegate));
            Modifier modifier = this.$modifier;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$LoadedJointAccountPrimaryOutro$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return JointAccountPrimaryOutro4.C201573.invoke$lambda$5$lambda$4((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            final ApiJointAccountOnboardingPrimaryPostAgreementsViewModel apiJointAccountOnboardingPrimaryPostAgreementsViewModel = this.$viewModel;
            final JointAccountPrimaryOutro3 jointAccountPrimaryOutro3 = this.$callbacks;
            final SnapshotState<Boolean> snapshotState = this.$hasShownShareSheet$delegate;
            AnimatedContentKt.AnimatedContent(boolValueOf, modifier, (Function1) objRememberedValue, null, "joint_account_outro", null, ComposableLambda3.rememberComposableLambda(2042254157, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt.LoadedJointAccountPrimaryOutro.3.2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) {
                    invoke(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2042254157, i2, -1, "com.robinhood.android.jointaccounts.onboarding.outro.primary.LoadedJointAccountPrimaryOutro.<anonymous>.<anonymous> (JointAccountPrimaryOutro.kt:96)");
                    }
                    if (z) {
                        composer2.startReplaceGroup(-1713048958);
                        final ApiJointAccountOnboardingPrimaryPostAgreementsViewModel apiJointAccountOnboardingPrimaryPostAgreementsViewModel2 = apiJointAccountOnboardingPrimaryPostAgreementsViewModel;
                        final JointAccountPrimaryOutro3 jointAccountPrimaryOutro32 = jointAccountPrimaryOutro3;
                        Components5.JointAccountStatusBarWrapper(false, ComposableLambda3.rememberComposableLambda(-1918162321, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt.LoadedJointAccountPrimaryOutro.3.2.1
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
                                    ComposerKt.traceEventStart(-1918162321, i3, -1, "com.robinhood.android.jointaccounts.onboarding.outro.primary.LoadedJointAccountPrimaryOutro.<anonymous>.<anonymous>.<anonymous> (JointAccountPrimaryOutro.kt:98)");
                                }
                                ApiJointAccountCelebrationPageViewModel celebration_page_view_model = apiJointAccountOnboardingPrimaryPostAgreementsViewModel2.getCelebration_page_view_model();
                                JointAccountPrimaryOutro3 jointAccountPrimaryOutro33 = jointAccountPrimaryOutro32;
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged = composer3.changed(jointAccountPrimaryOutro33);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new JointAccountPrimaryOutro8(jointAccountPrimaryOutro33);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceGroup();
                                JointAccountCelebrationScreen4.ActionHandlingJointAccountCelebrationScreen(celebration_page_view_model, (Function0) ((KFunction) objRememberedValue2), null, composer3, 0, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 48, 1);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1712728511);
                        Components5.JointAccountStatusBarWrapper(false, ComposableLambda3.rememberComposableLambda(-91747194, true, new C502602(apiJointAccountOnboardingPrimaryPostAgreementsViewModel, jointAccountPrimaryOutro3, snapshotState), composer2, 54), composer2, 48, 1);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: JointAccountPrimaryOutro.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$LoadedJointAccountPrimaryOutro$3$2$2, reason: invalid class name and collision with other inner class name */
                static final class C502602 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ JointAccountPrimaryOutro3 $callbacks;
                    final /* synthetic */ SnapshotState<Boolean> $hasShownShareSheet$delegate;
                    final /* synthetic */ ApiJointAccountOnboardingPrimaryPostAgreementsViewModel $viewModel;

                    C502602(ApiJointAccountOnboardingPrimaryPostAgreementsViewModel apiJointAccountOnboardingPrimaryPostAgreementsViewModel, JointAccountPrimaryOutro3 jointAccountPrimaryOutro3, SnapshotState<Boolean> snapshotState) {
                        this.$viewModel = apiJointAccountOnboardingPrimaryPostAgreementsViewModel;
                        this.$callbacks = jointAccountPrimaryOutro3;
                        this.$hasShownShareSheet$delegate = snapshotState;
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
                            ComposerKt.traceEventStart(-91747194, i, -1, "com.robinhood.android.jointaccounts.onboarding.outro.primary.LoadedJointAccountPrimaryOutro.<anonymous>.<anonymous>.<anonymous> (JointAccountPrimaryOutro.kt:105)");
                        }
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
                        ApiJointAccountOnboardingPrimaryPostAgreementsViewModel.InvitationViewModel invitation_page_view_model = this.$viewModel.getInvitation_page_view_model();
                        JointAccountPrimaryOutro3 jointAccountPrimaryOutro3 = this.$callbacks;
                        composer.startReplaceGroup(5004770);
                        boolean zChanged = composer.changed(jointAccountPrimaryOutro3);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new JointAccountPrimaryOutro9(jointAccountPrimaryOutro3);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        KFunction kFunction = (KFunction) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged2 = composer.changed(this.$callbacks) | composer.changed(this.$hasShownShareSheet$delegate);
                        final JointAccountPrimaryOutro3 jointAccountPrimaryOutro32 = this.$callbacks;
                        final SnapshotState<Boolean> snapshotState = this.$hasShownShareSheet$delegate;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$LoadedJointAccountPrimaryOutro$3$2$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return JointAccountPrimaryOutro4.C201573.AnonymousClass2.C502602.invoke$lambda$2$lambda$1(jointAccountPrimaryOutro32, snapshotState, (String) obj, (String) obj2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        JointAccountInvitationScreen.JointAccountInvitationScreen(invitation_page_view_model, (Function2) objRememberedValue2, (Function0) kFunction, modifierNavigationBarsPadding, composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(JointAccountPrimaryOutro3 jointAccountPrimaryOutro3, SnapshotState snapshotState, String shareContent, String shareSubject) {
                        Intrinsics.checkNotNullParameter(shareContent, "shareContent");
                        Intrinsics.checkNotNullParameter(shareSubject, "shareSubject");
                        jointAccountPrimaryOutro3.onSendInviteClicked(shareContent, shareSubject);
                        JointAccountPrimaryOutro4.LoadedJointAccountPrimaryOutro$lambda$3(snapshotState, true);
                        return Unit.INSTANCE;
                    }
                }
            }, composer, 54), composer, 1597824, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final ContentTransform invoke$lambda$5$lambda$4(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (((Boolean) AnimatedContent.getTargetState()).booleanValue()) {
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$LoadedJointAccountPrimaryOutro$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(JointAccountPrimaryOutro4.C201573.invoke$lambda$5$lambda$4$lambda$0(((Integer) obj).intValue()));
                    }
                }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$LoadedJointAccountPrimaryOutro$3$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(JointAccountPrimaryOutro4.C201573.invoke$lambda$5$lambda$4$lambda$1(((Integer) obj).intValue()));
                    }
                }, 1, null));
            }
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally$default(null, new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$LoadedJointAccountPrimaryOutro$3$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(JointAccountPrimaryOutro4.C201573.invoke$lambda$5$lambda$4$lambda$2(((Integer) obj).intValue()));
                }
            }, 1, null), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$LoadedJointAccountPrimaryOutro$3$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(JointAccountPrimaryOutro4.C201573.invoke$lambda$5$lambda$4$lambda$3(((Integer) obj).intValue()));
                }
            }, 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LoadedJointAccountPrimaryOutro$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    public static final void JointAccountPrimaryOutro(final AsyncResult<PrimaryOutroViewState> state, final JointAccountPrimaryOutro3 callbacks, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(583215270);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(583215270, i3, -1, "com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutro (JointAccountPrimaryOutro.kt:126)");
            }
            final long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            final SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-850554821, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt.JointAccountPrimaryOutro.1
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
                        ComposerKt.traceEventStart(-850554821, i5, -1, "com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutro.<anonymous> (JointAccountPrimaryOutro.kt:130)");
                    }
                    AsyncResult<PrimaryOutroViewState> asyncResult = state;
                    if (asyncResult instanceof AsyncResult.Failure) {
                        composer2.startReplaceGroup(1428449507);
                        JointAccountPrimaryOutro3 jointAccountPrimaryOutro3 = callbacks;
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged = composer2.changed(jointAccountPrimaryOutro3);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new JointAccountPrimaryOutro5(jointAccountPrimaryOutro3);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifier2 = modifier;
                        final JointAccountPrimaryOutro3 jointAccountPrimaryOutro32 = callbacks;
                        Components5.m15755JointAccountOnboardingScaffoldzcDBAo0((Function0) ((KFunction) objRememberedValue), modifier2, false, 0L, 0L, false, 0L, ComposableLambda3.rememberComposableLambda(1020563768, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt.JointAccountPrimaryOutro.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                                int i7;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i6 & 6) == 0) {
                                    i7 = (composer3.changed(paddingValues) ? 4 : 2) | i6;
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1020563768, i7, -1, "com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutro.<anonymous>.<anonymous> (JointAccountPrimaryOutro.kt:136)");
                                }
                                JointAccountPrimaryOutro3 jointAccountPrimaryOutro33 = jointAccountPrimaryOutro32;
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged2 = composer3.changed(jointAccountPrimaryOutro33);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new JointAccountPrimaryOutro6(jointAccountPrimaryOutro33);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceGroup();
                                ErrorScreenComposable.ErrorScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), (Function0) ((KFunction) objRememberedValue2), 0, null, null, null, null, false, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        composer2.endReplaceGroup();
                    } else if (asyncResult instanceof AsyncResult.Loading) {
                        composer2.startReplaceGroup(1428904060);
                        JointAccountPrimaryOutro3 jointAccountPrimaryOutro33 = callbacks;
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged2 = composer2.changed(jointAccountPrimaryOutro33);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new JointAccountPrimaryOutro7(jointAccountPrimaryOutro33);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        Components5.m15755JointAccountOnboardingScaffoldzcDBAo0((Function0) ((KFunction) objRememberedValue2), modifier, false, 0L, 0L, false, 0L, JointAccountPrimaryOutro.INSTANCE.m2147x815d26bd(), composer2, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(asyncResult instanceof AsyncResult.Success)) {
                            composer2.startReplaceGroup(-1339395289);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(1429298969);
                        JointAccountPrimaryOutro4.LoadedJointAccountPrimaryOutro((PrimaryOutroViewState) ((AsyncResult.Success) state).getValue(), callbacks, modifier, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return JointAccountPrimaryOutro4.JointAccountPrimaryOutro$lambda$12$lambda$11(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JointAccountPrimaryOutro4.JointAccountPrimaryOutro$lambda$13(state, callbacks, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
