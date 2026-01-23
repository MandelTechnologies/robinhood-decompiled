package com.robinhood.utils.moshi.jsonadapter;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okio.Buffer;

/* compiled from: StackAmendingJsonAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/StackAmendingJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "Adapter", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StackAmendingJsonAdapterFactory implements JsonAdapter.Factory {
    public static final StackAmendingJsonAdapterFactory INSTANCE = new StackAmendingJsonAdapterFactory();

    private StackAmendingJsonAdapterFactory() {
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type2, Set<? extends Annotation> annotations, Moshi moshi) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonAdapter jsonAdapterNextAdapter = moshi.nextAdapter(this, type2, annotations);
        if (jsonAdapterNextAdapter == null) {
            return null;
        }
        return new Adapter(type2, jsonAdapterNextAdapter);
    }

    /* compiled from: StackAmendingJsonAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0015B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\r*\u00060\u0013j\u0002`\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/StackAmendingJsonAdapterFactory$Adapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "delegate", "<init>", "(Ljava/lang/reflect/Type;Lcom/squareup/moshi/JsonAdapter;)V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "rewriteForCrashlytics", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Companion", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Adapter<T> extends JsonAdapter<T> {
        private static final Regex REGEX = new Regex("\\d+");
        private final JsonAdapter<T> delegate;
        private final Type type;

        public Adapter(Type type2, JsonAdapter<T> delegate) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.type = type2;
            this.delegate = delegate;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public T fromJson(JsonReader reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            try {
                return this.delegate.fromJson(reader);
            } catch (JsonDataException e) {
                rewriteForCrashlytics(e);
                throw e;
            } catch (IllegalArgumentException e2) {
                rewriteForCrashlytics(e2);
                throw e2;
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter writer, T value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            this.delegate.toJson(writer, (JsonWriter) value);
        }

        public final void rewriteForCrashlytics(Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "<this>");
            StackTraceElement[] stackTrace = exc.getStackTrace();
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + 1];
            Intrinsics.checkNotNull(stackTrace);
            ArraysKt.copyInto$default(stackTrace, stackTraceElementArr, 1, 0, 0, 12, (Object) null);
            Buffer buffer = new Buffer();
            Regex regex = REGEX;
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String strHex = buffer.writeUtf8(regex.replace(message, "#")).writeUtf8(this.type.toString()).sha1().hex();
            Class<?> rawType = Types.getRawType(this.type);
            Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
            String name = rawType.getName();
            Intrinsics.checkNotNull(name);
            if (!StringsKt.startsWith$default(name, "com.robinhood", false, 2, (Object) null)) {
                name = "com.robinhood.fake." + name;
            }
            stackTraceElementArr[0] = new StackTraceElement(name, "fromJson_" + strHex, rawType.getSimpleName() + ".java", Math.abs(strHex.hashCode()));
            exc.setStackTrace(stackTraceElementArr);
        }
    }
}
