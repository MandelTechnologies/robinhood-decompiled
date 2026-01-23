package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.ArkoseLabEnforcementEvent;
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

/* compiled from: ArkoseLabEnforcementEvent.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEvent;", "Lcom/squareup/wire/Message;", "", "success", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "error_type", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEvent$ErrorType;", "duration_ms", "", "error_message", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEvent$ErrorType;JLjava/lang/String;Lokio/ByteString;)V", "getSuccess", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEvent$ErrorType;", "getDuration_ms", "()J", "getError_message", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ErrorType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ArkoseLabEnforcementEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ArkoseLabEnforcementEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "durationMs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long duration_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String error_message;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ArkoseLabEnforcementEvent$ErrorType#ADAPTER", jsonName = "errorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ErrorType error_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Boolean success;

    public ArkoseLabEnforcementEvent() {
        this(null, null, 0L, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24020newBuilder();
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public /* synthetic */ ArkoseLabEnforcementEvent(Boolean r1, ErrorType errorType, long j, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r1, (i & 2) != 0 ? ErrorType.UNKNOWN : errorType, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ErrorType getError_type() {
        return this.error_type;
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    public final String getError_message() {
        return this.error_message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArkoseLabEnforcementEvent(Boolean success, ErrorType error_type, long j, String error_message, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.success = success;
        this.error_type = error_type;
        this.duration_ms = j;
        this.error_message = error_message;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24020newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ArkoseLabEnforcementEvent)) {
            return false;
        }
        ArkoseLabEnforcementEvent arkoseLabEnforcementEvent = (ArkoseLabEnforcementEvent) other;
        return Intrinsics.areEqual(unknownFields(), arkoseLabEnforcementEvent.unknownFields()) && this.success == arkoseLabEnforcementEvent.success && this.error_type == arkoseLabEnforcementEvent.error_type && this.duration_ms == arkoseLabEnforcementEvent.duration_ms && Intrinsics.areEqual(this.error_message, arkoseLabEnforcementEvent.error_message);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.success.hashCode()) * 37) + this.error_type.hashCode()) * 37) + Long.hashCode(this.duration_ms)) * 37) + this.error_message.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("success=" + this.success);
        arrayList.add("error_type=" + this.error_type);
        arrayList.add("duration_ms=" + this.duration_ms);
        arrayList.add("error_message=" + Internal.sanitize(this.error_message));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ArkoseLabEnforcementEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ArkoseLabEnforcementEvent copy$default(ArkoseLabEnforcementEvent arkoseLabEnforcementEvent, Boolean r1, ErrorType errorType, long j, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            r1 = arkoseLabEnforcementEvent.success;
        }
        if ((i & 2) != 0) {
            errorType = arkoseLabEnforcementEvent.error_type;
        }
        if ((i & 4) != 0) {
            j = arkoseLabEnforcementEvent.duration_ms;
        }
        if ((i & 8) != 0) {
            str = arkoseLabEnforcementEvent.error_message;
        }
        if ((i & 16) != 0) {
            byteString = arkoseLabEnforcementEvent.unknownFields();
        }
        long j2 = j;
        return arkoseLabEnforcementEvent.copy(r1, errorType, j2, str, byteString);
    }

    public final ArkoseLabEnforcementEvent copy(Boolean success, ErrorType error_type, long duration_ms, String error_message, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ArkoseLabEnforcementEvent(success, error_type, duration_ms, error_message, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ArkoseLabEnforcementEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ArkoseLabEnforcementEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ArkoseLabEnforcementEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ArkoseLabEnforcementEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSuccess() != Boolean.BOOLEAN_UNSPECIFIED) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(1, value.getSuccess());
                }
                if (value.getError_type() != ArkoseLabEnforcementEvent.ErrorType.UNKNOWN) {
                    size += ArkoseLabEnforcementEvent.ErrorType.ADAPTER.encodedSizeWithTag(2, value.getError_type());
                }
                if (value.getDuration_ms() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(value.getDuration_ms()));
                }
                return !Intrinsics.areEqual(value.getError_message(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getError_message()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ArkoseLabEnforcementEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSuccess() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 1, (int) value.getSuccess());
                }
                if (value.getError_type() != ArkoseLabEnforcementEvent.ErrorType.UNKNOWN) {
                    ArkoseLabEnforcementEvent.ErrorType.ADAPTER.encodeWithTag(writer, 2, (int) value.getError_type());
                }
                if (value.getDuration_ms() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getDuration_ms()));
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getError_message());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ArkoseLabEnforcementEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getError_message());
                }
                if (value.getDuration_ms() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getDuration_ms()));
                }
                if (value.getError_type() != ArkoseLabEnforcementEvent.ErrorType.UNKNOWN) {
                    ArkoseLabEnforcementEvent.ErrorType.ADAPTER.encodeWithTag(writer, 2, (int) value.getError_type());
                }
                if (value.getSuccess() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 1, (int) value.getSuccess());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ArkoseLabEnforcementEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Boolean booleanDecode = Boolean.BOOLEAN_UNSPECIFIED;
                ArkoseLabEnforcementEvent.ErrorType errorType = ArkoseLabEnforcementEvent.ErrorType.UNKNOWN;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                long jLongValue = 0;
                ArkoseLabEnforcementEvent.ErrorType errorTypeDecode = errorType;
                while (true) {
                    Boolean r1 = booleanDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ArkoseLabEnforcementEvent(r1, errorTypeDecode, jLongValue, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                booleanDecode = Boolean.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            try {
                                errorTypeDecode = ArkoseLabEnforcementEvent.ErrorType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 3) {
                            jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ArkoseLabEnforcementEvent redact(ArkoseLabEnforcementEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ArkoseLabEnforcementEvent.copy$default(value, null, null, 0L, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ArkoseLabEnforcementEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEvent$ErrorType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "TIMEOUT", "JAVASCRIPT_ERROR", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ErrorType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ErrorType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ErrorType JAVASCRIPT_ERROR;
        public static final ErrorType TIMEOUT;
        public static final ErrorType UNKNOWN;
        private final int value;

        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{UNKNOWN, TIMEOUT, JAVASCRIPT_ERROR};
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
            final ErrorType errorType = new ErrorType("UNKNOWN", 0, 0);
            UNKNOWN = errorType;
            TIMEOUT = new ErrorType("TIMEOUT", 1, 1);
            JAVASCRIPT_ERROR = new ErrorType("JAVASCRIPT_ERROR", 2, 2);
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ErrorType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ErrorType>(orCreateKotlinClass, syntax, errorType) { // from class: com.robinhood.rosetta.eventlogging.ArkoseLabEnforcementEvent$ErrorType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ArkoseLabEnforcementEvent.ErrorType fromValue(int value) {
                    return ArkoseLabEnforcementEvent.ErrorType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ArkoseLabEnforcementEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEvent$ErrorType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEvent$ErrorType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ErrorType fromValue(int value) {
                if (value == 0) {
                    return ErrorType.UNKNOWN;
                }
                if (value == 1) {
                    return ErrorType.TIMEOUT;
                }
                if (value != 2) {
                    return null;
                }
                return ErrorType.JAVASCRIPT_ERROR;
            }
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }
}
