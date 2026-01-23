package advisory.portfolio_reveal.proto.p007v1;

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

/* compiled from: PortfolioRevealAssetClassRow.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassRow;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "allocation_percentage", "breakdown", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdown;", "row_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdown;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAllocation_percentage", "getBreakdown", "()Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdown;", "getRow_identifier", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class PortfolioRevealAssetClassRow extends Message {

    @JvmField
    public static final ProtoAdapter<PortfolioRevealAssetClassRow> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "allocationPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String allocation_percentage;

    @WireField(adapter = "advisory.portfolio_reveal.proto.v1.PortfolioRevealAssetClassBreakdown#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final PortfolioRevealAssetClassBreakdown breakdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rowIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String row_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public PortfolioRevealAssetClassRow() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ PortfolioRevealAssetClassRow(String str, String str2, String str3, PortfolioRevealAssetClassBreakdown portfolioRevealAssetClassBreakdown, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : portfolioRevealAssetClassBreakdown, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4366newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getAllocation_percentage() {
        return this.allocation_percentage;
    }

    public final PortfolioRevealAssetClassBreakdown getBreakdown() {
        return this.breakdown;
    }

    public final String getRow_identifier() {
        return this.row_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioRevealAssetClassRow(String title, String subtitle, String allocation_percentage, PortfolioRevealAssetClassBreakdown portfolioRevealAssetClassBreakdown, String row_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(allocation_percentage, "allocation_percentage");
        Intrinsics.checkNotNullParameter(row_identifier, "row_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.allocation_percentage = allocation_percentage;
        this.breakdown = portfolioRevealAssetClassBreakdown;
        this.row_identifier = row_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4366newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PortfolioRevealAssetClassRow)) {
            return false;
        }
        PortfolioRevealAssetClassRow portfolioRevealAssetClassRow = (PortfolioRevealAssetClassRow) other;
        return Intrinsics.areEqual(unknownFields(), portfolioRevealAssetClassRow.unknownFields()) && Intrinsics.areEqual(this.title, portfolioRevealAssetClassRow.title) && Intrinsics.areEqual(this.subtitle, portfolioRevealAssetClassRow.subtitle) && Intrinsics.areEqual(this.allocation_percentage, portfolioRevealAssetClassRow.allocation_percentage) && Intrinsics.areEqual(this.breakdown, portfolioRevealAssetClassRow.breakdown) && Intrinsics.areEqual(this.row_identifier, portfolioRevealAssetClassRow.row_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.allocation_percentage.hashCode()) * 37;
        PortfolioRevealAssetClassBreakdown portfolioRevealAssetClassBreakdown = this.breakdown;
        int iHashCode2 = ((iHashCode + (portfolioRevealAssetClassBreakdown != null ? portfolioRevealAssetClassBreakdown.hashCode() : 0)) * 37) + this.row_identifier.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("allocation_percentage=" + Internal.sanitize(this.allocation_percentage));
        PortfolioRevealAssetClassBreakdown portfolioRevealAssetClassBreakdown = this.breakdown;
        if (portfolioRevealAssetClassBreakdown != null) {
            arrayList.add("breakdown=" + portfolioRevealAssetClassBreakdown);
        }
        arrayList.add("row_identifier=" + Internal.sanitize(this.row_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioRevealAssetClassRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PortfolioRevealAssetClassRow copy$default(PortfolioRevealAssetClassRow portfolioRevealAssetClassRow, String str, String str2, String str3, PortfolioRevealAssetClassBreakdown portfolioRevealAssetClassBreakdown, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = portfolioRevealAssetClassRow.title;
        }
        if ((i & 2) != 0) {
            str2 = portfolioRevealAssetClassRow.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = portfolioRevealAssetClassRow.allocation_percentage;
        }
        if ((i & 8) != 0) {
            portfolioRevealAssetClassBreakdown = portfolioRevealAssetClassRow.breakdown;
        }
        if ((i & 16) != 0) {
            str4 = portfolioRevealAssetClassRow.row_identifier;
        }
        if ((i & 32) != 0) {
            byteString = portfolioRevealAssetClassRow.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return portfolioRevealAssetClassRow.copy(str, str2, str3, portfolioRevealAssetClassBreakdown, str5, byteString2);
    }

    public final PortfolioRevealAssetClassRow copy(String title, String subtitle, String allocation_percentage, PortfolioRevealAssetClassBreakdown breakdown, String row_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(allocation_percentage, "allocation_percentage");
        Intrinsics.checkNotNullParameter(row_identifier, "row_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PortfolioRevealAssetClassRow(title, subtitle, allocation_percentage, breakdown, row_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioRevealAssetClassRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PortfolioRevealAssetClassRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.portfolio_reveal.proto.v1.PortfolioRevealAssetClassRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PortfolioRevealAssetClassRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getAllocation_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAllocation_percentage());
                }
                if (value.getBreakdown() != null) {
                    size += PortfolioRevealAssetClassBreakdown.ADAPTER.encodedSizeWithTag(4, value.getBreakdown());
                }
                return !Intrinsics.areEqual(value.getRow_identifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getRow_identifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PortfolioRevealAssetClassRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getAllocation_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAllocation_percentage());
                }
                if (value.getBreakdown() != null) {
                    PortfolioRevealAssetClassBreakdown.ADAPTER.encodeWithTag(writer, 4, (int) value.getBreakdown());
                }
                if (!Intrinsics.areEqual(value.getRow_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRow_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PortfolioRevealAssetClassRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRow_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRow_identifier());
                }
                if (value.getBreakdown() != null) {
                    PortfolioRevealAssetClassBreakdown.ADAPTER.encodeWithTag(writer, 4, (int) value.getBreakdown());
                }
                if (!Intrinsics.areEqual(value.getAllocation_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAllocation_percentage());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioRevealAssetClassRow redact(PortfolioRevealAssetClassRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PortfolioRevealAssetClassBreakdown breakdown = value.getBreakdown();
                return PortfolioRevealAssetClassRow.copy$default(value, null, null, null, breakdown != null ? PortfolioRevealAssetClassBreakdown.ADAPTER.redact(breakdown) : null, null, ByteString.EMPTY, 23, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioRevealAssetClassRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                PortfolioRevealAssetClassBreakdown portfolioRevealAssetClassBreakdownDecode = null;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PortfolioRevealAssetClassRow(strDecode, strDecode4, strDecode2, portfolioRevealAssetClassBreakdownDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        portfolioRevealAssetClassBreakdownDecode = PortfolioRevealAssetClassBreakdown.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
