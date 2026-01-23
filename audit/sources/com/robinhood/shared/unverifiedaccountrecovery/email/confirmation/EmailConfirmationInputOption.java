package com.robinhood.shared.unverifiedaccountrecovery.email.confirmation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EmailConfirmationInputOption.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationInputOption;", "", "<init>", "(Ljava/lang/String;I)V", "LOGIN", "SHOW_FULL_EMAIL", "UPDATE_EMAIL", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EmailConfirmationInputOption {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EmailConfirmationInputOption[] $VALUES;
    public static final EmailConfirmationInputOption LOGIN = new EmailConfirmationInputOption("LOGIN", 0);
    public static final EmailConfirmationInputOption SHOW_FULL_EMAIL = new EmailConfirmationInputOption("SHOW_FULL_EMAIL", 1);
    public static final EmailConfirmationInputOption UPDATE_EMAIL = new EmailConfirmationInputOption("UPDATE_EMAIL", 2);

    private static final /* synthetic */ EmailConfirmationInputOption[] $values() {
        return new EmailConfirmationInputOption[]{LOGIN, SHOW_FULL_EMAIL, UPDATE_EMAIL};
    }

    public static EnumEntries<EmailConfirmationInputOption> getEntries() {
        return $ENTRIES;
    }

    private EmailConfirmationInputOption(String str, int i) {
    }

    static {
        EmailConfirmationInputOption[] emailConfirmationInputOptionArr$values = $values();
        $VALUES = emailConfirmationInputOptionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(emailConfirmationInputOptionArr$values);
    }

    public static EmailConfirmationInputOption valueOf(String str) {
        return (EmailConfirmationInputOption) Enum.valueOf(EmailConfirmationInputOption.class, str);
    }

    public static EmailConfirmationInputOption[] values() {
        return (EmailConfirmationInputOption[]) $VALUES.clone();
    }
}
