package com.robinhood.enums.moshi;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.enums.RhEnum;
import com.robinhood.enums.RhIntEnum;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: EnumJsonAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/enums/moshi/EnumJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class EnumJsonAdapterFactory implements JsonAdapter.Factory {
    public static final EnumJsonAdapterFactory INSTANCE = new EnumJsonAdapterFactory();

    private EnumJsonAdapterFactory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Enum create$lambda$0(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
        return (Enum) obj;
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Class<?> rawType = Types.getRawType(type2);
        Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
        if (!rawType.isEnum() || RhEnum.class.isAssignableFrom(rawType) || RhIntEnum.class.isAssignableFrom(rawType)) {
            return null;
        }
        Object[] enumConstants = rawType.getEnumConstants();
        if (enumConstants == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Sequence map = SequencesKt.map(ArraysKt.asSequence(enumConstants), new Function1() { // from class: com.robinhood.enums.moshi.EnumJsonAdapterFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EnumJsonAdapterFactory.create$lambda$0(obj);
            }
        });
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : map) {
            String strName = ((Enum) obj).name();
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strName.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            linkedHashMap.put(lowerCase, obj);
        }
        return new JsonAdapter<Enum<?>>() { // from class: com.robinhood.enums.moshi.EnumJsonAdapterFactory.create.1
            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter writer, Enum<?> value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (value == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                String strName2 = value.name();
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase2 = strName2.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                writer.value(lowerCase2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.moshi.JsonAdapter
            public Enum<?> fromJson(JsonReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return linkedHashMap.get(reader.nextString());
            }
        }.nullSafe();
    }
}
