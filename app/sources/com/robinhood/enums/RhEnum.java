package com.robinhood.enums;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.enums.RhEnum;
import com.robinhood.utils.logging.CrashReporter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: RhEnum.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000*\u0018\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0000*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001\bR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/enums/RhEnum;", "E", "", "", "serverValue", "", "getServerValue", "()Ljava/lang/String;", "Converter", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface RhEnum<E extends Enum<E> & RhEnum<E>> {
    String getServerValue();

    /* compiled from: RhEnum.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0018\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u0004%&'(B\u0017\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0007J\u0019\u0010\u0014\u001a\u0004\u0018\u00018\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u001eJ\u0015\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0019J\u0010\u0010$\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000bH\u0004R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0003)*+¨\u0006,"}, m3636d2 = {"Lcom/robinhood/enums/RhEnum$Converter;", "E", "Lcom/robinhood/enums/RhEnum;", "", "", "values", "", "<init>", "([Ljava/lang/Enum;)V", "loggedUnrecognizedValues", "Ljava/util/concurrent/ConcurrentSkipListSet;", "", "clearLoggedUnrecognizedValues", "", "enumClass", "Ljava/lang/Class;", "getEnumClass", "()Ljava/lang/Class;", "mapping", "", "fromServerValue", "serverValue", "(Ljava/lang/String;)Ljava/lang/Enum;", "toServerValue", "enumValue", "(Ljava/lang/Enum;)Ljava/lang/String;", "toJson", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Enum;)V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Enum;", "convert", "logUnrecognizedValue", "Optional", "Required", "Defaulted", "UnrecognizedDefaultedEnumException", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/enums/RhEnum$Converter$Optional;", "Lcom/robinhood/enums/RhEnum$Converter$Required;", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static abstract class Converter<E extends Enum<E> & RhEnum<E>> {
        private final Class<E> enumClass;
        private final ConcurrentSkipListSet<String> loggedUnrecognizedValues;
        private final Map<String, E> mapping;

        /* compiled from: RhEnum.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[JsonReader.Token.values().length];
                try {
                    iArr[JsonReader.Token.NULL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Converter(Enum[] enumArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumArr);
        }

        /* JADX WARN: Incorrect types in method signature: ([TE;)V */
        /* JADX WARN: Multi-variable type inference failed */
        private Converter(Enum[] enumArr) {
            this.loggedUnrecognizedValues = new ConcurrentSkipListSet<>();
            Enum r0 = (Enum) ArraysKt.firstOrNull(enumArr);
            if (r0 != null) {
                Class<E> declaringClass = r0.getDeclaringClass();
                Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
                if (declaringClass != null) {
                    this.enumClass = declaringClass;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(enumArr.length), 16));
                    for (Object[] objArr : enumArr) {
                        linkedHashMap.put(((RhEnum) objArr).getServerValue(), objArr);
                    }
                    this.mapping = linkedHashMap;
                    return;
                }
            }
            throw new UnsupportedOperationException("RhEnum must define at least one constant");
        }

        public final void clearLoggedUnrecognizedValues() {
            this.loggedUnrecognizedValues.clear();
        }

        public final Class<E> getEnumClass() {
            return this.enumClass;
        }

        /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TE; */
        public Enum fromServerValue(String serverValue) {
            if (serverValue != null) {
                return (Enum) this.mapping.get(serverValue);
            }
            return null;
        }

        /* JADX WARN: Incorrect types in method signature: (TE;)Ljava/lang/String; */
        /* JADX WARN: Multi-variable type inference failed */
        public String toServerValue(Enum enumValue) {
            if (enumValue != 0) {
                return ((RhEnum) enumValue).getServerValue();
            }
            return null;
        }

        /* JADX WARN: Incorrect types in method signature: (Lcom/squareup/moshi/JsonWriter;TE;)V */
        /* JADX WARN: Multi-variable type inference failed */
        public final void toJson(JsonWriter writer, Enum value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            if (value == 0) {
                writer.nullValue();
            } else {
                writer.value(((RhEnum) value).getServerValue());
            }
        }

        /* JADX WARN: Incorrect return type in method signature: (Lcom/squareup/moshi/JsonReader;)TE; */
        public final Enum fromJson(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            JsonReader.Token tokenPeek = reader.peek();
            if ((tokenPeek == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tokenPeek.ordinal()]) == 1) {
                return (Enum) reader.nextNull();
            }
            return fromServerValue(reader.nextString());
        }

        /* JADX WARN: Incorrect types in method signature: (TE;)Ljava/lang/String; */
        /* JADX WARN: Multi-variable type inference failed */
        public final String convert(Enum value) {
            String serverValue;
            return (value == 0 || (serverValue = ((RhEnum) value).getServerValue()) == null) ? "null" : serverValue;
        }

        protected final void logUnrecognizedValue(String serverValue) {
            Intrinsics.checkNotNullParameter(serverValue, "serverValue");
            if (this.loggedUnrecognizedValues.add(serverValue)) {
                UnrecognizedDefaultedEnumException unrecognizedDefaultedEnumException = new UnrecognizedDefaultedEnumException("Received an unrecognized enum: \"" + serverValue + "\" for " + getClass());
                StackTraceElement[] stackTrace = unrecognizedDefaultedEnumException.getStackTrace();
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + 1];
                Intrinsics.checkNotNull(stackTrace);
                ArraysKt.copyInto$default(stackTrace, stackTraceElementArr, 1, 0, 0, 12, (Object) null);
                stackTraceElementArr[0] = new StackTraceElement(getClass().getName(), "fromServerValue_" + serverValue, null, 1);
                unrecognizedDefaultedEnumException.setStackTrace(stackTraceElementArr);
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, unrecognizedDefaultedEnumException, false, null, 4, null);
            }
        }

        /* compiled from: RhEnum.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0018\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00022\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/enums/RhEnum$Converter$Optional;", "E", "Lcom/robinhood/enums/RhEnum;", "", "Lcom/robinhood/enums/RhEnum$Converter;", "values", "", "logUnrecognizedValue", "", "<init>", "([Ljava/lang/Enum;Z)V", "fromServerValue", "serverValue", "", "(Ljava/lang/String;)Ljava/lang/Enum;", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static class Optional<E extends Enum<E> & RhEnum<E>> extends Converter<E> {
            private final boolean logUnrecognizedValue;

            public /* synthetic */ Optional(Enum[] enumArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(enumArr, (i & 2) != 0 ? false : z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: ([TE;Z)V */
            public Optional(Enum[] values, boolean z) {
                super(values, null);
                Intrinsics.checkNotNullParameter(values, "values");
                this.logUnrecognizedValue = z;
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TE; */
            @Override // com.robinhood.enums.RhEnum.Converter
            public Enum fromServerValue(String serverValue) {
                if (serverValue == null) {
                    return null;
                }
                Enum enumFromServerValue = super.fromServerValue(serverValue);
                if (enumFromServerValue != null) {
                    return enumFromServerValue;
                }
                if (this.logUnrecognizedValue) {
                    logUnrecognizedValue(serverValue);
                }
                return null;
            }
        }

        /* compiled from: RhEnum.kt */
        @EnumConstantsWillNotChange
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0018\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00018\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/enums/RhEnum$Converter$Required;", "E", "Lcom/robinhood/enums/RhEnum;", "", "Lcom/robinhood/enums/RhEnum$Converter;", "values", "", "<init>", "([Ljava/lang/Enum;)V", "fromServerValue", "serverValue", "", "(Ljava/lang/String;)Ljava/lang/Enum;", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static class Required<E extends Enum<E> & RhEnum<E>> extends Converter<E> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: ([TE;)V */
            public Required(Enum[] values) {
                super(values, null);
                Intrinsics.checkNotNullParameter(values, "values");
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TE; */
            @Override // com.robinhood.enums.RhEnum.Converter
            public Enum fromServerValue(String serverValue) {
                if (serverValue == null) {
                    return null;
                }
                Enum enumFromServerValue = super.fromServerValue(serverValue);
                if (enumFromServerValue != null) {
                    return enumFromServerValue;
                }
                throw new EnumConstantNotPresentException(getEnumClass(), serverValue);
            }
        }

        /* compiled from: RhEnum.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0018\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B'\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012R\u0013\u0010\u0007\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "E", "Lcom/robinhood/enums/RhEnum;", "", "Lcom/robinhood/enums/RhEnum$Converter;", "values", "", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "logUnrecognizedValue", "", "<init>", "([Ljava/lang/Enum;Ljava/lang/Enum;Z)V", "getDefault", "()Ljava/lang/Enum;", "Ljava/lang/Enum;", "fromServerValue", "serverValue", "", "(Ljava/lang/String;)Ljava/lang/Enum;", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static class Defaulted<E extends Enum<E> & RhEnum<E>> extends Converter<E> {

            /* JADX INFO: Incorrect field signature: TE; */
            private final Enum default;
            private final boolean logUnrecognizedValue;

            public /* synthetic */ Defaulted(Enum[] enumArr, Enum r2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(enumArr, r2, (i & 4) != 0 ? true : z);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TE; */
            public final Enum getDefault() {
                return this.default;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: ([TE;TE;Z)V */
            public Defaulted(Enum[] values, Enum r3, boolean z) {
                super(values, null);
                Intrinsics.checkNotNullParameter(values, "values");
                Intrinsics.checkNotNullParameter(r3, "default");
                this.default = r3;
                this.logUnrecognizedValue = z;
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TE; */
            @Override // com.robinhood.enums.RhEnum.Converter
            public Enum fromServerValue(String serverValue) {
                if (serverValue == null) {
                    return null;
                }
                Enum enumFromServerValue = super.fromServerValue(serverValue);
                if (enumFromServerValue == null) {
                    enumFromServerValue = this.default;
                    if (this.logUnrecognizedValue) {
                        logUnrecognizedValue(serverValue);
                    }
                }
                return enumFromServerValue;
            }
        }

        /* compiled from: RhEnum.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/enums/RhEnum$Converter$UnrecognizedDefaultedEnumException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "msg", "", "<init>", "(Ljava/lang/String;)V", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static final class UnrecognizedDefaultedEnumException extends Exception {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnrecognizedDefaultedEnumException(String msg) {
                super(msg);
                Intrinsics.checkNotNullParameter(msg, "msg");
            }
        }
    }
}
