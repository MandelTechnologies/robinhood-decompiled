package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.ArkoseLabsEventData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ArkoseLabsEventData.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003$%&BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016JB\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData;", "Lcom/squareup/wire/Message;", "", "duration_ms", "", "error_message", "", "error_type", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$ErrorType;", "event_type", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "duration_ms_double", "unknownFields", "Lokio/ByteString;", "<init>", "(JLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$ErrorType;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;JLokio/ByteString;)V", "getDuration_ms$annotations", "()V", "getDuration_ms", "()J", "getError_message", "()Ljava/lang/String;", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$ErrorType;", "getEvent_type", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "getDuration_ms_double", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ErrorType", "EventType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ArkoseLabsEventData extends Message {

    @JvmField
    public static final ProtoAdapter<ArkoseLabsEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "durationMs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final long duration_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "durationMsDouble", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final long duration_ms_double;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String error_message;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ArkoseLabsEventData$ErrorType#ADAPTER", jsonName = "errorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ErrorType error_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ArkoseLabsEventData$EventType#ADAPTER", jsonName = "eventType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final EventType event_type;

    public ArkoseLabsEventData() {
        this(0L, null, null, null, 0L, null, 63, null);
    }

    @Deprecated
    public static /* synthetic */ void getDuration_ms$annotations() {
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24022newBuilder();
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public /* synthetic */ ArkoseLabsEventData(long j, String str, ErrorType errorType, EventType eventType, long j2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ErrorType.ERROR_TYPE_UNSPECIFIED : errorType, (i & 8) != 0 ? EventType.EVENT_TYPE_UNSPECIFIED : eventType, (i & 16) != 0 ? 0L : j2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ErrorType getError_type() {
        return this.error_type;
    }

    public final EventType getEvent_type() {
        return this.event_type;
    }

    public final long getDuration_ms_double() {
        return this.duration_ms_double;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArkoseLabsEventData(long j, String error_message, ErrorType error_type, EventType event_type, long j2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.duration_ms = j;
        this.error_message = error_message;
        this.error_type = error_type;
        this.event_type = event_type;
        this.duration_ms_double = j2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24022newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ArkoseLabsEventData)) {
            return false;
        }
        ArkoseLabsEventData arkoseLabsEventData = (ArkoseLabsEventData) other;
        return Intrinsics.areEqual(unknownFields(), arkoseLabsEventData.unknownFields()) && this.duration_ms == arkoseLabsEventData.duration_ms && Intrinsics.areEqual(this.error_message, arkoseLabsEventData.error_message) && this.error_type == arkoseLabsEventData.error_type && this.event_type == arkoseLabsEventData.event_type && this.duration_ms_double == arkoseLabsEventData.duration_ms_double;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + Long.hashCode(this.duration_ms)) * 37) + this.error_message.hashCode()) * 37) + this.error_type.hashCode()) * 37) + this.event_type.hashCode()) * 37) + Long.hashCode(this.duration_ms_double);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("duration_ms=" + this.duration_ms);
        arrayList.add("error_message=" + Internal.sanitize(this.error_message));
        arrayList.add("error_type=" + this.error_type);
        arrayList.add("event_type=" + this.event_type);
        arrayList.add("duration_ms_double=" + this.duration_ms_double);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ArkoseLabsEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ArkoseLabsEventData copy$default(ArkoseLabsEventData arkoseLabsEventData, long j, String str, ErrorType errorType, EventType eventType, long j2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            j = arkoseLabsEventData.duration_ms;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = arkoseLabsEventData.error_message;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            errorType = arkoseLabsEventData.error_type;
        }
        ErrorType errorType2 = errorType;
        if ((i & 8) != 0) {
            eventType = arkoseLabsEventData.event_type;
        }
        return arkoseLabsEventData.copy(j3, str2, errorType2, eventType, (i & 16) != 0 ? arkoseLabsEventData.duration_ms_double : j2, (i & 32) != 0 ? arkoseLabsEventData.unknownFields() : byteString);
    }

    public final ArkoseLabsEventData copy(long duration_ms, String error_message, ErrorType error_type, EventType event_type, long duration_ms_double, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ArkoseLabsEventData(duration_ms, error_message, error_type, event_type, duration_ms_double, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ArkoseLabsEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ArkoseLabsEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ArkoseLabsEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ArkoseLabsEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDuration_ms() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.getDuration_ms()));
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getError_message());
                }
                if (value.getError_type() != ArkoseLabsEventData.ErrorType.ERROR_TYPE_UNSPECIFIED) {
                    size += ArkoseLabsEventData.ErrorType.ADAPTER.encodedSizeWithTag(3, value.getError_type());
                }
                if (value.getEvent_type() != ArkoseLabsEventData.EventType.EVENT_TYPE_UNSPECIFIED) {
                    size += ArkoseLabsEventData.EventType.ADAPTER.encodedSizeWithTag(4, value.getEvent_type());
                }
                return value.getDuration_ms_double() != 0 ? size + ProtoAdapter.INT64.encodedSizeWithTag(5, Long.valueOf(value.getDuration_ms_double())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ArkoseLabsEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDuration_ms() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getDuration_ms()));
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getError_message());
                }
                if (value.getError_type() != ArkoseLabsEventData.ErrorType.ERROR_TYPE_UNSPECIFIED) {
                    ArkoseLabsEventData.ErrorType.ADAPTER.encodeWithTag(writer, 3, (int) value.getError_type());
                }
                if (value.getEvent_type() != ArkoseLabsEventData.EventType.EVENT_TYPE_UNSPECIFIED) {
                    ArkoseLabsEventData.EventType.ADAPTER.encodeWithTag(writer, 4, (int) value.getEvent_type());
                }
                if (value.getDuration_ms_double() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 5, (int) Long.valueOf(value.getDuration_ms_double()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ArkoseLabsEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDuration_ms_double() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 5, (int) Long.valueOf(value.getDuration_ms_double()));
                }
                if (value.getEvent_type() != ArkoseLabsEventData.EventType.EVENT_TYPE_UNSPECIFIED) {
                    ArkoseLabsEventData.EventType.ADAPTER.encodeWithTag(writer, 4, (int) value.getEvent_type());
                }
                if (value.getError_type() != ArkoseLabsEventData.ErrorType.ERROR_TYPE_UNSPECIFIED) {
                    ArkoseLabsEventData.ErrorType.ADAPTER.encodeWithTag(writer, 3, (int) value.getError_type());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getError_message());
                }
                if (value.getDuration_ms() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getDuration_ms()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ArkoseLabsEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArkoseLabsEventData.ErrorType errorType = ArkoseLabsEventData.ErrorType.ERROR_TYPE_UNSPECIFIED;
                ArkoseLabsEventData.EventType eventType = ArkoseLabsEventData.EventType.EVENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                ArkoseLabsEventData.EventType eventTypeDecode = eventType;
                String strDecode = "";
                ArkoseLabsEventData.ErrorType errorTypeDecode = errorType;
                long jLongValue2 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ArkoseLabsEventData(jLongValue2, strDecode, errorTypeDecode, eventTypeDecode, jLongValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            errorTypeDecode = ArkoseLabsEventData.ErrorType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 4) {
                        try {
                            eventTypeDecode = ArkoseLabsEventData.EventType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 5) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ArkoseLabsEventData redact(ArkoseLabsEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ArkoseLabsEventData.copy$default(value, 0L, null, null, null, 0L, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ArkoseLabsEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$ErrorType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ERROR_TYPE_UNSPECIFIED", "UNKNOWN", "TIMEOUT", "JAVASCRIPT_ERROR", "CLIENT_NOT_INSTANTIATED", "USER_OUT_OF_ATTEMPTS", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ErrorType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ErrorType> ADAPTER;
        public static final ErrorType CLIENT_NOT_INSTANTIATED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ErrorType ERROR_TYPE_UNSPECIFIED;
        public static final ErrorType JAVASCRIPT_ERROR;
        public static final ErrorType TIMEOUT;
        public static final ErrorType UNKNOWN;
        public static final ErrorType USER_OUT_OF_ATTEMPTS;
        private final int value;

        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{ERROR_TYPE_UNSPECIFIED, UNKNOWN, TIMEOUT, JAVASCRIPT_ERROR, CLIENT_NOT_INSTANTIATED, USER_OUT_OF_ATTEMPTS};
        }

        @JvmStatic
        public static final ErrorType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ErrorType> getEntries() {
            return $ENTRIES;
        }

        private ErrorType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ErrorType errorType = new ErrorType("ERROR_TYPE_UNSPECIFIED", 0, 0);
            ERROR_TYPE_UNSPECIFIED = errorType;
            UNKNOWN = new ErrorType("UNKNOWN", 1, 1);
            TIMEOUT = new ErrorType("TIMEOUT", 2, 2);
            JAVASCRIPT_ERROR = new ErrorType("JAVASCRIPT_ERROR", 3, 3);
            CLIENT_NOT_INSTANTIATED = new ErrorType("CLIENT_NOT_INSTANTIATED", 4, 4);
            USER_OUT_OF_ATTEMPTS = new ErrorType("USER_OUT_OF_ATTEMPTS", 5, 5);
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ErrorType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ErrorType>(orCreateKotlinClass, syntax, errorType) { // from class: com.robinhood.rosetta.eventlogging.ArkoseLabsEventData$ErrorType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ArkoseLabsEventData.ErrorType fromValue(int value) {
                    return ArkoseLabsEventData.ErrorType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ArkoseLabsEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$ErrorType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$ErrorType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ErrorType fromValue(int value) {
                if (value == 0) {
                    return ErrorType.ERROR_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return ErrorType.UNKNOWN;
                }
                if (value == 2) {
                    return ErrorType.TIMEOUT;
                }
                if (value == 3) {
                    return ErrorType.JAVASCRIPT_ERROR;
                }
                if (value == 4) {
                    return ErrorType.CLIENT_NOT_INSTANTIATED;
                }
                if (value != 5) {
                    return null;
                }
                return ErrorType.USER_OUT_OF_ATTEMPTS;
            }
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ArkoseLabsEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_TYPE_UNSPECIFIED", "LOGIN_EVENT", "SIGNUP_EVENT", "ERROR_EVENT", "READY_EVENT", "RESET_EVENT", "HIDE_EVENT", "SUPPRESS_EVENT", "SHOW_EVENT", "SHOWN_EVENT", "COMPLETED_EVENT", "FAILED_EVENT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EventType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EventType> ADAPTER;
        public static final EventType COMPLETED_EVENT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EventType ERROR_EVENT;
        public static final EventType EVENT_TYPE_UNSPECIFIED;
        public static final EventType FAILED_EVENT;
        public static final EventType HIDE_EVENT;
        public static final EventType LOGIN_EVENT;
        public static final EventType READY_EVENT;
        public static final EventType RESET_EVENT;
        public static final EventType SHOWN_EVENT;
        public static final EventType SHOW_EVENT;
        public static final EventType SIGNUP_EVENT;
        public static final EventType SUPPRESS_EVENT;
        private final int value;

        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{EVENT_TYPE_UNSPECIFIED, LOGIN_EVENT, SIGNUP_EVENT, ERROR_EVENT, READY_EVENT, RESET_EVENT, HIDE_EVENT, SUPPRESS_EVENT, SHOW_EVENT, SHOWN_EVENT, COMPLETED_EVENT, FAILED_EVENT};
        }

        @JvmStatic
        public static final EventType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EventType> getEntries() {
            return $ENTRIES;
        }

        private EventType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EventType eventType = new EventType("EVENT_TYPE_UNSPECIFIED", 0, 0);
            EVENT_TYPE_UNSPECIFIED = eventType;
            LOGIN_EVENT = new EventType("LOGIN_EVENT", 1, 1);
            SIGNUP_EVENT = new EventType("SIGNUP_EVENT", 2, 2);
            ERROR_EVENT = new EventType("ERROR_EVENT", 3, 3);
            READY_EVENT = new EventType("READY_EVENT", 4, 4);
            RESET_EVENT = new EventType("RESET_EVENT", 5, 5);
            HIDE_EVENT = new EventType("HIDE_EVENT", 6, 6);
            SUPPRESS_EVENT = new EventType("SUPPRESS_EVENT", 7, 7);
            SHOW_EVENT = new EventType("SHOW_EVENT", 8, 8);
            SHOWN_EVENT = new EventType("SHOWN_EVENT", 9, 9);
            COMPLETED_EVENT = new EventType("COMPLETED_EVENT", 10, 10);
            FAILED_EVENT = new EventType("FAILED_EVENT", 11, 11);
            EventType[] eventTypeArr$values = $values();
            $VALUES = eventTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EventType>(orCreateKotlinClass, syntax, eventType) { // from class: com.robinhood.rosetta.eventlogging.ArkoseLabsEventData$EventType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ArkoseLabsEventData.EventType fromValue(int value) {
                    return ArkoseLabsEventData.EventType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ArkoseLabsEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData$EventType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EventType fromValue(int value) {
                switch (value) {
                    case 0:
                        return EventType.EVENT_TYPE_UNSPECIFIED;
                    case 1:
                        return EventType.LOGIN_EVENT;
                    case 2:
                        return EventType.SIGNUP_EVENT;
                    case 3:
                        return EventType.ERROR_EVENT;
                    case 4:
                        return EventType.READY_EVENT;
                    case 5:
                        return EventType.RESET_EVENT;
                    case 6:
                        return EventType.HIDE_EVENT;
                    case 7:
                        return EventType.SUPPRESS_EVENT;
                    case 8:
                        return EventType.SHOW_EVENT;
                    case 9:
                        return EventType.SHOWN_EVENT;
                    case 10:
                        return EventType.COMPLETED_EVENT;
                    case 11:
                        return EventType.FAILED_EVENT;
                    default:
                        return null;
                }
            }
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }
}
