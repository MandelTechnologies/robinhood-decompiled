package com.robinhood.android.common.util;

import android.text.Editable;
import com.robinhood.android.designsystem.textinput.TextWatcherAdapter;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DecimalLimitTextWatcher.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/util/DecimalLimitTextWatcher;", "Lcom/robinhood/android/designsystem/textinput/TextWatcherAdapter;", "<init>", "()V", "numberFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getAllowedScale", "", "input", "Ljava/math/BigDecimal;", "afterTextChanged", "", "text", "Landroid/text/Editable;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class DecimalLimitTextWatcher implements TextWatcherAdapter {
    public static final int $stable = 8;
    private final NumberFormatter numberFormatter = Formats.getUserInputCurrencyFormat();

    public abstract int getAllowedScale(BigDecimal input);

    @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextWatcherAdapter.DefaultImpls.beforeTextChanged(this, charSequence, i, i2, i3);
    }

    @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextWatcherAdapter.DefaultImpls.onTextChanged(this, charSequence, i, i2, i3);
    }

    @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
    public void afterTextChanged(Editable text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() == 0) {
            return;
        }
        String string2 = text.toString();
        if (Intrinsics.areEqual(string2, ".")) {
            text.clear();
            text.append("0.");
            return;
        }
        if (Intrinsics.areEqual(string2, "-")) {
            text.clear();
            return;
        }
        Number number = this.numberFormatter.parse(string2);
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : null;
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        int iScale = bigDecimal.scale();
        Intrinsics.checkNotNull(bigDecimal);
        int allowedScale = iScale - getAllowedScale(bigDecimal);
        if (allowedScale > 0) {
            int length = text.length();
            text.delete(length - allowedScale, length);
        }
    }
}
