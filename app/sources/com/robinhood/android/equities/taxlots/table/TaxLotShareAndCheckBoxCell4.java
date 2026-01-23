package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.taxlots.alert.TaxLotsIntraDayLotAlert;
import com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlert;
import com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCell4;
import com.robinhood.android.equities.taxlots.utils.TaxLotsSharesBentoNumpadTextInputFormatter;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadTextInput;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.TaxLotSelection;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TaxLotShareAndCheckBoxCell.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$TaxLotsShareAndCheckBoxComposable$2, reason: use source file name */
/* loaded from: classes3.dex */
final class TaxLotShareAndCheckBoxCell4 implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ BentoNumpadScopeV2 $bentoNumpadScopeV2;
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ C2002Dp $height;
    final /* synthetic */ Function1<BigDecimal, Unit> $invalidNumberOfSharesCallback;
    final /* synthetic */ float $maxForScreenWidth;
    final /* synthetic */ int $rowIndex;
    final /* synthetic */ Function1<Boolean, Unit> $setKeyboardVisible;
    final /* synthetic */ boolean $stickyColumn;
    final /* synthetic */ TaxLotsShareAndCheckBoxCell $taxLotsShareAndCheckBoxCell;
    final /* synthetic */ C2002Dp $width;

    /* JADX WARN: Multi-variable type inference failed */
    TaxLotShareAndCheckBoxCell4(TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell, C2002Dp c2002Dp, BentoNumpadScopeV2 bentoNumpadScopeV2, Function1<? super BigDecimal, Unit> function1, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function1<? super Boolean, Unit> function12, float f, boolean z, int i, C2002Dp c2002Dp2) {
        this.$taxLotsShareAndCheckBoxCell = taxLotsShareAndCheckBoxCell;
        this.$width = c2002Dp;
        this.$bentoNumpadScopeV2 = bentoNumpadScopeV2;
        this.$invalidNumberOfSharesCallback = function1;
        this.$eventLogger = eventLogger;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$setKeyboardVisible = function12;
        this.$maxForScreenWidth = f;
        this.$stickyColumn = z;
        this.$rowIndex = i;
        this.$height = c2002Dp2;
    }

    /* compiled from: TaxLotShareAndCheckBoxCell.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$TaxLotsShareAndCheckBoxComposable$2$3 */
    static final class C149593 implements Function5<TextFieldValue, InteractionSource3, Function1<? super TextFieldValue, ? extends Unit>, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<Boolean> $displayAlert$delegate;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ C2002Dp $height;
        final /* synthetic */ Function1<BigDecimal, Unit> $invalidNumberOfSharesCallback;
        final /* synthetic */ float $maxForScreenWidth;
        final /* synthetic */ int $rowIndex;
        final /* synthetic */ Function1<Boolean, Unit> $setKeyboardVisible;
        final /* synthetic */ SnapshotState<Boolean> $showIntraDayLotAlert$delegate;
        final /* synthetic */ SnapshotState<Boolean> $showMaxSelectedLotsAlert$delegate;
        final /* synthetic */ boolean $stickyColumn;
        final /* synthetic */ TaxLotsShareAndCheckBoxCell $taxLotsShareAndCheckBoxCell;
        final /* synthetic */ C2002Dp $width;

        /* compiled from: TaxLotShareAndCheckBoxCell.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$TaxLotsShareAndCheckBoxComposable$2$3$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ToggleableState.values().length];
                try {
                    iArr[ToggleableState.f174On.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ToggleableState.Indeterminate.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ToggleableState.Off.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C149593(Function1<? super BigDecimal, Unit> function1, TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, C2002Dp c2002Dp, Function1<? super Boolean, Unit> function12, float f, boolean z, int i, C2002Dp c2002Dp2, SnapshotState4<Boolean> snapshotState4, FocusManager focusManager, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2) {
            this.$invalidNumberOfSharesCallback = function1;
            this.$taxLotsShareAndCheckBoxCell = taxLotsShareAndCheckBoxCell;
            this.$eventLogger = eventLogger;
            this.$eventDescriptor = userInteractionEventDescriptor;
            this.$width = c2002Dp;
            this.$setKeyboardVisible = function12;
            this.$maxForScreenWidth = f;
            this.$stickyColumn = z;
            this.$rowIndex = i;
            this.$height = c2002Dp2;
            this.$displayAlert$delegate = snapshotState4;
            this.$focusManager = focusManager;
            this.$showIntraDayLotAlert$delegate = snapshotState;
            this.$showMaxSelectedLotsAlert$delegate = snapshotState2;
        }

        private static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$5(SnapshotState4<Boolean> snapshotState4) {
            return snapshotState4.getValue().booleanValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(final TextFieldValue value, InteractionSource3 interactionSource, final Function1<? super TextFieldValue, Unit> onValueChange, Composer composer, int i) {
            int i2;
            int i3;
            final SnapshotState snapshotState;
            boolean z;
            Context context;
            UserInteractionEventDescriptor userInteractionEventDescriptor;
            C2002Dp c2002Dp;
            Function1<Boolean, Unit> function1;
            final SnapshotState<Boolean> snapshotState2;
            Function1<Boolean, Unit> function12;
            Context contextCopy$default;
            UserInteractionEventData.Action action;
            EquityOrderContext equity_order_context;
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            if ((i & 6) == 0) {
                i2 = (composer.changed(value) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(interactionSource) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changedInstance(onValueChange) ? 256 : 128;
            }
            int i4 = i2;
            if ((i4 & 1171) == 1170 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-268402873, i4, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsShareAndCheckBoxComposable.<anonymous>.<anonymous> (TaxLotShareAndCheckBoxCell.kt:125)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            int i5 = i4 & 14;
            boolean z2 = i5 == 4;
            final TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell = this.$taxLotsShareAndCheckBoxCell;
            Object objRememberedValue2 = composer.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$TaxLotsShareAndCheckBoxComposable$2$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(TaxLotShareAndCheckBoxCell4.C149593.invoke$lambda$4$lambda$3(value, taxLotsShareAndCheckBoxCell));
                    }
                });
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
            composer.endReplaceGroup();
            Boolean boolValueOf = Boolean.valueOf(invoke$lambda$5(snapshotState4));
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(snapshotState4) | composer.changed(this.$invalidNumberOfSharesCallback) | composer.changedInstance(this.$taxLotsShareAndCheckBoxCell);
            Function1<BigDecimal, Unit> function13 = this.$invalidNumberOfSharesCallback;
            TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell2 = this.$taxLotsShareAndCheckBoxCell;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new TaxLotShareAndCheckBoxCell5(function13, taxLotsShareAndCheckBoxCell2, snapshotState4, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i6).m21590getDefaultD9Ej5fM(), 1, null), bentoTheme.getSpacing(composer, i6).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i6).m21590getDefaultD9Ej5fM(), 0.0f, 10, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            final TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell3 = this.$taxLotsShareAndCheckBoxCell;
            final EventLogger eventLogger = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
            final C2002Dp c2002Dp2 = this.$width;
            final Function1<Boolean, Unit> function14 = this.$setKeyboardVisible;
            float f = this.$maxForScreenWidth;
            boolean z3 = this.$stickyColumn;
            int i7 = this.$rowIndex;
            C2002Dp c2002Dp3 = this.$height;
            SnapshotState4<Boolean> snapshotState42 = this.$displayAlert$delegate;
            final FocusManager focusManager = this.$focusManager;
            final SnapshotState<Boolean> snapshotState5 = this.$showIntraDayLotAlert$delegate;
            SnapshotState<Boolean> snapshotState6 = this.$showMaxSelectedLotsAlert$delegate;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composer.startReplaceGroup(761197850);
            composer.startReplaceGroup(-1224400529);
            int i8 = i4 & 896;
            boolean zChangedInstance = (i5 == 4) | composer.changedInstance(taxLotsShareAndCheckBoxCell3) | composer.changedInstance(eventLogger) | composer.changedInstance(userInteractionEventDescriptor2) | composer.changed(c2002Dp2) | composer.changed(function14) | composer.changed(snapshotState4) | (i8 == 256);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                i3 = i6;
                snapshotState = snapshotState3;
                z = false;
                context = null;
                Object obj = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$TaxLotsShareAndCheckBoxComposable$2$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return TaxLotShareAndCheckBoxCell4.C149593.invoke$lambda$14$lambda$8$lambda$7(taxLotsShareAndCheckBoxCell3, eventLogger, userInteractionEventDescriptor2, value, c2002Dp2, function14, onValueChange, snapshotState, snapshotState4, (FocusState) obj2);
                    }
                };
                userInteractionEventDescriptor = userInteractionEventDescriptor2;
                c2002Dp = c2002Dp2;
                function1 = function14;
                composer.updateRememberedValue(obj);
                objRememberedValue4 = obj;
            } else {
                userInteractionEventDescriptor = userInteractionEventDescriptor2;
                c2002Dp = c2002Dp2;
                function1 = function14;
                i3 = i6;
                snapshotState = snapshotState3;
                z = false;
                context = null;
            }
            composer.endReplaceGroup();
            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(FocusChangedModifier2.onFocusChanged(companion2, (Function1) objRememberedValue4), C2002Dp.m7995constructorimpl(f));
            if (TaxLotShareAndCheckBoxCell4.invoke$lambda$2(snapshotState42)) {
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance2 = composer.changedInstance(taxLotsShareAndCheckBoxCell3) | composer.changedInstance(focusManager) | composer.changed(function1);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                    final Function1<Boolean, Unit> function15 = function1;
                    snapshotState2 = snapshotState6;
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$TaxLotsShareAndCheckBoxComposable$2$3$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaxLotShareAndCheckBoxCell4.C149593.invoke$lambda$14$lambda$11$lambda$10$lambda$9(taxLotsShareAndCheckBoxCell3, focusManager, function15, snapshotState5, snapshotState2);
                        }
                    };
                    function12 = function15;
                    composer.updateRememberedValue(objRememberedValue5);
                } else {
                    snapshotState2 = snapshotState6;
                    function12 = function1;
                }
                composer.endReplaceGroup();
                modifierM5174width3ABfNKs = ClickableKt.m4893clickableXHw0xAI$default(modifierM5174width3ABfNKs, false, null, null, (Function0) objRememberedValue5, 7, null);
            } else {
                snapshotState2 = snapshotState6;
                function12 = function1;
            }
            Modifier modifier = modifierM5174width3ABfNKs;
            composer.endReplaceGroup();
            boolean zInvoke$lambda$2 = TaxLotShareAndCheckBoxCell4.invoke$lambda$2(snapshotState42);
            BigDecimal originalShareValue = taxLotsShareAndCheckBoxCell3.getOriginalShareValue();
            boolean zInvoke$lambda$5 = invoke$lambda$5(snapshotState4);
            final SnapshotState<Boolean> snapshotState7 = snapshotState2;
            TaxLotsShareCell.TaxLotsSharesComposable(originalShareValue, value, interactionSource, taxLotsShareAndCheckBoxCell3.getToggleableState() != ToggleableState.Off ? true : z, invoke$lambda$1(snapshotState), zInvoke$lambda$5, zInvoke$lambda$2, onValueChange, z3, i7, modifier, composer, ((i4 << 3) & 1008) | ((i4 << 15) & 29360128), 0, 0);
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            Context context2 = userInteractionEventDescriptor.getContext();
            if (context2 != null) {
                Context context3 = userInteractionEventDescriptor.getContext();
                contextCopy$default = Context.copy$default(context2, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (context3 == null || (equity_order_context = context3.getEquity_order_context()) == null) ? context : equity_order_context.copy((493567 & 1) != 0 ? equity_order_context.instrument_id : null, (493567 & 2) != 0 ? equity_order_context.symbol : null, (493567 & 4) != 0 ? equity_order_context.side : null, (493567 & 8) != 0 ? equity_order_context.type : null, (493567 & 16) != 0 ? equity_order_context.trigger : null, (493567 & 32) != 0 ? equity_order_context.is_dollar_based_amount : null, (493567 & 64) != 0 ? equity_order_context.is_trailing_order : null, (493567 & 128) != 0 ? equity_order_context.is_preset_percent_limit_order : null, (493567 & 256) != 0 ? equity_order_context.market_hours : null, (493567 & 512) != 0 ? equity_order_context.bid_price : null, (493567 & 1024) != 0 ? equity_order_context.ask_price : null, (493567 & 2048) != 0 ? equity_order_context.bid_ask_timestamp : null, (493567 & 4096) != 0 ? equity_order_context.quote_last_cache_timestamp : null, (493567 & 8192) != 0 ? equity_order_context.tax_lot_selections : null, (493567 & 16384) != 0 ? equity_order_context.tax_lots_context : new TaxLotsContext(null, null, new TaxLotSelection(taxLotsShareAndCheckBoxCell3.getLotId(), 0.0d, taxLotsShareAndCheckBoxCell3.getOriginalShareValue().doubleValue(), TaxLotShareAndCheckBoxCell3.toLoggable(taxLotsShareAndCheckBoxCell3.getToggleableState()), null, 18, null), null, 0.0d, 0.0d, 0.0d, null, null, 507, null), (493567 & 32768) != 0 ? equity_order_context.estimated_total_fees : null, (493567 & 65536) != 0 ? equity_order_context.position_effect : null, (493567 & 131072) != 0 ? equity_order_context.order_entry_point : null, (493567 & 262144) != 0 ? equity_order_context.order_input_format : null, (493567 & 524288) != 0 ? equity_order_context.unknownFields() : null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null);
            } else {
                contextCopy$default = context;
            }
            Component component = new Component(null, "tax_lots.table.checkbox", null, 5, null);
            int i9 = WhenMappings.$EnumSwitchMapping$0[taxLotsShareAndCheckBoxCell3.getToggleableState().ordinal()];
            if (i9 == 1) {
                action = UserInteractionEventData.Action.DESELECT;
            } else {
                if (i9 != 2 && i9 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                action = UserInteractionEventData.Action.SELECT;
            }
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM5146paddingqDBjuR0$default2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, contextCopy$default, component, null, 35, null), false, false, false, true, false, null, 110, null);
            ToggleableState toggleableState = taxLotsShareAndCheckBoxCell3.getToggleableState();
            boolean canEdit = taxLotsShareAndCheckBoxCell3.getCanEdit();
            boolean z4 = (c2002Dp == null || c2002Dp3 == null) ? true : z;
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance3 = (i8 != 256 ? z : true) | composer.changedInstance(taxLotsShareAndCheckBoxCell3);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$TaxLotsShareAndCheckBoxComposable$2$3$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLotShareAndCheckBoxCell4.C149593.invoke$lambda$14$lambda$13$lambda$12(taxLotsShareAndCheckBoxCell3, onValueChange, snapshotState5, snapshotState7);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            TaxLotsCheckBoxCell.TaxLotsCheckBoxComposable(toggleableState, i7, (Function0) objRememberedValue6, canEdit, function12, z4, z3, modifierAutoLogEvents$default, composer, 0, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue, InteractionSource3 interactionSource3, Function1<? super TextFieldValue, ? extends Unit> function1, Composer composer, Integer num) {
            invoke(textFieldValue, interactionSource3, (Function1<? super TextFieldValue, Unit>) function1, composer, num.intValue());
            return Unit.INSTANCE;
        }

        private static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$4$lambda$3(TextFieldValue textFieldValue, TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell) {
            return BigDecimals7.orZero(StringsKt.toBigDecimalOrNull(textFieldValue.getText())).compareTo(taxLotsShareAndCheckBoxCell.getOriginalShareValue()) > 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$8$lambda$7(TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, TextFieldValue textFieldValue, C2002Dp c2002Dp, Function1 function1, Function1 function12, SnapshotState snapshotState, SnapshotState4 snapshotState4, FocusState focusState) {
            Intrinsics.checkNotNullParameter(focusState, "focusState");
            if (invoke$lambda$1(snapshotState) && !focusState.isFocused()) {
                UserInteractionEventData.Action action = UserInteractionEventData.Action.FINISH_TYPING;
                Double doubleOrNull = StringsKt.toDoubleOrNull(textFieldValue.getText());
                TaxLotShareAndCheckBoxCell3.logTypingEvent(taxLotsShareAndCheckBoxCell, eventLogger, userInteractionEventDescriptor, action, doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d);
            } else if (focusState.isFocused()) {
                UserInteractionEventData.Action action2 = UserInteractionEventData.Action.START_TYPING;
                Double doubleOrNull2 = StringsKt.toDoubleOrNull(textFieldValue.getText());
                TaxLotShareAndCheckBoxCell3.logTypingEvent(taxLotsShareAndCheckBoxCell, eventLogger, userInteractionEventDescriptor, action2, doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d);
            }
            invoke$lambda$2(snapshotState, focusState.isFocused());
            if (c2002Dp != null) {
                if (focusState.isFocused()) {
                    function1.invoke(Boolean.TRUE);
                } else if (invoke$lambda$5(snapshotState4) || BigDecimals7.isZero(StringsKt.toBigDecimalOrNull(textFieldValue.getText()))) {
                    function12.invoke(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null));
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$11$lambda$10$lambda$9(TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell, FocusManager focusManager, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2) {
            if (taxLotsShareAndCheckBoxCell.getDisplayIntraDayAlert()) {
                focusManager.clearFocus(true);
                TaxLotShareAndCheckBoxCell4.invoke$lambda$8(snapshotState, true);
            } else if (taxLotsShareAndCheckBoxCell.getDisplayMaxLotAlert()) {
                focusManager.clearFocus(true);
                TaxLotShareAndCheckBoxCell4.invoke$lambda$5(snapshotState2, true);
            }
            function1.invoke(Boolean.FALSE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$13$lambda$12(TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2) {
            if (taxLotsShareAndCheckBoxCell.getDisplayIntraDayAlert()) {
                TaxLotShareAndCheckBoxCell4.invoke$lambda$8(snapshotState, true);
            } else if (taxLotsShareAndCheckBoxCell.getDisplayMaxLotAlert()) {
                TaxLotShareAndCheckBoxCell4.invoke$lambda$5(snapshotState2, true);
            } else {
                int i = WhenMappings.$EnumSwitchMapping$0[taxLotsShareAndCheckBoxCell.getToggleableState().ordinal()];
                if (i == 1) {
                    function1.invoke(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null));
                } else {
                    if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String string2 = taxLotsShareAndCheckBoxCell.getOriginalShareValue().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    function1.invoke(new TextFieldValue(string2, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$2(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$1$lambda$0(TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell) {
        return taxLotsShareAndCheckBoxCell.getDisplayIntraDayAlert() || taxLotsShareAndCheckBoxCell.getDisplayMaxLotAlert();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell, BigDecimal bigDecimal) {
        Function1<BigDecimal, Unit> onNumberChange = taxLotsShareAndCheckBoxCell.getOnNumberChange();
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(bigDecimal);
        onNumberChange.invoke(bigDecimal);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12(SnapshotState snapshotState) {
        invoke$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$14(SnapshotState snapshotState) {
        invoke$lambda$8(snapshotState, false);
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope TaxLotsBaseCell, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(TaxLotsBaseCell, "$this$TaxLotsBaseCell");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-284657570, i, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsShareAndCheckBoxComposable.<anonymous> (TaxLotShareAndCheckBoxCell.kt:104)");
        }
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$taxLotsShareAndCheckBoxCell);
        final TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell = this.$taxLotsShareAndCheckBoxCell;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$TaxLotsShareAndCheckBoxComposable$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(TaxLotShareAndCheckBoxCell4.invoke$lambda$1$lambda$0(taxLotsShareAndCheckBoxCell));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        String lotId = null;
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
        composer.endReplaceGroup();
        FocusManager focusManager = (FocusManager) composer.consume(CompositionLocalsKt.getLocalFocusManager());
        C2002Dp c2002Dp = this.$width;
        if (c2002Dp != null) {
            TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell2 = this.$taxLotsShareAndCheckBoxCell;
            c2002Dp.getValue();
            lotId = taxLotsShareAndCheckBoxCell2.getLotId();
        }
        String str = lotId;
        String initialValue = this.$taxLotsShareAndCheckBoxCell.getInitialValue();
        TaxLotsSharesBentoNumpadTextInputFormatter taxLotsSharesBentoNumpadTextInputFormatter = TaxLotsSharesBentoNumpadTextInputFormatter.INSTANCE;
        BentoNumpadScopeV2 bentoNumpadScopeV2 = this.$bentoNumpadScopeV2;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$taxLotsShareAndCheckBoxCell);
        final TaxLotsShareAndCheckBoxCell taxLotsShareAndCheckBoxCell3 = this.$taxLotsShareAndCheckBoxCell;
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$TaxLotsShareAndCheckBoxComposable$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotShareAndCheckBoxCell4.invoke$lambda$11$lambda$10(taxLotsShareAndCheckBoxCell3, (BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        BentoNumpadTextInput.BentoNumpadTextInput(bentoNumpadScopeV2, (Function1) objRememberedValue4, str, initialValue, false, taxLotsSharesBentoNumpadTextInputFormatter, true, ComposableLambda3.rememberComposableLambda(-268402873, true, new C149593(this.$invalidNumberOfSharesCallback, this.$taxLotsShareAndCheckBoxCell, this.$eventLogger, this.$eventDescriptor, this.$width, this.$setKeyboardVisible, this.$maxForScreenWidth, this.$stickyColumn, this.$rowIndex, this.$height, snapshotState4, focusManager, snapshotState2, snapshotState), composer, 54), composer, 14352384, 8);
        if (invoke$lambda$4(snapshotState)) {
            composer.startReplaceGroup(-1958965616);
            int maxNumberOfTaxLots = this.$taxLotsShareAndCheckBoxCell.getMaxNumberOfTaxLots();
            composer.startReplaceGroup(5004770);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$TaxLotsShareAndCheckBoxComposable$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLotShareAndCheckBoxCell4.invoke$lambda$13$lambda$12(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            TaxLotsMaximumSelectedLotsAlert.TaxLotsMaximumSelectedLotsAlert(maxNumberOfTaxLots, (Function0) objRememberedValue5, composer, 48);
            composer.endReplaceGroup();
        } else if (invoke$lambda$7(snapshotState2)) {
            composer.startReplaceGroup(-1958689592);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotShareAndCheckBoxCellKt$TaxLotsShareAndCheckBoxComposable$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLotShareAndCheckBoxCell4.invoke$lambda$15$lambda$14(snapshotState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            TaxLotsIntraDayLotAlert.TaxLotsIntraDayLotAlert(false, (Function0) objRememberedValue6, composer, 48, 1);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1958560508);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
