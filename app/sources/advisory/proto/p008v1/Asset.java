package advisory.proto.p008v1;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.rosetta.common.Money;
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

/* compiled from: Asset.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JX\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006#"}, m3636d2 = {"Ladvisory/proto/v1/Asset;", "Lcom/squareup/wire/Message;", "", "id", "", "symbol", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY, "Lcom/robinhood/rosetta/common/Money;", "allocation_percentage", "is_restrictable", "", "allocation_reason", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;ZLjava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getSymbol", "getName", "getEquity", "()Lcom/robinhood/rosetta/common/Money;", "getAllocation_percentage", "()Z", "getAllocation_reason", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class Asset extends Message {

    @JvmField
    public static final ProtoAdapter<Asset> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "allocationPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String allocation_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "allocationReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String allocation_reason;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money equity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isRestrictable", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean is_restrictable;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String symbol;

    public Asset() {
        this(null, null, null, null, null, false, null, null, 255, null);
    }

    public /* synthetic */ Asset(String str, String str2, String str3, Money money, String str4, boolean z, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : money, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4405newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getName() {
        return this.name;
    }

    public final Money getEquity() {
        return this.equity;
    }

    public final String getAllocation_percentage() {
        return this.allocation_percentage;
    }

    /* renamed from: is_restrictable, reason: from getter */
    public final boolean getIs_restrictable() {
        return this.is_restrictable;
    }

    public final String getAllocation_reason() {
        return this.allocation_reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Asset(String id, String symbol, String name, Money money, String allocation_percentage, boolean z, String allocation_reason, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(allocation_percentage, "allocation_percentage");
        Intrinsics.checkNotNullParameter(allocation_reason, "allocation_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.equity = money;
        this.allocation_percentage = allocation_percentage;
        this.is_restrictable = z;
        this.allocation_reason = allocation_reason;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4405newBuilder() {
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
        return Intrinsics.areEqual(unknownFields(), asset.unknownFields()) && Intrinsics.areEqual(this.id, asset.id) && Intrinsics.areEqual(this.symbol, asset.symbol) && Intrinsics.areEqual(this.name, asset.name) && Intrinsics.areEqual(this.equity, asset.equity) && Intrinsics.areEqual(this.allocation_percentage, asset.allocation_percentage) && this.is_restrictable == asset.is_restrictable && Intrinsics.areEqual(this.allocation_reason, asset.allocation_reason);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.name.hashCode()) * 37;
        Money money = this.equity;
        int iHashCode2 = ((((((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.allocation_percentage.hashCode()) * 37) + Boolean.hashCode(this.is_restrictable)) * 37) + this.allocation_reason.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("name=" + Internal.sanitize(this.name));
        Money money = this.equity;
        if (money != null) {
            arrayList.add("equity=" + money);
        }
        arrayList.add("allocation_percentage=" + Internal.sanitize(this.allocation_percentage));
        arrayList.add("is_restrictable=" + this.is_restrictable);
        arrayList.add("allocation_reason=" + Internal.sanitize(this.allocation_reason));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Asset{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Asset copy$default(Asset asset, String str, String str2, String str3, Money money, String str4, boolean z, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = asset.id;
        }
        if ((i & 2) != 0) {
            str2 = asset.symbol;
        }
        if ((i & 4) != 0) {
            str3 = asset.name;
        }
        if ((i & 8) != 0) {
            money = asset.equity;
        }
        if ((i & 16) != 0) {
            str4 = asset.allocation_percentage;
        }
        if ((i & 32) != 0) {
            z = asset.is_restrictable;
        }
        if ((i & 64) != 0) {
            str5 = asset.allocation_reason;
        }
        if ((i & 128) != 0) {
            byteString = asset.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str4;
        boolean z2 = z;
        return asset.copy(str, str2, str3, money, str7, z2, str6, byteString2);
    }

    public final Asset copy(String id, String symbol, String name, Money equity, String allocation_percentage, boolean is_restrictable, String allocation_reason, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(allocation_percentage, "allocation_percentage");
        Intrinsics.checkNotNullParameter(allocation_reason, "allocation_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Asset(id, symbol, name, equity, allocation_percentage, is_restrictable, allocation_reason, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Asset.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Asset>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.Asset$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Asset value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getName());
                }
                if (value.getEquity() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getEquity());
                }
                if (!Intrinsics.areEqual(value.getAllocation_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAllocation_percentage());
                }
                if (value.getIs_restrictable()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIs_restrictable()));
                }
                return !Intrinsics.areEqual(value.getAllocation_reason(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getAllocation_reason()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Asset value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
                }
                if (value.getEquity() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getEquity());
                }
                if (!Intrinsics.areEqual(value.getAllocation_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAllocation_percentage());
                }
                if (value.getIs_restrictable()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_restrictable()));
                }
                if (!Intrinsics.areEqual(value.getAllocation_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAllocation_reason());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Asset value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAllocation_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAllocation_reason());
                }
                if (value.getIs_restrictable()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_restrictable()));
                }
                if (!Intrinsics.areEqual(value.getAllocation_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAllocation_percentage());
                }
                if (value.getEquity() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getEquity());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSymbol());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Asset redact(Asset value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money equity = value.getEquity();
                return Asset.copy$default(value, null, null, null, equity != null ? Money.ADAPTER.redact(equity) : null, null, false, null, ByteString.EMPTY, 119, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Asset decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                Money moneyDecode = null;
                boolean zBooleanValue = false;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new Asset(strDecode, strDecode4, strDecode5, moneyDecode, strDecode2, zBooleanValue, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
