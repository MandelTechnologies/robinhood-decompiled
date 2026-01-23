package moneytree.p510v1;

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
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import moneytree.p510v1.MMFProgramStateDto;
import p479j$.time.Instant;

/* compiled from: GetMembershipDetailsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004BACDB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B¿\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017¢\u0006\u0004\b\u0006\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020'H\u0016¢\u0006\u0004\b0\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b8\u00107R\u0011\u0010\u0011\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b9\u00105R\u0011\u0010\u0013\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b:\u0010!R\u0011\u0010\u0014\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b;\u0010!R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b<\u00107R\u0011\u0010\u0019\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b=\u00105R\u0019\u0010\u001a\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00178F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b@\u00105¨\u0006E"}, m3636d2 = {"Lmoneytree/v1/GetMembershipDetailsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmoneytree/v1/GetMembershipDetailsResponse;", "Landroid/os/Parcelable;", "Lmoneytree/v1/GetMembershipDetailsResponseDto$Surrogate;", "surrogate", "<init>", "(Lmoneytree/v1/GetMembershipDetailsResponseDto$Surrogate;)V", "Lmoneytree/v1/MMFProgramStateDto;", "enrollment_state", "Lcom/robinhood/idl/IdlDecimal;", "apy_rate", "Lcom/robinhood/rosetta/common/MoneyDto;", "lifetime_interest_paid", "sweep_balance", "", "key_information_document_url", "fee_percentage", "insurance_amount", "cta_text", "cta_deeplink", "interest_accrued", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "next_payment_date", "promo_period_apy", "promo_period_apy_expiry", "promo_period_fee", "enrollment_created_at", "(Lmoneytree/v1/MMFProgramStateDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;)V", "toProto", "()Lmoneytree/v1/GetMembershipDetailsResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmoneytree/v1/GetMembershipDetailsResponseDto$Surrogate;", "getEnrollment_state", "()Lmoneytree/v1/MMFProgramStateDto;", "getApy_rate", "()Lcom/robinhood/idl/IdlDecimal;", "getLifetime_interest_paid", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getSweep_balance", "getFee_percentage", "getCta_text", "getCta_deeplink", "getInterest_accrued", "getPromo_period_apy", "getPromo_period_apy_expiry", "()Lj$/time/Instant;", "getPromo_period_fee", "Companion", "Surrogate", "Serializer", "MultibindingModule", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class GetMembershipDetailsResponseDto implements Dto3<GetMembershipDetailsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetMembershipDetailsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetMembershipDetailsResponseDto, GetMembershipDetailsResponse>> binaryBase64Serializer$delegate;
    private static final GetMembershipDetailsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetMembershipDetailsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetMembershipDetailsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MMFProgramStateDto getEnrollment_state() {
        return this.surrogate.getEnrollment_state();
    }

    public final IdlDecimal getApy_rate() {
        return this.surrogate.getApy_rate();
    }

    public final MoneyDto getLifetime_interest_paid() {
        return this.surrogate.getLifetime_interest_paid();
    }

    public final MoneyDto getSweep_balance() {
        return this.surrogate.getSweep_balance();
    }

    public final IdlDecimal getFee_percentage() {
        return this.surrogate.getFee_percentage();
    }

    public final String getCta_text() {
        return this.surrogate.getCta_text();
    }

    public final String getCta_deeplink() {
        return this.surrogate.getCta_deeplink();
    }

    public final MoneyDto getInterest_accrued() {
        return this.surrogate.getInterest_accrued();
    }

    public final IdlDecimal getPromo_period_apy() {
        return this.surrogate.getPromo_period_apy();
    }

    public final Instant getPromo_period_apy_expiry() {
        return this.surrogate.getPromo_period_apy_expiry();
    }

    public final IdlDecimal getPromo_period_fee() {
        return this.surrogate.getPromo_period_fee();
    }

    public /* synthetic */ GetMembershipDetailsResponseDto(MMFProgramStateDto mMFProgramStateDto, IdlDecimal idlDecimal, MoneyDto moneyDto, MoneyDto moneyDto2, String str, IdlDecimal idlDecimal2, MoneyDto moneyDto3, String str2, String str3, MoneyDto moneyDto4, Instant instant, IdlDecimal idlDecimal3, Instant instant2, IdlDecimal idlDecimal4, Instant instant3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MMFProgramStateDto.INSTANCE.getZeroValue() : mMFProgramStateDto, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? null : moneyDto, (i & 8) != 0 ? null : moneyDto2, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 64) != 0 ? null : moneyDto3, (i & 128) != 0 ? "" : str2, (i & 256) != 0 ? "" : str3, (i & 512) != 0 ? null : moneyDto4, (i & 1024) != 0 ? null : instant, (i & 2048) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 4096) != 0 ? null : instant2, (i & 8192) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 16384) != 0 ? null : instant3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetMembershipDetailsResponseDto(MMFProgramStateDto enrollment_state, IdlDecimal apy_rate, MoneyDto moneyDto, MoneyDto moneyDto2, String key_information_document_url, IdlDecimal fee_percentage, MoneyDto moneyDto3, String cta_text, String cta_deeplink, MoneyDto moneyDto4, Instant instant, IdlDecimal promo_period_apy, Instant instant2, IdlDecimal promo_period_fee, Instant instant3) {
        this(new Surrogate(enrollment_state, apy_rate, moneyDto, moneyDto2, key_information_document_url, fee_percentage, moneyDto3, cta_text, cta_deeplink, moneyDto4, instant, promo_period_apy, instant2, promo_period_fee, instant3));
        Intrinsics.checkNotNullParameter(enrollment_state, "enrollment_state");
        Intrinsics.checkNotNullParameter(apy_rate, "apy_rate");
        Intrinsics.checkNotNullParameter(key_information_document_url, "key_information_document_url");
        Intrinsics.checkNotNullParameter(fee_percentage, "fee_percentage");
        Intrinsics.checkNotNullParameter(cta_text, "cta_text");
        Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
        Intrinsics.checkNotNullParameter(promo_period_apy, "promo_period_apy");
        Intrinsics.checkNotNullParameter(promo_period_fee, "promo_period_fee");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetMembershipDetailsResponse toProto() {
        MMFProgramState mMFProgramState = (MMFProgramState) this.surrogate.getEnrollment_state().toProto();
        String stringValue = this.surrogate.getApy_rate().getStringValue();
        MoneyDto lifetime_interest_paid = this.surrogate.getLifetime_interest_paid();
        Money proto = lifetime_interest_paid != null ? lifetime_interest_paid.toProto() : null;
        MoneyDto sweep_balance = this.surrogate.getSweep_balance();
        Money proto2 = sweep_balance != null ? sweep_balance.toProto() : null;
        String key_information_document_url = this.surrogate.getKey_information_document_url();
        String stringValue2 = this.surrogate.getFee_percentage().getStringValue();
        MoneyDto insurance_amount = this.surrogate.getInsurance_amount();
        Money proto3 = insurance_amount != null ? insurance_amount.toProto() : null;
        String cta_text = this.surrogate.getCta_text();
        String cta_deeplink = this.surrogate.getCta_deeplink();
        MoneyDto interest_accrued = this.surrogate.getInterest_accrued();
        return new GetMembershipDetailsResponse(mMFProgramState, stringValue, proto, proto2, key_information_document_url, stringValue2, proto3, cta_text, cta_deeplink, interest_accrued != null ? interest_accrued.toProto() : null, this.surrogate.getNext_payment_date(), this.surrogate.getPromo_period_apy().getStringValue(), this.surrogate.getPromo_period_apy_expiry(), this.surrogate.getPromo_period_fee().getStringValue(), this.surrogate.getEnrollment_created_at(), null, 32768, null);
    }

    public String toString() {
        return "[GetMembershipDetailsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetMembershipDetailsResponseDto) && Intrinsics.areEqual(((GetMembershipDetailsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetMembershipDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b-\b\u0083\b\u0018\u0000 [2\u00020\u0001:\u0002\\[BÓ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u0013j\u0013\u0018\u0001`\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0015\u0012\u0017\b\u0002\u0010\u0017\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012.\b\u0002\u0010\u0018\u001a(\u0018\u00010\u0013j\u0013\u0018\u0001`\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0015\u0012\u0017\b\u0002\u0010\u0019\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012.\b\u0002\u0010\u001a\u001a(\u0018\u00010\u0013j\u0013\u0018\u0001`\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0015¢\u0006\u0004\b\u001b\u0010\u001cB±\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J'\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00108\u0012\u0004\b;\u00107\u001a\u0004\b9\u0010:R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010<\u0012\u0004\b?\u00107\u001a\u0004\b=\u0010>R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\bA\u00107\u001a\u0004\b@\u0010>R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010B\u0012\u0004\bD\u00107\u001a\u0004\bC\u0010,R/\u0010\u000e\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00108\u0012\u0004\bF\u00107\u001a\u0004\bE\u0010:R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010<\u0012\u0004\bH\u00107\u001a\u0004\bG\u0010>R \u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010B\u0012\u0004\bJ\u00107\u001a\u0004\bI\u0010,R \u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010B\u0012\u0004\bL\u00107\u001a\u0004\bK\u0010,R\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010<\u0012\u0004\bN\u00107\u001a\u0004\bM\u0010>RF\u0010\u0016\u001a(\u0018\u00010\u0013j\u0013\u0018\u0001`\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010O\u0012\u0004\bR\u00107\u001a\u0004\bP\u0010QR/\u0010\u0017\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00108\u0012\u0004\bT\u00107\u001a\u0004\bS\u0010:RF\u0010\u0018\u001a(\u0018\u00010\u0013j\u0013\u0018\u0001`\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010O\u0012\u0004\bV\u00107\u001a\u0004\bU\u0010QR/\u0010\u0019\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00108\u0012\u0004\bX\u00107\u001a\u0004\bW\u0010:RF\u0010\u001a\u001a(\u0018\u00010\u0013j\u0013\u0018\u0001`\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0015¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010O\u0012\u0004\bZ\u00107\u001a\u0004\bY\u0010Q¨\u0006]"}, m3636d2 = {"Lmoneytree/v1/GetMembershipDetailsResponseDto$Surrogate;", "", "Lmoneytree/v1/MMFProgramStateDto;", "enrollment_state", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "apy_rate", "Lcom/robinhood/rosetta/common/MoneyDto;", "lifetime_interest_paid", "sweep_balance", "", "key_information_document_url", "fee_percentage", "insurance_amount", "cta_text", "cta_deeplink", "interest_accrued", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "next_payment_date", "promo_period_apy", "promo_period_apy_expiry", "promo_period_fee", "enrollment_created_at", "<init>", "(Lmoneytree/v1/MMFProgramStateDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmoneytree/v1/MMFProgramStateDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$moneytree_v1_externalRelease", "(Lmoneytree/v1/GetMembershipDetailsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmoneytree/v1/MMFProgramStateDto;", "getEnrollment_state", "()Lmoneytree/v1/MMFProgramStateDto;", "getEnrollment_state$annotations", "()V", "Lcom/robinhood/idl/IdlDecimal;", "getApy_rate", "()Lcom/robinhood/idl/IdlDecimal;", "getApy_rate$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getLifetime_interest_paid", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getLifetime_interest_paid$annotations", "getSweep_balance", "getSweep_balance$annotations", "Ljava/lang/String;", "getKey_information_document_url", "getKey_information_document_url$annotations", "getFee_percentage", "getFee_percentage$annotations", "getInsurance_amount", "getInsurance_amount$annotations", "getCta_text", "getCta_text$annotations", "getCta_deeplink", "getCta_deeplink$annotations", "getInterest_accrued", "getInterest_accrued$annotations", "Lj$/time/Instant;", "getNext_payment_date", "()Lj$/time/Instant;", "getNext_payment_date$annotations", "getPromo_period_apy", "getPromo_period_apy$annotations", "getPromo_period_apy_expiry", "getPromo_period_apy_expiry$annotations", "getPromo_period_fee", "getPromo_period_fee$annotations", "getEnrollment_created_at", "getEnrollment_created_at$annotations", "Companion", "$serializer", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal apy_rate;
        private final String cta_deeplink;
        private final String cta_text;
        private final Instant enrollment_created_at;
        private final MMFProgramStateDto enrollment_state;
        private final IdlDecimal fee_percentage;
        private final MoneyDto insurance_amount;
        private final MoneyDto interest_accrued;
        private final String key_information_document_url;
        private final MoneyDto lifetime_interest_paid;
        private final Instant next_payment_date;
        private final IdlDecimal promo_period_apy;
        private final Instant promo_period_apy_expiry;
        private final IdlDecimal promo_period_fee;
        private final MoneyDto sweep_balance;

        public Surrogate() {
            this((MMFProgramStateDto) null, (IdlDecimal) null, (MoneyDto) null, (MoneyDto) null, (String) null, (IdlDecimal) null, (MoneyDto) null, (String) null, (String) null, (MoneyDto) null, (Instant) null, (IdlDecimal) null, (Instant) null, (IdlDecimal) null, (Instant) null, 32767, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.enrollment_state == surrogate.enrollment_state && Intrinsics.areEqual(this.apy_rate, surrogate.apy_rate) && Intrinsics.areEqual(this.lifetime_interest_paid, surrogate.lifetime_interest_paid) && Intrinsics.areEqual(this.sweep_balance, surrogate.sweep_balance) && Intrinsics.areEqual(this.key_information_document_url, surrogate.key_information_document_url) && Intrinsics.areEqual(this.fee_percentage, surrogate.fee_percentage) && Intrinsics.areEqual(this.insurance_amount, surrogate.insurance_amount) && Intrinsics.areEqual(this.cta_text, surrogate.cta_text) && Intrinsics.areEqual(this.cta_deeplink, surrogate.cta_deeplink) && Intrinsics.areEqual(this.interest_accrued, surrogate.interest_accrued) && Intrinsics.areEqual(this.next_payment_date, surrogate.next_payment_date) && Intrinsics.areEqual(this.promo_period_apy, surrogate.promo_period_apy) && Intrinsics.areEqual(this.promo_period_apy_expiry, surrogate.promo_period_apy_expiry) && Intrinsics.areEqual(this.promo_period_fee, surrogate.promo_period_fee) && Intrinsics.areEqual(this.enrollment_created_at, surrogate.enrollment_created_at);
        }

        public int hashCode() {
            int iHashCode = ((this.enrollment_state.hashCode() * 31) + this.apy_rate.hashCode()) * 31;
            MoneyDto moneyDto = this.lifetime_interest_paid;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.sweep_balance;
            int iHashCode3 = (((((iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31) + this.key_information_document_url.hashCode()) * 31) + this.fee_percentage.hashCode()) * 31;
            MoneyDto moneyDto3 = this.insurance_amount;
            int iHashCode4 = (((((iHashCode3 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31) + this.cta_text.hashCode()) * 31) + this.cta_deeplink.hashCode()) * 31;
            MoneyDto moneyDto4 = this.interest_accrued;
            int iHashCode5 = (iHashCode4 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            Instant instant = this.next_payment_date;
            int iHashCode6 = (((iHashCode5 + (instant == null ? 0 : instant.hashCode())) * 31) + this.promo_period_apy.hashCode()) * 31;
            Instant instant2 = this.promo_period_apy_expiry;
            int iHashCode7 = (((iHashCode6 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.promo_period_fee.hashCode()) * 31;
            Instant instant3 = this.enrollment_created_at;
            return iHashCode7 + (instant3 != null ? instant3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(enrollment_state=" + this.enrollment_state + ", apy_rate=" + this.apy_rate + ", lifetime_interest_paid=" + this.lifetime_interest_paid + ", sweep_balance=" + this.sweep_balance + ", key_information_document_url=" + this.key_information_document_url + ", fee_percentage=" + this.fee_percentage + ", insurance_amount=" + this.insurance_amount + ", cta_text=" + this.cta_text + ", cta_deeplink=" + this.cta_deeplink + ", interest_accrued=" + this.interest_accrued + ", next_payment_date=" + this.next_payment_date + ", promo_period_apy=" + this.promo_period_apy + ", promo_period_apy_expiry=" + this.promo_period_apy_expiry + ", promo_period_fee=" + this.promo_period_fee + ", enrollment_created_at=" + this.enrollment_created_at + ")";
        }

        /* compiled from: GetMembershipDetailsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmoneytree/v1/GetMembershipDetailsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmoneytree/v1/GetMembershipDetailsResponseDto$Surrogate;", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetMembershipDetailsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MMFProgramStateDto mMFProgramStateDto, IdlDecimal idlDecimal, MoneyDto moneyDto, MoneyDto moneyDto2, String str, IdlDecimal idlDecimal2, MoneyDto moneyDto3, String str2, String str3, MoneyDto moneyDto4, Instant instant, IdlDecimal idlDecimal3, Instant instant2, IdlDecimal idlDecimal4, Instant instant3, SerializationConstructorMarker serializationConstructorMarker) {
            this.enrollment_state = (i & 1) == 0 ? MMFProgramStateDto.INSTANCE.getZeroValue() : mMFProgramStateDto;
            if ((i & 2) == 0) {
                this.apy_rate = new IdlDecimal("");
            } else {
                this.apy_rate = idlDecimal;
            }
            if ((i & 4) == 0) {
                this.lifetime_interest_paid = null;
            } else {
                this.lifetime_interest_paid = moneyDto;
            }
            if ((i & 8) == 0) {
                this.sweep_balance = null;
            } else {
                this.sweep_balance = moneyDto2;
            }
            if ((i & 16) == 0) {
                this.key_information_document_url = "";
            } else {
                this.key_information_document_url = str;
            }
            if ((i & 32) == 0) {
                this.fee_percentage = new IdlDecimal("");
            } else {
                this.fee_percentage = idlDecimal2;
            }
            if ((i & 64) == 0) {
                this.insurance_amount = null;
            } else {
                this.insurance_amount = moneyDto3;
            }
            if ((i & 128) == 0) {
                this.cta_text = "";
            } else {
                this.cta_text = str2;
            }
            if ((i & 256) == 0) {
                this.cta_deeplink = "";
            } else {
                this.cta_deeplink = str3;
            }
            if ((i & 512) == 0) {
                this.interest_accrued = null;
            } else {
                this.interest_accrued = moneyDto4;
            }
            if ((i & 1024) == 0) {
                this.next_payment_date = null;
            } else {
                this.next_payment_date = instant;
            }
            if ((i & 2048) == 0) {
                this.promo_period_apy = new IdlDecimal("");
            } else {
                this.promo_period_apy = idlDecimal3;
            }
            if ((i & 4096) == 0) {
                this.promo_period_apy_expiry = null;
            } else {
                this.promo_period_apy_expiry = instant2;
            }
            this.promo_period_fee = (i & 8192) == 0 ? new IdlDecimal("") : idlDecimal4;
            if ((i & 16384) == 0) {
                this.enrollment_created_at = null;
            } else {
                this.enrollment_created_at = instant3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$moneytree_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.enrollment_state != MMFProgramStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, MMFProgramStateDto.Serializer.INSTANCE, self.enrollment_state);
            }
            if (!Intrinsics.areEqual(self.apy_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.apy_rate);
            }
            MoneyDto moneyDto = self.lifetime_interest_paid;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.sweep_balance;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (!Intrinsics.areEqual(self.key_information_document_url, "")) {
                output.encodeStringElement(serialDesc, 4, self.key_information_document_url);
            }
            if (!Intrinsics.areEqual(self.fee_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.fee_percentage);
            }
            MoneyDto moneyDto3 = self.insurance_amount;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            if (!Intrinsics.areEqual(self.cta_text, "")) {
                output.encodeStringElement(serialDesc, 7, self.cta_text);
            }
            if (!Intrinsics.areEqual(self.cta_deeplink, "")) {
                output.encodeStringElement(serialDesc, 8, self.cta_deeplink);
            }
            MoneyDto moneyDto4 = self.interest_accrued;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            Instant instant = self.next_payment_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.promo_period_apy, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 11, IdlDecimalSerializer.INSTANCE, self.promo_period_apy);
            }
            Instant instant2 = self.promo_period_apy_expiry;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, WireInstantSerializer.INSTANCE, instant2);
            }
            if (!Intrinsics.areEqual(self.promo_period_fee, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 13, IdlDecimalSerializer.INSTANCE, self.promo_period_fee);
            }
            Instant instant3 = self.enrollment_created_at;
            if (instant3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, WireInstantSerializer.INSTANCE, instant3);
            }
        }

        public Surrogate(MMFProgramStateDto enrollment_state, IdlDecimal apy_rate, MoneyDto moneyDto, MoneyDto moneyDto2, String key_information_document_url, IdlDecimal fee_percentage, MoneyDto moneyDto3, String cta_text, String cta_deeplink, MoneyDto moneyDto4, Instant instant, IdlDecimal promo_period_apy, Instant instant2, IdlDecimal promo_period_fee, Instant instant3) {
            Intrinsics.checkNotNullParameter(enrollment_state, "enrollment_state");
            Intrinsics.checkNotNullParameter(apy_rate, "apy_rate");
            Intrinsics.checkNotNullParameter(key_information_document_url, "key_information_document_url");
            Intrinsics.checkNotNullParameter(fee_percentage, "fee_percentage");
            Intrinsics.checkNotNullParameter(cta_text, "cta_text");
            Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
            Intrinsics.checkNotNullParameter(promo_period_apy, "promo_period_apy");
            Intrinsics.checkNotNullParameter(promo_period_fee, "promo_period_fee");
            this.enrollment_state = enrollment_state;
            this.apy_rate = apy_rate;
            this.lifetime_interest_paid = moneyDto;
            this.sweep_balance = moneyDto2;
            this.key_information_document_url = key_information_document_url;
            this.fee_percentage = fee_percentage;
            this.insurance_amount = moneyDto3;
            this.cta_text = cta_text;
            this.cta_deeplink = cta_deeplink;
            this.interest_accrued = moneyDto4;
            this.next_payment_date = instant;
            this.promo_period_apy = promo_period_apy;
            this.promo_period_apy_expiry = instant2;
            this.promo_period_fee = promo_period_fee;
            this.enrollment_created_at = instant3;
        }

        public final MMFProgramStateDto getEnrollment_state() {
            return this.enrollment_state;
        }

        public /* synthetic */ Surrogate(MMFProgramStateDto mMFProgramStateDto, IdlDecimal idlDecimal, MoneyDto moneyDto, MoneyDto moneyDto2, String str, IdlDecimal idlDecimal2, MoneyDto moneyDto3, String str2, String str3, MoneyDto moneyDto4, Instant instant, IdlDecimal idlDecimal3, Instant instant2, IdlDecimal idlDecimal4, Instant instant3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MMFProgramStateDto.INSTANCE.getZeroValue() : mMFProgramStateDto, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal, (i & 4) != 0 ? null : moneyDto, (i & 8) != 0 ? null : moneyDto2, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 64) != 0 ? null : moneyDto3, (i & 128) != 0 ? "" : str2, (i & 256) != 0 ? "" : str3, (i & 512) != 0 ? null : moneyDto4, (i & 1024) != 0 ? null : instant, (i & 2048) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 4096) != 0 ? null : instant2, (i & 8192) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 16384) != 0 ? null : instant3);
        }

        public final IdlDecimal getApy_rate() {
            return this.apy_rate;
        }

        public final MoneyDto getLifetime_interest_paid() {
            return this.lifetime_interest_paid;
        }

        public final MoneyDto getSweep_balance() {
            return this.sweep_balance;
        }

        public final String getKey_information_document_url() {
            return this.key_information_document_url;
        }

        public final IdlDecimal getFee_percentage() {
            return this.fee_percentage;
        }

        public final MoneyDto getInsurance_amount() {
            return this.insurance_amount;
        }

        public final String getCta_text() {
            return this.cta_text;
        }

        public final String getCta_deeplink() {
            return this.cta_deeplink;
        }

        public final MoneyDto getInterest_accrued() {
            return this.interest_accrued;
        }

        public final Instant getNext_payment_date() {
            return this.next_payment_date;
        }

        public final IdlDecimal getPromo_period_apy() {
            return this.promo_period_apy;
        }

        public final Instant getPromo_period_apy_expiry() {
            return this.promo_period_apy_expiry;
        }

        public final IdlDecimal getPromo_period_fee() {
            return this.promo_period_fee;
        }

        public final Instant getEnrollment_created_at() {
            return this.enrollment_created_at;
        }
    }

    /* compiled from: GetMembershipDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmoneytree/v1/GetMembershipDetailsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmoneytree/v1/GetMembershipDetailsResponseDto;", "Lmoneytree/v1/GetMembershipDetailsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmoneytree/v1/GetMembershipDetailsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetMembershipDetailsResponseDto, GetMembershipDetailsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetMembershipDetailsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMembershipDetailsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMembershipDetailsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetMembershipDetailsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetMembershipDetailsResponse> getProtoAdapter() {
            return GetMembershipDetailsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMembershipDetailsResponseDto getZeroValue() {
            return GetMembershipDetailsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMembershipDetailsResponseDto fromProto(GetMembershipDetailsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            MMFProgramStateDto mMFProgramStateDtoFromProto = MMFProgramStateDto.INSTANCE.fromProto(proto.getEnrollment_state());
            IdlDecimal idlDecimal = new IdlDecimal(proto.getApy_rate());
            Money lifetime_interest_paid = proto.getLifetime_interest_paid();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = lifetime_interest_paid != null ? MoneyDto.INSTANCE.fromProto(lifetime_interest_paid) : null;
            Money sweep_balance = proto.getSweep_balance();
            MoneyDto moneyDtoFromProto2 = sweep_balance != null ? MoneyDto.INSTANCE.fromProto(sweep_balance) : null;
            String key_information_document_url = proto.getKey_information_document_url();
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getFee_percentage());
            Money insurance_amount = proto.getInsurance_amount();
            MoneyDto moneyDtoFromProto3 = insurance_amount != null ? MoneyDto.INSTANCE.fromProto(insurance_amount) : null;
            String cta_text = proto.getCta_text();
            String cta_deeplink = proto.getCta_deeplink();
            Money interest_accrued = proto.getInterest_accrued();
            return new GetMembershipDetailsResponseDto(new Surrogate(mMFProgramStateDtoFromProto, idlDecimal, moneyDtoFromProto, moneyDtoFromProto2, key_information_document_url, idlDecimal2, moneyDtoFromProto3, cta_text, cta_deeplink, interest_accrued != null ? MoneyDto.INSTANCE.fromProto(interest_accrued) : null, proto.getNext_payment_date(), new IdlDecimal(proto.getPromo_period_apy()), proto.getPromo_period_apy_expiry(), new IdlDecimal(proto.getPromo_period_fee()), proto.getEnrollment_created_at()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: moneytree.v1.GetMembershipDetailsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetMembershipDetailsResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetMembershipDetailsResponseDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetMembershipDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmoneytree/v1/GetMembershipDetailsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmoneytree/v1/GetMembershipDetailsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmoneytree/v1/GetMembershipDetailsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetMembershipDetailsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/moneytree.v1.GetMembershipDetailsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetMembershipDetailsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetMembershipDetailsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetMembershipDetailsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetMembershipDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmoneytree/v1/GetMembershipDetailsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "moneytree.v1.GetMembershipDetailsResponseDto";
        }
    }
}
