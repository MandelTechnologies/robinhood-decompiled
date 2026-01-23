package com.robinhood.android.advisory.onboarding.outro;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
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
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryAccountLoadingScreenKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: AdvisoryAccountLoadingScreen.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0013²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002"}, m3636d2 = {"AdvisoryAssetsRoute", "", "DarkAsset", "LightAsset", "LottieSize", "Landroidx/compose/ui/unit/Dp;", "F", "CircularProgressSize", "AdvisoryLoadingAccountScreen", "", "state", "Lcom/robinhood/android/advisory/onboarding/outro/AccountLoadingScreenState;", "callbacks", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/onboarding/outro/AccountLoadingScreenState;Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "feature-advisory-onboarding_externalDebug", "lottieComposition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryAccountLoadingScreenKt {
    private static final String AdvisoryAssetsRoute = "advisory/account_created_loading";
    private static final String DarkAsset = "advisory/account_created_loading/dark/account_created_loading_dark_mode_v1.json";
    private static final String LightAsset = "advisory/account_created_loading/light/account_created_loading_light_mode_v1.json";
    private static final float LottieSize = C2002Dp.m7995constructorimpl(280);
    private static final float CircularProgressSize = C2002Dp.m7995constructorimpl(96);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryLoadingAccountScreen$lambda$1(AccountLoadingScreenState accountLoadingScreenState, AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvisoryLoadingAccountScreen(accountLoadingScreenState, advisoryPostAgreementsScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$2(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisoryLoadingAccountScreen(final AccountLoadingScreenState state, final AdvisoryPostAgreementsScreen callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1229672744);
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
                    ComposerKt.traceEventStart(1229672744, i3, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisoryLoadingAccountScreen (AdvisoryAccountLoadingScreen.kt:84)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(!bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay() ? LightAsset : DarkAsset).build().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null);
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1254366484, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryAccountLoadingScreenKt.AdvisoryLoadingAccountScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1254366484, i6, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisoryLoadingAccountScreen.<anonymous> (AdvisoryAccountLoadingScreen.kt:101)");
                        }
                        Function2<Composer, Integer, Unit> lambda$504037017$feature_advisory_onboarding_externalDebug = ComposableSingletons$AdvisoryAccountLoadingScreenKt.INSTANCE.getLambda$504037017$feature_advisory_onboarding_externalDebug();
                        final AccountLoadingScreenState accountLoadingScreenState = state;
                        final AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen = callbacks;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$504037017$feature_advisory_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1504328467, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryAccountLoadingScreenKt.AdvisoryLoadingAccountScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1504328467, i7, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisoryLoadingAccountScreen.<anonymous>.<anonymous> (AdvisoryAccountLoadingScreen.kt:104)");
                                }
                                if (accountLoadingScreenState.getShowCloseIcon()) {
                                    AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen2 = advisoryPostAgreementsScreen;
                                    composer3.startReplaceGroup(5004770);
                                    boolean zChanged = composer3.changed(advisoryPostAgreementsScreen2);
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new C8905xb34c1f1(advisoryPostAgreementsScreen2);
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    composer3.endReplaceGroup();
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) ((KFunction) objRememberedValue), composer3, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1667196279, true, new C89062(state, lottieCompositionResultRememberLottieComposition, callbacks), composerStartRestartGroup, 54);
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, composableLambdaRememberComposableLambda2, composerStartRestartGroup, 805306416, 316);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryAccountLoadingScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryAccountLoadingScreenKt.AdvisoryLoadingAccountScreen$lambda$1(state, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(!bentoTheme2.getColors(composerStartRestartGroup, i52).getIsDay() ? LightAsset : DarkAsset).build().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            Modifier modifierLogScreenTransitions$default2 = ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null);
            long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU();
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-1254366484, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryAccountLoadingScreenKt.AdvisoryLoadingAccountScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1254366484, i6, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisoryLoadingAccountScreen.<anonymous> (AdvisoryAccountLoadingScreen.kt:101)");
                    }
                    Function2<Composer, Integer, Unit> lambda$504037017$feature_advisory_onboarding_externalDebug = ComposableSingletons$AdvisoryAccountLoadingScreenKt.INSTANCE.getLambda$504037017$feature_advisory_onboarding_externalDebug();
                    final AccountLoadingScreenState accountLoadingScreenState = state;
                    final AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen = callbacks;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$504037017$feature_advisory_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1504328467, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryAccountLoadingScreenKt.AdvisoryLoadingAccountScreen.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i7 |= (i7 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1504328467, i7, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisoryLoadingAccountScreen.<anonymous>.<anonymous> (AdvisoryAccountLoadingScreen.kt:104)");
                            }
                            if (accountLoadingScreenState.getShowCloseIcon()) {
                                AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen2 = advisoryPostAgreementsScreen;
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged = composer3.changed(advisoryPostAgreementsScreen2);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new C8905xb34c1f1(advisoryPostAgreementsScreen2);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) ((KFunction) objRememberedValue), composer3, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(1667196279, true, new C89062(state, lottieCompositionResultRememberLottieComposition2, callbacks), composerStartRestartGroup, 54);
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default2, composableLambdaRememberComposableLambda3, null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, composableLambdaRememberComposableLambda22, composerStartRestartGroup, 805306416, 316);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieComposition AdvisoryLoadingAccountScreen$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* compiled from: AdvisoryAccountLoadingScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryAccountLoadingScreenKt$AdvisoryLoadingAccountScreen$2 */
    static final class C89062 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ AdvisoryPostAgreementsScreen $callbacks;
        final /* synthetic */ LottieCompositionResult $lottieComposition$delegate;
        final /* synthetic */ AccountLoadingScreenState $state;

        C89062(AccountLoadingScreenState accountLoadingScreenState, LottieCompositionResult lottieCompositionResult, AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen) {
            this.$state = accountLoadingScreenState;
            this.$lottieComposition$delegate = lottieCompositionResult;
            this.$callbacks = advisoryPostAgreementsScreen;
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
            AccountLoadingScreenState accountLoadingScreenState;
            AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen;
            int i3;
            Modifier.Companion companion;
            Column6 column6;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer2.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1667196279, i2, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisoryLoadingAccountScreen.<anonymous> (AdvisoryAccountLoadingScreen.kt:113)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(companion2, paddingValues);
            AccountLoadingScreenState accountLoadingScreenState2 = this.$state;
            LottieCompositionResult lottieCompositionResult = this.$lottieComposition$delegate;
            AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen2 = this.$callbacks;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPadding);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column62 = Column6.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Column5.weight$default(column62, companion2, 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion3.getCenterHorizontally(), composer2, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            HeaderIcon headerIcon = accountLoadingScreenState2.getHeaderIcon();
            if (headerIcon == null) {
                composer2.startReplaceGroup(1889955413);
                advisoryPostAgreementsScreen = advisoryPostAgreementsScreen2;
                i3 = 0;
                accountLoadingScreenState = accountLoadingScreenState2;
                LottieAnimation2.LottieAnimation(AdvisoryAccountLoadingScreenKt.AdvisoryLoadingAccountScreen$lambda$0(lottieCompositionResult), SizeKt.m5173sizeInqDBjuR0$default(companion2, 0.0f, 0.0f, AdvisoryAccountLoadingScreenKt.LottieSize, AdvisoryAccountLoadingScreenKt.LottieSize, 3, null), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer, 1572912, 0, 0, 2097084);
                composer2 = composer;
                composer2.endReplaceGroup();
                column6 = column62;
                companion = companion2;
            } else {
                accountLoadingScreenState = accountLoadingScreenState2;
                advisoryPostAgreementsScreen = advisoryPostAgreementsScreen2;
                i3 = 0;
                composer2.startReplaceGroup(1890390033);
                boolean zIsLoading = headerIcon.isLoading();
                Spacer2.Spacer(Column5.weight$default(column62, companion2, 1.0f, false, 2, null), composer2, 0);
                composer2.startReplaceGroup(1585006121);
                Modifier modifierM4876borderxT4_qwU = !zIsLoading ? BorderKt.m4876borderxT4_qwU(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion2, AdvisoryAccountLoadingScreenKt.CircularProgressSize), AdvisoryAccountLoadingScreenKt.CircularProgressSize), C2002Dp.m7995constructorimpl(1), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU(), RoundedCornerShape2.getCircleShape()) : companion2;
                composer2.endReplaceGroup();
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM4876borderxT4_qwU);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceGroup(1995948059);
                if (zIsLoading) {
                    BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion2, AdvisoryAccountLoadingScreenKt.CircularProgressSize), AdvisoryAccountLoadingScreenKt.CircularProgressSize), null, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), composer2, 6, 2);
                }
                composer2.endReplaceGroup();
                float f = 48;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(headerIcon.getIconAsset()), "header icon", BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f)), null, false, composer2, BentoIcon4.Size24.$stable | 3120, 48);
                composer2.endNode();
                companion = companion2;
                column6 = column62;
                Spacer2.Spacer(Column5.weight$default(column6, companion, 0.5f, false, 2, null), composer2, 0);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            Column6 column63 = column6;
            Modifier.Companion companion5 = companion;
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getBottom(), companion3.getCenterHorizontally(), composer2, 54);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, i3);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            StringResource title = accountLoadingScreenState.getTitle();
            int i4 = StringResource.$stable;
            String string2 = StringResource2.getString(title, composer2, i4);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer2, i5).getDisplayCapsuleSmall();
            TextAlign.Companion companion6 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer2, 0, 0, 8126);
            StringResource subtitle = accountLoadingScreenState.getSubtitle();
            composer2.startReplaceGroup(-1621925436);
            if (subtitle != null) {
                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(subtitle, composer2, i4), PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i5).m21594getXlargeD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8124);
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            Spacer2.Spacer(Column5.weight$default(column63, companion5, 1.0f, false, 2, null), composer2, 0);
            boolean showRefreshButton = accountLoadingScreenState.getShowRefreshButton();
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion7 = Composer.INSTANCE;
            if (objRememberedValue == companion7.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryAccountLoadingScreenKt$AdvisoryLoadingAccountScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(AdvisoryAccountLoadingScreenKt.C89062.invoke$lambda$8$lambda$7$lambda$4$lambda$3(((Integer) obj).intValue()));
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            EnterTransition enterTransitionSlideInVertically$default = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue, 1, null);
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion7.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryAccountLoadingScreenKt$AdvisoryLoadingAccountScreen$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(AdvisoryAccountLoadingScreenKt.C89062.invoke$lambda$8$lambda$7$lambda$6$lambda$5(((Integer) obj).intValue()));
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            final AccountLoadingScreenState accountLoadingScreenState3 = accountLoadingScreenState;
            final AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen3 = advisoryPostAgreementsScreen;
            AnimatedVisibilityKt.AnimatedVisibility(column63, showRefreshButton, (Modifier) null, enterTransitionSlideInVertically$default, EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue2, 1, null), (String) null, ComposableLambda3.rememberComposableLambda(-229001764, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryAccountLoadingScreenKt$AdvisoryLoadingAccountScreen$2$1$2$4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                    invoke(animatedVisibilityScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-229001764, i6, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisoryLoadingAccountScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisoryAccountLoadingScreen.kt:212)");
                    }
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion8, 0.0f, bentoTheme2.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 1, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer3, i7).m21593getSmallD9Ej5fM());
                    AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen4 = advisoryPostAgreementsScreen3;
                    AccountLoadingScreenState accountLoadingScreenState4 = accountLoadingScreenState3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion9.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor5);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy4, companion9.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion9.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion9.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion9.getSetModifier());
                    Column6 column64 = Column6.INSTANCE;
                    composer3.startReplaceGroup(5004770);
                    boolean zChanged = composer3.changed(advisoryPostAgreementsScreen4);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new C8908x954a005d(advisoryPostAgreementsScreen4);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    composer3.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue3), StringResources_androidKt.stringResource(C11048R.string.general_label_refresh, composer3, 0), ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.TIMEOUT, null, new Component(Component.ComponentType.LOADING_PLACEHOLDER, accountLoadingScreenState4.getLoggingIdentifier(), null, 4, null), null, 43, null)), true, false, false, true, false, null, 108, null), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer3, 24576, 0, 8168);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, 1600518, 18);
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

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(315871673);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(315871673, i, -1, "com.robinhood.android.advisory.onboarding.outro.Preview (AdvisoryAccountLoadingScreen.kt:247)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableSingletons$AdvisoryAccountLoadingScreenKt.INSTANCE.getLambda$893586689$feature_advisory_onboarding_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryAccountLoadingScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryAccountLoadingScreenKt.Preview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
