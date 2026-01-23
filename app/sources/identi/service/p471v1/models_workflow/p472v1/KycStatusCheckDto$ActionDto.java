package identi.service.p471v1.models_workflow.p472v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import identi.service.p471v1.models_workflow.p472v1.KycStatusCheck$Action;
import identi.service.p471v1.models_workflow.p472v1.KycStatusCheckDto$ActionDto;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: KycStatusCheckDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\t! \"#$%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006)"}, m3636d2 = {"identi/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$Surrogate;)V", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto;", "type", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$Surrogate;", "Companion", "Surrogate", "TypeDto", "UploadedDto", "ProceedDto", "CustomerAbandonDto", "UploadFailedDto", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class KycStatusCheckDto$ActionDto implements Dto3<KycStatusCheck$Action>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<KycStatusCheckDto$ActionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<KycStatusCheckDto$ActionDto, KycStatusCheck$Action>> binaryBase64Serializer$delegate;
    private static final KycStatusCheckDto$ActionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ KycStatusCheckDto$ActionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private KycStatusCheckDto$ActionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KycStatusCheckDto$ActionDto(TypeDto typeDto) {
        TypeDto.Proceed proceed = typeDto instanceof TypeDto.Proceed ? (TypeDto.Proceed) typeDto : null;
        ProceedDto value = proceed != null ? proceed.getValue() : null;
        TypeDto.CustomerAbandon customerAbandon = typeDto instanceof TypeDto.CustomerAbandon ? (TypeDto.CustomerAbandon) typeDto : null;
        CustomerAbandonDto value2 = customerAbandon != null ? customerAbandon.getValue() : null;
        TypeDto.Uploaded uploaded = typeDto instanceof TypeDto.Uploaded ? (TypeDto.Uploaded) typeDto : null;
        UploadedDto value3 = uploaded != null ? uploaded.getValue() : null;
        TypeDto.UploadFailed uploadFailed = typeDto instanceof TypeDto.UploadFailed ? (TypeDto.UploadFailed) typeDto : null;
        this(new Surrogate(value, value2, value3, uploadFailed != null ? uploadFailed.getValue() : null));
    }

    public /* synthetic */ KycStatusCheckDto$ActionDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeDto);
    }

    @Override // com.robinhood.idl.Dto
    public KycStatusCheck$Action toProto() {
        ProceedDto proceed = this.surrogate.getProceed();
        KycStatusCheck$Action.Proceed proto = proceed != null ? proceed.toProto() : null;
        CustomerAbandonDto customer_abandon = this.surrogate.getCustomer_abandon();
        KycStatusCheck$Action.CustomerAbandon proto2 = customer_abandon != null ? customer_abandon.toProto() : null;
        UploadedDto uploaded = this.surrogate.getUploaded();
        KycStatusCheck$Action.Uploaded proto3 = uploaded != null ? uploaded.toProto() : null;
        UploadFailedDto upload_failed = this.surrogate.getUpload_failed();
        return new KycStatusCheck$Action(proto, proto2, proto3, upload_failed != null ? upload_failed.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[ActionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof KycStatusCheckDto$ActionDto) && Intrinsics.areEqual(((KycStatusCheckDto$ActionDto) other).surrogate, this.surrogate);
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
    /* compiled from: KycStatusCheckDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102¨\u00066"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$Surrogate;", "", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto;", "proceed", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto;", "customer_abandon", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto;", "uploaded", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto;", "upload_failed", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto;Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto;Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto;Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto;Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto;Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto;Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto;", "getProceed", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto;", "getProceed$annotations", "()V", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto;", "getCustomer_abandon", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto;", "getCustomer_abandon$annotations", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto;", "getUploaded", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto;", "getUploaded$annotations", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto;", "getUpload_failed", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto;", "getUpload_failed$annotations", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CustomerAbandonDto customer_abandon;
        private final ProceedDto proceed;
        private final UploadFailedDto upload_failed;
        private final UploadedDto uploaded;

        public Surrogate() {
            this((ProceedDto) null, (CustomerAbandonDto) null, (UploadedDto) null, (UploadFailedDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.proceed, surrogate.proceed) && Intrinsics.areEqual(this.customer_abandon, surrogate.customer_abandon) && Intrinsics.areEqual(this.uploaded, surrogate.uploaded) && Intrinsics.areEqual(this.upload_failed, surrogate.upload_failed);
        }

        public int hashCode() {
            ProceedDto proceedDto = this.proceed;
            int iHashCode = (proceedDto == null ? 0 : proceedDto.hashCode()) * 31;
            CustomerAbandonDto customerAbandonDto = this.customer_abandon;
            int iHashCode2 = (iHashCode + (customerAbandonDto == null ? 0 : customerAbandonDto.hashCode())) * 31;
            UploadedDto uploadedDto = this.uploaded;
            int iHashCode3 = (iHashCode2 + (uploadedDto == null ? 0 : uploadedDto.hashCode())) * 31;
            UploadFailedDto uploadFailedDto = this.upload_failed;
            return iHashCode3 + (uploadFailedDto != null ? uploadFailedDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(proceed=" + this.proceed + ", customer_abandon=" + this.customer_abandon + ", uploaded=" + this.uploaded + ", upload_failed=" + this.upload_failed + ")";
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return KycStatusCheckDto$ActionDto$Surrogate$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ProceedDto proceedDto, CustomerAbandonDto customerAbandonDto, UploadedDto uploadedDto, UploadFailedDto uploadFailedDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.proceed = null;
            } else {
                this.proceed = proceedDto;
            }
            if ((i & 2) == 0) {
                this.customer_abandon = null;
            } else {
                this.customer_abandon = customerAbandonDto;
            }
            if ((i & 4) == 0) {
                this.uploaded = null;
            } else {
                this.uploaded = uploadedDto;
            }
            if ((i & 8) == 0) {
                this.upload_failed = null;
            } else {
                this.upload_failed = uploadFailedDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ProceedDto proceedDto = self.proceed;
            if (proceedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ProceedDto.Serializer.INSTANCE, proceedDto);
            }
            CustomerAbandonDto customerAbandonDto = self.customer_abandon;
            if (customerAbandonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CustomerAbandonDto.Serializer.INSTANCE, customerAbandonDto);
            }
            UploadedDto uploadedDto = self.uploaded;
            if (uploadedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, UploadedDto.Serializer.INSTANCE, uploadedDto);
            }
            UploadFailedDto uploadFailedDto = self.upload_failed;
            if (uploadFailedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, UploadFailedDto.Serializer.INSTANCE, uploadFailedDto);
            }
        }

        public Surrogate(ProceedDto proceedDto, CustomerAbandonDto customerAbandonDto, UploadedDto uploadedDto, UploadFailedDto uploadFailedDto) {
            this.proceed = proceedDto;
            this.customer_abandon = customerAbandonDto;
            this.uploaded = uploadedDto;
            this.upload_failed = uploadFailedDto;
        }

        public /* synthetic */ Surrogate(ProceedDto proceedDto, CustomerAbandonDto customerAbandonDto, UploadedDto uploadedDto, UploadFailedDto uploadFailedDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : proceedDto, (i & 2) != 0 ? null : customerAbandonDto, (i & 4) != 0 ? null : uploadedDto, (i & 8) != 0 ? null : uploadFailedDto);
        }

        public final ProceedDto getProceed() {
            return this.proceed;
        }

        public final CustomerAbandonDto getCustomer_abandon() {
            return this.customer_abandon;
        }

        public final UploadedDto getUploaded() {
            return this.uploaded;
        }

        public final UploadFailedDto getUpload_failed() {
            return this.upload_failed;
        }
    }

    /* compiled from: KycStatusCheckDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<KycStatusCheckDto$ActionDto, KycStatusCheck$Action> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<KycStatusCheckDto$ActionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<KycStatusCheckDto$ActionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<KycStatusCheckDto$ActionDto> getBinaryBase64Serializer() {
            return (KSerializer) KycStatusCheckDto$ActionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<KycStatusCheck$Action> getProtoAdapter() {
            return KycStatusCheck$Action.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public KycStatusCheckDto$ActionDto getZeroValue() {
            return KycStatusCheckDto$ActionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public KycStatusCheckDto$ActionDto fromProto(KycStatusCheck$Action proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            KycStatusCheck$Action.Proceed proceed = proto.getProceed();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ProceedDto proceedDtoFromProto = proceed != null ? ProceedDto.INSTANCE.fromProto(proceed) : null;
            KycStatusCheck$Action.CustomerAbandon customer_abandon = proto.getCustomer_abandon();
            CustomerAbandonDto customerAbandonDtoFromProto = customer_abandon != null ? CustomerAbandonDto.INSTANCE.fromProto(customer_abandon) : null;
            KycStatusCheck$Action.Uploaded uploaded = proto.getUploaded();
            UploadedDto uploadedDtoFromProto = uploaded != null ? UploadedDto.INSTANCE.fromProto(uploaded) : null;
            KycStatusCheck$Action.UploadFailed upload_failed = proto.getUpload_failed();
            return new KycStatusCheckDto$ActionDto(new Surrogate(proceedDtoFromProto, customerAbandonDtoFromProto, uploadedDtoFromProto, upload_failed != null ? UploadFailedDto.INSTANCE.fromProto(upload_failed) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.KycStatusCheckDto$ActionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KycStatusCheckDto$ActionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new KycStatusCheckDto$ActionDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: KycStatusCheckDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Proceed", "CustomerAbandon", "Uploaded", "UploadFailed", "Companion", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto$CustomerAbandon;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto$Proceed;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto$UploadFailed;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto$Uploaded;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class TypeDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TypeDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto$Proceed;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Proceed extends TypeDto {
            private final ProceedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Proceed) && Intrinsics.areEqual(this.value, ((Proceed) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Proceed(value=" + this.value + ")";
            }

            public final ProceedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Proceed(ProceedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto$CustomerAbandon;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CustomerAbandon extends TypeDto {
            private final CustomerAbandonDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CustomerAbandon) && Intrinsics.areEqual(this.value, ((CustomerAbandon) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CustomerAbandon(value=" + this.value + ")";
            }

            public final CustomerAbandonDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CustomerAbandon(CustomerAbandonDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto$Uploaded;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Uploaded extends TypeDto {
            private final UploadedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Uploaded) && Intrinsics.areEqual(this.value, ((Uploaded) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Uploaded(value=" + this.value + ")";
            }

            public final UploadedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Uploaded(UploadedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto$UploadFailed;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final /* data */ class UploadFailed extends TypeDto {
            private final UploadFailedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UploadFailed) && Intrinsics.areEqual(this.value, ((UploadFailed) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "UploadFailed(value=" + this.value + ")";
            }

            public final UploadFailedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UploadFailed(UploadFailedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$TypeDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion implements Dto4.Creator<TypeDto, KycStatusCheck$Action> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<KycStatusCheck$Action> getProtoAdapter() {
                return KycStatusCheck$Action.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(KycStatusCheck$Action proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getProceed() != null) {
                    return new Proceed(ProceedDto.INSTANCE.fromProto(proto.getProceed()));
                }
                if (proto.getCustomer_abandon() != null) {
                    return new CustomerAbandon(CustomerAbandonDto.INSTANCE.fromProto(proto.getCustomer_abandon()));
                }
                if (proto.getUploaded() != null) {
                    return new Uploaded(UploadedDto.INSTANCE.fromProto(proto.getUploaded()));
                }
                if (proto.getUpload_failed() != null) {
                    return new UploadFailed(UploadFailedDto.INSTANCE.fromProto(proto.getUpload_failed()));
                }
                return null;
            }
        }
    }

    /* compiled from: KycStatusCheckDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto;", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Uploaded;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto$Surrogate;)V", "()V", "toProto", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Uploaded;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class UploadedDto implements Dto3<KycStatusCheck$Action.Uploaded>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<UploadedDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<UploadedDto, KycStatusCheck$Action.Uploaded>> binaryBase64Serializer$delegate;
        private static final UploadedDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ UploadedDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private UploadedDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public UploadedDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public KycStatusCheck$Action.Uploaded toProto() {
            return new KycStatusCheck$Action.Uploaded(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[UploadedDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof UploadedDto) && Intrinsics.areEqual(((UploadedDto) other).surrogate, this.surrogate);
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
        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: identi.service.v1.models_workflow.v1.KycStatusCheckDto$ActionDto$UploadedDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KycStatusCheckDto$ActionDto.UploadedDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return -2015186176;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("identi.service.v1.models_workflow.v1.KycStatusCheckDto.ActionDto.UploadedDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Uploaded;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<UploadedDto, KycStatusCheck$Action.Uploaded> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<UploadedDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<UploadedDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<UploadedDto> getBinaryBase64Serializer() {
                return (KSerializer) UploadedDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<KycStatusCheck$Action.Uploaded> getProtoAdapter() {
                return KycStatusCheck$Action.Uploaded.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public UploadedDto getZeroValue() {
                return UploadedDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public UploadedDto fromProto(KycStatusCheck$Action.Uploaded proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new UploadedDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.KycStatusCheckDto$ActionDto$UploadedDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KycStatusCheckDto$ActionDto.UploadedDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new UploadedDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<UploadedDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.KycStatusCheck.Action.Uploaded", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, UploadedDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public UploadedDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new UploadedDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadedDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
            public final String provideIntoMap() {
                return "identi.service.v1.models_workflow.v1.KycStatusCheckDto$ActionDto$UploadedDto";
            }
        }
    }

    /* compiled from: KycStatusCheckDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 \u001f!\"B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006#"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto;", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Proceed;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto$Surrogate;)V", "", "timed_out", "(Z)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Proceed;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ProceedDto implements Dto3<KycStatusCheck$Action.Proceed>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ProceedDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ProceedDto, KycStatusCheck$Action.Proceed>> binaryBase64Serializer$delegate;
        private static final ProceedDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ProceedDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ProceedDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public ProceedDto(boolean z) {
            this(new Surrogate(z));
        }

        public /* synthetic */ ProceedDto(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public KycStatusCheck$Action.Proceed toProto() {
            return new KycStatusCheck$Action.Proceed(this.surrogate.getTimed_out(), null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[ProceedDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ProceedDto) && Intrinsics.areEqual(((ProceedDto) other).surrogate, this.surrogate);
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
        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0083\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto$Surrogate;", "", "", "timed_out", "<init>", "(Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getTimed_out", "()Z", "getTimed_out$annotations", "()V", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean timed_out;

            public Surrogate() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && this.timed_out == ((Surrogate) other).timed_out;
            }

            public int hashCode() {
                return Boolean.hashCode(this.timed_out);
            }

            public String toString() {
                return "Surrogate(timed_out=" + this.timed_out + ")";
            }

            /* compiled from: KycStatusCheckDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return KycStatusCheckDto$ActionDto$ProceedDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.timed_out = false;
                } else {
                    this.timed_out = z;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                boolean z = self.timed_out;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 0, z);
                }
            }

            public Surrogate(boolean z) {
                this.timed_out = z;
            }

            public /* synthetic */ Surrogate(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }

            public final boolean getTimed_out() {
                return this.timed_out;
            }
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$Proceed;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<ProceedDto, KycStatusCheck$Action.Proceed> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ProceedDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ProceedDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ProceedDto> getBinaryBase64Serializer() {
                return (KSerializer) ProceedDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<KycStatusCheck$Action.Proceed> getProtoAdapter() {
                return KycStatusCheck$Action.Proceed.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProceedDto getZeroValue() {
                return ProceedDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProceedDto fromProto(KycStatusCheck$Action.Proceed proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new ProceedDto(new Surrogate(proto.getTimed_out()), null);
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion companion = new Companion(defaultConstructorMarker);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.KycStatusCheckDto$ActionDto$ProceedDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KycStatusCheckDto$ActionDto.ProceedDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ProceedDto(false, 1, defaultConstructorMarker);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<ProceedDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.KycStatusCheck.Action.Proceed", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ProceedDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ProceedDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ProceedDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$ProceedDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
            public final String provideIntoMap() {
                return "identi.service.v1.models_workflow.v1.KycStatusCheckDto$ActionDto$ProceedDto";
            }
        }
    }

    /* compiled from: KycStatusCheckDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 \u001f!\"B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006#"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto;", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$CustomerAbandon;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto$Surrogate;)V", "", "timed_out", "(Z)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$CustomerAbandon;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CustomerAbandonDto implements Dto3<KycStatusCheck$Action.CustomerAbandon>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<CustomerAbandonDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CustomerAbandonDto, KycStatusCheck$Action.CustomerAbandon>> binaryBase64Serializer$delegate;
        private static final CustomerAbandonDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ CustomerAbandonDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CustomerAbandonDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public CustomerAbandonDto(boolean z) {
            this(new Surrogate(z));
        }

        public /* synthetic */ CustomerAbandonDto(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public KycStatusCheck$Action.CustomerAbandon toProto() {
            return new KycStatusCheck$Action.CustomerAbandon(this.surrogate.getTimed_out(), null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[CustomerAbandonDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof CustomerAbandonDto) && Intrinsics.areEqual(((CustomerAbandonDto) other).surrogate, this.surrogate);
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
        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0083\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto$Surrogate;", "", "", "timed_out", "<init>", "(Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getTimed_out", "()Z", "getTimed_out$annotations", "()V", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean timed_out;

            public Surrogate() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && this.timed_out == ((Surrogate) other).timed_out;
            }

            public int hashCode() {
                return Boolean.hashCode(this.timed_out);
            }

            public String toString() {
                return "Surrogate(timed_out=" + this.timed_out + ")";
            }

            /* compiled from: KycStatusCheckDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes14.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return C45305xac962a2f.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.timed_out = false;
                } else {
                    this.timed_out = z;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                boolean z = self.timed_out;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 0, z);
                }
            }

            public Surrogate(boolean z) {
                this.timed_out = z;
            }

            public /* synthetic */ Surrogate(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }

            public final boolean getTimed_out() {
                return this.timed_out;
            }
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$CustomerAbandon;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<CustomerAbandonDto, KycStatusCheck$Action.CustomerAbandon> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CustomerAbandonDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CustomerAbandonDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CustomerAbandonDto> getBinaryBase64Serializer() {
                return (KSerializer) CustomerAbandonDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<KycStatusCheck$Action.CustomerAbandon> getProtoAdapter() {
                return KycStatusCheck$Action.CustomerAbandon.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CustomerAbandonDto getZeroValue() {
                return CustomerAbandonDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CustomerAbandonDto fromProto(KycStatusCheck$Action.CustomerAbandon proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new CustomerAbandonDto(new Surrogate(proto.getTimed_out()), null);
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion companion = new Companion(defaultConstructorMarker);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.KycStatusCheckDto$ActionDto$CustomerAbandonDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KycStatusCheckDto$ActionDto.CustomerAbandonDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new CustomerAbandonDto(false, 1, defaultConstructorMarker);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<CustomerAbandonDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.KycStatusCheck.Action.CustomerAbandon", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CustomerAbandonDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public CustomerAbandonDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new CustomerAbandonDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$CustomerAbandonDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4190_6)
            public final String provideIntoMap() {
                return "identi.service.v1.models_workflow.v1.KycStatusCheckDto$ActionDto$CustomerAbandonDto";
            }
        }
    }

    /* compiled from: KycStatusCheckDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto;", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$UploadFailed;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto$Surrogate;)V", "()V", "toProto", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$UploadFailed;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes14.dex */
    public static final class UploadFailedDto implements Dto3<KycStatusCheck$Action.UploadFailed>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<UploadFailedDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<UploadFailedDto, KycStatusCheck$Action.UploadFailed>> binaryBase64Serializer$delegate;
        private static final UploadFailedDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ UploadFailedDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private UploadFailedDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public UploadFailedDto() {
            this(Surrogate.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public KycStatusCheck$Action.UploadFailed toProto() {
            return new KycStatusCheck$Action.UploadFailed(null, 1, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[UploadFailedDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof UploadFailedDto) && Intrinsics.areEqual(((UploadFailedDto) other).surrogate, this.surrogate);
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
        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            public static final Surrogate INSTANCE = new Surrogate();
            private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: identi.service.v1.models_workflow.v1.KycStatusCheckDto$ActionDto$UploadFailedDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KycStatusCheckDto$ActionDto.UploadFailedDto.Surrogate._init_$_anonymous_();
                }
            });

            public boolean equals(Object other) {
                return this == other || (other instanceof Surrogate);
            }

            public int hashCode() {
                return 2115033346;
            }

            public String toString() {
                return "Surrogate";
            }

            private Surrogate() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                return new ObjectSerializer("identi.service.v1.models_workflow.v1.KycStatusCheckDto.ActionDto.UploadFailedDto.Surrogate", INSTANCE, new Annotation[0]);
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return $cachedSerializer$delegate.getValue();
            }

            public final KSerializer<Surrogate> serializer() {
                return get$cachedSerializer();
            }
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action$UploadFailed;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<UploadFailedDto, KycStatusCheck$Action.UploadFailed> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<UploadFailedDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<UploadFailedDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<UploadFailedDto> getBinaryBase64Serializer() {
                return (KSerializer) UploadFailedDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<KycStatusCheck$Action.UploadFailed> getProtoAdapter() {
                return KycStatusCheck$Action.UploadFailed.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public UploadFailedDto getZeroValue() {
                return UploadFailedDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public UploadFailedDto fromProto(KycStatusCheck$Action.UploadFailed proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new UploadFailedDto();
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.KycStatusCheckDto$ActionDto$UploadFailedDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KycStatusCheckDto$ActionDto.UploadFailedDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new UploadFailedDto();
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<UploadFailedDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.KycStatusCheck.Action.UploadFailed", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, UploadFailedDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public UploadFailedDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new UploadFailedDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: KycStatusCheckDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$UploadFailedDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
            public final String provideIntoMap() {
                return "identi.service.v1.models_workflow.v1.KycStatusCheckDto$ActionDto$UploadFailedDto";
            }
        }
    }

    /* compiled from: KycStatusCheckDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<KycStatusCheckDto$ActionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.KycStatusCheck.Action", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, KycStatusCheckDto$ActionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public KycStatusCheckDto$ActionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new KycStatusCheckDto$ActionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: KycStatusCheckDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "identi.service.v1.models_workflow.v1.KycStatusCheckDto$ActionDto";
        }
    }
}
