package com.robinhood.enums;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.enums.RhIntEnum;
import com.robinhood.utils.logging.CrashReporter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: RhIntEnum.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\u0018\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0000*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001\bR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/enums/RhIntEnum;", "E", "", "", "serverValue", "", "getServerValue", "()I", "Converter", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface RhIntEnum<E extends Enum<E> & RhIntEnum<E>> {
    int getServerValue();

    /* compiled from: RhIntEnum.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0018\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u0004\"#$%B\u0017\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010!R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0003&'(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/enums/RhIntEnum$Converter;", "E", "Lcom/robinhood/enums/RhIntEnum;", "", "", "values", "", "<init>", "([Ljava/lang/Enum;)V", "enumClass", "Ljava/lang/Class;", "getEnumClass", "()Ljava/lang/Class;", "mapping", "", "", "fromServerValue", "serverValue", "(Ljava/lang/Integer;)Ljava/lang/Enum;", "toServerValue", "enumValue", "(Ljava/lang/Enum;)Ljava/lang/Integer;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Enum;)V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Enum;", "convert", "(Ljava/lang/Enum;)I", "Optional", "Required", "Defaulted", "UnrecognizedDefaultedEnumException", "Lcom/robinhood/enums/RhIntEnum$Converter$Defaulted;", "Lcom/robinhood/enums/RhIntEnum$Converter$Optional;", "Lcom/robinhood/enums/RhIntEnum$Converter$Required;", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static abstract class Converter<E extends Enum<E> & RhIntEnum<E>> {
        private final Class<E> enumClass;
        private final Map<Integer, E> mapping;

        /* compiled from: RhIntEnum.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
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
            Enum r0 = (Enum) ArraysKt.firstOrNull(enumArr);
            if (r0 != null) {
                Class<E> declaringClass = r0.getDeclaringClass();
                Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
                if (declaringClass != null) {
                    this.enumClass = declaringClass;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(enumArr.length), 16));
                    for (Object[] objArr : enumArr) {
                        linkedHashMap.put(Integer.valueOf(((RhIntEnum) objArr).getServerValue()), objArr);
                    }
                    this.mapping = linkedHashMap;
                    return;
                }
            }
            throw new UnsupportedOperationException("RhIntEnum must define at least one constant");
        }

        public final Class<E> getEnumClass() {
            return this.enumClass;
        }

        /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TE; */
        public Enum fromServerValue(Integer serverValue) {
            if (serverValue != null) {
                return (Enum) this.mapping.get(Integer.valueOf(serverValue.intValue()));
            }
            return null;
        }

        /* JADX WARN: Incorrect types in method signature: (TE;)Ljava/lang/Integer; */
        /* JADX WARN: Multi-variable type inference failed */
        public Integer toServerValue(Enum enumValue) {
            if (enumValue != 0) {
                return Integer.valueOf(((RhIntEnum) enumValue).getServerValue());
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
                writer.value(Integer.valueOf(((RhIntEnum) value).getServerValue()));
            }
        }

        /* JADX WARN: Incorrect return type in method signature: (Lcom/squareup/moshi/JsonReader;)TE; */
        public final Enum fromJson(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            JsonReader.Token tokenPeek = reader.peek();
            if ((tokenPeek == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tokenPeek.ordinal()]) == 1) {
                return (Enum) reader.nextNull();
            }
            return fromServerValue(Integer.valueOf(reader.nextInt()));
        }

        /* JADX WARN: Incorrect types in method signature: (TE;)I */
        /* JADX WARN: Multi-variable type inference failed */
        public final int convert(Enum value) {
            if (value != 0) {
                return ((RhIntEnum) value).getServerValue();
            }
            return 0;
        }

        /* compiled from: RhIntEnum.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0018\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/enums/RhIntEnum$Converter$Optional;", "E", "Lcom/robinhood/enums/RhIntEnum;", "", "Lcom/robinhood/enums/RhIntEnum$Converter;", "values", "", "<init>", "([Ljava/lang/Enum;)V", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes15.dex */
        public static class Optional<E extends Enum<E> & RhIntEnum<E>> extends Converter<E> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: ([TE;)V */
            public Optional(Enum[] values) {
                super(values, null);
                Intrinsics.checkNotNullParameter(values, "values");
            }
        }

        /* compiled from: RhIntEnum.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0018\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00018\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/enums/RhIntEnum$Converter$Required;", "E", "Lcom/robinhood/enums/RhIntEnum;", "", "Lcom/robinhood/enums/RhIntEnum$Converter;", "values", "", "<init>", "([Ljava/lang/Enum;)V", "fromServerValue", "serverValue", "", "(Ljava/lang/Integer;)Ljava/lang/Enum;", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static class Required<E extends Enum<E> & RhIntEnum<E>> extends Converter<E> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: ([TE;)V */
            public Required(Enum[] values) {
                super(values, null);
                Intrinsics.checkNotNullParameter(values, "values");
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TE; */
            @Override // com.robinhood.enums.RhIntEnum.Converter
            public Enum fromServerValue(Integer serverValue) {
                if (serverValue == null) {
                    return null;
                }
                Enum enumFromServerValue = super.fromServerValue(serverValue);
                if (enumFromServerValue != null) {
                    return enumFromServerValue;
                }
                throw new EnumConstantNotPresentException(getEnumClass(), serverValue.toString());
            }
        }

        /* compiled from: RhIntEnum.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0018\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B'\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012R\u0013\u0010\u0007\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/enums/RhIntEnum$Converter$Defaulted;", "E", "Lcom/robinhood/enums/RhIntEnum;", "", "Lcom/robinhood/enums/RhIntEnum$Converter;", "values", "", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "logUnrecognizedValue", "", "<init>", "([Ljava/lang/Enum;Ljava/lang/Enum;Z)V", "getDefault", "()Ljava/lang/Enum;", "Ljava/lang/Enum;", "fromServerValue", "serverValue", "", "(Ljava/lang/Integer;)Ljava/lang/Enum;", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static class Defaulted<E extends Enum<E> & RhIntEnum<E>> extends Converter<E> {

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

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TE; */
            @Override // com.robinhood.enums.RhIntEnum.Converter
            public Enum fromServerValue(Integer serverValue) {
                if (serverValue == null) {
                    return null;
                }
                Enum enumFromServerValue = super.fromServerValue(serverValue);
                if (enumFromServerValue == null) {
                    enumFromServerValue = this.default;
                    if (this.logUnrecognizedValue) {
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
                return enumFromServerValue;
            }
        }

        /* compiled from: RhIntEnum.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/enums/RhIntEnum$Converter$UnrecognizedDefaultedEnumException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "msg", "", "<init>", "(Ljava/lang/String;)V", "lib-enums_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
