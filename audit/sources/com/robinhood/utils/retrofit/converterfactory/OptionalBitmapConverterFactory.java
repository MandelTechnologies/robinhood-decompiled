package com.robinhood.utils.retrofit.converterfactory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* compiled from: OptionalBitmapConverterFactory.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/utils/retrofit/converterfactory/OptionalBitmapConverterFactory;", "Lretrofit2/Converter$Factory;", "<init>", "()V", "optionalBitmapType", "Ljava/lang/reflect/Type;", "responseBodyConverter", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "type", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "ResponseBodyConverter", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class OptionalBitmapConverterFactory extends Converter.Factory {
    public static final OptionalBitmapConverterFactory INSTANCE = new OptionalBitmapConverterFactory();
    private static final Type optionalBitmapType;

    private OptionalBitmapConverterFactory() {
    }

    static {
        Types types = Types.INSTANCE;
        optionalBitmapType = new TypeToken<Optional<Bitmap>>() { // from class: com.robinhood.utils.retrofit.converterfactory.OptionalBitmapConverterFactory$special$$inlined$typeLiteral$1
        }.getType();
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type2, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (Intrinsics.areEqual(type2, optionalBitmapType)) {
            return ResponseBodyConverter.INSTANCE;
        }
        return null;
    }

    /* compiled from: OptionalBitmapConverterFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/retrofit/converterfactory/OptionalBitmapConverterFactory$ResponseBodyConverter;", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "Lcom/robinhood/utils/Optional;", "Landroid/graphics/Bitmap;", "<init>", "()V", "convert", "value", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class ResponseBodyConverter implements Converter<ResponseBody, Optional<? extends Bitmap>> {
        public static final ResponseBodyConverter INSTANCE = new ResponseBodyConverter();

        private ResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public Optional<Bitmap> convert(ResponseBody value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(value.byteStream());
                Closeable.closeFinally(value, null);
                return Optional3.asOptional(bitmapDecodeStream);
            } finally {
            }
        }
    }
}
