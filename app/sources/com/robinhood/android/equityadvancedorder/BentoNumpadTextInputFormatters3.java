package com.robinhood.android.equityadvancedorder;

import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.TextFieldValue;
import com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter;
import com.robinhood.utils.math.BigDecimals7;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: BentoNumpadTextInputFormatters.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/ShareQuantityBentoNumpadTextInputFormatter;", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;", "<init>", "()V", "notAllowedChars", "", "", "MAX_ALLOWED_LENGTH", "", "MAX_DECIMAL_PLACES", "format", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "parse", "Ljava/math/BigDecimal;", "", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityadvancedorder.ShareQuantityBentoNumpadTextInputFormatter, reason: use source file name */
/* loaded from: classes3.dex */
public final class BentoNumpadTextInputFormatters3 implements BentoNumpadTextInputFormatter {
    private static final int MAX_ALLOWED_LENGTH = 12;
    private static final int MAX_DECIMAL_PLACES = 6;
    public static final BentoNumpadTextInputFormatters3 INSTANCE = new BentoNumpadTextInputFormatters3();
    private static final List<Character> notAllowedChars = CollectionsKt.listOf((Object[]) new Character[]{',', ' '});
    public static final int $stable = 8;

    private BentoNumpadTextInputFormatters3() {
    }

    @Override // com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter
    public TextFieldValue format(TextFieldValue value) {
        Character chValueOf;
        String text;
        Intrinsics.checkNotNullParameter(value, "value");
        String text2 = value.getText();
        int i = 0;
        while (true) {
            if (i >= text2.length()) {
                chValueOf = null;
                break;
            }
            char cCharAt = text2.charAt(i);
            if (SetsKt.setOf((Object[]) new Character[]{'.', ','}).contains(Character.valueOf(cCharAt))) {
                chValueOf = Character.valueOf(cCharAt);
                break;
            }
            i++;
        }
        if (chValueOf == null) {
            return new TextFieldValue(StringsKt.take(value.getText(), 12), value.getSelection(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        }
        List listSplit$default = StringsKt.split$default((CharSequence) value.getText(), new char[]{chValueOf.charValue()}, false, 0, 6, (Object) null);
        if (listSplit$default.size() == 2) {
            text = listSplit$default.get(0) + chValueOf + StringsKt.take((String) listSplit$default.get(1), 6);
        } else {
            text = value.getText();
        }
        return new TextFieldValue(StringsKt.take(text, 12), value.getSelection(), (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter
    public BigDecimal parse(String value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char cCharAt = value.charAt(i);
            if (!notAllowedChars.contains(Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
            }
        }
        String string2 = sb.toString();
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return BigDecimals7.toBigDecimalOrDefault(string2, ZERO);
    }
}
