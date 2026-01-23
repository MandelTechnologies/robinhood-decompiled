package com.robinhood.android.individualaccounts.onboarding.outro;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.BackHandler;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.individualaccounts.onboarding.C18897R;
import com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreen;
import com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroState3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* compiled from: AccountConfirmedScreen.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\f²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"LottieSize", "Landroidx/compose/ui/unit/Dp;", "F", "AccountConfirmedScreen", "", "state", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState$AccountConfirmed;", "callbacks", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState$AccountConfirmed;Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-individual-account-onboarding_externalDebug", "lottieComposition", "Lcom/airbnb/lottie/LottieComposition;", "loading", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class AccountConfirmedScreen {
    private static final float LottieSize = C2002Dp.m7995constructorimpl(280);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountConfirmedScreen$lambda$3(IndividualAccountOutroState3.AccountConfirmed accountConfirmed, IndividualAccountOutroScreen individualAccountOutroScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountConfirmedScreen(accountConfirmed, individualAccountOutroScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountConfirmedScreen(final IndividualAccountOutroState3.AccountConfirmed state, final IndividualAccountOutroScreen callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        HttpUrl url;
        boolean z;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1245450627);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
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
                    ComposerKt.traceEventStart(-1245450627, i3, -1, "com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreen (AccountConfirmedScreen.kt:50)");
                }
                if (!BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay()) {
                    url = LottieUrl.MIB_ACCOUNT_CREATED_DAY.getUrl();
                } else {
                    url = LottieUrl.MIB_ACCOUNT_CREATED_NIGHT.getUrl();
                }
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(url.getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = ((i3 & 112) != 32) | ((i3 & 14) != 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountConfirmedScreen.AccountConfirmedScreen$lambda$2$lambda$1(callbacks, state);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandler.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(-1912811719, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreenKt.AccountConfirmedScreen.2
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
                            ComposerKt.traceEventStart(-1912811719, i5, -1, "com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreen.<anonymous> (AccountConfirmedScreen.kt:68)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(AccountConfirmedScreen3.INSTANCE.m2061x613338c(), null, ComposableLambda3.rememberComposableLambda(1427907544, true, new AnonymousClass1(callbacks, state), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AccountConfirmedScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreenKt$AccountConfirmedScreen$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ IndividualAccountOutroScreen $callbacks;
                        final /* synthetic */ IndividualAccountOutroState3.AccountConfirmed $state;

                        AnonymousClass1(IndividualAccountOutroScreen individualAccountOutroScreen, IndividualAccountOutroState3.AccountConfirmed accountConfirmed) {
                            this.$callbacks = individualAccountOutroScreen;
                            this.$state = accountConfirmed;
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
                                ComposerKt.traceEventStart(1427907544, i2, -1, "com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreen.<anonymous>.<anonymous> (AccountConfirmedScreen.kt:71)");
                            }
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.DISMISS, null, new Component(Component.ComponentType.BUTTON, "dismiss-success", null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(this.$callbacks) | composer.changed(this.$state);
                            final IndividualAccountOutroScreen individualAccountOutroScreen = this.$callbacks;
                            final IndividualAccountOutroState3.AccountConfirmed accountConfirmed = this.$state;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreenKt$AccountConfirmedScreen$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AccountConfirmedScreen.C189202.AnonymousClass1.invoke$lambda$1$lambda$0(individualAccountOutroScreen, accountConfirmed);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(modifierAutoLogEvents$default, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(IndividualAccountOutroScreen individualAccountOutroScreen, IndividualAccountOutroState3.AccountConfirmed accountConfirmed) {
                            individualAccountOutroScreen.onCloseClicked(accountConfirmed.getAccountNumber());
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1164872306, true, new C189213(lottieCompositionResultRememberLottieComposition, callbacks, state), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 805306416, 508);
                composerStartRestartGroup = composerStartRestartGroup;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountConfirmedScreen.AccountConfirmedScreen$lambda$3(state, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (!BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay()) {
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(url.getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            z = ((i3 & 112) != 32) | ((i3 & 14) != 4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountConfirmedScreen.AccountConfirmedScreen$lambda$2$lambda$1(callbacks, state);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                BackHandler.BackHandler(false, (Function0) objRememberedValue, composerStartRestartGroup, 0, 1);
                Modifier modifier52 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(-1912811719, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreenKt.AccountConfirmedScreen.2
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
                            ComposerKt.traceEventStart(-1912811719, i5, -1, "com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreen.<anonymous> (AccountConfirmedScreen.kt:68)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(AccountConfirmedScreen3.INSTANCE.m2061x613338c(), null, ComposableLambda3.rememberComposableLambda(1427907544, true, new AnonymousClass1(callbacks, state), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AccountConfirmedScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreenKt$AccountConfirmedScreen$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ IndividualAccountOutroScreen $callbacks;
                        final /* synthetic */ IndividualAccountOutroState3.AccountConfirmed $state;

                        AnonymousClass1(IndividualAccountOutroScreen individualAccountOutroScreen, IndividualAccountOutroState3.AccountConfirmed accountConfirmed) {
                            this.$callbacks = individualAccountOutroScreen;
                            this.$state = accountConfirmed;
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
                                ComposerKt.traceEventStart(1427907544, i2, -1, "com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreen.<anonymous>.<anonymous> (AccountConfirmedScreen.kt:71)");
                            }
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.DISMISS, null, new Component(Component.ComponentType.BUTTON, "dismiss-success", null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(this.$callbacks) | composer.changed(this.$state);
                            final IndividualAccountOutroScreen individualAccountOutroScreen = this.$callbacks;
                            final IndividualAccountOutroState3.AccountConfirmed accountConfirmed = this.$state;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreenKt$AccountConfirmedScreen$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AccountConfirmedScreen.C189202.AnonymousClass1.invoke$lambda$1$lambda$0(individualAccountOutroScreen, accountConfirmed);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(modifierAutoLogEvents$default, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(IndividualAccountOutroScreen individualAccountOutroScreen, IndividualAccountOutroState3.AccountConfirmed accountConfirmed) {
                            individualAccountOutroScreen.onCloseClicked(accountConfirmed.getAccountNumber());
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1164872306, true, new C189213(lottieCompositionResultRememberLottieComposition2, callbacks, state), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 805306416, 508);
                composerStartRestartGroup = composerStartRestartGroup;
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
    public static final Unit AccountConfirmedScreen$lambda$2$lambda$1(IndividualAccountOutroScreen individualAccountOutroScreen, IndividualAccountOutroState3.AccountConfirmed accountConfirmed) {
        individualAccountOutroScreen.onCloseClicked(accountConfirmed.getAccountNumber());
        return Unit.INSTANCE;
    }

    /* compiled from: AccountConfirmedScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreenKt$AccountConfirmedScreen$3 */
    static final class C189213 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ IndividualAccountOutroScreen $callbacks;
        final /* synthetic */ LottieCompositionResult $lottieComposition$delegate;
        final /* synthetic */ IndividualAccountOutroState3.AccountConfirmed $state;

        C189213(LottieCompositionResult lottieCompositionResult, IndividualAccountOutroScreen individualAccountOutroScreen, IndividualAccountOutroState3.AccountConfirmed accountConfirmed) {
            this.$lottieComposition$delegate = lottieCompositionResult;
            this.$callbacks = individualAccountOutroScreen;
            this.$state = accountConfirmed;
        }

        private static final boolean invoke$lambda$10$lambda$9$lambda$8$lambda$2(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
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
                ComposerKt.traceEventStart(-1164872306, i2, -1, "com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreen.<anonymous> (AccountConfirmedScreen.kt:93)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
            LottieCompositionResult lottieCompositionResult = this.$lottieComposition$delegate;
            final IndividualAccountOutroScreen individualAccountOutroScreen = this.$callbacks;
            final IndividualAccountOutroState3.AccountConfirmed accountConfirmed = this.$state;
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
            LottieAnimation2.LottieAnimation(AccountConfirmedScreen.AccountConfirmedScreen$lambda$0(lottieCompositionResult), SizeKt.m5173sizeInqDBjuR0$default(companion, 0.0f, 0.0f, AccountConfirmedScreen.LottieSize, AccountConfirmedScreen.LottieSize, 3, null), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer, 1572912, 0, 0, 2097084);
            composer.endNode();
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getBottom(), companion2.getCenterHorizontally(), composer, 54);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            String strStringResource = StringResources_androidKt.stringResource(C18897R.string.opening_account_confirmed_title, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer, i3).getDisplayCapsuleLarge();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 0, 0, 8126);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C18897R.string.opening_account_confirmed_subtitle, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21594getXlargeD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8124);
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0);
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy4, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion5 = Composer.INSTANCE;
            if (objRememberedValue == companion5.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer);
                composer.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion5.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(individualAccountOutroScreen) | composer.changed(accountConfirmed);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion5.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreenKt$AccountConfirmedScreen$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountConfirmedScreen.C189213.invoke$lambda$10$lambda$9$lambda$8$lambda$5$lambda$4(coroutineScope, individualAccountOutroScreen, accountConfirmed, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, strStringResource2, ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default2, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(componentType, "continue-success", null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Primary, false, invoke$lambda$10$lambda$9$lambda$8$lambda$2(snapshotState), null, null, null, null, false, null, composer, 24576, 0, 8104);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(individualAccountOutroScreen) | composer.changed(accountConfirmed);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged || objRememberedValue4 == companion5.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.AccountConfirmedScreenKt$AccountConfirmedScreen$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountConfirmedScreen.C189213.invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(individualAccountOutroScreen, accountConfirmed);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue4, StringResources_androidKt.stringResource(C11048R.string.general_label_not_now, composer, 0), ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.DISMISS, null, new Component(componentType, "not-now-success", null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
            composer.endNode();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$10$lambda$9$lambda$8$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$5$lambda$4(CoroutineScope coroutineScope, IndividualAccountOutroScreen individualAccountOutroScreen, IndividualAccountOutroState3.AccountConfirmed accountConfirmed, SnapshotState snapshotState) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AccountConfirmedScreen2(individualAccountOutroScreen, accountConfirmed, snapshotState, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(IndividualAccountOutroScreen individualAccountOutroScreen, IndividualAccountOutroState3.AccountConfirmed accountConfirmed) {
            individualAccountOutroScreen.onCloseClicked(accountConfirmed.getAccountNumber());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieComposition AccountConfirmedScreen$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }
}
