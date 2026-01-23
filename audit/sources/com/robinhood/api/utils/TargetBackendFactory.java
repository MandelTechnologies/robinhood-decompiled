package com.robinhood.api.utils;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.debugconfig.DebugConfig;
import com.robinhood.targetbackend.TargetBackend;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: TargetBackendFactory.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/api/utils/TargetBackendFactory;", "", "options", "", "Lcom/robinhood/targetbackend/TargetBackend;", "<init>", "(Ljava/util/List;)V", "getOptions", "()Ljava/util/List;", "byId", "", "Lcom/robinhood/targetbackend/TargetBackend$Id;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "getDefault", "()Lcom/robinhood/targetbackend/TargetBackend;", "customHostname", "getCustomHostname", "dockerNamespace", "getDockerNamespace", "getById", "id", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class TargetBackendFactory {
    private final Map<TargetBackend.EnumC41639Id, TargetBackend> byId;
    private final List<TargetBackend> options;

    public TargetBackendFactory(List<TargetBackend> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        List<TargetBackend> list = options;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((TargetBackend) obj).getId(), obj);
        }
        this.byId = linkedHashMap;
        if (this.options.size() != linkedHashMap.size()) {
            throw new IllegalStateException(("List of target backends did not include all IDs: " + this.options).toString());
        }
        EnumEntries<TargetBackend.EnumC41639Id> entries = TargetBackend.EnumC41639Id.getEntries();
        ArrayList arrayList = new ArrayList();
        for (TargetBackend.EnumC41639Id enumC41639Id : entries) {
            if (!this.byId.containsKey(enumC41639Id)) {
                arrayList.add(enumC41639Id);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        throw new IllegalStateException(("Some target backends are missing: " + arrayList).toString());
    }

    public final List<TargetBackend> getOptions() {
        return this.options;
    }

    public final TargetBackend getDefault() {
        TargetBackend.EnumC41639Id enumC41639IdValueOf;
        try {
            enumC41639IdValueOf = TargetBackend.EnumC41639Id.valueOf(DebugConfig.INSTANCE.getDefaultTargetBackend());
        } catch (IllegalArgumentException unused) {
            enumC41639IdValueOf = TargetBackend.EnumC41639Id.PROD;
        }
        TargetBackend targetBackend = this.byId.get(enumC41639IdValueOf);
        return targetBackend == null ? TargetBackend.INSTANCE.getPROD() : targetBackend;
    }

    public final TargetBackend getCustomHostname() {
        return getById(TargetBackend.EnumC41639Id.CUSTOM_HOSTNAME);
    }

    public final TargetBackend getDockerNamespace() {
        return getById(TargetBackend.EnumC41639Id.NAMESPACE);
    }

    public final TargetBackend getById(TargetBackend.EnumC41639Id id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return (TargetBackend) MapsKt.getValue(this.byId, id);
    }
}
