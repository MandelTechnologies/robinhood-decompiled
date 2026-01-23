package nummus.p512v1;

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

/* compiled from: CreateCostBasisLotResponse.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lnummus/v1/CreateCostBasisLotResponse;", "Lcom/squareup/wire/Message;", "", "lot_id", "", "status", "validation", "Lnummus/v1/ValidationInfo;", "deposit_summary", "Lnummus/v1/CostBasisLotsSummary;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lnummus/v1/ValidationInfo;Lnummus/v1/CostBasisLotsSummary;Lokio/ByteString;)V", "getLot_id", "()Ljava/lang/String;", "getStatus", "getValidation", "()Lnummus/v1/ValidationInfo;", "getDeposit_summary", "()Lnummus/v1/CostBasisLotsSummary;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CreateCostBasisLotResponse extends Message {

    @JvmField
    public static final ProtoAdapter<CreateCostBasisLotResponse> ADAPTER;

    @WireField(adapter = "nummus.v1.CostBasisLotsSummary#ADAPTER", jsonName = "depositSummary", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CostBasisLotsSummary deposit_summary;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lotId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String lot_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String status;

    @WireField(adapter = "nummus.v1.ValidationInfo#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ValidationInfo validation;

    public CreateCostBasisLotResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ CreateCostBasisLotResponse(String str, String str2, ValidationInfo validationInfo, CostBasisLotsSummary costBasisLotsSummary, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : validationInfo, (i & 8) != 0 ? null : costBasisLotsSummary, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29413newBuilder();
    }

    public final String getLot_id() {
        return this.lot_id;
    }

    public final String getStatus() {
        return this.status;
    }

    public final ValidationInfo getValidation() {
        return this.validation;
    }

    public final CostBasisLotsSummary getDeposit_summary() {
        return this.deposit_summary;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCostBasisLotResponse(String lot_id, String status, ValidationInfo validationInfo, CostBasisLotsSummary costBasisLotsSummary, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(lot_id, "lot_id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.lot_id = lot_id;
        this.status = status;
        this.validation = validationInfo;
        this.deposit_summary = costBasisLotsSummary;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29413newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateCostBasisLotResponse)) {
            return false;
        }
        CreateCostBasisLotResponse createCostBasisLotResponse = (CreateCostBasisLotResponse) other;
        return Intrinsics.areEqual(unknownFields(), createCostBasisLotResponse.unknownFields()) && Intrinsics.areEqual(this.lot_id, createCostBasisLotResponse.lot_id) && Intrinsics.areEqual(this.status, createCostBasisLotResponse.status) && Intrinsics.areEqual(this.validation, createCostBasisLotResponse.validation) && Intrinsics.areEqual(this.deposit_summary, createCostBasisLotResponse.deposit_summary);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.lot_id.hashCode()) * 37) + this.status.hashCode()) * 37;
        ValidationInfo validationInfo = this.validation;
        int iHashCode2 = (iHashCode + (validationInfo != null ? validationInfo.hashCode() : 0)) * 37;
        CostBasisLotsSummary costBasisLotsSummary = this.deposit_summary;
        int iHashCode3 = iHashCode2 + (costBasisLotsSummary != null ? costBasisLotsSummary.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("lot_id=" + Internal.sanitize(this.lot_id));
        arrayList.add("status=" + Internal.sanitize(this.status));
        ValidationInfo validationInfo = this.validation;
        if (validationInfo != null) {
            arrayList.add("validation=" + validationInfo);
        }
        CostBasisLotsSummary costBasisLotsSummary = this.deposit_summary;
        if (costBasisLotsSummary != null) {
            arrayList.add("deposit_summary=" + costBasisLotsSummary);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateCostBasisLotResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateCostBasisLotResponse copy$default(CreateCostBasisLotResponse createCostBasisLotResponse, String str, String str2, ValidationInfo validationInfo, CostBasisLotsSummary costBasisLotsSummary, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createCostBasisLotResponse.lot_id;
        }
        if ((i & 2) != 0) {
            str2 = createCostBasisLotResponse.status;
        }
        if ((i & 4) != 0) {
            validationInfo = createCostBasisLotResponse.validation;
        }
        if ((i & 8) != 0) {
            costBasisLotsSummary = createCostBasisLotResponse.deposit_summary;
        }
        if ((i & 16) != 0) {
            byteString = createCostBasisLotResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        ValidationInfo validationInfo2 = validationInfo;
        return createCostBasisLotResponse.copy(str, str2, validationInfo2, costBasisLotsSummary, byteString2);
    }

    public final CreateCostBasisLotResponse copy(String lot_id, String status, ValidationInfo validation, CostBasisLotsSummary deposit_summary, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(lot_id, "lot_id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateCostBasisLotResponse(lot_id, status, validation, deposit_summary, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateCostBasisLotResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateCostBasisLotResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.CreateCostBasisLotResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateCostBasisLotResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLot_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLot_id());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getStatus());
                }
                if (value.getValidation() != null) {
                    size += ValidationInfo.ADAPTER.encodedSizeWithTag(3, value.getValidation());
                }
                return value.getDeposit_summary() != null ? size + CostBasisLotsSummary.ADAPTER.encodedSizeWithTag(4, value.getDeposit_summary()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateCostBasisLotResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLot_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLot_id());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getStatus());
                }
                if (value.getValidation() != null) {
                    ValidationInfo.ADAPTER.encodeWithTag(writer, 3, (int) value.getValidation());
                }
                if (value.getDeposit_summary() != null) {
                    CostBasisLotsSummary.ADAPTER.encodeWithTag(writer, 4, (int) value.getDeposit_summary());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateCostBasisLotResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDeposit_summary() != null) {
                    CostBasisLotsSummary.ADAPTER.encodeWithTag(writer, 4, (int) value.getDeposit_summary());
                }
                if (value.getValidation() != null) {
                    ValidationInfo.ADAPTER.encodeWithTag(writer, 3, (int) value.getValidation());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getStatus());
                }
                if (Intrinsics.areEqual(value.getLot_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLot_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateCostBasisLotResponse redact(CreateCostBasisLotResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ValidationInfo validation = value.getValidation();
                ValidationInfo validationInfoRedact = validation != null ? ValidationInfo.ADAPTER.redact(validation) : null;
                CostBasisLotsSummary deposit_summary = value.getDeposit_summary();
                return CreateCostBasisLotResponse.copy$default(value, null, null, validationInfoRedact, deposit_summary != null ? CostBasisLotsSummary.ADAPTER.redact(deposit_summary) : null, ByteString.EMPTY, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateCostBasisLotResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ValidationInfo validationInfoDecode = null;
                CostBasisLotsSummary costBasisLotsSummaryDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CreateCostBasisLotResponse(strDecode, strDecode2, validationInfoDecode, costBasisLotsSummaryDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        validationInfoDecode = ValidationInfo.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        costBasisLotsSummaryDecode = CostBasisLotsSummary.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
