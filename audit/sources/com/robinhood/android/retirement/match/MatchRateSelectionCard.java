package com.robinhood.android.retirement.match;

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
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.retirement.api.RetirementMatchInfoTag;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchSelectionRow;
import com.robinhood.android.retirement.lib.MatchPill;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.Haptics;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchRateSelectionCard.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a@\u0010\u0011\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/models/retirement/api/contributions/ApiMatchSelectionRow;", "row", "", "showGoldRejoinFlow", "Lcom/robinhood/android/retirement/match/MatchOptionsCallbacks;", "callbacks", "Landroidx/compose/ui/Modifier;", "modifier", "", "MatchRateSelectionCard", "(Lcom/robinhood/android/models/retirement/api/contributions/ApiMatchSelectionRow;ZLcom/robinhood/android/retirement/match/MatchOptionsCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "content", EquityOrderFormRowState2.SelectionRowTestTag, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-retirement-contributions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.match.MatchRateSelectionCardKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class MatchRateSelectionCard {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchRateSelectionCard$lambda$2(ApiMatchSelectionRow apiMatchSelectionRow, boolean z, MatchOptionsScreen4 matchOptionsScreen4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MatchRateSelectionCard(apiMatchSelectionRow, z, matchOptionsScreen4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionRow$lambda$5(Function0 function0, Function3 function3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SelectionRow(function0, function3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchRateSelectionCard(final ApiMatchSelectionRow row, final boolean z, final MatchOptionsScreen4 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1243872949);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(row) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1243872949, i3, -1, "com.robinhood.android.retirement.match.MatchRateSelectionCard (MatchRateSelectionCard.kt:36)");
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ROW, row.getLogging_id(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                Modifier modifier4 = modifier2;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 896) != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changedInstance(row) | ((i3 & 112) == 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.match.MatchRateSelectionCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MatchRateSelectionCard.MatchRateSelectionCard$lambda$1$lambda$0(callbacks, row, z);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                SelectionRow((Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(-993326759, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.match.MatchRateSelectionCardKt.MatchRateSelectionCard.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                        invoke(row5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 SelectionRow, Composer composer2, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(SelectionRow, "$this$SelectionRow");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | (composer2.changed(SelectionRow) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-993326759, i6, -1, "com.robinhood.android.retirement.match.MatchRateSelectionCard.<anonymous> (MatchRateSelectionCard.kt:51)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierWeight$default = Row5.weight$default(SelectionRow, companion, 1.0f, false, 2, null);
                        ApiMatchSelectionRow apiMatchSelectionRow = row;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        RetirementMatchInfoTag info_tag = apiMatchSelectionRow.getInfo_tag();
                        composer2.startReplaceGroup(2061201412);
                        if (info_tag != null) {
                            MatchPill.MatchPill(info_tag.getTitle(), info_tag.getType(), null, composer2, 0, 4);
                            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        String title = apiMatchSelectionRow.getTitle();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextM(), composer2, 24576, 0, 8170);
                        BentoText2.m20747BentoText38GnDrw(apiMatchSelectionRow.getDescription(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8186);
                        composer2.endNode();
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme.getColors(composer2, i7).m21427getFg30d7_KjU(), null, null, false, composer2, BentoIcon4.Size16.$stable | 48, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), modifierAutoLogEvents$default, composerStartRestartGroup, 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.match.MatchRateSelectionCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MatchRateSelectionCard.MatchRateSelectionCard$lambda$2(row, z, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ROW, row.getLogging_id(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
            Modifier modifier42 = modifier2;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            if ((i3 & 896) != 256) {
                zChangedInstance = ((i3 & 896) != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(callbacks))) | composerStartRestartGroup.changedInstance(row) | ((i3 & 112) == 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.match.MatchRateSelectionCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MatchRateSelectionCard.MatchRateSelectionCard$lambda$1$lambda$0(callbacks, row, z);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    SelectionRow((Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(-993326759, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.match.MatchRateSelectionCardKt.MatchRateSelectionCard.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                            invoke(row5, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 SelectionRow, Composer composer2, int i5) {
                            int i6;
                            Intrinsics.checkNotNullParameter(SelectionRow, "$this$SelectionRow");
                            if ((i5 & 6) == 0) {
                                i6 = i5 | (composer2.changed(SelectionRow) ? 4 : 2);
                            } else {
                                i6 = i5;
                            }
                            if ((i6 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-993326759, i6, -1, "com.robinhood.android.retirement.match.MatchRateSelectionCard.<anonymous> (MatchRateSelectionCard.kt:51)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierWeight$default = Row5.weight$default(SelectionRow, companion, 1.0f, false, 2, null);
                            ApiMatchSelectionRow apiMatchSelectionRow = row;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            RetirementMatchInfoTag info_tag = apiMatchSelectionRow.getInfo_tag();
                            composer2.startReplaceGroup(2061201412);
                            if (info_tag != null) {
                                MatchPill.MatchPill(info_tag.getTitle(), info_tag.getType(), null, composer2, 0, 4);
                                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer2, 0);
                            }
                            composer2.endReplaceGroup();
                            String title = apiMatchSelectionRow.getTitle();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextM(), composer2, 24576, 0, 8170);
                            BentoText2.m20747BentoText38GnDrw(apiMatchSelectionRow.getDescription(), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8186);
                            composer2.endNode();
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme.getColors(composer2, i7).m21427getFg30d7_KjU(), null, null, false, composer2, BentoIcon4.Size16.$stable | 48, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), modifierAutoLogEvents$default2, composerStartRestartGroup, 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchRateSelectionCard$lambda$1$lambda$0(MatchOptionsScreen4 matchOptionsScreen4, ApiMatchSelectionRow apiMatchSelectionRow, boolean z) {
        matchOptionsScreen4.onMatchRateSelected(apiMatchSelectionRow.getType(), z);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SelectionRow(final Function0<Unit> function0, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1716807168);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1716807168, i3, -1, "com.robinhood.android.retirement.match.SelectionRow (MatchRateSelectionCard.kt:88)");
                }
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierClip = Clip.clip(BorderKt.m4876borderxT4_qwU(modifier3, fM7995constructorimpl, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), roundedCornerShapeM5327RoundedCornerShape0680j_4), roundedCornerShapeM5327RoundedCornerShape0680j_4);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) == 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.match.MatchRateSelectionCardKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MatchRateSelectionCard.SelectionRow$lambda$4$lambda$3(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierClip, true, null, null, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), 6, null), null, true, false, false, true, false, null, 109, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM());
                int i6 = ((i3 << 6) & 7168) | 384;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
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
                function3.invoke(Row6.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.match.MatchRateSelectionCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MatchRateSelectionCard.SelectionRow$lambda$5(function0, function3, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierClip2 = Clip.clip(BorderKt.m4876borderxT4_qwU(modifier3, fM7995constructorimpl2, Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), roundedCornerShapeM5327RoundedCornerShape0680j_42), roundedCornerShapeM5327RoundedCornerShape0680j_42);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) == 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.match.MatchRateSelectionCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MatchRateSelectionCard.SelectionRow$lambda$4$lambda$3(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierClip2, true, null, null, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), 6, null), null, true, false, false, true, false, null, 109, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM());
                int i62 = ((i3 << 6) & 7168) | 384;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
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
                    function3.invoke(Row6.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i62 >> 6) & 112) | 6));
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectionRow$lambda$4$lambda$3(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
