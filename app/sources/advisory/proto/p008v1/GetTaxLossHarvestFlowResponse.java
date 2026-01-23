package advisory.proto.p008v1;

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

/* compiled from: GetTaxLossHarvestFlowResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestFlowResponse;", "Lcom/squareup/wire/Message;", "", "intro", "Ladvisory/proto/v1/TaxLossHarvestStrategiesIntro;", "choose_accounts", "Ladvisory/proto/v1/TaxLossHarvestChooseAccounts;", "loading", "Ladvisory/proto/v1/TaxLossHarvestStrategiesLoading;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestStrategiesIntro;Ladvisory/proto/v1/TaxLossHarvestChooseAccounts;Ladvisory/proto/v1/TaxLossHarvestStrategiesLoading;Lokio/ByteString;)V", "getIntro", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesIntro;", "getChoose_accounts", "()Ladvisory/proto/v1/TaxLossHarvestChooseAccounts;", "getLoading", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesLoading;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetTaxLossHarvestFlowResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetTaxLossHarvestFlowResponse> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestChooseAccounts#ADAPTER", jsonName = "chooseAccounts", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TaxLossHarvestChooseAccounts choose_accounts;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestStrategiesIntro#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final TaxLossHarvestStrategiesIntro intro;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestStrategiesLoading#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TaxLossHarvestStrategiesLoading loading;

    public GetTaxLossHarvestFlowResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4497newBuilder();
    }

    public final TaxLossHarvestStrategiesIntro getIntro() {
        return this.intro;
    }

    public final TaxLossHarvestChooseAccounts getChoose_accounts() {
        return this.choose_accounts;
    }

    public final TaxLossHarvestStrategiesLoading getLoading() {
        return this.loading;
    }

    public /* synthetic */ GetTaxLossHarvestFlowResponse(TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro, TaxLossHarvestChooseAccounts taxLossHarvestChooseAccounts, TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : taxLossHarvestStrategiesIntro, (i & 2) != 0 ? null : taxLossHarvestChooseAccounts, (i & 4) != 0 ? null : taxLossHarvestStrategiesLoading, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTaxLossHarvestFlowResponse(TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro, TaxLossHarvestChooseAccounts taxLossHarvestChooseAccounts, TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.intro = taxLossHarvestStrategiesIntro;
        this.choose_accounts = taxLossHarvestChooseAccounts;
        this.loading = taxLossHarvestStrategiesLoading;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4497newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTaxLossHarvestFlowResponse)) {
            return false;
        }
        GetTaxLossHarvestFlowResponse getTaxLossHarvestFlowResponse = (GetTaxLossHarvestFlowResponse) other;
        return Intrinsics.areEqual(unknownFields(), getTaxLossHarvestFlowResponse.unknownFields()) && Intrinsics.areEqual(this.intro, getTaxLossHarvestFlowResponse.intro) && Intrinsics.areEqual(this.choose_accounts, getTaxLossHarvestFlowResponse.choose_accounts) && Intrinsics.areEqual(this.loading, getTaxLossHarvestFlowResponse.loading);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro = this.intro;
        int iHashCode2 = (iHashCode + (taxLossHarvestStrategiesIntro != null ? taxLossHarvestStrategiesIntro.hashCode() : 0)) * 37;
        TaxLossHarvestChooseAccounts taxLossHarvestChooseAccounts = this.choose_accounts;
        int iHashCode3 = (iHashCode2 + (taxLossHarvestChooseAccounts != null ? taxLossHarvestChooseAccounts.hashCode() : 0)) * 37;
        TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading = this.loading;
        int iHashCode4 = iHashCode3 + (taxLossHarvestStrategiesLoading != null ? taxLossHarvestStrategiesLoading.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro = this.intro;
        if (taxLossHarvestStrategiesIntro != null) {
            arrayList.add("intro=" + taxLossHarvestStrategiesIntro);
        }
        TaxLossHarvestChooseAccounts taxLossHarvestChooseAccounts = this.choose_accounts;
        if (taxLossHarvestChooseAccounts != null) {
            arrayList.add("choose_accounts=" + taxLossHarvestChooseAccounts);
        }
        TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoading = this.loading;
        if (taxLossHarvestStrategiesLoading != null) {
            arrayList.add("loading=" + taxLossHarvestStrategiesLoading);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTaxLossHarvestFlowResponse{", "}", 0, null, null, 56, null);
    }

    public final GetTaxLossHarvestFlowResponse copy(TaxLossHarvestStrategiesIntro intro, TaxLossHarvestChooseAccounts choose_accounts, TaxLossHarvestStrategiesLoading loading, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTaxLossHarvestFlowResponse(intro, choose_accounts, loading, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTaxLossHarvestFlowResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTaxLossHarvestFlowResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetTaxLossHarvestFlowResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTaxLossHarvestFlowResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIntro() != null) {
                    size += TaxLossHarvestStrategiesIntro.ADAPTER.encodedSizeWithTag(1, value.getIntro());
                }
                if (value.getChoose_accounts() != null) {
                    size += TaxLossHarvestChooseAccounts.ADAPTER.encodedSizeWithTag(2, value.getChoose_accounts());
                }
                return value.getLoading() != null ? size + TaxLossHarvestStrategiesLoading.ADAPTER.encodedSizeWithTag(3, value.getLoading()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTaxLossHarvestFlowResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIntro() != null) {
                    TaxLossHarvestStrategiesIntro.ADAPTER.encodeWithTag(writer, 1, (int) value.getIntro());
                }
                if (value.getChoose_accounts() != null) {
                    TaxLossHarvestChooseAccounts.ADAPTER.encodeWithTag(writer, 2, (int) value.getChoose_accounts());
                }
                if (value.getLoading() != null) {
                    TaxLossHarvestStrategiesLoading.ADAPTER.encodeWithTag(writer, 3, (int) value.getLoading());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTaxLossHarvestFlowResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLoading() != null) {
                    TaxLossHarvestStrategiesLoading.ADAPTER.encodeWithTag(writer, 3, (int) value.getLoading());
                }
                if (value.getChoose_accounts() != null) {
                    TaxLossHarvestChooseAccounts.ADAPTER.encodeWithTag(writer, 2, (int) value.getChoose_accounts());
                }
                if (value.getIntro() != null) {
                    TaxLossHarvestStrategiesIntro.ADAPTER.encodeWithTag(writer, 1, (int) value.getIntro());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxLossHarvestFlowResponse redact(GetTaxLossHarvestFlowResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TaxLossHarvestStrategiesIntro intro = value.getIntro();
                TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntroRedact = intro != null ? TaxLossHarvestStrategiesIntro.ADAPTER.redact(intro) : null;
                TaxLossHarvestChooseAccounts choose_accounts = value.getChoose_accounts();
                TaxLossHarvestChooseAccounts taxLossHarvestChooseAccountsRedact = choose_accounts != null ? TaxLossHarvestChooseAccounts.ADAPTER.redact(choose_accounts) : null;
                TaxLossHarvestStrategiesLoading loading = value.getLoading();
                return value.copy(taxLossHarvestStrategiesIntroRedact, taxLossHarvestChooseAccountsRedact, loading != null ? TaxLossHarvestStrategiesLoading.ADAPTER.redact(loading) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxLossHarvestFlowResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntroDecode = null;
                TaxLossHarvestChooseAccounts taxLossHarvestChooseAccountsDecode = null;
                TaxLossHarvestStrategiesLoading taxLossHarvestStrategiesLoadingDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetTaxLossHarvestFlowResponse(taxLossHarvestStrategiesIntroDecode, taxLossHarvestChooseAccountsDecode, taxLossHarvestStrategiesLoadingDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        taxLossHarvestStrategiesIntroDecode = TaxLossHarvestStrategiesIntro.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        taxLossHarvestChooseAccountsDecode = TaxLossHarvestChooseAccounts.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        taxLossHarvestStrategiesLoadingDecode = TaxLossHarvestStrategiesLoading.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
