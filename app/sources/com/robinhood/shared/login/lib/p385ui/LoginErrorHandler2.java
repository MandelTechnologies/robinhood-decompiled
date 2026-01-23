package com.robinhood.shared.login.lib.p385ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoginErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/GenericLoginErrorResponseType;", "", "<init>", "(Ljava/lang/String;I)V", "CREATE_ACCOUNT", "DEFAULT", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.login.lib.ui.GenericLoginErrorResponseType, reason: use source file name */
/* loaded from: classes6.dex */
public final class LoginErrorHandler2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoginErrorHandler2[] $VALUES;
    public static final LoginErrorHandler2 CREATE_ACCOUNT = new LoginErrorHandler2("CREATE_ACCOUNT", 0);
    public static final LoginErrorHandler2 DEFAULT = new LoginErrorHandler2("DEFAULT", 1);

    private static final /* synthetic */ LoginErrorHandler2[] $values() {
        return new LoginErrorHandler2[]{CREATE_ACCOUNT, DEFAULT};
    }

    public static EnumEntries<LoginErrorHandler2> getEntries() {
        return $ENTRIES;
    }

    private LoginErrorHandler2(String str, int i) {
    }

    static {
        LoginErrorHandler2[] loginErrorHandler2Arr$values = $values();
        $VALUES = loginErrorHandler2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(loginErrorHandler2Arr$values);
    }

    public static LoginErrorHandler2 valueOf(String str) {
        return (LoginErrorHandler2) Enum.valueOf(LoginErrorHandler2.class, str);
    }

    public static LoginErrorHandler2[] values() {
        return (LoginErrorHandler2[]) $VALUES.clone();
    }
}
