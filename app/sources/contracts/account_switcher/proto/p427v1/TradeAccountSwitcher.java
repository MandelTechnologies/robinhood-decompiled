package contracts.account_switcher.proto.p427v1;

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

/* compiled from: TradeAccountSwitcher.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J6\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/TradeAccountSwitcher;", "Lcom/squareup/wire/Message;", "", "title", "", "rows", "", "Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRow;", "primary_cta_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getPrimary_cta_text", "getRows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class TradeAccountSwitcher extends Message {

    @JvmField
    public static final ProtoAdapter<TradeAccountSwitcher> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String primary_cta_text;

    @WireField(adapter = "contracts.account_switcher.proto.v1.TradeAccountSwitcherAccountRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<TradeAccountSwitcherAccountRow> rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String title;

    public TradeAccountSwitcher() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27617newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ TradeAccountSwitcher(String str, List list, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getPrimary_cta_text() {
        return this.primary_cta_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeAccountSwitcher(String str, List<TradeAccountSwitcherAccountRow> rows, String primary_cta_text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(primary_cta_text, "primary_cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = str;
        this.primary_cta_text = primary_cta_text;
        this.rows = Internal.immutableCopyOf("rows", rows);
    }

    public final List<TradeAccountSwitcherAccountRow> getRows() {
        return this.rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27617newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TradeAccountSwitcher)) {
            return false;
        }
        TradeAccountSwitcher tradeAccountSwitcher = (TradeAccountSwitcher) other;
        return Intrinsics.areEqual(unknownFields(), tradeAccountSwitcher.unknownFields()) && Intrinsics.areEqual(this.title, tradeAccountSwitcher.title) && Intrinsics.areEqual(this.rows, tradeAccountSwitcher.rows) && Intrinsics.areEqual(this.primary_cta_text, tradeAccountSwitcher.primary_cta_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int iHashCode2 = ((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.rows.hashCode()) * 37) + this.primary_cta_text.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            arrayList.add("title=" + Internal.sanitize(str));
        }
        if (!this.rows.isEmpty()) {
            arrayList.add("rows=" + this.rows);
        }
        arrayList.add("primary_cta_text=" + Internal.sanitize(this.primary_cta_text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "TradeAccountSwitcher{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradeAccountSwitcher copy$default(TradeAccountSwitcher tradeAccountSwitcher, String str, List list, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeAccountSwitcher.title;
        }
        if ((i & 2) != 0) {
            list = tradeAccountSwitcher.rows;
        }
        if ((i & 4) != 0) {
            str2 = tradeAccountSwitcher.primary_cta_text;
        }
        if ((i & 8) != 0) {
            byteString = tradeAccountSwitcher.unknownFields();
        }
        return tradeAccountSwitcher.copy(str, list, str2, byteString);
    }

    public final TradeAccountSwitcher copy(String title, List<TradeAccountSwitcherAccountRow> rows, String primary_cta_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(primary_cta_text, "primary_cta_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TradeAccountSwitcher(title, rows, primary_cta_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TradeAccountSwitcher.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TradeAccountSwitcher>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.account_switcher.proto.v1.TradeAccountSwitcher$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TradeAccountSwitcher value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getTitle()) + TradeAccountSwitcherAccountRow.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getRows());
                return !Intrinsics.areEqual(value.getPrimary_cta_text(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getPrimary_cta_text()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TradeAccountSwitcher value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
                TradeAccountSwitcherAccountRow.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getRows());
                if (!Intrinsics.areEqual(value.getPrimary_cta_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getPrimary_cta_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TradeAccountSwitcher value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPrimary_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_cta_text());
                }
                TradeAccountSwitcherAccountRow.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getRows());
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TradeAccountSwitcher decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TradeAccountSwitcher(strDecode, arrayList, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(TradeAccountSwitcherAccountRow.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TradeAccountSwitcher redact(TradeAccountSwitcher value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TradeAccountSwitcher.copy$default(value, null, Internal.m26823redactElements(value.getRows(), TradeAccountSwitcherAccountRow.ADAPTER), null, ByteString.EMPTY, 5, null);
            }
        };
    }
}
