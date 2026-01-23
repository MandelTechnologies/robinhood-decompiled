package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* compiled from: GetSSFResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J0\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetSSFResponse;", "Lcom/squareup/wire/Message;", "", MatchaQrCodeDuxo6.USER_ID_KEY, "", "ssf_details", "", "Lcom/robinhood/chatbot/proto/v1/SelfServeFlowDetails;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lokio/ByteString;)V", "getUser_id", "()Ljava/lang/String;", "getSsf_details", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class GetSSFResponse extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.SelfServeFlowDetails#ADAPTER", jsonName = "ssfDetails", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final Map<String, SelfServeFlowDetails> ssf_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String user_id;

    @JvmField
    public static final ProtoAdapter<GetSSFResponse> ADAPTER = new GetSSFResponse2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(GetSSFResponse.class), Syntax.PROTO_3);

    public GetSSFResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20509newBuilder();
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public /* synthetic */ GetSSFResponse(String str, Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MapsKt.emptyMap() : map, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSSFResponse(String user_id, Map<String, SelfServeFlowDetails> ssf_details, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(ssf_details, "ssf_details");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_id = user_id;
        this.ssf_details = Internal.immutableCopyOf("ssf_details", ssf_details);
    }

    public final Map<String, SelfServeFlowDetails> getSsf_details() {
        return this.ssf_details;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20509newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetSSFResponse)) {
            return false;
        }
        GetSSFResponse getSSFResponse = (GetSSFResponse) other;
        return Intrinsics.areEqual(unknownFields(), getSSFResponse.unknownFields()) && Intrinsics.areEqual(this.user_id, getSSFResponse.user_id) && Intrinsics.areEqual(this.ssf_details, getSSFResponse.ssf_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.user_id.hashCode()) * 37) + this.ssf_details.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("user_id=" + Internal.sanitize(this.user_id));
        if (!this.ssf_details.isEmpty()) {
            arrayList.add("ssf_details=" + this.ssf_details);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSSFResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetSSFResponse copy$default(GetSSFResponse getSSFResponse, String str, Map map, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getSSFResponse.user_id;
        }
        if ((i & 2) != 0) {
            map = getSSFResponse.ssf_details;
        }
        if ((i & 4) != 0) {
            byteString = getSSFResponse.unknownFields();
        }
        return getSSFResponse.copy(str, map, byteString);
    }

    public final GetSSFResponse copy(String user_id, Map<String, SelfServeFlowDetails> ssf_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(ssf_details, "ssf_details");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetSSFResponse(user_id, ssf_details, unknownFields);
    }
}
