package com.robinhood.enums.retrofit;

import android.annotation.SuppressLint;
import com.robinhood.enums.RhEnum;
import com.robinhood.enums.RhEnum2;
import com.squareup.moshi.Types;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* compiled from: RhEnumConverterFactory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0004\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/enums/retrofit/RhEnumConverterFactory;", "Lretrofit2/Converter$Factory;", "<init>", "()V", "stringConverter", "Lretrofit2/Converter;", "", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "FakeEnum", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class RhEnumConverterFactory extends Converter.Factory {
    public static final RhEnumConverterFactory INSTANCE = new RhEnumConverterFactory();

    private RhEnumConverterFactory() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RhEnumConverterFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0083\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/enums/retrofit/RhEnumConverterFactory$FakeEnum;", "Lcom/robinhood/enums/RhEnum;", "", "<init>", "(Ljava/lang/String;I)V", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SuppressLint({"RhEnumCompanionIssue"})
    /* loaded from: classes15.dex */
    private static final class FakeEnum implements RhEnum<FakeEnum> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FakeEnum[] $VALUES;

        private static final /* synthetic */ FakeEnum[] $values() {
            return new FakeEnum[0];
        }

        static {
            FakeEnum[] fakeEnumArr$values = $values();
            $VALUES = fakeEnumArr$values;
            $ENTRIES = EnumEntries2.enumEntries(fakeEnumArr$values);
        }

        public static EnumEntries<FakeEnum> getEntries() {
            return $ENTRIES;
        }

        private FakeEnum(String str, int i) {
        }

        public static FakeEnum valueOf(String str) {
            return (FakeEnum) Enum.valueOf(FakeEnum.class, str);
        }

        public static FakeEnum[] values() {
            return (FakeEnum[]) $VALUES.clone();
        }
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, String> stringConverter(Type type2, Annotation[] annotations, Retrofit retrofit) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Class<?> rawType = Types.getRawType(type2);
        Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
        if (!rawType.isEnum() || !RhEnum.class.isAssignableFrom(rawType)) {
            return null;
        }
        try {
            Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<com.robinhood.enums.retrofit.RhEnumConverterFactory.FakeEnum>");
            final RhEnum.Converter converter = RhEnum2.getConverter(rawType);
            Intrinsics.checkNotNull(converter, "null cannot be cast to non-null type com.robinhood.enums.RhEnum.Converter<kotlin.Enum<*>>");
            return new Converter() { // from class: com.robinhood.enums.retrofit.RhEnumConverterFactory.stringConverter.1
                @Override // retrofit2.Converter
                public final String convert(Enum<?> r2) {
                    return converter.convert(r2);
                }
            };
        } catch (ReflectiveOperationException e) {
            throw new UnsupportedOperationException("Could not retrieve converter for " + rawType, e);
        }
    }
}
