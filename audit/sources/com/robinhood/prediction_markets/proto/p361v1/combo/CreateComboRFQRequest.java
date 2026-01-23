package com.robinhood.prediction_markets.proto.p361v1.combo;

import com.robinhood.prediction_markets.proto.p361v1.idl.ComboLeg;
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

/* compiled from: CreateComboRFQRequest.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010)\u001a\u00020\u0002H\u0017J\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020\u0011H\u0016J\b\u0010.\u001a\u00020\u0006H\u0016Jw\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u00100R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010!\u001a\u0004\b$\u0010%R\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010!\u001a\u0004\b'\u0010(¨\u00062"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequest;", "Lcom/squareup/wire/Message;", "", "combo_legs", "Lcom/robinhood/prediction_markets/proto/v1/combo/ComboLegs;", "combo_instrument_id", "", "contracts", "notional_amount_money", "Lcom/robinhood/rosetta/common/Money;", "use_default_quantity", "", "notional_amount", "legs", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComboLeg;", "quantity", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/combo/ComboLegs;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;ILokio/ByteString;)V", "getCombo_legs", "()Lcom/robinhood/prediction_markets/proto/v1/combo/ComboLegs;", "getCombo_instrument_id", "()Ljava/lang/String;", "getContracts", "getNotional_amount_money", "()Lcom/robinhood/rosetta/common/Money;", "getUse_default_quantity", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNotional_amount$annotations", "()V", "getNotional_amount", "getQuantity$annotations", "getQuantity", "()I", "getLegs$annotations", "getLegs", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "(Lcom/robinhood/prediction_markets/proto/v1/combo/ComboLegs;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;ILokio/ByteString;)Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQRequest;", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CreateComboRFQRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreateComboRFQRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "comboInstrumentId", oneofName = "combo_instrument", schemaIndex = 1, tag = 6)
    private final String combo_instrument_id;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.combo.ComboLegs#ADAPTER", jsonName = "comboLegs", oneofName = "combo_instrument", schemaIndex = 0, tag = 7)
    private final ComboLegs combo_legs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", oneofName = "desired_quantity", schemaIndex = 2, tag = 4)
    private final String contracts;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ComboLeg#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 1)
    private final List<ComboLeg> legs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "notionalAmount", oneofName = "desired_quantity", schemaIndex = 5, tag = 3)
    private final String notional_amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "notionalAmountMoney", oneofName = "desired_quantity", schemaIndex = 3, tag = 5)
    private final Money notional_amount_money;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 2)
    private final int quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "useDefaultQuantity", oneofName = "desired_quantity", schemaIndex = 4, tag = 8)
    private final Boolean use_default_quantity;

    public CreateComboRFQRequest() {
        this(null, null, null, null, null, null, null, 0, null, 511, null);
    }

    @Deprecated
    public static /* synthetic */ void getLegs$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getNotional_amount$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getQuantity$annotations() {
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23756newBuilder();
    }

    public final ComboLegs getCombo_legs() {
        return this.combo_legs;
    }

    public final String getCombo_instrument_id() {
        return this.combo_instrument_id;
    }

    public final String getContracts() {
        return this.contracts;
    }

    public final Money getNotional_amount_money() {
        return this.notional_amount_money;
    }

    public final Boolean getUse_default_quantity() {
        return this.use_default_quantity;
    }

    public final String getNotional_amount() {
        return this.notional_amount;
    }

    public /* synthetic */ CreateComboRFQRequest(ComboLegs comboLegs, String str, String str2, Money money, Boolean bool, String str3, List list, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : comboLegs, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : money, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getQuantity() {
        return this.quantity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateComboRFQRequest(ComboLegs comboLegs, String str, String str2, Money money, Boolean bool, String str3, List<ComboLeg> legs, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.combo_legs = comboLegs;
        this.combo_instrument_id = str;
        this.contracts = str2;
        this.notional_amount_money = money;
        this.use_default_quantity = bool;
        this.notional_amount = str3;
        this.quantity = i;
        this.legs = Internal.immutableCopyOf("legs", legs);
        if (Internal.countNonNull(comboLegs, str) > 1) {
            throw new IllegalArgumentException("At most one of combo_legs, combo_instrument_id may be non-null");
        }
        if (Internal.countNonNull(str2, money, bool, str3, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of contracts, notional_amount_money, use_default_quantity, notional_amount may be non-null");
        }
    }

    public final List<ComboLeg> getLegs() {
        return this.legs;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23756newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateComboRFQRequest)) {
            return false;
        }
        CreateComboRFQRequest createComboRFQRequest = (CreateComboRFQRequest) other;
        return Intrinsics.areEqual(unknownFields(), createComboRFQRequest.unknownFields()) && Intrinsics.areEqual(this.combo_legs, createComboRFQRequest.combo_legs) && Intrinsics.areEqual(this.combo_instrument_id, createComboRFQRequest.combo_instrument_id) && Intrinsics.areEqual(this.contracts, createComboRFQRequest.contracts) && Intrinsics.areEqual(this.notional_amount_money, createComboRFQRequest.notional_amount_money) && Intrinsics.areEqual(this.use_default_quantity, createComboRFQRequest.use_default_quantity) && Intrinsics.areEqual(this.notional_amount, createComboRFQRequest.notional_amount) && Intrinsics.areEqual(this.legs, createComboRFQRequest.legs) && this.quantity == createComboRFQRequest.quantity;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ComboLegs comboLegs = this.combo_legs;
        int iHashCode2 = (iHashCode + (comboLegs != null ? comboLegs.hashCode() : 0)) * 37;
        String str = this.combo_instrument_id;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.contracts;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.notional_amount_money;
        int iHashCode5 = (iHashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        Boolean bool = this.use_default_quantity;
        int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str3 = this.notional_amount;
        int iHashCode7 = ((((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.legs.hashCode()) * 37) + Integer.hashCode(this.quantity);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ComboLegs comboLegs = this.combo_legs;
        if (comboLegs != null) {
            arrayList.add("combo_legs=" + comboLegs);
        }
        String str = this.combo_instrument_id;
        if (str != null) {
            arrayList.add("combo_instrument_id=" + Internal.sanitize(str));
        }
        String str2 = this.contracts;
        if (str2 != null) {
            arrayList.add("contracts=" + Internal.sanitize(str2));
        }
        Money money = this.notional_amount_money;
        if (money != null) {
            arrayList.add("notional_amount_money=" + money);
        }
        Boolean bool = this.use_default_quantity;
        if (bool != null) {
            arrayList.add("use_default_quantity=" + bool);
        }
        String str3 = this.notional_amount;
        if (str3 != null) {
            arrayList.add("notional_amount=" + Internal.sanitize(str3));
        }
        if (!this.legs.isEmpty()) {
            arrayList.add("legs=" + this.legs);
        }
        arrayList.add("quantity=" + this.quantity);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateComboRFQRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateComboRFQRequest copy$default(CreateComboRFQRequest createComboRFQRequest, ComboLegs comboLegs, String str, String str2, Money money, Boolean bool, String str3, List list, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            comboLegs = createComboRFQRequest.combo_legs;
        }
        if ((i2 & 2) != 0) {
            str = createComboRFQRequest.combo_instrument_id;
        }
        if ((i2 & 4) != 0) {
            str2 = createComboRFQRequest.contracts;
        }
        if ((i2 & 8) != 0) {
            money = createComboRFQRequest.notional_amount_money;
        }
        if ((i2 & 16) != 0) {
            bool = createComboRFQRequest.use_default_quantity;
        }
        if ((i2 & 32) != 0) {
            str3 = createComboRFQRequest.notional_amount;
        }
        if ((i2 & 64) != 0) {
            list = createComboRFQRequest.legs;
        }
        if ((i2 & 128) != 0) {
            i = createComboRFQRequest.quantity;
        }
        if ((i2 & 256) != 0) {
            byteString = createComboRFQRequest.unknownFields();
        }
        int i3 = i;
        ByteString byteString2 = byteString;
        String str4 = str3;
        List list2 = list;
        Boolean bool2 = bool;
        String str5 = str2;
        return createComboRFQRequest.copy(comboLegs, str, str5, money, bool2, str4, list2, i3, byteString2);
    }

    public final CreateComboRFQRequest copy(ComboLegs combo_legs, String combo_instrument_id, String contracts2, Money notional_amount_money, Boolean use_default_quantity, String notional_amount, List<ComboLeg> legs, int quantity, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateComboRFQRequest(combo_legs, combo_instrument_id, contracts2, notional_amount_money, use_default_quantity, notional_amount, legs, quantity, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateComboRFQRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateComboRFQRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.combo.CreateComboRFQRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateComboRFQRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ComboLegs.ADAPTER.encodedSizeWithTag(7, value.getCombo_legs());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(6, value.getCombo_instrument_id()) + protoAdapter.encodedSizeWithTag(4, value.getContracts()) + Money.ADAPTER.encodedSizeWithTag(5, value.getNotional_amount_money()) + ProtoAdapter.BOOL.encodedSizeWithTag(8, value.getUse_default_quantity()) + protoAdapter.encodedSizeWithTag(3, value.getNotional_amount()) + ComboLeg.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getLegs());
                return value.getQuantity() != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getQuantity())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateComboRFQRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ComboLeg.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getLegs());
                if (value.getQuantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getQuantity()));
                }
                ComboLegs.ADAPTER.encodeWithTag(writer, 7, (int) value.getCombo_legs());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getCombo_instrument_id());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getContracts());
                Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getNotional_amount_money());
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) value.getUse_default_quantity());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getNotional_amount());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateComboRFQRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getNotional_amount());
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) value.getUse_default_quantity());
                Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getNotional_amount_money());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getContracts());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getCombo_instrument_id());
                ComboLegs.ADAPTER.encodeWithTag(writer, 7, (int) value.getCombo_legs());
                if (value.getQuantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getQuantity()));
                }
                ComboLeg.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getLegs());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateComboRFQRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                ComboLegs comboLegsDecode = null;
                String strDecode = null;
                Money moneyDecode = null;
                Boolean boolDecode = null;
                String strDecode2 = null;
                int iIntValue = 0;
                String strDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                arrayList.add(ComboLeg.ADAPTER.decode(reader));
                                break;
                            case 2:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                comboLegsDecode = ComboLegs.ADAPTER.decode(reader);
                                break;
                            case 8:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CreateComboRFQRequest(comboLegsDecode, strDecode3, strDecode, moneyDecode, boolDecode, strDecode2, arrayList, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateComboRFQRequest redact(CreateComboRFQRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ComboLegs combo_legs = value.getCombo_legs();
                ComboLegs comboLegsRedact = combo_legs != null ? ComboLegs.ADAPTER.redact(combo_legs) : null;
                Money notional_amount_money = value.getNotional_amount_money();
                return CreateComboRFQRequest.copy$default(value, comboLegsRedact, null, null, notional_amount_money != null ? Money.ADAPTER.redact(notional_amount_money) : null, null, null, Internal.m26823redactElements(value.getLegs(), ComboLeg.ADAPTER), 0, ByteString.EMPTY, 182, null);
            }
        };
    }
}
