package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

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
import nummus.p512v1.SortDirection;
import nummus.p512v1.TaxLotSortType;
import okio.ByteString;

/* compiled from: UpdateTaxLotsSortRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/UpdateTaxLotsSortRequest;", "Lcom/squareup/wire/Message;", "", "sort_type", "Lnummus/v1/TaxLotSortType;", "sort_direction", "Lnummus/v1/SortDirection;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lnummus/v1/TaxLotSortType;Lnummus/v1/SortDirection;Lokio/ByteString;)V", "getSort_type", "()Lnummus/v1/TaxLotSortType;", "getSort_direction", "()Lnummus/v1/SortDirection;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class UpdateTaxLotsSortRequest extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateTaxLotsSortRequest> ADAPTER;

    @WireField(adapter = "nummus.v1.SortDirection#ADAPTER", jsonName = "sortDirection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final SortDirection sort_direction;

    @WireField(adapter = "nummus.v1.TaxLotSortType#ADAPTER", jsonName = "sortType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TaxLotSortType sort_type;

    public UpdateTaxLotsSortRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29053newBuilder();
    }

    public final TaxLotSortType getSort_type() {
        return this.sort_type;
    }

    public /* synthetic */ UpdateTaxLotsSortRequest(TaxLotSortType taxLotSortType, SortDirection sortDirection, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TaxLotSortType.TAX_LOT_SORT_TYPE_UNSPECIFIED : taxLotSortType, (i & 2) != 0 ? SortDirection.SORT_DIRECTION_UNSPECIFIED : sortDirection, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final SortDirection getSort_direction() {
        return this.sort_direction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateTaxLotsSortRequest(TaxLotSortType sort_type, SortDirection sort_direction, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(sort_type, "sort_type");
        Intrinsics.checkNotNullParameter(sort_direction, "sort_direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.sort_type = sort_type;
        this.sort_direction = sort_direction;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29053newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateTaxLotsSortRequest)) {
            return false;
        }
        UpdateTaxLotsSortRequest updateTaxLotsSortRequest = (UpdateTaxLotsSortRequest) other;
        return Intrinsics.areEqual(unknownFields(), updateTaxLotsSortRequest.unknownFields()) && this.sort_type == updateTaxLotsSortRequest.sort_type && this.sort_direction == updateTaxLotsSortRequest.sort_direction;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.sort_type.hashCode()) * 37) + this.sort_direction.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sort_type=" + this.sort_type);
        arrayList.add("sort_direction=" + this.sort_direction);
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateTaxLotsSortRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateTaxLotsSortRequest copy$default(UpdateTaxLotsSortRequest updateTaxLotsSortRequest, TaxLotSortType taxLotSortType, SortDirection sortDirection, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            taxLotSortType = updateTaxLotsSortRequest.sort_type;
        }
        if ((i & 2) != 0) {
            sortDirection = updateTaxLotsSortRequest.sort_direction;
        }
        if ((i & 4) != 0) {
            byteString = updateTaxLotsSortRequest.unknownFields();
        }
        return updateTaxLotsSortRequest.copy(taxLotSortType, sortDirection, byteString);
    }

    public final UpdateTaxLotsSortRequest copy(TaxLotSortType sort_type, SortDirection sort_direction, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(sort_type, "sort_type");
        Intrinsics.checkNotNullParameter(sort_direction, "sort_direction");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateTaxLotsSortRequest(sort_type, sort_direction, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateTaxLotsSortRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateTaxLotsSortRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.UpdateTaxLotsSortRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateTaxLotsSortRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSort_type() != TaxLotSortType.TAX_LOT_SORT_TYPE_UNSPECIFIED) {
                    size += TaxLotSortType.ADAPTER.encodedSizeWithTag(1, value.getSort_type());
                }
                return value.getSort_direction() != SortDirection.SORT_DIRECTION_UNSPECIFIED ? size + SortDirection.ADAPTER.encodedSizeWithTag(2, value.getSort_direction()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateTaxLotsSortRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSort_type() != TaxLotSortType.TAX_LOT_SORT_TYPE_UNSPECIFIED) {
                    TaxLotSortType.ADAPTER.encodeWithTag(writer, 1, (int) value.getSort_type());
                }
                if (value.getSort_direction() != SortDirection.SORT_DIRECTION_UNSPECIFIED) {
                    SortDirection.ADAPTER.encodeWithTag(writer, 2, (int) value.getSort_direction());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateTaxLotsSortRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSort_direction() != SortDirection.SORT_DIRECTION_UNSPECIFIED) {
                    SortDirection.ADAPTER.encodeWithTag(writer, 2, (int) value.getSort_direction());
                }
                if (value.getSort_type() != TaxLotSortType.TAX_LOT_SORT_TYPE_UNSPECIFIED) {
                    TaxLotSortType.ADAPTER.encodeWithTag(writer, 1, (int) value.getSort_type());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateTaxLotsSortRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TaxLotSortType taxLotSortTypeDecode = TaxLotSortType.TAX_LOT_SORT_TYPE_UNSPECIFIED;
                SortDirection sortDirectionDecode = SortDirection.SORT_DIRECTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateTaxLotsSortRequest(taxLotSortTypeDecode, sortDirectionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            taxLotSortTypeDecode = TaxLotSortType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            sortDirectionDecode = SortDirection.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateTaxLotsSortRequest redact(UpdateTaxLotsSortRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpdateTaxLotsSortRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
