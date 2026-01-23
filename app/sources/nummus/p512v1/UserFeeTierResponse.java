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

/* compiled from: UserFeeTierResponse.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 A2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001ABÓ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u00108\u001a\u00020\u0002H\u0017J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0096\u0002J\b\u0010=\u001a\u00020\u0006H\u0016J\b\u0010>\u001a\u00020\rH\u0016J×\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010@R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00106¨\u0006B"}, m3636d2 = {"Lnummus/v1/UserFeeTierResponse;", "Lcom/squareup/wire/Message;", "", "current_fee_tier", "Lnummus/v1/FeeTier;", "evaluation_period_days", "", "current_period_trading_amount", "Lcom/robinhood/rosetta/common/Money;", "required_trading_amount_for_next_tier", "available_tiers", "", "account_id", "", "promos", "Lnummus/v1/FeeTierPromo;", "current_tier_expiration_time", "fee_tier_source", "Lnummus/v1/FeeTierSource;", "next_tier", "lockup_period_in_seconds", "trading_volume_tier_progress", "prev_tier", "fee_tier_status", "Lnummus/v1/FeeTierStatus;", "projected_downgrade_time", "projected_downgrade_tier", "unknownFields", "Lokio/ByteString;", "<init>", "(Lnummus/v1/FeeTier;ILcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lnummus/v1/FeeTierSource;Lnummus/v1/FeeTier;Ljava/lang/Integer;Ljava/lang/String;Lnummus/v1/FeeTier;Lnummus/v1/FeeTierStatus;Ljava/lang/String;Lnummus/v1/FeeTier;Lokio/ByteString;)V", "getCurrent_fee_tier", "()Lnummus/v1/FeeTier;", "getEvaluation_period_days", "()I", "getCurrent_period_trading_amount", "()Lcom/robinhood/rosetta/common/Money;", "getRequired_trading_amount_for_next_tier", "getAccount_id", "()Ljava/lang/String;", "getCurrent_tier_expiration_time", "getFee_tier_source", "()Lnummus/v1/FeeTierSource;", "getNext_tier", "getLockup_period_in_seconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrading_volume_tier_progress", "getPrev_tier", "getFee_tier_status", "()Lnummus/v1/FeeTierStatus;", "getProjected_downgrade_time", "getProjected_downgrade_tier", "getAvailable_tiers", "()Ljava/util/List;", "getPromos", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Lnummus/v1/FeeTier;ILcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lnummus/v1/FeeTierSource;Lnummus/v1/FeeTier;Ljava/lang/Integer;Ljava/lang/String;Lnummus/v1/FeeTier;Lnummus/v1/FeeTierStatus;Ljava/lang/String;Lnummus/v1/FeeTier;Lokio/ByteString;)Lnummus/v1/UserFeeTierResponse;", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class UserFeeTierResponse extends Message {

    @JvmField
    public static final ProtoAdapter<UserFeeTierResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String account_id;

    @WireField(adapter = "nummus.v1.FeeTier#ADAPTER", jsonName = "availableTiers", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<FeeTier> available_tiers;

    @WireField(adapter = "nummus.v1.FeeTier#ADAPTER", jsonName = "currentFeeTier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FeeTier current_fee_tier;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "currentPeriodTradingAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money current_period_trading_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currentTierExpirationTime", schemaIndex = 7, tag = 8)
    private final String current_tier_expiration_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "evaluationPeriodDays", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int evaluation_period_days;

    @WireField(adapter = "nummus.v1.FeeTierSource#ADAPTER", jsonName = "feeTierSource", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final FeeTierSource fee_tier_source;

    @WireField(adapter = "nummus.v1.FeeTierStatus#ADAPTER", jsonName = "feeTierStatus", schemaIndex = 13, tag = 14)
    private final FeeTierStatus fee_tier_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "lockupPeriodInSeconds", schemaIndex = 10, tag = 11)
    private final Integer lockup_period_in_seconds;

    @WireField(adapter = "nummus.v1.FeeTier#ADAPTER", jsonName = "nextTier", schemaIndex = 9, tag = 10)
    private final FeeTier next_tier;

    @WireField(adapter = "nummus.v1.FeeTier#ADAPTER", jsonName = "prevTier", schemaIndex = 12, tag = 13)
    private final FeeTier prev_tier;

    @WireField(adapter = "nummus.v1.FeeTier#ADAPTER", jsonName = "projectedDowngradeTier", schemaIndex = 15, tag = 16)
    private final FeeTier projected_downgrade_tier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "projectedDowngradeTime", schemaIndex = 14, tag = 15)
    private final String projected_downgrade_time;

    @WireField(adapter = "nummus.v1.FeeTierPromo#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<FeeTierPromo> promos;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "requiredTradingAmountForNextTier", schemaIndex = 3, tag = 4)
    private final Money required_trading_amount_for_next_tier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tradingVolumeTierProgress", schemaIndex = 11, tag = 12)
    private final String trading_volume_tier_progress;

    public UserFeeTierResponse() {
        this(null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29446newBuilder();
    }

    public final FeeTier getCurrent_fee_tier() {
        return this.current_fee_tier;
    }

    public final int getEvaluation_period_days() {
        return this.evaluation_period_days;
    }

    public final Money getCurrent_period_trading_amount() {
        return this.current_period_trading_amount;
    }

    public final Money getRequired_trading_amount_for_next_tier() {
        return this.required_trading_amount_for_next_tier;
    }

    public /* synthetic */ UserFeeTierResponse(FeeTier feeTier, int i, Money money, Money money2, List list, String str, List list2, String str2, FeeTierSource feeTierSource, FeeTier feeTier2, Integer num, String str3, FeeTier feeTier3, FeeTierStatus feeTierStatus, String str4, FeeTier feeTier4, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : feeTier, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : money, (i2 & 8) != 0 ? null : money2, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? FeeTierSource.FEE_TIER_SOURCE_UNSPECIFIED : feeTierSource, (i2 & 512) != 0 ? null : feeTier2, (i2 & 1024) != 0 ? null : num, (i2 & 2048) != 0 ? null : str3, (i2 & 4096) != 0 ? null : feeTier3, (i2 & 8192) != 0 ? null : feeTierStatus, (i2 & 16384) != 0 ? null : str4, (i2 & 32768) != 0 ? null : feeTier4, (i2 & 65536) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getCurrent_tier_expiration_time() {
        return this.current_tier_expiration_time;
    }

    public final FeeTierSource getFee_tier_source() {
        return this.fee_tier_source;
    }

    public final FeeTier getNext_tier() {
        return this.next_tier;
    }

    public final Integer getLockup_period_in_seconds() {
        return this.lockup_period_in_seconds;
    }

    public final String getTrading_volume_tier_progress() {
        return this.trading_volume_tier_progress;
    }

    public final FeeTier getPrev_tier() {
        return this.prev_tier;
    }

    public final FeeTierStatus getFee_tier_status() {
        return this.fee_tier_status;
    }

    public final String getProjected_downgrade_time() {
        return this.projected_downgrade_time;
    }

    public final FeeTier getProjected_downgrade_tier() {
        return this.projected_downgrade_tier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserFeeTierResponse(FeeTier feeTier, int i, Money money, Money money2, List<FeeTier> available_tiers, String account_id, List<FeeTierPromo> promos, String str, FeeTierSource fee_tier_source, FeeTier feeTier2, Integer num, String str2, FeeTier feeTier3, FeeTierStatus feeTierStatus, String str3, FeeTier feeTier4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(available_tiers, "available_tiers");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(promos, "promos");
        Intrinsics.checkNotNullParameter(fee_tier_source, "fee_tier_source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.current_fee_tier = feeTier;
        this.evaluation_period_days = i;
        this.current_period_trading_amount = money;
        this.required_trading_amount_for_next_tier = money2;
        this.account_id = account_id;
        this.current_tier_expiration_time = str;
        this.fee_tier_source = fee_tier_source;
        this.next_tier = feeTier2;
        this.lockup_period_in_seconds = num;
        this.trading_volume_tier_progress = str2;
        this.prev_tier = feeTier3;
        this.fee_tier_status = feeTierStatus;
        this.projected_downgrade_time = str3;
        this.projected_downgrade_tier = feeTier4;
        this.available_tiers = Internal.immutableCopyOf("available_tiers", available_tiers);
        this.promos = Internal.immutableCopyOf("promos", promos);
    }

    public final List<FeeTier> getAvailable_tiers() {
        return this.available_tiers;
    }

    public final List<FeeTierPromo> getPromos() {
        return this.promos;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29446newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UserFeeTierResponse)) {
            return false;
        }
        UserFeeTierResponse userFeeTierResponse = (UserFeeTierResponse) other;
        return Intrinsics.areEqual(unknownFields(), userFeeTierResponse.unknownFields()) && Intrinsics.areEqual(this.current_fee_tier, userFeeTierResponse.current_fee_tier) && this.evaluation_period_days == userFeeTierResponse.evaluation_period_days && Intrinsics.areEqual(this.current_period_trading_amount, userFeeTierResponse.current_period_trading_amount) && Intrinsics.areEqual(this.required_trading_amount_for_next_tier, userFeeTierResponse.required_trading_amount_for_next_tier) && Intrinsics.areEqual(this.available_tiers, userFeeTierResponse.available_tiers) && Intrinsics.areEqual(this.account_id, userFeeTierResponse.account_id) && Intrinsics.areEqual(this.promos, userFeeTierResponse.promos) && Intrinsics.areEqual(this.current_tier_expiration_time, userFeeTierResponse.current_tier_expiration_time) && this.fee_tier_source == userFeeTierResponse.fee_tier_source && Intrinsics.areEqual(this.next_tier, userFeeTierResponse.next_tier) && Intrinsics.areEqual(this.lockup_period_in_seconds, userFeeTierResponse.lockup_period_in_seconds) && Intrinsics.areEqual(this.trading_volume_tier_progress, userFeeTierResponse.trading_volume_tier_progress) && Intrinsics.areEqual(this.prev_tier, userFeeTierResponse.prev_tier) && this.fee_tier_status == userFeeTierResponse.fee_tier_status && Intrinsics.areEqual(this.projected_downgrade_time, userFeeTierResponse.projected_downgrade_time) && Intrinsics.areEqual(this.projected_downgrade_tier, userFeeTierResponse.projected_downgrade_tier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FeeTier feeTier = this.current_fee_tier;
        int iHashCode2 = (((iHashCode + (feeTier != null ? feeTier.hashCode() : 0)) * 37) + Integer.hashCode(this.evaluation_period_days)) * 37;
        Money money = this.current_period_trading_amount;
        int iHashCode3 = (iHashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.required_trading_amount_for_next_tier;
        int iHashCode4 = (((((((iHashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.available_tiers.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.promos.hashCode()) * 37;
        String str = this.current_tier_expiration_time;
        int iHashCode5 = (((iHashCode4 + (str != null ? str.hashCode() : 0)) * 37) + this.fee_tier_source.hashCode()) * 37;
        FeeTier feeTier2 = this.next_tier;
        int iHashCode6 = (iHashCode5 + (feeTier2 != null ? feeTier2.hashCode() : 0)) * 37;
        Integer num = this.lockup_period_in_seconds;
        int iHashCode7 = (iHashCode6 + (num != null ? num.hashCode() : 0)) * 37;
        String str2 = this.trading_volume_tier_progress;
        int iHashCode8 = (iHashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        FeeTier feeTier3 = this.prev_tier;
        int iHashCode9 = (iHashCode8 + (feeTier3 != null ? feeTier3.hashCode() : 0)) * 37;
        FeeTierStatus feeTierStatus = this.fee_tier_status;
        int iHashCode10 = (iHashCode9 + (feeTierStatus != null ? feeTierStatus.hashCode() : 0)) * 37;
        String str3 = this.projected_downgrade_time;
        int iHashCode11 = (iHashCode10 + (str3 != null ? str3.hashCode() : 0)) * 37;
        FeeTier feeTier4 = this.projected_downgrade_tier;
        int iHashCode12 = iHashCode11 + (feeTier4 != null ? feeTier4.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        FeeTier feeTier = this.current_fee_tier;
        if (feeTier != null) {
            arrayList.add("current_fee_tier=" + feeTier);
        }
        arrayList.add("evaluation_period_days=" + this.evaluation_period_days);
        Money money = this.current_period_trading_amount;
        if (money != null) {
            arrayList.add("current_period_trading_amount=" + money);
        }
        Money money2 = this.required_trading_amount_for_next_tier;
        if (money2 != null) {
            arrayList.add("required_trading_amount_for_next_tier=" + money2);
        }
        if (!this.available_tiers.isEmpty()) {
            arrayList.add("available_tiers=" + this.available_tiers);
        }
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        if (!this.promos.isEmpty()) {
            arrayList.add("promos=" + this.promos);
        }
        String str = this.current_tier_expiration_time;
        if (str != null) {
            arrayList.add("current_tier_expiration_time=" + Internal.sanitize(str));
        }
        arrayList.add("fee_tier_source=" + this.fee_tier_source);
        FeeTier feeTier2 = this.next_tier;
        if (feeTier2 != null) {
            arrayList.add("next_tier=" + feeTier2);
        }
        Integer num = this.lockup_period_in_seconds;
        if (num != null) {
            arrayList.add("lockup_period_in_seconds=" + num);
        }
        String str2 = this.trading_volume_tier_progress;
        if (str2 != null) {
            arrayList.add("trading_volume_tier_progress=" + Internal.sanitize(str2));
        }
        FeeTier feeTier3 = this.prev_tier;
        if (feeTier3 != null) {
            arrayList.add("prev_tier=" + feeTier3);
        }
        FeeTierStatus feeTierStatus = this.fee_tier_status;
        if (feeTierStatus != null) {
            arrayList.add("fee_tier_status=" + feeTierStatus);
        }
        String str3 = this.projected_downgrade_time;
        if (str3 != null) {
            arrayList.add("projected_downgrade_time=" + Internal.sanitize(str3));
        }
        FeeTier feeTier4 = this.projected_downgrade_tier;
        if (feeTier4 != null) {
            arrayList.add("projected_downgrade_tier=" + feeTier4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UserFeeTierResponse{", "}", 0, null, null, 56, null);
    }

    public final UserFeeTierResponse copy(FeeTier current_fee_tier, int evaluation_period_days, Money current_period_trading_amount, Money required_trading_amount_for_next_tier, List<FeeTier> available_tiers, String account_id, List<FeeTierPromo> promos, String current_tier_expiration_time, FeeTierSource fee_tier_source, FeeTier next_tier, Integer lockup_period_in_seconds, String trading_volume_tier_progress, FeeTier prev_tier, FeeTierStatus fee_tier_status, String projected_downgrade_time, FeeTier projected_downgrade_tier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(available_tiers, "available_tiers");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(promos, "promos");
        Intrinsics.checkNotNullParameter(fee_tier_source, "fee_tier_source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UserFeeTierResponse(current_fee_tier, evaluation_period_days, current_period_trading_amount, required_trading_amount_for_next_tier, available_tiers, account_id, promos, current_tier_expiration_time, fee_tier_source, next_tier, lockup_period_in_seconds, trading_volume_tier_progress, prev_tier, fee_tier_status, projected_downgrade_time, projected_downgrade_tier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserFeeTierResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UserFeeTierResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.UserFeeTierResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UserFeeTierResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCurrent_fee_tier() != null) {
                    size += FeeTier.ADAPTER.encodedSizeWithTag(1, value.getCurrent_fee_tier());
                }
                if (value.getEvaluation_period_days() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getEvaluation_period_days()));
                }
                if (value.getCurrent_period_trading_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getCurrent_period_trading_amount());
                }
                int iEncodedSizeWithTag = size + Money.ADAPTER.encodedSizeWithTag(4, value.getRequired_trading_amount_for_next_tier());
                ProtoAdapter<FeeTier> protoAdapter = FeeTier.ADAPTER;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(5, value.getAvailable_tiers());
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getAccount_id());
                }
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + FeeTierPromo.ADAPTER.asRepeated().encodedSizeWithTag(7, value.getPromos());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter2.encodedSizeWithTag(8, value.getCurrent_tier_expiration_time());
                if (value.getFee_tier_source() != FeeTierSource.FEE_TIER_SOURCE_UNSPECIFIED) {
                    iEncodedSizeWithTag4 += FeeTierSource.ADAPTER.encodedSizeWithTag(9, value.getFee_tier_source());
                }
                return iEncodedSizeWithTag4 + protoAdapter.encodedSizeWithTag(10, value.getNext_tier()) + ProtoAdapter.INT32.encodedSizeWithTag(11, value.getLockup_period_in_seconds()) + protoAdapter2.encodedSizeWithTag(12, value.getTrading_volume_tier_progress()) + protoAdapter.encodedSizeWithTag(13, value.getPrev_tier()) + FeeTierStatus.ADAPTER.encodedSizeWithTag(14, value.getFee_tier_status()) + protoAdapter2.encodedSizeWithTag(15, value.getProjected_downgrade_time()) + protoAdapter.encodedSizeWithTag(16, value.getProjected_downgrade_tier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UserFeeTierResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCurrent_fee_tier() != null) {
                    FeeTier.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrent_fee_tier());
                }
                if (value.getEvaluation_period_days() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getEvaluation_period_days()));
                }
                if (value.getCurrent_period_trading_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getCurrent_period_trading_amount());
                }
                Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getRequired_trading_amount_for_next_tier());
                ProtoAdapter<FeeTier> protoAdapter = FeeTier.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getAvailable_tiers());
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAccount_id());
                }
                FeeTierPromo.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getPromos());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getCurrent_tier_expiration_time());
                if (value.getFee_tier_source() != FeeTierSource.FEE_TIER_SOURCE_UNSPECIFIED) {
                    FeeTierSource.ADAPTER.encodeWithTag(writer, 9, (int) value.getFee_tier_source());
                }
                protoAdapter.encodeWithTag(writer, 10, (int) value.getNext_tier());
                ProtoAdapter.INT32.encodeWithTag(writer, 11, (int) value.getLockup_period_in_seconds());
                protoAdapter2.encodeWithTag(writer, 12, (int) value.getTrading_volume_tier_progress());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getPrev_tier());
                FeeTierStatus.ADAPTER.encodeWithTag(writer, 14, (int) value.getFee_tier_status());
                protoAdapter2.encodeWithTag(writer, 15, (int) value.getProjected_downgrade_time());
                protoAdapter.encodeWithTag(writer, 16, (int) value.getProjected_downgrade_tier());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UserFeeTierResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<FeeTier> protoAdapter = FeeTier.ADAPTER;
                protoAdapter.encodeWithTag(writer, 16, (int) value.getProjected_downgrade_tier());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 15, (int) value.getProjected_downgrade_time());
                FeeTierStatus.ADAPTER.encodeWithTag(writer, 14, (int) value.getFee_tier_status());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getPrev_tier());
                protoAdapter2.encodeWithTag(writer, 12, (int) value.getTrading_volume_tier_progress());
                ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
                protoAdapter3.encodeWithTag(writer, 11, (int) value.getLockup_period_in_seconds());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getNext_tier());
                if (value.getFee_tier_source() != FeeTierSource.FEE_TIER_SOURCE_UNSPECIFIED) {
                    FeeTierSource.ADAPTER.encodeWithTag(writer, 9, (int) value.getFee_tier_source());
                }
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getCurrent_tier_expiration_time());
                FeeTierPromo.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getPromos());
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    protoAdapter2.encodeWithTag(writer, 6, (int) value.getAccount_id());
                }
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getAvailable_tiers());
                ProtoAdapter<Money> protoAdapter4 = Money.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 4, (int) value.getRequired_trading_amount_for_next_tier());
                if (value.getCurrent_period_trading_amount() != null) {
                    protoAdapter4.encodeWithTag(writer, 3, (int) value.getCurrent_period_trading_amount());
                }
                if (value.getEvaluation_period_days() != 0) {
                    protoAdapter3.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getEvaluation_period_days()));
                }
                if (value.getCurrent_fee_tier() != null) {
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getCurrent_fee_tier());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UserFeeTierResponse decode(ProtoReader reader) throws IOException {
                FeeTier feeTier;
                Money money;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                FeeTierSource feeTierSource = FeeTierSource.FEE_TIER_SOURCE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                FeeTierSource feeTierSourceDecode = feeTierSource;
                Money moneyDecode = null;
                String strDecode = null;
                FeeTier feeTierDecode = null;
                Integer numDecode = null;
                String strDecode2 = null;
                FeeTier feeTierDecode2 = null;
                FeeTierStatus feeTierStatusDecode = null;
                String strDecode3 = null;
                FeeTier feeTierDecode3 = null;
                int iIntValue = 0;
                String strDecode4 = "";
                FeeTier feeTierDecode4 = null;
                Money moneyDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                feeTierDecode4 = FeeTier.ADAPTER.decode(reader);
                                continue;
                            case 2:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                continue;
                            case 3:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                continue;
                            case 4:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                feeTier = feeTierDecode4;
                                money = moneyDecode;
                                str = strDecode;
                                arrayList.add(FeeTier.ADAPTER.decode(reader));
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                feeTier = feeTierDecode4;
                                money = moneyDecode;
                                str = strDecode;
                                arrayList2.add(FeeTierPromo.ADAPTER.decode(reader));
                                break;
                            case 8:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                feeTier = feeTierDecode4;
                                money = moneyDecode;
                                str = strDecode;
                                try {
                                    feeTierSourceDecode = FeeTierSource.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 10:
                                feeTierDecode = FeeTier.ADAPTER.decode(reader);
                                continue;
                            case 11:
                                numDecode = ProtoAdapter.INT32.decode(reader);
                                continue;
                            case 12:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                feeTierDecode2 = FeeTier.ADAPTER.decode(reader);
                                continue;
                            case 14:
                                try {
                                    feeTierStatusDecode = FeeTierStatus.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    feeTier = feeTierDecode4;
                                    money = moneyDecode;
                                    str = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 15:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 16:
                                feeTierDecode3 = FeeTier.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                feeTier = feeTierDecode4;
                                money = moneyDecode;
                                str = strDecode;
                                break;
                        }
                        feeTierDecode4 = feeTier;
                        moneyDecode = money;
                        strDecode = str;
                    } else {
                        return new UserFeeTierResponse(feeTierDecode4, iIntValue, moneyDecode2, moneyDecode, arrayList, strDecode4, arrayList2, strDecode, feeTierSourceDecode, feeTierDecode, numDecode, strDecode2, feeTierDecode2, feeTierStatusDecode, strDecode3, feeTierDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UserFeeTierResponse redact(UserFeeTierResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FeeTier current_fee_tier = value.getCurrent_fee_tier();
                FeeTier feeTierRedact = current_fee_tier != null ? FeeTier.ADAPTER.redact(current_fee_tier) : null;
                Money current_period_trading_amount = value.getCurrent_period_trading_amount();
                Money moneyRedact = current_period_trading_amount != null ? Money.ADAPTER.redact(current_period_trading_amount) : null;
                Money required_trading_amount_for_next_tier = value.getRequired_trading_amount_for_next_tier();
                Money moneyRedact2 = required_trading_amount_for_next_tier != null ? Money.ADAPTER.redact(required_trading_amount_for_next_tier) : null;
                List<FeeTier> available_tiers = value.getAvailable_tiers();
                ProtoAdapter<FeeTier> protoAdapter = FeeTier.ADAPTER;
                List listM26823redactElements = Internal.m26823redactElements(available_tiers, protoAdapter);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getPromos(), FeeTierPromo.ADAPTER);
                FeeTier next_tier = value.getNext_tier();
                FeeTier feeTierRedact2 = next_tier != null ? protoAdapter.redact(next_tier) : null;
                FeeTier prev_tier = value.getPrev_tier();
                FeeTier feeTierRedact3 = prev_tier != null ? protoAdapter.redact(prev_tier) : null;
                FeeTier projected_downgrade_tier = value.getProjected_downgrade_tier();
                return value.copy((28066 & 1) != 0 ? value.current_fee_tier : feeTierRedact, (28066 & 2) != 0 ? value.evaluation_period_days : 0, (28066 & 4) != 0 ? value.current_period_trading_amount : moneyRedact, (28066 & 8) != 0 ? value.required_trading_amount_for_next_tier : moneyRedact2, (28066 & 16) != 0 ? value.available_tiers : listM26823redactElements, (28066 & 32) != 0 ? value.account_id : null, (28066 & 64) != 0 ? value.promos : listM26823redactElements2, (28066 & 128) != 0 ? value.current_tier_expiration_time : null, (28066 & 256) != 0 ? value.fee_tier_source : null, (28066 & 512) != 0 ? value.next_tier : feeTierRedact2, (28066 & 1024) != 0 ? value.lockup_period_in_seconds : null, (28066 & 2048) != 0 ? value.trading_volume_tier_progress : null, (28066 & 4096) != 0 ? value.prev_tier : feeTierRedact3, (28066 & 8192) != 0 ? value.fee_tier_status : null, (28066 & 16384) != 0 ? value.projected_downgrade_time : null, (28066 & 32768) != 0 ? value.projected_downgrade_tier : projected_downgrade_tier != null ? protoAdapter.redact(projected_downgrade_tier) : null, (28066 & 65536) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
