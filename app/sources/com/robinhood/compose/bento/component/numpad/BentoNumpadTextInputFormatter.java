package com.robinhood.compose.bento.component.numpad;

import androidx.compose.p011ui.text.input.TextFieldValue;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: BentoNumpadTextInputFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;", "", "format", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "parse", "Ljava/math/BigDecimal;", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface BentoNumpadTextInputFormatter {
    TextFieldValue format(TextFieldValue value);

    BigDecimal parse(String value);
}
