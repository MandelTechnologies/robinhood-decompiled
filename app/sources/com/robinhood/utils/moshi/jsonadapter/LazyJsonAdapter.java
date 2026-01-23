package com.robinhood.utils.moshi.jsonadapter;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0011R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/LazyJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "delegate", "Lkotlin/Function0;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getDelegate", "()Lkotlin/jvm/functions/Function0;", "fromJson", "p0", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "toJson", "", "Lcom/squareup/moshi/JsonWriter;", "p1", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class LazyJsonAdapter<T> extends JsonAdapter<T> {
    private final Function0<JsonAdapter<T>> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyJsonAdapter(Function0<? extends JsonAdapter<T>> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public final Function0<JsonAdapter<T>> getDelegate() {
        return this.delegate;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(JsonReader p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.delegate.invoke().fromJson(p0);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter p0, T p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.delegate.invoke().toJson(p0, (JsonWriter) p1);
    }
}
