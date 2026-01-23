package com.robinhood.api;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RobinhoodService.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/api/RobinhoodService;", "", "apiVersionHeader", "", "apiVersionNumber", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getApiVersionHeader", "()Ljava/lang/String;", "getApiVersionNumber", "BROKEBACK", "MARKETDATA", "MIDLANDS", "MINERVA", "NUMMUS", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RobinhoodService {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RobinhoodService[] $VALUES;
    public static final RobinhoodService BROKEBACK = new RobinhoodService("BROKEBACK", 0, "X-Robinhood-API-Version", "1.431.4");
    public static final RobinhoodService MARKETDATA = new RobinhoodService("MARKETDATA", 1, "X-Marketdata-API-Version", "1.65.0");
    public static final RobinhoodService MIDLANDS = new RobinhoodService("MIDLANDS", 2, "X-Midlands-API-Version", "1.66.64");
    public static final RobinhoodService MINERVA = new RobinhoodService("MINERVA", 3, "X-Minerva-API-Version", "1.110.0");
    public static final RobinhoodService NUMMUS = new RobinhoodService("NUMMUS", 4, "X-Nummus-API-Version", "1.39.5");
    private final String apiVersionHeader;
    private final String apiVersionNumber;

    private static final /* synthetic */ RobinhoodService[] $values() {
        return new RobinhoodService[]{BROKEBACK, MARKETDATA, MIDLANDS, MINERVA, NUMMUS};
    }

    public static EnumEntries<RobinhoodService> getEntries() {
        return $ENTRIES;
    }

    private RobinhoodService(String str, int i, String str2, String str3) {
        this.apiVersionHeader = str2;
        this.apiVersionNumber = str3;
    }

    public final String getApiVersionHeader() {
        return this.apiVersionHeader;
    }

    public final String getApiVersionNumber() {
        return this.apiVersionNumber;
    }

    static {
        RobinhoodService[] robinhoodServiceArr$values = $values();
        $VALUES = robinhoodServiceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(robinhoodServiceArr$values);
    }

    public static RobinhoodService valueOf(String str) {
        return (RobinhoodService) Enum.valueOf(RobinhoodService.class, str);
    }

    public static RobinhoodService[] values() {
        return (RobinhoodService[]) $VALUES.clone();
    }
}
