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

/* compiled from: PortfolioRevealAssetClassBreakdownRow.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassBreakdownRow;", "Lcom/squareup/wire/Message;", "", "title", "", "description", "allocation_percentage", "row_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getAllocation_percentage", "getRow_identifier", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class PortfolioRevealAssetClassBreakdownRow extends Message {

    @JvmField
    public static final ProtoAdapter<PortfolioRevealAssetClassBreakdownRow> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "allocationPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String allocation_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rowIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String row_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public PortfolioRevealAssetClassBreakdownRow() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ PortfolioRevealAssetClassBreakdownRow(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4362newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getAllocation_percentage() {
        return this.allocation_percentage;
    }

    public final String getRow_identifier() {
        return this.row_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioRevealAssetClassBreakdownRow(String title, String description, String allocation_percentage, String row_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(allocation_percentage, "allocation_percentage");
        Intrinsics.checkNotNullParameter(row_identifier, "row_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description = description;
        this.allocation_percentage = allocation_percentage;
        this.row_identifier = row_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4362newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PortfolioRevealAssetClassBreakdownRow)) {
            return false;
        }
        PortfolioRevealAssetClassBreakdownRow portfolioRevealAssetClassBreakdownRow = (PortfolioRevealAssetClassBreakdownRow) other;
        return Intrinsics.areEqual(unknownFields(), portfolioRevealAssetClassBreakdownRow.unknownFields()) && Intrinsics.areEqual(this.title, portfolioRevealAssetClassBreakdownRow.title) && Intrinsics.areEqual(this.description, portfolioRevealAssetClassBreakdownRow.description) && Intrinsics.areEqual(this.allocation_percentage, portfolioRevealAssetClassBreakdownRow.allocation_percentage) && Intrinsics.areEqual(this.row_identifier, portfolioRevealAssetClassBreakdownRow.row_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37) + this.allocation_percentage.hashCode()) * 37) + this.row_identifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("allocation_percentage=" + Internal.sanitize(this.allocation_percentage));
        arrayList.add("row_identifier=" + Internal.sanitize(this.row_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioRevealAssetClassBreakdownRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PortfolioRevealAssetClassBreakdownRow copy$default(PortfolioRevealAssetClassBreakdownRow portfolioRevealAssetClassBreakdownRow, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = portfolioRevealAssetClassBreakdownRow.title;
        }
        if ((i & 2) != 0) {
            str2 = portfolioRevealAssetClassBreakdownRow.description;
        }
        if ((i & 4) != 0) {
            str3 = portfolioRevealAssetClassBreakdownRow.allocation_percentage;
        }
        if ((i & 8) != 0) {
            str4 = portfolioRevealAssetClassBreakdownRow.row_identifier;
        }
        if ((i & 16) != 0) {
            byteString = portfolioRevealAssetClassBreakdownRow.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return portfolioRevealAssetClassBreakdownRow.copy(str, str2, str5, str4, byteString2);
    }

    public final PortfolioRevealAssetClassBreakdownRow copy(String title, String description, String allocation_percentage, String row_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(allocation_percentage, "allocation_percentage");
        Intrinsics.checkNotNullParameter(row_identifier, "row_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PortfolioRevealAssetClassBreakdownRow(title, description, allocation_percentage, row_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioRevealAssetClassBreakdownRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PortfolioRevealAssetClassBreakdownRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.portfolio_reveal.proto.v1.PortfolioRevealAssetClassBreakdownRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PortfolioRevealAssetClassBreakdownRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getAllocation_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAllocation_percentage());
                }
                return !Intrinsics.areEqual(value.getRow_identifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRow_identifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PortfolioRevealAssetClassBreakdownRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getAllocation_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAllocation_percentage());
                }
                if (!Intrinsics.areEqual(value.getRow_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRow_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PortfolioRevealAssetClassBreakdownRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRow_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRow_identifier());
                }
                if (!Intrinsics.areEqual(value.getAllocation_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAllocation_percentage());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioRevealAssetClassBreakdownRow redact(PortfolioRevealAssetClassBreakdownRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PortfolioRevealAssetClassBreakdownRow.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioRevealAssetClassBreakdownRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PortfolioRevealAssetClassBreakdownRow(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
