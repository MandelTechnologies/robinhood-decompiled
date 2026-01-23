package com.robinhood.shared.user.contracts.verification;

import com.robinhood.models.api.ApiCryptoActivation;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EmailVerificationSettingIntentKey.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/verification/EmailVerificationSource;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "REACTIVATION", "UNKNOWN", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.user.contracts.verification.EmailVerificationSource, reason: use source file name */
/* loaded from: classes12.dex */
public final class EmailVerificationSettingIntentKey2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EmailVerificationSettingIntentKey2[] $VALUES;
    public static final EmailVerificationSettingIntentKey2 REACTIVATION = new EmailVerificationSettingIntentKey2("REACTIVATION", 0, ApiCryptoActivation.TYPE_REACTIVATION);
    public static final EmailVerificationSettingIntentKey2 UNKNOWN = new EmailVerificationSettingIntentKey2("UNKNOWN", 1, "unknown");
    private final String serverValue;

    private static final /* synthetic */ EmailVerificationSettingIntentKey2[] $values() {
        return new EmailVerificationSettingIntentKey2[]{REACTIVATION, UNKNOWN};
    }

    public static EnumEntries<EmailVerificationSettingIntentKey2> getEntries() {
        return $ENTRIES;
    }

    private EmailVerificationSettingIntentKey2(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        EmailVerificationSettingIntentKey2[] emailVerificationSettingIntentKey2Arr$values = $values();
        $VALUES = emailVerificationSettingIntentKey2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(emailVerificationSettingIntentKey2Arr$values);
    }

    public static EmailVerificationSettingIntentKey2 valueOf(String str) {
        return (EmailVerificationSettingIntentKey2) Enum.valueOf(EmailVerificationSettingIntentKey2.class, str);
    }

    public static EmailVerificationSettingIntentKey2[] values() {
        return (EmailVerificationSettingIntentKey2[]) $VALUES.clone();
    }
}
