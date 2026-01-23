package com.robinhood.android.event.gamedetail.components.bottomsheet;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.event.gamedetail.components.ComboPickerContractRow;
import com.robinhood.android.event.gamedetail.components.ComboPickerContractRow3;
import com.robinhood.android.event.gamedetail.components.ComboPickerContractRowState;
import com.robinhood.android.event.gamedetail.components.WheelPicker3;
import com.robinhood.android.event.gamedetail.components.WheelPickerState;
import com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheet;
import com.robinhood.android.event.gamedetail.p130ui.DayNightImageUrl;
import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GameDetailTradeBottomSheet.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"GameDetailTradeBottomSheet", "", "state", "Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailTradeBottomSheetState;", "onWheelPickerItemSelected", "Lkotlin/Function1;", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "onYesNoToggle", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "modifier", "Landroidx/compose/ui/Modifier;", "onDeleteClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/event/gamedetail/components/bottomsheet/GameDetailTradeBottomSheetState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "GameDetailTradeSlipBottomSheetTitle", "text", "Lcom/robinhood/utils/resource/StringResource;", "(Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GameDetailTradeSlipComboOrdersBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "GameDetailTradeSlipBottomSheetWithPickerPreview", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailTradeBottomSheet {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailTradeBottomSheet$lambda$12(GameDetailTradeBottomSheetState gameDetailTradeBottomSheetState, Function1 function1, Function1 function12, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        GameDetailTradeBottomSheet(gameDetailTradeBottomSheetState, function1, function12, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailTradeSlipBottomSheetTitle$lambda$13(StringResource stringResource, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GameDetailTradeSlipBottomSheetTitle(stringResource, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailTradeSlipBottomSheetWithPickerPreview$lambda$15(int i, Composer composer, int i2) {
        GameDetailTradeSlipBottomSheetWithPickerPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailTradeSlipComboOrdersBottomSheetPreview$lambda$14(int i, Composer composer, int i2) {
        GameDetailTradeSlipComboOrdersBottomSheetPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GameDetailTradeBottomSheet(final GameDetailTradeBottomSheetState state, final Function1<? super ContractElement, Unit> onWheelPickerItemSelected, final Function1<? super ContractIdWithSide, Unit> onYesNoToggle, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        Function0<Unit> function03;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        boolean z;
        final Modifier modifier3;
        WheelPickerState wheelPicker;
        boolean z2;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onWheelPickerItemSelected, "onWheelPickerItemSelected");
        Intrinsics.checkNotNullParameter(onYesNoToggle, "onYesNoToggle");
        Composer composerStartRestartGroup = composer.startRestartGroup(-554542428);
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
            i3 |= composerStartRestartGroup.changedInstance(onWheelPickerItemSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onYesNoToggle) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        function03 = (Function0) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-554542428, i3, -1, "com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheet (GameDetailTradeBottomSheet.kt:49)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-339316409);
                    Modifier modifierM5146paddingqDBjuR0$default = state.isShowingWheelPicker() ? PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null) : Modifier.INSTANCE;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierThen = modifierFillMaxWidth$default.then(modifierM5146paddingqDBjuR0$default);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    GameDetailTradeSlipBottomSheetTitle(state.getTitle(), null, composerStartRestartGroup, StringResource.$stable, 2);
                    composerStartRestartGroup.startReplaceGroup(-66432188);
                    for (final ComboPickerContractRowState comboPickerContractRowState : state.getComboPickerContractRows()) {
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        boolean zChanged = ((i3 & 112) == 32) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(state))) | composerStartRestartGroup.changed(comboPickerContractRowState);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return GameDetailTradeBottomSheet.GameDetailTradeBottomSheet$lambda$11$lambda$7$lambda$4$lambda$3(onWheelPickerItemSelected, state, comboPickerContractRowState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function04 = (Function0) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChanged2 = ((i3 & 896) == 256) | composerStartRestartGroup.changed(comboPickerContractRowState);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GameDetailTradeBottomSheet.GameDetailTradeBottomSheet$lambda$11$lambda$7$lambda$6$lambda$5(onYesNoToggle, comboPickerContractRowState, (ContractSide) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer3 = composerStartRestartGroup;
                        Function0<Unit> function05 = function03;
                        ComboPickerContractRow.ComboPickerContractRow(comboPickerContractRowState, function05, function04, (Function1) objRememberedValue4, null, composer3, (i3 >> 9) & 112, 16);
                        function03 = function05;
                        composerStartRestartGroup = composer3;
                        modifier4 = modifier4;
                    }
                    Modifier modifier5 = modifier4;
                    function02 = function03;
                    composer2 = composerStartRestartGroup;
                    z = false;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-66412694);
                    if (state.isShowingWheelPicker() && (wheelPicker = state.getWheelPicker()) != null) {
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), new UserInteractionEventDescriptor(EventAnalyticsString.GAME_DETAIL_PAGE_WHEEL_PICKER, null, null, null, new Component(Component.ComponentType.EVENT_CONTRACT_STRIKE_PICKER, EventAnalyticsString.GAME_DETAIL_PAGE_WHEEL_PICKER, null, 4, null), null, 46, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                        composer2.startReplaceGroup(-1633490746);
                        boolean z3 = (i3 & 112) != 32;
                        if ((i3 & 14) != 4 || ((i3 & 8) != 0 && composer2.changedInstance(state))) {
                            z = true;
                        }
                        z2 = z3 | z;
                        objRememberedValue = composer2.rememberedValue();
                        if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GameDetailTradeBottomSheet.GameDetailTradeBottomSheet$lambda$11$lambda$10$lambda$9$lambda$8(onWheelPickerItemSelected, state, ((Integer) obj).intValue());
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        WheelPicker3.WheelPicker(wheelPicker, modifierAutoLogEvents$default, (Function1) objRememberedValue, composer2, 0, 0);
                        composer2 = composer2;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                final Function0<Unit> function06 = function02;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GameDetailTradeBottomSheet.GameDetailTradeBottomSheet$lambda$12(state, onWheelPickerItemSelected, onYesNoToggle, modifier3, function06, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            function02 = function0;
            if ((i3 & 9363) == 9362) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-339316409);
                if (state.isShowingWheelPicker()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen2 = modifierFillMaxWidth$default2.then(modifierM5146paddingqDBjuR0$default);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    GameDetailTradeSlipBottomSheetTitle(state.getTitle(), null, composerStartRestartGroup, StringResource.$stable, 2);
                    composerStartRestartGroup.startReplaceGroup(-66432188);
                    while (r0.hasNext()) {
                    }
                    Modifier modifier52 = modifier4;
                    function02 = function03;
                    composer2 = composerStartRestartGroup;
                    z = false;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-66412694);
                    if (state.isShowingWheelPicker()) {
                        Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), new UserInteractionEventDescriptor(EventAnalyticsString.GAME_DETAIL_PAGE_WHEEL_PICKER, null, null, null, new Component(Component.ComponentType.EVENT_CONTRACT_STRIKE_PICKER, EventAnalyticsString.GAME_DETAIL_PAGE_WHEEL_PICKER, null, 4, null), null, 46, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                        composer2.startReplaceGroup(-1633490746);
                        if ((i3 & 112) != 32) {
                        }
                        if ((i3 & 14) != 4) {
                            z = true;
                            z2 = z3 | z;
                            objRememberedValue = composer2.rememberedValue();
                            if (!z2) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return GameDetailTradeBottomSheet.GameDetailTradeBottomSheet$lambda$11$lambda$10$lambda$9$lambda$8(onWheelPickerItemSelected, state, ((Integer) obj).intValue());
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                                composer2.endReplaceGroup();
                                WheelPicker3.WheelPicker(wheelPicker, modifierAutoLogEvents$default2, (Function1) objRememberedValue, composer2, 0, 0);
                                composer2 = composer2;
                            }
                        }
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            final Function0 function062 = function02;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 9363) == 9362) {
        }
        final Function0 function0622 = function02;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailTradeBottomSheet$lambda$11$lambda$7$lambda$4$lambda$3(Function1 function1, GameDetailTradeBottomSheetState gameDetailTradeBottomSheetState, ComboPickerContractRowState comboPickerContractRowState) {
        ImmutableList<ContractElement> items;
        WheelPickerState wheelPicker = gameDetailTradeBottomSheetState.getWheelPicker();
        ContractElement contractElement = null;
        if (wheelPicker != null && (items = wheelPicker.getItems()) != null) {
            Iterator<ContractElement> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ContractElement next = it.next();
                if (Intrinsics.areEqual(next.getContractId(), comboPickerContractRowState.getContractIdWithSide().getContractId())) {
                    contractElement = next;
                    break;
                }
            }
            contractElement = contractElement;
        }
        function1.invoke(contractElement);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailTradeBottomSheet$lambda$11$lambda$7$lambda$6$lambda$5(Function1 function1, ComboPickerContractRowState comboPickerContractRowState, ContractSide newSide) {
        Intrinsics.checkNotNullParameter(newSide, "newSide");
        function1.invoke(ContractIdWithSide.copy$default(comboPickerContractRowState.getContractIdWithSide(), null, newSide, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailTradeBottomSheet$lambda$11$lambda$10$lambda$9$lambda$8(Function1 function1, GameDetailTradeBottomSheetState gameDetailTradeBottomSheetState, int i) {
        function1.invoke(gameDetailTradeBottomSheetState.getWheelPicker().getItems().get(i));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GameDetailTradeSlipBottomSheetTitle(final StringResource text, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-405302599);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(text) : composerStartRestartGroup.changedInstance(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-405302599, i3, -1, "com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeSlipBottomSheetTitle (GameDetailTradeBottomSheet.kt:109)");
                }
                int i5 = (i3 & 112) | 24576;
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(text, composerStartRestartGroup, StringResource.$stable | (i3 & 14)), modifier3, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), composer2, i5, 0, 8172);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameDetailTradeBottomSheet.GameDetailTradeSlipBottomSheetTitle$lambda$13(text, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i52 = (i3 & 112) | 24576;
            modifier3 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(text, composerStartRestartGroup, StringResource.$stable | (i3 & 14)), modifier3, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), composer2, i52, 0, 8172);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void GameDetailTradeSlipComboOrdersBottomSheetPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1813368154);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1813368154, i, -1, "com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeSlipComboOrdersBottomSheetPreview (GameDetailTradeBottomSheet.kt:120)");
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNull(uuidRandomUUID);
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(519114514, true, new C163371(uuidRandomUUID, new ContractIdWithSide(uuidRandomUUID, ContractSide.CONTRACT_SIDE_YES), new DayNightImageUrl(null, null, 3, null)), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GameDetailTradeBottomSheet.GameDetailTradeSlipComboOrdersBottomSheetPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GameDetailTradeBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$GameDetailTradeSlipComboOrdersBottomSheetPreview$1 */
    static final class C163371 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ContractIdWithSide $contractIdWithSide;
        final /* synthetic */ DayNightImageUrl $iconUrl;
        final /* synthetic */ UUID $previewContractId;

        C163371(UUID uuid, ContractIdWithSide contractIdWithSide, DayNightImageUrl dayNightImageUrl) {
            this.$previewContractId = uuid;
            this.$contractIdWithSide = contractIdWithSide;
            this.$iconUrl = dayNightImageUrl;
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
                ComposerKt.traceEventStart(519114514, i, -1, "com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeSlipComboOrdersBottomSheetPreview.<anonymous> (GameDetailTradeBottomSheet.kt:126)");
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke(C16283R.string.trade_bottom_sheet_title_label, new Object[0]);
            UUID uuid = this.$previewContractId;
            Intrinsics.checkNotNull(uuid);
            ComboPickerContractRow3.StrikePriceButtonState strikePriceButtonState = new ComboPickerContractRow3.StrikePriceButtonState(uuid, "-4.5");
            StringResource stringResourceInvoke2 = companion.invoke("$0.76");
            ContractIdWithSide contractIdWithSide = this.$contractIdWithSide;
            ComboPickerContractRowState comboPickerContractRowState = new ComboPickerContractRowState(contractIdWithSide, contractIdWithSide, this.$iconUrl, "LAR", null, strikePriceButtonState, stringResourceInvoke2);
            UUID uuid2 = this.$previewContractId;
            Intrinsics.checkNotNull(uuid2);
            ComboPickerContractRow3.StrikePriceButtonState strikePriceButtonState2 = new ComboPickerContractRow3.StrikePriceButtonState(uuid2, "O 44.5");
            StringResource stringResourceInvoke3 = companion.invoke("$0.80");
            ContractIdWithSide contractIdWithSide2 = this.$contractIdWithSide;
            ComboPickerContractRowState comboPickerContractRowState2 = new ComboPickerContractRowState(contractIdWithSide2, contractIdWithSide2, this.$iconUrl, "SF", null, strikePriceButtonState2, stringResourceInvoke3);
            UUID uuid3 = this.$previewContractId;
            Intrinsics.checkNotNull(uuid3);
            ComboPickerContractRow3.ToggleButtonState toggleButtonState = new ComboPickerContractRow3.ToggleButtonState(uuid3, new ComboPickerContractRow3.ToggleButtonState.ToggleOption(companion.invoke("Yes"), true, ContractSide.CONTRACT_SIDE_YES), new ComboPickerContractRow3.ToggleButtonState.ToggleOption(companion.invoke("No"), false, ContractSide.CONTRACT_SIDE_NO));
            StringResource stringResourceInvoke4 = companion.invoke("$0.80");
            ContractIdWithSide contractIdWithSide3 = this.$contractIdWithSide;
            GameDetailTradeBottomSheetState gameDetailTradeBottomSheetState = new GameDetailTradeBottomSheetState(stringResourceInvoke, extensions2.persistentListOf(comboPickerContractRowState, comboPickerContractRowState2, new ComboPickerContractRowState(contractIdWithSide3, contractIdWithSide3, this.$iconUrl, "SF", null, toggleButtonState, stringResourceInvoke4)), false, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$GameDetailTradeSlipComboOrdersBottomSheetPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailTradeBottomSheet.C163371.invoke$lambda$1$lambda$0((ContractElement) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$GameDetailTradeSlipComboOrdersBottomSheetPreview$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailTradeBottomSheet.C163371.invoke$lambda$3$lambda$2((ContractIdWithSide) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            GameDetailTradeBottomSheet.GameDetailTradeBottomSheet(gameDetailTradeBottomSheetState, function1, (Function1) objRememberedValue2, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, composer, StringResource.$stable | 432, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(ContractElement contractElement) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(ContractIdWithSide it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    private static final void GameDetailTradeSlipBottomSheetWithPickerPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-29546053);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-29546053, i, -1, "com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeSlipBottomSheetWithPickerPreview (GameDetailTradeBottomSheet.kt:188)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(1452724483, true, new C163361(UUID.randomUUID()), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GameDetailTradeBottomSheet.GameDetailTradeSlipBottomSheetWithPickerPreview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GameDetailTradeBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$GameDetailTradeSlipBottomSheetWithPickerPreview$1 */
    static final class C163361 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UUID $previewContractId;

        C163361(UUID uuid) {
            this.$previewContractId = uuid;
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
                ComposerKt.traceEventStart(1452724483, i, -1, "com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeSlipBottomSheetWithPickerPreview.<anonymous> (GameDetailTradeBottomSheet.kt:192)");
            }
            UUID uuid = this.$previewContractId;
            Intrinsics.checkNotNull(uuid);
            ContractIdWithSide contractIdWithSide = new ContractIdWithSide(uuid, ContractSide.CONTRACT_SIDE_YES);
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke(C16283R.string.trade_bottom_sheet_title_label, new Object[0]);
            DayNightImageUrl dayNightImageUrl = new DayNightImageUrl(null, null, 3, null);
            UUID uuid2 = this.$previewContractId;
            Intrinsics.checkNotNull(uuid2);
            GameDetailTradeBottomSheetState gameDetailTradeBottomSheetState = new GameDetailTradeBottomSheetState(stringResourceInvoke, extensions2.persistentListOf(new ComboPickerContractRowState(contractIdWithSide, contractIdWithSide, dayNightImageUrl, "LAR", null, new ComboPickerContractRow3.StrikePriceButtonState(uuid2, "-4.5"), companion.invoke("$0.76"))), false, new WheelPickerState(WheelPicker3.createPreviewContractElements(), 2));
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$GameDetailTradeSlipBottomSheetWithPickerPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailTradeBottomSheet.C163361.invoke$lambda$1$lambda$0((ContractElement) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.bottomsheet.GameDetailTradeBottomSheetKt$GameDetailTradeSlipBottomSheetWithPickerPreview$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailTradeBottomSheet.C163361.invoke$lambda$3$lambda$2((ContractIdWithSide) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            GameDetailTradeBottomSheet.GameDetailTradeBottomSheet(gameDetailTradeBottomSheetState, function1, (Function1) objRememberedValue2, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, composer, StringResource.$stable | 432, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(ContractElement contractElement) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(ContractIdWithSide it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }
}
