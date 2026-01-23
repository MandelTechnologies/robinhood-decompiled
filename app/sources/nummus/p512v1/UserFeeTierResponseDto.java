package nummus.p512v1;

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
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
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
import kotlinx.serialization.internal.StringSerializer;
import nummus.p512v1.FeeTierDto;
import nummus.p512v1.FeeTierPromoDto;
import nummus.p512v1.FeeTierSourceDto;
import nummus.p512v1.FeeTierStatusDto;
import nummus.p512v1.UserFeeTierResponseDto;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: UserFeeTierResponseDto.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b \b\u0007\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004MLNOB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BË\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b7\u0010,R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b:\u00109R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8F¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b?\u0010%R\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bB\u00106R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bG\u00106R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bJ\u0010%R\u0013\u0010 \u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bK\u00106¨\u0006P"}, m3636d2 = {"Lnummus/v1/UserFeeTierResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/UserFeeTierResponse;", "Landroid/os/Parcelable;", "Lnummus/v1/UserFeeTierResponseDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/UserFeeTierResponseDto$Surrogate;)V", "Lnummus/v1/FeeTierDto;", "current_fee_tier", "", "evaluation_period_days", "Lcom/robinhood/rosetta/common/MoneyDto;", "current_period_trading_amount", "required_trading_amount_for_next_tier", "", "available_tiers", "", "account_id", "Lnummus/v1/FeeTierPromoDto;", "promos", "current_tier_expiration_time", "Lnummus/v1/FeeTierSourceDto;", "fee_tier_source", "next_tier", "lockup_period_in_seconds", "Lcom/robinhood/idl/IdlDecimal;", "trading_volume_tier_progress", "prev_tier", "Lnummus/v1/FeeTierStatusDto;", "fee_tier_status", "projected_downgrade_time", "projected_downgrade_tier", "(Lnummus/v1/FeeTierDto;ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lnummus/v1/FeeTierSourceDto;Lnummus/v1/FeeTierDto;Ljava/lang/Integer;Lcom/robinhood/idl/IdlDecimal;Lnummus/v1/FeeTierDto;Lnummus/v1/FeeTierStatusDto;Ljava/lang/String;Lnummus/v1/FeeTierDto;)V", "toProto", "()Lnummus/v1/UserFeeTierResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/UserFeeTierResponseDto$Surrogate;", "getCurrent_fee_tier", "()Lnummus/v1/FeeTierDto;", "getEvaluation_period_days", "getCurrent_period_trading_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getRequired_trading_amount_for_next_tier", "getAvailable_tiers", "()Ljava/util/List;", "getAccount_id", "getPromos", "getCurrent_tier_expiration_time", "getFee_tier_source", "()Lnummus/v1/FeeTierSourceDto;", "getNext_tier", "getLockup_period_in_seconds", "()Ljava/lang/Integer;", "getTrading_volume_tier_progress", "()Lcom/robinhood/idl/IdlDecimal;", "getPrev_tier", "getFee_tier_status", "()Lnummus/v1/FeeTierStatusDto;", "getProjected_downgrade_time", "getProjected_downgrade_tier", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class UserFeeTierResponseDto implements Dto3<UserFeeTierResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<UserFeeTierResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<UserFeeTierResponseDto, UserFeeTierResponse>> binaryBase64Serializer$delegate;
    private static final UserFeeTierResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ UserFeeTierResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private UserFeeTierResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final FeeTierDto getCurrent_fee_tier() {
        return this.surrogate.getCurrent_fee_tier();
    }

    public final int getEvaluation_period_days() {
        return this.surrogate.getEvaluation_period_days();
    }

    public final MoneyDto getCurrent_period_trading_amount() {
        return this.surrogate.getCurrent_period_trading_amount();
    }

    public final MoneyDto getRequired_trading_amount_for_next_tier() {
        return this.surrogate.getRequired_trading_amount_for_next_tier();
    }

    public final List<FeeTierDto> getAvailable_tiers() {
        return this.surrogate.getAvailable_tiers();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final List<FeeTierPromoDto> getPromos() {
        return this.surrogate.getPromos();
    }

    public final String getCurrent_tier_expiration_time() {
        return this.surrogate.getCurrent_tier_expiration_time();
    }

    public final FeeTierSourceDto getFee_tier_source() {
        return this.surrogate.getFee_tier_source();
    }

    public final FeeTierDto getNext_tier() {
        return this.surrogate.getNext_tier();
    }

    public final Integer getLockup_period_in_seconds() {
        return this.surrogate.getLockup_period_in_seconds();
    }

    public final IdlDecimal getTrading_volume_tier_progress() {
        return this.surrogate.getTrading_volume_tier_progress();
    }

    public final FeeTierDto getPrev_tier() {
        return this.surrogate.getPrev_tier();
    }

    public final FeeTierStatusDto getFee_tier_status() {
        return this.surrogate.getFee_tier_status();
    }

    public final String getProjected_downgrade_time() {
        return this.surrogate.getProjected_downgrade_time();
    }

    public final FeeTierDto getProjected_downgrade_tier() {
        return this.surrogate.getProjected_downgrade_tier();
    }

    public /* synthetic */ UserFeeTierResponseDto(FeeTierDto feeTierDto, int i, MoneyDto moneyDto, MoneyDto moneyDto2, List list, String str, List list2, String str2, FeeTierSourceDto feeTierSourceDto, FeeTierDto feeTierDto2, Integer num, IdlDecimal idlDecimal, FeeTierDto feeTierDto3, FeeTierStatusDto feeTierStatusDto, String str3, FeeTierDto feeTierDto4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : feeTierDto, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : moneyDto, (i2 & 8) != 0 ? null : moneyDto2, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? FeeTierSourceDto.INSTANCE.getZeroValue() : feeTierSourceDto, (i2 & 512) != 0 ? null : feeTierDto2, (i2 & 1024) != 0 ? null : num, (i2 & 2048) != 0 ? null : idlDecimal, (i2 & 4096) != 0 ? null : feeTierDto3, (i2 & 8192) != 0 ? null : feeTierStatusDto, (i2 & 16384) != 0 ? null : str3, (i2 & 32768) != 0 ? null : feeTierDto4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserFeeTierResponseDto(FeeTierDto feeTierDto, int i, MoneyDto moneyDto, MoneyDto moneyDto2, List<FeeTierDto> available_tiers, String account_id, List<FeeTierPromoDto> promos, String str, FeeTierSourceDto fee_tier_source, FeeTierDto feeTierDto2, Integer num, IdlDecimal idlDecimal, FeeTierDto feeTierDto3, FeeTierStatusDto feeTierStatusDto, String str2, FeeTierDto feeTierDto4) {
        this(new Surrogate(feeTierDto, i, moneyDto, moneyDto2, available_tiers, account_id, promos, str, fee_tier_source, feeTierDto2, num, idlDecimal, feeTierDto3, feeTierStatusDto, str2, feeTierDto4));
        Intrinsics.checkNotNullParameter(available_tiers, "available_tiers");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(promos, "promos");
        Intrinsics.checkNotNullParameter(fee_tier_source, "fee_tier_source");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public UserFeeTierResponse toProto() {
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
        String account_id = this.surrogate.getAccount_id();
        List<FeeTierPromoDto> promos = this.surrogate.getPromos();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(promos, 10));
        Iterator<T> it2 = promos.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FeeTierPromoDto) it2.next()).toProto());
        }
        String current_tier_expiration_time = this.surrogate.getCurrent_tier_expiration_time();
        FeeTierSource feeTierSource = (FeeTierSource) this.surrogate.getFee_tier_source().toProto();
        FeeTierDto next_tier = this.surrogate.getNext_tier();
        FeeTier proto4 = next_tier != null ? next_tier.toProto() : null;
        Integer lockup_period_in_seconds = this.surrogate.getLockup_period_in_seconds();
        IdlDecimal trading_volume_tier_progress = this.surrogate.getTrading_volume_tier_progress();
        String stringValue = trading_volume_tier_progress != null ? trading_volume_tier_progress.getStringValue() : null;
        FeeTierDto prev_tier = this.surrogate.getPrev_tier();
        FeeTier proto5 = prev_tier != null ? prev_tier.toProto() : null;
        FeeTierStatusDto fee_tier_status = this.surrogate.getFee_tier_status();
        FeeTierStatus feeTierStatus = fee_tier_status != null ? (FeeTierStatus) fee_tier_status.toProto() : null;
        String projected_downgrade_time = this.surrogate.getProjected_downgrade_time();
        FeeTierDto projected_downgrade_tier = this.surrogate.getProjected_downgrade_tier();
        return new UserFeeTierResponse(proto, evaluation_period_days, proto2, proto3, arrayList, account_id, arrayList2, current_tier_expiration_time, feeTierSource, proto4, lockup_period_in_seconds, stringValue, proto5, feeTierStatus, projected_downgrade_time, projected_downgrade_tier != null ? projected_downgrade_tier.toProto() : null, null, 65536, null);
    }

    public String toString() {
        return "[UserFeeTierResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof UserFeeTierResponseDto) && Intrinsics.areEqual(((UserFeeTierResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: UserFeeTierResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b6\b\u0083\b\u0018\u0000 g2\u00020\u0001:\u0002hgBö\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0019\b\u0002\u0010\u0016\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0019\b\u0002\u0010\u0019\u001a\u0013\u0018\u00010\u0017¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 BÅ\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J'\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00106\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010;\u0012\u0004\b=\u0010:\u001a\u0004\b<\u00101R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010>\u0012\u0004\bA\u0010:\u001a\u0004\b?\u0010@R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010>\u0012\u0004\bC\u0010:\u001a\u0004\bB\u0010@R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010D\u0012\u0004\bG\u0010:\u001a\u0004\bE\u0010FR \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010H\u0012\u0004\bJ\u0010:\u001a\u0004\bI\u0010/R&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010D\u0012\u0004\bL\u0010:\u001a\u0004\bK\u0010FR\"\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010H\u0012\u0004\bN\u0010:\u001a\u0004\bM\u0010/R \u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010O\u0012\u0004\bR\u0010:\u001a\u0004\bP\u0010QR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u00106\u0012\u0004\bT\u0010:\u001a\u0004\bS\u00108R1\u0010\u0016\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010U\u0012\u0004\bX\u0010:\u001a\u0004\bV\u0010WR1\u0010\u0019\u001a\u0013\u0018\u00010\u0017¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010Y\u0012\u0004\b\\\u0010:\u001a\u0004\bZ\u0010[R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u00106\u0012\u0004\b^\u0010:\u001a\u0004\b]\u00108R\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010_\u0012\u0004\bb\u0010:\u001a\u0004\b`\u0010aR\"\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010H\u0012\u0004\bd\u0010:\u001a\u0004\bc\u0010/R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00106\u0012\u0004\bf\u0010:\u001a\u0004\be\u00108¨\u0006i"}, m3636d2 = {"Lnummus/v1/UserFeeTierResponseDto$Surrogate;", "", "Lnummus/v1/FeeTierDto;", "current_fee_tier", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "evaluation_period_days", "Lcom/robinhood/rosetta/common/MoneyDto;", "current_period_trading_amount", "required_trading_amount_for_next_tier", "", "available_tiers", "", "account_id", "Lnummus/v1/FeeTierPromoDto;", "promos", "current_tier_expiration_time", "Lnummus/v1/FeeTierSourceDto;", "fee_tier_source", "next_tier", "lockup_period_in_seconds", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "trading_volume_tier_progress", "prev_tier", "Lnummus/v1/FeeTierStatusDto;", "fee_tier_status", "projected_downgrade_time", "projected_downgrade_tier", "<init>", "(Lnummus/v1/FeeTierDto;ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lnummus/v1/FeeTierSourceDto;Lnummus/v1/FeeTierDto;Ljava/lang/Integer;Lcom/robinhood/idl/IdlDecimal;Lnummus/v1/FeeTierDto;Lnummus/v1/FeeTierStatusDto;Ljava/lang/String;Lnummus/v1/FeeTierDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILnummus/v1/FeeTierDto;ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lnummus/v1/FeeTierSourceDto;Lnummus/v1/FeeTierDto;Ljava/lang/Integer;Lcom/robinhood/idl/IdlDecimal;Lnummus/v1/FeeTierDto;Lnummus/v1/FeeTierStatusDto;Ljava/lang/String;Lnummus/v1/FeeTierDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/UserFeeTierResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnummus/v1/FeeTierDto;", "getCurrent_fee_tier", "()Lnummus/v1/FeeTierDto;", "getCurrent_fee_tier$annotations", "()V", "I", "getEvaluation_period_days", "getEvaluation_period_days$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getCurrent_period_trading_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getCurrent_period_trading_amount$annotations", "getRequired_trading_amount_for_next_tier", "getRequired_trading_amount_for_next_tier$annotations", "Ljava/util/List;", "getAvailable_tiers", "()Ljava/util/List;", "getAvailable_tiers$annotations", "Ljava/lang/String;", "getAccount_id", "getAccount_id$annotations", "getPromos", "getPromos$annotations", "getCurrent_tier_expiration_time", "getCurrent_tier_expiration_time$annotations", "Lnummus/v1/FeeTierSourceDto;", "getFee_tier_source", "()Lnummus/v1/FeeTierSourceDto;", "getFee_tier_source$annotations", "getNext_tier", "getNext_tier$annotations", "Ljava/lang/Integer;", "getLockup_period_in_seconds", "()Ljava/lang/Integer;", "getLockup_period_in_seconds$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getTrading_volume_tier_progress", "()Lcom/robinhood/idl/IdlDecimal;", "getTrading_volume_tier_progress$annotations", "getPrev_tier", "getPrev_tier$annotations", "Lnummus/v1/FeeTierStatusDto;", "getFee_tier_status", "()Lnummus/v1/FeeTierStatusDto;", "getFee_tier_status$annotations", "getProjected_downgrade_time", "getProjected_downgrade_time$annotations", "getProjected_downgrade_tier", "getProjected_downgrade_tier$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final List<FeeTierDto> available_tiers;
        private final FeeTierDto current_fee_tier;
        private final MoneyDto current_period_trading_amount;
        private final String current_tier_expiration_time;
        private final int evaluation_period_days;
        private final FeeTierSourceDto fee_tier_source;
        private final FeeTierStatusDto fee_tier_status;
        private final Integer lockup_period_in_seconds;
        private final FeeTierDto next_tier;
        private final FeeTierDto prev_tier;
        private final FeeTierDto projected_downgrade_tier;
        private final String projected_downgrade_time;
        private final List<FeeTierPromoDto> promos;
        private final MoneyDto required_trading_amount_for_next_tier;
        private final IdlDecimal trading_volume_tier_progress;

        public Surrogate() {
            this((FeeTierDto) null, 0, (MoneyDto) null, (MoneyDto) null, (List) null, (String) null, (List) null, (String) null, (FeeTierSourceDto) null, (FeeTierDto) null, (Integer) null, (IdlDecimal) null, (FeeTierDto) null, (FeeTierStatusDto) null, (String) null, (FeeTierDto) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, (DefaultConstructorMarker) null);
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
            return Intrinsics.areEqual(this.current_fee_tier, surrogate.current_fee_tier) && this.evaluation_period_days == surrogate.evaluation_period_days && Intrinsics.areEqual(this.current_period_trading_amount, surrogate.current_period_trading_amount) && Intrinsics.areEqual(this.required_trading_amount_for_next_tier, surrogate.required_trading_amount_for_next_tier) && Intrinsics.areEqual(this.available_tiers, surrogate.available_tiers) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.promos, surrogate.promos) && Intrinsics.areEqual(this.current_tier_expiration_time, surrogate.current_tier_expiration_time) && this.fee_tier_source == surrogate.fee_tier_source && Intrinsics.areEqual(this.next_tier, surrogate.next_tier) && Intrinsics.areEqual(this.lockup_period_in_seconds, surrogate.lockup_period_in_seconds) && Intrinsics.areEqual(this.trading_volume_tier_progress, surrogate.trading_volume_tier_progress) && Intrinsics.areEqual(this.prev_tier, surrogate.prev_tier) && this.fee_tier_status == surrogate.fee_tier_status && Intrinsics.areEqual(this.projected_downgrade_time, surrogate.projected_downgrade_time) && Intrinsics.areEqual(this.projected_downgrade_tier, surrogate.projected_downgrade_tier);
        }

        public int hashCode() {
            FeeTierDto feeTierDto = this.current_fee_tier;
            int iHashCode = (((feeTierDto == null ? 0 : feeTierDto.hashCode()) * 31) + Integer.hashCode(this.evaluation_period_days)) * 31;
            MoneyDto moneyDto = this.current_period_trading_amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.required_trading_amount_for_next_tier;
            int iHashCode3 = (((((((iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31) + this.available_tiers.hashCode()) * 31) + this.account_id.hashCode()) * 31) + this.promos.hashCode()) * 31;
            String str = this.current_tier_expiration_time;
            int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.fee_tier_source.hashCode()) * 31;
            FeeTierDto feeTierDto2 = this.next_tier;
            int iHashCode5 = (iHashCode4 + (feeTierDto2 == null ? 0 : feeTierDto2.hashCode())) * 31;
            Integer num = this.lockup_period_in_seconds;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            IdlDecimal idlDecimal = this.trading_volume_tier_progress;
            int iHashCode7 = (iHashCode6 + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            FeeTierDto feeTierDto3 = this.prev_tier;
            int iHashCode8 = (iHashCode7 + (feeTierDto3 == null ? 0 : feeTierDto3.hashCode())) * 31;
            FeeTierStatusDto feeTierStatusDto = this.fee_tier_status;
            int iHashCode9 = (iHashCode8 + (feeTierStatusDto == null ? 0 : feeTierStatusDto.hashCode())) * 31;
            String str2 = this.projected_downgrade_time;
            int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
            FeeTierDto feeTierDto4 = this.projected_downgrade_tier;
            return iHashCode10 + (feeTierDto4 != null ? feeTierDto4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(current_fee_tier=" + this.current_fee_tier + ", evaluation_period_days=" + this.evaluation_period_days + ", current_period_trading_amount=" + this.current_period_trading_amount + ", required_trading_amount_for_next_tier=" + this.required_trading_amount_for_next_tier + ", available_tiers=" + this.available_tiers + ", account_id=" + this.account_id + ", promos=" + this.promos + ", current_tier_expiration_time=" + this.current_tier_expiration_time + ", fee_tier_source=" + this.fee_tier_source + ", next_tier=" + this.next_tier + ", lockup_period_in_seconds=" + this.lockup_period_in_seconds + ", trading_volume_tier_progress=" + this.trading_volume_tier_progress + ", prev_tier=" + this.prev_tier + ", fee_tier_status=" + this.fee_tier_status + ", projected_downgrade_time=" + this.projected_downgrade_time + ", projected_downgrade_tier=" + this.projected_downgrade_tier + ")";
        }

        /* compiled from: UserFeeTierResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/UserFeeTierResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/UserFeeTierResponseDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return UserFeeTierResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: nummus.v1.UserFeeTierResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UserFeeTierResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: nummus.v1.UserFeeTierResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UserFeeTierResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null, null, null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, FeeTierDto feeTierDto, int i2, MoneyDto moneyDto, MoneyDto moneyDto2, List list, String str, List list2, String str2, FeeTierSourceDto feeTierSourceDto, FeeTierDto feeTierDto2, Integer num, IdlDecimal idlDecimal, FeeTierDto feeTierDto3, FeeTierStatusDto feeTierStatusDto, String str3, FeeTierDto feeTierDto4, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.account_id = "";
            } else {
                this.account_id = str;
            }
            if ((i & 64) == 0) {
                this.promos = CollectionsKt.emptyList();
            } else {
                this.promos = list2;
            }
            if ((i & 128) == 0) {
                this.current_tier_expiration_time = null;
            } else {
                this.current_tier_expiration_time = str2;
            }
            if ((i & 256) == 0) {
                this.fee_tier_source = FeeTierSourceDto.INSTANCE.getZeroValue();
            } else {
                this.fee_tier_source = feeTierSourceDto;
            }
            if ((i & 512) == 0) {
                this.next_tier = null;
            } else {
                this.next_tier = feeTierDto2;
            }
            if ((i & 1024) == 0) {
                this.lockup_period_in_seconds = null;
            } else {
                this.lockup_period_in_seconds = num;
            }
            if ((i & 2048) == 0) {
                this.trading_volume_tier_progress = null;
            } else {
                this.trading_volume_tier_progress = idlDecimal;
            }
            if ((i & 4096) == 0) {
                this.prev_tier = null;
            } else {
                this.prev_tier = feeTierDto3;
            }
            if ((i & 8192) == 0) {
                this.fee_tier_status = null;
            } else {
                this.fee_tier_status = feeTierStatusDto;
            }
            if ((i & 16384) == 0) {
                this.projected_downgrade_time = null;
            } else {
                this.projected_downgrade_time = str3;
            }
            if ((i & 32768) == 0) {
                this.projected_downgrade_tier = null;
            } else {
                this.projected_downgrade_tier = feeTierDto4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
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
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 5, self.account_id);
            }
            if (!Intrinsics.areEqual(self.promos, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.promos);
            }
            String str = self.current_tier_expiration_time;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str);
            }
            if (self.fee_tier_source != FeeTierSourceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, FeeTierSourceDto.Serializer.INSTANCE, self.fee_tier_source);
            }
            FeeTierDto feeTierDto2 = self.next_tier;
            if (feeTierDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, FeeTierDto.Serializer.INSTANCE, feeTierDto2);
            }
            Integer num = self.lockup_period_in_seconds;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            IdlDecimal idlDecimal = self.trading_volume_tier_progress;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            FeeTierDto feeTierDto3 = self.prev_tier;
            if (feeTierDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, FeeTierDto.Serializer.INSTANCE, feeTierDto3);
            }
            FeeTierStatusDto feeTierStatusDto = self.fee_tier_status;
            if (feeTierStatusDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, FeeTierStatusDto.Serializer.INSTANCE, feeTierStatusDto);
            }
            String str2 = self.projected_downgrade_time;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, str2);
            }
            FeeTierDto feeTierDto4 = self.projected_downgrade_tier;
            if (feeTierDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, FeeTierDto.Serializer.INSTANCE, feeTierDto4);
            }
        }

        public Surrogate(FeeTierDto feeTierDto, int i, MoneyDto moneyDto, MoneyDto moneyDto2, List<FeeTierDto> available_tiers, String account_id, List<FeeTierPromoDto> promos, String str, FeeTierSourceDto fee_tier_source, FeeTierDto feeTierDto2, Integer num, IdlDecimal idlDecimal, FeeTierDto feeTierDto3, FeeTierStatusDto feeTierStatusDto, String str2, FeeTierDto feeTierDto4) {
            Intrinsics.checkNotNullParameter(available_tiers, "available_tiers");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(promos, "promos");
            Intrinsics.checkNotNullParameter(fee_tier_source, "fee_tier_source");
            this.current_fee_tier = feeTierDto;
            this.evaluation_period_days = i;
            this.current_period_trading_amount = moneyDto;
            this.required_trading_amount_for_next_tier = moneyDto2;
            this.available_tiers = available_tiers;
            this.account_id = account_id;
            this.promos = promos;
            this.current_tier_expiration_time = str;
            this.fee_tier_source = fee_tier_source;
            this.next_tier = feeTierDto2;
            this.lockup_period_in_seconds = num;
            this.trading_volume_tier_progress = idlDecimal;
            this.prev_tier = feeTierDto3;
            this.fee_tier_status = feeTierStatusDto;
            this.projected_downgrade_time = str2;
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

        public /* synthetic */ Surrogate(FeeTierDto feeTierDto, int i, MoneyDto moneyDto, MoneyDto moneyDto2, List list, String str, List list2, String str2, FeeTierSourceDto feeTierSourceDto, FeeTierDto feeTierDto2, Integer num, IdlDecimal idlDecimal, FeeTierDto feeTierDto3, FeeTierStatusDto feeTierStatusDto, String str3, FeeTierDto feeTierDto4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : feeTierDto, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : moneyDto, (i2 & 8) != 0 ? null : moneyDto2, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? FeeTierSourceDto.INSTANCE.getZeroValue() : feeTierSourceDto, (i2 & 512) != 0 ? null : feeTierDto2, (i2 & 1024) != 0 ? null : num, (i2 & 2048) != 0 ? null : idlDecimal, (i2 & 4096) != 0 ? null : feeTierDto3, (i2 & 8192) != 0 ? null : feeTierStatusDto, (i2 & 16384) != 0 ? null : str3, (i2 & 32768) != 0 ? null : feeTierDto4);
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final List<FeeTierPromoDto> getPromos() {
            return this.promos;
        }

        public final String getCurrent_tier_expiration_time() {
            return this.current_tier_expiration_time;
        }

        public final FeeTierSourceDto getFee_tier_source() {
            return this.fee_tier_source;
        }

        public final FeeTierDto getNext_tier() {
            return this.next_tier;
        }

        public final Integer getLockup_period_in_seconds() {
            return this.lockup_period_in_seconds;
        }

        public final IdlDecimal getTrading_volume_tier_progress() {
            return this.trading_volume_tier_progress;
        }

        public final FeeTierDto getPrev_tier() {
            return this.prev_tier;
        }

        public final FeeTierStatusDto getFee_tier_status() {
            return this.fee_tier_status;
        }

        public final String getProjected_downgrade_time() {
            return this.projected_downgrade_time;
        }

        public final FeeTierDto getProjected_downgrade_tier() {
            return this.projected_downgrade_tier;
        }
    }

    /* compiled from: UserFeeTierResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/UserFeeTierResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/UserFeeTierResponseDto;", "Lnummus/v1/UserFeeTierResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/UserFeeTierResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<UserFeeTierResponseDto, UserFeeTierResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UserFeeTierResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UserFeeTierResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UserFeeTierResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) UserFeeTierResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<UserFeeTierResponse> getProtoAdapter() {
            return UserFeeTierResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UserFeeTierResponseDto getZeroValue() {
            return UserFeeTierResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UserFeeTierResponseDto fromProto(UserFeeTierResponse proto) {
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
            String account_id = proto.getAccount_id();
            List<FeeTierPromo> promos = proto.getPromos();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(promos, 10));
            Iterator<T> it2 = promos.iterator();
            while (it2.hasNext()) {
                arrayList2.add(FeeTierPromoDto.INSTANCE.fromProto((FeeTierPromo) it2.next()));
            }
            String current_tier_expiration_time = proto.getCurrent_tier_expiration_time();
            FeeTierSourceDto feeTierSourceDtoFromProto = FeeTierSourceDto.INSTANCE.fromProto(proto.getFee_tier_source());
            FeeTier next_tier = proto.getNext_tier();
            FeeTierDto feeTierDtoFromProto2 = next_tier != null ? FeeTierDto.INSTANCE.fromProto(next_tier) : null;
            Integer lockup_period_in_seconds = proto.getLockup_period_in_seconds();
            String trading_volume_tier_progress = proto.getTrading_volume_tier_progress();
            IdlDecimal idlDecimal = trading_volume_tier_progress != null ? new IdlDecimal(trading_volume_tier_progress) : null;
            FeeTier prev_tier = proto.getPrev_tier();
            FeeTierDto feeTierDtoFromProto3 = prev_tier != null ? FeeTierDto.INSTANCE.fromProto(prev_tier) : null;
            FeeTierStatus fee_tier_status = proto.getFee_tier_status();
            FeeTierStatusDto feeTierStatusDtoFromProto = fee_tier_status != null ? FeeTierStatusDto.INSTANCE.fromProto(fee_tier_status) : null;
            String projected_downgrade_time = proto.getProjected_downgrade_time();
            FeeTier projected_downgrade_tier = proto.getProjected_downgrade_tier();
            return new UserFeeTierResponseDto(new Surrogate(feeTierDtoFromProto, evaluation_period_days, moneyDtoFromProto, moneyDtoFromProto2, arrayList, account_id, arrayList2, current_tier_expiration_time, feeTierSourceDtoFromProto, feeTierDtoFromProto2, lockup_period_in_seconds, idlDecimal, feeTierDtoFromProto3, feeTierStatusDtoFromProto, projected_downgrade_time, projected_downgrade_tier != null ? FeeTierDto.INSTANCE.fromProto(projected_downgrade_tier) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.UserFeeTierResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserFeeTierResponseDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new UserFeeTierResponseDto(null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: UserFeeTierResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/UserFeeTierResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/UserFeeTierResponseDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/UserFeeTierResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<UserFeeTierResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.UserFeeTierResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, UserFeeTierResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public UserFeeTierResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new UserFeeTierResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: UserFeeTierResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/UserFeeTierResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "nummus.v1.UserFeeTierResponseDto";
        }
    }
}
