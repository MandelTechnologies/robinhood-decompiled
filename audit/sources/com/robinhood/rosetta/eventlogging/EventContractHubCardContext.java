package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.EventContractHubCardContext;
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

/* compiled from: EventContractHubCardContext.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001d\u001e\u001fB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J4\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext;", "Lcom/squareup/wire/Message;", "", "event_id", "", "event_status", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$LiveEventStatus;", "position_contexts", "", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$PositionContext;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$LiveEventStatus;Ljava/util/List;Lokio/ByteString;)V", "getEvent_id", "()Ljava/lang/String;", "getEvent_status", "()Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$LiveEventStatus;", "getPosition_contexts", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "LiveEventStatus", "PositionContext", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class EventContractHubCardContext extends Message {

    @JvmField
    public static final ProtoAdapter<EventContractHubCardContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String event_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EventContractHubCardContext$LiveEventStatus#ADAPTER", jsonName = "eventStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final LiveEventStatus event_status;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EventContractHubCardContext$PositionContext#ADAPTER", jsonName = "positionContexts", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final java.util.List<PositionContext> position_contexts;

    public EventContractHubCardContext() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24258newBuilder();
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public /* synthetic */ EventContractHubCardContext(String str, LiveEventStatus liveEventStatus, java.util.List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? LiveEventStatus.EVENT_STATUS_UNSPECIFIED : liveEventStatus, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final LiveEventStatus getEvent_status() {
        return this.event_status;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventContractHubCardContext(String event_id, LiveEventStatus event_status, java.util.List<PositionContext> position_contexts, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(event_status, "event_status");
        Intrinsics.checkNotNullParameter(position_contexts, "position_contexts");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.event_id = event_id;
        this.event_status = event_status;
        this.position_contexts = Internal.immutableCopyOf("position_contexts", position_contexts);
    }

    public final java.util.List<PositionContext> getPosition_contexts() {
        return this.position_contexts;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24258newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EventContractHubCardContext)) {
            return false;
        }
        EventContractHubCardContext eventContractHubCardContext = (EventContractHubCardContext) other;
        return Intrinsics.areEqual(unknownFields(), eventContractHubCardContext.unknownFields()) && Intrinsics.areEqual(this.event_id, eventContractHubCardContext.event_id) && this.event_status == eventContractHubCardContext.event_status && Intrinsics.areEqual(this.position_contexts, eventContractHubCardContext.position_contexts);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.event_id.hashCode()) * 37) + this.event_status.hashCode()) * 37) + this.position_contexts.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("event_id=" + Internal.sanitize(this.event_id));
        arrayList.add("event_status=" + this.event_status);
        if (!this.position_contexts.isEmpty()) {
            arrayList.add("position_contexts=" + this.position_contexts);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EventContractHubCardContext{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventContractHubCardContext copy$default(EventContractHubCardContext eventContractHubCardContext, String str, LiveEventStatus liveEventStatus, java.util.List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventContractHubCardContext.event_id;
        }
        if ((i & 2) != 0) {
            liveEventStatus = eventContractHubCardContext.event_status;
        }
        if ((i & 4) != 0) {
            list = eventContractHubCardContext.position_contexts;
        }
        if ((i & 8) != 0) {
            byteString = eventContractHubCardContext.unknownFields();
        }
        return eventContractHubCardContext.copy(str, liveEventStatus, list, byteString);
    }

    public final EventContractHubCardContext copy(String event_id, LiveEventStatus event_status, java.util.List<PositionContext> position_contexts, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(event_status, "event_status");
        Intrinsics.checkNotNullParameter(position_contexts, "position_contexts");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EventContractHubCardContext(event_id, event_status, position_contexts, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventContractHubCardContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EventContractHubCardContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.EventContractHubCardContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EventContractHubCardContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getEvent_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEvent_id());
                }
                if (value.getEvent_status() != EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_UNSPECIFIED) {
                    size += EventContractHubCardContext.LiveEventStatus.ADAPTER.encodedSizeWithTag(2, value.getEvent_status());
                }
                return size + EventContractHubCardContext.PositionContext.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getPosition_contexts());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EventContractHubCardContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getEvent_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_id());
                }
                if (value.getEvent_status() != EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_UNSPECIFIED) {
                    EventContractHubCardContext.LiveEventStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getEvent_status());
                }
                EventContractHubCardContext.PositionContext.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getPosition_contexts());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EventContractHubCardContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                EventContractHubCardContext.PositionContext.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getPosition_contexts());
                if (value.getEvent_status() != EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_UNSPECIFIED) {
                    EventContractHubCardContext.LiveEventStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getEvent_status());
                }
                if (Intrinsics.areEqual(value.getEvent_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EventContractHubCardContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                EventContractHubCardContext.LiveEventStatus liveEventStatusDecode = EventContractHubCardContext.LiveEventStatus.EVENT_STATUS_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EventContractHubCardContext(strDecode, liveEventStatusDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            liveEventStatusDecode = EventContractHubCardContext.LiveEventStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        arrayList.add(EventContractHubCardContext.PositionContext.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EventContractHubCardContext redact(EventContractHubCardContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EventContractHubCardContext.copy$default(value, null, null, Internal.m26823redactElements(value.getPosition_contexts(), EventContractHubCardContext.PositionContext.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EventContractHubCardContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$LiveEventStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_STATUS_UNSPECIFIED", "EVENT_STATUS_UPCOMING", "EVENT_STATUS_IN_PROGRESS", "EVENT_STATUS_FINAL", "EVENT_STATUS_CANCELED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LiveEventStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LiveEventStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<LiveEventStatus> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final LiveEventStatus EVENT_STATUS_CANCELED;
        public static final LiveEventStatus EVENT_STATUS_FINAL;
        public static final LiveEventStatus EVENT_STATUS_IN_PROGRESS;
        public static final LiveEventStatus EVENT_STATUS_UNSPECIFIED;
        public static final LiveEventStatus EVENT_STATUS_UPCOMING;
        private final int value;

        private static final /* synthetic */ LiveEventStatus[] $values() {
            return new LiveEventStatus[]{EVENT_STATUS_UNSPECIFIED, EVENT_STATUS_UPCOMING, EVENT_STATUS_IN_PROGRESS, EVENT_STATUS_FINAL, EVENT_STATUS_CANCELED};
        }

        @JvmStatic
        public static final LiveEventStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<LiveEventStatus> getEntries() {
            return $ENTRIES;
        }

        private LiveEventStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final LiveEventStatus liveEventStatus = new LiveEventStatus("EVENT_STATUS_UNSPECIFIED", 0, 0);
            EVENT_STATUS_UNSPECIFIED = liveEventStatus;
            EVENT_STATUS_UPCOMING = new LiveEventStatus("EVENT_STATUS_UPCOMING", 1, 1);
            EVENT_STATUS_IN_PROGRESS = new LiveEventStatus("EVENT_STATUS_IN_PROGRESS", 2, 2);
            EVENT_STATUS_FINAL = new LiveEventStatus("EVENT_STATUS_FINAL", 3, 3);
            EVENT_STATUS_CANCELED = new LiveEventStatus("EVENT_STATUS_CANCELED", 4, 4);
            LiveEventStatus[] liveEventStatusArr$values = $values();
            $VALUES = liveEventStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(liveEventStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LiveEventStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<LiveEventStatus>(orCreateKotlinClass, syntax, liveEventStatus) { // from class: com.robinhood.rosetta.eventlogging.EventContractHubCardContext$LiveEventStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public EventContractHubCardContext.LiveEventStatus fromValue(int value) {
                    return EventContractHubCardContext.LiveEventStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: EventContractHubCardContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$LiveEventStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$LiveEventStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final LiveEventStatus fromValue(int value) {
                if (value == 0) {
                    return LiveEventStatus.EVENT_STATUS_UNSPECIFIED;
                }
                if (value == 1) {
                    return LiveEventStatus.EVENT_STATUS_UPCOMING;
                }
                if (value == 2) {
                    return LiveEventStatus.EVENT_STATUS_IN_PROGRESS;
                }
                if (value == 3) {
                    return LiveEventStatus.EVENT_STATUS_FINAL;
                }
                if (value != 4) {
                    return null;
                }
                return LiveEventStatus.EVENT_STATUS_CANCELED;
            }
        }

        public static LiveEventStatus valueOf(String str) {
            return (LiveEventStatus) Enum.valueOf(LiveEventStatus.class, str);
        }

        public static LiveEventStatus[] values() {
            return (LiveEventStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: EventContractHubCardContext.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventContractHubCardContext$PositionContext;", "Lcom/squareup/wire/Message;", "", "contract_id", "", "signed_quantity", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ILokio/ByteString;)V", "getContract_id", "()Ljava/lang/String;", "getSigned_quantity", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PositionContext extends Message {

        @JvmField
        public static final ProtoAdapter<PositionContext> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String contract_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "signedQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final int signed_quantity;

        public PositionContext() {
            this(null, 0, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24259newBuilder();
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public /* synthetic */ PositionContext(String str, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public final int getSigned_quantity() {
            return this.signed_quantity;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PositionContext(String contract_id, int i, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.contract_id = contract_id;
            this.signed_quantity = i;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24259newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PositionContext)) {
                return false;
            }
            PositionContext positionContext = (PositionContext) other;
            return Intrinsics.areEqual(unknownFields(), positionContext.unknownFields()) && Intrinsics.areEqual(this.contract_id, positionContext.contract_id) && this.signed_quantity == positionContext.signed_quantity;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37) + Integer.hashCode(this.signed_quantity);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
            arrayList.add("signed_quantity=" + this.signed_quantity);
            return CollectionsKt.joinToString$default(arrayList, ", ", "PositionContext{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ PositionContext copy$default(PositionContext positionContext, String str, int i, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = positionContext.contract_id;
            }
            if ((i2 & 2) != 0) {
                i = positionContext.signed_quantity;
            }
            if ((i2 & 4) != 0) {
                byteString = positionContext.unknownFields();
            }
            return positionContext.copy(str, i, byteString);
        }

        public final PositionContext copy(String contract_id, int signed_quantity, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new PositionContext(contract_id, signed_quantity, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PositionContext.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<PositionContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.EventContractHubCardContext$PositionContext$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(EventContractHubCardContext.PositionContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                    }
                    return value.getSigned_quantity() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getSigned_quantity())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, EventContractHubCardContext.PositionContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                    }
                    if (value.getSigned_quantity() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getSigned_quantity()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, EventContractHubCardContext.PositionContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getSigned_quantity() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getSigned_quantity()));
                    }
                    if (Intrinsics.areEqual(value.getContract_id(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public EventContractHubCardContext.PositionContext redact(EventContractHubCardContext.PositionContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return EventContractHubCardContext.PositionContext.copy$default(value, null, 0, ByteString.EMPTY, 3, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public EventContractHubCardContext.PositionContext decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    int iIntValue = 0;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new EventContractHubCardContext.PositionContext(strDecode, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
