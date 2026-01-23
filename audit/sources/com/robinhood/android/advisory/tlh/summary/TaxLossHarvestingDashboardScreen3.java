package com.robinhood.android.advisory.tlh.summary;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestDashboard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLossHarvestingDashboardScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$3$2, reason: use source file name */
/* loaded from: classes7.dex */
final class TaxLossHarvestingDashboardScreen3 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
    final /* synthetic */ TaxLossHarvestDashboard.ActionModal $actionModal;
    final /* synthetic */ TaxLossHarvestDashboardDuxo $duxo;
    final /* synthetic */ Function1<ComposableDestination, Unit> $onInternalNavigate;
    final /* synthetic */ SnapshotState<TaxLossHarvestDashboard.Cta> $pendingCta$delegate;
    final /* synthetic */ UriHandler $uriHandler;

    /* JADX WARN: Multi-variable type inference failed */
    TaxLossHarvestingDashboardScreen3(TaxLossHarvestDashboard.ActionModal actionModal, TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo, Function1<? super ComposableDestination, Unit> function1, UriHandler uriHandler, SnapshotState<TaxLossHarvestDashboard.Cta> snapshotState) {
        this.$actionModal = actionModal;
        this.$duxo = taxLossHarvestDashboardDuxo;
        this.$onInternalNavigate = function1;
        this.$uriHandler = uriHandler;
        this.$pendingCta$delegate = snapshotState;
    }

    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
        final SnapshotState<TaxLossHarvestDashboard.Cta> snapshotState;
        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(815506324, i, -1, "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestDashboardScreen.<anonymous>.<anonymous>.<anonymous> (TaxLossHarvestingDashboardScreen.kt:208)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
        TaxLossHarvestDashboard.ActionModal actionModal = this.$actionModal;
        final TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo = this.$duxo;
        final Function1<ComposableDestination, Unit> function1 = this.$onInternalNavigate;
        final UriHandler uriHandler = this.$uriHandler;
        SnapshotState<TaxLossHarvestDashboard.Cta> snapshotState2 = this.$pendingCta$delegate;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
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
        BentoText2.m20747BentoText38GnDrw(actionModal.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8190);
        BentoMarkdownText2.BentoMarkdownText(actionModal.getSubtitle(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 5, null), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextM(), 0, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        String dismissCta = actionModal.getDismissCta();
        BentoButtons.Type type2 = BentoButtons.Type.Primary;
        composer.startReplaceGroup(5004770);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            snapshotState = snapshotState2;
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$3$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TaxLossHarvestingDashboardScreen3.invoke$lambda$5$lambda$1$lambda$0(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        } else {
            snapshotState = snapshotState2;
        }
        composer.endReplaceGroup();
        final SnapshotState<TaxLossHarvestDashboard.Cta> snapshotState3 = snapshotState;
        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, dismissCta, modifierFillMaxWidth$default, null, type2, false, false, null, null, null, null, false, null, composer, 24966, 0, 8168);
        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
        String actionCta = actionModal.getActionCta();
        BentoButtons.Type type3 = BentoButtons.Type.Secondary;
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(taxLossHarvestDashboardDuxo) | composer.changed(function1) | composer.changedInstance(uriHandler);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$3$3$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TaxLossHarvestingDashboardScreen3.invoke$lambda$5$lambda$4$lambda$3(snapshotState3, taxLossHarvestDashboardDuxo, function1, uriHandler);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, actionCta, modifierM5146paddingqDBjuR0$default, null, type3, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
        invoke(rhModalBottomSheet5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$1$lambda$0(SnapshotState snapshotState) {
        TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$5(snapshotState, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4$lambda$3(SnapshotState snapshotState, TaxLossHarvestDashboardDuxo taxLossHarvestDashboardDuxo, Function1 function1, UriHandler uriHandler) {
        TaxLossHarvestDashboard.Cta ctaTaxLossHarvestDashboardScreen$lambda$4 = TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$4(snapshotState);
        if (ctaTaxLossHarvestDashboardScreen$lambda$4 != null) {
            TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$performCtaAction(taxLossHarvestDashboardDuxo, function1, uriHandler, ctaTaxLossHarvestDashboardScreen$lambda$4);
        }
        TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$5(snapshotState, null);
        return Unit.INSTANCE;
    }
}
