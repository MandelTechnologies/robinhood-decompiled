package com.robinhood.utils.moshi;

import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LazyMoshi.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u0086\b¨\u0006\u0004"}, m3636d2 = {"getAdapter", "Lcom/squareup/moshi/JsonAdapter;", "T", "Lcom/robinhood/utils/moshi/LazyMoshi;", "lib-serialization-utils_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.moshi.LazyMoshiKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LazyMoshi2 {
    public static final /* synthetic */ <T> JsonAdapter<T> getAdapter(LazyMoshi lazyMoshi) {
        Intrinsics.checkNotNullParameter(lazyMoshi, "<this>");
        Types types = Types.INSTANCE;
        Intrinsics.needClassReification();
        return lazyMoshi.adapter(new TypeToken<T>() { // from class: com.robinhood.utils.moshi.LazyMoshiKt$getAdapter$$inlined$typeLiteral$1
        }.getType());
    }
}
