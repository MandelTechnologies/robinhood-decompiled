package search_coprocessor.p542v1;

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

/* compiled from: AssetChipGrid.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J4\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lsearch_coprocessor/v1/AssetChipGrid;", "Lcom/squareup/wire/Message;", "", "id", "", "assets", "", "Lsearch_coprocessor/v1/Asset;", "number_of_rows", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;ILokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getNumber_of_rows", "()I", "getAssets", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class AssetChipGrid extends Message {

    @JvmField
    public static final ProtoAdapter<AssetChipGrid> ADAPTER;

    @WireField(adapter = "search_coprocessor.v1.Asset#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<Asset> assets;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "numberOfRows", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int number_of_rows;

    public AssetChipGrid() {
        this(null, null, 0, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29939newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ AssetChipGrid(String str, List list, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getNumber_of_rows() {
        return this.number_of_rows;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetChipGrid(String id, List<Asset> assets, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.number_of_rows = i;
        this.assets = Internal.immutableCopyOf("assets", assets);
    }

    public final List<Asset> getAssets() {
        return this.assets;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29939newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AssetChipGrid)) {
            return false;
        }
        AssetChipGrid assetChipGrid = (AssetChipGrid) other;
        return Intrinsics.areEqual(unknownFields(), assetChipGrid.unknownFields()) && Intrinsics.areEqual(this.id, assetChipGrid.id) && Intrinsics.areEqual(this.assets, assetChipGrid.assets) && this.number_of_rows == assetChipGrid.number_of_rows;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.assets.hashCode()) * 37) + Integer.hashCode(this.number_of_rows);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        if (!this.assets.isEmpty()) {
            arrayList.add("assets=" + this.assets);
        }
        arrayList.add("number_of_rows=" + this.number_of_rows);
        return CollectionsKt.joinToString$default(arrayList, ", ", "AssetChipGrid{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetChipGrid copy$default(AssetChipGrid assetChipGrid, String str, List list, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = assetChipGrid.id;
        }
        if ((i2 & 2) != 0) {
            list = assetChipGrid.assets;
        }
        if ((i2 & 4) != 0) {
            i = assetChipGrid.number_of_rows;
        }
        if ((i2 & 8) != 0) {
            byteString = assetChipGrid.unknownFields();
        }
        return assetChipGrid.copy(str, list, i, byteString);
    }

    public final AssetChipGrid copy(String id, List<Asset> assets, int number_of_rows, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AssetChipGrid(id, assets, number_of_rows, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetChipGrid.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AssetChipGrid>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.AssetChipGrid$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AssetChipGrid value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                int iEncodedSizeWithTag = size + Asset.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getAssets());
                return value.getNumber_of_rows() != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getNumber_of_rows())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AssetChipGrid value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                Asset.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getAssets());
                if (value.getNumber_of_rows() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getNumber_of_rows()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AssetChipGrid value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getNumber_of_rows() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getNumber_of_rows()));
                }
                Asset.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getAssets());
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AssetChipGrid decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AssetChipGrid(strDecode, arrayList, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(Asset.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AssetChipGrid redact(AssetChipGrid value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AssetChipGrid.copy$default(value, null, Internal.m26823redactElements(value.getAssets(), Asset.ADAPTER), 0, ByteString.EMPTY, 5, null);
            }
        };
    }
}
