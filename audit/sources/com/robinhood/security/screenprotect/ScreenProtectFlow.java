package com.robinhood.security.screenprotect;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScreenProtectFlow.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/security/screenprotect/ScreenProtectFlow;", "", "<init>", "(Ljava/lang/String;I)V", "CREATE_TRANSFER", "CRYPTO_TRANSFER", "MFA_SETTINGS", "RHY_ENROLLMENT", "UPDATE_EMAIL", "UPDATE_PASSWORD", "UPDATE_PHONE_NUMBER", "VIEW_CARD_NUMBER", "WEB_VIEW", "lib-security_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ScreenProtectFlow {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScreenProtectFlow[] $VALUES;
    public static final ScreenProtectFlow CREATE_TRANSFER = new ScreenProtectFlow("CREATE_TRANSFER", 0);
    public static final ScreenProtectFlow CRYPTO_TRANSFER = new ScreenProtectFlow("CRYPTO_TRANSFER", 1);
    public static final ScreenProtectFlow MFA_SETTINGS = new ScreenProtectFlow("MFA_SETTINGS", 2);
    public static final ScreenProtectFlow RHY_ENROLLMENT = new ScreenProtectFlow("RHY_ENROLLMENT", 3);
    public static final ScreenProtectFlow UPDATE_EMAIL = new ScreenProtectFlow("UPDATE_EMAIL", 4);
    public static final ScreenProtectFlow UPDATE_PASSWORD = new ScreenProtectFlow("UPDATE_PASSWORD", 5);
    public static final ScreenProtectFlow UPDATE_PHONE_NUMBER = new ScreenProtectFlow("UPDATE_PHONE_NUMBER", 6);
    public static final ScreenProtectFlow VIEW_CARD_NUMBER = new ScreenProtectFlow("VIEW_CARD_NUMBER", 7);
    public static final ScreenProtectFlow WEB_VIEW = new ScreenProtectFlow("WEB_VIEW", 8);

    private static final /* synthetic */ ScreenProtectFlow[] $values() {
        return new ScreenProtectFlow[]{CREATE_TRANSFER, CRYPTO_TRANSFER, MFA_SETTINGS, RHY_ENROLLMENT, UPDATE_EMAIL, UPDATE_PASSWORD, UPDATE_PHONE_NUMBER, VIEW_CARD_NUMBER, WEB_VIEW};
    }

    public static EnumEntries<ScreenProtectFlow> getEntries() {
        return $ENTRIES;
    }

    private ScreenProtectFlow(String str, int i) {
    }

    static {
        ScreenProtectFlow[] screenProtectFlowArr$values = $values();
        $VALUES = screenProtectFlowArr$values;
        $ENTRIES = EnumEntries2.enumEntries(screenProtectFlowArr$values);
    }

    public static ScreenProtectFlow valueOf(String str) {
        return (ScreenProtectFlow) Enum.valueOf(ScreenProtectFlow.class, str);
    }

    public static ScreenProtectFlow[] values() {
        return (ScreenProtectFlow[]) $VALUES.clone();
    }
}
