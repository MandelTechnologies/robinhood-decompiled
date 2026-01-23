package com.robinhood.android.earlypay.lib.confirmation.p111ui;

import com.robinhood.android.earlypay.lib.C14449R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EarlyPayConfirmationSecondaryCta.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/earlypay/lib/confirmation/ui/EarlyPayConfirmationSecondaryCta;", "", "text", "", "<init>", "(Ljava/lang/String;II)V", "getText", "()I", "SET_UP_DIRECT_DEPOSIT", "feature-lib-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class EarlyPayConfirmationSecondaryCta {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EarlyPayConfirmationSecondaryCta[] $VALUES;
    public static final EarlyPayConfirmationSecondaryCta SET_UP_DIRECT_DEPOSIT = new EarlyPayConfirmationSecondaryCta("SET_UP_DIRECT_DEPOSIT", 0, C14449R.string.early_pay_enroll_in_dd);
    private final int text;

    private static final /* synthetic */ EarlyPayConfirmationSecondaryCta[] $values() {
        return new EarlyPayConfirmationSecondaryCta[]{SET_UP_DIRECT_DEPOSIT};
    }

    public static EnumEntries<EarlyPayConfirmationSecondaryCta> getEntries() {
        return $ENTRIES;
    }

    private EarlyPayConfirmationSecondaryCta(String str, int i, int i2) {
        this.text = i2;
    }

    public final int getText() {
        return this.text;
    }

    static {
        EarlyPayConfirmationSecondaryCta[] earlyPayConfirmationSecondaryCtaArr$values = $values();
        $VALUES = earlyPayConfirmationSecondaryCtaArr$values;
        $ENTRIES = EnumEntries2.enumEntries(earlyPayConfirmationSecondaryCtaArr$values);
    }

    public static EarlyPayConfirmationSecondaryCta valueOf(String str) {
        return (EarlyPayConfirmationSecondaryCta) Enum.valueOf(EarlyPayConfirmationSecondaryCta.class, str);
    }

    public static EarlyPayConfirmationSecondaryCta[] values() {
        return (EarlyPayConfirmationSecondaryCta[]) $VALUES.clone();
    }
}
