package com.robinhood.android.equityadvancedorder.composables;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.window.AndroidPopup_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRow5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityAdvancedOrderFloatingSelectionRow.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aC\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a=\u0010\u000f\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\nH\u0003¢\u0006\u0002\u0010\u0017\u001a9\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\r2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\nH\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001f\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u001d\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006 ²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\rX\u008a\u008e\u0002"}, m3636d2 = {"SelectionRowPopupMaxWidth", "Landroidx/compose/ui/unit/Dp;", "F", "EquityAdvancedOrderFloatingSelectionRow", "", "state", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection;", "modifier", "Landroidx/compose/ui/Modifier;", "onFloatingSelectionRowTap", "Lkotlin/Function1;", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "initialShowPopup", "", "(Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "FloatingSelectionRowPopup", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "popupYOffset", "", "resources", "Landroid/content/res/Resources;", "onSelectionItemClicked", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection$SelectionItem;", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection;ILandroid/content/res/Resources;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "FloatingSelectionRowItem", "selectionItem", "lastItem", "(Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$FloatingSelection$SelectionItem;Landroid/content/res/Resources;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SelectionRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "SelectionRowPopupOpenPreview", "SelectionRowPopupSmallDeviceLargeFont", "lib-equity-advanced-order_externalDebug", "showSelectionPopup"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityAdvancedOrderFloatingSelectionRow5 {
    private static final float SelectionRowPopupMaxWidth = C2002Dp.m7995constructorimpl(200);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityAdvancedOrderFloatingSelectionRow$lambda$10(EquityOrderFormRowState.FloatingSelection floatingSelection, Modifier modifier, Function1 function1, boolean z, int i, int i2, Composer composer, int i3) {
        EquityAdvancedOrderFloatingSelectionRow(floatingSelection, modifier, function1, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingSelectionRowItem$lambda$18(EquityOrderFormRowState.FloatingSelection.SelectionItem selectionItem, Resources resources, boolean z, Function1 function1, int i, Composer composer, int i2) throws Resources.NotFoundException {
        FloatingSelectionRowItem(selectionItem, resources, z, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingSelectionRowPopup$lambda$14(BoxWithConstraints4 boxWithConstraints4, EquityOrderFormRowState.FloatingSelection floatingSelection, int i, Resources resources, Function1 function1, int i2, Composer composer, int i3) {
        FloatingSelectionRowPopup(boxWithConstraints4, floatingSelection, i, resources, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionRowPopupOpenPreview$lambda$20(int i, Composer composer, int i2) {
        SelectionRowPopupOpenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionRowPopupSmallDeviceLargeFont$lambda$21(int i, Composer composer, int i2) {
        SelectionRowPopupSmallDeviceLargeFont(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionRowPreview$lambda$19(int i, Composer composer, int i2) {
        SelectionRowPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityAdvancedOrderFloatingSelectionRow(final EquityOrderFormRowState.FloatingSelection state, Modifier modifier, Function1<? super EditingField, Unit> function1, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Function1<? super EditingField, Unit> function12;
        int i5;
        boolean z2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        SnapshotState snapshotState;
        Modifier modifierSemantics$default;
        final Function1<? super EditingField, Unit> function13;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1820483045);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            function12 = null;
                        }
                        boolean z4 = i5 == 0 ? false : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1820483045, i3, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRow (EquityAdvancedOrderFloatingSelectionRow.kt:67)");
                        }
                        final Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z4), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1432536272);
                        if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = ((i3 & 896) == 256) | composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changedInstance(resources);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return EquityAdvancedOrderFloatingSelectionRow5.m1963xfb7efce4(state, resources, function12, snapshotState2, (SemanticsPropertyReceiver) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            snapshotState = snapshotState2;
                            modifierSemantics$default = SemanticsModifier6.semantics$default(modifier4, false, (Function1) objRememberedValue3, 1, null);
                        } else {
                            snapshotState = snapshotState2;
                            modifierSemantics$default = modifier4;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Function1<? super EditingField, Unit> function14 = function12;
                        BoxWithConstraints.BoxWithConstraints(modifierSemantics$default, null, false, ComposableLambda3.rememberComposableLambda(-1207855429, true, new C152992(state, resources, snapshotIntState2, function14, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function13 = function14;
                        modifier3 = modifier4;
                        z3 = z4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        function13 = function12;
                        z3 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EquityAdvancedOrderFloatingSelectionRow5.EquityAdvancedOrderFloatingSelectionRow$lambda$10(state, modifier3, function13, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                z2 = z;
                if ((i3 & 1171) == 1170) {
                    if (i6 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    final SnapshotState snapshotState22 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1432536272);
                    if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function1<? super EditingField, Unit> function142 = function12;
                    BoxWithConstraints.BoxWithConstraints(modifierSemantics$default, null, false, ComposableLambda3.rememberComposableLambda(-1207855429, true, new C152992(state, resources2, snapshotIntState22, function142, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function13 = function142;
                    modifier3 = modifier4;
                    z3 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function12 = function1;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            z2 = z;
            if ((i3 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EquityAdvancedOrderFloatingSelectionRow$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EquityAdvancedOrderFloatingSelectionRow$lambda$9$lambda$8$lambda$7 */
    public static final Unit m1963xfb7efce4(final EquityOrderFormRowState.FloatingSelection floatingSelection, Resources resources, final Function1 function1, final SnapshotState snapshotState, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.selectableGroup(semantics);
        SemanticsPropertiesKt.setTestTag(semantics, floatingSelection.getTestTag());
        StringResource value = floatingSelection.getValue();
        Intrinsics.checkNotNull(resources);
        SemanticsPropertiesKt.setText(semantics, new AnnotatedString(value.getText(resources).toString(), null, 2, null));
        SemanticsPropertiesKt.setStateDescription(semantics, floatingSelection.getTitle().getText(resources).toString());
        if (floatingSelection.getOrderFormState() == OrderForm6.EDITING) {
            SemanticsPropertiesKt.onClick$default(semantics, null, new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(EquityAdvancedOrderFloatingSelectionRow5.m1964x66746259(function1, floatingSelection, snapshotState));
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int EquityAdvancedOrderFloatingSelectionRow$lambda$1(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EquityAdvancedOrderFloatingSelectionRow$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EquityAdvancedOrderFloatingSelectionRow$lambda$9$lambda$8$lambda$7$lambda$6 */
    public static final boolean m1964x66746259(Function1 function1, EquityOrderFormRowState.FloatingSelection floatingSelection, SnapshotState snapshotState) {
        EquityAdvancedOrderFloatingSelectionRow$lambda$5(snapshotState, !EquityAdvancedOrderFloatingSelectionRow$lambda$4(snapshotState));
        if (function1 != null) {
            function1.invoke(floatingSelection.getRowType());
        }
        return true;
    }

    /* compiled from: EquityAdvancedOrderFloatingSelectionRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$EquityAdvancedOrderFloatingSelectionRow$2 */
    static final class C152992 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
        final /* synthetic */ Function1<EditingField, Unit> $onFloatingSelectionRowTap;
        final /* synthetic */ SnapshotIntState2 $popupYOffset$delegate;
        final /* synthetic */ Resources $resources;
        final /* synthetic */ SnapshotState<Boolean> $showSelectionPopup$delegate;
        final /* synthetic */ EquityOrderFormRowState.FloatingSelection $state;

        /* JADX WARN: Multi-variable type inference failed */
        C152992(EquityOrderFormRowState.FloatingSelection floatingSelection, Resources resources, SnapshotIntState2 snapshotIntState2, Function1<? super EditingField, Unit> function1, SnapshotState<Boolean> snapshotState) {
            this.$state = floatingSelection;
            this.$resources = resources;
            this.$popupYOffset$delegate = snapshotIntState2;
            this.$onFloatingSelectionRowTap = function1;
            this.$showSelectionPopup$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
            invoke(boxWithConstraints4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotIntState2 snapshotIntState2, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            EquityAdvancedOrderFloatingSelectionRow5.EquityAdvancedOrderFloatingSelectionRow$lambda$2(snapshotIntState2, (int) (it.mo7241getSizeYbymL2g() & 4294967295L));
            return Unit.INSTANCE;
        }

        /* compiled from: EquityAdvancedOrderFloatingSelectionRow.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$EquityAdvancedOrderFloatingSelectionRow$2$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ Function1<EditingField, Unit> $onFloatingSelectionRowTap;
            final /* synthetic */ Resources $resources;
            final /* synthetic */ SnapshotState<Boolean> $showSelectionPopup$delegate;
            final /* synthetic */ EquityOrderFormRowState.FloatingSelection $state;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(EquityOrderFormRowState.FloatingSelection floatingSelection, Function1<? super EditingField, Unit> function1, SnapshotState<Boolean> snapshotState, Resources resources) {
                this.$state = floatingSelection;
                this.$onFloatingSelectionRowTap = function1;
                this.$showSelectionPopup$delegate = snapshotState;
                this.$resources = resources;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-895781765, i, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRow.<anonymous>.<anonymous> (EquityAdvancedOrderFloatingSelectionRow.kt:108)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changed(this.$onFloatingSelectionRowTap);
                final EquityOrderFormRowState.FloatingSelection floatingSelection = this.$state;
                final Function1<EditingField, Unit> function1 = this.$onFloatingSelectionRowTap;
                final SnapshotState<Boolean> snapshotState = this.$showSelectionPopup$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$EquityAdvancedOrderFloatingSelectionRow$2$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EquityAdvancedOrderFloatingSelectionRow5.C152992.AnonymousClass3.invoke$lambda$1$lambda$0(floatingSelection, function1, snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$EquityAdvancedOrderFloatingSelectionRow$2$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EquityAdvancedOrderFloatingSelectionRow5.C152992.AnonymousClass3.invoke$lambda$3$lambda$2((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierM4893clickableXHw0xAI$default, false, (Function1) objRememberedValue2, 1, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                EquityOrderFormRowState.FloatingSelection floatingSelection2 = this.$state;
                Resources resources = this.$resources;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierSemantics$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                StringResource value = floatingSelection2.getValue();
                Intrinsics.checkNotNull(resources);
                String string2 = value.getText(resources).toString();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 817889280, 0, 7550);
                composer.startReplaceGroup(-564445527);
                if (floatingSelection2.getOrderFormState() == OrderForm6.EDITING) {
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DROPDOWN_16), null, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer, BentoIcon4.Size16.$stable | 48, 48);
                }
                composer.endReplaceGroup();
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
            public static final Unit invoke$lambda$1$lambda$0(EquityOrderFormRowState.FloatingSelection floatingSelection, Function1 function1, SnapshotState snapshotState) {
                if (floatingSelection.getOrderFormState() == OrderForm6.EDITING) {
                    if (function1 != null) {
                        function1.invoke(floatingSelection.getRowType());
                    }
                    EquityAdvancedOrderFloatingSelectionRow5.EquityAdvancedOrderFloatingSelectionRow$lambda$5(snapshotState, !EquityAdvancedOrderFloatingSelectionRow5.EquityAdvancedOrderFloatingSelectionRow$lambda$4(snapshotState));
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$2(SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.hideFromAccessibility(semantics);
                return Unit.INSTANCE;
            }
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
                ComposerKt.traceEventStart(-1207855429, i2, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRow.<anonymous> (EquityAdvancedOrderFloatingSelectionRow.kt:95)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            final SnapshotIntState2 snapshotIntState2 = this.$popupYOffset$delegate;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$EquityAdvancedOrderFloatingSelectionRow$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EquityAdvancedOrderFloatingSelectionRow5.C152992.invoke$lambda$1$lambda$0(snapshotIntState2, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue);
            boolean showDivider = this.$state.getShowDivider();
            final EquityOrderFormRowState.FloatingSelection floatingSelection = this.$state;
            final Resources resources = this.$resources;
            int i3 = i2;
            BentoBaseRowLayout.BentoBaseRowLayout(modifierOnGloballyPositioned, null, ComposableLambda3.rememberComposableLambda(861989495, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt.EquityAdvancedOrderFloatingSelectionRow.2.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(861989495, i4, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRow.<anonymous>.<anonymous> (EquityAdvancedOrderFloatingSelectionRow.kt:102)");
                    }
                    StringResource title = floatingSelection.getTitle();
                    Resources resources2 = resources;
                    Intrinsics.checkNotNull(resources2);
                    BentoText2.m20747BentoText38GnDrw(title.getText(resources2).toString(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 0, 0, 8190);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), null, null, null, ComposableLambda3.rememberComposableLambda(-895781765, true, new AnonymousClass3(this.$state, this.$onFloatingSelectionRowTap, this.$showSelectionPopup$delegate, this.$resources), composer, 54), showDivider, false, true, null, composer, 806879622, 0, 1338);
            if (EquityAdvancedOrderFloatingSelectionRow5.EquityAdvancedOrderFloatingSelectionRow$lambda$4(this.$showSelectionPopup$delegate) && this.$state.getOrderFormState() == OrderForm6.EDITING) {
                int iEquityAdvancedOrderFloatingSelectionRow$lambda$1 = EquityAdvancedOrderFloatingSelectionRow5.EquityAdvancedOrderFloatingSelectionRow$lambda$1(this.$popupYOffset$delegate);
                Resources resources2 = this.$resources;
                Intrinsics.checkNotNull(resources2);
                EquityOrderFormRowState.FloatingSelection floatingSelection2 = this.$state;
                composer.startReplaceGroup(5004770);
                final SnapshotState<Boolean> snapshotState = this.$showSelectionPopup$delegate;
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$EquityAdvancedOrderFloatingSelectionRow$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EquityAdvancedOrderFloatingSelectionRow5.C152992.invoke$lambda$3$lambda$2(snapshotState, (EquityOrderFormRowState.FloatingSelection.SelectionItem) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                EquityAdvancedOrderFloatingSelectionRow5.FloatingSelectionRowPopup(BoxWithConstraints, floatingSelection2, iEquityAdvancedOrderFloatingSelectionRow$lambda$1, resources2, (Function1) objRememberedValue2, composer, (i3 & 14) | 24576);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, EquityOrderFormRowState.FloatingSelection.SelectionItem selectionItem) {
            Intrinsics.checkNotNullParameter(selectionItem, "selectionItem");
            EquityAdvancedOrderFloatingSelectionRow5.EquityAdvancedOrderFloatingSelectionRow$lambda$5(snapshotState, false);
            selectionItem.getOnClick().invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EquityAdvancedOrderFloatingSelectionRow$lambda$2(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FloatingSelectionRowPopup(final BoxWithConstraints4 boxWithConstraints4, final EquityOrderFormRowState.FloatingSelection floatingSelection, final int i, final Resources resources, final Function1<? super EquityOrderFormRowState.FloatingSelection.SelectionItem, Unit> function1, Composer composer, final int i2) {
        int i3;
        final Resources resources2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1348438420);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(boxWithConstraints4) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(floatingSelection) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            resources2 = resources;
            i3 |= composerStartRestartGroup.changedInstance(resources2) ? 2048 : 1024;
        } else {
            resources2 = resources;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1348438420, i3, -1, "com.robinhood.android.equityadvancedorder.composables.FloatingSelectionRowPopup (EquityAdvancedOrderFloatingSelectionRow.kt:157)");
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Alignment topEnd = Alignment.INSTANCE.getTopEnd();
            long jM8033constructorimpl = IntOffset.m8033constructorimpl((0 << 32) | (((int) (i * 0.9d)) & 4294967295L));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = ((i3 & 57344) == 16384) | composerStartRestartGroup.changedInstance(floatingSelection);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityAdvancedOrderFloatingSelectionRow5.FloatingSelectionRowPopup$lambda$13$lambda$12(floatingSelection, function1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidPopup_androidKt.m8111PopupK5zGePQ(topEnd, jM8033constructorimpl, (Function0) objRememberedValue, null, ComposableLambda3.rememberComposableLambda(310500343, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt.FloatingSelectionRowPopup.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(310500343, i4, -1, "com.robinhood.android.equityadvancedorder.composables.FloatingSelectionRowPopup.<anonymous> (EquityAdvancedOrderFloatingSelectionRow.kt:170)");
                    }
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(6));
                    CardDefaults cardDefaults = CardDefaults.INSTANCE;
                    long jM21372getBg20d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21372getBg20d7_KjU();
                    int i5 = CardDefaults.$stable;
                    CardColors cardColorsM5729cardColorsro_MJ88 = cardDefaults.m5729cardColorsro_MJ88(jM21372getBg20d7_KjU, 0L, 0L, 0L, composer2, i5 << 12, 14);
                    CardElevation cardElevationM5730cardElevationaqJV_2Y = cardDefaults.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, (i5 << 18) | 6, 62);
                    Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, ((C2002Dp) ComparisonsKt.minOf(C2002Dp.m7993boximpl(density.mo5013toDpu2uoSUM((int) (Constraints.m7975getMaxWidthimpl(boxWithConstraints4.getConstraints()) / 1.5d))), C2002Dp.m7993boximpl(EquityAdvancedOrderFloatingSelectionRow5.SelectionRowPopupMaxWidth))).getValue());
                    final EquityOrderFormRowState.FloatingSelection floatingSelection2 = floatingSelection;
                    final Resources resources3 = resources2;
                    final Function1<EquityOrderFormRowState.FloatingSelection.SelectionItem, Unit> function12 = function1;
                    CardKt.ElevatedCard(modifierM5174width3ABfNKs, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardColorsM5729cardColorsro_MJ88, cardElevationM5730cardElevationaqJV_2Y, ComposableLambda3.rememberComposableLambda(332102578, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt.FloatingSelectionRowPopup.2.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) throws Resources.NotFoundException {
                            invoke(column5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 ElevatedCard, Composer composer3, int i6) throws Resources.NotFoundException {
                            Intrinsics.checkNotNullParameter(ElevatedCard, "$this$ElevatedCard");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(332102578, i6, -1, "com.robinhood.android.equityadvancedorder.composables.FloatingSelectionRowPopup.<anonymous>.<anonymous> (EquityAdvancedOrderFloatingSelectionRow.kt:188)");
                            }
                            List<EquityOrderFormRowState.FloatingSelection.SelectionItem> selectionItems = floatingSelection2.getSelectionItems();
                            Resources resources4 = resources3;
                            EquityOrderFormRowState.FloatingSelection floatingSelection3 = floatingSelection2;
                            Function1<EquityOrderFormRowState.FloatingSelection.SelectionItem, Unit> function13 = function12;
                            int i7 = 0;
                            for (Object obj : selectionItems) {
                                int i8 = i7 + 1;
                                if (i7 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                EquityAdvancedOrderFloatingSelectionRow5.FloatingSelectionRowItem((EquityOrderFormRowState.FloatingSelection.SelectionItem) obj, resources4, i7 < CollectionsKt.getLastIndex(floatingSelection3.getSelectionItems()), function13, composer3, 0);
                                i7 = i8;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 24576, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityAdvancedOrderFloatingSelectionRow5.FloatingSelectionRowPopup$lambda$14(boxWithConstraints4, floatingSelection, i, resources, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingSelectionRowPopup$lambda$13$lambda$12(EquityOrderFormRowState.FloatingSelection floatingSelection, Function1 function1) {
        for (EquityOrderFormRowState.FloatingSelection.SelectionItem selectionItem : floatingSelection.getSelectionItems()) {
            if ((selectionItem instanceof EquityOrderFormRowState.FloatingSelection.SelectionItem.Checkable) && ((EquityOrderFormRowState.FloatingSelection.SelectionItem.Checkable) selectionItem).getSelected()) {
                function1.invoke(selectionItem);
                return Unit.INSTANCE;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FloatingSelectionRowItem(final EquityOrderFormRowState.FloatingSelection.SelectionItem selectionItem, final Resources resources, final boolean z, final Function1<? super EquityOrderFormRowState.FloatingSelection.SelectionItem, Unit> function1, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1331174632);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(selectionItem) : composerStartRestartGroup.changedInstance(selectionItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(resources) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1331174632, i2, -1, "com.robinhood.android.equityadvancedorder.composables.FloatingSelectionRowItem (EquityAdvancedOrderFloatingSelectionRow.kt:207)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            boolean z2 = true;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(12)), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z3 = (i2 & 7168) == 2048;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composerStartRestartGroup.changedInstance(selectionItem))) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityAdvancedOrderFloatingSelectionRow5.FloatingSelectionRowItem$lambda$16$lambda$15(function1, selectionItem);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue, 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            CharSequence text = selectionItem.getValue().getText(resources);
            BentoText2.m20747BentoText38GnDrw(text.toString(), null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 817889280, 0, 7550);
            composerStartRestartGroup = composerStartRestartGroup;
            if (selectionItem instanceof EquityOrderFormRowState.FloatingSelection.SelectionItem.Checkable) {
                composerStartRestartGroup.startReplaceGroup(1200681691);
                if (((EquityOrderFormRowState.FloatingSelection.SelectionItem.Checkable) selectionItem).getSelected()) {
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CHECKMARK_16), null, bentoTheme.getColors(composerStartRestartGroup, i3).m21456getPositive0d7_KjU(), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), ((Object) text) + "_selected"), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(selectionItem instanceof EquityOrderFormRowState.FloatingSelection.SelectionItem.MoreOptions)) {
                    composerStartRestartGroup.startReplaceGroup(-376913179);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1201313781);
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48, 48);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (z) {
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityAdvancedOrderFloatingSelectionRow5.FloatingSelectionRowItem$lambda$18(selectionItem, resources, z, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingSelectionRowItem$lambda$16$lambda$15(Function1 function1, EquityOrderFormRowState.FloatingSelection.SelectionItem selectionItem) {
        function1.invoke(selectionItem);
        return Unit.INSTANCE;
    }

    public static final void SelectionRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1284283670);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1284283670, i, -1, "com.robinhood.android.equityadvancedorder.composables.SelectionRowPreview (EquityAdvancedOrderFloatingSelectionRow.kt:260)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, EquityAdvancedOrderFloatingSelectionRow.INSTANCE.getLambda$931286178$lib_equity_advanced_order_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityAdvancedOrderFloatingSelectionRow5.SelectionRowPreview$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SelectionRowPopupOpenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1593271660);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1593271660, i, -1, "com.robinhood.android.equityadvancedorder.composables.SelectionRowPopupOpenPreview (EquityAdvancedOrderFloatingSelectionRow.kt:295)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, EquityAdvancedOrderFloatingSelectionRow.INSTANCE.m13766getLambda$144184652$lib_equity_advanced_order_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityAdvancedOrderFloatingSelectionRow5.SelectionRowPopupOpenPreview$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SelectionRowPopupSmallDeviceLargeFont(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(336366427);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(336366427, i, -1, "com.robinhood.android.equityadvancedorder.composables.SelectionRowPopupSmallDeviceLargeFont (EquityAdvancedOrderFloatingSelectionRow.kt:331)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, EquityAdvancedOrderFloatingSelectionRow.INSTANCE.m13767getLambda$704022765$lib_equity_advanced_order_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderFloatingSelectionRowKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityAdvancedOrderFloatingSelectionRow5.SelectionRowPopupSmallDeviceLargeFont$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
