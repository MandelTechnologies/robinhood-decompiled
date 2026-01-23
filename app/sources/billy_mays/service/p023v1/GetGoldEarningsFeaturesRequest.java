package billy_mays.service.p023v1;

import bff_money_movement.service.p019v1.CreateTransferAccount;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: GetGoldEarningsFeaturesRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequest;", "Lcom/squareup/wire/Message;", "", "source", "Lbff_money_movement/service/v1/CreateTransferAccount;", "sink", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/CreateTransferAccount;Lbff_money_movement/service/v1/CreateTransferAccount;Lokio/ByteString;)V", "getSource", "()Lbff_money_movement/service/v1/CreateTransferAccount;", "getSink", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetGoldEarningsFeaturesRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetGoldEarningsFeaturesRequest> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.CreateTransferAccount#ADAPTER", schemaIndex = 1, tag = 2)
    private final CreateTransferAccount sink;

    @WireField(adapter = "bff_money_movement.service.v1.CreateTransferAccount#ADAPTER", schemaIndex = 0, tag = 1)
    private final CreateTransferAccount source;

    public GetGoldEarningsFeaturesRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8546newBuilder();
    }

    public final CreateTransferAccount getSource() {
        return this.source;
    }

    public final CreateTransferAccount getSink() {
        return this.sink;
    }

    public /* synthetic */ GetGoldEarningsFeaturesRequest(CreateTransferAccount createTransferAccount, CreateTransferAccount createTransferAccount2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : createTransferAccount, (i & 2) != 0 ? null : createTransferAccount2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetGoldEarningsFeaturesRequest(CreateTransferAccount createTransferAccount, CreateTransferAccount createTransferAccount2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.source = createTransferAccount;
        this.sink = createTransferAccount2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8546newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetGoldEarningsFeaturesRequest)) {
            return false;
        }
        GetGoldEarningsFeaturesRequest getGoldEarningsFeaturesRequest = (GetGoldEarningsFeaturesRequest) other;
        return Intrinsics.areEqual(unknownFields(), getGoldEarningsFeaturesRequest.unknownFields()) && Intrinsics.areEqual(this.source, getGoldEarningsFeaturesRequest.source) && Intrinsics.areEqual(this.sink, getGoldEarningsFeaturesRequest.sink);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        CreateTransferAccount createTransferAccount = this.source;
        int iHashCode2 = (iHashCode + (createTransferAccount != null ? createTransferAccount.hashCode() : 0)) * 37;
        CreateTransferAccount createTransferAccount2 = this.sink;
        int iHashCode3 = iHashCode2 + (createTransferAccount2 != null ? createTransferAccount2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        CreateTransferAccount createTransferAccount = this.source;
        if (createTransferAccount != null) {
            arrayList.add("source=" + createTransferAccount);
        }
        CreateTransferAccount createTransferAccount2 = this.sink;
        if (createTransferAccount2 != null) {
            arrayList.add("sink=" + createTransferAccount2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetGoldEarningsFeaturesRequest{", "}", 0, null, null, 56, null);
    }

    public final GetGoldEarningsFeaturesRequest copy(CreateTransferAccount source, CreateTransferAccount sink, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetGoldEarningsFeaturesRequest(source, sink, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetGoldEarningsFeaturesRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetGoldEarningsFeaturesRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: billy_mays.service.v1.GetGoldEarningsFeaturesRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetGoldEarningsFeaturesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<CreateTransferAccount> protoAdapter = CreateTransferAccount.ADAPTER;
                return size + protoAdapter.encodedSizeWithTag(1, value.getSource()) + protoAdapter.encodedSizeWithTag(2, value.getSink());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetGoldEarningsFeaturesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<CreateTransferAccount> protoAdapter = CreateTransferAccount.ADAPTER;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getSource());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSink());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetGoldEarningsFeaturesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<CreateTransferAccount> protoAdapter = CreateTransferAccount.ADAPTER;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSink());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getSource());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetGoldEarningsFeaturesRequest redact(GetGoldEarningsFeaturesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CreateTransferAccount source = value.getSource();
                CreateTransferAccount createTransferAccountRedact = source != null ? CreateTransferAccount.ADAPTER.redact(source) : null;
                CreateTransferAccount sink = value.getSink();
                return value.copy(createTransferAccountRedact, sink != null ? CreateTransferAccount.ADAPTER.redact(sink) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetGoldEarningsFeaturesRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                CreateTransferAccount createTransferAccountDecode = null;
                CreateTransferAccount createTransferAccountDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetGoldEarningsFeaturesRequest(createTransferAccountDecode, createTransferAccountDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        createTransferAccountDecode = CreateTransferAccount.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        createTransferAccountDecode2 = CreateTransferAccount.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
