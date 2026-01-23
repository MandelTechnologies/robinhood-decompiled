package com.robinhood.android.cortex.digest.common.feedback;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
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
import com.robinhood.android.cortex.digest.common.C12073R;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DigestFeedbackItem.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"DigestFeedbackItem", "", "feedback", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "onFeedbackClick", "Lkotlin/Function2;", "Lcom/robinhood/android/cortex/digest/common/feedback/DigestFeedbackType;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-cortex-digest-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackItemKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DigestFeedbackItem {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DigestFeedbackItem$lambda$11(DigestFeedback digestFeedback, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DigestFeedbackItem(digestFeedback, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DigestFeedbackItem(final DigestFeedback digestFeedback, final Function2<? super DigestFeedbackType, ? super DigestFeedback, Unit> onFeedbackClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final boolean z;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final boolean z2;
        boolean zChanged2;
        Object objRememberedValue3;
        boolean zChangedInstance2;
        Object objRememberedValue4;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onFeedbackClick, "onFeedbackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1689832435);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(digestFeedback) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFeedbackClick) ? 32 : 16;
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
                    ComposerKt.traceEventStart(1689832435, i3, -1, "com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackItem (DigestFeedbackItem.kt:25)");
                }
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, (i3 >> 6) & 14, 1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM(), 5, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                z = (digestFeedback == null ? digestFeedback.getReaction() : null) != DigestFeedback.Reaction.LIKE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 11, null);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM5146paddingqDBjuR0$default2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, "like", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(z);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackItemKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DigestFeedbackItem.DigestFeedbackItem$lambda$10$lambda$1$lambda$0(z, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierAutoLogEvents$default, false, (Function1) objRememberedValue, 1, null);
                BentoIconButton4.Type type2 = !z ? BentoIconButton4.Type.Primary : BentoIconButton4.Type.Secondary;
                Modifier modifier5 = modifier4;
                BentoIconButton4.Icon.StandardSize16 standardSize16 = new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.THUMBS_UP_16);
                boolean z3 = digestFeedback == null;
                String strStringResource = StringResources_androidKt.stringResource(C12073R.string.cortex_digest_thumbs_up, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i6 = i3 & 112;
                zChangedInstance = composerStartRestartGroup.changedInstance(digestFeedback) | (i6 != 32);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackItemKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DigestFeedbackItem.DigestFeedbackItem$lambda$10$lambda$4$lambda$3(digestFeedback, onFeedbackClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i7 = BentoIconButton4.Icon.StandardSize16.$stable;
                BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue2, standardSize16, strStringResource, modifierSemantics$default, type2, z3, null, null, null, null, false, composerStartRestartGroup, i7 << 3, 0, 1984);
                z2 = (digestFeedback == null ? digestFeedback.getReaction() : null) != DigestFeedback.Reaction.DISLIKE;
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType, "dislike", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(z2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackItemKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DigestFeedbackItem.DigestFeedbackItem$lambda$10$lambda$6$lambda$5(z2, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifierAutoLogEvents$default2, false, (Function1) objRememberedValue3, 1, null);
                BentoIconButton4.Type type3 = !z2 ? BentoIconButton4.Type.Primary : BentoIconButton4.Type.Secondary;
                BentoIconButton4.Icon.StandardSize16 standardSize162 = new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.THUMBS_DOWN_16);
                boolean z4 = digestFeedback == null;
                String strStringResource2 = StringResources_androidKt.stringResource(C12073R.string.cortex_digest_thumbs_down, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(digestFeedback) | (i6 == 32);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackItemKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DigestFeedbackItem.DigestFeedbackItem$lambda$10$lambda$9$lambda$8(digestFeedback, onFeedbackClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue4, standardSize162, strStringResource2, modifierSemantics$default2, type3, z4, null, null, null, null, false, composer2, i7 << 3, 0, 1984);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackItemKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DigestFeedbackItem.DigestFeedbackItem$lambda$11(digestFeedback, onFeedbackClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, (i3 >> 6) & 14, 1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default3 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21591getLargeD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21594getXlargeD9Ej5fM(), 5, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default3);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
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
                if ((digestFeedback == null ? digestFeedback.getReaction() : null) != DigestFeedback.Reaction.LIKE) {
                }
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifierM5146paddingqDBjuR0$default22 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 0.0f, 11, null);
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType2 = Component.ComponentType.BUTTON;
                Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(modifierM5146paddingqDBjuR0$default22, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(componentType2, "like", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(z);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackItemKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DigestFeedbackItem.DigestFeedbackItem$lambda$10$lambda$1$lambda$0(z, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierSemantics$default3 = SemanticsModifier6.semantics$default(modifierAutoLogEvents$default3, false, (Function1) objRememberedValue, 1, null);
                    if (!z) {
                    }
                    Modifier modifier52 = modifier4;
                    BentoIconButton4.Icon.StandardSize16 standardSize163 = new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.THUMBS_UP_16);
                    if (digestFeedback == null) {
                    }
                    String strStringResource3 = StringResources_androidKt.stringResource(C12073R.string.cortex_digest_thumbs_up, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i62 = i3 & 112;
                    zChangedInstance = composerStartRestartGroup.changedInstance(digestFeedback) | (i62 != 32);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackItemKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DigestFeedbackItem.DigestFeedbackItem$lambda$10$lambda$4$lambda$3(digestFeedback, onFeedbackClick);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        int i72 = BentoIconButton4.Icon.StandardSize16.$stable;
                        BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue2, standardSize163, strStringResource3, modifierSemantics$default3, type2, z3, null, null, null, null, false, composerStartRestartGroup, i72 << 3, 0, 1984);
                        if ((digestFeedback == null ? digestFeedback.getReaction() : null) != DigestFeedback.Reaction.DISLIKE) {
                        }
                        Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(companion22, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType2, "dislike", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(z2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackItemKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return DigestFeedbackItem.DigestFeedbackItem$lambda$10$lambda$6$lambda$5(z2, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierSemantics$default22 = SemanticsModifier6.semantics$default(modifierAutoLogEvents$default22, false, (Function1) objRememberedValue3, 1, null);
                            BentoIconButton4.Type type32 = !z2 ? BentoIconButton4.Type.Primary : BentoIconButton4.Type.Secondary;
                            BentoIconButton4.Icon.StandardSize16 standardSize1622 = new BentoIconButton4.Icon.StandardSize16(ServerToBentoAssetMapper2.THUMBS_DOWN_16);
                            if (digestFeedback == null) {
                            }
                            String strStringResource22 = StringResources_androidKt.stringResource(C12073R.string.cortex_digest_thumbs_down, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(digestFeedback) | (i62 == 32);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackItemKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return DigestFeedbackItem.DigestFeedbackItem$lambda$10$lambda$9$lambda$8(digestFeedback, onFeedbackClick);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue4, standardSize1622, strStringResource22, modifierSemantics$default22, type32, z4, null, null, null, null, false, composer2, i72 << 3, 0, 1984);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
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
    public static final Unit DigestFeedbackItem$lambda$10$lambda$1$lambda$0(boolean z, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setSelected(semantics, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DigestFeedbackItem$lambda$10$lambda$4$lambda$3(DigestFeedback digestFeedback, Function2 function2) {
        if (digestFeedback != null) {
            function2.invoke(DigestFeedbackType.LIKE, digestFeedback);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DigestFeedbackItem$lambda$10$lambda$6$lambda$5(boolean z, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setSelected(semantics, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DigestFeedbackItem$lambda$10$lambda$9$lambda$8(DigestFeedback digestFeedback, Function2 function2) {
        if (digestFeedback != null) {
            function2.invoke(DigestFeedbackType.DISLIKE, digestFeedback);
        }
        return Unit.INSTANCE;
    }
}
