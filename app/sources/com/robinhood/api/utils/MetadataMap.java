package com.robinhood.api.utils;

import io.reactivex.subjects.BehaviorSubject;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MetadataMap.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0006J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000b\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/api/utils/MetadataMap;", "", "<init>", "()V", "metadataMap", "", "", "Lcom/robinhood/api/utils/Metadata;", "metadataSubjectMap", "Lio/reactivex/subjects/BehaviorSubject;", "getMetadata", "key", "getMetadataSubject", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class MetadataMap {
    private final Map<String, Metadata> metadataMap = new HashMap(10);
    private final Map<String, BehaviorSubject<Metadata>> metadataSubjectMap = new HashMap(10);

    public final Metadata getMetadata(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Metadata metadata = this.metadataMap.get(key);
        if (metadata != null) {
            return metadata;
        }
        Metadata metadata2 = new Metadata(null, false, null, 7, null);
        BehaviorSubject<Metadata> behaviorSubjectCreateDefault = BehaviorSubject.createDefault(metadata2);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(...)");
        this.metadataMap.put(key, metadata2);
        this.metadataSubjectMap.put(key, behaviorSubjectCreateDefault);
        return metadata2;
    }

    public final BehaviorSubject<Metadata> getMetadataSubject(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        BehaviorSubject<Metadata> behaviorSubject = this.metadataSubjectMap.get(key);
        if (behaviorSubject != null) {
            return behaviorSubject;
        }
        Metadata metadata = new Metadata(null, false, null, 7, null);
        BehaviorSubject<Metadata> behaviorSubjectCreateDefault = BehaviorSubject.createDefault(metadata);
        this.metadataMap.put(key, metadata);
        this.metadataSubjectMap.put(key, behaviorSubjectCreateDefault);
        return behaviorSubjectCreateDefault;
    }
}
