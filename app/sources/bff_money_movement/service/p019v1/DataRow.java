package bff_money_movement.service.p019v1;

import com.robinhood.android.car.result.CarResultComposable2;
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

/* compiled from: DataRow.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lbff_money_movement/service/v1/DataRow;", "Lcom/squareup/wire/Message;", "", "title", "", CarResultComposable2.BODY, "logging_identifier", "tooltip", "Lbff_money_movement/service/v1/Tooltip;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/Tooltip;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getLogging_identifier", "getTooltip", "()Lbff_money_movement/service/v1/Tooltip;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class DataRow extends Message {

    @JvmField
    public static final ProtoAdapter<DataRow> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "bff_money_movement.service.v1.Tooltip#ADAPTER", schemaIndex = 3, tag = 4)
    private final Tooltip tooltip;

    public DataRow() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ DataRow(String str, String str2, String str3, Tooltip tooltip, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : tooltip, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8409newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final Tooltip getTooltip() {
        return this.tooltip;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRow(String title, String body, String logging_identifier, Tooltip tooltip, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.body = body;
        this.logging_identifier = logging_identifier;
        this.tooltip = tooltip;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8409newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DataRow)) {
            return false;
        }
        DataRow dataRow = (DataRow) other;
        return Intrinsics.areEqual(unknownFields(), dataRow.unknownFields()) && Intrinsics.areEqual(this.title, dataRow.title) && Intrinsics.areEqual(this.body, dataRow.body) && Intrinsics.areEqual(this.logging_identifier, dataRow.logging_identifier) && Intrinsics.areEqual(this.tooltip, dataRow.tooltip);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.body.hashCode()) * 37) + this.logging_identifier.hashCode()) * 37;
        Tooltip tooltip = this.tooltip;
        int iHashCode2 = iHashCode + (tooltip != null ? tooltip.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("body=" + Internal.sanitize(this.body));
        arrayList.add("logging_identifier=" + Internal.sanitize(this.logging_identifier));
        Tooltip tooltip = this.tooltip;
        if (tooltip != null) {
            arrayList.add("tooltip=" + tooltip);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DataRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DataRow copy$default(DataRow dataRow, String str, String str2, String str3, Tooltip tooltip, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataRow.title;
        }
        if ((i & 2) != 0) {
            str2 = dataRow.body;
        }
        if ((i & 4) != 0) {
            str3 = dataRow.logging_identifier;
        }
        if ((i & 8) != 0) {
            tooltip = dataRow.tooltip;
        }
        if ((i & 16) != 0) {
            byteString = dataRow.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return dataRow.copy(str, str2, str4, tooltip, byteString2);
    }

    public final DataRow copy(String title, String body, String logging_identifier, Tooltip tooltip, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DataRow(title, body, logging_identifier, tooltip, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DataRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DataRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.DataRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DataRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBody());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLogging_identifier());
                }
                return size + Tooltip.ADAPTER.encodedSizeWithTag(4, value.getTooltip());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DataRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBody());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLogging_identifier());
                }
                Tooltip.ADAPTER.encodeWithTag(writer, 4, (int) value.getTooltip());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DataRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Tooltip.ADAPTER.encodeWithTag(writer, 4, (int) value.getTooltip());
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBody());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DataRow redact(DataRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Tooltip tooltip = value.getTooltip();
                return DataRow.copy$default(value, null, null, null, tooltip != null ? Tooltip.ADAPTER.redact(tooltip) : null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DataRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                Tooltip tooltipDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DataRow(strDecode, strDecode3, strDecode2, tooltipDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        tooltipDecode = Tooltip.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
