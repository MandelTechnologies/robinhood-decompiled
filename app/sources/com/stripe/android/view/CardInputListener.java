package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: CardInputListener.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\nJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/view/CardInputListener;", "", "onCardComplete", "", "onCvcComplete", "onExpirationComplete", "onFocusChange", "focusField", "Lcom/stripe/android/view/CardInputListener$FocusField;", "onPostalCodeComplete", "FocusField", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface CardInputListener {
    void onCardComplete();

    void onCvcComplete();

    void onExpirationComplete();

    void onFocusChange(FocusField focusField);

    void onPostalCodeComplete();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CardInputListener.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/view/CardInputListener$FocusField;", "", "(Ljava/lang/String;I)V", "CardNumber", "ExpiryDate", "Cvc", "PostalCode", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class FocusField {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FocusField[] $VALUES;
        public static final FocusField CardNumber = new FocusField("CardNumber", 0);
        public static final FocusField ExpiryDate = new FocusField("ExpiryDate", 1);
        public static final FocusField Cvc = new FocusField("Cvc", 2);
        public static final FocusField PostalCode = new FocusField("PostalCode", 3);

        private static final /* synthetic */ FocusField[] $values() {
            return new FocusField[]{CardNumber, ExpiryDate, Cvc, PostalCode};
        }

        public static EnumEntries<FocusField> getEntries() {
            return $ENTRIES;
        }

        public static FocusField valueOf(String str) {
            return (FocusField) Enum.valueOf(FocusField.class, str);
        }

        public static FocusField[] values() {
            return (FocusField[]) $VALUES.clone();
        }

        private FocusField(String str, int i) {
        }

        static {
            FocusField[] focusFieldArr$values = $values();
            $VALUES = focusFieldArr$values;
            $ENTRIES = EnumEntries2.enumEntries(focusFieldArr$values);
        }
    }
}
