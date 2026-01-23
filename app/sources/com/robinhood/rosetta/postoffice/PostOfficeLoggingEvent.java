package com.robinhood.rosetta.postoffice;

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

/* compiled from: PostOfficeLoggingEvent.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J>\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEvent;", "Lcom/squareup/wire/Message;", "", "user_info", "Lcom/robinhood/rosetta/postoffice/UserInfo;", "comm_info", "Lcom/robinhood/rosetta/postoffice/CommInfo;", "event_context", "Lcom/robinhood/rosetta/postoffice/EventContext;", "extra_fields", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/postoffice/UserInfo;Lcom/robinhood/rosetta/postoffice/CommInfo;Lcom/robinhood/rosetta/postoffice/EventContext;Ljava/lang/String;Lokio/ByteString;)V", "getUser_info", "()Lcom/robinhood/rosetta/postoffice/UserInfo;", "getComm_info", "()Lcom/robinhood/rosetta/postoffice/CommInfo;", "getEvent_context", "()Lcom/robinhood/rosetta/postoffice/EventContext;", "getExtra_fields", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PostOfficeLoggingEvent extends Message {

    @JvmField
    public static final ProtoAdapter<PostOfficeLoggingEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.postoffice.CommInfo#ADAPTER", jsonName = "commInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CommInfo comm_info;

    @WireField(adapter = "com.robinhood.rosetta.postoffice.EventContext#ADAPTER", jsonName = "eventContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final EventContext event_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "extraFields", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String extra_fields;

    @WireField(adapter = "com.robinhood.rosetta.postoffice.UserInfo#ADAPTER", jsonName = "userInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UserInfo user_info;

    public PostOfficeLoggingEvent() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24741newBuilder();
    }

    public final UserInfo getUser_info() {
        return this.user_info;
    }

    public final CommInfo getComm_info() {
        return this.comm_info;
    }

    public final EventContext getEvent_context() {
        return this.event_context;
    }

    public final String getExtra_fields() {
        return this.extra_fields;
    }

    public /* synthetic */ PostOfficeLoggingEvent(UserInfo userInfo, CommInfo commInfo, EventContext eventContext, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userInfo, (i & 2) != 0 ? null : commInfo, (i & 4) != 0 ? null : eventContext, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostOfficeLoggingEvent(UserInfo userInfo, CommInfo commInfo, EventContext eventContext, String extra_fields, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(extra_fields, "extra_fields");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_info = userInfo;
        this.comm_info = commInfo;
        this.event_context = eventContext;
        this.extra_fields = extra_fields;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24741newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PostOfficeLoggingEvent)) {
            return false;
        }
        PostOfficeLoggingEvent postOfficeLoggingEvent = (PostOfficeLoggingEvent) other;
        return Intrinsics.areEqual(unknownFields(), postOfficeLoggingEvent.unknownFields()) && Intrinsics.areEqual(this.user_info, postOfficeLoggingEvent.user_info) && Intrinsics.areEqual(this.comm_info, postOfficeLoggingEvent.comm_info) && Intrinsics.areEqual(this.event_context, postOfficeLoggingEvent.event_context) && Intrinsics.areEqual(this.extra_fields, postOfficeLoggingEvent.extra_fields);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UserInfo userInfo = this.user_info;
        int iHashCode2 = (iHashCode + (userInfo != null ? userInfo.hashCode() : 0)) * 37;
        CommInfo commInfo = this.comm_info;
        int iHashCode3 = (iHashCode2 + (commInfo != null ? commInfo.hashCode() : 0)) * 37;
        EventContext eventContext = this.event_context;
        int iHashCode4 = ((iHashCode3 + (eventContext != null ? eventContext.hashCode() : 0)) * 37) + this.extra_fields.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UserInfo userInfo = this.user_info;
        if (userInfo != null) {
            arrayList.add("user_info=" + userInfo);
        }
        CommInfo commInfo = this.comm_info;
        if (commInfo != null) {
            arrayList.add("comm_info=" + commInfo);
        }
        EventContext eventContext = this.event_context;
        if (eventContext != null) {
            arrayList.add("event_context=" + eventContext);
        }
        arrayList.add("extra_fields=" + Internal.sanitize(this.extra_fields));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PostOfficeLoggingEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PostOfficeLoggingEvent copy$default(PostOfficeLoggingEvent postOfficeLoggingEvent, UserInfo userInfo, CommInfo commInfo, EventContext eventContext, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            userInfo = postOfficeLoggingEvent.user_info;
        }
        if ((i & 2) != 0) {
            commInfo = postOfficeLoggingEvent.comm_info;
        }
        if ((i & 4) != 0) {
            eventContext = postOfficeLoggingEvent.event_context;
        }
        if ((i & 8) != 0) {
            str = postOfficeLoggingEvent.extra_fields;
        }
        if ((i & 16) != 0) {
            byteString = postOfficeLoggingEvent.unknownFields();
        }
        ByteString byteString2 = byteString;
        EventContext eventContext2 = eventContext;
        return postOfficeLoggingEvent.copy(userInfo, commInfo, eventContext2, str, byteString2);
    }

    public final PostOfficeLoggingEvent copy(UserInfo user_info, CommInfo comm_info, EventContext event_context, String extra_fields, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(extra_fields, "extra_fields");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PostOfficeLoggingEvent(user_info, comm_info, event_context, extra_fields, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PostOfficeLoggingEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PostOfficeLoggingEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.postoffice.PostOfficeLoggingEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PostOfficeLoggingEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getUser_info() != null) {
                    size += UserInfo.ADAPTER.encodedSizeWithTag(1, value.getUser_info());
                }
                if (value.getComm_info() != null) {
                    size += CommInfo.ADAPTER.encodedSizeWithTag(2, value.getComm_info());
                }
                if (value.getEvent_context() != null) {
                    size += EventContext.ADAPTER.encodedSizeWithTag(3, value.getEvent_context());
                }
                return !Intrinsics.areEqual(value.getExtra_fields(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getExtra_fields()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PostOfficeLoggingEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getUser_info() != null) {
                    UserInfo.ADAPTER.encodeWithTag(writer, 1, (int) value.getUser_info());
                }
                if (value.getComm_info() != null) {
                    CommInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getComm_info());
                }
                if (value.getEvent_context() != null) {
                    EventContext.ADAPTER.encodeWithTag(writer, 3, (int) value.getEvent_context());
                }
                if (!Intrinsics.areEqual(value.getExtra_fields(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getExtra_fields());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PostOfficeLoggingEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getExtra_fields(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getExtra_fields());
                }
                if (value.getEvent_context() != null) {
                    EventContext.ADAPTER.encodeWithTag(writer, 3, (int) value.getEvent_context());
                }
                if (value.getComm_info() != null) {
                    CommInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getComm_info());
                }
                if (value.getUser_info() != null) {
                    UserInfo.ADAPTER.encodeWithTag(writer, 1, (int) value.getUser_info());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PostOfficeLoggingEvent redact(PostOfficeLoggingEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UserInfo user_info = value.getUser_info();
                UserInfo userInfoRedact = user_info != null ? UserInfo.ADAPTER.redact(user_info) : null;
                CommInfo comm_info = value.getComm_info();
                CommInfo commInfoRedact = comm_info != null ? CommInfo.ADAPTER.redact(comm_info) : null;
                EventContext event_context = value.getEvent_context();
                return PostOfficeLoggingEvent.copy$default(value, userInfoRedact, commInfoRedact, event_context != null ? EventContext.ADAPTER.redact(event_context) : null, null, ByteString.EMPTY, 8, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PostOfficeLoggingEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                UserInfo userInfoDecode = null;
                EventContext eventContextDecode = null;
                String strDecode = "";
                CommInfo commInfoDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PostOfficeLoggingEvent(userInfoDecode, commInfoDecode, eventContextDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        userInfoDecode = UserInfo.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        commInfoDecode = CommInfo.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        eventContextDecode = EventContext.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
