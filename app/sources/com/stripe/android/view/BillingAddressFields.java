package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BillingAddressFields.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/view/BillingAddressFields;", "", "(Ljava/lang/String;I)V", "None", "PostalCode", "Full", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class BillingAddressFields {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BillingAddressFields[] $VALUES;
    public static final BillingAddressFields None = new BillingAddressFields("None", 0);
    public static final BillingAddressFields PostalCode = new BillingAddressFields("PostalCode", 1);
    public static final BillingAddressFields Full = new BillingAddressFields("Full", 2);

    private static final /* synthetic */ BillingAddressFields[] $values() {
        return new BillingAddressFields[]{None, PostalCode, Full};
    }

    public static EnumEntries<BillingAddressFields> getEntries() {
        return $ENTRIES;
    }

    public static BillingAddressFields valueOf(String str) {
        return (BillingAddressFields) Enum.valueOf(BillingAddressFields.class, str);
    }

    public static BillingAddressFields[] values() {
        return (BillingAddressFields[]) $VALUES.clone();
    }

    private BillingAddressFields(String str, int i) {
    }

    static {
        BillingAddressFields[] billingAddressFieldsArr$values = $values();
        $VALUES = billingAddressFieldsArr$values;
        $ENTRIES = EnumEntries2.enumEntries(billingAddressFieldsArr$values);
    }
}
