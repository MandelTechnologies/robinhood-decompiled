package nummus.p512v1;

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

/* compiled from: DepositIncentivePromo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020\u000eH\u0016J\b\u0010$\u001a\u00020\u0007H\u0016Jf\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019¨\u0006'"}, m3636d2 = {"Lnummus/v1/DepositIncentivePromo;", "Lcom/squareup/wire/Message;", "", "is_promo_claimed", "", "is_account_eligible_for_promo", "promo_start_time", "", "promo_end_time", "required_deposit_fiat_amount", "Lcom/robinhood/rosetta/common/Money;", "target_tier", "Lnummus/v1/FeeTier;", "lockup_period_days", "", "net_deposited_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lnummus/v1/FeeTier;ILcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "()Z", "getPromo_start_time", "()Ljava/lang/String;", "getPromo_end_time", "getRequired_deposit_fiat_amount", "()Lcom/robinhood/rosetta/common/Money;", "getTarget_tier", "()Lnummus/v1/FeeTier;", "getLockup_period_days", "()I", "getNet_deposited_amount", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class DepositIncentivePromo extends Message {

    @JvmField
    public static final ProtoAdapter<DepositIncentivePromo> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isAccountEligibleForPromo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_account_eligible_for_promo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPromoClaimed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_promo_claimed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "lockupPeriodDays", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int lockup_period_days;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "netDepositedAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Money net_deposited_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "promoEndTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String promo_end_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "promoStartTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String promo_start_time;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "requiredDepositFiatAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money required_deposit_fiat_amount;

    @WireField(adapter = "nummus.v1.FeeTier#ADAPTER", jsonName = "targetTier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final FeeTier target_tier;

    public DepositIncentivePromo() {
        this(false, false, null, null, null, null, 0, null, null, 511, null);
    }

    public /* synthetic */ DepositIncentivePromo(boolean z, boolean z2, String str, String str2, Money money, FeeTier feeTier, int i, Money money2, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? null : money, (i2 & 32) != 0 ? null : feeTier, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : money2, (i2 & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29414newBuilder();
    }

    /* renamed from: is_promo_claimed, reason: from getter */
    public final boolean getIs_promo_claimed() {
        return this.is_promo_claimed;
    }

    /* renamed from: is_account_eligible_for_promo, reason: from getter */
    public final boolean getIs_account_eligible_for_promo() {
        return this.is_account_eligible_for_promo;
    }

    public final String getPromo_start_time() {
        return this.promo_start_time;
    }

    public final String getPromo_end_time() {
        return this.promo_end_time;
    }

    public final Money getRequired_deposit_fiat_amount() {
        return this.required_deposit_fiat_amount;
    }

    public final FeeTier getTarget_tier() {
        return this.target_tier;
    }

    public final int getLockup_period_days() {
        return this.lockup_period_days;
    }

    public final Money getNet_deposited_amount() {
        return this.net_deposited_amount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositIncentivePromo(boolean z, boolean z2, String promo_start_time, String promo_end_time, Money money, FeeTier feeTier, int i, Money money2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(promo_start_time, "promo_start_time");
        Intrinsics.checkNotNullParameter(promo_end_time, "promo_end_time");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_promo_claimed = z;
        this.is_account_eligible_for_promo = z2;
        this.promo_start_time = promo_start_time;
        this.promo_end_time = promo_end_time;
        this.required_deposit_fiat_amount = money;
        this.target_tier = feeTier;
        this.lockup_period_days = i;
        this.net_deposited_amount = money2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29414newBuilder() {
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
        return Intrinsics.areEqual(unknownFields(), depositIncentivePromo.unknownFields()) && this.is_promo_claimed == depositIncentivePromo.is_promo_claimed && this.is_account_eligible_for_promo == depositIncentivePromo.is_account_eligible_for_promo && Intrinsics.areEqual(this.promo_start_time, depositIncentivePromo.promo_start_time) && Intrinsics.areEqual(this.promo_end_time, depositIncentivePromo.promo_end_time) && Intrinsics.areEqual(this.required_deposit_fiat_amount, depositIncentivePromo.required_deposit_fiat_amount) && Intrinsics.areEqual(this.target_tier, depositIncentivePromo.target_tier) && this.lockup_period_days == depositIncentivePromo.lockup_period_days && Intrinsics.areEqual(this.net_deposited_amount, depositIncentivePromo.net_deposited_amount);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_promo_claimed)) * 37) + Boolean.hashCode(this.is_account_eligible_for_promo)) * 37) + this.promo_start_time.hashCode()) * 37) + this.promo_end_time.hashCode()) * 37;
        Money money = this.required_deposit_fiat_amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        FeeTier feeTier = this.target_tier;
        int iHashCode3 = (((iHashCode2 + (feeTier != null ? feeTier.hashCode() : 0)) * 37) + Integer.hashCode(this.lockup_period_days)) * 37;
        Money money2 = this.net_deposited_amount;
        int iHashCode4 = iHashCode3 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_promo_claimed=" + this.is_promo_claimed);
        arrayList.add("is_account_eligible_for_promo=" + this.is_account_eligible_for_promo);
        arrayList.add("promo_start_time=" + Internal.sanitize(this.promo_start_time));
        arrayList.add("promo_end_time=" + Internal.sanitize(this.promo_end_time));
        Money money = this.required_deposit_fiat_amount;
        if (money != null) {
            arrayList.add("required_deposit_fiat_amount=" + money);
        }
        FeeTier feeTier = this.target_tier;
        if (feeTier != null) {
            arrayList.add("target_tier=" + feeTier);
        }
        arrayList.add("lockup_period_days=" + this.lockup_period_days);
        Money money2 = this.net_deposited_amount;
        if (money2 != null) {
            arrayList.add("net_deposited_amount=" + money2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DepositIncentivePromo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DepositIncentivePromo copy$default(DepositIncentivePromo depositIncentivePromo, boolean z, boolean z2, String str, String str2, Money money, FeeTier feeTier, int i, Money money2, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = depositIncentivePromo.is_promo_claimed;
        }
        if ((i2 & 2) != 0) {
            z2 = depositIncentivePromo.is_account_eligible_for_promo;
        }
        if ((i2 & 4) != 0) {
            str = depositIncentivePromo.promo_start_time;
        }
        if ((i2 & 8) != 0) {
            str2 = depositIncentivePromo.promo_end_time;
        }
        if ((i2 & 16) != 0) {
            money = depositIncentivePromo.required_deposit_fiat_amount;
        }
        if ((i2 & 32) != 0) {
            feeTier = depositIncentivePromo.target_tier;
        }
        if ((i2 & 64) != 0) {
            i = depositIncentivePromo.lockup_period_days;
        }
        if ((i2 & 128) != 0) {
            money2 = depositIncentivePromo.net_deposited_amount;
        }
        if ((i2 & 256) != 0) {
            byteString = depositIncentivePromo.unknownFields();
        }
        Money money3 = money2;
        ByteString byteString2 = byteString;
        FeeTier feeTier2 = feeTier;
        int i3 = i;
        Money money4 = money;
        String str3 = str;
        return depositIncentivePromo.copy(z, z2, str3, str2, money4, feeTier2, i3, money3, byteString2);
    }

    public final DepositIncentivePromo copy(boolean is_promo_claimed, boolean is_account_eligible_for_promo, String promo_start_time, String promo_end_time, Money required_deposit_fiat_amount, FeeTier target_tier, int lockup_period_days, Money net_deposited_amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(promo_start_time, "promo_start_time");
        Intrinsics.checkNotNullParameter(promo_end_time, "promo_end_time");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DepositIncentivePromo(is_promo_claimed, is_account_eligible_for_promo, promo_start_time, promo_end_time, required_deposit_fiat_amount, target_tier, lockup_period_days, net_deposited_amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DepositIncentivePromo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DepositIncentivePromo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.DepositIncentivePromo$Companion$ADAPTER$1
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
                if (!Intrinsics.areEqual(value.getPromo_start_time(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPromo_start_time());
                }
                if (!Intrinsics.areEqual(value.getPromo_end_time(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getPromo_end_time());
                }
                if (value.getRequired_deposit_fiat_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(5, value.getRequired_deposit_fiat_amount());
                }
                if (value.getTarget_tier() != null) {
                    size += FeeTier.ADAPTER.encodedSizeWithTag(6, value.getTarget_tier());
                }
                if (value.getLockup_period_days() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getLockup_period_days()));
                }
                return value.getNet_deposited_amount() != null ? size + Money.ADAPTER.encodedSizeWithTag(8, value.getNet_deposited_amount()) : size;
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
                if (!Intrinsics.areEqual(value.getPromo_start_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPromo_start_time());
                }
                if (!Intrinsics.areEqual(value.getPromo_end_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPromo_end_time());
                }
                if (value.getRequired_deposit_fiat_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getRequired_deposit_fiat_amount());
                }
                if (value.getTarget_tier() != null) {
                    FeeTier.ADAPTER.encodeWithTag(writer, 6, (int) value.getTarget_tier());
                }
                if (value.getLockup_period_days() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getLockup_period_days()));
                }
                if (value.getNet_deposited_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getNet_deposited_amount());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DepositIncentivePromo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getNet_deposited_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getNet_deposited_amount());
                }
                if (value.getLockup_period_days() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getLockup_period_days()));
                }
                if (value.getTarget_tier() != null) {
                    FeeTier.ADAPTER.encodeWithTag(writer, 6, (int) value.getTarget_tier());
                }
                if (value.getRequired_deposit_fiat_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getRequired_deposit_fiat_amount());
                }
                if (!Intrinsics.areEqual(value.getPromo_end_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPromo_end_time());
                }
                if (!Intrinsics.areEqual(value.getPromo_start_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPromo_start_time());
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
                Money required_deposit_fiat_amount = value.getRequired_deposit_fiat_amount();
                Money moneyRedact = required_deposit_fiat_amount != null ? Money.ADAPTER.redact(required_deposit_fiat_amount) : null;
                FeeTier target_tier = value.getTarget_tier();
                FeeTier feeTierRedact = target_tier != null ? FeeTier.ADAPTER.redact(target_tier) : null;
                Money net_deposited_amount = value.getNet_deposited_amount();
                return DepositIncentivePromo.copy$default(value, false, false, null, null, moneyRedact, feeTierRedact, 0, net_deposited_amount != null ? Money.ADAPTER.redact(net_deposited_amount) : null, ByteString.EMPTY, 79, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DepositIncentivePromo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                int iIntValue = 0;
                String strDecode2 = "";
                FeeTier feeTierDecode = null;
                Money moneyDecode2 = null;
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
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
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
                            case 8:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new DepositIncentivePromo(zBooleanValue, zBooleanValue2, strDecode, strDecode2, moneyDecode, feeTierDecode, iIntValue, moneyDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
