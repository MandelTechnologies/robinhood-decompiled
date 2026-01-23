package idl.recurring.proto.p474v1;

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

/* compiled from: GetScheduleConfigRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lidl/recurring/proto/v1/GetScheduleConfigRequest;", "Lcom/squareup/wire/Message;", "", "account_number", "", "asset_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getAsset_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.recurring.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetScheduleConfigRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetScheduleConfigRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String asset_id;

    public GetScheduleConfigRequest() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ GetScheduleConfigRequest(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28442newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getAsset_id() {
        return this.asset_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetScheduleConfigRequest(String account_number, String asset_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(asset_id, "asset_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.asset_id = asset_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28442newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetScheduleConfigRequest)) {
            return false;
        }
        GetScheduleConfigRequest getScheduleConfigRequest = (GetScheduleConfigRequest) other;
        return Intrinsics.areEqual(unknownFields(), getScheduleConfigRequest.unknownFields()) && Intrinsics.areEqual(this.account_number, getScheduleConfigRequest.account_number) && Intrinsics.areEqual(this.asset_id, getScheduleConfigRequest.asset_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.asset_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("asset_id=" + Internal.sanitize(this.asset_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetScheduleConfigRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetScheduleConfigRequest copy$default(GetScheduleConfigRequest getScheduleConfigRequest, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getScheduleConfigRequest.account_number;
        }
        if ((i & 2) != 0) {
            str2 = getScheduleConfigRequest.asset_id;
        }
        if ((i & 4) != 0) {
            byteString = getScheduleConfigRequest.unknownFields();
        }
        return getScheduleConfigRequest.copy(str, str2, byteString);
    }

    public final GetScheduleConfigRequest copy(String account_number, String asset_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(asset_id, "asset_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetScheduleConfigRequest(account_number, asset_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetScheduleConfigRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetScheduleConfigRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: idl.recurring.proto.v1.GetScheduleConfigRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetScheduleConfigRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                return !Intrinsics.areEqual(value.getAsset_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAsset_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetScheduleConfigRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getAsset_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsset_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetScheduleConfigRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAsset_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsset_id());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetScheduleConfigRequest redact(GetScheduleConfigRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetScheduleConfigRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetScheduleConfigRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetScheduleConfigRequest(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
