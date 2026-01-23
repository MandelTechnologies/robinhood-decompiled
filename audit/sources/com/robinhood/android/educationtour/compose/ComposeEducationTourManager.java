package com.robinhood.android.educationtour.compose;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.educationtour.ComposeEducationTourScreen;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ComposeEducationTourManager.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0018J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u001aJ'\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u001c2\u0006\u0010\u0017\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u001dJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001fJ%\u0010 \u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0011H\u0000¢\u0006\u0002\b#J\u001d\u0010$\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0000¢\u0006\u0002\b%J\u0016\u0010&\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0013J\u0015\u0010(\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0006H\u0000¢\u0006\u0002\b)J\u000e\u0010*\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR,\u0010\u000f\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/educationtour/compose/ComposeEducationTourManager;", "", "<init>", "()V", "offsetAdjustmentFinishedRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "getOffsetAdjustmentFinishedRelay$lib_education_tour_externalDebug", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "screenRegistry", "", "Ljava/util/UUID;", "Lcom/robinhood/android/educationtour/ComposeEducationTourScreen;", "getScreenRegistry$lib_education_tour_externalDebug", "()Ljava/util/Map;", "elementIdToOffsetMap", "Ljava/lang/ref/SoftReference;", "Lcom/robinhood/android/educationtour/compose/ComposeEducationTourElementData;", "shouldTrackScreenElementsMap", "", "registerScreen", "", "id", "screen", "registerScreen$lib_education_tour_externalDebug", "unregisterScreen", "unregisterScreen$lib_education_tour_externalDebug", "getScreenElements", "", "getScreenElements$lib_education_tour_externalDebug", "getAvailableElementIds", "", "setElementData", "elementId", WebsocketGatewayConstants.DATA_KEY, "setElementData$lib_education_tour_externalDebug", "removeElementData", "removeElementData$lib_education_tour_externalDebug", "updateShouldTrackElements", "shouldTrack", "shouldTrackElements", "shouldTrackElements$lib_education_tour_externalDebug", "clearElementsForScreen", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ComposeEducationTourManager {
    public static final int $stable;
    public static final ComposeEducationTourManager INSTANCE = new ComposeEducationTourManager();
    private static final Map<String, Map<String, SoftReference<ComposeEducationTourElementData>>> elementIdToOffsetMap;
    private static final BehaviorRelay<String> offsetAdjustmentFinishedRelay;
    private static final Map<UUID, ComposeEducationTourScreen> screenRegistry;
    private static final Map<String, Boolean> shouldTrackScreenElementsMap;

    private ComposeEducationTourManager() {
    }

    static {
        BehaviorRelay<String> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        offsetAdjustmentFinishedRelay = behaviorRelayCreate;
        screenRegistry = new LinkedHashMap();
        elementIdToOffsetMap = new LinkedHashMap();
        shouldTrackScreenElementsMap = new LinkedHashMap();
        $stable = 8;
    }

    /* renamed from: getOffsetAdjustmentFinishedRelay$lib_education_tour_externalDebug */
    public final BehaviorRelay<String> m1940x3081b74d() {
        return offsetAdjustmentFinishedRelay;
    }

    public final Map<UUID, ComposeEducationTourScreen> getScreenRegistry$lib_education_tour_externalDebug() {
        return screenRegistry;
    }

    public final void registerScreen$lib_education_tour_externalDebug(UUID id, ComposeEducationTourScreen screen) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(screen, "screen");
        screenRegistry.put(id, screen);
    }

    public final void unregisterScreen$lib_education_tour_externalDebug(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        screenRegistry.remove(id);
    }

    public final Map<String, SoftReference<ComposeEducationTourElementData>> getScreenElements$lib_education_tour_externalDebug(String screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Map<String, SoftReference<ComposeEducationTourElementData>> map = elementIdToOffsetMap.get(screen);
        return map == null ? MapsKt.emptyMap() : map;
    }

    public final List<String> getAvailableElementIds() {
        Collection<Map<String, SoftReference<ComposeEducationTourElementData>>> collectionValues = elementIdToOffsetMap.values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((Map) it.next()).keySet());
        }
        return CollectionsKt.flatten(arrayList);
    }

    public final void setElementData$lib_education_tour_externalDebug(String screen, String elementId, ComposeEducationTourElementData data) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        Intrinsics.checkNotNullParameter(data, "data");
        Map<String, Map<String, SoftReference<ComposeEducationTourElementData>>> map = elementIdToOffsetMap;
        Map<String, SoftReference<ComposeEducationTourElementData>> linkedHashMap = map.get(screen);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            map.put(screen, linkedHashMap);
        }
        linkedHashMap.put(elementId, new SoftReference<>(data));
        offsetAdjustmentFinishedRelay.accept(elementId);
    }

    public final void removeElementData$lib_education_tour_externalDebug(String screen, String elementId) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        Map<String, SoftReference<ComposeEducationTourElementData>> map = elementIdToOffsetMap.get(screen);
        if (map != null) {
            map.remove(elementId);
        }
    }

    public final void updateShouldTrackElements(String screen, boolean shouldTrack) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        shouldTrackScreenElementsMap.put(screen, Boolean.valueOf(shouldTrack));
    }

    public final boolean shouldTrackElements$lib_education_tour_externalDebug(String screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        boolean zAreEqual = Intrinsics.areEqual(screen, EducationTourScreenNames.UNSPECIFIED_SCREEN);
        Boolean bool = shouldTrackScreenElementsMap.get(screen);
        return !zAreEqual && (bool != null ? bool.booleanValue() : true);
    }

    public final void clearElementsForScreen(String screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        elementIdToOffsetMap.put(screen, new LinkedHashMap());
    }
}
