package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.PromptsChallengeEventData;
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

/* compiled from: PromptsChallengeEventData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData;", "Lcom/squareup/wire/Message;", "", "silent", "", "source_flow", "", "error_message", "error_type", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType;", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType;Lokio/ByteString;)V", "getSilent", "()Z", "getSource_flow", "()Ljava/lang/String;", "getError_message", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "ErrorType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PromptsChallengeEventData extends Message {

    @JvmField
    public static final ProtoAdapter<PromptsChallengeEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String error_message;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PromptsChallengeEventData$ErrorType#ADAPTER", jsonName = "errorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ErrorType error_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean silent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceFlow", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String source_flow;

    public PromptsChallengeEventData() {
        this(false, null, null, null, null, 31, null);
    }

    public /* synthetic */ PromptsChallengeEventData(boolean z, String str, String str2, ErrorType errorType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ErrorType.EVENT_TYPE_UNSPECIFIED : errorType, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24514newBuilder();
    }

    public final boolean getSilent() {
        return this.silent;
    }

    public final String getSource_flow() {
        return this.source_flow;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public final ErrorType getError_type() {
        return this.error_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromptsChallengeEventData(boolean z, String source_flow, String error_message, ErrorType error_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(source_flow, "source_flow");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.silent = z;
        this.source_flow = source_flow;
        this.error_message = error_message;
        this.error_type = error_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24514newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PromptsChallengeEventData)) {
            return false;
        }
        PromptsChallengeEventData promptsChallengeEventData = (PromptsChallengeEventData) other;
        return Intrinsics.areEqual(unknownFields(), promptsChallengeEventData.unknownFields()) && this.silent == promptsChallengeEventData.silent && Intrinsics.areEqual(this.source_flow, promptsChallengeEventData.source_flow) && Intrinsics.areEqual(this.error_message, promptsChallengeEventData.error_message) && this.error_type == promptsChallengeEventData.error_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + java.lang.Boolean.hashCode(this.silent)) * 37) + this.source_flow.hashCode()) * 37) + this.error_message.hashCode()) * 37) + this.error_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("silent=" + this.silent);
        arrayList.add("source_flow=" + Internal.sanitize(this.source_flow));
        arrayList.add("error_message=" + Internal.sanitize(this.error_message));
        arrayList.add("error_type=" + this.error_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PromptsChallengeEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PromptsChallengeEventData copy$default(PromptsChallengeEventData promptsChallengeEventData, boolean z, String str, String str2, ErrorType errorType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = promptsChallengeEventData.silent;
        }
        if ((i & 2) != 0) {
            str = promptsChallengeEventData.source_flow;
        }
        if ((i & 4) != 0) {
            str2 = promptsChallengeEventData.error_message;
        }
        if ((i & 8) != 0) {
            errorType = promptsChallengeEventData.error_type;
        }
        if ((i & 16) != 0) {
            byteString = promptsChallengeEventData.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return promptsChallengeEventData.copy(z, str, str3, errorType, byteString2);
    }

    public final PromptsChallengeEventData copy(boolean silent, String source_flow, String error_message, ErrorType error_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(source_flow, "source_flow");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PromptsChallengeEventData(silent, source_flow, error_message, error_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PromptsChallengeEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PromptsChallengeEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PromptsChallengeEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PromptsChallengeEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSilent()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, java.lang.Boolean.valueOf(value.getSilent()));
                }
                if (!Intrinsics.areEqual(value.getSource_flow(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSource_flow());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getError_message());
                }
                return value.getError_type() != PromptsChallengeEventData.ErrorType.EVENT_TYPE_UNSPECIFIED ? size + PromptsChallengeEventData.ErrorType.ADAPTER.encodedSizeWithTag(4, value.getError_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PromptsChallengeEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSilent()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getSilent()));
                }
                if (!Intrinsics.areEqual(value.getSource_flow(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource_flow());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getError_message());
                }
                if (value.getError_type() != PromptsChallengeEventData.ErrorType.EVENT_TYPE_UNSPECIFIED) {
                    PromptsChallengeEventData.ErrorType.ADAPTER.encodeWithTag(writer, 4, (int) value.getError_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PromptsChallengeEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getError_type() != PromptsChallengeEventData.ErrorType.EVENT_TYPE_UNSPECIFIED) {
                    PromptsChallengeEventData.ErrorType.ADAPTER.encodeWithTag(writer, 4, (int) value.getError_type());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getError_message());
                }
                if (!Intrinsics.areEqual(value.getSource_flow(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource_flow());
                }
                if (value.getSilent()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getSilent()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PromptsChallengeEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PromptsChallengeEventData.ErrorType errorTypeDecode = PromptsChallengeEventData.ErrorType.EVENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = "";
                while (true) {
                    PromptsChallengeEventData.ErrorType errorType = errorTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PromptsChallengeEventData(zBooleanValue, strDecode, strDecode2, errorType, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                errorTypeDecode = PromptsChallengeEventData.ErrorType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PromptsChallengeEventData redact(PromptsChallengeEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PromptsChallengeEventData.copy$default(value, false, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PromptsChallengeEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_TYPE_UNSPECIFIED", "TIMEOUT", "NO_CHALLENGE_FROM_TWILIO", "TWILIO_SDK_ERROR", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ErrorType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ErrorType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ErrorType EVENT_TYPE_UNSPECIFIED;
        public static final ErrorType NO_CHALLENGE_FROM_TWILIO;
        public static final ErrorType TIMEOUT;
        public static final ErrorType TWILIO_SDK_ERROR;
        private final int value;

        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{EVENT_TYPE_UNSPECIFIED, TIMEOUT, NO_CHALLENGE_FROM_TWILIO, TWILIO_SDK_ERROR};
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
            final ErrorType errorType = new ErrorType("EVENT_TYPE_UNSPECIFIED", 0, 0);
            EVENT_TYPE_UNSPECIFIED = errorType;
            TIMEOUT = new ErrorType("TIMEOUT", 1, 1);
            NO_CHALLENGE_FROM_TWILIO = new ErrorType("NO_CHALLENGE_FROM_TWILIO", 2, 2);
            TWILIO_SDK_ERROR = new ErrorType("TWILIO_SDK_ERROR", 3, 3);
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ErrorType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ErrorType>(orCreateKotlinClass, syntax, errorType) { // from class: com.robinhood.rosetta.eventlogging.PromptsChallengeEventData$ErrorType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PromptsChallengeEventData.ErrorType fromValue(int value) {
                    return PromptsChallengeEventData.ErrorType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PromptsChallengeEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ErrorType fromValue(int value) {
                if (value == 0) {
                    return ErrorType.EVENT_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return ErrorType.TIMEOUT;
                }
                if (value == 2) {
                    return ErrorType.NO_CHALLENGE_FROM_TWILIO;
                }
                if (value != 3) {
                    return null;
                }
                return ErrorType.TWILIO_SDK_ERROR;
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
