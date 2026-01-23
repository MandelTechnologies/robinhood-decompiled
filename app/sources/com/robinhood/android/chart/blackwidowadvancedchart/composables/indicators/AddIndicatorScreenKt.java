package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.Divider5;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.AddIndicatorScreenState;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.Helpers3;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.Logging4;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AddIndicatorScreen.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u001aA\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0002\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\rH\u0002\u001aC\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\r2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0018\u001a\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u001a*\b\u0012\u0004\u0012\u00020\r0\u001a2\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010\u001c\u001a\u00020\u001d*\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0001\u001a\r\u0010\u001e\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006!²\u0006\n\u0010\"\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u001aX\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020\u001dX\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u001dX\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\u0012X\u008a\u008e\u0002"}, m3636d2 = {"ADD_INDICATORS_BACK_BUTTON", "", "ADD_INDICATORS_DONE_BUTTON", "ADD_INDICATORS_SEARCH_BAR", "ADD_INDICATORS_INDICATOR", "AddIndicatorScreen", "", "state", "Lcom/robinhood/android/chart/blackwidowadvancedchart/AddIndicatorScreenState;", "onBackClick", "Lkotlin/Function0;", "onIndicatorSelected", "Lkotlin/Function1;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/AddIndicatorScreenState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "isLowerIndicator", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "IndicatorRow", "indicator", "atMaxIndicators", "atMaxLowerIndicators", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorDto;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "searchFilter", "", "search", "matchScore", "", "AddIndicatorScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "IndicatorRowPreview", "feature-black-widow-advanced-chart_externalDebug", "searchIndicator", "hasFocus", "filteredIndicators", "numSelectedIndicators", "numSelectedLowerIndicators", "showMaxIndicatorAlert", "showMaxLowerIndicatorAlert"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AddIndicatorScreenKt {
    public static final String ADD_INDICATORS_BACK_BUTTON = "AddIndicatorsBackButton";
    public static final String ADD_INDICATORS_DONE_BUTTON = "AddIndicatorsDoneButton";
    public static final String ADD_INDICATORS_INDICATOR = "AddIndicatorsIndicator";
    public static final String ADD_INDICATORS_SEARCH_BAR = "AddIndicatorsSearchBar";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddIndicatorScreen$lambda$9(AddIndicatorScreenState addIndicatorScreenState, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AddIndicatorScreen(addIndicatorScreenState, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddIndicatorScreenPreview$lambda$33(int i, Composer composer, int i2) {
        AddIndicatorScreenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorRow$lambda$25(IndicatorDto indicatorDto, Function1 function1, boolean z, boolean z2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        IndicatorRow(indicatorDto, function1, z, z2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorRowPreview$lambda$34(int i, Composer composer, int i2) {
        IndicatorRowPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: AddIndicatorScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3 */
    static final class C107763 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ SnapshotState<Boolean> $hasFocus$delegate;
        final /* synthetic */ Function1<IndicatorDto, Unit> $indicatorSelected;
        final /* synthetic */ SnapshotState<String> $searchIndicator$delegate;
        final /* synthetic */ AddIndicatorScreenState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C107763(AddIndicatorScreenState addIndicatorScreenState, Function1<? super IndicatorDto, Unit> function1, SnapshotState<String> snapshotState, SnapshotState<Boolean> snapshotState2, FocusManager focusManager) {
            this.$state = addIndicatorScreenState;
            this.$indicatorSelected = function1;
            this.$searchIndicator$delegate = snapshotState;
            this.$hasFocus$delegate = snapshotState2;
            this.$focusManager = focusManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$37$lambda$9$lambda$6$lambda$5(int i) {
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$37$lambda$9$lambda$8$lambda$7(int i) {
            return i;
        }

        private static final List<IndicatorDto> invoke$lambda$37$lambda$14(SnapshotState4<? extends List<IndicatorDto>> snapshotState4) {
            return snapshotState4.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$37$lambda$24(SnapshotState4<Boolean> snapshotState4) {
            return snapshotState4.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$37$lambda$27(SnapshotState4<Boolean> snapshotState4) {
            return snapshotState4.getValue().booleanValue();
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            final SnapshotState<Boolean> snapshotState;
            final AddIndicatorScreenState addIndicatorScreenState;
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
                ComposerKt.traceEventStart(42323353, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen.<anonymous> (AddIndicatorScreen.kt:172)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues), 0.0f, composer, 0, 1);
            AddIndicatorScreenState addIndicatorScreenState2 = this.$state;
            final Function1<IndicatorDto, Unit> function1 = this.$indicatorSelected;
            final SnapshotState<String> snapshotState2 = this.$searchIndicator$delegate;
            SnapshotState<Boolean> snapshotState3 = this.$hasFocus$delegate;
            FocusManager focusManager = this.$focusManager;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(AnimationModifier.animateContentSize$default(androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(Background3.m4871backgroundbw27NRU(Row5.weight$default(row6, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), 5, null), 1.0f, false, 2, null), bentoTheme.getColors(composer, i4).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM())), bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM()), null, null, 3, null), Logging4.updateEventDescriptor$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new Component(Component.ComponentType.SEARCH_BAR, AddIndicatorScreenKt.ADD_INDICATORS_SEARCH_BAR, null, 4, null), null, null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, AddIndicatorScreenKt.AddIndicatorScreen$lambda$4(snapshotState2), 16382, null), false, false, false, true, false, null, 110, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierAutoLogEvents$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.SEARCH_16), "", bentoTheme.getColors(composer, i4).m21426getFg20d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, Helpers3.getBW_ADVANCE_CHART_STANDARD_PADDING(), 0.0f, bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), 0.0f, 10, null), null, false, composer, BentoIcon4.Size16.$stable | 48, 48);
            Modifier modifierWeight$default = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                snapshotState = snapshotState3;
                objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AddIndicatorScreenKt.C107763.invoke$lambda$37$lambda$9$lambda$4$lambda$1$lambda$0(snapshotState, (FocusState) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            } else {
                snapshotState = snapshotState3;
            }
            composer.endReplaceGroup();
            Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierWeight$default, (Function1) objRememberedValue);
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i4).getTextM(), bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7924getStarte0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
            String strAddIndicatorScreen$lambda$4 = AddIndicatorScreenKt.AddIndicatorScreen$lambda$4(snapshotState2);
            SolidColor solidColor = new SolidColor(bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU(), null);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AddIndicatorScreenKt.C107763.invoke$lambda$37$lambda$9$lambda$4$lambda$3$lambda$2(snapshotState2, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BasicTextFieldKt.BasicTextField(strAddIndicatorScreen$lambda$4, (Function1<? super String, Unit>) objRememberedValue2, modifierOnFocusChanged, false, false, textStyleM7655copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, false, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(2008161108, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$1$1$1$3
                public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer2, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                    if ((i5 & 6) == 0) {
                        i6 = i5 | (composer2.changedInstance(innerTextField) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2008161108, i6, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddIndicatorScreen.kt:224)");
                    }
                    SnapshotState<String> snapshotState4 = snapshotState2;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, companion5);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    String strStringResource = StringResources_androidKt.stringResource(C10963R.string.indicators_add_search_label, composer2, 0);
                    composer2.startReplaceGroup(1389193461);
                    long jM21426getFg20d7_KjU = AddIndicatorScreenKt.AddIndicatorScreen$lambda$4(snapshotState4).length() == 0 ? BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21426getFg20d7_KjU() : Color.INSTANCE.m6725getTransparent0d7_KjU();
                    composer2.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 0, 0, 8186);
                    innerTextField.invoke(composer2, Integer.valueOf(i6 & 14));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                    invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer, 54), composer, 805306416, 196608, 15832);
            composer.endNode();
            boolean zAddIndicatorScreen$lambda$7 = AddIndicatorScreenKt.AddIndicatorScreen$lambda$7(snapshotState);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(AddIndicatorScreenKt.C107763.invoke$lambda$37$lambda$9$lambda$6$lambda$5(((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EnterTransition enterTransitionSlideInHorizontally$default = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) objRememberedValue3, 1, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(AddIndicatorScreenKt.C107763.invoke$lambda$37$lambda$9$lambda$8$lambda$7(((Integer) obj).intValue()));
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            AnimatedVisibilityKt.AnimatedVisibility(row6, zAddIndicatorScreen$lambda$7, (Modifier) null, enterTransitionSlideInHorizontally$default, EnterExitTransitionKt.slideOutHorizontally$default(null, (Function1) objRememberedValue4, 1, null), (String) null, ComposableLambda3.rememberComposableLambda(-561904053, true, new AddIndicatorScreenKt$AddIndicatorScreen$3$1$1$4(row6, focusManager, snapshotState2), composer, 54), composer, 1600518, 18);
            composer.endNode();
            Object objAddIndicatorScreen$lambda$4 = AddIndicatorScreenKt.AddIndicatorScreen$lambda$4(snapshotState2);
            Object allIndicators = addIndicatorScreenState2.getAllIndicators();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(objAddIndicatorScreen$lambda$4) | composer.changed(allIndicators);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged || objRememberedValue5 == companion4.getEmpty()) {
                addIndicatorScreenState = addIndicatorScreenState2;
                objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddIndicatorScreenKt.C107763.invoke$lambda$37$lambda$13$lambda$12(addIndicatorScreenState, snapshotState2);
                    }
                });
                composer.updateRememberedValue(objRememberedValue5);
            } else {
                addIndicatorScreenState = addIndicatorScreenState2;
            }
            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue5;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == companion4.getEmpty()) {
                objRememberedValue6 = SnapshotIntState3.mutableIntStateOf(addIndicatorScreenState.getSelectedIndicators().size());
                composer.updateRememberedValue(objRememberedValue6);
            }
            final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue6;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue7 = composer.rememberedValue();
            if (objRememberedValue7 == companion4.getEmpty()) {
                ImmutableList<IndicatorStateDto> selectedIndicators = addIndicatorScreenState.getSelectedIndicators();
                if (selectedIndicators == null || !selectedIndicators.isEmpty()) {
                    Iterator<IndicatorStateDto> it = selectedIndicators.iterator();
                    int i5 = 0;
                    while (it.hasNext()) {
                        if (AddIndicatorScreenKt.isLowerIndicator(it.next()) && (i5 = i5 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                    i3 = i5;
                } else {
                    i3 = 0;
                }
                objRememberedValue7 = SnapshotIntState3.mutableIntStateOf(i3);
                composer.updateRememberedValue(objRememberedValue7);
            }
            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue7;
            composer.endReplaceGroup();
            int intValue = snapshotIntState2.getIntValue();
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(intValue);
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(AddIndicatorScreenKt.C107763.invoke$lambda$37$lambda$23$lambda$22(snapshotIntState2));
                    }
                });
                composer.updateRememberedValue(objRememberedValue8);
            }
            final SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue8;
            composer.endReplaceGroup();
            int intValue2 = snapshotIntState22.getIntValue();
            composer.startReplaceGroup(5004770);
            boolean zChanged3 = composer.changed(intValue2);
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(AddIndicatorScreenKt.C107763.invoke$lambda$37$lambda$26$lambda$25(snapshotIntState22));
                    }
                });
                composer.updateRememberedValue(objRememberedValue9);
            }
            final SnapshotState4 snapshotState43 = (SnapshotState4) objRememberedValue9;
            composer.endReplaceGroup();
            if (invoke$lambda$37$lambda$14(snapshotState4).isEmpty()) {
                composer.startReplaceGroup(-794850294);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String strStringResource = StringResources_androidKt.stringResource(C10963R.string.indicators_add_no_search_results, composer, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme2.getColors(composer, i6).m21427getFg30d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i6).getTextM(), composer, 0, 0, 8186);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-799998340);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(addIndicatorScreenState) | composer.changed(snapshotState42) | composer.changed(snapshotState43) | composer.changed(function1) | composer.changed(snapshotState4);
                Object objRememberedValue10 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    final AddIndicatorScreenState addIndicatorScreenState3 = addIndicatorScreenState;
                    Object obj = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AddIndicatorScreenKt.C107763.invoke$lambda$37$lambda$35$lambda$34(addIndicatorScreenState3, snapshotState2, function1, snapshotState42, snapshotState43, snapshotIntState22, snapshotIntState2, snapshotState4, (LazyListScope) obj2);
                        }
                    };
                    composer.updateRememberedValue(obj);
                    objRememberedValue10 = obj;
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyColumn(modifierFillMaxSize$default2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue10, composer, 6, 510);
                composer.endReplaceGroup();
            }
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$37$lambda$9$lambda$4$lambda$1$lambda$0(SnapshotState snapshotState, FocusState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AddIndicatorScreenKt.AddIndicatorScreen$lambda$8(snapshotState, it.isFocused());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$37$lambda$9$lambda$4$lambda$3$lambda$2(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AddIndicatorScreenKt.AddIndicatorScreen$lambda$5(snapshotState, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List invoke$lambda$37$lambda$13$lambda$12(AddIndicatorScreenState addIndicatorScreenState, SnapshotState snapshotState) {
            if (AddIndicatorScreenKt.AddIndicatorScreen$lambda$4(snapshotState).length() > 0) {
                return AddIndicatorScreenKt.searchFilter(addIndicatorScreenState.getAllIndicators(), AddIndicatorScreenKt.AddIndicatorScreen$lambda$4(snapshotState));
            }
            ImmutableList<IndicatorDto> allIndicators = addIndicatorScreenState.getAllIndicators();
            ArrayList arrayList = new ArrayList();
            for (IndicatorDto indicatorDto : allIndicators) {
                IndicatorDto indicatorDto2 = indicatorDto;
                ImmutableList<IndicatorDto> popularIndicators = addIndicatorScreenState.getPopularIndicators();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(popularIndicators, 10));
                Iterator<IndicatorDto> it = popularIndicators.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().getId());
                }
                if (!arrayList2.contains(indicatorDto2.getId())) {
                    arrayList.add(indicatorDto);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$37$lambda$23$lambda$22(SnapshotIntState2 snapshotIntState2) {
            return snapshotIntState2.getIntValue() >= 10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$37$lambda$26$lambda$25(SnapshotIntState2 snapshotIntState2) {
            return snapshotIntState2.getIntValue() >= 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$37$lambda$35$lambda$34(AddIndicatorScreenState addIndicatorScreenState, final SnapshotState snapshotState, final Function1 function1, final SnapshotState4 snapshotState4, final SnapshotState4 snapshotState42, final SnapshotIntState2 snapshotIntState2, final SnapshotIntState2 snapshotIntState22, SnapshotState4 snapshotState43, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            if (StringsKt.isBlank(AddIndicatorScreenKt.AddIndicatorScreen$lambda$4(snapshotState))) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AddIndicatorScreenKt.INSTANCE.m1776x742fc35(), 3, null);
                final ImmutableList<IndicatorDto> popularIndicators = addIndicatorScreenState.getPopularIndicators();
                final Function1 function12 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AddIndicatorScreenKt.C107763.invoke$lambda$37$lambda$35$lambda$34$lambda$28((IndicatorDto) obj);
                    }
                };
                final C10766x76a1672d c10766x76a1672d = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$invoke$lambda$37$lambda$35$lambda$34$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(IndicatorDto indicatorDto) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((IndicatorDto) obj);
                    }
                };
                LazyColumn.items(popularIndicators.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$invoke$lambda$37$lambda$35$lambda$34$$inlined$items$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return function12.invoke(popularIndicators.get(i));
                    }
                }, new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$invoke$lambda$37$lambda$35$lambda$34$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return c10766x76a1672d.invoke(popularIndicators.get(i));
                    }
                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$invoke$lambda$37$lambda$35$lambda$34$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                        int i3;
                        if ((i2 & 6) == 0) {
                            i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                        } else {
                            i3 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i3 |= composer.changed(i) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        IndicatorDto indicatorDto = (IndicatorDto) popularIndicators.get(i);
                        composer.startReplaceGroup(-1327902491);
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(LazyItemScope.animateItem$default(lazyItemScope, Modifier.INSTANCE, null, null, null, 7, null), Logging4.updateEventDescriptor$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new Component(Component.ComponentType.LIST_ROW, AddIndicatorScreenKt.ADD_INDICATORS_INDICATOR, null, 4, null), null, null, null, null, null, 0.0d, false, indicatorDto.getId(), null, null, null, 0.0d, null, AddIndicatorScreenKt.AddIndicatorScreen$lambda$4(snapshotState), 16126, null), false, false, false, true, false, null, 110, null);
                        boolean zInvoke$lambda$37$lambda$24 = AddIndicatorScreenKt.C107763.invoke$lambda$37$lambda$24(snapshotState4);
                        boolean zInvoke$lambda$37$lambda$27 = AddIndicatorScreenKt.C107763.invoke$lambda$37$lambda$27(snapshotState42);
                        composer.startReplaceGroup(-1746271574);
                        boolean zChanged = composer.changed(function1);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final Function1 function13 = function1;
                            final SnapshotIntState2 snapshotIntState23 = snapshotIntState2;
                            final SnapshotIntState2 snapshotIntState24 = snapshotIntState22;
                            objRememberedValue = new Function1<IndicatorDto, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$1$2$1$2$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(IndicatorDto indicatorDto2) {
                                    invoke2(indicatorDto2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(IndicatorDto it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if (AddIndicatorScreenKt.isLowerIndicator(it)) {
                                        SnapshotIntState2 snapshotIntState25 = snapshotIntState23;
                                        snapshotIntState25.setIntValue(snapshotIntState25.getIntValue() + 1);
                                    }
                                    SnapshotIntState2 snapshotIntState26 = snapshotIntState24;
                                    snapshotIntState26.setIntValue(snapshotIntState26.getIntValue() + 1);
                                    function13.invoke(it);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        AddIndicatorScreenKt.IndicatorRow(indicatorDto, (Function1) objRememberedValue, zInvoke$lambda$37$lambda$24, zInvoke$lambda$37$lambda$27, modifierAutoLogEvents$default, composer, 0, 0);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AddIndicatorScreenKt.INSTANCE.m1781x6894c38e(), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-706262154, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$1$2$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    int i2;
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 6) == 0) {
                        i2 = i | (composer.changed(item) ? 4 : 2);
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-706262154, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddIndicatorScreen.kt:336)");
                    }
                    Modifier modifierAnimateItem$default = LazyItemScope.animateItem$default(item, Modifier.INSTANCE, null, null, null, 7, null);
                    String strStringResource = StringResources_androidKt.stringResource(AddIndicatorScreenKt.AddIndicatorScreen$lambda$4(snapshotState).length() == 0 ? C10963R.string.indicators_other_indicators_section_title : C10963R.string.indicators_all_indicators_section_title, composer, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierAnimateItem$default, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 24576, 0, 8168);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            final List<IndicatorDto> listInvoke$lambda$37$lambda$14 = invoke$lambda$37$lambda$14(snapshotState43);
            final Function1 function13 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AddIndicatorScreenKt.C107763.invoke$lambda$37$lambda$35$lambda$34$lambda$31((IndicatorDto) obj);
                }
            };
            final C10770x76a16731 c10770x76a16731 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$invoke$lambda$37$lambda$35$lambda$34$$inlined$items$default$5
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(IndicatorDto indicatorDto) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((IndicatorDto) obj);
                }
            };
            LazyColumn.items(listInvoke$lambda$37$lambda$14.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$invoke$lambda$37$lambda$35$lambda$34$$inlined$items$default$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return function13.invoke(listInvoke$lambda$37$lambda$14.get(i));
                }
            }, new Function1<Integer, Object>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$invoke$lambda$37$lambda$35$lambda$34$$inlined$items$default$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c10770x76a16731.invoke(listInvoke$lambda$37$lambda$14.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$invoke$lambda$37$lambda$35$lambda$34$$inlined$items$default$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    IndicatorDto indicatorDto = (IndicatorDto) listInvoke$lambda$37$lambda$14.get(i);
                    composer.startReplaceGroup(-694818748);
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(LazyItemScope.animateItem$default(lazyItemScope, Modifier.INSTANCE, null, null, null, 7, null), Logging4.updateEventDescriptor$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new Component(Component.ComponentType.LIST_ROW, AddIndicatorScreenKt.ADD_INDICATORS_INDICATOR, null, 4, null), null, null, null, null, null, 0.0d, false, indicatorDto.getId(), null, null, null, 0.0d, null, AddIndicatorScreenKt.AddIndicatorScreen$lambda$4(snapshotState), 16126, null), false, false, false, true, false, null, 110, null);
                    boolean zInvoke$lambda$37$lambda$24 = AddIndicatorScreenKt.C107763.invoke$lambda$37$lambda$24(snapshotState4);
                    boolean zInvoke$lambda$37$lambda$27 = AddIndicatorScreenKt.C107763.invoke$lambda$37$lambda$27(snapshotState42);
                    composer.startReplaceGroup(-1746271574);
                    boolean zChanged = composer.changed(function1);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function14 = function1;
                        final SnapshotIntState2 snapshotIntState23 = snapshotIntState2;
                        final SnapshotIntState2 snapshotIntState24 = snapshotIntState22;
                        objRememberedValue = new Function1<IndicatorDto, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$1$2$1$5$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(IndicatorDto indicatorDto2) {
                                invoke2(indicatorDto2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(IndicatorDto it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                if (AddIndicatorScreenKt.isLowerIndicator(it)) {
                                    SnapshotIntState2 snapshotIntState25 = snapshotIntState23;
                                    snapshotIntState25.setIntValue(snapshotIntState25.getIntValue() + 1);
                                }
                                SnapshotIntState2 snapshotIntState26 = snapshotIntState24;
                                snapshotIntState26.setIntValue(snapshotIntState26.getIntValue() + 1);
                                function14.invoke(it);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    AddIndicatorScreenKt.IndicatorRow(indicatorDto, (Function1) objRememberedValue, zInvoke$lambda$37$lambda$24, zInvoke$lambda$37$lambda$27, modifierAutoLogEvents$default, composer, 0, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$37$lambda$35$lambda$34$lambda$28(IndicatorDto indicator) {
            Intrinsics.checkNotNullParameter(indicator, "indicator");
            return "popular" + indicator.getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$37$lambda$35$lambda$34$lambda$31(IndicatorDto indicator) {
            Intrinsics.checkNotNullParameter(indicator, "indicator");
            return indicator.getId();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddIndicatorScreen(final AddIndicatorScreenState state, final Function0<Unit> onBackClick, final Function1<? super IndicatorDto, Unit> onIndicatorSelected, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final HapticFeedback hapticFeedback;
        Object objRememberedValue;
        Composer.Companion companion;
        final CoroutineScope coroutineScope;
        Object objRememberedValue2;
        final SnackbarHostState snackbarHostState;
        boolean zChangedInstance;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onIndicatorSelected, "onIndicatorSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1485813320);
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
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onIndicatorSelected) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485813320, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen (AddIndicatorScreen.kt:83)");
                }
                hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new SnackbarHostState();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snackbarHostState = (SnackbarHostState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(hapticFeedback);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AddIndicatorScreenKt.AddIndicatorScreen$lambda$2$lambda$1(coroutineScope, hapticFeedback, onIndicatorSelected, snackbarHostState, (IndicatorDto) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function1 function1 = (Function1) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotState3.mutableStateOf$default("", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1245604348, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt.AddIndicatorScreen.1
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
                            ComposerKt.traceEventStart(-1245604348, i6, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen.<anonymous> (AddIndicatorScreen.kt:119)");
                        }
                        AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                        final AddIndicatorScreenState addIndicatorScreenState = state;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-770833097, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt.AddIndicatorScreen.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i7) {
                                String strStringResource;
                                if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-770833097, i7, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen.<anonymous>.<anonymous> (AddIndicatorScreen.kt:138)");
                                }
                                if (addIndicatorScreenState.getHasSelectedTemplate()) {
                                    composer4.startReplaceGroup(1301436575);
                                    strStringResource = StringResources_androidKt.stringResource(C10963R.string.indicators_screen_set_title, composer4, 0);
                                    composer4.endReplaceGroup();
                                } else {
                                    composer4.startReplaceGroup(1301549756);
                                    strStringResource = StringResources_androidKt.stringResource(C10963R.string.indicators_screen_no_set_title, composer4, 0);
                                    composer4.endReplaceGroup();
                                }
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                String str = strStringResource;
                                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme2.getColors(composer4, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i8).getTextM(), composer4, 0, 0, 8186);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, ComposableLambda3.rememberComposableLambda(-1952741789, true, new AnonymousClass2(onBackClick, snapshotState), composer3, 54), ComposableLambda3.rememberComposableLambda(1019636386, true, new AnonymousClass3(onBackClick, snapshotState), composer3, 54), null, false, false, appBarType, null, 0L, null, composer3, 12586374, 0, 1906);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AddIndicatorScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $onBackClick;
                        final /* synthetic */ SnapshotState<String> $searchIndicator$delegate;

                        AnonymousClass2(Function0<Unit> function0, SnapshotState<String> snapshotState) {
                            this.$onBackClick = function0;
                            this.$searchIndicator$delegate = snapshotState;
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
                                ComposerKt.traceEventStart(-1952741789, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen.<anonymous>.<anonymous> (AddIndicatorScreen.kt:122)");
                            }
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, Logging4.updateEventDescriptor$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new Component(Component.ComponentType.BACK_BUTTON, AddIndicatorScreenKt.ADD_INDICATORS_BACK_BUTTON, null, 4, null), null, null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, AddIndicatorScreenKt.AddIndicatorScreen$lambda$4(this.$searchIndicator$delegate), 16382, null), false, false, false, true, false, null, 110, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$onBackClick);
                            final Function0<Unit> function0 = this.$onBackClick;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AddIndicatorScreenKt.C107741.AnonymousClass2.invoke$lambda$1$lambda$0(function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(modifierAutoLogEvents$default, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: AddIndicatorScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$1$3, reason: invalid class name */
                    static final class AnonymousClass3 implements Function3<Row5, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $onBackClick;
                        final /* synthetic */ SnapshotState<String> $searchIndicator$delegate;

                        AnonymousClass3(Function0<Unit> function0, SnapshotState<String> snapshotState) {
                            this.$onBackClick = function0;
                            this.$searchIndicator$delegate = snapshotState;
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
                                ComposerKt.traceEventStart(1019636386, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen.<anonymous>.<anonymous> (AddIndicatorScreen.kt:149)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$onBackClick);
                            final Function0<Unit> function0 = this.$onBackClick;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$1$3$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AddIndicatorScreenKt.C107741.AnonymousClass3.invoke$lambda$1$lambda$0(function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), Logging4.updateEventDescriptor$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new Component(Component.ComponentType.DONE_BUTTON, AddIndicatorScreenKt.ADD_INDICATORS_DONE_BUTTON, null, 4, null), null, null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, AddIndicatorScreenKt.AddIndicatorScreen$lambda$4(this.$searchIndicator$delegate), 16382, null), false, false, false, true, false, null, 110, null);
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
                            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierAutoLogEvents$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8168);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54);
                Function2<Composer, Integer, Unit> function2M1780x7804d12b = ComposableSingletons$AddIndicatorScreenKt.INSTANCE.m1780x7804d12b();
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-2118014910, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt.AddIndicatorScreen.2
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
                            ComposerKt.traceEventStart(-2118014910, i6, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen.<anonymous> (AddIndicatorScreen.kt:112)");
                        }
                        SnackbarHostKt.SnackbarHost(snackbarHostState, null, ComposableSingletons$AddIndicatorScreenKt.INSTANCE.m1777x23ebfe91(), composer3, 390, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(42323353, true, new C107763(state, function1, snapshotState, (SnapshotState) objRememberedValue5, focusManager), composerStartRestartGroup, 54);
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, composableLambdaRememberComposableLambda, function2M1780x7804d12b, composableLambdaRememberComposableLambda2, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, composableLambdaRememberComposableLambda3, composer2, 805309872, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddIndicatorScreenKt.AddIndicatorScreen$lambda$9(state, onBackClick, onIndicatorSelected, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            coroutineScope = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snackbarHostState = (SnackbarHostState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(hapticFeedback);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AddIndicatorScreenKt.AddIndicatorScreen$lambda$2$lambda$1(coroutineScope, hapticFeedback, onIndicatorSelected, snackbarHostState, (IndicatorDto) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                Function1 function12 = (Function1) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                final SnapshotState<String> snapshotState2 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambda3.rememberComposableLambda(-1245604348, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt.AddIndicatorScreen.1
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
                            ComposerKt.traceEventStart(-1245604348, i6, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen.<anonymous> (AddIndicatorScreen.kt:119)");
                        }
                        AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                        final AddIndicatorScreenState addIndicatorScreenState = state;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-770833097, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt.AddIndicatorScreen.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i7) {
                                String strStringResource;
                                if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-770833097, i7, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen.<anonymous>.<anonymous> (AddIndicatorScreen.kt:138)");
                                }
                                if (addIndicatorScreenState.getHasSelectedTemplate()) {
                                    composer4.startReplaceGroup(1301436575);
                                    strStringResource = StringResources_androidKt.stringResource(C10963R.string.indicators_screen_set_title, composer4, 0);
                                    composer4.endReplaceGroup();
                                } else {
                                    composer4.startReplaceGroup(1301549756);
                                    strStringResource = StringResources_androidKt.stringResource(C10963R.string.indicators_screen_no_set_title, composer4, 0);
                                    composer4.endReplaceGroup();
                                }
                                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                String str = strStringResource;
                                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme22.getColors(composer4, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer4, i8).getTextM(), composer4, 0, 0, 8186);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, ComposableLambda3.rememberComposableLambda(-1952741789, true, new AnonymousClass2(onBackClick, snapshotState2), composer3, 54), ComposableLambda3.rememberComposableLambda(1019636386, true, new AnonymousClass3(onBackClick, snapshotState2), composer3, 54), null, false, false, appBarType, null, 0L, null, composer3, 12586374, 0, 1906);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AddIndicatorScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $onBackClick;
                        final /* synthetic */ SnapshotState<String> $searchIndicator$delegate;

                        AnonymousClass2(Function0<Unit> function0, SnapshotState<String> snapshotState) {
                            this.$onBackClick = function0;
                            this.$searchIndicator$delegate = snapshotState;
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
                                ComposerKt.traceEventStart(-1952741789, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen.<anonymous>.<anonymous> (AddIndicatorScreen.kt:122)");
                            }
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, Logging4.updateEventDescriptor$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new Component(Component.ComponentType.BACK_BUTTON, AddIndicatorScreenKt.ADD_INDICATORS_BACK_BUTTON, null, 4, null), null, null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, AddIndicatorScreenKt.AddIndicatorScreen$lambda$4(this.$searchIndicator$delegate), 16382, null), false, false, false, true, false, null, 110, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$onBackClick);
                            final Function0 function0 = this.$onBackClick;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AddIndicatorScreenKt.C107741.AnonymousClass2.invoke$lambda$1$lambda$0(function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(modifierAutoLogEvents$default, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: AddIndicatorScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$1$3, reason: invalid class name */
                    static final class AnonymousClass3 implements Function3<Row5, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $onBackClick;
                        final /* synthetic */ SnapshotState<String> $searchIndicator$delegate;

                        AnonymousClass3(Function0<Unit> function0, SnapshotState<String> snapshotState) {
                            this.$onBackClick = function0;
                            this.$searchIndicator$delegate = snapshotState;
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
                                ComposerKt.traceEventStart(1019636386, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen.<anonymous>.<anonymous> (AddIndicatorScreen.kt:149)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$onBackClick);
                            final Function0 function0 = this.$onBackClick;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$1$3$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AddIndicatorScreenKt.C107741.AnonymousClass3.invoke$lambda$1$lambda$0(function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), Logging4.updateEventDescriptor$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new Component(Component.ComponentType.DONE_BUTTON, AddIndicatorScreenKt.ADD_INDICATORS_DONE_BUTTON, null, 4, null), null, null, null, null, null, 0.0d, false, null, null, null, null, 0.0d, null, AddIndicatorScreenKt.AddIndicatorScreen$lambda$4(this.$searchIndicator$delegate), 16382, null), false, false, false, true, false, null, 110, null);
                            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
                            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierAutoLogEvents$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8168);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54);
                Function2<Composer, Integer, Unit> function2M1780x7804d12b2 = ComposableSingletons$AddIndicatorScreenKt.INSTANCE.m1780x7804d12b();
                ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(-2118014910, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt.AddIndicatorScreen.2
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
                            ComposerKt.traceEventStart(-2118014910, i6, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen.<anonymous> (AddIndicatorScreen.kt:112)");
                        }
                        SnackbarHostKt.SnackbarHost(snackbarHostState, null, ComposableSingletons$AddIndicatorScreenKt.INSTANCE.m1777x23ebfe91(), composer3, 390, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda32 = ComposableLambda3.rememberComposableLambda(42323353, true, new C107763(state, function12, snapshotState2, (SnapshotState) objRememberedValue5, focusManager2), composerStartRestartGroup, 54);
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default2, composableLambdaRememberComposableLambda4, function2M1780x7804d12b2, composableLambdaRememberComposableLambda22, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, composableLambdaRememberComposableLambda32, composer2, 805309872, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AddIndicatorScreen$lambda$4(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AddIndicatorScreen$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean IndicatorRow$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean IndicatorRow$lambda$14(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddIndicatorScreen$lambda$2$lambda$1(CoroutineScope coroutineScope, HapticFeedback hapticFeedback, Function1 function1, SnackbarHostState snackbarHostState, IndicatorDto indicator) {
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AddIndicatorScreenKt$AddIndicatorScreen$indicatorSelected$1$1$1(snackbarHostState, indicator, null), 3, null);
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        function1.invoke(indicator);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AddIndicatorScreen$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AddIndicatorScreen$lambda$5(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLowerIndicator(IndicatorStateDto indicatorStateDto) {
        return !indicatorStateDto.getOverlaying();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLowerIndicator(IndicatorDto indicatorDto) {
        return !indicatorDto.getOverlaying();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IndicatorRow(final IndicatorDto indicatorDto, final Function1<? super IndicatorDto, Unit> function1, final boolean z, final boolean z2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super IndicatorDto, Unit> function12;
        boolean z3;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        boolean z4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final SnapshotState snapshotState;
        final SnapshotState snapshotState2;
        int i5;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        long jM21425getFg0d7_KjU;
        long jM21456getPositive0d7_KjU;
        final Modifier modifier3;
        long jM21426getFg20d7_KjU;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(386086108);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(indicatorDto) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 == 0) {
                    if ((i & 24576) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(386086108, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorRow (AddIndicatorScreen.kt:409)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        SnapshotState snapshotState4 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        if (z) {
                            z4 = true;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion3 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor);
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(indicatorDto) | ((i3 & 7168) != 2048) | ((i3 & 112) != 32);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                final Function1<? super IndicatorDto, Unit> function13 = function12;
                                final boolean z5 = z3;
                                snapshotState = snapshotState3;
                                snapshotState2 = snapshotState4;
                                i5 = 1;
                                Function0 function0 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AddIndicatorScreenKt.IndicatorRow$lambda$20$lambda$17$lambda$16(z, indicatorDto, z5, function13, snapshotState, snapshotState2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(function0);
                                objRememberedValue3 = function0;
                            } else {
                                snapshotState = snapshotState3;
                                snapshotState2 = snapshotState4;
                                i5 = 1;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, (Function0) objRememberedValue3, 7, null);
                            Modifier modifier4 = modifier2;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierM4893clickableXHw0xAI$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), i5, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor2);
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            Modifier modifierWeight$default = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor3);
                            }
                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                            Modifier modifierWeight = row6.weight(companion2, 1.0f, false);
                            String title = indicatorDto.getTitle();
                            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
                            if (z4) {
                                composerStartRestartGroup.startReplaceGroup(-758428348);
                                jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-758502717);
                                jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU();
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(title, modifierWeight, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM, composerStartRestartGroup, 817889280, 0, 7544);
                            Composer composer2 = composerStartRestartGroup;
                            composer2.startReplaceGroup(668277773);
                            if (!StringsKt.isBlank(indicatorDto.getAbbr())) {
                                String str = " (" + indicatorDto.getAbbr() + ")";
                                TextStyle textM2 = bentoTheme.getTypography(composer2, i6).getTextM();
                                if (z4) {
                                    composer2.startReplaceGroup(-758011429);
                                    jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i6).m21427getFg30d7_KjU();
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(-757929093);
                                    jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU();
                                    composer2.endReplaceGroup();
                                }
                                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 1, 0, null, 0, textM2, composer2, 805306368, 0, 7674);
                                composer2 = composer2;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_PLUS_24);
                            if (z4) {
                                composer2.startReplaceGroup(1095575434);
                                jM21456getPositive0d7_KjU = bentoTheme.getColors(composer2, i6).m21456getPositive0d7_KjU();
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(1095508815);
                                jM21456getPositive0d7_KjU = bentoTheme.getColors(composer2, i6).m21427getFg30d7_KjU();
                                composer2.endReplaceGroup();
                            }
                            Composer composer3 = composer2;
                            BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21456getPositive0d7_KjU, modifierM5146paddingqDBjuR0$default, null, false, composer3, BentoIcon4.Size24.$stable | 48, 48);
                            composerStartRestartGroup = composer3;
                            composerStartRestartGroup.endNode();
                            Divider5.m5851HorizontalDivider9IZ8Weo(null, 0.0f, bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), composerStartRestartGroup, 0, 3);
                            composerStartRestartGroup.endNode();
                            if (!IndicatorRow$lambda$11(snapshotState)) {
                                composerStartRestartGroup.startReplaceGroup(-28395426);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AddIndicatorScreenKt.IndicatorRow$lambda$22$lambda$21(snapshotState);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                IndicatorAlerts.MaxIndicatorsAlert((Function0) objRememberedValue4, composerStartRestartGroup, 6);
                                composerStartRestartGroup.endReplaceGroup();
                            } else if (IndicatorRow$lambda$14(snapshotState2)) {
                                composerStartRestartGroup.startReplaceGroup(-28252268);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AddIndicatorScreenKt.IndicatorRow$lambda$24$lambda$23(snapshotState2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                IndicatorAlerts.MaxLowerIndicatorsAlert((Function0) objRememberedValue5, composerStartRestartGroup, 6);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-28123866);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                        } else {
                            if (!(isLowerIndicator(indicatorDto) ? z3 : false)) {
                                z4 = false;
                            }
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            Arrangement arrangement2 = Arrangement.INSTANCE;
                            Arrangement.Vertical top2 = arrangement2.getTop();
                            Alignment.Companion companion32 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion32.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion22);
                            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor4 = companion42.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion42.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion42.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion42.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(indicatorDto) | ((i3 & 7168) != 2048) | ((i3 & 112) != 32);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance) {
                                    final Function1 function132 = function12;
                                    final boolean z52 = z3;
                                    snapshotState = snapshotState3;
                                    snapshotState2 = snapshotState4;
                                    i5 = 1;
                                    Function0 function02 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AddIndicatorScreenKt.IndicatorRow$lambda$20$lambda$17$lambda$16(z, indicatorDto, z52, function132, snapshotState, snapshotState2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(function02);
                                    objRememberedValue3 = function02;
                                    composerStartRestartGroup.endReplaceGroup();
                                    Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, (Function0) objRememberedValue3, 7, null);
                                    Modifier modifier42 = modifier2;
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i62 = BentoTheme.$stable;
                                    Modifier modifierM5144paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierM4893clickableXHw0xAI$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), i5, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion32.getCenterVertically(), composerStartRestartGroup, 48);
                                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                                    Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion42.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl2.getInserting()) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                                        Row6 row62 = Row6.INSTANCE;
                                        Modifier modifierWeight$default2 = Row5.weight$default(row62, companion22, 1.0f, false, 2, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion32.getTop(), composerStartRestartGroup, 0);
                                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                                        Function0<ComposeUiNode> constructor32 = companion42.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion42.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion42.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash3 = companion42.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl3.getInserting()) {
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion42.getSetModifier());
                                            Modifier modifierWeight2 = row62.weight(companion22, 1.0f, false);
                                            String title2 = indicatorDto.getTitle();
                                            TextStyle textM3 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM();
                                            if (z4) {
                                            }
                                            BentoText2.m20747BentoText38GnDrw(title2, modifierWeight2, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM3, composerStartRestartGroup, 817889280, 0, 7544);
                                            Composer composer22 = composerStartRestartGroup;
                                            composer22.startReplaceGroup(668277773);
                                            if (!StringsKt.isBlank(indicatorDto.getAbbr())) {
                                            }
                                            composer22.endReplaceGroup();
                                            composer22.endNode();
                                            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, bentoTheme2.getSpacing(composer22, i62).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                                            BentoIcon4.Size24 size242 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_PLUS_24);
                                            if (z4) {
                                            }
                                            Composer composer32 = composer22;
                                            BentoIcon2.m20644BentoIconFU0evQE(size242, null, jM21456getPositive0d7_KjU, modifierM5146paddingqDBjuR0$default2, null, false, composer32, BentoIcon4.Size24.$stable | 48, 48);
                                            composerStartRestartGroup = composer32;
                                            composerStartRestartGroup.endNode();
                                            Divider5.m5851HorizontalDivider9IZ8Weo(null, 0.0f, bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), composerStartRestartGroup, 0, 3);
                                            composerStartRestartGroup.endNode();
                                            if (!IndicatorRow$lambda$11(snapshotState)) {
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            modifier3 = modifier42;
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
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AddIndicatorScreenKt.IndicatorRow$lambda$25(indicatorDto, function1, z, z2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                modifier2 = modifier;
                if ((i3 & 9363) == 9362) {
                    if (i4 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState32 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState42 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    if (z) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z2;
            i4 = i2 & 16;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function12 = function1;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        z3 = z2;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void IndicatorRow$lambda$12(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void IndicatorRow$lambda$15(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorRow$lambda$20$lambda$17$lambda$16(boolean z, IndicatorDto indicatorDto, boolean z2, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2) {
        if (z) {
            IndicatorRow$lambda$12(snapshotState, true);
        } else if (isLowerIndicator(indicatorDto) && z2) {
            IndicatorRow$lambda$15(snapshotState2, true);
        } else {
            function1.invoke(indicatorDto);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorRow$lambda$22$lambda$21(SnapshotState snapshotState) {
        IndicatorRow$lambda$12(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndicatorRow$lambda$24$lambda$23(SnapshotState snapshotState) {
        IndicatorRow$lambda$15(snapshotState, false);
        return Unit.INSTANCE;
    }

    public static final List<IndicatorDto> searchFilter(List<IndicatorDto> list, String search) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(search, "search");
        List<IndicatorDto> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (IndicatorDto indicatorDto : list2) {
            arrayList.add(Tuples4.m3642to(Integer.valueOf(matchScore(indicatorDto, StringsKt.trim(search).toString())), indicatorDto));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) ((Tuples2) obj).getFirst()).intValue() > 0) {
                arrayList2.add(obj);
            }
        }
        final Comparator comparator = new Comparator() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt.searchFilter.3
            @Override // java.util.Comparator
            public final int compare(Tuples2<Integer, IndicatorDto> indicator1, Tuples2<Integer, IndicatorDto> indicator2) {
                Intrinsics.checkNotNullParameter(indicator1, "indicator1");
                Intrinsics.checkNotNullParameter(indicator2, "indicator2");
                return indicator2.getFirst().intValue() - indicator1.getFirst().intValue();
            }
        };
        List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$searchFilter$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(((IndicatorDto) ((Tuples2) t).getSecond()).getTitle(), ((IndicatorDto) ((Tuples2) t2).getSecond()).getTitle());
            }
        });
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            arrayList3.add((IndicatorDto) ((Tuples2) it.next()).getSecond());
        }
        return arrayList3;
    }

    public static final int matchScore(IndicatorDto indicatorDto, String search) {
        Intrinsics.checkNotNullParameter(indicatorDto, "<this>");
        Intrinsics.checkNotNullParameter(search, "search");
        if (StringsKt.startsWith(indicatorDto.getTitle(), search, true)) {
            return search.length() == indicatorDto.getTitle().length() ? 7 : 4;
        }
        if (StringsKt.startsWith(indicatorDto.getAbbr(), search, true)) {
            return search.length() == indicatorDto.getTitle().length() ? 6 : 3;
        }
        List<String> search_terms = indicatorDto.getSearch_terms();
        if (!(search_terms instanceof Collection) || !search_terms.isEmpty()) {
            Iterator<T> it = search_terms.iterator();
            while (it.hasNext()) {
                if (StringsKt.equals((String) it.next(), search, true)) {
                    return 5;
                }
            }
        }
        List<String> search_terms2 = indicatorDto.getSearch_terms();
        if (!(search_terms2 instanceof Collection) || !search_terms2.isEmpty()) {
            Iterator<T> it2 = search_terms2.iterator();
            while (it2.hasNext()) {
                if (StringsKt.startsWith((String) it2.next(), search, true)) {
                    return 2;
                }
            }
        }
        if (search.length() < 2) {
            return 0;
        }
        if (!StringsKt.contains((CharSequence) indicatorDto.getTitle(), (CharSequence) search, true) && !StringsKt.contains((CharSequence) indicatorDto.getAbbr(), (CharSequence) search, true)) {
            List<String> search_terms3 = indicatorDto.getSearch_terms();
            if ((search_terms3 instanceof Collection) && search_terms3.isEmpty()) {
                return 0;
            }
            Iterator<T> it3 = search_terms3.iterator();
            while (it3.hasNext()) {
                if (StringsKt.contains((CharSequence) it3.next(), (CharSequence) search, true)) {
                }
            }
            return 0;
        }
        return 1;
    }

    private static final void AddIndicatorScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(465330803);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(465330803, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenPreview (AddIndicatorScreen.kt:521)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$AddIndicatorScreenKt.INSTANCE.m1778x873d7e2e(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddIndicatorScreenKt.AddIndicatorScreenPreview$lambda$33(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void IndicatorRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1769381886);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1769381886, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorRowPreview (AddIndicatorScreen.kt:549)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$AddIndicatorScreenKt.INSTANCE.m1779x73ea7228(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddIndicatorScreenKt.IndicatorRowPreview$lambda$34(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
