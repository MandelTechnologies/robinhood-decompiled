package com.robinhood.utils.logging;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SentryTeam.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/logging/SentryTeam;", "", "<init>", "(Ljava/lang/String;I)V", "AUTH_AND_SAFETY", "CRYPTO", "MOBILE_PLATFORM", "SUPPORT_X", "PORTFOLIO", "ENGAGEMENT", "EQUITIES", "ACATS", "SMS", "RAD", "OPTIONS", "GOLD", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class SentryTeam {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SentryTeam[] $VALUES;
    public static final SentryTeam AUTH_AND_SAFETY = new SentryTeam("AUTH_AND_SAFETY", 0);
    public static final SentryTeam CRYPTO = new SentryTeam("CRYPTO", 1);
    public static final SentryTeam MOBILE_PLATFORM = new SentryTeam("MOBILE_PLATFORM", 2);
    public static final SentryTeam SUPPORT_X = new SentryTeam("SUPPORT_X", 3);
    public static final SentryTeam PORTFOLIO = new SentryTeam("PORTFOLIO", 4);
    public static final SentryTeam ENGAGEMENT = new SentryTeam("ENGAGEMENT", 5);
    public static final SentryTeam EQUITIES = new SentryTeam("EQUITIES", 6);
    public static final SentryTeam ACATS = new SentryTeam("ACATS", 7);
    public static final SentryTeam SMS = new SentryTeam("SMS", 8);
    public static final SentryTeam RAD = new SentryTeam("RAD", 9);
    public static final SentryTeam OPTIONS = new SentryTeam("OPTIONS", 10);
    public static final SentryTeam GOLD = new SentryTeam("GOLD", 11);

    private static final /* synthetic */ SentryTeam[] $values() {
        return new SentryTeam[]{AUTH_AND_SAFETY, CRYPTO, MOBILE_PLATFORM, SUPPORT_X, PORTFOLIO, ENGAGEMENT, EQUITIES, ACATS, SMS, RAD, OPTIONS, GOLD};
    }

    public static EnumEntries<SentryTeam> getEntries() {
        return $ENTRIES;
    }

    private SentryTeam(String str, int i) {
    }

    static {
        SentryTeam[] sentryTeamArr$values = $values();
        $VALUES = sentryTeamArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sentryTeamArr$values);
    }

    public static SentryTeam valueOf(String str) {
        return (SentryTeam) Enum.valueOf(SentryTeam.class, str);
    }

    public static SentryTeam[] values() {
        return (SentryTeam[]) $VALUES.clone();
    }
}
