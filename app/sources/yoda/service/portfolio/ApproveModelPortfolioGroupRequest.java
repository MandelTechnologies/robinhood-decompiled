package yoda.service.portfolio;

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

/* compiled from: ApproveModelPortfolioGroupRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lyoda/service/portfolio/ApproveModelPortfolioGroupRequest;", "Lcom/squareup/wire/Message;", "", "model_portfolio_group_id", "", "approved_by", "is_force_rebalance", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getModel_portfolio_group_id", "()Ljava/lang/String;", "getApproved_by", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "yoda.v1.portfolio_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ApproveModelPortfolioGroupRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ApproveModelPortfolioGroupRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "approvedBy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String approved_by;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isForceRebalance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_force_rebalance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "modelPortfolioGroupId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String model_portfolio_group_id;

    public ApproveModelPortfolioGroupRequest() {
        this(null, null, false, null, 15, null);
    }

    public /* synthetic */ ApproveModelPortfolioGroupRequest(String str, String str2, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30119newBuilder();
    }

    public final String getModel_portfolio_group_id() {
        return this.model_portfolio_group_id;
    }

    public final String getApproved_by() {
        return this.approved_by;
    }

    /* renamed from: is_force_rebalance, reason: from getter */
    public final boolean getIs_force_rebalance() {
        return this.is_force_rebalance;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApproveModelPortfolioGroupRequest(String model_portfolio_group_id, String approved_by, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(model_portfolio_group_id, "model_portfolio_group_id");
        Intrinsics.checkNotNullParameter(approved_by, "approved_by");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.model_portfolio_group_id = model_portfolio_group_id;
        this.approved_by = approved_by;
        this.is_force_rebalance = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30119newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ApproveModelPortfolioGroupRequest)) {
            return false;
        }
        ApproveModelPortfolioGroupRequest approveModelPortfolioGroupRequest = (ApproveModelPortfolioGroupRequest) other;
        return Intrinsics.areEqual(unknownFields(), approveModelPortfolioGroupRequest.unknownFields()) && Intrinsics.areEqual(this.model_portfolio_group_id, approveModelPortfolioGroupRequest.model_portfolio_group_id) && Intrinsics.areEqual(this.approved_by, approveModelPortfolioGroupRequest.approved_by) && this.is_force_rebalance == approveModelPortfolioGroupRequest.is_force_rebalance;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.model_portfolio_group_id.hashCode()) * 37) + this.approved_by.hashCode()) * 37) + Boolean.hashCode(this.is_force_rebalance);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("model_portfolio_group_id=" + Internal.sanitize(this.model_portfolio_group_id));
        arrayList.add("approved_by=" + Internal.sanitize(this.approved_by));
        arrayList.add("is_force_rebalance=" + this.is_force_rebalance);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ApproveModelPortfolioGroupRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ApproveModelPortfolioGroupRequest copy$default(ApproveModelPortfolioGroupRequest approveModelPortfolioGroupRequest, String str, String str2, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approveModelPortfolioGroupRequest.model_portfolio_group_id;
        }
        if ((i & 2) != 0) {
            str2 = approveModelPortfolioGroupRequest.approved_by;
        }
        if ((i & 4) != 0) {
            z = approveModelPortfolioGroupRequest.is_force_rebalance;
        }
        if ((i & 8) != 0) {
            byteString = approveModelPortfolioGroupRequest.unknownFields();
        }
        return approveModelPortfolioGroupRequest.copy(str, str2, z, byteString);
    }

    public final ApproveModelPortfolioGroupRequest copy(String model_portfolio_group_id, String approved_by, boolean is_force_rebalance, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(model_portfolio_group_id, "model_portfolio_group_id");
        Intrinsics.checkNotNullParameter(approved_by, "approved_by");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ApproveModelPortfolioGroupRequest(model_portfolio_group_id, approved_by, is_force_rebalance, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ApproveModelPortfolioGroupRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ApproveModelPortfolioGroupRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: yoda.service.portfolio.ApproveModelPortfolioGroupRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ApproveModelPortfolioGroupRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getModel_portfolio_group_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getModel_portfolio_group_id());
                }
                if (!Intrinsics.areEqual(value.getApproved_by(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getApproved_by());
                }
                return value.getIs_force_rebalance() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_force_rebalance())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ApproveModelPortfolioGroupRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getModel_portfolio_group_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getModel_portfolio_group_id());
                }
                if (!Intrinsics.areEqual(value.getApproved_by(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getApproved_by());
                }
                if (value.getIs_force_rebalance()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_force_rebalance()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ApproveModelPortfolioGroupRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_force_rebalance()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_force_rebalance()));
                }
                if (!Intrinsics.areEqual(value.getApproved_by(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getApproved_by());
                }
                if (Intrinsics.areEqual(value.getModel_portfolio_group_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getModel_portfolio_group_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ApproveModelPortfolioGroupRequest redact(ApproveModelPortfolioGroupRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ApproveModelPortfolioGroupRequest.copy$default(value, null, null, false, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ApproveModelPortfolioGroupRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ApproveModelPortfolioGroupRequest(strDecode, strDecode2, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
