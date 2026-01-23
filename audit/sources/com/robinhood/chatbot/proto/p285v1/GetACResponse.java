package com.robinhood.chatbot.proto.p285v1;

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

/* compiled from: GetACResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B'\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J&\u0010\u0015\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\"\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetACResponse;", "Lcom/squareup/wire/Message;", "", "account_signal_values", "", "", "Lcom/robinhood/chatbot/proto/v1/AccountSignalObjList;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/Map;Lokio/ByteString;)V", "getAccount_signal_values", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class GetACResponse extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.AccountSignalObjList#ADAPTER", jsonName = "accountSignalValues", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final Map<String, AccountSignalObjList> account_signal_values;

    @JvmField
    public static final ProtoAdapter<GetACResponse> ADAPTER = new GetACResponse2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(GetACResponse.class), Syntax.PROTO_3);

    /* JADX WARN: Multi-variable type inference failed */
    public GetACResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20497newBuilder();
    }

    public /* synthetic */ GetACResponse(Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetACResponse(Map<String, AccountSignalObjList> account_signal_values, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_signal_values, "account_signal_values");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_signal_values = Internal.immutableCopyOf("account_signal_values", account_signal_values);
    }

    public final Map<String, AccountSignalObjList> getAccount_signal_values() {
        return this.account_signal_values;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20497newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetACResponse)) {
            return false;
        }
        GetACResponse getACResponse = (GetACResponse) other;
        return Intrinsics.areEqual(unknownFields(), getACResponse.unknownFields()) && Intrinsics.areEqual(this.account_signal_values, getACResponse.account_signal_values);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.account_signal_values.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.account_signal_values.isEmpty()) {
            arrayList.add("account_signal_values=" + this.account_signal_values);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetACResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetACResponse copy$default(GetACResponse getACResponse, Map map, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            map = getACResponse.account_signal_values;
        }
        if ((i & 2) != 0) {
            byteString = getACResponse.unknownFields();
        }
        return getACResponse.copy(map, byteString);
    }

    public final GetACResponse copy(Map<String, AccountSignalObjList> account_signal_values, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_signal_values, "account_signal_values");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetACResponse(account_signal_values, unknownFields);
    }
}
