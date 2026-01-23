package advisory.proto.p008v1;

import com.robinhood.android.markdown.compose.MarkdownText4;
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

/* compiled from: TaxLossHarvestStrategyCelebration.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J>\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategyCelebration;", "Lcom/squareup/wire/Message;", "", "image_url", "", "title", "subtitle", "rows", "", "Ladvisory/proto/v1/TaxLossHarvestStrategyCelebrationRow;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getImage_url", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getRows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TaxLossHarvestStrategyCelebration extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLossHarvestStrategyCelebration> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = MarkdownText4.TagImageUrl, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String image_url;

    @WireField(adapter = "advisory.proto.v1.TaxLossHarvestStrategyCelebrationRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<TaxLossHarvestStrategyCelebrationRow> rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public TaxLossHarvestStrategyCelebration() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ TaxLossHarvestStrategyCelebration(String str, String str2, String str3, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4563newBuilder();
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestStrategyCelebration(String image_url, String title, String subtitle, List<TaxLossHarvestStrategyCelebrationRow> rows, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.image_url = image_url;
        this.title = title;
        this.subtitle = subtitle;
        this.rows = Internal.immutableCopyOf("rows", rows);
    }

    public final List<TaxLossHarvestStrategyCelebrationRow> getRows() {
        return this.rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4563newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLossHarvestStrategyCelebration)) {
            return false;
        }
        TaxLossHarvestStrategyCelebration taxLossHarvestStrategyCelebration = (TaxLossHarvestStrategyCelebration) other;
        return Intrinsics.areEqual(unknownFields(), taxLossHarvestStrategyCelebration.unknownFields()) && Intrinsics.areEqual(this.image_url, taxLossHarvestStrategyCelebration.image_url) && Intrinsics.areEqual(this.title, taxLossHarvestStrategyCelebration.title) && Intrinsics.areEqual(this.subtitle, taxLossHarvestStrategyCelebration.subtitle) && Intrinsics.areEqual(this.rows, taxLossHarvestStrategyCelebration.rows);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.image_url.hashCode()) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.rows.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("image_url=" + Internal.sanitize(this.image_url));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        if (!this.rows.isEmpty()) {
            arrayList.add("rows=" + this.rows);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLossHarvestStrategyCelebration{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLossHarvestStrategyCelebration copy$default(TaxLossHarvestStrategyCelebration taxLossHarvestStrategyCelebration, String str, String str2, String str3, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLossHarvestStrategyCelebration.image_url;
        }
        if ((i & 2) != 0) {
            str2 = taxLossHarvestStrategyCelebration.title;
        }
        if ((i & 4) != 0) {
            str3 = taxLossHarvestStrategyCelebration.subtitle;
        }
        if ((i & 8) != 0) {
            list = taxLossHarvestStrategyCelebration.rows;
        }
        if ((i & 16) != 0) {
            byteString = taxLossHarvestStrategyCelebration.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return taxLossHarvestStrategyCelebration.copy(str, str2, str4, list, byteString2);
    }

    public final TaxLossHarvestStrategyCelebration copy(String image_url, String title, String subtitle, List<TaxLossHarvestStrategyCelebrationRow> rows, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLossHarvestStrategyCelebration(image_url, title, subtitle, rows, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLossHarvestStrategyCelebration.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLossHarvestStrategyCelebration>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.TaxLossHarvestStrategyCelebration$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLossHarvestStrategyCelebration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getImage_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getImage_url());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSubtitle());
                }
                return size + TaxLossHarvestStrategyCelebrationRow.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getRows());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLossHarvestStrategyCelebration value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getImage_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getImage_url());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                TaxLossHarvestStrategyCelebrationRow.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getRows());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLossHarvestStrategyCelebration value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                TaxLossHarvestStrategyCelebrationRow.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getRows());
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (Intrinsics.areEqual(value.getImage_url(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getImage_url());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestStrategyCelebration decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TaxLossHarvestStrategyCelebration(strDecode, strDecode2, strDecode3, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        arrayList.add(TaxLossHarvestStrategyCelebrationRow.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestStrategyCelebration redact(TaxLossHarvestStrategyCelebration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TaxLossHarvestStrategyCelebration.copy$default(value, null, null, null, Internal.m26823redactElements(value.getRows(), TaxLossHarvestStrategyCelebrationRow.ADAPTER), ByteString.EMPTY, 7, null);
            }
        };
    }
}
