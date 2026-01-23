package io.bitdrift.capture.providers;

import io.bitdrift.capture.providers.FieldProvider4;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: FieldProvider.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0007*\u00020\u0002H\u0000\u001a&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\t*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0000*\"\u0010\n\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t¨\u0006\u000b"}, m3636d2 = {"toField", "Lkotlin/Pair;", "", "Lio/bitdrift/capture/providers/FieldValue;", "toFieldValue", "Lio/bitdrift/capture/providers/FieldValue$BinaryField;", "", "Lio/bitdrift/capture/providers/FieldValue$StringField;", "toFields", "", "Fields", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: io.bitdrift.capture.providers.FieldProviderKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class FieldProvider3 {
    public static final FieldProvider4.StringField toFieldValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new FieldProvider4.StringField(str);
    }

    public static final FieldProvider4.BinaryField toFieldValue(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new FieldProvider4.BinaryField(bArr);
    }

    public static final Tuples2<String, FieldProvider4> toField(Tuples2<String, String> tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<this>");
        return new Tuples2<>(tuples2.getFirst(), toFieldValue(tuples2.getSecond()));
    }

    public static final Map<String, FieldProvider4> toFields(Map<String, String> map) {
        Set<Map.Entry<String, String>> setEntrySet;
        if (map == null || (setEntrySet = map.entrySet()) == null) {
            return MapsKt.emptyMap();
        }
        Set<Map.Entry<String, String>> set = setEntrySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to(entry.getKey(), toFieldValue((String) entry.getValue()));
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return linkedHashMap;
    }
}
