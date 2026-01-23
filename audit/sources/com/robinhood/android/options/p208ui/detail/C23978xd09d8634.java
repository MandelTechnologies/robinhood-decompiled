package com.robinhood.android.options.p208ui.detail;

import android.content.res.Resources;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.extensions.Instants2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.C22993R;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageBodyState2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
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
import p479j$.time.Instant;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsellKt$OptionsDetailPageLateCloseUpsell$1$1$invoke$$inlined$ConstraintLayout$1 */
/* loaded from: classes11.dex */
public final class C23978xd09d8634 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ Function1 $onLateCloseUpsellDismissed$inlined;
    final /* synthetic */ Function0 $onLateCloseUpsellTapped$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ OptionsDetailPageBodyState2.Upsell.LateClose $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23978xd09d8634(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, Function1 function1, OptionsDetailPageBodyState2.Upsell.LateClose lateClose, Function0 function0) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$onLateCloseUpsellDismissed$inlined = function1;
        this.$state$inlined = lateClose;
        this.$onLateCloseUpsellTapped$inlined = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
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
        composer.startReplaceGroup(-598829940);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 20;
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, C2002Dp.m7995constructorimpl(f), 1, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = OptionsDetailPageLateCloseUpsell2.INSTANCE;
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(modifierM5144paddingVpY3zN4$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue);
        Painter painterPainterResource = PainterResources_androidKt.painterResource(C22993R.drawable.late_close_card_hourglass_background, composer, 0);
        ContentScale fit = ContentScale.INSTANCE.getFit();
        Alignment.Companion companion3 = Alignment.INSTANCE;
        String strStringResource = null;
        ImageKt.Image(painterPainterResource, (String) null, modifierConstrainAs, companion3.getCenterEnd(), fit, 0.0f, (ColorFilter) null, composer, 27696, 96);
        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(constraintLayoutBaseScope4Component1) | composer.changed(constraintLayoutBaseScope4Component3);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new OptionsDetailPageLateCloseUpsell3(constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component3);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs2 = constraintLayoutScope.constrainAs(modifierFillMaxHeight$default, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierConstrainAs2, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null), C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        Instant lateCloseTime = this.$state$inlined.getLateCloseTime();
        if (lateCloseTime != null) {
            strStringResource = Instants2.toEasternTimeString(lateCloseTime);
        }
        composer.startReplaceGroup(1590086490);
        if (strStringResource == null) {
            strStringResource = StringResources_androidKt.stringResource(C22993R.string.options_late_close_info_default_late_close, composer, 0);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C22993R.string.options_late_close_announcement_card_text, new Object[]{this.$state$inlined.getChainSymbol(), strStringResource}, composer, 0), companion, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextL(), composer, 48, 0, 8184);
        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
        String strStringResource2 = StringResources_androidKt.stringResource(C22993R.string.options_late_close_announcement_card_action, composer, 0);
        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        composer.startReplaceGroup(5004770);
        boolean zChanged2 = composer.changed(this.$onLateCloseUpsellTapped$inlined);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = new OptionsDetailPageLateCloseUpsell4(this.$onLateCloseUpsellTapped$inlined);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue3, strStringResource2, modifierM5146paddingqDBjuR0$default2, null, null, false, Color.m6701boximpl(jM21425getFg0d7_KjU), composer, 0, 56);
        composer.endNode();
        Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), 0.0f, 9, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = OptionsDetailPageLateCloseUpsell5.INSTANCE;
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs3 = constraintLayoutScope.constrainAs(modifierM5146paddingqDBjuR0$default3, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue4);
        BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.CLOSE_12);
        String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
        long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged3 = composer.changed(this.$onLateCloseUpsellDismissed$inlined) | composer.changedInstance(this.$state$inlined);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue5 == companion2.getEmpty()) {
            objRememberedValue5 = new OptionsDetailPageLateCloseUpsell6(this.$onLateCloseUpsellDismissed$inlined, this.$state$inlined);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        BentoIcon2.m20644BentoIconFU0evQE(size12, strStringResource3, jM21425getFg0d7_KjU2, modifierConstrainAs3, (Function0) objRememberedValue5, false, composer, BentoIcon4.Size12.$stable, 32);
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue6 == companion2.getEmpty()) {
            objRememberedValue6 = new Function0<Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageLateCloseUpsellKt$OptionsDetailPageLateCloseUpsell$1$1$invoke$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(objRememberedValue6);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue6, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
