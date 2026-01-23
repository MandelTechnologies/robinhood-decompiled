package com.robinhood.android.futures.trade.p147ui.orderform;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDataState;
import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormViewState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class OrderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ FocusRequester $focusRequester$inlined;
    final /* synthetic */ FuturesOrderFormDataState.FocusedText $focusedText$inlined;
    final /* synthetic */ Function1 $onDisabledClicked$inlined;
    final /* synthetic */ Function1 $onFocusChanged$inlined;
    final /* synthetic */ FuturesOrderFormViewState.OrderFormContentData $orderFormContentData$inlined;
    final /* synthetic */ FuturesOrderFormViewState.TextDisplay $priceText$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, FuturesOrderFormViewState.OrderFormContentData orderFormContentData, FuturesOrderFormViewState.TextDisplay textDisplay, FuturesOrderFormDataState.FocusedText focusedText, FocusRequester focusRequester, Function1 function1, Function1 function12) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$orderFormContentData$inlined = orderFormContentData;
        this.$priceText$inlined = textDisplay;
        this.$focusedText$inlined = focusedText;
        this.$focusRequester$inlined = focusRequester;
        this.$onFocusChanged$inlined = function1;
        this.$onDisabledClicked$inlined = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        OrderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1 orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1;
        ConstraintLayoutScope constraintLayoutScope;
        BentoTheme bentoTheme;
        int i2;
        Modifier.Companion companion;
        long jM21425getFg0d7_KjU;
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
        composer.startReplaceGroup(428434804);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
        boolean z = (this.$orderFormContentData$inlined.getBidDisplay() == null || this.$orderFormContentData$inlined.getAskDisplay() == null) ? false : true;
        String strStringResource = StringResources_androidKt.stringResource(this.$orderFormContentData$inlined.getPriceLabelRes(), composer, 0);
        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        TextStyle textM = bentoTheme2.getTypography(composer, i3).getTextM();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(z) | composer.changed(constraintLayoutBaseScope4Component2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OrderFormRowsKt$PriceRow$1$1$1(z, constraintLayoutBaseScope4Component2);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        boolean z2 = z;
        BentoText2.m20747BentoText38GnDrw(strStringResource, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue), null, null, null, null, null, 0, false, 0, 0, null, 0, textM, composer, 0, 0, 8188);
        composer.startReplaceGroup(1676403147);
        if (z2) {
            String strStringResource2 = StringResources_androidKt.stringResource(C17462R.string.futures_order_form_bid_label, composer, 0);
            TextStyle textM2 = bentoTheme2.getTypography(composer, i3).getTextM();
            long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer, i3).m21426getFg20d7_KjU();
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(constraintLayoutBaseScope4Component1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new OrderFormRowsKt$PriceRow$1$2$1(constraintLayoutBaseScope4Component1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(strStringResource2, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM2, composer, 0, 0, 8184);
            String bidDisplay = this.$orderFormContentData$inlined.getBidDisplay();
            TextStyle textM3 = bentoTheme2.getTypography(composer, i3).getTextM();
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer, i3).m21425getFg0d7_KjU();
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composer, i3).m21595getXsmallD9Ej5fM(), 0.0f, 2, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged3 = composer.changed(constraintLayoutBaseScope4Component2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new OrderFormRowsKt$PriceRow$1$3$1(constraintLayoutBaseScope4Component2);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(bidDisplay, constraintLayoutScope2.constrainAs(modifierM5144paddingVpY3zN4$default, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue3), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textM3, composer, 0, 0, 8184);
            String strStringResource3 = StringResources_androidKt.stringResource(C17462R.string.futures_order_form_ask_label, composer, 0);
            TextStyle textM4 = bentoTheme2.getTypography(composer, i3).getTextM();
            long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composer, i3).m21426getFg20d7_KjU();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged4 = composer.changed(constraintLayoutBaseScope4Component2) | composer.changed(constraintLayoutBaseScope4Component3);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new OrderFormRowsKt$PriceRow$1$4$1(constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component3);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(strStringResource3, constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue4), Color.m6701boximpl(jM21426getFg20d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textM4, composer, 0, 0, 8184);
            String askDisplay = this.$orderFormContentData$inlined.getAskDisplay();
            TextStyle textM5 = bentoTheme2.getTypography(composer, i3).getTextM();
            long jM21425getFg0d7_KjU3 = bentoTheme2.getColors(composer, i3).m21425getFg0d7_KjU();
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme2.getSpacing(composer, i3).m21595getXsmallD9Ej5fM(), 0.0f, 2, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged5 = composer.changed(constraintLayoutBaseScope4Component2) | composer.changed(constraintLayoutBaseScope4Component4);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new OrderFormRowsKt$PriceRow$1$5$1(constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component4);
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            bentoTheme = bentoTheme2;
            companion = companion2;
            constraintLayoutScope = constraintLayoutScope2;
            i2 = i3;
            orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1 = this;
            BentoText2.m20747BentoText38GnDrw(askDisplay, constraintLayoutScope2.constrainAs(modifierM5144paddingVpY3zN4$default2, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue5), Color.m6701boximpl(jM21425getFg0d7_KjU3), null, null, null, null, 0, false, 0, 0, null, 0, textM5, composer, 0, 0, 8184);
        } else {
            orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1 = this;
            constraintLayoutScope = constraintLayoutScope2;
            bentoTheme = bentoTheme2;
            i2 = i3;
            companion = companion2;
        }
        composer.endReplaceGroup();
        TextFieldValue text = orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$priceText$inlined.getText();
        BentoTheme bentoTheme3 = bentoTheme;
        int i4 = i2;
        SolidColor solidColor = new SolidColor(bentoTheme3.getColors(composer, i4).m21425getFg0d7_KjU(), null);
        boolean z3 = orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$focusedText$inlined != null && orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$orderFormContentData$inlined.isEnabled();
        TextStyle textM6 = bentoTheme3.getTypography(composer, i4).getTextM();
        if (orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$priceText$inlined.getUseSecondaryColor()) {
            composer.startReplaceGroup(430939944);
            jM21425getFg0d7_KjU = bentoTheme3.getColors(composer, i4).m21427getFg30d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(431006377);
            jM21425getFg0d7_KjU = bentoTheme3.getColors(composer, i4).m21425getFg0d7_KjU();
            composer.endReplaceGroup();
        }
        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textM6, jM21425getFg0d7_KjU, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7920getEnde0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null);
        composer.startReplaceGroup(1676498595);
        composer.startReplaceGroup(1676483462);
        Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(companion, bentoTheme3.getSpacing(composer, i4).m21591getLargeD9Ej5fM(), 0.0f, 2, null);
        FocusRequester focusRequester = orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$focusRequester$inlined;
        if (focusRequester != null) {
            if (focusRequester == null) {
                throw new IllegalStateException("Required value was null.");
            }
            modifierM5155defaultMinSizeVpY3zN4$default = FocusRequesterModifier3.focusRequester(modifierM5155defaultMinSizeVpY3zN4$default, focusRequester);
        }
        if (orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$focusedText$inlined != null) {
            composer.startReplaceGroup(-1633490746);
            FuturesOrderFormDataState.FocusedText focusedText = orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$focusedText$inlined;
            boolean zChanged6 = composer.changed(focusedText == null ? -1 : focusedText.ordinal()) | composer.changed(orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$onFocusChanged$inlined);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new OrderFormRowsKt$PriceRow$1$7$1$1(orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$focusedText$inlined, orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$onFocusChanged$inlined);
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            modifierM5155defaultMinSizeVpY3zN4$default = FocusChangedModifier2.onFocusChanged(modifierM5155defaultMinSizeVpY3zN4$default, (Function1) objRememberedValue6);
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue7 = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue7 == companion3.getEmpty()) {
            objRememberedValue7 = OrderFormRowsKt$PriceRow$1$8$1.INSTANCE;
            composer.updateRememberedValue(objRememberedValue7);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(modifierM5155defaultMinSizeVpY3zN4$default, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue7);
        if ((orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$focusedText$inlined == null || orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$orderFormContentData$inlined.isEnabled()) ? false : true) {
            composer.startReplaceGroup(5004770);
            boolean zChanged7 = composer.changed(orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$onDisabledClicked$inlined);
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChanged7 || objRememberedValue8 == companion3.getEmpty()) {
                objRememberedValue8 = new OrderFormRowsKt$PriceRow$1$9$1$1(orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$onDisabledClicked$inlined);
                composer.updateRememberedValue(objRememberedValue8);
            }
            composer.endReplaceGroup();
            modifierConstrainAs = ClickableKt.m4893clickableXHw0xAI$default(modifierConstrainAs, false, null, null, (Function0) objRememberedValue8, 7, null);
        }
        Modifier modifier = modifierConstrainAs;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == companion3.getEmpty()) {
            objRememberedValue9 = OrderFormRowsKt$PriceRow$1$10$1.INSTANCE;
            composer.updateRememberedValue(objRememberedValue9);
        }
        composer.endReplaceGroup();
        BasicTextFieldKt.BasicTextField(text, (Function1<? super TextFieldValue, Unit>) objRememberedValue9, modifier, z3, false, textStyleM7655copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer, 100663344, 0, 48848);
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$scope) | composer.changedInstance(orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$channel);
        final ConstraintLayoutScope constraintLayoutScope3 = orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$scope;
        final SnapshotState snapshotState = orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$start;
        final SnapshotState snapshotState2 = orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$end;
        final Channel channel = orderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.$channel;
        Object objRememberedValue10 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue10 == companion3.getEmpty()) {
            objRememberedValue10 = new Function0<Unit>() { // from class: com.robinhood.android.futures.trade.ui.orderform.OrderFormRowsKt$PriceRow$$inlined$ConstraintLayout$1.1
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
                    if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                        snapshotState.setValue(constraintSet3);
                        snapshotState2.setValue(snapshotState.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue10);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue10, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
