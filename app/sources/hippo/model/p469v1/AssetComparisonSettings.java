package hippo.model.p469v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: AssetComparisonSettings.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lhippo/model/v1/AssetComparisonSettings;", "Lcom/squareup/wire/Message;", "", "show_markers", "", "show_ribbon_markers", "show_line_markers", "show_ticker_markers", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZZZLokio/ByteString;)V", "getShow_markers", "()Z", "getShow_ribbon_markers", "getShow_line_markers", "getShow_ticker_markers", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AssetComparisonSettings extends Message {

    @JvmField
    public static final ProtoAdapter<AssetComparisonSettings> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showLineMarkers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean show_line_markers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showMarkers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean show_markers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showRibbonMarkers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean show_ribbon_markers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showTickerMarkers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean show_ticker_markers;

    public AssetComparisonSettings() {
        this(false, false, false, false, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28231newBuilder();
    }

    public final boolean getShow_markers() {
        return this.show_markers;
    }

    public final boolean getShow_ribbon_markers() {
        return this.show_ribbon_markers;
    }

    public final boolean getShow_line_markers() {
        return this.show_line_markers;
    }

    public final boolean getShow_ticker_markers() {
        return this.show_ticker_markers;
    }

    public /* synthetic */ AssetComparisonSettings(boolean z, boolean z2, boolean z3, boolean z4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetComparisonSettings(boolean z, boolean z2, boolean z3, boolean z4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.show_markers = z;
        this.show_ribbon_markers = z2;
        this.show_line_markers = z3;
        this.show_ticker_markers = z4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28231newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AssetComparisonSettings)) {
            return false;
        }
        AssetComparisonSettings assetComparisonSettings = (AssetComparisonSettings) other;
        return Intrinsics.areEqual(unknownFields(), assetComparisonSettings.unknownFields()) && this.show_markers == assetComparisonSettings.show_markers && this.show_ribbon_markers == assetComparisonSettings.show_ribbon_markers && this.show_line_markers == assetComparisonSettings.show_line_markers && this.show_ticker_markers == assetComparisonSettings.show_ticker_markers;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.show_markers)) * 37) + Boolean.hashCode(this.show_ribbon_markers)) * 37) + Boolean.hashCode(this.show_line_markers)) * 37) + Boolean.hashCode(this.show_ticker_markers);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("show_markers=" + this.show_markers);
        arrayList.add("show_ribbon_markers=" + this.show_ribbon_markers);
        arrayList.add("show_line_markers=" + this.show_line_markers);
        arrayList.add("show_ticker_markers=" + this.show_ticker_markers);
        return CollectionsKt.joinToString$default(arrayList, ", ", "AssetComparisonSettings{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AssetComparisonSettings copy$default(AssetComparisonSettings assetComparisonSettings, boolean z, boolean z2, boolean z3, boolean z4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = assetComparisonSettings.show_markers;
        }
        if ((i & 2) != 0) {
            z2 = assetComparisonSettings.show_ribbon_markers;
        }
        if ((i & 4) != 0) {
            z3 = assetComparisonSettings.show_line_markers;
        }
        if ((i & 8) != 0) {
            z4 = assetComparisonSettings.show_ticker_markers;
        }
        if ((i & 16) != 0) {
            byteString = assetComparisonSettings.unknownFields();
        }
        ByteString byteString2 = byteString;
        boolean z5 = z3;
        return assetComparisonSettings.copy(z, z2, z5, z4, byteString2);
    }

    public final AssetComparisonSettings copy(boolean show_markers, boolean show_ribbon_markers, boolean show_line_markers, boolean show_ticker_markers, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AssetComparisonSettings(show_markers, show_ribbon_markers, show_line_markers, show_ticker_markers, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetComparisonSettings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AssetComparisonSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.AssetComparisonSettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AssetComparisonSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getShow_markers()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getShow_markers()));
                }
                if (value.getShow_ribbon_markers()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getShow_ribbon_markers()));
                }
                if (value.getShow_line_markers()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getShow_line_markers()));
                }
                return value.getShow_ticker_markers() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getShow_ticker_markers())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AssetComparisonSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getShow_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getShow_markers()));
                }
                if (value.getShow_ribbon_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getShow_ribbon_markers()));
                }
                if (value.getShow_line_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getShow_line_markers()));
                }
                if (value.getShow_ticker_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getShow_ticker_markers()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AssetComparisonSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getShow_ticker_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getShow_ticker_markers()));
                }
                if (value.getShow_line_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getShow_line_markers()));
                }
                if (value.getShow_ribbon_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getShow_ribbon_markers()));
                }
                if (value.getShow_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getShow_markers()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AssetComparisonSettings redact(AssetComparisonSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AssetComparisonSettings.copy$default(value, false, false, false, false, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AssetComparisonSettings decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                boolean zBooleanValue4 = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AssetComparisonSettings(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 4) {
                        zBooleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
