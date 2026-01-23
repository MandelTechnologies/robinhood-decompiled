package rh_server_driven_ui.p531v1;

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

/* compiled from: MarginTieredRateTableCallout.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016J<\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredRateTableCallout;", "Lcom/squareup/wire/Message;", "", "background_color", "Lrh_server_driven_ui/v1/ThemedColor;", "is_gold", "", "text_color", "title", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;ZLrh_server_driven_ui/v1/ThemedColor;Ljava/lang/String;Lokio/ByteString;)V", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "()Z", "getText_color", "getTitle", "()Ljava/lang/String;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class MarginTieredRateTableCallout extends Message {

    @JvmField
    public static final ProtoAdapter<MarginTieredRateTableCallout> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "backgroundColor", schemaIndex = 0, tag = 1)
    private final ThemedColor background_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isGold", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_gold;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "textColor", schemaIndex = 2, tag = 3)
    private final ThemedColor text_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String title;

    public MarginTieredRateTableCallout() {
        this(null, false, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29779newBuilder();
    }

    public final ThemedColor getBackground_color() {
        return this.background_color;
    }

    /* renamed from: is_gold, reason: from getter */
    public final boolean getIs_gold() {
        return this.is_gold;
    }

    public final ThemedColor getText_color() {
        return this.text_color;
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ MarginTieredRateTableCallout(ThemedColor themedColor, boolean z, ThemedColor themedColor2, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : themedColor2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginTieredRateTableCallout(ThemedColor themedColor, boolean z, ThemedColor themedColor2, String title, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.background_color = themedColor;
        this.is_gold = z;
        this.text_color = themedColor2;
        this.title = title;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29779newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginTieredRateTableCallout)) {
            return false;
        }
        MarginTieredRateTableCallout marginTieredRateTableCallout = (MarginTieredRateTableCallout) other;
        return Intrinsics.areEqual(unknownFields(), marginTieredRateTableCallout.unknownFields()) && Intrinsics.areEqual(this.background_color, marginTieredRateTableCallout.background_color) && this.is_gold == marginTieredRateTableCallout.is_gold && Intrinsics.areEqual(this.text_color, marginTieredRateTableCallout.text_color) && Intrinsics.areEqual(this.title, marginTieredRateTableCallout.title);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ThemedColor themedColor = this.background_color;
        int iHashCode2 = (((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_gold)) * 37;
        ThemedColor themedColor2 = this.text_color;
        int iHashCode3 = ((iHashCode2 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37) + this.title.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ThemedColor themedColor = this.background_color;
        if (themedColor != null) {
            arrayList.add("background_color=" + themedColor);
        }
        arrayList.add("is_gold=" + this.is_gold);
        ThemedColor themedColor2 = this.text_color;
        if (themedColor2 != null) {
            arrayList.add("text_color=" + themedColor2);
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginTieredRateTableCallout{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginTieredRateTableCallout copy$default(MarginTieredRateTableCallout marginTieredRateTableCallout, ThemedColor themedColor, boolean z, ThemedColor themedColor2, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            themedColor = marginTieredRateTableCallout.background_color;
        }
        if ((i & 2) != 0) {
            z = marginTieredRateTableCallout.is_gold;
        }
        if ((i & 4) != 0) {
            themedColor2 = marginTieredRateTableCallout.text_color;
        }
        if ((i & 8) != 0) {
            str = marginTieredRateTableCallout.title;
        }
        if ((i & 16) != 0) {
            byteString = marginTieredRateTableCallout.unknownFields();
        }
        ByteString byteString2 = byteString;
        ThemedColor themedColor3 = themedColor2;
        return marginTieredRateTableCallout.copy(themedColor, z, themedColor3, str, byteString2);
    }

    public final MarginTieredRateTableCallout copy(ThemedColor background_color, boolean is_gold, ThemedColor text_color, String title, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginTieredRateTableCallout(background_color, is_gold, text_color, title, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginTieredRateTableCallout.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginTieredRateTableCallout>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.MarginTieredRateTableCallout$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginTieredRateTableCallout value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getBackground_color());
                if (value.getIs_gold()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_gold()));
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getText_color());
                return !Intrinsics.areEqual(value.getTitle(), "") ? iEncodedSizeWithTag2 + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTitle()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginTieredRateTableCallout value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getBackground_color());
                if (value.getIs_gold()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_gold()));
                }
                protoAdapter.encodeWithTag(writer, 3, (int) value.getText_color());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTitle());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginTieredRateTableCallout value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTitle());
                }
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getText_color());
                if (value.getIs_gold()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_gold()));
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getBackground_color());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginTieredRateTableCallout redact(MarginTieredRateTableCallout value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor background_color = value.getBackground_color();
                ThemedColor themedColorRedact = background_color != null ? ThemedColor.ADAPTER.redact(background_color) : null;
                ThemedColor text_color = value.getText_color();
                return MarginTieredRateTableCallout.copy$default(value, themedColorRedact, false, text_color != null ? ThemedColor.ADAPTER.redact(text_color) : null, null, ByteString.EMPTY, 10, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginTieredRateTableCallout decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                String strDecode = "";
                boolean zBooleanValue = false;
                ThemedColor themedColorDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarginTieredRateTableCallout(themedColorDecode, zBooleanValue, themedColorDecode2, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
