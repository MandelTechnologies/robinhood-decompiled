package bonfire.proto.idl.portfolio.p037v1;

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

/* compiled from: GetAccountPositionDetailsResponse.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B³\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00104\u001a\u00020\u0002H\u0017J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0096\u0002J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020\u0004H\u0016J²\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006>"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/GetAccountPositionDetailsResponse;", "Lcom/squareup/wire/Message;", "", "account_number", "", "instrument_id", "display_type", "title", "Lbonfire/proto/idl/portfolio/v1/PositionText;", "subtitle", "chart", "Lbonfire/proto/idl/portfolio/v1/PositionChart;", "value", "Lbonfire/proto/idl/portfolio/v1/PositionValue;", "sub_value", "instrument_type", "chart_type", "Lbonfire/proto/idl/portfolio/v1/PositionDetailChartType;", "display_configuration", "Lbonfire/proto/idl/portfolio/v1/PositionDetailsDisplayConfiguration;", "metadata", "Lbonfire/proto/idl/portfolio/v1/PositionMetadata;", "swiping_behaviors", "", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehavior;", "display_currency_code", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionText;Lbonfire/proto/idl/portfolio/v1/PositionText;Lbonfire/proto/idl/portfolio/v1/PositionChart;Lbonfire/proto/idl/portfolio/v1/PositionValue;Lbonfire/proto/idl/portfolio/v1/PositionText;Ljava/lang/String;Lbonfire/proto/idl/portfolio/v1/PositionDetailChartType;Lbonfire/proto/idl/portfolio/v1/PositionDetailsDisplayConfiguration;Lbonfire/proto/idl/portfolio/v1/PositionMetadata;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getInstrument_id", "getDisplay_type", "getTitle", "()Lbonfire/proto/idl/portfolio/v1/PositionText;", "getSubtitle", "getChart", "()Lbonfire/proto/idl/portfolio/v1/PositionChart;", "getValue", "()Lbonfire/proto/idl/portfolio/v1/PositionValue;", "getSub_value", "getInstrument_type", "getChart_type", "()Lbonfire/proto/idl/portfolio/v1/PositionDetailChartType;", "getDisplay_configuration", "()Lbonfire/proto/idl/portfolio/v1/PositionDetailsDisplayConfiguration;", "getMetadata", "()Lbonfire/proto/idl/portfolio/v1/PositionMetadata;", "getDisplay_currency_code", "getSwiping_behaviors", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetAccountPositionDetailsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountPositionDetailsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionChart#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final PositionChart chart;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionDetailChartType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final PositionDetailChartType chart_type;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionDetailsDisplayConfiguration#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final PositionDetailsDisplayConfiguration display_configuration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 13, tag = 14)
    private final String display_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String display_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String instrument_type;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionMetadata#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final PositionMetadata metadata;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final PositionText sub_value;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final PositionText subtitle;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionSwipeBehavior#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 12, tag = 13)
    private final List<PositionSwipeBehavior> swiping_behaviors;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final PositionText title;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionValue#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final PositionValue value;

    public GetAccountPositionDetailsResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public /* synthetic */ GetAccountPositionDetailsResponse(String str, String str2, String str3, PositionText positionText, PositionText positionText2, PositionChart positionChart, PositionValue positionValue, PositionText positionText3, String str4, PositionDetailChartType positionDetailChartType, PositionDetailsDisplayConfiguration positionDetailsDisplayConfiguration, PositionMetadata positionMetadata, List list, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : positionText, (i & 16) != 0 ? null : positionText2, (i & 32) != 0 ? null : positionChart, (i & 64) != 0 ? null : positionValue, (i & 128) != 0 ? null : positionText3, (i & 256) == 0 ? str4 : "", (i & 512) != 0 ? PositionDetailChartType.PositionDetailChartType_UNSPECIFIED : positionDetailChartType, (i & 1024) != 0 ? null : positionDetailsDisplayConfiguration, (i & 2048) != 0 ? null : positionMetadata, (i & 4096) != 0 ? CollectionsKt.emptyList() : list, (i & 8192) == 0 ? str5 : null, (i & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9022newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getDisplay_type() {
        return this.display_type;
    }

    public final PositionText getTitle() {
        return this.title;
    }

    public final PositionText getSubtitle() {
        return this.subtitle;
    }

    public final PositionChart getChart() {
        return this.chart;
    }

    public final PositionValue getValue() {
        return this.value;
    }

    public final PositionText getSub_value() {
        return this.sub_value;
    }

    public final String getInstrument_type() {
        return this.instrument_type;
    }

    public final PositionDetailChartType getChart_type() {
        return this.chart_type;
    }

    public final PositionDetailsDisplayConfiguration getDisplay_configuration() {
        return this.display_configuration;
    }

    public final PositionMetadata getMetadata() {
        return this.metadata;
    }

    public final String getDisplay_currency_code() {
        return this.display_currency_code;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountPositionDetailsResponse(String account_number, String instrument_id, String display_type, PositionText positionText, PositionText positionText2, PositionChart positionChart, PositionValue positionValue, PositionText positionText3, String instrument_type, PositionDetailChartType chart_type, PositionDetailsDisplayConfiguration positionDetailsDisplayConfiguration, PositionMetadata positionMetadata, List<PositionSwipeBehavior> swiping_behaviors, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(display_type, "display_type");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(chart_type, "chart_type");
        Intrinsics.checkNotNullParameter(swiping_behaviors, "swiping_behaviors");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.instrument_id = instrument_id;
        this.display_type = display_type;
        this.title = positionText;
        this.subtitle = positionText2;
        this.chart = positionChart;
        this.value = positionValue;
        this.sub_value = positionText3;
        this.instrument_type = instrument_type;
        this.chart_type = chart_type;
        this.display_configuration = positionDetailsDisplayConfiguration;
        this.metadata = positionMetadata;
        this.display_currency_code = str;
        this.swiping_behaviors = Internal.immutableCopyOf("swiping_behaviors", swiping_behaviors);
    }

    public final List<PositionSwipeBehavior> getSwiping_behaviors() {
        return this.swiping_behaviors;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9022newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountPositionDetailsResponse)) {
            return false;
        }
        GetAccountPositionDetailsResponse getAccountPositionDetailsResponse = (GetAccountPositionDetailsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAccountPositionDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.account_number, getAccountPositionDetailsResponse.account_number) && Intrinsics.areEqual(this.instrument_id, getAccountPositionDetailsResponse.instrument_id) && Intrinsics.areEqual(this.display_type, getAccountPositionDetailsResponse.display_type) && Intrinsics.areEqual(this.title, getAccountPositionDetailsResponse.title) && Intrinsics.areEqual(this.subtitle, getAccountPositionDetailsResponse.subtitle) && Intrinsics.areEqual(this.chart, getAccountPositionDetailsResponse.chart) && Intrinsics.areEqual(this.value, getAccountPositionDetailsResponse.value) && Intrinsics.areEqual(this.sub_value, getAccountPositionDetailsResponse.sub_value) && Intrinsics.areEqual(this.instrument_type, getAccountPositionDetailsResponse.instrument_type) && this.chart_type == getAccountPositionDetailsResponse.chart_type && Intrinsics.areEqual(this.display_configuration, getAccountPositionDetailsResponse.display_configuration) && Intrinsics.areEqual(this.metadata, getAccountPositionDetailsResponse.metadata) && Intrinsics.areEqual(this.swiping_behaviors, getAccountPositionDetailsResponse.swiping_behaviors) && Intrinsics.areEqual(this.display_currency_code, getAccountPositionDetailsResponse.display_currency_code);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.display_type.hashCode()) * 37;
        PositionText positionText = this.title;
        int iHashCode2 = (iHashCode + (positionText != null ? positionText.hashCode() : 0)) * 37;
        PositionText positionText2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (positionText2 != null ? positionText2.hashCode() : 0)) * 37;
        PositionChart positionChart = this.chart;
        int iHashCode4 = (iHashCode3 + (positionChart != null ? positionChart.hashCode() : 0)) * 37;
        PositionValue positionValue = this.value;
        int iHashCode5 = (iHashCode4 + (positionValue != null ? positionValue.hashCode() : 0)) * 37;
        PositionText positionText3 = this.sub_value;
        int iHashCode6 = (((((iHashCode5 + (positionText3 != null ? positionText3.hashCode() : 0)) * 37) + this.instrument_type.hashCode()) * 37) + this.chart_type.hashCode()) * 37;
        PositionDetailsDisplayConfiguration positionDetailsDisplayConfiguration = this.display_configuration;
        int iHashCode7 = (iHashCode6 + (positionDetailsDisplayConfiguration != null ? positionDetailsDisplayConfiguration.hashCode() : 0)) * 37;
        PositionMetadata positionMetadata = this.metadata;
        int iHashCode8 = (((iHashCode7 + (positionMetadata != null ? positionMetadata.hashCode() : 0)) * 37) + this.swiping_behaviors.hashCode()) * 37;
        String str = this.display_currency_code;
        int iHashCode9 = iHashCode8 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("display_type=" + Internal.sanitize(this.display_type));
        PositionText positionText = this.title;
        if (positionText != null) {
            arrayList.add("title=" + positionText);
        }
        PositionText positionText2 = this.subtitle;
        if (positionText2 != null) {
            arrayList.add("subtitle=" + positionText2);
        }
        PositionChart positionChart = this.chart;
        if (positionChart != null) {
            arrayList.add("chart=" + positionChart);
        }
        PositionValue positionValue = this.value;
        if (positionValue != null) {
            arrayList.add("value=" + positionValue);
        }
        PositionText positionText3 = this.sub_value;
        if (positionText3 != null) {
            arrayList.add("sub_value=" + positionText3);
        }
        arrayList.add("instrument_type=" + Internal.sanitize(this.instrument_type));
        arrayList.add("chart_type=" + this.chart_type);
        PositionDetailsDisplayConfiguration positionDetailsDisplayConfiguration = this.display_configuration;
        if (positionDetailsDisplayConfiguration != null) {
            arrayList.add("display_configuration=" + positionDetailsDisplayConfiguration);
        }
        PositionMetadata positionMetadata = this.metadata;
        if (positionMetadata != null) {
            arrayList.add("metadata=" + positionMetadata);
        }
        if (!this.swiping_behaviors.isEmpty()) {
            arrayList.add("swiping_behaviors=" + this.swiping_behaviors);
        }
        String str = this.display_currency_code;
        if (str != null) {
            arrayList.add("display_currency_code=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountPositionDetailsResponse{", "}", 0, null, null, 56, null);
    }

    public final GetAccountPositionDetailsResponse copy(String account_number, String instrument_id, String display_type, PositionText title, PositionText subtitle, PositionChart chart, PositionValue value, PositionText sub_value, String instrument_type, PositionDetailChartType chart_type, PositionDetailsDisplayConfiguration display_configuration, PositionMetadata metadata, List<PositionSwipeBehavior> swiping_behaviors, String display_currency_code, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(display_type, "display_type");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(chart_type, "chart_type");
        Intrinsics.checkNotNullParameter(swiping_behaviors, "swiping_behaviors");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountPositionDetailsResponse(account_number, instrument_id, display_type, title, subtitle, chart, value, sub_value, instrument_type, chart_type, display_configuration, metadata, swiping_behaviors, display_currency_code, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountPositionDetailsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountPositionDetailsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.portfolio.v1.GetAccountPositionDetailsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountPositionDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getDisplay_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDisplay_type());
                }
                if (value.getTitle() != null) {
                    size += PositionText.ADAPTER.encodedSizeWithTag(4, value.getTitle());
                }
                if (value.getSubtitle() != null) {
                    size += PositionText.ADAPTER.encodedSizeWithTag(5, value.getSubtitle());
                }
                if (value.getChart() != null) {
                    size += PositionChart.ADAPTER.encodedSizeWithTag(6, value.getChart());
                }
                if (value.getValue() != null) {
                    size += PositionValue.ADAPTER.encodedSizeWithTag(7, value.getValue());
                }
                if (value.getSub_value() != null) {
                    size += PositionText.ADAPTER.encodedSizeWithTag(8, value.getSub_value());
                }
                if (!Intrinsics.areEqual(value.getInstrument_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getInstrument_type());
                }
                if (value.getChart_type() != PositionDetailChartType.PositionDetailChartType_UNSPECIFIED) {
                    size += PositionDetailChartType.ADAPTER.encodedSizeWithTag(10, value.getChart_type());
                }
                if (value.getDisplay_configuration() != null) {
                    size += PositionDetailsDisplayConfiguration.ADAPTER.encodedSizeWithTag(11, value.getDisplay_configuration());
                }
                if (value.getMetadata() != null) {
                    size += PositionMetadata.ADAPTER.encodedSizeWithTag(12, value.getMetadata());
                }
                return size + PositionSwipeBehavior.ADAPTER.asRepeated().encodedSizeWithTag(13, value.getSwiping_behaviors()) + ProtoAdapter.STRING.encodedSizeWithTag(14, value.getDisplay_currency_code());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountPositionDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getDisplay_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisplay_type());
                }
                if (value.getTitle() != null) {
                    PositionText.ADAPTER.encodeWithTag(writer, 4, (int) value.getTitle());
                }
                if (value.getSubtitle() != null) {
                    PositionText.ADAPTER.encodeWithTag(writer, 5, (int) value.getSubtitle());
                }
                if (value.getChart() != null) {
                    PositionChart.ADAPTER.encodeWithTag(writer, 6, (int) value.getChart());
                }
                if (value.getValue() != null) {
                    PositionValue.ADAPTER.encodeWithTag(writer, 7, (int) value.getValue());
                }
                if (value.getSub_value() != null) {
                    PositionText.ADAPTER.encodeWithTag(writer, 8, (int) value.getSub_value());
                }
                if (!Intrinsics.areEqual(value.getInstrument_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getInstrument_type());
                }
                if (value.getChart_type() != PositionDetailChartType.PositionDetailChartType_UNSPECIFIED) {
                    PositionDetailChartType.ADAPTER.encodeWithTag(writer, 10, (int) value.getChart_type());
                }
                if (value.getDisplay_configuration() != null) {
                    PositionDetailsDisplayConfiguration.ADAPTER.encodeWithTag(writer, 11, (int) value.getDisplay_configuration());
                }
                if (value.getMetadata() != null) {
                    PositionMetadata.ADAPTER.encodeWithTag(writer, 12, (int) value.getMetadata());
                }
                PositionSwipeBehavior.ADAPTER.asRepeated().encodeWithTag(writer, 13, (int) value.getSwiping_behaviors());
                ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getDisplay_currency_code());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountPositionDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 14, (int) value.getDisplay_currency_code());
                PositionSwipeBehavior.ADAPTER.asRepeated().encodeWithTag(writer, 13, (int) value.getSwiping_behaviors());
                if (value.getMetadata() != null) {
                    PositionMetadata.ADAPTER.encodeWithTag(writer, 12, (int) value.getMetadata());
                }
                if (value.getDisplay_configuration() != null) {
                    PositionDetailsDisplayConfiguration.ADAPTER.encodeWithTag(writer, 11, (int) value.getDisplay_configuration());
                }
                if (value.getChart_type() != PositionDetailChartType.PositionDetailChartType_UNSPECIFIED) {
                    PositionDetailChartType.ADAPTER.encodeWithTag(writer, 10, (int) value.getChart_type());
                }
                if (!Intrinsics.areEqual(value.getInstrument_type(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getInstrument_type());
                }
                if (value.getSub_value() != null) {
                    PositionText.ADAPTER.encodeWithTag(writer, 8, (int) value.getSub_value());
                }
                if (value.getValue() != null) {
                    PositionValue.ADAPTER.encodeWithTag(writer, 7, (int) value.getValue());
                }
                if (value.getChart() != null) {
                    PositionChart.ADAPTER.encodeWithTag(writer, 6, (int) value.getChart());
                }
                if (value.getSubtitle() != null) {
                    PositionText.ADAPTER.encodeWithTag(writer, 5, (int) value.getSubtitle());
                }
                if (value.getTitle() != null) {
                    PositionText.ADAPTER.encodeWithTag(writer, 4, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDisplay_type(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getDisplay_type());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountPositionDetailsResponse decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(reader, "reader");
                PositionDetailChartType positionDetailChartType = PositionDetailChartType.PositionDetailChartType_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                PositionDetailChartType positionDetailChartTypeDecode = positionDetailChartType;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                PositionText positionTextDecode = null;
                PositionText positionTextDecode2 = null;
                PositionChart positionChartDecode = null;
                PositionValue positionValueDecode = null;
                PositionText positionTextDecode3 = null;
                PositionDetailsDisplayConfiguration positionDetailsDisplayConfigurationDecode = null;
                PositionMetadata positionMetadataDecode = null;
                String strDecode4 = null;
                String strDecode5 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                positionTextDecode = PositionText.ADAPTER.decode(reader);
                                break;
                            case 5:
                                positionTextDecode2 = PositionText.ADAPTER.decode(reader);
                                break;
                            case 6:
                                positionChartDecode = PositionChart.ADAPTER.decode(reader);
                                break;
                            case 7:
                                positionValueDecode = PositionValue.ADAPTER.decode(reader);
                                break;
                            case 8:
                                positionTextDecode3 = PositionText.ADAPTER.decode(reader);
                                break;
                            case 9:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                try {
                                    positionDetailChartTypeDecode = PositionDetailChartType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode5;
                                    str2 = strDecode;
                                    str3 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 11:
                                positionDetailsDisplayConfigurationDecode = PositionDetailsDisplayConfiguration.ADAPTER.decode(reader);
                                break;
                            case 12:
                                positionMetadataDecode = PositionMetadata.ADAPTER.decode(reader);
                                break;
                            case 13:
                                arrayList.add(PositionSwipeBehavior.ADAPTER.decode(reader));
                                str = strDecode5;
                                str2 = strDecode;
                                str3 = strDecode2;
                                strDecode5 = str;
                                strDecode = str2;
                                strDecode2 = str3;
                                break;
                            case 14:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode5;
                                str2 = strDecode;
                                str3 = strDecode2;
                                strDecode5 = str;
                                strDecode = str2;
                                strDecode2 = str3;
                                break;
                        }
                    } else {
                        return new GetAccountPositionDetailsResponse(strDecode5, strDecode, strDecode2, positionTextDecode, positionTextDecode2, positionChartDecode, positionValueDecode, positionTextDecode3, strDecode3, positionDetailChartTypeDecode, positionDetailsDisplayConfigurationDecode, positionMetadataDecode, arrayList, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountPositionDetailsResponse redact(GetAccountPositionDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PositionText title = value.getTitle();
                PositionText positionTextRedact = title != null ? PositionText.ADAPTER.redact(title) : null;
                PositionText subtitle = value.getSubtitle();
                PositionText positionTextRedact2 = subtitle != null ? PositionText.ADAPTER.redact(subtitle) : null;
                PositionChart chart = value.getChart();
                PositionChart positionChartRedact = chart != null ? PositionChart.ADAPTER.redact(chart) : null;
                PositionValue value2 = value.getValue();
                PositionValue positionValueRedact = value2 != null ? PositionValue.ADAPTER.redact(value2) : null;
                PositionText sub_value = value.getSub_value();
                PositionText positionTextRedact3 = sub_value != null ? PositionText.ADAPTER.redact(sub_value) : null;
                PositionDetailsDisplayConfiguration display_configuration = value.getDisplay_configuration();
                PositionDetailsDisplayConfiguration positionDetailsDisplayConfigurationRedact = display_configuration != null ? PositionDetailsDisplayConfiguration.ADAPTER.redact(display_configuration) : null;
                PositionMetadata metadata = value.getMetadata();
                return value.copy((8967 & 1) != 0 ? value.account_number : null, (8967 & 2) != 0 ? value.instrument_id : null, (8967 & 4) != 0 ? value.display_type : null, (8967 & 8) != 0 ? value.title : positionTextRedact, (8967 & 16) != 0 ? value.subtitle : positionTextRedact2, (8967 & 32) != 0 ? value.chart : positionChartRedact, (8967 & 64) != 0 ? value.value : positionValueRedact, (8967 & 128) != 0 ? value.sub_value : positionTextRedact3, (8967 & 256) != 0 ? value.instrument_type : null, (8967 & 512) != 0 ? value.chart_type : null, (8967 & 1024) != 0 ? value.display_configuration : positionDetailsDisplayConfigurationRedact, (8967 & 2048) != 0 ? value.metadata : metadata != null ? PositionMetadata.ADAPTER.redact(metadata) : null, (8967 & 4096) != 0 ? value.swiping_behaviors : Internal.m26823redactElements(value.getSwiping_behaviors(), PositionSwipeBehavior.ADAPTER), (8967 & 8192) != 0 ? value.display_currency_code : null, (8967 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
