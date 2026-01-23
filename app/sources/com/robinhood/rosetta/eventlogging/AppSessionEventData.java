package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.AppSessionEventData;
import com.singular.sdk.internal.Constants;
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

/* compiled from: AppSessionEventData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppSessionEventData;", "Lcom/squareup/wire/Message;", "", "event_type", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType;", "time_spent", "", "is_public_beta", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType;IZLokio/ByteString;)V", "getEvent_type", "()Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType;", "getTime_spent", "()I", "()Z", "newBuilder", "equals", "other", "", "hashCode", "toString", "", "copy", "Companion", "EventType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class AppSessionEventData extends Message {

    @JvmField
    public static final ProtoAdapter<AppSessionEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AppSessionEventData$EventType#ADAPTER", jsonName = "eventType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EventType event_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPublicBeta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_public_beta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "timeSpent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int time_spent;

    public AppSessionEventData() {
        this(null, 0, false, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24013newBuilder();
    }

    public final EventType getEvent_type() {
        return this.event_type;
    }

    public /* synthetic */ AppSessionEventData(EventType eventType, int i, boolean z, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? EventType.EVENT_TYPE_UNSPECIFIED : eventType, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getTime_spent() {
        return this.time_spent;
    }

    /* renamed from: is_public_beta, reason: from getter */
    public final boolean getIs_public_beta() {
        return this.is_public_beta;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSessionEventData(EventType event_type, int i, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.event_type = event_type;
        this.time_spent = i;
        this.is_public_beta = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24013newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AppSessionEventData)) {
            return false;
        }
        AppSessionEventData appSessionEventData = (AppSessionEventData) other;
        return Intrinsics.areEqual(unknownFields(), appSessionEventData.unknownFields()) && this.event_type == appSessionEventData.event_type && this.time_spent == appSessionEventData.time_spent && this.is_public_beta == appSessionEventData.is_public_beta;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.event_type.hashCode()) * 37) + Integer.hashCode(this.time_spent)) * 37) + java.lang.Boolean.hashCode(this.is_public_beta);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("event_type=" + this.event_type);
        arrayList.add("time_spent=" + this.time_spent);
        arrayList.add("is_public_beta=" + this.is_public_beta);
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppSessionEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AppSessionEventData copy$default(AppSessionEventData appSessionEventData, EventType eventType, int i, boolean z, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eventType = appSessionEventData.event_type;
        }
        if ((i2 & 2) != 0) {
            i = appSessionEventData.time_spent;
        }
        if ((i2 & 4) != 0) {
            z = appSessionEventData.is_public_beta;
        }
        if ((i2 & 8) != 0) {
            byteString = appSessionEventData.unknownFields();
        }
        return appSessionEventData.copy(eventType, i, z, byteString);
    }

    public final AppSessionEventData copy(EventType event_type, int time_spent, boolean is_public_beta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AppSessionEventData(event_type, time_spent, is_public_beta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppSessionEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AppSessionEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.AppSessionEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AppSessionEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getEvent_type() != AppSessionEventData.EventType.EVENT_TYPE_UNSPECIFIED) {
                    size += AppSessionEventData.EventType.ADAPTER.encodedSizeWithTag(1, value.getEvent_type());
                }
                if (value.getTime_spent() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getTime_spent()));
                }
                return value.getIs_public_beta() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, java.lang.Boolean.valueOf(value.getIs_public_beta())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AppSessionEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEvent_type() != AppSessionEventData.EventType.EVENT_TYPE_UNSPECIFIED) {
                    AppSessionEventData.EventType.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent_type());
                }
                if (value.getTime_spent() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTime_spent()));
                }
                if (value.getIs_public_beta()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getIs_public_beta()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AppSessionEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_public_beta()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getIs_public_beta()));
                }
                if (value.getTime_spent() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getTime_spent()));
                }
                if (value.getEvent_type() != AppSessionEventData.EventType.EVENT_TYPE_UNSPECIFIED) {
                    AppSessionEventData.EventType.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AppSessionEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AppSessionEventData.EventType eventTypeDecode = AppSessionEventData.EventType.EVENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AppSessionEventData(eventTypeDecode, iIntValue, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            eventTypeDecode = AppSessionEventData.EventType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AppSessionEventData redact(AppSessionEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AppSessionEventData.copy$default(value, null, 0, false, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppSessionEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_TYPE_UNSPECIFIED", Constants.API_TYPE_SESSION_START, "SESSION_END", "APP_FOREGROUND", "APP_BACKGROUND", "NOTIFICATIONS_ENABLED", "NOTIFICATIONS_DISABLED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EventType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EventType> ADAPTER;
        public static final EventType APP_BACKGROUND;
        public static final EventType APP_FOREGROUND;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EventType EVENT_TYPE_UNSPECIFIED;
        public static final EventType NOTIFICATIONS_DISABLED;
        public static final EventType NOTIFICATIONS_ENABLED;
        public static final EventType SESSION_END;
        public static final EventType SESSION_START;
        private final int value;

        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{EVENT_TYPE_UNSPECIFIED, SESSION_START, SESSION_END, APP_FOREGROUND, APP_BACKGROUND, NOTIFICATIONS_ENABLED, NOTIFICATIONS_DISABLED};
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
            SESSION_START = new EventType(Constants.API_TYPE_SESSION_START, 1, 1);
            SESSION_END = new EventType("SESSION_END", 2, 2);
            APP_FOREGROUND = new EventType("APP_FOREGROUND", 3, 3);
            APP_BACKGROUND = new EventType("APP_BACKGROUND", 4, 4);
            NOTIFICATIONS_ENABLED = new EventType("NOTIFICATIONS_ENABLED", 5, 5);
            NOTIFICATIONS_DISABLED = new EventType("NOTIFICATIONS_DISABLED", 6, 6);
            EventType[] eventTypeArr$values = $values();
            $VALUES = eventTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EventType>(orCreateKotlinClass, syntax, eventType) { // from class: com.robinhood.rosetta.eventlogging.AppSessionEventData$EventType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public AppSessionEventData.EventType fromValue(int value) {
                    return AppSessionEventData.EventType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: AppSessionEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData$EventType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                        return EventType.SESSION_START;
                    case 2:
                        return EventType.SESSION_END;
                    case 3:
                        return EventType.APP_FOREGROUND;
                    case 4:
                        return EventType.APP_BACKGROUND;
                    case 5:
                        return EventType.NOTIFICATIONS_ENABLED;
                    case 6:
                        return EventType.NOTIFICATIONS_DISABLED;
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
