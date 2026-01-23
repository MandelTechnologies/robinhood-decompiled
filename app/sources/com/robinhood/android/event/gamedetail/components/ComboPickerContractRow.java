package com.robinhood.android.event.gamedetail.components;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.event.gamedetail.C16283R;
import com.robinhood.android.event.gamedetail.components.ComboPickerContractRow;
import com.robinhood.android.event.gamedetail.components.ComboPickerContractRow3;
import com.robinhood.android.event.gamedetail.p130ui.DayNightImageUrl;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.eventcontracts.sharedeventui.ContractImage;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ComboPickerContractRow.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\u001a^\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a-\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00182\b\b\u0002\u0010\u0014\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u001d²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u008a\u008e\u0002"}, m3636d2 = {"ContractValueButtonShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "TwoDpPadding", "Landroidx/compose/ui/unit/Dp;", "F", "IconSize", "TradeSlipContainerHeight", "ComboPickerContractRow", "", "state", "Lcom/robinhood/android/event/gamedetail/components/ComboPickerContractRowState;", "onDeleteClick", "Lkotlin/Function0;", "onStrikeValueButtonClick", "onYesNoToggle", "Lkotlin/Function1;", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "Lkotlin/ParameterName;", "name", "side", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/gamedetail/components/ComboPickerContractRowState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StrikePriceValueButton", "Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$StrikePriceButtonState;", "onClick", "(Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$StrikePriceButtonState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ComboPickerContractRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-game-detail_externalDebug", "lastKnownTitle", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ComboPickerContractRow {
    private static final RoundedCornerShape ContractValueButtonShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
    private static final float TwoDpPadding = C2002Dp.m7995constructorimpl(2);
    private static final float IconSize = C2002Dp.m7995constructorimpl(24);
    private static final float TradeSlipContainerHeight = C2002Dp.m7995constructorimpl(44);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComboPickerContractRow$lambda$14(ComboPickerContractRowState comboPickerContractRowState, Function0 function0, Function0 function02, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ComboPickerContractRow(comboPickerContractRowState, function0, function02, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComboPickerContractRowPreview$lambda$16(int i, Composer composer, int i2) {
        ComboPickerContractRowPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StrikePriceValueButton$lambda$15(ComboPickerContractRow3.StrikePriceButtonState strikePriceButtonState, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        StrikePriceValueButton(strikePriceButtonState, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final String ComboPickerContractRow$lambda$2(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: ComboPickerContractRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$ComboPickerContractRowPreview$1 */
    static final class C163011 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UUID $contractId;
        final /* synthetic */ ContractIdWithSide $contractIdWithSide;

        C163011(UUID uuid, ContractIdWithSide contractIdWithSide) {
            this.$contractId = uuid;
            this.$contractIdWithSide = contractIdWithSide;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(406630933, i, -1, "com.robinhood.android.event.gamedetail.components.ComboPickerContractRowPreview.<anonymous> (ComboPickerContractRow.kt:231)");
            }
            UUID uuid = this.$contractId;
            ContractIdWithSide contractIdWithSide = this.$contractIdWithSide;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
            DayNightImageUrl dayNightImageUrl = new DayNightImageUrl(null, null, 3, null);
            Intrinsics.checkNotNull(uuid);
            ComboPickerContractRow3.StrikePriceButtonState strikePriceButtonState = new ComboPickerContractRow3.StrikePriceButtonState(uuid, "-4.5");
            StringResource.Companion companion3 = StringResource.INSTANCE;
            ComboPickerContractRowState comboPickerContractRowState = new ComboPickerContractRowState(contractIdWithSide, contractIdWithSide, dayNightImageUrl, "LAR", null, strikePriceButtonState, companion3.invoke("$0.76"));
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$ComboPickerContractRowPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$ComboPickerContractRowPreview$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$ComboPickerContractRowPreview$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComboPickerContractRow.C163011.invoke$lambda$24$lambda$5$lambda$4((ContractSide) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            ComboPickerContractRow.ComboPickerContractRow(comboPickerContractRowState, function0, function02, (Function1) objRememberedValue3, null, composer, 3504, 16);
            ComboPickerContractRowState comboPickerContractRowState2 = new ComboPickerContractRowState(contractIdWithSide, contractIdWithSide, new DayNightImageUrl(null, null, 3, null), "Over", null, new ComboPickerContractRow3.StrikePriceButtonState(uuid, "-4.5"), companion3.invoke("$0.16"));
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$ComboPickerContractRowPreview$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function0 function03 = (Function0) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion4.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$ComboPickerContractRowPreview$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            Function0 function04 = (Function0) objRememberedValue5;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == companion4.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$ComboPickerContractRowPreview$1$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComboPickerContractRow.C163011.invoke$lambda$24$lambda$11$lambda$10((ContractSide) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            ComboPickerContractRow.ComboPickerContractRow(comboPickerContractRowState2, function03, function04, (Function1) objRememberedValue6, null, composer, 3504, 16);
            ComboPickerContractRowState comboPickerContractRowState3 = new ComboPickerContractRowState(contractIdWithSide, contractIdWithSide, new DayNightImageUrl(null, null, 3, null), "Some player with a long name", null, new ComboPickerContractRow3.StrikePriceButtonState(uuid, "-4.5"), companion3.invoke("$0.76"));
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue7 = composer.rememberedValue();
            if (objRememberedValue7 == companion4.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$ComboPickerContractRowPreview$1$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            Function0 function05 = (Function0) objRememberedValue7;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue8 = composer.rememberedValue();
            if (objRememberedValue8 == companion4.getEmpty()) {
                objRememberedValue8 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$ComboPickerContractRowPreview$1$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue8);
            }
            Function0 function06 = (Function0) objRememberedValue8;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue9 = composer.rememberedValue();
            if (objRememberedValue9 == companion4.getEmpty()) {
                objRememberedValue9 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$ComboPickerContractRowPreview$1$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComboPickerContractRow.C163011.invoke$lambda$24$lambda$17$lambda$16((ContractSide) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue9);
            }
            composer.endReplaceGroup();
            ComboPickerContractRow.ComboPickerContractRow(comboPickerContractRowState3, function05, function06, (Function1) objRememberedValue9, null, composer, 3504, 16);
            ComboPickerContractRowState comboPickerContractRowState4 = new ComboPickerContractRowState(contractIdWithSide, contractIdWithSide, new DayNightImageUrl(null, null, 3, null), "LAR", null, new ComboPickerContractRow3.ToggleButtonState(uuid, new ComboPickerContractRow3.ToggleButtonState.ToggleOption(companion3.invoke("Yes"), true, ContractSide.CONTRACT_SIDE_YES), new ComboPickerContractRow3.ToggleButtonState.ToggleOption(companion3.invoke("No"), false, ContractSide.CONTRACT_SIDE_NO)), companion3.invoke("$0.76"));
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue10 = composer.rememberedValue();
            if (objRememberedValue10 == companion4.getEmpty()) {
                objRememberedValue10 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$ComboPickerContractRowPreview$1$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue10);
            }
            Function0 function07 = (Function0) objRememberedValue10;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue11 = composer.rememberedValue();
            if (objRememberedValue11 == companion4.getEmpty()) {
                objRememberedValue11 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$ComboPickerContractRowPreview$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue11);
            }
            Function0 function08 = (Function0) objRememberedValue11;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue12 = composer.rememberedValue();
            if (objRememberedValue12 == companion4.getEmpty()) {
                objRememberedValue12 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$ComboPickerContractRowPreview$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComboPickerContractRow.C163011.invoke$lambda$24$lambda$23$lambda$22((ContractSide) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue12);
            }
            composer.endReplaceGroup();
            ComboPickerContractRow.ComboPickerContractRow(comboPickerContractRowState4, function07, function08, (Function1) objRememberedValue12, null, composer, 3504, 16);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$24$lambda$5$lambda$4(ContractSide it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$24$lambda$11$lambda$10(ContractSide it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$24$lambda$17$lambda$16(ContractSide it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$24$lambda$23$lambda$22(ContractSide it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ComboPickerContractRow(final ComboPickerContractRowState state, final Function0<Unit> onDeleteClick, final Function0<Unit> onStrikeValueButtonClick, final Function1<? super ContractSide, Unit> onYesNoToggle, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        String title;
        Composer composer2;
        String subtitle;
        ComboPickerContractRow3 valueButton;
        int i4;
        Modifier.Companion companion;
        int i5;
        int i6;
        BentoTheme bentoTheme;
        int i7;
        Modifier modifier3;
        int i8;
        StringResource price;
        BentoTheme bentoTheme2;
        int i9;
        int i10;
        int i11;
        Object objRememberedValue2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Intrinsics.checkNotNullParameter(onStrikeValueButtonClick, "onStrikeValueButtonClick");
        Intrinsics.checkNotNullParameter(onYesNoToggle, "onYesNoToggle");
        Composer composerStartRestartGroup = composer.startRestartGroup(1130045754);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDeleteClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onStrikeValueButtonClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onYesNoToggle) ? 2048 : 1024;
        }
        int i12 = i2 & 16;
        if (i12 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i12 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1130045754, i3, -1, "com.robinhood.android.event.gamedetail.components.ComboPickerContractRow (ComboPickerContractRow.kt:97)");
                }
                String url = state.getIconUrl().getUrl(composerStartRestartGroup, 0);
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) != 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ComboPickerContractRow.ComboPickerContractRow$lambda$1$lambda$0(state);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                if (state.getTitle() != null) {
                    snapshotState.setValue(state.getTitle());
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                int i13 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion4, 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i13).m21590getDefaultD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme3.getSpacing(composerStartRestartGroup, i13).m21590getDefaultD9Ej5fM()), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier modifierWeight$default = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme3.getSpacing(composerStartRestartGroup, i13).m21590getDefaultD9Ej5fM()), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                ContractImage.m14359ContractImageMKkPZoM(url, state.getTitle(), Color.m6701boximpl(((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getPlaceholder(composerStartRestartGroup, 0).m21880getColor0d7_KjU()), null, IconSize, false, composerStartRestartGroup, 24576, 40);
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(row6.weight(companion4, 1.0f, false), TradeSlipContainerHeight);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor4);
                }
                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                title = state.getTitle();
                if (title == null && (title = ComboPickerContractRow$lambda$2(snapshotState)) == null) {
                    title = PlaceholderUtils.getMediumPlaceholderText();
                }
                BentoText2.m20747BentoText38GnDrw(title, ModifiersKt.bentoPlaceholder$default(companion4, state.getTitle() != null, null, 2, null), Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i13).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i13).getTextM(), composerStartRestartGroup, 0, 0, 8184);
                composer2 = composerStartRestartGroup;
                subtitle = state.getSubtitle();
                composer2.startReplaceGroup(734641211);
                if (subtitle != null) {
                    BentoText2.m20747BentoText38GnDrw(subtitle, null, Color.m6701boximpl(bentoTheme3.getColors(composer2, i13).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i13).getTextS(), composer2, 0, 0, 8186);
                    composer2 = composer2;
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                valueButton = state.getValueButton();
                if (valueButton instanceof ComboPickerContractRow3.ToggleButtonState) {
                    i4 = 5004770;
                    if (valueButton instanceof ComboPickerContractRow3.StrikePriceButtonState) {
                        composer2.startReplaceGroup(679776288);
                        companion = companion4;
                        i5 = 0;
                        modifier3 = modifier5;
                        i8 = 1;
                        i6 = i3;
                        i7 = i13;
                        bentoTheme = bentoTheme3;
                        StrikePriceValueButton((ComboPickerContractRow3.StrikePriceButtonState) state.getValueButton(), PaddingKt.m5144paddingVpY3zN4$default(companion4, 0.0f, TwoDpPadding, 1, null), onStrikeValueButtonClick, composer2, (i3 & 896) | 48, 0);
                        composer2.endReplaceGroup();
                    } else {
                        companion = companion4;
                        i5 = 0;
                        i6 = i3;
                        bentoTheme = bentoTheme3;
                        i7 = i13;
                        modifier3 = modifier5;
                        i8 = 1;
                        if (valueButton != null) {
                            composer2.startReplaceGroup(-1363559388);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(680092488);
                        composer2.endReplaceGroup();
                    }
                } else {
                    composer2.startReplaceGroup(679403606);
                    ComboPickerContractRow3.ToggleButtonState toggleButtonState = (ComboPickerContractRow3.ToggleButtonState) state.getValueButton();
                    Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion4, 0.0f, TwoDpPadding, 1, null);
                    composer2.startReplaceGroup(5004770);
                    boolean z2 = (i3 & 7168) == 2048;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ComboPickerContractRow.m2003x3b05c6bd(onYesNoToggle, (ContractSide) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    Composer composer3 = composer2;
                    ToggleButton4.ToggleButton(toggleButtonState, modifierM5144paddingVpY3zN4$default2, (Function1) objRememberedValue3, composer3, 48, 0);
                    composer2 = composer3;
                    composer2.endReplaceGroup();
                    i4 = 5004770;
                    companion = companion4;
                    i5 = 0;
                    i6 = i3;
                    bentoTheme = bentoTheme3;
                    i7 = i13;
                    modifier3 = modifier5;
                    i8 = 1;
                }
                composer2.endNode();
                price = state.getPrice();
                composer2.startReplaceGroup(2026381898);
                if (price != null) {
                    bentoTheme2 = bentoTheme;
                    i9 = i7;
                    i10 = i4;
                    i11 = i5;
                } else {
                    bentoTheme2 = bentoTheme;
                    i9 = i7;
                    Composer composer4 = composer2;
                    i10 = i4;
                    i11 = i5;
                    BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(price, composer2, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextM(), composer4, 0, 0, 8190);
                    composer2 = composer4;
                    Unit unit2 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.TRASH_16);
                String strStringResource = StringResources_androidKt.stringResource(C16283R.string.delete_icon_content_description, composer2, i11);
                long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer2, i9).m21425getFg0d7_KjU();
                composer2.startReplaceGroup(i10);
                if ((i6 & 112) != 32) {
                    i8 = i11;
                }
                objRememberedValue2 = composer2.rememberedValue();
                if (i8 == 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ComboPickerContractRow.ComboPickerContractRow$lambda$13$lambda$12$lambda$11$lambda$10(onDeleteClick);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                Composer composer5 = composer2;
                BentoIcon2.m20644BentoIconFU0evQE(size16, strStringResource, jM21425getFg0d7_KjU, com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue2, 7, null), new UserInteractionEventDescriptor("combos-remove-with-trash-" + state.getContractIdWithSide().getContractId(), null, null, null, new Component(Component.ComponentType.EVENT_CONTRACT_COMBO_LEG, "combos-remove-with-trash-" + state.getContractIdWithSide().getContractId(), null, 4, null), null, 46, null), false, false, false, true, false, null, 110, null), null, false, composer5, BentoIcon4.Size16.$stable, 48);
                composerStartRestartGroup = composer5;
                composerStartRestartGroup.endNode();
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i9).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ComboPickerContractRow.ComboPickerContractRow$lambda$14(state, onDeleteClick, onStrikeValueButtonClick, onYesNoToggle, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i12 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String url2 = state.getIconUrl().getUrl(composerStartRestartGroup, 0);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) != 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ComboPickerContractRow.ComboPickerContractRow$lambda$1$lambda$0(state);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                if (state.getTitle() != null) {
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor5 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    BentoTheme bentoTheme32 = BentoTheme.INSTANCE;
                    int i132 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default3 = PaddingKt.m5144paddingVpY3zN4$default(companion42, 0.0f, bentoTheme32.getSpacing(composerStartRestartGroup, i132).m21590getDefaultD9Ej5fM(), 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme32.getSpacing(composerStartRestartGroup, i132).m21590getDefaultD9Ej5fM()), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default3);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        Modifier modifierWeight$default2 = Row5.weight$default(row62, companion42, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme32.getSpacing(composerStartRestartGroup, i132).m21590getDefaultD9Ej5fM()), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                        Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                            ContractImage.m14359ContractImageMKkPZoM(url2, state.getTitle(), Color.m6701boximpl(((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getPlaceholder(composerStartRestartGroup, 0).m21880getColor0d7_KjU()), null, IconSize, false, composerStartRestartGroup, 24576, 40);
                            Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(row62.weight(companion42, 1.0f, false), TradeSlipContainerHeight);
                            MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getCenter(), companion22.getStart(), composerStartRestartGroup, 6);
                            currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs2);
                            Function0<ComposeUiNode> constructor42 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash4 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl4.getInserting()) {
                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion32.getSetModifier());
                                title = state.getTitle();
                                if (title == null) {
                                    title = PlaceholderUtils.getMediumPlaceholderText();
                                }
                                BentoText2.m20747BentoText38GnDrw(title, ModifiersKt.bentoPlaceholder$default(companion42, state.getTitle() != null, null, 2, null), Color.m6701boximpl(bentoTheme32.getColors(composerStartRestartGroup, i132).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme32.getTypography(composerStartRestartGroup, i132).getTextM(), composerStartRestartGroup, 0, 0, 8184);
                                composer2 = composerStartRestartGroup;
                                subtitle = state.getSubtitle();
                                composer2.startReplaceGroup(734641211);
                                if (subtitle != null) {
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                valueButton = state.getValueButton();
                                if (valueButton instanceof ComboPickerContractRow3.ToggleButtonState) {
                                }
                                composer2.endNode();
                                price = state.getPrice();
                                composer2.startReplaceGroup(2026381898);
                                if (price != null) {
                                }
                                composer2.endReplaceGroup();
                                BentoIcon4.Size16 size162 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.TRASH_16);
                                String strStringResource2 = StringResources_androidKt.stringResource(C16283R.string.delete_icon_content_description, composer2, i11);
                                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer2, i9).m21425getFg0d7_KjU();
                                composer2.startReplaceGroup(i10);
                                if ((i6 & 112) != 32) {
                                }
                                objRememberedValue2 = composer2.rememberedValue();
                                if (i8 == 0) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return ComboPickerContractRow.ComboPickerContractRow$lambda$13$lambda$12$lambda$11$lambda$10(onDeleteClick);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                    composer2.endReplaceGroup();
                                    Composer composer52 = composer2;
                                    BentoIcon2.m20644BentoIconFU0evQE(size162, strStringResource2, jM21425getFg0d7_KjU2, com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue2, 7, null), new UserInteractionEventDescriptor("combos-remove-with-trash-" + state.getContractIdWithSide().getContractId(), null, null, null, new Component(Component.ComponentType.EVENT_CONTRACT_COMBO_LEG, "combos-remove-with-trash-" + state.getContractIdWithSide().getContractId(), null, 4, null), null, 46, null), false, false, false, true, false, null, 110, null), null, false, composer52, BentoIcon4.Size16.$stable, 48);
                                    composerStartRestartGroup = composer52;
                                    composerStartRestartGroup.endNode();
                                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i9).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier4 = modifier3;
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState ComboPickerContractRow$lambda$1$lambda$0(ComboPickerContractRowState comboPickerContractRowState) {
        return SnapshotState3.mutableStateOf$default(comboPickerContractRowState.getTitle(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ComboPickerContractRow$lambda$13$lambda$12$lambda$8$lambda$7$lambda$6 */
    public static final Unit m2003x3b05c6bd(Function1 function1, ContractSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
        function1.invoke(side);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComboPickerContractRow$lambda$13$lambda$12$lambda$11$lambda$10(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void StrikePriceValueButton(final ComboPickerContractRow3.StrikePriceButtonState strikePriceButtonState, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        ComboPickerContractRow3.StrikePriceButtonState strikePriceButtonState2;
        int i3;
        Modifier modifier2;
        Function0<Unit> function02;
        Composer composer2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1040557356);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            strikePriceButtonState2 = strikePriceButtonState;
        } else if ((i & 6) == 0) {
            strikePriceButtonState2 = strikePriceButtonState;
            i3 = (composerStartRestartGroup.changed(strikePriceButtonState2) ? 4 : 2) | i;
        } else {
            strikePriceButtonState2 = strikePriceButtonState;
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
                function02 = function0;
            } else {
                function02 = function0;
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1040557356, i3, -1, "com.robinhood.android.event.gamedetail.components.StrikePriceValueButton (ComboPickerContractRow.kt:208)");
                }
                RoundedCornerShape roundedCornerShape = ContractValueButtonShape;
                Modifier modifierClip = Clip.clip(modifier4, roundedCornerShape);
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(ClickableKt.m4893clickableXHw0xAI$default(BorderKt.m4876borderxT4_qwU(modifierClip, fM7995constructorimpl, bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), roundedCornerShape), false, null, null, function02, 7, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strikePriceButtonState2.getText(), modifierM5144paddingVpY3zN4$default, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composer2, 24576, 0, 8172);
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
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ComboPickerContractRow.StrikePriceValueButton$lambda$15(strikePriceButtonState, modifier5, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape roundedCornerShape2 = ContractValueButtonShape;
            Modifier modifierClip2 = Clip.clip(modifier4, roundedCornerShape2);
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(ClickableKt.m4893clickableXHw0xAI$default(BorderKt.m4876borderxT4_qwU(modifierClip2, fM7995constructorimpl2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU(), roundedCornerShape2), false, null, null, function02, 7, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            BentoText2.m20747BentoText38GnDrw(strikePriceButtonState2.getText(), modifierM5144paddingVpY3zN4$default2, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composer2, 24576, 0, 8172);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void ComboPickerContractRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-149243699);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-149243699, i, -1, "com.robinhood.android.event.gamedetail.components.ComboPickerContractRowPreview (ComboPickerContractRow.kt:227)");
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNull(uuidRandomUUID);
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(406630933, true, new C163011(uuidRandomUUID, new ContractIdWithSide(uuidRandomUUID, ContractSide.CONTRACT_SIDE_YES)), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ComboPickerContractRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComboPickerContractRow.ComboPickerContractRowPreview$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
