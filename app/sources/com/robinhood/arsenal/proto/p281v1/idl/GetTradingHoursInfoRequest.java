package com.robinhood.arsenal.proto.p281v1.idl;

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

/* compiled from: GetTradingHoursInfoRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetTradingHoursInfoRequest;", "Lcom/squareup/wire/Message;", "", "contract_id", "", "timezone", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getContract_id$annotations", "()V", "getContract_id", "()Ljava/lang/String;", "getTimezone$annotations", "getTimezone", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class GetTradingHoursInfoRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetTradingHoursInfoRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String timezone;

    public GetTradingHoursInfoRequest() {
        this(null, null, null, 7, null);
    }

    @Deprecated
    public static /* synthetic */ void getContract_id$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getTimezone$annotations() {
    }

    public /* synthetic */ GetTradingHoursInfoRequest(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20165newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTradingHoursInfoRequest(String contract_id, String timezone, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.timezone = timezone;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20165newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTradingHoursInfoRequest)) {
            return false;
        }
        GetTradingHoursInfoRequest getTradingHoursInfoRequest = (GetTradingHoursInfoRequest) other;
        return Intrinsics.areEqual(unknownFields(), getTradingHoursInfoRequest.unknownFields()) && Intrinsics.areEqual(this.contract_id, getTradingHoursInfoRequest.contract_id) && Intrinsics.areEqual(this.timezone, getTradingHoursInfoRequest.timezone);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37) + this.timezone.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("timezone=" + Internal.sanitize(this.timezone));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTradingHoursInfoRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetTradingHoursInfoRequest copy$default(GetTradingHoursInfoRequest getTradingHoursInfoRequest, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getTradingHoursInfoRequest.contract_id;
        }
        if ((i & 2) != 0) {
            str2 = getTradingHoursInfoRequest.timezone;
        }
        if ((i & 4) != 0) {
            byteString = getTradingHoursInfoRequest.unknownFields();
        }
        return getTradingHoursInfoRequest.copy(str, str2, byteString);
    }

    public final GetTradingHoursInfoRequest copy(String contract_id, String timezone, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTradingHoursInfoRequest(contract_id, timezone, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTradingHoursInfoRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTradingHoursInfoRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.GetTradingHoursInfoRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTradingHoursInfoRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                return !Intrinsics.areEqual(value.getTimezone(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTimezone()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTradingHoursInfoRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getTimezone(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTimezone());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTradingHoursInfoRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTimezone(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTimezone());
                }
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTradingHoursInfoRequest redact(GetTradingHoursInfoRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetTradingHoursInfoRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTradingHoursInfoRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetTradingHoursInfoRequest(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
