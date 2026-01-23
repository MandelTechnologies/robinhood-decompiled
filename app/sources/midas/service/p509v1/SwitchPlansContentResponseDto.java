package midas.service.p509v1;

import android.os.Parcel;
import android.os.Parcelable;
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
import midas.service.p509v1.PlanSelectionPageContentDto;
import midas.service.p509v1.SwitchPlansConfirmationContentDto;
import midas.service.p509v1.UpsellScreenContentDto;

/* compiled from: SwitchPlansContentResponseDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lmidas/service/v1/SwitchPlansContentResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmidas/service/v1/SwitchPlansContentResponse;", "Landroid/os/Parcelable;", "Lmidas/service/v1/SwitchPlansContentResponseDto$Surrogate;", "surrogate", "<init>", "(Lmidas/service/v1/SwitchPlansContentResponseDto$Surrogate;)V", "Lmidas/service/v1/PlanSelectionPageContentDto;", "plan_selection", "Lmidas/service/v1/SwitchPlansConfirmationContentDto;", "confirmation_page", "Lmidas/service/v1/UpsellScreenContentDto;", "upsell_screen", "(Lmidas/service/v1/PlanSelectionPageContentDto;Lmidas/service/v1/SwitchPlansConfirmationContentDto;Lmidas/service/v1/UpsellScreenContentDto;)V", "toProto", "()Lmidas/service/v1/SwitchPlansContentResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmidas/service/v1/SwitchPlansContentResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class SwitchPlansContentResponseDto implements Dto3<SwitchPlansContentResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SwitchPlansContentResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SwitchPlansContentResponseDto, SwitchPlansContentResponse>> binaryBase64Serializer$delegate;
    private static final SwitchPlansContentResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SwitchPlansContentResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SwitchPlansContentResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ SwitchPlansContentResponseDto(PlanSelectionPageContentDto planSelectionPageContentDto, SwitchPlansConfirmationContentDto switchPlansConfirmationContentDto, UpsellScreenContentDto upsellScreenContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : planSelectionPageContentDto, (i & 2) != 0 ? null : switchPlansConfirmationContentDto, (i & 4) != 0 ? null : upsellScreenContentDto);
    }

    public SwitchPlansContentResponseDto(PlanSelectionPageContentDto planSelectionPageContentDto, SwitchPlansConfirmationContentDto switchPlansConfirmationContentDto, UpsellScreenContentDto upsellScreenContentDto) {
        this(new Surrogate(planSelectionPageContentDto, switchPlansConfirmationContentDto, upsellScreenContentDto));
    }

    @Override // com.robinhood.idl.Dto
    public SwitchPlansContentResponse toProto() {
        PlanSelectionPageContentDto plan_selection = this.surrogate.getPlan_selection();
        PlanSelectionPageContent proto = plan_selection != null ? plan_selection.toProto() : null;
        SwitchPlansConfirmationContentDto confirmation_page = this.surrogate.getConfirmation_page();
        SwitchPlansConfirmationContent proto2 = confirmation_page != null ? confirmation_page.toProto() : null;
        UpsellScreenContentDto upsell_screen = this.surrogate.getUpsell_screen();
        return new SwitchPlansContentResponse(proto, proto2, upsell_screen != null ? upsell_screen.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[SwitchPlansContentResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SwitchPlansContentResponseDto) && Intrinsics.areEqual(((SwitchPlansContentResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: SwitchPlansContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lmidas/service/v1/SwitchPlansContentResponseDto$Surrogate;", "", "Lmidas/service/v1/PlanSelectionPageContentDto;", "plan_selection", "Lmidas/service/v1/SwitchPlansConfirmationContentDto;", "confirmation_page", "Lmidas/service/v1/UpsellScreenContentDto;", "upsell_screen", "<init>", "(Lmidas/service/v1/PlanSelectionPageContentDto;Lmidas/service/v1/SwitchPlansConfirmationContentDto;Lmidas/service/v1/UpsellScreenContentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmidas/service/v1/PlanSelectionPageContentDto;Lmidas/service/v1/SwitchPlansConfirmationContentDto;Lmidas/service/v1/UpsellScreenContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$midas_service_v1_externalRelease", "(Lmidas/service/v1/SwitchPlansContentResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmidas/service/v1/PlanSelectionPageContentDto;", "getPlan_selection", "()Lmidas/service/v1/PlanSelectionPageContentDto;", "getPlan_selection$annotations", "()V", "Lmidas/service/v1/SwitchPlansConfirmationContentDto;", "getConfirmation_page", "()Lmidas/service/v1/SwitchPlansConfirmationContentDto;", "getConfirmation_page$annotations", "Lmidas/service/v1/UpsellScreenContentDto;", "getUpsell_screen", "()Lmidas/service/v1/UpsellScreenContentDto;", "getUpsell_screen$annotations", "Companion", "$serializer", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final SwitchPlansConfirmationContentDto confirmation_page;
        private final PlanSelectionPageContentDto plan_selection;
        private final UpsellScreenContentDto upsell_screen;

        public Surrogate() {
            this((PlanSelectionPageContentDto) null, (SwitchPlansConfirmationContentDto) null, (UpsellScreenContentDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.plan_selection, surrogate.plan_selection) && Intrinsics.areEqual(this.confirmation_page, surrogate.confirmation_page) && Intrinsics.areEqual(this.upsell_screen, surrogate.upsell_screen);
        }

        public int hashCode() {
            PlanSelectionPageContentDto planSelectionPageContentDto = this.plan_selection;
            int iHashCode = (planSelectionPageContentDto == null ? 0 : planSelectionPageContentDto.hashCode()) * 31;
            SwitchPlansConfirmationContentDto switchPlansConfirmationContentDto = this.confirmation_page;
            int iHashCode2 = (iHashCode + (switchPlansConfirmationContentDto == null ? 0 : switchPlansConfirmationContentDto.hashCode())) * 31;
            UpsellScreenContentDto upsellScreenContentDto = this.upsell_screen;
            return iHashCode2 + (upsellScreenContentDto != null ? upsellScreenContentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(plan_selection=" + this.plan_selection + ", confirmation_page=" + this.confirmation_page + ", upsell_screen=" + this.upsell_screen + ")";
        }

        /* compiled from: SwitchPlansContentResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmidas/service/v1/SwitchPlansContentResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmidas/service/v1/SwitchPlansContentResponseDto$Surrogate;", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SwitchPlansContentResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, PlanSelectionPageContentDto planSelectionPageContentDto, SwitchPlansConfirmationContentDto switchPlansConfirmationContentDto, UpsellScreenContentDto upsellScreenContentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.plan_selection = null;
            } else {
                this.plan_selection = planSelectionPageContentDto;
            }
            if ((i & 2) == 0) {
                this.confirmation_page = null;
            } else {
                this.confirmation_page = switchPlansConfirmationContentDto;
            }
            if ((i & 4) == 0) {
                this.upsell_screen = null;
            } else {
                this.upsell_screen = upsellScreenContentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$midas_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            PlanSelectionPageContentDto planSelectionPageContentDto = self.plan_selection;
            if (planSelectionPageContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, PlanSelectionPageContentDto.Serializer.INSTANCE, planSelectionPageContentDto);
            }
            SwitchPlansConfirmationContentDto switchPlansConfirmationContentDto = self.confirmation_page;
            if (switchPlansConfirmationContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, SwitchPlansConfirmationContentDto.Serializer.INSTANCE, switchPlansConfirmationContentDto);
            }
            UpsellScreenContentDto upsellScreenContentDto = self.upsell_screen;
            if (upsellScreenContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, UpsellScreenContentDto.Serializer.INSTANCE, upsellScreenContentDto);
            }
        }

        public Surrogate(PlanSelectionPageContentDto planSelectionPageContentDto, SwitchPlansConfirmationContentDto switchPlansConfirmationContentDto, UpsellScreenContentDto upsellScreenContentDto) {
            this.plan_selection = planSelectionPageContentDto;
            this.confirmation_page = switchPlansConfirmationContentDto;
            this.upsell_screen = upsellScreenContentDto;
        }

        public /* synthetic */ Surrogate(PlanSelectionPageContentDto planSelectionPageContentDto, SwitchPlansConfirmationContentDto switchPlansConfirmationContentDto, UpsellScreenContentDto upsellScreenContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : planSelectionPageContentDto, (i & 2) != 0 ? null : switchPlansConfirmationContentDto, (i & 4) != 0 ? null : upsellScreenContentDto);
        }

        public final PlanSelectionPageContentDto getPlan_selection() {
            return this.plan_selection;
        }

        public final SwitchPlansConfirmationContentDto getConfirmation_page() {
            return this.confirmation_page;
        }

        public final UpsellScreenContentDto getUpsell_screen() {
            return this.upsell_screen;
        }
    }

    /* compiled from: SwitchPlansContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmidas/service/v1/SwitchPlansContentResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmidas/service/v1/SwitchPlansContentResponseDto;", "Lmidas/service/v1/SwitchPlansContentResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmidas/service/v1/SwitchPlansContentResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SwitchPlansContentResponseDto, SwitchPlansContentResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SwitchPlansContentResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SwitchPlansContentResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SwitchPlansContentResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) SwitchPlansContentResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SwitchPlansContentResponse> getProtoAdapter() {
            return SwitchPlansContentResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SwitchPlansContentResponseDto getZeroValue() {
            return SwitchPlansContentResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SwitchPlansContentResponseDto fromProto(SwitchPlansContentResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            PlanSelectionPageContent plan_selection = proto.getPlan_selection();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PlanSelectionPageContentDto planSelectionPageContentDtoFromProto = plan_selection != null ? PlanSelectionPageContentDto.INSTANCE.fromProto(plan_selection) : null;
            SwitchPlansConfirmationContent confirmation_page = proto.getConfirmation_page();
            SwitchPlansConfirmationContentDto switchPlansConfirmationContentDtoFromProto = confirmation_page != null ? SwitchPlansConfirmationContentDto.INSTANCE.fromProto(confirmation_page) : null;
            UpsellScreenContent upsell_screen = proto.getUpsell_screen();
            return new SwitchPlansContentResponseDto(new Surrogate(planSelectionPageContentDtoFromProto, switchPlansConfirmationContentDtoFromProto, upsell_screen != null ? UpsellScreenContentDto.INSTANCE.fromProto(upsell_screen) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: midas.service.v1.SwitchPlansContentResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SwitchPlansContentResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SwitchPlansContentResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SwitchPlansContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmidas/service/v1/SwitchPlansContentResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmidas/service/v1/SwitchPlansContentResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmidas/service/v1/SwitchPlansContentResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<SwitchPlansContentResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/midas.service.v1.SwitchPlansContentResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SwitchPlansContentResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SwitchPlansContentResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SwitchPlansContentResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SwitchPlansContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmidas/service/v1/SwitchPlansContentResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "midas.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "midas.service.v1.SwitchPlansContentResponseDto";
        }
    }
}
