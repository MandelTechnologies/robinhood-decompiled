package com.robinhood.android.event.gamedetail.components;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
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
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Density3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.event.gamedetail.builders.ContractElementExt;
import com.robinhood.android.event.gamedetail.components.ContractRowState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContractSelectorButton.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008c\u0001\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a_\u0010\u001b\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a;\u0010$\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\"\u0010#\u001a9\u0010'\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010&\"\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*\"\u0014\u0010,\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/ContractRowState$ContractOptionState;", "state", "Lkotlin/Function1;", "Lcom/robinhood/android/event/gamedetail/components/ContractOptionData;", "Lkotlin/ParameterName;", "name", "contractOptionData", "", "onContractSelected", "onContractUnSelected", "onContractLongPress", "Landroidx/compose/ui/Modifier;", "modifier", "ContractSelectorButton", "(Lcom/robinhood/android/event/gamedetail/components/ContractRowState$ContractOptionState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "onLongPress", "Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "type", "", "enabled", "Landroidx/compose/ui/graphics/Color;", "borderColorOverride", "buttonContent", "ContractButton-kbVaWH0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/compose/bento/component/BentoButtons$Type;ZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ContractButton", "Lcom/robinhood/utils/resource/StringResource;", "contractText", "", "americanOddsText", "contractLineColor", "oddsLineColor", "ContractButtonContent-t6yy7ic", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;JJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ContractButtonContent", "ContractSelectorButtonWithTwoLines-vc5YOHI", "(JJLjava/lang/String;Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ContractSelectorButtonWithTwoLines", "Landroidx/compose/ui/unit/Dp;", "ContractOptionButtonWidth", "F", "ContractOptionButtonHeight", "ContractOptionButtonPadding", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.components.ContractSelectorButtonKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ContractSelectorButton5 {
    private static final float ContractOptionButtonWidth = C2002Dp.m7995constructorimpl(80);
    private static final float ContractOptionButtonHeight = C2002Dp.m7995constructorimpl(36);
    private static final float ContractOptionButtonPadding = C2002Dp.m7995constructorimpl(-6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractButtonContent_t6yy7ic$lambda$7(StringResource stringResource, String str, long j, long j2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14204ContractButtonContentt6yy7ic(stringResource, str, j, j2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractButton_kbVaWH0$lambda$6(Function0 function0, Function0 function02, BentoButtons.Type type2, boolean z, Color color, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        m14203ContractButtonkbVaWH0(function0, function02, type2, z, color, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorButton$lambda$4(ContractRowState.ContractOptionState contractOptionState, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContractSelectorButton(contractOptionState, function1, function12, function13, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorButtonWithTwoLines_vc5YOHI$lambda$9(long j, long j2, String str, StringResource stringResource, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14205ContractSelectorButtonWithTwoLinesvc5YOHI(j, j2, str, stringResource, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContractSelectorButton(final ContractRowState.ContractOptionState state, final Function1<? super ContractOptionData, Unit> onContractSelected, final Function1<? super ContractOptionData, Unit> onContractUnSelected, final Function1<? super ContractOptionData, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final EventLogger current;
        long jM21425getFg0d7_KjU;
        long jM21427getFg30d7_KjU;
        final ContractOptionData contractOptionData;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean z;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onContractSelected, "onContractSelected");
        Intrinsics.checkNotNullParameter(onContractUnSelected, "onContractUnSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(436480869);
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
            i3 |= composerStartRestartGroup.changedInstance(onContractSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContractUnSelected) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(436480869, i4, -1, "com.robinhood.android.event.gamedetail.components.ContractSelectorButton (ContractSelectorButton.kt:45)");
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                BentoButtons.Type type2 = !state.isSelected() ? BentoButtons.Type.Primary : BentoButtons.Type.Secondary;
                if (state.isEnabled()) {
                    composerStartRestartGroup.startReplaceGroup(-1448660728);
                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (state.isSelected()) {
                    composerStartRestartGroup.startReplaceGroup(-1448659001);
                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1448657689);
                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (state.isEnabled()) {
                    composerStartRestartGroup.startReplaceGroup(-1448654360);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1448655224);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1448653222);
                Function0 function0 = null;
                Color colorM6701boximpl = !state.isSelected() ? null : Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU());
                composerStartRestartGroup.endReplaceGroup();
                contractOptionData = new ContractOptionData(ContractElementExt.toContractIdWithSide(state.getContractElement()), ContractElementExt.toContractIdWithSide(state.getContractElement()), null, state.getContractColumnType());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(state) | ((i4 & 896) != 256) | composerStartRestartGroup.changedInstance(contractOptionData) | composerStartRestartGroup.changedInstance(current) | ((i4 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ContractSelectorButtonKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContractSelectorButton5.ContractSelectorButton$lambda$1$lambda$0(state, onContractUnSelected, contractOptionData, current, onContractSelected);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 function02 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                z = function1 == null && state.getSupportLongPress();
                composerStartRestartGroup.startReplaceGroup(-1448616923);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = ((i4 & 7168) == 2048) | composerStartRestartGroup.changedInstance(contractOptionData);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ContractSelectorButtonKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ContractSelectorButton5.ContractSelectorButton$lambda$3$lambda$2(function1, contractOptionData);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function0 = (Function0) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                final long j = jM21425getFg0d7_KjU;
                final long j2 = jM21427getFg30d7_KjU;
                m14203ContractButtonkbVaWH0(function02, function0, type2, state.isEnabled(), colorM6701boximpl, modifier4, ComposableLambda3.rememberComposableLambda(1802893276, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.components.ContractSelectorButtonKt.ContractSelectorButton.2
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
                            ComposerKt.traceEventStart(1802893276, i6, -1, "com.robinhood.android.event.gamedetail.components.ContractSelectorButton.<anonymous> (ContractSelectorButton.kt:98)");
                        }
                        ContractSelectorButton5.m14204ContractButtonContentt6yy7ic(state.getText(), state.getSubText(), j, j2, Modifier.INSTANCE, composer2, StringResource.$stable | 24576, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 458752) | 1572864, 0);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ContractSelectorButtonKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return ContractSelectorButton5.ContractSelectorButton$lambda$4(state, onContractSelected, onContractUnSelected, function1, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            BentoButtons.Type type22 = !state.isSelected() ? BentoButtons.Type.Primary : BentoButtons.Type.Secondary;
            if (state.isEnabled()) {
            }
            if (state.isEnabled()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1448653222);
            Function0 function03 = null;
            if (!state.isSelected()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            contractOptionData = new ContractOptionData(ContractElementExt.toContractIdWithSide(state.getContractElement()), ContractElementExt.toContractIdWithSide(state.getContractElement()), null, state.getContractColumnType());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = composerStartRestartGroup.changedInstance(state) | ((i4 & 896) != 256) | composerStartRestartGroup.changedInstance(contractOptionData) | composerStartRestartGroup.changedInstance(current) | ((i4 & 112) != 32);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                Object obj2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ContractSelectorButtonKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContractSelectorButton5.ContractSelectorButton$lambda$1$lambda$0(state, onContractUnSelected, contractOptionData, current, onContractSelected);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj2);
                objRememberedValue = obj2;
                Function0 function022 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                if (function1 == null) {
                    composerStartRestartGroup.startReplaceGroup(-1448616923);
                    if (z) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final long j3 = jM21425getFg0d7_KjU;
                    final long j22 = jM21427getFg30d7_KjU;
                    m14203ContractButtonkbVaWH0(function022, function03, type22, state.isEnabled(), colorM6701boximpl, modifier4, ComposableLambda3.rememberComposableLambda(1802893276, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.components.ContractSelectorButtonKt.ContractSelectorButton.2
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
                                ComposerKt.traceEventStart(1802893276, i6, -1, "com.robinhood.android.event.gamedetail.components.ContractSelectorButton.<anonymous> (ContractSelectorButton.kt:98)");
                            }
                            ContractSelectorButton5.m14204ContractButtonContentt6yy7ic(state.getText(), state.getSubText(), j3, j22, Modifier.INSTANCE, composer2, StringResource.$stable | 24576, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 458752) | 1572864, 0);
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
    public static final Unit ContractSelectorButton$lambda$1$lambda$0(ContractRowState.ContractOptionState contractOptionState, Function1 function1, ContractOptionData contractOptionData, EventLogger eventLogger, Function1 function12) {
        if (contractOptionState.isSelected()) {
            function1.invoke(contractOptionData);
        } else {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.GAME_DETAIL_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, contractOptionState.getLoggingIdentifier(), null, 4, null), null, new Context(0, 0, 0, contractOptionState.getLoggingContext(), null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null), false, 41, null);
            function12.invoke(contractOptionData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSelectorButton$lambda$3$lambda$2(Function1 function1, ContractOptionData contractOptionData) {
        function1.invoke(contractOptionData);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015a  */
    /* renamed from: ContractButton-kbVaWH0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m14203ContractButtonkbVaWH0(final Function0<Unit> function0, final Function0<Unit> function02, final BentoButtons.Type type2, final boolean z, final Color color, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Function0<Unit> function03;
        int i3;
        Function0<Unit> function04;
        Modifier modifier2;
        long jM21371getBg0d7_KjU;
        long jM21373getBg30d7_KjU;
        final Modifier modifier3;
        boolean z2;
        Modifier modifierM4897combinedClickablef5TDLPQ$default;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-353805613);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function03 = function0;
        } else if ((i & 6) == 0) {
            function03 = function0;
            i3 = (composerStartRestartGroup.changedInstance(function03) ? 4 : 2) | i;
        } else {
            function03 = function0;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function04 = function02;
        } else {
            function04 = function02;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function04) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(type2.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(color) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
            }
            if ((599187 & i3) != 599186 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-353805613, i3, -1, "com.robinhood.android.event.gamedetail.components.ContractButton (ContractSelectorButton.kt:117)");
                }
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(40));
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-704763850);
                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (type2 == BentoButtons.Type.Primary) {
                    composerStartRestartGroup.startReplaceGroup(-704761707);
                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-704760523);
                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-704758058);
                    jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (color != null) {
                    composerStartRestartGroup.startReplaceGroup(-704756666);
                    composerStartRestartGroup.endReplaceGroup();
                    jM21373getBg30d7_KjU = color.getValue();
                } else if (type2 == BentoButtons.Type.Primary) {
                    composerStartRestartGroup.startReplaceGroup(-704754027);
                    jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-704752842);
                    jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifierBorder = BorderKt.border(Background3.m4871backgroundbw27NRU(Clip.clip(SizeKt.m5171sizeVpY3zN4(modifier4, ContractOptionButtonWidth, ContractOptionButtonHeight), roundedCornerShapeM5327RoundedCornerShape0680j_4), jM21371getBg0d7_KjU, roundedCornerShapeM5327RoundedCornerShape0680j_4), BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), jM21373getBg30d7_KjU), roundedCornerShapeM5327RoundedCornerShape0680j_4);
                if (!z) {
                    modifier3 = modifier4;
                    Function0<Unit> function05 = function03;
                    z2 = true;
                    modifierM4897combinedClickablef5TDLPQ$default = ClickableKt.m4897combinedClickablef5TDLPQ$default(Modifier.INSTANCE, false, null, Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c()), null, function04, null, false, function05, 107, null);
                } else {
                    modifier3 = modifier4;
                    z2 = true;
                    modifierM4897combinedClickablef5TDLPQ$default = Modifier.INSTANCE;
                }
                Modifier modifierThen = modifierBorder.then(modifierM4897combinedClickablef5TDLPQ$default);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                CompositionLocal3.CompositionLocalProvider(CompositionLocalsKt.getLocalDensity().provides(Density3.Density(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity(), 1.0f)), ComposableLambda3.rememberComposableLambda(-378811827, z2, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.components.ContractSelectorButtonKt$ContractButton$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-378811827, i5, -1, "com.robinhood.android.event.gamedetail.components.ContractButton.<anonymous>.<anonymous> (ContractSelectorButton.kt:159)");
                        }
                        function2.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ContractSelectorButtonKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContractSelectorButton5.ContractButton_kbVaWH0$lambda$6(function0, function02, type2, z, color, modifier3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((i2 & 64) == 0) {
        }
        if ((599187 & i3) != 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(40));
            if (z) {
            }
            if (z) {
            }
            Modifier modifierBorder2 = BorderKt.border(Background3.m4871backgroundbw27NRU(Clip.clip(SizeKt.m5171sizeVpY3zN4(modifier4, ContractOptionButtonWidth, ContractOptionButtonHeight), roundedCornerShapeM5327RoundedCornerShape0680j_42), jM21371getBg0d7_KjU, roundedCornerShapeM5327RoundedCornerShape0680j_42), BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), jM21373getBg30d7_KjU), roundedCornerShapeM5327RoundedCornerShape0680j_42);
            if (!z) {
            }
            Modifier modifierThen2 = modifierBorder2.then(modifierM4897combinedClickablef5TDLPQ$default);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
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
                CompositionLocal3.CompositionLocalProvider(CompositionLocalsKt.getLocalDensity().provides(Density3.Density(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity(), 1.0f)), ComposableLambda3.rememberComposableLambda(-378811827, z2, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.components.ContractSelectorButtonKt$ContractButton$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-378811827, i5, -1, "com.robinhood.android.event.gamedetail.components.ContractButton.<anonymous>.<anonymous> (ContractSelectorButton.kt:159)");
                        }
                        function2.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: ContractButtonContent-t6yy7ic, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14204ContractButtonContentt6yy7ic(StringResource stringResource, final String str, final long j, final long j2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        int i4;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final StringResource stringResource2 = stringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1150553612);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                j3 = j;
                i3 |= composerStartRestartGroup.changed(j3) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1150553612, i3, -1, "com.robinhood.android.event.gamedetail.components.ContractButtonContent (ContractSelectorButton.kt:171)");
                    }
                    if (str == null) {
                        composerStartRestartGroup.startReplaceGroup(1991581976);
                        m14205ContractSelectorButtonWithTwoLinesvc5YOHI(j3, j2, str, stringResource2, modifier3, composerStartRestartGroup, ((i3 >> 6) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i3 << 3) & 896) | (StringResource.$stable << 9) | ((i3 << 9) & 7168) | (i3 & 57344), 0);
                        stringResource2 = stringResource2;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1991864138);
                        Modifier modifier4 = modifier3;
                        BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(stringResource2, composerStartRestartGroup, StringResource.$stable | (i3 & 14)), modifier4, Color.m6701boximpl(j), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), composerStartRestartGroup, ((i3 >> 9) & 112) | 24576 | (i3 & 896), 0, 8104);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ContractSelectorButtonKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ContractSelectorButton5.ContractButtonContent_t6yy7ic$lambda$7(stringResource2, str, j, j2, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) != 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (str == null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        j3 = j;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* renamed from: ContractSelectorButtonWithTwoLines-vc5YOHI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14205ContractSelectorButtonWithTwoLinesvc5YOHI(final long j, final long j2, final String americanOddsText, final StringResource contractText, Modifier modifier, Composer composer, final int i, final int i2) {
        long j3;
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(americanOddsText, "americanOddsText");
        Intrinsics.checkNotNullParameter(contractText, "contractText");
        Composer composerStartRestartGroup = composer.startRestartGroup(1315093077);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            j3 = j;
        } else if ((i & 6) == 0) {
            j3 = j;
            i3 = (composerStartRestartGroup.changed(j3) ? 4 : 2) | i;
        } else {
            j3 = j;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(americanOddsText) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(contractText) : composerStartRestartGroup.changedInstance(contractText) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1315093077, i3, -1, "com.robinhood.android.event.gamedetail.components.ContractSelectorButtonWithTwoLines (ContractSelectorButton.kt:199)");
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(ContractOptionButtonPadding), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String textAsString = StringResources6.getTextAsString(contractText, composerStartRestartGroup, StringResource.$stable | ((i3 >> 9) & 14));
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    TextAlign.Companion companion2 = TextAlign.INSTANCE;
                    int i6 = i3;
                    Modifier modifier5 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(textAsString, null, Color.m6701boximpl(j3), null, bold, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 1, 0, null, 0, textS, composerStartRestartGroup, ((i6 << 6) & 896) | 805330944, 0, 7594);
                    composerStartRestartGroup = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(americanOddsText, null, Color.m6701boximpl(j2), null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextAnnotation(), composerStartRestartGroup, ((i6 >> 6) & 14) | 805306368 | ((i6 << 3) & 896), 0, 7610);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ContractSelectorButtonKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ContractSelectorButton5.ContractSelectorButtonWithTwoLines_vc5YOHI$lambda$9(j, j2, americanOddsText, contractText, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(ContractOptionButtonPadding), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    String textAsString2 = StringResources6.getTextAsString(contractText, composerStartRestartGroup, StringResource.$stable | ((i3 >> 9) & 14));
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                    FontWeight bold2 = FontWeight.INSTANCE.getBold();
                    TextAlign.Companion companion22 = TextAlign.INSTANCE;
                    int i62 = i3;
                    Modifier modifier52 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(textAsString2, null, Color.m6701boximpl(j3), null, bold2, null, TextAlign.m7912boximpl(companion22.m7919getCentere0LSkKk()), 0, false, 1, 0, null, 0, textS2, composerStartRestartGroup, ((i62 << 6) & 896) | 805330944, 0, 7594);
                    composerStartRestartGroup = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(americanOddsText, null, Color.m6701boximpl(j2), null, null, null, TextAlign.m7912boximpl(companion22.m7919getCentere0LSkKk()), 0, false, 1, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextAnnotation(), composerStartRestartGroup, ((i62 >> 6) & 14) | 805306368 | ((i62 << 3) & 896), 0, 7610);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
