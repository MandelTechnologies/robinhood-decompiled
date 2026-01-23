package com.robinhood.android.futures.trade.p147ui.orderform;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.futures.trade.extensions.StringResources4;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
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
/* loaded from: classes10.dex */
public final class OrderFormRowsKt$BuyingPowerEffectRow$$inlined$ConstraintLayout$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $buyingPowerEffect$inlined;
    final /* synthetic */ Channel $channel;
    final /* synthetic */ StringResource $commissionAndFees$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ StringResource $marginRequired$inlined;
    final /* synthetic */ OrderForm6 $orderFormState$inlined;
    final /* synthetic */ StringResource $regulatoryAndExchangeFees$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ StringResource $totalCommission$inlined;
    final /* synthetic */ StringResource $totalGoldSavings$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderFormRowsKt$BuyingPowerEffectRow$$inlined$ConstraintLayout$1(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, OrderForm6 orderForm6, StringResource stringResource5, String str) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$commissionAndFees$inlined = stringResource;
        this.$marginRequired$inlined = stringResource2;
        this.$totalCommission$inlined = stringResource3;
        this.$regulatoryAndExchangeFees$inlined = stringResource4;
        this.$orderFormState$inlined = orderForm6;
        this.$totalGoldSavings$inlined = stringResource5;
        this.$buyingPowerEffect$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ConstraintLayoutScope constraintLayoutScope;
        Modifier.Companion companion;
        BentoTheme bentoTheme;
        int i2;
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
        ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        composer2.startReplaceGroup(1363647725);
        composer2.startReplaceGroup(1849434622);
        Object objRememberedValue = composer2.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), null, 2, null);
            composer2.updateRememberedValue(objRememberedValue);
        }
        SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer2.endReplaceGroup();
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        String strStringResource = StringResources_androidKt.stringResource(C17462R.string.futures_order_form_est_buying_power_effect_label, composer2, 0);
        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        TextStyle textM = bentoTheme2.getTypography(composer2, i3).getTextM();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        composer2.startReplaceGroup(5004770);
        boolean zChanged = composer2.changed(constraintLayoutBaseScope4Component2);
        Object objRememberedValue2 = composer2.rememberedValue();
        if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = new OrderFormRowsKt$BuyingPowerEffectRow$1$1$1(constraintLayoutBaseScope4Component2);
            composer2.updateRememberedValue(objRememberedValue2);
        }
        composer2.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(strStringResource, constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue2), null, null, null, null, null, 0, false, 0, 0, null, 0, textM, composer2, 0, 0, 8188);
        composer2.startReplaceGroup(1983666700);
        StringResource stringResource = this.$commissionAndFees$inlined;
        String text = stringResource == null ? null : StringResources4.getText(stringResource, composer2, StringResource.$stable);
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(1983669932);
        StringResource stringResource2 = this.$marginRequired$inlined;
        String text2 = stringResource2 == null ? null : StringResources4.getText(stringResource2, composer2, StringResource.$stable);
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(1983671788);
        StringResource stringResource3 = this.$totalCommission$inlined;
        String text3 = stringResource3 == null ? null : StringResources4.getText(stringResource3, composer2, StringResource.$stable);
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(1983674284);
        StringResource stringResource4 = this.$regulatoryAndExchangeFees$inlined;
        String text4 = stringResource4 == null ? null : StringResources4.getText(stringResource4, composer2, StringResource.$stable);
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(5004770);
        boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component1);
        Object objRememberedValue3 = composer2.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = new OrderFormRowsKt$BuyingPowerEffectRow$1$2$1(constraintLayoutBaseScope4Component1);
            composer2.updateRememberedValue(objRememberedValue3);
        }
        composer2.endReplaceGroup();
        OrderFormRowsKt.FeesSubRow(this.$orderFormState$inlined, text2, text3, text, text4, constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue3), composer2, 0, 0);
        composer2.startReplaceGroup(1983679976);
        StringResource stringResource5 = this.$totalGoldSavings$inlined;
        if (stringResource5 != null) {
            String text5 = StringResources4.getText(stringResource5, composer2, StringResource.$stable);
            TextStyle textStylePlus = bentoTheme2.getTypography(composer2, i3).getTextS().plus(new TextStyle(GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, OrderFormRowsKt.BuyingPowerEffectRow$lambda$38$lambda$30(snapshotState), null, composer2, 6, 2), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null));
            composer2.startReplaceGroup(5004770);
            boolean zChanged3 = composer2.changed(constraintLayoutBaseScope4Component2);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new OrderFormRowsKt$BuyingPowerEffectRow$1$3$1$1(constraintLayoutBaseScope4Component2);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceGroup();
            Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion3, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue4);
            composer2.startReplaceGroup(5004770);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = new OrderFormRowsKt$BuyingPowerEffectRow$1$3$2$1(snapshotState);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            composer2.endReplaceGroup();
            composer2 = composer;
            companion = companion3;
            bentoTheme = bentoTheme2;
            i2 = i3;
            constraintLayoutScope = constraintLayoutScope2;
            BentoText2.m20747BentoText38GnDrw(text5, OnGloballyPositionedModifier3.onGloballyPositioned(modifierConstrainAs, (Function1) objRememberedValue5), null, null, null, null, null, 0, false, 0, 0, null, 0, textStylePlus, composer2, 0, 0, 8188);
        } else {
            constraintLayoutScope = constraintLayoutScope2;
            companion = companion3;
            bentoTheme = bentoTheme2;
            i2 = i3;
        }
        composer2.endReplaceGroup();
        String str = this.$buyingPowerEffect$inlined;
        if (str == null) {
            str = "-------";
        }
        TextStyle textM2 = bentoTheme.getTypography(composer2, i2).getTextM();
        FontWeight bold = FontWeight.INSTANCE.getBold();
        composer2.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer2.rememberedValue();
        if (objRememberedValue6 == companion2.getEmpty()) {
            objRememberedValue6 = OrderFormRowsKt$BuyingPowerEffectRow$1$4$1.INSTANCE;
            composer2.updateRememberedValue(objRememberedValue6);
        }
        composer2.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(str, ModifiersKt.bentoPlaceholder$default(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue6), this.$buyingPowerEffect$inlined == null, null, 2, null), null, null, bold, null, null, 0, false, 0, 0, null, 0, textM2, composer2, 24576, 0, 8172);
        composer2.endReplaceGroup();
        boolean zChangedInstance = composer2.changedInstance(this.$scope) | composer2.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope3 = this.$scope;
        final SnapshotState snapshotState2 = this.$start;
        final SnapshotState snapshotState3 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue7 = composer2.rememberedValue();
        if (zChangedInstance || objRememberedValue7 == companion2.getEmpty()) {
            objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$BuyingPowerEffectRow$$inlined$ConstraintLayout$1.1
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
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope3.getContainerObject().mo8187clone());
                    if (snapshotState2.getValue() == null || snapshotState3.getValue() == null) {
                        snapshotState2.setValue(constraintSet3);
                        snapshotState3.setValue(snapshotState2.getValue());
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
