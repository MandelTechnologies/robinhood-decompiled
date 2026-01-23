package com.stripe.android.view;

import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: CardValidCallback.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\tJ\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/view/CardValidCallback;", "", "onInputChanged", "", "isValid", "", "invalidFields", "", "Lcom/stripe/android/view/CardValidCallback$Fields;", "Fields", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface CardValidCallback {
    void onInputChanged(boolean isValid, Set<? extends Fields> invalidFields);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CardValidCallback.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/view/CardValidCallback$Fields;", "", "(Ljava/lang/String;I)V", "Number", "Expiry", "Cvc", "Postal", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Fields {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Fields[] $VALUES;
        public static final Fields Number = new Fields("Number", 0);
        public static final Fields Expiry = new Fields("Expiry", 1);
        public static final Fields Cvc = new Fields("Cvc", 2);
        public static final Fields Postal = new Fields("Postal", 3);

        private static final /* synthetic */ Fields[] $values() {
            return new Fields[]{Number, Expiry, Cvc, Postal};
        }

        public static EnumEntries<Fields> getEntries() {
            return $ENTRIES;
        }

        public static Fields valueOf(String str) {
            return (Fields) Enum.valueOf(Fields.class, str);
        }

        public static Fields[] values() {
            return (Fields[]) $VALUES.clone();
        }

        private Fields(String str, int i) {
        }

        static {
            Fields[] fieldsArr$values = $values();
            $VALUES = fieldsArr$values;
            $ENTRIES = EnumEntries2.enumEntries(fieldsArr$values);
        }
    }
}
