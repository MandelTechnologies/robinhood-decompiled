package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Json.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lkotlinx/serialization/json/DecodeSequenceMode;", "", "<init>", "(Ljava/lang/String;I)V", "WHITESPACE_SEPARATED", "ARRAY_WRAPPED", "AUTO_DETECT", "kotlinx-serialization-json"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: kotlinx.serialization.json.DecodeSequenceMode, reason: use source file name */
/* loaded from: classes14.dex */
public final class Json3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Json3[] $VALUES;
    public static final Json3 WHITESPACE_SEPARATED = new Json3("WHITESPACE_SEPARATED", 0);
    public static final Json3 ARRAY_WRAPPED = new Json3("ARRAY_WRAPPED", 1);
    public static final Json3 AUTO_DETECT = new Json3("AUTO_DETECT", 2);

    private static final /* synthetic */ Json3[] $values() {
        return new Json3[]{WHITESPACE_SEPARATED, ARRAY_WRAPPED, AUTO_DETECT};
    }

    public static EnumEntries<Json3> getEntries() {
        return $ENTRIES;
    }

    private Json3(String str, int i) {
    }

    static {
        Json3[] json3Arr$values = $values();
        $VALUES = json3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(json3Arr$values);
    }

    public static Json3 valueOf(String str) {
        return (Json3) Enum.valueOf(Json3.class, str);
    }

    public static Json3[] values() {
        return (Json3[]) $VALUES.clone();
    }
}
