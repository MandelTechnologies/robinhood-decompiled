package com.robinhood.android.internalassettransfers.validation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountFeatureParityWarning.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/validation/AccountFeatureParityWarning;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE_HAS_MARGIN_SINK_DOES_NOT", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class AccountFeatureParityWarning {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountFeatureParityWarning[] $VALUES;
    public static final AccountFeatureParityWarning SOURCE_HAS_MARGIN_SINK_DOES_NOT = new AccountFeatureParityWarning("SOURCE_HAS_MARGIN_SINK_DOES_NOT", 0);

    private static final /* synthetic */ AccountFeatureParityWarning[] $values() {
        return new AccountFeatureParityWarning[]{SOURCE_HAS_MARGIN_SINK_DOES_NOT};
    }

    public static EnumEntries<AccountFeatureParityWarning> getEntries() {
        return $ENTRIES;
    }

    private AccountFeatureParityWarning(String str, int i) {
    }

    static {
        AccountFeatureParityWarning[] accountFeatureParityWarningArr$values = $values();
        $VALUES = accountFeatureParityWarningArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountFeatureParityWarningArr$values);
    }

    public static AccountFeatureParityWarning valueOf(String str) {
        return (AccountFeatureParityWarning) Enum.valueOf(AccountFeatureParityWarning.class, str);
    }

    public static AccountFeatureParityWarning[] values() {
        return (AccountFeatureParityWarning[]) $VALUES.clone();
    }
}
