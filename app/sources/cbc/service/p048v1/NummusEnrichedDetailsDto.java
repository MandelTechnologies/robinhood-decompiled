package cbc.service.p048v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import p479j$.time.Instant;

/* compiled from: NummusEnrichedDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$#%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0016\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006'"}, m3636d2 = {"Lcbc/service/v1/NummusEnrichedDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcbc/service/v1/NummusEnrichedDetails;", "Landroid/os/Parcelable;", "Lcbc/service/v1/NummusEnrichedDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcbc/service/v1/NummusEnrichedDetailsDto$Surrogate;)V", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "executed_at", "", "aggregation_id", "rhs_account_number", "(Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lcbc/service/v1/NummusEnrichedDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcbc/service/v1/NummusEnrichedDetailsDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class NummusEnrichedDetailsDto implements Dto3<NummusEnrichedDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NummusEnrichedDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NummusEnrichedDetailsDto, NummusEnrichedDetails>> binaryBase64Serializer$delegate;
    private static final NummusEnrichedDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NummusEnrichedDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NummusEnrichedDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ NummusEnrichedDetailsDto(Instant instant, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instant, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NummusEnrichedDetailsDto(Instant instant, String aggregation_id, String rhs_account_number) {
        this(new Surrogate(instant, aggregation_id, rhs_account_number));
        Intrinsics.checkNotNullParameter(aggregation_id, "aggregation_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
    }

    @Override // com.robinhood.idl.Dto
    public NummusEnrichedDetails toProto() {
        return new NummusEnrichedDetails(this.surrogate.getExecuted_at(), this.surrogate.getAggregation_id(), this.surrogate.getRhs_account_number(), null, 8, null);
    }

    public String toString() {
        return "[NummusEnrichedDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NummusEnrichedDetailsDto) && Intrinsics.areEqual(((NummusEnrichedDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: NummusEnrichedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002.-BK\u0012.\b\u0002\u0010\u0007\u001a(\u0018\u00010\u0002j\u0013\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fB9\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"RF\u0010\u0007\u001a(\u0018\u00010\u0002j\u0013\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001cR \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010(\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u001c¨\u0006/"}, m3636d2 = {"Lcbc/service/v1/NummusEnrichedDetailsDto$Surrogate;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "executed_at", "", "aggregation_id", "rhs_account_number", "<init>", "(Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$cbc_v1_externalRelease", "(Lcbc/service/v1/NummusEnrichedDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getExecuted_at", "()Lj$/time/Instant;", "getExecuted_at$annotations", "()V", "Ljava/lang/String;", "getAggregation_id", "getAggregation_id$annotations", "getRhs_account_number", "getRhs_account_number$annotations", "Companion", "$serializer", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String aggregation_id;
        private final Instant executed_at;
        private final String rhs_account_number;

        public Surrogate() {
            this((Instant) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.executed_at, surrogate.executed_at) && Intrinsics.areEqual(this.aggregation_id, surrogate.aggregation_id) && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number);
        }

        public int hashCode() {
            Instant instant = this.executed_at;
            return ((((instant == null ? 0 : instant.hashCode()) * 31) + this.aggregation_id.hashCode()) * 31) + this.rhs_account_number.hashCode();
        }

        public String toString() {
            return "Surrogate(executed_at=" + this.executed_at + ", aggregation_id=" + this.aggregation_id + ", rhs_account_number=" + this.rhs_account_number + ")";
        }

        /* compiled from: NummusEnrichedDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcbc/service/v1/NummusEnrichedDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcbc/service/v1/NummusEnrichedDetailsDto$Surrogate;", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NummusEnrichedDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, Instant instant, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.executed_at = (i & 1) == 0 ? null : instant;
            if ((i & 2) == 0) {
                this.aggregation_id = "";
            } else {
                this.aggregation_id = str;
            }
            if ((i & 4) == 0) {
                this.rhs_account_number = "";
            } else {
                this.rhs_account_number = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$cbc_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Instant instant = self.executed_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.aggregation_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.aggregation_id);
            }
            if (Intrinsics.areEqual(self.rhs_account_number, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 2, self.rhs_account_number);
        }

        public Surrogate(Instant instant, String aggregation_id, String rhs_account_number) {
            Intrinsics.checkNotNullParameter(aggregation_id, "aggregation_id");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            this.executed_at = instant;
            this.aggregation_id = aggregation_id;
            this.rhs_account_number = rhs_account_number;
        }

        public /* synthetic */ Surrogate(Instant instant, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : instant, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
        }

        public final Instant getExecuted_at() {
            return this.executed_at;
        }

        public final String getAggregation_id() {
            return this.aggregation_id;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }
    }

    /* compiled from: NummusEnrichedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcbc/service/v1/NummusEnrichedDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcbc/service/v1/NummusEnrichedDetailsDto;", "Lcbc/service/v1/NummusEnrichedDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcbc/service/v1/NummusEnrichedDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<NummusEnrichedDetailsDto, NummusEnrichedDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NummusEnrichedDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NummusEnrichedDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NummusEnrichedDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) NummusEnrichedDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NummusEnrichedDetails> getProtoAdapter() {
            return NummusEnrichedDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NummusEnrichedDetailsDto getZeroValue() {
            return NummusEnrichedDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NummusEnrichedDetailsDto fromProto(NummusEnrichedDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new NummusEnrichedDetailsDto(new Surrogate(proto.getExecuted_at(), proto.getAggregation_id(), proto.getRhs_account_number()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: cbc.service.v1.NummusEnrichedDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NummusEnrichedDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NummusEnrichedDetailsDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: NummusEnrichedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcbc/service/v1/NummusEnrichedDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcbc/service/v1/NummusEnrichedDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcbc/service/v1/NummusEnrichedDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<NummusEnrichedDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/cbc.service.v1.NummusEnrichedDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NummusEnrichedDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NummusEnrichedDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NummusEnrichedDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NummusEnrichedDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcbc/service/v1/NummusEnrichedDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "cbc.service.v1.NummusEnrichedDetailsDto";
        }
    }
}
