package rh_server_driven_ui.p531v1;

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

/* compiled from: MarginTieredInterestRates.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020\nH\u0016J\b\u0010'\u001a\u00020(H\u0016Ja\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010*R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006,"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredInterestRates;", "Lcom/squareup/wire/Message;", "", "callout", "Lrh_server_driven_ui/v1/MarginTieredRateTableCallout;", "header", "Lrh_server_driven_ui/v1/MarginRateHeader;", "highlighted_background_color", "Lrh_server_driven_ui/v1/ThemedColor;", "highlighted_row_index", "", "rates", "", "Lrh_server_driven_ui/v1/MarginRateRow;", "highlighted_row_style", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyle;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/MarginTieredRateTableCallout;Lrh_server_driven_ui/v1/MarginRateHeader;Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/Integer;Ljava/util/List;Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyle;Lokio/ByteString;)V", "getCallout", "()Lrh_server_driven_ui/v1/MarginTieredRateTableCallout;", "getHeader", "()Lrh_server_driven_ui/v1/MarginRateHeader;", "getHighlighted_background_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getHighlighted_row_index", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHighlighted_row_style", "()Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyle;", "getRates", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "(Lrh_server_driven_ui/v1/MarginTieredRateTableCallout;Lrh_server_driven_ui/v1/MarginRateHeader;Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/Integer;Ljava/util/List;Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyle;Lokio/ByteString;)Lrh_server_driven_ui/v1/MarginTieredInterestRates;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class MarginTieredInterestRates extends Message {

    @JvmField
    public static final ProtoAdapter<MarginTieredInterestRates> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.MarginTieredRateTableCallout#ADAPTER", schemaIndex = 0, tag = 1)
    private final MarginTieredRateTableCallout callout;

    @WireField(adapter = "rh_server_driven_ui.v1.MarginRateHeader#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final MarginRateHeader header;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "highlightedBackgroundColor", schemaIndex = 2, tag = 3)
    private final ThemedColor highlighted_background_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "highlightedRowIndex", schemaIndex = 3, tag = 4)
    private final Integer highlighted_row_index;

    @WireField(adapter = "rh_server_driven_ui.v1.MarginTieredHighlightRowStyle#ADAPTER", jsonName = "highlightedRowStyle", schemaIndex = 5, tag = 6)
    private final MarginTieredHighlightRowStyle highlighted_row_style;

    @WireField(adapter = "rh_server_driven_ui.v1.MarginRateRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<MarginRateRow> rates;

    public MarginTieredInterestRates() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29778newBuilder();
    }

    public final MarginTieredRateTableCallout getCallout() {
        return this.callout;
    }

    public final MarginRateHeader getHeader() {
        return this.header;
    }

    public final ThemedColor getHighlighted_background_color() {
        return this.highlighted_background_color;
    }

    public final Integer getHighlighted_row_index() {
        return this.highlighted_row_index;
    }

    public /* synthetic */ MarginTieredInterestRates(MarginTieredRateTableCallout marginTieredRateTableCallout, MarginRateHeader marginRateHeader, ThemedColor themedColor, Integer num, List list, MarginTieredHighlightRowStyle marginTieredHighlightRowStyle, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : marginTieredRateTableCallout, (i & 2) != 0 ? null : marginRateHeader, (i & 4) != 0 ? null : themedColor, (i & 8) != 0 ? null : num, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : marginTieredHighlightRowStyle, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final MarginTieredHighlightRowStyle getHighlighted_row_style() {
        return this.highlighted_row_style;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginTieredInterestRates(MarginTieredRateTableCallout marginTieredRateTableCallout, MarginRateHeader marginRateHeader, ThemedColor themedColor, Integer num, List<MarginRateRow> rates, MarginTieredHighlightRowStyle marginTieredHighlightRowStyle, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.callout = marginTieredRateTableCallout;
        this.header = marginRateHeader;
        this.highlighted_background_color = themedColor;
        this.highlighted_row_index = num;
        this.highlighted_row_style = marginTieredHighlightRowStyle;
        this.rates = Internal.immutableCopyOf("rates", rates);
    }

    public final List<MarginRateRow> getRates() {
        return this.rates;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29778newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginTieredInterestRates)) {
            return false;
        }
        MarginTieredInterestRates marginTieredInterestRates = (MarginTieredInterestRates) other;
        return Intrinsics.areEqual(unknownFields(), marginTieredInterestRates.unknownFields()) && Intrinsics.areEqual(this.callout, marginTieredInterestRates.callout) && Intrinsics.areEqual(this.header, marginTieredInterestRates.header) && Intrinsics.areEqual(this.highlighted_background_color, marginTieredInterestRates.highlighted_background_color) && Intrinsics.areEqual(this.highlighted_row_index, marginTieredInterestRates.highlighted_row_index) && Intrinsics.areEqual(this.rates, marginTieredInterestRates.rates) && Intrinsics.areEqual(this.highlighted_row_style, marginTieredInterestRates.highlighted_row_style);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        MarginTieredRateTableCallout marginTieredRateTableCallout = this.callout;
        int iHashCode2 = (iHashCode + (marginTieredRateTableCallout != null ? marginTieredRateTableCallout.hashCode() : 0)) * 37;
        MarginRateHeader marginRateHeader = this.header;
        int iHashCode3 = (iHashCode2 + (marginRateHeader != null ? marginRateHeader.hashCode() : 0)) * 37;
        ThemedColor themedColor = this.highlighted_background_color;
        int iHashCode4 = (iHashCode3 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        Integer num = this.highlighted_row_index;
        int iHashCode5 = (((iHashCode4 + (num != null ? num.hashCode() : 0)) * 37) + this.rates.hashCode()) * 37;
        MarginTieredHighlightRowStyle marginTieredHighlightRowStyle = this.highlighted_row_style;
        int iHashCode6 = iHashCode5 + (marginTieredHighlightRowStyle != null ? marginTieredHighlightRowStyle.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        MarginTieredRateTableCallout marginTieredRateTableCallout = this.callout;
        if (marginTieredRateTableCallout != null) {
            arrayList.add("callout=" + marginTieredRateTableCallout);
        }
        MarginRateHeader marginRateHeader = this.header;
        if (marginRateHeader != null) {
            arrayList.add("header=" + marginRateHeader);
        }
        ThemedColor themedColor = this.highlighted_background_color;
        if (themedColor != null) {
            arrayList.add("highlighted_background_color=" + themedColor);
        }
        Integer num = this.highlighted_row_index;
        if (num != null) {
            arrayList.add("highlighted_row_index=" + num);
        }
        if (!this.rates.isEmpty()) {
            arrayList.add("rates=" + this.rates);
        }
        MarginTieredHighlightRowStyle marginTieredHighlightRowStyle = this.highlighted_row_style;
        if (marginTieredHighlightRowStyle != null) {
            arrayList.add("highlighted_row_style=" + marginTieredHighlightRowStyle);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginTieredInterestRates{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginTieredInterestRates copy$default(MarginTieredInterestRates marginTieredInterestRates, MarginTieredRateTableCallout marginTieredRateTableCallout, MarginRateHeader marginRateHeader, ThemedColor themedColor, Integer num, List list, MarginTieredHighlightRowStyle marginTieredHighlightRowStyle, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            marginTieredRateTableCallout = marginTieredInterestRates.callout;
        }
        if ((i & 2) != 0) {
            marginRateHeader = marginTieredInterestRates.header;
        }
        if ((i & 4) != 0) {
            themedColor = marginTieredInterestRates.highlighted_background_color;
        }
        if ((i & 8) != 0) {
            num = marginTieredInterestRates.highlighted_row_index;
        }
        if ((i & 16) != 0) {
            list = marginTieredInterestRates.rates;
        }
        if ((i & 32) != 0) {
            marginTieredHighlightRowStyle = marginTieredInterestRates.highlighted_row_style;
        }
        if ((i & 64) != 0) {
            byteString = marginTieredInterestRates.unknownFields();
        }
        MarginTieredHighlightRowStyle marginTieredHighlightRowStyle2 = marginTieredHighlightRowStyle;
        ByteString byteString2 = byteString;
        List list2 = list;
        ThemedColor themedColor2 = themedColor;
        return marginTieredInterestRates.copy(marginTieredRateTableCallout, marginRateHeader, themedColor2, num, list2, marginTieredHighlightRowStyle2, byteString2);
    }

    public final MarginTieredInterestRates copy(MarginTieredRateTableCallout callout, MarginRateHeader header, ThemedColor highlighted_background_color, Integer highlighted_row_index, List<MarginRateRow> rates, MarginTieredHighlightRowStyle highlighted_row_style, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginTieredInterestRates(callout, header, highlighted_background_color, highlighted_row_index, rates, highlighted_row_style, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginTieredInterestRates.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginTieredInterestRates>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.MarginTieredInterestRates$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginTieredInterestRates value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + MarginTieredRateTableCallout.ADAPTER.encodedSizeWithTag(1, value.getCallout());
                if (value.getHeader() != null) {
                    size += MarginRateHeader.ADAPTER.encodedSizeWithTag(2, value.getHeader());
                }
                return size + ThemedColor.ADAPTER.encodedSizeWithTag(3, value.getHighlighted_background_color()) + ProtoAdapter.INT32.encodedSizeWithTag(4, value.getHighlighted_row_index()) + MarginRateRow.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getRates()) + MarginTieredHighlightRowStyle.ADAPTER.encodedSizeWithTag(6, value.getHighlighted_row_style());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginTieredInterestRates value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                MarginTieredRateTableCallout.ADAPTER.encodeWithTag(writer, 1, (int) value.getCallout());
                if (value.getHeader() != null) {
                    MarginRateHeader.ADAPTER.encodeWithTag(writer, 2, (int) value.getHeader());
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 3, (int) value.getHighlighted_background_color());
                ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) value.getHighlighted_row_index());
                MarginRateRow.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getRates());
                MarginTieredHighlightRowStyle.ADAPTER.encodeWithTag(writer, 6, (int) value.getHighlighted_row_style());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginTieredInterestRates value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                MarginTieredHighlightRowStyle.ADAPTER.encodeWithTag(writer, 6, (int) value.getHighlighted_row_style());
                MarginRateRow.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getRates());
                ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) value.getHighlighted_row_index());
                ThemedColor.ADAPTER.encodeWithTag(writer, 3, (int) value.getHighlighted_background_color());
                if (value.getHeader() != null) {
                    MarginRateHeader.ADAPTER.encodeWithTag(writer, 2, (int) value.getHeader());
                }
                MarginTieredRateTableCallout.ADAPTER.encodeWithTag(writer, 1, (int) value.getCallout());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginTieredInterestRates decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                MarginTieredRateTableCallout marginTieredRateTableCalloutDecode = null;
                MarginRateHeader marginRateHeaderDecode = null;
                ThemedColor themedColorDecode = null;
                Integer numDecode = null;
                MarginTieredHighlightRowStyle marginTieredHighlightRowStyleDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                marginTieredRateTableCalloutDecode = MarginTieredRateTableCallout.ADAPTER.decode(reader);
                                break;
                            case 2:
                                marginRateHeaderDecode = MarginRateHeader.ADAPTER.decode(reader);
                                break;
                            case 3:
                                themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 4:
                                numDecode = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 5:
                                arrayList.add(MarginRateRow.ADAPTER.decode(reader));
                                break;
                            case 6:
                                marginTieredHighlightRowStyleDecode = MarginTieredHighlightRowStyle.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new MarginTieredInterestRates(marginTieredRateTableCalloutDecode, marginRateHeaderDecode, themedColorDecode, numDecode, arrayList, marginTieredHighlightRowStyleDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginTieredInterestRates redact(MarginTieredInterestRates value) {
                Intrinsics.checkNotNullParameter(value, "value");
                MarginTieredRateTableCallout callout = value.getCallout();
                MarginTieredRateTableCallout marginTieredRateTableCalloutRedact = callout != null ? MarginTieredRateTableCallout.ADAPTER.redact(callout) : null;
                MarginRateHeader header = value.getHeader();
                MarginRateHeader marginRateHeaderRedact = header != null ? MarginRateHeader.ADAPTER.redact(header) : null;
                ThemedColor highlighted_background_color = value.getHighlighted_background_color();
                ThemedColor themedColorRedact = highlighted_background_color != null ? ThemedColor.ADAPTER.redact(highlighted_background_color) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getRates(), MarginRateRow.ADAPTER);
                MarginTieredHighlightRowStyle highlighted_row_style = value.getHighlighted_row_style();
                return MarginTieredInterestRates.copy$default(value, marginTieredRateTableCalloutRedact, marginRateHeaderRedact, themedColorRedact, null, listM26823redactElements, highlighted_row_style != null ? MarginTieredHighlightRowStyle.ADAPTER.redact(highlighted_row_style) : null, ByteString.EMPTY, 8, null);
            }
        };
    }
}
