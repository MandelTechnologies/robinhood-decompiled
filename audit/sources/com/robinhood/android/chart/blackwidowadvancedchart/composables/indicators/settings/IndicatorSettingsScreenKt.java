package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
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
import black_widow.contracts.mobile_app_chart.proto.p024v1.CustomIndicatorSectionDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.EditIndicatorLineAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.EditIndicatorParameterAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorLineDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterValue;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorValidationInfoDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.LineValue;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.HapticEvents;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.shoestring.ShoeString;
import com.robinhood.android.shoestring.StringsKt;
import com.robinhood.android.shoestring.handlers.InlineComposable;
import com.robinhood.android.shoestring.handlers.InlineComposable5;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV22;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayoutV2;
import com.robinhood.compose.bento.component.numpad.CustomKeyConfig;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: IndicatorSettingsScreen.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a\u0097\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\f2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a#\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0003¢\u0006\u0002\u0010\u0019\u001a%\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0003¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u008e\u0002²\u0006\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u008a\u0084\u0002²\u0006\u0010\u0010)\u001a\b\u0012\u0004\u0012\u00020*0'X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u008e\u0002"}, m3636d2 = {"INDICATOR_SETTINGS_SCREEN", "", IndicatorSettingsScreenKt.INDICATOR_SETTINGS_SCREEN, "", "indicator", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "availableColorPickerColors", "Lkotlinx/collections/immutable/ImmutableList;", "Lrh_server_driven_ui/v1/ThemedColorDto;", "onBackPressed", "Lkotlin/Function0;", "onDelete", "Lkotlin/Function1;", "onParameterUpdated", "Lkotlin/Function2;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EditIndicatorParameterAction;", "onPlotUpdated", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EditIndicatorLineAction;", "onResetIndicator", "modifier", "Landroidx/compose/ui/Modifier;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "IndicatorSettingsTopBar", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "(Landroidx/compose/ui/focus/FocusManager;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CHART_SETTINGS_BOTTOM_SHEET_DISCLOSURE", "IndicatorSettingsTitle", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Landroidx/compose/runtime/Composer;I)V", "IndicatorSettingsScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "keyboardState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/SettingsKeyboardState;", "parameters", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto;", "plots", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorLineDto;", "showDescriptionPopup", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class IndicatorSettingsScreenKt {
    private static final String CHART_SETTINGS_BOTTOM_SHEET_DISCLOSURE = "ChartSettingsBottomSheetDisclosure";
    public static final String INDICATOR_SETTINGS_SCREEN = "IndicatorSettingsScreen";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorSettingsScreen$lambda$4(IndicatorStateDto indicatorStateDto, ImmutableList immutableList, Function0 function0, Function1 function1, Function2 function2, Function2 function22, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        IndicatorSettingsScreen(indicatorStateDto, immutableList, function0, function1, function2, function22, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorSettingsScreenPreview$lambda$10(int i, Composer composer, int i2) {
        IndicatorSettingsScreenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorSettingsTitle$lambda$9(IndicatorStateDto indicatorStateDto, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Composer composer, int i2) {
        IndicatorSettingsTitle(indicatorStateDto, eventLogger, userInteractionEventDescriptor, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorSettingsTopBar$lambda$5(FocusManager focusManager, Function0 function0, int i, Composer composer, int i2) {
        IndicatorSettingsTopBar(focusManager, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SettingsKeyboardState IndicatorSettingsScreen$lambda$2(SnapshotState<SettingsKeyboardState> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IndicatorSettingsTitle$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IndicatorSettingsScreen(final IndicatorStateDto indicator, final ImmutableList<ThemedColorDto> availableColorPickerColors, final Function0<Unit> onBackPressed, final Function1<? super IndicatorStateDto, Unit> onDelete, final Function2<? super String, ? super EditIndicatorParameterAction, Unit> onParameterUpdated, final Function2<? super String, ? super EditIndicatorLineAction, Unit> onPlotUpdated, final Function1<? super String, Unit> onResetIndicator, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        BentoNumpadScopeV22 bentoNumpadScopeV22;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        Intrinsics.checkNotNullParameter(availableColorPickerColors, "availableColorPickerColors");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Intrinsics.checkNotNullParameter(onParameterUpdated, "onParameterUpdated");
        Intrinsics.checkNotNullParameter(onPlotUpdated, "onPlotUpdated");
        Intrinsics.checkNotNullParameter(onResetIndicator, "onResetIndicator");
        Composer composerStartRestartGroup = composer.startRestartGroup(1515980196);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(indicator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(availableColorPickerColors) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDelete) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onParameterUpdated) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPlotUpdated) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onResetIndicator) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 == 0) {
            if ((12582912 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1515980196, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen (IndicatorSettingsScreen.kt:111)");
                }
                final View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new BentoNumpadScopeV22(coroutineScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                BentoNumpadScopeV22 bentoNumpadScopeV222 = (BentoNumpadScopeV22) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 != companion.getEmpty()) {
                    bentoNumpadScopeV22 = bentoNumpadScopeV222;
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Closed.INSTANCE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    bentoNumpadScopeV22 = bentoNumpadScopeV222;
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                final Modifier modifier5 = modifier4;
                final BentoNumpadScopeV22 bentoNumpadScopeV223 = bentoNumpadScopeV22;
                BentoNumpadScreenLayoutV2.BentoNumpadScreenLayoutV2(bentoNumpadScopeV223, ComposableLambda3.rememberComposableLambda(-26440013, true, new Function3<BentoNumpadScopeV2, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt.IndicatorSettingsScreen.1

                    /* compiled from: IndicatorSettingsScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ ImmutableList<ThemedColorDto> $availableColorPickerColors;
                        final /* synthetic */ Context $context;
                        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ FocusManager $focusManager;
                        final /* synthetic */ IndicatorStateDto $indicator;
                        final /* synthetic */ SnapshotState<SettingsKeyboardState> $keyboardState$delegate;
                        final /* synthetic */ BentoNumpadScopeV22 $numpadScope;
                        final /* synthetic */ Function1<IndicatorStateDto, Unit> $onDelete;
                        final /* synthetic */ Function2<String, EditIndicatorParameterAction, Unit> $onParameterUpdated;
                        final /* synthetic */ Function2<String, EditIndicatorLineAction, Unit> $onPlotUpdated;
                        final /* synthetic */ Function1<String, Unit> $onResetIndicator;
                        final /* synthetic */ View $view;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass2(IndicatorStateDto indicatorStateDto, FocusManager focusManager, SnapshotState<SettingsKeyboardState> snapshotState, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, BentoNumpadScopeV22 bentoNumpadScopeV22, Function2<? super String, ? super EditIndicatorParameterAction, Unit> function2, ImmutableList<ThemedColorDto> immutableList, Function2<? super String, ? super EditIndicatorLineAction, Unit> function22, Context context, Function1<? super String, Unit> function1, View view, Function1<? super IndicatorStateDto, Unit> function12) {
                            this.$indicator = indicatorStateDto;
                            this.$focusManager = focusManager;
                            this.$keyboardState$delegate = snapshotState;
                            this.$eventLogger = eventLogger;
                            this.$eventDescriptor = userInteractionEventDescriptor;
                            this.$numpadScope = bentoNumpadScopeV22;
                            this.$onParameterUpdated = function2;
                            this.$availableColorPickerColors = immutableList;
                            this.$onPlotUpdated = function22;
                            this.$context = context;
                            this.$onResetIndicator = function1;
                            this.$view = view;
                            this.$onDelete = function12;
                        }

                        private static final List<IndicatorParameterDto> invoke$lambda$2(SnapshotState<List<IndicatorParameterDto>> snapshotState) {
                            return snapshotState.getValue();
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final List<IndicatorLineDto> invoke$lambda$5(SnapshotState<List<IndicatorLineDto>> snapshotState) {
                            return snapshotState.getValue();
                        }

                        /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:89:0x02ec  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                            Object next;
                            Modifier modifier;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            int i2 = (i & 6) == 0 ? i | (composer.changed(paddingValues) ? 4 : 2) : i;
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1779049918, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:146)");
                            }
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$indicator);
                            IndicatorStateDto indicatorStateDto = this.$indicator;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                List<IndicatorParameterDto> parameters = indicatorStateDto.getParameters();
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : parameters) {
                                    if (!Intrinsics.areEqual(((IndicatorParameterDto) obj).getVisible(), Boolean.FALSE)) {
                                        arrayList.add(obj);
                                    }
                                }
                                objRememberedValue = SnapshotState3.mutableStateOf$default(arrayList, null, 2, null);
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChanged2 = composer.changed(this.$indicator);
                            IndicatorStateDto indicatorStateDto2 = this.$indicator;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                List<IndicatorLineDto> lines = indicatorStateDto2.getLines();
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : lines) {
                                    if (!((IndicatorLineDto) obj2).is_plot_hidden()) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                objRememberedValue2 = SnapshotState3.mutableStateOf$default(arrayList2, null, 2, null);
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                            composer.endReplaceGroup();
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$focusManager);
                            final FocusManager focusManager = this.$focusManager;
                            final SnapshotState<SettingsKeyboardState> snapshotState3 = this.$keyboardState$delegate;
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$7$lambda$6(focusManager, snapshotState3);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, (Function0) objRememberedValue3, 28, null);
                            final IndicatorStateDto indicatorStateDto3 = this.$indicator;
                            final EventLogger eventLogger = this.$eventLogger;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                            final BentoNumpadScopeV22 bentoNumpadScopeV22 = this.$numpadScope;
                            final Function2<String, EditIndicatorParameterAction, Unit> function2 = this.$onParameterUpdated;
                            final ImmutableList<ThemedColorDto> immutableList = this.$availableColorPickerColors;
                            final Function2<String, EditIndicatorLineAction, Unit> function22 = this.$onPlotUpdated;
                            final Context context = this.$context;
                            final Function1<String, Unit> function1 = this.$onResetIndicator;
                            final View view = this.$view;
                            final Function1<IndicatorStateDto, Unit> function12 = this.$onDelete;
                            final SnapshotState<SettingsKeyboardState> snapshotState4 = this.$keyboardState$delegate;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4891clickableO2vRcR0$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            IndicatorSettingsScreenKt.IndicatorSettingsTitle(indicatorStateDto3, eventLogger, userInteractionEventDescriptor, composer, 0);
                            Object validation_info = indicatorStateDto3.getValidation_info();
                            composer.startReplaceGroup(5004770);
                            boolean zChanged3 = composer.changed(validation_info);
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                Iterator<T> it = indicatorStateDto3.getValidation_info().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    IndicatorValidationInfoDto indicatorValidationInfoDto = (IndicatorValidationInfoDto) next;
                                    if (indicatorValidationInfoDto.getPrevents_calculation() && indicatorValidationInfoDto.getMessage() != null) {
                                        break;
                                    }
                                }
                                objRememberedValue4 = (IndicatorValidationInfoDto) next;
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            final IndicatorValidationInfoDto indicatorValidationInfoDto2 = (IndicatorValidationInfoDto) objRememberedValue4;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(1643597942);
                            if ((indicatorValidationInfoDto2 != null ? indicatorValidationInfoDto2.getMessage() : null) != null) {
                                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(2126048499, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i3) {
                                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2126048499, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:182)");
                                        }
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        String message = indicatorValidationInfoDto2.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i4 = BentoTheme.$stable;
                                        BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierFillMaxWidth$default, message, size24, null, null, null, bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU(), composer2, (BentoIcon4.Size24.$stable << 6) | 3078, 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), composer, 6);
                            }
                            composer.endReplaceGroup();
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            composer.startReplaceGroup(-1224400529);
                            boolean zChanged4 = composer.changed(snapshotState) | composer.changedInstance(bentoNumpadScopeV22) | composer.changed(function2) | composer.changedInstance(indicatorStateDto3) | composer.changedInstance(eventLogger) | composer.changedInstance(userInteractionEventDescriptor) | composer.changed(snapshotState2) | composer.changedInstance(immutableList) | composer.changed(function22) | composer.changedInstance(context) | composer.changed(function1) | composer.changedInstance(view) | composer.changed(function12);
                            Object objRememberedValue5 = composer.rememberedValue();
                            if (!zChanged4) {
                                modifier = modifierFillMaxSize$default;
                                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                }
                                composer.endReplaceGroup();
                                LazyDslKt.LazyColumn(modifier, null, null, false, null, null, null, false, null, (Function1) objRememberedValue5, composer, 6, 510);
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    return;
                                }
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            modifier = modifierFillMaxSize$default;
                            Object obj3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$19$lambda$18$lambda$17(bentoNumpadScopeV22, eventLogger, userInteractionEventDescriptor, indicatorStateDto3, immutableList, snapshotState, snapshotState4, function2, snapshotState2, function22, context, function1, view, function12, (LazyListScope) obj4);
                                }
                            };
                            composer.updateRememberedValue(obj3);
                            objRememberedValue5 = obj3;
                            composer.endReplaceGroup();
                            LazyDslKt.LazyColumn(modifier, null, null, false, null, null, null, false, null, (Function1) objRememberedValue5, composer, 6, 510);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$7$lambda$6(FocusManager focusManager, SnapshotState snapshotState) {
                            focusManager.clearFocus(true);
                            IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$3(snapshotState, Closed.INSTANCE);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$19$lambda$18$lambda$17(BentoNumpadScopeV22 bentoNumpadScopeV22, final EventLogger eventLogger, final UserInteractionEventDescriptor userInteractionEventDescriptor, final IndicatorStateDto indicatorStateDto, ImmutableList immutableList, SnapshotState snapshotState, final SnapshotState snapshotState2, final Function2 function2, final SnapshotState snapshotState3, final Function2 function22, final Context context, final Function1 function1, final View view, final Function1 function12, LazyListScope LazyColumn) {
                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                            if (!invoke$lambda$2(snapshotState).isEmpty()) {
                                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$IndicatorSettingsScreenKt.INSTANCE.m1788xb9ddba2e(), 3, null);
                                ParameterSettings.parameterSettings(LazyColumn, invoke$lambda$2(snapshotState), bentoNumpadScopeV22, new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$19$lambda$18$lambda$17$lambda$10(snapshotState2, (SettingsKeyboardState) obj);
                                    }
                                }, new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$19$lambda$18$lambda$17$lambda$11(function2, indicatorStateDto, (String) obj, (IndicatorParameterValue) obj2);
                                    }
                                }, eventLogger, userInteractionEventDescriptor, indicatorStateDto);
                            }
                            if (!invoke$lambda$5(snapshotState3).isEmpty()) {
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1722022533, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                                        invoke(lazyItemScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                                        Intrinsics.checkNotNullParameter(item, "$this$item");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1722022533, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:233)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i2 = BentoTheme.$stable;
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                        String strPluralStringResource = StringResources_androidKt.pluralStringResource(C10963R.plurals.indicator_settings_plot_title, IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$5(snapshotState3).size(), composer, 0);
                                        TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                                        BentoText2.m20747BentoText38GnDrw(strPluralStringResource, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8168);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 3, null);
                                PlotSettingsKt.plotSettings(LazyColumn, invoke$lambda$5(snapshotState3), new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$19$lambda$18$lambda$17$lambda$12(snapshotState2, (SettingsKeyboardState) obj);
                                    }
                                }, immutableList, new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$19$lambda$18$lambda$17$lambda$13(function22, indicatorStateDto, (String) obj, (LineValue) obj2);
                                    }
                                }, indicatorStateDto, eventLogger, userInteractionEventDescriptor);
                                for (final CustomIndicatorSectionDto customIndicatorSectionDto : indicatorStateDto.getAdditional_sections()) {
                                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-387324988, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$6$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                            invoke(lazyItemScope, composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                                            Intrinsics.checkNotNullParameter(item, "$this$item");
                                            if ((i & 17) == 16 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-387324988, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:269)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i2 = BentoTheme.$stable;
                                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 5, null);
                                            String title = customIndicatorSectionDto.getTitle();
                                            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                                            BentoText2.m20747BentoText38GnDrw(title, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8168);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), 3, null);
                                    ParameterSettings.parameterSettings(LazyColumn, customIndicatorSectionDto.getParameters(), bentoNumpadScopeV22, new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$19$lambda$18$lambda$17$lambda$16$lambda$14(snapshotState2, (SettingsKeyboardState) obj);
                                        }
                                    }, new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15(function2, indicatorStateDto, (String) obj, (IndicatorParameterValue) obj2);
                                        }
                                    }, eventLogger, userInteractionEventDescriptor, indicatorStateDto);
                                }
                            }
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-838236009, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7

                                /* compiled from: IndicatorSettingsScreen.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7$1 */
                                static final class C108411 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ Context $context;
                                    final /* synthetic */ IndicatorStateDto $indicator;
                                    final /* synthetic */ Function1<String, Unit> $onResetIndicator;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    C108411(Context context, Function1<? super String, Unit> function1, IndicatorStateDto indicatorStateDto) {
                                        this.$context = context;
                                        this.$onResetIndicator = function1;
                                        this.$indicator = indicatorStateDto;
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
                                            ComposerKt.traceEventStart(-2113629140, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:305)");
                                        }
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                        BentoButtonState bentoButtonState = new BentoButtonState(StringResources_androidKt.stringResource(C10963R.string.indicator_settings_reset_button, composer, 0), (BentoButtons.Icon.Size16) null, BentoButtons.Type.Secondary, false, false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2042, (DefaultConstructorMarker) null);
                                        composer.startReplaceGroup(-1746271574);
                                        boolean zChangedInstance = composer.changedInstance(this.$context) | composer.changed(this.$onResetIndicator) | composer.changedInstance(this.$indicator);
                                        final Context context = this.$context;
                                        final Function1<String, Unit> function1 = this.$onResetIndicator;
                                        final IndicatorStateDto indicatorStateDto = this.$indicator;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0091: CONSTRUCTOR (r8v3 'objRememberedValue' java.lang.Object) = 
                                                  (r4v6 'context' android.content.Context A[DONT_INLINE])
                                                  (r6v2 'function1' kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> A[DONT_INLINE])
                                                  (r7v2 'indicatorStateDto' black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto A[DONT_INLINE])
                                                 A[MD:(android.content.Context, kotlin.jvm.functions.Function1, black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto):void (m)] (LINE:314) call: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7$1$$ExternalSyntheticLambda0.<init>(android.content.Context, kotlin.jvm.functions.Function1, black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto):void type: CONSTRUCTOR in method: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes7.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 25 more
                                                */
                                            /*
                                                this = this;
                                                r0 = r20
                                                r5 = r21
                                                r1 = r22
                                                r2 = r1 & 3
                                                r3 = 2
                                                if (r2 != r3) goto L16
                                                boolean r2 = r5.getSkipping()
                                                if (r2 != 0) goto L12
                                                goto L16
                                            L12:
                                                r5.skipToGroupEnd()
                                                return
                                            L16:
                                                boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r2 == 0) goto L25
                                                r2 = -1
                                                java.lang.String r3 = "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:305)"
                                                r4 = -2113629140(0xffffffff8204942c, float:-9.740352E-38)
                                                androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
                                            L25:
                                                androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p011ui.Modifier.INSTANCE
                                                r2 = 1
                                                r3 = 0
                                                r4 = 0
                                                androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r1, r4, r2, r3)
                                                com.robinhood.compose.bento.theme.BentoTheme r1 = com.robinhood.compose.bento.theme.BentoTheme.INSTANCE
                                                int r2 = com.robinhood.compose.bento.theme.BentoTheme.$stable
                                                com.robinhood.compose.bento.theme.BentoSpacing r1 = r1.getSpacing(r5, r2)
                                                float r8 = r1.m21592getMediumD9Ej5fM()
                                                r11 = 13
                                                r12 = 0
                                                r7 = 0
                                                r9 = 0
                                                r10 = 0
                                                androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(r6, r7, r8, r9, r10, r11, r12)
                                                com.robinhood.compose.bento.component.BentoButtonState r1 = new com.robinhood.compose.bento.component.BentoButtonState
                                                int r2 = com.robinhood.android.chart.libblackwidowadvancedchart.C10963R.string.indicator_settings_reset_button
                                                r4 = 0
                                                java.lang.String r7 = androidx.compose.p011ui.res.StringResources_androidKt.stringResource(r2, r5, r4)
                                                com.robinhood.compose.bento.component.BentoButtons$Type r9 = com.robinhood.compose.bento.component.BentoButtons.Type.Secondary
                                                r18 = 2042(0x7fa, float:2.861E-42)
                                                r19 = 0
                                                r8 = 0
                                                r10 = 0
                                                r11 = 0
                                                r13 = 0
                                                r14 = 0
                                                r15 = 0
                                                r16 = 0
                                                r17 = 0
                                                r6 = r1
                                                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                                                r2 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
                                                r5.startReplaceGroup(r2)
                                                android.content.Context r2 = r0.$context
                                                boolean r2 = r5.changedInstance(r2)
                                                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r4 = r0.$onResetIndicator
                                                boolean r4 = r5.changed(r4)
                                                r2 = r2 | r4
                                                black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto r4 = r0.$indicator
                                                boolean r4 = r5.changedInstance(r4)
                                                r2 = r2 | r4
                                                android.content.Context r4 = r0.$context
                                                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r6 = r0.$onResetIndicator
                                                black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto r7 = r0.$indicator
                                                java.lang.Object r8 = r5.rememberedValue()
                                                if (r2 != 0) goto L8f
                                                androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.INSTANCE
                                                java.lang.Object r2 = r2.getEmpty()
                                                if (r8 != r2) goto L97
                                            L8f:
                                                com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7$1$$ExternalSyntheticLambda0 r8 = new com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7$1$$ExternalSyntheticLambda0
                                                r8.<init>(r4, r6, r7)
                                                r5.updateRememberedValue(r8)
                                            L97:
                                                r2 = r8
                                                kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                                                r5.endReplaceGroup()
                                                int r6 = com.robinhood.compose.bento.component.BentoButtonState.$stable
                                                r7 = 8
                                                r4 = 0
                                                com.robinhood.compose.bento.component.BentoButtonKt.BentoButton(r1, r2, r3, r4, r5, r6, r7)
                                                boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r1 == 0) goto Lae
                                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                                            Lae:
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7.C108411.invoke(androidx.compose.runtime.Composer, int):void");
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(Context context, Function1 function1, IndicatorStateDto indicatorStateDto) {
                                            HapticEvents.mediumHapticEvent(context);
                                            function1.invoke(indicatorStateDto.getUuid());
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                        invoke(lazyItemScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(item, "$this$item");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-838236009, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:304)");
                                        }
                                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2113629140, true, new C108411(context, function1, indicatorStateDto), composer, 54), composer, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 3, null);
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1257035136, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8

                                    /* compiled from: IndicatorSettingsScreen.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8$1 */
                                    static final class C108421 implements Function2<Composer, Integer, Unit> {
                                        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
                                        final /* synthetic */ EventLogger $eventLogger;
                                        final /* synthetic */ IndicatorStateDto $indicator;
                                        final /* synthetic */ Function1<IndicatorStateDto, Unit> $onDelete;
                                        final /* synthetic */ View $view;

                                        /* JADX WARN: Multi-variable type inference failed */
                                        C108421(View view, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, IndicatorStateDto indicatorStateDto, Function1<? super IndicatorStateDto, Unit> function1) {
                                            this.$view = view;
                                            this.$eventLogger = eventLogger;
                                            this.$eventDescriptor = userInteractionEventDescriptor;
                                            this.$indicator = indicatorStateDto;
                                            this.$onDelete = function1;
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
                                                ComposerKt.traceEventStart(-330084395, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:322)");
                                            }
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i2 = BentoTheme.$stable;
                                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                            String strStringResource = StringResources_androidKt.stringResource(C10963R.string.indicator_bottom_sheet_delete, composer, 0);
                                            BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
                                            long jM21452getNegative0d7_KjU = bentoTheme.getColors(composer, i2).m21452getNegative0d7_KjU();
                                            BentoButtonState bentoButtonState = new BentoButtonState(strStringResource, (BentoButtons.Icon.Size16) null, type2, false, false, Color.m6701boximpl(jM21371getBg0d7_KjU), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21452getNegative0d7_KjU()), Color.m6701boximpl(jM21452getNegative0d7_KjU), (TextStyle) null, (Color) null, false, 1818, (DefaultConstructorMarker) null);
                                            composer.startReplaceGroup(-1224400529);
                                            boolean zChangedInstance = composer.changedInstance(this.$view) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$indicator) | composer.changed(this.$onDelete);
                                            final View view = this.$view;
                                            final EventLogger eventLogger = this.$eventLogger;
                                            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                                            final IndicatorStateDto indicatorStateDto = this.$indicator;
                                            final Function1<IndicatorStateDto, Unit> function1 = this.$onDelete;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                Function0 function0 = 
                                                /*  JADX ERROR: Method code generation error
                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c7: CONSTRUCTOR (r6v3 'function0' kotlin.jvm.functions.Function0) = 
                                                      (r7v2 'view' android.view.View A[DONT_INLINE])
                                                      (r8v2 'eventLogger' com.robinhood.analytics.EventLogger A[DONT_INLINE])
                                                      (r9v2 'userInteractionEventDescriptor' com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor A[DONT_INLINE])
                                                      (r10v2 'indicatorStateDto' black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto A[DONT_INLINE])
                                                      (r11v3 'function1' kotlin.jvm.functions.Function1<black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto, kotlin.Unit> A[DONT_INLINE])
                                                     A[DECLARE_VAR, MD:(android.view.View, com.robinhood.analytics.EventLogger, com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor, black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto, kotlin.jvm.functions.Function1):void (m)] (LINE:334) call: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8$1$$ExternalSyntheticLambda0.<init>(android.view.View, com.robinhood.analytics.EventLogger, com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor, black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR in method: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes7.dex
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                    	... 25 more
                                                    */
                                                /*
                                                    this = this;
                                                    r0 = r21
                                                    r5 = r22
                                                    r1 = r23
                                                    r2 = r1 & 3
                                                    r3 = 2
                                                    if (r2 != r3) goto L16
                                                    boolean r2 = r5.getSkipping()
                                                    if (r2 != 0) goto L12
                                                    goto L16
                                                L12:
                                                    r5.skipToGroupEnd()
                                                    return
                                                L16:
                                                    boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                    if (r2 == 0) goto L25
                                                    r2 = -1
                                                    java.lang.String r3 = "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:322)"
                                                    r4 = -330084395(0xffffffffec534fd5, float:-1.0218414E27)
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
                                                L25:
                                                    androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p011ui.Modifier.INSTANCE
                                                    r2 = 1
                                                    r3 = 0
                                                    r4 = 0
                                                    androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r1, r4, r2, r3)
                                                    com.robinhood.compose.bento.theme.BentoTheme r1 = com.robinhood.compose.bento.theme.BentoTheme.INSTANCE
                                                    int r2 = com.robinhood.compose.bento.theme.BentoTheme.$stable
                                                    com.robinhood.compose.bento.theme.BentoSpacing r3 = r1.getSpacing(r5, r2)
                                                    float r8 = r3.m21593getSmallD9Ej5fM()
                                                    r11 = 13
                                                    r12 = 0
                                                    r7 = 0
                                                    r9 = 0
                                                    r10 = 0
                                                    androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(r6, r7, r8, r9, r10, r11, r12)
                                                    int r4 = com.robinhood.android.chart.libblackwidowadvancedchart.C10963R.string.indicator_bottom_sheet_delete
                                                    r6 = 0
                                                    java.lang.String r8 = androidx.compose.p011ui.res.StringResources_androidKt.stringResource(r4, r5, r6)
                                                    com.robinhood.compose.bento.component.BentoButtons$Type r10 = com.robinhood.compose.bento.component.BentoButtons.Type.Secondary
                                                    com.robinhood.compose.bento.theme.BentoColors r4 = r1.getColors(r5, r2)
                                                    long r6 = r4.m21371getBg0d7_KjU()
                                                    com.robinhood.compose.bento.theme.BentoColors r4 = r1.getColors(r5, r2)
                                                    long r11 = r4.m21452getNegative0d7_KjU()
                                                    com.robinhood.compose.bento.theme.BentoColors r1 = r1.getColors(r5, r2)
                                                    long r1 = r1.m21452getNegative0d7_KjU()
                                                    r13 = r6
                                                    com.robinhood.compose.bento.component.BentoButtonState r7 = new com.robinhood.compose.bento.component.BentoButtonState
                                                    androidx.compose.ui.graphics.Color r13 = androidx.compose.p011ui.graphics.Color.m6701boximpl(r13)
                                                    androidx.compose.ui.graphics.Color r14 = androidx.compose.p011ui.graphics.Color.m6701boximpl(r1)
                                                    androidx.compose.ui.graphics.Color r15 = androidx.compose.p011ui.graphics.Color.m6701boximpl(r11)
                                                    r19 = 1818(0x71a, float:2.548E-42)
                                                    r20 = 0
                                                    r9 = 0
                                                    r11 = 0
                                                    r12 = 0
                                                    r16 = 0
                                                    r17 = 0
                                                    r18 = 0
                                                    r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                                                    r1 = r7
                                                    r2 = -1224400529(0xffffffffb705216f, float:-7.935202E-6)
                                                    r5.startReplaceGroup(r2)
                                                    android.view.View r2 = r0.$view
                                                    boolean r2 = r5.changedInstance(r2)
                                                    com.robinhood.analytics.EventLogger r4 = r0.$eventLogger
                                                    boolean r4 = r5.changedInstance(r4)
                                                    r2 = r2 | r4
                                                    com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor r4 = r0.$eventDescriptor
                                                    boolean r4 = r5.changedInstance(r4)
                                                    r2 = r2 | r4
                                                    black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto r4 = r0.$indicator
                                                    boolean r4 = r5.changedInstance(r4)
                                                    r2 = r2 | r4
                                                    kotlin.jvm.functions.Function1<black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto, kotlin.Unit> r4 = r0.$onDelete
                                                    boolean r4 = r5.changed(r4)
                                                    r2 = r2 | r4
                                                    android.view.View r7 = r0.$view
                                                    com.robinhood.analytics.EventLogger r8 = r0.$eventLogger
                                                    com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor r9 = r0.$eventDescriptor
                                                    black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto r10 = r0.$indicator
                                                    kotlin.jvm.functions.Function1<black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto, kotlin.Unit> r11 = r0.$onDelete
                                                    java.lang.Object r4 = r5.rememberedValue()
                                                    if (r2 != 0) goto Lc5
                                                    androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.INSTANCE
                                                    java.lang.Object r2 = r2.getEmpty()
                                                    if (r4 != r2) goto Lce
                                                Lc5:
                                                    com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8$1$$ExternalSyntheticLambda0 r6 = new com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8$1$$ExternalSyntheticLambda0
                                                    r6.<init>(r7, r8, r9, r10, r11)
                                                    r5.updateRememberedValue(r6)
                                                    r4 = r6
                                                Lce:
                                                    r2 = r4
                                                    kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                                                    r5.endReplaceGroup()
                                                    int r6 = com.robinhood.compose.bento.component.BentoButtonState.$stable
                                                    r7 = 8
                                                    r4 = 0
                                                    com.robinhood.compose.bento.component.BentoButtonKt.BentoButton(r1, r2, r3, r4, r5, r6, r7)
                                                    boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                    if (r1 == 0) goto Le5
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                                Le5:
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8.C108421.invoke(androidx.compose.runtime.Composer, int):void");
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final Unit invoke$lambda$1$lambda$0(View view, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, IndicatorStateDto indicatorStateDto, Function1 function1) {
                                                HapticEvents.onRejectHapticEvent(view);
                                                EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.DELETE_BUTTON, IndicatorSettingsScreenKt.INDICATOR_SETTINGS_SCREEN, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, indicatorStateDto.getId(), null, null, null, 0.0d, null, null, 32511, null).getContext(), false, 41, null);
                                                function1.invoke(indicatorStateDto);
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                            invoke(lazyItemScope, composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                                            Intrinsics.checkNotNullParameter(item, "$this$item");
                                            if ((i & 17) == 16 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1257035136, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:321)");
                                            }
                                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-330084395, true, new C108421(view, eventLogger, userInteractionEventDescriptor, indicatorStateDto, function12), composer, 54), composer, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), 3, null);
                                    LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$IndicatorSettingsScreenKt.INSTANCE.m1791x79b6d006(), 3, null);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$10(SnapshotState snapshotState, SettingsKeyboardState it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$3(snapshotState, it);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$11(Function2 function2, IndicatorStateDto indicatorStateDto, String id, IndicatorParameterValue value) {
                                    Intrinsics.checkNotNullParameter(id, "id");
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    function2.invoke(indicatorStateDto.getUuid(), new EditIndicatorParameterAction(id, value, null, 4, null));
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$12(SnapshotState snapshotState, SettingsKeyboardState it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$3(snapshotState, it);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$13(Function2 function2, IndicatorStateDto indicatorStateDto, String id, LineValue value) {
                                    Intrinsics.checkNotNullParameter(id, "id");
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    function2.invoke(indicatorStateDto.getUuid(), new EditIndicatorLineAction(id, value, null, 4, null));
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$16$lambda$14(SnapshotState snapshotState, SettingsKeyboardState it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$3(snapshotState, it);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15(Function2 function2, IndicatorStateDto indicatorStateDto, String id, IndicatorParameterValue value) {
                                    Intrinsics.checkNotNullParameter(id, "id");
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    function2.invoke(indicatorStateDto.getUuid(), new EditIndicatorParameterAction(id, value, null, 4, null));
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoNumpadScopeV2 bentoNumpadScopeV2, Composer composer3, Integer num) {
                                invoke(bentoNumpadScopeV2, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoNumpadScopeV2 BentoNumpadScreenLayoutV2, Composer composer3, int i5) {
                                Intrinsics.checkNotNullParameter(BentoNumpadScreenLayoutV2, "$this$BentoNumpadScreenLayoutV2");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-26440013, i5, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous> (IndicatorSettingsScreen.kt:123)");
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i6 = BentoTheme.$stable;
                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, ComposableLambda3.rememberComposableLambda(243172215, true, new AnonymousClass1(focusManager, current, userInteractionEventDescriptor, indicator, onBackPressed), composer3, 54), null, null, null, 0, bentoTheme.getColors(composer3, i6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-1779049918, true, new AnonymousClass2(indicator, focusManager, snapshotState, current, userInteractionEventDescriptor, bentoNumpadScopeV223, onParameterUpdated, availableColorPickerColors, onPlotUpdated, context, onResetIndicator, view, onDelete), composer3, 54), composer3, 805306416, 316);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: IndicatorSettingsScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
                                final /* synthetic */ EventLogger $eventLogger;
                                final /* synthetic */ FocusManager $focusManager;
                                final /* synthetic */ IndicatorStateDto $indicator;
                                final /* synthetic */ Function0<Unit> $onBackPressed;

                                AnonymousClass1(FocusManager focusManager, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, IndicatorStateDto indicatorStateDto, Function0<Unit> function0) {
                                    this.$focusManager = focusManager;
                                    this.$eventLogger = eventLogger;
                                    this.$eventDescriptor = userInteractionEventDescriptor;
                                    this.$indicator = indicatorStateDto;
                                    this.$onBackPressed = function0;
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
                                        ComposerKt.traceEventStart(243172215, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:128)");
                                    }
                                    FocusManager focusManager = this.$focusManager;
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$indicator) | composer.changed(this.$onBackPressed);
                                    final EventLogger eventLogger = this.$eventLogger;
                                    final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                                    final IndicatorStateDto indicatorStateDto = this.$indicator;
                                    final Function0<Unit> function0 = this.$onBackPressed;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return IndicatorSettingsScreenKt.C108401.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, indicatorStateDto, function0);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    IndicatorSettingsScreenKt.IndicatorSettingsTopBar(focusManager, (Function0) objRememberedValue, composer, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, IndicatorStateDto indicatorStateDto, Function0 function0) {
                                    EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BACK_BUTTON, IndicatorSettingsScreenKt.INDICATOR_SETTINGS_SCREEN, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, indicatorStateDto.getId(), null, null, null, 0.0d, null, null, 32511, null).getContext(), false, 41, null);
                                    function0.invoke();
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer2, 54), Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), null, ComposableLambda3.rememberComposableLambda(-717983280, true, new Function3<BentoNumpadScopeV2, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt.IndicatorSettingsScreen.2

                            /* compiled from: IndicatorSettingsScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$2$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ FocusManager $focusManager;
                                final /* synthetic */ SnapshotState<SettingsKeyboardState> $keyboardState$delegate;
                                final /* synthetic */ BentoNumpadScopeV22 $numpadScope;

                                AnonymousClass1(SnapshotState<SettingsKeyboardState> snapshotState, BentoNumpadScopeV22 bentoNumpadScopeV22, FocusManager focusManager) {
                                    this.$keyboardState$delegate = snapshotState;
                                    this.$numpadScope = bentoNumpadScopeV22;
                                    this.$focusManager = focusManager;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final int invoke$lambda$1$lambda$0(int i) {
                                    return i;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final int invoke$lambda$3$lambda$2(int i) {
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
                                        ComposerKt.traceEventStart(1066375323, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:358)");
                                    }
                                    boolean z = !Intrinsics.areEqual(IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$2(this.$keyboardState$delegate), Closed.INSTANCE);
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composer.rememberedValue();
                                    Composer.Companion companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$2$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return Integer.valueOf(IndicatorSettingsScreenKt.C108432.AnonymousClass1.invoke$lambda$1$lambda$0(((Integer) obj).intValue()));
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    EnterTransition enterTransitionSlideInVertically$default = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue, 1, null);
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (objRememberedValue2 == companion.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$2$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return Integer.valueOf(IndicatorSettingsScreenKt.C108432.AnonymousClass1.invoke$lambda$3$lambda$2(((Integer) obj).intValue()));
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, enterTransitionSlideInVertically$default, EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue2, 1, null), (String) null, ComposableLambda3.rememberComposableLambda(-1170205325, true, new AnonymousClass3(this.$numpadScope, this.$focusManager, this.$keyboardState$delegate), composer, 54), composer, 200064, 18);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: IndicatorSettingsScreen.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$2$1$3, reason: invalid class name */
                                static final class AnonymousClass3 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                                    final /* synthetic */ FocusManager $focusManager;
                                    final /* synthetic */ SnapshotState<SettingsKeyboardState> $keyboardState$delegate;
                                    final /* synthetic */ BentoNumpadScopeV22 $numpadScope;

                                    AnonymousClass3(BentoNumpadScopeV22 bentoNumpadScopeV22, FocusManager focusManager, SnapshotState<SettingsKeyboardState> snapshotState) {
                                        this.$numpadScope = bentoNumpadScopeV22;
                                        this.$focusManager = focusManager;
                                        this.$keyboardState$delegate = snapshotState;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                        invoke(animatedVisibilityScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                                        CustomKeyConfig customKeyConfig;
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1170205325, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:363)");
                                        }
                                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                                        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
                                        composer.startReplaceGroup(714129115);
                                        if (IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$2(this.$keyboardState$delegate).getShowMinusSign()) {
                                            composer.startReplaceGroup(5004770);
                                            boolean zChangedInstance = composer.changedInstance(this.$numpadScope);
                                            final BentoNumpadScopeV22 bentoNumpadScopeV22 = this.$numpadScope;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$2$1$3$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return IndicatorSettingsScreenKt.C108432.AnonymousClass1.AnonymousClass3.invoke$lambda$1$lambda$0(bentoNumpadScopeV22);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            customKeyConfig = new CustomKeyConfig("-", null, 0, null, (Function0) objRememberedValue, 14, null);
                                        } else {
                                            customKeyConfig = null;
                                        }
                                        CustomKeyConfig customKeyConfig2 = customKeyConfig;
                                        composer.endReplaceGroup();
                                        boolean showDelimiter = IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$2(this.$keyboardState$delegate).getShowDelimiter();
                                        BentoNumpadScopeV22 bentoNumpadScopeV222 = this.$numpadScope;
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance2 = composer.changedInstance(this.$focusManager);
                                        final FocusManager focusManager = this.$focusManager;
                                        final SnapshotState<SettingsKeyboardState> snapshotState = this.$keyboardState$delegate;
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$2$1$3$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return IndicatorSettingsScreenKt.C108432.AnonymousClass1.AnonymousClass3.invoke$lambda$3$lambda$2(focusManager, snapshotState);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        bentoNumpadScopeV222.BentoNumpadWithButton(strStringResource, (Function0) objRememberedValue2, modifierM4872backgroundbw27NRU$default, false, false, false, false, showDelimiter, false, customKeyConfig2, false, composer, CustomKeyConfig.$stable << 27, BentoNumpadScopeV22.$stable << 3, 1400);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(FocusManager focusManager, SnapshotState snapshotState) {
                                        focusManager.clearFocus(true);
                                        IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$3(snapshotState, Closed.INSTANCE);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(BentoNumpadScopeV22 bentoNumpadScopeV22) {
                                        bentoNumpadScopeV22.onKeyPress(new KeyEvent(new KeyEvent(0, 69)));
                                        return Unit.INSTANCE;
                                    }
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoNumpadScopeV2 bentoNumpadScopeV2, Composer composer3, Integer num) {
                                invoke(bentoNumpadScopeV2, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoNumpadScopeV2 BentoNumpadScreenLayoutV2, Composer composer3, int i5) {
                                Intrinsics.checkNotNullParameter(BentoNumpadScreenLayoutV2, "$this$BentoNumpadScreenLayoutV2");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-717983280, i5, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous> (IndicatorSettingsScreen.kt:357)");
                                }
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1066375323, true, new AnonymousClass1(snapshotState, bentoNumpadScopeV223, focusManager), composer3, 54), composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, BentoNumpadScopeV22.$stable | 24624, 4);
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
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$4(indicator, availableColorPickerColors, onBackPressed, onDelete, onParameterUpdated, onPlotUpdated, onResetIndicator, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 12582912;
                modifier2 = modifier;
                if ((4793491 & i3) == 4793490) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final View view2 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    final FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    BentoNumpadScopeV22 bentoNumpadScopeV2222 = (BentoNumpadScopeV22) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 != companion.getEmpty()) {
                    }
                    final SnapshotState<SettingsKeyboardState> snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    final Modifier modifier52 = modifier4;
                    final BentoNumpadScopeV22 bentoNumpadScopeV2232 = bentoNumpadScopeV22;
                    BentoNumpadScreenLayoutV2.BentoNumpadScreenLayoutV2(bentoNumpadScopeV2232, ComposableLambda3.rememberComposableLambda(-26440013, true, new Function3<BentoNumpadScopeV2, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt.IndicatorSettingsScreen.1

                        /* compiled from: IndicatorSettingsScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ ImmutableList<ThemedColorDto> $availableColorPickerColors;
                            final /* synthetic */ Context $context;
                            final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
                            final /* synthetic */ EventLogger $eventLogger;
                            final /* synthetic */ FocusManager $focusManager;
                            final /* synthetic */ IndicatorStateDto $indicator;
                            final /* synthetic */ SnapshotState<SettingsKeyboardState> $keyboardState$delegate;
                            final /* synthetic */ BentoNumpadScopeV22 $numpadScope;
                            final /* synthetic */ Function1<IndicatorStateDto, Unit> $onDelete;
                            final /* synthetic */ Function2<String, EditIndicatorParameterAction, Unit> $onParameterUpdated;
                            final /* synthetic */ Function2<String, EditIndicatorLineAction, Unit> $onPlotUpdated;
                            final /* synthetic */ Function1<String, Unit> $onResetIndicator;
                            final /* synthetic */ View $view;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass2(IndicatorStateDto indicatorStateDto, FocusManager focusManager, SnapshotState<SettingsKeyboardState> snapshotState, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, BentoNumpadScopeV22 bentoNumpadScopeV22, Function2<? super String, ? super EditIndicatorParameterAction, Unit> function2, ImmutableList<ThemedColorDto> immutableList, Function2<? super String, ? super EditIndicatorLineAction, Unit> function22, Context context, Function1<? super String, Unit> function1, View view, Function1<? super IndicatorStateDto, Unit> function12) {
                                this.$indicator = indicatorStateDto;
                                this.$focusManager = focusManager;
                                this.$keyboardState$delegate = snapshotState;
                                this.$eventLogger = eventLogger;
                                this.$eventDescriptor = userInteractionEventDescriptor;
                                this.$numpadScope = bentoNumpadScopeV22;
                                this.$onParameterUpdated = function2;
                                this.$availableColorPickerColors = immutableList;
                                this.$onPlotUpdated = function22;
                                this.$context = context;
                                this.$onResetIndicator = function1;
                                this.$view = view;
                                this.$onDelete = function12;
                            }

                            private static final List<IndicatorParameterDto> invoke$lambda$2(SnapshotState<List<IndicatorParameterDto>> snapshotState) {
                                return snapshotState.getValue();
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final List<IndicatorLineDto> invoke$lambda$5(SnapshotState<List<IndicatorLineDto>> snapshotState) {
                                return snapshotState.getValue();
                            }

                            /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:89:0x02ec  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                Object next;
                                Modifier modifier;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                int i2 = (i & 6) == 0 ? i | (composer.changed(paddingValues) ? 4 : 2) : i;
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1779049918, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:146)");
                                }
                                composer.startReplaceGroup(5004770);
                                boolean zChanged = composer.changed(this.$indicator);
                                IndicatorStateDto indicatorStateDto = this.$indicator;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    List<IndicatorParameterDto> parameters = indicatorStateDto.getParameters();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : parameters) {
                                        if (!Intrinsics.areEqual(((IndicatorParameterDto) obj).getVisible(), Boolean.FALSE)) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    objRememberedValue = SnapshotState3.mutableStateOf$default(arrayList, null, 2, null);
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(5004770);
                                boolean zChanged2 = composer.changed(this.$indicator);
                                IndicatorStateDto indicatorStateDto2 = this.$indicator;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    List<IndicatorLineDto> lines = indicatorStateDto2.getLines();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj2 : lines) {
                                        if (!((IndicatorLineDto) obj2).is_plot_hidden()) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(arrayList2, null, 2, null);
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                                composer.endReplaceGroup();
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(this.$focusManager);
                                final FocusManager focusManager = this.$focusManager;
                                final SnapshotState snapshotState3 = this.$keyboardState$delegate;
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$7$lambda$6(focusManager, snapshotState3);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                composer.endReplaceGroup();
                                Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, (Function0) objRememberedValue3, 28, null);
                                final IndicatorStateDto indicatorStateDto3 = this.$indicator;
                                final EventLogger eventLogger = this.$eventLogger;
                                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                                final BentoNumpadScopeV22 bentoNumpadScopeV22 = this.$numpadScope;
                                final Function2 function2 = this.$onParameterUpdated;
                                final ImmutableList immutableList = this.$availableColorPickerColors;
                                final Function2 function22 = this.$onPlotUpdated;
                                final Context context = this.$context;
                                final Function1 function1 = this.$onResetIndicator;
                                final View view = this.$view;
                                final Function1 function12 = this.$onDelete;
                                final SnapshotState snapshotState4 = this.$keyboardState$delegate;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4891clickableO2vRcR0$default);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                IndicatorSettingsScreenKt.IndicatorSettingsTitle(indicatorStateDto3, eventLogger, userInteractionEventDescriptor, composer, 0);
                                Object validation_info = indicatorStateDto3.getValidation_info();
                                composer.startReplaceGroup(5004770);
                                boolean zChanged3 = composer.changed(validation_info);
                                Object objRememberedValue4 = composer.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    Iterator<T> it = indicatorStateDto3.getValidation_info().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        IndicatorValidationInfoDto indicatorValidationInfoDto = (IndicatorValidationInfoDto) next;
                                        if (indicatorValidationInfoDto.getPrevents_calculation() && indicatorValidationInfoDto.getMessage() != null) {
                                            break;
                                        }
                                    }
                                    objRememberedValue4 = (IndicatorValidationInfoDto) next;
                                    composer.updateRememberedValue(objRememberedValue4);
                                }
                                final IndicatorValidationInfoDto indicatorValidationInfoDto2 = (IndicatorValidationInfoDto) objRememberedValue4;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(1643597942);
                                if ((indicatorValidationInfoDto2 != null ? indicatorValidationInfoDto2.getMessage() : null) != null) {
                                    BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(2126048499, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i3) {
                                            if ((i3 & 3) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2126048499, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:182)");
                                            }
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            String message = indicatorValidationInfoDto2.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i4 = BentoTheme.$stable;
                                            BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierFillMaxWidth$default, message, size24, null, null, null, bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU(), composer2, (BentoIcon4.Size24.$stable << 6) | 3078, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer, 54), composer, 6);
                                }
                                composer.endReplaceGroup();
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                composer.startReplaceGroup(-1224400529);
                                boolean zChanged4 = composer.changed(snapshotState) | composer.changedInstance(bentoNumpadScopeV22) | composer.changed(function2) | composer.changedInstance(indicatorStateDto3) | composer.changedInstance(eventLogger) | composer.changedInstance(userInteractionEventDescriptor) | composer.changed(snapshotState2) | composer.changedInstance(immutableList) | composer.changed(function22) | composer.changedInstance(context) | composer.changed(function1) | composer.changedInstance(view) | composer.changed(function12);
                                Object objRememberedValue5 = composer.rememberedValue();
                                if (!zChanged4) {
                                    modifier = modifierFillMaxSize$default;
                                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    composer.endReplaceGroup();
                                    LazyDslKt.LazyColumn(modifier, null, null, false, null, null, null, false, null, (Function1) objRememberedValue5, composer, 6, 510);
                                    composer.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        return;
                                    }
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                modifier = modifierFillMaxSize$default;
                                Object obj3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$19$lambda$18$lambda$17(bentoNumpadScopeV22, eventLogger, userInteractionEventDescriptor, indicatorStateDto3, immutableList, snapshotState, snapshotState4, function2, snapshotState2, function22, context, function1, view, function12, (LazyListScope) obj4);
                                    }
                                };
                                composer.updateRememberedValue(obj3);
                                objRememberedValue5 = obj3;
                                composer.endReplaceGroup();
                                LazyDslKt.LazyColumn(modifier, null, null, false, null, null, null, false, null, (Function1) objRememberedValue5, composer, 6, 510);
                                composer.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$7$lambda$6(FocusManager focusManager, SnapshotState snapshotState) {
                                focusManager.clearFocus(true);
                                IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$3(snapshotState, Closed.INSTANCE);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$19$lambda$18$lambda$17(BentoNumpadScopeV22 bentoNumpadScopeV22, final EventLogger eventLogger, final UserInteractionEventDescriptor userInteractionEventDescriptor, final IndicatorStateDto indicatorStateDto, ImmutableList immutableList, SnapshotState snapshotState, final SnapshotState snapshotState2, final Function2 function2, final SnapshotState<List<IndicatorLineDto>> snapshotState3, final Function2 function22, final Context context, final Function1<? super String, Unit> function1, final View view, final Function1<? super IndicatorStateDto, Unit> function12, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                if (!invoke$lambda$2(snapshotState).isEmpty()) {
                                    LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$IndicatorSettingsScreenKt.INSTANCE.m1788xb9ddba2e(), 3, null);
                                    ParameterSettings.parameterSettings(LazyColumn, invoke$lambda$2(snapshotState), bentoNumpadScopeV22, new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$19$lambda$18$lambda$17$lambda$10(snapshotState2, (SettingsKeyboardState) obj);
                                        }
                                    }, new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$19$lambda$18$lambda$17$lambda$11(function2, indicatorStateDto, (String) obj, (IndicatorParameterValue) obj2);
                                        }
                                    }, eventLogger, userInteractionEventDescriptor, indicatorStateDto);
                                }
                                if (!invoke$lambda$5(snapshotState3).isEmpty()) {
                                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1722022533, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$3
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                                            invoke(lazyItemScope, composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                                            Intrinsics.checkNotNullParameter(item, "$this$item");
                                            if ((i & 17) == 16 && composer.getSkipping()) {
                                                composer.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1722022533, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:233)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i2 = BentoTheme.$stable;
                                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                            String strPluralStringResource = StringResources_androidKt.pluralStringResource(C10963R.plurals.indicator_settings_plot_title, IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$5(snapshotState3).size(), composer, 0);
                                            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                                            BentoText2.m20747BentoText38GnDrw(strPluralStringResource, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8168);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), 3, null);
                                    PlotSettingsKt.plotSettings(LazyColumn, invoke$lambda$5(snapshotState3), new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$19$lambda$18$lambda$17$lambda$12(snapshotState2, (SettingsKeyboardState) obj);
                                        }
                                    }, immutableList, new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$19$lambda$18$lambda$17$lambda$13(function22, indicatorStateDto, (String) obj, (LineValue) obj2);
                                        }
                                    }, indicatorStateDto, eventLogger, userInteractionEventDescriptor);
                                    for (final CustomIndicatorSectionDto customIndicatorSectionDto : indicatorStateDto.getAdditional_sections()) {
                                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-387324988, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$6$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                invoke(lazyItemScope, composer, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(LazyItemScope item, Composer composer, int i) {
                                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                                if ((i & 17) == 16 && composer.getSkipping()) {
                                                    composer.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-387324988, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:269)");
                                                }
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i2 = BentoTheme.$stable;
                                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 5, null);
                                                String title = customIndicatorSectionDto.getTitle();
                                                TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                                                BentoText2.m20747BentoText38GnDrw(title, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8168);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 3, null);
                                        ParameterSettings.parameterSettings(LazyColumn, customIndicatorSectionDto.getParameters(), bentoNumpadScopeV22, new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$19$lambda$18$lambda$17$lambda$16$lambda$14(snapshotState2, (SettingsKeyboardState) obj);
                                            }
                                        }, new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return IndicatorSettingsScreenKt.C108401.AnonymousClass2.invoke$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15(function2, indicatorStateDto, (String) obj, (IndicatorParameterValue) obj2);
                                            }
                                        }, eventLogger, userInteractionEventDescriptor, indicatorStateDto);
                                    }
                                }
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-838236009, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7

                                    /* compiled from: IndicatorSettingsScreen.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7$1 */
                                    static final class C108411 implements Function2<Composer, Integer, Unit> {
                                        final /* synthetic */ Context $context;
                                        final /* synthetic */ IndicatorStateDto $indicator;
                                        final /* synthetic */ Function1<String, Unit> $onResetIndicator;

                                        /* JADX WARN: Multi-variable type inference failed */
                                        C108411(Context context, Function1<? super String, Unit> function1, IndicatorStateDto indicatorStateDto) {
                                            this.$context = context;
                                            this.$onResetIndicator = function1;
                                            this.$indicator = indicatorStateDto;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                            invoke(composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0091: CONSTRUCTOR (r8v3 'objRememberedValue' java.lang.Object) = 
                                              (r4v6 'context' android.content.Context A[DONT_INLINE])
                                              (r6v2 'function1' kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> A[DONT_INLINE])
                                              (r7v2 'indicatorStateDto' black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto A[DONT_INLINE])
                                             A[MD:(android.content.Context, kotlin.jvm.functions.Function1, black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto):void (m)] (LINE:314) call: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7$1$$ExternalSyntheticLambda0.<init>(android.content.Context, kotlin.jvm.functions.Function1, black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto):void type: CONSTRUCTOR in method: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes7.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 20 more
                                            */
                                        public final void invoke(androidx.compose.runtime.Composer r21, int r22) {
                                            /*
                                                r20 = this;
                                                r0 = r20
                                                r5 = r21
                                                r1 = r22
                                                r2 = r1 & 3
                                                r3 = 2
                                                if (r2 != r3) goto L16
                                                boolean r2 = r5.getSkipping()
                                                if (r2 != 0) goto L12
                                                goto L16
                                            L12:
                                                r5.skipToGroupEnd()
                                                return
                                            L16:
                                                boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r2 == 0) goto L25
                                                r2 = -1
                                                java.lang.String r3 = "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:305)"
                                                r4 = -2113629140(0xffffffff8204942c, float:-9.740352E-38)
                                                androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
                                            L25:
                                                androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p011ui.Modifier.INSTANCE
                                                r2 = 1
                                                r3 = 0
                                                r4 = 0
                                                androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r1, r4, r2, r3)
                                                com.robinhood.compose.bento.theme.BentoTheme r1 = com.robinhood.compose.bento.theme.BentoTheme.INSTANCE
                                                int r2 = com.robinhood.compose.bento.theme.BentoTheme.$stable
                                                com.robinhood.compose.bento.theme.BentoSpacing r1 = r1.getSpacing(r5, r2)
                                                float r8 = r1.m21592getMediumD9Ej5fM()
                                                r11 = 13
                                                r12 = 0
                                                r7 = 0
                                                r9 = 0
                                                r10 = 0
                                                androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(r6, r7, r8, r9, r10, r11, r12)
                                                com.robinhood.compose.bento.component.BentoButtonState r1 = new com.robinhood.compose.bento.component.BentoButtonState
                                                int r2 = com.robinhood.android.chart.libblackwidowadvancedchart.C10963R.string.indicator_settings_reset_button
                                                r4 = 0
                                                java.lang.String r7 = androidx.compose.p011ui.res.StringResources_androidKt.stringResource(r2, r5, r4)
                                                com.robinhood.compose.bento.component.BentoButtons$Type r9 = com.robinhood.compose.bento.component.BentoButtons.Type.Secondary
                                                r18 = 2042(0x7fa, float:2.861E-42)
                                                r19 = 0
                                                r8 = 0
                                                r10 = 0
                                                r11 = 0
                                                r13 = 0
                                                r14 = 0
                                                r15 = 0
                                                r16 = 0
                                                r17 = 0
                                                r6 = r1
                                                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                                                r2 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
                                                r5.startReplaceGroup(r2)
                                                android.content.Context r2 = r0.$context
                                                boolean r2 = r5.changedInstance(r2)
                                                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r4 = r0.$onResetIndicator
                                                boolean r4 = r5.changed(r4)
                                                r2 = r2 | r4
                                                black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto r4 = r0.$indicator
                                                boolean r4 = r5.changedInstance(r4)
                                                r2 = r2 | r4
                                                android.content.Context r4 = r0.$context
                                                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r6 = r0.$onResetIndicator
                                                black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto r7 = r0.$indicator
                                                java.lang.Object r8 = r5.rememberedValue()
                                                if (r2 != 0) goto L8f
                                                androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.INSTANCE
                                                java.lang.Object r2 = r2.getEmpty()
                                                if (r8 != r2) goto L97
                                            L8f:
                                                com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7$1$$ExternalSyntheticLambda0 r8 = new com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7$1$$ExternalSyntheticLambda0
                                                r8.<init>(r4, r6, r7)
                                                r5.updateRememberedValue(r8)
                                            L97:
                                                r2 = r8
                                                kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                                                r5.endReplaceGroup()
                                                int r6 = com.robinhood.compose.bento.component.BentoButtonState.$stable
                                                r7 = 8
                                                r4 = 0
                                                com.robinhood.compose.bento.component.BentoButtonKt.BentoButton(r1, r2, r3, r4, r5, r6, r7)
                                                boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r1 == 0) goto Lae
                                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                                            Lae:
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$7.C108411.invoke(androidx.compose.runtime.Composer, int):void");
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(Context context, Function1 function1, IndicatorStateDto indicatorStateDto) {
                                            HapticEvents.mediumHapticEvent(context);
                                            function1.invoke(indicatorStateDto.getUuid());
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                        invoke(lazyItemScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(item, "$this$item");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-838236009, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:304)");
                                        }
                                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2113629140, true, new C108411(context, function1, indicatorStateDto), composer, 54), composer, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 3, null);
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1257035136, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8

                                    /* compiled from: IndicatorSettingsScreen.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8$1 */
                                    static final class C108421 implements Function2<Composer, Integer, Unit> {
                                        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
                                        final /* synthetic */ EventLogger $eventLogger;
                                        final /* synthetic */ IndicatorStateDto $indicator;
                                        final /* synthetic */ Function1<IndicatorStateDto, Unit> $onDelete;
                                        final /* synthetic */ View $view;

                                        /* JADX WARN: Multi-variable type inference failed */
                                        C108421(View view, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, IndicatorStateDto indicatorStateDto, Function1<? super IndicatorStateDto, Unit> function1) {
                                            this.$view = view;
                                            this.$eventLogger = eventLogger;
                                            this.$eventDescriptor = userInteractionEventDescriptor;
                                            this.$indicator = indicatorStateDto;
                                            this.$onDelete = function1;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                            invoke(composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c7: CONSTRUCTOR (r6v3 'function0' kotlin.jvm.functions.Function0) = 
                                              (r7v2 'view' android.view.View A[DONT_INLINE])
                                              (r8v2 'eventLogger' com.robinhood.analytics.EventLogger A[DONT_INLINE])
                                              (r9v2 'userInteractionEventDescriptor' com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor A[DONT_INLINE])
                                              (r10v2 'indicatorStateDto' black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto A[DONT_INLINE])
                                              (r11v3 'function1' kotlin.jvm.functions.Function1<black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto, kotlin.Unit> A[DONT_INLINE])
                                             A[DECLARE_VAR, MD:(android.view.View, com.robinhood.analytics.EventLogger, com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor, black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto, kotlin.jvm.functions.Function1):void (m)] (LINE:334) call: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8$1$$ExternalSyntheticLambda0.<init>(android.view.View, com.robinhood.analytics.EventLogger, com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor, black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto, kotlin.jvm.functions.Function1):void type: CONSTRUCTOR in method: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes7.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 20 more
                                            */
                                        public final void invoke(androidx.compose.runtime.Composer r22, int r23) {
                                            /*
                                                r21 = this;
                                                r0 = r21
                                                r5 = r22
                                                r1 = r23
                                                r2 = r1 & 3
                                                r3 = 2
                                                if (r2 != r3) goto L16
                                                boolean r2 = r5.getSkipping()
                                                if (r2 != 0) goto L12
                                                goto L16
                                            L12:
                                                r5.skipToGroupEnd()
                                                return
                                            L16:
                                                boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r2 == 0) goto L25
                                                r2 = -1
                                                java.lang.String r3 = "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:322)"
                                                r4 = -330084395(0xffffffffec534fd5, float:-1.0218414E27)
                                                androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
                                            L25:
                                                androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p011ui.Modifier.INSTANCE
                                                r2 = 1
                                                r3 = 0
                                                r4 = 0
                                                androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r1, r4, r2, r3)
                                                com.robinhood.compose.bento.theme.BentoTheme r1 = com.robinhood.compose.bento.theme.BentoTheme.INSTANCE
                                                int r2 = com.robinhood.compose.bento.theme.BentoTheme.$stable
                                                com.robinhood.compose.bento.theme.BentoSpacing r3 = r1.getSpacing(r5, r2)
                                                float r8 = r3.m21593getSmallD9Ej5fM()
                                                r11 = 13
                                                r12 = 0
                                                r7 = 0
                                                r9 = 0
                                                r10 = 0
                                                androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(r6, r7, r8, r9, r10, r11, r12)
                                                int r4 = com.robinhood.android.chart.libblackwidowadvancedchart.C10963R.string.indicator_bottom_sheet_delete
                                                r6 = 0
                                                java.lang.String r8 = androidx.compose.p011ui.res.StringResources_androidKt.stringResource(r4, r5, r6)
                                                com.robinhood.compose.bento.component.BentoButtons$Type r10 = com.robinhood.compose.bento.component.BentoButtons.Type.Secondary
                                                com.robinhood.compose.bento.theme.BentoColors r4 = r1.getColors(r5, r2)
                                                long r6 = r4.m21371getBg0d7_KjU()
                                                com.robinhood.compose.bento.theme.BentoColors r4 = r1.getColors(r5, r2)
                                                long r11 = r4.m21452getNegative0d7_KjU()
                                                com.robinhood.compose.bento.theme.BentoColors r1 = r1.getColors(r5, r2)
                                                long r1 = r1.m21452getNegative0d7_KjU()
                                                r13 = r6
                                                com.robinhood.compose.bento.component.BentoButtonState r7 = new com.robinhood.compose.bento.component.BentoButtonState
                                                androidx.compose.ui.graphics.Color r13 = androidx.compose.p011ui.graphics.Color.m6701boximpl(r13)
                                                androidx.compose.ui.graphics.Color r14 = androidx.compose.p011ui.graphics.Color.m6701boximpl(r1)
                                                androidx.compose.ui.graphics.Color r15 = androidx.compose.p011ui.graphics.Color.m6701boximpl(r11)
                                                r19 = 1818(0x71a, float:2.548E-42)
                                                r20 = 0
                                                r9 = 0
                                                r11 = 0
                                                r12 = 0
                                                r16 = 0
                                                r17 = 0
                                                r18 = 0
                                                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                                                r1 = r7
                                                r2 = -1224400529(0xffffffffb705216f, float:-7.935202E-6)
                                                r5.startReplaceGroup(r2)
                                                android.view.View r2 = r0.$view
                                                boolean r2 = r5.changedInstance(r2)
                                                com.robinhood.analytics.EventLogger r4 = r0.$eventLogger
                                                boolean r4 = r5.changedInstance(r4)
                                                r2 = r2 | r4
                                                com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor r4 = r0.$eventDescriptor
                                                boolean r4 = r5.changedInstance(r4)
                                                r2 = r2 | r4
                                                black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto r4 = r0.$indicator
                                                boolean r4 = r5.changedInstance(r4)
                                                r2 = r2 | r4
                                                kotlin.jvm.functions.Function1<black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto, kotlin.Unit> r4 = r0.$onDelete
                                                boolean r4 = r5.changed(r4)
                                                r2 = r2 | r4
                                                android.view.View r7 = r0.$view
                                                com.robinhood.analytics.EventLogger r8 = r0.$eventLogger
                                                com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor r9 = r0.$eventDescriptor
                                                black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto r10 = r0.$indicator
                                                kotlin.jvm.functions.Function1<black_widow.contracts.mobile_app_chart.proto.v1.IndicatorStateDto, kotlin.Unit> r11 = r0.$onDelete
                                                java.lang.Object r4 = r5.rememberedValue()
                                                if (r2 != 0) goto Lc5
                                                androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.INSTANCE
                                                java.lang.Object r2 = r2.getEmpty()
                                                if (r4 != r2) goto Lce
                                            Lc5:
                                                com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8$1$$ExternalSyntheticLambda0 r6 = new com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8$1$$ExternalSyntheticLambda0
                                                r6.<init>(r7, r8, r9, r10, r11)
                                                r5.updateRememberedValue(r6)
                                                r4 = r6
                                            Lce:
                                                r2 = r4
                                                kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                                                r5.endReplaceGroup()
                                                int r6 = com.robinhood.compose.bento.component.BentoButtonState.$stable
                                                r7 = 8
                                                r4 = 0
                                                com.robinhood.compose.bento.component.BentoButtonKt.BentoButton(r1, r2, r3, r4, r5, r6, r7)
                                                boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r1 == 0) goto Le5
                                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                                            Le5:
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$2$2$2$1$8.C108421.invoke(androidx.compose.runtime.Composer, int):void");
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(View view, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, IndicatorStateDto indicatorStateDto, Function1 function1) {
                                            HapticEvents.onRejectHapticEvent(view);
                                            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.DELETE_BUTTON, IndicatorSettingsScreenKt.INDICATOR_SETTINGS_SCREEN, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, indicatorStateDto.getId(), null, null, null, 0.0d, null, null, 32511, null).getContext(), false, 41, null);
                                            function1.invoke(indicatorStateDto);
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                        invoke(lazyItemScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(item, "$this$item");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1257035136, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:321)");
                                        }
                                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-330084395, true, new C108421(view, eventLogger, userInteractionEventDescriptor, indicatorStateDto, function12), composer, 54), composer, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 3, null);
                                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$IndicatorSettingsScreenKt.INSTANCE.m1791x79b6d006(), 3, null);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$10(SnapshotState snapshotState, SettingsKeyboardState it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$3(snapshotState, it);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$11(Function2 function2, IndicatorStateDto indicatorStateDto, String id, IndicatorParameterValue value) {
                                Intrinsics.checkNotNullParameter(id, "id");
                                Intrinsics.checkNotNullParameter(value, "value");
                                function2.invoke(indicatorStateDto.getUuid(), new EditIndicatorParameterAction(id, value, null, 4, null));
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$12(SnapshotState snapshotState, SettingsKeyboardState it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$3(snapshotState, it);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$13(Function2 function2, IndicatorStateDto indicatorStateDto, String id, LineValue value) {
                                Intrinsics.checkNotNullParameter(id, "id");
                                Intrinsics.checkNotNullParameter(value, "value");
                                function2.invoke(indicatorStateDto.getUuid(), new EditIndicatorLineAction(id, value, null, 4, null));
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$16$lambda$14(SnapshotState snapshotState, SettingsKeyboardState it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$3(snapshotState, it);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$19$lambda$18$lambda$17$lambda$16$lambda$15(Function2 function2, IndicatorStateDto indicatorStateDto, String id, IndicatorParameterValue value) {
                                Intrinsics.checkNotNullParameter(id, "id");
                                Intrinsics.checkNotNullParameter(value, "value");
                                function2.invoke(indicatorStateDto.getUuid(), new EditIndicatorParameterAction(id, value, null, 4, null));
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpadScopeV2 bentoNumpadScopeV2, Composer composer3, Integer num) {
                            invoke(bentoNumpadScopeV2, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoNumpadScopeV2 BentoNumpadScreenLayoutV2, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayoutV2, "$this$BentoNumpadScreenLayoutV2");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-26440013, i5, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous> (IndicatorSettingsScreen.kt:123)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier52, 0.0f, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, ComposableLambda3.rememberComposableLambda(243172215, true, new AnonymousClass1(focusManager2, current2, userInteractionEventDescriptor2, indicator, onBackPressed), composer3, 54), null, null, null, 0, bentoTheme.getColors(composer3, i6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-1779049918, true, new AnonymousClass2(indicator, focusManager2, snapshotState2, current2, userInteractionEventDescriptor2, bentoNumpadScopeV2232, onParameterUpdated, availableColorPickerColors, onPlotUpdated, context2, onResetIndicator, view2, onDelete), composer3, 54), composer3, 805306416, 316);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: IndicatorSettingsScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
                            final /* synthetic */ EventLogger $eventLogger;
                            final /* synthetic */ FocusManager $focusManager;
                            final /* synthetic */ IndicatorStateDto $indicator;
                            final /* synthetic */ Function0<Unit> $onBackPressed;

                            AnonymousClass1(FocusManager focusManager, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, IndicatorStateDto indicatorStateDto, Function0<Unit> function0) {
                                this.$focusManager = focusManager;
                                this.$eventLogger = eventLogger;
                                this.$eventDescriptor = userInteractionEventDescriptor;
                                this.$indicator = indicatorStateDto;
                                this.$onBackPressed = function0;
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
                                    ComposerKt.traceEventStart(243172215, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:128)");
                                }
                                FocusManager focusManager = this.$focusManager;
                                composer.startReplaceGroup(-1224400529);
                                boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$indicator) | composer.changed(this.$onBackPressed);
                                final EventLogger eventLogger = this.$eventLogger;
                                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                                final IndicatorStateDto indicatorStateDto = this.$indicator;
                                final Function0 function0 = this.$onBackPressed;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return IndicatorSettingsScreenKt.C108401.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, indicatorStateDto, function0);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                IndicatorSettingsScreenKt.IndicatorSettingsTopBar(focusManager, (Function0) objRememberedValue, composer, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, IndicatorStateDto indicatorStateDto, Function0 function0) {
                                EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BACK_BUTTON, IndicatorSettingsScreenKt.INDICATOR_SETTINGS_SCREEN, null, 4, null), null, Logging4.updateEventDescriptor$default(userInteractionEventDescriptor, null, null, null, null, null, null, 0.0d, false, indicatorStateDto.getId(), null, null, null, 0.0d, null, null, 32511, null).getContext(), false, 41, null);
                                function0.invoke();
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54), Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), null, ComposableLambda3.rememberComposableLambda(-717983280, true, new Function3<BentoNumpadScopeV2, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt.IndicatorSettingsScreen.2

                        /* compiled from: IndicatorSettingsScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$2$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ FocusManager $focusManager;
                            final /* synthetic */ SnapshotState<SettingsKeyboardState> $keyboardState$delegate;
                            final /* synthetic */ BentoNumpadScopeV22 $numpadScope;

                            AnonymousClass1(SnapshotState<SettingsKeyboardState> snapshotState, BentoNumpadScopeV22 bentoNumpadScopeV22, FocusManager focusManager) {
                                this.$keyboardState$delegate = snapshotState;
                                this.$numpadScope = bentoNumpadScopeV22;
                                this.$focusManager = focusManager;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final int invoke$lambda$1$lambda$0(int i) {
                                return i;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final int invoke$lambda$3$lambda$2(int i) {
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
                                    ComposerKt.traceEventStart(1066375323, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:358)");
                                }
                                boolean z = !Intrinsics.areEqual(IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$2(this.$keyboardState$delegate), Closed.INSTANCE);
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue = composer.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return Integer.valueOf(IndicatorSettingsScreenKt.C108432.AnonymousClass1.invoke$lambda$1$lambda$0(((Integer) obj).intValue()));
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                EnterTransition enterTransitionSlideInVertically$default = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue, 1, null);
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$2$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return Integer.valueOf(IndicatorSettingsScreenKt.C108432.AnonymousClass1.invoke$lambda$3$lambda$2(((Integer) obj).intValue()));
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, enterTransitionSlideInVertically$default, EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue2, 1, null), (String) null, ComposableLambda3.rememberComposableLambda(-1170205325, true, new AnonymousClass3(this.$numpadScope, this.$focusManager, this.$keyboardState$delegate), composer, 54), composer, 200064, 18);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: IndicatorSettingsScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$2$1$3, reason: invalid class name */
                            static final class AnonymousClass3 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                                final /* synthetic */ FocusManager $focusManager;
                                final /* synthetic */ SnapshotState<SettingsKeyboardState> $keyboardState$delegate;
                                final /* synthetic */ BentoNumpadScopeV22 $numpadScope;

                                AnonymousClass3(BentoNumpadScopeV22 bentoNumpadScopeV22, FocusManager focusManager, SnapshotState<SettingsKeyboardState> snapshotState) {
                                    this.$numpadScope = bentoNumpadScopeV22;
                                    this.$focusManager = focusManager;
                                    this.$keyboardState$delegate = snapshotState;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                    invoke(animatedVisibilityScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                                    CustomKeyConfig customKeyConfig;
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1170205325, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous>.<anonymous>.<anonymous> (IndicatorSettingsScreen.kt:363)");
                                    }
                                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
                                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
                                    composer.startReplaceGroup(714129115);
                                    if (IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$2(this.$keyboardState$delegate).getShowMinusSign()) {
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer.changedInstance(this.$numpadScope);
                                        final BentoNumpadScopeV22 bentoNumpadScopeV22 = this.$numpadScope;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$2$1$3$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return IndicatorSettingsScreenKt.C108432.AnonymousClass1.AnonymousClass3.invoke$lambda$1$lambda$0(bentoNumpadScopeV22);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        customKeyConfig = new CustomKeyConfig("-", null, 0, null, (Function0) objRememberedValue, 14, null);
                                    } else {
                                        customKeyConfig = null;
                                    }
                                    CustomKeyConfig customKeyConfig2 = customKeyConfig;
                                    composer.endReplaceGroup();
                                    boolean showDelimiter = IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$2(this.$keyboardState$delegate).getShowDelimiter();
                                    BentoNumpadScopeV22 bentoNumpadScopeV222 = this.$numpadScope;
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance2 = composer.changedInstance(this.$focusManager);
                                    final FocusManager focusManager = this.$focusManager;
                                    final SnapshotState snapshotState = this.$keyboardState$delegate;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsScreen$2$1$3$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return IndicatorSettingsScreenKt.C108432.AnonymousClass1.AnonymousClass3.invoke$lambda$3$lambda$2(focusManager, snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    bentoNumpadScopeV222.BentoNumpadWithButton(strStringResource, (Function0) objRememberedValue2, modifierM4872backgroundbw27NRU$default, false, false, false, false, showDelimiter, false, customKeyConfig2, false, composer, CustomKeyConfig.$stable << 27, BentoNumpadScopeV22.$stable << 3, 1400);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(FocusManager focusManager, SnapshotState snapshotState) {
                                    focusManager.clearFocus(true);
                                    IndicatorSettingsScreenKt.IndicatorSettingsScreen$lambda$3(snapshotState, Closed.INSTANCE);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(BentoNumpadScopeV22 bentoNumpadScopeV22) {
                                    bentoNumpadScopeV22.onKeyPress(new KeyEvent(new KeyEvent(0, 69)));
                                    return Unit.INSTANCE;
                                }
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpadScopeV2 bentoNumpadScopeV2, Composer composer3, Integer num) {
                            invoke(bentoNumpadScopeV2, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoNumpadScopeV2 BentoNumpadScreenLayoutV2, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayoutV2, "$this$BentoNumpadScreenLayoutV2");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-717983280, i5, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreen.<anonymous> (IndicatorSettingsScreen.kt:357)");
                            }
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1066375323, true, new AnonymousClass1(snapshotState2, bentoNumpadScopeV2232, focusManager2), composer3, 54), composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, BentoNumpadScopeV22.$stable | 24624, 4);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void IndicatorSettingsScreen$lambda$3(SnapshotState<SettingsKeyboardState> snapshotState, SettingsKeyboardState settingsKeyboardState) {
                snapshotState.setValue(settingsKeyboardState);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void IndicatorSettingsTopBar(final FocusManager focusManager, final Function0<Unit> function0, Composer composer, final int i) {
                int i2;
                Composer composer2;
                Composer composerStartRestartGroup = composer.startRestartGroup(-1598257371);
                if ((i & 6) == 0) {
                    i2 = (composerStartRestartGroup.changedInstance(focusManager) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
                }
                if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1598257371, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsTopBar (IndicatorSettingsScreen.kt:396)");
                    }
                    HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                    composer2 = composerStartRestartGroup;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$IndicatorSettingsScreenKt.INSTANCE.m1789xf83cbd17(), null, ComposableLambda3.rememberComposableLambda(-196379290, true, new C108461(focusManager, hapticFeedback, function0), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1526377529, true, new C108472(focusManager, hapticFeedback, function0), composerStartRestartGroup, 54), null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, 12586374, 0, 1906);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IndicatorSettingsScreenKt.IndicatorSettingsTopBar$lambda$5(focusManager, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }

            /* compiled from: IndicatorSettingsScreen.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsTopBar$1 */
            static final class C108461 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                final /* synthetic */ FocusManager $focusManager;
                final /* synthetic */ HapticFeedback $hapticFeedback;
                final /* synthetic */ Function0<Unit> $onBackPressed;

                C108461(FocusManager focusManager, HapticFeedback hapticFeedback, Function0<Unit> function0) {
                    this.$focusManager = focusManager;
                    this.$hapticFeedback = hapticFeedback;
                    this.$onBackPressed = function0;
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
                        i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-196379290, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsTopBar.<anonymous> (IndicatorSettingsScreen.kt:401)");
                    }
                    composer.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composer.changedInstance(this.$focusManager) | composer.changedInstance(this.$hapticFeedback) | composer.changed(this.$onBackPressed);
                    final FocusManager focusManager = this.$focusManager;
                    final HapticFeedback hapticFeedback = this.$hapticFeedback;
                    final Function0<Unit> function0 = this.$onBackPressed;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsTopBar$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IndicatorSettingsScreenKt.C108461.invoke$lambda$1$lambda$0(focusManager, hapticFeedback, function0);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(FocusManager focusManager, HapticFeedback hapticFeedback, Function0 function0) {
                    focusManager.clearFocus(true);
                    hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                    function0.invoke();
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: IndicatorSettingsScreen.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsTopBar$2 */
            static final class C108472 implements Function3<Row5, Composer, Integer, Unit> {
                final /* synthetic */ FocusManager $focusManager;
                final /* synthetic */ HapticFeedback $hapticFeedback;
                final /* synthetic */ Function0<Unit> $onBackPressed;

                C108472(FocusManager focusManager, HapticFeedback hapticFeedback, Function0<Unit> function0) {
                    this.$focusManager = focusManager;
                    this.$hapticFeedback = hapticFeedback;
                    this.$onBackPressed = function0;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                    invoke(row5, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1526377529, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsTopBar.<anonymous> (IndicatorSettingsScreen.kt:409)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
                    composer.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composer.changedInstance(this.$focusManager) | composer.changedInstance(this.$hapticFeedback) | composer.changed(this.$onBackPressed);
                    final FocusManager focusManager = this.$focusManager;
                    final HapticFeedback hapticFeedback = this.$hapticFeedback;
                    final Function0<Unit> function0 = this.$onBackPressed;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$IndicatorSettingsTopBar$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IndicatorSettingsScreenKt.C108472.invoke$lambda$1$lambda$0(focusManager, hapticFeedback, function0);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0), ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 24576, 0, 8172);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(FocusManager focusManager, HapticFeedback hapticFeedback, Function0 function0) {
                    focusManager.clearFocus(true);
                    hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                    function0.invoke();
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void IndicatorSettingsTitle(final IndicatorStateDto indicatorStateDto, final EventLogger eventLogger, final UserInteractionEventDescriptor userInteractionEventDescriptor, Composer composer, final int i) {
                int i2;
                Composer composer2;
                Composer composerStartRestartGroup = composer.startRestartGroup(80378789);
                if ((i & 6) == 0) {
                    i2 = (composerStartRestartGroup.changedInstance(indicatorStateDto) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= composerStartRestartGroup.changedInstance(eventLogger) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) ? 256 : 128;
                }
                if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(80378789, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsTitle (IndicatorSettingsScreen.kt:433)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ShoeString shoeString = StringsKt.toShoeString(indicatorStateDto.getTitle() + " {{learn_more_icon/}}", InlineComposable5.m18931inlineComposableXiT_tcQ("learn_more_icon", C2002Dp.m7995constructorimpl(24), null, 0, ComposableLambda3.rememberComposableLambda(-1749402879, true, new C10844x64a52e3b(indicatorStateDto, eventLogger, userInteractionEventDescriptor, (SnapshotState) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 24630, 12), composerStartRestartGroup, InlineComposable.$stable << 3);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20748BentoTextQnj7Zds(shoeString.getAnnotatedString(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getW500(), null, null, 0, false, 0, 0, shoeString.getInlineContent(), null, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall(), composer2, 24576, 0, 6120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IndicatorSettingsScreenKt.IndicatorSettingsTitle$lambda$9(indicatorStateDto, eventLogger, userInteractionEventDescriptor, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void IndicatorSettingsTitle$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
                snapshotState.setValue(Boolean.valueOf(z));
            }

            private static final void IndicatorSettingsScreenPreview(Composer composer, final int i) {
                Composer composerStartRestartGroup = composer.startRestartGroup(-1045588388);
                if (i != 0 || !composerStartRestartGroup.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1045588388, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenPreview (IndicatorSettingsScreen.kt:501)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$IndicatorSettingsScreenKt.INSTANCE.m1790x24893bd0(), composerStartRestartGroup, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.IndicatorSettingsScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return IndicatorSettingsScreenKt.IndicatorSettingsScreenPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
        }
