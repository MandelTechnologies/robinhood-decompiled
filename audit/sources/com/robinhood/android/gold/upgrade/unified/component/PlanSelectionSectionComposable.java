package com.robinhood.android.gold.upgrade.unified.component;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
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
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import gold_flow.proto.p466v1.Action;
import gold_flow.proto.p466v1.GoldPlanSelectionOption;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PlanSelectionSectionComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a?\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"PlanSelectionSectionComposable", "", "title", "", "options", "Lkotlinx/collections/immutable/ImmutableList;", "Lgold_flow/proto/v1/GoldPlanSelectionOption;", "onAction", "Lkotlin/Function1;", "Lgold_flow/proto/v1/Action;", "shouldSpaceBetweenBadge", "", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "PlanSelectionOption", "planSelectionOption", "isSelected", "onSelect", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lgold_flow/proto/v1/GoldPlanSelectionOption;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "feature-gold-upgrade_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.unified.component.PlanSelectionSectionComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class PlanSelectionSectionComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlanSelectionOption$lambda$11(GoldPlanSelectionOption goldPlanSelectionOption, boolean z, Function0 function0, Modifier modifier, boolean z2, int i, int i2, Composer composer, int i3) {
        PlanSelectionOption(goldPlanSelectionOption, z, function0, modifier, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlanSelectionSectionComposable$lambda$6(String str, ImmutableList immutableList, Function1 function1, boolean z, int i, int i2, Composer composer, int i3) {
        PlanSelectionSectionComposable(str, immutableList, function1, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlanSelectionSectionComposable(final String str, final ImmutableList<GoldPlanSelectionOption> options, final Function1<? super Action, Unit> onAction, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        int i4;
        Arrangement arrangement;
        Modifier.Companion companion;
        int i5;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(627857589);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(options) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAction) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                boolean z4 = i6 == 0 ? true : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(627857589, i3, -1, "com.robinhood.android.gold.upgrade.unified.component.PlanSelectionSectionComposable (PlanSelectionSectionComposable.kt:39)");
                }
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement2.getTop();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1218059125);
                if (str != null) {
                    companion = companion2;
                    i4 = i3;
                    arrangement = arrangement2;
                    composer2 = composerStartRestartGroup;
                    i5 = 0;
                } else {
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    composer2 = composerStartRestartGroup;
                    i4 = i3;
                    arrangement = arrangement2;
                    BentoText2.m20747BentoText38GnDrw(str, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composer2, 24576, 0, 8174);
                    companion = companion2;
                    i5 = 0;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM() + bentoTheme.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM())), composer2, 0);
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM());
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Intrinsic3.height(companion, Intrinsic4.Max), 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion3.getTop(), composer2, i5);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, i5);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composer2.startReplaceGroup(1227732659);
                for (final GoldPlanSelectionOption goldPlanSelectionOption : options) {
                    boolean zAreEqual = Intrinsics.areEqual(goldPlanSelectionOption.getIs_selected(), Boolean.TRUE);
                    composer2.startReplaceGroup(-1633490746);
                    int i8 = i4;
                    int i9 = (composer2.changedInstance(goldPlanSelectionOption) ? 1 : 0) | ((i8 & 896) == 256 ? 1 : i5);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (i9 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.unified.component.PlanSelectionSectionComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PlanSelectionSectionComposable.m2055xdb9e8a0b(onAction, goldPlanSelectionOption);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    PlanSelectionOption(goldPlanSelectionOption, zAreEqual, (Function0) objRememberedValue, SizeKt.fillMaxHeight$default(Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), z4, composer2, 57344 & (i8 << 3), 0);
                    i4 = i8;
                }
                boolean z5 = z4;
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z3 = z5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z3 = z2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.component.PlanSelectionSectionComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PlanSelectionSectionComposable.PlanSelectionSectionComposable$lambda$6(str, options, onAction, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier.Companion companion22 = Modifier.INSTANCE;
            Arrangement arrangement22 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement22.getTop();
            Alignment.Companion companion32 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion32.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion22);
            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion42.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion42.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion42.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion42.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion42.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1218059125);
                if (str != null) {
                }
                composer2.endReplaceGroup();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM());
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Intrinsic3.height(companion, Intrinsic4.Max), 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, companion32.getTop(), composer2, i5);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, i5);
                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default2);
                Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion42.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    composer2.startReplaceGroup(1227732659);
                    while (r0.hasNext()) {
                    }
                    boolean z52 = z4;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PlanSelectionSectionComposable$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1 */
    public static final Unit m2055xdb9e8a0b(Function1 function1, GoldPlanSelectionOption goldPlanSelectionOption) {
        function1.invoke(goldPlanSelectionOption.getOn_select_action());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PlanSelectionOption(final GoldPlanSelectionOption goldPlanSelectionOption, final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        int i4;
        boolean z3;
        final Modifier modifier3;
        long jM21373getBg30d7_KjU;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String description;
        String description_secondary;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(459781457);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(goldPlanSelectionOption) ? 4 : 2) | i;
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
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
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
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z5 = i4 == 0 ? true : z3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(459781457, i3, -1, "com.robinhood.android.gold.upgrade.unified.component.PlanSelectionOption (PlanSelectionSectionComposable.kt:76)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM());
                    Modifier modifierClip = Clip.clip(modifier3, roundedCornerShapeM5327RoundedCornerShape0680j_4);
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                    if (!z) {
                        composerStartRestartGroup.startReplaceGroup(-233561745);
                        jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-233488306);
                        jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(PaddingKt.m5142padding3ABfNKs(ClickableKt.m4893clickableXHw0xAI$default(BorderKt.m4876borderxT4_qwU(modifierClip, fM7995constructorimpl, jM21373getBg30d7_KjU, roundedCornerShapeM5327RoundedCornerShape0680j_4), false, null, null, function02, 7, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), Component.ComponentType.BUTTON, goldPlanSelectionOption.getLogging_identifier(), false, composerStartRestartGroup, 48, 4);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents);
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
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), !z5 ? arrangement.getSpaceBetween() : arrangement.getStart(), arrangement.getCenter(), null, 0, 0, ComposableLambda3.rememberComposableLambda(743735370, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.component.PlanSelectionSectionComposableKt$PlanSelectionOption$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer2, Integer num) {
                            invoke(flowRowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(FlowRowScope FlowRow, Composer composer2, int i7) {
                            Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                            if ((i7 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(743735370, i7, -1, "com.robinhood.android.gold.upgrade.unified.component.PlanSelectionOption.<anonymous>.<anonymous>.<anonymous> (PlanSelectionSectionComposable.kt:105)");
                            }
                            String title = goldPlanSelectionOption.getTitle();
                            composer2.startReplaceGroup(1765120472);
                            if (title != null) {
                                BentoText2.m20747BentoText38GnDrw(title, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 24576, 0, 8174);
                                Unit unit = Unit.INSTANCE;
                            }
                            composer2.endReplaceGroup();
                            String badge = goldPlanSelectionOption.getBadge();
                            if (badge != null) {
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme2.getSpacing(composer2, i8).m21595getXsmallD9Ej5fM()), composer2, 0);
                                InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(badge, null, null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i8).getSolLight()), null, false, Color.m6701boximpl(bentoTheme2.getColors(composer2, i8).getJet()), null, composer2, 12582912, 54);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573254, 56);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM() + bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM())), composerStartRestartGroup, 0);
                    description = goldPlanSelectionOption.getDescription();
                    composerStartRestartGroup.startReplaceGroup(-1675969083);
                    if (description != null) {
                        BentoMarkdownText2.BentoMarkdownText(description, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), 0, 0L, 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 30), function0, (Function1<? super String, Unit>) null, composerStartRestartGroup, (MarkdownStyle.$stable << 6) | ((i3 << 3) & 7168), 18);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    description_secondary = goldPlanSelectionOption.getDescription_secondary();
                    composerStartRestartGroup.startReplaceGroup(-1675957766);
                    if (description_secondary != null) {
                        Composer composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(description_secondary, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composer2, 0, 0, 8186);
                        composerStartRestartGroup = composer2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z4 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.unified.component.PlanSelectionSectionComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PlanSelectionSectionComposable.PlanSelectionOption$lambda$11(goldPlanSelectionOption, z, function0, modifier3, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            z3 = z2;
            if ((i3 & 9363) != 9362) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM());
                Modifier modifierClip2 = Clip.clip(modifier3, roundedCornerShapeM5327RoundedCornerShape0680j_42);
                float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
                if (!z) {
                }
                Modifier modifierAutoLogEvents2 = UtilKt.autoLogEvents(PaddingKt.m5142padding3ABfNKs(ClickableKt.m4893clickableXHw0xAI$default(BorderKt.m4876borderxT4_qwU(modifierClip2, fM7995constructorimpl2, jM21373getBg30d7_KjU, roundedCornerShapeM5327RoundedCornerShape0680j_42), false, null, null, function02, 7, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), Component.ComponentType.BUTTON, goldPlanSelectionOption.getLogging_identifier(), false, composerStartRestartGroup, 48, 4);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents2);
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
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), !z5 ? arrangement2.getSpaceBetween() : arrangement2.getStart(), arrangement2.getCenter(), null, 0, 0, ComposableLambda3.rememberComposableLambda(743735370, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.component.PlanSelectionSectionComposableKt$PlanSelectionOption$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer22, Integer num) {
                            invoke(flowRowScope, composer22, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(FlowRowScope FlowRow, Composer composer22, int i7) {
                            Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                            if ((i7 & 17) == 16 && composer22.getSkipping()) {
                                composer22.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(743735370, i7, -1, "com.robinhood.android.gold.upgrade.unified.component.PlanSelectionOption.<anonymous>.<anonymous>.<anonymous> (PlanSelectionSectionComposable.kt:105)");
                            }
                            String title = goldPlanSelectionOption.getTitle();
                            composer22.startReplaceGroup(1765120472);
                            if (title != null) {
                                BentoText2.m20747BentoText38GnDrw(title, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer22, BentoTheme.$stable).getTextM(), composer22, 24576, 0, 8174);
                                Unit unit = Unit.INSTANCE;
                            }
                            composer22.endReplaceGroup();
                            String badge = goldPlanSelectionOption.getBadge();
                            if (badge != null) {
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion32, bentoTheme22.getSpacing(composer22, i8).m21595getXsmallD9Ej5fM()), composer22, 0);
                                InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(badge, null, null, Color.m6701boximpl(bentoTheme22.getColors(composer22, i8).getSolLight()), null, false, Color.m6701boximpl(bentoTheme22.getColors(composer22, i8).getJet()), null, composer22, 12582912, 54);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573254, 56);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM() + bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM())), composerStartRestartGroup, 0);
                    description = goldPlanSelectionOption.getDescription();
                    composerStartRestartGroup.startReplaceGroup(-1675969083);
                    if (description != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    description_secondary = goldPlanSelectionOption.getDescription_secondary();
                    composerStartRestartGroup.startReplaceGroup(-1675957766);
                    if (description_secondary != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z4 = z5;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        z3 = z2;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
