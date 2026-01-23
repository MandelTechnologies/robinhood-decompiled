package bff_money_movement.service.p019v1;

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

/* compiled from: InvestmentsTrackerCategorySectionDetails.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001e\u001a\u00020\u0002H\u0017J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\u0004H\u0016Jf\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionDetails;", "Lcom/squareup/wire/Message;", "", "header_text", "", "header_subtitle", "amount", "percentage", "row_display_minimum", "", "rows", "", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetails;", "dot_color_light", "dot_color_dark", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getHeader_text", "()Ljava/lang/String;", "getHeader_subtitle", "getAmount", "getPercentage", "getRow_display_minimum", "()I", "getDot_color_light", "getDot_color_dark", "getRows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerCategorySectionDetails extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerCategorySectionDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dotColorDark", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String dot_color_dark;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dotColorLight", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String dot_color_light;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "headerSubtitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String header_subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "headerText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String header_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "rowDisplayMinimum", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int row_display_minimum;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerCategorySectionRowDetails#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<InvestmentsTrackerCategorySectionRowDetails> rows;

    public InvestmentsTrackerCategorySectionDetails() {
        this(null, null, null, null, 0, null, null, null, null, 511, null);
    }

    public /* synthetic */ InvestmentsTrackerCategorySectionDetails(String str, String str2, String str3, String str4, int i, List list, String str5, String str6, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8445newBuilder();
    }

    public final String getHeader_text() {
        return this.header_text;
    }

    public final String getHeader_subtitle() {
        return this.header_subtitle;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getPercentage() {
        return this.percentage;
    }

    public final int getRow_display_minimum() {
        return this.row_display_minimum;
    }

    public final String getDot_color_light() {
        return this.dot_color_light;
    }

    public final String getDot_color_dark() {
        return this.dot_color_dark;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerCategorySectionDetails(String header_text, String header_subtitle, String amount, String percentage, int i, List<InvestmentsTrackerCategorySectionRowDetails> rows, String dot_color_light, String dot_color_dark, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(header_text, "header_text");
        Intrinsics.checkNotNullParameter(header_subtitle, "header_subtitle");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(dot_color_light, "dot_color_light");
        Intrinsics.checkNotNullParameter(dot_color_dark, "dot_color_dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.header_text = header_text;
        this.header_subtitle = header_subtitle;
        this.amount = amount;
        this.percentage = percentage;
        this.row_display_minimum = i;
        this.dot_color_light = dot_color_light;
        this.dot_color_dark = dot_color_dark;
        this.rows = Internal.immutableCopyOf("rows", rows);
    }

    public final List<InvestmentsTrackerCategorySectionRowDetails> getRows() {
        return this.rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8445newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerCategorySectionDetails)) {
            return false;
        }
        InvestmentsTrackerCategorySectionDetails investmentsTrackerCategorySectionDetails = (InvestmentsTrackerCategorySectionDetails) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerCategorySectionDetails.unknownFields()) && Intrinsics.areEqual(this.header_text, investmentsTrackerCategorySectionDetails.header_text) && Intrinsics.areEqual(this.header_subtitle, investmentsTrackerCategorySectionDetails.header_subtitle) && Intrinsics.areEqual(this.amount, investmentsTrackerCategorySectionDetails.amount) && Intrinsics.areEqual(this.percentage, investmentsTrackerCategorySectionDetails.percentage) && this.row_display_minimum == investmentsTrackerCategorySectionDetails.row_display_minimum && Intrinsics.areEqual(this.rows, investmentsTrackerCategorySectionDetails.rows) && Intrinsics.areEqual(this.dot_color_light, investmentsTrackerCategorySectionDetails.dot_color_light) && Intrinsics.areEqual(this.dot_color_dark, investmentsTrackerCategorySectionDetails.dot_color_dark);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((unknownFields().hashCode() * 37) + this.header_text.hashCode()) * 37) + this.header_subtitle.hashCode()) * 37) + this.amount.hashCode()) * 37) + this.percentage.hashCode()) * 37) + Integer.hashCode(this.row_display_minimum)) * 37) + this.rows.hashCode()) * 37) + this.dot_color_light.hashCode()) * 37) + this.dot_color_dark.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("header_text=" + Internal.sanitize(this.header_text));
        arrayList.add("header_subtitle=" + Internal.sanitize(this.header_subtitle));
        arrayList.add("amount=" + Internal.sanitize(this.amount));
        arrayList.add("percentage=" + Internal.sanitize(this.percentage));
        arrayList.add("row_display_minimum=" + this.row_display_minimum);
        if (!this.rows.isEmpty()) {
            arrayList.add("rows=" + this.rows);
        }
        arrayList.add("dot_color_light=" + Internal.sanitize(this.dot_color_light));
        arrayList.add("dot_color_dark=" + Internal.sanitize(this.dot_color_dark));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerCategorySectionDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerCategorySectionDetails copy$default(InvestmentsTrackerCategorySectionDetails investmentsTrackerCategorySectionDetails, String str, String str2, String str3, String str4, int i, List list, String str5, String str6, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = investmentsTrackerCategorySectionDetails.header_text;
        }
        if ((i2 & 2) != 0) {
            str2 = investmentsTrackerCategorySectionDetails.header_subtitle;
        }
        if ((i2 & 4) != 0) {
            str3 = investmentsTrackerCategorySectionDetails.amount;
        }
        if ((i2 & 8) != 0) {
            str4 = investmentsTrackerCategorySectionDetails.percentage;
        }
        if ((i2 & 16) != 0) {
            i = investmentsTrackerCategorySectionDetails.row_display_minimum;
        }
        if ((i2 & 32) != 0) {
            list = investmentsTrackerCategorySectionDetails.rows;
        }
        if ((i2 & 64) != 0) {
            str5 = investmentsTrackerCategorySectionDetails.dot_color_light;
        }
        if ((i2 & 128) != 0) {
            str6 = investmentsTrackerCategorySectionDetails.dot_color_dark;
        }
        if ((i2 & 256) != 0) {
            byteString = investmentsTrackerCategorySectionDetails.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        List list2 = list;
        String str8 = str5;
        int i3 = i;
        String str9 = str3;
        return investmentsTrackerCategorySectionDetails.copy(str, str2, str9, str4, i3, list2, str8, str7, byteString2);
    }

    public final InvestmentsTrackerCategorySectionDetails copy(String header_text, String header_subtitle, String amount, String percentage, int row_display_minimum, List<InvestmentsTrackerCategorySectionRowDetails> rows, String dot_color_light, String dot_color_dark, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(header_text, "header_text");
        Intrinsics.checkNotNullParameter(header_subtitle, "header_subtitle");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(dot_color_light, "dot_color_light");
        Intrinsics.checkNotNullParameter(dot_color_dark, "dot_color_dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerCategorySectionDetails(header_text, header_subtitle, amount, percentage, row_display_minimum, rows, dot_color_light, dot_color_dark, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerCategorySectionDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerCategorySectionDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerCategorySectionDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerCategorySectionDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHeader_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHeader_text());
                }
                if (!Intrinsics.areEqual(value.getHeader_subtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getHeader_subtitle());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getPercentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getPercentage());
                }
                if (value.getRow_display_minimum() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getRow_display_minimum()));
                }
                int iEncodedSizeWithTag = size + InvestmentsTrackerCategorySectionRowDetails.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getRows());
                if (!Intrinsics.areEqual(value.getDot_color_light(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getDot_color_light());
                }
                return !Intrinsics.areEqual(value.getDot_color_dark(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(8, value.getDot_color_dark()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerCategorySectionDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHeader_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeader_text());
                }
                if (!Intrinsics.areEqual(value.getHeader_subtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHeader_subtitle());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getPercentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPercentage());
                }
                if (value.getRow_display_minimum() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getRow_display_minimum()));
                }
                InvestmentsTrackerCategorySectionRowDetails.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getRows());
                if (!Intrinsics.areEqual(value.getDot_color_light(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getDot_color_light());
                }
                if (!Intrinsics.areEqual(value.getDot_color_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getDot_color_dark());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerCategorySectionDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDot_color_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getDot_color_dark());
                }
                if (!Intrinsics.areEqual(value.getDot_color_light(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getDot_color_light());
                }
                InvestmentsTrackerCategorySectionRowDetails.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getRows());
                if (value.getRow_display_minimum() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getRow_display_minimum()));
                }
                if (!Intrinsics.areEqual(value.getPercentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPercentage());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getHeader_subtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHeader_subtitle());
                }
                if (Intrinsics.areEqual(value.getHeader_text(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeader_text());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerCategorySectionDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                int iIntValue = 0;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 6:
                                arrayList.add(InvestmentsTrackerCategorySectionRowDetails.ADAPTER.decode(reader));
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new InvestmentsTrackerCategorySectionDetails(strDecode, strDecode6, strDecode2, strDecode3, iIntValue, arrayList, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerCategorySectionDetails redact(InvestmentsTrackerCategorySectionDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerCategorySectionDetails.copy$default(value, null, null, null, null, 0, Internal.m26823redactElements(value.getRows(), InvestmentsTrackerCategorySectionRowDetails.ADAPTER), null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
            }
        };
    }
}
