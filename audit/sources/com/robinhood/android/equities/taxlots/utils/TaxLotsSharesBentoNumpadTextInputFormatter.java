package com.robinhood.android.equities.taxlots.utils;

import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.TextFieldValue;
import com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: TaxLotsSharesBentoNumpadTextInputFormatter.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/utils/TaxLotsSharesBentoNumpadTextInputFormatter;", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;", "<init>", "()V", "MAX_DECIMAL_PLACES", "", "MAX_NUMBER_DIGITS", "format", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "parse", "Ljava/math/BigDecimal;", "", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TaxLotsSharesBentoNumpadTextInputFormatter implements BentoNumpadTextInputFormatter {
    public static final int $stable = 0;
    public static final TaxLotsSharesBentoNumpadTextInputFormatter INSTANCE = new TaxLotsSharesBentoNumpadTextInputFormatter();
    private static final int MAX_DECIMAL_PLACES = 6;
    private static final int MAX_NUMBER_DIGITS = 12;

    private TaxLotsSharesBentoNumpadTextInputFormatter() {
    }

    @Override // com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter
    public TextFieldValue format(TextFieldValue value) throws IOException {
        long selection;
        Intrinsics.checkNotNullParameter(value, "value");
        String strReplace = new Regex("\\.{2,}").replace(new Regex("^0+(?=\\d)").replace(value.getText(), ""), ".");
        StringBuilder sb = new StringBuilder();
        int length = strReplace.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strReplace.charAt(i);
            if (Character.isDigit(cCharAt) || cCharAt == '.') {
                sb.append(cCharAt);
            }
        }
        String string2 = sb.toString();
        List listSplit$default = StringsKt.split$default((CharSequence) string2, new char[]{'.'}, false, 0, 6, (Object) null);
        String str = listSplit$default.size() > 1 ? listSplit$default.get(0) + "." + StringsKt.take((String) listSplit$default.get(1), 6) : string2;
        if (StringsKt.startsWith$default(str, ".", false, 2, (Object) null)) {
            str = "0" + str;
        }
        String strTake = StringsKt.take(str, 12);
        if (StringsKt.startsWith$default(strTake, "0.", false, 2, (Object) null)) {
            selection = TextRange2.TextRange(strTake.length());
        } else {
            selection = value.getSelection();
        }
        return TextFieldValue.m7789copy3r_uNRQ$default(value, strTake, selection, (TextRange) null, 4, (Object) null);
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
