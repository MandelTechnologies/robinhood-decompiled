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

/* compiled from: GetACRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetACRequest;", "Lcom/squareup/wire/Message;", "", "user_uuid", "", "sf_case_id", "requested_account_signals", "", "Lcom/robinhood/chatbot/proto/v1/RequestedAccountSignals;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getUser_uuid", "()Ljava/lang/String;", "getSf_case_id", "getRequested_account_signals", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class GetACRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetACRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.RequestedAccountSignals#ADAPTER", jsonName = "requestedAccountSignals", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<RequestedAccountSignals> requested_account_signals;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sfCaseId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String sf_case_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userUuid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String user_uuid;

    public GetACRequest() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ GetACRequest(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20494newBuilder();
    }

    public final String getUser_uuid() {
        return this.user_uuid;
    }

    public final String getSf_case_id() {
        return this.sf_case_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetACRequest(String user_uuid, String sf_case_id, List<RequestedAccountSignals> requested_account_signals, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(sf_case_id, "sf_case_id");
        Intrinsics.checkNotNullParameter(requested_account_signals, "requested_account_signals");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_uuid = user_uuid;
        this.sf_case_id = sf_case_id;
        this.requested_account_signals = Internal.immutableCopyOf("requested_account_signals", requested_account_signals);
    }

    public final List<RequestedAccountSignals> getRequested_account_signals() {
        return this.requested_account_signals;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20494newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetACRequest)) {
            return false;
        }
        GetACRequest getACRequest = (GetACRequest) other;
        return Intrinsics.areEqual(unknownFields(), getACRequest.unknownFields()) && Intrinsics.areEqual(this.user_uuid, getACRequest.user_uuid) && Intrinsics.areEqual(this.sf_case_id, getACRequest.sf_case_id) && Intrinsics.areEqual(this.requested_account_signals, getACRequest.requested_account_signals);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.user_uuid.hashCode()) * 37) + this.sf_case_id.hashCode()) * 37) + this.requested_account_signals.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("user_uuid=" + Internal.sanitize(this.user_uuid));
        arrayList.add("sf_case_id=" + Internal.sanitize(this.sf_case_id));
        if (!this.requested_account_signals.isEmpty()) {
            arrayList.add("requested_account_signals=" + this.requested_account_signals);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetACRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetACRequest copy$default(GetACRequest getACRequest, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getACRequest.user_uuid;
        }
        if ((i & 2) != 0) {
            str2 = getACRequest.sf_case_id;
        }
        if ((i & 4) != 0) {
            list = getACRequest.requested_account_signals;
        }
        if ((i & 8) != 0) {
            byteString = getACRequest.unknownFields();
        }
        return getACRequest.copy(str, str2, list, byteString);
    }

    public final GetACRequest copy(String user_uuid, String sf_case_id, List<RequestedAccountSignals> requested_account_signals, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(sf_case_id, "sf_case_id");
        Intrinsics.checkNotNullParameter(requested_account_signals, "requested_account_signals");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetACRequest(user_uuid, sf_case_id, requested_account_signals, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetACRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetACRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.GetACRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetACRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUser_uuid());
                }
                if (!Intrinsics.areEqual(value.getSf_case_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSf_case_id());
                }
                return size + RequestedAccountSignals.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getRequested_account_signals());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetACRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_uuid());
                }
                if (!Intrinsics.areEqual(value.getSf_case_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSf_case_id());
                }
                RequestedAccountSignals.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getRequested_account_signals());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetACRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                RequestedAccountSignals.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getRequested_account_signals());
                if (!Intrinsics.areEqual(value.getSf_case_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSf_case_id());
                }
                if (Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_uuid());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetACRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetACRequest(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(RequestedAccountSignals.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetACRequest redact(GetACRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetACRequest.copy$default(value, null, null, Internal.m26823redactElements(value.getRequested_account_signals(), RequestedAccountSignals.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }
}
