package com.stripe.android.model;

import com.robinhood.android.gold.contracts.GoldFeature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreateFinancialConnectionsSessionForDeferredPaymentParams.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/model/VerificationMethodParam;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Automatic", "Skip", "Microdeposits", "Instant", "InstantOrSkip", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.model.VerificationMethodParam, reason: use source file name */
/* loaded from: classes15.dex */
public final class CreateFinancialConnectionsSessionForDeferredPaymentParams2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CreateFinancialConnectionsSessionForDeferredPaymentParams2[] $VALUES;
    private final String value;
    public static final CreateFinancialConnectionsSessionForDeferredPaymentParams2 Automatic = new CreateFinancialConnectionsSessionForDeferredPaymentParams2("Automatic", 0, "automatic");
    public static final CreateFinancialConnectionsSessionForDeferredPaymentParams2 Skip = new CreateFinancialConnectionsSessionForDeferredPaymentParams2("Skip", 1, "skip");
    public static final CreateFinancialConnectionsSessionForDeferredPaymentParams2 Microdeposits = new CreateFinancialConnectionsSessionForDeferredPaymentParams2("Microdeposits", 2, "microdeposits");
    public static final CreateFinancialConnectionsSessionForDeferredPaymentParams2 Instant = new CreateFinancialConnectionsSessionForDeferredPaymentParams2("Instant", 3, GoldFeature.INSTANT);
    public static final CreateFinancialConnectionsSessionForDeferredPaymentParams2 InstantOrSkip = new CreateFinancialConnectionsSessionForDeferredPaymentParams2("InstantOrSkip", 4, "instant_or_skip");

    private static final /* synthetic */ CreateFinancialConnectionsSessionForDeferredPaymentParams2[] $values() {
        return new CreateFinancialConnectionsSessionForDeferredPaymentParams2[]{Automatic, Skip, Microdeposits, Instant, InstantOrSkip};
    }

    public static EnumEntries<CreateFinancialConnectionsSessionForDeferredPaymentParams2> getEntries() {
        return $ENTRIES;
    }

    public static CreateFinancialConnectionsSessionForDeferredPaymentParams2 valueOf(String str) {
        return (CreateFinancialConnectionsSessionForDeferredPaymentParams2) Enum.valueOf(CreateFinancialConnectionsSessionForDeferredPaymentParams2.class, str);
    }

    public static CreateFinancialConnectionsSessionForDeferredPaymentParams2[] values() {
        return (CreateFinancialConnectionsSessionForDeferredPaymentParams2[]) $VALUES.clone();
    }

    private CreateFinancialConnectionsSessionForDeferredPaymentParams2(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        CreateFinancialConnectionsSessionForDeferredPaymentParams2[] createFinancialConnectionsSessionForDeferredPaymentParams2Arr$values = $values();
        $VALUES = createFinancialConnectionsSessionForDeferredPaymentParams2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(createFinancialConnectionsSessionForDeferredPaymentParams2Arr$values);
    }
}
