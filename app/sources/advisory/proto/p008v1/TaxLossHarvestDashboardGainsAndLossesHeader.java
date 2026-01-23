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

/* compiled from: TaxLossHarvestDashboardGainsAndLossesHeader.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J2\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeader;", "Lcom/squareup/wire/Message;", "", "title", "", "info_icon", "info_bottom_sheet", "Ladvisory/proto/v1/BottomSheet;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/BottomSheet;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getInfo_icon", "getInfo_bottom_sheet", "()Ladvisory/proto/v1/BottomSheet;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TaxLossHarvestDashboardGainsAndLossesHeader extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLossHarvestDashboardGainsAndLossesHeader> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.BottomSheet#ADAPTER", jsonName = "infoBottomSheet", schemaIndex = 2, tag = 3)
    private final BottomSheet info_bottom_sheet;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "infoIcon", schemaIndex = 1, tag = 2)
    private final String info_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public TaxLossHarvestDashboardGainsAndLossesHeader() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4550newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ TaxLossHarvestDashboardGainsAndLossesHeader(String str, String str2, BottomSheet bottomSheet, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bottomSheet, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getInfo_icon() {
        return this.info_icon;
    }

    public final BottomSheet getInfo_bottom_sheet() {
        return this.info_bottom_sheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestDashboardGainsAndLossesHeader(String title, String str, BottomSheet bottomSheet, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.info_icon = str;
        this.info_bottom_sheet = bottomSheet;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4550newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLossHarvestDashboardGainsAndLossesHeader)) {
            return false;
        }
        TaxLossHarvestDashboardGainsAndLossesHeader taxLossHarvestDashboardGainsAndLossesHeader = (TaxLossHarvestDashboardGainsAndLossesHeader) other;
        return Intrinsics.areEqual(unknownFields(), taxLossHarvestDashboardGainsAndLossesHeader.unknownFields()) && Intrinsics.areEqual(this.title, taxLossHarvestDashboardGainsAndLossesHeader.title) && Intrinsics.areEqual(this.info_icon, taxLossHarvestDashboardGainsAndLossesHeader.info_icon) && Intrinsics.areEqual(this.info_bottom_sheet, taxLossHarvestDashboardGainsAndLossesHeader.info_bottom_sheet);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        String str = this.info_icon;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        BottomSheet bottomSheet = this.info_bottom_sheet;
        int iHashCode3 = iHashCode2 + (bottomSheet != null ? bottomSheet.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        String str = this.info_icon;
        if (str != null) {
            arrayList.add("info_icon=" + Internal.sanitize(str));
        }
        BottomSheet bottomSheet = this.info_bottom_sheet;
        if (bottomSheet != null) {
            arrayList.add("info_bottom_sheet=" + bottomSheet);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLossHarvestDashboardGainsAndLossesHeader{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLossHarvestDashboardGainsAndLossesHeader copy$default(TaxLossHarvestDashboardGainsAndLossesHeader taxLossHarvestDashboardGainsAndLossesHeader, String str, String str2, BottomSheet bottomSheet, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLossHarvestDashboardGainsAndLossesHeader.title;
        }
        if ((i & 2) != 0) {
            str2 = taxLossHarvestDashboardGainsAndLossesHeader.info_icon;
        }
        if ((i & 4) != 0) {
            bottomSheet = taxLossHarvestDashboardGainsAndLossesHeader.info_bottom_sheet;
        }
        if ((i & 8) != 0) {
            byteString = taxLossHarvestDashboardGainsAndLossesHeader.unknownFields();
        }
        return taxLossHarvestDashboardGainsAndLossesHeader.copy(str, str2, bottomSheet, byteString);
    }

    public final TaxLossHarvestDashboardGainsAndLossesHeader copy(String title, String info_icon, BottomSheet info_bottom_sheet, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLossHarvestDashboardGainsAndLossesHeader(title, info_icon, info_bottom_sheet, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLossHarvestDashboardGainsAndLossesHeader.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLossHarvestDashboardGainsAndLossesHeader>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.TaxLossHarvestDashboardGainsAndLossesHeader$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLossHarvestDashboardGainsAndLossesHeader value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getInfo_icon()) + BottomSheet.ADAPTER.encodedSizeWithTag(3, value.getInfo_bottom_sheet());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLossHarvestDashboardGainsAndLossesHeader value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInfo_icon());
                BottomSheet.ADAPTER.encodeWithTag(writer, 3, (int) value.getInfo_bottom_sheet());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLossHarvestDashboardGainsAndLossesHeader value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BottomSheet.ADAPTER.encodeWithTag(writer, 3, (int) value.getInfo_bottom_sheet());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getInfo_icon());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestDashboardGainsAndLossesHeader redact(TaxLossHarvestDashboardGainsAndLossesHeader value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BottomSheet info_bottom_sheet = value.getInfo_bottom_sheet();
                return TaxLossHarvestDashboardGainsAndLossesHeader.copy$default(value, null, null, info_bottom_sheet != null ? BottomSheet.ADAPTER.redact(info_bottom_sheet) : null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestDashboardGainsAndLossesHeader decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                BottomSheet bottomSheetDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TaxLossHarvestDashboardGainsAndLossesHeader(strDecode, strDecode2, bottomSheetDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        bottomSheetDecode = BottomSheet.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
