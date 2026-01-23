package com.robinhood.networking.util;

import com.robinhood.utils.extensions.Uuids;
import com.squareup.moshi.Types;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* compiled from: UuidStringConverterFactory.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0011R\"\u0010\u0004\u001a\u0016\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/networking/util/UuidStringConverterFactory;", "Lretrofit2/Converter$Factory;", "<init>", "()V", "CONVERTER", "Lretrofit2/Converter;", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "", "stringConverter", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "lib-networking_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class UuidStringConverterFactory extends Converter.Factory {
    public static final UuidStringConverterFactory INSTANCE = new UuidStringConverterFactory();
    private static final Converter<UUID, String> CONVERTER = new Converter() { // from class: com.robinhood.networking.util.UuidStringConverterFactory$CONVERTER$1
        @Override // retrofit2.Converter
        public final String convert(UUID p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Uuids.safeToString(p0);
        }
    };

    private UuidStringConverterFactory() {
    }

    @Override // retrofit2.Converter.Factory
    public Converter<UUID, String> stringConverter(Type type2, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Class<?> rawType = Types.getRawType(type2);
        Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
        if (Intrinsics.areEqual(rawType, UUID.class)) {
            return CONVERTER;
        }
        return null;
    }
}
