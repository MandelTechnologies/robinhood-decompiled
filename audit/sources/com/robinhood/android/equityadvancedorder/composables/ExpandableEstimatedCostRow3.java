package com.robinhood.android.equityadvancedorder.composables;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Rotate;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.inlinedefinition.BentoInlineDefinition;
import com.robinhood.android.equityadvancedorder.C15237R;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.ApiSalesTax;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExpandableEstimatedCostRow.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u008e\u0002²\u0006\u0012\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"PLACEHOLDER_PRICE", "", "EXPAND_CARET_TAG", "ExpandableEstimatedCostRow", "", "state", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$ExpandableEstimatedCost;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$ExpandableEstimatedCost;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ExpandCaretIcon", "expanded", "", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ExpandableEstimatedCostRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-equity-advanced-order_externalDebug", "expandable", "staleFees", "Lkotlin/Result;", "Ljava/math/BigDecimal;", "feeColor", "Landroidx/compose/ui/graphics/Color;", "rotation", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ExpandableEstimatedCostRow3 {
    public static final String EXPAND_CARET_TAG = "EstimatedCostRowCaret";
    private static final String PLACEHOLDER_PRICE = "$x.xx";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandCaretIcon$lambda$18(boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ExpandCaretIcon(z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandableEstimatedCostRow$lambda$16(EquityOrderFormRowState.ExpandableEstimatedCost expandableEstimatedCost, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ExpandableEstimatedCostRow(expandableEstimatedCost, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandableEstimatedCostRowPreview$lambda$19(int i, Composer composer, int i2) {
        ExpandableEstimatedCostRowPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExpandableEstimatedCostRow(final EquityOrderFormRowState.ExpandableEstimatedCost state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotState snapshotState2;
        Object objRememberedValue4;
        final SnapshotState snapshotState3;
        Object objRememberedValue5;
        final SnapshotState snapshotState4;
        boolean zChangedInstance2;
        Object objRememberedValue6;
        final EventLogger current;
        final UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default;
        boolean zChangedInstance3;
        Object objRememberedValue7;
        Object objRememberedValue8;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1885920885);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
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
                    ComposerKt.traceEventStart(-1885920885, i3, -1, "com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRow (ExpandableEstimatedCostRow.kt:61)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Result<BigDecimal> resultM13754getEstimatedTotalFeesxLWZpok = state.m13754getEstimatedTotalFeesxLWZpok();
                ImmutableList<ApiSalesTax> salesTaxes = state.getSalesTaxes();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(state);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new ExpandableEstimatedCostRow4(state, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(resultM13754getEstimatedTotalFeesxLWZpok, salesTaxes, (Function2) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState2 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotState3.mutableStateOf$default(0, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotState3 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                if (state.getResetTooltipKey() > ((Number) snapshotState3.getValue()).intValue()) {
                    snapshotState3.setValue(Integer.valueOf(state.getResetTooltipKey()));
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotState4 = (SnapshotState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Result<BigDecimal> resultM13754getEstimatedTotalFeesxLWZpok2 = state.m13754getEstimatedTotalFeesxLWZpok();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(state);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new ExpandableEstimatedCostRow5(state, snapshotState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(resultM13754getEstimatedTotalFeesxLWZpok2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType = Component.ComponentType.ROW;
                userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, "estimated_cost_breakdown", null, 4, null), null, 47, null);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                boolean zExpandableEstimatedCostRow$lambda$1 = ExpandableEstimatedCostRow$lambda$1(snapshotState);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptorCopy$default);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow$lambda$13$lambda$12(current, userInteractionEventDescriptorCopy$default, snapshotState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default, zExpandableEstimatedCostRow$lambda$1, null, null, (Function0) objRememberedValue7, 6, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType, "estimated_cost", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow$lambda$15$lambda$14((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(SemanticsModifier6.semantics$default(modifierAutoLogEvents$default, false, (Function1) objRememberedValue8, 1, null), null, null, ComposableLambda3.rememberComposableLambda(-878987000, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt.ExpandableEstimatedCostRow.5
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r10v5 */
                    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
                    /* JADX WARN: Type inference failed for: r10v8 */
                    public final void invoke(Composer composer3, int i5) throws Resources.NotFoundException {
                        BigDecimal bigDecimal;
                        int i6;
                        ?? r10;
                        String strStringResource;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-878987000, i5, -1, "com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRow.<anonymous> (ExpandableEstimatedCostRow.kt:125)");
                        }
                        final EquityOrderFormRowState.ExpandableEstimatedCost expandableEstimatedCost = state;
                        SnapshotState<Integer> snapshotState5 = snapshotState3;
                        SnapshotState<Boolean> snapshotState6 = snapshotState;
                        UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptorCopy$default;
                        SnapshotState<Boolean> snapshotState7 = snapshotState2;
                        final SnapshotState<Result<BigDecimal>> snapshotState8 = snapshotState4;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer3, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion2);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        String string2 = StringResources6.getText(expandableEstimatedCost.getEstimatedCostTitle(), composer3, StringResource.$stable).toString();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8190);
                        AnimatedVisibilityKt.AnimatedVisibility(row6, ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow$lambda$1(snapshotState6), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-1784442694, true, new ExpandableEstimatedCostRow6(userInteractionEventDescriptor2, snapshotState7), composer3, 54), composer3, 1572870, 30);
                        composer3.endNode();
                        AnimatedVisibilityKt.AnimatedVisibility(column6, ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow$lambda$5(snapshotState7), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-1149740458, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt$ExpandableEstimatedCostRow$5$1$2
                            private static final long invoke$lambda$2$lambda$0(SnapshotState4<Color> snapshotState42) {
                                return snapshotState42.getValue().getValue();
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) throws Resources.NotFoundException {
                                invoke(animatedVisibilityScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i8) throws Resources.NotFoundException {
                                int i9;
                                long jM21427getFg30d7_KjU;
                                String strStringResource2;
                                Composer composer5 = composer4;
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1149740458, i8, -1, "com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRow.<anonymous>.<anonymous>.<anonymous> (ExpandableEstimatedCostRow.kt:149)");
                                }
                                EquityOrderFormRowState.ExpandableEstimatedCost expandableEstimatedCost2 = expandableEstimatedCost;
                                SnapshotState<Result<BigDecimal>> snapshotState9 = snapshotState8;
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer5, companion5);
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                                if (composer5.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.createNode(constructor3);
                                } else {
                                    composer5.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer5);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                int i10 = C15237R.string.order_create_estimated_base_line;
                                NumberFormatter priceFormat = Formats.getPriceFormat();
                                BigDecimal price = expandableEstimatedCost2.getPrice();
                                if (price == null) {
                                    price = BigDecimal.ZERO;
                                }
                                Intrinsics.checkNotNull(price);
                                String strStringResource3 = StringResources_androidKt.stringResource(i10, new Object[]{priceFormat.format(price), Formats.getShareQuantityFormat().format(expandableEstimatedCost2.getQuantity())}, composer5, 0);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i11 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(strStringResource3, null, Color.m6701boximpl(bentoTheme2.getColors(composer5, i11).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer5, i11).getTextS(), composer5, 0, 0, 8186);
                                Result<BigDecimal> resultM13754getEstimatedTotalFeesxLWZpok3 = expandableEstimatedCost2.m13754getEstimatedTotalFeesxLWZpok();
                                if (resultM13754getEstimatedTotalFeesxLWZpok3 == null) {
                                    resultM13754getEstimatedTotalFeesxLWZpok3 = ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow$lambda$9(snapshotState9);
                                }
                                Result<BigDecimal> result = resultM13754getEstimatedTotalFeesxLWZpok3;
                                if (expandableEstimatedCost2.m13754getEstimatedTotalFeesxLWZpok() != null) {
                                    composer5.startReplaceGroup(-762435313);
                                    i9 = i11;
                                    jM21427getFg30d7_KjU = bentoTheme2.getColors(composer5, i9).m21426getFg20d7_KjU();
                                } else {
                                    i9 = i11;
                                    composer5.startReplaceGroup(-762434449);
                                    jM21427getFg30d7_KjU = bentoTheme2.getColors(composer5, i9).m21427getFg30d7_KjU();
                                }
                                composer5.endReplaceGroup();
                                SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(jM21427getFg30d7_KjU, null, null, null, composer5, 0, 14);
                                if (result == null) {
                                    composer5.startReplaceGroup(2134495168);
                                    strStringResource2 = StringResources_androidKt.stringResource(C15237R.string.order_create_estimated_fees_line, new Object[]{"$x.xx"}, composer5, 0);
                                    composer5.endReplaceGroup();
                                } else if (Result.m28555isFailureimpl(result.getValue())) {
                                    composer5.startReplaceGroup(2134768154);
                                    strStringResource2 = StringResources_androidKt.stringResource(C15237R.string.order_create_estimated_fees_unknown, composer5, 0);
                                    composer5.endReplaceGroup();
                                } else {
                                    composer5.startReplaceGroup(2134904461);
                                    int i12 = C15237R.string.order_create_estimated_fees_line;
                                    NumberFormatter amountFormat = Formats.getAmountFormat();
                                    Object value = result.getValue();
                                    ResultKt.throwOnFailure(value);
                                    if (value != null) {
                                        strStringResource2 = StringResources_androidKt.stringResource(i12, new Object[]{amountFormat.format((Number) value)}, composer5, 0);
                                        composer5.endReplaceGroup();
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                BentoText2.m20747BentoText38GnDrw(strStringResource2, com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(companion5, result == null, null, 2, null), Color.m6701boximpl(invoke$lambda$2$lambda$0(snapshotState4M4805animateColorAsStateeuL9pac)), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer5, i9).getTextS(), composer5, 0, 0, 8184);
                                ImmutableList<ApiSalesTax> salesTaxes2 = expandableEstimatedCost2.getSalesTaxes();
                                composer5.startReplaceGroup(-762395439);
                                if (salesTaxes2 != null) {
                                    for (ApiSalesTax apiSalesTax : salesTaxes2) {
                                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15237R.string.order_create_estimated_sales_tax_line, new Object[]{Formats.getCurrencyFormat().format(apiSalesTax.getFee()), apiSalesTax.getDisplay_name()}, composer5, 0), null, Color.m6701boximpl(invoke$lambda$2$lambda$0(snapshotState4M4805animateColorAsStateeuL9pac)), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer5, BentoTheme.$stable).getTextS(), composer5, 0, 0, 8186);
                                        composer5 = composer4;
                                    }
                                }
                                composer4.endReplaceGroup();
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 1572870, 30);
                        composer3.startReplaceGroup(-1665436254);
                        if (expandableEstimatedCost.isBorrowFeesApplicable()) {
                            Result<BigDecimal> resultM13753getEstimatedTotalDailyBorrowFeexLWZpok = expandableEstimatedCost.m13753getEstimatedTotalDailyBorrowFeexLWZpok();
                            if (resultM13753getEstimatedTotalDailyBorrowFeexLWZpok != null) {
                                Object value = resultM13753getEstimatedTotalDailyBorrowFeexLWZpok.getValue();
                                if (Result.m28555isFailureimpl(value)) {
                                    value = null;
                                }
                                bigDecimal = (BigDecimal) value;
                            } else {
                                bigDecimal = null;
                            }
                            composer3.startReplaceGroup(-1665431104);
                            if (bigDecimal == null) {
                                strStringResource = null;
                                i6 = 2;
                                r10 = 0;
                            } else {
                                int i8 = C15237R.string.order_create_estimated_daily_borrow_fee;
                                NumberFormatter currencyFormat = Formats.getCurrencyFormat();
                                i6 = 2;
                                BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
                                Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
                                r10 = 0;
                                strStringResource = StringResources_androidKt.stringResource(i8, new Object[]{currencyFormat.format(scale)}, composer3, 0);
                            }
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(-1665432547);
                            if (strStringResource == null) {
                                strStringResource = StringResources_androidKt.stringResource(C15237R.string.order_create_estimated_daily_borrow_fee_unknown, composer3, r10);
                            }
                            composer3.endReplaceGroup();
                            BentoInlineDefinition.m13274BentoInlineDefinitionlfSFqjE(strStringResource, StringResources_androidKt.stringResource(C15237R.string.order_create_estimated_daily_borrow_fee_definition, composer3, r10), com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(companion2, expandableEstimatedCost.m13753getEstimatedTotalDailyBorrowFeexLWZpok() != null ? r10 : true, null, i6, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), false, StringResources_androidKt.stringResource(C15237R.string.order_create_estimated_daily_borrow_fee_link_substring, composer3, r10), null, null, bentoTheme.getTypography(composer3, i7).getTextS(), snapshotState5.getValue().intValue(), composer3, 0, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(-1672089781, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt.ExpandableEstimatedCostRow.6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        String string2;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1672089781, i5, -1, "com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRow.<anonymous> (ExpandableEstimatedCostRow.kt:220)");
                        }
                        StringResource estimatedCostValue = state.getEstimatedCostValue();
                        composer3.startReplaceGroup(-560508140);
                        CharSequence text = estimatedCostValue == null ? null : StringResources6.getText(estimatedCostValue, composer3, StringResource.$stable);
                        composer3.endReplaceGroup();
                        if (text == null || (string2 = text.toString()) == null) {
                            string2 = ExpandableEstimatedCostRow3.PLACEHOLDER_PRICE;
                        }
                        InformationRowComposable3.InformationRowValue(string2, null, state.getEstimatedCostValue() == null, true, composer3, 3072, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), false, true, true, null, composer2, 920128512, 0, 1078);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow$lambda$16(state, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Result<BigDecimal> resultM13754getEstimatedTotalFeesxLWZpok3 = state.m13754getEstimatedTotalFeesxLWZpok();
            ImmutableList<ApiSalesTax> salesTaxes2 = state.getSalesTaxes();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(state);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new ExpandableEstimatedCostRow4(state, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(resultM13754getEstimatedTotalFeesxLWZpok3, salesTaxes2, (Function2) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                snapshotState3 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                if (state.getResetTooltipKey() > ((Number) snapshotState3.getValue()).intValue()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                snapshotState4 = (SnapshotState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Result<BigDecimal> resultM13754getEstimatedTotalFeesxLWZpok22 = state.m13754getEstimatedTotalFeesxLWZpok();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(state);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue6 = new ExpandableEstimatedCostRow5(state, snapshotState4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(resultM13754getEstimatedTotalFeesxLWZpok22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component.ComponentType componentType2 = Component.ComponentType.ROW;
                    userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(componentType2, "estimated_cost_breakdown", null, 4, null), null, 47, null);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    boolean zExpandableEstimatedCostRow$lambda$12 = ExpandableEstimatedCostRow$lambda$1(snapshotState);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptorCopy$default);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3) {
                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow$lambda$13$lambda$12(current, userInteractionEventDescriptorCopy$default, snapshotState2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default2, zExpandableEstimatedCostRow$lambda$12, null, null, (Function0) objRememberedValue7, 6, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType2, "estimated_cost", null, 4, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier4;
                        composer2 = composerStartRestartGroup;
                        BentoBaseRowLayout.BentoBaseRowLayout(SemanticsModifier6.semantics$default(modifierAutoLogEvents$default2, false, (Function1) objRememberedValue8, 1, null), null, null, ComposableLambda3.rememberComposableLambda(-878987000, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt.ExpandableEstimatedCostRow.5
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r10v5 */
                            /* JADX WARN: Type inference failed for: r10v6, types: [int] */
                            /* JADX WARN: Type inference failed for: r10v8 */
                            public final void invoke(Composer composer3, int i5) throws Resources.NotFoundException {
                                BigDecimal bigDecimal;
                                int i6;
                                ?? r10;
                                String strStringResource;
                                if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-878987000, i5, -1, "com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRow.<anonymous> (ExpandableEstimatedCostRow.kt:125)");
                                }
                                final EquityOrderFormRowState.ExpandableEstimatedCost expandableEstimatedCost = state;
                                SnapshotState<Integer> snapshotState5 = snapshotState3;
                                SnapshotState<Boolean> snapshotState6 = snapshotState;
                                UserInteractionEventDescriptor userInteractionEventDescriptor22 = userInteractionEventDescriptorCopy$default;
                                SnapshotState<Boolean> snapshotState7 = snapshotState2;
                                final SnapshotState<Result<BigDecimal>> snapshotState8 = snapshotState4;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer3, 48);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion2);
                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                String string2 = StringResources6.getText(expandableEstimatedCost.getEstimatedCostTitle(), composer3, StringResource.$stable).toString();
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8190);
                                AnimatedVisibilityKt.AnimatedVisibility(row6, ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow$lambda$1(snapshotState6), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-1784442694, true, new ExpandableEstimatedCostRow6(userInteractionEventDescriptor22, snapshotState7), composer3, 54), composer3, 1572870, 30);
                                composer3.endNode();
                                AnimatedVisibilityKt.AnimatedVisibility(column6, ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow$lambda$5(snapshotState7), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-1149740458, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt$ExpandableEstimatedCostRow$5$1$2
                                    private static final long invoke$lambda$2$lambda$0(SnapshotState4<Color> snapshotState42) {
                                        return snapshotState42.getValue().getValue();
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) throws Resources.NotFoundException {
                                        invoke(animatedVisibilityScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i8) throws Resources.NotFoundException {
                                        int i9;
                                        long jM21427getFg30d7_KjU;
                                        String strStringResource2;
                                        Composer composer5 = composer4;
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1149740458, i8, -1, "com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRow.<anonymous>.<anonymous>.<anonymous> (ExpandableEstimatedCostRow.kt:149)");
                                        }
                                        EquityOrderFormRowState.ExpandableEstimatedCost expandableEstimatedCost2 = expandableEstimatedCost;
                                        SnapshotState<Result<BigDecimal>> snapshotState9 = snapshotState8;
                                        Modifier.Companion companion5 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer5, companion5);
                                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                                        if (composer5.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor3);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer5);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                                        Column6 column62 = Column6.INSTANCE;
                                        int i10 = C15237R.string.order_create_estimated_base_line;
                                        NumberFormatter priceFormat = Formats.getPriceFormat();
                                        BigDecimal price = expandableEstimatedCost2.getPrice();
                                        if (price == null) {
                                            price = BigDecimal.ZERO;
                                        }
                                        Intrinsics.checkNotNull(price);
                                        String strStringResource3 = StringResources_androidKt.stringResource(i10, new Object[]{priceFormat.format(price), Formats.getShareQuantityFormat().format(expandableEstimatedCost2.getQuantity())}, composer5, 0);
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i11 = BentoTheme.$stable;
                                        BentoText2.m20747BentoText38GnDrw(strStringResource3, null, Color.m6701boximpl(bentoTheme2.getColors(composer5, i11).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer5, i11).getTextS(), composer5, 0, 0, 8186);
                                        Result<BigDecimal> resultM13754getEstimatedTotalFeesxLWZpok32 = expandableEstimatedCost2.m13754getEstimatedTotalFeesxLWZpok();
                                        if (resultM13754getEstimatedTotalFeesxLWZpok32 == null) {
                                            resultM13754getEstimatedTotalFeesxLWZpok32 = ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow$lambda$9(snapshotState9);
                                        }
                                        Result<BigDecimal> result = resultM13754getEstimatedTotalFeesxLWZpok32;
                                        if (expandableEstimatedCost2.m13754getEstimatedTotalFeesxLWZpok() != null) {
                                            composer5.startReplaceGroup(-762435313);
                                            i9 = i11;
                                            jM21427getFg30d7_KjU = bentoTheme2.getColors(composer5, i9).m21426getFg20d7_KjU();
                                        } else {
                                            i9 = i11;
                                            composer5.startReplaceGroup(-762434449);
                                            jM21427getFg30d7_KjU = bentoTheme2.getColors(composer5, i9).m21427getFg30d7_KjU();
                                        }
                                        composer5.endReplaceGroup();
                                        SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(jM21427getFg30d7_KjU, null, null, null, composer5, 0, 14);
                                        if (result == null) {
                                            composer5.startReplaceGroup(2134495168);
                                            strStringResource2 = StringResources_androidKt.stringResource(C15237R.string.order_create_estimated_fees_line, new Object[]{"$x.xx"}, composer5, 0);
                                            composer5.endReplaceGroup();
                                        } else if (Result.m28555isFailureimpl(result.getValue())) {
                                            composer5.startReplaceGroup(2134768154);
                                            strStringResource2 = StringResources_androidKt.stringResource(C15237R.string.order_create_estimated_fees_unknown, composer5, 0);
                                            composer5.endReplaceGroup();
                                        } else {
                                            composer5.startReplaceGroup(2134904461);
                                            int i12 = C15237R.string.order_create_estimated_fees_line;
                                            NumberFormatter amountFormat = Formats.getAmountFormat();
                                            Object value = result.getValue();
                                            ResultKt.throwOnFailure(value);
                                            if (value != null) {
                                                strStringResource2 = StringResources_androidKt.stringResource(i12, new Object[]{amountFormat.format((Number) value)}, composer5, 0);
                                                composer5.endReplaceGroup();
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        }
                                        BentoText2.m20747BentoText38GnDrw(strStringResource2, com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(companion5, result == null, null, 2, null), Color.m6701boximpl(invoke$lambda$2$lambda$0(snapshotState4M4805animateColorAsStateeuL9pac)), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer5, i9).getTextS(), composer5, 0, 0, 8184);
                                        ImmutableList<ApiSalesTax> salesTaxes22 = expandableEstimatedCost2.getSalesTaxes();
                                        composer5.startReplaceGroup(-762395439);
                                        if (salesTaxes22 != null) {
                                            for (ApiSalesTax apiSalesTax : salesTaxes22) {
                                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15237R.string.order_create_estimated_sales_tax_line, new Object[]{Formats.getCurrencyFormat().format(apiSalesTax.getFee()), apiSalesTax.getDisplay_name()}, composer5, 0), null, Color.m6701boximpl(invoke$lambda$2$lambda$0(snapshotState4M4805animateColorAsStateeuL9pac)), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer5, BentoTheme.$stable).getTextS(), composer5, 0, 0, 8186);
                                                composer5 = composer4;
                                            }
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 1572870, 30);
                                composer3.startReplaceGroup(-1665436254);
                                if (expandableEstimatedCost.isBorrowFeesApplicable()) {
                                    Result<BigDecimal> resultM13753getEstimatedTotalDailyBorrowFeexLWZpok = expandableEstimatedCost.m13753getEstimatedTotalDailyBorrowFeexLWZpok();
                                    if (resultM13753getEstimatedTotalDailyBorrowFeexLWZpok != null) {
                                        Object value = resultM13753getEstimatedTotalDailyBorrowFeexLWZpok.getValue();
                                        if (Result.m28555isFailureimpl(value)) {
                                            value = null;
                                        }
                                        bigDecimal = (BigDecimal) value;
                                    } else {
                                        bigDecimal = null;
                                    }
                                    composer3.startReplaceGroup(-1665431104);
                                    if (bigDecimal == null) {
                                        strStringResource = null;
                                        i6 = 2;
                                        r10 = 0;
                                    } else {
                                        int i8 = C15237R.string.order_create_estimated_daily_borrow_fee;
                                        NumberFormatter currencyFormat = Formats.getCurrencyFormat();
                                        i6 = 2;
                                        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
                                        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
                                        r10 = 0;
                                        strStringResource = StringResources_androidKt.stringResource(i8, new Object[]{currencyFormat.format(scale)}, composer3, 0);
                                    }
                                    composer3.endReplaceGroup();
                                    composer3.startReplaceGroup(-1665432547);
                                    if (strStringResource == null) {
                                        strStringResource = StringResources_androidKt.stringResource(C15237R.string.order_create_estimated_daily_borrow_fee_unknown, composer3, r10);
                                    }
                                    composer3.endReplaceGroup();
                                    BentoInlineDefinition.m13274BentoInlineDefinitionlfSFqjE(strStringResource, StringResources_androidKt.stringResource(C15237R.string.order_create_estimated_daily_borrow_fee_definition, composer3, r10), com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(companion2, expandableEstimatedCost.m13753getEstimatedTotalDailyBorrowFeexLWZpok() != null ? r10 : true, null, i6, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), false, StringResources_androidKt.stringResource(C15237R.string.order_create_estimated_daily_borrow_fee_link_substring, composer3, r10), null, null, bentoTheme.getTypography(composer3, i7).getTextS(), snapshotState5.getValue().intValue(), composer3, 0, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(-1672089781, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt.ExpandableEstimatedCostRow.6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i5) {
                                String string2;
                                if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1672089781, i5, -1, "com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRow.<anonymous> (ExpandableEstimatedCostRow.kt:220)");
                                }
                                StringResource estimatedCostValue = state.getEstimatedCostValue();
                                composer3.startReplaceGroup(-560508140);
                                CharSequence text = estimatedCostValue == null ? null : StringResources6.getText(estimatedCostValue, composer3, StringResource.$stable);
                                composer3.endReplaceGroup();
                                if (text == null || (string2 = text.toString()) == null) {
                                    string2 = ExpandableEstimatedCostRow3.PLACEHOLDER_PRICE;
                                }
                                InformationRowComposable3.InformationRowValue(string2, null, state.getEstimatedCostValue() == null, true, composer3, 3072, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), false, true, true, null, composer2, 920128512, 0, 1078);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExpandableEstimatedCostRow$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void ExpandableEstimatedCostRow$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final float ExpandCaretIcon$lambda$17(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ExpandableEstimatedCostRow$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ExpandableEstimatedCostRow$lambda$5(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Result<BigDecimal> ExpandableEstimatedCostRow$lambda$9(SnapshotState<Result<BigDecimal>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandableEstimatedCostRow$lambda$13$lambda$12(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState snapshotState) {
        ExpandableEstimatedCostRow$lambda$6(snapshotState, !ExpandableEstimatedCostRow$lambda$5(snapshotState));
        EventLogger.DefaultImpls.logTap$default(eventLogger, userInteractionEventDescriptor.getAction(), userInteractionEventDescriptor.getScreen(), userInteractionEventDescriptor.getComponent(), userInteractionEventDescriptor.getComponentHierarchy(), userInteractionEventDescriptor.getContext(), false, 32, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandableEstimatedCostRow$lambda$15$lambda$14(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTestTag(semantics, "ExpandableEstimatedCostRow");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExpandCaretIcon(final boolean z, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String strStringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(57548279);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(57548279, i3, -1, "com.robinhood.android.equityadvancedorder.composables.ExpandCaretIcon (ExpandableEstimatedCostRow.kt:236)");
            }
            SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(z ? 0.0f : 180.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_UP_16);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(729115058);
                strStringResource = StringResources_androidKt.stringResource(C15237R.string.order_create_estimated_cost_row_collapse, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(729209236);
                strStringResource = StringResources_androidKt.stringResource(C15237R.string.order_create_estimated_cost_row_expand, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            BentoIcon2.m20644BentoIconFU0evQE(size16, strStringResource, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), Rotate.rotate(modifier, ExpandCaretIcon$lambda$17(snapshotState4AnimateFloatAsState)), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 48);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExpandableEstimatedCostRow3.ExpandCaretIcon$lambda$18(z, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ExpandableEstimatedCostRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(954862747);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(954862747, i, -1, "com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowPreview (ExpandableEstimatedCostRow.kt:253)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ExpandableEstimatedCostRow.INSTANCE.getLambda$918051299$lib_equity_advanced_order_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExpandableEstimatedCostRow3.ExpandableEstimatedCostRowPreview$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
