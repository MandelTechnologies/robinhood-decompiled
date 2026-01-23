package wormhole.service.p554v1;

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

/* compiled from: SupportedAssetClass.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lwormhole/service/v1/SupportedAssetClass;", "Lcom/squareup/wire/Message;", "", "asset_class", "Lwormhole/service/v1/AssetClass;", "has_data", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lwormhole/service/v1/AssetClass;ZLokio/ByteString;)V", "getAsset_class", "()Lwormhole/service/v1/AssetClass;", "getHas_data", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class SupportedAssetClass extends Message {

    @JvmField
    public static final ProtoAdapter<SupportedAssetClass> ADAPTER;

    @WireField(adapter = "wormhole.service.v1.AssetClass#ADAPTER", jsonName = "assetClass", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AssetClass asset_class;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean has_data;

    public SupportedAssetClass() {
        this(null, false, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30083newBuilder();
    }

    public final AssetClass getAsset_class() {
        return this.asset_class;
    }

    public /* synthetic */ SupportedAssetClass(AssetClass assetClass, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AssetClass.ASSET_CLASS_UNSPECIFIED : assetClass, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getHas_data() {
        return this.has_data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportedAssetClass(AssetClass asset_class, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset_class = asset_class;
        this.has_data = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30083newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SupportedAssetClass)) {
            return false;
        }
        SupportedAssetClass supportedAssetClass = (SupportedAssetClass) other;
        return Intrinsics.areEqual(unknownFields(), supportedAssetClass.unknownFields()) && this.asset_class == supportedAssetClass.asset_class && this.has_data == supportedAssetClass.has_data;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.asset_class.hashCode()) * 37) + Boolean.hashCode(this.has_data);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("asset_class=" + this.asset_class);
        arrayList.add("has_data=" + this.has_data);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SupportedAssetClass{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SupportedAssetClass copy$default(SupportedAssetClass supportedAssetClass, AssetClass assetClass, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            assetClass = supportedAssetClass.asset_class;
        }
        if ((i & 2) != 0) {
            z = supportedAssetClass.has_data;
        }
        if ((i & 4) != 0) {
            byteString = supportedAssetClass.unknownFields();
        }
        return supportedAssetClass.copy(assetClass, z, byteString);
    }

    public final SupportedAssetClass copy(AssetClass asset_class, boolean has_data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SupportedAssetClass(asset_class, has_data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SupportedAssetClass.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SupportedAssetClass>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: wormhole.service.v1.SupportedAssetClass$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SupportedAssetClass value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAsset_class() != AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    size += AssetClass.ADAPTER.encodedSizeWithTag(1, value.getAsset_class());
                }
                return value.getHas_data() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getHas_data())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SupportedAssetClass value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAsset_class() != AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    AssetClass.ADAPTER.encodeWithTag(writer, 1, (int) value.getAsset_class());
                }
                if (value.getHas_data()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getHas_data()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SupportedAssetClass value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getHas_data()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getHas_data()));
                }
                if (value.getAsset_class() != AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    AssetClass.ADAPTER.encodeWithTag(writer, 1, (int) value.getAsset_class());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SupportedAssetClass decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AssetClass assetClassDecode = AssetClass.ASSET_CLASS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SupportedAssetClass(assetClassDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            assetClassDecode = AssetClass.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SupportedAssetClass redact(SupportedAssetClass value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SupportedAssetClass.copy$default(value, null, false, ByteString.EMPTY, 3, null);
            }
        };
    }
}
