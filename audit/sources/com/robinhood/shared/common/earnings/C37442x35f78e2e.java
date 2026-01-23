package com.robinhood.shared.common.earnings;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.charts.cursor.ChartLabelTrack;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.sdui.chartgroup.AdvancedChartGroupState5;
import com.robinhood.android.sdui.chartgroup.ProtoAdvancedChartGroupState;
import com.robinhood.android.sdui.chartgroup.ProtoAxisConfig;
import com.robinhood.android.sdui.chartgroup.ScrubConfig;
import com.robinhood.android.sdui.chartgroup.ScrubState;
import com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt;
import com.robinhood.android.sdui.chartgroup.YAxisLocation;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.channels.Channel;
import rh_server_driven_ui.p531v1.ChartDto;
import rh_server_driven_ui.p531v1.ChartGroupDto;
import rh_server_driven_ui.p531v1.ChartLegendItemListDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsContent$lambda$30$$inlined$ConstraintLayout$1 */
/* loaded from: classes26.dex */
public final class C37442x35f78e2e extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ String $header$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ ChartGroupDto $sduiChart$inlined;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37442x35f78e2e(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, ChartGroupDto chartGroupDto, String str) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$sduiChart$inlined = chartGroupDto;
        this.$header$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        List<ChartDto> charts;
        ChartDto chartDto;
        Map<String, ChartLegendItemListDto> legend_data;
        Set<String> setKeySet;
        SnapshotState snapshotState;
        Point point;
        Composer composer2 = composer;
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(Unit.INSTANCE);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        ConstraintLayoutScope constraintLayoutScope = this.$scope;
        composer2.startReplaceGroup(337304976);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        composer2.startReplaceGroup(1849434622);
        Object objRememberedValue = composer2.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
            composer2.updateRememberedValue(objRememberedValue);
        }
        SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(5004770);
        boolean zChanged = composer2.changed(this.$sduiChart$inlined);
        Object objRememberedValue2 = composer2.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            ChartGroupDto chartGroupDto = this.$sduiChart$inlined;
            objRememberedValue2 = (chartGroupDto == null || (charts = chartGroupDto.getCharts()) == null || (chartDto = (ChartDto) CollectionsKt.firstOrNull((List) charts)) == null || (legend_data = chartDto.getLegend_data()) == null || (setKeySet = legend_data.keySet()) == null) ? null : EarningsComposable.parseXAxisSnapPoints(setKeySet);
            composer2.updateRememberedValue(objRememberedValue2);
        }
        ImmutableList immutableList = (ImmutableList) objRememberedValue2;
        composer2.endReplaceGroup();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        composer2.startReplaceGroup(5004770);
        boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component2);
        Object objRememberedValue3 = composer2.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new EarningsComposable2(constraintLayoutBaseScope4Component2);
            composer2.updateRememberedValue(objRememberedValue3);
        }
        composer2.endReplaceGroup();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue3), 0.0f, 1, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer2, i2).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, composer2, 0, 1), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM() + bentoTheme.getSpacing(composer2, i2).m21595getXsmallD9Ej5fM()), 7, null);
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        String str = this.$header$inlined;
        if (str == null) {
            str = "";
        }
        BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i2).getDisplayCapsuleMedium(), composer2, 0, 0, 8190);
        composer2.endNode();
        composer2.startReplaceGroup(1534937605);
        if (this.$sduiChart$inlined != null) {
            UIComponentDto.ConcreteDto.ChartGroup chartGroup = new UIComponentDto.ConcreteDto.ChartGroup(this.$sduiChart$inlined);
            composer2.startReplaceGroup(5004770);
            boolean zChanged3 = composer2.changed(constraintLayoutBaseScope4Component1);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new EarningsComposable3(constraintLayoutBaseScope4Component1);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceGroup();
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue4), 0.0f, 1, null), 0.0f, composer2, 0, 1);
            ProtoAdvancedChartGroupState protoAdvancedChartGroupState = new ProtoAdvancedChartGroupState(new ProtoAxisConfig(0.0f, 0.0f, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), null, null, false, YAxisLocation.START, null, false, null, 1847, null), new ScrubConfig(true, false, null, false, false, false, true, immutableList, false, 256, null), AdvancedChartGroupState5.NONE, 0, true, null, 40, null);
            composer2.startReplaceGroup(5004770);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                snapshotState = snapshotState2;
                objRememberedValue5 = new EarningsComposable4(snapshotState);
                composer2.updateRememberedValue(objRememberedValue5);
            } else {
                snapshotState = snapshotState2;
            }
            composer2.endReplaceGroup();
            SnapshotState snapshotState3 = snapshotState;
            SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup(chartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, protoAdvancedChartGroupState, null, null, (Function1) objRememberedValue5, null, null, composer2, (ProtoAdvancedChartGroupState.$stable << 9) | 1572864, 436);
            ScrubState scrubStateEarningsContent$lambda$30$lambda$29$lambda$20 = EarningsComposable.EarningsContent$lambda$30$lambda$29$lambda$20(snapshotState3);
            Float fValueOf = (scrubStateEarningsContent$lambda$30$lambda$29$lambda$20 == null || (point = scrubStateEarningsContent$lambda$30$lambda$29$lambda$20.getPoint()) == null) ? null : Float.valueOf(point.getX());
            composer2.startReplaceGroup(5004770);
            boolean zChanged4 = composer2.changed(constraintLayoutBaseScope4Component2);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new EarningsComposable5(constraintLayoutBaseScope4Component2);
                composer2.updateRememberedValue(objRememberedValue6);
            }
            composer2.endReplaceGroup();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(constraintLayoutScope.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue6), 0.0f, 1, null);
            ScrubState scrubStateEarningsContent$lambda$30$lambda$29$lambda$202 = EarningsComposable.EarningsContent$lambda$30$lambda$29$lambda$20(snapshotState3);
            ChartLabelTrack.ChartCursorTrack(fValueOf, modifierFillMaxWidth$default2, scrubStateEarningsContent$lambda$30$lambda$29$lambda$202 != null ? scrubStateEarningsContent$lambda$30$lambda$29$lambda$202.getChartStartXOffset() : 0.0f, ComposableLambda3.rememberComposableLambda(-2000901038, true, new EarningsComposable6(snapshotState3, this.$sduiChart$inlined), composer2, 54), composer2, 3072, 0);
            composer2 = composer2;
        }
        composer2.endReplaceGroup();
        composer2.endReplaceGroup();
        boolean zChangedInstance = composer2.changedInstance(this.$scope) | composer2.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState4 = this.$start;
        final SnapshotState snapshotState5 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue7 = composer2.rememberedValue();
        if (zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
            objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsContent$lambda$30$$inlined$ConstraintLayout$1.1
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
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope2.getContainerObject().mo8187clone());
                    if (snapshotState4.getValue() == null || snapshotState5.getValue() == null) {
                        snapshotState4.setValue(constraintSet3);
                        snapshotState5.setValue(snapshotState4.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer2.updateRememberedValue(objRememberedValue7);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue7, composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
