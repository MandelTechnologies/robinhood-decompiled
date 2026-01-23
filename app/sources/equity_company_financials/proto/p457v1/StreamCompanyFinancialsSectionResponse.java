package equity_company_financials.proto.p457v1;

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
import rh_server_driven_ui.p531v1.ChartGroup;

/* compiled from: StreamCompanyFinancialsSectionResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J@\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lequity_company_financials/proto/v1/StreamCompanyFinancialsSectionResponse;", "Lcom/squareup/wire/Message;", "", "title", "", "time_period_options", "", "Lequity_company_financials/proto/v1/TimePeriodOption;", "selected_time_period_type", "chart", "Lrh_server_driven_ui/v1/ChartGroup;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lrh_server_driven_ui/v1/ChartGroup;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSelected_time_period_type", "getChart", "()Lrh_server_driven_ui/v1/ChartGroup;", "getTime_period_options", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "equity_company_financials.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StreamCompanyFinancialsSectionResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamCompanyFinancialsSectionResponse> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartGroup#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ChartGroup chart;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selectedTimePeriodType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String selected_time_period_type;

    @WireField(adapter = "equity_company_financials.proto.v1.TimePeriodOption#ADAPTER", jsonName = "timePeriodOptions", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<TimePeriodOption> time_period_options;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public StreamCompanyFinancialsSectionResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ StreamCompanyFinancialsSectionResponse(String str, List list, String str2, ChartGroup chartGroup, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : chartGroup, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28004newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSelected_time_period_type() {
        return this.selected_time_period_type;
    }

    public final ChartGroup getChart() {
        return this.chart;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamCompanyFinancialsSectionResponse(String title, List<TimePeriodOption> time_period_options, String selected_time_period_type, ChartGroup chartGroup, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(time_period_options, "time_period_options");
        Intrinsics.checkNotNullParameter(selected_time_period_type, "selected_time_period_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.selected_time_period_type = selected_time_period_type;
        this.chart = chartGroup;
        this.time_period_options = Internal.immutableCopyOf("time_period_options", time_period_options);
    }

    public final List<TimePeriodOption> getTime_period_options() {
        return this.time_period_options;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28004newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamCompanyFinancialsSectionResponse)) {
            return false;
        }
        StreamCompanyFinancialsSectionResponse streamCompanyFinancialsSectionResponse = (StreamCompanyFinancialsSectionResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamCompanyFinancialsSectionResponse.unknownFields()) && Intrinsics.areEqual(this.title, streamCompanyFinancialsSectionResponse.title) && Intrinsics.areEqual(this.time_period_options, streamCompanyFinancialsSectionResponse.time_period_options) && Intrinsics.areEqual(this.selected_time_period_type, streamCompanyFinancialsSectionResponse.selected_time_period_type) && Intrinsics.areEqual(this.chart, streamCompanyFinancialsSectionResponse.chart);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.time_period_options.hashCode()) * 37) + this.selected_time_period_type.hashCode()) * 37;
        ChartGroup chartGroup = this.chart;
        int iHashCode2 = iHashCode + (chartGroup != null ? chartGroup.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.time_period_options.isEmpty()) {
            arrayList.add("time_period_options=" + this.time_period_options);
        }
        arrayList.add("selected_time_period_type=" + Internal.sanitize(this.selected_time_period_type));
        ChartGroup chartGroup = this.chart;
        if (chartGroup != null) {
            arrayList.add("chart=" + chartGroup);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamCompanyFinancialsSectionResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamCompanyFinancialsSectionResponse copy$default(StreamCompanyFinancialsSectionResponse streamCompanyFinancialsSectionResponse, String str, List list, String str2, ChartGroup chartGroup, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamCompanyFinancialsSectionResponse.title;
        }
        if ((i & 2) != 0) {
            list = streamCompanyFinancialsSectionResponse.time_period_options;
        }
        if ((i & 4) != 0) {
            str2 = streamCompanyFinancialsSectionResponse.selected_time_period_type;
        }
        if ((i & 8) != 0) {
            chartGroup = streamCompanyFinancialsSectionResponse.chart;
        }
        if ((i & 16) != 0) {
            byteString = streamCompanyFinancialsSectionResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return streamCompanyFinancialsSectionResponse.copy(str, list, str3, chartGroup, byteString2);
    }

    public final StreamCompanyFinancialsSectionResponse copy(String title, List<TimePeriodOption> time_period_options, String selected_time_period_type, ChartGroup chart, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(time_period_options, "time_period_options");
        Intrinsics.checkNotNullParameter(selected_time_period_type, "selected_time_period_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamCompanyFinancialsSectionResponse(title, time_period_options, selected_time_period_type, chart, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamCompanyFinancialsSectionResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamCompanyFinancialsSectionResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_company_financials.proto.v1.StreamCompanyFinancialsSectionResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamCompanyFinancialsSectionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                int iEncodedSizeWithTag = size + TimePeriodOption.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getTime_period_options());
                if (!Intrinsics.areEqual(value.getSelected_time_period_type(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSelected_time_period_type());
                }
                return value.getChart() != null ? iEncodedSizeWithTag + ChartGroup.ADAPTER.encodedSizeWithTag(4, value.getChart()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamCompanyFinancialsSectionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                TimePeriodOption.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getTime_period_options());
                if (!Intrinsics.areEqual(value.getSelected_time_period_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSelected_time_period_type());
                }
                if (value.getChart() != null) {
                    ChartGroup.ADAPTER.encodeWithTag(writer, 4, (int) value.getChart());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamCompanyFinancialsSectionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getChart() != null) {
                    ChartGroup.ADAPTER.encodeWithTag(writer, 4, (int) value.getChart());
                }
                if (!Intrinsics.areEqual(value.getSelected_time_period_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSelected_time_period_type());
                }
                TimePeriodOption.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getTime_period_options());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamCompanyFinancialsSectionResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ChartGroup chartGroupDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamCompanyFinancialsSectionResponse(strDecode, arrayList, strDecode2, chartGroupDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(TimePeriodOption.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        chartGroupDecode = ChartGroup.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamCompanyFinancialsSectionResponse redact(StreamCompanyFinancialsSectionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getTime_period_options(), TimePeriodOption.ADAPTER);
                ChartGroup chart = value.getChart();
                return StreamCompanyFinancialsSectionResponse.copy$default(value, null, listM26823redactElements, null, chart != null ? ChartGroup.ADAPTER.redact(chart) : null, ByteString.EMPTY, 5, null);
            }
        };
    }
}
