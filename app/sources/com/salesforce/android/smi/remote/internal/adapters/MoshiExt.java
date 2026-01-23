package com.salesforce.android.smi.remote.internal.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MoshiExt.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aW\u0010\u0006\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00018\u00008\u0000 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"T", "R", "Lcom/squareup/moshi/adapters/PolymorphicJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter;", "fallbackJsonAdapter", "kotlin.jvm.PlatformType", "withFallbackJsonAdapter", "(Lcom/squareup/moshi/adapters/PolymorphicJsonAdapterFactory;Lcom/squareup/moshi/JsonAdapter;)Lcom/squareup/moshi/adapters/PolymorphicJsonAdapterFactory;", "remote_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.salesforce.android.smi.remote.internal.adapters.MoshiExtKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class MoshiExt {
    public static final <T, R> PolymorphicJsonAdapterFactory<T> withFallbackJsonAdapter(PolymorphicJsonAdapterFactory<T> polymorphicJsonAdapterFactory, final JsonAdapter<R> fallbackJsonAdapter) {
        Intrinsics.checkNotNullParameter(polymorphicJsonAdapterFactory, "<this>");
        Intrinsics.checkNotNullParameter(fallbackJsonAdapter, "fallbackJsonAdapter");
        return polymorphicJsonAdapterFactory.withFallbackJsonAdapter(new JsonAdapter<Object>() { // from class: com.salesforce.android.smi.remote.internal.adapters.MoshiExtKt.withFallbackJsonAdapter.1
            @Override // com.squareup.moshi.JsonAdapter
            public Object fromJson(JsonReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return fallbackJsonAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter writer, Object value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                fallbackJsonAdapter.toJson(writer, (JsonWriter) value);
            }
        });
    }
}
