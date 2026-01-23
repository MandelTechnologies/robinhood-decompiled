package bonfire.proto.idl.transfers.p040v1;

import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
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

/* compiled from: RhmRtpFirmTransferActionRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lbonfire/proto/idl/transfers/v1/RhmRtpFirmTransferActionRequest;", "Lcom/squareup/wire/Message;", "", MatchSelectionActivity.TRANSFER_ID_EXTRA, "", "action", "approve_params", "Lbonfire/proto/idl/transfers/v1/AdminApproveParams;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/transfers/v1/AdminApproveParams;Lokio/ByteString;)V", "getTransfer_id", "()Ljava/lang/String;", "getAction", "getApprove_params", "()Lbonfire/proto/idl/transfers/v1/AdminApproveParams;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RhmRtpFirmTransferActionRequest extends Message {

    @JvmField
    public static final ProtoAdapter<RhmRtpFirmTransferActionRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String action;

    @WireField(adapter = "bonfire.proto.idl.transfers.v1.AdminApproveParams#ADAPTER", jsonName = "approveParams", schemaIndex = 2, tag = 3)
    private final AdminApproveParams approve_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transferId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String transfer_id;

    public RhmRtpFirmTransferActionRequest() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ RhmRtpFirmTransferActionRequest(String str, String str2, AdminApproveParams adminApproveParams, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : adminApproveParams, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9051newBuilder();
    }

    public final String getTransfer_id() {
        return this.transfer_id;
    }

    public final String getAction() {
        return this.action;
    }

    public final AdminApproveParams getApprove_params() {
        return this.approve_params;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhmRtpFirmTransferActionRequest(String transfer_id, String action, AdminApproveParams adminApproveParams, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.transfer_id = transfer_id;
        this.action = action;
        this.approve_params = adminApproveParams;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9051newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RhmRtpFirmTransferActionRequest)) {
            return false;
        }
        RhmRtpFirmTransferActionRequest rhmRtpFirmTransferActionRequest = (RhmRtpFirmTransferActionRequest) other;
        return Intrinsics.areEqual(unknownFields(), rhmRtpFirmTransferActionRequest.unknownFields()) && Intrinsics.areEqual(this.transfer_id, rhmRtpFirmTransferActionRequest.transfer_id) && Intrinsics.areEqual(this.action, rhmRtpFirmTransferActionRequest.action) && Intrinsics.areEqual(this.approve_params, rhmRtpFirmTransferActionRequest.approve_params);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.transfer_id.hashCode()) * 37) + this.action.hashCode()) * 37;
        AdminApproveParams adminApproveParams = this.approve_params;
        int iHashCode2 = iHashCode + (adminApproveParams != null ? adminApproveParams.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("transfer_id=" + Internal.sanitize(this.transfer_id));
        arrayList.add("action=" + Internal.sanitize(this.action));
        AdminApproveParams adminApproveParams = this.approve_params;
        if (adminApproveParams != null) {
            arrayList.add("approve_params=" + adminApproveParams);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RhmRtpFirmTransferActionRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RhmRtpFirmTransferActionRequest copy$default(RhmRtpFirmTransferActionRequest rhmRtpFirmTransferActionRequest, String str, String str2, AdminApproveParams adminApproveParams, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rhmRtpFirmTransferActionRequest.transfer_id;
        }
        if ((i & 2) != 0) {
            str2 = rhmRtpFirmTransferActionRequest.action;
        }
        if ((i & 4) != 0) {
            adminApproveParams = rhmRtpFirmTransferActionRequest.approve_params;
        }
        if ((i & 8) != 0) {
            byteString = rhmRtpFirmTransferActionRequest.unknownFields();
        }
        return rhmRtpFirmTransferActionRequest.copy(str, str2, adminApproveParams, byteString);
    }

    public final RhmRtpFirmTransferActionRequest copy(String transfer_id, String action, AdminApproveParams approve_params, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RhmRtpFirmTransferActionRequest(transfer_id, action, approve_params, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RhmRtpFirmTransferActionRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RhmRtpFirmTransferActionRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.transfers.v1.RhmRtpFirmTransferActionRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RhmRtpFirmTransferActionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTransfer_id());
                }
                if (!Intrinsics.areEqual(value.getAction(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAction());
                }
                return size + AdminApproveParams.ADAPTER.encodedSizeWithTag(3, value.getApprove_params());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RhmRtpFirmTransferActionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTransfer_id());
                }
                if (!Intrinsics.areEqual(value.getAction(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAction());
                }
                AdminApproveParams.ADAPTER.encodeWithTag(writer, 3, (int) value.getApprove_params());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RhmRtpFirmTransferActionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AdminApproveParams.ADAPTER.encodeWithTag(writer, 3, (int) value.getApprove_params());
                if (!Intrinsics.areEqual(value.getAction(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAction());
                }
                if (Intrinsics.areEqual(value.getTransfer_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTransfer_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RhmRtpFirmTransferActionRequest redact(RhmRtpFirmTransferActionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdminApproveParams approve_params = value.getApprove_params();
                return RhmRtpFirmTransferActionRequest.copy$default(value, null, null, approve_params != null ? AdminApproveParams.ADAPTER.redact(approve_params) : null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RhmRtpFirmTransferActionRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                AdminApproveParams adminApproveParamsDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RhmRtpFirmTransferActionRequest(strDecode, strDecode2, adminApproveParamsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        adminApproveParamsDecode = AdminApproveParams.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
