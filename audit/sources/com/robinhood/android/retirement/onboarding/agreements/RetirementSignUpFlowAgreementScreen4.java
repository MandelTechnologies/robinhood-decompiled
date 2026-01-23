package com.robinhood.android.retirement.onboarding.agreements;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.BrokerageAccountType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RetirementSignUpFlowAgreementScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$RetirementAgreementsScreen$1$1$1$2, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementSignUpFlowAgreementScreen4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ RetirementSignUpFlowAgreementScreen $callbacks;
    final /* synthetic */ RetirementAgreementsViewState $state;

    RetirementSignUpFlowAgreementScreen4(RetirementAgreementsViewState retirementAgreementsViewState, RetirementSignUpFlowAgreementScreen retirementSignUpFlowAgreementScreen) {
        this.$state = retirementAgreementsViewState;
        this.$callbacks = retirementSignUpFlowAgreementScreen;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(213184446, i, -1, "com.robinhood.android.retirement.onboarding.agreements.RetirementAgreementsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RetirementSignUpFlowAgreementScreen.kt:152)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierAgreementSectionBottomPadding = RetirementSignUpFlowAgreementScreen2.agreementSectionBottomPadding(companion);
        RetirementAgreementsViewState retirementAgreementsViewState = this.$state;
        final RetirementSignUpFlowAgreementScreen retirementSignUpFlowAgreementScreen = this.$callbacks;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAgreementSectionBottomPadding);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1);
        String title = retirementAgreementsViewState.getSlipAgreement().getTitle();
        String summary_title = retirementAgreementsViewState.getSlipAgreement().getSummary_title();
        List<String> summary_items = retirementAgreementsViewState.getSlipAgreement().getSummary_items();
        ImmutableList3 persistentList = summary_items != null ? extensions2.toPersistentList(summary_items) : null;
        String subtitle_markdown = retirementAgreementsViewState.getSlipAgreement().getSubtitle_markdown();
        String agreement_links_markdown = retirementAgreementsViewState.getSlipAgreement().getAgreement_links_markdown();
        String checkbox_title = retirementAgreementsViewState.getSlipAgreement().getCheckbox_title();
        ImmutableList3 persistentList2 = extensions2.toPersistentList(retirementAgreementsViewState.getSignedAgreements().getSlipCheckboxStates());
        String checkbox_subtitle = retirementAgreementsViewState.getSlipAgreement().getCheckbox_subtitle();
        String value_prop = retirementAgreementsViewState.getSlipAgreement().getValue_prop();
        String logging_identifier = retirementAgreementsViewState.getSlipAgreement().getLogging_identifier();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(retirementSignUpFlowAgreementScreen);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$RetirementAgreementsScreen$1$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowAgreementScreen4.invoke$lambda$2$lambda$1$lambda$0(retirementSignUpFlowAgreementScreen, (BrokerageAccountType) obj, ((Boolean) obj2).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        RetirementSlipAgreement.RetirementSlipAgreement(logging_identifier, modifierM21623defaultHorizontalPaddingrAjV9yQ, title, summary_title, persistentList, checkbox_title, persistentList2, checkbox_subtitle, value_prop, subtitle_markdown, agreement_links_markdown, (Function2) objRememberedValue, composer, 0, 0, 0);
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
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(RetirementSignUpFlowAgreementScreen retirementSignUpFlowAgreementScreen, BrokerageAccountType type2, boolean z) {
        Intrinsics.checkNotNullParameter(type2, "type");
        retirementSignUpFlowAgreementScreen.onSlipToggled(type2, z);
        return Unit.INSTANCE;
    }
}
