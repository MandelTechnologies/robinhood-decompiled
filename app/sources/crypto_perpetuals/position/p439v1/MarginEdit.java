package crypto_perpetuals.position.p439v1;

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
import crypto_perpetuals.common.p435v1.MarginMode;
import crypto_perpetuals.common.p435v1.Money;
import crypto_perpetuals.position.p439v1.MarginEdit;
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
import p479j$.time.Instant;

/* compiled from: MarginEdit.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002>?B\u008d\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J\u0093\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b5\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b6\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109R\"\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\b;\u0010<R\"\u0010\u0014\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b=\u0010<¨\u0006@"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/MarginEdit;", "Lcom/squareup/wire/Message;", "", "", "id", "Lcrypto_perpetuals/position/v1/MarginEdit$Status;", "status", "Lcrypto_perpetuals/position/v1/MarginEditType;", "edit_type", "Lcrypto_perpetuals/common/v1/MarginMode;", "margin_mode", "Lcrypto_perpetuals/common/v1/Money;", "amount", "contract_id", "position_id", "Lcrypto_perpetuals/position/v1/BuyingPowerEffect;", "buying_power_effect", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lcrypto_perpetuals/position/v1/MarginEdit$Status;Lcrypto_perpetuals/position/v1/MarginEditType;Lcrypto_perpetuals/common/v1/MarginMode;Lcrypto_perpetuals/common/v1/Money;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/position/v1/BuyingPowerEffect;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lcrypto_perpetuals/position/v1/MarginEdit$Status;Lcrypto_perpetuals/position/v1/MarginEditType;Lcrypto_perpetuals/common/v1/MarginMode;Lcrypto_perpetuals/common/v1/Money;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/position/v1/BuyingPowerEffect;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)Lcrypto_perpetuals/position/v1/MarginEdit;", "Ljava/lang/String;", "getId", "Lcrypto_perpetuals/position/v1/MarginEdit$Status;", "getStatus", "()Lcrypto_perpetuals/position/v1/MarginEdit$Status;", "Lcrypto_perpetuals/position/v1/MarginEditType;", "getEdit_type", "()Lcrypto_perpetuals/position/v1/MarginEditType;", "Lcrypto_perpetuals/common/v1/MarginMode;", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginMode;", "Lcrypto_perpetuals/common/v1/Money;", "getAmount", "()Lcrypto_perpetuals/common/v1/Money;", "getContract_id", "getPosition_id", "Lcrypto_perpetuals/position/v1/BuyingPowerEffect;", "getBuying_power_effect", "()Lcrypto_perpetuals/position/v1/BuyingPowerEffect;", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getUpdated_at", "Companion", "Status", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class MarginEdit extends Message {

    @JvmField
    public static final ProtoAdapter<MarginEdit> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money amount;

    @WireField(adapter = "crypto_perpetuals.position.v1.BuyingPowerEffect#ADAPTER", jsonName = "buyingPowerEffect", schemaIndex = 7, tag = 8)
    private final BuyingPowerEffect buying_power_effect;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", schemaIndex = 5, tag = 6)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Instant created_at;

    @WireField(adapter = "crypto_perpetuals.position.v1.MarginEditType#ADAPTER", jsonName = "editType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final MarginEditType edit_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "crypto_perpetuals.common.v1.MarginMode#ADAPTER", jsonName = "marginMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final MarginMode margin_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "positionId", schemaIndex = 6, tag = 7)
    private final String position_id;

    @WireField(adapter = "crypto_perpetuals.position.v1.MarginEdit$Status#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Status status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Instant updated_at;

    public MarginEdit() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27858newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ MarginEdit(String str, Status status, MarginEditType marginEditType, MarginMode marginMode, Money money, String str2, String str3, BuyingPowerEffect buyingPowerEffect, Instant instant, Instant instant2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Status.STATUS_UNSPECIFIED : status, (i & 4) != 0 ? MarginEditType.MARGIN_EDIT_TYPE_UNSPECIFIED : marginEditType, (i & 8) != 0 ? MarginMode.MARGIN_MODE_UNSPECIFIED : marginMode, (i & 16) != 0 ? null : money, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : buyingPowerEffect, (i & 256) != 0 ? null : instant, (i & 512) != 0 ? null : instant2, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Status getStatus() {
        return this.status;
    }

    public final MarginEditType getEdit_type() {
        return this.edit_type;
    }

    public final MarginMode getMargin_mode() {
        return this.margin_mode;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final String getPosition_id() {
        return this.position_id;
    }

    public final BuyingPowerEffect getBuying_power_effect() {
        return this.buying_power_effect;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginEdit(String id, Status status, MarginEditType edit_type, MarginMode margin_mode, Money money, String str, String str2, BuyingPowerEffect buyingPowerEffect, Instant instant, Instant instant2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(edit_type, "edit_type");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.status = status;
        this.edit_type = edit_type;
        this.margin_mode = margin_mode;
        this.amount = money;
        this.contract_id = str;
        this.position_id = str2;
        this.buying_power_effect = buyingPowerEffect;
        this.created_at = instant;
        this.updated_at = instant2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27858newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginEdit)) {
            return false;
        }
        MarginEdit marginEdit = (MarginEdit) other;
        return Intrinsics.areEqual(unknownFields(), marginEdit.unknownFields()) && Intrinsics.areEqual(this.id, marginEdit.id) && this.status == marginEdit.status && this.edit_type == marginEdit.edit_type && this.margin_mode == marginEdit.margin_mode && Intrinsics.areEqual(this.amount, marginEdit.amount) && Intrinsics.areEqual(this.contract_id, marginEdit.contract_id) && Intrinsics.areEqual(this.position_id, marginEdit.position_id) && Intrinsics.areEqual(this.buying_power_effect, marginEdit.buying_power_effect) && Intrinsics.areEqual(this.created_at, marginEdit.created_at) && Intrinsics.areEqual(this.updated_at, marginEdit.updated_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.status.hashCode()) * 37) + this.edit_type.hashCode()) * 37) + this.margin_mode.hashCode()) * 37;
        Money money = this.amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        String str = this.contract_id;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.position_id;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        BuyingPowerEffect buyingPowerEffect = this.buying_power_effect;
        int iHashCode5 = (iHashCode4 + (buyingPowerEffect != null ? buyingPowerEffect.hashCode() : 0)) * 37;
        Instant instant = this.created_at;
        int iHashCode6 = (iHashCode5 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.updated_at;
        int iHashCode7 = iHashCode6 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("status=" + this.status);
        arrayList.add("edit_type=" + this.edit_type);
        arrayList.add("margin_mode=" + this.margin_mode);
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        String str = this.contract_id;
        if (str != null) {
            arrayList.add("contract_id=" + Internal.sanitize(str));
        }
        String str2 = this.position_id;
        if (str2 != null) {
            arrayList.add("position_id=" + Internal.sanitize(str2));
        }
        BuyingPowerEffect buyingPowerEffect = this.buying_power_effect;
        if (buyingPowerEffect != null) {
            arrayList.add("buying_power_effect=" + buyingPowerEffect);
        }
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        Instant instant2 = this.updated_at;
        if (instant2 != null) {
            arrayList.add("updated_at=" + instant2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginEdit{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginEdit copy$default(MarginEdit marginEdit, String str, Status status, MarginEditType marginEditType, MarginMode marginMode, Money money, String str2, String str3, BuyingPowerEffect buyingPowerEffect, Instant instant, Instant instant2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginEdit.id;
        }
        if ((i & 2) != 0) {
            status = marginEdit.status;
        }
        if ((i & 4) != 0) {
            marginEditType = marginEdit.edit_type;
        }
        if ((i & 8) != 0) {
            marginMode = marginEdit.margin_mode;
        }
        if ((i & 16) != 0) {
            money = marginEdit.amount;
        }
        if ((i & 32) != 0) {
            str2 = marginEdit.contract_id;
        }
        if ((i & 64) != 0) {
            str3 = marginEdit.position_id;
        }
        if ((i & 128) != 0) {
            buyingPowerEffect = marginEdit.buying_power_effect;
        }
        if ((i & 256) != 0) {
            instant = marginEdit.created_at;
        }
        if ((i & 512) != 0) {
            instant2 = marginEdit.updated_at;
        }
        if ((i & 1024) != 0) {
            byteString = marginEdit.unknownFields();
        }
        Instant instant3 = instant2;
        ByteString byteString2 = byteString;
        BuyingPowerEffect buyingPowerEffect2 = buyingPowerEffect;
        Instant instant4 = instant;
        String str4 = str2;
        String str5 = str3;
        Money money2 = money;
        MarginEditType marginEditType2 = marginEditType;
        return marginEdit.copy(str, status, marginEditType2, marginMode, money2, str4, str5, buyingPowerEffect2, instant4, instant3, byteString2);
    }

    public final MarginEdit copy(String id, Status status, MarginEditType edit_type, MarginMode margin_mode, Money amount, String contract_id, String position_id, BuyingPowerEffect buying_power_effect, Instant created_at, Instant updated_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(edit_type, "edit_type");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginEdit(id, status, edit_type, margin_mode, amount, contract_id, position_id, buying_power_effect, created_at, updated_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginEdit.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginEdit>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.position.v1.MarginEdit$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginEdit value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getStatus() != MarginEdit.Status.STATUS_UNSPECIFIED) {
                    size += MarginEdit.Status.ADAPTER.encodedSizeWithTag(2, value.getStatus());
                }
                if (value.getEdit_type() != MarginEditType.MARGIN_EDIT_TYPE_UNSPECIFIED) {
                    size += MarginEditType.ADAPTER.encodedSizeWithTag(3, value.getEdit_type());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    size += MarginMode.ADAPTER.encodedSizeWithTag(4, value.getMargin_mode());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(5, value.getAmount());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(6, value.getContract_id()) + protoAdapter.encodedSizeWithTag(7, value.getPosition_id()) + BuyingPowerEffect.ADAPTER.encodedSizeWithTag(8, value.getBuying_power_effect());
                if (value.getCreated_at() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.getCreated_at());
                }
                return value.getUpdated_at() != null ? iEncodedSizeWithTag + ProtoAdapter.INSTANT.encodedSizeWithTag(10, value.getUpdated_at()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginEdit value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getStatus() != MarginEdit.Status.STATUS_UNSPECIFIED) {
                    MarginEdit.Status.ADAPTER.encodeWithTag(writer, 2, (int) value.getStatus());
                }
                if (value.getEdit_type() != MarginEditType.MARGIN_EDIT_TYPE_UNSPECIFIED) {
                    MarginEditType.ADAPTER.encodeWithTag(writer, 3, (int) value.getEdit_type());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 4, (int) value.getMargin_mode());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getAmount());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getContract_id());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getPosition_id());
                BuyingPowerEffect.ADAPTER.encodeWithTag(writer, 8, (int) value.getBuying_power_effect());
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 10, (int) value.getUpdated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginEdit value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 10, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getCreated_at());
                }
                BuyingPowerEffect.ADAPTER.encodeWithTag(writer, 8, (int) value.getBuying_power_effect());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getPosition_id());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getContract_id());
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getAmount());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 4, (int) value.getMargin_mode());
                }
                if (value.getEdit_type() != MarginEditType.MARGIN_EDIT_TYPE_UNSPECIFIED) {
                    MarginEditType.ADAPTER.encodeWithTag(writer, 3, (int) value.getEdit_type());
                }
                if (value.getStatus() != MarginEdit.Status.STATUS_UNSPECIFIED) {
                    MarginEdit.Status.ADAPTER.encodeWithTag(writer, 2, (int) value.getStatus());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarginEdit decode(ProtoReader reader) throws IOException {
                MarginEdit.Status status;
                MarginEditType marginEditType;
                MarginMode marginMode;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                MarginEdit.Status status2 = MarginEdit.Status.STATUS_UNSPECIFIED;
                MarginEditType marginEditType2 = MarginEditType.MARGIN_EDIT_TYPE_UNSPECIFIED;
                MarginMode marginMode2 = MarginMode.MARGIN_MODE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                String strDecode = null;
                String strDecode2 = null;
                BuyingPowerEffect buyingPowerEffectDecode = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                String strDecode3 = "";
                MarginMode marginModeDecode = marginMode2;
                MarginEditType marginEditTypeDecode = marginEditType2;
                MarginEdit.Status statusDecode = status2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                status = statusDecode;
                                marginEditType = marginEditTypeDecode;
                                marginMode = marginModeDecode;
                                str = strDecode3;
                                try {
                                    statusDecode = MarginEdit.Status.ADAPTER.decode(reader);
                                    strDecode3 = str;
                                    marginModeDecode = marginMode;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                marginEditTypeDecode = marginEditType;
                                break;
                            case 3:
                                status = statusDecode;
                                marginEditType = marginEditTypeDecode;
                                try {
                                    marginEditTypeDecode = MarginEditType.ADAPTER.decode(reader);
                                    statusDecode = status;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    marginMode = marginModeDecode;
                                    str = strDecode3;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 4:
                                try {
                                    marginModeDecode = MarginMode.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    status = statusDecode;
                                    marginEditType = marginEditTypeDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 5:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                buyingPowerEffectDecode = BuyingPowerEffect.ADAPTER.decode(reader);
                                break;
                            case 9:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 10:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                status = statusDecode;
                                marginEditType = marginEditTypeDecode;
                                marginMode = marginModeDecode;
                                str = strDecode3;
                                strDecode3 = str;
                                marginModeDecode = marginMode;
                                statusDecode = status;
                                marginEditTypeDecode = marginEditType;
                                break;
                        }
                    } else {
                        return new MarginEdit(strDecode3, statusDecode, marginEditTypeDecode, marginModeDecode, moneyDecode, strDecode, strDecode2, buyingPowerEffectDecode, instantDecode, instantDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginEdit redact(MarginEdit value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                BuyingPowerEffect buying_power_effect = value.getBuying_power_effect();
                BuyingPowerEffect buyingPowerEffectRedact = buying_power_effect != null ? BuyingPowerEffect.ADAPTER.redact(buying_power_effect) : null;
                Instant created_at = value.getCreated_at();
                Instant instantRedact = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant updated_at = value.getUpdated_at();
                return MarginEdit.copy$default(value, null, null, null, null, moneyRedact, null, null, buyingPowerEffectRedact, instantRedact, updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null, ByteString.EMPTY, 111, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarginEdit.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/MarginEdit$Status;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATUS_UNSPECIFIED", "STATUS_PENDING", "STATUS_COMPLETED", "STATUS_FAILED", "STATUS_PARTIALLY_FILLED", "Companion", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Status implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Status> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Status STATUS_COMPLETED;
        public static final Status STATUS_FAILED;
        public static final Status STATUS_PARTIALLY_FILLED;
        public static final Status STATUS_PENDING;
        public static final Status STATUS_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{STATUS_UNSPECIFIED, STATUS_PENDING, STATUS_COMPLETED, STATUS_FAILED, STATUS_PARTIALLY_FILLED};
        }

        @JvmStatic
        public static final Status fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Status status = new Status("STATUS_UNSPECIFIED", 0, 0);
            STATUS_UNSPECIFIED = status;
            STATUS_PENDING = new Status("STATUS_PENDING", 1, 1);
            STATUS_COMPLETED = new Status("STATUS_COMPLETED", 2, 2);
            STATUS_FAILED = new Status("STATUS_FAILED", 3, 3);
            STATUS_PARTIALLY_FILLED = new Status("STATUS_PARTIALLY_FILLED", 4, 4);
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Status.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Status>(orCreateKotlinClass, syntax, status) { // from class: crypto_perpetuals.position.v1.MarginEdit$Status$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public MarginEdit.Status fromValue(int value) {
                    return MarginEdit.Status.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: MarginEdit.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/MarginEdit$Status$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto_perpetuals/position/v1/MarginEdit$Status;", "fromValue", "value", "", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Status fromValue(int value) {
                if (value == 0) {
                    return Status.STATUS_UNSPECIFIED;
                }
                if (value == 1) {
                    return Status.STATUS_PENDING;
                }
                if (value == 2) {
                    return Status.STATUS_COMPLETED;
                }
                if (value == 3) {
                    return Status.STATUS_FAILED;
                }
                if (value != 4) {
                    return null;
                }
                return Status.STATUS_PARTIALLY_FILLED;
            }
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }
}
