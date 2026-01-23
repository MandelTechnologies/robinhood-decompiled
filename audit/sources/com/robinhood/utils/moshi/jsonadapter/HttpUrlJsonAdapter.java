package com.robinhood.utils.moshi.jsonadapter;

import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.ToJson;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter2;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: HttpUrlJsonAdapter.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0015J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0015R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/HttpUrlJsonAdapter;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Lokhttp3/HttpUrl;", "<init>", "()V", "jsonAdapterHackForBackwardsCompat", "Lcom/squareup/moshi/JsonAdapter;", "getJsonAdapterHackForBackwardsCompat", "()Lcom/squareup/moshi/JsonAdapter;", "jsonAdapterHackForBackwardsCompat$delegate", "Lkotlin/Lazy;", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class HttpUrlJsonAdapter extends NullSafeJsonAdapter<HttpUrl> {
    public static final HttpUrlJsonAdapter INSTANCE = new HttpUrlJsonAdapter();

    /* renamed from: jsonAdapterHackForBackwardsCompat$delegate, reason: from kotlin metadata */
    private static final Lazy jsonAdapterHackForBackwardsCompat = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.utils.moshi.jsonadapter.HttpUrlJsonAdapter$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HttpUrlJsonAdapter.jsonAdapterHackForBackwardsCompat_delegate$lambda$1();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter jsonAdapterHackForBackwardsCompat_delegate$lambda$1() {
        Moshi.Builder builderAdd = new Moshi.Builder().add((JsonAdapter.Factory) StackAmendingJsonAdapterFactory.INSTANCE);
        builderAdd.add((JsonAdapter.Factory) new KotlinJsonAdapter2());
        Moshi moshiBuild = builderAdd.build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
        Types types = Types.INSTANCE;
        JsonAdapter jsonAdapterAdapter = moshiBuild.adapter(new TypeToken<HttpUrl>() { // from class: com.robinhood.utils.moshi.jsonadapter.HttpUrlJsonAdapter$jsonAdapterHackForBackwardsCompat_delegate$lambda$1$$inlined$getAdapter$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        return jsonAdapterAdapter;
    }

    private HttpUrlJsonAdapter() {
    }

    private final JsonAdapter<HttpUrl> getJsonAdapterHackForBackwardsCompat() {
        return (JsonAdapter) jsonAdapterHackForBackwardsCompat.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    @FromJson
    public HttpUrl readFrom(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        try {
            String strNextString = reader.nextString();
            try {
                HttpUrl.Companion companion = HttpUrl.INSTANCE;
                Intrinsics.checkNotNull(strNextString);
                return companion.get(strNextString);
            } catch (IllegalArgumentException e) {
                throw new JsonDataException("Unknown HttpUrl: " + strNextString, e);
            }
        } catch (JsonDataException unused) {
            HttpUrl httpUrlFromJson = getJsonAdapterHackForBackwardsCompat().fromJson(reader);
            Intrinsics.checkNotNull(httpUrlFromJson);
            return httpUrlFromJson;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
    @ToJson
    public void writeTo(JsonWriter writer, HttpUrl value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.value(value.getUrl());
    }
}
