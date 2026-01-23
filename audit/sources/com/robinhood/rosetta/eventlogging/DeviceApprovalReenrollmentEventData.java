package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.DeviceApprovalReenrollmentEventData;
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

/* compiled from: DeviceApprovalReenrollmentEventData.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventData;", "Lcom/squareup/wire/Message;", "", "event_Type", "Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventData$EventType;", "error_message", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventData$EventType;Ljava/lang/String;Lokio/ByteString;)V", "getEvent_Type", "()Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventData$EventType;", "getError_message", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "EventType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class DeviceApprovalReenrollmentEventData extends Message {

    @JvmField
    public static final ProtoAdapter<DeviceApprovalReenrollmentEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String error_message;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceApprovalReenrollmentEventData$EventType#ADAPTER", jsonName = "eventType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EventType event_Type;

    public DeviceApprovalReenrollmentEventData() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24195newBuilder();
    }

    public final EventType getEvent_Type() {
        return this.event_Type;
    }

    public /* synthetic */ DeviceApprovalReenrollmentEventData(EventType eventType, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EventType.EVENT_TYPE_UNSPECIFIED : eventType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getError_message() {
        return this.error_message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceApprovalReenrollmentEventData(EventType event_Type, String error_message, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(event_Type, "event_Type");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.event_Type = event_Type;
        this.error_message = error_message;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24195newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DeviceApprovalReenrollmentEventData)) {
            return false;
        }
        DeviceApprovalReenrollmentEventData deviceApprovalReenrollmentEventData = (DeviceApprovalReenrollmentEventData) other;
        return Intrinsics.areEqual(unknownFields(), deviceApprovalReenrollmentEventData.unknownFields()) && this.event_Type == deviceApprovalReenrollmentEventData.event_Type && Intrinsics.areEqual(this.error_message, deviceApprovalReenrollmentEventData.error_message);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.event_Type.hashCode()) * 37) + this.error_message.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("event_Type=" + this.event_Type);
        arrayList.add("error_message=" + Internal.sanitize(this.error_message));
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeviceApprovalReenrollmentEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DeviceApprovalReenrollmentEventData copy$default(DeviceApprovalReenrollmentEventData deviceApprovalReenrollmentEventData, EventType eventType, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            eventType = deviceApprovalReenrollmentEventData.event_Type;
        }
        if ((i & 2) != 0) {
            str = deviceApprovalReenrollmentEventData.error_message;
        }
        if ((i & 4) != 0) {
            byteString = deviceApprovalReenrollmentEventData.unknownFields();
        }
        return deviceApprovalReenrollmentEventData.copy(eventType, str, byteString);
    }

    public final DeviceApprovalReenrollmentEventData copy(EventType event_Type, String error_message, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(event_Type, "event_Type");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DeviceApprovalReenrollmentEventData(event_Type, error_message, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DeviceApprovalReenrollmentEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DeviceApprovalReenrollmentEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DeviceApprovalReenrollmentEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DeviceApprovalReenrollmentEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getEvent_Type() != DeviceApprovalReenrollmentEventData.EventType.EVENT_TYPE_UNSPECIFIED) {
                    size += DeviceApprovalReenrollmentEventData.EventType.ADAPTER.encodedSizeWithTag(1, value.getEvent_Type());
                }
                return !Intrinsics.areEqual(value.getError_message(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getError_message()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DeviceApprovalReenrollmentEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEvent_Type() != DeviceApprovalReenrollmentEventData.EventType.EVENT_TYPE_UNSPECIFIED) {
                    DeviceApprovalReenrollmentEventData.EventType.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent_Type());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getError_message());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DeviceApprovalReenrollmentEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getError_message());
                }
                if (value.getEvent_Type() != DeviceApprovalReenrollmentEventData.EventType.EVENT_TYPE_UNSPECIFIED) {
                    DeviceApprovalReenrollmentEventData.EventType.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent_Type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DeviceApprovalReenrollmentEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DeviceApprovalReenrollmentEventData.EventType eventTypeDecode = DeviceApprovalReenrollmentEventData.EventType.EVENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DeviceApprovalReenrollmentEventData(eventTypeDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            eventTypeDecode = DeviceApprovalReenrollmentEventData.EventType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DeviceApprovalReenrollmentEventData redact(DeviceApprovalReenrollmentEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DeviceApprovalReenrollmentEventData.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeviceApprovalReenrollmentEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventData$EventType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_TYPE_UNSPECIFIED", "SKIPPED", "STARTED_DELETING_OLD_FACTOR", "STARTED_CREATING_NEW_FACTOR", "FAILED_DELETING_OLD_FACTOR", "FAILED_CREATING_NEW_FACTOR", "SUCCEEDED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EventType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EventType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EventType EVENT_TYPE_UNSPECIFIED;
        public static final EventType FAILED_CREATING_NEW_FACTOR;
        public static final EventType FAILED_DELETING_OLD_FACTOR;
        public static final EventType SKIPPED;
        public static final EventType STARTED_CREATING_NEW_FACTOR;
        public static final EventType STARTED_DELETING_OLD_FACTOR;
        public static final EventType SUCCEEDED;
        private final int value;

        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{EVENT_TYPE_UNSPECIFIED, SKIPPED, STARTED_DELETING_OLD_FACTOR, STARTED_CREATING_NEW_FACTOR, FAILED_DELETING_OLD_FACTOR, FAILED_CREATING_NEW_FACTOR, SUCCEEDED};
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
            SKIPPED = new EventType("SKIPPED", 1, 1);
            STARTED_DELETING_OLD_FACTOR = new EventType("STARTED_DELETING_OLD_FACTOR", 2, 2);
            STARTED_CREATING_NEW_FACTOR = new EventType("STARTED_CREATING_NEW_FACTOR", 3, 3);
            FAILED_DELETING_OLD_FACTOR = new EventType("FAILED_DELETING_OLD_FACTOR", 4, 4);
            FAILED_CREATING_NEW_FACTOR = new EventType("FAILED_CREATING_NEW_FACTOR", 5, 5);
            SUCCEEDED = new EventType("SUCCEEDED", 6, 6);
            EventType[] eventTypeArr$values = $values();
            $VALUES = eventTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EventType>(orCreateKotlinClass, syntax, eventType) { // from class: com.robinhood.rosetta.eventlogging.DeviceApprovalReenrollmentEventData$EventType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public DeviceApprovalReenrollmentEventData.EventType fromValue(int value) {
                    return DeviceApprovalReenrollmentEventData.EventType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: DeviceApprovalReenrollmentEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventData$EventType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventData$EventType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                        return EventType.SKIPPED;
                    case 2:
                        return EventType.STARTED_DELETING_OLD_FACTOR;
                    case 3:
                        return EventType.STARTED_CREATING_NEW_FACTOR;
                    case 4:
                        return EventType.FAILED_DELETING_OLD_FACTOR;
                    case 5:
                        return EventType.FAILED_CREATING_NEW_FACTOR;
                    case 6:
                        return EventType.SUCCEEDED;
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
