package com.robinhood.utils.moshi;

import com.robinhood.utils.moshi.jsonadapter.LazyJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import dagger.Lazy;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyMoshi.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u000bJ \u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/moshi/LazyMoshi;", "Ldagger/Lazy;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Ldagger/Lazy;)V", "get", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "T", "type", "Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class LazyMoshi implements Lazy<Moshi> {
    private final Lazy<Moshi> moshi;

    public LazyMoshi(Lazy<Moshi> moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // dagger.Lazy
    public Moshi get() {
        Moshi moshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(moshi, "get(...)");
        return moshi;
    }

    public final <T> JsonAdapter<T> adapter(final Type type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return new LazyJsonAdapter(new Function0() { // from class: com.robinhood.utils.moshi.LazyMoshi$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LazyMoshi.adapter$lambda$0(this.f$0, type2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter adapter$lambda$0(LazyMoshi lazyMoshi, Type type2) {
        JsonAdapter jsonAdapterAdapter = lazyMoshi.get().adapter(type2, Util.NO_ANNOTATIONS);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        return jsonAdapterAdapter;
    }

    public final <T> JsonAdapter<T> adapter(final Class<T> type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return new LazyJsonAdapter(new Function0() { // from class: com.robinhood.utils.moshi.LazyMoshi$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LazyMoshi.adapter$lambda$1(this.f$0, type2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter adapter$lambda$1(LazyMoshi lazyMoshi, Class cls) {
        JsonAdapter jsonAdapterAdapter = lazyMoshi.get().adapter(cls, Util.NO_ANNOTATIONS);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        return jsonAdapterAdapter;
    }
}
