package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.material3.Divider5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
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
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
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
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$TwoRowsDisplay$$inlined$ConstraintLayout$1 */
/* loaded from: classes3.dex */
public final class C17200x1e47115f extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ Boolean $isSeed1Winner$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ BracketGameSeedData $seed1$inlined;
    final /* synthetic */ BracketGameSeedData $seed2$inlined;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17200x1e47115f(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, Boolean bool, BracketGameSeedData bracketGameSeedData, BracketGameSeedData bracketGameSeedData2) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$isSeed1Winner$inlined = bool;
        this.$seed1$inlined = bracketGameSeedData;
        this.$seed2$inlined = bracketGameSeedData2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor;
        boolean z;
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        boolean zChanged3;
        Object objRememberedValue3;
        String score;
        boolean zChanged4;
        Object objRememberedValue4;
        String score2;
        boolean zChanged5;
        Object objRememberedValue5;
        boolean zChanged6;
        Object objRememberedValue6;
        boolean zChanged7;
        Object objRememberedValue7;
        boolean zChanged8;
        Object objRememberedValue8;
        boolean zChangedInstance;
        final ConstraintLayoutScope constraintLayoutScope;
        final SnapshotState snapshotState;
        final SnapshotState snapshotState2;
        final Channel channel;
        Object objRememberedValue9;
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
        ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        composer.startReplaceGroup(-884332427);
        long jSeedTextColor = BracketMatchOverviewCardKt.seedTextColor(Intrinsics.areEqual(this.$isSeed1Winner$inlined, Boolean.FALSE), composer, 0);
        long jSeedTextColor2 = BracketMatchOverviewCardKt.seedTextColor(Intrinsics.areEqual(this.$isSeed1Winner$inlined, Boolean.TRUE), composer, 0);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component9 = constrainedLayoutReferencesCreateRefs.component9();
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8137createEndBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8137createEndBarrier3ABfNKs$default(constraintLayoutScope2, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2}, 0.0f, 2, null);
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8141createGuidelineFromEnd0680j_4 = constraintLayoutScope2.m8141createGuidelineFromEnd0680j_4(C2002Dp.m7995constructorimpl(40));
        ConstraintLayoutBaseScope.VerticalAnchor verticalAnchorM8138createStartBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8138createStartBarrier3ABfNKs$default(constraintLayoutScope2, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component5, constraintLayoutBaseScope4Component6, constraintLayoutBaseScope4Component7, constraintLayoutBaseScope4Component8}, 0.0f, 2, null);
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorCreateGuidelineFromTop = constraintLayoutScope2.createGuidelineFromTop(0.5f);
        boolean z2 = (this.$seed1$inlined.getScore() == null || this.$seed2$inlined.getScore() == null) ? false : true;
        String displayId = this.$seed1$inlined.getDisplayId();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
        long jM21427getFg30d7_KjU = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(-1746271574);
        boolean zChanged9 = composer.changed(horizontalAnchorCreateGuidelineFromTop) | composer.changed(constraintLayoutBaseScope4Component3) | composer.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default);
        Object objRememberedValue10 = composer.rememberedValue();
        if (!zChanged9) {
            verticalAnchor = verticalAnchorM8138createStartBarrier3ABfNKs$default;
            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
            }
            composer.endReplaceGroup();
            z = z2;
            verticalAnchor2 = verticalAnchor;
            BentoText2.m20747BentoText38GnDrw(displayId, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10), Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 1, 0, null, 0, textS, composer, 805306368, 0, 7672);
            String displayId2 = this.$seed2$inlined.getDisplayId();
            TextStyle textS2 = bentoTheme.getTypography(composer, i2).getTextS();
            long jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
            composer.startReplaceGroup(-1746271574);
            zChanged = composer.changed(horizontalAnchorCreateGuidelineFromTop) | composer.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer.changed(constraintLayoutBaseScope4Component4);
            objRememberedValue = composer.rememberedValue();
            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$2$1(horizontalAnchorCreateGuidelineFromTop, verticalAnchorM8137createEndBarrier3ABfNKs$default, constraintLayoutBaseScope4Component4);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(displayId2, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue), Color.m6701boximpl(jM21427getFg30d7_KjU2), null, null, null, null, 0, false, 1, 0, null, 0, textS2, composer, 805306368, 0, 7672);
            String name = this.$seed1$inlined.getName();
            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
            int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
            composer.startReplaceGroup(-1746271574);
            zChanged2 = composer.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer.changed(verticalAnchor2) | composer.changed(horizontalAnchorCreateGuidelineFromTop);
            objRememberedValue2 = composer.rememberedValue();
            if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$3$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, verticalAnchor2, horizontalAnchorCreateGuidelineFromTop);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(name, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue2), Color.m6701boximpl(jSeedTextColor), null, null, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, textM, composer, 817889280, 0, 7544);
            String name2 = this.$seed2$inlined.getName();
            TextStyle textM2 = bentoTheme.getTypography(composer, i2).getTextM();
            composer.startReplaceGroup(-1746271574);
            zChanged3 = composer.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer.changed(verticalAnchor2) | composer.changed(horizontalAnchorCreateGuidelineFromTop);
            objRememberedValue3 = composer.rememberedValue();
            if (!zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$4$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, verticalAnchor2, horizontalAnchorCreateGuidelineFromTop);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(name2, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue3), Color.m6701boximpl(jSeedTextColor2), null, null, null, null, 0, false, 1, 0, null, 0, textM2, composer, 805306368, 0, 7672);
            score = this.$seed1$inlined.getScore();
            if (score == null) {
                score = "";
            }
            TextStyle textM3 = bentoTheme.getTypography(composer, i2).getTextM();
            composer.startReplaceGroup(-1746271574);
            zChanged4 = composer.changed(z) | composer.changed(constraintLayoutBaseScope4Component3) | composer.changed(constraintLayoutBaseScope4Component9);
            objRememberedValue4 = composer.rememberedValue();
            if (!zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$5$1(z, constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component9);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(score, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue4), Color.m6701boximpl(jSeedTextColor), null, null, null, null, 0, false, 1, 0, null, 0, textM3, composer, 805306368, 0, 7672);
            score2 = this.$seed2$inlined.getScore();
            if (score2 == null) {
                score2 = "";
            }
            TextStyle textM4 = bentoTheme.getTypography(composer, i2).getTextM();
            composer.startReplaceGroup(-1746271574);
            zChanged5 = composer.changed(z) | composer.changed(constraintLayoutBaseScope4Component4) | composer.changed(constraintLayoutBaseScope4Component9);
            objRememberedValue5 = composer.rememberedValue();
            if (!zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$6$1(z, constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component9);
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(score2, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue5), Color.m6701boximpl(jSeedTextColor2), null, null, null, null, 0, false, 1, 0, null, 0, textM4, composer, 805306368, 0, 7672);
            long jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
            composer.startReplaceGroup(-1633490746);
            zChanged6 = composer.changed(z) | composer.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4);
            objRememberedValue6 = composer.rememberedValue();
            if (!zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$7$1(z, verticalAnchorM8141createGuidelineFromEnd0680j_4);
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            Divider5.m5852VerticalDivider9IZ8Weo(constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component9, (Function1) objRememberedValue6), 0.0f, jM21373getBg30d7_KjU, composer, 0, 2);
            String percentageDisplay = this.$seed1$inlined.getPercentageDisplay();
            TextStyle textM5 = bentoTheme.getTypography(composer, i2).getTextM();
            TextAlign.Companion companion2 = TextAlign.INSTANCE;
            int iM7920getEnde0LSkKk = companion2.m7920getEnde0LSkKk();
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            FontWeight bold = companion3.getBold();
            composer.startReplaceGroup(-1633490746);
            zChanged7 = composer.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4) | composer.changed(constraintLayoutBaseScope4Component3);
            objRememberedValue7 = composer.rememberedValue();
            if (!zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$8$1(verticalAnchorM8141createGuidelineFromEnd0680j_4, constraintLayoutBaseScope4Component3);
                composer.updateRememberedValue(objRememberedValue7);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(percentageDisplay, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue7), Color.m6701boximpl(jSeedTextColor), null, bold, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk), 0, false, 1, 0, null, 0, textM5, composer, 805330944, 0, 7592);
            String percentageDisplay2 = this.$seed2$inlined.getPercentageDisplay();
            TextStyle textM6 = bentoTheme.getTypography(composer, i2).getTextM();
            FontWeight bold2 = companion3.getBold();
            int iM7920getEnde0LSkKk2 = companion2.m7920getEnde0LSkKk();
            composer.startReplaceGroup(-1633490746);
            zChanged8 = composer.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4) | composer.changed(constraintLayoutBaseScope4Component4);
            objRememberedValue8 = composer.rememberedValue();
            if (!zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$9$1(verticalAnchorM8141createGuidelineFromEnd0680j_4, constraintLayoutBaseScope4Component4);
                composer.updateRememberedValue(objRememberedValue8);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(percentageDisplay2, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue8), Color.m6701boximpl(jSeedTextColor2), null, bold2, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk2), 0, false, 1, 0, null, 0, textM6, composer, 805330944, 0, 7592);
            composer.endReplaceGroup();
            zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
            constraintLayoutScope = this.$scope;
            snapshotState = this.$start;
            snapshotState2 = this.$end;
            channel = this.$channel;
            objRememberedValue9 = composer.rememberedValue();
            if (!zChangedInstance || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function0<Unit>() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$TwoRowsDisplay$$inlined$ConstraintLayout$1.1
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
                        ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope.getContainerObject().mo8187clone());
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
                return;
            }
            ComposerKt.traceEventEnd();
            return;
        }
        verticalAnchor = verticalAnchorM8138createStartBarrier3ABfNKs$default;
        objRememberedValue10 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$1$1(horizontalAnchorCreateGuidelineFromTop, constraintLayoutBaseScope4Component3, verticalAnchorM8137createEndBarrier3ABfNKs$default);
        composer.updateRememberedValue(objRememberedValue10);
        composer.endReplaceGroup();
        z = z2;
        verticalAnchor2 = verticalAnchor;
        BentoText2.m20747BentoText38GnDrw(displayId, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10), Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 1, 0, null, 0, textS, composer, 805306368, 0, 7672);
        String displayId22 = this.$seed2$inlined.getDisplayId();
        TextStyle textS22 = bentoTheme.getTypography(composer, i2).getTextS();
        long jM21427getFg30d7_KjU22 = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
        composer.startReplaceGroup(-1746271574);
        zChanged = composer.changed(horizontalAnchorCreateGuidelineFromTop) | composer.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer.changed(constraintLayoutBaseScope4Component4);
        objRememberedValue = composer.rememberedValue();
        if (!zChanged) {
            objRememberedValue = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$2$1(horizontalAnchorCreateGuidelineFromTop, verticalAnchorM8137createEndBarrier3ABfNKs$default, constraintLayoutBaseScope4Component4);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(displayId22, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue), Color.m6701boximpl(jM21427getFg30d7_KjU22), null, null, null, null, 0, false, 1, 0, null, 0, textS22, composer, 805306368, 0, 7672);
        String name3 = this.$seed1$inlined.getName();
        TextStyle textM7 = bentoTheme.getTypography(composer, i2).getTextM();
        int iM7959getEllipsisgIe3tQ82 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
        composer.startReplaceGroup(-1746271574);
        zChanged2 = composer.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer.changed(verticalAnchor2) | composer.changed(horizontalAnchorCreateGuidelineFromTop);
        objRememberedValue2 = composer.rememberedValue();
        if (!zChanged2) {
            objRememberedValue2 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$3$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, verticalAnchor2, horizontalAnchorCreateGuidelineFromTop);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(name3, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue2), Color.m6701boximpl(jSeedTextColor), null, null, null, null, iM7959getEllipsisgIe3tQ82, false, 1, 0, null, 0, textM7, composer, 817889280, 0, 7544);
        String name22 = this.$seed2$inlined.getName();
        TextStyle textM22 = bentoTheme.getTypography(composer, i2).getTextM();
        composer.startReplaceGroup(-1746271574);
        zChanged3 = composer.changed(verticalAnchorM8137createEndBarrier3ABfNKs$default) | composer.changed(verticalAnchor2) | composer.changed(horizontalAnchorCreateGuidelineFromTop);
        objRememberedValue3 = composer.rememberedValue();
        if (!zChanged3) {
            objRememberedValue3 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$4$1(verticalAnchorM8137createEndBarrier3ABfNKs$default, verticalAnchor2, horizontalAnchorCreateGuidelineFromTop);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(name22, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue3), Color.m6701boximpl(jSeedTextColor2), null, null, null, null, 0, false, 1, 0, null, 0, textM22, composer, 805306368, 0, 7672);
        score = this.$seed1$inlined.getScore();
        if (score == null) {
        }
        TextStyle textM32 = bentoTheme.getTypography(composer, i2).getTextM();
        composer.startReplaceGroup(-1746271574);
        zChanged4 = composer.changed(z) | composer.changed(constraintLayoutBaseScope4Component3) | composer.changed(constraintLayoutBaseScope4Component9);
        objRememberedValue4 = composer.rememberedValue();
        if (!zChanged4) {
            objRememberedValue4 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$5$1(z, constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component9);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(score, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue4), Color.m6701boximpl(jSeedTextColor), null, null, null, null, 0, false, 1, 0, null, 0, textM32, composer, 805306368, 0, 7672);
        score2 = this.$seed2$inlined.getScore();
        if (score2 == null) {
        }
        TextStyle textM42 = bentoTheme.getTypography(composer, i2).getTextM();
        composer.startReplaceGroup(-1746271574);
        zChanged5 = composer.changed(z) | composer.changed(constraintLayoutBaseScope4Component4) | composer.changed(constraintLayoutBaseScope4Component9);
        objRememberedValue5 = composer.rememberedValue();
        if (!zChanged5) {
            objRememberedValue5 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$6$1(z, constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component9);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(score2, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue5), Color.m6701boximpl(jSeedTextColor2), null, null, null, null, 0, false, 1, 0, null, 0, textM42, composer, 805306368, 0, 7672);
        long jM21373getBg30d7_KjU2 = bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        composer.startReplaceGroup(-1633490746);
        zChanged6 = composer.changed(z) | composer.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4);
        objRememberedValue6 = composer.rememberedValue();
        if (!zChanged6) {
            objRememberedValue6 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$7$1(z, verticalAnchorM8141createGuidelineFromEnd0680j_4);
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        Divider5.m5852VerticalDivider9IZ8Weo(constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component9, (Function1) objRememberedValue6), 0.0f, jM21373getBg30d7_KjU2, composer, 0, 2);
        String percentageDisplay3 = this.$seed1$inlined.getPercentageDisplay();
        TextStyle textM52 = bentoTheme.getTypography(composer, i2).getTextM();
        TextAlign.Companion companion22 = TextAlign.INSTANCE;
        int iM7920getEnde0LSkKk3 = companion22.m7920getEnde0LSkKk();
        FontWeight.Companion companion32 = FontWeight.INSTANCE;
        FontWeight bold3 = companion32.getBold();
        composer.startReplaceGroup(-1633490746);
        zChanged7 = composer.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4) | composer.changed(constraintLayoutBaseScope4Component3);
        objRememberedValue7 = composer.rememberedValue();
        if (!zChanged7) {
            objRememberedValue7 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$8$1(verticalAnchorM8141createGuidelineFromEnd0680j_4, constraintLayoutBaseScope4Component3);
            composer.updateRememberedValue(objRememberedValue7);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(percentageDisplay3, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue7), Color.m6701boximpl(jSeedTextColor), null, bold3, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk3), 0, false, 1, 0, null, 0, textM52, composer, 805330944, 0, 7592);
        String percentageDisplay22 = this.$seed2$inlined.getPercentageDisplay();
        TextStyle textM62 = bentoTheme.getTypography(composer, i2).getTextM();
        FontWeight bold22 = companion32.getBold();
        int iM7920getEnde0LSkKk22 = companion22.m7920getEnde0LSkKk();
        composer.startReplaceGroup(-1633490746);
        zChanged8 = composer.changed(verticalAnchorM8141createGuidelineFromEnd0680j_4) | composer.changed(constraintLayoutBaseScope4Component4);
        objRememberedValue8 = composer.rememberedValue();
        if (!zChanged8) {
            objRememberedValue8 = new BracketMatchOverviewCardKt$TwoRowsDisplay$1$9$1(verticalAnchorM8141createGuidelineFromEnd0680j_4, constraintLayoutBaseScope4Component4);
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(percentageDisplay22, constraintLayoutScope2.constrainAs(companion, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue8), Color.m6701boximpl(jSeedTextColor2), null, bold22, null, TextAlign.m7912boximpl(iM7920getEnde0LSkKk22), 0, false, 1, 0, null, 0, textM62, composer, 805330944, 0, 7592);
        composer.endReplaceGroup();
        zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        constraintLayoutScope = this.$scope;
        snapshotState = this.$start;
        snapshotState2 = this.$end;
        channel = this.$channel;
        objRememberedValue9 = composer.rememberedValue();
        if (!zChangedInstance) {
            objRememberedValue9 = new Function0<Unit>() { // from class: com.robinhood.android.futures.eventbrackets.ui.BracketMatchOverviewCardKt$TwoRowsDisplay$$inlined$ConstraintLayout$1.1
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
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope.getContainerObject().mo8187clone());
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
        }
    }
}
