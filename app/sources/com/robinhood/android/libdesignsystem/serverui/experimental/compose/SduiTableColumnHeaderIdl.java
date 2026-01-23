package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.TableColumnHeaderDto;

/* compiled from: SduiTableColumnHeaderIdl.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a=\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, m3636d2 = {"SduiTableColumnHeader", "", "ActionT", "component", "Lrh_server_driven_ui/v1/TableColumnHeaderDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/TableColumnHeaderDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "isClicked", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTableColumnHeaderIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiTableColumnHeaderIdl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTableColumnHeader$lambda$18(TableColumnHeaderDto tableColumnHeaderDto, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiTableColumnHeader(tableColumnHeaderDto, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiTableColumnHeader(final TableColumnHeaderDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Function0<Unit> function0Handling;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChanged;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        long jM21426getFg20d7_KjU;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Integer left_padding;
        Object objRememberedValue3;
        BentoIcon4 bentoIcon;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-756890786);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifierM4891clickableO2vRcR0$default = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-756890786, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTableColumnHeader (SduiTableColumnHeaderIdl.kt:35)");
                }
                ActionDto action = component.getAction();
                ActionT actiontInvoke = action == null ? parseAction.invoke(action) : null;
                composerStartRestartGroup.startReplaceGroup(-1522564155);
                function0Handling = actiontInvoke != null ? null : SduiActionHandler3.handling(actiontInvoke, SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(component);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                if (!SduiTableColumnHeader$lambda$6(snapshotState)) {
                    composerStartRestartGroup.startReplaceGroup(-1522554879);
                    jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (component.getActive()) {
                    composerStartRestartGroup.startReplaceGroup(-1522553280);
                    jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1522552095);
                    jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                long j = jM21426getFg20d7_KjU;
                composerStartRestartGroup.startReplaceGroup(-1522549848);
                if (function0Handling == null) {
                    modifier3 = modifierM4891clickableO2vRcR0$default;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(function0Handling);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTableColumnHeaderIdlKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SduiTableColumnHeaderIdl.SduiTableColumnHeader$lambda$11$lambda$10$lambda$9(function0Handling, snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifierM4891clickableO2vRcR0$default;
                    modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM4891clickableO2vRcR0$default, interactionSource3, null, false, null, null, (Function0) objRememberedValue5, 28, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
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
                left_padding = component.getLeft_padding();
                composerStartRestartGroup.startReplaceGroup(1432777033);
                if (left_padding != null) {
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion4, C2002Dp.m7995constructorimpl(left_padding.intValue())), composerStartRestartGroup, 0);
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                String title = component.getTitle();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                FontWeight bold = FontWeight.INSTANCE.getBold();
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                Color colorM6701boximpl = Color.m6701boximpl(j);
                TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7919getCentere0LSkKk);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTableColumnHeaderIdlKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiTableColumnHeaderIdl.SduiTableColumnHeader$lambda$17$lambda$16$lambda$14$lambda$13(snapshotState2, (TextLayoutResult) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoText2.m20747BentoText38GnDrw(title, null, colorM6701boximpl, null, bold, null, textAlignM7912boximpl, 0, false, 0, 0, (Function1) objRememberedValue3, 0, textS, composerStartRestartGroup, 24576, 48, 6058);
                composerStartRestartGroup = composerStartRestartGroup;
                IconDto icon = component.getIcon();
                bentoIcon = icon == null ? SduiIcon2.toBentoIcon(icon) : null;
                composerStartRestartGroup.startReplaceGroup(1432791005);
                if (bentoIcon != null) {
                    BentoIcon2.m20644BentoIconFU0evQE(bentoIcon, "", j, PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composerStartRestartGroup, BentoIcon4.$stable | 48, 48);
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(251521515);
                if (SduiTableColumnHeader$lambda$6(snapshotState)) {
                    BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5153XS, bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), composerStartRestartGroup, 48, 1);
                }
                composerStartRestartGroup.endReplaceGroup();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTableColumnHeaderIdlKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiTableColumnHeaderIdl.SduiTableColumnHeader$lambda$18(component, parseAction, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            ActionDto action2 = component.getAction();
            if (action2 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(-1522564155);
            if (actiontInvoke != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState22 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(component);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                if (!SduiTableColumnHeader$lambda$6(snapshotState)) {
                }
                long j2 = jM21426getFg20d7_KjU;
                composerStartRestartGroup.startReplaceGroup(-1522549848);
                if (function0Handling == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        left_padding = component.getLeft_padding();
                        composerStartRestartGroup.startReplaceGroup(1432777033);
                        if (left_padding != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        String title2 = component.getTitle();
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                        FontWeight bold2 = FontWeight.INSTANCE.getBold();
                        int iM7919getCentere0LSkKk2 = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        Color colorM6701boximpl2 = Color.m6701boximpl(j2);
                        TextAlign textAlignM7912boximpl2 = TextAlign.m7912boximpl(iM7919getCentere0LSkKk2);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(title2, null, colorM6701boximpl2, null, bold2, null, textAlignM7912boximpl2, 0, false, 0, 0, (Function1) objRememberedValue3, 0, textS2, composerStartRestartGroup, 24576, 48, 6058);
                        composerStartRestartGroup = composerStartRestartGroup;
                        IconDto icon2 = component.getIcon();
                        if (icon2 == null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(1432791005);
                        if (bentoIcon != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(251521515);
                        if (SduiTableColumnHeader$lambda$6(snapshotState)) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void SduiTableColumnHeader$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTableColumnHeader$lambda$11$lambda$10$lambda$9(Function0 function0, SnapshotState snapshotState) {
        SduiTableColumnHeader$lambda$7(snapshotState, true);
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTableColumnHeader$lambda$17$lambda$16$lambda$14$lambda$13(SnapshotState snapshotState, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }

    private static final boolean SduiTableColumnHeader$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
