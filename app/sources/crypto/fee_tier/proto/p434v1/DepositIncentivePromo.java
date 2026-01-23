package crypto.fee_tier.proto.p434v1;

import com.robinhood.rosetta.common.Money;
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
import p479j$.time.Instant;

/* compiled from: DepositIncentivePromo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/Bk\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJq\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\u0004\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\"R\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\"\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010\u001b¨\u00060"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/DepositIncentivePromo;", "Lcom/squareup/wire/Message;", "", "", "is_promo_claimed", "is_account_eligible_for_promo", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "promo_start_time", "promo_end_time", "Lcom/robinhood/rosetta/common/Money;", "required_deposit_fiat_amount", "Lcrypto/fee_tier/proto/v1/FeeTier;", "target_tier", "", "lockout_period_days", "Lokio/ByteString;", "unknownFields", "<init>", "(ZZLj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Money;Lcrypto/fee_tier/proto/v1/FeeTier;ILokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(ZZLj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Money;Lcrypto/fee_tier/proto/v1/FeeTier;ILokio/ByteString;)Lcrypto/fee_tier/proto/v1/DepositIncentivePromo;", "Z", "()Z", "Lj$/time/Instant;", "getPromo_start_time", "()Lj$/time/Instant;", "getPromo_end_time", "Lcom/robinhood/rosetta/common/Money;", "getRequired_deposit_fiat_amount", "()Lcom/robinhood/rosetta/common/Money;", "Lcrypto/fee_tier/proto/v1/FeeTier;", "getTarget_tier", "()Lcrypto/fee_tier/proto/v1/FeeTier;", "I", "getLockout_period_days", "Companion", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DepositIncentivePromo extends Message {

    @JvmField
    public static final ProtoAdapter<DepositIncentivePromo> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isAccountEligibleForPromo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_account_eligible_for_promo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPromoClaimed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_promo_claimed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "lockoutPeriodDays", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int lockout_period_days;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "promoEndTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant promo_end_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "promoStartTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant promo_start_time;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "requiredDepositFiatAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money required_deposit_fiat_amount;

    @WireField(adapter = "crypto.fee_tier.proto.v1.FeeTier#ADAPTER", jsonName = "targetTier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final FeeTier target_tier;

    public DepositIncentivePromo() {
        this(false, false, null, null, null, null, 0, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27779newBuilder();
    }

    /* renamed from: is_promo_claimed, reason: from getter */
    public final boolean getIs_promo_claimed() {
        return this.is_promo_claimed;
    }

    /* renamed from: is_account_eligible_for_promo, reason: from getter */
    public final boolean getIs_account_eligible_for_promo() {
        return this.is_account_eligible_for_promo;
    }

    public final Instant getPromo_start_time() {
        return this.promo_start_time;
    }

    public final Instant getPromo_end_time() {
        return this.promo_end_time;
    }

    public final Money getRequired_deposit_fiat_amount() {
        return this.required_deposit_fiat_amount;
    }

    public final FeeTier getTarget_tier() {
        return this.target_tier;
    }

    public final int getLockout_period_days() {
        return this.lockout_period_days;
    }

    public /* synthetic */ DepositIncentivePromo(boolean z, boolean z2, Instant instant, Instant instant2, Money money, FeeTier feeTier, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : instant, (i2 & 8) != 0 ? null : instant2, (i2 & 16) != 0 ? null : money, (i2 & 32) != 0 ? null : feeTier, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositIncentivePromo(boolean z, boolean z2, Instant instant, Instant instant2, Money money, FeeTier feeTier, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_promo_claimed = z;
        this.is_account_eligible_for_promo = z2;
        this.promo_start_time = instant;
        this.promo_end_time = instant2;
        this.required_deposit_fiat_amount = money;
        this.target_tier = feeTier;
        this.lockout_period_days = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27779newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DepositIncentivePromo)) {
            return false;
        }
        DepositIncentivePromo depositIncentivePromo = (DepositIncentivePromo) other;
        return Intrinsics.areEqual(unknownFields(), depositIncentivePromo.unknownFields()) && this.is_promo_claimed == depositIncentivePromo.is_promo_claimed && this.is_account_eligible_for_promo == depositIncentivePromo.is_account_eligible_for_promo && Intrinsics.areEqual(this.promo_start_time, depositIncentivePromo.promo_start_time) && Intrinsics.areEqual(this.promo_end_time, depositIncentivePromo.promo_end_time) && Intrinsics.areEqual(this.required_deposit_fiat_amount, depositIncentivePromo.required_deposit_fiat_amount) && Intrinsics.areEqual(this.target_tier, depositIncentivePromo.target_tier) && this.lockout_period_days == depositIncentivePromo.lockout_period_days;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_promo_claimed)) * 37) + Boolean.hashCode(this.is_account_eligible_for_promo)) * 37;
        Instant instant = this.promo_start_time;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.promo_end_time;
        int iHashCode3 = (iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Money money = this.required_deposit_fiat_amount;
        int iHashCode4 = (iHashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        FeeTier feeTier = this.target_tier;
        int iHashCode5 = ((iHashCode4 + (feeTier != null ? feeTier.hashCode() : 0)) * 37) + Integer.hashCode(this.lockout_period_days);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_promo_claimed=" + this.is_promo_claimed);
        arrayList.add("is_account_eligible_for_promo=" + this.is_account_eligible_for_promo);
        Instant instant = this.promo_start_time;
        if (instant != null) {
            arrayList.add("promo_start_time=" + instant);
        }
        Instant instant2 = this.promo_end_time;
        if (instant2 != null) {
            arrayList.add("promo_end_time=" + instant2);
        }
        Money money = this.required_deposit_fiat_amount;
        if (money != null) {
            arrayList.add("required_deposit_fiat_amount=" + money);
        }
        FeeTier feeTier = this.target_tier;
        if (feeTier != null) {
            arrayList.add("target_tier=" + feeTier);
        }
        arrayList.add("lockout_period_days=" + this.lockout_period_days);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DepositIncentivePromo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DepositIncentivePromo copy$default(DepositIncentivePromo depositIncentivePromo, boolean z, boolean z2, Instant instant, Instant instant2, Money money, FeeTier feeTier, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = depositIncentivePromo.is_promo_claimed;
        }
        if ((i2 & 2) != 0) {
            z2 = depositIncentivePromo.is_account_eligible_for_promo;
        }
        if ((i2 & 4) != 0) {
            instant = depositIncentivePromo.promo_start_time;
        }
        if ((i2 & 8) != 0) {
            instant2 = depositIncentivePromo.promo_end_time;
        }
        if ((i2 & 16) != 0) {
            money = depositIncentivePromo.required_deposit_fiat_amount;
        }
        if ((i2 & 32) != 0) {
            feeTier = depositIncentivePromo.target_tier;
        }
        if ((i2 & 64) != 0) {
            i = depositIncentivePromo.lockout_period_days;
        }
        if ((i2 & 128) != 0) {
            byteString = depositIncentivePromo.unknownFields();
        }
        int i3 = i;
        ByteString byteString2 = byteString;
        Money money2 = money;
        FeeTier feeTier2 = feeTier;
        return depositIncentivePromo.copy(z, z2, instant, instant2, money2, feeTier2, i3, byteString2);
    }

    public final DepositIncentivePromo copy(boolean is_promo_claimed, boolean is_account_eligible_for_promo, Instant promo_start_time, Instant promo_end_time, Money required_deposit_fiat_amount, FeeTier target_tier, int lockout_period_days, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DepositIncentivePromo(is_promo_claimed, is_account_eligible_for_promo, promo_start_time, promo_end_time, required_deposit_fiat_amount, target_tier, lockout_period_days, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DepositIncentivePromo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DepositIncentivePromo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto.fee_tier.proto.v1.DepositIncentivePromo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DepositIncentivePromo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_promo_claimed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_promo_claimed()));
                }
                if (value.getIs_account_eligible_for_promo()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_account_eligible_for_promo()));
                }
                if (value.getPromo_start_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getPromo_start_time());
                }
                if (value.getPromo_end_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getPromo_end_time());
                }
                if (value.getRequired_deposit_fiat_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(5, value.getRequired_deposit_fiat_amount());
                }
                if (value.getTarget_tier() != null) {
                    size += FeeTier.ADAPTER.encodedSizeWithTag(6, value.getTarget_tier());
                }
                return value.getLockout_period_days() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getLockout_period_days())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DepositIncentivePromo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_promo_claimed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_promo_claimed()));
                }
                if (value.getIs_account_eligible_for_promo()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_account_eligible_for_promo()));
                }
                if (value.getPromo_start_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getPromo_start_time());
                }
                if (value.getPromo_end_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getPromo_end_time());
                }
                if (value.getRequired_deposit_fiat_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getRequired_deposit_fiat_amount());
                }
                if (value.getTarget_tier() != null) {
                    FeeTier.ADAPTER.encodeWithTag(writer, 6, (int) value.getTarget_tier());
                }
                if (value.getLockout_period_days() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getLockout_period_days()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DepositIncentivePromo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLockout_period_days() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getLockout_period_days()));
                }
                if (value.getTarget_tier() != null) {
                    FeeTier.ADAPTER.encodeWithTag(writer, 6, (int) value.getTarget_tier());
                }
                if (value.getRequired_deposit_fiat_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getRequired_deposit_fiat_amount());
                }
                if (value.getPromo_end_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getPromo_end_time());
                }
                if (value.getPromo_start_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getPromo_start_time());
                }
                if (value.getIs_account_eligible_for_promo()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_account_eligible_for_promo()));
                }
                if (value.getIs_promo_claimed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_promo_claimed()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DepositIncentivePromo redact(DepositIncentivePromo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant promo_start_time = value.getPromo_start_time();
                Instant instantRedact = promo_start_time != null ? ProtoAdapter.INSTANT.redact(promo_start_time) : null;
                Instant promo_end_time = value.getPromo_end_time();
                Instant instantRedact2 = promo_end_time != null ? ProtoAdapter.INSTANT.redact(promo_end_time) : null;
                Money required_deposit_fiat_amount = value.getRequired_deposit_fiat_amount();
                Money moneyRedact = required_deposit_fiat_amount != null ? Money.ADAPTER.redact(required_deposit_fiat_amount) : null;
                FeeTier target_tier = value.getTarget_tier();
                return DepositIncentivePromo.copy$default(value, false, false, instantRedact, instantRedact2, moneyRedact, target_tier != null ? FeeTier.ADAPTER.redact(target_tier) : null, 0, ByteString.EMPTY, 67, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DepositIncentivePromo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                int iIntValue = 0;
                Instant instantDecode2 = null;
                Money moneyDecode = null;
                FeeTier feeTierDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 2:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 4:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 5:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 6:
                                feeTierDecode = FeeTier.ADAPTER.decode(reader);
                                break;
                            case 7:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new DepositIncentivePromo(zBooleanValue, zBooleanValue2, instantDecode, instantDecode2, moneyDecode, feeTierDecode, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
