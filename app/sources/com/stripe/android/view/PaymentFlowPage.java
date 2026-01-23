package com.stripe.android.view;

import com.stripe.android.R$string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentFlowPage.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/view/PaymentFlowPage;", "", "titleResId", "", "(Ljava/lang/String;II)V", "getTitleResId", "()I", "ShippingInfo", "ShippingMethod", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PaymentFlowPage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentFlowPage[] $VALUES;
    public static final PaymentFlowPage ShippingInfo = new PaymentFlowPage("ShippingInfo", 0, R$string.stripe_title_add_an_address);
    public static final PaymentFlowPage ShippingMethod = new PaymentFlowPage("ShippingMethod", 1, R$string.stripe_title_select_shipping_method);
    private final int titleResId;

    private static final /* synthetic */ PaymentFlowPage[] $values() {
        return new PaymentFlowPage[]{ShippingInfo, ShippingMethod};
    }

    public static EnumEntries<PaymentFlowPage> getEntries() {
        return $ENTRIES;
    }

    public static PaymentFlowPage valueOf(String str) {
        return (PaymentFlowPage) Enum.valueOf(PaymentFlowPage.class, str);
    }

    public static PaymentFlowPage[] values() {
        return (PaymentFlowPage[]) $VALUES.clone();
    }

    private PaymentFlowPage(String str, int i, int i2) {
        this.titleResId = i2;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    static {
        PaymentFlowPage[] paymentFlowPageArr$values = $values();
        $VALUES = paymentFlowPageArr$values;
        $ENTRIES = EnumEntries2.enumEntries(paymentFlowPageArr$values);
    }
}
