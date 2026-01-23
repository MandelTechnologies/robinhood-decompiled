package rh_server_driven_ui.p531v1;

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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CursorData.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0089\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020+H\u0016J\u0088\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006."}, m3636d2 = {"Lrh_server_driven_ui/v1/CursorData;", "Lcom/squareup/wire/Message;", "", AnnotatedPrivateKey.LABEL, "Lrh_server_driven_ui/v1/DisplayText;", "secondary_label", "tertiary_label", "quaternary_label", "primary_value", "secondary_value", "Lrh_server_driven_ui/v1/SubDisplayText;", "tertiary_value", "quaternary_value", "price_chart_data", "Lrh_server_driven_ui/v1/PriceChartData;", "action", "Lrh_server_driven_ui/v1/DeepLinkAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/DisplayText;Lrh_server_driven_ui/v1/DisplayText;Lrh_server_driven_ui/v1/DisplayText;Lrh_server_driven_ui/v1/DisplayText;Lrh_server_driven_ui/v1/DisplayText;Lrh_server_driven_ui/v1/SubDisplayText;Lrh_server_driven_ui/v1/SubDisplayText;Lrh_server_driven_ui/v1/SubDisplayText;Lrh_server_driven_ui/v1/PriceChartData;Lrh_server_driven_ui/v1/DeepLinkAction;Lokio/ByteString;)V", "getLabel", "()Lrh_server_driven_ui/v1/DisplayText;", "getSecondary_label", "getTertiary_label", "getQuaternary_label", "getPrimary_value", "getSecondary_value", "()Lrh_server_driven_ui/v1/SubDisplayText;", "getTertiary_value", "getQuaternary_value", "getPrice_chart_data", "()Lrh_server_driven_ui/v1/PriceChartData;", "getAction", "()Lrh_server_driven_ui/v1/DeepLinkAction;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CursorData extends Message {

    @JvmField
    public static final ProtoAdapter<CursorData> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.DeepLinkAction#ADAPTER", schemaIndex = 9, tag = 10)
    private final DeepLinkAction action;

    @WireField(adapter = "rh_server_driven_ui.v1.DisplayText#ADAPTER", schemaIndex = 0, tag = 1)
    private final DisplayText label;

    @WireField(adapter = "rh_server_driven_ui.v1.PriceChartData#ADAPTER", jsonName = "priceChartData", schemaIndex = 8, tag = 9)
    private final PriceChartData price_chart_data;

    @WireField(adapter = "rh_server_driven_ui.v1.DisplayText#ADAPTER", jsonName = "primaryValue", schemaIndex = 4, tag = 5)
    private final DisplayText primary_value;

    @WireField(adapter = "rh_server_driven_ui.v1.DisplayText#ADAPTER", jsonName = "quaternaryLabel", schemaIndex = 3, tag = 4)
    private final DisplayText quaternary_label;

    @WireField(adapter = "rh_server_driven_ui.v1.SubDisplayText#ADAPTER", jsonName = "quaternaryValue", schemaIndex = 7, tag = 8)
    private final SubDisplayText quaternary_value;

    @WireField(adapter = "rh_server_driven_ui.v1.DisplayText#ADAPTER", jsonName = "secondaryLabel", schemaIndex = 1, tag = 2)
    private final DisplayText secondary_label;

    @WireField(adapter = "rh_server_driven_ui.v1.SubDisplayText#ADAPTER", jsonName = "secondaryValue", schemaIndex = 5, tag = 6)
    private final SubDisplayText secondary_value;

    @WireField(adapter = "rh_server_driven_ui.v1.DisplayText#ADAPTER", jsonName = "tertiaryLabel", schemaIndex = 2, tag = 3)
    private final DisplayText tertiary_label;

    @WireField(adapter = "rh_server_driven_ui.v1.SubDisplayText#ADAPTER", jsonName = "tertiaryValue", schemaIndex = 6, tag = 7)
    private final SubDisplayText tertiary_value;

    public CursorData() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29710newBuilder();
    }

    public final DisplayText getLabel() {
        return this.label;
    }

    public final DisplayText getSecondary_label() {
        return this.secondary_label;
    }

    public final DisplayText getTertiary_label() {
        return this.tertiary_label;
    }

    public final DisplayText getQuaternary_label() {
        return this.quaternary_label;
    }

    public final DisplayText getPrimary_value() {
        return this.primary_value;
    }

    public final SubDisplayText getSecondary_value() {
        return this.secondary_value;
    }

    public final SubDisplayText getTertiary_value() {
        return this.tertiary_value;
    }

    public final SubDisplayText getQuaternary_value() {
        return this.quaternary_value;
    }

    public final PriceChartData getPrice_chart_data() {
        return this.price_chart_data;
    }

    public final DeepLinkAction getAction() {
        return this.action;
    }

    public /* synthetic */ CursorData(DisplayText displayText, DisplayText displayText2, DisplayText displayText3, DisplayText displayText4, DisplayText displayText5, SubDisplayText subDisplayText, SubDisplayText subDisplayText2, SubDisplayText subDisplayText3, PriceChartData priceChartData, DeepLinkAction deepLinkAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : displayText, (i & 2) != 0 ? null : displayText2, (i & 4) != 0 ? null : displayText3, (i & 8) != 0 ? null : displayText4, (i & 16) != 0 ? null : displayText5, (i & 32) != 0 ? null : subDisplayText, (i & 64) != 0 ? null : subDisplayText2, (i & 128) != 0 ? null : subDisplayText3, (i & 256) != 0 ? null : priceChartData, (i & 512) != 0 ? null : deepLinkAction, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorData(DisplayText displayText, DisplayText displayText2, DisplayText displayText3, DisplayText displayText4, DisplayText displayText5, SubDisplayText subDisplayText, SubDisplayText subDisplayText2, SubDisplayText subDisplayText3, PriceChartData priceChartData, DeepLinkAction deepLinkAction, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.label = displayText;
        this.secondary_label = displayText2;
        this.tertiary_label = displayText3;
        this.quaternary_label = displayText4;
        this.primary_value = displayText5;
        this.secondary_value = subDisplayText;
        this.tertiary_value = subDisplayText2;
        this.quaternary_value = subDisplayText3;
        this.price_chart_data = priceChartData;
        this.action = deepLinkAction;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29710newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CursorData)) {
            return false;
        }
        CursorData cursorData = (CursorData) other;
        return Intrinsics.areEqual(unknownFields(), cursorData.unknownFields()) && Intrinsics.areEqual(this.label, cursorData.label) && Intrinsics.areEqual(this.secondary_label, cursorData.secondary_label) && Intrinsics.areEqual(this.tertiary_label, cursorData.tertiary_label) && Intrinsics.areEqual(this.quaternary_label, cursorData.quaternary_label) && Intrinsics.areEqual(this.primary_value, cursorData.primary_value) && Intrinsics.areEqual(this.secondary_value, cursorData.secondary_value) && Intrinsics.areEqual(this.tertiary_value, cursorData.tertiary_value) && Intrinsics.areEqual(this.quaternary_value, cursorData.quaternary_value) && Intrinsics.areEqual(this.price_chart_data, cursorData.price_chart_data) && Intrinsics.areEqual(this.action, cursorData.action);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        DisplayText displayText = this.label;
        int iHashCode2 = (iHashCode + (displayText != null ? displayText.hashCode() : 0)) * 37;
        DisplayText displayText2 = this.secondary_label;
        int iHashCode3 = (iHashCode2 + (displayText2 != null ? displayText2.hashCode() : 0)) * 37;
        DisplayText displayText3 = this.tertiary_label;
        int iHashCode4 = (iHashCode3 + (displayText3 != null ? displayText3.hashCode() : 0)) * 37;
        DisplayText displayText4 = this.quaternary_label;
        int iHashCode5 = (iHashCode4 + (displayText4 != null ? displayText4.hashCode() : 0)) * 37;
        DisplayText displayText5 = this.primary_value;
        int iHashCode6 = (iHashCode5 + (displayText5 != null ? displayText5.hashCode() : 0)) * 37;
        SubDisplayText subDisplayText = this.secondary_value;
        int iHashCode7 = (iHashCode6 + (subDisplayText != null ? subDisplayText.hashCode() : 0)) * 37;
        SubDisplayText subDisplayText2 = this.tertiary_value;
        int iHashCode8 = (iHashCode7 + (subDisplayText2 != null ? subDisplayText2.hashCode() : 0)) * 37;
        SubDisplayText subDisplayText3 = this.quaternary_value;
        int iHashCode9 = (iHashCode8 + (subDisplayText3 != null ? subDisplayText3.hashCode() : 0)) * 37;
        PriceChartData priceChartData = this.price_chart_data;
        int iHashCode10 = (iHashCode9 + (priceChartData != null ? priceChartData.hashCode() : 0)) * 37;
        DeepLinkAction deepLinkAction = this.action;
        int iHashCode11 = iHashCode10 + (deepLinkAction != null ? deepLinkAction.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        DisplayText displayText = this.label;
        if (displayText != null) {
            arrayList.add("label=" + displayText);
        }
        DisplayText displayText2 = this.secondary_label;
        if (displayText2 != null) {
            arrayList.add("secondary_label=" + displayText2);
        }
        DisplayText displayText3 = this.tertiary_label;
        if (displayText3 != null) {
            arrayList.add("tertiary_label=" + displayText3);
        }
        DisplayText displayText4 = this.quaternary_label;
        if (displayText4 != null) {
            arrayList.add("quaternary_label=" + displayText4);
        }
        DisplayText displayText5 = this.primary_value;
        if (displayText5 != null) {
            arrayList.add("primary_value=" + displayText5);
        }
        SubDisplayText subDisplayText = this.secondary_value;
        if (subDisplayText != null) {
            arrayList.add("secondary_value=" + subDisplayText);
        }
        SubDisplayText subDisplayText2 = this.tertiary_value;
        if (subDisplayText2 != null) {
            arrayList.add("tertiary_value=" + subDisplayText2);
        }
        SubDisplayText subDisplayText3 = this.quaternary_value;
        if (subDisplayText3 != null) {
            arrayList.add("quaternary_value=" + subDisplayText3);
        }
        PriceChartData priceChartData = this.price_chart_data;
        if (priceChartData != null) {
            arrayList.add("price_chart_data=" + priceChartData);
        }
        DeepLinkAction deepLinkAction = this.action;
        if (deepLinkAction != null) {
            arrayList.add("action=" + deepLinkAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CursorData{", "}", 0, null, null, 56, null);
    }

    public final CursorData copy(DisplayText label, DisplayText secondary_label, DisplayText tertiary_label, DisplayText quaternary_label, DisplayText primary_value, SubDisplayText secondary_value, SubDisplayText tertiary_value, SubDisplayText quaternary_value, PriceChartData price_chart_data, DeepLinkAction action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CursorData(label, secondary_label, tertiary_label, quaternary_label, primary_value, secondary_value, tertiary_value, quaternary_value, price_chart_data, action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CursorData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CursorData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.CursorData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CursorData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<DisplayText> protoAdapter = DisplayText.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getLabel()) + protoAdapter.encodedSizeWithTag(2, value.getSecondary_label()) + protoAdapter.encodedSizeWithTag(3, value.getTertiary_label()) + protoAdapter.encodedSizeWithTag(4, value.getQuaternary_label()) + protoAdapter.encodedSizeWithTag(5, value.getPrimary_value());
                ProtoAdapter<SubDisplayText> protoAdapter2 = SubDisplayText.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(6, value.getSecondary_value()) + protoAdapter2.encodedSizeWithTag(7, value.getTertiary_value()) + protoAdapter2.encodedSizeWithTag(8, value.getQuaternary_value()) + PriceChartData.ADAPTER.encodedSizeWithTag(9, value.getPrice_chart_data()) + DeepLinkAction.ADAPTER.encodedSizeWithTag(10, value.getAction());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CursorData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<DisplayText> protoAdapter = DisplayText.ADAPTER;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getLabel());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSecondary_label());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getTertiary_label());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getQuaternary_label());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getPrimary_value());
                ProtoAdapter<SubDisplayText> protoAdapter2 = SubDisplayText.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 6, (int) value.getSecondary_value());
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getTertiary_value());
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getQuaternary_value());
                PriceChartData.ADAPTER.encodeWithTag(writer, 9, (int) value.getPrice_chart_data());
                DeepLinkAction.ADAPTER.encodeWithTag(writer, 10, (int) value.getAction());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CursorData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                DeepLinkAction.ADAPTER.encodeWithTag(writer, 10, (int) value.getAction());
                PriceChartData.ADAPTER.encodeWithTag(writer, 9, (int) value.getPrice_chart_data());
                ProtoAdapter<SubDisplayText> protoAdapter = SubDisplayText.ADAPTER;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getQuaternary_value());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getTertiary_value());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getSecondary_value());
                ProtoAdapter<DisplayText> protoAdapter2 = DisplayText.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 5, (int) value.getPrimary_value());
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getQuaternary_label());
                protoAdapter2.encodeWithTag(writer, 3, (int) value.getTertiary_label());
                protoAdapter2.encodeWithTag(writer, 2, (int) value.getSecondary_label());
                protoAdapter2.encodeWithTag(writer, 1, (int) value.getLabel());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CursorData redact(CursorData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                DisplayText label = value.getLabel();
                DisplayText displayTextRedact = label != null ? DisplayText.ADAPTER.redact(label) : null;
                DisplayText secondary_label = value.getSecondary_label();
                DisplayText displayTextRedact2 = secondary_label != null ? DisplayText.ADAPTER.redact(secondary_label) : null;
                DisplayText tertiary_label = value.getTertiary_label();
                DisplayText displayTextRedact3 = tertiary_label != null ? DisplayText.ADAPTER.redact(tertiary_label) : null;
                DisplayText quaternary_label = value.getQuaternary_label();
                DisplayText displayTextRedact4 = quaternary_label != null ? DisplayText.ADAPTER.redact(quaternary_label) : null;
                DisplayText primary_value = value.getPrimary_value();
                DisplayText displayTextRedact5 = primary_value != null ? DisplayText.ADAPTER.redact(primary_value) : null;
                SubDisplayText secondary_value = value.getSecondary_value();
                SubDisplayText subDisplayTextRedact = secondary_value != null ? SubDisplayText.ADAPTER.redact(secondary_value) : null;
                SubDisplayText tertiary_value = value.getTertiary_value();
                SubDisplayText subDisplayTextRedact2 = tertiary_value != null ? SubDisplayText.ADAPTER.redact(tertiary_value) : null;
                SubDisplayText quaternary_value = value.getQuaternary_value();
                SubDisplayText subDisplayTextRedact3 = quaternary_value != null ? SubDisplayText.ADAPTER.redact(quaternary_value) : null;
                PriceChartData price_chart_data = value.getPrice_chart_data();
                PriceChartData priceChartDataRedact = price_chart_data != null ? PriceChartData.ADAPTER.redact(price_chart_data) : null;
                DeepLinkAction action = value.getAction();
                return value.copy(displayTextRedact, displayTextRedact2, displayTextRedact3, displayTextRedact4, displayTextRedact5, subDisplayTextRedact, subDisplayTextRedact2, subDisplayTextRedact3, priceChartDataRedact, action != null ? DeepLinkAction.ADAPTER.redact(action) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CursorData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                DisplayText displayTextDecode = null;
                DisplayText displayTextDecode2 = null;
                DisplayText displayTextDecode3 = null;
                DisplayText displayTextDecode4 = null;
                DisplayText displayTextDecode5 = null;
                SubDisplayText subDisplayTextDecode = null;
                SubDisplayText subDisplayTextDecode2 = null;
                SubDisplayText subDisplayTextDecode3 = null;
                PriceChartData priceChartDataDecode = null;
                DeepLinkAction deepLinkActionDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                displayTextDecode = DisplayText.ADAPTER.decode(reader);
                                break;
                            case 2:
                                displayTextDecode2 = DisplayText.ADAPTER.decode(reader);
                                break;
                            case 3:
                                displayTextDecode3 = DisplayText.ADAPTER.decode(reader);
                                break;
                            case 4:
                                displayTextDecode4 = DisplayText.ADAPTER.decode(reader);
                                break;
                            case 5:
                                displayTextDecode5 = DisplayText.ADAPTER.decode(reader);
                                break;
                            case 6:
                                subDisplayTextDecode = SubDisplayText.ADAPTER.decode(reader);
                                break;
                            case 7:
                                subDisplayTextDecode2 = SubDisplayText.ADAPTER.decode(reader);
                                break;
                            case 8:
                                subDisplayTextDecode3 = SubDisplayText.ADAPTER.decode(reader);
                                break;
                            case 9:
                                priceChartDataDecode = PriceChartData.ADAPTER.decode(reader);
                                break;
                            case 10:
                                deepLinkActionDecode = DeepLinkAction.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CursorData(displayTextDecode, displayTextDecode2, displayTextDecode3, displayTextDecode4, displayTextDecode5, subDisplayTextDecode, subDisplayTextDecode2, subDisplayTextDecode3, priceChartDataDecode, deepLinkActionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
