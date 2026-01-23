package com.robinhood.g11n.converterfactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* compiled from: LocaleStringConverterFactory.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0011R\"\u0010\u0004\u001a\u0016\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/g11n/converterfactory/LocaleStringConverterFactory;", "Lretrofit2/Converter$Factory;", "<init>", "()V", "CONVERTER", "Lretrofit2/Converter;", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "", "stringConverter", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "lib-g11n_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class LocaleStringConverterFactory extends Converter.Factory {
    public static final LocaleStringConverterFactory INSTANCE = new LocaleStringConverterFactory();
    private static final Converter<Locale, String> CONVERTER = new Converter() { // from class: com.robinhood.g11n.converterfactory.LocaleStringConverterFactory$CONVERTER$1
        @Override // retrofit2.Converter
        public final String convert(Locale p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.toLanguageTag();
        }
    };

    private LocaleStringConverterFactory() {
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, String> stringConverter(Type type2, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (Intrinsics.areEqual(type2, Locale.class)) {
            return CONVERTER;
        }
        return null;
    }
}
