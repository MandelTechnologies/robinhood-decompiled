package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: predefinedEnhancementInfo.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo, reason: use source file name */
/* loaded from: classes14.dex */
public final class predefinedEnhancementInfo4 {
    private final Map<Integer, typeQualifiers> map;

    public predefinedEnhancementInfo4(Map<Integer, typeQualifiers> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    public final Map<Integer, typeQualifiers> getMap() {
        return this.map;
    }

    public final predefinedEnhancementInfo4 copyForWarnings() {
        Map<Integer, typeQualifiers> map = this.map;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), typeQualifiers.copy$default((typeQualifiers) entry.getValue(), null, null, false, true, 7, null));
        }
        return new predefinedEnhancementInfo4(linkedHashMap);
    }
}
