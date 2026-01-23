package com.salesforce.android.smi.network.api.rest;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QueryDirection.kt */
@JsonClass(generateAdapter = false)
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/api/rest/QueryDirection;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Ascending", "Descending", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class QueryDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QueryDirection[] $VALUES;
    public static final QueryDirection Ascending = new QueryDirection("Ascending", 0, "FromStart");
    public static final QueryDirection Descending = new QueryDirection("Descending", 1, "FromEnd");
    private final String value;

    private static final /* synthetic */ QueryDirection[] $values() {
        return new QueryDirection[]{Ascending, Descending};
    }

    public static EnumEntries<QueryDirection> getEntries() {
        return $ENTRIES;
    }

    private QueryDirection(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        QueryDirection[] queryDirectionArr$values = $values();
        $VALUES = queryDirectionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(queryDirectionArr$values);
    }

    public static QueryDirection valueOf(String str) {
        return (QueryDirection) Enum.valueOf(QueryDirection.class, str);
    }

    public static QueryDirection[] values() {
        return (QueryDirection[]) $VALUES.clone();
    }
}
