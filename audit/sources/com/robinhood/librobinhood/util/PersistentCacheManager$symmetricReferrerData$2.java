package com.robinhood.librobinhood.util;

import com.robinhood.models.api.ReferrerData;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PersistentCacheManager.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class PersistentCacheManager$symmetricReferrerData$2 extends FunctionReferenceImpl implements Function1<String, ReferrerData> {
    PersistentCacheManager$symmetricReferrerData$2(Object obj) {
        super(1, obj, JsonAdapter.class, "fromJson", "fromJson(Ljava/lang/String;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ReferrerData invoke(String str) {
        return (ReferrerData) ((JsonAdapter) this.receiver).fromJson(str);
    }
}
