package advisory.proto.p008v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: TaxLossHarvestStrategyReview.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JT\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategyReview;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "calculation_rows", "", "Ladvisory/proto/v1/TaxLossHarvestStrategyReviewRow;", "result_row", "disclosure_markdown", "confirm_cta_title", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ladvisory/proto/v1/TaxLossHarvestStrategyReviewRow;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getResult_row", "()Ladvisory/proto/v1/TaxLossHarvestStrategyReviewRow;", "getDisclosure_markdown", "getConfirm_cta_title", "getCalculation_rows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TaxLossHarvestStrategyReview extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLossHarvestStrategyReview> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestStrategyReviewRow#ADAPTER", jsonName = "calculationRows", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<TaxLossHarvestStrategyReviewRow> calculation_rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "confirmCtaTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String confirm_cta_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String disclosure_markdown;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestStrategyReviewRow#ADAPTER", jsonName = "resultRow", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final TaxLossHarvestStrategyReviewRow result_row;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public TaxLossHarvestStrategyReview() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ TaxLossHarvestStrategyReview(String str, String str2, List list, TaxLossHarvestStrategyReviewRow taxLossHarvestStrategyReviewRow, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : taxLossHarvestStrategyReviewRow, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4567newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TaxLossHarvestStrategyReviewRow getResult_row() {
        return this.result_row;
    }

    public final String getDisclosure_markdown() {
        return this.disclosure_markdown;
    }

    public final String getConfirm_cta_title() {
        return this.confirm_cta_title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestStrategyReview(String title, String subtitle, List<TaxLossHarvestStrategyReviewRow> calculation_rows, TaxLossHarvestStrategyReviewRow taxLossHarvestStrategyReviewRow, String disclosure_markdown, String confirm_cta_title, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(calculation_rows, "calculation_rows");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(confirm_cta_title, "confirm_cta_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.result_row = taxLossHarvestStrategyReviewRow;
        this.disclosure_markdown = disclosure_markdown;
        this.confirm_cta_title = confirm_cta_title;
        this.calculation_rows = Internal.immutableCopyOf("calculation_rows", calculation_rows);
    }

    public final List<TaxLossHarvestStrategyReviewRow> getCalculation_rows() {
        return this.calculation_rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4567newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLossHarvestStrategyReview)) {
            return false;
        }
        TaxLossHarvestStrategyReview taxLossHarvestStrategyReview = (TaxLossHarvestStrategyReview) other;
        return Intrinsics.areEqual(unknownFields(), taxLossHarvestStrategyReview.unknownFields()) && Intrinsics.areEqual(this.title, taxLossHarvestStrategyReview.title) && Intrinsics.areEqual(this.subtitle, taxLossHarvestStrategyReview.subtitle) && Intrinsics.areEqual(this.calculation_rows, taxLossHarvestStrategyReview.calculation_rows) && Intrinsics.areEqual(this.result_row, taxLossHarvestStrategyReview.result_row) && Intrinsics.areEqual(this.disclosure_markdown, taxLossHarvestStrategyReview.disclosure_markdown) && Intrinsics.areEqual(this.confirm_cta_title, taxLossHarvestStrategyReview.confirm_cta_title);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.calculation_rows.hashCode()) * 37;
        TaxLossHarvestStrategyReviewRow taxLossHarvestStrategyReviewRow = this.result_row;
        int iHashCode2 = ((((iHashCode + (taxLossHarvestStrategyReviewRow != null ? taxLossHarvestStrategyReviewRow.hashCode() : 0)) * 37) + this.disclosure_markdown.hashCode()) * 37) + this.confirm_cta_title.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        if (!this.calculation_rows.isEmpty()) {
            arrayList.add("calculation_rows=" + this.calculation_rows);
        }
        TaxLossHarvestStrategyReviewRow taxLossHarvestStrategyReviewRow = this.result_row;
        if (taxLossHarvestStrategyReviewRow != null) {
            arrayList.add("result_row=" + taxLossHarvestStrategyReviewRow);
        }
        arrayList.add("disclosure_markdown=" + Internal.sanitize(this.disclosure_markdown));
        arrayList.add("confirm_cta_title=" + Internal.sanitize(this.confirm_cta_title));
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLossHarvestStrategyReview{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLossHarvestStrategyReview copy$default(TaxLossHarvestStrategyReview taxLossHarvestStrategyReview, String str, String str2, List list, TaxLossHarvestStrategyReviewRow taxLossHarvestStrategyReviewRow, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLossHarvestStrategyReview.title;
        }
        if ((i & 2) != 0) {
            str2 = taxLossHarvestStrategyReview.subtitle;
        }
        if ((i & 4) != 0) {
            list = taxLossHarvestStrategyReview.calculation_rows;
        }
        if ((i & 8) != 0) {
            taxLossHarvestStrategyReviewRow = taxLossHarvestStrategyReview.result_row;
        }
        if ((i & 16) != 0) {
            str3 = taxLossHarvestStrategyReview.disclosure_markdown;
        }
        if ((i & 32) != 0) {
            str4 = taxLossHarvestStrategyReview.confirm_cta_title;
        }
        if ((i & 64) != 0) {
            byteString = taxLossHarvestStrategyReview.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        String str6 = str3;
        List list2 = list;
        return taxLossHarvestStrategyReview.copy(str, str2, list2, taxLossHarvestStrategyReviewRow, str6, str5, byteString2);
    }

    public final TaxLossHarvestStrategyReview copy(String title, String subtitle, List<TaxLossHarvestStrategyReviewRow> calculation_rows, TaxLossHarvestStrategyReviewRow result_row, String disclosure_markdown, String confirm_cta_title, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(calculation_rows, "calculation_rows");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
        Intrinsics.checkNotNullParameter(confirm_cta_title, "confirm_cta_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLossHarvestStrategyReview(title, subtitle, calculation_rows, result_row, disclosure_markdown, confirm_cta_title, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLossHarvestStrategyReview.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLossHarvestStrategyReview>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.TaxLossHarvestStrategyReview$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLossHarvestStrategyReview value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                ProtoAdapter<TaxLossHarvestStrategyReviewRow> protoAdapter = TaxLossHarvestStrategyReviewRow.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getCalculation_rows());
                if (value.getResult_row() != null) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getResult_row());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDisclosure_markdown());
                }
                return !Intrinsics.areEqual(value.getConfirm_cta_title(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getConfirm_cta_title()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLossHarvestStrategyReview value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                ProtoAdapter<TaxLossHarvestStrategyReviewRow> protoAdapter = TaxLossHarvestStrategyReviewRow.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getCalculation_rows());
                if (value.getResult_row() != null) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getResult_row());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisclosure_markdown());
                }
                if (!Intrinsics.areEqual(value.getConfirm_cta_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getConfirm_cta_title());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLossHarvestStrategyReview value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getConfirm_cta_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getConfirm_cta_title());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisclosure_markdown());
                }
                if (value.getResult_row() != null) {
                    TaxLossHarvestStrategyReviewRow.ADAPTER.encodeWithTag(writer, 4, (int) value.getResult_row());
                }
                TaxLossHarvestStrategyReviewRow.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getCalculation_rows());
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestStrategyReview decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                TaxLossHarvestStrategyReviewRow taxLossHarvestStrategyReviewRowDecode = null;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                arrayList.add(TaxLossHarvestStrategyReviewRow.ADAPTER.decode(reader));
                                break;
                            case 4:
                                taxLossHarvestStrategyReviewRowDecode = TaxLossHarvestStrategyReviewRow.ADAPTER.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new TaxLossHarvestStrategyReview(strDecode, strDecode4, arrayList, taxLossHarvestStrategyReviewRowDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestStrategyReview redact(TaxLossHarvestStrategyReview value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<TaxLossHarvestStrategyReviewRow> calculation_rows = value.getCalculation_rows();
                ProtoAdapter<TaxLossHarvestStrategyReviewRow> protoAdapter = TaxLossHarvestStrategyReviewRow.ADAPTER;
                List listM26823redactElements = Internal.m26823redactElements(calculation_rows, protoAdapter);
                TaxLossHarvestStrategyReviewRow result_row = value.getResult_row();
                return TaxLossHarvestStrategyReview.copy$default(value, null, null, listM26823redactElements, result_row != null ? protoAdapter.redact(result_row) : null, null, null, ByteString.EMPTY, 51, null);
            }
        };
    }
}
