package com.robinhood.android.chart.blackwidowadvancedchart.formatters;

import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.TextFieldValue;
import com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BwBentoNumpadTextInputFormatter.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000eJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/formatters/BwBentoNumpadTextInputFormatter;", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;", "scale", "", "maxValue", "Ljava/math/BigDecimal;", "forceNegative", "", "onMaxValueReached", "Lkotlin/Function0;", "", "<init>", "(ILjava/math/BigDecimal;ZLkotlin/jvm/functions/Function0;)V", "currentValue", "", "setCurrentValue", "value", "format", "Landroidx/compose/ui/text/input/TextFieldValue;", "parse", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BwBentoNumpadTextInputFormatter implements BentoNumpadTextInputFormatter {
    public static final int $stable = 8;
    private String currentValue;
    private final boolean forceNegative;
    private final BigDecimal maxValue;
    private final Function0<Unit> onMaxValueReached;
    private final int scale;

    public BwBentoNumpadTextInputFormatter() {
        this(0, null, false, null, 15, null);
    }

    public BwBentoNumpadTextInputFormatter(int i, BigDecimal bigDecimal, boolean z, Function0<Unit> onMaxValueReached) {
        Intrinsics.checkNotNullParameter(onMaxValueReached, "onMaxValueReached");
        this.scale = i;
        this.maxValue = bigDecimal;
        this.forceNegative = z;
        this.onMaxValueReached = onMaxValueReached;
        this.currentValue = "";
    }

    public /* synthetic */ BwBentoNumpadTextInputFormatter(int i, BigDecimal bigDecimal, boolean z, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 7 : i, (i2 & 2) != 0 ? null : bigDecimal, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.formatters.BwBentoNumpadTextInputFormatter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function0);
    }

    public final void setCurrentValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.currentValue = value;
    }

    @Override // com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter
    public TextFieldValue format(TextFieldValue value) {
        String strBwNumberInputFormatter$default;
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.maxValue != null && parse(value.getText()).compareTo(this.maxValue) > 0 && parse(this.currentValue).compareTo(this.maxValue) > 0) {
            this.onMaxValueReached.invoke();
            strBwNumberInputFormatter$default = this.currentValue;
        } else {
            strBwNumberInputFormatter$default = BwNumberInputFormatter.bwNumberInputFormatter$default(value.getText(), this.scale, 0, 4, null);
            if (strBwNumberInputFormatter$default == null) {
                strBwNumberInputFormatter$default = this.currentValue;
            }
        }
        String str = strBwNumberInputFormatter$default;
        if (this.forceNegative && !StringsKt.contains$default((CharSequence) str, (CharSequence) "-", false, 2, (Object) null)) {
            return new TextFieldValue("-" + str, TextRange2.TextRange(1), (TextRange) null, 4, (DefaultConstructorMarker) null);
        }
        return new TextFieldValue(str, value.getSelection(), (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter
    public BigDecimal parse(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(value);
        if (bigDecimalOrNull != null) {
            return bigDecimalOrNull;
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }
}
