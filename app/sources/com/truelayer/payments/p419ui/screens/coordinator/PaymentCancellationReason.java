package com.truelayer.payments.p419ui.screens.coordinator;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentCancellationReason.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/coordinator/PaymentCancellationReason;", "", "(Ljava/lang/String;I)V", "NormalCancellation", "ProviderTemporarilyUnavailable", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class PaymentCancellationReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentCancellationReason[] $VALUES;
    public static final PaymentCancellationReason NormalCancellation = new PaymentCancellationReason("NormalCancellation", 0);
    public static final PaymentCancellationReason ProviderTemporarilyUnavailable = new PaymentCancellationReason("ProviderTemporarilyUnavailable", 1);

    private static final /* synthetic */ PaymentCancellationReason[] $values() {
        return new PaymentCancellationReason[]{NormalCancellation, ProviderTemporarilyUnavailable};
    }

    public static EnumEntries<PaymentCancellationReason> getEntries() {
        return $ENTRIES;
    }

    public static PaymentCancellationReason valueOf(String str) {
        return (PaymentCancellationReason) Enum.valueOf(PaymentCancellationReason.class, str);
    }

    public static PaymentCancellationReason[] values() {
        return (PaymentCancellationReason[]) $VALUES.clone();
    }

    private PaymentCancellationReason(String str, int i) {
    }

    static {
        PaymentCancellationReason[] paymentCancellationReasonArr$values = $values();
        $VALUES = paymentCancellationReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(paymentCancellationReasonArr$values);
    }
}
