package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import com.robinhood.android.car.result.CarResultComposable2;
import java.io.IOException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.KSerializer3;
import kotlinx.serialization.SerialFormat;
import kotlinx.serialization.SerialFormat3;
import kotlinx.serialization.SerializersKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* compiled from: Serializer.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0001\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/jakewharton/retrofit2/converter/kotlinx/serialization/Serializer;", "", "<init>", "()V", "T", "Lkotlinx/serialization/DeserializationStrategy;", "loader", "Lokhttp3/ResponseBody;", CarResultComposable2.BODY, "fromResponseBody", "(Lkotlinx/serialization/DeserializationStrategy;Lokhttp3/ResponseBody;)Ljava/lang/Object;", "Lokhttp3/MediaType;", "contentType", "Lkotlinx/serialization/SerializationStrategy;", "saver", "value", "Lokhttp3/RequestBody;", "toRequestBody", "(Lokhttp3/MediaType;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lokhttp3/RequestBody;", "Ljava/lang/reflect/Type;", "type", "Lkotlinx/serialization/KSerializer;", "serializer", "(Ljava/lang/reflect/Type;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/SerialFormat;", "getFormat", "()Lkotlinx/serialization/SerialFormat;", "format", "FromString", "Lcom/jakewharton/retrofit2/converter/kotlinx/serialization/Serializer$FromString;", "retrofit2-kotlinx-serialization-converter"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public abstract class Serializer {
    public /* synthetic */ Serializer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract <T> T fromResponseBody(KSerializer2<? extends T> loader, ResponseBody body);

    protected abstract SerialFormat getFormat();

    public abstract <T> RequestBody toRequestBody(MediaType contentType, KSerializer3<? super T> saver, T value);

    private Serializer() {
    }

    public final KSerializer<Object> serializer(Type type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return SerializersKt.serializer(getFormat().getSerializersModule(), type2);
    }

    /* compiled from: Serializer.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ1\u0010\u000e\u001a\u00020\u000f\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\b0\u00132\u0006\u0010\u0014\u001a\u0002H\bH\u0016¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m3636d2 = {"Lcom/jakewharton/retrofit2/converter/kotlinx/serialization/Serializer$FromString;", "Lcom/jakewharton/retrofit2/converter/kotlinx/serialization/Serializer;", "format", "Lkotlinx/serialization/StringFormat;", "(Lkotlinx/serialization/StringFormat;)V", "getFormat", "()Lkotlinx/serialization/StringFormat;", "fromResponseBody", "T", "loader", "Lkotlinx/serialization/DeserializationStrategy;", CarResultComposable2.BODY, "Lokhttp3/ResponseBody;", "(Lkotlinx/serialization/DeserializationStrategy;Lokhttp3/ResponseBody;)Ljava/lang/Object;", "toRequestBody", "Lokhttp3/RequestBody;", "contentType", "Lokhttp3/MediaType;", "saver", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lokhttp3/MediaType;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lokhttp3/RequestBody;", "retrofit2-kotlinx-serialization-converter"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class FromString extends Serializer {
        private final SerialFormat3 format;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromString(SerialFormat3 format2) {
            super(null);
            Intrinsics.checkNotNullParameter(format2, "format");
            this.format = format2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer
        public SerialFormat3 getFormat() {
            return this.format;
        }

        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer
        public <T> T fromResponseBody(KSerializer2<? extends T> loader, ResponseBody body) throws IOException {
            Intrinsics.checkNotNullParameter(loader, "loader");
            Intrinsics.checkNotNullParameter(body, "body");
            String strString = body.string();
            Intrinsics.checkNotNullExpressionValue(strString, "body.string()");
            return (T) getFormat().decodeFromString(loader, strString);
        }

        @Override // com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer
        public <T> RequestBody toRequestBody(MediaType contentType, KSerializer3<? super T> saver, T value) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(saver, "saver");
            RequestBody requestBodyCreate = RequestBody.create(contentType, getFormat().encodeToString(saver, value));
            Intrinsics.checkNotNullExpressionValue(requestBodyCreate, "create(contentType, string)");
            return requestBodyCreate;
        }
    }
}
