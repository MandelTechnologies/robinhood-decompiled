package com.stripe.android;

import kotlin.Metadata;

/* compiled from: CardUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/CardUtils;", "", "<init>", "()V", "", "cardNumber", "", "isValidLuhnNumber", "(Ljava/lang/String;)Z", "payments-model_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class CardUtils {
    public static final CardUtils INSTANCE = new CardUtils();

    private CardUtils() {
    }

    public final boolean isValidLuhnNumber(String cardNumber) {
        if (cardNumber == null) {
            return false;
        }
        int length = cardNumber.length() - 1;
        int i = 0;
        boolean z = true;
        while (-1 < length) {
            char cCharAt = cardNumber.charAt(length);
            if (!Character.isDigit(cCharAt)) {
                return false;
            }
            int numericValue = Character.getNumericValue(cCharAt);
            boolean z2 = !z;
            if (!z) {
                numericValue *= 2;
            }
            if (numericValue > 9) {
                numericValue -= 9;
            }
            i += numericValue;
            length--;
            z = z2;
        }
        return i % 10 == 0;
    }
}
