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

/* compiled from: SubmitModelPortfolioGroupForApprovalRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lyoda/service/portfolio/SubmitModelPortfolioGroupForApprovalRequest;", "Lcom/squareup/wire/Message;", "", "model_portfolio_group_id", "", "requested_by", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getModel_portfolio_group_id", "()Ljava/lang/String;", "getRequested_by", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "yoda.v1.portfolio_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class SubmitModelPortfolioGroupForApprovalRequest extends Message {

    @JvmField
    public static final ProtoAdapter<SubmitModelPortfolioGroupForApprovalRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "modelPortfolioGroupId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String model_portfolio_group_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestedBy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String requested_by;

    public SubmitModelPortfolioGroupForApprovalRequest() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ SubmitModelPortfolioGroupForApprovalRequest(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30120newBuilder();
    }

    public final String getModel_portfolio_group_id() {
        return this.model_portfolio_group_id;
    }

    public final String getRequested_by() {
        return this.requested_by;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitModelPortfolioGroupForApprovalRequest(String model_portfolio_group_id, String requested_by, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(model_portfolio_group_id, "model_portfolio_group_id");
        Intrinsics.checkNotNullParameter(requested_by, "requested_by");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.model_portfolio_group_id = model_portfolio_group_id;
        this.requested_by = requested_by;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30120newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SubmitModelPortfolioGroupForApprovalRequest)) {
            return false;
        }
        SubmitModelPortfolioGroupForApprovalRequest submitModelPortfolioGroupForApprovalRequest = (SubmitModelPortfolioGroupForApprovalRequest) other;
        return Intrinsics.areEqual(unknownFields(), submitModelPortfolioGroupForApprovalRequest.unknownFields()) && Intrinsics.areEqual(this.model_portfolio_group_id, submitModelPortfolioGroupForApprovalRequest.model_portfolio_group_id) && Intrinsics.areEqual(this.requested_by, submitModelPortfolioGroupForApprovalRequest.requested_by);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.model_portfolio_group_id.hashCode()) * 37) + this.requested_by.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("model_portfolio_group_id=" + Internal.sanitize(this.model_portfolio_group_id));
        arrayList.add("requested_by=" + Internal.sanitize(this.requested_by));
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitModelPortfolioGroupForApprovalRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SubmitModelPortfolioGroupForApprovalRequest copy$default(SubmitModelPortfolioGroupForApprovalRequest submitModelPortfolioGroupForApprovalRequest, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitModelPortfolioGroupForApprovalRequest.model_portfolio_group_id;
        }
        if ((i & 2) != 0) {
            str2 = submitModelPortfolioGroupForApprovalRequest.requested_by;
        }
        if ((i & 4) != 0) {
            byteString = submitModelPortfolioGroupForApprovalRequest.unknownFields();
        }
        return submitModelPortfolioGroupForApprovalRequest.copy(str, str2, byteString);
    }

    public final SubmitModelPortfolioGroupForApprovalRequest copy(String model_portfolio_group_id, String requested_by, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(model_portfolio_group_id, "model_portfolio_group_id");
        Intrinsics.checkNotNullParameter(requested_by, "requested_by");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SubmitModelPortfolioGroupForApprovalRequest(model_portfolio_group_id, requested_by, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubmitModelPortfolioGroupForApprovalRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SubmitModelPortfolioGroupForApprovalRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: yoda.service.portfolio.SubmitModelPortfolioGroupForApprovalRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SubmitModelPortfolioGroupForApprovalRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getModel_portfolio_group_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getModel_portfolio_group_id());
                }
                return !Intrinsics.areEqual(value.getRequested_by(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRequested_by()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SubmitModelPortfolioGroupForApprovalRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getModel_portfolio_group_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getModel_portfolio_group_id());
                }
                if (!Intrinsics.areEqual(value.getRequested_by(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRequested_by());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SubmitModelPortfolioGroupForApprovalRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRequested_by(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRequested_by());
                }
                if (Intrinsics.areEqual(value.getModel_portfolio_group_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getModel_portfolio_group_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubmitModelPortfolioGroupForApprovalRequest redact(SubmitModelPortfolioGroupForApprovalRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SubmitModelPortfolioGroupForApprovalRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SubmitModelPortfolioGroupForApprovalRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SubmitModelPortfolioGroupForApprovalRequest(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
