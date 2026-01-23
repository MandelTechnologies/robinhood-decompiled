package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.extensions.StringResources2;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
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
public final class StatsSectionKt$MoreStats$$inlined$ConstraintLayout$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ FuturesDetailViewState.StatsData $data$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsSectionKt$MoreStats$$inlined$ConstraintLayout$1(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, FuturesDetailViewState.StatsData statsData) {
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
        composer.startReplaceGroup(1029271455);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_stats_high_label, composer, 0), null, 2, null);
        StringResource high = this.$data$inlined.getHigh();
        int i2 = StringResource.$stable;
        AnnotatedString annotatedString2 = new AnnotatedString(StringResources2.getText(high, composer, i2), null, 2, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, null, null, annotatedString2, null, bentoTheme.getTypography(composer, i3).getTextM(), null, null, false, false, 3933, null);
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 0;
        Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f));
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(constraintLayoutBaseScope4Component2) | composer.changed(constraintLayoutBaseScope4Component3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new StatsSectionKt$MoreStats$1$1$1(constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component3);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(modifierM5174width3ABfNKs, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue);
        int i4 = BentoDataRowState.$stable;
        BentoDataRowKt.BentoDataRow(bentoDataRowState, modifierConstrainAs, null, composer, i4, 4);
        BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_stats_low_label, composer, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources2.getText(this.$data$inlined.getLow(), composer, i2), null, 2, null), null, bentoTheme.getTypography(composer, i3).getTextM(), null, null, false, false, 3933, null);
        Modifier modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f));
        composer.startReplaceGroup(5004770);
        boolean zChanged2 = composer.changed(constraintLayoutBaseScope4Component1);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new StatsSectionKt$MoreStats$1$2$1(constraintLayoutBaseScope4Component1);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoDataRowKt.BentoDataRow(bentoDataRowState2, constraintLayoutScope.constrainAs(modifierM5174width3ABfNKs2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2), null, composer, i4, 4);
        BentoDataRowState bentoDataRowState3 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_stats_volume_label, composer, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources2.getText(this.$data$inlined.getVolume(), composer, i2), null, 2, null), null, bentoTheme.getTypography(composer, i3).getTextM(), null, null, false, false, 3933, null);
        Modifier modifierM5174width3ABfNKs3 = SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f));
        composer.startReplaceGroup(-1633490746);
        boolean zChanged3 = composer.changed(constraintLayoutBaseScope4Component4) | composer.changed(constraintLayoutBaseScope4Component1);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new StatsSectionKt$MoreStats$1$3$1(constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component1);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        BentoDataRowKt.BentoDataRow(bentoDataRowState3, constraintLayoutScope.constrainAs(modifierM5174width3ABfNKs3, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue3), null, composer, i4, 4);
        BentoDataRowState bentoDataRowState4 = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C17042R.string.futures_detail_stats_prev_settlement_label, composer, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources2.getText(this.$data$inlined.getPrevSettlement(), composer, i2), null, 2, null), null, bentoTheme.getTypography(composer, i3).getTextM(), null, null, false, false, 3933, null);
        Modifier modifierM5174width3ABfNKs4 = SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(f));
        composer.startReplaceGroup(5004770);
        boolean zChanged4 = composer.changed(constraintLayoutBaseScope4Component3);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new StatsSectionKt$MoreStats$1$4$1(constraintLayoutBaseScope4Component3);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        BentoDataRowKt.BentoDataRow(bentoDataRowState4, constraintLayoutScope.constrainAs(modifierM5174width3ABfNKs4, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue4), null, composer, i4, 4);
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.robinhood.android.futures.detail.ui.StatsSectionKt$MoreStats$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(objRememberedValue5);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue5, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
