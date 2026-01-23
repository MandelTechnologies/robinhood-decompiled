package com.robinhood.android.optionschain.sbschain;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.sbschain.contracttype.OptionSideBySideChainContractTypePicker;
import com.robinhood.android.optionschain.sbschain.datepicker.OptionSideBySideChainExpDatePicker3;
import com.robinhood.android.optionschain.sbschain.table.BidAskCellDisableType;
import com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt;
import com.robinhood.android.optionschain.view.OptionChainTooltipBanner3;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$3 */
/* loaded from: classes11.dex */
final class C24342xbf880eae implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ ImmutableList<OptionChainExpirationDateState> $adjustedExpirationDateStates;
    final /* synthetic */ SnapshotState<TableHighlightPhase> $animationPhase$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ SnapshotState<Integer> $currentPageIndex$delegate;
    final /* synthetic */ Function0<Unit> $dismissSelloutSnackbarPermanently;
    final /* synthetic */ OptionSideBySideChainDuxo $duxo;
    final /* synthetic */ UUID $equityInstrumentId;
    final /* synthetic */ SnapshotState4<Event<OptionSideBySideChainEvent>> $event$delegate;
    final /* synthetic */ boolean $inSbsChainPerfExperiment;
    final /* synthetic */ SnapshotState<Boolean> $isTableReady$delegate;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ OptionSideBySideChainDataState4 $nuxMode;
    final /* synthetic */ Function1<OptionLegBundle, Unit> $onContractPcoButtonTapped;
    final /* synthetic */ Function0<Unit> $onEnableTradeOnExpiration;
    final /* synthetic */ Function1<Intent, Unit> $onLaunchOrderForm;
    final /* synthetic */ Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> $onWatchlistButtonTapped;
    final /* synthetic */ Function0<Unit> $showDiscoverZeroDteBottomSheetIfNotYet;
    final /* synthetic */ Function1<Instant, Unit> $showSelloutWarningSnackbar;
    final /* synthetic */ SnapshotState<ImmutableList<UiOptionStrategyLegDisplay>> $targetLegs$delegate;
    final /* synthetic */ SnapshotState<BigDecimal> $targetStrikePrice$delegate;
    final /* synthetic */ View $view;
    final /* synthetic */ SnapshotState4<OptionSideBySideChainViewState> $viewState$delegate;

    /* compiled from: OptionSideBySideChainComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$3$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BidAskCellDisableType.values().length];
            try {
                iArr[BidAskCellDisableType.CONTRACT_PCO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BidAskCellDisableType.PCO_NO_WATCHLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BidAskCellDisableType.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    C24342xbf880eae(OptionSideBySideChainDataState4 optionSideBySideChainDataState4, ImmutableList<OptionChainExpirationDateState> immutableList, Function1<? super OptionLegBundle, Unit> function1, Function0<Unit> function0, OptionSideBySideChainDuxo optionSideBySideChainDuxo, SnapshotState4<OptionSideBySideChainViewState> snapshotState4, Function1<? super Intent, Unit> function12, Navigator navigator, Context context, View view, UUID uuid, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, boolean z, Function0<Unit> function02, Function0<Unit> function03, Function1<? super Instant, Unit> function13, SnapshotState<Integer> snapshotState, SnapshotState4<Event<OptionSideBySideChainEvent>> snapshotState42, SnapshotState<ImmutableList<UiOptionStrategyLegDisplay>> snapshotState2, SnapshotState<BigDecimal> snapshotState3, SnapshotState<TableHighlightPhase> snapshotState5, SnapshotState<Boolean> snapshotState6) {
        this.$nuxMode = optionSideBySideChainDataState4;
        this.$adjustedExpirationDateStates = immutableList;
        this.$onContractPcoButtonTapped = function1;
        this.$dismissSelloutSnackbarPermanently = function0;
        this.$duxo = optionSideBySideChainDuxo;
        this.$viewState$delegate = snapshotState4;
        this.$onLaunchOrderForm = function12;
        this.$navigator = navigator;
        this.$context = context;
        this.$view = view;
        this.$equityInstrumentId = uuid;
        this.$onWatchlistButtonTapped = function3;
        this.$inSbsChainPerfExperiment = z;
        this.$onEnableTradeOnExpiration = function02;
        this.$showDiscoverZeroDteBottomSheetIfNotYet = function03;
        this.$showSelloutWarningSnackbar = function13;
        this.$currentPageIndex$delegate = snapshotState;
        this.$event$delegate = snapshotState42;
        this.$targetLegs$delegate = snapshotState2;
        this.$targetStrikePrice$delegate = snapshotState3;
        this.$animationPhase$delegate = snapshotState5;
        this.$isTableReady$delegate = snapshotState6;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x050f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        SnapshotState4<OptionSideBySideChainViewState> snapshotState4;
        OptionSideBySideChainDataState4 optionSideBySideChainDataState4;
        int i3;
        Object obj;
        Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> function3;
        Function3 function32;
        OptionChainExpirationDateState optionChainExpirationDateState;
        boolean zChangedInstance;
        boolean z;
        boolean zChangedInstance2;
        Object objRememberedValue;
        boolean zChangedInstance3;
        Object objRememberedValue2;
        boolean zChangedInstance4;
        Object objRememberedValue3;
        boolean zChangedInstance5;
        Object objRememberedValue4;
        Iterator it;
        Object objRememberedValue5;
        Composer.Companion companion;
        Object objRememberedValue6;
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
            ComposerKt.traceEventStart(914635337, i2, -1, "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposable.<anonymous>.<anonymous> (OptionSideBySideChainComposable.kt:178)");
        }
        final OptionSideBySideChainDataState4 optionSideBySideChainDataState42 = this.$nuxMode;
        ImmutableList<OptionChainExpirationDateState> immutableList = this.$adjustedExpirationDateStates;
        final Function1<OptionLegBundle, Unit> function1 = this.$onContractPcoButtonTapped;
        final Function0<Unit> function0 = this.$dismissSelloutSnackbarPermanently;
        final OptionSideBySideChainDuxo optionSideBySideChainDuxo = this.$duxo;
        final SnapshotState4<OptionSideBySideChainViewState> snapshotState42 = this.$viewState$delegate;
        final Function1<Intent, Unit> function12 = this.$onLaunchOrderForm;
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        final View view = this.$view;
        UUID uuid = this.$equityInstrumentId;
        Function3<Boolean, OptionLegBundle, BidAskCellDisableType, Unit> function33 = this.$onWatchlistButtonTapped;
        boolean z2 = this.$inSbsChainPerfExperiment;
        Function0<Unit> function02 = this.$onEnableTradeOnExpiration;
        Function0<Unit> function03 = this.$showDiscoverZeroDteBottomSheetIfNotYet;
        Function1<Instant, Unit> function13 = this.$showSelloutWarningSnackbar;
        final SnapshotState<Integer> snapshotState = this.$currentPageIndex$delegate;
        SnapshotState4<Event<OptionSideBySideChainEvent>> snapshotState43 = this.$event$delegate;
        final SnapshotState<ImmutableList<UiOptionStrategyLegDisplay>> snapshotState2 = this.$targetLegs$delegate;
        SnapshotState<BigDecimal> snapshotState3 = this.$targetStrikePrice$delegate;
        SnapshotState<TableHighlightPhase> snapshotState5 = this.$animationPhase$delegate;
        final SnapshotState<Boolean> snapshotState6 = this.$isTableReady$delegate;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion2);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), paddingValues);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierPadding);
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
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        composer2.startReplaceGroup(-1850784356);
        Integer numOptionSideBySideChainComposable$lambda$4 = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$4(snapshotState);
        if (numOptionSideBySideChainComposable$lambda$4 != null) {
            int iIntValue = numOptionSideBySideChainComposable$lambda$4.intValue();
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, companion2);
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
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            composer2.startReplaceGroup(5004770);
            Object objRememberedValue7 = composer2.rememberedValue();
            Composer.Companion companion5 = Composer.INSTANCE;
            if (objRememberedValue7 == companion5.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C24342xbf880eae.invoke$lambda$25$lambda$23$lambda$3$lambda$1$lambda$0(snapshotState, ((Integer) obj2).intValue());
                    }
                };
                composer2.updateRememberedValue(objRememberedValue7);
            }
            composer2.endReplaceGroup();
            OptionSideBySideChainExpDatePicker3.OptionSideBySideChainExpDatePicker(immutableList, iIntValue, (Function1) objRememberedValue7, composer2, OptionChainExpirationDateState.$stable | 384);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), composer2, 0);
            OptionSideBySideChainDataState2 callPutSwitcherState = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState42).getCallPutSwitcherState();
            composer2.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composer2.changedInstance(optionSideBySideChainDuxo);
            Object objRememberedValue8 = composer2.rememberedValue();
            if (zChangedInstance6 || objRememberedValue8 == companion5.getEmpty()) {
                objRememberedValue8 = new C24343x621aef30(optionSideBySideChainDuxo);
                composer2.updateRememberedValue(objRememberedValue8);
            }
            composer2.endReplaceGroup();
            OptionSideBySideChainContractTypePicker.OptionSideBySideChainContractTypePicker(callPutSwitcherState, (Function1) ((KFunction) objRememberedValue8), composer2, 0);
            composer2.endNode();
            OptionChainExpirationDateState optionChainExpirationDateState2 = (OptionChainExpirationDateState) CollectionsKt.getOrNull(immutableList, iIntValue);
            if (optionChainExpirationDateState2 == null) {
                composer2.endReplaceGroup();
                snapshotState4 = snapshotState42;
                optionSideBySideChainDataState4 = optionSideBySideChainDataState42;
                i3 = 1;
            } else {
                composer2.startReplaceGroup(-1224400529);
                boolean zChanged = composer2.changed(function1) | composer2.changed(function0) | composer2.changed(optionSideBySideChainDataState42.ordinal()) | composer2.changedInstance(optionSideBySideChainDuxo) | composer2.changed(snapshotState42) | composer2.changed(function12) | composer2.changedInstance(navigator) | composer2.changedInstance(context);
                Object objRememberedValue9 = composer2.rememberedValue();
                if (zChanged || objRememberedValue9 == companion5.getEmpty()) {
                    function3 = function33;
                    function32 = null;
                    obj = new Function3() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            return C24342xbf880eae.invoke$lambda$25$lambda$23$lambda$7$lambda$6(function1, function0, optionSideBySideChainDataState42, optionSideBySideChainDuxo, snapshotState42, function12, navigator, context, ((Boolean) obj2).booleanValue(), (OptionLegBundle) obj3, (BidAskCellDisableType) obj4);
                        }
                    };
                    optionSideBySideChainDataState4 = optionSideBySideChainDataState42;
                    optionSideBySideChainDuxo = optionSideBySideChainDuxo;
                    composer2.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue9;
                    function32 = null;
                    optionSideBySideChainDataState4 = optionSideBySideChainDataState42;
                    function3 = function33;
                }
                final Function3 function34 = (Function3) obj;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1224400529);
                boolean zChangedInstance7 = composer2.changedInstance(optionSideBySideChainDuxo) | composer2.changed(function0) | composer2.changed(snapshotState42) | composer2.changedInstance(view) | composer2.changed(function34);
                Object objRememberedValue10 = composer2.rememberedValue();
                if (zChangedInstance7 || objRememberedValue10 == companion5.getEmpty()) {
                    Function3 function35 = new Function3() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$3$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            return C24342xbf880eae.invoke$lambda$25$lambda$23$lambda$9$lambda$8(optionSideBySideChainDuxo, function0, view, function34, snapshotState42, ((Boolean) obj2).booleanValue(), (OptionLegBundle) obj3, (BidAskCellDisableType) obj4);
                        }
                    };
                    snapshotState4 = snapshotState42;
                    composer2.updateRememberedValue(function35);
                    objRememberedValue10 = function35;
                } else {
                    snapshotState4 = snapshotState42;
                }
                Function3 function36 = (Function3) objRememberedValue10;
                composer2.endReplaceGroup();
                ImmutableList<OptionLegBundle> selectedLegs = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getSelectedLegs();
                boolean selloutSnackbarDismissedOrElapsed = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getSelloutSnackbarDismissedOrElapsed();
                OptionSideBySideChainDataState2 callPutSwitcherState2 = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getCallPutSwitcherState();
                Event eventOptionSideBySideChainComposable$lambda$1 = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$1(snapshotState43);
                OptionSideBySideChainDataState7 tooltipState = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getTooltipState();
                OptionChainTooltipBanner3 topTooltipBannerType = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getTopTooltipBannerType();
                OptionChainLaunchMode launchMode = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getLaunchMode();
                if (OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getMultilegAvailable()) {
                    function36 = function32;
                }
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance8 = composer2.changedInstance(optionSideBySideChainDuxo);
                Object objRememberedValue11 = composer2.rememberedValue();
                if (zChangedInstance8 || objRememberedValue11 == companion5.getEmpty()) {
                    objRememberedValue11 = new C24344x380b3ee4(optionSideBySideChainDuxo);
                    composer2.updateRememberedValue(objRememberedValue11);
                }
                KFunction kFunction = (KFunction) objRememberedValue11;
                composer2.endReplaceGroup();
                OptionSideBySideChainDataState5 eduFooterAnimationState = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getEduFooterAnimationState();
                boolean zIsSelloutSnackbarDismissalExperimentEnabled = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).isSelloutSnackbarDismissalExperimentEnabled();
                composer2.startReplaceGroup(5004770);
                boolean zChangedInstance9 = composer2.changedInstance(optionSideBySideChainDuxo);
                Object objRememberedValue12 = composer2.rememberedValue();
                if (zChangedInstance9) {
                    optionChainExpirationDateState = optionChainExpirationDateState2;
                } else {
                    optionChainExpirationDateState = optionChainExpirationDateState2;
                    if (objRememberedValue12 == companion5.getEmpty()) {
                    }
                    KFunction kFunction2 = (KFunction) objRememberedValue12;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    zChangedInstance = composer2.changedInstance(optionSideBySideChainDuxo);
                    Object objRememberedValue13 = composer2.rememberedValue();
                    if (zChangedInstance) {
                        z = selloutSnackbarDismissedOrElapsed;
                        if (objRememberedValue13 == companion5.getEmpty()) {
                        }
                        KFunction kFunction3 = (KFunction) objRememberedValue13;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(5004770);
                        zChangedInstance2 = composer2.changedInstance(optionSideBySideChainDuxo);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue == companion5.getEmpty()) {
                            objRememberedValue = new C24347x380b4a27(optionSideBySideChainDuxo);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        KFunction kFunction4 = (KFunction) objRememberedValue;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(5004770);
                        zChangedInstance3 = composer2.changedInstance(optionSideBySideChainDuxo);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (!zChangedInstance3 || objRememberedValue2 == companion5.getEmpty()) {
                            objRememberedValue2 = new C24348x380b4de8(optionSideBySideChainDuxo);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        KFunction kFunction5 = (KFunction) objRememberedValue2;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(5004770);
                        zChangedInstance4 = composer2.changedInstance(optionSideBySideChainDuxo);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (!zChangedInstance4 || objRememberedValue3 == companion5.getEmpty()) {
                            objRememberedValue3 = new C24349x380b51a9(optionSideBySideChainDuxo);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        KFunction kFunction6 = (KFunction) objRememberedValue3;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(5004770);
                        zChangedInstance5 = composer2.changedInstance(optionSideBySideChainDuxo);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (!zChangedInstance5 || objRememberedValue4 == companion5.getEmpty()) {
                            objRememberedValue4 = new C24350x380b556a(optionSideBySideChainDuxo);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        KFunction kFunction7 = (KFunction) objRememberedValue4;
                        composer2.endReplaceGroup();
                        ImmutableList immutableListOptionSideBySideChainComposable$lambda$7 = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$7(snapshotState2);
                        ArrayList arrayList = new ArrayList();
                        it = immutableListOptionSideBySideChainComposable$lambda$7.iterator();
                        while (it.hasNext()) {
                            KFunction kFunction8 = kFunction7;
                            Object next = it.next();
                            Iterator it2 = it;
                            ImmutableList<OptionLegBundle> immutableList2 = selectedLegs;
                            if (Intrinsics.areEqual(optionChainExpirationDateState.getExpirationDate(), ((UiOptionStrategyLegDisplay) next).getExpirationDate())) {
                                arrayList.add(next);
                            }
                            kFunction7 = kFunction8;
                            it = it2;
                            selectedLegs = immutableList2;
                        }
                        KFunction kFunction9 = kFunction7;
                        ImmutableList<OptionLegBundle> immutableList3 = selectedLegs;
                        ImmutableList immutableList4 = extensions2.toImmutableList(arrayList);
                        BigDecimal bigDecimalOptionSideBySideChainComposable$lambda$10 = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$10(snapshotState3);
                        boolean hasSeenLottieNuxAnimation = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getHasSeenLottieNuxAnimation();
                        boolean zIsNuxSearchDismissed = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).isNuxSearchDismissed();
                        TableHighlightPhase tableHighlightPhaseOptionSideBySideChainComposable$lambda$41$lambda$27 = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$41$lambda$27(snapshotState5);
                        composer2.startReplaceGroup(5004770);
                        objRememberedValue5 = composer2.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$3$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return C24342xbf880eae.invoke$lambda$25$lambda$23$lambda$20$lambda$19(snapshotState6, ((Boolean) obj2).booleanValue());
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        Function1 function14 = (Function1) objRememberedValue5;
                        composer2.endReplaceGroup();
                        Function1 function15 = (Function1) kFunction;
                        composer2.startReplaceGroup(5004770);
                        objRememberedValue6 = composer2.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$3$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C24342xbf880eae.invoke$lambda$25$lambda$23$lambda$22$lambda$21(snapshotState2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        composer2.endReplaceGroup();
                        i3 = 1;
                        OptionSideBySideChainTableKt.OptionSideBySideChainTable(uuid, optionChainExpirationDateState, immutableList3, z, optionSideBySideChainDataState4, hasSeenLottieNuxAnimation, zIsNuxSearchDismissed, callPutSwitcherState2, eventOptionSideBySideChainComposable$lambda$1, tooltipState, topTooltipBannerType, immutableList4, bigDecimalOptionSideBySideChainComposable$lambda$10, launchMode, function34, function3, function36, tableHighlightPhaseOptionSideBySideChainComposable$lambda$41$lambda$27, eduFooterAnimationState, z2, function14, function15, function02, (Function0) objRememberedValue6, function03, function13, zIsSelloutSnackbarDismissalExperimentEnabled, (Function1) kFunction2, (Function1) kFunction3, (Function0) kFunction4, (Function1) kFunction5, (Function1) kFunction6, (Function1) kFunction9, null, composer2, OptionChainExpirationDateState.$stable << 3, 0, 3078, 0, 0, 4);
                        composer2 = composer2;
                        composer2.endReplaceGroup();
                    } else {
                        z = selloutSnackbarDismissedOrElapsed;
                    }
                    objRememberedValue13 = new C24346x380b4666(optionSideBySideChainDuxo);
                    composer2.updateRememberedValue(objRememberedValue13);
                    KFunction kFunction32 = (KFunction) objRememberedValue13;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    zChangedInstance2 = composer2.changedInstance(optionSideBySideChainDuxo);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance2) {
                        objRememberedValue = new C24347x380b4a27(optionSideBySideChainDuxo);
                        composer2.updateRememberedValue(objRememberedValue);
                        KFunction kFunction42 = (KFunction) objRememberedValue;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(5004770);
                        zChangedInstance3 = composer2.changedInstance(optionSideBySideChainDuxo);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (!zChangedInstance3) {
                            objRememberedValue2 = new C24348x380b4de8(optionSideBySideChainDuxo);
                            composer2.updateRememberedValue(objRememberedValue2);
                            KFunction kFunction52 = (KFunction) objRememberedValue2;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(5004770);
                            zChangedInstance4 = composer2.changedInstance(optionSideBySideChainDuxo);
                            objRememberedValue3 = composer2.rememberedValue();
                            if (!zChangedInstance4) {
                                objRememberedValue3 = new C24349x380b51a9(optionSideBySideChainDuxo);
                                composer2.updateRememberedValue(objRememberedValue3);
                                KFunction kFunction62 = (KFunction) objRememberedValue3;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(5004770);
                                zChangedInstance5 = composer2.changedInstance(optionSideBySideChainDuxo);
                                objRememberedValue4 = composer2.rememberedValue();
                                if (!zChangedInstance5) {
                                    objRememberedValue4 = new C24350x380b556a(optionSideBySideChainDuxo);
                                    composer2.updateRememberedValue(objRememberedValue4);
                                    KFunction kFunction72 = (KFunction) objRememberedValue4;
                                    composer2.endReplaceGroup();
                                    ImmutableList immutableListOptionSideBySideChainComposable$lambda$72 = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$7(snapshotState2);
                                    ArrayList arrayList2 = new ArrayList();
                                    it = immutableListOptionSideBySideChainComposable$lambda$72.iterator();
                                    while (it.hasNext()) {
                                    }
                                    KFunction kFunction92 = kFunction72;
                                    ImmutableList<OptionLegBundle> immutableList32 = selectedLegs;
                                    ImmutableList immutableList42 = extensions2.toImmutableList(arrayList2);
                                    BigDecimal bigDecimalOptionSideBySideChainComposable$lambda$102 = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$10(snapshotState3);
                                    boolean hasSeenLottieNuxAnimation2 = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getHasSeenLottieNuxAnimation();
                                    boolean zIsNuxSearchDismissed2 = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).isNuxSearchDismissed();
                                    TableHighlightPhase tableHighlightPhaseOptionSideBySideChainComposable$lambda$41$lambda$272 = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$41$lambda$27(snapshotState5);
                                    composer2.startReplaceGroup(5004770);
                                    objRememberedValue5 = composer2.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue5 == companion.getEmpty()) {
                                    }
                                    Function1 function142 = (Function1) objRememberedValue5;
                                    composer2.endReplaceGroup();
                                    Function1 function152 = (Function1) kFunction;
                                    composer2.startReplaceGroup(5004770);
                                    objRememberedValue6 = composer2.rememberedValue();
                                    if (objRememberedValue6 == companion.getEmpty()) {
                                    }
                                    composer2.endReplaceGroup();
                                    i3 = 1;
                                    OptionSideBySideChainTableKt.OptionSideBySideChainTable(uuid, optionChainExpirationDateState, immutableList32, z, optionSideBySideChainDataState4, hasSeenLottieNuxAnimation2, zIsNuxSearchDismissed2, callPutSwitcherState2, eventOptionSideBySideChainComposable$lambda$1, tooltipState, topTooltipBannerType, immutableList42, bigDecimalOptionSideBySideChainComposable$lambda$102, launchMode, function34, function3, function36, tableHighlightPhaseOptionSideBySideChainComposable$lambda$41$lambda$272, eduFooterAnimationState, z2, function142, function152, function02, (Function0) objRememberedValue6, function03, function13, zIsSelloutSnackbarDismissalExperimentEnabled, (Function1) kFunction2, (Function1) kFunction32, (Function0) kFunction42, (Function1) kFunction52, (Function1) kFunction62, (Function1) kFunction92, null, composer2, OptionChainExpirationDateState.$stable << 3, 0, 3078, 0, 0, 4);
                                    composer2 = composer2;
                                    composer2.endReplaceGroup();
                                }
                            }
                        }
                    }
                }
                objRememberedValue12 = new C24345x380b42a5(optionSideBySideChainDuxo);
                composer2.updateRememberedValue(objRememberedValue12);
                KFunction kFunction22 = (KFunction) objRememberedValue12;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                zChangedInstance = composer2.changedInstance(optionSideBySideChainDuxo);
                Object objRememberedValue132 = composer2.rememberedValue();
                if (zChangedInstance) {
                }
                objRememberedValue132 = new C24346x380b4666(optionSideBySideChainDuxo);
                composer2.updateRememberedValue(objRememberedValue132);
                KFunction kFunction322 = (KFunction) objRememberedValue132;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(5004770);
                zChangedInstance2 = composer2.changedInstance(optionSideBySideChainDuxo);
                objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance2) {
                }
            }
        } else {
            snapshotState4 = snapshotState42;
            optionSideBySideChainDataState4 = optionSideBySideChainDataState42;
            i3 = 1;
            composer2.endReplaceGroup();
        }
        composer2.endNode();
        composer2.startReplaceGroup(1601272034);
        if (!OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).isEduFooterAnimationDismissed() && ((OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getEduFooterAnimationState() == OptionSideBySideChainDataState5.NOT_PLAYING || OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getEduFooterAnimationState() == OptionSideBySideChainDataState5.PLAYING) && optionSideBySideChainDataState4 == OptionSideBySideChainDataState4.SBS_NUX_REVAMP && OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getHasSeenLottieNuxAnimation() && (OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getLaunchMode() instanceof OptionChainLaunchMode.Normal))) {
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, i3, null);
            Unit unit = Unit.INSTANCE;
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue14 = composer2.rememberedValue();
            if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue14 = C24351xc573e7d6.INSTANCE;
                composer2.updateRememberedValue(objRememberedValue14);
            }
            composer2.endReplaceGroup();
            BoxKt.Box(SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxSize$default, unit, (PointerInputEventHandler) objRememberedValue14), composer2, 0);
        }
        composer2.endReplaceGroup();
        composer2.endNode();
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
    public static final Unit invoke$lambda$25$lambda$23$lambda$3$lambda$1$lambda$0(SnapshotState snapshotState, int i) {
        snapshotState.setValue(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$25$lambda$23$lambda$7$lambda$6(Function1 function1, Function0 function0, OptionSideBySideChainDataState4 optionSideBySideChainDataState4, OptionSideBySideChainDuxo optionSideBySideChainDuxo, SnapshotState4 snapshotState4, Function1 function12, Navigator navigator, Context context, boolean z, OptionLegBundle optionLegBundle, BidAskCellDisableType bidAskCellDisableType) {
        OptionOrderIntentKey.FromOptionOrderBundle singleLegOptionOrderIntent;
        int i = bidAskCellDisableType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bidAskCellDisableType.ordinal()];
        if (i == -1) {
            function0.invoke();
            if (optionSideBySideChainDataState4 == OptionSideBySideChainDataState4.SBS_NUX_REVAMP) {
                optionSideBySideChainDuxo.dismissEduFooterAnimation();
            }
            if (OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getMultilegAvailable() || z) {
                optionSideBySideChainDuxo.logTapLegCell(optionLegBundle);
                optionSideBySideChainDuxo.onBidAskCellSingleTap(z, optionLegBundle);
            } else {
                optionSideBySideChainDuxo.logTapLegCell(optionLegBundle);
                optionSideBySideChainDuxo.clearSelectedLegs();
                if (optionLegBundle != null && (singleLegOptionOrderIntent = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getSingleLegOptionOrderIntent(optionLegBundle)) != null) {
                    function12.invoke(Navigator.DefaultImpls.createIntent$default(navigator, context, singleLegOptionOrderIntent, null, false, 12, null));
                }
            }
        } else if (i == 1) {
            function1.invoke(optionLegBundle);
        } else if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$25$lambda$23$lambda$9$lambda$8(OptionSideBySideChainDuxo optionSideBySideChainDuxo, Function0 function0, View view, Function3 function3, SnapshotState4 snapshotState4, boolean z, OptionLegBundle optionLegBundle, BidAskCellDisableType bidAskCellDisableType) {
        optionSideBySideChainDuxo.recordUserLongPressed();
        function0.invoke();
        if (!OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(snapshotState4).getMultilegAvailable()) {
            if (bidAskCellDisableType == null) {
                view.performHapticFeedback(1);
                optionSideBySideChainDuxo.onBidAskCellSingleTap(z, optionLegBundle);
            } else {
                function3.invoke(Boolean.valueOf(z), optionLegBundle, bidAskCellDisableType);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$25$lambda$23$lambda$22$lambda$21(SnapshotState snapshotState) {
        snapshotState.setValue(extensions2.persistentListOf());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$25$lambda$23$lambda$20$lambda$19(SnapshotState snapshotState, boolean z) {
        OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$41$lambda$31(snapshotState, z);
        return Unit.INSTANCE;
    }
}
