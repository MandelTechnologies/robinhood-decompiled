package com.robinhood.android.lib.creditcard.p165ui.invite;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreditApplicationInviteBannerDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/lib/creditcard/ui/invite/Location;", "", "<init>", "(Ljava/lang/String;I)V", "SEARCH", "ACCOUNT", "INBOX", "feature-lib-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.creditcard.ui.invite.Location, reason: use source file name */
/* loaded from: classes8.dex */
public final class CreditApplicationInviteBannerDuxo4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CreditApplicationInviteBannerDuxo4[] $VALUES;
    public static final CreditApplicationInviteBannerDuxo4 SEARCH = new CreditApplicationInviteBannerDuxo4("SEARCH", 0);
    public static final CreditApplicationInviteBannerDuxo4 ACCOUNT = new CreditApplicationInviteBannerDuxo4("ACCOUNT", 1);
    public static final CreditApplicationInviteBannerDuxo4 INBOX = new CreditApplicationInviteBannerDuxo4("INBOX", 2);

    private static final /* synthetic */ CreditApplicationInviteBannerDuxo4[] $values() {
        return new CreditApplicationInviteBannerDuxo4[]{SEARCH, ACCOUNT, INBOX};
    }

    public static EnumEntries<CreditApplicationInviteBannerDuxo4> getEntries() {
        return $ENTRIES;
    }

    private CreditApplicationInviteBannerDuxo4(String str, int i) {
    }

    static {
        CreditApplicationInviteBannerDuxo4[] creditApplicationInviteBannerDuxo4Arr$values = $values();
        $VALUES = creditApplicationInviteBannerDuxo4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(creditApplicationInviteBannerDuxo4Arr$values);
    }

    public static CreditApplicationInviteBannerDuxo4 valueOf(String str) {
        return (CreditApplicationInviteBannerDuxo4) Enum.valueOf(CreditApplicationInviteBannerDuxo4.class, str);
    }

    public static CreditApplicationInviteBannerDuxo4[] values() {
        return (CreditApplicationInviteBannerDuxo4[]) $VALUES.clone();
    }
}
