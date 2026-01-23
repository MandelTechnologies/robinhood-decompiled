package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingFirstPageDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingSecondPageDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: InvestmentsTrackerOnboardingDataDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingData;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto$Surrogate;)V", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingFirstPageDto;", "first_page", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPageDto;", "second_page", "(Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingFirstPageDto;Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPageDto;)V", "toProto", "()Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingData;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto$Surrogate;", "getFirst_page", "()Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingFirstPageDto;", "getSecond_page", "()Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPageDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class InvestmentsTrackerOnboardingDataDto implements Dto3<InvestmentsTrackerOnboardingData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InvestmentsTrackerOnboardingDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestmentsTrackerOnboardingDataDto, InvestmentsTrackerOnboardingData>> binaryBase64Serializer$delegate;
    private static final InvestmentsTrackerOnboardingDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InvestmentsTrackerOnboardingDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestmentsTrackerOnboardingDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final InvestmentsTrackerOnboardingFirstPageDto getFirst_page() {
        return this.surrogate.getFirst_page();
    }

    public final InvestmentsTrackerOnboardingSecondPageDto getSecond_page() {
        return this.surrogate.getSecond_page();
    }

    public InvestmentsTrackerOnboardingDataDto(InvestmentsTrackerOnboardingFirstPageDto investmentsTrackerOnboardingFirstPageDto, InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto) {
        this(new Surrogate(investmentsTrackerOnboardingFirstPageDto, investmentsTrackerOnboardingSecondPageDto));
    }

    public /* synthetic */ InvestmentsTrackerOnboardingDataDto(InvestmentsTrackerOnboardingFirstPageDto investmentsTrackerOnboardingFirstPageDto, InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investmentsTrackerOnboardingFirstPageDto, (i & 2) != 0 ? null : investmentsTrackerOnboardingSecondPageDto);
    }

    @Override // com.robinhood.idl.Dto
    public InvestmentsTrackerOnboardingData toProto() {
        InvestmentsTrackerOnboardingFirstPageDto first_page = this.surrogate.getFirst_page();
        InvestmentsTrackerOnboardingFirstPage proto = first_page != null ? first_page.toProto() : null;
        InvestmentsTrackerOnboardingSecondPageDto second_page = this.surrogate.getSecond_page();
        return new InvestmentsTrackerOnboardingData(proto, second_page != null ? second_page.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[InvestmentsTrackerOnboardingDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InvestmentsTrackerOnboardingDataDto) && Intrinsics.areEqual(((InvestmentsTrackerOnboardingDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: InvestmentsTrackerOnboardingDataDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto$Surrogate;", "", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingFirstPageDto;", "first_page", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPageDto;", "second_page", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingFirstPageDto;Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPageDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbff_money_movement/service/v1/InvestmentsTrackerOnboardingFirstPageDto;Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPageDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingFirstPageDto;", "getFirst_page", "()Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingFirstPageDto;", "getFirst_page$annotations", "()V", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPageDto;", "getSecond_page", "()Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingSecondPageDto;", "getSecond_page$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InvestmentsTrackerOnboardingFirstPageDto first_page;
        private final InvestmentsTrackerOnboardingSecondPageDto second_page;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((InvestmentsTrackerOnboardingFirstPageDto) null, (InvestmentsTrackerOnboardingSecondPageDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.first_page, surrogate.first_page) && Intrinsics.areEqual(this.second_page, surrogate.second_page);
        }

        public int hashCode() {
            InvestmentsTrackerOnboardingFirstPageDto investmentsTrackerOnboardingFirstPageDto = this.first_page;
            int iHashCode = (investmentsTrackerOnboardingFirstPageDto == null ? 0 : investmentsTrackerOnboardingFirstPageDto.hashCode()) * 31;
            InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto = this.second_page;
            return iHashCode + (investmentsTrackerOnboardingSecondPageDto != null ? investmentsTrackerOnboardingSecondPageDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(first_page=" + this.first_page + ", second_page=" + this.second_page + ")";
        }

        /* compiled from: InvestmentsTrackerOnboardingDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InvestmentsTrackerOnboardingDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, InvestmentsTrackerOnboardingFirstPageDto investmentsTrackerOnboardingFirstPageDto, InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.first_page = null;
            } else {
                this.first_page = investmentsTrackerOnboardingFirstPageDto;
            }
            if ((i & 2) == 0) {
                this.second_page = null;
            } else {
                this.second_page = investmentsTrackerOnboardingSecondPageDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            InvestmentsTrackerOnboardingFirstPageDto investmentsTrackerOnboardingFirstPageDto = self.first_page;
            if (investmentsTrackerOnboardingFirstPageDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, InvestmentsTrackerOnboardingFirstPageDto.Serializer.INSTANCE, investmentsTrackerOnboardingFirstPageDto);
            }
            InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto = self.second_page;
            if (investmentsTrackerOnboardingSecondPageDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, InvestmentsTrackerOnboardingSecondPageDto.Serializer.INSTANCE, investmentsTrackerOnboardingSecondPageDto);
            }
        }

        public Surrogate(InvestmentsTrackerOnboardingFirstPageDto investmentsTrackerOnboardingFirstPageDto, InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto) {
            this.first_page = investmentsTrackerOnboardingFirstPageDto;
            this.second_page = investmentsTrackerOnboardingSecondPageDto;
        }

        public /* synthetic */ Surrogate(InvestmentsTrackerOnboardingFirstPageDto investmentsTrackerOnboardingFirstPageDto, InvestmentsTrackerOnboardingSecondPageDto investmentsTrackerOnboardingSecondPageDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : investmentsTrackerOnboardingFirstPageDto, (i & 2) != 0 ? null : investmentsTrackerOnboardingSecondPageDto);
        }

        public final InvestmentsTrackerOnboardingFirstPageDto getFirst_page() {
            return this.first_page;
        }

        public final InvestmentsTrackerOnboardingSecondPageDto getSecond_page() {
            return this.second_page;
        }
    }

    /* compiled from: InvestmentsTrackerOnboardingDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InvestmentsTrackerOnboardingDataDto, InvestmentsTrackerOnboardingData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestmentsTrackerOnboardingDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerOnboardingDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerOnboardingDataDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestmentsTrackerOnboardingDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestmentsTrackerOnboardingData> getProtoAdapter() {
            return InvestmentsTrackerOnboardingData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerOnboardingDataDto getZeroValue() {
            return InvestmentsTrackerOnboardingDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerOnboardingDataDto fromProto(InvestmentsTrackerOnboardingData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            InvestmentsTrackerOnboardingFirstPage first_page = proto.getFirst_page();
            DefaultConstructorMarker defaultConstructorMarker = null;
            InvestmentsTrackerOnboardingFirstPageDto investmentsTrackerOnboardingFirstPageDtoFromProto = first_page != null ? InvestmentsTrackerOnboardingFirstPageDto.INSTANCE.fromProto(first_page) : null;
            InvestmentsTrackerOnboardingSecondPage second_page = proto.getSecond_page();
            return new InvestmentsTrackerOnboardingDataDto(new Surrogate(investmentsTrackerOnboardingFirstPageDtoFromProto, second_page != null ? InvestmentsTrackerOnboardingSecondPageDto.INSTANCE.fromProto(second_page) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerOnboardingDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerOnboardingDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InvestmentsTrackerOnboardingDataDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InvestmentsTrackerOnboardingDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InvestmentsTrackerOnboardingDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.InvestmentsTrackerOnboardingData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestmentsTrackerOnboardingDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InvestmentsTrackerOnboardingDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InvestmentsTrackerOnboardingDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: InvestmentsTrackerOnboardingDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.InvestmentsTrackerOnboardingDataDto";
        }
    }
}
