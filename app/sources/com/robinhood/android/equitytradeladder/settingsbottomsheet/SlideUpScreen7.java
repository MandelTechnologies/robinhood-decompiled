package com.robinhood.android.equitytradeladder.settingsbottomsheet;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.BackHandler;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equitytradeladder.C15889R;
import com.robinhood.android.equitytradeladder.LadderScreenState;
import com.robinhood.android.equitytradeladder.compose.LadderAnimateVisibility;
import com.robinhood.android.equitytradeladder.compose.LadderAnimateVisibility3;
import com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreen7;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementEvent;
import com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreen4;
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SlideUpScreen.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ah\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\fH\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\nX\u008a\u008e\u0002"}, m3636d2 = {"AUTO_SEND_AGREEMENT_DESCRIPTION", "", "AUTO_SEND_AGREEMENT_IDENTIFIER", "SlideUpScreen", "", "screenState", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$SlideUp;", "setScreenState", "Lkotlin/Function2;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "", "advanceScreenState", "Lkotlin/Function1;", "onAutosendAgreementSigned", "Lkotlin/ParameterName;", "name", "showConfirmationToast", "(Lcom/robinhood/android/equitytradeladder/LadderScreenState$SlideUp;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SlideUpScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-equity-trade-ladder_externalDebug", "internalVisibility"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SlideUpScreen7 {
    private static final String AUTO_SEND_AGREEMENT_DESCRIPTION = "EquitiesTradingLadderAgreement";
    private static final String AUTO_SEND_AGREEMENT_IDENTIFIER = "AUTO_SEND_EQUITIES_MOBILE_AGREEMENT";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SlideUpScreen$lambda$10(LadderScreenState.SlideUp slideUp, Function2 function2, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        SlideUpScreen(slideUp, function2, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SlideUpScreen$lambda$6$lambda$5(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SlideUpScreen$lambda$8$lambda$7(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SlideUpScreenPreview$lambda$11(int i, Composer composer, int i2) {
        SlideUpScreenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SlideUpScreen(final LadderScreenState.SlideUp screenState, final Function2<? super LadderScreenState, ? super Boolean, Unit> setScreenState, final Function1<? super LadderScreenState, Unit> advanceScreenState, final Function1<? super Boolean, Unit> onAutosendAgreementSigned, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(setScreenState, "setScreenState");
        Intrinsics.checkNotNullParameter(advanceScreenState, "advanceScreenState");
        Intrinsics.checkNotNullParameter(onAutosendAgreementSigned, "onAutosendAgreementSigned");
        Composer composerStartRestartGroup = composer.startRestartGroup(-221240072);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(screenState) : composerStartRestartGroup.changedInstance(screenState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(setScreenState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(advanceScreenState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onAutosendAgreementSigned) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-221240072, i2, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreen (SlideUpScreen.kt:41)");
            }
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            boolean zSlideUpScreen$lambda$1 = SlideUpScreen$lambda$1(snapshotState);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z = false;
            boolean z2 = (i2 & 896) == 256;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(screenState))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SlideUpScreen7.SlideUpScreen$lambda$4$lambda$3(advanceScreenState, screenState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(SlideUpScreen7.SlideUpScreen$lambda$6$lambda$5(((Integer) obj).intValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EnterTransition enterTransitionPlus = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue3, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(SlideUpScreen7.SlideUpScreen$lambda$8$lambda$7(((Integer) obj).intValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            LadderAnimateVisibility.LadderAnimateVisibility(zSlideUpScreen$lambda$1, function0, null, enterTransitionPlus, EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue4, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), 0L, ComposableLambda3.rememberComposableLambda(-256196439, true, new C159934(advanceScreenState, screenState, current, userInteractionEventDescriptor, setScreenState, onAutosendAgreementSigned), composerStartRestartGroup, 54), composerStartRestartGroup, 1600512, 36);
            composer2 = composerStartRestartGroup;
            Unit unit = Unit.INSTANCE;
            composer2.startReplaceGroup(5004770);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new SlideUpScreen8(snapshotState, null);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlideUpScreen7.SlideUpScreen$lambda$10(screenState, setScreenState, advanceScreenState, onAutosendAgreementSigned, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SlideUpScreen$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SlideUpScreen$lambda$4$lambda$3(Function1 function1, LadderScreenState.SlideUp slideUp) {
        function1.invoke(slideUp.getParentScreenState());
        return Unit.INSTANCE;
    }

    /* compiled from: SlideUpScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreenKt$SlideUpScreen$4 */
    static final class C159934 implements Function3<LadderAnimateVisibility3, Composer, Integer, Unit> {
        final /* synthetic */ Function1<LadderScreenState, Unit> $advanceScreenState;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ Function1<Boolean, Unit> $onAutosendAgreementSigned;
        final /* synthetic */ LadderScreenState.SlideUp $screenState;
        final /* synthetic */ Function2<LadderScreenState, Boolean, Unit> $setScreenState;

        /* JADX WARN: Multi-variable type inference failed */
        C159934(Function1<? super LadderScreenState, Unit> function1, LadderScreenState.SlideUp slideUp, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function2<? super LadderScreenState, ? super Boolean, Unit> function2, Function1<? super Boolean, Unit> function12) {
            this.$advanceScreenState = function1;
            this.$screenState = slideUp;
            this.$eventLogger = eventLogger;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$setScreenState = function2;
            this.$onAutosendAgreementSigned = function12;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LadderAnimateVisibility3 ladderAnimateVisibility3, Composer composer, Integer num) {
            invoke(ladderAnimateVisibility3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1) {
            function1.invoke(null);
            return Unit.INSTANCE;
        }

        public final void invoke(final LadderAnimateVisibility3 LadderAnimateVisibility, Composer composer, int i) {
            int i2;
            int i3;
            Object obj;
            Intrinsics.checkNotNullParameter(LadderAnimateVisibility, "$this$LadderAnimateVisibility");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(LadderAnimateVisibility) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-256196439, i2, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreen.<anonymous> (SlideUpScreen.kt:53)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$advanceScreenState);
            final Function1<LadderScreenState, Unit> function1 = this.$advanceScreenState;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreenKt$SlideUpScreen$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SlideUpScreen7.C159934.invoke$lambda$1$lambda$0(function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BackHandler.BackHandler(false, (Function0) objRememberedValue, composer, 0, 1);
            if (!(this.$screenState instanceof LadderScreenState.SlideUp.IdentiAgreement)) {
                throw new NoWhenBranchMatchedException();
            }
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ZIndexModifier2.zIndex(Modifier.INSTANCE, 999.0f), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.AGREEMENT, SlideUpScreen7.AUTO_SEND_AGREEMENT_DESCRIPTION, SlideUpScreen7.AUTO_SEND_AGREEMENT_IDENTIFIER, null, 8, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            IdentiAgreementType identiAgreementType = ((LadderScreenState.SlideUp.IdentiAgreement) this.$screenState).getIdentiAgreementType();
            String strStringResource = StringResources_androidKt.stringResource(C15889R.string.auto_send_agreement_button_text, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C15889R.string.auto_send_agreement_button_disclosure, composer, 0);
            composer.startReplaceGroup(-1224400529);
            int i4 = i2 & 14;
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$screenState) | composer.changed(this.$setScreenState) | (i4 == 4);
            final EventLogger eventLogger = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            final LadderScreenState.SlideUp slideUp = this.$screenState;
            final Function2<LadderScreenState, Boolean, Unit> function2 = this.$setScreenState;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                i3 = i4;
                obj = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreenKt$SlideUpScreen$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SlideUpScreen7.C159934.invoke$lambda$3$lambda$2(eventLogger, userInteractionEventDescriptor, slideUp, function2, LadderAnimateVisibility);
                    }
                };
                composer.updateRememberedValue(obj);
            } else {
                i3 = i4;
                obj = objRememberedValue2;
            }
            Function0 function0 = (Function0) obj;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changed(this.$onAutosendAgreementSigned) | composer.changedInstance(this.$screenState) | (i3 == 4);
            final EventLogger eventLogger2 = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
            final Function1<Boolean, Unit> function12 = this.$onAutosendAgreementSigned;
            final LadderScreenState.SlideUp slideUp2 = this.$screenState;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Function1 function13 = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreenKt$SlideUpScreen$4$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SlideUpScreen7.C159934.invoke$lambda$5$lambda$4(eventLogger2, userInteractionEventDescriptor2, function12, slideUp2, LadderAnimateVisibility, (IdentiAgreementEvent) obj2);
                    }
                };
                composer.updateRememberedValue(function13);
                objRememberedValue3 = function13;
            }
            composer.endReplaceGroup();
            IdentiAgreementScreen4.IdentiAgreementScreen(identiAgreementType, null, function0, (Function1) objRememberedValue3, modifierAutoLogEvents$default, strStringResource, strStringResource2, null, composer, 48, 128);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, LadderScreenState.SlideUp slideUp, Function2 function2, LadderAnimateVisibility3 ladderAnimateVisibility3) {
            EventLogger.DefaultImpls.logDisappear$default(eventLogger, null, new Screen(Screen.Name.AGREEMENT, SlideUpScreen7.AUTO_SEND_AGREEMENT_DESCRIPTION, SlideUpScreen7.AUTO_SEND_AGREEMENT_IDENTIFIER, null, 8, null), null, null, userInteractionEventDescriptor.getContext(), 13, null);
            if (((LadderScreenState.SlideUp.IdentiAgreement) slideUp).getShowUpsellOnDismiss()) {
                function2.invoke(LadderScreenState.AutoSendUpsell.INSTANCE, Boolean.FALSE);
            }
            ladderAnimateVisibility3.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function1 function1, LadderScreenState.SlideUp slideUp, LadderAnimateVisibility3 ladderAnimateVisibility3, IdentiAgreementEvent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (!Intrinsics.areEqual(it, IdentiAgreementEvent.Submitting.INSTANCE)) {
                if (Intrinsics.areEqual(it, IdentiAgreementEvent.Submitted.INSTANCE)) {
                    EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.AGREEMENT, SlideUpScreen7.AUTO_SEND_AGREEMENT_DESCRIPTION, SlideUpScreen7.AUTO_SEND_AGREEMENT_IDENTIFIER, null, 8, null), new Component(Component.ComponentType.BUTTON, "submit", null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
                    function1.invoke(Boolean.valueOf(((LadderScreenState.SlideUp.IdentiAgreement) slideUp).getShowConfirmationToast()));
                    ladderAnimateVisibility3.dismiss();
                } else {
                    if (!(it instanceof IdentiAgreementEvent.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Ladder identi agreement error: " + ((IdentiAgreementEvent.Error) it).getCause().getMessage()), false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null), 2, null);
                    ladderAnimateVisibility3.dismiss();
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final boolean SlideUpScreen$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    public static final void SlideUpScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-395527228);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-395527228, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreenPreview (SlideUpScreen.kt:135)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, SlideUpScreen5.INSTANCE.m14075getLambda$2115803357$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.SlideUpScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlideUpScreen7.SlideUpScreenPreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
