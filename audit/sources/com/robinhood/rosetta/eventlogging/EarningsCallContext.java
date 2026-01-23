package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.EarningsCallContext;
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

/* compiled from: EarningsCallContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EarningsCallContext;", "Lcom/squareup/wire/Message;", "", "call_type", "Lcom/robinhood/rosetta/eventlogging/EarningsCallContext$CallType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EarningsCallContext$CallType;Lokio/ByteString;)V", "getCall_type", "()Lcom/robinhood/rosetta/eventlogging/EarningsCallContext$CallType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "CallType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class EarningsCallContext extends Message {

    @JvmField
    public static final ProtoAdapter<EarningsCallContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EarningsCallContext$CallType#ADAPTER", jsonName = "callType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CallType call_type;

    /* JADX WARN: Multi-variable type inference failed */
    public EarningsCallContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24228newBuilder();
    }

    public final CallType getCall_type() {
        return this.call_type;
    }

    public /* synthetic */ EarningsCallContext(CallType callType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CallType.CALL_TYPE_UNSPECIFIED : callType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsCallContext(CallType call_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(call_type, "call_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.call_type = call_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24228newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EarningsCallContext)) {
            return false;
        }
        EarningsCallContext earningsCallContext = (EarningsCallContext) other;
        return Intrinsics.areEqual(unknownFields(), earningsCallContext.unknownFields()) && this.call_type == earningsCallContext.call_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.call_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("call_type=" + this.call_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningsCallContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EarningsCallContext copy$default(EarningsCallContext earningsCallContext, CallType callType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            callType = earningsCallContext.call_type;
        }
        if ((i & 2) != 0) {
            byteString = earningsCallContext.unknownFields();
        }
        return earningsCallContext.copy(callType, byteString);
    }

    public final EarningsCallContext copy(CallType call_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(call_type, "call_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EarningsCallContext(call_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EarningsCallContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EarningsCallContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.EarningsCallContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EarningsCallContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getCall_type() != EarningsCallContext.CallType.CALL_TYPE_UNSPECIFIED ? size + EarningsCallContext.CallType.ADAPTER.encodedSizeWithTag(1, value.getCall_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EarningsCallContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCall_type() != EarningsCallContext.CallType.CALL_TYPE_UNSPECIFIED) {
                    EarningsCallContext.CallType.ADAPTER.encodeWithTag(writer, 1, (int) value.getCall_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EarningsCallContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCall_type() != EarningsCallContext.CallType.CALL_TYPE_UNSPECIFIED) {
                    EarningsCallContext.CallType.ADAPTER.encodeWithTag(writer, 1, (int) value.getCall_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EarningsCallContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                EarningsCallContext.CallType callTypeDecode = EarningsCallContext.CallType.CALL_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EarningsCallContext(callTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            callTypeDecode = EarningsCallContext.CallType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EarningsCallContext redact(EarningsCallContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EarningsCallContext.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EarningsCallContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EarningsCallContext$CallType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CALL_TYPE_UNSPECIFIED", "JOIN_LIVE", "PREVIEW", "REPLAY", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CallType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CallType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CallType> ADAPTER;
        public static final CallType CALL_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CallType JOIN_LIVE;
        public static final CallType PREVIEW;
        public static final CallType REPLAY;
        private final int value;

        private static final /* synthetic */ CallType[] $values() {
            return new CallType[]{CALL_TYPE_UNSPECIFIED, JOIN_LIVE, PREVIEW, REPLAY};
        }

        @JvmStatic
        public static final CallType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CallType> getEntries() {
            return $ENTRIES;
        }

        private CallType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CallType callType = new CallType("CALL_TYPE_UNSPECIFIED", 0, 0);
            CALL_TYPE_UNSPECIFIED = callType;
            JOIN_LIVE = new CallType("JOIN_LIVE", 1, 1);
            PREVIEW = new CallType("PREVIEW", 2, 2);
            REPLAY = new CallType("REPLAY", 3, 3);
            CallType[] callTypeArr$values = $values();
            $VALUES = callTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(callTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CallType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CallType>(orCreateKotlinClass, syntax, callType) { // from class: com.robinhood.rosetta.eventlogging.EarningsCallContext$CallType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public EarningsCallContext.CallType fromValue(int value) {
                    return EarningsCallContext.CallType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: EarningsCallContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EarningsCallContext$CallType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/EarningsCallContext$CallType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CallType fromValue(int value) {
                if (value == 0) {
                    return CallType.CALL_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return CallType.JOIN_LIVE;
                }
                if (value == 2) {
                    return CallType.PREVIEW;
                }
                if (value != 3) {
                    return null;
                }
                return CallType.REPLAY;
            }
        }

        public static CallType valueOf(String str) {
            return (CallType) Enum.valueOf(CallType.class, str);
        }

        public static CallType[] values() {
            return (CallType[]) $VALUES.clone();
        }
    }
}
