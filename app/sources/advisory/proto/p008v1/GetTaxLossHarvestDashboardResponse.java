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

/* compiled from: GetTaxLossHarvestDashboardResponse.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016Jn\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006-"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestDashboardResponse;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle_markdown", "status", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatus;", "timeline", "Ladvisory/proto/v1/TaxLossHarvestDashboardTimeline;", "gains_and_losses_header", "Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeader;", "cta_button", "Ladvisory/proto/v1/TaxLossHarvestDashboardCtaButton;", "available_years", "", "year", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestDashboardStatus;Ladvisory/proto/v1/TaxLossHarvestDashboardTimeline;Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeader;Ladvisory/proto/v1/TaxLossHarvestDashboardCtaButton;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle_markdown", "getStatus", "()Ladvisory/proto/v1/TaxLossHarvestDashboardStatus;", "getTimeline", "()Ladvisory/proto/v1/TaxLossHarvestDashboardTimeline;", "getGains_and_losses_header", "()Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeader;", "getCta_button", "()Ladvisory/proto/v1/TaxLossHarvestDashboardCtaButton;", "getYear", "getAvailable_years", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetTaxLossHarvestDashboardResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetTaxLossHarvestDashboardResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "availableYears", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<String> available_years;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestDashboardCtaButton#ADAPTER", jsonName = "ctaButton", schemaIndex = 5, tag = 6)
    private final TaxLossHarvestDashboardCtaButton cta_button;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestDashboardGainsAndLossesHeader#ADAPTER", jsonName = "gainsAndLossesHeader", schemaIndex = 4, tag = 5)
    private final TaxLossHarvestDashboardGainsAndLossesHeader gains_and_losses_header;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestDashboardStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TaxLossHarvestDashboardStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subtitleMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle_markdown;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestDashboardTimeline#ADAPTER", schemaIndex = 3, tag = 4)
    private final TaxLossHarvestDashboardTimeline timeline;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String year;

    public GetTaxLossHarvestDashboardResponse() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ GetTaxLossHarvestDashboardResponse(String str, String str2, TaxLossHarvestDashboardStatus taxLossHarvestDashboardStatus, TaxLossHarvestDashboardTimeline taxLossHarvestDashboardTimeline, TaxLossHarvestDashboardGainsAndLossesHeader taxLossHarvestDashboardGainsAndLossesHeader, TaxLossHarvestDashboardCtaButton taxLossHarvestDashboardCtaButton, List list, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : taxLossHarvestDashboardStatus, (i & 8) != 0 ? null : taxLossHarvestDashboardTimeline, (i & 16) != 0 ? null : taxLossHarvestDashboardGainsAndLossesHeader, (i & 32) != 0 ? null : taxLossHarvestDashboardCtaButton, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4492newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle_markdown() {
        return this.subtitle_markdown;
    }

    public final TaxLossHarvestDashboardStatus getStatus() {
        return this.status;
    }

    public final TaxLossHarvestDashboardTimeline getTimeline() {
        return this.timeline;
    }

    public final TaxLossHarvestDashboardGainsAndLossesHeader getGains_and_losses_header() {
        return this.gains_and_losses_header;
    }

    public final TaxLossHarvestDashboardCtaButton getCta_button() {
        return this.cta_button;
    }

    public final String getYear() {
        return this.year;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTaxLossHarvestDashboardResponse(String title, String subtitle_markdown, TaxLossHarvestDashboardStatus taxLossHarvestDashboardStatus, TaxLossHarvestDashboardTimeline taxLossHarvestDashboardTimeline, TaxLossHarvestDashboardGainsAndLossesHeader taxLossHarvestDashboardGainsAndLossesHeader, TaxLossHarvestDashboardCtaButton taxLossHarvestDashboardCtaButton, List<String> available_years, String year, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle_markdown, "subtitle_markdown");
        Intrinsics.checkNotNullParameter(available_years, "available_years");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle_markdown = subtitle_markdown;
        this.status = taxLossHarvestDashboardStatus;
        this.timeline = taxLossHarvestDashboardTimeline;
        this.gains_and_losses_header = taxLossHarvestDashboardGainsAndLossesHeader;
        this.cta_button = taxLossHarvestDashboardCtaButton;
        this.year = year;
        this.available_years = Internal.immutableCopyOf("available_years", available_years);
    }

    public final List<String> getAvailable_years() {
        return this.available_years;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4492newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetTaxLossHarvestDashboardResponse)) {
            return false;
        }
        GetTaxLossHarvestDashboardResponse getTaxLossHarvestDashboardResponse = (GetTaxLossHarvestDashboardResponse) other;
        return Intrinsics.areEqual(unknownFields(), getTaxLossHarvestDashboardResponse.unknownFields()) && Intrinsics.areEqual(this.title, getTaxLossHarvestDashboardResponse.title) && Intrinsics.areEqual(this.subtitle_markdown, getTaxLossHarvestDashboardResponse.subtitle_markdown) && Intrinsics.areEqual(this.status, getTaxLossHarvestDashboardResponse.status) && Intrinsics.areEqual(this.timeline, getTaxLossHarvestDashboardResponse.timeline) && Intrinsics.areEqual(this.gains_and_losses_header, getTaxLossHarvestDashboardResponse.gains_and_losses_header) && Intrinsics.areEqual(this.cta_button, getTaxLossHarvestDashboardResponse.cta_button) && Intrinsics.areEqual(this.available_years, getTaxLossHarvestDashboardResponse.available_years) && Intrinsics.areEqual(this.year, getTaxLossHarvestDashboardResponse.year);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle_markdown.hashCode()) * 37;
        TaxLossHarvestDashboardStatus taxLossHarvestDashboardStatus = this.status;
        int iHashCode2 = (iHashCode + (taxLossHarvestDashboardStatus != null ? taxLossHarvestDashboardStatus.hashCode() : 0)) * 37;
        TaxLossHarvestDashboardTimeline taxLossHarvestDashboardTimeline = this.timeline;
        int iHashCode3 = (iHashCode2 + (taxLossHarvestDashboardTimeline != null ? taxLossHarvestDashboardTimeline.hashCode() : 0)) * 37;
        TaxLossHarvestDashboardGainsAndLossesHeader taxLossHarvestDashboardGainsAndLossesHeader = this.gains_and_losses_header;
        int iHashCode4 = (iHashCode3 + (taxLossHarvestDashboardGainsAndLossesHeader != null ? taxLossHarvestDashboardGainsAndLossesHeader.hashCode() : 0)) * 37;
        TaxLossHarvestDashboardCtaButton taxLossHarvestDashboardCtaButton = this.cta_button;
        int iHashCode5 = ((((iHashCode4 + (taxLossHarvestDashboardCtaButton != null ? taxLossHarvestDashboardCtaButton.hashCode() : 0)) * 37) + this.available_years.hashCode()) * 37) + this.year.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle_markdown=" + Internal.sanitize(this.subtitle_markdown));
        TaxLossHarvestDashboardStatus taxLossHarvestDashboardStatus = this.status;
        if (taxLossHarvestDashboardStatus != null) {
            arrayList.add("status=" + taxLossHarvestDashboardStatus);
        }
        TaxLossHarvestDashboardTimeline taxLossHarvestDashboardTimeline = this.timeline;
        if (taxLossHarvestDashboardTimeline != null) {
            arrayList.add("timeline=" + taxLossHarvestDashboardTimeline);
        }
        TaxLossHarvestDashboardGainsAndLossesHeader taxLossHarvestDashboardGainsAndLossesHeader = this.gains_and_losses_header;
        if (taxLossHarvestDashboardGainsAndLossesHeader != null) {
            arrayList.add("gains_and_losses_header=" + taxLossHarvestDashboardGainsAndLossesHeader);
        }
        TaxLossHarvestDashboardCtaButton taxLossHarvestDashboardCtaButton = this.cta_button;
        if (taxLossHarvestDashboardCtaButton != null) {
            arrayList.add("cta_button=" + taxLossHarvestDashboardCtaButton);
        }
        if (!this.available_years.isEmpty()) {
            arrayList.add("available_years=" + Internal.sanitize(this.available_years));
        }
        arrayList.add("year=" + Internal.sanitize(this.year));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetTaxLossHarvestDashboardResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetTaxLossHarvestDashboardResponse copy$default(GetTaxLossHarvestDashboardResponse getTaxLossHarvestDashboardResponse, String str, String str2, TaxLossHarvestDashboardStatus taxLossHarvestDashboardStatus, TaxLossHarvestDashboardTimeline taxLossHarvestDashboardTimeline, TaxLossHarvestDashboardGainsAndLossesHeader taxLossHarvestDashboardGainsAndLossesHeader, TaxLossHarvestDashboardCtaButton taxLossHarvestDashboardCtaButton, List list, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getTaxLossHarvestDashboardResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = getTaxLossHarvestDashboardResponse.subtitle_markdown;
        }
        if ((i & 4) != 0) {
            taxLossHarvestDashboardStatus = getTaxLossHarvestDashboardResponse.status;
        }
        if ((i & 8) != 0) {
            taxLossHarvestDashboardTimeline = getTaxLossHarvestDashboardResponse.timeline;
        }
        if ((i & 16) != 0) {
            taxLossHarvestDashboardGainsAndLossesHeader = getTaxLossHarvestDashboardResponse.gains_and_losses_header;
        }
        if ((i & 32) != 0) {
            taxLossHarvestDashboardCtaButton = getTaxLossHarvestDashboardResponse.cta_button;
        }
        if ((i & 64) != 0) {
            list = getTaxLossHarvestDashboardResponse.available_years;
        }
        if ((i & 128) != 0) {
            str3 = getTaxLossHarvestDashboardResponse.year;
        }
        if ((i & 256) != 0) {
            byteString = getTaxLossHarvestDashboardResponse.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        TaxLossHarvestDashboardCtaButton taxLossHarvestDashboardCtaButton2 = taxLossHarvestDashboardCtaButton;
        List list2 = list;
        TaxLossHarvestDashboardGainsAndLossesHeader taxLossHarvestDashboardGainsAndLossesHeader2 = taxLossHarvestDashboardGainsAndLossesHeader;
        TaxLossHarvestDashboardStatus taxLossHarvestDashboardStatus2 = taxLossHarvestDashboardStatus;
        return getTaxLossHarvestDashboardResponse.copy(str, str2, taxLossHarvestDashboardStatus2, taxLossHarvestDashboardTimeline, taxLossHarvestDashboardGainsAndLossesHeader2, taxLossHarvestDashboardCtaButton2, list2, str4, byteString2);
    }

    public final GetTaxLossHarvestDashboardResponse copy(String title, String subtitle_markdown, TaxLossHarvestDashboardStatus status, TaxLossHarvestDashboardTimeline timeline, TaxLossHarvestDashboardGainsAndLossesHeader gains_and_losses_header, TaxLossHarvestDashboardCtaButton cta_button, List<String> available_years, String year, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle_markdown, "subtitle_markdown");
        Intrinsics.checkNotNullParameter(available_years, "available_years");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetTaxLossHarvestDashboardResponse(title, subtitle_markdown, status, timeline, gains_and_losses_header, cta_button, available_years, year, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetTaxLossHarvestDashboardResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetTaxLossHarvestDashboardResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetTaxLossHarvestDashboardResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetTaxLossHarvestDashboardResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle_markdown());
                }
                if (value.getStatus() != null) {
                    size += TaxLossHarvestDashboardStatus.ADAPTER.encodedSizeWithTag(3, value.getStatus());
                }
                int iEncodedSizeWithTag = size + TaxLossHarvestDashboardTimeline.ADAPTER.encodedSizeWithTag(4, value.getTimeline()) + TaxLossHarvestDashboardGainsAndLossesHeader.ADAPTER.encodedSizeWithTag(5, value.getGains_and_losses_header()) + TaxLossHarvestDashboardCtaButton.ADAPTER.encodedSizeWithTag(6, value.getCta_button());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(7, value.getAvailable_years());
                return !Intrinsics.areEqual(value.getYear(), "") ? iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(8, value.getYear()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetTaxLossHarvestDashboardResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                }
                if (value.getStatus() != null) {
                    TaxLossHarvestDashboardStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getStatus());
                }
                TaxLossHarvestDashboardTimeline.ADAPTER.encodeWithTag(writer, 4, (int) value.getTimeline());
                TaxLossHarvestDashboardGainsAndLossesHeader.ADAPTER.encodeWithTag(writer, 5, (int) value.getGains_and_losses_header());
                TaxLossHarvestDashboardCtaButton.ADAPTER.encodeWithTag(writer, 6, (int) value.getCta_button());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getAvailable_years());
                if (!Intrinsics.areEqual(value.getYear(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getYear());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetTaxLossHarvestDashboardResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getYear(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getYear());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 7, (int) value.getAvailable_years());
                TaxLossHarvestDashboardCtaButton.ADAPTER.encodeWithTag(writer, 6, (int) value.getCta_button());
                TaxLossHarvestDashboardGainsAndLossesHeader.ADAPTER.encodeWithTag(writer, 5, (int) value.getGains_and_losses_header());
                TaxLossHarvestDashboardTimeline.ADAPTER.encodeWithTag(writer, 4, (int) value.getTimeline());
                if (value.getStatus() != null) {
                    TaxLossHarvestDashboardStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getSubtitle_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle_markdown());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxLossHarvestDashboardResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                TaxLossHarvestDashboardStatus taxLossHarvestDashboardStatusDecode = null;
                TaxLossHarvestDashboardTimeline taxLossHarvestDashboardTimelineDecode = null;
                TaxLossHarvestDashboardGainsAndLossesHeader taxLossHarvestDashboardGainsAndLossesHeaderDecode = null;
                TaxLossHarvestDashboardCtaButton taxLossHarvestDashboardCtaButtonDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                taxLossHarvestDashboardStatusDecode = TaxLossHarvestDashboardStatus.ADAPTER.decode(reader);
                                break;
                            case 4:
                                taxLossHarvestDashboardTimelineDecode = TaxLossHarvestDashboardTimeline.ADAPTER.decode(reader);
                                break;
                            case 5:
                                taxLossHarvestDashboardGainsAndLossesHeaderDecode = TaxLossHarvestDashboardGainsAndLossesHeader.ADAPTER.decode(reader);
                                break;
                            case 6:
                                taxLossHarvestDashboardCtaButtonDecode = TaxLossHarvestDashboardCtaButton.ADAPTER.decode(reader);
                                break;
                            case 7:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 8:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetTaxLossHarvestDashboardResponse(strDecode, strDecode3, taxLossHarvestDashboardStatusDecode, taxLossHarvestDashboardTimelineDecode, taxLossHarvestDashboardGainsAndLossesHeaderDecode, taxLossHarvestDashboardCtaButtonDecode, arrayList, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetTaxLossHarvestDashboardResponse redact(GetTaxLossHarvestDashboardResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TaxLossHarvestDashboardStatus status = value.getStatus();
                TaxLossHarvestDashboardStatus taxLossHarvestDashboardStatusRedact = status != null ? TaxLossHarvestDashboardStatus.ADAPTER.redact(status) : null;
                TaxLossHarvestDashboardTimeline timeline = value.getTimeline();
                TaxLossHarvestDashboardTimeline taxLossHarvestDashboardTimelineRedact = timeline != null ? TaxLossHarvestDashboardTimeline.ADAPTER.redact(timeline) : null;
                TaxLossHarvestDashboardGainsAndLossesHeader gains_and_losses_header = value.getGains_and_losses_header();
                TaxLossHarvestDashboardGainsAndLossesHeader taxLossHarvestDashboardGainsAndLossesHeaderRedact = gains_and_losses_header != null ? TaxLossHarvestDashboardGainsAndLossesHeader.ADAPTER.redact(gains_and_losses_header) : null;
                TaxLossHarvestDashboardCtaButton cta_button = value.getCta_button();
                return GetTaxLossHarvestDashboardResponse.copy$default(value, null, null, taxLossHarvestDashboardStatusRedact, taxLossHarvestDashboardTimelineRedact, taxLossHarvestDashboardGainsAndLossesHeaderRedact, cta_button != null ? TaxLossHarvestDashboardCtaButton.ADAPTER.redact(cta_button) : null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, null);
            }
        };
    }
}
