package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRow3;
import com.robinhood.android.chart.blackwidowadvancedchart.formatters.BwBentoNumpadTextInputFormatter;
import com.robinhood.android.chart.blackwidowadvancedchart.formatters.BwNumberVisualTransformer;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadTextInput;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ParameterNumberRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRowKt$ParameterNumberRow$1$2, reason: use source file name */
/* loaded from: classes7.dex */
final class ParameterNumberRow3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<String> $localValue$delegate;
    final /* synthetic */ BigDecimal $max;
    final /* synthetic */ BigDecimal $min;
    final /* synthetic */ BwBentoNumpadTextInputFormatter $numberDisplayFormatter;
    final /* synthetic */ BentoNumpadScopeV2 $numpadScope;
    final /* synthetic */ Function1<Double, Unit> $onNumberChange;
    final /* synthetic */ int $scale;
    final /* synthetic */ Function1<SettingsKeyboardState, Unit> $showKeyboard;
    final /* synthetic */ double $value;
    final /* synthetic */ BwNumberVisualTransformer $visualFormatter;

    /* JADX WARN: Multi-variable type inference failed */
    ParameterNumberRow3(BigDecimal bigDecimal, BentoNumpadScopeV2 bentoNumpadScopeV2, SnapshotState<String> snapshotState, BwBentoNumpadTextInputFormatter bwBentoNumpadTextInputFormatter, double d, int i, BigDecimal bigDecimal2, Function1<? super Double, Unit> function1, Function1<? super SettingsKeyboardState, Unit> function12, BwNumberVisualTransformer bwNumberVisualTransformer) {
        this.$min = bigDecimal;
        this.$numpadScope = bentoNumpadScopeV2;
        this.$localValue$delegate = snapshotState;
        this.$numberDisplayFormatter = bwBentoNumpadTextInputFormatter;
        this.$value = d;
        this.$scale = i;
        this.$max = bigDecimal2;
        this.$onNumberChange = function1;
        this.$showKeyboard = function12;
        this.$visualFormatter = bwNumberVisualTransformer;
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
            ComposerKt.traceEventStart(1083135501, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRow.<anonymous>.<anonymous> (ParameterNumberRow.kt:77)");
        }
        String strParameterNumberRow$lambda$1 = ParameterNumberRow.ParameterNumberRow$lambda$1(this.$localValue$delegate);
        boolean zIsNegative = BigDecimals7.isNegative(this.$min);
        BentoNumpadScopeV2 bentoNumpadScopeV2 = this.$numpadScope;
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$localValue$delegate) | composer.changedInstance(this.$numberDisplayFormatter);
        final BwBentoNumpadTextInputFormatter bwBentoNumpadTextInputFormatter = this.$numberDisplayFormatter;
        final SnapshotState<String> snapshotState = this.$localValue$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRowKt$ParameterNumberRow$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ParameterNumberRow3.invoke$lambda$1$lambda$0(bwBentoNumpadTextInputFormatter, snapshotState, (BigDecimal) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoNumpadTextInput.BentoNumpadTextInput(bentoNumpadScopeV2, (Function1) objRememberedValue, null, strParameterNumberRow$lambda$1, zIsNegative, this.$numberDisplayFormatter, true, ComposableLambda3.rememberComposableLambda(-130294666, true, new C108562(this.$value, this.$scale, this.$max, this.$onNumberChange, this.$min, this.$localValue$delegate, this.$showKeyboard, this.$visualFormatter), composer, 54), composer, 14155776, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(BwBentoNumpadTextInputFormatter bwBentoNumpadTextInputFormatter, SnapshotState snapshotState, BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            snapshotState.setValue(bigDecimal.toPlainString());
        }
        String strParameterNumberRow$lambda$1 = ParameterNumberRow.ParameterNumberRow$lambda$1(snapshotState);
        Intrinsics.checkNotNullExpressionValue(strParameterNumberRow$lambda$1, "access$ParameterNumberRow$lambda$1(...)");
        bwBentoNumpadTextInputFormatter.setCurrentValue(strParameterNumberRow$lambda$1);
        return Unit.INSTANCE;
    }

    /* compiled from: ParameterNumberRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRowKt$ParameterNumberRow$1$2$2 */
    static final class C108562 implements Function5<TextFieldValue, InteractionSource3, Function1<? super TextFieldValue, ? extends Unit>, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<String> $localValue$delegate;
        final /* synthetic */ BigDecimal $max;
        final /* synthetic */ BigDecimal $min;
        final /* synthetic */ Function1<Double, Unit> $onNumberChange;
        final /* synthetic */ int $scale;
        final /* synthetic */ Function1<SettingsKeyboardState, Unit> $showKeyboard;
        final /* synthetic */ double $value;
        final /* synthetic */ BwNumberVisualTransformer $visualFormatter;

        /* JADX WARN: Multi-variable type inference failed */
        C108562(double d, int i, BigDecimal bigDecimal, Function1<? super Double, Unit> function1, BigDecimal bigDecimal2, SnapshotState<String> snapshotState, Function1<? super SettingsKeyboardState, Unit> function12, BwNumberVisualTransformer bwNumberVisualTransformer) {
            this.$value = d;
            this.$scale = i;
            this.$max = bigDecimal;
            this.$onNumberChange = function1;
            this.$min = bigDecimal2;
            this.$localValue$delegate = snapshotState;
            this.$showKeyboard = function12;
            this.$visualFormatter = bwNumberVisualTransformer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        private static final boolean invoke$lambda$5(SnapshotState4<Boolean> snapshotState4) {
            return snapshotState4.getValue().booleanValue();
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue, InteractionSource3 interactionSource3, Function1<? super TextFieldValue, ? extends Unit> function1, Composer composer, Integer num) {
            invoke(textFieldValue, interactionSource3, (Function1<? super TextFieldValue, Unit>) function1, composer, num.intValue());
            return Unit.INSTANCE;
        }

        private static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$4$lambda$3(TextFieldValue textFieldValue, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
            return (Intrinsics.areEqual(textFieldValue.getText(), "-") || Intrinsics.areEqual(textFieldValue.getText(), ".") || Intrinsics.areEqual(textFieldValue.getText(), "") || bigDecimal == null || Intrinsics.areEqual(bigDecimal, BigDecimal.ZERO) || RangesKt.rangeTo(bigDecimal2, bigDecimal3).contains(bigDecimal)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(BigDecimal bigDecimal, Function1 function1, double d, int i, BigDecimal bigDecimal2, Function1 function12, BigDecimal bigDecimal3, Function1 function13, long j, SnapshotState snapshotState, SnapshotState snapshotState2, FocusState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            invoke$lambda$2(snapshotState, it.isFocused());
            if (it.isFocused()) {
                boolean z = false;
                boolean z2 = i > 1;
                if (TextRange.m7641getEndimpl(j) == 0 && TextRange.m7646getStartimpl(j) == 0 && BigDecimals7.isNegative(bigDecimal3)) {
                    z = true;
                }
                function13.invoke(new Open(z2, z));
            } else if (bigDecimal == null) {
                String plainString = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(BigDecimals7.toBigDecimal(Double.valueOf(d)).setScale(i)).toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                function1.invoke(new TextFieldValue(plainString, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null));
            } else if (bigDecimal.compareTo(bigDecimal2) > 0) {
                BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal2.setScale(i));
                function12.invoke(Double.valueOf(bigDecimalM822m.doubleValue()));
                String plainString2 = bigDecimalM822m.toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString2, "toPlainString(...)");
                function1.invoke(new TextFieldValue(plainString2, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null));
            } else if (bigDecimal.compareTo(bigDecimal3) >= 0) {
                String strParameterNumberRow$lambda$1 = ParameterNumberRow.ParameterNumberRow$lambda$1(snapshotState2);
                Intrinsics.checkNotNullExpressionValue(strParameterNumberRow$lambda$1, "access$ParameterNumberRow$lambda$1(...)");
                function12.invoke(Double.valueOf(zzah$$ExternalSyntheticBackportWithForwarding0.m822m(new BigDecimal(strParameterNumberRow$lambda$1).setScale(i)).doubleValue()));
            } else {
                BigDecimal bigDecimalM822m2 = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal3.setScale(i));
                function12.invoke(Double.valueOf(bigDecimalM822m2.doubleValue()));
                String plainString3 = bigDecimalM822m2.toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString3, "toPlainString(...)");
                function1.invoke(new TextFieldValue(plainString3, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null));
            }
            return Unit.INSTANCE;
        }

        public final void invoke(final TextFieldValue textFieldValue, InteractionSource3 interactionSource, final Function1<? super TextFieldValue, Unit> onValueChange, Composer composer, int i) {
            int i2;
            Object obj;
            int i3;
            long jM21425getFg0d7_KjU;
            Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
            Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            if ((i & 6) == 0) {
                i2 = (composer.changed(textFieldValue) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(interactionSource) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changedInstance(onValueChange) ? 256 : 128;
            }
            int i4 = i2;
            if ((i4 & 1171) == 1170 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-130294666, i4, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRow.<anonymous>.<anonymous>.<anonymous> (ParameterNumberRow.kt:89)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            final long selection = textFieldValue.getSelection();
            final BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(textFieldValue.getText());
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(bigDecimalOrNull);
            final BigDecimal bigDecimal = this.$min;
            final BigDecimal bigDecimal2 = this.$max;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRowKt$ParameterNumberRow$1$2$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(ParameterNumberRow3.C108562.invoke$lambda$4$lambda$3(textFieldValue, bigDecimalOrNull, bigDecimal, bigDecimal2));
                    }
                });
                composer.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
            composer.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i5).m21593getSmallD9Ej5fM(), 0.0f, 11, null);
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(bigDecimalOrNull);
            int i6 = i4 & 896;
            boolean zChanged2 = zChangedInstance | (i6 == 256) | composer.changed(this.$value) | composer.changed(this.$scale) | composer.changedInstance(this.$max) | composer.changed(this.$onNumberChange) | composer.changedInstance(this.$min) | composer.changed(this.$localValue$delegate) | composer.changed(this.$showKeyboard) | composer.changed(selection);
            final double d = this.$value;
            final int i7 = this.$scale;
            final BigDecimal bigDecimal3 = this.$max;
            final Function1<Double, Unit> function1 = this.$onNumberChange;
            final BigDecimal bigDecimal4 = this.$min;
            final Function1<SettingsKeyboardState, Unit> function12 = this.$showKeyboard;
            final SnapshotState<String> snapshotState2 = this.$localValue$delegate;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                i3 = -1224400529;
                obj = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterNumberRowKt$ParameterNumberRow$1$2$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ParameterNumberRow3.C108562.invoke$lambda$7$lambda$6(bigDecimalOrNull, onValueChange, d, i7, bigDecimal3, function1, bigDecimal4, function12, selection, snapshotState, snapshotState2, (FocusState) obj2);
                    }
                };
                composer.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue3;
                i3 = -1224400529;
            }
            composer.endReplaceGroup();
            Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierM5146paddingqDBjuR0$default, (Function1) obj);
            TextStyle textM = bentoTheme.getTypography(composer, i5).getTextM();
            int iM7920getEnde0LSkKk = TextAlign.INSTANCE.m7920getEnde0LSkKk();
            FontWeight bold = FontWeight.INSTANCE.getBold();
            if (invoke$lambda$5(snapshotState4)) {
                composer.startReplaceGroup(1046174258);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i5).m21452getNegative0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1046269304);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i5).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            }
            BasicTextFieldKt.BasicTextField(textFieldValue, onValueChange, modifierOnFocusChanged, false, false, TextStyle.m7655copyp1EtxEg$default(textM, jM21425getFg0d7_KjU, 0L, bold, null, null, null, null, 0L, null, null, null, 0L, null, null, null, iM7920getEnde0LSkKk, 0, 0L, null, null, null, 0, 0, null, 16744442, null), new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7781getNumberPjHm6EE(), 0, null, null, null, 123, null), (KeyboardActions) null, false, 1, 0, (VisualTransformation) this.$visualFormatter, (Function1<? super TextLayoutResult, Unit>) null, interactionSource, (Brush) new SolidColor(bentoTheme.getColors(composer, i5).m21425getFg0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer, (i4 & 14) | 806879232 | ((i4 >> 3) & 112), (i4 << 6) & 7168, 38296);
            Boolean boolValueOf = Boolean.valueOf(invoke$lambda$1(snapshotState));
            composer.startReplaceGroup(i3);
            boolean zChanged3 = composer.changed(this.$showKeyboard) | composer.changed(this.$scale) | composer.changed(selection) | composer.changedInstance(this.$min);
            Function1<SettingsKeyboardState, Unit> function13 = this.$showKeyboard;
            int i8 = this.$scale;
            BigDecimal bigDecimal5 = this.$min;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                Object parameterNumberRow4 = new ParameterNumberRow4(function13, i8, selection, bigDecimal5, snapshotState, null);
                composer.updateRememberedValue(parameterNumberRow4);
                objRememberedValue4 = parameterNumberRow4;
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, textFieldValue, (Function2) objRememberedValue4, composer, (i4 << 3) & 112);
            Double dValueOf = Double.valueOf(this.$value);
            composer.startReplaceGroup(-1746271574);
            boolean zChanged4 = (i6 == 256) | composer.changed(this.$value) | composer.changed(this.$scale);
            double d2 = this.$value;
            int i9 = this.$scale;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                Object parameterNumberRow5 = new ParameterNumberRow5(onValueChange, d2, i9, null);
                composer.updateRememberedValue(parameterNumberRow5);
                objRememberedValue5 = parameterNumberRow5;
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(dValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
