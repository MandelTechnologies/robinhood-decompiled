package ventures.trailer.proto.p551v1;

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
import rh_server_driven_ui.p531v1.ChartGroup;

/* compiled from: PrivateCompanyValuationChartSection.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lventures/trailer/proto/v1/PrivateCompanyValuationChartSection;", "Lcom/squareup/wire/Message;", "", "company_name", "", "valuation_chart", "Lrh_server_driven_ui/v1/ChartGroup;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ChartGroup;Lokio/ByteString;)V", "getCompany_name", "()Ljava/lang/String;", "getValuation_chart", "()Lrh_server_driven_ui/v1/ChartGroup;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class PrivateCompanyValuationChartSection extends Message {

    @JvmField
    public static final ProtoAdapter<PrivateCompanyValuationChartSection> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "companyName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String company_name;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartGroup#ADAPTER", jsonName = "valuationChart", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ChartGroup valuation_chart;

    public PrivateCompanyValuationChartSection() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30045newBuilder();
    }

    public final String getCompany_name() {
        return this.company_name;
    }

    public /* synthetic */ PrivateCompanyValuationChartSection(String str, ChartGroup chartGroup, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : chartGroup, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ChartGroup getValuation_chart() {
        return this.valuation_chart;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivateCompanyValuationChartSection(String company_name, ChartGroup chartGroup, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(company_name, "company_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.company_name = company_name;
        this.valuation_chart = chartGroup;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30045newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PrivateCompanyValuationChartSection)) {
            return false;
        }
        PrivateCompanyValuationChartSection privateCompanyValuationChartSection = (PrivateCompanyValuationChartSection) other;
        return Intrinsics.areEqual(unknownFields(), privateCompanyValuationChartSection.unknownFields()) && Intrinsics.areEqual(this.company_name, privateCompanyValuationChartSection.company_name) && Intrinsics.areEqual(this.valuation_chart, privateCompanyValuationChartSection.valuation_chart);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.company_name.hashCode()) * 37;
        ChartGroup chartGroup = this.valuation_chart;
        int iHashCode2 = iHashCode + (chartGroup != null ? chartGroup.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("company_name=" + Internal.sanitize(this.company_name));
        ChartGroup chartGroup = this.valuation_chart;
        if (chartGroup != null) {
            arrayList.add("valuation_chart=" + chartGroup);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PrivateCompanyValuationChartSection{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PrivateCompanyValuationChartSection copy$default(PrivateCompanyValuationChartSection privateCompanyValuationChartSection, String str, ChartGroup chartGroup, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = privateCompanyValuationChartSection.company_name;
        }
        if ((i & 2) != 0) {
            chartGroup = privateCompanyValuationChartSection.valuation_chart;
        }
        if ((i & 4) != 0) {
            byteString = privateCompanyValuationChartSection.unknownFields();
        }
        return privateCompanyValuationChartSection.copy(str, chartGroup, byteString);
    }

    public final PrivateCompanyValuationChartSection copy(String company_name, ChartGroup valuation_chart, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(company_name, "company_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PrivateCompanyValuationChartSection(company_name, valuation_chart, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PrivateCompanyValuationChartSection.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PrivateCompanyValuationChartSection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: ventures.trailer.proto.v1.PrivateCompanyValuationChartSection$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PrivateCompanyValuationChartSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCompany_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCompany_name());
                }
                return value.getValuation_chart() != null ? size + ChartGroup.ADAPTER.encodedSizeWithTag(2, value.getValuation_chart()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PrivateCompanyValuationChartSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCompany_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCompany_name());
                }
                if (value.getValuation_chart() != null) {
                    ChartGroup.ADAPTER.encodeWithTag(writer, 2, (int) value.getValuation_chart());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PrivateCompanyValuationChartSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getValuation_chart() != null) {
                    ChartGroup.ADAPTER.encodeWithTag(writer, 2, (int) value.getValuation_chart());
                }
                if (Intrinsics.areEqual(value.getCompany_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCompany_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PrivateCompanyValuationChartSection redact(PrivateCompanyValuationChartSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ChartGroup valuation_chart = value.getValuation_chart();
                return PrivateCompanyValuationChartSection.copy$default(value, null, valuation_chart != null ? ChartGroup.ADAPTER.redact(valuation_chart) : null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PrivateCompanyValuationChartSection decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ChartGroup chartGroupDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PrivateCompanyValuationChartSection(strDecode, chartGroupDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        chartGroupDecode = ChartGroup.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
