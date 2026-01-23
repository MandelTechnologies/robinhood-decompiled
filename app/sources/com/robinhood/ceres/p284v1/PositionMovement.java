package com.robinhood.ceres.p284v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.ceres.p284v1.PositionMovement;
import com.robinhood.utils.buildconfig.BuildFlavors;
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

/* compiled from: PositionMovement.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0006H\u0016JV\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006%"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PositionMovement;", "Lcom/squareup/wire/Message;", "", "asset_class", "Lcom/robinhood/ceres/v1/PositionMovement$AssetClass;", "instrument_id", "", "quantity", BuildFlavors.EXTERNAL, "", "lot_price", "symbol", "contract_multiplier", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/ceres/v1/PositionMovement$AssetClass;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAsset_class", "()Lcom/robinhood/ceres/v1/PositionMovement$AssetClass;", "getInstrument_id", "()Ljava/lang/String;", "getQuantity", "getExternal", "()Z", "getLot_price", "getSymbol", "getContract_multiplier", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "AssetClass", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PositionMovement extends Message {

    @JvmField
    public static final ProtoAdapter<PositionMovement> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.PositionMovement$AssetClass#ADAPTER", jsonName = "assetClass", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AssetClass asset_class;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractMultiplier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String contract_multiplier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean external;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lotPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String lot_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String symbol;

    public PositionMovement() {
        this(null, null, null, false, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20410newBuilder();
    }

    public final AssetClass getAsset_class() {
        return this.asset_class;
    }

    public /* synthetic */ PositionMovement(AssetClass assetClass, String str, String str2, boolean z, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AssetClass.ASSET_CLASS_UNSPECIFIED : assetClass, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final boolean getExternal() {
        return this.external;
    }

    public final String getLot_price() {
        return this.lot_price;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getContract_multiplier() {
        return this.contract_multiplier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionMovement(AssetClass asset_class, String instrument_id, String quantity, boolean z, String lot_price, String symbol, String contract_multiplier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(lot_price, "lot_price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(contract_multiplier, "contract_multiplier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset_class = asset_class;
        this.instrument_id = instrument_id;
        this.quantity = quantity;
        this.external = z;
        this.lot_price = lot_price;
        this.symbol = symbol;
        this.contract_multiplier = contract_multiplier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20410newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PositionMovement)) {
            return false;
        }
        PositionMovement positionMovement = (PositionMovement) other;
        return Intrinsics.areEqual(unknownFields(), positionMovement.unknownFields()) && this.asset_class == positionMovement.asset_class && Intrinsics.areEqual(this.instrument_id, positionMovement.instrument_id) && Intrinsics.areEqual(this.quantity, positionMovement.quantity) && this.external == positionMovement.external && Intrinsics.areEqual(this.lot_price, positionMovement.lot_price) && Intrinsics.areEqual(this.symbol, positionMovement.symbol) && Intrinsics.areEqual(this.contract_multiplier, positionMovement.contract_multiplier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.asset_class.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.quantity.hashCode()) * 37) + Boolean.hashCode(this.external)) * 37) + this.lot_price.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.contract_multiplier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("asset_class=" + this.asset_class);
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("external=" + this.external);
        arrayList.add("lot_price=" + Internal.sanitize(this.lot_price));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("contract_multiplier=" + Internal.sanitize(this.contract_multiplier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PositionMovement{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PositionMovement copy$default(PositionMovement positionMovement, AssetClass assetClass, String str, String str2, boolean z, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            assetClass = positionMovement.asset_class;
        }
        if ((i & 2) != 0) {
            str = positionMovement.instrument_id;
        }
        if ((i & 4) != 0) {
            str2 = positionMovement.quantity;
        }
        if ((i & 8) != 0) {
            z = positionMovement.external;
        }
        if ((i & 16) != 0) {
            str3 = positionMovement.lot_price;
        }
        if ((i & 32) != 0) {
            str4 = positionMovement.symbol;
        }
        if ((i & 64) != 0) {
            str5 = positionMovement.contract_multiplier;
        }
        if ((i & 128) != 0) {
            byteString = positionMovement.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str3;
        String str8 = str4;
        return positionMovement.copy(assetClass, str, str2, z, str7, str8, str6, byteString2);
    }

    public final PositionMovement copy(AssetClass asset_class, String instrument_id, String quantity, boolean external, String lot_price, String symbol, String contract_multiplier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(lot_price, "lot_price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(contract_multiplier, "contract_multiplier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PositionMovement(asset_class, instrument_id, quantity, external, lot_price, symbol, contract_multiplier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PositionMovement.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PositionMovement>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.PositionMovement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PositionMovement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAsset_class() != PositionMovement.AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    size += PositionMovement.AssetClass.ADAPTER.encodedSizeWithTag(1, value.getAsset_class());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getQuantity());
                }
                if (value.getExternal()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getExternal()));
                }
                if (!Intrinsics.areEqual(value.getLot_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLot_price());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getSymbol());
                }
                return !Intrinsics.areEqual(value.getContract_multiplier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getContract_multiplier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PositionMovement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAsset_class() != PositionMovement.AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    PositionMovement.AssetClass.ADAPTER.encodeWithTag(writer, 1, (int) value.getAsset_class());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuantity());
                }
                if (value.getExternal()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getExternal()));
                }
                if (!Intrinsics.areEqual(value.getLot_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLot_price());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getContract_multiplier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getContract_multiplier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PositionMovement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getContract_multiplier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getContract_multiplier());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getLot_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLot_price());
                }
                if (value.getExternal()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getExternal()));
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (value.getAsset_class() != PositionMovement.AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    PositionMovement.AssetClass.ADAPTER.encodeWithTag(writer, 1, (int) value.getAsset_class());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PositionMovement decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PositionMovement.AssetClass assetClass = PositionMovement.AssetClass.ASSET_CLASS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                boolean zBooleanValue = false;
                PositionMovement.AssetClass assetClassDecode = assetClass;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    assetClassDecode = PositionMovement.AssetClass.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PositionMovement(assetClassDecode, strDecode5, strDecode, zBooleanValue, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PositionMovement redact(PositionMovement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PositionMovement.copy$default(value, null, null, null, false, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PositionMovement.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PositionMovement$AssetClass;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ASSET_CLASS_UNSPECIFIED", "ASSET_CLASS_OUTRIGHT_FUTURES", "ASSET_CLASS_EVENT_CONTRACT", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AssetClass implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AssetClass[] $VALUES;

        @JvmField
        public static final ProtoAdapter<AssetClass> ADAPTER;
        public static final AssetClass ASSET_CLASS_EVENT_CONTRACT;
        public static final AssetClass ASSET_CLASS_OUTRIGHT_FUTURES;
        public static final AssetClass ASSET_CLASS_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ AssetClass[] $values() {
            return new AssetClass[]{ASSET_CLASS_UNSPECIFIED, ASSET_CLASS_OUTRIGHT_FUTURES, ASSET_CLASS_EVENT_CONTRACT};
        }

        @JvmStatic
        public static final AssetClass fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AssetClass> getEntries() {
            return $ENTRIES;
        }

        private AssetClass(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AssetClass assetClass = new AssetClass("ASSET_CLASS_UNSPECIFIED", 0, 0);
            ASSET_CLASS_UNSPECIFIED = assetClass;
            ASSET_CLASS_OUTRIGHT_FUTURES = new AssetClass("ASSET_CLASS_OUTRIGHT_FUTURES", 1, 1);
            ASSET_CLASS_EVENT_CONTRACT = new AssetClass("ASSET_CLASS_EVENT_CONTRACT", 2, 2);
            AssetClass[] assetClassArr$values = $values();
            $VALUES = assetClassArr$values;
            $ENTRIES = EnumEntries2.enumEntries(assetClassArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetClass.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AssetClass>(orCreateKotlinClass, syntax, assetClass) { // from class: com.robinhood.ceres.v1.PositionMovement$AssetClass$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PositionMovement.AssetClass fromValue(int value) {
                    return PositionMovement.AssetClass.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PositionMovement.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PositionMovement$AssetClass$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/PositionMovement$AssetClass;", "fromValue", "value", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AssetClass fromValue(int value) {
                if (value == 0) {
                    return AssetClass.ASSET_CLASS_UNSPECIFIED;
                }
                if (value == 1) {
                    return AssetClass.ASSET_CLASS_OUTRIGHT_FUTURES;
                }
                if (value != 2) {
                    return null;
                }
                return AssetClass.ASSET_CLASS_EVENT_CONTRACT;
            }
        }

        public static AssetClass valueOf(String str) {
            return (AssetClass) Enum.valueOf(AssetClass.class, str);
        }

        public static AssetClass[] values() {
            return (AssetClass[]) $VALUES.clone();
        }
    }
}
