package com.robinhood.librobinhood.util;

import com.robinhood.models.api.ReferrerData;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PersistentCacheManager.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class PersistentCacheManager$symmetricReferrerData$3 extends FunctionReferenceImpl implements Function1<ReferrerData, String> {
    PersistentCacheManager$symmetricReferrerData$3(Object obj) {
        super(1, obj, JsonAdapter.class, "toJson", "toJson(Ljava/lang/Object;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(ReferrerData referrerData) {
        return ((JsonAdapter) this.receiver).toJson(referrerData);
    }
}
