package com.robinhood.android.individualaccounts.onboarding.outro;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.BackHandler;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroState3;
import com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreen3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LoadingAccountScreen.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a'\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, m3636d2 = {LoadingAccountScreen3.LoadingIconTestTag, "", LoadingAccountScreen3.SubtitleTestTag, "CircularProgressSize", "Landroidx/compose/ui/unit/Dp;", "F", "LoadingAccountScreen", "", "state", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState$LoadingAccount;", "callbacks", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState$LoadingAccount;Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-individual-account-onboarding_externalDebug", "contactSupportLoading", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LoadingAccountScreen3 {
    private static final float CircularProgressSize = C2002Dp.m7995constructorimpl(96);
    public static final String LoadingIconTestTag = "LoadingIconTestTag";
    public static final String SubtitleTestTag = "SubtitleTestTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingAccountScreen$lambda$2(IndividualAccountOutroState3.LoadingAccount loadingAccount, IndividualAccountOutroScreen individualAccountOutroScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingAccountScreen(loadingAccount, individualAccountOutroScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadingAccountScreen(final IndividualAccountOutroState3.LoadingAccount state, final IndividualAccountOutroScreen callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1431173154);
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
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1431173154, i3, -1, "com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreen (LoadingAccountScreen.kt:58)");
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = ((i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(state))) | ((i3 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LoadingAccountScreen3.LoadingAccountScreen$lambda$1$lambda$0(state, callbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandler.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
                int i5 = ((i3 >> 6) & 14) | 805306416;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(-731830886, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt.LoadingAccountScreen.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-731830886, i6, -1, "com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreen.<anonymous> (LoadingAccountScreen.kt:69)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(LoadingAccountScreen.INSTANCE.m2062x9f44e36(), null, ComposableLambda3.rememberComposableLambda(1749556601, true, new AnonymousClass1(state, callbacks), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: LoadingAccountScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt$LoadingAccountScreen$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ IndividualAccountOutroScreen $callbacks;
                        final /* synthetic */ IndividualAccountOutroState3.LoadingAccount $state;

                        AnonymousClass1(IndividualAccountOutroState3.LoadingAccount loadingAccount, IndividualAccountOutroScreen individualAccountOutroScreen) {
                            this.$state = loadingAccount;
                            this.$callbacks = individualAccountOutroScreen;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 6) == 0) {
                                i2 = i | ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1749556601, i2, -1, "com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreen.<anonymous>.<anonymous> (LoadingAccountScreen.kt:72)");
                            }
                            if (this.$state.getShowCloseIcon()) {
                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.DISMISS, null, new Component(Component.ComponentType.BUTTON, "dismiss-timeout", null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                                composer.startReplaceGroup(5004770);
                                boolean zChanged = composer.changed(this.$callbacks);
                                final IndividualAccountOutroScreen individualAccountOutroScreen = this.$callbacks;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt$LoadingAccountScreen$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return LoadingAccountScreen3.C189402.AnonymousClass1.invoke$lambda$1$lambda$0(individualAccountOutroScreen);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(modifierAutoLogEvents$default, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(IndividualAccountOutroScreen individualAccountOutroScreen) {
                            individualAccountOutroScreen.onCloseClicked(null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(498233263, true, new C189413(state, callbacks), composerStartRestartGroup, 54), composer2, i5, 508);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LoadingAccountScreen3.LoadingAccountScreen$lambda$2(state, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            if ((i3 & 14) != 4) {
                z = ((i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(state))) | ((i3 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LoadingAccountScreen3.LoadingAccountScreen$lambda$1$lambda$0(state, callbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BackHandler.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
                    int i52 = ((i3 >> 6) & 14) | 805306416;
                    Modifier modifier52 = modifier4;
                    composer2 = composerStartRestartGroup;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(-731830886, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt.LoadingAccountScreen.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-731830886, i6, -1, "com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreen.<anonymous> (LoadingAccountScreen.kt:69)");
                            }
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(LoadingAccountScreen.INSTANCE.m2062x9f44e36(), null, ComposableLambda3.rememberComposableLambda(1749556601, true, new AnonymousClass1(state, callbacks), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: LoadingAccountScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt$LoadingAccountScreen$2$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ IndividualAccountOutroScreen $callbacks;
                            final /* synthetic */ IndividualAccountOutroState3.LoadingAccount $state;

                            AnonymousClass1(IndividualAccountOutroState3.LoadingAccount loadingAccount, IndividualAccountOutroScreen individualAccountOutroScreen) {
                                this.$state = loadingAccount;
                                this.$callbacks = individualAccountOutroScreen;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                int i2;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 6) == 0) {
                                    i2 = i | ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1749556601, i2, -1, "com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreen.<anonymous>.<anonymous> (LoadingAccountScreen.kt:72)");
                                }
                                if (this.$state.getShowCloseIcon()) {
                                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.DISMISS, null, new Component(Component.ComponentType.BUTTON, "dismiss-timeout", null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(this.$callbacks);
                                    final IndividualAccountOutroScreen individualAccountOutroScreen = this.$callbacks;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt$LoadingAccountScreen$2$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return LoadingAccountScreen3.C189402.AnonymousClass1.invoke$lambda$1$lambda$0(individualAccountOutroScreen);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(modifierAutoLogEvents$default, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(IndividualAccountOutroScreen individualAccountOutroScreen) {
                                individualAccountOutroScreen.onCloseClicked(null);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(498233263, true, new C189413(state, callbacks), composerStartRestartGroup, 54), composer2, i52, 508);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingAccountScreen$lambda$1$lambda$0(IndividualAccountOutroState3.LoadingAccount loadingAccount, IndividualAccountOutroScreen individualAccountOutroScreen) {
        if (loadingAccount.getShowCloseIcon()) {
            individualAccountOutroScreen.onCloseClicked(null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: LoadingAccountScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt$LoadingAccountScreen$3 */
    static final class C189413 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ IndividualAccountOutroScreen $callbacks;
        final /* synthetic */ IndividualAccountOutroState3.LoadingAccount $state;

        C189413(IndividualAccountOutroState3.LoadingAccount loadingAccount, IndividualAccountOutroScreen individualAccountOutroScreen) {
            this.$state = loadingAccount;
            this.$callbacks = individualAccountOutroScreen;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$8$lambda$7$lambda$4$lambda$3(int i) {
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$8$lambda$7$lambda$6$lambda$5(int i) {
            return i;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            boolean z;
            IndividualAccountOutroState3.LoadingAccount loadingAccount;
            Composer composer2;
            int i3;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(498233263, i2, -1, "com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreen.<anonymous> (LoadingAccountScreen.kt:96)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
            IndividualAccountOutroState3.LoadingAccount loadingAccount2 = this.$state;
            IndividualAccountOutroScreen individualAccountOutroScreen = this.$callbacks;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion2.getCenterHorizontally(), composer, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0);
            composer.startReplaceGroup(354285630);
            Modifier modifierM4876borderxT4_qwU = !loadingAccount2.getShowLoadingAnimation() ? BorderKt.m4876borderxT4_qwU(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion, LoadingAccountScreen3.CircularProgressSize), LoadingAccountScreen3.CircularProgressSize), C2002Dp.m7995constructorimpl(1), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU(), RoundedCornerShape2.getCircleShape()) : companion;
            composer.endReplaceGroup();
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM4876borderxT4_qwU);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceGroup(-1509476976);
            if (loadingAccount2.getShowLoadingAnimation()) {
                z = true;
                loadingAccount = loadingAccount2;
                composer2 = composer;
                i3 = 0;
                BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion, LoadingAccountScreen3.CircularProgressSize), LoadingAccountScreen3.CircularProgressSize), null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), composer2, 6, 2);
            } else {
                z = true;
                loadingAccount = loadingAccount2;
                composer2 = composer;
                i3 = 0;
            }
            composer2.endReplaceGroup();
            float f = 48;
            Modifier modifierTestTag = TestTag3.testTag(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f)), LoadingAccountScreen3.LoadingIconTestTag);
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(loadingAccount.getIcon());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            BentoIcon2.m20644BentoIconFU0evQE(size24, "", bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU(), modifierTestTag, null, false, composer, BentoIcon4.Size24.$stable | 3120, 48);
            composer.endNode();
            Spacer2.Spacer(Column5.weight$default(column6, companion, 0.5f, false, 2, null), composer, i3);
            composer.endNode();
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getBottom(), companion2.getCenterHorizontally(), composer, 54);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer, i3);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            StringResource title = loadingAccount.getTitle();
            int i5 = StringResource.$stable;
            String string2 = StringResource2.getString(title, composer, i5);
            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer, i4).getDisplayCapsuleSmall();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            IndividualAccountOutroState3.LoadingAccount loadingAccount3 = loadingAccount;
            BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer, 0, 0, 8126);
            StringResource subtitle = loadingAccount3.getSubtitle();
            composer.startReplaceGroup(-2109139298);
            if (subtitle != null) {
                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(subtitle, composer, i5), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i4).m21594getXlargeD9Ej5fM(), 7, null), LoadingAccountScreen3.SubtitleTestTag), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i4).getTextM(), composer, 0, 0, 8124);
                Unit unit = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0);
            boolean showRefreshButton = loadingAccount3.getShowRefreshButton();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion5 = Composer.INSTANCE;
            if (objRememberedValue == companion5.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt$LoadingAccountScreen$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(LoadingAccountScreen3.C189413.invoke$lambda$8$lambda$7$lambda$4$lambda$3(((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EnterTransition enterTransitionSlideInVertically$default = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue, 1, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion5.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt$LoadingAccountScreen$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(LoadingAccountScreen3.C189413.invoke$lambda$8$lambda$7$lambda$6$lambda$5(((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AnimatedVisibilityKt.AnimatedVisibility(column6, showRefreshButton, (Modifier) null, enterTransitionSlideInVertically$default, EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue2, 1, null), (String) null, ComposableLambda3.rememberComposableLambda(-781888342, true, new LoadingAccountScreen4(individualAccountOutroScreen, loadingAccount3), composer, 54), composer, 1600518, 18);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }
}
