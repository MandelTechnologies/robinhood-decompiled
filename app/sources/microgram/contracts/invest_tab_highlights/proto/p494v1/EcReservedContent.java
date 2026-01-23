package microgram.contracts.invest_tab_highlights.proto.p494v1;

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

/* compiled from: EcReservedContent.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcReservedContent;", "Lcom/squareup/wire/Message;", "", "secondary_text", "", "primary_text", "is_live", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getSecondary_text", "()Ljava/lang/String;", "getPrimary_text", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class EcReservedContent extends Message {

    @JvmField
    public static final ProtoAdapter<EcReservedContent> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isLive", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_live;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String primary_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String secondary_text;

    public EcReservedContent() {
        this(null, null, false, null, 15, null);
    }

    public /* synthetic */ EcReservedContent(String str, String str2, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29124newBuilder();
    }

    public final String getSecondary_text() {
        return this.secondary_text;
    }

    public final String getPrimary_text() {
        return this.primary_text;
    }

    /* renamed from: is_live, reason: from getter */
    public final boolean getIs_live() {
        return this.is_live;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcReservedContent(String secondary_text, String primary_text, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(secondary_text, "secondary_text");
        Intrinsics.checkNotNullParameter(primary_text, "primary_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.secondary_text = secondary_text;
        this.primary_text = primary_text;
        this.is_live = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29124newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EcReservedContent)) {
            return false;
        }
        EcReservedContent ecReservedContent = (EcReservedContent) other;
        return Intrinsics.areEqual(unknownFields(), ecReservedContent.unknownFields()) && Intrinsics.areEqual(this.secondary_text, ecReservedContent.secondary_text) && Intrinsics.areEqual(this.primary_text, ecReservedContent.primary_text) && this.is_live == ecReservedContent.is_live;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.secondary_text.hashCode()) * 37) + this.primary_text.hashCode()) * 37) + Boolean.hashCode(this.is_live);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("secondary_text=" + Internal.sanitize(this.secondary_text));
        arrayList.add("primary_text=" + Internal.sanitize(this.primary_text));
        arrayList.add("is_live=" + this.is_live);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EcReservedContent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EcReservedContent copy$default(EcReservedContent ecReservedContent, String str, String str2, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ecReservedContent.secondary_text;
        }
        if ((i & 2) != 0) {
            str2 = ecReservedContent.primary_text;
        }
        if ((i & 4) != 0) {
            z = ecReservedContent.is_live;
        }
        if ((i & 8) != 0) {
            byteString = ecReservedContent.unknownFields();
        }
        return ecReservedContent.copy(str, str2, z, byteString);
    }

    public final EcReservedContent copy(String secondary_text, String primary_text, boolean is_live, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(secondary_text, "secondary_text");
        Intrinsics.checkNotNullParameter(primary_text, "primary_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EcReservedContent(secondary_text, primary_text, is_live, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EcReservedContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EcReservedContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.EcReservedContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EcReservedContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSecondary_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSecondary_text());
                }
                if (!Intrinsics.areEqual(value.getPrimary_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPrimary_text());
                }
                return value.getIs_live() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_live())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EcReservedContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSecondary_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSecondary_text());
                }
                if (!Intrinsics.areEqual(value.getPrimary_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrimary_text());
                }
                if (value.getIs_live()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_live()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EcReservedContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_live()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_live()));
                }
                if (!Intrinsics.areEqual(value.getPrimary_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrimary_text());
                }
                if (Intrinsics.areEqual(value.getSecondary_text(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSecondary_text());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EcReservedContent redact(EcReservedContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EcReservedContent.copy$default(value, null, null, false, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EcReservedContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EcReservedContent(strDecode, strDecode2, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
