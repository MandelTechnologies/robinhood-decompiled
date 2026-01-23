package com.robinhood.shared.trading.tradecomponentscompose.input;

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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: TradeQuantityTextFormatter.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityTextFormatter;", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;", "scale", "", "maxValue", "Ljava/math/BigDecimal;", "forceNegative", "", "onMaxValueReached", "Lkotlin/Function0;", "", "<init>", "(ILjava/math/BigDecimal;ZLkotlin/jvm/functions/Function0;)V", "currentValue", "", "hasUserEditedValue", "lastExternalValue", "setCurrentValue", "value", "setHasUserEditedValue", "hasEdited", "format", "Landroidx/compose/ui/text/input/TextFieldValue;", "parse", "lib-trade-components-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class TradeQuantityTextFormatter implements BentoNumpadTextInputFormatter {
    public static final int $stable = 8;
    private String currentValue;
    private final boolean forceNegative;
    private boolean hasUserEditedValue;
    private String lastExternalValue;
    private final BigDecimal maxValue;
    private final Function0<Unit> onMaxValueReached;
    private final int scale;

    public TradeQuantityTextFormatter() {
        this(0, null, false, null, 15, null);
    }

    public TradeQuantityTextFormatter(int i, BigDecimal bigDecimal, boolean z, Function0<Unit> onMaxValueReached) {
        Intrinsics.checkNotNullParameter(onMaxValueReached, "onMaxValueReached");
        this.scale = i;
        this.maxValue = bigDecimal;
        this.forceNegative = z;
        this.onMaxValueReached = onMaxValueReached;
        this.currentValue = "";
        this.lastExternalValue = "";
    }

    public /* synthetic */ TradeQuantityTextFormatter(int i, BigDecimal bigDecimal, boolean z, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 7 : i, (i2 & 2) != 0 ? null : bigDecimal, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? new Function0() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityTextFormatter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function0);
    }

    public final void setCurrentValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value, this.lastExternalValue)) {
            this.lastExternalValue = value;
        }
        this.currentValue = value;
    }

    public final void setHasUserEditedValue(boolean hasEdited) {
        this.hasUserEditedValue = hasEdited;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        r15 = java.lang.Character.valueOf(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    @Override // com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextFieldValue format(TextFieldValue value) {
        String strTradeQuantityNumberFormatter$default;
        String str;
        boolean z;
        String string2;
        Intrinsics.checkNotNullParameter(value, "value");
        if (!this.hasUserEditedValue) {
            boolean z2 = value.getText().length() > this.currentValue.length();
            String text = value.getText();
            for (int i = 0; i < text.length(); i++) {
                char cCharAt = text.charAt(i);
                if (Character.isDigit(cCharAt) || cCharAt == '.') {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z2 && z) {
                String text2 = value.getText();
                int length = text2.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i2 = length - 1;
                        char cCharAt2 = text2.charAt(length);
                        if (Character.isDigit(cCharAt2) || cCharAt2 == '.') {
                            break;
                        }
                        if (i2 < 0) {
                            break;
                        }
                        length = i2;
                    }
                    Character chValueOf = null;
                    String str2 = (chValueOf != null || (string2 = chValueOf.toString()) == null) ? "" : string2;
                    value = new TextFieldValue(str2, TextRange2.TextRange(str2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null);
                } else {
                    Character chValueOf2 = null;
                    if (chValueOf2 != null) {
                        value = new TextFieldValue(str2, TextRange2.TextRange(str2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null);
                    }
                }
            }
        }
        BigDecimal bigDecimal = parse(value.getText());
        if (Intrinsics.areEqual(value.getText(), "0")) {
            str = "";
        } else {
            BigDecimal bigDecimal2 = this.maxValue;
            if (bigDecimal2 != null && bigDecimal.compareTo(bigDecimal2) > 0) {
                this.onMaxValueReached.invoke();
                strTradeQuantityNumberFormatter$default = this.currentValue;
            } else {
                strTradeQuantityNumberFormatter$default = TradeQuantityNumberFormatter.tradeQuantityNumberFormatter$default(value.getText(), this.scale, 0, 4, null);
                if (strTradeQuantityNumberFormatter$default == null) {
                    strTradeQuantityNumberFormatter$default = this.currentValue;
                }
            }
            str = strTradeQuantityNumberFormatter$default;
        }
        this.currentValue = value.getText().length() != 0 ? str : "";
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
