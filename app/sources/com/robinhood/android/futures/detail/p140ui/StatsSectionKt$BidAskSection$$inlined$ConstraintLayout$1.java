package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.extensions.StringResources2;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.futures.sharedfuturesui.FuturesColors;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StatsSectionKt$BidAskSection$$inlined$ConstraintLayout$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ FuturesDetailViewState.StatsData $data$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsSectionKt$BidAskSection$$inlined$ConstraintLayout$1(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, FuturesDetailViewState.StatsData statsData) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$data$inlined = statsData;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
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
        composer.startReplaceGroup(-500295200);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
        String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_detail_stats_bid_label, composer, 0);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
        TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(constraintLayoutBaseScope4Component2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new StatsSectionKt$BidAskSection$1$1$1(constraintLayoutBaseScope4Component2);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(strStringResource, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer, 0, 0, 8184);
        StringResource bid = this.$data$inlined.getBid();
        int i3 = StringResource.$stable;
        String text = StringResources2.getText(bid, composer, i3);
        TextStyle textL = bentoTheme.getTypography(composer, i2).getTextL();
        FontWeight.Companion companion2 = FontWeight.INSTANCE;
        FontWeight bold = companion2.getBold();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged2 = composer.changed(constraintLayoutBaseScope4Component1) | composer.changed(constraintLayoutBaseScope4Component3);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new StatsSectionKt$BidAskSection$1$2$1(constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component3);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(text, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2), null, null, bold, null, null, 0, false, 0, 0, null, 0, textL, composer, 24576, 0, 8172);
        String text2 = StringResources2.getText(this.$data$inlined.getBidSize(), composer, i3);
        TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
        composer.startReplaceGroup(5004770);
        boolean zChanged3 = composer.changed(constraintLayoutBaseScope4Component2);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new StatsSectionKt$BidAskSection$1$3$1(constraintLayoutBaseScope4Component2);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(text2, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue3), null, null, null, null, null, 0, false, 0, 0, null, 0, textM, composer, 0, 0, 8188);
        ConstraintLayoutBaseScope3.Companion companion3 = ConstraintLayoutBaseScope3.INSTANCE;
        constraintLayoutScope.createVerticalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component3}, companion3.getPacked());
        float f = 6;
        float f2 = 42;
        float f3 = 1;
        Modifier modifierM4877borderxT4_qwU$default = BorderKt.m4877borderxT4_qwU$default(Background3.m4872backgroundbw27NRU$default(SizeKt.m5174width3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion, C2002Dp.m7995constructorimpl(f), 0.0f, 2, null), C2002Dp.m7995constructorimpl(f2)), Color.m6705copywmQWz5c$default(FuturesColors.getFuturesBidColor(bentoTheme.getColors(composer, i2)), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), C2002Dp.m7995constructorimpl(f3), FuturesColors.getFuturesBidColor(bentoTheme.getColors(composer, i2)), null, 4, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged4 = composer.changed(constraintLayoutBaseScope4Component5) | composer.changedInstance(this.$data$inlined);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new StatsSectionKt$BidAskSection$1$4$1(constraintLayoutBaseScope4Component5, this.$data$inlined);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        BoxKt.Box(AnimationModifier.animateContentSize$default(constraintLayoutScope.constrainAs(modifierM4877borderxT4_qwU$default, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue4), null, null, 3, null), composer, 0);
        Modifier modifierM4877borderxT4_qwU$default2 = BorderKt.m4877borderxT4_qwU$default(Background3.m4872backgroundbw27NRU$default(SizeKt.m5174width3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(companion, C2002Dp.m7995constructorimpl(f), 0.0f, 2, null), C2002Dp.m7995constructorimpl(f2)), Color.m6705copywmQWz5c$default(FuturesColors.getFuturesAskColor(bentoTheme.getColors(composer, i2)), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), C2002Dp.m7995constructorimpl(f3), FuturesColors.getFuturesAskColor(bentoTheme.getColors(composer, i2)), null, 4, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged5 = composer.changed(constraintLayoutBaseScope4Component4) | composer.changedInstance(this.$data$inlined);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new StatsSectionKt$BidAskSection$1$5$1(constraintLayoutBaseScope4Component4, this.$data$inlined);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        BoxKt.Box(constraintLayoutScope.constrainAs(modifierM4877borderxT4_qwU$default2, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue5), composer, 0);
        constraintLayoutScope.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component5}, companion3.getPacked());
        String strStringResource2 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_stats_ask_label, composer, 0);
        long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
        TextStyle textS2 = bentoTheme.getTypography(composer, i2).getTextS();
        composer.startReplaceGroup(5004770);
        boolean zChanged6 = composer.changed(constraintLayoutBaseScope4Component7);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue6 = new StatsSectionKt$BidAskSection$1$6$1(constraintLayoutBaseScope4Component7);
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(strStringResource2, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue6), Color.m6701boximpl(jM21426getFg20d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textS2, composer, 0, 0, 8184);
        String text3 = StringResources2.getText(this.$data$inlined.getAsk(), composer, i3);
        TextStyle textL2 = bentoTheme.getTypography(composer, i2).getTextL();
        FontWeight bold2 = companion2.getBold();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged7 = composer.changed(constraintLayoutBaseScope4Component6) | composer.changed(constraintLayoutBaseScope4Component8);
        Object objRememberedValue7 = composer.rememberedValue();
        if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue7 = new StatsSectionKt$BidAskSection$1$7$1(constraintLayoutBaseScope4Component6, constraintLayoutBaseScope4Component8);
            composer.updateRememberedValue(objRememberedValue7);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(text3, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue7), null, null, bold2, null, null, 0, false, 0, 0, null, 0, textL2, composer, 24576, 0, 8172);
        String text4 = StringResources2.getText(this.$data$inlined.getAskSize(), composer, i3);
        TextStyle textM2 = bentoTheme.getTypography(composer, i2).getTextM();
        composer.startReplaceGroup(5004770);
        boolean zChanged8 = composer.changed(constraintLayoutBaseScope4Component7);
        Object objRememberedValue8 = composer.rememberedValue();
        if (zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue8 = new StatsSectionKt$BidAskSection$1$8$1(constraintLayoutBaseScope4Component7);
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(text4, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue8), null, null, null, null, null, 0, false, 0, 0, null, 0, textM2, composer, 0, 0, 8188);
        constraintLayoutScope.createVerticalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component6, constraintLayoutBaseScope4Component7, constraintLayoutBaseScope4Component8}, companion3.getPacked());
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue9 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue9 = new Function0<Unit>() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$BidAskSection$$inlined$ConstraintLayout$1.1
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
                    if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                        snapshotState.setValue(constraintSet3);
                        snapshotState2.setValue(snapshotState.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue9);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue9, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
