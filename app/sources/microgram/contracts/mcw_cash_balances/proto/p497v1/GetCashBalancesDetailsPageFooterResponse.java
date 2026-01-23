package microgram.contracts.mcw_cash_balances.proto.p497v1;

import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
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

/* compiled from: GetCashBalancesDetailsPageFooterResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterResponse;", "Lcom/squareup/wire/Message;", "", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "Lmicrogram/contracts/mcw_cash_balances/proto/v1/Cta;", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/mcw_cash_balances/proto/v1/Cta;Lmicrogram/contracts/mcw_cash_balances/proto/v1/Cta;Lokio/ByteString;)V", "getPrimary_cta", "()Lmicrogram/contracts/mcw_cash_balances/proto/v1/Cta;", "getSecondary_cta", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetCashBalancesDetailsPageFooterResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCashBalancesDetailsPageFooterResponse> ADAPTER;

    @WireField(adapter = "microgram.contracts.mcw_cash_balances.proto.v1.Cta#ADAPTER", jsonName = "primaryCta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Cta primary_cta;

    @WireField(adapter = "microgram.contracts.mcw_cash_balances.proto.v1.Cta#ADAPTER", jsonName = "secondaryCta", schemaIndex = 1, tag = 2)
    private final Cta secondary_cta;

    public GetCashBalancesDetailsPageFooterResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29155newBuilder();
    }

    public final Cta getPrimary_cta() {
        return this.primary_cta;
    }

    public final Cta getSecondary_cta() {
        return this.secondary_cta;
    }

    public /* synthetic */ GetCashBalancesDetailsPageFooterResponse(Cta cta, Cta cta2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cta, (i & 2) != 0 ? null : cta2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCashBalancesDetailsPageFooterResponse(Cta cta, Cta cta2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.primary_cta = cta;
        this.secondary_cta = cta2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29155newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCashBalancesDetailsPageFooterResponse)) {
            return false;
        }
        GetCashBalancesDetailsPageFooterResponse getCashBalancesDetailsPageFooterResponse = (GetCashBalancesDetailsPageFooterResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCashBalancesDetailsPageFooterResponse.unknownFields()) && Intrinsics.areEqual(this.primary_cta, getCashBalancesDetailsPageFooterResponse.primary_cta) && Intrinsics.areEqual(this.secondary_cta, getCashBalancesDetailsPageFooterResponse.secondary_cta);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Cta cta = this.primary_cta;
        int iHashCode2 = (iHashCode + (cta != null ? cta.hashCode() : 0)) * 37;
        Cta cta2 = this.secondary_cta;
        int iHashCode3 = iHashCode2 + (cta2 != null ? cta2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Cta cta = this.primary_cta;
        if (cta != null) {
            arrayList.add("primary_cta=" + cta);
        }
        Cta cta2 = this.secondary_cta;
        if (cta2 != null) {
            arrayList.add("secondary_cta=" + cta2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCashBalancesDetailsPageFooterResponse{", "}", 0, null, null, 56, null);
    }

    public final GetCashBalancesDetailsPageFooterResponse copy(Cta primary_cta, Cta secondary_cta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCashBalancesDetailsPageFooterResponse(primary_cta, secondary_cta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCashBalancesDetailsPageFooterResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCashBalancesDetailsPageFooterResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.mcw_cash_balances.proto.v1.GetCashBalancesDetailsPageFooterResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCashBalancesDetailsPageFooterResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPrimary_cta() != null) {
                    size += Cta.ADAPTER.encodedSizeWithTag(1, value.getPrimary_cta());
                }
                return size + Cta.ADAPTER.encodedSizeWithTag(2, value.getSecondary_cta());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCashBalancesDetailsPageFooterResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPrimary_cta() != null) {
                    Cta.ADAPTER.encodeWithTag(writer, 1, (int) value.getPrimary_cta());
                }
                Cta.ADAPTER.encodeWithTag(writer, 2, (int) value.getSecondary_cta());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCashBalancesDetailsPageFooterResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Cta> protoAdapter = Cta.ADAPTER;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSecondary_cta());
                if (value.getPrimary_cta() != null) {
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getPrimary_cta());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCashBalancesDetailsPageFooterResponse redact(GetCashBalancesDetailsPageFooterResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Cta primary_cta = value.getPrimary_cta();
                Cta ctaRedact = primary_cta != null ? Cta.ADAPTER.redact(primary_cta) : null;
                Cta secondary_cta = value.getSecondary_cta();
                return value.copy(ctaRedact, secondary_cta != null ? Cta.ADAPTER.redact(secondary_cta) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCashBalancesDetailsPageFooterResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Cta ctaDecode = null;
                Cta ctaDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCashBalancesDetailsPageFooterResponse(ctaDecode, ctaDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        ctaDecode = Cta.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        ctaDecode2 = Cta.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
