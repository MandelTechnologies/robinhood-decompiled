package com.twilio.twilsock.util;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: http.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/twilio/twilsock/util/HttpMethod;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "POST", "GET", "PUT", "DELETE", "Companion", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.twilio.twilsock.util.HttpMethod, reason: use source file name */
/* loaded from: classes12.dex */
public final class http2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ http2[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Map<Integer, http2> map;
    private final int value;
    public static final http2 POST = new http2("POST", 0, 0);
    public static final http2 GET = new http2("GET", 1, 1);
    public static final http2 PUT = new http2("PUT", 2, 2);
    public static final http2 DELETE = new http2("DELETE", 3, 3);

    private static final /* synthetic */ http2[] $values() {
        return new http2[]{POST, GET, PUT, DELETE};
    }

    public static EnumEntries<http2> getEntries() {
        return $ENTRIES;
    }

    public static http2 valueOf(String str) {
        return (http2) Enum.valueOf(http2.class, str);
    }

    public static http2[] values() {
        return (http2[]) $VALUES.clone();
    }

    private http2(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        http2[] http2VarArr$values = $values();
        $VALUES = http2VarArr$values;
        $ENTRIES = EnumEntries2.enumEntries(http2VarArr$values);
        INSTANCE = new Companion(null);
        http2[] http2VarArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(http2VarArrValues.length), 16));
        for (http2 http2Var : http2VarArrValues) {
            linkedHashMap.put(Integer.valueOf(http2Var.value), http2Var);
        }
        map = linkedHashMap;
    }

    /* compiled from: http.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/twilio/twilsock/util/HttpMethod$Companion;", "", "()V", "map", "", "", "Lcom/twilio/twilsock/util/HttpMethod;", "fromInt", "value", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.twilio.twilsock.util.HttpMethod$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final http2 fromInt(int value) {
            http2 http2Var = (http2) http2.map.get(Integer.valueOf(value));
            if (http2Var != null) {
                return http2Var;
            }
            throw new IllegalStateException(("Unknown HttpMethod value: " + value).toString());
        }
    }
}
