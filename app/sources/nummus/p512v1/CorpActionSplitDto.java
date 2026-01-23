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
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nummus.p512v1.SplitDirectionDto;
import p479j$.time.Instant;

/* compiled from: CorpActionSplitDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BM\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010+R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0017¨\u00062"}, m3636d2 = {"Lnummus/v1/CorpActionSplitDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/CorpActionSplit;", "Landroid/os/Parcelable;", "Lnummus/v1/CorpActionSplitDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/CorpActionSplitDto$Surrogate;)V", "", "currency_id", "Lnummus/v1/SplitDirectionDto;", "split_direction", "Lcom/robinhood/idl/IdlDecimal;", "multiplier", "divisor", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "effective_date", "currency_pair_id", "(Ljava/lang/String;Lnummus/v1/SplitDirectionDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Ljava/lang/String;)V", "toProto", "()Lnummus/v1/CorpActionSplit;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/CorpActionSplitDto$Surrogate;", "getSplit_direction", "()Lnummus/v1/SplitDirectionDto;", "getMultiplier", "()Lcom/robinhood/idl/IdlDecimal;", "getDivisor", "getCurrency_pair_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class CorpActionSplitDto implements Dto3<CorpActionSplit>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CorpActionSplitDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CorpActionSplitDto, CorpActionSplit>> binaryBase64Serializer$delegate;
    private static final CorpActionSplitDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CorpActionSplitDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CorpActionSplitDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final SplitDirectionDto getSplit_direction() {
        return this.surrogate.getSplit_direction();
    }

    public final IdlDecimal getMultiplier() {
        return this.surrogate.getMultiplier();
    }

    public final IdlDecimal getDivisor() {
        return this.surrogate.getDivisor();
    }

    public final String getCurrency_pair_id() {
        return this.surrogate.getCurrency_pair_id();
    }

    public /* synthetic */ CorpActionSplitDto(String str, SplitDirectionDto splitDirectionDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, Instant instant, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SplitDirectionDto.INSTANCE.getZeroValue() : splitDirectionDto, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CorpActionSplitDto(String currency_id, SplitDirectionDto split_direction, IdlDecimal multiplier, IdlDecimal divisor, Instant instant, String currency_pair_id) {
        this(new Surrogate(currency_id, split_direction, multiplier, divisor, instant, currency_pair_id));
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(split_direction, "split_direction");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(divisor, "divisor");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CorpActionSplit toProto() {
        return new CorpActionSplit(this.surrogate.getCurrency_id(), (SplitDirection) this.surrogate.getSplit_direction().toProto(), this.surrogate.getMultiplier().getStringValue(), this.surrogate.getDivisor().getStringValue(), this.surrogate.getEffective_date(), this.surrogate.getCurrency_pair_id(), null, 64, null);
    }

    public String toString() {
        return "[CorpActionSplitDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CorpActionSplitDto) && Intrinsics.areEqual(((CorpActionSplitDto) other).surrogate, this.surrogate);
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
    /* compiled from: CorpActionSplitDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002>=B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012.\b\u0002\u0010\u000f\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012BW\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b0\u0010,\u001a\u0004\b.\u0010/R/\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b4\u0010,\u001a\u0004\b2\u00103R/\u0010\u000b\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b6\u0010,\u001a\u0004\b5\u00103RF\u0010\u000f\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00107\u0012\u0004\b:\u0010,\u001a\u0004\b8\u00109R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010)\u0012\u0004\b<\u0010,\u001a\u0004\b;\u0010\"¨\u0006?"}, m3636d2 = {"Lnummus/v1/CorpActionSplitDto$Surrogate;", "", "", "currency_id", "Lnummus/v1/SplitDirectionDto;", "split_direction", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "multiplier", "divisor", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "effective_date", "currency_pair_id", "<init>", "(Ljava/lang/String;Lnummus/v1/SplitDirectionDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lnummus/v1/SplitDirectionDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/CorpActionSplitDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrency_id", "getCurrency_id$annotations", "()V", "Lnummus/v1/SplitDirectionDto;", "getSplit_direction", "()Lnummus/v1/SplitDirectionDto;", "getSplit_direction$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getMultiplier", "()Lcom/robinhood/idl/IdlDecimal;", "getMultiplier$annotations", "getDivisor", "getDivisor$annotations", "Lj$/time/Instant;", "getEffective_date", "()Lj$/time/Instant;", "getEffective_date$annotations", "getCurrency_pair_id", "getCurrency_pair_id$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String currency_id;
        private final String currency_pair_id;
        private final IdlDecimal divisor;
        private final Instant effective_date;
        private final IdlDecimal multiplier;
        private final SplitDirectionDto split_direction;

        public Surrogate() {
            this((String) null, (SplitDirectionDto) null, (IdlDecimal) null, (IdlDecimal) null, (Instant) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.currency_id, surrogate.currency_id) && this.split_direction == surrogate.split_direction && Intrinsics.areEqual(this.multiplier, surrogate.multiplier) && Intrinsics.areEqual(this.divisor, surrogate.divisor) && Intrinsics.areEqual(this.effective_date, surrogate.effective_date) && Intrinsics.areEqual(this.currency_pair_id, surrogate.currency_pair_id);
        }

        public int hashCode() {
            int iHashCode = ((((((this.currency_id.hashCode() * 31) + this.split_direction.hashCode()) * 31) + this.multiplier.hashCode()) * 31) + this.divisor.hashCode()) * 31;
            Instant instant = this.effective_date;
            return ((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.currency_pair_id.hashCode();
        }

        public String toString() {
            return "Surrogate(currency_id=" + this.currency_id + ", split_direction=" + this.split_direction + ", multiplier=" + this.multiplier + ", divisor=" + this.divisor + ", effective_date=" + this.effective_date + ", currency_pair_id=" + this.currency_pair_id + ")";
        }

        /* compiled from: CorpActionSplitDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/CorpActionSplitDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CorpActionSplitDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CorpActionSplitDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, SplitDirectionDto splitDirectionDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, Instant instant, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.currency_id = "";
            } else {
                this.currency_id = str;
            }
            if ((i & 2) == 0) {
                this.split_direction = SplitDirectionDto.INSTANCE.getZeroValue();
            } else {
                this.split_direction = splitDirectionDto;
            }
            if ((i & 4) == 0) {
                this.multiplier = new IdlDecimal("");
            } else {
                this.multiplier = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.divisor = new IdlDecimal("");
            } else {
                this.divisor = idlDecimal2;
            }
            if ((i & 16) == 0) {
                this.effective_date = null;
            } else {
                this.effective_date = instant;
            }
            if ((i & 32) == 0) {
                this.currency_pair_id = "";
            } else {
                this.currency_pair_id = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.currency_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.currency_id);
            }
            if (self.split_direction != SplitDirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SplitDirectionDto.Serializer.INSTANCE, self.split_direction);
            }
            if (!Intrinsics.areEqual(self.multiplier, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.multiplier);
            }
            if (!Intrinsics.areEqual(self.divisor, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.divisor);
            }
            Instant instant = self.effective_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant);
            }
            if (Intrinsics.areEqual(self.currency_pair_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.currency_pair_id);
        }

        public Surrogate(String currency_id, SplitDirectionDto split_direction, IdlDecimal multiplier, IdlDecimal divisor, Instant instant, String currency_pair_id) {
            Intrinsics.checkNotNullParameter(currency_id, "currency_id");
            Intrinsics.checkNotNullParameter(split_direction, "split_direction");
            Intrinsics.checkNotNullParameter(multiplier, "multiplier");
            Intrinsics.checkNotNullParameter(divisor, "divisor");
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            this.currency_id = currency_id;
            this.split_direction = split_direction;
            this.multiplier = multiplier;
            this.divisor = divisor;
            this.effective_date = instant;
            this.currency_pair_id = currency_pair_id;
        }

        public /* synthetic */ Surrogate(String str, SplitDirectionDto splitDirectionDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, Instant instant, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SplitDirectionDto.INSTANCE.getZeroValue() : splitDirectionDto, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? "" : str2);
        }

        public final String getCurrency_id() {
            return this.currency_id;
        }

        public final SplitDirectionDto getSplit_direction() {
            return this.split_direction;
        }

        public final IdlDecimal getMultiplier() {
            return this.multiplier;
        }

        public final IdlDecimal getDivisor() {
            return this.divisor;
        }

        public final Instant getEffective_date() {
            return this.effective_date;
        }

        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }
    }

    /* compiled from: CorpActionSplitDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/CorpActionSplitDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/CorpActionSplitDto;", "Lnummus/v1/CorpActionSplit;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/CorpActionSplitDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CorpActionSplitDto, CorpActionSplit> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CorpActionSplitDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CorpActionSplitDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CorpActionSplitDto> getBinaryBase64Serializer() {
            return (KSerializer) CorpActionSplitDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CorpActionSplit> getProtoAdapter() {
            return CorpActionSplit.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CorpActionSplitDto getZeroValue() {
            return CorpActionSplitDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CorpActionSplitDto fromProto(CorpActionSplit proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CorpActionSplitDto(new Surrogate(proto.getCurrency_id(), SplitDirectionDto.INSTANCE.fromProto(proto.getSplit_direction()), new IdlDecimal(proto.getMultiplier()), new IdlDecimal(proto.getDivisor()), proto.getEffective_date(), proto.getCurrency_pair_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.CorpActionSplitDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CorpActionSplitDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CorpActionSplitDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CorpActionSplitDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/CorpActionSplitDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CorpActionSplitDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/CorpActionSplitDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CorpActionSplitDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.CorpActionSplit", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CorpActionSplitDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CorpActionSplitDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CorpActionSplitDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CorpActionSplitDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/CorpActionSplitDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "nummus.v1.CorpActionSplitDto";
        }
    }
}
