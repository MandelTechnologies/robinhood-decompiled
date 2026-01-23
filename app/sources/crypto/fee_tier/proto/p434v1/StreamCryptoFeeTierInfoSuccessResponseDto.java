package crypto.fee_tier.proto.p434v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import crypto.fee_tier.proto.p434v1.FeeTierDto;
import crypto.fee_tier.proto.p434v1.FeeTierPromoDto;
import crypto.fee_tier.proto.p434v1.FeeTierSourceDto;
import crypto.fee_tier.proto.p434v1.FeeTierStatusDto;
import crypto.fee_tier.proto.p434v1.StreamCryptoFeeTierInfoSuccessResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p479j$.time.Instant;

/* compiled from: StreamCryptoFeeTierInfoSuccessResponseDto.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00047689B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BÏ\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105¨\u0006:"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponse;", "Landroid/os/Parcelable;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto$Surrogate;", "surrogate", "<init>", "(Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto$Surrogate;)V", "Lcrypto/fee_tier/proto/v1/FeeTierDto;", "current_fee_tier", "", "evaluation_period_days", "Lcom/robinhood/rosetta/common/MoneyDto;", "current_period_trading_amount", "required_trading_amount_for_next_tier", "", "available_tiers", "Lcrypto/fee_tier/proto/v1/FeeTierPromoDto;", "promos", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "current_tier_expiration_time", "Lcrypto/fee_tier/proto/v1/FeeTierSourceDto;", "fee_tier_source", "Lcom/robinhood/idl/IdlDecimal;", "trading_volume_tier_progress", "lockup_period_in_seconds", "next_tier", "prev_tier", "Lcrypto/fee_tier/proto/v1/FeeTierStatusDto;", "fee_tier_status", "projected_downgrade_time", "projected_downgrade_tier", "(Lcrypto/fee_tier/proto/v1/FeeTierDto;ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lcrypto/fee_tier/proto/v1/FeeTierSourceDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/Integer;Lcrypto/fee_tier/proto/v1/FeeTierDto;Lcrypto/fee_tier/proto/v1/FeeTierDto;Lcrypto/fee_tier/proto/v1/FeeTierStatusDto;Lj$/time/Instant;Lcrypto/fee_tier/proto/v1/FeeTierDto;)V", "toProto", "()Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class StreamCryptoFeeTierInfoSuccessResponseDto implements Dto3<StreamCryptoFeeTierInfoSuccessResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamCryptoFeeTierInfoSuccessResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamCryptoFeeTierInfoSuccessResponseDto, StreamCryptoFeeTierInfoSuccessResponse>> binaryBase64Serializer$delegate;
    private static final StreamCryptoFeeTierInfoSuccessResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamCryptoFeeTierInfoSuccessResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamCryptoFeeTierInfoSuccessResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ StreamCryptoFeeTierInfoSuccessResponseDto(FeeTierDto feeTierDto, int i, MoneyDto moneyDto, MoneyDto moneyDto2, List list, List list2, Instant instant, FeeTierSourceDto feeTierSourceDto, IdlDecimal idlDecimal, Integer num, FeeTierDto feeTierDto2, FeeTierDto feeTierDto3, FeeTierStatusDto feeTierStatusDto, Instant instant2, FeeTierDto feeTierDto4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : feeTierDto, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : moneyDto, (i2 & 8) != 0 ? null : moneyDto2, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 64) != 0 ? null : instant, (i2 & 128) != 0 ? null : feeTierSourceDto, (i2 & 256) != 0 ? null : idlDecimal, (i2 & 512) != 0 ? null : num, (i2 & 1024) != 0 ? null : feeTierDto2, (i2 & 2048) != 0 ? null : feeTierDto3, (i2 & 4096) != 0 ? null : feeTierStatusDto, (i2 & 8192) != 0 ? null : instant2, (i2 & 16384) != 0 ? null : feeTierDto4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamCryptoFeeTierInfoSuccessResponseDto(FeeTierDto feeTierDto, int i, MoneyDto moneyDto, MoneyDto moneyDto2, List<FeeTierDto> available_tiers, List<FeeTierPromoDto> promos, Instant instant, FeeTierSourceDto feeTierSourceDto, IdlDecimal idlDecimal, Integer num, FeeTierDto feeTierDto2, FeeTierDto feeTierDto3, FeeTierStatusDto feeTierStatusDto, Instant instant2, FeeTierDto feeTierDto4) {
        this(new Surrogate(feeTierDto, i, moneyDto, moneyDto2, available_tiers, promos, instant, feeTierSourceDto, idlDecimal, num, feeTierDto2, feeTierDto3, feeTierStatusDto, instant2, feeTierDto4));
        Intrinsics.checkNotNullParameter(available_tiers, "available_tiers");
        Intrinsics.checkNotNullParameter(promos, "promos");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public StreamCryptoFeeTierInfoSuccessResponse toProto() {
        FeeTierDto current_fee_tier = this.surrogate.getCurrent_fee_tier();
        FeeTier proto = current_fee_tier != null ? current_fee_tier.toProto() : null;
        int evaluation_period_days = this.surrogate.getEvaluation_period_days();
        MoneyDto current_period_trading_amount = this.surrogate.getCurrent_period_trading_amount();
        Money proto2 = current_period_trading_amount != null ? current_period_trading_amount.toProto() : null;
        MoneyDto required_trading_amount_for_next_tier = this.surrogate.getRequired_trading_amount_for_next_tier();
        Money proto3 = required_trading_amount_for_next_tier != null ? required_trading_amount_for_next_tier.toProto() : null;
        List<FeeTierDto> available_tiers = this.surrogate.getAvailable_tiers();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(available_tiers, 10));
        Iterator<T> it = available_tiers.iterator();
        while (it.hasNext()) {
            arrayList.add(((FeeTierDto) it.next()).toProto());
        }
        List<FeeTierPromoDto> promos = this.surrogate.getPromos();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(promos, 10));
        Iterator<T> it2 = promos.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FeeTierPromoDto) it2.next()).toProto());
        }
        Instant current_tier_expiration_time = this.surrogate.getCurrent_tier_expiration_time();
        FeeTierSourceDto fee_tier_source = this.surrogate.getFee_tier_source();
        FeeTierSource feeTierSource = fee_tier_source != null ? (FeeTierSource) fee_tier_source.toProto() : null;
        IdlDecimal trading_volume_tier_progress = this.surrogate.getTrading_volume_tier_progress();
        String stringValue = trading_volume_tier_progress != null ? trading_volume_tier_progress.getStringValue() : null;
        Integer lockup_period_in_seconds = this.surrogate.getLockup_period_in_seconds();
        FeeTierDto next_tier = this.surrogate.getNext_tier();
        FeeTier proto4 = next_tier != null ? next_tier.toProto() : null;
        FeeTierDto prev_tier = this.surrogate.getPrev_tier();
        FeeTier proto5 = prev_tier != null ? prev_tier.toProto() : null;
        FeeTierStatusDto fee_tier_status = this.surrogate.getFee_tier_status();
        FeeTierStatus feeTierStatus = fee_tier_status != null ? (FeeTierStatus) fee_tier_status.toProto() : null;
        Instant projected_downgrade_time = this.surrogate.getProjected_downgrade_time();
        FeeTierDto projected_downgrade_tier = this.surrogate.getProjected_downgrade_tier();
        return new StreamCryptoFeeTierInfoSuccessResponse(proto, evaluation_period_days, proto2, proto3, arrayList, arrayList2, current_tier_expiration_time, feeTierSource, stringValue, lockup_period_in_seconds, proto4, proto5, feeTierStatus, projected_downgrade_time, projected_downgrade_tier != null ? projected_downgrade_tier.toProto() : null, null, 32768, null);
    }

    public String toString() {
        return "[StreamCryptoFeeTierInfoSuccessResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamCryptoFeeTierInfoSuccessResponseDto) && Intrinsics.areEqual(((StreamCryptoFeeTierInfoSuccessResponseDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StreamCryptoFeeTierInfoSuccessResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b5\b\u0083\b\u0018\u0000 h2\u00020\u0001:\u0002ihB¶\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f\u0012.\b\u0002\u0010\u0013\u001a(\u0018\u00010\u0010j\u0013\u0018\u0001`\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0019\b\u0002\u0010\u0018\u001a\u0013\u0018\u00010\u0016¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0017\u0012\u0019\b\u0002\u0010\u0019\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012.\b\u0002\u0010\u001e\u001a(\u0018\u00010\u0010j\u0013\u0018\u0001`\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0012\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!B»\u0001\b\u0010\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J'\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010=\u0012\u0004\b?\u0010<\u001a\u0004\b>\u00103R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010@\u0012\u0004\bC\u0010<\u001a\u0004\bA\u0010BR\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010@\u0012\u0004\bE\u0010<\u001a\u0004\bD\u0010BR&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010F\u0012\u0004\bI\u0010<\u001a\u0004\bG\u0010HR&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010F\u0012\u0004\bK\u0010<\u001a\u0004\bJ\u0010HRF\u0010\u0013\u001a(\u0018\u00010\u0010j\u0013\u0018\u0001`\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010L\u0012\u0004\bO\u0010<\u001a\u0004\bM\u0010NR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010P\u0012\u0004\bS\u0010<\u001a\u0004\bQ\u0010RR1\u0010\u0018\u001a\u0013\u0018\u00010\u0016¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010T\u0012\u0004\bW\u0010<\u001a\u0004\bU\u0010VR1\u0010\u0019\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010X\u0012\u0004\b[\u0010<\u001a\u0004\bY\u0010ZR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u00108\u0012\u0004\b]\u0010<\u001a\u0004\b\\\u0010:R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u00108\u0012\u0004\b_\u0010<\u001a\u0004\b^\u0010:R\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010`\u0012\u0004\bc\u0010<\u001a\u0004\ba\u0010bRF\u0010\u001e\u001a(\u0018\u00010\u0010j\u0013\u0018\u0001`\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010L\u0012\u0004\be\u0010<\u001a\u0004\bd\u0010NR\"\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u00108\u0012\u0004\bg\u0010<\u001a\u0004\bf\u0010:¨\u0006j"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto$Surrogate;", "", "Lcrypto/fee_tier/proto/v1/FeeTierDto;", "current_fee_tier", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "evaluation_period_days", "Lcom/robinhood/rosetta/common/MoneyDto;", "current_period_trading_amount", "required_trading_amount_for_next_tier", "", "available_tiers", "Lcrypto/fee_tier/proto/v1/FeeTierPromoDto;", "promos", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "current_tier_expiration_time", "Lcrypto/fee_tier/proto/v1/FeeTierSourceDto;", "fee_tier_source", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "trading_volume_tier_progress", "lockup_period_in_seconds", "next_tier", "prev_tier", "Lcrypto/fee_tier/proto/v1/FeeTierStatusDto;", "fee_tier_status", "projected_downgrade_time", "projected_downgrade_tier", "<init>", "(Lcrypto/fee_tier/proto/v1/FeeTierDto;ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lcrypto/fee_tier/proto/v1/FeeTierSourceDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/Integer;Lcrypto/fee_tier/proto/v1/FeeTierDto;Lcrypto/fee_tier/proto/v1/FeeTierDto;Lcrypto/fee_tier/proto/v1/FeeTierStatusDto;Lj$/time/Instant;Lcrypto/fee_tier/proto/v1/FeeTierDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcrypto/fee_tier/proto/v1/FeeTierDto;ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Lcrypto/fee_tier/proto/v1/FeeTierSourceDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/Integer;Lcrypto/fee_tier/proto/v1/FeeTierDto;Lcrypto/fee_tier/proto/v1/FeeTierDto;Lcrypto/fee_tier/proto/v1/FeeTierStatusDto;Lj$/time/Instant;Lcrypto/fee_tier/proto/v1/FeeTierDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_fee_tier_proto_v1_externalRelease", "(Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto/fee_tier/proto/v1/FeeTierDto;", "getCurrent_fee_tier", "()Lcrypto/fee_tier/proto/v1/FeeTierDto;", "getCurrent_fee_tier$annotations", "()V", "I", "getEvaluation_period_days", "getEvaluation_period_days$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getCurrent_period_trading_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getCurrent_period_trading_amount$annotations", "getRequired_trading_amount_for_next_tier", "getRequired_trading_amount_for_next_tier$annotations", "Ljava/util/List;", "getAvailable_tiers", "()Ljava/util/List;", "getAvailable_tiers$annotations", "getPromos", "getPromos$annotations", "Lj$/time/Instant;", "getCurrent_tier_expiration_time", "()Lj$/time/Instant;", "getCurrent_tier_expiration_time$annotations", "Lcrypto/fee_tier/proto/v1/FeeTierSourceDto;", "getFee_tier_source", "()Lcrypto/fee_tier/proto/v1/FeeTierSourceDto;", "getFee_tier_source$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getTrading_volume_tier_progress", "()Lcom/robinhood/idl/IdlDecimal;", "getTrading_volume_tier_progress$annotations", "Ljava/lang/Integer;", "getLockup_period_in_seconds", "()Ljava/lang/Integer;", "getLockup_period_in_seconds$annotations", "getNext_tier", "getNext_tier$annotations", "getPrev_tier", "getPrev_tier$annotations", "Lcrypto/fee_tier/proto/v1/FeeTierStatusDto;", "getFee_tier_status", "()Lcrypto/fee_tier/proto/v1/FeeTierStatusDto;", "getFee_tier_status$annotations", "getProjected_downgrade_time", "getProjected_downgrade_time$annotations", "getProjected_downgrade_tier", "getProjected_downgrade_tier$annotations", "Companion", "$serializer", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<FeeTierDto> available_tiers;
        private final FeeTierDto current_fee_tier;
        private final MoneyDto current_period_trading_amount;
        private final Instant current_tier_expiration_time;
        private final int evaluation_period_days;
        private final FeeTierSourceDto fee_tier_source;
        private final FeeTierStatusDto fee_tier_status;
        private final Integer lockup_period_in_seconds;
        private final FeeTierDto next_tier;
        private final FeeTierDto prev_tier;
        private final FeeTierDto projected_downgrade_tier;
        private final Instant projected_downgrade_time;
        private final List<FeeTierPromoDto> promos;
        private final MoneyDto required_trading_amount_for_next_tier;
        private final IdlDecimal trading_volume_tier_progress;

        public Surrogate() {
            this((FeeTierDto) null, 0, (MoneyDto) null, (MoneyDto) null, (List) null, (List) null, (Instant) null, (FeeTierSourceDto) null, (IdlDecimal) null, (Integer) null, (FeeTierDto) null, (FeeTierDto) null, (FeeTierStatusDto) null, (Instant) null, (FeeTierDto) null, 32767, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(FeeTierDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(FeeTierPromoDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.current_fee_tier, surrogate.current_fee_tier) && this.evaluation_period_days == surrogate.evaluation_period_days && Intrinsics.areEqual(this.current_period_trading_amount, surrogate.current_period_trading_amount) && Intrinsics.areEqual(this.required_trading_amount_for_next_tier, surrogate.required_trading_amount_for_next_tier) && Intrinsics.areEqual(this.available_tiers, surrogate.available_tiers) && Intrinsics.areEqual(this.promos, surrogate.promos) && Intrinsics.areEqual(this.current_tier_expiration_time, surrogate.current_tier_expiration_time) && this.fee_tier_source == surrogate.fee_tier_source && Intrinsics.areEqual(this.trading_volume_tier_progress, surrogate.trading_volume_tier_progress) && Intrinsics.areEqual(this.lockup_period_in_seconds, surrogate.lockup_period_in_seconds) && Intrinsics.areEqual(this.next_tier, surrogate.next_tier) && Intrinsics.areEqual(this.prev_tier, surrogate.prev_tier) && this.fee_tier_status == surrogate.fee_tier_status && Intrinsics.areEqual(this.projected_downgrade_time, surrogate.projected_downgrade_time) && Intrinsics.areEqual(this.projected_downgrade_tier, surrogate.projected_downgrade_tier);
        }

        public int hashCode() {
            FeeTierDto feeTierDto = this.current_fee_tier;
            int iHashCode = (((feeTierDto == null ? 0 : feeTierDto.hashCode()) * 31) + Integer.hashCode(this.evaluation_period_days)) * 31;
            MoneyDto moneyDto = this.current_period_trading_amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.required_trading_amount_for_next_tier;
            int iHashCode3 = (((((iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31) + this.available_tiers.hashCode()) * 31) + this.promos.hashCode()) * 31;
            Instant instant = this.current_tier_expiration_time;
            int iHashCode4 = (iHashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
            FeeTierSourceDto feeTierSourceDto = this.fee_tier_source;
            int iHashCode5 = (iHashCode4 + (feeTierSourceDto == null ? 0 : feeTierSourceDto.hashCode())) * 31;
            IdlDecimal idlDecimal = this.trading_volume_tier_progress;
            int iHashCode6 = (iHashCode5 + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            Integer num = this.lockup_period_in_seconds;
            int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            FeeTierDto feeTierDto2 = this.next_tier;
            int iHashCode8 = (iHashCode7 + (feeTierDto2 == null ? 0 : feeTierDto2.hashCode())) * 31;
            FeeTierDto feeTierDto3 = this.prev_tier;
            int iHashCode9 = (iHashCode8 + (feeTierDto3 == null ? 0 : feeTierDto3.hashCode())) * 31;
            FeeTierStatusDto feeTierStatusDto = this.fee_tier_status;
            int iHashCode10 = (iHashCode9 + (feeTierStatusDto == null ? 0 : feeTierStatusDto.hashCode())) * 31;
            Instant instant2 = this.projected_downgrade_time;
            int iHashCode11 = (iHashCode10 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            FeeTierDto feeTierDto4 = this.projected_downgrade_tier;
            return iHashCode11 + (feeTierDto4 != null ? feeTierDto4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(current_fee_tier=" + this.current_fee_tier + ", evaluation_period_days=" + this.evaluation_period_days + ", current_period_trading_amount=" + this.current_period_trading_amount + ", required_trading_amount_for_next_tier=" + this.required_trading_amount_for_next_tier + ", available_tiers=" + this.available_tiers + ", promos=" + this.promos + ", current_tier_expiration_time=" + this.current_tier_expiration_time + ", fee_tier_source=" + this.fee_tier_source + ", trading_volume_tier_progress=" + this.trading_volume_tier_progress + ", lockup_period_in_seconds=" + this.lockup_period_in_seconds + ", next_tier=" + this.next_tier + ", prev_tier=" + this.prev_tier + ", fee_tier_status=" + this.fee_tier_status + ", projected_downgrade_time=" + this.projected_downgrade_time + ", projected_downgrade_tier=" + this.projected_downgrade_tier + ")";
        }

        /* compiled from: StreamCryptoFeeTierInfoSuccessResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto$Surrogate;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamCryptoFeeTierInfoSuccessResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoSuccessResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamCryptoFeeTierInfoSuccessResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoSuccessResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamCryptoFeeTierInfoSuccessResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null, null, null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, FeeTierDto feeTierDto, int i2, MoneyDto moneyDto, MoneyDto moneyDto2, List list, List list2, Instant instant, FeeTierSourceDto feeTierSourceDto, IdlDecimal idlDecimal, Integer num, FeeTierDto feeTierDto2, FeeTierDto feeTierDto3, FeeTierStatusDto feeTierStatusDto, Instant instant2, FeeTierDto feeTierDto4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.current_fee_tier = null;
            } else {
                this.current_fee_tier = feeTierDto;
            }
            if ((i & 2) == 0) {
                this.evaluation_period_days = 0;
            } else {
                this.evaluation_period_days = i2;
            }
            if ((i & 4) == 0) {
                this.current_period_trading_amount = null;
            } else {
                this.current_period_trading_amount = moneyDto;
            }
            if ((i & 8) == 0) {
                this.required_trading_amount_for_next_tier = null;
            } else {
                this.required_trading_amount_for_next_tier = moneyDto2;
            }
            if ((i & 16) == 0) {
                this.available_tiers = CollectionsKt.emptyList();
            } else {
                this.available_tiers = list;
            }
            if ((i & 32) == 0) {
                this.promos = CollectionsKt.emptyList();
            } else {
                this.promos = list2;
            }
            if ((i & 64) == 0) {
                this.current_tier_expiration_time = null;
            } else {
                this.current_tier_expiration_time = instant;
            }
            if ((i & 128) == 0) {
                this.fee_tier_source = null;
            } else {
                this.fee_tier_source = feeTierSourceDto;
            }
            if ((i & 256) == 0) {
                this.trading_volume_tier_progress = null;
            } else {
                this.trading_volume_tier_progress = idlDecimal;
            }
            if ((i & 512) == 0) {
                this.lockup_period_in_seconds = null;
            } else {
                this.lockup_period_in_seconds = num;
            }
            if ((i & 1024) == 0) {
                this.next_tier = null;
            } else {
                this.next_tier = feeTierDto2;
            }
            if ((i & 2048) == 0) {
                this.prev_tier = null;
            } else {
                this.prev_tier = feeTierDto3;
            }
            if ((i & 4096) == 0) {
                this.fee_tier_status = null;
            } else {
                this.fee_tier_status = feeTierStatusDto;
            }
            if ((i & 8192) == 0) {
                this.projected_downgrade_time = null;
            } else {
                this.projected_downgrade_time = instant2;
            }
            if ((i & 16384) == 0) {
                this.projected_downgrade_tier = null;
            } else {
                this.projected_downgrade_tier = feeTierDto4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_fee_tier_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            FeeTierDto feeTierDto = self.current_fee_tier;
            if (feeTierDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, FeeTierDto.Serializer.INSTANCE, feeTierDto);
            }
            int i = self.evaluation_period_days;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            MoneyDto moneyDto = self.current_period_trading_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.required_trading_amount_for_next_tier;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (!Intrinsics.areEqual(self.available_tiers, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.available_tiers);
            }
            if (!Intrinsics.areEqual(self.promos, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.promos);
            }
            Instant instant = self.current_tier_expiration_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, WireInstantSerializer.INSTANCE, instant);
            }
            FeeTierSourceDto feeTierSourceDto = self.fee_tier_source;
            if (feeTierSourceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, FeeTierSourceDto.Serializer.INSTANCE, feeTierSourceDto);
            }
            IdlDecimal idlDecimal = self.trading_volume_tier_progress;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            Integer num = self.lockup_period_in_seconds;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            FeeTierDto feeTierDto2 = self.next_tier;
            if (feeTierDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, FeeTierDto.Serializer.INSTANCE, feeTierDto2);
            }
            FeeTierDto feeTierDto3 = self.prev_tier;
            if (feeTierDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, FeeTierDto.Serializer.INSTANCE, feeTierDto3);
            }
            FeeTierStatusDto feeTierStatusDto = self.fee_tier_status;
            if (feeTierStatusDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, FeeTierStatusDto.Serializer.INSTANCE, feeTierStatusDto);
            }
            Instant instant2 = self.projected_downgrade_time;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, WireInstantSerializer.INSTANCE, instant2);
            }
            FeeTierDto feeTierDto4 = self.projected_downgrade_tier;
            if (feeTierDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, FeeTierDto.Serializer.INSTANCE, feeTierDto4);
            }
        }

        public Surrogate(FeeTierDto feeTierDto, int i, MoneyDto moneyDto, MoneyDto moneyDto2, List<FeeTierDto> available_tiers, List<FeeTierPromoDto> promos, Instant instant, FeeTierSourceDto feeTierSourceDto, IdlDecimal idlDecimal, Integer num, FeeTierDto feeTierDto2, FeeTierDto feeTierDto3, FeeTierStatusDto feeTierStatusDto, Instant instant2, FeeTierDto feeTierDto4) {
            Intrinsics.checkNotNullParameter(available_tiers, "available_tiers");
            Intrinsics.checkNotNullParameter(promos, "promos");
            this.current_fee_tier = feeTierDto;
            this.evaluation_period_days = i;
            this.current_period_trading_amount = moneyDto;
            this.required_trading_amount_for_next_tier = moneyDto2;
            this.available_tiers = available_tiers;
            this.promos = promos;
            this.current_tier_expiration_time = instant;
            this.fee_tier_source = feeTierSourceDto;
            this.trading_volume_tier_progress = idlDecimal;
            this.lockup_period_in_seconds = num;
            this.next_tier = feeTierDto2;
            this.prev_tier = feeTierDto3;
            this.fee_tier_status = feeTierStatusDto;
            this.projected_downgrade_time = instant2;
            this.projected_downgrade_tier = feeTierDto4;
        }

        public final FeeTierDto getCurrent_fee_tier() {
            return this.current_fee_tier;
        }

        public final int getEvaluation_period_days() {
            return this.evaluation_period_days;
        }

        public final MoneyDto getCurrent_period_trading_amount() {
            return this.current_period_trading_amount;
        }

        public final MoneyDto getRequired_trading_amount_for_next_tier() {
            return this.required_trading_amount_for_next_tier;
        }

        public final List<FeeTierDto> getAvailable_tiers() {
            return this.available_tiers;
        }

        public /* synthetic */ Surrogate(FeeTierDto feeTierDto, int i, MoneyDto moneyDto, MoneyDto moneyDto2, List list, List list2, Instant instant, FeeTierSourceDto feeTierSourceDto, IdlDecimal idlDecimal, Integer num, FeeTierDto feeTierDto2, FeeTierDto feeTierDto3, FeeTierStatusDto feeTierStatusDto, Instant instant2, FeeTierDto feeTierDto4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : feeTierDto, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : moneyDto, (i2 & 8) != 0 ? null : moneyDto2, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 64) != 0 ? null : instant, (i2 & 128) != 0 ? null : feeTierSourceDto, (i2 & 256) != 0 ? null : idlDecimal, (i2 & 512) != 0 ? null : num, (i2 & 1024) != 0 ? null : feeTierDto2, (i2 & 2048) != 0 ? null : feeTierDto3, (i2 & 4096) != 0 ? null : feeTierStatusDto, (i2 & 8192) != 0 ? null : instant2, (i2 & 16384) != 0 ? null : feeTierDto4);
        }

        public final List<FeeTierPromoDto> getPromos() {
            return this.promos;
        }

        public final Instant getCurrent_tier_expiration_time() {
            return this.current_tier_expiration_time;
        }

        public final FeeTierSourceDto getFee_tier_source() {
            return this.fee_tier_source;
        }

        public final IdlDecimal getTrading_volume_tier_progress() {
            return this.trading_volume_tier_progress;
        }

        public final Integer getLockup_period_in_seconds() {
            return this.lockup_period_in_seconds;
        }

        public final FeeTierDto getNext_tier() {
            return this.next_tier;
        }

        public final FeeTierDto getPrev_tier() {
            return this.prev_tier;
        }

        public final FeeTierStatusDto getFee_tier_status() {
            return this.fee_tier_status;
        }

        public final Instant getProjected_downgrade_time() {
            return this.projected_downgrade_time;
        }

        public final FeeTierDto getProjected_downgrade_tier() {
            return this.projected_downgrade_tier;
        }
    }

    /* compiled from: StreamCryptoFeeTierInfoSuccessResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamCryptoFeeTierInfoSuccessResponseDto, StreamCryptoFeeTierInfoSuccessResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamCryptoFeeTierInfoSuccessResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamCryptoFeeTierInfoSuccessResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamCryptoFeeTierInfoSuccessResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamCryptoFeeTierInfoSuccessResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamCryptoFeeTierInfoSuccessResponse> getProtoAdapter() {
            return StreamCryptoFeeTierInfoSuccessResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamCryptoFeeTierInfoSuccessResponseDto getZeroValue() {
            return StreamCryptoFeeTierInfoSuccessResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamCryptoFeeTierInfoSuccessResponseDto fromProto(StreamCryptoFeeTierInfoSuccessResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            FeeTier current_fee_tier = proto.getCurrent_fee_tier();
            DefaultConstructorMarker defaultConstructorMarker = null;
            FeeTierDto feeTierDtoFromProto = current_fee_tier != null ? FeeTierDto.INSTANCE.fromProto(current_fee_tier) : null;
            int evaluation_period_days = proto.getEvaluation_period_days();
            Money current_period_trading_amount = proto.getCurrent_period_trading_amount();
            MoneyDto moneyDtoFromProto = current_period_trading_amount != null ? MoneyDto.INSTANCE.fromProto(current_period_trading_amount) : null;
            Money required_trading_amount_for_next_tier = proto.getRequired_trading_amount_for_next_tier();
            MoneyDto moneyDtoFromProto2 = required_trading_amount_for_next_tier != null ? MoneyDto.INSTANCE.fromProto(required_trading_amount_for_next_tier) : null;
            List<FeeTier> available_tiers = proto.getAvailable_tiers();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(available_tiers, 10));
            Iterator<T> it = available_tiers.iterator();
            while (it.hasNext()) {
                arrayList.add(FeeTierDto.INSTANCE.fromProto((FeeTier) it.next()));
            }
            List<FeeTierPromo> promos = proto.getPromos();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(promos, 10));
            Iterator<T> it2 = promos.iterator();
            while (it2.hasNext()) {
                arrayList2.add(FeeTierPromoDto.INSTANCE.fromProto((FeeTierPromo) it2.next()));
            }
            Instant current_tier_expiration_time = proto.getCurrent_tier_expiration_time();
            FeeTierSource fee_tier_source = proto.getFee_tier_source();
            FeeTierSourceDto feeTierSourceDtoFromProto = fee_tier_source != null ? FeeTierSourceDto.INSTANCE.fromProto(fee_tier_source) : null;
            String trading_volume_tier_progress = proto.getTrading_volume_tier_progress();
            IdlDecimal idlDecimal = trading_volume_tier_progress != null ? new IdlDecimal(trading_volume_tier_progress) : null;
            Integer lockup_period_in_seconds = proto.getLockup_period_in_seconds();
            FeeTier next_tier = proto.getNext_tier();
            FeeTierDto feeTierDtoFromProto2 = next_tier != null ? FeeTierDto.INSTANCE.fromProto(next_tier) : null;
            FeeTier prev_tier = proto.getPrev_tier();
            FeeTierDto feeTierDtoFromProto3 = prev_tier != null ? FeeTierDto.INSTANCE.fromProto(prev_tier) : null;
            FeeTierStatus fee_tier_status = proto.getFee_tier_status();
            FeeTierStatusDto feeTierStatusDtoFromProto = fee_tier_status != null ? FeeTierStatusDto.INSTANCE.fromProto(fee_tier_status) : null;
            Instant projected_downgrade_time = proto.getProjected_downgrade_time();
            FeeTier projected_downgrade_tier = proto.getProjected_downgrade_tier();
            return new StreamCryptoFeeTierInfoSuccessResponseDto(new Surrogate(feeTierDtoFromProto, evaluation_period_days, moneyDtoFromProto, moneyDtoFromProto2, arrayList, arrayList2, current_tier_expiration_time, feeTierSourceDtoFromProto, idlDecimal, lockup_period_in_seconds, feeTierDtoFromProto2, feeTierDtoFromProto3, feeTierStatusDtoFromProto, projected_downgrade_time, projected_downgrade_tier != null ? FeeTierDto.INSTANCE.fromProto(projected_downgrade_tier) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoSuccessResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamCryptoFeeTierInfoSuccessResponseDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new StreamCryptoFeeTierInfoSuccessResponseDto(null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamCryptoFeeTierInfoSuccessResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StreamCryptoFeeTierInfoSuccessResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoSuccessResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamCryptoFeeTierInfoSuccessResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamCryptoFeeTierInfoSuccessResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamCryptoFeeTierInfoSuccessResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamCryptoFeeTierInfoSuccessResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoSuccessResponseDto";
        }
    }
}
