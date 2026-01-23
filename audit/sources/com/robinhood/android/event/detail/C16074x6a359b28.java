package com.robinhood.android.event.detail;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.event.detail.EventDetailLiveDataSectionViewState;
import com.robinhood.android.eventcontracts.sharedeventui.C16594R;
import com.robinhood.android.eventcontracts.sharedeventui.StringUtil2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
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
/* renamed from: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$EventDetailLiveDataSection$$inlined$ConstraintLayout$1 */
/* loaded from: classes3.dex */
public final class C16074x6a359b28 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ EventDetailLiveDataSectionViewState $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16074x6a359b28(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$state$inlined = eventDetailLiveDataSectionViewState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String text;
        String text2;
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
        composer.startReplaceGroup(-736558339);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM();
        float fM21594getXlargeD9Ej5fM = bentoTheme.getSpacing(composer, i2).m21594getXlargeD9Ej5fM();
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4}, 0.0f, 2, null);
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4}, 0.0f, 2, null);
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromStart = constraintLayoutScope.createGuidelineFromStart(0.25f);
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorCreateGuidelineFromEnd = constraintLayoutScope.createGuidelineFromEnd(0.25f);
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.DOT_12;
        BentoIcon4.Size12 size12 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
        String strStringResource = StringResources_androidKt.stringResource(C16594R.string.active_event_content_description, composer, 0);
        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(constraintLayoutBaseScope4Component2) | composer.changed(fM21593getSmallD9Ej5fM) | composer.changed(this.$state$inlined);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new EventDetailLiveDataSection2(constraintLayoutBaseScope4Component2, fM21593getSmallD9Ej5fM, this.$state$inlined);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue);
        int i3 = BentoIcon4.Size12.$stable;
        BentoIcon2.m20644BentoIconFU0evQE(size12, strStringResource, jM21425getFg0d7_KjU, modifierConstrainAs, null, false, composer, i3, 48);
        EventDetailLiveDataSectionViewState.ContractViewState leftContractState = this.$state$inlined.getLeftContractState();
        String str = (leftContractState == null || (text2 = leftContractState.getText()) == null) ? "" : text2;
        long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        TickerTextState.Style style = TickerTextState.Style.DISPLAY_MEDIUM;
        composer.startReplaceGroup(-1746271574);
        boolean zChanged2 = composer.changed(verticalAnchorM8138createStartBarrier3ABfNKs$default) | composer.changed(fM21594getXlargeD9Ej5fM) | composer.changed(this.$state$inlined);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new EventDetailLiveDataSection3(verticalAnchorM8138createStartBarrier3ABfNKs$default, fM21594getXlargeD9Ej5fM, this.$state$inlined);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        WrappedTickerKt.m19244TickerTextFNF3uiM(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2), str, jM21425getFg0d7_KjU2, style, composer, 3072);
        StringResource primaryText = this.$state$inlined.getPrimaryText();
        int i4 = StringResource.$stable;
        String text3 = StringUtil2.getText(primaryText, composer, i4);
        TextAlign.Companion companion2 = TextAlign.INSTANCE;
        int iM7919getCentere0LSkKk = companion2.m7919getCentere0LSkKk();
        TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
        FontWeight bold = FontWeight.INSTANCE.getBold();
        composer.startReplaceGroup(-1746271574);
        boolean zChanged3 = composer.changed(constraintLayoutBaseScope4Component4) | composer.changed(verticalAnchorCreateGuidelineFromStart) | composer.changed(verticalAnchorCreateGuidelineFromEnd);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new EventDetailLiveDataSection4(constraintLayoutBaseScope4Component4, verticalAnchorCreateGuidelineFromStart, verticalAnchorCreateGuidelineFromEnd);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(text3, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue3), null, null, bold, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8108);
        StringResource secondaryText = this.$state$inlined.getSecondaryText();
        composer.startReplaceGroup(530501590);
        String text4 = secondaryText == null ? null : StringUtil2.getText(secondaryText, composer, i4);
        composer.endReplaceGroup();
        String str2 = text4 == null ? "" : text4;
        int iM7919getCentere0LSkKk2 = companion2.m7919getCentere0LSkKk();
        TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
        composer.startReplaceGroup(-1224400529);
        boolean zChanged4 = composer.changed(constraintLayoutBaseScope4Component3) | composer.changed(verticalAnchorCreateGuidelineFromStart) | composer.changed(verticalAnchorCreateGuidelineFromEnd) | composer.changed(this.$state$inlined);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new EventDetailLiveDataSection5(constraintLayoutBaseScope4Component3, verticalAnchorCreateGuidelineFromStart, verticalAnchorCreateGuidelineFromEnd, this.$state$inlined);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(str2, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue4), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, textS, composer, 0, 0, 8124);
        EventDetailLiveDataSectionViewState.ContractViewState rightContractState = this.$state$inlined.getRightContractState();
        String str3 = (rightContractState == null || (text = rightContractState.getText()) == null) ? "" : text;
        long jM21425getFg0d7_KjU3 = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        composer.startReplaceGroup(-1746271574);
        boolean zChanged5 = composer.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer.changed(fM21594getXlargeD9Ej5fM) | composer.changed(this.$state$inlined);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new EventDetailLiveDataSection6(verticalAnchorM8137createEndBarrier3ABfNKs$default, fM21594getXlargeD9Ej5fM, this.$state$inlined);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        WrappedTickerKt.m19244TickerTextFNF3uiM(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue5), str3, jM21425getFg0d7_KjU3, style, composer, 3072);
        BentoIcon4.Size12 size122 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
        String strStringResource2 = StringResources_androidKt.stringResource(C16594R.string.active_event_content_description, composer, 0);
        long jM21425getFg0d7_KjU4 = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        composer.startReplaceGroup(-1746271574);
        boolean zChanged6 = composer.changed(constraintLayoutBaseScope4Component5) | composer.changed(fM21593getSmallD9Ej5fM) | composer.changed(this.$state$inlined);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue6 = new EventDetailLiveDataSection7(constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM, this.$state$inlined);
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        BentoIcon2.m20644BentoIconFU0evQE(size122, strStringResource2, jM21425getFg0d7_KjU4, constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue6), null, false, composer, i3, 48);
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue7 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$EventDetailLiveDataSection$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(objRememberedValue7);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue7, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
