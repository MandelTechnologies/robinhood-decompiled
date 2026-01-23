package nimbus.service.p511v1;

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
import nimbus.service.p511v1.ClawbackDetailsDto;
import nimbus.service.p511v1.IneligibilityReasonDto;
import nimbus.service.p511v1.PreSubmissionChecksResponseDto;
import nimbus.service.p511v1.PreSubmissionWarningDto;

/* compiled from: PreSubmissionChecksResponseDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionChecksResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lnimbus/service/v1/PreSubmissionChecksResponse;", "Landroid/os/Parcelable;", "Lnimbus/service/v1/PreSubmissionChecksResponseDto$Surrogate;", "surrogate", "<init>", "(Lnimbus/service/v1/PreSubmissionChecksResponseDto$Surrogate;)V", "", "eligible", "Lnimbus/service/v1/IneligibilityReasonDto;", "ineligible_reason", "Lnimbus/service/v1/ClawbackDetailsDto;", "acats_clawback", "Lcom/robinhood/idl/IdlDecimal;", "moved_gold_boost_amount", "", "Lnimbus/service/v1/PreSubmissionWarningDto;", "warnings", "(ZLnimbus/service/v1/IneligibilityReasonDto;Lnimbus/service/v1/ClawbackDetailsDto;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;)V", "toProto", "()Lnimbus/service/v1/PreSubmissionChecksResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnimbus/service/v1/PreSubmissionChecksResponseDto$Surrogate;", "getWarnings", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class PreSubmissionChecksResponseDto implements Dto3<PreSubmissionChecksResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PreSubmissionChecksResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PreSubmissionChecksResponseDto, PreSubmissionChecksResponse>> binaryBase64Serializer$delegate;
    private static final PreSubmissionChecksResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PreSubmissionChecksResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PreSubmissionChecksResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<PreSubmissionWarningDto> getWarnings() {
        return this.surrogate.getWarnings();
    }

    public /* synthetic */ PreSubmissionChecksResponseDto(boolean z, IneligibilityReasonDto ineligibilityReasonDto, ClawbackDetailsDto clawbackDetailsDto, IdlDecimal idlDecimal, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? IneligibilityReasonDto.INSTANCE.getZeroValue() : ineligibilityReasonDto, (i & 4) != 0 ? null : clawbackDetailsDto, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreSubmissionChecksResponseDto(boolean z, IneligibilityReasonDto ineligible_reason, ClawbackDetailsDto clawbackDetailsDto, IdlDecimal moved_gold_boost_amount, List<PreSubmissionWarningDto> warnings) {
        this(new Surrogate(z, ineligible_reason, clawbackDetailsDto, moved_gold_boost_amount, warnings));
        Intrinsics.checkNotNullParameter(ineligible_reason, "ineligible_reason");
        Intrinsics.checkNotNullParameter(moved_gold_boost_amount, "moved_gold_boost_amount");
        Intrinsics.checkNotNullParameter(warnings, "warnings");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PreSubmissionChecksResponse toProto() {
        boolean eligible = this.surrogate.getEligible();
        IneligibilityReason ineligibilityReason = (IneligibilityReason) this.surrogate.getIneligible_reason().toProto();
        ClawbackDetailsDto acats_clawback = this.surrogate.getAcats_clawback();
        ClawbackDetails proto = acats_clawback != null ? acats_clawback.toProto() : null;
        String stringValue = this.surrogate.getMoved_gold_boost_amount().getStringValue();
        List<PreSubmissionWarningDto> warnings = this.surrogate.getWarnings();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(warnings, 10));
        Iterator<T> it = warnings.iterator();
        while (it.hasNext()) {
            arrayList.add(((PreSubmissionWarningDto) it.next()).toProto());
        }
        return new PreSubmissionChecksResponse(eligible, ineligibilityReason, proto, stringValue, arrayList, null, 32, null);
    }

    public String toString() {
        return "[PreSubmissionChecksResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PreSubmissionChecksResponseDto) && Intrinsics.areEqual(((PreSubmissionChecksResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: PreSubmissionChecksResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002>=BP\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0017\b\u0002\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011BQ\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b0\u0010,\u001a\u0004\b.\u0010/R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b4\u0010,\u001a\u0004\b2\u00103R/\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b8\u0010,\u001a\u0004\b6\u00107R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00109\u0012\u0004\b<\u0010,\u001a\u0004\b:\u0010;¨\u0006?"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionChecksResponseDto$Surrogate;", "", "", "eligible", "Lnimbus/service/v1/IneligibilityReasonDto;", "ineligible_reason", "Lnimbus/service/v1/ClawbackDetailsDto;", "acats_clawback", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "moved_gold_boost_amount", "", "Lnimbus/service/v1/PreSubmissionWarningDto;", "warnings", "<init>", "(ZLnimbus/service/v1/IneligibilityReasonDto;Lnimbus/service/v1/ClawbackDetailsDto;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLnimbus/service/v1/IneligibilityReasonDto;Lnimbus/service/v1/ClawbackDetailsDto;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nimbus_v1_externalRelease", "(Lnimbus/service/v1/PreSubmissionChecksResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEligible", "()Z", "getEligible$annotations", "()V", "Lnimbus/service/v1/IneligibilityReasonDto;", "getIneligible_reason", "()Lnimbus/service/v1/IneligibilityReasonDto;", "getIneligible_reason$annotations", "Lnimbus/service/v1/ClawbackDetailsDto;", "getAcats_clawback", "()Lnimbus/service/v1/ClawbackDetailsDto;", "getAcats_clawback$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getMoved_gold_boost_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getMoved_gold_boost_amount$annotations", "Ljava/util/List;", "getWarnings", "()Ljava/util/List;", "getWarnings$annotations", "Companion", "$serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final ClawbackDetailsDto acats_clawback;
        private final boolean eligible;
        private final IneligibilityReasonDto ineligible_reason;
        private final IdlDecimal moved_gold_boost_amount;
        private final List<PreSubmissionWarningDto> warnings;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: nimbus.service.v1.PreSubmissionChecksResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreSubmissionChecksResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this(false, (IneligibilityReasonDto) null, (ClawbackDetailsDto) null, (IdlDecimal) null, (List) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(PreSubmissionWarningDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.eligible == surrogate.eligible && this.ineligible_reason == surrogate.ineligible_reason && Intrinsics.areEqual(this.acats_clawback, surrogate.acats_clawback) && Intrinsics.areEqual(this.moved_gold_boost_amount, surrogate.moved_gold_boost_amount) && Intrinsics.areEqual(this.warnings, surrogate.warnings);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.eligible) * 31) + this.ineligible_reason.hashCode()) * 31;
            ClawbackDetailsDto clawbackDetailsDto = this.acats_clawback;
            return ((((iHashCode + (clawbackDetailsDto == null ? 0 : clawbackDetailsDto.hashCode())) * 31) + this.moved_gold_boost_amount.hashCode()) * 31) + this.warnings.hashCode();
        }

        public String toString() {
            return "Surrogate(eligible=" + this.eligible + ", ineligible_reason=" + this.ineligible_reason + ", acats_clawback=" + this.acats_clawback + ", moved_gold_boost_amount=" + this.moved_gold_boost_amount + ", warnings=" + this.warnings + ")";
        }

        /* compiled from: PreSubmissionChecksResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionChecksResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnimbus/service/v1/PreSubmissionChecksResponseDto$Surrogate;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PreSubmissionChecksResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, IneligibilityReasonDto ineligibilityReasonDto, ClawbackDetailsDto clawbackDetailsDto, IdlDecimal idlDecimal, List list, SerializationConstructorMarker serializationConstructorMarker) {
            this.eligible = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.ineligible_reason = IneligibilityReasonDto.INSTANCE.getZeroValue();
            } else {
                this.ineligible_reason = ineligibilityReasonDto;
            }
            if ((i & 4) == 0) {
                this.acats_clawback = null;
            } else {
                this.acats_clawback = clawbackDetailsDto;
            }
            if ((i & 8) == 0) {
                this.moved_gold_boost_amount = new IdlDecimal("");
            } else {
                this.moved_gold_boost_amount = idlDecimal;
            }
            if ((i & 16) == 0) {
                this.warnings = CollectionsKt.emptyList();
            } else {
                this.warnings = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nimbus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            boolean z = self.eligible;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            if (self.ineligible_reason != IneligibilityReasonDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, IneligibilityReasonDto.Serializer.INSTANCE, self.ineligible_reason);
            }
            ClawbackDetailsDto clawbackDetailsDto = self.acats_clawback;
            if (clawbackDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ClawbackDetailsDto.Serializer.INSTANCE, clawbackDetailsDto);
            }
            if (!Intrinsics.areEqual(self.moved_gold_boost_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.moved_gold_boost_amount);
            }
            if (Intrinsics.areEqual(self.warnings, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.warnings);
        }

        public Surrogate(boolean z, IneligibilityReasonDto ineligible_reason, ClawbackDetailsDto clawbackDetailsDto, IdlDecimal moved_gold_boost_amount, List<PreSubmissionWarningDto> warnings) {
            Intrinsics.checkNotNullParameter(ineligible_reason, "ineligible_reason");
            Intrinsics.checkNotNullParameter(moved_gold_boost_amount, "moved_gold_boost_amount");
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            this.eligible = z;
            this.ineligible_reason = ineligible_reason;
            this.acats_clawback = clawbackDetailsDto;
            this.moved_gold_boost_amount = moved_gold_boost_amount;
            this.warnings = warnings;
        }

        public final boolean getEligible() {
            return this.eligible;
        }

        public final IneligibilityReasonDto getIneligible_reason() {
            return this.ineligible_reason;
        }

        public /* synthetic */ Surrogate(boolean z, IneligibilityReasonDto ineligibilityReasonDto, ClawbackDetailsDto clawbackDetailsDto, IdlDecimal idlDecimal, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? IneligibilityReasonDto.INSTANCE.getZeroValue() : ineligibilityReasonDto, (i & 4) != 0 ? null : clawbackDetailsDto, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final ClawbackDetailsDto getAcats_clawback() {
            return this.acats_clawback;
        }

        public final IdlDecimal getMoved_gold_boost_amount() {
            return this.moved_gold_boost_amount;
        }

        public final List<PreSubmissionWarningDto> getWarnings() {
            return this.warnings;
        }
    }

    /* compiled from: PreSubmissionChecksResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionChecksResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnimbus/service/v1/PreSubmissionChecksResponseDto;", "Lnimbus/service/v1/PreSubmissionChecksResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnimbus/service/v1/PreSubmissionChecksResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PreSubmissionChecksResponseDto, PreSubmissionChecksResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PreSubmissionChecksResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PreSubmissionChecksResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PreSubmissionChecksResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) PreSubmissionChecksResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PreSubmissionChecksResponse> getProtoAdapter() {
            return PreSubmissionChecksResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PreSubmissionChecksResponseDto getZeroValue() {
            return PreSubmissionChecksResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PreSubmissionChecksResponseDto fromProto(PreSubmissionChecksResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            boolean eligible = proto.getEligible();
            IneligibilityReasonDto ineligibilityReasonDtoFromProto = IneligibilityReasonDto.INSTANCE.fromProto(proto.getIneligible_reason());
            ClawbackDetails acats_clawback = proto.getAcats_clawback();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ClawbackDetailsDto clawbackDetailsDtoFromProto = acats_clawback != null ? ClawbackDetailsDto.INSTANCE.fromProto(acats_clawback) : null;
            IdlDecimal idlDecimal = new IdlDecimal(proto.getMoved_gold_boost_amount());
            List<PreSubmissionWarning> warnings = proto.getWarnings();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(warnings, 10));
            Iterator<T> it = warnings.iterator();
            while (it.hasNext()) {
                arrayList.add(PreSubmissionWarningDto.INSTANCE.fromProto((PreSubmissionWarning) it.next()));
            }
            return new PreSubmissionChecksResponseDto(new Surrogate(eligible, ineligibilityReasonDtoFromProto, clawbackDetailsDtoFromProto, idlDecimal, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nimbus.service.v1.PreSubmissionChecksResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreSubmissionChecksResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new PreSubmissionChecksResponseDto(false, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PreSubmissionChecksResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionChecksResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnimbus/service/v1/PreSubmissionChecksResponseDto;", "<init>", "()V", "surrogateSerializer", "Lnimbus/service/v1/PreSubmissionChecksResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Serializer implements KSerializer<PreSubmissionChecksResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nimbus.service.v1.PreSubmissionChecksResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PreSubmissionChecksResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PreSubmissionChecksResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PreSubmissionChecksResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PreSubmissionChecksResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionChecksResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "nimbus.service.v1.PreSubmissionChecksResponseDto";
        }
    }
}
