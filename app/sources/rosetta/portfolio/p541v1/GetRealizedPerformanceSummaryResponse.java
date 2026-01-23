package rosetta.portfolio.p541v1;

import com.robinhood.rosetta.common.Currency;
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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetRealizedPerformanceSummaryResponse.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J4\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryResponse;", "Lcom/squareup/wire/Message;", "", "rhs_account_number", "", "realized_gains", "", "Lrosetta/portfolio/v1/RealizedGain;", "display_currency", "Lcom/robinhood/rosetta/common/Currency;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/common/Currency;Lokio/ByteString;)V", "getRhs_account_number", "()Ljava/lang/String;", "getDisplay_currency", "()Lcom/robinhood/rosetta/common/Currency;", "getRealized_gains", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetRealizedPerformanceSummaryResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetRealizedPerformanceSummaryResponse> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", jsonName = "displayCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Currency display_currency;

    @WireField(adapter = "rosetta.portfolio.v1.RealizedGain#ADAPTER", jsonName = "realizedGains", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<RealizedGain> realized_gains;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String rhs_account_number;

    public GetRealizedPerformanceSummaryResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29926newBuilder();
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public /* synthetic */ GetRealizedPerformanceSummaryResponse(String str, List list, Currency currency, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Currency getDisplay_currency() {
        return this.display_currency;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRealizedPerformanceSummaryResponse(String rhs_account_number, List<RealizedGain> realized_gains, Currency display_currency, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(realized_gains, "realized_gains");
        Intrinsics.checkNotNullParameter(display_currency, "display_currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rhs_account_number = rhs_account_number;
        this.display_currency = display_currency;
        this.realized_gains = Internal.immutableCopyOf("realized_gains", realized_gains);
    }

    public final List<RealizedGain> getRealized_gains() {
        return this.realized_gains;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29926newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetRealizedPerformanceSummaryResponse)) {
            return false;
        }
        GetRealizedPerformanceSummaryResponse getRealizedPerformanceSummaryResponse = (GetRealizedPerformanceSummaryResponse) other;
        return Intrinsics.areEqual(unknownFields(), getRealizedPerformanceSummaryResponse.unknownFields()) && Intrinsics.areEqual(this.rhs_account_number, getRealizedPerformanceSummaryResponse.rhs_account_number) && Intrinsics.areEqual(this.realized_gains, getRealizedPerformanceSummaryResponse.realized_gains) && this.display_currency == getRealizedPerformanceSummaryResponse.display_currency;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.rhs_account_number.hashCode()) * 37) + this.realized_gains.hashCode()) * 37) + this.display_currency.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        if (!this.realized_gains.isEmpty()) {
            arrayList.add("realized_gains=" + this.realized_gains);
        }
        arrayList.add("display_currency=" + this.display_currency);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRealizedPerformanceSummaryResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetRealizedPerformanceSummaryResponse copy$default(GetRealizedPerformanceSummaryResponse getRealizedPerformanceSummaryResponse, String str, List list, Currency currency, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getRealizedPerformanceSummaryResponse.rhs_account_number;
        }
        if ((i & 2) != 0) {
            list = getRealizedPerformanceSummaryResponse.realized_gains;
        }
        if ((i & 4) != 0) {
            currency = getRealizedPerformanceSummaryResponse.display_currency;
        }
        if ((i & 8) != 0) {
            byteString = getRealizedPerformanceSummaryResponse.unknownFields();
        }
        return getRealizedPerformanceSummaryResponse.copy(str, list, currency, byteString);
    }

    public final GetRealizedPerformanceSummaryResponse copy(String rhs_account_number, List<RealizedGain> realized_gains, Currency display_currency, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(realized_gains, "realized_gains");
        Intrinsics.checkNotNullParameter(display_currency, "display_currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetRealizedPerformanceSummaryResponse(rhs_account_number, realized_gains, display_currency, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetRealizedPerformanceSummaryResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetRealizedPerformanceSummaryResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.portfolio.v1.GetRealizedPerformanceSummaryResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetRealizedPerformanceSummaryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRhs_account_number());
                }
                int iEncodedSizeWithTag = size + RealizedGain.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getRealized_gains());
                return value.getDisplay_currency() != Currency.CURRENCY_UNSPECIFIED ? iEncodedSizeWithTag + Currency.ADAPTER.encodedSizeWithTag(3, value.getDisplay_currency()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetRealizedPerformanceSummaryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
                }
                RealizedGain.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getRealized_gains());
                if (value.getDisplay_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 3, (int) value.getDisplay_currency());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetRealizedPerformanceSummaryResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDisplay_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 3, (int) value.getDisplay_currency());
                }
                RealizedGain.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getRealized_gains());
                if (Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedPerformanceSummaryResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                Currency currencyDecode = Currency.CURRENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetRealizedPerformanceSummaryResponse(strDecode, arrayList, currencyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(RealizedGain.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        try {
                            currencyDecode = Currency.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedPerformanceSummaryResponse redact(GetRealizedPerformanceSummaryResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetRealizedPerformanceSummaryResponse.copy$default(value, null, Internal.m26823redactElements(value.getRealized_gains(), RealizedGain.ADAPTER), null, ByteString.EMPTY, 5, null);
            }
        };
    }
}
