package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventData;
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

/* compiled from: TwilioConversationsSdkEventData.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001d\u001e\u001f B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData;", "Lcom/squareup/wire/Message;", "", "client_sdk_status", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "conversation_sync_status", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "action", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;Lokio/ByteString;)V", "getClient_sdk_status", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "getConversation_sync_status", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "getAction", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ConnectionState", "ConversationSyncStatus", "Action", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class TwilioConversationsSdkEventData extends Message {

    @JvmField
    public static final ProtoAdapter<TwilioConversationsSdkEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventData$Action#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Action action;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventData$ConnectionState#ADAPTER", jsonName = "clientSdkStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ConnectionState client_sdk_status;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventData$ConversationSyncStatus#ADAPTER", jsonName = "conversationSyncStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ConversationSyncStatus conversation_sync_status;

    public TwilioConversationsSdkEventData() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24592newBuilder();
    }

    public final ConnectionState getClient_sdk_status() {
        return this.client_sdk_status;
    }

    public /* synthetic */ TwilioConversationsSdkEventData(ConnectionState connectionState, ConversationSyncStatus conversationSyncStatus, Action action, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ConnectionState.CONNECTION_STATE_UNSPECIFIED : connectionState, (i & 2) != 0 ? ConversationSyncStatus.CONVERSATION_SYNC_STATUS_UNSPECIFIED : conversationSyncStatus, (i & 4) != 0 ? Action.ACTION_UNSPECIFIED : action, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ConversationSyncStatus getConversation_sync_status() {
        return this.conversation_sync_status;
    }

    public final Action getAction() {
        return this.action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwilioConversationsSdkEventData(ConnectionState client_sdk_status, ConversationSyncStatus conversation_sync_status, Action action, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(client_sdk_status, "client_sdk_status");
        Intrinsics.checkNotNullParameter(conversation_sync_status, "conversation_sync_status");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.client_sdk_status = client_sdk_status;
        this.conversation_sync_status = conversation_sync_status;
        this.action = action;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24592newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TwilioConversationsSdkEventData)) {
            return false;
        }
        TwilioConversationsSdkEventData twilioConversationsSdkEventData = (TwilioConversationsSdkEventData) other;
        return Intrinsics.areEqual(unknownFields(), twilioConversationsSdkEventData.unknownFields()) && this.client_sdk_status == twilioConversationsSdkEventData.client_sdk_status && this.conversation_sync_status == twilioConversationsSdkEventData.conversation_sync_status && this.action == twilioConversationsSdkEventData.action;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.client_sdk_status.hashCode()) * 37) + this.conversation_sync_status.hashCode()) * 37) + this.action.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("client_sdk_status=" + this.client_sdk_status);
        arrayList.add("conversation_sync_status=" + this.conversation_sync_status);
        arrayList.add("action=" + this.action);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TwilioConversationsSdkEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TwilioConversationsSdkEventData copy$default(TwilioConversationsSdkEventData twilioConversationsSdkEventData, ConnectionState connectionState, ConversationSyncStatus conversationSyncStatus, Action action, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            connectionState = twilioConversationsSdkEventData.client_sdk_status;
        }
        if ((i & 2) != 0) {
            conversationSyncStatus = twilioConversationsSdkEventData.conversation_sync_status;
        }
        if ((i & 4) != 0) {
            action = twilioConversationsSdkEventData.action;
        }
        if ((i & 8) != 0) {
            byteString = twilioConversationsSdkEventData.unknownFields();
        }
        return twilioConversationsSdkEventData.copy(connectionState, conversationSyncStatus, action, byteString);
    }

    public final TwilioConversationsSdkEventData copy(ConnectionState client_sdk_status, ConversationSyncStatus conversation_sync_status, Action action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(client_sdk_status, "client_sdk_status");
        Intrinsics.checkNotNullParameter(conversation_sync_status, "conversation_sync_status");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TwilioConversationsSdkEventData(client_sdk_status, conversation_sync_status, action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TwilioConversationsSdkEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TwilioConversationsSdkEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TwilioConversationsSdkEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getClient_sdk_status() != TwilioConversationsSdkEventData.ConnectionState.CONNECTION_STATE_UNSPECIFIED) {
                    size += TwilioConversationsSdkEventData.ConnectionState.ADAPTER.encodedSizeWithTag(1, value.getClient_sdk_status());
                }
                if (value.getConversation_sync_status() != TwilioConversationsSdkEventData.ConversationSyncStatus.CONVERSATION_SYNC_STATUS_UNSPECIFIED) {
                    size += TwilioConversationsSdkEventData.ConversationSyncStatus.ADAPTER.encodedSizeWithTag(2, value.getConversation_sync_status());
                }
                return value.getAction() != TwilioConversationsSdkEventData.Action.ACTION_UNSPECIFIED ? size + TwilioConversationsSdkEventData.Action.ADAPTER.encodedSizeWithTag(3, value.getAction()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TwilioConversationsSdkEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getClient_sdk_status() != TwilioConversationsSdkEventData.ConnectionState.CONNECTION_STATE_UNSPECIFIED) {
                    TwilioConversationsSdkEventData.ConnectionState.ADAPTER.encodeWithTag(writer, 1, (int) value.getClient_sdk_status());
                }
                if (value.getConversation_sync_status() != TwilioConversationsSdkEventData.ConversationSyncStatus.CONVERSATION_SYNC_STATUS_UNSPECIFIED) {
                    TwilioConversationsSdkEventData.ConversationSyncStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getConversation_sync_status());
                }
                if (value.getAction() != TwilioConversationsSdkEventData.Action.ACTION_UNSPECIFIED) {
                    TwilioConversationsSdkEventData.Action.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TwilioConversationsSdkEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAction() != TwilioConversationsSdkEventData.Action.ACTION_UNSPECIFIED) {
                    TwilioConversationsSdkEventData.Action.ADAPTER.encodeWithTag(writer, 3, (int) value.getAction());
                }
                if (value.getConversation_sync_status() != TwilioConversationsSdkEventData.ConversationSyncStatus.CONVERSATION_SYNC_STATUS_UNSPECIFIED) {
                    TwilioConversationsSdkEventData.ConversationSyncStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getConversation_sync_status());
                }
                if (value.getClient_sdk_status() != TwilioConversationsSdkEventData.ConnectionState.CONNECTION_STATE_UNSPECIFIED) {
                    TwilioConversationsSdkEventData.ConnectionState.ADAPTER.encodeWithTag(writer, 1, (int) value.getClient_sdk_status());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TwilioConversationsSdkEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TwilioConversationsSdkEventData.ConnectionState connectionStateDecode = TwilioConversationsSdkEventData.ConnectionState.CONNECTION_STATE_UNSPECIFIED;
                TwilioConversationsSdkEventData.ConversationSyncStatus conversationSyncStatusDecode = TwilioConversationsSdkEventData.ConversationSyncStatus.CONVERSATION_SYNC_STATUS_UNSPECIFIED;
                TwilioConversationsSdkEventData.Action actionDecode = TwilioConversationsSdkEventData.Action.ACTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TwilioConversationsSdkEventData(connectionStateDecode, conversationSyncStatusDecode, actionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            connectionStateDecode = TwilioConversationsSdkEventData.ConnectionState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            conversationSyncStatusDecode = TwilioConversationsSdkEventData.ConversationSyncStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            actionDecode = TwilioConversationsSdkEventData.Action.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TwilioConversationsSdkEventData redact(TwilioConversationsSdkEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TwilioConversationsSdkEventData.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TwilioConversationsSdkEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONNECTION_STATE_UNSPECIFIED", "CONNECTING", "CONNECTED", "DISCONNECTED", "DENIED", "ERROR", "FATAL_ERROR", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ConnectionState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConnectionState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ConnectionState> ADAPTER;
        public static final ConnectionState CONNECTED;
        public static final ConnectionState CONNECTING;
        public static final ConnectionState CONNECTION_STATE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ConnectionState DENIED;
        public static final ConnectionState DISCONNECTED;
        public static final ConnectionState ERROR;
        public static final ConnectionState FATAL_ERROR;
        private final int value;

        private static final /* synthetic */ ConnectionState[] $values() {
            return new ConnectionState[]{CONNECTION_STATE_UNSPECIFIED, CONNECTING, CONNECTED, DISCONNECTED, DENIED, ERROR, FATAL_ERROR};
        }

        @JvmStatic
        public static final ConnectionState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ConnectionState> getEntries() {
            return $ENTRIES;
        }

        private ConnectionState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ConnectionState connectionState = new ConnectionState("CONNECTION_STATE_UNSPECIFIED", 0, 0);
            CONNECTION_STATE_UNSPECIFIED = connectionState;
            CONNECTING = new ConnectionState("CONNECTING", 1, 1);
            CONNECTED = new ConnectionState("CONNECTED", 2, 2);
            DISCONNECTED = new ConnectionState("DISCONNECTED", 3, 3);
            DENIED = new ConnectionState("DENIED", 4, 4);
            ERROR = new ConnectionState("ERROR", 5, 5);
            FATAL_ERROR = new ConnectionState("FATAL_ERROR", 6, 6);
            ConnectionState[] connectionStateArr$values = $values();
            $VALUES = connectionStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(connectionStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConnectionState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ConnectionState>(orCreateKotlinClass, syntax, connectionState) { // from class: com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventData$ConnectionState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TwilioConversationsSdkEventData.ConnectionState fromValue(int value) {
                    return TwilioConversationsSdkEventData.ConnectionState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TwilioConversationsSdkEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConnectionState;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ConnectionState fromValue(int value) {
                switch (value) {
                    case 0:
                        return ConnectionState.CONNECTION_STATE_UNSPECIFIED;
                    case 1:
                        return ConnectionState.CONNECTING;
                    case 2:
                        return ConnectionState.CONNECTED;
                    case 3:
                        return ConnectionState.DISCONNECTED;
                    case 4:
                        return ConnectionState.DENIED;
                    case 5:
                        return ConnectionState.ERROR;
                    case 6:
                        return ConnectionState.FATAL_ERROR;
                    default:
                        return null;
                }
            }
        }

        public static ConnectionState valueOf(String str) {
            return (ConnectionState) Enum.valueOf(ConnectionState.class, str);
        }

        public static ConnectionState[] values() {
            return (ConnectionState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TwilioConversationsSdkEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONVERSATION_SYNC_STATUS_UNSPECIFIED", "NONE", "IDENTIFIER", "METADATA", DisplaySpans.ALL, "FAILED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ConversationSyncStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConversationSyncStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ConversationSyncStatus> ADAPTER;
        public static final ConversationSyncStatus ALL;
        public static final ConversationSyncStatus CONVERSATION_SYNC_STATUS_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ConversationSyncStatus FAILED;
        public static final ConversationSyncStatus IDENTIFIER;
        public static final ConversationSyncStatus METADATA;
        public static final ConversationSyncStatus NONE;
        private final int value;

        private static final /* synthetic */ ConversationSyncStatus[] $values() {
            return new ConversationSyncStatus[]{CONVERSATION_SYNC_STATUS_UNSPECIFIED, NONE, IDENTIFIER, METADATA, ALL, FAILED};
        }

        @JvmStatic
        public static final ConversationSyncStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ConversationSyncStatus> getEntries() {
            return $ENTRIES;
        }

        private ConversationSyncStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ConversationSyncStatus conversationSyncStatus = new ConversationSyncStatus("CONVERSATION_SYNC_STATUS_UNSPECIFIED", 0, 0);
            CONVERSATION_SYNC_STATUS_UNSPECIFIED = conversationSyncStatus;
            NONE = new ConversationSyncStatus("NONE", 1, 1);
            IDENTIFIER = new ConversationSyncStatus("IDENTIFIER", 2, 2);
            METADATA = new ConversationSyncStatus("METADATA", 3, 3);
            ALL = new ConversationSyncStatus(DisplaySpans.ALL, 4, 4);
            FAILED = new ConversationSyncStatus("FAILED", 5, 5);
            ConversationSyncStatus[] conversationSyncStatusArr$values = $values();
            $VALUES = conversationSyncStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(conversationSyncStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConversationSyncStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ConversationSyncStatus>(orCreateKotlinClass, syntax, conversationSyncStatus) { // from class: com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventData$ConversationSyncStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TwilioConversationsSdkEventData.ConversationSyncStatus fromValue(int value) {
                    return TwilioConversationsSdkEventData.ConversationSyncStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TwilioConversationsSdkEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$ConversationSyncStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ConversationSyncStatus fromValue(int value) {
                if (value == 0) {
                    return ConversationSyncStatus.CONVERSATION_SYNC_STATUS_UNSPECIFIED;
                }
                if (value == 1) {
                    return ConversationSyncStatus.NONE;
                }
                if (value == 2) {
                    return ConversationSyncStatus.IDENTIFIER;
                }
                if (value == 3) {
                    return ConversationSyncStatus.METADATA;
                }
                if (value == 4) {
                    return ConversationSyncStatus.ALL;
                }
                if (value != 5) {
                    return null;
                }
                return ConversationSyncStatus.FAILED;
            }
        }

        public static ConversationSyncStatus valueOf(String str) {
            return (ConversationSyncStatus) Enum.valueOf(ConversationSyncStatus.class, str);
        }

        public static ConversationSyncStatus[] values() {
            return (ConversationSyncStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TwilioConversationsSdkEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACTION_UNSPECIFIED", "INITIALIZED", "INITIALIZATION_FAILED", "SHUTDOWN", "LOAD_CONVERSATION", "CONNECTION_STATUS_CHANGE", "CONVERSATION_SYNC_STATUS_CHANGE", "TOKEN_EXPIRED", "TOKEN_ABOUT_TO_EXPIRE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Action implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action ACTION_UNSPECIFIED;

        @JvmField
        public static final ProtoAdapter<Action> ADAPTER;
        public static final Action CONNECTION_STATUS_CHANGE;
        public static final Action CONVERSATION_SYNC_STATUS_CHANGE;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Action INITIALIZATION_FAILED;
        public static final Action INITIALIZED;
        public static final Action LOAD_CONVERSATION;
        public static final Action SHUTDOWN;
        public static final Action TOKEN_ABOUT_TO_EXPIRE;
        public static final Action TOKEN_EXPIRED;
        private final int value;

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{ACTION_UNSPECIFIED, INITIALIZED, INITIALIZATION_FAILED, SHUTDOWN, LOAD_CONVERSATION, CONNECTION_STATUS_CHANGE, CONVERSATION_SYNC_STATUS_CHANGE, TOKEN_EXPIRED, TOKEN_ABOUT_TO_EXPIRE};
        }

        @JvmStatic
        public static final Action fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }

        private Action(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Action action = new Action("ACTION_UNSPECIFIED", 0, 0);
            ACTION_UNSPECIFIED = action;
            INITIALIZED = new Action("INITIALIZED", 1, 1);
            INITIALIZATION_FAILED = new Action("INITIALIZATION_FAILED", 2, 2);
            SHUTDOWN = new Action("SHUTDOWN", 3, 3);
            LOAD_CONVERSATION = new Action("LOAD_CONVERSATION", 4, 4);
            CONNECTION_STATUS_CHANGE = new Action("CONNECTION_STATUS_CHANGE", 5, 5);
            CONVERSATION_SYNC_STATUS_CHANGE = new Action("CONVERSATION_SYNC_STATUS_CHANGE", 6, 6);
            TOKEN_EXPIRED = new Action("TOKEN_EXPIRED", 7, 7);
            TOKEN_ABOUT_TO_EXPIRE = new Action("TOKEN_ABOUT_TO_EXPIRE", 8, 8);
            Action[] actionArr$values = $values();
            $VALUES = actionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(actionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Action.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Action>(orCreateKotlinClass, syntax, action) { // from class: com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventData$Action$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TwilioConversationsSdkEventData.Action fromValue(int value) {
                    return TwilioConversationsSdkEventData.Action.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TwilioConversationsSdkEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData$Action;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Action fromValue(int value) {
                switch (value) {
                    case 0:
                        return Action.ACTION_UNSPECIFIED;
                    case 1:
                        return Action.INITIALIZED;
                    case 2:
                        return Action.INITIALIZATION_FAILED;
                    case 3:
                        return Action.SHUTDOWN;
                    case 4:
                        return Action.LOAD_CONVERSATION;
                    case 5:
                        return Action.CONNECTION_STATUS_CHANGE;
                    case 6:
                        return Action.CONVERSATION_SYNC_STATUS_CHANGE;
                    case 7:
                        return Action.TOKEN_EXPIRED;
                    case 8:
                        return Action.TOKEN_ABOUT_TO_EXPIRE;
                    default:
                        return null;
                }
            }
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }
}
