package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeserializedContainerSource.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability, reason: use source file name */
/* loaded from: classes21.dex */
public final class DeserializedContainerSource2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeserializedContainerSource2[] $VALUES;
    public static final DeserializedContainerSource2 STABLE = new DeserializedContainerSource2("STABLE", 0);
    public static final DeserializedContainerSource2 UNSTABLE = new DeserializedContainerSource2("UNSTABLE", 1);

    private static final /* synthetic */ DeserializedContainerSource2[] $values() {
        return new DeserializedContainerSource2[]{STABLE, UNSTABLE};
    }

    private DeserializedContainerSource2(String str, int i) {
    }

    static {
        DeserializedContainerSource2[] deserializedContainerSource2Arr$values = $values();
        $VALUES = deserializedContainerSource2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(deserializedContainerSource2Arr$values);
    }

    public static DeserializedContainerSource2 valueOf(String str) {
        return (DeserializedContainerSource2) Enum.valueOf(DeserializedContainerSource2.class, str);
    }

    public static DeserializedContainerSource2[] values() {
        return (DeserializedContainerSource2[]) $VALUES.clone();
    }
}
