package nummus.p512v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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
import nummus.p512v1.FeeTierDto;
import nummus.p512v1.FeeTierPromoTriggerTypeDto;

/* compiled from: IntroductoryPromoDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010'R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b+\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b,\u0010\u0018¨\u00061"}, m3636d2 = {"Lnummus/v1/IntroductoryPromoDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/IntroductoryPromo;", "Landroid/os/Parcelable;", "Lnummus/v1/IntroductoryPromoDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/IntroductoryPromoDto$Surrogate;)V", "", "is_promo_claimed", "is_account_eligible_for_promo", "Lnummus/v1/FeeTierDto;", "target_tier", "", "lockup_period_days", "Lnummus/v1/FeeTierPromoTriggerTypeDto;", "trigger_type", "", "promo_start_time", "promo_end_time", "(ZZLnummus/v1/FeeTierDto;ILnummus/v1/FeeTierPromoTriggerTypeDto;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lnummus/v1/IntroductoryPromo;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/IntroductoryPromoDto$Surrogate;", "()Z", "getTarget_tier", "()Lnummus/v1/FeeTierDto;", "getLockup_period_days", "getPromo_start_time", "getPromo_end_time", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class IntroductoryPromoDto implements Dto3<IntroductoryPromo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IntroductoryPromoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IntroductoryPromoDto, IntroductoryPromo>> binaryBase64Serializer$delegate;
    private static final IntroductoryPromoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IntroductoryPromoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IntroductoryPromoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final boolean is_promo_claimed() {
        return this.surrogate.getIs_promo_claimed();
    }

    public final boolean is_account_eligible_for_promo() {
        return this.surrogate.getIs_account_eligible_for_promo();
    }

    public final FeeTierDto getTarget_tier() {
        return this.surrogate.getTarget_tier();
    }

    public final int getLockup_period_days() {
        return this.surrogate.getLockup_period_days();
    }

    public final String getPromo_start_time() {
        return this.surrogate.getPromo_start_time();
    }

    public final String getPromo_end_time() {
        return this.surrogate.getPromo_end_time();
    }

    public /* synthetic */ IntroductoryPromoDto(boolean z, boolean z2, FeeTierDto feeTierDto, int i, FeeTierPromoTriggerTypeDto feeTierPromoTriggerTypeDto, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : feeTierDto, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? FeeTierPromoTriggerTypeDto.INSTANCE.getZeroValue() : feeTierPromoTriggerTypeDto, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntroductoryPromoDto(boolean z, boolean z2, FeeTierDto feeTierDto, int i, FeeTierPromoTriggerTypeDto trigger_type, String promo_start_time, String promo_end_time) {
        this(new Surrogate(z, z2, feeTierDto, i, trigger_type, promo_start_time, promo_end_time));
        Intrinsics.checkNotNullParameter(trigger_type, "trigger_type");
        Intrinsics.checkNotNullParameter(promo_start_time, "promo_start_time");
        Intrinsics.checkNotNullParameter(promo_end_time, "promo_end_time");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public IntroductoryPromo toProto() {
        boolean is_promo_claimed = this.surrogate.getIs_promo_claimed();
        boolean is_account_eligible_for_promo = this.surrogate.getIs_account_eligible_for_promo();
        FeeTierDto target_tier = this.surrogate.getTarget_tier();
        return new IntroductoryPromo(is_promo_claimed, is_account_eligible_for_promo, target_tier != null ? target_tier.toProto() : null, this.surrogate.getLockup_period_days(), (FeeTierPromoTriggerType) this.surrogate.getTrigger_type().toProto(), this.surrogate.getPromo_start_time(), this.surrogate.getPromo_end_time(), null, 128, null);
    }

    public String toString() {
        return "[IntroductoryPromoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IntroductoryPromoDto) && Intrinsics.areEqual(((IntroductoryPromoDto) other).surrogate, this.surrogate);
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
    /* compiled from: IntroductoryPromoDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0083\b\u0018\u0000 <2\u00020\u0001:\u0002=<B^\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012B[\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b\u0003\u0010(R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b+\u0010*\u001a\u0004\b\u0004\u0010(R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b/\u0010*\u001a\u0004\b-\u0010.R/\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010#R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00103\u0012\u0004\b6\u0010*\u001a\u0004\b4\u00105R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00107\u0012\u0004\b9\u0010*\u001a\u0004\b8\u0010!R \u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00107\u0012\u0004\b;\u0010*\u001a\u0004\b:\u0010!¨\u0006>"}, m3636d2 = {"Lnummus/v1/IntroductoryPromoDto$Surrogate;", "", "", "is_promo_claimed", "is_account_eligible_for_promo", "Lnummus/v1/FeeTierDto;", "target_tier", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "lockup_period_days", "Lnummus/v1/FeeTierPromoTriggerTypeDto;", "trigger_type", "", "promo_start_time", "promo_end_time", "<init>", "(ZZLnummus/v1/FeeTierDto;ILnummus/v1/FeeTierPromoTriggerTypeDto;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLnummus/v1/FeeTierDto;ILnummus/v1/FeeTierPromoTriggerTypeDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/IntroductoryPromoDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "is_promo_claimed$annotations", "()V", "is_account_eligible_for_promo$annotations", "Lnummus/v1/FeeTierDto;", "getTarget_tier", "()Lnummus/v1/FeeTierDto;", "getTarget_tier$annotations", "I", "getLockup_period_days", "getLockup_period_days$annotations", "Lnummus/v1/FeeTierPromoTriggerTypeDto;", "getTrigger_type", "()Lnummus/v1/FeeTierPromoTriggerTypeDto;", "getTrigger_type$annotations", "Ljava/lang/String;", "getPromo_start_time", "getPromo_start_time$annotations", "getPromo_end_time", "getPromo_end_time$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean is_account_eligible_for_promo;
        private final boolean is_promo_claimed;
        private final int lockup_period_days;
        private final String promo_end_time;
        private final String promo_start_time;
        private final FeeTierDto target_tier;
        private final FeeTierPromoTriggerTypeDto trigger_type;

        public Surrogate() {
            this(false, false, (FeeTierDto) null, 0, (FeeTierPromoTriggerTypeDto) null, (String) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.is_promo_claimed == surrogate.is_promo_claimed && this.is_account_eligible_for_promo == surrogate.is_account_eligible_for_promo && Intrinsics.areEqual(this.target_tier, surrogate.target_tier) && this.lockup_period_days == surrogate.lockup_period_days && this.trigger_type == surrogate.trigger_type && Intrinsics.areEqual(this.promo_start_time, surrogate.promo_start_time) && Intrinsics.areEqual(this.promo_end_time, surrogate.promo_end_time);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.is_promo_claimed) * 31) + Boolean.hashCode(this.is_account_eligible_for_promo)) * 31;
            FeeTierDto feeTierDto = this.target_tier;
            return ((((((((iHashCode + (feeTierDto == null ? 0 : feeTierDto.hashCode())) * 31) + Integer.hashCode(this.lockup_period_days)) * 31) + this.trigger_type.hashCode()) * 31) + this.promo_start_time.hashCode()) * 31) + this.promo_end_time.hashCode();
        }

        public String toString() {
            return "Surrogate(is_promo_claimed=" + this.is_promo_claimed + ", is_account_eligible_for_promo=" + this.is_account_eligible_for_promo + ", target_tier=" + this.target_tier + ", lockup_period_days=" + this.lockup_period_days + ", trigger_type=" + this.trigger_type + ", promo_start_time=" + this.promo_start_time + ", promo_end_time=" + this.promo_end_time + ")";
        }

        /* compiled from: IntroductoryPromoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/IntroductoryPromoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/IntroductoryPromoDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IntroductoryPromoDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, boolean z2, FeeTierDto feeTierDto, int i2, FeeTierPromoTriggerTypeDto feeTierPromoTriggerTypeDto, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.is_promo_claimed = false;
            } else {
                this.is_promo_claimed = z;
            }
            if ((i & 2) == 0) {
                this.is_account_eligible_for_promo = false;
            } else {
                this.is_account_eligible_for_promo = z2;
            }
            if ((i & 4) == 0) {
                this.target_tier = null;
            } else {
                this.target_tier = feeTierDto;
            }
            if ((i & 8) == 0) {
                this.lockup_period_days = 0;
            } else {
                this.lockup_period_days = i2;
            }
            if ((i & 16) == 0) {
                this.trigger_type = FeeTierPromoTriggerTypeDto.INSTANCE.getZeroValue();
            } else {
                this.trigger_type = feeTierPromoTriggerTypeDto;
            }
            if ((i & 32) == 0) {
                this.promo_start_time = "";
            } else {
                this.promo_start_time = str;
            }
            if ((i & 64) == 0) {
                this.promo_end_time = "";
            } else {
                this.promo_end_time = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.is_promo_claimed;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            boolean z2 = self.is_account_eligible_for_promo;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 1, z2);
            }
            FeeTierDto feeTierDto = self.target_tier;
            if (feeTierDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, FeeTierDto.Serializer.INSTANCE, feeTierDto);
            }
            int i = self.lockup_period_days;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (self.trigger_type != FeeTierPromoTriggerTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, FeeTierPromoTriggerTypeDto.Serializer.INSTANCE, self.trigger_type);
            }
            if (!Intrinsics.areEqual(self.promo_start_time, "")) {
                output.encodeStringElement(serialDesc, 5, self.promo_start_time);
            }
            if (Intrinsics.areEqual(self.promo_end_time, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.promo_end_time);
        }

        public Surrogate(boolean z, boolean z2, FeeTierDto feeTierDto, int i, FeeTierPromoTriggerTypeDto trigger_type, String promo_start_time, String promo_end_time) {
            Intrinsics.checkNotNullParameter(trigger_type, "trigger_type");
            Intrinsics.checkNotNullParameter(promo_start_time, "promo_start_time");
            Intrinsics.checkNotNullParameter(promo_end_time, "promo_end_time");
            this.is_promo_claimed = z;
            this.is_account_eligible_for_promo = z2;
            this.target_tier = feeTierDto;
            this.lockup_period_days = i;
            this.trigger_type = trigger_type;
            this.promo_start_time = promo_start_time;
            this.promo_end_time = promo_end_time;
        }

        /* renamed from: is_promo_claimed, reason: from getter */
        public final boolean getIs_promo_claimed() {
            return this.is_promo_claimed;
        }

        /* renamed from: is_account_eligible_for_promo, reason: from getter */
        public final boolean getIs_account_eligible_for_promo() {
            return this.is_account_eligible_for_promo;
        }

        public final FeeTierDto getTarget_tier() {
            return this.target_tier;
        }

        public final int getLockup_period_days() {
            return this.lockup_period_days;
        }

        public final FeeTierPromoTriggerTypeDto getTrigger_type() {
            return this.trigger_type;
        }

        public /* synthetic */ Surrogate(boolean z, boolean z2, FeeTierDto feeTierDto, int i, FeeTierPromoTriggerTypeDto feeTierPromoTriggerTypeDto, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : feeTierDto, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? FeeTierPromoTriggerTypeDto.INSTANCE.getZeroValue() : feeTierPromoTriggerTypeDto, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? "" : str2);
        }

        public final String getPromo_start_time() {
            return this.promo_start_time;
        }

        public final String getPromo_end_time() {
            return this.promo_end_time;
        }
    }

    /* compiled from: IntroductoryPromoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/IntroductoryPromoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/IntroductoryPromoDto;", "Lnummus/v1/IntroductoryPromo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/IntroductoryPromoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<IntroductoryPromoDto, IntroductoryPromo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IntroductoryPromoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IntroductoryPromoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IntroductoryPromoDto> getBinaryBase64Serializer() {
            return (KSerializer) IntroductoryPromoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IntroductoryPromo> getProtoAdapter() {
            return IntroductoryPromo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IntroductoryPromoDto getZeroValue() {
            return IntroductoryPromoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IntroductoryPromoDto fromProto(IntroductoryPromo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            boolean is_promo_claimed = proto.getIs_promo_claimed();
            boolean is_account_eligible_for_promo = proto.getIs_account_eligible_for_promo();
            FeeTier target_tier = proto.getTarget_tier();
            return new IntroductoryPromoDto(new Surrogate(is_promo_claimed, is_account_eligible_for_promo, target_tier != null ? FeeTierDto.INSTANCE.fromProto(target_tier) : null, proto.getLockup_period_days(), FeeTierPromoTriggerTypeDto.INSTANCE.fromProto(proto.getTrigger_type()), proto.getPromo_start_time(), proto.getPromo_end_time()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.IntroductoryPromoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntroductoryPromoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IntroductoryPromoDto(false, false, null, 0, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IntroductoryPromoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/IntroductoryPromoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/IntroductoryPromoDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/IntroductoryPromoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IntroductoryPromoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.IntroductoryPromo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IntroductoryPromoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IntroductoryPromoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IntroductoryPromoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IntroductoryPromoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/IntroductoryPromoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "nummus.v1.IntroductoryPromoDto";
        }
    }
}
