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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: InvestmentsTrackerComponentStockCell.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JP\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentStockCell;", "Lcom/squareup/wire/Message;", "", "header", "", "subtitle", "amount", "share_amount", "instrument_type", "chart_stock_uuid", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getHeader", "()Ljava/lang/String;", "getSubtitle", "getAmount", "getShare_amount", "getInstrument_type", "getChart_stock_uuid", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentStockCell extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerComponentStockCell> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chartStockUuid", schemaIndex = 5, tag = 6)
    private final String chart_stock_uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentType", schemaIndex = 4, tag = 5)
    private final String instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "shareAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String share_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    public InvestmentsTrackerComponentStockCell() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ InvestmentsTrackerComponentStockCell(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8465newBuilder();
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getShare_amount() {
        return this.share_amount;
    }

    public final String getInstrument_type() {
        return this.instrument_type;
    }

    public final String getChart_stock_uuid() {
        return this.chart_stock_uuid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentStockCell(String header, String subtitle, String amount, String share_amount, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(share_amount, "share_amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.header = header;
        this.subtitle = subtitle;
        this.amount = amount;
        this.share_amount = share_amount;
        this.instrument_type = str;
        this.chart_stock_uuid = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8465newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerComponentStockCell)) {
            return false;
        }
        InvestmentsTrackerComponentStockCell investmentsTrackerComponentStockCell = (InvestmentsTrackerComponentStockCell) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerComponentStockCell.unknownFields()) && Intrinsics.areEqual(this.header, investmentsTrackerComponentStockCell.header) && Intrinsics.areEqual(this.subtitle, investmentsTrackerComponentStockCell.subtitle) && Intrinsics.areEqual(this.amount, investmentsTrackerComponentStockCell.amount) && Intrinsics.areEqual(this.share_amount, investmentsTrackerComponentStockCell.share_amount) && Intrinsics.areEqual(this.instrument_type, investmentsTrackerComponentStockCell.instrument_type) && Intrinsics.areEqual(this.chart_stock_uuid, investmentsTrackerComponentStockCell.chart_stock_uuid);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.header.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.amount.hashCode()) * 37) + this.share_amount.hashCode()) * 37;
        String str = this.instrument_type;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.chart_stock_uuid;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("header=" + Internal.sanitize(this.header));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("amount=" + Internal.sanitize(this.amount));
        arrayList.add("share_amount=" + Internal.sanitize(this.share_amount));
        String str = this.instrument_type;
        if (str != null) {
            arrayList.add("instrument_type=" + Internal.sanitize(str));
        }
        String str2 = this.chart_stock_uuid;
        if (str2 != null) {
            arrayList.add("chart_stock_uuid=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerComponentStockCell{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerComponentStockCell copy$default(InvestmentsTrackerComponentStockCell investmentsTrackerComponentStockCell, String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerComponentStockCell.header;
        }
        if ((i & 2) != 0) {
            str2 = investmentsTrackerComponentStockCell.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = investmentsTrackerComponentStockCell.amount;
        }
        if ((i & 8) != 0) {
            str4 = investmentsTrackerComponentStockCell.share_amount;
        }
        if ((i & 16) != 0) {
            str5 = investmentsTrackerComponentStockCell.instrument_type;
        }
        if ((i & 32) != 0) {
            str6 = investmentsTrackerComponentStockCell.chart_stock_uuid;
        }
        if ((i & 64) != 0) {
            byteString = investmentsTrackerComponentStockCell.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str5;
        String str9 = str3;
        return investmentsTrackerComponentStockCell.copy(str, str2, str9, str4, str8, str7, byteString2);
    }

    public final InvestmentsTrackerComponentStockCell copy(String header, String subtitle, String amount, String share_amount, String instrument_type, String chart_stock_uuid, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(share_amount, "share_amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerComponentStockCell(header, subtitle, amount, share_amount, instrument_type, chart_stock_uuid, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerComponentStockCell.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerComponentStockCell>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentStockCell$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerComponentStockCell value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHeader());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getShare_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getShare_amount());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(5, value.getInstrument_type()) + protoAdapter.encodedSizeWithTag(6, value.getChart_stock_uuid());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerComponentStockCell value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeader());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getShare_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getShare_amount());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getInstrument_type());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getChart_stock_uuid());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerComponentStockCell value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getChart_stock_uuid());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getInstrument_type());
                if (!Intrinsics.areEqual(value.getShare_amount(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getShare_amount());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getHeader(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getHeader());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentStockCell redact(InvestmentsTrackerComponentStockCell value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerComponentStockCell.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentStockCell decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = null;
                String strDecode5 = null;
                String strDecode6 = strDecode3;
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
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new InvestmentsTrackerComponentStockCell(strDecode, strDecode6, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
