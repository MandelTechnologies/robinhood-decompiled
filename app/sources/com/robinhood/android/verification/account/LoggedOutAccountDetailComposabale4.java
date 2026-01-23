package com.robinhood.android.verification.account;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoggedOutAccountDetailComposabale.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/verification/account/TestTag;", "", "<init>", "(Ljava/lang/String;I)V", "TITLE", "SUB_TITLE", "EMAIL_INPUT", "PHONE_NUMBER_INPUT", "CONTINUE_BUTTON", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.account.TestTag, reason: use source file name */
/* loaded from: classes9.dex */
public final class LoggedOutAccountDetailComposabale4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoggedOutAccountDetailComposabale4[] $VALUES;
    public static final LoggedOutAccountDetailComposabale4 TITLE = new LoggedOutAccountDetailComposabale4("TITLE", 0);
    public static final LoggedOutAccountDetailComposabale4 SUB_TITLE = new LoggedOutAccountDetailComposabale4("SUB_TITLE", 1);
    public static final LoggedOutAccountDetailComposabale4 EMAIL_INPUT = new LoggedOutAccountDetailComposabale4("EMAIL_INPUT", 2);
    public static final LoggedOutAccountDetailComposabale4 PHONE_NUMBER_INPUT = new LoggedOutAccountDetailComposabale4("PHONE_NUMBER_INPUT", 3);
    public static final LoggedOutAccountDetailComposabale4 CONTINUE_BUTTON = new LoggedOutAccountDetailComposabale4("CONTINUE_BUTTON", 4);

    private static final /* synthetic */ LoggedOutAccountDetailComposabale4[] $values() {
        return new LoggedOutAccountDetailComposabale4[]{TITLE, SUB_TITLE, EMAIL_INPUT, PHONE_NUMBER_INPUT, CONTINUE_BUTTON};
    }

    public static EnumEntries<LoggedOutAccountDetailComposabale4> getEntries() {
        return $ENTRIES;
    }

    private LoggedOutAccountDetailComposabale4(String str, int i) {
    }

    static {
        LoggedOutAccountDetailComposabale4[] loggedOutAccountDetailComposabale4Arr$values = $values();
        $VALUES = loggedOutAccountDetailComposabale4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(loggedOutAccountDetailComposabale4Arr$values);
    }

    public static LoggedOutAccountDetailComposabale4 valueOf(String str) {
        return (LoggedOutAccountDetailComposabale4) Enum.valueOf(LoggedOutAccountDetailComposabale4.class, str);
    }

    public static LoggedOutAccountDetailComposabale4[] values() {
        return (LoggedOutAccountDetailComposabale4[]) $VALUES.clone();
    }
}
