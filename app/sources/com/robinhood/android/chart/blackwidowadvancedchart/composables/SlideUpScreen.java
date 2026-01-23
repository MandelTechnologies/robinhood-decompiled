package com.robinhood.android.chart.blackwidowadvancedchart.composables;

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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.BackHandler;
import black_widow.contracts.mobile_app_chart.proto.p024v1.AddIndicatorAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.DeleteIndicatorAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.EditIndicatorLineAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.EditIndicatorParameterAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ResetIndicatorAction;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.AddIndicatorScreenState;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreen;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo4;
import com.robinhood.android.chart.blackwidowadvancedchart.models.AddIndicator;
import com.robinhood.android.chart.blackwidowadvancedchart.models.AutoSendUpsell;
import com.robinhood.android.chart.blackwidowadvancedchart.models.IdentiAgreement;
import com.robinhood.android.chart.blackwidowadvancedchart.models.IndicatorSettings;
import com.robinhood.android.chart.blackwidowadvancedchart.models.SlideUp;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementEvent;
import com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementScreen4;
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
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
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: SlideUpScreen.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001a=\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010²\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002"}, m3636d2 = {"AUTO_SEND_DISCLOSURE_SCREEN", "", "SlideUpScreen", "", "screenState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SlideUp;", "addIndicatorScreenState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/AddIndicatorScreenState;", "availableColorPickerColors", "Lkotlinx/collections/immutable/ImmutableList;", "Lrh_server_driven_ui/v1/ThemedColorDto;", "chartCallbacks", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;", "orderCallbacks", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/IAdvanceChartOrderDuxo;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SlideUp;Lcom/robinhood/android/chart/blackwidowadvancedchart/AddIndicatorScreenState;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/IAdvanceChartOrderDuxo;Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "colors", "internalVisibility", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SlideUpScreen {
    private static final String AUTO_SEND_DISCLOSURE_SCREEN = "AutoSendDisclosureScreen";

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableList SlideUpScreen$lambda$1$lambda$0(ImmutableList immutableList) {
        return immutableList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SlideUpScreen$lambda$10$lambda$9(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SlideUpScreen$lambda$12(SlideUp slideUp, AddIndicatorScreenState addIndicatorScreenState, ImmutableList immutableList, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4, int i, Composer composer, int i2) {
        SlideUpScreen(slideUp, addIndicatorScreenState, immutableList, blackWidowAdvanceChartCallbacks, advanceChartOrderDuxo4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SlideUpScreen$lambda$8$lambda$7(int i) {
        return i;
    }

    public static final void SlideUpScreen(final SlideUp screenState, final AddIndicatorScreenState addIndicatorScreenState, final ImmutableList<ThemedColorDto> availableColorPickerColors, final BlackWidowAdvanceChartCallbacks chartCallbacks, final AdvanceChartOrderDuxo4 orderCallbacks, Composer composer, final int i) {
        int i2;
        AddIndicatorScreenState addIndicatorScreenState2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        Intrinsics.checkNotNullParameter(availableColorPickerColors, "availableColorPickerColors");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Intrinsics.checkNotNullParameter(orderCallbacks, "orderCallbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(234642414);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(screenState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            addIndicatorScreenState2 = addIndicatorScreenState;
            i2 |= composerStartRestartGroup.changedInstance(addIndicatorScreenState2) ? 32 : 16;
        } else {
            addIndicatorScreenState2 = addIndicatorScreenState;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(availableColorPickerColors) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(chartCallbacks) : composerStartRestartGroup.changedInstance(chartCallbacks) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(orderCallbacks) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(234642414, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreen (SlideUpScreen.kt:53)");
            }
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(availableColorPickerColors);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SlideUpScreen.SlideUpScreen$lambda$1$lambda$0(availableColorPickerColors);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            boolean zSlideUpScreen$lambda$4 = SlideUpScreen$lambda$4(snapshotState);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 7168) == 2048 || ((i2 & 4096) != 0 && composerStartRestartGroup.changedInstance(chartCallbacks));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new SlideUpScreen2(chartCallbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(SlideUpScreen.SlideUpScreen$lambda$8$lambda$7(((Integer) obj).intValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            EnterTransition enterTransitionPlus = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue4, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(SlideUpScreen.SlideUpScreen$lambda$10$lambda$9(((Integer) obj).intValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            Helpers3.BwAnimateVisibility(zSlideUpScreen$lambda$4, function0, null, enterTransitionPlus, EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue5, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), 0L, ComposableLambda3.rememberComposableLambda(-2113045705, true, new C106374(screenState, addIndicatorScreenState2, chartCallbacks, snapshotState4, current, userInteractionEventDescriptor, orderCallbacks), composerStartRestartGroup, 54), composerStartRestartGroup, 1600512, 36);
            composer2 = composerStartRestartGroup;
            Unit unit = Unit.INSTANCE;
            composer2.startReplaceGroup(5004770);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new SlideUpScreen4(snapshotState, null);
                composer2.updateRememberedValue(objRememberedValue6);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlideUpScreen.SlideUpScreen$lambda$12(screenState, addIndicatorScreenState, availableColorPickerColors, chartCallbacks, orderCallbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SlideUpScreen$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: SlideUpScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$SlideUpScreen$4 */
    static final class C106374 implements Function3<Helpers, Composer, Integer, Unit> {
        final /* synthetic */ AddIndicatorScreenState $addIndicatorScreenState;
        final /* synthetic */ BlackWidowAdvanceChartCallbacks $chartCallbacks;
        final /* synthetic */ SnapshotState4<ImmutableList<ThemedColorDto>> $colors$delegate;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ AdvanceChartOrderDuxo4 $orderCallbacks;
        final /* synthetic */ SlideUp $screenState;

        /* JADX WARN: Multi-variable type inference failed */
        C106374(SlideUp slideUp, AddIndicatorScreenState addIndicatorScreenState, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, SnapshotState4<? extends ImmutableList<ThemedColorDto>> snapshotState4, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4) {
            this.$screenState = slideUp;
            this.$addIndicatorScreenState = addIndicatorScreenState;
            this.$chartCallbacks = blackWidowAdvanceChartCallbacks;
            this.$colors$delegate = snapshotState4;
            this.$eventLogger = eventLogger;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$orderCallbacks = advanceChartOrderDuxo4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Helpers helpers, Composer composer, Integer num) {
            invoke(helpers, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final Helpers BwAnimateVisibility, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BwAnimateVisibility, "$this$BwAnimateVisibility");
            if ((i & 6) == 0) {
                i2 = (composer.changed(BwAnimateVisibility) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2113045705, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreen.<anonymous> (SlideUpScreen.kt:64)");
            }
            composer.startReplaceGroup(5004770);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objRememberedValue = composer.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SlideUpScreen3(BwAnimateVisibility);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BackHandler.BackHandler(false, (Function0) ((KFunction) objRememberedValue), composer, 0, 1);
            SlideUp slideUp = this.$screenState;
            if (Intrinsics.areEqual(slideUp, AddIndicator.INSTANCE)) {
                composer.startReplaceGroup(1591196591);
                AddIndicatorScreenState addIndicatorScreenState = this.$addIndicatorScreenState;
                if (addIndicatorScreenState != null) {
                    final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks = this.$chartCallbacks;
                    Modifier modifierZIndex = ZIndexModifier2.zIndex(Modifier.INSTANCE, 999.0f);
                    composer.startReplaceGroup(5004770);
                    boolean z2 = i3 == 4;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$SlideUpScreen$4$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SlideUpScreen.C106374.invoke$lambda$5$lambda$2$lambda$1(BwAnimateVisibility);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(blackWidowAdvanceChartCallbacks);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$SlideUpScreen$4$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SlideUpScreen.C106374.invoke$lambda$5$lambda$4$lambda$3(blackWidowAdvanceChartCallbacks, (IndicatorDto) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceGroup();
                    AddIndicatorScreenKt.AddIndicatorScreen(addIndicatorScreenState, function0, (Function1) objRememberedValue3, modifierZIndex, composer, 3072, 0);
                    Unit unit = Unit.INSTANCE;
                }
                composer.endReplaceGroup();
            } else if (slideUp instanceof IndicatorSettings) {
                composer.startReplaceGroup(1591693769);
                Modifier modifierZIndex2 = ZIndexModifier2.zIndex(Modifier.INSTANCE, 999.0f);
                IndicatorStateDto indicator = ((IndicatorSettings) this.$screenState).getIndicator();
                ImmutableList immutableListSlideUpScreen$lambda$2 = SlideUpScreen.SlideUpScreen$lambda$2(this.$colors$delegate);
                composer.startReplaceGroup(5004770);
                boolean z3 = i3 == 4;
                Object objRememberedValue4 = composer.rememberedValue();
                if (z3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$SlideUpScreen$4$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SlideUpScreen.C106374.invoke$lambda$7$lambda$6(BwAnimateVisibility);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Function0 function02 = (Function0) objRememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(this.$chartCallbacks) | (i3 == 4);
                final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks2 = this.$chartCallbacks;
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$SlideUpScreen$4$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SlideUpScreen.C106374.invoke$lambda$9$lambda$8(blackWidowAdvanceChartCallbacks2, BwAnimateVisibility, (IndicatorStateDto) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                Function1 function1 = (Function1) objRememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(this.$chartCallbacks);
                final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks3 = this.$chartCallbacks;
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$SlideUpScreen$4$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SlideUpScreen.C106374.invoke$lambda$11$lambda$10(blackWidowAdvanceChartCallbacks3, (String) obj, (EditIndicatorParameterAction) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                Function2 function2 = (Function2) objRememberedValue6;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance4 = composer.changedInstance(this.$chartCallbacks);
                final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks4 = this.$chartCallbacks;
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$SlideUpScreen$4$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SlideUpScreen.C106374.invoke$lambda$13$lambda$12(blackWidowAdvanceChartCallbacks4, (String) obj, (EditIndicatorLineAction) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue7);
                }
                Function2 function22 = (Function2) objRememberedValue7;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance5 = composer.changedInstance(this.$chartCallbacks);
                final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks5 = this.$chartCallbacks;
                Object objRememberedValue8 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$SlideUpScreen$4$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SlideUpScreen.C106374.invoke$lambda$15$lambda$14(blackWidowAdvanceChartCallbacks5, (String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue8);
                }
                composer.endReplaceGroup();
                IndicatorSettingsScreenKt.IndicatorSettingsScreen(indicator, immutableListSlideUpScreen$lambda$2, function02, function1, function2, function22, (Function1) objRememberedValue8, modifierZIndex2, composer, 12582912, 0);
                composer.endReplaceGroup();
            } else {
                if (!(slideUp instanceof IdentiAgreement)) {
                    composer.startReplaceGroup(882614642);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(882665782);
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(966446530, true, new AnonymousClass8(this.$screenState, this.$eventLogger, this.$eventDescriptor, this.$chartCallbacks, BwAnimateVisibility, this.$orderCallbacks), composer, 54), composer, 6);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$2$lambda$1(Helpers helpers) {
            helpers.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, IndicatorDto it) {
            Intrinsics.checkNotNullParameter(it, "it");
            blackWidowAdvanceChartCallbacks.updateIndicator(it.getId(), new IndicatorAction(new AddIndicatorAction(null, 1, null), null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(Helpers helpers) {
            helpers.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, String id, EditIndicatorParameterAction parameterUpdate) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(parameterUpdate, "parameterUpdate");
            blackWidowAdvanceChartCallbacks.updateIndicator(id, new IndicatorAction(null, null, null, null, parameterUpdate, null, null, null, 239, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, String id, EditIndicatorLineAction lineUpdate) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(lineUpdate, "lineUpdate");
            blackWidowAdvanceChartCallbacks.updateIndicator(id, new IndicatorAction(null, null, null, null, null, null, lineUpdate, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$15$lambda$14(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            blackWidowAdvanceChartCallbacks.updateIndicator(it, new IndicatorAction(null, null, new ResetIndicatorAction(null, 1, null), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, Helpers helpers, IndicatorStateDto it) {
            Intrinsics.checkNotNullParameter(it, "it");
            blackWidowAdvanceChartCallbacks.updateIndicator(it.getUuid(), new IndicatorAction(null, new DeleteIndicatorAction(null, 1, null), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null));
            helpers.dismiss();
            return Unit.INSTANCE;
        }

        /* compiled from: SlideUpScreen.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$SlideUpScreen$4$8, reason: invalid class name */
        static final class AnonymousClass8 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ BlackWidowAdvanceChartCallbacks $chartCallbacks;
            final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
            final /* synthetic */ EventLogger $eventLogger;
            final /* synthetic */ AdvanceChartOrderDuxo4 $orderCallbacks;
            final /* synthetic */ SlideUp $screenState;
            final /* synthetic */ Helpers $this_BwAnimateVisibility;

            AnonymousClass8(SlideUp slideUp, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, Helpers helpers, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4) {
                this.$screenState = slideUp;
                this.$eventLogger = eventLogger;
                this.$eventDescriptor = userInteractionEventDescriptor;
                this.$chartCallbacks = blackWidowAdvanceChartCallbacks;
                this.$this_BwAnimateVisibility = helpers;
                this.$orderCallbacks = advanceChartOrderDuxo4;
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
                    ComposerKt.traceEventStart(966446530, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreen.<anonymous>.<anonymous> (SlideUpScreen.kt:105)");
                }
                Modifier modifierZIndex = ZIndexModifier2.zIndex(Modifier.INSTANCE, 999.0f);
                IdentiAgreementType identiAgreementType = ((IdentiAgreement) this.$screenState).getIdentiAgreementType();
                String strStringResource = StringResources_androidKt.stringResource(C10963R.string.auto_send_agreement_button_text, composer, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C10963R.string.auto_send_agreement_button_disclosure, composer, 0);
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$screenState) | composer.changedInstance(this.$chartCallbacks) | composer.changed(this.$this_BwAnimateVisibility);
                final EventLogger eventLogger = this.$eventLogger;
                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                final SlideUp slideUp = this.$screenState;
                final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks = this.$chartCallbacks;
                final Helpers helpers = this.$this_BwAnimateVisibility;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function0 function0 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$SlideUpScreen$4$8$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SlideUpScreen.C106374.AnonymousClass8.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, slideUp, blackWidowAdvanceChartCallbacks, helpers);
                        }
                    };
                    composer.updateRememberedValue(function0);
                    objRememberedValue = function0;
                }
                Function0 function02 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$orderCallbacks) | composer.changedInstance(this.$screenState) | composer.changedInstance(this.$chartCallbacks) | composer.changed(this.$this_BwAnimateVisibility);
                final EventLogger eventLogger2 = this.$eventLogger;
                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
                final AdvanceChartOrderDuxo4 advanceChartOrderDuxo4 = this.$orderCallbacks;
                final SlideUp slideUp2 = this.$screenState;
                final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks2 = this.$chartCallbacks;
                final Helpers helpers2 = this.$this_BwAnimateVisibility;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.SlideUpScreenKt$SlideUpScreen$4$8$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SlideUpScreen.C106374.AnonymousClass8.invoke$lambda$3$lambda$2(eventLogger2, userInteractionEventDescriptor2, advanceChartOrderDuxo4, slideUp2, blackWidowAdvanceChartCallbacks2, helpers2, (IdentiAgreementEvent) obj);
                        }
                    };
                    composer.updateRememberedValue(function1);
                    objRememberedValue2 = function1;
                }
                composer.endReplaceGroup();
                IdentiAgreementScreen4.IdentiAgreementScreen(identiAgreementType, null, function02, (Function1) objRememberedValue2, modifierZIndex, strStringResource, strStringResource2, null, composer, 24624, 128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SlideUp slideUp, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, Helpers helpers) {
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BACK_BUTTON, SlideUpScreen.AUTO_SEND_DISCLOSURE_SCREEN, null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
                IdentiAgreement identiAgreement = (IdentiAgreement) slideUp;
                if (identiAgreement.getShowUpsellOnDismiss()) {
                    blackWidowAdvanceChartCallbacks.setScreenState(new AutoSendUpsell(identiAgreement.getIdentiAgreementType()), false);
                }
                helpers.dismiss();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, AdvanceChartOrderDuxo4 advanceChartOrderDuxo4, SlideUp slideUp, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, Helpers helpers, IdentiAgreementEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (!Intrinsics.areEqual(it, IdentiAgreementEvent.Submitting.INSTANCE)) {
                    if (Intrinsics.areEqual(it, IdentiAgreementEvent.Submitted.INSTANCE)) {
                        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, SlideUpScreen.AUTO_SEND_DISCLOSURE_SCREEN, null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
                        advanceChartOrderDuxo4.onAutoSendToggled(true);
                        if (((IdentiAgreement) slideUp).getShowConfirmationToast()) {
                            blackWidowAdvanceChartCallbacks.showAutoSendEnabledToast();
                        }
                        helpers.dismiss();
                    } else {
                        if (!(it instanceof IdentiAgreementEvent.Error)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("MAC identi agreement error: " + ((IdentiAgreementEvent.Error) it).getCause().getMessage()), false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null), 2, null);
                        helpers.dismiss();
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableList<ThemedColorDto> SlideUpScreen$lambda$2(SnapshotState4<? extends ImmutableList<ThemedColorDto>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean SlideUpScreen$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
