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

/* compiled from: TaxLossHarvestDashboardTimelineRow.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JF\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRow;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "is_completed", "", "should_show_info_icon", "info_bottom_sheet", "Ladvisory/proto/v1/BottomSheet;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLadvisory/proto/v1/BottomSheet;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Z", "getShould_show_info_icon", "getInfo_bottom_sheet", "()Ladvisory/proto/v1/BottomSheet;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TaxLossHarvestDashboardTimelineRow extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLossHarvestDashboardTimelineRow> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.BottomSheet#ADAPTER", jsonName = "infoBottomSheet", schemaIndex = 4, tag = 5)
    private final BottomSheet info_bottom_sheet;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isCompleted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_completed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "shouldShowInfoIcon", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean should_show_info_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public TaxLossHarvestDashboardTimelineRow() {
        this(null, null, false, false, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4556newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ TaxLossHarvestDashboardTimelineRow(String str, String str2, boolean z, boolean z2, BottomSheet bottomSheet, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : bottomSheet, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: is_completed, reason: from getter */
    public final boolean getIs_completed() {
        return this.is_completed;
    }

    public final boolean getShould_show_info_icon() {
        return this.should_show_info_icon;
    }

    public final BottomSheet getInfo_bottom_sheet() {
        return this.info_bottom_sheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestDashboardTimelineRow(String title, String str, boolean z, boolean z2, BottomSheet bottomSheet, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = str;
        this.is_completed = z;
        this.should_show_info_icon = z2;
        this.info_bottom_sheet = bottomSheet;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4556newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLossHarvestDashboardTimelineRow)) {
            return false;
        }
        TaxLossHarvestDashboardTimelineRow taxLossHarvestDashboardTimelineRow = (TaxLossHarvestDashboardTimelineRow) other;
        return Intrinsics.areEqual(unknownFields(), taxLossHarvestDashboardTimelineRow.unknownFields()) && Intrinsics.areEqual(this.title, taxLossHarvestDashboardTimelineRow.title) && Intrinsics.areEqual(this.subtitle, taxLossHarvestDashboardTimelineRow.subtitle) && this.is_completed == taxLossHarvestDashboardTimelineRow.is_completed && this.should_show_info_icon == taxLossHarvestDashboardTimelineRow.should_show_info_icon && Intrinsics.areEqual(this.info_bottom_sheet, taxLossHarvestDashboardTimelineRow.info_bottom_sheet);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        String str = this.subtitle;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_completed)) * 37) + Boolean.hashCode(this.should_show_info_icon)) * 37;
        BottomSheet bottomSheet = this.info_bottom_sheet;
        int iHashCode3 = iHashCode2 + (bottomSheet != null ? bottomSheet.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        String str = this.subtitle;
        if (str != null) {
            arrayList.add("subtitle=" + Internal.sanitize(str));
        }
        arrayList.add("is_completed=" + this.is_completed);
        arrayList.add("should_show_info_icon=" + this.should_show_info_icon);
        BottomSheet bottomSheet = this.info_bottom_sheet;
        if (bottomSheet != null) {
            arrayList.add("info_bottom_sheet=" + bottomSheet);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLossHarvestDashboardTimelineRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLossHarvestDashboardTimelineRow copy$default(TaxLossHarvestDashboardTimelineRow taxLossHarvestDashboardTimelineRow, String str, String str2, boolean z, boolean z2, BottomSheet bottomSheet, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLossHarvestDashboardTimelineRow.title;
        }
        if ((i & 2) != 0) {
            str2 = taxLossHarvestDashboardTimelineRow.subtitle;
        }
        if ((i & 4) != 0) {
            z = taxLossHarvestDashboardTimelineRow.is_completed;
        }
        if ((i & 8) != 0) {
            z2 = taxLossHarvestDashboardTimelineRow.should_show_info_icon;
        }
        if ((i & 16) != 0) {
            bottomSheet = taxLossHarvestDashboardTimelineRow.info_bottom_sheet;
        }
        if ((i & 32) != 0) {
            byteString = taxLossHarvestDashboardTimelineRow.unknownFields();
        }
        BottomSheet bottomSheet2 = bottomSheet;
        ByteString byteString2 = byteString;
        return taxLossHarvestDashboardTimelineRow.copy(str, str2, z, z2, bottomSheet2, byteString2);
    }

    public final TaxLossHarvestDashboardTimelineRow copy(String title, String subtitle, boolean is_completed, boolean should_show_info_icon, BottomSheet info_bottom_sheet, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLossHarvestDashboardTimelineRow(title, subtitle, is_completed, should_show_info_icon, info_bottom_sheet, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLossHarvestDashboardTimelineRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLossHarvestDashboardTimelineRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.TaxLossHarvestDashboardTimelineRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLossHarvestDashboardTimelineRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                if (value.getIs_completed()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_completed()));
                }
                if (value.getShould_show_info_icon()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getShould_show_info_icon()));
                }
                return iEncodedSizeWithTag + BottomSheet.ADAPTER.encodedSizeWithTag(5, value.getInfo_bottom_sheet());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLossHarvestDashboardTimelineRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                if (value.getIs_completed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_completed()));
                }
                if (value.getShould_show_info_icon()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getShould_show_info_icon()));
                }
                BottomSheet.ADAPTER.encodeWithTag(writer, 5, (int) value.getInfo_bottom_sheet());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLossHarvestDashboardTimelineRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BottomSheet.ADAPTER.encodeWithTag(writer, 5, (int) value.getInfo_bottom_sheet());
                if (value.getShould_show_info_icon()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getShould_show_info_icon()));
                }
                if (value.getIs_completed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_completed()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestDashboardTimelineRow redact(TaxLossHarvestDashboardTimelineRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BottomSheet info_bottom_sheet = value.getInfo_bottom_sheet();
                return TaxLossHarvestDashboardTimelineRow.copy$default(value, null, null, false, false, info_bottom_sheet != null ? BottomSheet.ADAPTER.redact(info_bottom_sheet) : null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestDashboardTimelineRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                BottomSheet bottomSheetDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TaxLossHarvestDashboardTimelineRow(strDecode, strDecode2, zBooleanValue, zBooleanValue2, bottomSheetDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 4) {
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 5) {
                        bottomSheetDecode = BottomSheet.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
