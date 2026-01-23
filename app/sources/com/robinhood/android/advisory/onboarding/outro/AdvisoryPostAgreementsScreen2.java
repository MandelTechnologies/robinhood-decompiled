package com.robinhood.android.advisory.onboarding.outro;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen2;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: AdvisoryPostAgreementsScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"AdvisoryPostAgreementsScreen", "", "state", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState;", "callbacks", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState;Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryPostAgreementsScreen2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisoryPostAgreementsScreen$lambda$2(AdvisoryPostAgreementsViewState advisoryPostAgreementsViewState, AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvisoryPostAgreementsScreen(advisoryPostAgreementsViewState, advisoryPostAgreementsScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AdvisoryPostAgreementsScreen(final AdvisoryPostAgreementsViewState state, final AdvisoryPostAgreementsScreen callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1594173410);
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
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1594173410, i3, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen (AdvisoryPostAgreementsScreen.kt:38)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AdvisoryPostAgreementsScreen2.AdvisoryPostAgreementsScreen$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(state, null, (Function1) objRememberedValue, null, "advisory_post_agreements_screen_transition", null, ComposableLambda3.rememberComposableLambda(-760173433, true, new Function4<AnimatedContentScope, AdvisoryPostAgreementsViewState, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreenKt.AdvisoryPostAgreementsScreen.2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, AdvisoryPostAgreementsViewState advisoryPostAgreementsViewState, Composer composer2, Integer num) {
                    invoke(animatedContentScope, advisoryPostAgreementsViewState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, final AdvisoryPostAgreementsViewState activeState, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(activeState, "activeState");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-760173433, i5, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen.<anonymous> (AdvisoryPostAgreementsScreen.kt:46)");
                    }
                    UserInteractionEventDescriptor descriptor = state.getDescriptor();
                    final AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen = callbacks;
                    final Modifier modifier4 = modifier3;
                    AutoLoggingCompositionLocals.EventLoggable(descriptor, ComposableLambda3.rememberComposableLambda(1566633020, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreenKt.AdvisoryPostAgreementsScreen.2.1
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
                                ComposerKt.traceEventStart(1566633020, i6, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen.<anonymous>.<anonymous> (AdvisoryPostAgreementsScreen.kt:47)");
                            }
                            AdvisoryPostAgreementsViewState advisoryPostAgreementsViewState = activeState;
                            if (advisoryPostAgreementsViewState instanceof AdvisoryPostAgreementsViewState.LoadingAccount) {
                                composer3.startReplaceGroup(-1845193691);
                                final AdvisoryPostAgreementsViewState advisoryPostAgreementsViewState2 = activeState;
                                final AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen2 = advisoryPostAgreementsScreen;
                                final Modifier modifier5 = modifier4;
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1979513343, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreenKt.AdvisoryPostAgreementsScreen.2.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i7) {
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1979513343, i7, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen.<anonymous>.<anonymous>.<anonymous> (AdvisoryPostAgreementsScreen.kt:50)");
                                        }
                                        AdvisoryAccountLoadingScreenKt.AdvisoryLoadingAccountScreen(((AdvisoryPostAgreementsViewState.LoadingAccount) advisoryPostAgreementsViewState2).getState(), advisoryPostAgreementsScreen2, modifier5, composer4, StringResource.$stable, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 6);
                                composer3.endReplaceGroup();
                            } else if (advisoryPostAgreementsViewState instanceof AdvisoryPostAgreementsViewState.FirstDepositSubmission) {
                                composer3.startReplaceGroup(-1844769146);
                                BentoThemeOverlays.DirectionThemeOverlay(BentoTheme4.POSITIVE, ComposableLambda3.rememberComposableLambda(-1151587913, true, new AnonymousClass2(activeState, AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer3, AutoLoggingCompositionLocals4.$stable), advisoryPostAgreementsScreen, modifier4), composer3, 54), composer3, 54);
                                composer3.endReplaceGroup();
                            } else {
                                if (!(advisoryPostAgreementsViewState instanceof AdvisoryPostAgreementsViewState.Celebration)) {
                                    composer3.startReplaceGroup(-1999185977);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(-1843518761);
                                final Modifier modifier6 = modifier4;
                                final AdvisoryPostAgreementsViewState advisoryPostAgreementsViewState3 = activeState;
                                final AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen3 = advisoryPostAgreementsScreen;
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-478704249, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreenKt.AdvisoryPostAgreementsScreen.2.1.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i7) {
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-478704249, i7, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen.<anonymous>.<anonymous>.<anonymous> (AdvisoryPostAgreementsScreen.kt:85)");
                                        }
                                        Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(modifier6, ((AdvisoryPostAgreementsViewState.Celebration) advisoryPostAgreementsViewState3).getDescriptor());
                                        AdvisoryPostAgreementsViewState.Celebration celebration = (AdvisoryPostAgreementsViewState.Celebration) advisoryPostAgreementsViewState3;
                                        AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen4 = advisoryPostAgreementsScreen3;
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChanged = composer4.changed(advisoryPostAgreementsScreen4);
                                        Object objRememberedValue2 = composer4.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new AdvisoryPostAgreementsScreen3(advisoryPostAgreementsScreen4);
                                            composer4.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer4.endReplaceGroup();
                                        AdvisoryFirstDepositSubmitComposableKt.ConfirmationScreen(celebration, (Function1) ((KFunction) objRememberedValue2), modifierLogScreenTransitions, composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 6);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: AdvisoryPostAgreementsScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreenKt$AdvisoryPostAgreementsScreen$2$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ AdvisoryPostAgreementsViewState $activeState;
                            final /* synthetic */ AdvisoryPostAgreementsScreen $callbacks;
                            final /* synthetic */ EventLogger $eventLogger;
                            final /* synthetic */ Modifier $modifier;

                            AnonymousClass2(AdvisoryPostAgreementsViewState advisoryPostAgreementsViewState, EventLogger eventLogger, AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen, Modifier modifier) {
                                this.$activeState = advisoryPostAgreementsViewState;
                                this.$eventLogger = eventLogger;
                                this.$callbacks = advisoryPostAgreementsScreen;
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
                                    ComposerKt.traceEventStart(-1151587913, i, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreen.<anonymous>.<anonymous>.<anonymous> (AdvisoryPostAgreementsScreen.kt:63)");
                                }
                                FirstDepositNumberVisual visual = ((AdvisoryPostAgreementsViewState.FirstDepositSubmission) this.$activeState).getVisual();
                                BigDecimal decimalValue = ((AdvisoryPostAgreementsViewState.FirstDepositSubmission) this.$activeState).getTransferConfig().getAmount().getDecimalValue();
                                StringResource footerTitle = ((AdvisoryPostAgreementsViewState.FirstDepositSubmission) this.$activeState).getFooterTitle();
                                StringResource footerDescription = ((AdvisoryPostAgreementsViewState.FirstDepositSubmission) this.$activeState).getFooterDescription();
                                composer.startReplaceGroup(-1746271574);
                                boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$activeState) | composer.changed(this.$callbacks);
                                final EventLogger eventLogger = this.$eventLogger;
                                final AdvisoryPostAgreementsViewState advisoryPostAgreementsViewState = this.$activeState;
                                final AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen = this.$callbacks;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreenKt$AdvisoryPostAgreementsScreen$2$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AdvisoryPostAgreementsScreen2.C89482.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(eventLogger, advisoryPostAgreementsViewState, advisoryPostAgreementsScreen);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                Modifier modifier = this.$modifier;
                                int i2 = StringResource.$stable;
                                AdvisoryFirstDepositSubmitComposableKt.AdvisorySubmitFirstDepositScreen(visual, decimalValue, footerTitle, footerDescription, (Function0) objRememberedValue, modifier, composer, (i2 << 6) | (i2 << 9), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, AdvisoryPostAgreementsViewState advisoryPostAgreementsViewState, AdvisoryPostAgreementsScreen advisoryPostAgreementsScreen) {
                                AdvisoryPostAgreementsViewState.FirstDepositSubmission firstDepositSubmission = (AdvisoryPostAgreementsViewState.FirstDepositSubmission) advisoryPostAgreementsViewState;
                                EventLogger.DefaultImpls.logSwipe$default(eventLogger, null, firstDepositSubmission.getDescriptor().getScreen(), null, null, firstDepositSubmission.getDescriptor().getContext(), false, 45, null);
                                advisoryPostAgreementsScreen.onSwipeToSubmit(firstDepositSubmission.getSinkAccount(), firstDepositSubmission.getTransferConfig());
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 1597824, 42);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisoryPostAgreementsScreen2.AdvisoryPostAgreementsScreen$lambda$2(state, callbacks, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform AdvisoryPostAgreementsScreen$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    }
}
