package com.robinhood.shared.unverifiedaccountrecovery.email.confirmation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EmailConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationPageTestTag;", "", "<init>", "(Ljava/lang/String;I)V", "Heading", "Subheading", "ObfuscatedEmail", "ShowFullEmailCta", "CtaButtonBar", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationPageTestTag, reason: use source file name */
/* loaded from: classes12.dex */
public final class EmailConfirmationComposable2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EmailConfirmationComposable2[] $VALUES;
    public static final EmailConfirmationComposable2 Heading = new EmailConfirmationComposable2("Heading", 0);
    public static final EmailConfirmationComposable2 Subheading = new EmailConfirmationComposable2("Subheading", 1);
    public static final EmailConfirmationComposable2 ObfuscatedEmail = new EmailConfirmationComposable2("ObfuscatedEmail", 2);
    public static final EmailConfirmationComposable2 ShowFullEmailCta = new EmailConfirmationComposable2("ShowFullEmailCta", 3);
    public static final EmailConfirmationComposable2 CtaButtonBar = new EmailConfirmationComposable2("CtaButtonBar", 4);

    private static final /* synthetic */ EmailConfirmationComposable2[] $values() {
        return new EmailConfirmationComposable2[]{Heading, Subheading, ObfuscatedEmail, ShowFullEmailCta, CtaButtonBar};
    }

    public static EnumEntries<EmailConfirmationComposable2> getEntries() {
        return $ENTRIES;
    }

    private EmailConfirmationComposable2(String str, int i) {
    }

    static {
        EmailConfirmationComposable2[] emailConfirmationComposable2Arr$values = $values();
        $VALUES = emailConfirmationComposable2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(emailConfirmationComposable2Arr$values);
    }

    public static EmailConfirmationComposable2 valueOf(String str) {
        return (EmailConfirmationComposable2) Enum.valueOf(EmailConfirmationComposable2.class, str);
    }

    public static EmailConfirmationComposable2[] values() {
        return (EmailConfirmationComposable2[]) $VALUES.clone();
    }
}
