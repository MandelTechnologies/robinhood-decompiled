package com.robinhood.shared.common.etpcomposition;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Dp2;
import androidx.compose.p011ui.unit.Dp5;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.LayoutCoordinates3;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.p320db.bonfire.etp.EtpHolding;
import com.robinhood.shared.common.etpcomposition.EtpCompositionV2Duxo5;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.math.BigDecimals7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RhvFundBreakdownSection.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\u001a3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000e\u001aK\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\r\u0010\"\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010#\u001a\r\u0010$\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010#\u001a\r\u0010%\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010#\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006&²\u0006\n\u0010'\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u008e\u0002"}, m3636d2 = {"ICON_SIZE", "", "RhvFundBreakdownSection", "", "viewState", "Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState$Loaded$RhvCef;", "onHoldingClicked", "Lkotlin/Function1;", "Lcom/robinhood/models/db/bonfire/etp/EtpHolding;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/common/etpcomposition/EtpCompositionV2ViewState$Loaded$RhvCef;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PLACEHOLDER_COUNT", "RhvFundBreakdownPlaceholderSection", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RhvHoldingRow", "holdingName", "", "holdingWeight", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "Lkotlin/Function0;", "isPlaceholder", "", "RhvHoldingRow-FU0evQE", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "RhvHoldingStartIcon", "size", "Landroidx/compose/ui/unit/DpSize;", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "RhvHoldingStartIcon-EiGo5G8", "(JJFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PREVIEW_ICON_SIZE", "HoldingRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "HoldingRowPlaceholderPreview", "StartIconPreview", "lib-etp-composition_externalDebug", "startChartAnimation", "lastVisibilityCheckTimestamp", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSectionKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class RhvFundBreakdownSection4 {
    private static final int ICON_SIZE = 12;
    private static final int PLACEHOLDER_COUNT = 3;
    private static final int PREVIEW_ICON_SIZE = 48;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HoldingRowPlaceholderPreview$lambda$28(int i, Composer composer, int i2) {
        HoldingRowPlaceholderPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HoldingRowPreview$lambda$27(int i, Composer composer, int i2) {
        HoldingRowPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvFundBreakdownPlaceholderSection$lambda$19(Modifier modifier, int i, int i2, Composer composer, int i3) {
        RhvFundBreakdownPlaceholderSection(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvFundBreakdownSection$lambda$16(EtpCompositionV2Duxo5.Loaded.RhvCef rhvCef, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RhvFundBreakdownSection(rhvCef, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvHoldingRow_FU0evQE$lambda$23(String str, String str2, long j, Function0 function0, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        m24839RhvHoldingRowFU0evQE(str, str2, j, function0, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvHoldingStartIcon_EiGo5G8$lambda$26(long j, long j2, float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m24840RhvHoldingStartIconEiGo5G8(j, j2, f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StartIconPreview$lambda$29(int i, Composer composer, int i2) {
        StartIconPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149 A[LOOP:0: B:62:0x0143->B:64:0x0149, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhvFundBreakdownSection(final EtpCompositionV2Duxo5.Loaded.RhvCef viewState, final Function1<? super EtpHolding, Unit> onHoldingClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        final SnapshotState snapshotState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue2;
        Composer.Companion companion;
        final Modifier modifier3;
        boolean z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onHoldingClicked, "onHoldingClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1819244272);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onHoldingClicked) ? 32 : 16;
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
                    ComposerKt.traceEventStart(1819244272, i3, -1, "com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSection (RhvFundBreakdownSection.kt:55)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-182025201);
                List<EtpHolding> holdings = viewState.getHoldings();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(holdings, 10));
                for (EtpHolding etpHolding : holdings) {
                    arrayList.add(Tuples4.m3642to(Float.valueOf(etpHolding.getWeight()), Color.m6701boximpl(Helpers6.getComposeColor(etpHolding, composerStartRestartGroup, 0))));
                }
                composerStartRestartGroup.endReplaceGroup();
                ImmutableList immutableList = extensions2.toImmutableList(arrayList);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                RhvStackedBarChart.m24845RhvStackedBarChart942rkJo(immutableList, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, RhvFundBreakdownSection$lambda$1(snapshotState), composerStartRestartGroup, 0, 4);
                final View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                final Rect rect = new Rect();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotLongState3.mutableLongStateOf(0L);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotLongState2 snapshotLongState2 = (SnapshotLongState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-182008443);
                boolean z2 = true;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion3, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
                if (!RhvFundBreakdownSection$lambda$1(snapshotState)) {
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(view) | composerStartRestartGroup.changedInstance(rect);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSectionKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RhvFundBreakdownSection4.RhvFundBreakdownSection$lambda$15$lambda$10$lambda$9$lambda$8(view, rect, snapshotLongState2, snapshotState, (LayoutCoordinates) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifierFillMaxWidth$default = OnGloballyPositionedModifier3.onGloballyPositioned(modifierFillMaxWidth$default, (Function1) objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(modifierFillMaxWidth$default, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-181983728);
                int i5 = 0;
                for (Object obj : viewState.getHoldings()) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final EtpHolding etpHolding2 = (EtpHolding) obj;
                    String name = etpHolding2.getName();
                    String weight = Helpers6.formatWeight(BigDecimals7.toBigDecimal(Float.valueOf(etpHolding2.getWeight())));
                    long composeColor = Helpers6.getComposeColor(etpHolding2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = ((i3 & 112) == 32 ? z2 : false) | composerStartRestartGroup.changedInstance(etpHolding2);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSectionKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RhvFundBreakdownSection4.RhvFundBreakdownSection$lambda$15$lambda$14$lambda$12$lambda$11(onHoldingClicked, etpHolding2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    Composer composer2 = composerStartRestartGroup;
                    m24839RhvHoldingRowFU0evQE(name, weight, composeColor, (Function0) objRememberedValue4, null, false, composer2, 0, 48);
                    composerStartRestartGroup = composer2;
                    Color colorM21927getDividerColorQN2ZGVo = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getRow(composerStartRestartGroup, 0).getColors().m21927getDividerColorQN2ZGVo();
                    composerStartRestartGroup.startReplaceGroup(-181972206);
                    if (colorM21927getDividerColorQN2ZGVo == null) {
                        z = true;
                    } else {
                        z = true;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, 1, null), colorM21927getDividerColorQN2ZGVo.getValue(), 0.0f, composerStartRestartGroup, 0, 4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    z2 = z;
                    i5 = i6;
                    modifier4 = modifier5;
                }
                Modifier modifier6 = modifier4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSectionKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return RhvFundBreakdownSection4.RhvFundBreakdownSection$lambda$16(viewState, onHoldingClicked, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-182025201);
                List<EtpHolding> holdings2 = viewState.getHoldings();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(holdings2, 10));
                while (r5.hasNext()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                ImmutableList immutableList2 = extensions2.toImmutableList(arrayList2);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                RhvStackedBarChart.m24845RhvStackedBarChart942rkJo(immutableList2, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, RhvFundBreakdownSection$lambda$1(snapshotState), composerStartRestartGroup, 0, 4);
                final View view2 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                final Rect rect2 = new Rect();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                final SnapshotLongState2 snapshotLongState22 = (SnapshotLongState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-182008443);
                boolean z22 = true;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion32, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
                if (!RhvFundBreakdownSection$lambda$1(snapshotState)) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(modifierFillMaxWidth$default2, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-181983728);
                int i52 = 0;
                while (r16.hasNext()) {
                }
                Modifier modifier62 = modifier4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier62;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void RhvFundBreakdownSection$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvFundBreakdownSection$lambda$15$lambda$10$lambda$9$lambda$8(View view, Rect rect, SnapshotLongState2 snapshotLongState2, SnapshotState snapshotState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - snapshotLongState2.getLongValue() > 250) {
            if (LayoutCoordinates3.isFullyVisible(coordinates, view, rect)) {
                RhvFundBreakdownSection$lambda$2(snapshotState, true);
            }
            snapshotLongState2.setLongValue(jCurrentTimeMillis);
        }
        return Unit.INSTANCE;
    }

    private static final boolean RhvFundBreakdownSection$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvFundBreakdownSection$lambda$15$lambda$14$lambda$12$lambda$11(Function1 function1, EtpHolding etpHolding) {
        function1.invoke(etpHolding);
        return Unit.INSTANCE;
    }

    public static final void RhvFundBreakdownPlaceholderSection(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1671623406);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1671623406, i3, -1, "com.robinhood.shared.common.etpcomposition.RhvFundBreakdownPlaceholderSection (RhvFundBreakdownSection.kt:115)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1404067245);
            for (int i5 = 0; i5 < 3; i5++) {
                m24839RhvHoldingRowFU0evQE("Holding " + i5, "XX%", BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU(), null, null, true, composerStartRestartGroup, 199728, 16);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhvFundBreakdownSection4.RhvFundBreakdownPlaceholderSection$lambda$19(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016a  */
    /* renamed from: RhvHoldingRow-FU0evQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m24839RhvHoldingRowFU0evQE(final String str, final String str2, final long j, final Function0<Unit> function0, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        String str3;
        long j2;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        boolean z3;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final boolean z4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(58463226);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str3 = str2;
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
                }
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                    }
                    if ((74899 & i3) != 74898 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z2;
                        composer2 = composerStartRestartGroup;
                    } else {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z5 = i5 == 0 ? false : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(58463226, i3, -1, "com.robinhood.shared.common.etpcomposition.RhvHoldingRow (RhvFundBreakdownSection.kt:139)");
                        }
                        boolean z6 = function0 == null;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z3 = (i3 & 7168) != 2048;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSectionKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RhvFundBreakdownSection4.RhvHoldingRow_FU0evQE$lambda$21$lambda$20(function0);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier4, z6, null, null, (Function0) objRememberedValue, 6, null);
                        Modifier modifier5 = modifier4;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierM4893clickableXHw0xAI$default, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                        float f = 12;
                        long jM8006DpSizeYgX7TsA = Dp2.m8006DpSizeYgX7TsA(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f));
                        float fM7995constructorimpl = z5 ? C2002Dp.m7995constructorimpl(1) : C2002Dp.m7995constructorimpl(0);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        m24840RhvHoldingStartIconEiGo5G8(j2, jM8006DpSizeYgX7TsA, fM7995constructorimpl, ModifiersKt.bentoPlaceholder$default(companion2, z5, null, 2, null), composerStartRestartGroup, ((i3 >> 6) & 14) | 48, 0);
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(str, ModifiersKt.bentoPlaceholder$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), z5, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, i3 & 14, 0, 16380);
                        Spacer2.Spacer(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composer2, 0);
                        BentoText2.m20747BentoText38GnDrw(str3, ModifiersKt.bentoPlaceholder$default(companion2, z5, null, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, (i3 >> 3) & 14, 0, 16376);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z5;
                        modifier3 = modifier5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSectionKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return RhvFundBreakdownSection4.RhvHoldingRow_FU0evQE$lambda$23(str, str2, j, function0, modifier3, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z2 = z;
                if ((74899 & i3) != 74898) {
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (function0 == null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & 7168) != 2048) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z3) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSectionKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RhvFundBreakdownSection4.RhvHoldingRow_FU0evQE$lambda$21$lambda$20(function0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier4, z6, null, null, (Function0) objRememberedValue, 6, null);
                        Modifier modifier52 = modifier4;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i62 = BentoTheme.$stable;
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierM4893clickableXHw0xAI$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            float f2 = 12;
                            long jM8006DpSizeYgX7TsA2 = Dp2.m8006DpSizeYgX7TsA(C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f2));
                            float fM7995constructorimpl2 = z5 ? C2002Dp.m7995constructorimpl(1) : C2002Dp.m7995constructorimpl(0);
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            m24840RhvHoldingStartIconEiGo5G8(j2, jM8006DpSizeYgX7TsA2, fM7995constructorimpl2, ModifiersKt.bentoPlaceholder$default(companion22, z5, null, 2, null), composerStartRestartGroup, ((i3 >> 6) & 14) | 48, 0);
                            composer2 = composerStartRestartGroup;
                            BentoText2.m20747BentoText38GnDrw(str, ModifiersKt.bentoPlaceholder$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), z5, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, i3 & 14, 0, 16380);
                            Spacer2.Spacer(Row5.weight$default(row62, companion22, 1.0f, false, 2, null), composer2, 0);
                            BentoText2.m20747BentoText38GnDrw(str3, ModifiersKt.bentoPlaceholder$default(companion22, z5, null, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composer2, i62).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, (i3 >> 3) & 14, 0, 16376);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z4 = z5;
                            modifier3 = modifier52;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z2 = z;
            if ((74899 & i3) != 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str3 = str2;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z2 = z;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvHoldingRow_FU0evQE$lambda$21$lambda$20(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* renamed from: RhvHoldingStartIcon-EiGo5G8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m24840RhvHoldingStartIconEiGo5G8(final long j, final long j2, float f, Modifier modifier, Composer composer, final int i, final int i2) {
        long j3;
        int i3;
        final float f2;
        int i4;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1814323242);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            j3 = j;
        } else {
            j3 = j;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(j3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1814323242, i3, -1, "com.robinhood.shared.common.etpcomposition.RhvHoldingStartIcon (RhvFundBreakdownSection.kt:176)");
                    }
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5170size6HolHcs(modifier4, j2), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f2)), j3, null, 2, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z = (i3 & 112) != 32;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RhvFundBreakdownSection4.RhvHoldingStartIcon_EiGo5G8$lambda$25$lambda$24(j2, (DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BoxKt.Box(DrawModifierKt.drawBehind(modifierM4872backgroundbw27NRU$default, (Function1) objRememberedValue), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSectionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RhvFundBreakdownSection4.RhvHoldingStartIcon_EiGo5G8$lambda$26(j, j2, f2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) != 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5170size6HolHcs(modifier4, j2), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f2)), j3, null, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 112) != 32) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RhvFundBreakdownSection4.RhvHoldingStartIcon_EiGo5G8$lambda$25$lambda$24(j2, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BoxKt.Box(DrawModifierKt.drawBehind(modifierM4872backgroundbw27NRU$default2, (Function1) objRememberedValue), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        f2 = f;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhvHoldingStartIcon_EiGo5G8$lambda$25$lambda$24(long j, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        Brush.Companion companion = Brush.INSTANCE;
        Color.Companion companion2 = Color.INSTANCE;
        List listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion2.m6716getBlack0d7_KjU(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(companion2.m6716getBlack0d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null))});
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        float fMo5016toPx0680j_4 = drawBehind.mo5016toPx0680j_4(Dp5.m8024getWidthD9Ej5fM(j));
        float fMo5016toPx0680j_42 = drawBehind.mo5016toPx0680j_4(Dp5.m8023getHeightD9Ej5fM(j));
        DrawScope.m6957drawRectAsUm42w$default(drawBehind, Brush.Companion.m6678linearGradientmHitzGk$default(companion, listListOf, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32)), 0, 8, (Object) null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        return Unit.INSTANCE;
    }

    private static final void HoldingRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1647386384);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1647386384, i, -1, "com.robinhood.shared.common.etpcomposition.HoldingRowPreview (RhvFundBreakdownSection.kt:202)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, RhvFundBreakdownSection.INSTANCE.m24825getLambda$2069865896$lib_etp_composition_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSectionKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhvFundBreakdownSection4.HoldingRowPreview$lambda$27(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void HoldingRowPlaceholderPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2119738681);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2119738681, i, -1, "com.robinhood.shared.common.etpcomposition.HoldingRowPlaceholderPreview (RhvFundBreakdownSection.kt:218)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, RhvFundBreakdownSection.INSTANCE.m24826getLambda$342029071$lib_etp_composition_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSectionKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhvFundBreakdownSection4.HoldingRowPlaceholderPreview$lambda$28(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void StartIconPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-986546472);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-986546472, i, -1, "com.robinhood.shared.common.etpcomposition.StartIconPreview (RhvFundBreakdownSection.kt:235)");
            }
            Color.Companion companion = Color.INSTANCE;
            float f = 48;
            m24840RhvHoldingStartIconEiGo5G8(companion.m6724getRed0d7_KjU(), Dp2.m8006DpSizeYgX7TsA(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(4), androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, companion.m6727getWhite0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(f)), composerStartRestartGroup, 3510, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.etpcomposition.RhvFundBreakdownSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhvFundBreakdownSection4.StartIconPreview$lambda$29(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
