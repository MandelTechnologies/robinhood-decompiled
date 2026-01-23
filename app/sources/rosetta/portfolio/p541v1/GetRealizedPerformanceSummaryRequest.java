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

/* compiled from: GetRealizedPerformanceSummaryRequest.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JD\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006!"}, m3636d2 = {"Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequest;", "Lcom/squareup/wire/Message;", "", "rhs_account_number", "", "spans", "", "Lrosetta/portfolio/v1/Span;", "asset_classes", "Lrosetta/portfolio/v1/AssetClass;", "display_currency", "Lcom/robinhood/rosetta/common/Currency;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/common/Currency;Lokio/ByteString;)V", "getRhs_account_number", "()Ljava/lang/String;", "getDisplay_currency", "()Lcom/robinhood/rosetta/common/Currency;", "getSpans", "()Ljava/util/List;", "getAsset_classes", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetRealizedPerformanceSummaryRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetRealizedPerformanceSummaryRequest> ADAPTER;

    @WireField(adapter = "rosetta.portfolio.v1.AssetClass#ADAPTER", jsonName = "assetClasses", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<AssetClass> asset_classes;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", jsonName = "displayCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Currency display_currency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String rhs_account_number;

    @WireField(adapter = "rosetta.portfolio.v1.Span#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<Span> spans;

    public GetRealizedPerformanceSummaryRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29925newBuilder();
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public /* synthetic */ GetRealizedPerformanceSummaryRequest(String str, List list, List list2, Currency currency, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Currency getDisplay_currency() {
        return this.display_currency;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRealizedPerformanceSummaryRequest(String rhs_account_number, List<? extends Span> spans, List<? extends AssetClass> asset_classes, Currency display_currency, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
        Intrinsics.checkNotNullParameter(display_currency, "display_currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rhs_account_number = rhs_account_number;
        this.display_currency = display_currency;
        this.spans = Internal.immutableCopyOf("spans", spans);
        this.asset_classes = Internal.immutableCopyOf("asset_classes", asset_classes);
    }

    public final List<Span> getSpans() {
        return this.spans;
    }

    public final List<AssetClass> getAsset_classes() {
        return this.asset_classes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29925newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetRealizedPerformanceSummaryRequest)) {
            return false;
        }
        GetRealizedPerformanceSummaryRequest getRealizedPerformanceSummaryRequest = (GetRealizedPerformanceSummaryRequest) other;
        return Intrinsics.areEqual(unknownFields(), getRealizedPerformanceSummaryRequest.unknownFields()) && Intrinsics.areEqual(this.rhs_account_number, getRealizedPerformanceSummaryRequest.rhs_account_number) && Intrinsics.areEqual(this.spans, getRealizedPerformanceSummaryRequest.spans) && Intrinsics.areEqual(this.asset_classes, getRealizedPerformanceSummaryRequest.asset_classes) && this.display_currency == getRealizedPerformanceSummaryRequest.display_currency;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.rhs_account_number.hashCode()) * 37) + this.spans.hashCode()) * 37) + this.asset_classes.hashCode()) * 37) + this.display_currency.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        if (!this.spans.isEmpty()) {
            arrayList.add("spans=" + this.spans);
        }
        if (!this.asset_classes.isEmpty()) {
            arrayList.add("asset_classes=" + this.asset_classes);
        }
        arrayList.add("display_currency=" + this.display_currency);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRealizedPerformanceSummaryRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetRealizedPerformanceSummaryRequest copy$default(GetRealizedPerformanceSummaryRequest getRealizedPerformanceSummaryRequest, String str, List list, List list2, Currency currency, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getRealizedPerformanceSummaryRequest.rhs_account_number;
        }
        if ((i & 2) != 0) {
            list = getRealizedPerformanceSummaryRequest.spans;
        }
        if ((i & 4) != 0) {
            list2 = getRealizedPerformanceSummaryRequest.asset_classes;
        }
        if ((i & 8) != 0) {
            currency = getRealizedPerformanceSummaryRequest.display_currency;
        }
        if ((i & 16) != 0) {
            byteString = getRealizedPerformanceSummaryRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list3 = list2;
        return getRealizedPerformanceSummaryRequest.copy(str, list, list3, currency, byteString2);
    }

    public final GetRealizedPerformanceSummaryRequest copy(String rhs_account_number, List<? extends Span> spans, List<? extends AssetClass> asset_classes, Currency display_currency, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
        Intrinsics.checkNotNullParameter(display_currency, "display_currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetRealizedPerformanceSummaryRequest(rhs_account_number, spans, asset_classes, display_currency, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetRealizedPerformanceSummaryRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetRealizedPerformanceSummaryRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.portfolio.v1.GetRealizedPerformanceSummaryRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetRealizedPerformanceSummaryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRhs_account_number());
                }
                int iEncodedSizeWithTag = size + Span.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getSpans()) + AssetClass.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getAsset_classes());
                return value.getDisplay_currency() != Currency.CURRENCY_UNSPECIFIED ? iEncodedSizeWithTag + Currency.ADAPTER.encodedSizeWithTag(4, value.getDisplay_currency()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetRealizedPerformanceSummaryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
                }
                Span.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSpans());
                AssetClass.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAsset_classes());
                if (value.getDisplay_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 4, (int) value.getDisplay_currency());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetRealizedPerformanceSummaryRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDisplay_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 4, (int) value.getDisplay_currency());
                }
                AssetClass.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAsset_classes());
                Span.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSpans());
                if (Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedPerformanceSummaryRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Currency currencyDecode = Currency.CURRENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    Currency currency = currencyDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetRealizedPerformanceSummaryRequest(strDecode, arrayList, arrayList2, currency, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                Span.ADAPTER.tryDecode(reader, arrayList);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                AssetClass.ADAPTER.tryDecode(reader, arrayList2);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 4) {
                            try {
                                currencyDecode = Currency.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetRealizedPerformanceSummaryRequest redact(GetRealizedPerformanceSummaryRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetRealizedPerformanceSummaryRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
