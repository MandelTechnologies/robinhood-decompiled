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

/* compiled from: InvestmentsTrackerComponentMetadataDetailsRow.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRow;", "Lcom/squareup/wire/Message;", "", "left_text", "", "right_text", "id", "bottom_left_text", "deeplink", "disconnected_data", "Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedData;Lokio/ByteString;)V", "getLeft_text", "()Ljava/lang/String;", "getRight_text", "getId", "getBottom_left_text", "getDeeplink", "getDisconnected_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedData;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentMetadataDetailsRow extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerComponentMetadataDetailsRow> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bottomLeftText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String bottom_left_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String deeplink;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerDisconnectedData#ADAPTER", jsonName = "disconnectedData", schemaIndex = 5, tag = 6)
    private final InvestmentsTrackerDisconnectedData disconnected_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "leftText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String left_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rightText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String right_text;

    public InvestmentsTrackerComponentMetadataDetailsRow() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ InvestmentsTrackerComponentMetadataDetailsRow(String str, String str2, String str3, String str4, String str5, InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : investmentsTrackerDisconnectedData, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8461newBuilder();
    }

    public final String getLeft_text() {
        return this.left_text;
    }

    public final String getRight_text() {
        return this.right_text;
    }

    public final String getId() {
        return this.id;
    }

    public final String getBottom_left_text() {
        return this.bottom_left_text;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final InvestmentsTrackerDisconnectedData getDisconnected_data() {
        return this.disconnected_data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentMetadataDetailsRow(String left_text, String right_text, String id, String bottom_left_text, String deeplink, InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(left_text, "left_text");
        Intrinsics.checkNotNullParameter(right_text, "right_text");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(bottom_left_text, "bottom_left_text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.left_text = left_text;
        this.right_text = right_text;
        this.id = id;
        this.bottom_left_text = bottom_left_text;
        this.deeplink = deeplink;
        this.disconnected_data = investmentsTrackerDisconnectedData;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8461newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerComponentMetadataDetailsRow)) {
            return false;
        }
        InvestmentsTrackerComponentMetadataDetailsRow investmentsTrackerComponentMetadataDetailsRow = (InvestmentsTrackerComponentMetadataDetailsRow) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerComponentMetadataDetailsRow.unknownFields()) && Intrinsics.areEqual(this.left_text, investmentsTrackerComponentMetadataDetailsRow.left_text) && Intrinsics.areEqual(this.right_text, investmentsTrackerComponentMetadataDetailsRow.right_text) && Intrinsics.areEqual(this.id, investmentsTrackerComponentMetadataDetailsRow.id) && Intrinsics.areEqual(this.bottom_left_text, investmentsTrackerComponentMetadataDetailsRow.bottom_left_text) && Intrinsics.areEqual(this.deeplink, investmentsTrackerComponentMetadataDetailsRow.deeplink) && Intrinsics.areEqual(this.disconnected_data, investmentsTrackerComponentMetadataDetailsRow.disconnected_data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.left_text.hashCode()) * 37) + this.right_text.hashCode()) * 37) + this.id.hashCode()) * 37) + this.bottom_left_text.hashCode()) * 37) + this.deeplink.hashCode()) * 37;
        InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData = this.disconnected_data;
        int iHashCode2 = iHashCode + (investmentsTrackerDisconnectedData != null ? investmentsTrackerDisconnectedData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("left_text=" + Internal.sanitize(this.left_text));
        arrayList.add("right_text=" + Internal.sanitize(this.right_text));
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("bottom_left_text=" + Internal.sanitize(this.bottom_left_text));
        arrayList.add("deeplink=" + Internal.sanitize(this.deeplink));
        InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData = this.disconnected_data;
        if (investmentsTrackerDisconnectedData != null) {
            arrayList.add("disconnected_data=" + investmentsTrackerDisconnectedData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerComponentMetadataDetailsRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerComponentMetadataDetailsRow copy$default(InvestmentsTrackerComponentMetadataDetailsRow investmentsTrackerComponentMetadataDetailsRow, String str, String str2, String str3, String str4, String str5, InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerComponentMetadataDetailsRow.left_text;
        }
        if ((i & 2) != 0) {
            str2 = investmentsTrackerComponentMetadataDetailsRow.right_text;
        }
        if ((i & 4) != 0) {
            str3 = investmentsTrackerComponentMetadataDetailsRow.id;
        }
        if ((i & 8) != 0) {
            str4 = investmentsTrackerComponentMetadataDetailsRow.bottom_left_text;
        }
        if ((i & 16) != 0) {
            str5 = investmentsTrackerComponentMetadataDetailsRow.deeplink;
        }
        if ((i & 32) != 0) {
            investmentsTrackerDisconnectedData = investmentsTrackerComponentMetadataDetailsRow.disconnected_data;
        }
        if ((i & 64) != 0) {
            byteString = investmentsTrackerComponentMetadataDetailsRow.unknownFields();
        }
        InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData2 = investmentsTrackerDisconnectedData;
        ByteString byteString2 = byteString;
        String str6 = str5;
        String str7 = str3;
        return investmentsTrackerComponentMetadataDetailsRow.copy(str, str2, str7, str4, str6, investmentsTrackerDisconnectedData2, byteString2);
    }

    public final InvestmentsTrackerComponentMetadataDetailsRow copy(String left_text, String right_text, String id, String bottom_left_text, String deeplink, InvestmentsTrackerDisconnectedData disconnected_data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(left_text, "left_text");
        Intrinsics.checkNotNullParameter(right_text, "right_text");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(bottom_left_text, "bottom_left_text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerComponentMetadataDetailsRow(left_text, right_text, id, bottom_left_text, deeplink, disconnected_data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerComponentMetadataDetailsRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerComponentMetadataDetailsRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentMetadataDetailsRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerComponentMetadataDetailsRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLeft_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLeft_text());
                }
                if (!Intrinsics.areEqual(value.getRight_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRight_text());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getId());
                }
                if (!Intrinsics.areEqual(value.getBottom_left_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getBottom_left_text());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDeeplink());
                }
                return size + InvestmentsTrackerDisconnectedData.ADAPTER.encodedSizeWithTag(6, value.getDisconnected_data());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerComponentMetadataDetailsRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLeft_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLeft_text());
                }
                if (!Intrinsics.areEqual(value.getRight_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRight_text());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getBottom_left_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBottom_left_text());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDeeplink());
                }
                InvestmentsTrackerDisconnectedData.ADAPTER.encodeWithTag(writer, 6, (int) value.getDisconnected_data());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerComponentMetadataDetailsRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                InvestmentsTrackerDisconnectedData.ADAPTER.encodeWithTag(writer, 6, (int) value.getDisconnected_data());
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getBottom_left_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBottom_left_text());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getRight_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRight_text());
                }
                if (Intrinsics.areEqual(value.getLeft_text(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLeft_text());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentMetadataDetailsRow redact(InvestmentsTrackerComponentMetadataDetailsRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                InvestmentsTrackerDisconnectedData disconnected_data = value.getDisconnected_data();
                return InvestmentsTrackerComponentMetadataDetailsRow.copy$default(value, null, null, null, null, null, disconnected_data != null ? InvestmentsTrackerDisconnectedData.ADAPTER.redact(disconnected_data) : null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerComponentMetadataDetailsRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedDataDecode = null;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
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
                                investmentsTrackerDisconnectedDataDecode = InvestmentsTrackerDisconnectedData.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new InvestmentsTrackerComponentMetadataDetailsRow(strDecode, strDecode5, strDecode2, strDecode3, strDecode4, investmentsTrackerDisconnectedDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
