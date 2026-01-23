package com.robinhood.android.futures.detail.p140ui.chart;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.extensions.StringResources2;
import com.robinhood.android.futures.sharedfuturesui.ModifiersKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$DefaultChartHeader$$inlined$ConstraintLayout$1 */
/* loaded from: classes3.dex */
public final class C17095x1454f9aa extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ CursorData $activeCursorData$inlined;
    final /* synthetic */ String $ask$inlined;
    final /* synthetic */ String $bid$inlined;
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ StringResource $contractSelectorText$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ Function0 $onOpenContractsSelector$inlined;
    final /* synthetic */ StringResource $productName$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ String $scrubDisplayOverride$inlined;
    final /* synthetic */ boolean $shouldAddScrimOverlayToChartComponents$inlined;
    final /* synthetic */ boolean $showBidAsk$inlined;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17095x1454f9aa(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, String str, boolean z, StringResource stringResource, Function0 function0, StringResource stringResource2, CursorData cursorData, boolean z2, String str2, String str3) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$scrubDisplayOverride$inlined = str;
        this.$shouldAddScrimOverlayToChartComponents$inlined = z;
        this.$contractSelectorText$inlined = stringResource;
        this.$onOpenContractsSelector$inlined = function0;
        this.$productName$inlined = stringResource2;
        this.$activeCursorData$inlined = cursorData;
        this.$showBidAsk$inlined = z2;
        this.$bid$inlined = str2;
        this.$ask$inlined = str3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
        ConstraintLayoutScope constraintLayoutScope;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope44;
        BentoTheme bentoTheme;
        int i2;
        C17095x1454f9aa c17095x1454f9aa = this;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        c17095x1454f9aa.$contentTracker.setValue(Unit.INSTANCE);
        if (c17095x1454f9aa.$compositionSource.getValue() == CompositionSource.Unknown) {
            c17095x1454f9aa.$compositionSource.setValue(CompositionSource.Content);
        }
        c17095x1454f9aa.$scope.reset();
        ConstraintLayoutScope constraintLayoutScope2 = c17095x1454f9aa.$scope;
        composer.startReplaceGroup(-575089303);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        constraintLayoutScope2.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component5}, ConstraintLayoutBaseScope3.INSTANCE.getSpreadInside());
        if (c17095x1454f9aa.$scrubDisplayOverride$inlined != null) {
            composer.startReplaceGroup(-575027552);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            TextStyle textS = bentoTheme2.getTypography(composer, i3).getTextS();
            FontWeight bold = FontWeight.INSTANCE.getBold();
            Modifier modifierM14735scrimGUYwDQI$default = ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5145paddingqDBjuR0(Modifier.INSTANCE, bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i3).m21595getXsmallD9Ej5fM()), c17095x1454f9aa.$shouldAddScrimOverlayToChartComponents$inlined, null, null, 6, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(constraintLayoutBaseScope4Component2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FuturesDetailChartSectionKt$DefaultChartHeader$1$1$1(constraintLayoutBaseScope4Component2);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component5;
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component3;
            BentoText2.m20747BentoText38GnDrw(c17095x1454f9aa.$scrubDisplayOverride$inlined, constraintLayoutScope2.constrainAs(modifierM14735scrimGUYwDQI$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue), null, null, bold, null, null, 0, false, 0, 0, null, 0, textS, composer, 24576, 0, 8172);
            composer.endReplaceGroup();
            constraintLayoutScope = constraintLayoutScope2;
            constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component1;
            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component2;
        } else {
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component5;
            constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component3;
            composer.startReplaceGroup(-574278344);
            StringResource stringResource = c17095x1454f9aa.$contractSelectorText$inlined;
            Function0 function0 = c17095x1454f9aa.$onOpenContractsSelector$inlined;
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM14735scrimGUYwDQI$default2 = ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme3.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), bentoTheme3.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer, i4).m21595getXsmallD9Ej5fM()), c17095x1454f9aa.$shouldAddScrimOverlayToChartComponents$inlined, null, null, 6, null);
            composer.startReplaceGroup(5004770);
            constraintLayoutBaseScope43 = constraintLayoutBaseScope4Component2;
            boolean zChanged2 = composer.changed(constraintLayoutBaseScope43);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new FuturesDetailChartSectionKt$DefaultChartHeader$1$2$1(constraintLayoutBaseScope43);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            constraintLayoutScope = constraintLayoutScope2;
            constraintLayoutBaseScope44 = constraintLayoutBaseScope4Component1;
            ContractHeader.ContractHeader(stringResource, function0, constraintLayoutScope.constrainAs(modifierM14735scrimGUYwDQI$default2, constraintLayoutBaseScope44, (Function1) objRememberedValue2), composer, StringResource.$stable, 0);
            composer.endReplaceGroup();
        }
        String text = StringResources2.getText(c17095x1454f9aa.$productName$inlined, composer, StringResource.$stable);
        BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
        int i5 = BentoTheme.$stable;
        TextStyle displayCapsuleLarge = bentoTheme4.getTypography(composer, i5).getDisplayCapsuleLarge();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme4.getSpacing(composer, i5).m21592getMediumD9Ej5fM(), bentoTheme4.getSpacing(composer, i5).m21595getXsmallD9Ej5fM(), bentoTheme4.getSpacing(composer, i5).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
        composer.startReplaceGroup(-1633490746);
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope45 = constraintLayoutBaseScope42;
        boolean zChanged3 = composer.changed(constraintLayoutBaseScope44) | composer.changed(constraintLayoutBaseScope45);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new FuturesDetailChartSectionKt$DefaultChartHeader$1$3$1(constraintLayoutBaseScope44, constraintLayoutBaseScope45);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
        BentoText2.m20747BentoText38GnDrw(text, constraintLayoutScope.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope43, (Function1) objRememberedValue3), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 0, 0, 8188);
        CompositionLocal3.CompositionLocalProvider(Styles2.getLocalStyles().provides(new C17103xd69dc07b((Styles) composer.consume(Styles2.getLocalStyles()))), ComposableLambda3.rememberComposableLambda(55392340, true, new FuturesDetailChartSectionKt$DefaultChartHeader$1$4(constraintLayoutScope3, constraintLayoutBaseScope45, constraintLayoutBaseScope43, constraintLayoutBaseScope4Component4, c17095x1454f9aa.$activeCursorData$inlined, c17095x1454f9aa.$shouldAddScrimOverlayToChartComponents$inlined), composer, 54), composer, ProvidedValue.$stable | 48);
        Modifier modifierM14735scrimGUYwDQI$default3 = ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme4.getSpacing(composer, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), c17095x1454f9aa.$shouldAddScrimOverlayToChartComponents$inlined, null, null, 6, null);
        composer.startReplaceGroup(-1633490746);
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope46 = constraintLayoutBaseScope4;
        boolean zChanged4 = composer.changed(constraintLayoutBaseScope45) | composer.changed(constraintLayoutBaseScope46);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new FuturesDetailChartSectionKt$DefaultChartHeader$1$5$1(constraintLayoutBaseScope45, constraintLayoutBaseScope46);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope3.constrainAs(modifierM14735scrimGUYwDQI$default3, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue4);
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierConstrainAs);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        if (c17095x1454f9aa.$showBidAsk$inlined) {
            composer.startReplaceGroup(329873304);
            String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_bid_label, composer, 0);
            long jM21426getFg20d7_KjU = bentoTheme4.getColors(composer, i5).m21426getFg20d7_KjU();
            TextStyle textM = bentoTheme4.getTypography(composer, i5).getTextM();
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8170);
            composer.startReplaceGroup(-266444576);
            String str = c17095x1454f9aa.$bid$inlined;
            if (str == null) {
                bentoTheme = bentoTheme4;
                i2 = i5;
            } else {
                long jM21425getFg0d7_KjU = bentoTheme4.getColors(composer, i5).m21425getFg0d7_KjU();
                bentoTheme = bentoTheme4;
                i2 = i5;
                BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme4.getSpacing(composer, i5).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer, i5).getTextM(), composer, 24576, 0, 8168);
            }
            composer.endReplaceGroup();
            String strStringResource2 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_chart_ask_label, composer, 0);
            int i6 = i2;
            long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composer, i6).m21426getFg20d7_KjU();
            BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer, i6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM21426getFg20d7_KjU2), null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i6).getTextM(), composer, 24576, 0, 8168);
            String str2 = this.$ask$inlined;
            if (str2 == null) {
                c17095x1454f9aa = this;
            } else {
                long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer, i6).m21425getFg0d7_KjU();
                TextStyle textM2 = bentoTheme.getTypography(composer, i6).getTextM();
                c17095x1454f9aa = this;
                BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer, i6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, textM2, composer, 24576, 0, 8168);
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(331292050);
            BentoText2.m20747BentoText38GnDrw("", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
            composer.endReplaceGroup();
        }
        composer.endNode();
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(c17095x1454f9aa.$scope) | composer.changedInstance(c17095x1454f9aa.$channel);
        final ConstraintLayoutScope constraintLayoutScope4 = c17095x1454f9aa.$scope;
        final SnapshotState snapshotState = c17095x1454f9aa.$start;
        final SnapshotState snapshotState2 = c17095x1454f9aa.$end;
        final Channel channel = c17095x1454f9aa.$channel;
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$DefaultChartHeader$$inlined$ConstraintLayout$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope4.getContainerObject().mo8187clone());
                    if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                        snapshotState.setValue(constraintSet3);
                        snapshotState2.setValue(snapshotState.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue5, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
