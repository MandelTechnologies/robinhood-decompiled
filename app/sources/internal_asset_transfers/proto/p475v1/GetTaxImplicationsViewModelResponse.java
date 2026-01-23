package internal_asset_transfers.proto.p475v1;

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

/* compiled from: GetTaxImplicationsViewModelResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelResponse;", "Lcom/squareup/wire/Message;", "", "view_model", "Linternal_asset_transfers/proto/v1/TaxImplicationsViewModel;", "unknownFields", "Lokio/ByteString;", "<init>", "(Linternal_asset_transfers/proto/v1/TaxImplicationsViewModel;Lokio/ByteString;)V", "getView_model", "()Linternal_asset_transfers/proto/v1/TaxImplicationsViewModel;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GetTaxImplicationsViewModelResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetTaxImplicationsViewModelResponse> ADAPTER;

    @WireField(adapter = "internal_asset_transfers.proto.v1.TaxImplicationsViewModel#ADAPTER", jsonName = "viewModel", schemaIndex = 0, tag = 1)
    private final TaxImplicationsViewModel view_model;

    /* JADX WARN: Multi-variable type inference failed */
    public GetTaxImplicationsViewModelResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28454newBuilder();
    }

    public final TaxImplicationsViewModel getView_model() {
        return this.view_model;
    }

    public /* synthetic */ GetTaxImplicationsViewModelResponse(TaxImplicationsViewModel taxImplicationsViewModel, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : taxImplicationsViewModel, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTaxImplicationsViewModelResponse(TaxImplicationsViewModel taxImplicationsViewModel, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.view_model = taxImplicationsViewModel;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28454newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTaxImplicationsViewModelResponse)) {
            return false;
        }
        GetTaxImplicationsViewModelResponse getTaxImplicationsViewModelResponse = (GetTaxImplicationsViewModelResponse) other;
        return Intrinsics.areEqual(unknownFields(), getTaxImplicationsViewModelResponse.unknownFields()) && Intrinsics.areEqual(this.view_model, getTaxImplicationsViewModelResponse.view_model);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        TaxImplicationsViewModel taxImplicationsViewModel = this.view_model;
        int iHashCode2 = iHashCode + (taxImplicationsViewModel != null ? taxImplicationsViewModel.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TaxImplicationsViewModel taxImplicationsViewModel = this.view_model;
        if (taxImplicationsViewModel != null) {
            arrayList.add("view_model=" + taxImplicationsViewModel);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTaxImplicationsViewModelResponse{", "}", 0, null, null, 56, null);
    }

    public final GetTaxImplicationsViewModelResponse copy(TaxImplicationsViewModel view_model, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTaxImplicationsViewModelResponse(view_model, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTaxImplicationsViewModelResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTaxImplicationsViewModelResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: internal_asset_transfers.proto.v1.GetTaxImplicationsViewModelResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTaxImplicationsViewModelResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + TaxImplicationsViewModel.ADAPTER.encodedSizeWithTag(1, value.getView_model());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTaxImplicationsViewModelResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                TaxImplicationsViewModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getView_model());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTaxImplicationsViewModelResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TaxImplicationsViewModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getView_model());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxImplicationsViewModelResponse redact(GetTaxImplicationsViewModelResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TaxImplicationsViewModel view_model = value.getView_model();
                return value.copy(view_model != null ? TaxImplicationsViewModel.ADAPTER.redact(view_model) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxImplicationsViewModelResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                TaxImplicationsViewModel taxImplicationsViewModelDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetTaxImplicationsViewModelResponse(taxImplicationsViewModelDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        taxImplicationsViewModelDecode = TaxImplicationsViewModel.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
