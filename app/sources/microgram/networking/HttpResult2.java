package microgram.networking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HttpResult.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lmicrogram/networking/HttpErrorCode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "INTERNAL_ERROR", "microgram-networking"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: microgram.networking.HttpErrorCode, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpResult2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HttpResult2[] $VALUES;
    public static final HttpResult2 INTERNAL_ERROR = new HttpResult2("INTERNAL_ERROR", 0, 1);
    private final int value;

    private static final /* synthetic */ HttpResult2[] $values() {
        return new HttpResult2[]{INTERNAL_ERROR};
    }

    public static EnumEntries<HttpResult2> getEntries() {
        return $ENTRIES;
    }

    public static HttpResult2 valueOf(String str) {
        return (HttpResult2) Enum.valueOf(HttpResult2.class, str);
    }

    public static HttpResult2[] values() {
        return (HttpResult2[]) $VALUES.clone();
    }

    private HttpResult2(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        HttpResult2[] httpResult2Arr$values = $values();
        $VALUES = httpResult2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(httpResult2Arr$values);
    }
}
