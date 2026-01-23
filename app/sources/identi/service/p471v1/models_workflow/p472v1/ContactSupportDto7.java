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
import identi.service.p471v1.models_workflow.p472v1.ContactSupport$ActionResponse;
import identi.service.p471v1.models_workflow.p472v1.ContactSupportDto7;
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

/* compiled from: ContactSupportDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006! \"#$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006&"}, m3636d2 = {"identi/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$Surrogate;)V", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$TypeDto;", "type", "(Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$TypeDto;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$Surrogate;", "Companion", "Surrogate", "TypeDto", "ProceedDto", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto, reason: use source file name */
/* loaded from: classes21.dex */
public final class ContactSupportDto7 implements Dto3<ContactSupport$ActionResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ContactSupportDto7> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ContactSupportDto7, ContactSupport$ActionResponse>> binaryBase64Serializer$delegate;
    private static final ContactSupportDto7 zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ContactSupportDto7(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ContactSupportDto7(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ContactSupportDto7(TypeDto typeDto) {
        TypeDto.Proceed proceed = typeDto instanceof TypeDto.Proceed ? (TypeDto.Proceed) typeDto : null;
        this(new Surrogate(proceed != null ? proceed.getValue() : null));
    }

    public /* synthetic */ ContactSupportDto7(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ContactSupport$ActionResponse toProto() {
        ProceedDto proceed = this.surrogate.getProceed();
        return new ContactSupport$ActionResponse(proceed != null ? proceed.toProto() : null, null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[ActionResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ContactSupportDto7) && Intrinsics.areEqual(((ContactSupportDto7) other).surrogate, this.surrogate);
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
    /* compiled from: ContactSupportDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$Surrogate;", "", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto;", "proceed", "<init>", "(Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto;", "getProceed", "()Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto;", "getProceed$annotations", "()V", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    /* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$Surrogate, reason: from toString */
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ProceedDto proceed;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((ProceedDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && Intrinsics.areEqual(this.proceed, ((Surrogate) other).proceed);
        }

        public int hashCode() {
            ProceedDto proceedDto = this.proceed;
            if (proceedDto == null) {
                return 0;
            }
            return proceedDto.hashCode();
        }

        public String toString() {
            return "Surrogate(proceed=" + this.proceed + ")";
        }

        /* compiled from: ContactSupportDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$Surrogate$Companion, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ContactSupportDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ProceedDto proceedDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.proceed = null;
            } else {
                this.proceed = proceedDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ProceedDto proceedDto = self.proceed;
            if (proceedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ProceedDto.Serializer.INSTANCE, proceedDto);
            }
        }

        public Surrogate(ProceedDto proceedDto) {
            this.proceed = proceedDto;
        }

        public /* synthetic */ Surrogate(ProceedDto proceedDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : proceedDto);
        }

        public final ProceedDto getProceed() {
            return this.proceed;
        }
    }

    /* compiled from: ContactSupportDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto;", "Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$Companion, reason: from kotlin metadata */
    public static final class Companion implements Dto3.Creator<ContactSupportDto7, ContactSupport$ActionResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ContactSupportDto7> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContactSupportDto7> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContactSupportDto7> getBinaryBase64Serializer() {
            return (KSerializer) ContactSupportDto7.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ContactSupport$ActionResponse> getProtoAdapter() {
            return ContactSupport$ActionResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContactSupportDto7 getZeroValue() {
            return ContactSupportDto7.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContactSupportDto7 fromProto(ContactSupport$ActionResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ContactSupport$ActionResponse.Proceed proceed = proto.getProceed();
            return new ContactSupportDto7(new Surrogate(proceed != null ? ProceedDto.INSTANCE.fromProto(proceed) : null), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContactSupportDto7.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ContactSupportDto7(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ContactSupportDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Proceed", "Companion", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$TypeDto$Proceed;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    /* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$TypeDto */
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

        /* compiled from: ContactSupportDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$TypeDto$Proceed;", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$TypeDto;", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$TypeDto$Proceed, reason: from toString */
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

        /* compiled from: ContactSupportDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$TypeDto;", "Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$TypeDto$Companion, reason: from kotlin metadata */
        /* loaded from: classes14.dex */
        public static final class Companion implements Dto4.Creator<TypeDto, ContactSupport$ActionResponse> {
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
            public ProtoAdapter<ContactSupport$ActionResponse> getProtoAdapter() {
                return ContactSupport$ActionResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(ContactSupport$ActionResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getProceed() != null) {
                    return new Proceed(ProceedDto.INSTANCE.fromProto(proto.getProceed()));
                }
                return null;
            }
        }
    }

    /* compiled from: ContactSupportDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 \u001f!\"B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006#"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto;", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse$Proceed;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto$Surrogate;)V", "", "exit_deeplink", "(Ljava/lang/String;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse$Proceed;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$ProceedDto */
    public static final class ProceedDto implements Dto3<ContactSupport$ActionResponse.Proceed>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ProceedDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ProceedDto, ContactSupport$ActionResponse.Proceed>> binaryBase64Serializer$delegate;
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

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ProceedDto(String exit_deeplink) {
            this(new Surrogate(exit_deeplink));
            Intrinsics.checkNotNullParameter(exit_deeplink, "exit_deeplink");
        }

        public /* synthetic */ ProceedDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public ContactSupport$ActionResponse.Proceed toProto() {
            return new ContactSupport$ActionResponse.Proceed(this.surrogate.getExit_deeplink(), null, 2, 0 == true ? 1 : 0);
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
        /* compiled from: ContactSupportDto.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015¨\u0006\""}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto$Surrogate;", "", "", "exit_deeplink", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExit_deeplink", "getExit_deeplink$annotations", "()V", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        /* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$ProceedDto$Surrogate, reason: from toString */
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String exit_deeplink;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.exit_deeplink, ((Surrogate) other).exit_deeplink);
            }

            public int hashCode() {
                return this.exit_deeplink.hashCode();
            }

            public String toString() {
                return "Surrogate(exit_deeplink=" + this.exit_deeplink + ")";
            }

            /* compiled from: ContactSupportDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$ProceedDto$Surrogate$Companion, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return ContactSupportDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.exit_deeplink = "";
                } else {
                    this.exit_deeplink = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (Intrinsics.areEqual(self.exit_deeplink, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 0, self.exit_deeplink);
            }

            public Surrogate(String exit_deeplink) {
                Intrinsics.checkNotNullParameter(exit_deeplink, "exit_deeplink");
                this.exit_deeplink = exit_deeplink;
            }

            public final String getExit_deeplink() {
                return this.exit_deeplink;
            }

            public /* synthetic */ Surrogate(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        /* compiled from: ContactSupportDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto;", "Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse$Proceed;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$ProceedDto$Companion, reason: from kotlin metadata */
        public static final class Companion implements Dto3.Creator<ProceedDto, ContactSupport$ActionResponse.Proceed> {
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
            public ProtoAdapter<ContactSupport$ActionResponse.Proceed> getProtoAdapter() {
                return ContactSupport$ActionResponse.Proceed.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProceedDto getZeroValue() {
                return ProceedDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProceedDto fromProto(ContactSupport$ActionResponse.Proceed proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new ProceedDto(new Surrogate(proto.getExit_deeplink()), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$ProceedDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ContactSupportDto7.ProceedDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ProceedDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ContactSupportDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$ProceedDto$Serializer */
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
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.ContactSupport.ActionResponse.Proceed", kSerializerSerializer.getDescriptor());
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

        /* compiled from: ContactSupportDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$ProceedDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$ProceedDto$MultibindingModule */
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$ProceedDto";
            }
        }
    }

    /* compiled from: ContactSupportDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$Serializer */
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<ContactSupportDto7> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.ContactSupport.ActionResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ContactSupportDto7 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ContactSupportDto7 deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ContactSupportDto7((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ContactSupportDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto$MultibindingModule */
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "identi.service.v1.models_workflow.v1.ContactSupportDto$ActionResponseDto";
        }
    }
}
