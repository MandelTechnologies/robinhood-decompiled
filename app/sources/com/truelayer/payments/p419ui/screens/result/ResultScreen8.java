package com.truelayer.payments.p419ui.screens.result;

import com.truelayer.payments.p419ui.models.PaymentContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ResultScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;", "", "(Ljava/lang/String;I)V", "intoPaymentType", "Lcom/truelayer/payments/ui/models/PaymentContext$PaymentType;", "Payment", "Mandate", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.result.ResultPaymentType, reason: use source file name */
/* loaded from: classes12.dex */
public final class ResultScreen8 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResultScreen8[] $VALUES;
    public static final ResultScreen8 Payment = new ResultScreen8("Payment", 0);
    public static final ResultScreen8 Mandate = new ResultScreen8("Mandate", 1);

    /* compiled from: ResultScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.ui.screens.result.ResultPaymentType$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResultScreen8.values().length];
            try {
                iArr[ResultScreen8.Payment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResultScreen8.Mandate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ ResultScreen8[] $values() {
        return new ResultScreen8[]{Payment, Mandate};
    }

    public static EnumEntries<ResultScreen8> getEntries() {
        return $ENTRIES;
    }

    public static ResultScreen8 valueOf(String str) {
        return (ResultScreen8) Enum.valueOf(ResultScreen8.class, str);
    }

    public static ResultScreen8[] values() {
        return (ResultScreen8[]) $VALUES.clone();
    }

    private ResultScreen8(String str, int i) {
    }

    static {
        ResultScreen8[] resultScreen8Arr$values = $values();
        $VALUES = resultScreen8Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(resultScreen8Arr$values);
    }

    public final PaymentContext.PaymentType intoPaymentType() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return PaymentContext.PaymentType.SinglePayment;
        }
        if (i == 2) {
            return PaymentContext.PaymentType.Mandate;
        }
        throw new NoWhenBranchMatchedException();
    }
}
