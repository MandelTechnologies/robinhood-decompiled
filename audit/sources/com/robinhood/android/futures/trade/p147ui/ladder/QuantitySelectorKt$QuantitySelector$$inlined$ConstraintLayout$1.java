package com.robinhood.android.futures.trade.p147ui.ladder;

import android.content.res.Resources;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.RippleKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
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
import com.robinhood.android.futures.ladder.C17286R;
import com.robinhood.android.futures.trade.extensions.StringResources4;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LongPressFastTrackGestureDetector;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
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
/* loaded from: classes10.dex */
public final class QuantitySelectorKt$QuantitySelector$$inlined$ConstraintLayout$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ StringResource $buyingPowerDisplayText$inlined;
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ Function1 $onQuantityUpdated$inlined;
    final /* synthetic */ BigDecimal $quantity$inlined;
    final /* synthetic */ SnapshotState $rememberedQuantity$delegate$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuantitySelectorKt$QuantitySelector$$inlined$ConstraintLayout$1(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, Function1 function1, BigDecimal bigDecimal, StringResource stringResource, SnapshotState snapshotState4) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$onQuantityUpdated$inlined = function1;
        this.$quantity$inlined = bigDecimal;
        this.$buyingPowerDisplayText$inlined = stringResource;
        this.$rememberedQuantity$delegate$inlined = snapshotState4;
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
        composer.startReplaceGroup(646654151);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope3.Companion companion = ConstraintLayoutBaseScope3.INSTANCE;
        constraintLayoutScope.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component2}, companion.getPacked());
        constraintLayoutScope.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component2}, companion.getPacked());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = InteractionSource2.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue);
        }
        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
        composer.endReplaceGroup();
        BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.MINUS_12);
        String strStringResource = StringResources_androidKt.stringResource(C17286R.string.futures_quantity_minus_btn, composer, 0);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 11, null);
        IndicationNodeFactory indicationNodeFactoryM5624rippleH2RKhps$default = RippleKt.m5624rippleH2RKhps$default(false, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0L, 4, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$onQuantityUpdated$inlined);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new QuantitySelector3(this.$onQuantityUpdated$inlined, this.$rememberedQuantity$delegate$inlined);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierLongPressWithFastTrack$default = LongPressFastTrackGestureDetector.longPressWithFastTrack$default(modifierM5146paddingqDBjuR0$default, interactionSource3, indicationNodeFactoryM5624rippleH2RKhps$default, 0L, (Function0) objRememberedValue2, 4, (Object) null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = QuantitySelector4.INSTANCE;
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(modifierLongPressWithFastTrack$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue3);
        int i3 = BentoIcon4.Size16.$stable;
        BentoIcon2.m20644BentoIconFU0evQE(size16, strStringResource, jM21425getFg0d7_KjU, modifierConstrainAs, null, false, composer, i3, 48);
        int iIntValue = this.$quantity$inlined.intValue();
        String strPluralStringResource = StringResources_androidKt.pluralStringResource(C17286R.plurals.futures_quantity_display, iIntValue, new Object[]{Integer.valueOf(iIntValue)}, composer, 0);
        TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
        long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        composer.startReplaceGroup(5004770);
        boolean zChanged2 = composer.changed(constraintLayoutBaseScope4Component4);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = new QuantitySelector5(constraintLayoutBaseScope4Component4);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(strPluralStringResource, constraintLayoutScope.constrainAs(companion3, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue4), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textM, composer, 0, 0, 8184);
        composer.startReplaceGroup(852193686);
        StringResource stringResource = this.$buyingPowerDisplayText$inlined;
        String text = stringResource == null ? null : StringResources4.getText(stringResource, composer, StringResource.$stable);
        composer.endReplaceGroup();
        if (text == null) {
            text = "";
        }
        TextStyle textM2 = bentoTheme.getTypography(composer, i2).getTextM();
        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
        composer.startReplaceGroup(5004770);
        boolean zChanged3 = composer.changed(constraintLayoutBaseScope4Component3);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue5 == companion2.getEmpty()) {
            objRememberedValue5 = new QuantitySelector6(constraintLayoutBaseScope4Component3);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(text, constraintLayoutScope.constrainAs(companion3, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue5), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM2, composer, 0, 0, 8184);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion2.getEmpty()) {
            objRememberedValue6 = InteractionSource2.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue6);
        }
        InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue6;
        composer.endReplaceGroup();
        BentoIcon4.Size16 size162 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.PLUS_12);
        String strStringResource2 = StringResources_androidKt.stringResource(C17286R.string.futures_quantity_plus_btn, composer, 0);
        long jM21425getFg0d7_KjU3 = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
        IndicationNodeFactory indicationNodeFactoryM5624rippleH2RKhps$default2 = RippleKt.m5624rippleH2RKhps$default(false, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0L, 4, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged4 = composer.changed(this.$onQuantityUpdated$inlined);
        Object objRememberedValue7 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue7 == companion2.getEmpty()) {
            objRememberedValue7 = new QuantitySelector7(this.$onQuantityUpdated$inlined, this.$rememberedQuantity$delegate$inlined);
            composer.updateRememberedValue(objRememberedValue7);
        }
        composer.endReplaceGroup();
        Modifier modifierLongPressWithFastTrack$default2 = LongPressFastTrackGestureDetector.longPressWithFastTrack$default(modifierM5146paddingqDBjuR0$default2, interactionSource32, indicationNodeFactoryM5624rippleH2RKhps$default2, 0L, (Function0) objRememberedValue7, 4, (Object) null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion2.getEmpty()) {
            objRememberedValue8 = QuantitySelector8.INSTANCE;
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        BentoIcon2.m20644BentoIconFU0evQE(size162, strStringResource2, jM21425getFg0d7_KjU3, constraintLayoutScope.constrainAs(modifierLongPressWithFastTrack$default2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue8), null, false, composer, i3, 48);
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue9 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue9 == companion2.getEmpty()) {
            objRememberedValue9 = new Function0<Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.QuantitySelectorKt$QuantitySelector$$inlined$ConstraintLayout$1.1
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
