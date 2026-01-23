package com.robinhood.enums.moshi;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.enums.RhEnum;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhEnumJsonAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0005*\u0006\u0012\u0002\b\u00030\u000eH\u0002¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/enums/moshi/RhEnumJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "extractCompanionTypeAdapter", "Ljava/lang/Class;", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class RhEnumJsonAdapterFactory implements JsonAdapter.Factory {
    public static final RhEnumJsonAdapterFactory INSTANCE = new RhEnumJsonAdapterFactory();

    private RhEnumJsonAdapterFactory() {
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Class<?> rawType = Types.getRawType(type2);
        Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
        if (!RhEnum.class.isAssignableFrom(rawType)) {
            return null;
        }
        Class<?> superclass = rawType.getSuperclass();
        if (Intrinsics.areEqual(superclass, Enum.class)) {
            superclass = rawType;
        }
        Intrinsics.checkNotNull(superclass, "null cannot be cast to non-null type java.lang.Class<*>");
        if (!superclass.isEnum()) {
            throw new UnsupportedOperationException(rawType + " must be an Enum if it implements RhEnum");
        }
        return extractCompanionTypeAdapter(superclass);
    }

    private final JsonAdapter<?> extractCompanionTypeAdapter(Class<?> cls) throws IllegalAccessException, IllegalArgumentException {
        try {
            Object obj = cls.getDeclaredField("Companion").get(null);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.robinhood.enums.RhEnum.Converter<com.robinhood.enums.RhEnum<*>>");
            final RhEnum.Converter converter = (RhEnum.Converter) obj;
            return new JsonAdapter<RhEnum<?>>() { // from class: com.robinhood.enums.moshi.RhEnumJsonAdapterFactory.extractCompanionTypeAdapter.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.moshi.JsonAdapter
                public RhEnum<?> fromJson(JsonReader reader) {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    return (RhEnum) converter.fromJson(reader);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.squareup.moshi.JsonAdapter
                public void toJson(JsonWriter writer, RhEnum<?> value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    converter.toJson(writer, (Enum) value);
                }
            };
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException("Failed to extract RhEnum json adapter from companion", e);
        }
    }
}
