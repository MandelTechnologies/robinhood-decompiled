package com.robinhood.chatbot.proto.p285v1;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: TriggerStateExecutionRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/TriggerStateExecutionRequest;", "Lcom/squareup/wire/Message;", "", "conversation_id", "", "state_name", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getConversation_id", "()Ljava/lang/String;", "getState_name", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class TriggerStateExecutionRequest extends Message {

    @JvmField
    public static final ProtoAdapter<TriggerStateExecutionRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "conversationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String conversation_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stateName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String state_name;

    public TriggerStateExecutionRequest() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ TriggerStateExecutionRequest(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20559newBuilder();
    }

    public final String getConversation_id() {
        return this.conversation_id;
    }

    public final String getState_name() {
        return this.state_name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerStateExecutionRequest(String conversation_id, String state_name, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(state_name, "state_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.conversation_id = conversation_id;
        this.state_name = state_name;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20559newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TriggerStateExecutionRequest)) {
            return false;
        }
        TriggerStateExecutionRequest triggerStateExecutionRequest = (TriggerStateExecutionRequest) other;
        return Intrinsics.areEqual(unknownFields(), triggerStateExecutionRequest.unknownFields()) && Intrinsics.areEqual(this.conversation_id, triggerStateExecutionRequest.conversation_id) && Intrinsics.areEqual(this.state_name, triggerStateExecutionRequest.state_name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.conversation_id.hashCode()) * 37) + this.state_name.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("conversation_id=" + Internal.sanitize(this.conversation_id));
        arrayList.add("state_name=" + Internal.sanitize(this.state_name));
        return CollectionsKt.joinToString$default(arrayList, ", ", "TriggerStateExecutionRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TriggerStateExecutionRequest copy$default(TriggerStateExecutionRequest triggerStateExecutionRequest, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = triggerStateExecutionRequest.conversation_id;
        }
        if ((i & 2) != 0) {
            str2 = triggerStateExecutionRequest.state_name;
        }
        if ((i & 4) != 0) {
            byteString = triggerStateExecutionRequest.unknownFields();
        }
        return triggerStateExecutionRequest.copy(str, str2, byteString);
    }

    public final TriggerStateExecutionRequest copy(String conversation_id, String state_name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(state_name, "state_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TriggerStateExecutionRequest(conversation_id, state_name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TriggerStateExecutionRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TriggerStateExecutionRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.TriggerStateExecutionRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TriggerStateExecutionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getConversation_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getConversation_id());
                }
                return !Intrinsics.areEqual(value.getState_name(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getState_name()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TriggerStateExecutionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getConversation_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getConversation_id());
                }
                if (!Intrinsics.areEqual(value.getState_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getState_name());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TriggerStateExecutionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getState_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getState_name());
                }
                if (Intrinsics.areEqual(value.getConversation_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getConversation_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TriggerStateExecutionRequest redact(TriggerStateExecutionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TriggerStateExecutionRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TriggerStateExecutionRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TriggerStateExecutionRequest(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
