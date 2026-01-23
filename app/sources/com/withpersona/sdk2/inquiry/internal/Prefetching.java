package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.types.ModelBackedExtractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Prefetching.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/Prefetching;", "", "<init>", "()V", "prefetchModels", "", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class Prefetching {
    public static final Prefetching INSTANCE = new Prefetching();

    private Prefetching() {
    }

    public final void prefetchModels() throws IllegalAccessException, InstantiationException {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.extraction.impl.TextEntityExtractorImpl").newInstance();
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.types.ModelBackedExtractor");
            ((ModelBackedExtractor) objNewInstance).prefetchModels();
        } catch (ClassNotFoundException unused) {
        }
    }
}
