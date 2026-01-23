package com.robinhood.android.acatsin.agreement;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.UiSlipAgreementsSection;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInAgreementComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$AcatsInAgreementComposable$4$1$1$2$2, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInAgreementComposable7 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $screenEventContext;
    final /* synthetic */ UiSlipAgreementsSection $slipAgreementsSection;
    final /* synthetic */ SnapshotState<Boolean> $slipCheckboxChecked$delegate;

    AcatsInAgreementComposable7(UiSlipAgreementsSection uiSlipAgreementsSection, Context context, SnapshotState<Boolean> snapshotState) {
        this.$slipAgreementsSection = uiSlipAgreementsSection;
        this.$screenEventContext = context;
        this.$slipCheckboxChecked$delegate = snapshotState;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(648816048, i, -1, "com.robinhood.android.acatsin.agreement.AcatsInAgreementComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AcatsInAgreementComposable.kt:132)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierTestTag = TestTag3.testTag(companion, AcatsInAgreementComposable.SlipCheckboxSectionTestTag);
        UiSlipAgreementsSection uiSlipAgreementsSection = this.$slipAgreementsSection;
        Context context = this.$screenEventContext;
        final SnapshotState<Boolean> snapshotState = this.$slipCheckboxChecked$delegate;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierTestTag);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        Modifier modifierTestTag2 = TestTag3.testTag(companion, AcatsInAgreementComposable.SlipCheckboxTestTag);
        Boolean boolAcatsInAgreementComposable$lambda$7 = AcatsInAgreementComposable.AcatsInAgreementComposable$lambda$7(snapshotState);
        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierTestTag2, new UserInteractionEventDescriptor(null, null, Intrinsics.areEqual(boolAcatsInAgreementComposable$lambda$7, Boolean.TRUE) ? UserInteractionEventData.Action.DESELECT : Intrinsics.areEqual(boolAcatsInAgreementComposable$lambda$7, Boolean.FALSE) ? UserInteractionEventData.Action.SELECT : UserInteractionEventData.Action.ACTION_UNSPECIFIED, context, new Component(Component.ComponentType.TOGGLE, "enable-slip-checkbox", null, 4, null), null, 35, null), true, false, false, true, false, null, 108, null);
        Boolean boolAcatsInAgreementComposable$lambda$72 = AcatsInAgreementComposable.AcatsInAgreementComposable$lambda$7(snapshotState);
        Intrinsics.checkNotNull(boolAcatsInAgreementComposable$lambda$72);
        boolean zBooleanValue = boolAcatsInAgreementComposable$lambda$72.booleanValue();
        composer.startReplaceGroup(5004770);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$AcatsInAgreementComposable$4$1$1$2$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AcatsInAgreementComposable7.invoke$lambda$3$lambda$2$lambda$1$lambda$0(snapshotState, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(modifierAutoLogEvents$default, zBooleanValue, false, null, (Function1) objRememberedValue, composer, 24576, 12);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
        BentoText2.m20747BentoText38GnDrw(uiSlipAgreementsSection.getCheckbox().getCheckboxText(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 24576, 0, 8174);
        composer.endNode();
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
        BentoText2.m20747BentoText38GnDrw(uiSlipAgreementsSection.getCheckbox().getAcknowledgementText(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8190);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }
}
