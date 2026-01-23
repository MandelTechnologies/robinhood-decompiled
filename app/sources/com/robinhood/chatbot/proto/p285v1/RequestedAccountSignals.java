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

/* compiled from: RequestedAccountSignals.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J*\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/RequestedAccountSignals;", "Lcom/squareup/wire/Message;", "", "account_signal_name", "", "filters", "", "Lcom/robinhood/chatbot/proto/v1/AccountSignalFilters;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getAccount_signal_name", "()Ljava/lang/String;", "getFilters", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RequestedAccountSignals extends Message {

    @JvmField
    public static final ProtoAdapter<RequestedAccountSignals> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountSignalName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_signal_name;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.AccountSignalFilters#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<AccountSignalFilters> filters;

    public RequestedAccountSignals() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20535newBuilder();
    }

    public final String getAccount_signal_name() {
        return this.account_signal_name;
    }

    public /* synthetic */ RequestedAccountSignals(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestedAccountSignals(String account_signal_name, List<AccountSignalFilters> filters, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_signal_name, "account_signal_name");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_signal_name = account_signal_name;
        this.filters = Internal.immutableCopyOf("filters", filters);
    }

    public final List<AccountSignalFilters> getFilters() {
        return this.filters;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20535newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RequestedAccountSignals)) {
            return false;
        }
        RequestedAccountSignals requestedAccountSignals = (RequestedAccountSignals) other;
        return Intrinsics.areEqual(unknownFields(), requestedAccountSignals.unknownFields()) && Intrinsics.areEqual(this.account_signal_name, requestedAccountSignals.account_signal_name) && Intrinsics.areEqual(this.filters, requestedAccountSignals.filters);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.account_signal_name.hashCode()) * 37) + this.filters.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_signal_name=" + Internal.sanitize(this.account_signal_name));
        if (!this.filters.isEmpty()) {
            arrayList.add("filters=" + this.filters);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RequestedAccountSignals{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestedAccountSignals copy$default(RequestedAccountSignals requestedAccountSignals, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestedAccountSignals.account_signal_name;
        }
        if ((i & 2) != 0) {
            list = requestedAccountSignals.filters;
        }
        if ((i & 4) != 0) {
            byteString = requestedAccountSignals.unknownFields();
        }
        return requestedAccountSignals.copy(str, list, byteString);
    }

    public final RequestedAccountSignals copy(String account_signal_name, List<AccountSignalFilters> filters, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_signal_name, "account_signal_name");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RequestedAccountSignals(account_signal_name, filters, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RequestedAccountSignals.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RequestedAccountSignals>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.RequestedAccountSignals$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RequestedAccountSignals value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_signal_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_signal_name());
                }
                return size + AccountSignalFilters.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getFilters());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RequestedAccountSignals value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_signal_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_signal_name());
                }
                AccountSignalFilters.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getFilters());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RequestedAccountSignals value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AccountSignalFilters.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getFilters());
                if (Intrinsics.areEqual(value.getAccount_signal_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_signal_name());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RequestedAccountSignals decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RequestedAccountSignals(strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(AccountSignalFilters.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RequestedAccountSignals redact(RequestedAccountSignals value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RequestedAccountSignals.copy$default(value, null, Internal.m26823redactElements(value.getFilters(), AccountSignalFilters.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }
}
