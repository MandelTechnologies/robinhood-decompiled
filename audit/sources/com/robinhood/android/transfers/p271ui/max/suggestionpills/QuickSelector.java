package com.robinhood.android.transfers.p271ui.max.suggestionpills;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.transfers.lib.ExtensionsKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: QuickSelector.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"QuickSelector", "", "quickSelectorChips", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/transfers/ui/max/suggestionpills/QuickSelectorChip;", "onChipPress", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "logEventsForV2", "", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.suggestionpills.QuickSelectorKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class QuickSelector {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickSelector$lambda$7(ImmutableList immutableList, Function1 function1, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        QuickSelector(immutableList, function1, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0438  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuickSelector(final ImmutableList<QuickSelectorChip> quickSelectorChips, final Function1<? super QuickSelectorChip, Unit> onChipPress, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(quickSelectorChips, "quickSelectorChips");
        Intrinsics.checkNotNullParameter(onChipPress, "onChipPress");
        Composer composerStartRestartGroup = composer.startRestartGroup(842848888);
        int i5 = 2;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(quickSelectorChips) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onChipPress) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(842848888, i3, -1, "com.robinhood.android.transfers.ui.max.suggestionpills.QuickSelector (QuickSelector.kt:24)");
                    }
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
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
                    composerStartRestartGroup.startReplaceGroup(-1918097409);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(quickSelectorChips, 10));
                    for (final QuickSelectorChip quickSelectorChip : quickSelectorChips) {
                        Modifier modifier5 = modifier4;
                        String text = quickSelectorChip.getText();
                        BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                        boolean enabled = quickSelectorChip.getEnabled();
                        composerStartRestartGroup.startReplaceGroup(-1918084786);
                        Row6 row62 = row6;
                        Context contextCopy$default = null;
                        MAXTransferContext mAXTransferContextCopy = null;
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, i5, null);
                        if (z4) {
                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            UserInteractionEventData.Action action = UserInteractionEventData.Action.REVIEW_TRANSFER;
                            Context context = userInteractionEventDescriptor.getContext();
                            if (context != null) {
                                MAXTransferContext max_transfer_context = context.getMax_transfer_context();
                                if (max_transfer_context != null) {
                                    mAXTransferContextCopy = max_transfer_context.copy((377169 & 1) != 0 ? max_transfer_context.id : null, (377169 & 2) != 0 ? max_transfer_context.amount : null, (377169 & 4) != 0 ? max_transfer_context.source_account : null, (377169 & 8) != 0 ? max_transfer_context.sink_account : null, (377169 & 16) != 0 ? max_transfer_context.frequency : null, (377169 & 32) != 0 ? max_transfer_context.ira_contribution_data : null, (377169 & 64) != 0 ? max_transfer_context.entry_point : null, (377169 & 128) != 0 ? max_transfer_context.ira_distribution_data : null, (377169 & 256) != 0 ? max_transfer_context.session_id : null, (377169 & 512) != 0 ? max_transfer_context.ach_transfer_data : null, (377169 & 1024) != 0 ? max_transfer_context.deposit_suggestions : null, (377169 & 2048) != 0 ? max_transfer_context.ira_roth_conversion_data : null, (377169 & 4096) != 0 ? max_transfer_context.transfer_limit_validation_error : null, (377169 & 8192) != 0 ? max_transfer_context.currency_conversion_data : null, (377169 & 16384) != 0 ? max_transfer_context.locality : null, (377169 & 32768) != 0 ? max_transfer_context.entry_point_logging_identifier : null, (377169 & 65536) != 0 ? max_transfer_context.transfer_v2_direction : null, (377169 & 131072) != 0 ? max_transfer_context.selected_pill_amount : ExtensionsKt.toMoneyForLogging(quickSelectorChip.getValue()), (377169 & 262144) != 0 ? max_transfer_context.transfer_method : null, (377169 & 524288) != 0 ? max_transfer_context.unknownFields() : null);
                                }
                                contextCopy$default = Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mAXTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null);
                            }
                            modifierM5144paddingVpY3zN4$default = ModifiersKt.autoLogEvents$default(modifierM5144paddingVpY3zN4$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, contextCopy$default, new Component(Component.ComponentType.CHIP, "transfer_suggestion_pills", null, 4, null), null, 35, null), true, false, false, true, false, null, 108, null);
                        }
                        Modifier modifier6 = modifierM5144paddingVpY3zN4$default;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(quickSelectorChip);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.suggestionpills.QuickSelectorKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return QuickSelector.QuickSelector$lambda$6$lambda$5$lambda$4$lambda$3(onChipPress, quickSelectorChip);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer3 = composerStartRestartGroup;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, text, modifier6, null, type2, enabled, false, null, null, null, null, false, null, composer3, 24576, 0, 8136);
                        arrayList.add(Unit.INSTANCE);
                        modifier4 = modifier5;
                        composerStartRestartGroup = composer3;
                        row6 = row62;
                        i5 = i5;
                    }
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.suggestionpills.QuickSelectorKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return QuickSelector.QuickSelector$lambda$7(quickSelectorChips, onChipPress, modifier3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i3 & 1171) != 1170) {
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
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
                    Row6 row63 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1918097409);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(quickSelectorChips, 10));
                    while (r24.hasNext()) {
                    }
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickSelector$lambda$6$lambda$5$lambda$4$lambda$3(Function1 function1, QuickSelectorChip quickSelectorChip) {
        function1.invoke(quickSelectorChip);
        return Unit.INSTANCE;
    }
}
