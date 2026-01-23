package com.robinhood.android.event.gamedetail.components;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.gamedetail.components.ComboPickerContractRow3;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ToggleButton.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\u001aB\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00060\fH\u0007¢\u0006\u0002\u0010\u0011\u001a-\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0012\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0013\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002"}, m3636d2 = {"ButtonShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "ButtonWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ToggleButton", "", "state", "Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$ToggleButtonState;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function1;", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "Lkotlin/ParameterName;", "name", "side", "(Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$ToggleButtonState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ToggleOptionWidth", "ToggleButtonCornerRaidus", "ToggleOption", "Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$ToggleButtonState$ToggleOption;", "Lkotlin/Function0;", "(Lcom/robinhood/android/event/gamedetail/components/ValueButtonState$ToggleButtonState$ToggleOption;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ToggleButtonLeftSelectedPreview", "(Landroidx/compose/runtime/Composer;I)V", "ToggleButtonRightSelectedPreview", "feature-game-detail_externalDebug", "animatedAlpha", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.components.ToggleButtonKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ToggleButton4 {
    private static final RoundedCornerShape ButtonShape;
    private static final float ToggleButtonCornerRaidus;
    private static final float ButtonWidth = C2002Dp.m7995constructorimpl(80);
    private static final float ToggleOptionWidth = C2002Dp.m7995constructorimpl(40);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleButton$lambda$5(ComboPickerContractRow3.ToggleButtonState toggleButtonState, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        ToggleButton(toggleButtonState, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleButtonLeftSelectedPreview$lambda$11(int i, Composer composer, int i2) {
        ToggleButtonLeftSelectedPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleButtonRightSelectedPreview$lambda$12(int i, Composer composer, int i2) {
        ToggleButtonRightSelectedPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleOption$lambda$10(ComboPickerContractRow3.ToggleButtonState.ToggleOption toggleOption, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        ToggleOption(toggleOption, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ToggleButton(final ComboPickerContractRow3.ToggleButtonState state, Modifier modifier, final Function1<? super ContractSide, Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue;
        boolean z2;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-475934542);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
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
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-475934542, i3, -1, "com.robinhood.android.event.gamedetail.components.ToggleButton (ToggleButton.kt:36)");
                }
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.m5174width3ABfNKs(Clip.clip(modifier4, ButtonShape), ButtonWidth), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
                ComboPickerContractRow3.ToggleButtonState.ToggleOption leftOption = state.getLeftOption();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i5 = i3 & 896;
                int i6 = i3 & 14;
                z = (i5 != 256) | (i6 != 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ToggleButtonKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ToggleButton4.ToggleButton$lambda$4$lambda$1$lambda$0(onClick, state);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ToggleOption(leftOption, null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 2);
                ComboPickerContractRow3.ToggleButtonState.ToggleOption rightOption = state.getRightOption();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z2 = (i5 != 256) | (i6 == 4);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ToggleButtonKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ToggleButton4.ToggleButton$lambda$4$lambda$3$lambda$2(onClick, state);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                ToggleOption(rightOption, null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ToggleButtonKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ToggleButton4.ToggleButton$lambda$5(state, modifier3, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.m5174width3ABfNKs(Clip.clip(modifier4, ButtonShape), ButtonWidth), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
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
                ComboPickerContractRow3.ToggleButtonState.ToggleOption leftOption2 = state.getLeftOption();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i52 = i3 & 896;
                int i62 = i3 & 14;
                z = (i52 != 256) | (i62 != 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ToggleButtonKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ToggleButton4.ToggleButton$lambda$4$lambda$1$lambda$0(onClick, state);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    ToggleOption(leftOption2, null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 2);
                    ComboPickerContractRow3.ToggleButtonState.ToggleOption rightOption2 = state.getRightOption();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    z2 = (i52 != 256) | (i62 == 4);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ToggleButtonKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ToggleButton4.ToggleButton$lambda$4$lambda$3$lambda$2(onClick, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        ToggleOption(rightOption2, null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 2);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleButton$lambda$4$lambda$1$lambda$0(Function1 function1, ComboPickerContractRow3.ToggleButtonState toggleButtonState) {
        function1.invoke(toggleButtonState.getLeftOption().getSide());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleButton$lambda$4$lambda$3$lambda$2(Function1 function1, ComboPickerContractRow3.ToggleButtonState toggleButtonState) {
        function1.invoke(toggleButtonState.getRightOption().getSide());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ToggleOption(ComboPickerContractRow3.ToggleButtonState.ToggleOption toggleOption, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        final ComboPickerContractRow3.ToggleButtonState.ToggleOption toggleOption2;
        int i3;
        Modifier modifier2;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState;
        final long jM21371getBg0d7_KjU;
        final long jM21373getBg30d7_KjU;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-422981266);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            toggleOption2 = toggleOption;
        } else if ((i & 6) == 0) {
            toggleOption2 = toggleOption;
            i3 = (composerStartRestartGroup.changed(toggleOption2) ? 4 : 2) | i;
        } else {
            toggleOption2 = toggleOption;
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
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-422981266, i3, -1, "com.robinhood.android.event.gamedetail.components.ToggleOption (ToggleButton.kt:68)");
                }
                snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!toggleOption2.isSelected() ? 1.0f : 0.0f, null, 0.0f, "toggleOptionAlpha", null, composerStartRestartGroup, 3072, 22);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU();
                TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null);
                TextStyle textStyleM7655copyp1EtxEg$default2 = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Clip.clip(modifier4, ButtonShape), ToggleOptionWidth);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(jM21371getBg0d7_KjU) | composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState) | composerStartRestartGroup.changed(jM21373getBg30d7_KjU);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.ToggleButtonKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ToggleButton4.ToggleOption$lambda$8$lambda$7(jM21371getBg0d7_KjU, jM21373getBg30d7_KjU, snapshotState4AnimateFloatAsState, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue = function1;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifierM5174width3ABfNKs, (Function1) objRememberedValue);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawBehind);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(toggleOption2.getText(), composerStartRestartGroup, StringResource.$stable), ClickableKt.m4891clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, null, function0, 28, null), null, null, null, null, null, 0, false, 0, 0, null, 0, !toggleOption2.isSelected() ? textStyleM7655copyp1EtxEg$default : textStyleM7655copyp1EtxEg$default2, composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ToggleButtonKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ToggleButton4.ToggleOption$lambda$10(toggleOption2, modifier3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!toggleOption2.isSelected() ? 1.0f : 0.0f, null, 0.0f, "toggleOptionAlpha", null, composerStartRestartGroup, 3072, 22);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            jM21371getBg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU();
            jM21373getBg30d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU();
            TextStyle textStyleM7655copyp1EtxEg$default3 = TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null);
            TextStyle textStyleM7655copyp1EtxEg$default22 = TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            Modifier modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(Clip.clip(modifier4, ButtonShape), ToggleOptionWidth);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChanged = composerStartRestartGroup.changed(jM21371getBg0d7_KjU) | composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState) | composerStartRestartGroup.changed(jM21373getBg30d7_KjU);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                Function1 function12 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.ToggleButtonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ToggleButton4.ToggleOption$lambda$8$lambda$7(jM21371getBg0d7_KjU, jM21373getBg30d7_KjU, snapshotState4AnimateFloatAsState, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function12);
                objRememberedValue = function12;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierDrawBehind2 = DrawModifierKt.drawBehind(modifierM5174width3ABfNKs2, (Function1) objRememberedValue);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawBehind2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(toggleOption2.getText(), composerStartRestartGroup, StringResource.$stable), ClickableKt.m4891clickableO2vRcR0$default(Modifier.INSTANCE, null, null, false, null, null, function0, 28, null), null, null, null, null, null, 0, false, 0, 0, null, 0, !toggleOption2.isSelected() ? textStyleM7655copyp1EtxEg$default3 : textStyleM7655copyp1EtxEg$default22, composerStartRestartGroup, 0, 0, 8188);
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

    private static final float ToggleOption$lambda$6(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToggleOption$lambda$8$lambda$7(long j, long j2, SnapshotState4 snapshotState4, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m6958drawRectnJ9OG0$default(drawBehind, Color.m6705copywmQWz5c$default(j, ToggleOption$lambda$6(snapshotState4), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(j2, ToggleOption$lambda$6(snapshotState4), 0.0f, 0.0f, 0.0f, 14, null);
        Stroke stroke = new Stroke(drawBehind.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1)), 0.0f, 0, 0, null, 30, null);
        float fMo5016toPx0680j_4 = drawBehind.mo5016toPx0680j_4(ToggleButtonCornerRaidus);
        DrawScope.m6960drawRoundRectuAw5IA$default(drawBehind, jM6705copywmQWz5c$default, 0L, 0L, CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_4) & 4294967295L)), stroke, 0.0f, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, null);
        return Unit.INSTANCE;
    }

    static {
        float f = 8;
        ButtonShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f));
        ToggleButtonCornerRaidus = C2002Dp.m7995constructorimpl(f);
    }

    private static final void ToggleButtonLeftSelectedPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(765773935);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(765773935, i, -1, "com.robinhood.android.event.gamedetail.components.ToggleButtonLeftSelectedPreview (ToggleButton.kt:115)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ToggleButton.INSTANCE.m14193getLambda$422016585$feature_game_detail_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ToggleButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ToggleButton4.ToggleButtonLeftSelectedPreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ToggleButtonRightSelectedPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(717489692);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(717489692, i, -1, "com.robinhood.android.event.gamedetail.components.ToggleButtonRightSelectedPreview (ToggleButton.kt:139)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ToggleButton.INSTANCE.m14192getLambda$1744278060$feature_game_detail_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ToggleButtonKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ToggleButton4.ToggleButtonRightSelectedPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
