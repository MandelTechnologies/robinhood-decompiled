package bff_money_movement.service.p019v1;

import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
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

/* compiled from: InvestmentsTrackerComponentCategoryPercentageCellDetails.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010&\u001a\u00020\u0002H\u0017J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0004H\u0016J\u0083\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010/R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00061"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetails;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "id", "line_fill_percentage", "", "line_fill_color", "percentage_text", "amount", CryptoDetailSource.HOLDINGS, "", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails;", "negative_line_position", "Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePosition;", "caret_position_percentage", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePosition;Ljava/lang/Double;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getId", "getLine_fill_percentage", "()D", "getLine_fill_color", "getPercentage_text", "getAmount", "getNegative_line_position", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePosition;", "getCaret_position_percentage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getHoldings", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePosition;Ljava/lang/Double;Lokio/ByteString;)Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellDetails;", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentCategoryPercentageCellDetails extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerComponentCategoryPercentageCellDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "caretPositionPercentage", schemaIndex = 9, tag = 10)
    private final Double caret_position_percentage;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final List<InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails> holdings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lineFillColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String line_fill_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "lineFillPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double line_fill_percentage;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerCategoryPercentageLinePosition#ADAPTER", jsonName = "negativeLinePosition", schemaIndex = 8, tag = 9)
    private final InvestmentsTrackerCategoryPercentageLinePosition negative_line_position;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "percentageText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String percentage_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public InvestmentsTrackerComponentCategoryPercentageCellDetails() {
        this(null, null, null, 0.0d, null, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ InvestmentsTrackerComponentCategoryPercentageCellDetails(String str, String str2, String str3, double d, String str4, String str5, String str6, List list, InvestmentsTrackerCategoryPercentageLinePosition investmentsTrackerCategoryPercentageLinePosition, Double d2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? null : investmentsTrackerCategoryPercentageLinePosition, (i & 512) != 0 ? null : d2, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8454newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getId() {
        return this.id;
    }

    public final double getLine_fill_percentage() {
        return this.line_fill_percentage;
    }

    public final String getLine_fill_color() {
        return this.line_fill_color;
    }

    public final String getPercentage_text() {
        return this.percentage_text;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final InvestmentsTrackerCategoryPercentageLinePosition getNegative_line_position() {
        return this.negative_line_position;
    }

    public final Double getCaret_position_percentage() {
        return this.caret_position_percentage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentCategoryPercentageCellDetails(String title, String subtitle, String id, double d, String line_fill_color, String percentage_text, String amount, List<InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails> holdings, InvestmentsTrackerCategoryPercentageLinePosition investmentsTrackerCategoryPercentageLinePosition, Double d2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(line_fill_color, "line_fill_color");
        Intrinsics.checkNotNullParameter(percentage_text, "percentage_text");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(holdings, "holdings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.id = id;
        this.line_fill_percentage = d;
        this.line_fill_color = line_fill_color;
        this.percentage_text = percentage_text;
        this.amount = amount;
        this.negative_line_position = investmentsTrackerCategoryPercentageLinePosition;
        this.caret_position_percentage = d2;
        this.holdings = Internal.immutableCopyOf(CryptoDetailSource.HOLDINGS, holdings);
    }

    public final List<InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails> getHoldings() {
        return this.holdings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8454newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerComponentCategoryPercentageCellDetails)) {
            return false;
        }
        InvestmentsTrackerComponentCategoryPercentageCellDetails investmentsTrackerComponentCategoryPercentageCellDetails = (InvestmentsTrackerComponentCategoryPercentageCellDetails) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerComponentCategoryPercentageCellDetails.unknownFields()) && Intrinsics.areEqual(this.title, investmentsTrackerComponentCategoryPercentageCellDetails.title) && Intrinsics.areEqual(this.subtitle, investmentsTrackerComponentCategoryPercentageCellDetails.subtitle) && Intrinsics.areEqual(this.id, investmentsTrackerComponentCategoryPercentageCellDetails.id) && this.line_fill_percentage == investmentsTrackerComponentCategoryPercentageCellDetails.line_fill_percentage && Intrinsics.areEqual(this.line_fill_color, investmentsTrackerComponentCategoryPercentageCellDetails.line_fill_color) && Intrinsics.areEqual(this.percentage_text, investmentsTrackerComponentCategoryPercentageCellDetails.percentage_text) && Intrinsics.areEqual(this.amount, investmentsTrackerComponentCategoryPercentageCellDetails.amount) && Intrinsics.areEqual(this.holdings, investmentsTrackerComponentCategoryPercentageCellDetails.holdings) && this.negative_line_position == investmentsTrackerComponentCategoryPercentageCellDetails.negative_line_position && Intrinsics.areEqual(this.caret_position_percentage, investmentsTrackerComponentCategoryPercentageCellDetails.caret_position_percentage);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.id.hashCode()) * 37) + Double.hashCode(this.line_fill_percentage)) * 37) + this.line_fill_color.hashCode()) * 37) + this.percentage_text.hashCode()) * 37) + this.amount.hashCode()) * 37) + this.holdings.hashCode()) * 37;
        InvestmentsTrackerCategoryPercentageLinePosition investmentsTrackerCategoryPercentageLinePosition = this.negative_line_position;
        int iHashCode2 = (iHashCode + (investmentsTrackerCategoryPercentageLinePosition != null ? investmentsTrackerCategoryPercentageLinePosition.hashCode() : 0)) * 37;
        Double d = this.caret_position_percentage;
        int iHashCode3 = iHashCode2 + (d != null ? d.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("line_fill_percentage=" + this.line_fill_percentage);
        arrayList.add("line_fill_color=" + Internal.sanitize(this.line_fill_color));
        arrayList.add("percentage_text=" + Internal.sanitize(this.percentage_text));
        arrayList.add("amount=" + Internal.sanitize(this.amount));
        if (!this.holdings.isEmpty()) {
            arrayList.add("holdings=" + this.holdings);
        }
        InvestmentsTrackerCategoryPercentageLinePosition investmentsTrackerCategoryPercentageLinePosition = this.negative_line_position;
        if (investmentsTrackerCategoryPercentageLinePosition != null) {
            arrayList.add("negative_line_position=" + investmentsTrackerCategoryPercentageLinePosition);
        }
        Double d = this.caret_position_percentage;
        if (d != null) {
            arrayList.add("caret_position_percentage=" + d);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerComponentCategoryPercentageCellDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerComponentCategoryPercentageCellDetails copy$default(InvestmentsTrackerComponentCategoryPercentageCellDetails investmentsTrackerComponentCategoryPercentageCellDetails, String str, String str2, String str3, double d, String str4, String str5, String str6, List list, InvestmentsTrackerCategoryPercentageLinePosition investmentsTrackerCategoryPercentageLinePosition, Double d2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerComponentCategoryPercentageCellDetails.title;
        }
        if ((i & 2) != 0) {
            str2 = investmentsTrackerComponentCategoryPercentageCellDetails.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = investmentsTrackerComponentCategoryPercentageCellDetails.id;
        }
        if ((i & 8) != 0) {
            d = investmentsTrackerComponentCategoryPercentageCellDetails.line_fill_percentage;
        }
        if ((i & 16) != 0) {
            str4 = investmentsTrackerComponentCategoryPercentageCellDetails.line_fill_color;
        }
        if ((i & 32) != 0) {
            str5 = investmentsTrackerComponentCategoryPercentageCellDetails.percentage_text;
        }
        if ((i & 64) != 0) {
            str6 = investmentsTrackerComponentCategoryPercentageCellDetails.amount;
        }
        if ((i & 128) != 0) {
            list = investmentsTrackerComponentCategoryPercentageCellDetails.holdings;
        }
        if ((i & 256) != 0) {
            investmentsTrackerCategoryPercentageLinePosition = investmentsTrackerComponentCategoryPercentageCellDetails.negative_line_position;
        }
        if ((i & 512) != 0) {
            d2 = investmentsTrackerComponentCategoryPercentageCellDetails.caret_position_percentage;
        }
        if ((i & 1024) != 0) {
            byteString = investmentsTrackerComponentCategoryPercentageCellDetails.unknownFields();
        }
        Double d3 = d2;
        ByteString byteString2 = byteString;
        InvestmentsTrackerCategoryPercentageLinePosition investmentsTrackerCategoryPercentageLinePosition2 = investmentsTrackerCategoryPercentageLinePosition;
        String str7 = str6;
        String str8 = str4;
        double d4 = d;
        String str9 = str3;
        return investmentsTrackerComponentCategoryPercentageCellDetails.copy(str, str2, str9, d4, str8, str5, str7, list, investmentsTrackerCategoryPercentageLinePosition2, d3, byteString2);
    }

    public final InvestmentsTrackerComponentCategoryPercentageCellDetails copy(String title, String subtitle, String id, double line_fill_percentage, String line_fill_color, String percentage_text, String amount, List<InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails> holdings, InvestmentsTrackerCategoryPercentageLinePosition negative_line_position, Double caret_position_percentage, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(line_fill_color, "line_fill_color");
        Intrinsics.checkNotNullParameter(percentage_text, "percentage_text");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(holdings, "holdings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerComponentCategoryPercentageCellDetails(title, subtitle, id, line_fill_percentage, line_fill_color, percentage_text, amount, holdings, negative_line_position, caret_position_percentage, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerComponentCategoryPercentageCellDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerComponentCategoryPercentageCellDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerComponentCategoryPercentageCellDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getId());
                }
                if (!Double.valueOf(value.getLine_fill_percentage()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getLine_fill_percentage()));
                }
                if (!Intrinsics.areEqual(value.getLine_fill_color(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLine_fill_color());
                }
                if (!Intrinsics.areEqual(value.getPercentage_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getPercentage_text());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getAmount());
                }
                return size + InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails.ADAPTER.asRepeated().encodedSizeWithTag(8, value.getHoldings()) + InvestmentsTrackerCategoryPercentageLinePosition.ADAPTER.encodedSizeWithTag(9, value.getNegative_line_position()) + ProtoAdapter.DOUBLE.encodedSizeWithTag(10, value.getCaret_position_percentage());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerComponentCategoryPercentageCellDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getId());
                }
                if (!Double.valueOf(value.getLine_fill_percentage()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getLine_fill_percentage()));
                }
                if (!Intrinsics.areEqual(value.getLine_fill_color(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLine_fill_color());
                }
                if (!Intrinsics.areEqual(value.getPercentage_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getPercentage_text());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAmount());
                }
                InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getHoldings());
                InvestmentsTrackerCategoryPercentageLinePosition.ADAPTER.encodeWithTag(writer, 9, (int) value.getNegative_line_position());
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 10, (int) value.getCaret_position_percentage());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerComponentCategoryPercentageCellDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getCaret_position_percentage());
                InvestmentsTrackerCategoryPercentageLinePosition.ADAPTER.encodeWithTag(writer, 9, (int) value.getNegative_line_position());
                InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getHoldings());
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getPercentage_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getPercentage_text());
                }
                if (!Intrinsics.areEqual(value.getLine_fill_color(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLine_fill_color());
                }
                if (!Double.valueOf(value.getLine_fill_percentage()).equals(Double.valueOf(0.0d))) {
                    protoAdapter.encodeWithTag(writer, 4, (int) Double.valueOf(value.getLine_fill_percentage()));
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getId());
                }
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
            public InvestmentsTrackerComponentCategoryPercentageCellDetails decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                double dDoubleValue = 0.0d;
                InvestmentsTrackerCategoryPercentageLinePosition investmentsTrackerCategoryPercentageLinePositionDecode = null;
                Double dDecode = null;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                strDecode4 = strDecode4;
                                strDecode5 = strDecode5;
                                continue;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                str = strDecode4;
                                str2 = strDecode5;
                                str3 = strDecode6;
                                arrayList.add(InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails.ADAPTER.decode(reader));
                                break;
                            case 9:
                                try {
                                    investmentsTrackerCategoryPercentageLinePositionDecode = InvestmentsTrackerCategoryPercentageLinePosition.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode4;
                                    str2 = strDecode5;
                                    str3 = strDecode6;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 10:
                                dDecode = ProtoAdapter.DOUBLE.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode4;
                                str2 = strDecode5;
                                str3 = strDecode6;
                                break;
                        }
                        strDecode4 = str;
                        strDecode5 = str2;
                        strDecode6 = str3;
                    } else {
                        return new InvestmentsTrackerComponentCategoryPercentageCellDetails(strDecode4, strDecode5, strDecode6, dDoubleValue, strDecode, strDecode2, strDecode3, arrayList, investmentsTrackerCategoryPercentageLinePositionDecode, dDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentCategoryPercentageCellDetails redact(InvestmentsTrackerComponentCategoryPercentageCellDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerComponentCategoryPercentageCellDetails.copy$default(value, null, null, null, 0.0d, null, null, null, Internal.m26823redactElements(value.getHoldings(), InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails.ADAPTER), null, null, ByteString.EMPTY, 895, null);
            }
        };
    }
}
