package com.robinhood.android.event.gamedetail.p130ui.combo;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks;
import com.robinhood.android.event.gamedetail.callbacks.GameDetailComboCallbacks4;
import com.robinhood.android.event.gamedetail.combostates.GameDetailComboBottomSheetContentViewState;
import com.robinhood.android.event.gamedetail.components.ComboPickerContractRow;
import com.robinhood.android.event.gamedetail.components.ComboPickerContractRowState;
import com.robinhood.android.event.gamedetail.components.ComboWheelPicker;
import com.robinhood.android.event.gamedetail.components.ComboWheelPicker7;
import com.robinhood.android.event.gamedetail.components.bottomsheet.PositionContractDetailRowState;
import com.robinhood.android.event.gamedetail.components.bottomsheet.PositionDetailBottomSheet4;
import com.robinhood.android.event.gamedetail.p130ui.DeltaDirection2;
import com.robinhood.android.event.gamedetail.p130ui.combo.GameDetailComboBottomSheet;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GameDetailComboBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a`\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001aL\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0012\u001aG\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0007\u001a-\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u001a\u001a-\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u001a\u001a$\u0010\u001e\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001aA\u0010 \u001a\u00020\u0001*\u00020\u00142\u0006\u0010!\u001a\u00020\"2#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u001c\u0010#\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\"\u000e\u0010\u001c\u001a\u00020\u001dX\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"GameDetailComboBottomSheet", "", "state", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;", "comboCallbacks", "Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailComboCallbacks;", "onWheelPickerSelectionChange", "Lkotlin/Function1;", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "Lkotlin/ParameterName;", "name", "newSelection", "onHeaderHeightChange", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailComboCallbacks;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SheetContent", "(Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailComboCallbacks;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "content", "Landroidx/compose/foundation/lazy/LazyListScope;", "animatePlacement", "", "TradeSlipHeader", "onClearAllClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HeaderContent", "HeaderLoaderPlaceholder", "", "comboTradeSlipSheetContent", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState$TradeSlip;", "comboPickerContent", "pickerState", "Lcom/robinhood/android/event/gamedetail/ui/combo/StrikePickerState;", "comboPositionSheetContent", "Lcom/robinhood/android/event/gamedetail/combostates/GameDetailComboBottomSheetContentViewState$Position;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailComboBottomSheet {
    private static final String HeaderLoaderPlaceholder = "   ";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailComboBottomSheet$lambda$0(GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState, GameDetailComboCallbacks gameDetailComboCallbacks, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GameDetailComboBottomSheet(gameDetailComboBottomSheetContentViewState, gameDetailComboCallbacks, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderContent$lambda$13(GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HeaderContent(gameDetailComboBottomSheetContentViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetContent$lambda$3(GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState, GameDetailComboCallbacks gameDetailComboCallbacks, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SheetContent(gameDetailComboBottomSheetContentViewState, gameDetailComboCallbacks, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeSlipHeader$lambda$8(GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradeSlipHeader(gameDetailComboBottomSheetContentViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: GameDetailComboBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$GameDetailComboBottomSheet$1 */
    static final class C163801 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
        final /* synthetic */ GameDetailComboCallbacks $comboCallbacks;
        final /* synthetic */ Function1<Integer, Unit> $onHeaderHeightChange;
        final /* synthetic */ Function1<ContractElement, Unit> $onWheelPickerSelectionChange;
        final /* synthetic */ GameDetailComboBottomSheetContentViewState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C163801(GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState, GameDetailComboCallbacks gameDetailComboCallbacks, Function1<? super Integer, Unit> function1, Function1<? super ContractElement, Unit> function12) {
            this.$state = gameDetailComboBottomSheetContentViewState;
            this.$comboCallbacks = gameDetailComboCallbacks;
            this.$onHeaderHeightChange = function1;
            this.$onWheelPickerSelectionChange = function12;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
            invoke(boxWithConstraints4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(Function1 function1, IntSize intSize) {
            function1.invoke(Integer.valueOf((int) (intSize.getPackedValue() & 4294967295L)));
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-761297291, i2, -1, "com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheet.<anonymous> (GameDetailComboBottomSheet.kt:61)");
            }
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(BoxWithConstraints.mo5102getMaxHeightD9Ej5fM() * 0.5f);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.m5158heightInVpY3zN4$default(companion, 0.0f, fM7995constructorimpl, 1, null), 0.0f, composer, 0, 1), null, null, 3, null);
            GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState = this.$state;
            GameDetailComboCallbacks gameDetailComboCallbacks = this.$comboCallbacks;
            final Function1<Integer, Unit> function1 = this.$onHeaderHeightChange;
            Function1<ContractElement, Unit> function12 = this.$onWheelPickerSelectionChange;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAnimateContentSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(gameDetailComboCallbacks);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new GameDetailComboBottomSheet2(gameDetailComboCallbacks);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 7, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$GameDetailComboBottomSheet$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailComboBottomSheet.C163801.invoke$lambda$3$lambda$2$lambda$1(function1, (IntSize) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            GameDetailComboBottomSheet.TradeSlipHeader(gameDetailComboBottomSheetContentViewState, function0, OnRemeasuredModifier2.onSizeChanged(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue2), composer, 0, 0);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer, i3).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
            GameDetailComboBottomSheet.SheetContent(gameDetailComboBottomSheetContentViewState, gameDetailComboCallbacks, function12, null, composer, 0, 8);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GameDetailComboBottomSheet(final GameDetailComboBottomSheetContentViewState state, final GameDetailComboCallbacks comboCallbacks, final Function1<? super ContractElement, Unit> onWheelPickerSelectionChange, final Function1<? super Integer, Unit> onHeaderHeightChange, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(comboCallbacks, "comboCallbacks");
        Intrinsics.checkNotNullParameter(onWheelPickerSelectionChange, "onWheelPickerSelectionChange");
        Intrinsics.checkNotNullParameter(onHeaderHeightChange, "onHeaderHeightChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1057952927);
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(comboCallbacks) : composerStartRestartGroup.changedInstance(comboCallbacks) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onWheelPickerSelectionChange) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onHeaderHeightChange) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1057952927, i3, -1, "com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheet (GameDetailComboBottomSheet.kt:59)");
                }
                BoxWithConstraints.BoxWithConstraints(modifier3, null, false, ComposableLambda3.rememberComposableLambda(-761297291, true, new C163801(state, comboCallbacks, onHeaderHeightChange, onWheelPickerSelectionChange), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 12) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailComboBottomSheet.GameDetailComboBottomSheet$lambda$0(state, comboCallbacks, onWheelPickerSelectionChange, onHeaderHeightChange, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BoxWithConstraints.BoxWithConstraints(modifier3, null, false, ComposableLambda3.rememberComposableLambda(-761297291, true, new C163801(state, comboCallbacks, onHeaderHeightChange, onWheelPickerSelectionChange), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 12) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: GameDetailComboBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboPickerContent$1 */
    static final class C163811 implements Function3<LazyItemScope, Composer, Integer, Unit> {
        final /* synthetic */ boolean $animatePlacement;
        final /* synthetic */ String $key;
        final /* synthetic */ Function1<ContractElement, Unit> $onWheelPickerSelectionChange;
        final /* synthetic */ StrikePickerState $pickerState;

        /* JADX WARN: Multi-variable type inference failed */
        C163811(String str, StrikePickerState strikePickerState, boolean z, Function1<? super ContractElement, Unit> function1) {
            this.$key = str;
            this.$pickerState = strikePickerState;
            this.$animatePlacement = z;
            this.$onWheelPickerSelectionChange = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult invoke$lambda$3$lambda$2(final Function1 function1, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new DisposableEffectResult() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboPickerContent$1$invoke$lambda$3$lambda$2$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    function1.invoke(null);
                }
            };
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 6) == 0) {
                i |= composer.changed(item) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2110079616, i, -1, "com.robinhood.android.event.gamedetail.ui.combo.comboPickerContent.<anonymous> (GameDetailComboBottomSheet.kt:238)");
            }
            ComboWheelPicker7 comboWheelPicker7RememberComboWheelPickerState = ComboWheelPicker.rememberComboWheelPickerState(this.$key, this.$pickerState.getCurrentSelectionIndex(), composer, 0, 0);
            ComboWheelPicker.ComboWheelPicker(this.$pickerState.getDisplayList(), comboWheelPicker7RememberComboWheelPickerState, this.$animatePlacement ? LazyItemScope.animateItem$default(item, Modifier.INSTANCE, null, null, null, 7, null) : Modifier.INSTANCE, composer, 0, 0);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$pickerState) | composer.changed(comboWheelPicker7RememberComboWheelPickerState) | composer.changed(this.$onWheelPickerSelectionChange);
            StrikePickerState strikePickerState = this.$pickerState;
            Function1<ContractElement, Unit> function1 = this.$onWheelPickerSelectionChange;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new GameDetailComboBottomSheet5(strikePickerState, comboWheelPicker7RememberComboWheelPickerState, function1, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(comboWheelPicker7RememberComboWheelPickerState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 0);
            Unit unit = Unit.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onWheelPickerSelectionChange);
            final Function1<ContractElement, Unit> function12 = this.$onWheelPickerSelectionChange;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboPickerContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailComboBottomSheet.C163811.invoke$lambda$3$lambda$2(function12, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SheetContent(final GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState, final GameDetailComboCallbacks gameDetailComboCallbacks, final Function1<? super ContractElement, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-359486309);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(gameDetailComboBottomSheetContentViewState) : composerStartRestartGroup.changedInstance(gameDetailComboBottomSheetContentViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(gameDetailComboCallbacks) : composerStartRestartGroup.changedInstance(gameDetailComboCallbacks) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
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
                    ComposerKt.traceEventStart(-359486309, i3, -1, "com.robinhood.android.event.gamedetail.ui.combo.SheetContent (GameDetailComboBottomSheet.kt:90)");
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                z = ((i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(gameDetailComboBottomSheetContentViewState))) | ((i3 & 112) != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(gameDetailComboCallbacks))) | ((i3 & 896) == 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GameDetailComboBottomSheet.SheetContent$lambda$2$lambda$1(gameDetailComboBottomSheetContentViewState, gameDetailComboCallbacks, function1, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i5 = (i3 >> 9) & 14;
                Modifier modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifier4, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, i5, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailComboBottomSheet.SheetContent$lambda$3(gameDetailComboBottomSheetContentViewState, gameDetailComboCallbacks, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            if ((i3 & 14) != 4) {
                if ((i3 & 112) != 32) {
                    z = ((i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(gameDetailComboBottomSheetContentViewState))) | ((i3 & 112) != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(gameDetailComboCallbacks))) | ((i3 & 896) == 256);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return GameDetailComboBottomSheet.SheetContent$lambda$2$lambda$1(gameDetailComboBottomSheetContentViewState, gameDetailComboCallbacks, function1, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        int i52 = (i3 >> 9) & 14;
                        Modifier modifier42 = modifier2;
                        composer2 = composerStartRestartGroup;
                        LazyDslKt.LazyColumn(modifier42, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, i52, 510);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetContent$lambda$2$lambda$1(GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState, GameDetailComboCallbacks gameDetailComboCallbacks, Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        content(LazyColumn, gameDetailComboBottomSheetContentViewState, gameDetailComboCallbacks, !(gameDetailComboBottomSheetContentViewState instanceof GameDetailComboBottomSheetContentViewState.Empty), function1);
        return Unit.INSTANCE;
    }

    public static final void content(LazyListScope lazyListScope, GameDetailComboBottomSheetContentViewState state, GameDetailComboCallbacks comboCallbacks, boolean z, Function1<? super ContractElement, Unit> onWheelPickerSelectionChange) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(comboCallbacks, "comboCallbacks");
        Intrinsics.checkNotNullParameter(onWheelPickerSelectionChange, "onWheelPickerSelectionChange");
        if (state instanceof GameDetailComboBottomSheetContentViewState.Empty) {
            GameDetailComboBottomSheetContentViewState.Empty empty = (GameDetailComboBottomSheetContentViewState.Empty) state;
            if (empty.getPlaceholderView() != null) {
                content(lazyListScope, empty.getPlaceholderView(), GameDetailComboCallbacks4.INSTANCE, false, new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailComboBottomSheet.content$lambda$4((ContractElement) obj);
                    }
                });
                return;
            }
            return;
        }
        if (state instanceof GameDetailComboBottomSheetContentViewState.Position) {
            comboPositionSheetContent(lazyListScope, (GameDetailComboBottomSheetContentViewState.Position) state, z);
            return;
        }
        if (!(state instanceof GameDetailComboBottomSheetContentViewState.TradeSlip)) {
            throw new NoWhenBranchMatchedException();
        }
        GameDetailComboBottomSheetContentViewState.TradeSlip tradeSlip = (GameDetailComboBottomSheetContentViewState.TradeSlip) state;
        comboTradeSlipSheetContent(lazyListScope, tradeSlip, comboCallbacks, z);
        if (tradeSlip.getPickerState() != null) {
            comboPickerContent(lazyListScope, tradeSlip.getPickerState(), onWheelPickerSelectionChange, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit content$lambda$4(ContractElement contractElement) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradeSlipHeader(final GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(539850894);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(gameDetailComboBottomSheetContentViewState) : composerStartRestartGroup.changedInstance(gameDetailComboBottomSheetContentViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(539850894, i4, -1, "com.robinhood.android.event.gamedetail.ui.combo.TradeSlipHeader (GameDetailComboBottomSheet.kt:142)");
                }
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                LocalShowPlaceholder.Loadable((gameDetailComboBottomSheetContentViewState instanceof GameDetailComboBottomSheetContentViewState.Empty) && gameDetailComboBottomSheetContentViewState.getTitle() == null, null, null, ComposableLambda3.rememberComposableLambda(-539393918, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$TradeSlipHeader$1$1
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
                            ComposerKt.traceEventStart(-539393918, i6, -1, "com.robinhood.android.event.gamedetail.ui.combo.TradeSlipHeader.<anonymous>.<anonymous> (GameDetailComboBottomSheet.kt:149)");
                        }
                        StringResource title = gameDetailComboBottomSheetContentViewState.getTitle();
                        composer2.startReplaceGroup(1333489587);
                        String textAsString = title == null ? null : StringResources6.getTextAsString(title, composer2, StringResource.$stable);
                        composer2.endReplaceGroup();
                        if (textAsString == null) {
                            textAsString = "   ";
                        }
                        BentoText2.m20747BentoText38GnDrw(textAsString, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 1, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 805330944, 0, 7662);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                Spacer2.Spacer(Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GameDetailComboBottomSheet.TradeSlipHeader$lambda$7$lambda$6$lambda$5((GameDetailComboBottomSheetContentViewState) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnimatedContentKt.AnimatedContent(gameDetailComboBottomSheetContentViewState, null, null, null, null, (Function1) objRememberedValue, ComposableLambda3.rememberComposableLambda(-1503839577, true, new Function4<AnimatedContentScope, GameDetailComboBottomSheetContentViewState, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$TradeSlipHeader$1$3
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState2, Composer composer2, Integer num) {
                        invoke(animatedContentScope, gameDetailComboBottomSheetContentViewState2, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent, GameDetailComboBottomSheetContentViewState target, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        Intrinsics.checkNotNullParameter(target, "target");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1503839577, i6, -1, "com.robinhood.android.event.gamedetail.ui.combo.TradeSlipHeader.<anonymous>.<anonymous> (GameDetailComboBottomSheet.kt:158)");
                        }
                        GameDetailComboBottomSheet.HeaderContent(target, function0, null, composer2, (i6 >> 3) & 14, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & 14) | 1769472, 30);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailComboBottomSheet.TradeSlipHeader$lambda$8(gameDetailComboBottomSheetContentViewState, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) != 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                if (gameDetailComboBottomSheetContentViewState instanceof GameDetailComboBottomSheetContentViewState.Empty) {
                    LocalShowPlaceholder.Loadable((gameDetailComboBottomSheetContentViewState instanceof GameDetailComboBottomSheetContentViewState.Empty) && gameDetailComboBottomSheetContentViewState.getTitle() == null, null, null, ComposableLambda3.rememberComposableLambda(-539393918, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$TradeSlipHeader$1$1
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
                                ComposerKt.traceEventStart(-539393918, i6, -1, "com.robinhood.android.event.gamedetail.ui.combo.TradeSlipHeader.<anonymous>.<anonymous> (GameDetailComboBottomSheet.kt:149)");
                            }
                            StringResource title = gameDetailComboBottomSheetContentViewState.getTitle();
                            composer2.startReplaceGroup(1333489587);
                            String textAsString = title == null ? null : StringResources6.getTextAsString(title, composer2, StringResource.$stable);
                            composer2.endReplaceGroup();
                            if (textAsString == null) {
                                textAsString = "   ";
                            }
                            BentoText2.m20747BentoText38GnDrw(textAsString, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 1, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 805330944, 0, 7662);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    Spacer2.Spacer(Row5.weight$default(row62, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    AnimatedContentKt.AnimatedContent(gameDetailComboBottomSheetContentViewState, null, null, null, null, (Function1) objRememberedValue, ComposableLambda3.rememberComposableLambda(-1503839577, true, new Function4<AnimatedContentScope, GameDetailComboBottomSheetContentViewState, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$TradeSlipHeader$1$3
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState2, Composer composer2, Integer num) {
                            invoke(animatedContentScope, gameDetailComboBottomSheetContentViewState2, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedContentScope AnimatedContent, GameDetailComboBottomSheetContentViewState target, Composer composer2, int i6) {
                            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                            Intrinsics.checkNotNullParameter(target, "target");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1503839577, i6, -1, "com.robinhood.android.event.gamedetail.ui.combo.TradeSlipHeader.<anonymous>.<anonymous> (GameDetailComboBottomSheet.kt:158)");
                            }
                            GameDetailComboBottomSheet.HeaderContent(target, function0, null, composer2, (i6 >> 3) & 14, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & 14) | 1769472, 30);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TradeSlipHeader$lambda$7$lambda$6$lambda$5(GameDetailComboBottomSheetContentViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getClass().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HeaderContent(final GameDetailComboBottomSheetContentViewState gameDetailComboBottomSheetContentViewState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(85350921);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(gameDetailComboBottomSheetContentViewState) : composerStartRestartGroup.changedInstance(gameDetailComboBottomSheetContentViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
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
                    ComposerKt.traceEventStart(85350921, i3, -1, "com.robinhood.android.event.gamedetail.ui.combo.HeaderContent (GameDetailComboBottomSheet.kt:168)");
                }
                if (!(gameDetailComboBottomSheetContentViewState instanceof GameDetailComboBottomSheetContentViewState.Empty)) {
                    composerStartRestartGroup.startReplaceGroup(68898916);
                    GameDetailComboBottomSheetContentViewState.Empty empty = (GameDetailComboBottomSheetContentViewState.Empty) gameDetailComboBottomSheetContentViewState;
                    if (empty.getPlaceholderView() != null) {
                        GameDetailComboBottomSheetContentViewState placeholderView = empty.getPlaceholderView();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        HeaderContent(placeholderView, (Function0) objRememberedValue, null, composerStartRestartGroup, 48, 4);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (gameDetailComboBottomSheetContentViewState instanceof GameDetailComboBottomSheetContentViewState.Position) {
                        composerStartRestartGroup.startReplaceGroup(69119543);
                        GameDetailComboBottomSheetContentViewState.Position position = (GameDetailComboBottomSheetContentViewState.Position) gameDetailComboBottomSheetContentViewState;
                        String pnl = position.getPnl();
                        if (pnl == null) {
                            pnl = HeaderLoaderPlaceholder;
                        }
                        WrappedTickerKt.m19244TickerTextFNF3uiM(LocalShowPlaceholder.withBentoPlaceholder$default(modifier4, position.getPnl() == null, null, 2, null), pnl, DeltaDirection2.getBentoColor(position.getPnlColor(), composerStartRestartGroup, 0), TickerTextState.Style.REGULAR_MEDIUM_BOLD, composerStartRestartGroup, 3072);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!(gameDetailComboBottomSheetContentViewState instanceof GameDetailComboBottomSheetContentViewState.TradeSlip)) {
                            composerStartRestartGroup.startReplaceGroup(417862984);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(69509678);
                        String strStringResource = StringResources_androidKt.stringResource(C16283R.string.combo_bottom_sheet_clear_all_action_label, composerStartRestartGroup, 0);
                        TextStyle textM = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM();
                        FontWeight bold = FontWeight.INSTANCE.getBold();
                        TextDecoration underline = TextDecoration.INSTANCE.getUnderline();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean z = (i3 & 112) == 32;
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return GameDetailComboBottomSheet.HeaderContent$lambda$12$lambda$11(function0);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier5 = modifier4;
                        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier5, false, null, null, (Function0) objRememberedValue2, 7, null);
                        modifier3 = modifier5;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM4893clickableXHw0xAI$default, null, null, bold, underline, null, 0, false, 1, 0, null, 0, textM, composerStartRestartGroup, 805527552, 0, 7628);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
                modifier3 = modifier4;
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailComboBottomSheet.HeaderContent$lambda$13(gameDetailComboBottomSheetContentViewState, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (!(gameDetailComboBottomSheetContentViewState instanceof GameDetailComboBottomSheetContentViewState.Empty)) {
            }
            modifier3 = modifier4;
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderContent$lambda$12$lambda$11(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void comboTradeSlipSheetContent(LazyListScope lazyListScope, GameDetailComboBottomSheetContentViewState.TradeSlip tradeSlip, final GameDetailComboCallbacks gameDetailComboCallbacks, final boolean z) {
        final ImmutableList3<ComboPickerContractRowState> rows = tradeSlip.getRows();
        final Function1 function1 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailComboBottomSheet.comboTradeSlipSheetContent$lambda$14((ComboPickerContractRowState) obj);
            }
        };
        final C16376x9cdd0eaf c16376x9cdd0eaf = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboTradeSlipSheetContent$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(ComboPickerContractRowState comboPickerContractRowState) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ComboPickerContractRowState) obj);
            }
        };
        lazyListScope.items(rows.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboTradeSlipSheetContent$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function1.invoke(rows.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboTradeSlipSheetContent$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c16376x9cdd0eaf.invoke(rows.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboTradeSlipSheetContent$$inlined$items$default$4
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
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                final ComboPickerContractRowState comboPickerContractRowState = (ComboPickerContractRowState) rows.get(i);
                composer.startReplaceGroup(1971752146);
                Modifier modifierAnimateItem$default = z ? LazyItemScope.animateItem$default(lazyItemScope, Modifier.INSTANCE, null, null, null, 7, null) : Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(gameDetailComboCallbacks) | composer.changed(comboPickerContractRowState);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final GameDetailComboCallbacks gameDetailComboCallbacks2 = gameDetailComboCallbacks;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboTradeSlipSheetContent$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            gameDetailComboCallbacks2.removeContractSelection(comboPickerContractRowState.getKey());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(gameDetailComboCallbacks) | composer.changed(comboPickerContractRowState);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final GameDetailComboCallbacks gameDetailComboCallbacks3 = gameDetailComboCallbacks;
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboTradeSlipSheetContent$2$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            gameDetailComboCallbacks3.openStrikePicker(comboPickerContractRowState.getKey());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function02 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composer.changedInstance(gameDetailComboCallbacks) | composer.changed(comboPickerContractRowState);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    final GameDetailComboCallbacks gameDetailComboCallbacks4 = gameDetailComboCallbacks;
                    objRememberedValue3 = new Function1<ContractSide, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboTradeSlipSheetContent$2$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ContractSide contractSide) {
                            invoke2(contractSide);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ContractSide newSide) {
                            Intrinsics.checkNotNullParameter(newSide, "newSide");
                            gameDetailComboCallbacks4.updateContractSelectionSide(comboPickerContractRowState.getKey(), newSide);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                ComboPickerContractRow.ComboPickerContractRow(comboPickerContractRowState, function0, function02, (Function1) objRememberedValue3, modifierAnimateItem$default, composer, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object comboTradeSlipSheetContent$lambda$14(ComboPickerContractRowState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getKey();
    }

    private static final void comboPickerContent(LazyListScope lazyListScope, StrikePickerState strikePickerState, Function1<? super ContractElement, Unit> function1, boolean z) {
        String str = "wheelPicker-" + strikePickerState.getDisplayKey();
        LazyListScope.item$default(lazyListScope, str, null, ComposableLambda3.composableLambdaInstance(-2110079616, true, new C163811(str, strikePickerState, z, function1)), 2, null);
    }

    private static final void comboPositionSheetContent(LazyListScope lazyListScope, GameDetailComboBottomSheetContentViewState.Position position, final boolean z) {
        final ImmutableList3<PositionContractDetailRowState> rows = position.getRows();
        final Function1 function1 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameDetailComboBottomSheet.comboPositionSheetContent$lambda$19((PositionContractDetailRowState) obj);
            }
        };
        final C16372xb78582f2 c16372xb78582f2 = new Function1() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboPositionSheetContent$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(PositionContractDetailRowState positionContractDetailRowState) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((PositionContractDetailRowState) obj);
            }
        };
        lazyListScope.items(rows.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboPositionSheetContent$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function1.invoke(rows.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboPositionSheetContent$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c16372xb78582f2.invoke(rows.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboPositionSheetContent$$inlined$items$default$4
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
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                PositionContractDetailRowState positionContractDetailRowState = (PositionContractDetailRowState) rows.get(i);
                composer.startReplaceGroup(889271501);
                Modifier modifierAnimateItem$default = z ? LazyItemScope.animateItem$default(lazyItemScope, Modifier.INSTANCE, null, null, null, 7, null) : Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAnimateItem$default);
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
                PositionDetailBottomSheet4.ContractDetailRow(positionContractDetailRowState, null, composer, 0, 2);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU(), 0.0f, composer, 0, 5);
                composer.endNode();
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object comboPositionSheetContent$lambda$19(PositionContractDetailRowState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getKey();
    }
}
