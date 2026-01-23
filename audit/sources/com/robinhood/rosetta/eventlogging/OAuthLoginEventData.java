package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.OAuthLoginEventData;
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

/* compiled from: OAuthLoginEventData.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003 !\"B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016J8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData;", "Lcom/squareup/wire/Message;", "", "duration_ms", "", "error_message", "", "error_type", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$ErrorType;", "event_type", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$EventType;", "unknownFields", "Lokio/ByteString;", "<init>", "(JLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$ErrorType;Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$EventType;Lokio/ByteString;)V", "getDuration_ms", "()J", "getError_message", "()Ljava/lang/String;", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$ErrorType;", "getEvent_type", "()Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$EventType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ErrorType", "EventType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OAuthLoginEventData extends Message {

    @JvmField
    public static final ProtoAdapter<OAuthLoginEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "durationMs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final long duration_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String error_message;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OAuthLoginEventData$ErrorType#ADAPTER", jsonName = "errorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ErrorType error_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OAuthLoginEventData$EventType#ADAPTER", jsonName = "eventType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final EventType event_type;

    public OAuthLoginEventData() {
        this(0L, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24416newBuilder();
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public /* synthetic */ OAuthLoginEventData(long j, String str, ErrorType errorType, EventType eventType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ErrorType.ERROR_TYPE_UNSPECIFIED : errorType, (i & 8) != 0 ? EventType.EVENT_TYPE_UNSPECIFIED : eventType, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ErrorType getError_type() {
        return this.error_type;
    }

    public final EventType getEvent_type() {
        return this.event_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OAuthLoginEventData(long j, String error_message, ErrorType error_type, EventType event_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.duration_ms = j;
        this.error_message = error_message;
        this.error_type = error_type;
        this.event_type = event_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24416newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OAuthLoginEventData)) {
            return false;
        }
        OAuthLoginEventData oAuthLoginEventData = (OAuthLoginEventData) other;
        return Intrinsics.areEqual(unknownFields(), oAuthLoginEventData.unknownFields()) && this.duration_ms == oAuthLoginEventData.duration_ms && Intrinsics.areEqual(this.error_message, oAuthLoginEventData.error_message) && this.error_type == oAuthLoginEventData.error_type && this.event_type == oAuthLoginEventData.event_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + Long.hashCode(this.duration_ms)) * 37) + this.error_message.hashCode()) * 37) + this.error_type.hashCode()) * 37) + this.event_type.hashCode();
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "OAuthLoginEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OAuthLoginEventData copy$default(OAuthLoginEventData oAuthLoginEventData, long j, String str, ErrorType errorType, EventType eventType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            j = oAuthLoginEventData.duration_ms;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = oAuthLoginEventData.error_message;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            errorType = oAuthLoginEventData.error_type;
        }
        ErrorType errorType2 = errorType;
        if ((i & 8) != 0) {
            eventType = oAuthLoginEventData.event_type;
        }
        EventType eventType2 = eventType;
        if ((i & 16) != 0) {
            byteString = oAuthLoginEventData.unknownFields();
        }
        return oAuthLoginEventData.copy(j2, str2, errorType2, eventType2, byteString);
    }

    public final OAuthLoginEventData copy(long duration_ms, String error_message, ErrorType error_type, EventType event_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OAuthLoginEventData(duration_ms, error_message, error_type, event_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OAuthLoginEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OAuthLoginEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OAuthLoginEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OAuthLoginEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDuration_ms() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.getDuration_ms()));
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getError_message());
                }
                if (value.getError_type() != OAuthLoginEventData.ErrorType.ERROR_TYPE_UNSPECIFIED) {
                    size += OAuthLoginEventData.ErrorType.ADAPTER.encodedSizeWithTag(3, value.getError_type());
                }
                return value.getEvent_type() != OAuthLoginEventData.EventType.EVENT_TYPE_UNSPECIFIED ? size + OAuthLoginEventData.EventType.ADAPTER.encodedSizeWithTag(4, value.getEvent_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OAuthLoginEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDuration_ms() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getDuration_ms()));
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getError_message());
                }
                if (value.getError_type() != OAuthLoginEventData.ErrorType.ERROR_TYPE_UNSPECIFIED) {
                    OAuthLoginEventData.ErrorType.ADAPTER.encodeWithTag(writer, 3, (int) value.getError_type());
                }
                if (value.getEvent_type() != OAuthLoginEventData.EventType.EVENT_TYPE_UNSPECIFIED) {
                    OAuthLoginEventData.EventType.ADAPTER.encodeWithTag(writer, 4, (int) value.getEvent_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OAuthLoginEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEvent_type() != OAuthLoginEventData.EventType.EVENT_TYPE_UNSPECIFIED) {
                    OAuthLoginEventData.EventType.ADAPTER.encodeWithTag(writer, 4, (int) value.getEvent_type());
                }
                if (value.getError_type() != OAuthLoginEventData.ErrorType.ERROR_TYPE_UNSPECIFIED) {
                    OAuthLoginEventData.ErrorType.ADAPTER.encodeWithTag(writer, 3, (int) value.getError_type());
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
            public OAuthLoginEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                OAuthLoginEventData.ErrorType errorTypeDecode = OAuthLoginEventData.ErrorType.ERROR_TYPE_UNSPECIFIED;
                OAuthLoginEventData.EventType eventType = OAuthLoginEventData.EventType.EVENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                long jLongValue = 0;
                OAuthLoginEventData.EventType eventTypeDecode = eventType;
                while (true) {
                    OAuthLoginEventData.ErrorType errorType = errorTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new OAuthLoginEventData(jLongValue, strDecode, errorType, eventTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                errorTypeDecode = OAuthLoginEventData.ErrorType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            try {
                                eventTypeDecode = OAuthLoginEventData.EventType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OAuthLoginEventData redact(OAuthLoginEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OAuthLoginEventData.copy$default(value, 0L, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OAuthLoginEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$ErrorType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ERROR_TYPE_UNSPECIFIED", "MISSING_OAUTH_PARAMS", "AUTHORIZE_SUBMIT_FAILURE", "PLAID_MISSING_APPLICATION_ID", "PLAID_ERROR_FETCHING_APPLICATION_DETAILS", "UNIMPLEMENTED_OAUTH_CLIENT_ID", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ErrorType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ErrorType> ADAPTER;
        public static final ErrorType AUTHORIZE_SUBMIT_FAILURE;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ErrorType ERROR_TYPE_UNSPECIFIED;
        public static final ErrorType MISSING_OAUTH_PARAMS;
        public static final ErrorType PLAID_ERROR_FETCHING_APPLICATION_DETAILS;
        public static final ErrorType PLAID_MISSING_APPLICATION_ID;
        public static final ErrorType UNIMPLEMENTED_OAUTH_CLIENT_ID;
        private final int value;

        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{ERROR_TYPE_UNSPECIFIED, MISSING_OAUTH_PARAMS, AUTHORIZE_SUBMIT_FAILURE, PLAID_MISSING_APPLICATION_ID, PLAID_ERROR_FETCHING_APPLICATION_DETAILS, UNIMPLEMENTED_OAUTH_CLIENT_ID};
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
            MISSING_OAUTH_PARAMS = new ErrorType("MISSING_OAUTH_PARAMS", 1, 1);
            AUTHORIZE_SUBMIT_FAILURE = new ErrorType("AUTHORIZE_SUBMIT_FAILURE", 2, 2);
            PLAID_MISSING_APPLICATION_ID = new ErrorType("PLAID_MISSING_APPLICATION_ID", 3, 3);
            PLAID_ERROR_FETCHING_APPLICATION_DETAILS = new ErrorType("PLAID_ERROR_FETCHING_APPLICATION_DETAILS", 4, 4);
            UNIMPLEMENTED_OAUTH_CLIENT_ID = new ErrorType("UNIMPLEMENTED_OAUTH_CLIENT_ID", 5, 5);
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ErrorType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ErrorType>(orCreateKotlinClass, syntax, errorType) { // from class: com.robinhood.rosetta.eventlogging.OAuthLoginEventData$ErrorType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public OAuthLoginEventData.ErrorType fromValue(int value) {
                    return OAuthLoginEventData.ErrorType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: OAuthLoginEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$ErrorType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$ErrorType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                    return ErrorType.MISSING_OAUTH_PARAMS;
                }
                if (value == 2) {
                    return ErrorType.AUTHORIZE_SUBMIT_FAILURE;
                }
                if (value == 3) {
                    return ErrorType.PLAID_MISSING_APPLICATION_ID;
                }
                if (value == 4) {
                    return ErrorType.PLAID_ERROR_FETCHING_APPLICATION_DETAILS;
                }
                if (value != 5) {
                    return null;
                }
                return ErrorType.UNIMPLEMENTED_OAUTH_CLIENT_ID;
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
    /* compiled from: OAuthLoginEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$EventType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_TYPE_UNSPECIFIED", "PLAID_APPLICATION_FETCHED", "AUTHORIZE_SUBMIT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EventType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EventType> ADAPTER;
        public static final EventType AUTHORIZE_SUBMIT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EventType EVENT_TYPE_UNSPECIFIED;
        public static final EventType PLAID_APPLICATION_FETCHED;
        private final int value;

        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{EVENT_TYPE_UNSPECIFIED, PLAID_APPLICATION_FETCHED, AUTHORIZE_SUBMIT};
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
            PLAID_APPLICATION_FETCHED = new EventType("PLAID_APPLICATION_FETCHED", 1, 1);
            AUTHORIZE_SUBMIT = new EventType("AUTHORIZE_SUBMIT", 2, 2);
            EventType[] eventTypeArr$values = $values();
            $VALUES = eventTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EventType>(orCreateKotlinClass, syntax, eventType) { // from class: com.robinhood.rosetta.eventlogging.OAuthLoginEventData$EventType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public OAuthLoginEventData.EventType fromValue(int value) {
                    return OAuthLoginEventData.EventType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: OAuthLoginEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$EventType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData$EventType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EventType fromValue(int value) {
                if (value == 0) {
                    return EventType.EVENT_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return EventType.PLAID_APPLICATION_FETCHED;
                }
                if (value != 2) {
                    return null;
                }
                return EventType.AUTHORIZE_SUBMIT;
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
