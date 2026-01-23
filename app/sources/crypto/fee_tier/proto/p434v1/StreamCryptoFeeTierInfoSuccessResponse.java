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
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p479j$.time.Instant;

/* compiled from: StreamCryptoFeeTierInfoSuccessResponse.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\u0018\u0000 L2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001LB×\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0017¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010*JÝ\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u001a\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b+\u0010,R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u00104R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b5\u00104R\"\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b=\u0010*R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010-\u001a\u0004\bA\u0010/R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\bB\u0010/R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010C\u001a\u0004\bD\u0010ER\"\u0010\u001a\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00106\u001a\u0004\bF\u00108R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010-\u001a\u0004\bG\u0010/R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bI\u0010JR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010H\u001a\u0004\bK\u0010J¨\u0006M"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponse;", "Lcom/squareup/wire/Message;", "", "Lcrypto/fee_tier/proto/v1/FeeTier;", "current_fee_tier", "", "evaluation_period_days", "Lcom/robinhood/rosetta/common/Money;", "current_period_trading_amount", "required_trading_amount_for_next_tier", "", "available_tiers", "Lcrypto/fee_tier/proto/v1/FeeTierPromo;", "promos", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "current_tier_expiration_time", "Lcrypto/fee_tier/proto/v1/FeeTierSource;", "fee_tier_source", "", "trading_volume_tier_progress", "lockup_period_in_seconds", "next_tier", "prev_tier", "Lcrypto/fee_tier/proto/v1/FeeTierStatus;", "fee_tier_status", "projected_downgrade_time", "projected_downgrade_tier", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcrypto/fee_tier/proto/v1/FeeTier;ILcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lcrypto/fee_tier/proto/v1/FeeTierSource;Ljava/lang/String;Ljava/lang/Integer;Lcrypto/fee_tier/proto/v1/FeeTier;Lcrypto/fee_tier/proto/v1/FeeTier;Lcrypto/fee_tier/proto/v1/FeeTierStatus;Lj$/time/Instant;Lcrypto/fee_tier/proto/v1/FeeTier;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcrypto/fee_tier/proto/v1/FeeTier;ILcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lcrypto/fee_tier/proto/v1/FeeTierSource;Ljava/lang/String;Ljava/lang/Integer;Lcrypto/fee_tier/proto/v1/FeeTier;Lcrypto/fee_tier/proto/v1/FeeTier;Lcrypto/fee_tier/proto/v1/FeeTierStatus;Lj$/time/Instant;Lcrypto/fee_tier/proto/v1/FeeTier;Lokio/ByteString;)Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponse;", "Lcrypto/fee_tier/proto/v1/FeeTier;", "getCurrent_fee_tier", "()Lcrypto/fee_tier/proto/v1/FeeTier;", "I", "getEvaluation_period_days", "Lcom/robinhood/rosetta/common/Money;", "getCurrent_period_trading_amount", "()Lcom/robinhood/rosetta/common/Money;", "getRequired_trading_amount_for_next_tier", "Lj$/time/Instant;", "getCurrent_tier_expiration_time", "()Lj$/time/Instant;", "Lcrypto/fee_tier/proto/v1/FeeTierSource;", "getFee_tier_source", "()Lcrypto/fee_tier/proto/v1/FeeTierSource;", "Ljava/lang/String;", "getTrading_volume_tier_progress", "Ljava/lang/Integer;", "getLockup_period_in_seconds", "()Ljava/lang/Integer;", "getNext_tier", "getPrev_tier", "Lcrypto/fee_tier/proto/v1/FeeTierStatus;", "getFee_tier_status", "()Lcrypto/fee_tier/proto/v1/FeeTierStatus;", "getProjected_downgrade_time", "getProjected_downgrade_tier", "Ljava/util/List;", "getAvailable_tiers", "()Ljava/util/List;", "getPromos", "Companion", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StreamCryptoFeeTierInfoSuccessResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamCryptoFeeTierInfoSuccessResponse> ADAPTER;

    @WireField(adapter = "crypto.fee_tier.proto.v1.FeeTier#ADAPTER", jsonName = "availableTiers", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<FeeTier> available_tiers;

    @WireField(adapter = "crypto.fee_tier.proto.v1.FeeTier#ADAPTER", jsonName = "currentFeeTier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FeeTier current_fee_tier;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "currentPeriodTradingAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money current_period_trading_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "currentTierExpirationTime", schemaIndex = 6, tag = 7)
    private final Instant current_tier_expiration_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "evaluationPeriodDays", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int evaluation_period_days;

    @WireField(adapter = "crypto.fee_tier.proto.v1.FeeTierSource#ADAPTER", jsonName = "feeTierSource", schemaIndex = 7, tag = 8)
    private final FeeTierSource fee_tier_source;

    @WireField(adapter = "crypto.fee_tier.proto.v1.FeeTierStatus#ADAPTER", jsonName = "feeTierStatus", schemaIndex = 12, tag = 13)
    private final FeeTierStatus fee_tier_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "lockupPeriodInSeconds", schemaIndex = 9, tag = 10)
    private final Integer lockup_period_in_seconds;

    @WireField(adapter = "crypto.fee_tier.proto.v1.FeeTier#ADAPTER", jsonName = "nextTier", schemaIndex = 10, tag = 11)
    private final FeeTier next_tier;

    @WireField(adapter = "crypto.fee_tier.proto.v1.FeeTier#ADAPTER", jsonName = "prevTier", schemaIndex = 11, tag = 12)
    private final FeeTier prev_tier;

    @WireField(adapter = "crypto.fee_tier.proto.v1.FeeTier#ADAPTER", jsonName = "projectedDowngradeTier", schemaIndex = 14, tag = 15)
    private final FeeTier projected_downgrade_tier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "projectedDowngradeTime", schemaIndex = 13, tag = 14)
    private final Instant projected_downgrade_time;

    @WireField(adapter = "crypto.fee_tier.proto.v1.FeeTierPromo#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<FeeTierPromo> promos;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "requiredTradingAmountForNextTier", schemaIndex = 3, tag = 4)
    private final Money required_trading_amount_for_next_tier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tradingVolumeTierProgress", schemaIndex = 8, tag = 9)
    private final String trading_volume_tier_progress;

    public StreamCryptoFeeTierInfoSuccessResponse() {
        this(null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27800newBuilder();
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

    public /* synthetic */ StreamCryptoFeeTierInfoSuccessResponse(FeeTier feeTier, int i, Money money, Money money2, List list, List list2, Instant instant, FeeTierSource feeTierSource, String str, Integer num, FeeTier feeTier2, FeeTier feeTier3, FeeTierStatus feeTierStatus, Instant instant2, FeeTier feeTier4, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : feeTier, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : money, (i2 & 8) != 0 ? null : money2, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 64) != 0 ? null : instant, (i2 & 128) != 0 ? null : feeTierSource, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? null : num, (i2 & 1024) != 0 ? null : feeTier2, (i2 & 2048) != 0 ? null : feeTier3, (i2 & 4096) != 0 ? null : feeTierStatus, (i2 & 8192) != 0 ? null : instant2, (i2 & 16384) != 0 ? null : feeTier4, (i2 & 32768) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getCurrent_tier_expiration_time() {
        return this.current_tier_expiration_time;
    }

    public final FeeTierSource getFee_tier_source() {
        return this.fee_tier_source;
    }

    public final String getTrading_volume_tier_progress() {
        return this.trading_volume_tier_progress;
    }

    public final Integer getLockup_period_in_seconds() {
        return this.lockup_period_in_seconds;
    }

    public final FeeTier getNext_tier() {
        return this.next_tier;
    }

    public final FeeTier getPrev_tier() {
        return this.prev_tier;
    }

    public final FeeTierStatus getFee_tier_status() {
        return this.fee_tier_status;
    }

    public final Instant getProjected_downgrade_time() {
        return this.projected_downgrade_time;
    }

    public final FeeTier getProjected_downgrade_tier() {
        return this.projected_downgrade_tier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamCryptoFeeTierInfoSuccessResponse(FeeTier feeTier, int i, Money money, Money money2, List<FeeTier> available_tiers, List<FeeTierPromo> promos, Instant instant, FeeTierSource feeTierSource, String str, Integer num, FeeTier feeTier2, FeeTier feeTier3, FeeTierStatus feeTierStatus, Instant instant2, FeeTier feeTier4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(available_tiers, "available_tiers");
        Intrinsics.checkNotNullParameter(promos, "promos");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.current_fee_tier = feeTier;
        this.evaluation_period_days = i;
        this.current_period_trading_amount = money;
        this.required_trading_amount_for_next_tier = money2;
        this.current_tier_expiration_time = instant;
        this.fee_tier_source = feeTierSource;
        this.trading_volume_tier_progress = str;
        this.lockup_period_in_seconds = num;
        this.next_tier = feeTier2;
        this.prev_tier = feeTier3;
        this.fee_tier_status = feeTierStatus;
        this.projected_downgrade_time = instant2;
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
    public /* synthetic */ Void m27800newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamCryptoFeeTierInfoSuccessResponse)) {
            return false;
        }
        StreamCryptoFeeTierInfoSuccessResponse streamCryptoFeeTierInfoSuccessResponse = (StreamCryptoFeeTierInfoSuccessResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamCryptoFeeTierInfoSuccessResponse.unknownFields()) && Intrinsics.areEqual(this.current_fee_tier, streamCryptoFeeTierInfoSuccessResponse.current_fee_tier) && this.evaluation_period_days == streamCryptoFeeTierInfoSuccessResponse.evaluation_period_days && Intrinsics.areEqual(this.current_period_trading_amount, streamCryptoFeeTierInfoSuccessResponse.current_period_trading_amount) && Intrinsics.areEqual(this.required_trading_amount_for_next_tier, streamCryptoFeeTierInfoSuccessResponse.required_trading_amount_for_next_tier) && Intrinsics.areEqual(this.available_tiers, streamCryptoFeeTierInfoSuccessResponse.available_tiers) && Intrinsics.areEqual(this.promos, streamCryptoFeeTierInfoSuccessResponse.promos) && Intrinsics.areEqual(this.current_tier_expiration_time, streamCryptoFeeTierInfoSuccessResponse.current_tier_expiration_time) && this.fee_tier_source == streamCryptoFeeTierInfoSuccessResponse.fee_tier_source && Intrinsics.areEqual(this.trading_volume_tier_progress, streamCryptoFeeTierInfoSuccessResponse.trading_volume_tier_progress) && Intrinsics.areEqual(this.lockup_period_in_seconds, streamCryptoFeeTierInfoSuccessResponse.lockup_period_in_seconds) && Intrinsics.areEqual(this.next_tier, streamCryptoFeeTierInfoSuccessResponse.next_tier) && Intrinsics.areEqual(this.prev_tier, streamCryptoFeeTierInfoSuccessResponse.prev_tier) && this.fee_tier_status == streamCryptoFeeTierInfoSuccessResponse.fee_tier_status && Intrinsics.areEqual(this.projected_downgrade_time, streamCryptoFeeTierInfoSuccessResponse.projected_downgrade_time) && Intrinsics.areEqual(this.projected_downgrade_tier, streamCryptoFeeTierInfoSuccessResponse.projected_downgrade_tier);
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
        int iHashCode4 = (((((iHashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.available_tiers.hashCode()) * 37) + this.promos.hashCode()) * 37;
        Instant instant = this.current_tier_expiration_time;
        int iHashCode5 = (iHashCode4 + (instant != null ? instant.hashCode() : 0)) * 37;
        FeeTierSource feeTierSource = this.fee_tier_source;
        int iHashCode6 = (iHashCode5 + (feeTierSource != null ? feeTierSource.hashCode() : 0)) * 37;
        String str = this.trading_volume_tier_progress;
        int iHashCode7 = (iHashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.lockup_period_in_seconds;
        int iHashCode8 = (iHashCode7 + (num != null ? num.hashCode() : 0)) * 37;
        FeeTier feeTier2 = this.next_tier;
        int iHashCode9 = (iHashCode8 + (feeTier2 != null ? feeTier2.hashCode() : 0)) * 37;
        FeeTier feeTier3 = this.prev_tier;
        int iHashCode10 = (iHashCode9 + (feeTier3 != null ? feeTier3.hashCode() : 0)) * 37;
        FeeTierStatus feeTierStatus = this.fee_tier_status;
        int iHashCode11 = (iHashCode10 + (feeTierStatus != null ? feeTierStatus.hashCode() : 0)) * 37;
        Instant instant2 = this.projected_downgrade_time;
        int iHashCode12 = (iHashCode11 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        FeeTier feeTier4 = this.projected_downgrade_tier;
        int iHashCode13 = iHashCode12 + (feeTier4 != null ? feeTier4.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
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
        if (!this.promos.isEmpty()) {
            arrayList.add("promos=" + this.promos);
        }
        Instant instant = this.current_tier_expiration_time;
        if (instant != null) {
            arrayList.add("current_tier_expiration_time=" + instant);
        }
        FeeTierSource feeTierSource = this.fee_tier_source;
        if (feeTierSource != null) {
            arrayList.add("fee_tier_source=" + feeTierSource);
        }
        String str = this.trading_volume_tier_progress;
        if (str != null) {
            arrayList.add("trading_volume_tier_progress=" + Internal.sanitize(str));
        }
        Integer num = this.lockup_period_in_seconds;
        if (num != null) {
            arrayList.add("lockup_period_in_seconds=" + num);
        }
        FeeTier feeTier2 = this.next_tier;
        if (feeTier2 != null) {
            arrayList.add("next_tier=" + feeTier2);
        }
        FeeTier feeTier3 = this.prev_tier;
        if (feeTier3 != null) {
            arrayList.add("prev_tier=" + feeTier3);
        }
        FeeTierStatus feeTierStatus = this.fee_tier_status;
        if (feeTierStatus != null) {
            arrayList.add("fee_tier_status=" + feeTierStatus);
        }
        Instant instant2 = this.projected_downgrade_time;
        if (instant2 != null) {
            arrayList.add("projected_downgrade_time=" + instant2);
        }
        FeeTier feeTier4 = this.projected_downgrade_tier;
        if (feeTier4 != null) {
            arrayList.add("projected_downgrade_tier=" + feeTier4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamCryptoFeeTierInfoSuccessResponse{", "}", 0, null, null, 56, null);
    }

    public final StreamCryptoFeeTierInfoSuccessResponse copy(FeeTier current_fee_tier, int evaluation_period_days, Money current_period_trading_amount, Money required_trading_amount_for_next_tier, List<FeeTier> available_tiers, List<FeeTierPromo> promos, Instant current_tier_expiration_time, FeeTierSource fee_tier_source, String trading_volume_tier_progress, Integer lockup_period_in_seconds, FeeTier next_tier, FeeTier prev_tier, FeeTierStatus fee_tier_status, Instant projected_downgrade_time, FeeTier projected_downgrade_tier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(available_tiers, "available_tiers");
        Intrinsics.checkNotNullParameter(promos, "promos");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamCryptoFeeTierInfoSuccessResponse(current_fee_tier, evaluation_period_days, current_period_trading_amount, required_trading_amount_for_next_tier, available_tiers, promos, current_tier_expiration_time, fee_tier_source, trading_volume_tier_progress, lockup_period_in_seconds, next_tier, prev_tier, fee_tier_status, projected_downgrade_time, projected_downgrade_tier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamCryptoFeeTierInfoSuccessResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamCryptoFeeTierInfoSuccessResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoSuccessResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamCryptoFeeTierInfoSuccessResponse value) {
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
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(5, value.getAvailable_tiers()) + FeeTierPromo.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getPromos());
                ProtoAdapter<Instant> protoAdapter2 = ProtoAdapter.INSTANT;
                return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(7, value.getCurrent_tier_expiration_time()) + FeeTierSource.ADAPTER.encodedSizeWithTag(8, value.getFee_tier_source()) + ProtoAdapter.STRING.encodedSizeWithTag(9, value.getTrading_volume_tier_progress()) + ProtoAdapter.INT32.encodedSizeWithTag(10, value.getLockup_period_in_seconds()) + protoAdapter.encodedSizeWithTag(11, value.getNext_tier()) + protoAdapter.encodedSizeWithTag(12, value.getPrev_tier()) + FeeTierStatus.ADAPTER.encodedSizeWithTag(13, value.getFee_tier_status()) + protoAdapter2.encodedSizeWithTag(14, value.getProjected_downgrade_time()) + protoAdapter.encodedSizeWithTag(15, value.getProjected_downgrade_tier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamCryptoFeeTierInfoSuccessResponse value) throws IOException {
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
                FeeTierPromo.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getPromos());
                ProtoAdapter<Instant> protoAdapter2 = ProtoAdapter.INSTANT;
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getCurrent_tier_expiration_time());
                FeeTierSource.ADAPTER.encodeWithTag(writer, 8, (int) value.getFee_tier_source());
                ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getTrading_volume_tier_progress());
                ProtoAdapter.INT32.encodeWithTag(writer, 10, (int) value.getLockup_period_in_seconds());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getNext_tier());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getPrev_tier());
                FeeTierStatus.ADAPTER.encodeWithTag(writer, 13, (int) value.getFee_tier_status());
                protoAdapter2.encodeWithTag(writer, 14, (int) value.getProjected_downgrade_time());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getProjected_downgrade_tier());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamCryptoFeeTierInfoSuccessResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<FeeTier> protoAdapter = FeeTier.ADAPTER;
                protoAdapter.encodeWithTag(writer, 15, (int) value.getProjected_downgrade_tier());
                ProtoAdapter<Instant> protoAdapter2 = ProtoAdapter.INSTANT;
                protoAdapter2.encodeWithTag(writer, 14, (int) value.getProjected_downgrade_time());
                FeeTierStatus.ADAPTER.encodeWithTag(writer, 13, (int) value.getFee_tier_status());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getPrev_tier());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getNext_tier());
                ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
                protoAdapter3.encodeWithTag(writer, 10, (int) value.getLockup_period_in_seconds());
                ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getTrading_volume_tier_progress());
                FeeTierSource.ADAPTER.encodeWithTag(writer, 8, (int) value.getFee_tier_source());
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getCurrent_tier_expiration_time());
                FeeTierPromo.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getPromos());
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

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoFeeTierInfoSuccessResponse decode(ProtoReader reader) throws IOException {
                Money money;
                Money money2;
                Instant instant;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Instant instantDecode = null;
                FeeTierSource feeTierSourceDecode = null;
                String strDecode = null;
                Integer numDecode = null;
                FeeTier feeTierDecode = null;
                FeeTier feeTierDecode2 = null;
                FeeTierStatus feeTierStatusDecode = null;
                Instant instantDecode2 = null;
                FeeTier feeTierDecode3 = null;
                FeeTier feeTierDecode4 = null;
                int iIntValue = 0;
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
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 4:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                money = moneyDecode;
                                money2 = moneyDecode2;
                                instant = instantDecode;
                                arrayList.add(FeeTier.ADAPTER.decode(reader));
                                break;
                            case 6:
                                money = moneyDecode;
                                money2 = moneyDecode2;
                                instant = instantDecode;
                                arrayList2.add(FeeTierPromo.ADAPTER.decode(reader));
                                break;
                            case 7:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 8:
                                money = moneyDecode;
                                money2 = moneyDecode2;
                                instant = instantDecode;
                                try {
                                    feeTierSourceDecode = FeeTierSource.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 9:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                numDecode = ProtoAdapter.INT32.decode(reader);
                                continue;
                            case 11:
                                feeTierDecode = FeeTier.ADAPTER.decode(reader);
                                continue;
                            case 12:
                                feeTierDecode2 = FeeTier.ADAPTER.decode(reader);
                                continue;
                            case 13:
                                try {
                                    feeTierStatusDecode = FeeTierStatus.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    money = moneyDecode;
                                    money2 = moneyDecode2;
                                    instant = instantDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 14:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 15:
                                feeTierDecode3 = FeeTier.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                money = moneyDecode;
                                money2 = moneyDecode2;
                                instant = instantDecode;
                                break;
                        }
                        moneyDecode = money;
                        moneyDecode2 = money2;
                        instantDecode = instant;
                    } else {
                        return new StreamCryptoFeeTierInfoSuccessResponse(feeTierDecode4, iIntValue, moneyDecode, moneyDecode2, arrayList, arrayList2, instantDecode, feeTierSourceDecode, strDecode, numDecode, feeTierDecode, feeTierDecode2, feeTierStatusDecode, instantDecode2, feeTierDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoFeeTierInfoSuccessResponse redact(StreamCryptoFeeTierInfoSuccessResponse value) {
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
                Instant current_tier_expiration_time = value.getCurrent_tier_expiration_time();
                Instant instantRedact = current_tier_expiration_time != null ? ProtoAdapter.INSTANT.redact(current_tier_expiration_time) : null;
                FeeTier next_tier = value.getNext_tier();
                FeeTier feeTierRedact2 = next_tier != null ? protoAdapter.redact(next_tier) : null;
                FeeTier prev_tier = value.getPrev_tier();
                FeeTier feeTierRedact3 = prev_tier != null ? protoAdapter.redact(prev_tier) : null;
                Instant projected_downgrade_time = value.getProjected_downgrade_time();
                Instant instantRedact2 = projected_downgrade_time != null ? ProtoAdapter.INSTANT.redact(projected_downgrade_time) : null;
                FeeTier projected_downgrade_tier = value.getProjected_downgrade_tier();
                return value.copy((4994 & 1) != 0 ? value.current_fee_tier : feeTierRedact, (4994 & 2) != 0 ? value.evaluation_period_days : 0, (4994 & 4) != 0 ? value.current_period_trading_amount : moneyRedact, (4994 & 8) != 0 ? value.required_trading_amount_for_next_tier : moneyRedact2, (4994 & 16) != 0 ? value.available_tiers : listM26823redactElements, (4994 & 32) != 0 ? value.promos : listM26823redactElements2, (4994 & 64) != 0 ? value.current_tier_expiration_time : instantRedact, (4994 & 128) != 0 ? value.fee_tier_source : null, (4994 & 256) != 0 ? value.trading_volume_tier_progress : null, (4994 & 512) != 0 ? value.lockup_period_in_seconds : null, (4994 & 1024) != 0 ? value.next_tier : feeTierRedact2, (4994 & 2048) != 0 ? value.prev_tier : feeTierRedact3, (4994 & 4096) != 0 ? value.fee_tier_status : null, (4994 & 8192) != 0 ? value.projected_downgrade_time : instantRedact2, (4994 & 16384) != 0 ? value.projected_downgrade_tier : projected_downgrade_tier != null ? protoAdapter.redact(projected_downgrade_tier) : null, (4994 & 32768) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
