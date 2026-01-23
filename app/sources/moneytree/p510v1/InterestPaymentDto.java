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
import p479j$.time.Instant;

/* compiled from: InterestPaymentDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00040/12B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bm\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00063"}, m3636d2 = {"Lmoneytree/v1/InterestPaymentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmoneytree/v1/InterestPayment;", "Landroid/os/Parcelable;", "Lmoneytree/v1/InterestPaymentDto$Surrogate;", "surrogate", "<init>", "(Lmoneytree/v1/InterestPaymentDto$Surrogate;)V", "", "payment_id", "description", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "updated_at", "fee_amount", "Lcom/robinhood/idl/IdlDecimal;", "fee_ratio_applied", "payment_reason", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "toProto", "()Lmoneytree/v1/InterestPayment;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmoneytree/v1/InterestPaymentDto$Surrogate;", "getPayment_id", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getCreated_at", "()Lj$/time/Instant;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class InterestPaymentDto implements Dto3<InterestPayment>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InterestPaymentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InterestPaymentDto, InterestPayment>> binaryBase64Serializer$delegate;
    private static final InterestPaymentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InterestPaymentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InterestPaymentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPayment_id() {
        return this.surrogate.getPayment_id();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public /* synthetic */ InterestPaymentDto(String str, String str2, MoneyDto moneyDto, Instant instant, Instant instant2, MoneyDto moneyDto2, IdlDecimal idlDecimal, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : moneyDto, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : instant2, (i & 32) != 0 ? null : moneyDto2, (i & 64) != 0 ? new IdlDecimal("") : idlDecimal, (i & 128) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterestPaymentDto(String payment_id, String description, MoneyDto moneyDto, Instant instant, Instant instant2, MoneyDto moneyDto2, IdlDecimal fee_ratio_applied, String payment_reason) {
        this(new Surrogate(payment_id, description, moneyDto, instant, instant2, moneyDto2, fee_ratio_applied, payment_reason));
        Intrinsics.checkNotNullParameter(payment_id, "payment_id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(fee_ratio_applied, "fee_ratio_applied");
        Intrinsics.checkNotNullParameter(payment_reason, "payment_reason");
    }

    @Override // com.robinhood.idl.Dto
    public InterestPayment toProto() {
        String payment_id = this.surrogate.getPayment_id();
        String description = this.surrogate.getDescription();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        Instant created_at = this.surrogate.getCreated_at();
        Instant updated_at = this.surrogate.getUpdated_at();
        MoneyDto fee_amount = this.surrogate.getFee_amount();
        return new InterestPayment(payment_id, description, proto, created_at, updated_at, fee_amount != null ? fee_amount.toProto() : null, this.surrogate.getFee_ratio_applied().getStringValue(), this.surrogate.getPayment_reason(), null, 256, null);
    }

    public String toString() {
        return "[InterestPaymentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InterestPaymentDto) && Intrinsics.areEqual(((InterestPaymentDto) other).surrogate, this.surrogate);
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
    /* compiled from: InterestPaymentDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002DCB¶\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012.\b\u0002\u0010\f\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014Bk\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b4\u0010.\u001a\u0004\b2\u00103RF\u0010\f\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b8\u0010.\u001a\u0004\b6\u00107RF\u0010\r\u001a(\u0018\u00010\u0007j\u0013\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00105\u0012\u0004\b:\u0010.\u001a\u0004\b9\u00107R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00101\u0012\u0004\b<\u0010.\u001a\u0004\b;\u00103R/\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010=\u0012\u0004\b@\u0010.\u001a\u0004\b>\u0010?R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010+\u0012\u0004\bB\u0010.\u001a\u0004\bA\u0010$¨\u0006E"}, m3636d2 = {"Lmoneytree/v1/InterestPaymentDto$Surrogate;", "", "", "payment_id", "description", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "updated_at", "fee_amount", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "fee_ratio_applied", "payment_reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$moneytree_v1_externalRelease", "(Lmoneytree/v1/InterestPaymentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPayment_id", "getPayment_id$annotations", "()V", "getDescription", "getDescription$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "getFee_amount", "getFee_amount$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getFee_ratio_applied", "()Lcom/robinhood/idl/IdlDecimal;", "getFee_ratio_applied$annotations", "getPayment_reason", "getPayment_reason$annotations", "Companion", "$serializer", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto amount;
        private final Instant created_at;
        private final String description;
        private final MoneyDto fee_amount;
        private final IdlDecimal fee_ratio_applied;
        private final String payment_id;
        private final String payment_reason;
        private final Instant updated_at;

        public Surrogate() {
            this((String) null, (String) null, (MoneyDto) null, (Instant) null, (Instant) null, (MoneyDto) null, (IdlDecimal) null, (String) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.payment_id, surrogate.payment_id) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.fee_amount, surrogate.fee_amount) && Intrinsics.areEqual(this.fee_ratio_applied, surrogate.fee_ratio_applied) && Intrinsics.areEqual(this.payment_reason, surrogate.payment_reason);
        }

        public int hashCode() {
            int iHashCode = ((this.payment_id.hashCode() * 31) + this.description.hashCode()) * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            Instant instant = this.created_at;
            int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.updated_at;
            int iHashCode4 = (iHashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            MoneyDto moneyDto2 = this.fee_amount;
            return ((((iHashCode4 + (moneyDto2 != null ? moneyDto2.hashCode() : 0)) * 31) + this.fee_ratio_applied.hashCode()) * 31) + this.payment_reason.hashCode();
        }

        public String toString() {
            return "Surrogate(payment_id=" + this.payment_id + ", description=" + this.description + ", amount=" + this.amount + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", fee_amount=" + this.fee_amount + ", fee_ratio_applied=" + this.fee_ratio_applied + ", payment_reason=" + this.payment_reason + ")";
        }

        /* compiled from: InterestPaymentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmoneytree/v1/InterestPaymentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmoneytree/v1/InterestPaymentDto$Surrogate;", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InterestPaymentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, MoneyDto moneyDto, Instant instant, Instant instant2, MoneyDto moneyDto2, IdlDecimal idlDecimal, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.payment_id = "";
            } else {
                this.payment_id = str;
            }
            if ((i & 2) == 0) {
                this.description = "";
            } else {
                this.description = str2;
            }
            if ((i & 4) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 8) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 16) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant2;
            }
            if ((i & 32) == 0) {
                this.fee_amount = null;
            } else {
                this.fee_amount = moneyDto2;
            }
            if ((i & 64) == 0) {
                this.fee_ratio_applied = new IdlDecimal("");
            } else {
                this.fee_ratio_applied = idlDecimal;
            }
            if ((i & 128) == 0) {
                this.payment_reason = "";
            } else {
                this.payment_reason = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$moneytree_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.payment_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.payment_id);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 1, self.description);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.updated_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant2);
            }
            MoneyDto moneyDto2 = self.fee_amount;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (!Intrinsics.areEqual(self.fee_ratio_applied, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, self.fee_ratio_applied);
            }
            if (Intrinsics.areEqual(self.payment_reason, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 7, self.payment_reason);
        }

        public Surrogate(String payment_id, String description, MoneyDto moneyDto, Instant instant, Instant instant2, MoneyDto moneyDto2, IdlDecimal fee_ratio_applied, String payment_reason) {
            Intrinsics.checkNotNullParameter(payment_id, "payment_id");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(fee_ratio_applied, "fee_ratio_applied");
            Intrinsics.checkNotNullParameter(payment_reason, "payment_reason");
            this.payment_id = payment_id;
            this.description = description;
            this.amount = moneyDto;
            this.created_at = instant;
            this.updated_at = instant2;
            this.fee_amount = moneyDto2;
            this.fee_ratio_applied = fee_ratio_applied;
            this.payment_reason = payment_reason;
        }

        public /* synthetic */ Surrogate(String str, String str2, MoneyDto moneyDto, Instant instant, Instant instant2, MoneyDto moneyDto2, IdlDecimal idlDecimal, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : moneyDto, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : instant2, (i & 32) != 0 ? null : moneyDto2, (i & 64) != 0 ? new IdlDecimal("") : idlDecimal, (i & 128) != 0 ? "" : str3);
        }

        public final String getPayment_id() {
            return this.payment_id;
        }

        public final String getDescription() {
            return this.description;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        public final MoneyDto getFee_amount() {
            return this.fee_amount;
        }

        public final IdlDecimal getFee_ratio_applied() {
            return this.fee_ratio_applied;
        }

        public final String getPayment_reason() {
            return this.payment_reason;
        }
    }

    /* compiled from: InterestPaymentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmoneytree/v1/InterestPaymentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmoneytree/v1/InterestPaymentDto;", "Lmoneytree/v1/InterestPayment;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmoneytree/v1/InterestPaymentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InterestPaymentDto, InterestPayment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InterestPaymentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InterestPaymentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InterestPaymentDto> getBinaryBase64Serializer() {
            return (KSerializer) InterestPaymentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InterestPayment> getProtoAdapter() {
            return InterestPayment.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InterestPaymentDto getZeroValue() {
            return InterestPaymentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InterestPaymentDto fromProto(InterestPayment proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String payment_id = proto.getPayment_id();
            String description = proto.getDescription();
            Money amount = proto.getAmount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            Instant created_at = proto.getCreated_at();
            Instant updated_at = proto.getUpdated_at();
            Money fee_amount = proto.getFee_amount();
            return new InterestPaymentDto(new Surrogate(payment_id, description, moneyDtoFromProto, created_at, updated_at, fee_amount != null ? MoneyDto.INSTANCE.fromProto(fee_amount) : null, new IdlDecimal(proto.getFee_ratio_applied()), proto.getPayment_reason()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: moneytree.v1.InterestPaymentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InterestPaymentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InterestPaymentDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InterestPaymentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmoneytree/v1/InterestPaymentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmoneytree/v1/InterestPaymentDto;", "<init>", "()V", "surrogateSerializer", "Lmoneytree/v1/InterestPaymentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InterestPaymentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/moneytree.v1.InterestPayment", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InterestPaymentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InterestPaymentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InterestPaymentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InterestPaymentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmoneytree/v1/InterestPaymentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "moneytree.v1.InterestPaymentDto";
        }
    }
}
