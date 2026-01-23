package bff_money_movement.service.p019v1;

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

/* compiled from: InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J}\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010,R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!¨\u0006."}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails;", "Lcom/squareup/wire/Message;", "", "ticker", "", "subtitle", "percent_text", "amount", "bar_color", "bar_percentage", "", "deeplink", "id", "negative_line_position", "Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePosition;", "caret_position_percentage", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePosition;Ljava/lang/Double;Lokio/ByteString;)V", "getTicker", "()Ljava/lang/String;", "getSubtitle", "getPercent_text", "getAmount", "getBar_color", "getBar_percentage", "()D", "getDeeplink", "getId", "getNegative_line_position", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePosition;", "getCaret_position_percentage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerCategoryPercentageLinePosition;Ljava/lang/Double;Lokio/ByteString;)Lbff_money_movement/service/v1/InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails;", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "barColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String bar_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "barPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double bar_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "caretPositionPercentage", schemaIndex = 9, tag = 10)
    private final Double caret_position_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String id;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerCategoryPercentageLinePosition#ADAPTER", jsonName = "negativeLinePosition", schemaIndex = 8, tag = 9)
    private final InvestmentsTrackerCategoryPercentageLinePosition negative_line_position;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "percentText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String percent_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ticker;

    public InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails() {
        this(null, null, null, null, null, 0.0d, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails(String str, String str2, String str3, String str4, String str5, double d, String str6, String str7, InvestmentsTrackerCategoryPercentageLinePosition investmentsTrackerCategoryPercentageLinePosition, Double d2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? null : investmentsTrackerCategoryPercentageLinePosition, (i & 512) != 0 ? null : d2, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8456newBuilder();
    }

    public final String getTicker() {
        return this.ticker;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getPercent_text() {
        return this.percent_text;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getBar_color() {
        return this.bar_color;
    }

    public final double getBar_percentage() {
        return this.bar_percentage;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getId() {
        return this.id;
    }

    public final InvestmentsTrackerCategoryPercentageLinePosition getNegative_line_position() {
        return this.negative_line_position;
    }

    public final Double getCaret_position_percentage() {
        return this.caret_position_percentage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails(String ticker, String subtitle, String percent_text, String amount, String bar_color, double d, String deeplink, String id, InvestmentsTrackerCategoryPercentageLinePosition investmentsTrackerCategoryPercentageLinePosition, Double d2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(percent_text, "percent_text");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(bar_color, "bar_color");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ticker = ticker;
        this.subtitle = subtitle;
        this.percent_text = percent_text;
        this.amount = amount;
        this.bar_color = bar_color;
        this.bar_percentage = d;
        this.deeplink = deeplink;
        this.id = id;
        this.negative_line_position = investmentsTrackerCategoryPercentageLinePosition;
        this.caret_position_percentage = d2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8456newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails)) {
            return false;
        }
        InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails investmentsTrackerComponentCategoryPercentageCellHoldingDetails = (InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerComponentCategoryPercentageCellHoldingDetails.unknownFields()) && Intrinsics.areEqual(this.ticker, investmentsTrackerComponentCategoryPercentageCellHoldingDetails.ticker) && Intrinsics.areEqual(this.subtitle, investmentsTrackerComponentCategoryPercentageCellHoldingDetails.subtitle) && Intrinsics.areEqual(this.percent_text, investmentsTrackerComponentCategoryPercentageCellHoldingDetails.percent_text) && Intrinsics.areEqual(this.amount, investmentsTrackerComponentCategoryPercentageCellHoldingDetails.amount) && Intrinsics.areEqual(this.bar_color, investmentsTrackerComponentCategoryPercentageCellHoldingDetails.bar_color) && this.bar_percentage == investmentsTrackerComponentCategoryPercentageCellHoldingDetails.bar_percentage && Intrinsics.areEqual(this.deeplink, investmentsTrackerComponentCategoryPercentageCellHoldingDetails.deeplink) && Intrinsics.areEqual(this.id, investmentsTrackerComponentCategoryPercentageCellHoldingDetails.id) && this.negative_line_position == investmentsTrackerComponentCategoryPercentageCellHoldingDetails.negative_line_position && Intrinsics.areEqual(this.caret_position_percentage, investmentsTrackerComponentCategoryPercentageCellHoldingDetails.caret_position_percentage);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((unknownFields().hashCode() * 37) + this.ticker.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.percent_text.hashCode()) * 37) + this.amount.hashCode()) * 37) + this.bar_color.hashCode()) * 37) + Double.hashCode(this.bar_percentage)) * 37) + this.deeplink.hashCode()) * 37) + this.id.hashCode()) * 37;
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
        arrayList.add("ticker=" + Internal.sanitize(this.ticker));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("percent_text=" + Internal.sanitize(this.percent_text));
        arrayList.add("amount=" + Internal.sanitize(this.amount));
        arrayList.add("bar_color=" + Internal.sanitize(this.bar_color));
        arrayList.add("bar_percentage=" + this.bar_percentage);
        arrayList.add("deeplink=" + Internal.sanitize(this.deeplink));
        arrayList.add("id=" + Internal.sanitize(this.id));
        InvestmentsTrackerCategoryPercentageLinePosition investmentsTrackerCategoryPercentageLinePosition = this.negative_line_position;
        if (investmentsTrackerCategoryPercentageLinePosition != null) {
            arrayList.add("negative_line_position=" + investmentsTrackerCategoryPercentageLinePosition);
        }
        Double d = this.caret_position_percentage;
        if (d != null) {
            arrayList.add("caret_position_percentage=" + d);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails copy$default(InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails investmentsTrackerComponentCategoryPercentageCellHoldingDetails, String str, String str2, String str3, String str4, String str5, double d, String str6, String str7, InvestmentsTrackerCategoryPercentageLinePosition investmentsTrackerCategoryPercentageLinePosition, Double d2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerComponentCategoryPercentageCellHoldingDetails.ticker;
        }
        if ((i & 2) != 0) {
            str2 = investmentsTrackerComponentCategoryPercentageCellHoldingDetails.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = investmentsTrackerComponentCategoryPercentageCellHoldingDetails.percent_text;
        }
        if ((i & 8) != 0) {
            str4 = investmentsTrackerComponentCategoryPercentageCellHoldingDetails.amount;
        }
        if ((i & 16) != 0) {
            str5 = investmentsTrackerComponentCategoryPercentageCellHoldingDetails.bar_color;
        }
        if ((i & 32) != 0) {
            d = investmentsTrackerComponentCategoryPercentageCellHoldingDetails.bar_percentage;
        }
        if ((i & 64) != 0) {
            str6 = investmentsTrackerComponentCategoryPercentageCellHoldingDetails.deeplink;
        }
        if ((i & 128) != 0) {
            str7 = investmentsTrackerComponentCategoryPercentageCellHoldingDetails.id;
        }
        if ((i & 256) != 0) {
            investmentsTrackerCategoryPercentageLinePosition = investmentsTrackerComponentCategoryPercentageCellHoldingDetails.negative_line_position;
        }
        if ((i & 512) != 0) {
            d2 = investmentsTrackerComponentCategoryPercentageCellHoldingDetails.caret_position_percentage;
        }
        if ((i & 1024) != 0) {
            byteString = investmentsTrackerComponentCategoryPercentageCellHoldingDetails.unknownFields();
        }
        ByteString byteString2 = byteString;
        InvestmentsTrackerCategoryPercentageLinePosition investmentsTrackerCategoryPercentageLinePosition2 = investmentsTrackerCategoryPercentageLinePosition;
        String str8 = str6;
        double d3 = d;
        String str9 = str4;
        String str10 = str5;
        String str11 = str3;
        return investmentsTrackerComponentCategoryPercentageCellHoldingDetails.copy(str, str2, str11, str9, str10, d3, str8, str7, investmentsTrackerCategoryPercentageLinePosition2, d2, byteString2);
    }

    public final InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails copy(String ticker, String subtitle, String percent_text, String amount, String bar_color, double bar_percentage, String deeplink, String id, InvestmentsTrackerCategoryPercentageLinePosition negative_line_position, Double caret_position_percentage, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(percent_text, "percent_text");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(bar_color, "bar_color");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails(ticker, subtitle, percent_text, amount, bar_color, bar_percentage, deeplink, id, negative_line_position, caret_position_percentage, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTicker(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTicker());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getPercent_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPercent_text());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getBar_color(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getBar_color());
                }
                if (!Double.valueOf(value.getBar_percentage()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getBar_percentage()));
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getId());
                }
                return size + InvestmentsTrackerCategoryPercentageLinePosition.ADAPTER.encodedSizeWithTag(9, value.getNegative_line_position()) + ProtoAdapter.DOUBLE.encodedSizeWithTag(10, value.getCaret_position_percentage());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTicker(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTicker());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getPercent_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPercent_text());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getBar_color(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getBar_color());
                }
                if (!Double.valueOf(value.getBar_percentage()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getBar_percentage()));
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getId());
                }
                InvestmentsTrackerCategoryPercentageLinePosition.ADAPTER.encodeWithTag(writer, 9, (int) value.getNegative_line_position());
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 10, (int) value.getCaret_position_percentage());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getCaret_position_percentage());
                InvestmentsTrackerCategoryPercentageLinePosition.ADAPTER.encodeWithTag(writer, 9, (int) value.getNegative_line_position());
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getDeeplink());
                }
                if (!Double.valueOf(value.getBar_percentage()).equals(Double.valueOf(0.0d))) {
                    protoAdapter.encodeWithTag(writer, 6, (int) Double.valueOf(value.getBar_percentage()));
                }
                if (!Intrinsics.areEqual(value.getBar_color(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getBar_color());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getPercent_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPercent_text());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTicker(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTicker());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails redact(InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails.copy$default(value, null, null, null, null, null, 0.0d, null, null, null, null, ByteString.EMPTY, 1023, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                double dDoubleValue = 0.0d;
                InvestmentsTrackerCategoryPercentageLinePosition investmentsTrackerCategoryPercentageLinePositionDecode = null;
                Double dDecode = null;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                str = strDecode5;
                                str2 = strDecode6;
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                try {
                                    investmentsTrackerCategoryPercentageLinePositionDecode = InvestmentsTrackerCategoryPercentageLinePosition.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode5;
                                    str2 = strDecode6;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 10:
                                dDecode = ProtoAdapter.DOUBLE.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode5;
                                str2 = strDecode6;
                                break;
                        }
                        strDecode5 = str;
                        strDecode6 = str2;
                    } else {
                        return new InvestmentsTrackerComponentCategoryPercentageCellHoldingDetails(strDecode5, strDecode6, strDecode7, strDecode, strDecode2, dDoubleValue, strDecode3, strDecode4, investmentsTrackerCategoryPercentageLinePositionDecode, dDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
