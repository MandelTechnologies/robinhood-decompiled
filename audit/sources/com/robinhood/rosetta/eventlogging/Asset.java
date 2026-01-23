package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.Asset;
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

/* compiled from: Asset.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Asset;", "Lcom/squareup/wire/Message;", "", "unique_identifier", "", "asset_type", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "has_holdings", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;Lcom/robinhood/rosetta/eventlogging/Boolean;Lokio/ByteString;)V", "getUnique_identifier", "()Ljava/lang/String;", "getAsset_type", "()Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "getHas_holdings", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "AssetType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Asset extends Message {

    @JvmField
    public static final ProtoAdapter<Asset> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Asset$AssetType#ADAPTER", jsonName = "assetType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AssetType asset_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "hasHoldings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Boolean has_holdings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "uniqueIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String unique_identifier;

    public Asset() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24026newBuilder();
    }

    public final String getUnique_identifier() {
        return this.unique_identifier;
    }

    public /* synthetic */ Asset(String str, AssetType assetType, Boolean r3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AssetType.ASSET_TYPE_UNSPECIFIED : assetType, (i & 4) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final AssetType getAsset_type() {
        return this.asset_type;
    }

    public final Boolean getHas_holdings() {
        return this.has_holdings;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Asset(String unique_identifier, AssetType asset_type, Boolean has_holdings, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(has_holdings, "has_holdings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.unique_identifier = unique_identifier;
        this.asset_type = asset_type;
        this.has_holdings = has_holdings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24026newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) other;
        return Intrinsics.areEqual(unknownFields(), asset.unknownFields()) && Intrinsics.areEqual(this.unique_identifier, asset.unique_identifier) && this.asset_type == asset.asset_type && this.has_holdings == asset.has_holdings;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.unique_identifier.hashCode()) * 37) + this.asset_type.hashCode()) * 37) + this.has_holdings.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("unique_identifier=" + Internal.sanitize(this.unique_identifier));
        arrayList.add("asset_type=" + this.asset_type);
        arrayList.add("has_holdings=" + this.has_holdings);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Asset{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Asset copy$default(Asset asset, String str, AssetType assetType, Boolean r3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = asset.unique_identifier;
        }
        if ((i & 2) != 0) {
            assetType = asset.asset_type;
        }
        if ((i & 4) != 0) {
            r3 = asset.has_holdings;
        }
        if ((i & 8) != 0) {
            byteString = asset.unknownFields();
        }
        return asset.copy(str, assetType, r3, byteString);
    }

    public final Asset copy(String unique_identifier, AssetType asset_type, Boolean has_holdings, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(has_holdings, "has_holdings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Asset(unique_identifier, asset_type, has_holdings, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Asset.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Asset>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.Asset$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Asset value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUnique_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUnique_identifier());
                }
                if (value.getAsset_type() != Asset.AssetType.ASSET_TYPE_UNSPECIFIED) {
                    size += Asset.AssetType.ADAPTER.encodedSizeWithTag(2, value.getAsset_type());
                }
                return value.getHas_holdings() != Boolean.BOOLEAN_UNSPECIFIED ? size + Boolean.ADAPTER.encodedSizeWithTag(3, value.getHas_holdings()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Asset value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUnique_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUnique_identifier());
                }
                if (value.getAsset_type() != Asset.AssetType.ASSET_TYPE_UNSPECIFIED) {
                    Asset.AssetType.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_type());
                }
                if (value.getHas_holdings() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 3, (int) value.getHas_holdings());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Asset value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getHas_holdings() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 3, (int) value.getHas_holdings());
                }
                if (value.getAsset_type() != Asset.AssetType.ASSET_TYPE_UNSPECIFIED) {
                    Asset.AssetType.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_type());
                }
                if (Intrinsics.areEqual(value.getUnique_identifier(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUnique_identifier());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Asset decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Asset.AssetType assetTypeDecode = Asset.AssetType.ASSET_TYPE_UNSPECIFIED;
                Boolean booleanDecode = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Asset(strDecode, assetTypeDecode, booleanDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            assetTypeDecode = Asset.AssetType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            booleanDecode = Boolean.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Asset redact(Asset value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Asset.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Asset.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ASSET_TYPE_UNSPECIFIED", "CURRENCY_PAIR", "INSTRUMENT", "OPTIONS_CONTRACT", "FUTURES", "INDEXES", "EVENT_CONTRACT", "PERPETUAL_CONTRACT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AssetType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AssetType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<AssetType> ADAPTER;
        public static final AssetType ASSET_TYPE_UNSPECIFIED;
        public static final AssetType CURRENCY_PAIR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AssetType EVENT_CONTRACT;
        public static final AssetType FUTURES;
        public static final AssetType INDEXES;
        public static final AssetType INSTRUMENT;
        public static final AssetType OPTIONS_CONTRACT;
        public static final AssetType PERPETUAL_CONTRACT;
        private final int value;

        private static final /* synthetic */ AssetType[] $values() {
            return new AssetType[]{ASSET_TYPE_UNSPECIFIED, CURRENCY_PAIR, INSTRUMENT, OPTIONS_CONTRACT, FUTURES, INDEXES, EVENT_CONTRACT, PERPETUAL_CONTRACT};
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
            CURRENCY_PAIR = new AssetType("CURRENCY_PAIR", 1, 1);
            INSTRUMENT = new AssetType("INSTRUMENT", 2, 2);
            OPTIONS_CONTRACT = new AssetType("OPTIONS_CONTRACT", 3, 3);
            FUTURES = new AssetType("FUTURES", 4, 4);
            INDEXES = new AssetType("INDEXES", 5, 5);
            EVENT_CONTRACT = new AssetType("EVENT_CONTRACT", 6, 6);
            PERPETUAL_CONTRACT = new AssetType("PERPETUAL_CONTRACT", 7, 7);
            AssetType[] assetTypeArr$values = $values();
            $VALUES = assetTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(assetTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AssetType>(orCreateKotlinClass, syntax, assetType) { // from class: com.robinhood.rosetta.eventlogging.Asset$AssetType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Asset.AssetType fromValue(int value) {
                    return Asset.AssetType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Asset.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Asset$AssetType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AssetType fromValue(int value) {
                switch (value) {
                    case 0:
                        return AssetType.ASSET_TYPE_UNSPECIFIED;
                    case 1:
                        return AssetType.CURRENCY_PAIR;
                    case 2:
                        return AssetType.INSTRUMENT;
                    case 3:
                        return AssetType.OPTIONS_CONTRACT;
                    case 4:
                        return AssetType.FUTURES;
                    case 5:
                        return AssetType.INDEXES;
                    case 6:
                        return AssetType.EVENT_CONTRACT;
                    case 7:
                        return AssetType.PERPETUAL_CONTRACT;
                    default:
                        return null;
                }
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
