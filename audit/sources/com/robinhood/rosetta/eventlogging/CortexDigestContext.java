package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.CortexDigestContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: CortexDigestContext.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CortexDigestContext;", "Lcom/squareup/wire/Message;", "", "digest_id", "", "asset_id", "asset_type", "Lcom/robinhood/rosetta/eventlogging/CortexDigestContext$AssetType;", "source", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CortexDigestContext$AssetType;Ljava/lang/String;Lokio/ByteString;)V", "getDigest_id", "()Ljava/lang/String;", "getAsset_id", "getAsset_type", "()Lcom/robinhood/rosetta/eventlogging/CortexDigestContext$AssetType;", "getSource", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "AssetType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CortexDigestContext extends Message {

    @JvmField
    public static final ProtoAdapter<CortexDigestContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String asset_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CortexDigestContext$AssetType#ADAPTER", jsonName = "assetType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AssetType asset_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "digestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String digest_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String source;

    public CortexDigestContext() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ CortexDigestContext(String str, String str2, AssetType assetType, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? AssetType.ASSET_TYPE_UNSPECIFIED : assetType, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24143newBuilder();
    }

    public final String getDigest_id() {
        return this.digest_id;
    }

    public final String getAsset_id() {
        return this.asset_id;
    }

    public final AssetType getAsset_type() {
        return this.asset_type;
    }

    public final String getSource() {
        return this.source;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CortexDigestContext(String digest_id, String asset_id, AssetType asset_type, String source, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(asset_id, "asset_id");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.digest_id = digest_id;
        this.asset_id = asset_id;
        this.asset_type = asset_type;
        this.source = source;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24143newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CortexDigestContext)) {
            return false;
        }
        CortexDigestContext cortexDigestContext = (CortexDigestContext) other;
        return Intrinsics.areEqual(unknownFields(), cortexDigestContext.unknownFields()) && Intrinsics.areEqual(this.digest_id, cortexDigestContext.digest_id) && Intrinsics.areEqual(this.asset_id, cortexDigestContext.asset_id) && this.asset_type == cortexDigestContext.asset_type && Intrinsics.areEqual(this.source, cortexDigestContext.source);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.digest_id.hashCode()) * 37) + this.asset_id.hashCode()) * 37) + this.asset_type.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("digest_id=" + Internal.sanitize(this.digest_id));
        arrayList.add("asset_id=" + Internal.sanitize(this.asset_id));
        arrayList.add("asset_type=" + this.asset_type);
        arrayList.add("source=" + Internal.sanitize(this.source));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CortexDigestContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CortexDigestContext copy$default(CortexDigestContext cortexDigestContext, String str, String str2, AssetType assetType, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cortexDigestContext.digest_id;
        }
        if ((i & 2) != 0) {
            str2 = cortexDigestContext.asset_id;
        }
        if ((i & 4) != 0) {
            assetType = cortexDigestContext.asset_type;
        }
        if ((i & 8) != 0) {
            str3 = cortexDigestContext.source;
        }
        if ((i & 16) != 0) {
            byteString = cortexDigestContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        AssetType assetType2 = assetType;
        return cortexDigestContext.copy(str, str2, assetType2, str3, byteString2);
    }

    public final CortexDigestContext copy(String digest_id, String asset_id, AssetType asset_type, String source, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(asset_id, "asset_id");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CortexDigestContext(digest_id, asset_id, asset_type, source, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CortexDigestContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CortexDigestContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CortexDigestContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CortexDigestContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDigest_id());
                }
                if (!Intrinsics.areEqual(value.getAsset_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAsset_id());
                }
                if (value.getAsset_type() != CortexDigestContext.AssetType.ASSET_TYPE_UNSPECIFIED) {
                    size += CortexDigestContext.AssetType.ADAPTER.encodedSizeWithTag(3, value.getAsset_type());
                }
                return !Intrinsics.areEqual(value.getSource(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSource()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CortexDigestContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDigest_id());
                }
                if (!Intrinsics.areEqual(value.getAsset_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsset_id());
                }
                if (value.getAsset_type() != CortexDigestContext.AssetType.ASSET_TYPE_UNSPECIFIED) {
                    CortexDigestContext.AssetType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAsset_type());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSource());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CortexDigestContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSource());
                }
                if (value.getAsset_type() != CortexDigestContext.AssetType.ASSET_TYPE_UNSPECIFIED) {
                    CortexDigestContext.AssetType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAsset_type());
                }
                if (!Intrinsics.areEqual(value.getAsset_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsset_id());
                }
                if (Intrinsics.areEqual(value.getDigest_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDigest_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CortexDigestContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CortexDigestContext.AssetType assetTypeDecode = CortexDigestContext.AssetType.ASSET_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    CortexDigestContext.AssetType assetType = assetTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CortexDigestContext(strDecode, strDecode2, assetType, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                assetTypeDecode = CortexDigestContext.AssetType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CortexDigestContext redact(CortexDigestContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CortexDigestContext.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CortexDigestContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CortexDigestContext$AssetType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ASSET_TYPE_UNSPECIFIED", "INSTRUMENT", "CRYPTO", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AssetType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AssetType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<AssetType> ADAPTER;
        public static final AssetType ASSET_TYPE_UNSPECIFIED;
        public static final AssetType CRYPTO;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AssetType INSTRUMENT;
        private final int value;

        private static final /* synthetic */ AssetType[] $values() {
            return new AssetType[]{ASSET_TYPE_UNSPECIFIED, INSTRUMENT, CRYPTO};
        }

        @JvmStatic
        public static final AssetType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AssetType> getEntries() {
            return $ENTRIES;
        }

        private AssetType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AssetType assetType = new AssetType("ASSET_TYPE_UNSPECIFIED", 0, 0);
            ASSET_TYPE_UNSPECIFIED = assetType;
            INSTRUMENT = new AssetType("INSTRUMENT", 1, 1);
            CRYPTO = new AssetType("CRYPTO", 2, 2);
            AssetType[] assetTypeArr$values = $values();
            $VALUES = assetTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(assetTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AssetType>(orCreateKotlinClass, syntax, assetType) { // from class: com.robinhood.rosetta.eventlogging.CortexDigestContext$AssetType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CortexDigestContext.AssetType fromValue(int value) {
                    return CortexDigestContext.AssetType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CortexDigestContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CortexDigestContext$AssetType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CortexDigestContext$AssetType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AssetType fromValue(int value) {
                if (value == 0) {
                    return AssetType.ASSET_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return AssetType.INSTRUMENT;
                }
                if (value != 2) {
                    return null;
                }
                return AssetType.CRYPTO;
            }
        }

        public static AssetType valueOf(String str) {
            return (AssetType) Enum.valueOf(AssetType.class, str);
        }

        public static AssetType[] values() {
            return (AssetType[]) $VALUES.clone();
        }
    }
}
