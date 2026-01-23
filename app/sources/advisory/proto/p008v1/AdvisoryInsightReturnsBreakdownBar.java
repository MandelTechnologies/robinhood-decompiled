package advisory.proto.p008v1;

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

/* compiled from: AdvisoryInsightReturnsBreakdownBar.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightReturnsBreakdownBar;", "Lcom/squareup/wire/Message;", "", "symbol", "", "percentage_change", "bar_type", "Ladvisory/proto/v1/ReturnsBreakdownBarType;", "formatted_percentage_change", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/ReturnsBreakdownBarType;Ljava/lang/String;Lokio/ByteString;)V", "getSymbol", "()Ljava/lang/String;", "getPercentage_change", "getBar_type", "()Ladvisory/proto/v1/ReturnsBreakdownBarType;", "getFormatted_percentage_change", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AdvisoryInsightReturnsBreakdownBar extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisoryInsightReturnsBreakdownBar> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.ReturnsBreakdownBarType#ADAPTER", jsonName = "barType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ReturnsBreakdownBarType bar_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "formattedPercentageChange", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String formatted_percentage_change;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "percentageChange", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String percentage_change;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String symbol;

    public AdvisoryInsightReturnsBreakdownBar() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ AdvisoryInsightReturnsBreakdownBar(String str, String str2, ReturnsBreakdownBarType returnsBreakdownBarType, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ReturnsBreakdownBarType.RETURNS_BREAKDOWN_BAR_TYPE_UNSPECIFIED : returnsBreakdownBarType, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4401newBuilder();
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getPercentage_change() {
        return this.percentage_change;
    }

    public final ReturnsBreakdownBarType getBar_type() {
        return this.bar_type;
    }

    public final String getFormatted_percentage_change() {
        return this.formatted_percentage_change;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightReturnsBreakdownBar(String symbol, String percentage_change, ReturnsBreakdownBarType bar_type, String formatted_percentage_change, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(percentage_change, "percentage_change");
        Intrinsics.checkNotNullParameter(bar_type, "bar_type");
        Intrinsics.checkNotNullParameter(formatted_percentage_change, "formatted_percentage_change");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.symbol = symbol;
        this.percentage_change = percentage_change;
        this.bar_type = bar_type;
        this.formatted_percentage_change = formatted_percentage_change;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4401newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisoryInsightReturnsBreakdownBar)) {
            return false;
        }
        AdvisoryInsightReturnsBreakdownBar advisoryInsightReturnsBreakdownBar = (AdvisoryInsightReturnsBreakdownBar) other;
        return Intrinsics.areEqual(unknownFields(), advisoryInsightReturnsBreakdownBar.unknownFields()) && Intrinsics.areEqual(this.symbol, advisoryInsightReturnsBreakdownBar.symbol) && Intrinsics.areEqual(this.percentage_change, advisoryInsightReturnsBreakdownBar.percentage_change) && this.bar_type == advisoryInsightReturnsBreakdownBar.bar_type && Intrinsics.areEqual(this.formatted_percentage_change, advisoryInsightReturnsBreakdownBar.formatted_percentage_change);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.symbol.hashCode()) * 37) + this.percentage_change.hashCode()) * 37) + this.bar_type.hashCode()) * 37) + this.formatted_percentage_change.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("percentage_change=" + Internal.sanitize(this.percentage_change));
        arrayList.add("bar_type=" + this.bar_type);
        arrayList.add("formatted_percentage_change=" + Internal.sanitize(this.formatted_percentage_change));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisoryInsightReturnsBreakdownBar{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisoryInsightReturnsBreakdownBar copy$default(AdvisoryInsightReturnsBreakdownBar advisoryInsightReturnsBreakdownBar, String str, String str2, ReturnsBreakdownBarType returnsBreakdownBarType, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryInsightReturnsBreakdownBar.symbol;
        }
        if ((i & 2) != 0) {
            str2 = advisoryInsightReturnsBreakdownBar.percentage_change;
        }
        if ((i & 4) != 0) {
            returnsBreakdownBarType = advisoryInsightReturnsBreakdownBar.bar_type;
        }
        if ((i & 8) != 0) {
            str3 = advisoryInsightReturnsBreakdownBar.formatted_percentage_change;
        }
        if ((i & 16) != 0) {
            byteString = advisoryInsightReturnsBreakdownBar.unknownFields();
        }
        ByteString byteString2 = byteString;
        ReturnsBreakdownBarType returnsBreakdownBarType2 = returnsBreakdownBarType;
        return advisoryInsightReturnsBreakdownBar.copy(str, str2, returnsBreakdownBarType2, str3, byteString2);
    }

    public final AdvisoryInsightReturnsBreakdownBar copy(String symbol, String percentage_change, ReturnsBreakdownBarType bar_type, String formatted_percentage_change, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(percentage_change, "percentage_change");
        Intrinsics.checkNotNullParameter(bar_type, "bar_type");
        Intrinsics.checkNotNullParameter(formatted_percentage_change, "formatted_percentage_change");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisoryInsightReturnsBreakdownBar(symbol, percentage_change, bar_type, formatted_percentage_change, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisoryInsightReturnsBreakdownBar.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisoryInsightReturnsBreakdownBar>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.AdvisoryInsightReturnsBreakdownBar$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisoryInsightReturnsBreakdownBar value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getPercentage_change(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPercentage_change());
                }
                if (value.getBar_type() != ReturnsBreakdownBarType.RETURNS_BREAKDOWN_BAR_TYPE_UNSPECIFIED) {
                    size += ReturnsBreakdownBarType.ADAPTER.encodedSizeWithTag(3, value.getBar_type());
                }
                return !Intrinsics.areEqual(value.getFormatted_percentage_change(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getFormatted_percentage_change()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisoryInsightReturnsBreakdownBar value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getPercentage_change(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPercentage_change());
                }
                if (value.getBar_type() != ReturnsBreakdownBarType.RETURNS_BREAKDOWN_BAR_TYPE_UNSPECIFIED) {
                    ReturnsBreakdownBarType.ADAPTER.encodeWithTag(writer, 3, (int) value.getBar_type());
                }
                if (!Intrinsics.areEqual(value.getFormatted_percentage_change(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getFormatted_percentage_change());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisoryInsightReturnsBreakdownBar value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFormatted_percentage_change(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getFormatted_percentage_change());
                }
                if (value.getBar_type() != ReturnsBreakdownBarType.RETURNS_BREAKDOWN_BAR_TYPE_UNSPECIFIED) {
                    ReturnsBreakdownBarType.ADAPTER.encodeWithTag(writer, 3, (int) value.getBar_type());
                }
                if (!Intrinsics.areEqual(value.getPercentage_change(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPercentage_change());
                }
                if (Intrinsics.areEqual(value.getSymbol(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSymbol());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightReturnsBreakdownBar decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ReturnsBreakdownBarType returnsBreakdownBarTypeDecode = ReturnsBreakdownBarType.RETURNS_BREAKDOWN_BAR_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    ReturnsBreakdownBarType returnsBreakdownBarType = returnsBreakdownBarTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new AdvisoryInsightReturnsBreakdownBar(strDecode, strDecode2, returnsBreakdownBarType, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                returnsBreakdownBarTypeDecode = ReturnsBreakdownBarType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisoryInsightReturnsBreakdownBar redact(AdvisoryInsightReturnsBreakdownBar value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AdvisoryInsightReturnsBreakdownBar.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
