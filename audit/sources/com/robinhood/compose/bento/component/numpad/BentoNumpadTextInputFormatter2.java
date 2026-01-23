package com.robinhood.compose.bento.component.numpad;

import androidx.compose.p011ui.text.input.TextFieldValue;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoNumpadTextInputFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/numpad/PassthroughBentoNumpadTextInputFormatter;", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;", "<init>", "()V", "format", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "parse", "Ljava/math/BigDecimal;", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.numpad.PassthroughBentoNumpadTextInputFormatter, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoNumpadTextInputFormatter2 implements BentoNumpadTextInputFormatter {
    public static final int $stable = 0;
    public static final BentoNumpadTextInputFormatter2 INSTANCE = new BentoNumpadTextInputFormatter2();

    @Override // com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter
    public TextFieldValue format(TextFieldValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    private BentoNumpadTextInputFormatter2() {
    }

    @Override // com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter
    public BigDecimal parse(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(value);
        if (bigDecimalOrNull != null) {
            return bigDecimalOrNull;
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }
}
