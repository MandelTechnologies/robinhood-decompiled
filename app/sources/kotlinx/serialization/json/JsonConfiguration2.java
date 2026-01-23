package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: JsonConfiguration.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lkotlinx/serialization/json/ClassDiscriminatorMode;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ALL_JSON_OBJECTS", "POLYMORPHIC", "kotlinx-serialization-json"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: kotlinx.serialization.json.ClassDiscriminatorMode, reason: use source file name */
/* loaded from: classes14.dex */
public final class JsonConfiguration2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ JsonConfiguration2[] $VALUES;
    public static final JsonConfiguration2 NONE = new JsonConfiguration2("NONE", 0);
    public static final JsonConfiguration2 ALL_JSON_OBJECTS = new JsonConfiguration2("ALL_JSON_OBJECTS", 1);
    public static final JsonConfiguration2 POLYMORPHIC = new JsonConfiguration2("POLYMORPHIC", 2);

    private static final /* synthetic */ JsonConfiguration2[] $values() {
        return new JsonConfiguration2[]{NONE, ALL_JSON_OBJECTS, POLYMORPHIC};
    }

    public static EnumEntries<JsonConfiguration2> getEntries() {
        return $ENTRIES;
    }

    private JsonConfiguration2(String str, int i) {
    }

    static {
        JsonConfiguration2[] jsonConfiguration2Arr$values = $values();
        $VALUES = jsonConfiguration2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(jsonConfiguration2Arr$values);
    }

    public static JsonConfiguration2 valueOf(String str) {
        return (JsonConfiguration2) Enum.valueOf(JsonConfiguration2.class, str);
    }

    public static JsonConfiguration2[] values() {
        return (JsonConfiguration2[]) $VALUES.clone();
    }
}
