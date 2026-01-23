package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ConversationMessages.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J@\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ConversationMessages;", "Lcom/squareup/wire/Message;", "", "conversation_id", "", NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "", "Lcom/robinhood/chatbot/proto/v1/Message;", "next", "user_interaction_state", "Lcom/robinhood/chatbot/proto/v1/UserInteractionState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/UserInteractionState;Lokio/ByteString;)V", "getConversation_id", "()Ljava/lang/String;", "getNext", "getUser_interaction_state", "()Lcom/robinhood/chatbot/proto/v1/UserInteractionState;", "getMessages", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ConversationMessages extends Message {

    @JvmField
    public static final ProtoAdapter<ConversationMessages> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "conversationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String conversation_id;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.Message#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<Message> messages;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String next;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.UserInteractionState#ADAPTER", jsonName = "userInteractionState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final UserInteractionState user_interaction_state;

    public ConversationMessages() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ ConversationMessages(String str, List list, String str2, UserInteractionState userInteractionState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : userInteractionState, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20472newBuilder();
    }

    public final String getConversation_id() {
        return this.conversation_id;
    }

    public final String getNext() {
        return this.next;
    }

    public final UserInteractionState getUser_interaction_state() {
        return this.user_interaction_state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMessages(String conversation_id, List<Message> messages, String next, UserInteractionState userInteractionState, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.conversation_id = conversation_id;
        this.next = next;
        this.user_interaction_state = userInteractionState;
        this.messages = Internal.immutableCopyOf(NotificationSettings4FragmentKey.SETTINGS_MESSAGES, messages);
    }

    public final List<Message> getMessages() {
        return this.messages;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20472newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ConversationMessages)) {
            return false;
        }
        ConversationMessages conversationMessages = (ConversationMessages) other;
        return Intrinsics.areEqual(unknownFields(), conversationMessages.unknownFields()) && Intrinsics.areEqual(this.conversation_id, conversationMessages.conversation_id) && Intrinsics.areEqual(this.messages, conversationMessages.messages) && Intrinsics.areEqual(this.next, conversationMessages.next) && Intrinsics.areEqual(this.user_interaction_state, conversationMessages.user_interaction_state);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.conversation_id.hashCode()) * 37) + this.messages.hashCode()) * 37) + this.next.hashCode()) * 37;
        UserInteractionState userInteractionState = this.user_interaction_state;
        int iHashCode2 = iHashCode + (userInteractionState != null ? userInteractionState.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("conversation_id=" + Internal.sanitize(this.conversation_id));
        if (!this.messages.isEmpty()) {
            arrayList.add("messages=" + this.messages);
        }
        arrayList.add("next=" + Internal.sanitize(this.next));
        UserInteractionState userInteractionState = this.user_interaction_state;
        if (userInteractionState != null) {
            arrayList.add("user_interaction_state=" + userInteractionState);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConversationMessages{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ConversationMessages copy$default(ConversationMessages conversationMessages, String str, List list, String str2, UserInteractionState userInteractionState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationMessages.conversation_id;
        }
        if ((i & 2) != 0) {
            list = conversationMessages.messages;
        }
        if ((i & 4) != 0) {
            str2 = conversationMessages.next;
        }
        if ((i & 8) != 0) {
            userInteractionState = conversationMessages.user_interaction_state;
        }
        if ((i & 16) != 0) {
            byteString = conversationMessages.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return conversationMessages.copy(str, list, str3, userInteractionState, byteString2);
    }

    public final ConversationMessages copy(String conversation_id, List<Message> messages, String next, UserInteractionState user_interaction_state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ConversationMessages(conversation_id, messages, next, user_interaction_state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConversationMessages.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ConversationMessages>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.ConversationMessages$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ConversationMessages value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getConversation_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getConversation_id());
                }
                int iEncodedSizeWithTag = size + Message.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getMessages());
                if (!Intrinsics.areEqual(value.getNext(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getNext());
                }
                return value.getUser_interaction_state() != null ? iEncodedSizeWithTag + UserInteractionState.ADAPTER.encodedSizeWithTag(4, value.getUser_interaction_state()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ConversationMessages value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getConversation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getConversation_id());
                }
                Message.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getMessages());
                if (!Intrinsics.areEqual(value.getNext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNext());
                }
                if (value.getUser_interaction_state() != null) {
                    UserInteractionState.ADAPTER.encodeWithTag(writer, 4, (int) value.getUser_interaction_state());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ConversationMessages value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUser_interaction_state() != null) {
                    UserInteractionState.ADAPTER.encodeWithTag(writer, 4, (int) value.getUser_interaction_state());
                }
                if (!Intrinsics.areEqual(value.getNext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNext());
                }
                Message.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getMessages());
                if (Intrinsics.areEqual(value.getConversation_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getConversation_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ConversationMessages decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                UserInteractionState userInteractionStateDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ConversationMessages(strDecode, arrayList, strDecode2, userInteractionStateDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(Message.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        userInteractionStateDecode = UserInteractionState.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ConversationMessages redact(ConversationMessages value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getMessages(), Message.ADAPTER);
                UserInteractionState user_interaction_state = value.getUser_interaction_state();
                return ConversationMessages.copy$default(value, null, listM26823redactElements, null, user_interaction_state != null ? UserInteractionState.ADAPTER.redact(user_interaction_state) : null, ByteString.EMPTY, 5, null);
            }
        };
    }
}
