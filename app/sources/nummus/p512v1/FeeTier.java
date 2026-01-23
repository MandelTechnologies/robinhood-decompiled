package nummus.p512v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: FeeTier.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JR\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006!"}, m3636d2 = {"Lnummus/v1/FeeTier;", "Lcom/squareup/wire/Message;", "", "tier_id", "", "fee_ratio", "min_volume", "max_volume", "min_volume_money", "Lcom/robinhood/rosetta/common/Money;", "max_volume_money", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getTier_id", "()Ljava/lang/String;", "getFee_ratio", "getMin_volume", "getMax_volume", "getMin_volume_money", "()Lcom/robinhood/rosetta/common/Money;", "getMax_volume_money", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class FeeTier extends Message {

    @JvmField
    public static final ProtoAdapter<FeeTier> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String fee_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxVolume", schemaIndex = 3, tag = 4)
    private final String max_volume;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "maxVolumeMoney", schemaIndex = 5, tag = 6)
    private final Money max_volume_money;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minVolume", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String min_volume;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "minVolumeMoney", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money min_volume_money;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tierId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String tier_id;

    public FeeTier() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ FeeTier(String str, String str2, String str3, String str4, Money money, Money money2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : money, (i & 32) != 0 ? null : money2, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29418newBuilder();
    }

    public final String getTier_id() {
        return this.tier_id;
    }

    public final String getFee_ratio() {
        return this.fee_ratio;
    }

    public final String getMin_volume() {
        return this.min_volume;
    }

    public final String getMax_volume() {
        return this.max_volume;
    }

    public final Money getMin_volume_money() {
        return this.min_volume_money;
    }

    public final Money getMax_volume_money() {
        return this.max_volume_money;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeTier(String tier_id, String fee_ratio, String min_volume, String str, Money money, Money money2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(tier_id, "tier_id");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(min_volume, "min_volume");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.tier_id = tier_id;
        this.fee_ratio = fee_ratio;
        this.min_volume = min_volume;
        this.max_volume = str;
        this.min_volume_money = money;
        this.max_volume_money = money2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29418newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FeeTier)) {
            return false;
        }
        FeeTier feeTier = (FeeTier) other;
        return Intrinsics.areEqual(unknownFields(), feeTier.unknownFields()) && Intrinsics.areEqual(this.tier_id, feeTier.tier_id) && Intrinsics.areEqual(this.fee_ratio, feeTier.fee_ratio) && Intrinsics.areEqual(this.min_volume, feeTier.min_volume) && Intrinsics.areEqual(this.max_volume, feeTier.max_volume) && Intrinsics.areEqual(this.min_volume_money, feeTier.min_volume_money) && Intrinsics.areEqual(this.max_volume_money, feeTier.max_volume_money);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.tier_id.hashCode()) * 37) + this.fee_ratio.hashCode()) * 37) + this.min_volume.hashCode()) * 37;
        String str = this.max_volume;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.min_volume_money;
        int iHashCode3 = (iHashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.max_volume_money;
        int iHashCode4 = iHashCode3 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("tier_id=" + Internal.sanitize(this.tier_id));
        arrayList.add("fee_ratio=" + Internal.sanitize(this.fee_ratio));
        arrayList.add("min_volume=" + Internal.sanitize(this.min_volume));
        String str = this.max_volume;
        if (str != null) {
            arrayList.add("max_volume=" + Internal.sanitize(str));
        }
        Money money = this.min_volume_money;
        if (money != null) {
            arrayList.add("min_volume_money=" + money);
        }
        Money money2 = this.max_volume_money;
        if (money2 != null) {
            arrayList.add("max_volume_money=" + money2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeeTier{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FeeTier copy$default(FeeTier feeTier, String str, String str2, String str3, String str4, Money money, Money money2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeTier.tier_id;
        }
        if ((i & 2) != 0) {
            str2 = feeTier.fee_ratio;
        }
        if ((i & 4) != 0) {
            str3 = feeTier.min_volume;
        }
        if ((i & 8) != 0) {
            str4 = feeTier.max_volume;
        }
        if ((i & 16) != 0) {
            money = feeTier.min_volume_money;
        }
        if ((i & 32) != 0) {
            money2 = feeTier.max_volume_money;
        }
        if ((i & 64) != 0) {
            byteString = feeTier.unknownFields();
        }
        Money money3 = money2;
        ByteString byteString2 = byteString;
        Money money4 = money;
        String str5 = str3;
        return feeTier.copy(str, str2, str5, str4, money4, money3, byteString2);
    }

    public final FeeTier copy(String tier_id, String fee_ratio, String min_volume, String max_volume, Money min_volume_money, Money max_volume_money, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(tier_id, "tier_id");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(min_volume, "min_volume");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FeeTier(tier_id, fee_ratio, min_volume, max_volume, min_volume_money, max_volume_money, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeTier.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FeeTier>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.FeeTier$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FeeTier value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTier_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTier_id());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFee_ratio());
                }
                if (!Intrinsics.areEqual(value.getMin_volume(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getMin_volume());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getMax_volume());
                if (value.getMin_volume_money() != null) {
                    iEncodedSizeWithTag += Money.ADAPTER.encodedSizeWithTag(5, value.getMin_volume_money());
                }
                return iEncodedSizeWithTag + Money.ADAPTER.encodedSizeWithTag(6, value.getMax_volume_money());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FeeTier value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTier_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTier_id());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFee_ratio());
                }
                if (!Intrinsics.areEqual(value.getMin_volume(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMin_volume());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMax_volume());
                if (value.getMin_volume_money() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getMin_volume_money());
                }
                Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getMax_volume_money());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FeeTier value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getMax_volume_money());
                if (value.getMin_volume_money() != null) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getMin_volume_money());
                }
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getMax_volume());
                if (!Intrinsics.areEqual(value.getMin_volume(), "")) {
                    protoAdapter2.encodeWithTag(writer, 3, (int) value.getMin_volume());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    protoAdapter2.encodeWithTag(writer, 2, (int) value.getFee_ratio());
                }
                if (Intrinsics.areEqual(value.getTier_id(), "")) {
                    return;
                }
                protoAdapter2.encodeWithTag(writer, 1, (int) value.getTier_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeeTier redact(FeeTier value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money min_volume_money = value.getMin_volume_money();
                Money moneyRedact = min_volume_money != null ? Money.ADAPTER.redact(min_volume_money) : null;
                Money max_volume_money = value.getMax_volume_money();
                return FeeTier.copy$default(value, null, null, null, null, moneyRedact, max_volume_money != null ? Money.ADAPTER.redact(max_volume_money) : null, ByteString.EMPTY, 15, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeeTier decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = null;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                String strDecode4 = strDecode2;
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
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 6:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new FeeTier(strDecode, strDecode4, strDecode2, strDecode3, moneyDecode, moneyDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
