package com.truelayer.payments.core.domain.configuration;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HttpConnectionConfiguration.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/configuration/HttpLoggingLevel;", "", "level", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Ljava/lang/String;ILokhttp3/logging/HttpLoggingInterceptor$Level;)V", "getLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "None", "Basic", "Headers", "Body", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.core.domain.configuration.HttpLoggingLevel, reason: use source file name */
/* loaded from: classes6.dex */
public final class HttpConnectionConfiguration2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HttpConnectionConfiguration2[] $VALUES;
    private final HttpLoggingInterceptor.Level level;
    public static final HttpConnectionConfiguration2 None = new HttpConnectionConfiguration2("None", 0, HttpLoggingInterceptor.Level.NONE);
    public static final HttpConnectionConfiguration2 Basic = new HttpConnectionConfiguration2("Basic", 1, HttpLoggingInterceptor.Level.BASIC);
    public static final HttpConnectionConfiguration2 Headers = new HttpConnectionConfiguration2("Headers", 2, HttpLoggingInterceptor.Level.HEADERS);
    public static final HttpConnectionConfiguration2 Body = new HttpConnectionConfiguration2("Body", 3, HttpLoggingInterceptor.Level.BODY);

    private static final /* synthetic */ HttpConnectionConfiguration2[] $values() {
        return new HttpConnectionConfiguration2[]{None, Basic, Headers, Body};
    }

    public static EnumEntries<HttpConnectionConfiguration2> getEntries() {
        return $ENTRIES;
    }

    public static HttpConnectionConfiguration2 valueOf(String str) {
        return (HttpConnectionConfiguration2) Enum.valueOf(HttpConnectionConfiguration2.class, str);
    }

    public static HttpConnectionConfiguration2[] values() {
        return (HttpConnectionConfiguration2[]) $VALUES.clone();
    }

    private HttpConnectionConfiguration2(String str, int i, HttpLoggingInterceptor.Level level) {
        this.level = level;
    }

    public final HttpLoggingInterceptor.Level getLevel() {
        return this.level;
    }

    static {
        HttpConnectionConfiguration2[] httpConnectionConfiguration2Arr$values = $values();
        $VALUES = httpConnectionConfiguration2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(httpConnectionConfiguration2Arr$values);
    }
}
