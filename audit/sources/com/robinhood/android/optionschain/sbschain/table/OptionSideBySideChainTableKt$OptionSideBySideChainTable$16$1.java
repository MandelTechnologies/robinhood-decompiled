package com.robinhood.android.optionschain.sbschain.table;

import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState2;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState4;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState7;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainEvent;
import com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableEvent;
import com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1;
import com.robinhood.android.optionschain.sbschain.table.TableRowState;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionSideBySideChainHorizontalScrollModifier;
import com.robinhood.android.optionschain.view.OptionChainTooltipBanner;
import com.robinhood.android.optionschain.view.OptionChainTooltipBanner3;
import com.robinhood.android.plt.PltModifiers;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.udf.UiEvent;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainTable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
final class OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Offset> $callPosition$delegate;
    final /* synthetic */ OptionSideBySideChainDataState2 $callPutSwitcherState;
    final /* synthetic */ float $cellWidth;
    final /* synthetic */ Event<OptionSideBySideChainEvent> $chainEvent;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ Density $density;
    final /* synthetic */ OptionSideBySideChainTableDuxo $duxo;
    final /* synthetic */ SnapshotState4<Event<OptionSideBySideChainTableEvent>> $event$delegate;
    final /* synthetic */ boolean $inSbsChainPerfExperiment;
    final /* synthetic */ boolean $isNuxAnimationFinished;
    final /* synthetic */ boolean $isSideBySide;
    final /* synthetic */ SnapshotState<Boolean> $isTableReady$delegate;
    final /* synthetic */ OptionChainLaunchMode $launchMode;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ SnapshotState4<C2002Dp> $leftScrollableRowOffset$delegate;
    final /* synthetic */ SnapshotState4<C2002Dp> $leftScrollableRowWidth$delegate;
    final /* synthetic */ Function1<SpreadSelectionState, Unit> $logSpreadTooltipAppear;
    final /* synthetic */ int $metricSize;
    final /* synthetic */ int $numOfCellsCanHoldOneSide;
    final /* synthetic */ OptionSideBySideChainDataState4 $nuxMode;
    final /* synthetic */ Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> $onBidAskCellDoubleTap;
    final /* synthetic */ Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> $onBidAskCellLongPress;
    final /* synthetic */ Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> $onBidAskCellSingleTap;
    final /* synthetic */ Function0<Unit> $onEnableTradeOnExpiration;
    final /* synthetic */ Function0<Unit> $onHighlightAnimationPlayed;
    final /* synthetic */ Function1<OptionChainTooltipBanner3, Unit> $onTopTooltipBannerAppear;
    final /* synthetic */ Function1<OptionChainTooltipBanner3, Unit> $onTopTooltipBannerDismiss;
    final /* synthetic */ SnapshotState<Offset> $putPosition$delegate;
    final /* synthetic */ Integer $quoteIndex;
    final /* synthetic */ SnapshotState4<C2002Dp> $rightScrollableRowOffset$delegate;
    final /* synthetic */ SnapshotState4<C2002Dp> $rightScrollableRowWidth$delegate;
    final /* synthetic */ float $rowWidth;
    final /* synthetic */ SnapshotState4<Boolean> $scrollPastBidAsk$delegate;
    final /* synthetic */ ImmutableList<OptionLegBundle> $selectedLegs;
    final /* synthetic */ Function0<Unit> $setSeenSpreadTooltip;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $sharedScrollValue;
    final /* synthetic */ SnapshotLongState2 $startTableLoading$delegate;
    final /* synthetic */ SnapshotState4<C2002Dp> $stickCellOffset$delegate;
    final /* synthetic */ Brush $stickyCellBackgroundBrush;
    final /* synthetic */ OptionSideBySideChainDataState7 $tooltipState;
    final /* synthetic */ OptionChainTooltipBanner3 $topTooltipBannerType;
    final /* synthetic */ View $view;
    final /* synthetic */ SnapshotState4<OptionSideBySideChainTableViewState> $viewState$delegate;

    /* compiled from: OptionSideBySideChainTable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionContractType.values().length];
            try {
                iArr[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, int i, float f, int i2, OptionSideBySideChainDataState2 optionSideBySideChainDataState2, Density density, CoroutineScope coroutineScope, Animatable<Float, AnimationVectors2> animatable, SnapshotState4<OptionSideBySideChainTableViewState> snapshotState4, Integer num, Function0<Unit> function0, Brush brush, SnapshotState4<C2002Dp> snapshotState42, SnapshotState4<C2002Dp> snapshotState43, SnapshotState4<C2002Dp> snapshotState44, SnapshotState4<C2002Dp> snapshotState45, SnapshotState4<C2002Dp> snapshotState46, SnapshotState<Offset> snapshotState, SnapshotState<Offset> snapshotState2, LazyListState lazyListState, Event<OptionSideBySideChainEvent> event, View view, boolean z, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function32, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function33, Function0<Unit> function02, OptionChainLaunchMode optionChainLaunchMode, OptionSideBySideChainDataState7 optionSideBySideChainDataState7, Function0<Unit> function03, Function1<? super SpreadSelectionState, Unit> function1, boolean z2, SnapshotState<Boolean> snapshotState3, ImmutableList<OptionLegBundle> immutableList, float f2, OptionChainTooltipBanner3 optionChainTooltipBanner3, OptionSideBySideChainDataState4 optionSideBySideChainDataState4, boolean z3, Function1<? super OptionChainTooltipBanner3, Unit> function12, Function1<? super OptionChainTooltipBanner3, Unit> function13, SnapshotState4<Boolean> snapshotState47, SnapshotLongState2 snapshotLongState2, SnapshotState4<Event<OptionSideBySideChainTableEvent>> snapshotState48) {
        this.$duxo = optionSideBySideChainTableDuxo;
        this.$metricSize = i;
        this.$cellWidth = f;
        this.$numOfCellsCanHoldOneSide = i2;
        this.$callPutSwitcherState = optionSideBySideChainDataState2;
        this.$density = density;
        this.$coroutineScope = coroutineScope;
        this.$sharedScrollValue = animatable;
        this.$viewState$delegate = snapshotState4;
        this.$quoteIndex = num;
        this.$onEnableTradeOnExpiration = function0;
        this.$stickyCellBackgroundBrush = brush;
        this.$leftScrollableRowOffset$delegate = snapshotState42;
        this.$leftScrollableRowWidth$delegate = snapshotState43;
        this.$rightScrollableRowOffset$delegate = snapshotState44;
        this.$rightScrollableRowWidth$delegate = snapshotState45;
        this.$stickCellOffset$delegate = snapshotState46;
        this.$callPosition$delegate = snapshotState;
        this.$putPosition$delegate = snapshotState2;
        this.$lazyListState = lazyListState;
        this.$chainEvent = event;
        this.$view = view;
        this.$isSideBySide = z;
        this.$onBidAskCellSingleTap = function3;
        this.$onBidAskCellDoubleTap = function32;
        this.$onBidAskCellLongPress = function33;
        this.$onHighlightAnimationPlayed = function02;
        this.$launchMode = optionChainLaunchMode;
        this.$tooltipState = optionSideBySideChainDataState7;
        this.$setSeenSpreadTooltip = function03;
        this.$logSpreadTooltipAppear = function1;
        this.$inSbsChainPerfExperiment = z2;
        this.$isTableReady$delegate = snapshotState3;
        this.$selectedLegs = immutableList;
        this.$rowWidth = f2;
        this.$topTooltipBannerType = optionChainTooltipBanner3;
        this.$nuxMode = optionSideBySideChainDataState4;
        this.$isNuxAnimationFinished = z3;
        this.$onTopTooltipBannerDismiss = function12;
        this.$onTopTooltipBannerAppear = function13;
        this.$scrollPastBidAsk$delegate = snapshotState47;
        this.$startTableLoading$delegate = snapshotLongState2;
        this.$event$delegate = snapshotState48;
    }

    private static final boolean invoke$lambda$70$lambda$69$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$70$lambda$69$lambda$14(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$70$lambda$69$lambda$26(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$70$lambda$69$lambda$29(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$70$lambda$69$lambda$32(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    private static final Integer invoke$lambda$70$lambda$69$lambda$56(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Integer invoke$lambda$70$lambda$69$lambda$60(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean invoke$lambda$70$lambda$69$lambda$64(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$70$lambda$69$lambda$68(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final float invoke$lambda$70$lambda$9(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0b08  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0b10  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0b47  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0b86  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0b8c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0bad  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0bb3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0c3f  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0c4e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0c6a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0c86  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0486  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        final LazyListState lazyListState;
        int i2;
        boolean z;
        int i3;
        SnapshotState snapshotState;
        Brush brush;
        float f;
        float f2;
        float f3;
        PrimitiveRanges2 primitiveRanges2;
        final LazyListState lazyListState2;
        final Integer num;
        int i4;
        final float f4;
        Object obj;
        Modifier.Companion companion;
        int i5;
        SnapshotState4<OptionSideBySideChainTableViewState> snapshotState4;
        Function0 function0;
        OptionSideBySideChainDataState2 optionSideBySideChainDataState2;
        SnapshotState4<C2002Dp> snapshotState42;
        Brush brush2;
        final SnapshotState4<OptionSideBySideChainTableViewState> snapshotState43;
        final SnapshotState<Boolean> snapshotState2;
        SnapshotState<Boolean> snapshotState3;
        EventConsumer eventConsumer;
        EventConsumer eventConsumer2;
        EventConsumer eventConsumer3;
        EventConsumer eventConsumer4;
        boolean zChanged;
        Object objRememberedValue;
        Object objRememberedValue2;
        final SnapshotState4 snapshotState44;
        Object objRememberedValue3;
        final SnapshotState4 snapshotState45;
        boolean zChanged2;
        Object objRememberedValue4;
        boolean zChanged3;
        Object objRememberedValue5;
        Composer composer2;
        boolean z2;
        Modifier.Companion companion2;
        SnapshotState4<OptionSideBySideChainTableViewState> snapshotState46;
        LazyListState lazyListState3;
        PrimitiveRanges2 rowIndexRange;
        EventConsumer<OptionSideBySideChainEvent> eventConsumerInvoke;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1594738531, i, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTable.<anonymous>.<anonymous> (OptionSideBySideChainTable.kt:332)");
        }
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
        boolean shouldEnableScrolling = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(this.$viewState$delegate).getShouldEnableScrolling();
        Object obj2 = this.$duxo;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(obj2);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue6 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$1$1(obj2);
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        Modifier modifierM17306optionSideBySideChainHorizontalScrollAFY4PWA = OptionSideBySideChainHorizontalScrollModifier.m17306optionSideBySideChainHorizontalScrollAFY4PWA(modifierFillMaxSize$default, this.$metricSize, this.$cellWidth, this.$numOfCellsCanHoldOneSide, this.$callPutSwitcherState, this.$density, this.$coroutineScope, this.$sharedScrollValue, shouldEnableScrolling, (Function0) ((KFunction) objRememberedValue6));
        Density density = this.$density;
        final Integer num2 = this.$quoteIndex;
        Function0<Unit> function02 = this.$onEnableTradeOnExpiration;
        final Animatable<Float, AnimationVectors2> animatable = this.$sharedScrollValue;
        final OptionSideBySideChainDataState2 optionSideBySideChainDataState22 = this.$callPutSwitcherState;
        Brush brush3 = this.$stickyCellBackgroundBrush;
        float f5 = this.$cellWidth;
        final SnapshotState4<OptionSideBySideChainTableViewState> snapshotState47 = this.$viewState$delegate;
        final SnapshotState4<C2002Dp> snapshotState48 = this.$leftScrollableRowOffset$delegate;
        final SnapshotState4<C2002Dp> snapshotState49 = this.$leftScrollableRowWidth$delegate;
        final SnapshotState4<C2002Dp> snapshotState410 = this.$rightScrollableRowOffset$delegate;
        final SnapshotState4<C2002Dp> snapshotState411 = this.$rightScrollableRowWidth$delegate;
        final SnapshotState4<C2002Dp> snapshotState412 = this.$stickCellOffset$delegate;
        final SnapshotState<Offset> snapshotState5 = this.$callPosition$delegate;
        final SnapshotState<Offset> snapshotState6 = this.$putPosition$delegate;
        LazyListState lazyListState4 = this.$lazyListState;
        final Event<OptionSideBySideChainEvent> event = this.$chainEvent;
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo = this.$duxo;
        final View view = this.$view;
        final boolean z3 = this.$isSideBySide;
        final Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> function3 = this.$onBidAskCellSingleTap;
        final Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> function32 = this.$onBidAskCellDoubleTap;
        final Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> function33 = this.$onBidAskCellLongPress;
        final Function0<Unit> function03 = this.$onHighlightAnimationPlayed;
        final OptionChainLaunchMode optionChainLaunchMode = this.$launchMode;
        OptionSideBySideChainDataState7 optionSideBySideChainDataState7 = this.$tooltipState;
        Function0<Unit> function04 = this.$setSeenSpreadTooltip;
        Function1<SpreadSelectionState, Unit> function1 = this.$logSpreadTooltipAppear;
        boolean z4 = this.$inSbsChainPerfExperiment;
        SnapshotState<Boolean> snapshotState7 = this.$isTableReady$delegate;
        ImmutableList<OptionLegBundle> immutableList = this.$selectedLegs;
        int i6 = this.$metricSize;
        float f6 = this.$rowWidth;
        int i7 = this.$numOfCellsCanHoldOneSide;
        OptionChainTooltipBanner3 optionChainTooltipBanner3 = this.$topTooltipBannerType;
        OptionSideBySideChainDataState4 optionSideBySideChainDataState4 = this.$nuxMode;
        boolean z5 = this.$isNuxAnimationFinished;
        Function1<OptionChainTooltipBanner3, Unit> function12 = this.$onTopTooltipBannerDismiss;
        Function1<OptionChainTooltipBanner3, Unit> function13 = this.$onTopTooltipBannerAppear;
        final SnapshotState4<Boolean> snapshotState413 = this.$scrollPastBidAsk$delegate;
        final SnapshotLongState2 snapshotLongState2 = this.$startTableLoading$delegate;
        SnapshotState4<Event<OptionSideBySideChainTableEvent>> snapshotState414 = this.$event$delegate;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion4 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM17306optionSideBySideChainHorizontalScrollAFY4PWA);
        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion3);
        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
        float fFloatValue = animatable.getValue().floatValue();
        TableRowState.Header headerState = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState47).getHeaderState();
        float fOptionSideBySideChainTable$lambda$28 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$28(snapshotState48);
        float fOptionSideBySideChainTable$lambda$29 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$29(snapshotState49);
        float fOptionSideBySideChainTable$lambda$30 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$30(snapshotState410);
        float fOptionSideBySideChainTable$lambda$31 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$31(snapshotState411);
        float fOptionSideBySideChainTable$lambda$32 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$32(snapshotState412);
        composer.startReplaceGroup(5004770);
        Object objRememberedValue7 = composer.rememberedValue();
        Composer.Companion companion6 = Composer.INSTANCE;
        if (objRememberedValue7 == companion6.getEmpty()) {
            objRememberedValue7 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$5$lambda$2$lambda$1(snapshotState5, (Offset) obj3);
                }
            };
            composer.updateRememberedValue(objRememberedValue7);
        }
        Function1 function14 = (Function1) objRememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion6.getEmpty()) {
            objRememberedValue8 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$5$lambda$4$lambda$3(snapshotState6, (Offset) obj3);
                }
            };
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        OptionSideBySideChainTableKt.m17267OptionSideBySideChainTableRowirZm130(fFloatValue, headerState, optionSideBySideChainDataState22, fOptionSideBySideChainTable$lambda$28, fOptionSideBySideChainTable$lambda$29, fOptionSideBySideChainTable$lambda$30, fOptionSideBySideChainTable$lambda$31, fOptionSideBySideChainTable$lambda$32, brush3, f5, false, null, null, function14, (Function1) objRememberedValue8, null, null, null, null, null, composer, 0, 27654, 1021952);
        Composer composer3 = composer;
        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21372getBg20d7_KjU(), C2002Dp.m7995constructorimpl(1), composer3, 384, 1);
        composer3.endNode();
        final float fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(TableConstants.getQuoteRowHeightDp());
        composer3.startReplaceGroup(5004770);
        boolean zChanged4 = composer3.changed(num2);
        Object objRememberedValue9 = composer3.rememberedValue();
        if (zChanged4 || objRememberedValue9 == companion6.getEmpty()) {
            lazyListState = lazyListState4;
            objRememberedValue9 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$8$lambda$7(num2, lazyListState, fMo5016toPx0680j_4));
                }
            });
            composer3.updateRememberedValue(objRememberedValue9);
        } else {
            lazyListState = lazyListState4;
        }
        composer3.endReplaceGroup();
        OptionSideBySideChainTableKt.OptionSideBySideChainTableTopBanner(OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState47).getTopErrorBannerState(), invoke$lambda$70$lambda$9((SnapshotState4) objRememberedValue9), null, function02, composer3, 0, 4);
        LazyListState lazyListState5 = lazyListState;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), 0.0f, 1, null);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
        Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
        if (composer3.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
            composer3.createNode(constructor3);
        } else {
            composer3.useNode();
        }
        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        TopErrorBannerState topErrorBannerState = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState47).getTopErrorBannerState();
        OptionSideBySideChainItmOverlay.OptionSideBySideChainItmOverlay(lazyListState5, num2, optionSideBySideChainDataState22, topErrorBannerState != null ? topErrorBannerState.getType() : null, composer3, 0);
        composer3.startReplaceGroup(1849434622);
        Object objRememberedValue10 = composer3.rememberedValue();
        if (objRememberedValue10 == companion6.getEmpty()) {
            i2 = 2;
            objRememberedValue10 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer3.updateRememberedValue(objRememberedValue10);
        } else {
            i2 = 2;
        }
        final SnapshotState snapshotState8 = (SnapshotState) objRememberedValue10;
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(1849434622);
        Object objRememberedValue11 = composer3.rememberedValue();
        if (objRememberedValue11 == companion6.getEmpty()) {
            objRememberedValue11 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i2, null);
            composer3.updateRememberedValue(objRememberedValue11);
        }
        final SnapshotState snapshotState9 = (SnapshotState) objRememberedValue11;
        composer3.endReplaceGroup();
        if (event != null) {
            if (!(event.getData() instanceof OptionSideBySideChainEvent.ShowSpreadOverlayBorderAnimation) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
                z = true;
            } else {
                z = true;
                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$invoke$lambda$70$lambda$69$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        m17269invoke(obj3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m17269invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        int i8 = OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.WhenMappings.$EnumSwitchMapping$0[((OptionSideBySideChainEvent.ShowSpreadOverlayBorderAnimation) event.getData()).getContractType().ordinal()];
                        if (i8 == 1) {
                            OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$12(snapshotState8, true);
                        } else {
                            if (i8 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$15(snapshotState9, true);
                        }
                    }
                });
            }
            Unit unit = Unit.INSTANCE;
        } else {
            z = true;
        }
        composer3.startReplaceGroup(1923167541);
        if (optionSideBySideChainDataState22.isCallSideVisible()) {
            if (!(OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState47).getDragTarget() instanceof DragTarget.OptionLegDragTarget)) {
                DragTarget dragTarget = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState47).getDragTarget();
                if ((dragTarget != null ? dragTarget.getContractType() : null) != OptionContractType.CALL) {
                }
            }
            SpreadSelectionState spreadSelectionState = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState47).getSpreadSelectionState();
            if (spreadSelectionState != null) {
                lazyListState3 = lazyListState5;
                rowIndexRange = spreadSelectionState.getRowIndexRange(OptionContractType.CALL);
            } else {
                lazyListState3 = lazyListState5;
                rowIndexRange = null;
            }
            float fFloatValue2 = animatable.getValue().floatValue();
            boolean zInvoke$lambda$70$lambda$69$lambda$11 = invoke$lambda$70$lambda$69$lambda$11(snapshotState8);
            Modifier modifierM5125offsetVpY3zN4$default = OffsetKt.m5125offsetVpY3zN4$default(companion3, density.mo5012toDpu2uoSUM(Float.intBitsToFloat((int) (OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$38(snapshotState5) >> 32))), 0.0f, i2, null);
            composer3.startReplaceGroup(5004770);
            Object objRememberedValue12 = composer3.rememberedValue();
            if (objRememberedValue12 == companion6.getEmpty()) {
                objRememberedValue12 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$19$lambda$18(snapshotState8);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue12);
            }
            composer3.endReplaceGroup();
            snapshotState = snapshotState9;
            brush = brush3;
            f = f5;
            LazyListState lazyListState6 = lazyListState3;
            f2 = 0.0f;
            f3 = fMo5016toPx0680j_4;
            primitiveRanges2 = null;
            i3 = 2;
            TableSpreadOverlay.m17296TableSpreadOverlayInlineUR9CgXA(rowIndexRange, num2, f, lazyListState6, fFloatValue2, zInvoke$lambda$70$lambda$69$lambda$11, (Function0) objRememberedValue12, modifierM5125offsetVpY3zN4$default, composer3, 1572864, 0);
            lazyListState5 = lazyListState6;
            composer3 = composer3;
        } else {
            i3 = i2;
            snapshotState = snapshotState9;
            brush = brush3;
            f = f5;
            f2 = 0.0f;
            f3 = fMo5016toPx0680j_4;
            primitiveRanges2 = null;
        }
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(1923201391);
        if (optionSideBySideChainDataState22.isPutSideVisible()) {
            if (!(OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState47).getDragTarget() instanceof DragTarget.OptionLegDragTarget)) {
                DragTarget dragTarget2 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState47).getDragTarget();
                if ((dragTarget2 != null ? dragTarget2.getContractType() : primitiveRanges2) != OptionContractType.PUT) {
                }
            }
            SpreadSelectionState spreadSelectionState2 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState47).getSpreadSelectionState();
            PrimitiveRanges2 rowIndexRange2 = spreadSelectionState2 != null ? spreadSelectionState2.getRowIndexRange(OptionContractType.PUT) : primitiveRanges2;
            float fFloatValue3 = animatable.getValue().floatValue();
            LazyListState lazyListState7 = lazyListState5;
            PrimitiveRanges2 primitiveRanges22 = rowIndexRange2;
            boolean zInvoke$lambda$70$lambda$69$lambda$14 = invoke$lambda$70$lambda$69$lambda$14(snapshotState);
            Modifier modifierM5125offsetVpY3zN4$default2 = OffsetKt.m5125offsetVpY3zN4$default(companion3, density.mo5012toDpu2uoSUM(Float.intBitsToFloat((int) (OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$41(snapshotState6) >> 32))), f2, i3, primitiveRanges2);
            i4 = 5004770;
            composer3.startReplaceGroup(5004770);
            Object objRememberedValue13 = composer3.rememberedValue();
            if (objRememberedValue13 == companion6.getEmpty()) {
                final SnapshotState snapshotState10 = snapshotState;
                objRememberedValue13 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$22$lambda$21(snapshotState10);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue13);
            }
            composer3.endReplaceGroup();
            Composer composer4 = composer3;
            lazyListState2 = lazyListState7;
            TableSpreadOverlay.m17296TableSpreadOverlayInlineUR9CgXA(primitiveRanges22, num2, f, lazyListState2, fFloatValue3, zInvoke$lambda$70$lambda$69$lambda$14, (Function0) objRememberedValue13, modifierM5125offsetVpY3zN4$default2, composer4, 1572864, 0);
            num = num2;
            composer3 = composer4;
        } else {
            lazyListState2 = lazyListState5;
            num = num2;
            i4 = 5004770;
        }
        composer3.endReplaceGroup();
        final float fMo5016toPx0680j_42 = density.mo5016toPx0680j_4(TableConstants.getCellHeightDp());
        final int iMo7449getContainerSizeYbymL2g = (int) (((WindowInfo) composer3.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() & 4294967295L);
        composer3.startReplaceGroup(1849434622);
        Object objRememberedValue14 = composer3.rememberedValue();
        if (objRememberedValue14 == companion6.getEmpty()) {
            f4 = f3;
            objRememberedValue14 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$25$lambda$24(lazyListState2, f4));
                }
            });
            composer3.updateRememberedValue(objRememberedValue14);
        } else {
            f4 = f3;
        }
        final SnapshotState4 snapshotState415 = (SnapshotState4) objRememberedValue14;
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(1849434622);
        Object objRememberedValue15 = composer3.rememberedValue();
        if (objRememberedValue15 == companion6.getEmpty()) {
            objRememberedValue15 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$28$lambda$27(iMo7449getContainerSizeYbymL2g, lazyListState2, f4));
                }
            });
            composer3.updateRememberedValue(objRememberedValue15);
        }
        final SnapshotState4 snapshotState416 = (SnapshotState4) objRememberedValue15;
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(1849434622);
        Object objRememberedValue16 = composer3.rememberedValue();
        if (objRememberedValue16 == companion6.getEmpty()) {
            objRememberedValue16 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$31$lambda$30(lazyListState2, fMo5016toPx0680j_42));
                }
            });
            composer3.updateRememberedValue(objRememberedValue16);
        }
        final SnapshotState4 snapshotState417 = (SnapshotState4) objRememberedValue16;
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(-1224400529);
        boolean zChangedInstance2 = composer3.changedInstance(coroutineScope) | composer3.changed(lazyListState2) | composer3.changed(num);
        Object objRememberedValue17 = composer3.rememberedValue();
        if (zChangedInstance2 || objRememberedValue17 == companion6.getEmpty()) {
            objRememberedValue17 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$34$lambda$33(coroutineScope, lazyListState2, num, snapshotState415);
                }
            };
            composer3.updateRememberedValue(objRememberedValue17);
        }
        final Function0 function05 = (Function0) objRememberedValue17;
        composer3.endReplaceGroup();
        float fFloatValue4 = animatable.getValue().floatValue();
        long jOptionSideBySideChainTable$lambda$38 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$38(snapshotState5);
        long jOptionSideBySideChainTable$lambda$41 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$41(snapshotState6);
        Integer quoteIndex = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState47).getQuoteIndex();
        Integer disclosureIndex = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState47).getDisclosureIndex();
        DragTarget dragTarget3 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState47).getDragTarget();
        SpreadSelectionState spreadSelectionState3 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState47).getSpreadSelectionState();
        composer3.startReplaceGroup(i4);
        boolean zChangedInstance3 = composer3.changedInstance(optionSideBySideChainTableDuxo);
        Object objRememberedValue18 = composer3.rememberedValue();
        if (zChangedInstance3 || objRememberedValue18 == companion6.getEmpty()) {
            objRememberedValue18 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$36$lambda$35(optionSideBySideChainTableDuxo, ((Integer) obj3).intValue());
                }
            };
            composer3.updateRememberedValue(objRememberedValue18);
        }
        Function1 function15 = (Function1) objRememberedValue18;
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(-1633490746);
        boolean zChangedInstance4 = composer3.changedInstance(view) | composer3.changedInstance(optionSideBySideChainTableDuxo);
        Object objRememberedValue19 = composer3.rememberedValue();
        if (zChangedInstance4 || objRememberedValue19 == companion6.getEmpty()) {
            objRememberedValue19 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$38$lambda$37(view, optionSideBySideChainTableDuxo, (DragTarget) obj3);
                }
            };
            composer3.updateRememberedValue(objRememberedValue19);
        }
        Function1 function16 = (Function1) objRememberedValue19;
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(i4);
        boolean zChangedInstance5 = composer3.changedInstance(optionSideBySideChainTableDuxo);
        Object objRememberedValue20 = composer3.rememberedValue();
        if (zChangedInstance5 || objRememberedValue20 == companion6.getEmpty()) {
            objRememberedValue20 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$40$lambda$39(optionSideBySideChainTableDuxo, ((Boolean) obj3).booleanValue());
                }
            };
            composer3.updateRememberedValue(objRememberedValue20);
        }
        Function1 function17 = (Function1) objRememberedValue20;
        composer3.endReplaceGroup();
        composer3.startReplaceGroup(-1224400529);
        final Brush brush4 = brush;
        boolean zChanged5 = composer3.changed(optionSideBySideChainDataState22.ordinal()) | composer3.changed(snapshotState47) | composer3.changed(z3) | composer3.changed(function05) | composer3.changedInstance(animatable) | composer3.changed(snapshotState48) | composer3.changed(snapshotState49) | composer3.changed(snapshotState410) | composer3.changed(snapshotState411) | composer3.changed(snapshotState412) | composer3.changed(brush4) | composer3.changed(f) | composer3.changed(function3) | composer3.changed(function32) | composer3.changed(function33) | composer3.changed(function03) | composer3.changedInstance(optionChainLaunchMode);
        Object objRememberedValue21 = composer3.rememberedValue();
        final Integer num3 = num;
        if (zChanged5 || objRememberedValue21 == companion6.getEmpty()) {
            companion = companion3;
            i5 = -1224400529;
            final float f7 = f;
            obj = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$42$lambda$41(snapshotState47, z3, function05, animatable, optionSideBySideChainDataState22, brush4, f7, function3, function32, function33, function03, optionChainLaunchMode, snapshotState48, snapshotState49, snapshotState410, snapshotState411, snapshotState412, snapshotState413, (OptionChainGestureAwareLazyColumn7) obj3);
                }
            };
            snapshotState4 = snapshotState47;
            function0 = function05;
            optionSideBySideChainDataState2 = optionSideBySideChainDataState22;
            snapshotState42 = snapshotState48;
            brush2 = brush4;
            composer3.updateRememberedValue(obj);
        } else {
            obj = objRememberedValue21;
            companion = companion3;
            snapshotState42 = snapshotState48;
            function0 = function05;
            snapshotState4 = snapshotState47;
            optionSideBySideChainDataState2 = optionSideBySideChainDataState22;
            brush2 = brush4;
            i5 = -1224400529;
        }
        composer3.endReplaceGroup();
        SnapshotState4<OptionSideBySideChainTableViewState> snapshotState418 = snapshotState4;
        float f8 = f;
        final LazyListState lazyListState8 = lazyListState2;
        int i8 = i5;
        OptionChainGestureAwareLazyColumn.m17242OptionChainGestureAwareLazyColumnBuJpD7Q(lazyListState8, f8, fFloatValue4, jOptionSideBySideChainTable$lambda$38, jOptionSideBySideChainTable$lambda$41, quoteIndex, disclosureIndex, dragTarget3, spreadSelectionState3, function15, function16, function17, null, (Function1) obj, composer3, 0, 0, 4096);
        TooltipOverlay.m17301TooltipOverlayzadm560(optionSideBySideChainDataState7, OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState418).getSpreadSelectionState(), num3, Float.intBitsToFloat((int) (OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$38(snapshotState5) >> 32)), Float.intBitsToFloat((int) (OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$41(snapshotState6) >> 32)), f8, lazyListState8, function04, function1, companion, composer, 805306368, 0);
        composer.startReplaceGroup(1923434796);
        if (z4) {
            UiEvent<OptionSideBySideChainTableEvent> initialScrollUiEvent = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState418).getInitialScrollUiEvent();
            OptionSideBySideChainTableEvent optionSideBySideChainTableEventConsume = initialScrollUiEvent != null ? initialScrollUiEvent.consume() : null;
            if (optionSideBySideChainTableEventConsume == null) {
                snapshotState43 = snapshotState418;
                snapshotState2 = snapshotState7;
            } else if (optionSideBySideChainTableEventConsume instanceof OptionSideBySideChainTableEvent.DragUpdateSelectedLegs) {
                composer.startReplaceGroup(-1710555619);
                composer.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
                snapshotState43 = snapshotState418;
                snapshotState2 = snapshotState7;
            } else {
                if (optionSideBySideChainTableEventConsume instanceof OptionSideBySideChainTableEvent.ScrollToQuotePosition) {
                    composer.startReplaceGroup(-1710326839);
                    composer.startReplaceGroup(i8);
                    snapshotState2 = snapshotState7;
                    boolean zChanged6 = composer.changed(lazyListState8) | composer.changed(optionSideBySideChainTableEventConsume) | composer.changed(snapshotState418) | composer.changed(snapshotLongState2) | composer.changed(snapshotState2);
                    Object objRememberedValue22 = composer.rememberedValue();
                    if (zChanged6 || objRememberedValue22 == companion6.getEmpty()) {
                        Object c24595x2747e86 = new C24595x2747e86(lazyListState8, optionSideBySideChainTableEventConsume, snapshotState415, snapshotState418, snapshotLongState2, snapshotState2, null);
                        snapshotState46 = snapshotState418;
                        composer.updateRememberedValue(c24595x2747e86);
                        objRememberedValue22 = c24595x2747e86;
                    } else {
                        snapshotState46 = snapshotState418;
                    }
                    composer.endReplaceGroup();
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, (Function2) objRememberedValue22, 3, null);
                    composer.endReplaceGroup();
                } else {
                    snapshotState46 = snapshotState418;
                    snapshotState2 = snapshotState7;
                    if (optionSideBySideChainTableEventConsume instanceof OptionSideBySideChainTableEvent.NuxScrollToQuotePosition) {
                        composer.startReplaceGroup(-1709581134);
                        composer.startReplaceGroup(i8);
                        boolean zChanged7 = composer.changed(lazyListState8) | composer.changed(optionSideBySideChainTableEventConsume) | composer.changed(snapshotState46) | composer.changed(snapshotLongState2) | composer.changed(snapshotState2);
                        Object objRememberedValue23 = composer.rememberedValue();
                        if (zChanged7 || objRememberedValue23 == companion6.getEmpty()) {
                            Object c24596x2748247 = new C24596x2748247(lazyListState8, optionSideBySideChainTableEventConsume, snapshotState416, snapshotState46, snapshotLongState2, snapshotState2, null);
                            composer.updateRememberedValue(c24596x2748247);
                            objRememberedValue23 = c24596x2748247;
                        }
                        composer.endReplaceGroup();
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, (Function2) objRememberedValue23, 3, null);
                        composer.endReplaceGroup();
                    } else if (optionSideBySideChainTableEventConsume instanceof OptionSideBySideChainTableEvent.ScrollToTargetRowIndex) {
                        composer.startReplaceGroup(-1708756224);
                        composer.startReplaceGroup(i8);
                        boolean zChanged8 = composer.changed(lazyListState8) | composer.changed(optionSideBySideChainTableEventConsume) | composer.changed(snapshotState46) | composer.changed(snapshotLongState2) | composer.changed(snapshotState2);
                        Object objRememberedValue24 = composer.rememberedValue();
                        if (zChanged8 || objRememberedValue24 == companion6.getEmpty()) {
                            Object c24597x2748608 = new C24597x2748608(lazyListState8, optionSideBySideChainTableEventConsume, snapshotState417, snapshotState46, snapshotLongState2, snapshotState2, null);
                            composer.updateRememberedValue(c24597x2748608);
                            objRememberedValue24 = c24597x2748608;
                        }
                        composer.endReplaceGroup();
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, (Function2) objRememberedValue24, 3, null);
                        composer.endReplaceGroup();
                    } else {
                        if (!(optionSideBySideChainTableEventConsume instanceof OptionSideBySideChainTableEvent.ScrollToPosition)) {
                            composer.startReplaceGroup(-1579200004);
                            composer.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(-1708004536);
                        composer.startReplaceGroup(i8);
                        boolean zChanged9 = composer.changed(lazyListState8) | composer.changed(optionSideBySideChainTableEventConsume) | composer.changedInstance(animatable) | composer.changed(snapshotState46) | composer.changed(snapshotLongState2) | composer.changed(snapshotState2);
                        Object objRememberedValue25 = composer.rememberedValue();
                        if (zChanged9 || objRememberedValue25 == companion6.getEmpty()) {
                            Object c24598x27489c9 = new C24598x27489c9(lazyListState8, optionSideBySideChainTableEventConsume, animatable, snapshotState46, snapshotLongState2, snapshotState2, null);
                            snapshotState43 = snapshotState46;
                            composer.updateRememberedValue(c24598x27489c9);
                            objRememberedValue25 = c24598x27489c9;
                        } else {
                            snapshotState43 = snapshotState46;
                        }
                        composer.endReplaceGroup();
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, (Function2) objRememberedValue25, 3, null);
                        composer.endReplaceGroup();
                    }
                }
                snapshotState43 = snapshotState46;
            }
            composer.endReplaceGroup();
            OptionChainExpirationDateState expirationDateState = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState43).getExpirationDateState();
            String key = expirationDateState != null ? expirationDateState.getKey() : null;
            composer.startReplaceGroup(5004770);
            zChanged = composer.changed(snapshotState3);
            objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == companion6.getEmpty()) {
                objRememberedValue = new C24603x930cb6fe(snapshotState3, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(key, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 0);
            composer.startReplaceGroup(1849434622);
            objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion6.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$55$lambda$54(lazyListState8);
                    }
                });
                composer.updateRememberedValue(objRememberedValue2);
            }
            snapshotState44 = (SnapshotState4) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion6.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$59$lambda$58(lazyListState8);
                    }
                });
                composer.updateRememberedValue(objRememberedValue3);
            }
            snapshotState45 = (SnapshotState4) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            zChanged2 = composer.changed(num3);
            objRememberedValue4 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion6.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$63$lambda$62(num3, snapshotState44));
                    }
                });
                composer.updateRememberedValue(objRememberedValue4);
            }
            SnapshotState4 snapshotState419 = (SnapshotState4) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            zChanged3 = composer.changed(num3);
            objRememberedValue5 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue5 == companion6.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$67$lambda$66(num3, snapshotState45));
                    }
                });
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            Function0 function06 = function0;
            OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainTopUnderlyingQuoteIndicator(boxScopeInstance, OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState43).getUnderlyingQuoteStr(), invoke$lambda$70$lambda$69$lambda$64(snapshotState419), null, function06, composer, 6, 4);
            OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainBottomUnderlyingQuoteIndicator(boxScopeInstance, !immutableList.isEmpty(), OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState43).getUnderlyingQuoteStr(), invoke$lambda$70$lambda$69$lambda$68((SnapshotState4) objRememberedValue5), null, function06, composer, 6, 8);
            composer2 = composer;
            composer2.startReplaceGroup(1923744284);
            if (OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$10(snapshotState3)) {
                z2 = z;
                companion2 = companion;
            } else {
                companion2 = companion;
                OptionSideBySideChainLoadingTable.m17251OptionSideBySideChainLoadingTablentPy8A(optionSideBySideChainDataState2, i6, OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$28(snapshotState42), OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$29(snapshotState49), OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$30(snapshotState410), OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$31(snapshotState411), OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$32(snapshotState412), brush2, f8, composer2, 0);
                z2 = z;
                OptionSideBySideChainLoadingTable.OptionSideBySideChainLoadingTableShimmer(f6, i7, PltModifiers.recordLoadingState(companion2, z2, "OptionSideBySideChainTableNotReadyLoadingShimmer"), composer, 0, 0);
                composer2 = composer;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1923783858);
            if (optionChainTooltipBanner3 != null && OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState43).getTopErrorBannerState() == null) {
                OptionChainTooltipBanner.OptionChainTooltipBanner(optionChainTooltipBanner3, function12, boxScopeInstance.align(companion2, companion4.getTopCenter()), (optionSideBySideChainDataState4.getInNuxMode() || z5) ? false : z2, function13, composer2, 0, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        snapshotState43 = snapshotState418;
        snapshotState2 = snapshotState7;
        final Event eventOptionSideBySideChainTable$lambda$7 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$7(snapshotState414);
        if (eventOptionSideBySideChainTable$lambda$7 != null) {
            if ((eventOptionSideBySideChainTable$lambda$7.getData() instanceof OptionSideBySideChainTableEvent.ScrollToQuotePosition) && (eventConsumer4 = (EventConsumer) eventOptionSideBySideChainTable$lambda$7.getGetEventConsumer().invoke()) != null) {
                Function1 function18 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$invoke$lambda$70$lambda$69$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        m17270invoke(obj3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m17270invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C24599x930ca7fa(lazyListState8, (OptionSideBySideChainTableEvent.ScrollToQuotePosition) eventOptionSideBySideChainTable$lambda$7.getData(), snapshotState415, snapshotState43, snapshotLongState2, snapshotState2, null), 3, null);
                    }
                };
                snapshotState43 = snapshotState43;
                eventConsumer4.consume(eventOptionSideBySideChainTable$lambda$7, function18);
            }
            Unit unit3 = Unit.INSTANCE;
        }
        final Event eventOptionSideBySideChainTable$lambda$72 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$7(snapshotState414);
        if (eventOptionSideBySideChainTable$lambda$72 != null) {
            if ((eventOptionSideBySideChainTable$lambda$72.getData() instanceof OptionSideBySideChainTableEvent.NuxScrollToQuotePosition) && (eventConsumer3 = (EventConsumer) eventOptionSideBySideChainTable$lambda$72.getGetEventConsumer().invoke()) != null) {
                final SnapshotState4<OptionSideBySideChainTableViewState> snapshotState420 = snapshotState43;
                snapshotState43 = snapshotState420;
                eventConsumer3.consume(eventOptionSideBySideChainTable$lambda$72, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$invoke$lambda$70$lambda$69$$inlined$consumeIfType$3
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        m17271invoke(obj3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m17271invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C24600x930cabbb(lazyListState8, (OptionSideBySideChainTableEvent.NuxScrollToQuotePosition) eventOptionSideBySideChainTable$lambda$72.getData(), snapshotState416, snapshotState420, snapshotLongState2, snapshotState2, null), 3, null);
                    }
                });
            }
            Unit unit4 = Unit.INSTANCE;
        }
        final Event eventOptionSideBySideChainTable$lambda$73 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$7(snapshotState414);
        if (eventOptionSideBySideChainTable$lambda$73 != null) {
            if ((eventOptionSideBySideChainTable$lambda$73.getData() instanceof OptionSideBySideChainTableEvent.ScrollToTargetRowIndex) && (eventConsumer2 = (EventConsumer) eventOptionSideBySideChainTable$lambda$73.getGetEventConsumer().invoke()) != null) {
                final SnapshotState4<OptionSideBySideChainTableViewState> snapshotState421 = snapshotState43;
                snapshotState43 = snapshotState421;
                eventConsumer2.consume(eventOptionSideBySideChainTable$lambda$73, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$invoke$lambda$70$lambda$69$$inlined$consumeIfType$4
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        m17272invoke(obj3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m17272invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C24601x930caf7c(lazyListState8, (OptionSideBySideChainTableEvent.ScrollToTargetRowIndex) eventOptionSideBySideChainTable$lambda$73.getData(), snapshotState417, snapshotState421, snapshotLongState2, snapshotState2, null), 3, null);
                    }
                });
            }
            Unit unit5 = Unit.INSTANCE;
        }
        final Event eventOptionSideBySideChainTable$lambda$74 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$7(snapshotState414);
        if (eventOptionSideBySideChainTable$lambda$74 != null) {
            if (!(eventOptionSideBySideChainTable$lambda$74.getData() instanceof OptionSideBySideChainTableEvent.ScrollToPosition) || (eventConsumer = (EventConsumer) eventOptionSideBySideChainTable$lambda$74.getGetEventConsumer().invoke()) == null) {
                snapshotState3 = snapshotState2;
            } else {
                final SnapshotState4<OptionSideBySideChainTableViewState> snapshotState422 = snapshotState43;
                Function1 function19 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$invoke$lambda$70$lambda$69$$inlined$consumeIfType$5
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        m17273invoke(obj3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m17273invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C24602x930cb33d(lazyListState8, (OptionSideBySideChainTableEvent.ScrollToPosition) eventOptionSideBySideChainTable$lambda$74.getData(), animatable, snapshotState422, snapshotLongState2, snapshotState2, null), 3, null);
                    }
                };
                snapshotState3 = snapshotState2;
                eventConsumer.consume(eventOptionSideBySideChainTable$lambda$74, function19);
            }
            Unit unit6 = Unit.INSTANCE;
        }
        composer.endReplaceGroup();
        OptionChainExpirationDateState expirationDateState2 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState43).getExpirationDateState();
        if (expirationDateState2 != null) {
        }
        composer.startReplaceGroup(5004770);
        zChanged = composer.changed(snapshotState3);
        objRememberedValue = composer.rememberedValue();
        if (zChanged) {
            objRememberedValue = new C24603x930cb6fe(snapshotState3, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(key, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 0);
        composer.startReplaceGroup(1849434622);
        objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion6.getEmpty()) {
        }
        snapshotState44 = (SnapshotState4) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion6.getEmpty()) {
        }
        snapshotState45 = (SnapshotState4) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        zChanged2 = composer.changed(num3);
        objRememberedValue4 = composer.rememberedValue();
        if (zChanged2) {
            objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$63$lambda$62(num3, snapshotState44));
                }
            });
            composer.updateRememberedValue(objRememberedValue4);
        }
        SnapshotState4 snapshotState4192 = (SnapshotState4) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        zChanged3 = composer.changed(num3);
        objRememberedValue5 = composer.rememberedValue();
        if (zChanged3) {
            objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1.invoke$lambda$70$lambda$69$lambda$67$lambda$66(num3, snapshotState45));
                }
            });
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        Function0 function062 = function0;
        OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainTopUnderlyingQuoteIndicator(boxScopeInstance, OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState43).getUnderlyingQuoteStr(), invoke$lambda$70$lambda$69$lambda$64(snapshotState4192), null, function062, composer, 6, 4);
        OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainBottomUnderlyingQuoteIndicator(boxScopeInstance, !immutableList.isEmpty(), OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState43).getUnderlyingQuoteStr(), invoke$lambda$70$lambda$69$lambda$68((SnapshotState4) objRememberedValue5), null, function062, composer, 6, 8);
        composer2 = composer;
        composer2.startReplaceGroup(1923744284);
        if (OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$10(snapshotState3)) {
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(1923783858);
        if (optionChainTooltipBanner3 != null) {
            if (optionSideBySideChainDataState4.getInNuxMode()) {
                OptionChainTooltipBanner.OptionChainTooltipBanner(optionChainTooltipBanner3, function12, boxScopeInstance.align(companion2, companion4.getTopCenter()), (optionSideBySideChainDataState4.getInNuxMode() || z5) ? false : z2, function13, composer2, 0, 0);
            }
        }
        composer.endReplaceGroup();
        composer.endNode();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
        }
        snapshotState3 = snapshotState2;
        composer.endReplaceGroup();
        OptionChainExpirationDateState expirationDateState22 = OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState43).getExpirationDateState();
        if (expirationDateState22 != null) {
        }
        composer.startReplaceGroup(5004770);
        zChanged = composer.changed(snapshotState3);
        objRememberedValue = composer.rememberedValue();
        if (zChanged) {
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(key, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 0);
        composer.startReplaceGroup(1849434622);
        objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion6.getEmpty()) {
        }
        snapshotState44 = (SnapshotState4) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion6.getEmpty()) {
        }
        snapshotState45 = (SnapshotState4) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        zChanged2 = composer.changed(num3);
        objRememberedValue4 = composer.rememberedValue();
        if (zChanged2) {
        }
        SnapshotState4 snapshotState41922 = (SnapshotState4) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        zChanged3 = composer.changed(num3);
        objRememberedValue5 = composer.rememberedValue();
        if (zChanged3) {
        }
        composer.endReplaceGroup();
        Function0 function0622 = function0;
        OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainTopUnderlyingQuoteIndicator(boxScopeInstance, OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState43).getUnderlyingQuoteStr(), invoke$lambda$70$lambda$69$lambda$64(snapshotState41922), null, function0622, composer, 6, 4);
        OptionSideBySideChainUnderlyingQuoteRow.OptionSideBySideChainBottomUnderlyingQuoteIndicator(boxScopeInstance, !immutableList.isEmpty(), OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState43).getUnderlyingQuoteStr(), invoke$lambda$70$lambda$69$lambda$68((SnapshotState4) objRememberedValue5), null, function0622, composer, 6, 8);
        composer2 = composer;
        composer2.startReplaceGroup(1923744284);
        if (OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$10(snapshotState3)) {
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(1923783858);
        if (optionChainTooltipBanner3 != null) {
        }
        composer.endReplaceGroup();
        composer.endNode();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$70$lambda$5$lambda$2$lambda$1(SnapshotState snapshotState, Offset offset) {
        OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$39(snapshotState, offset.getPackedValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$70$lambda$5$lambda$4$lambda$3(SnapshotState snapshotState, Offset offset) {
        OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$42(snapshotState, offset.getPackedValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$70$lambda$8$lambda$7(Integer num, LazyListState lazyListState, float f) {
        if (num == null) {
            return 0.0f;
        }
        if (num.intValue() < lazyListState.getFirstVisibleItemIndex()) {
            return 1.0f;
        }
        if (num.intValue() <= lazyListState.getFirstVisibleItemIndex() && f > 0.0f) {
            return ((Number) RangesKt.coerceIn(Float.valueOf(lazyListState.getFirstVisibleItemScrollOffset() / f), RangesKt.rangeTo(0.0f, 1.0f))).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$70$lambda$69$lambda$12(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$70$lambda$69$lambda$15(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$70$lambda$69$lambda$19$lambda$18(SnapshotState snapshotState) {
        invoke$lambda$70$lambda$69$lambda$12(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$70$lambda$69$lambda$22$lambda$21(SnapshotState snapshotState) {
        invoke$lambda$70$lambda$69$lambda$15(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$70$lambda$69$lambda$25$lambda$24(LazyListState lazyListState, float f) {
        return (int) ((((int) (lazyListState.getLayoutInfo().mo5206getViewportSizeYbymL2g() & 4294967295L)) - f) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$70$lambda$69$lambda$28$lambda$27(int i, LazyListState lazyListState, float f) {
        return (int) (((i / 2) - (i - ((int) (lazyListState.getLayoutInfo().mo5206getViewportSizeYbymL2g() & 4294967295L)))) - (f / 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$70$lambda$69$lambda$31$lambda$30(LazyListState lazyListState, float f) {
        return (int) ((((int) (lazyListState.getLayoutInfo().mo5206getViewportSizeYbymL2g() & 4294967295L)) - f) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$70$lambda$69$lambda$34$lambda$33(CoroutineScope coroutineScope, LazyListState lazyListState, Integer num, SnapshotState4 snapshotState4) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C24605x8af3c52e(lazyListState, num, snapshotState4, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$70$lambda$69$lambda$38$lambda$37(View view, OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, DragTarget dragTarget) {
        Intrinsics.checkNotNullParameter(dragTarget, "dragTarget");
        view.performHapticFeedback(1);
        optionSideBySideChainTableDuxo.bindInitialDragTarget$feature_options_chain_externalDebug(dragTarget);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$70$lambda$69$lambda$36$lambda$35(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, int i) {
        optionSideBySideChainTableDuxo.onDraggedIndexChanged(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$70$lambda$69$lambda$40$lambda$39(OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, boolean z) {
        optionSideBySideChainTableDuxo.onDragEnd();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$70$lambda$69$lambda$42$lambda$41(SnapshotState4 snapshotState4, boolean z, Function0 function0, Animatable animatable, OptionSideBySideChainDataState2 optionSideBySideChainDataState2, Brush brush, float f, Function3 function3, Function3 function32, Function3 function33, Function0 function02, OptionChainLaunchMode optionChainLaunchMode, SnapshotState4 snapshotState42, SnapshotState4 snapshotState43, SnapshotState4 snapshotState44, SnapshotState4 snapshotState45, SnapshotState4 snapshotState46, SnapshotState4 snapshotState47, OptionChainGestureAwareLazyColumn7 OptionChainGestureAwareLazyColumn) {
        Intrinsics.checkNotNullParameter(OptionChainGestureAwareLazyColumn, "$this$OptionChainGestureAwareLazyColumn");
        LazyListScope.items$default(OptionChainGestureAwareLazyColumn, OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$8(snapshotState4).getTableRowStates().size(), null, null, ComposableLambda3.composableLambdaInstance(97515943, true, new C24604xcef359e6(z, function0, animatable, optionSideBySideChainDataState2, brush, f, function3, function32, function33, OptionChainGestureAwareLazyColumn, function02, optionChainLaunchMode, snapshotState4, snapshotState42, snapshotState43, snapshotState44, snapshotState45, snapshotState46, snapshotState47)), 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer invoke$lambda$70$lambda$69$lambda$55$lambda$54(LazyListState lazyListState) {
        Object next;
        Iterator<T> it = lazyListState.getLayoutInfo().getVisibleItemsInfo().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((LazyListItemInfo) next).getOffset() >= lazyListState.getLayoutInfo().getViewportStartOffset()) {
                break;
            }
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
        if (lazyListItemInfo != null) {
            return Integer.valueOf(lazyListItemInfo.getIndex());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer invoke$lambda$70$lambda$69$lambda$59$lambda$58(LazyListState lazyListState) {
        LazyListItemInfo lazyListItemInfoPrevious;
        List<LazyListItemInfo> visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
        ListIterator<LazyListItemInfo> listIterator = visibleItemsInfo.listIterator(visibleItemsInfo.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lazyListItemInfoPrevious = null;
                break;
            }
            lazyListItemInfoPrevious = listIterator.previous();
            LazyListItemInfo lazyListItemInfo = lazyListItemInfoPrevious;
            if (lazyListItemInfo.getOffset() + lazyListItemInfo.getSize() <= lazyListState.getLayoutInfo().getViewportEndOffset()) {
                break;
            }
        }
        LazyListItemInfo lazyListItemInfo2 = lazyListItemInfoPrevious;
        if (lazyListItemInfo2 != null) {
            return Integer.valueOf(lazyListItemInfo2.getIndex());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$70$lambda$69$lambda$63$lambda$62(Integer num, SnapshotState4 snapshotState4) {
        Integer numInvoke$lambda$70$lambda$69$lambda$56;
        if (num != null && (numInvoke$lambda$70$lambda$69$lambda$56 = invoke$lambda$70$lambda$69$lambda$56(snapshotState4)) != null) {
            if (num.intValue() < numInvoke$lambda$70$lambda$69$lambda$56.intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$70$lambda$69$lambda$67$lambda$66(Integer num, SnapshotState4 snapshotState4) {
        Integer numInvoke$lambda$70$lambda$69$lambda$60;
        if (num != null && (numInvoke$lambda$70$lambda$69$lambda$60 = invoke$lambda$70$lambda$69$lambda$60(snapshotState4)) != null) {
            if (num.intValue() > numInvoke$lambda$70$lambda$69$lambda$60.intValue()) {
                return true;
            }
        }
        return false;
    }
}
