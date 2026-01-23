package bonfire.proto.idl.joint_accounts_onboarding.p035v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationCtaDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.FetchJointAccountCreatedResponse;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.FetchJointAccountCreatedResponseDto;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
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

/* compiled from: FetchJointAccountCreatedResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$Surrogate;)V", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto;", "view_model", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto;)V", "toProto", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$Surrogate;", "getView_model", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto;", "Companion", "Surrogate", "ViewModelDto", "Serializer", "MultibindingModule", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class FetchJointAccountCreatedResponseDto implements Dto3<FetchJointAccountCreatedResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FetchJointAccountCreatedResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FetchJointAccountCreatedResponseDto, FetchJointAccountCreatedResponse>> binaryBase64Serializer$delegate;
    private static final FetchJointAccountCreatedResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FetchJointAccountCreatedResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FetchJointAccountCreatedResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ViewModelDto getView_model() {
        return this.surrogate.getView_model();
    }

    public FetchJointAccountCreatedResponseDto(ViewModelDto viewModelDto) {
        this(new Surrogate(viewModelDto));
    }

    public /* synthetic */ FetchJointAccountCreatedResponseDto(ViewModelDto viewModelDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : viewModelDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FetchJointAccountCreatedResponse toProto() {
        ViewModelDto view_model = this.surrogate.getView_model();
        return new FetchJointAccountCreatedResponse(view_model != null ? view_model.toProto() : null, null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[FetchJointAccountCreatedResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FetchJointAccountCreatedResponseDto) && Intrinsics.areEqual(((FetchJointAccountCreatedResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: FetchJointAccountCreatedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$Surrogate;", "", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto;", "view_model", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_joint_accounts_onboarding_v1_externalRelease", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto;", "getView_model", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto;", "getView_model$annotations", "()V", "Companion", "$serializer", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ViewModelDto view_model;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((ViewModelDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && Intrinsics.areEqual(this.view_model, ((Surrogate) other).view_model);
        }

        public int hashCode() {
            ViewModelDto viewModelDto = this.view_model;
            if (viewModelDto == null) {
                return 0;
            }
            return viewModelDto.hashCode();
        }

        public String toString() {
            return "Surrogate(view_model=" + this.view_model + ")";
        }

        /* compiled from: FetchJointAccountCreatedResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$Surrogate;", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FetchJointAccountCreatedResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ViewModelDto viewModelDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.view_model = null;
            } else {
                this.view_model = viewModelDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_joint_accounts_onboarding_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ViewModelDto viewModelDto = self.view_model;
            if (viewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ViewModelDto.Serializer.INSTANCE, viewModelDto);
            }
        }

        public Surrogate(ViewModelDto viewModelDto) {
            this.view_model = viewModelDto;
        }

        public /* synthetic */ Surrogate(ViewModelDto viewModelDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : viewModelDto);
        }

        public final ViewModelDto getView_model() {
            return this.view_model;
        }
    }

    /* compiled from: FetchJointAccountCreatedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FetchJointAccountCreatedResponseDto, FetchJointAccountCreatedResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FetchJointAccountCreatedResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FetchJointAccountCreatedResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FetchJointAccountCreatedResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) FetchJointAccountCreatedResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FetchJointAccountCreatedResponse> getProtoAdapter() {
            return FetchJointAccountCreatedResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FetchJointAccountCreatedResponseDto getZeroValue() {
            return FetchJointAccountCreatedResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FetchJointAccountCreatedResponseDto fromProto(FetchJointAccountCreatedResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            FetchJointAccountCreatedResponse.ViewModel view_model = proto.getView_model();
            return new FetchJointAccountCreatedResponseDto(new Surrogate(view_model != null ? ViewModelDto.INSTANCE.fromProto(view_model) : null), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.FetchJointAccountCreatedResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FetchJointAccountCreatedResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FetchJointAccountCreatedResponseDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FetchJointAccountCreatedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0013R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponse$ViewModel;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto$Surrogate;)V", "", "hero_url", "title_text", "body_text", "cta_deeplink", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", AccountOverviewOptionsSettingCard4.CTA, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;)V", "toProto", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponse$ViewModel;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto$Surrogate;", "getHero_url", "getTitle_text", "getBody_text", "getCta_deeplink", "getCta", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ViewModelDto implements Dto3<FetchJointAccountCreatedResponse.ViewModel>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ViewModelDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ViewModelDto, FetchJointAccountCreatedResponse.ViewModel>> binaryBase64Serializer$delegate;
        private static final ViewModelDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ViewModelDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ViewModelDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getHero_url() {
            return this.surrogate.getHero_url();
        }

        public final String getTitle_text() {
            return this.surrogate.getTitle_text();
        }

        public final String getBody_text() {
            return this.surrogate.getBody_text();
        }

        public final String getCta_deeplink() {
            return this.surrogate.getCta_deeplink();
        }

        public final AccountCreationCtaDto getCta() {
            return this.surrogate.getCta();
        }

        public /* synthetic */ ViewModelDto(String str, String str2, String str3, String str4, AccountCreationCtaDto accountCreationCtaDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : accountCreationCtaDto);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ViewModelDto(String hero_url, String title_text, String body_text, String cta_deeplink, AccountCreationCtaDto accountCreationCtaDto) {
            this(new Surrogate(hero_url, title_text, body_text, cta_deeplink, accountCreationCtaDto));
            Intrinsics.checkNotNullParameter(hero_url, "hero_url");
            Intrinsics.checkNotNullParameter(title_text, "title_text");
            Intrinsics.checkNotNullParameter(body_text, "body_text");
            Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
        }

        @Override // com.robinhood.idl.Dto
        public FetchJointAccountCreatedResponse.ViewModel toProto() {
            String hero_url = this.surrogate.getHero_url();
            String title_text = this.surrogate.getTitle_text();
            String body_text = this.surrogate.getBody_text();
            String cta_deeplink = this.surrogate.getCta_deeplink();
            AccountCreationCtaDto cta = this.surrogate.getCta();
            return new FetchJointAccountCreatedResponse.ViewModel(hero_url, title_text, body_text, cta_deeplink, cta != null ? cta.toProto() : null, null, 32, null);
        }

        public String toString() {
            return "[ViewModelDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ViewModelDto) && Intrinsics.areEqual(((ViewModelDto) other).surrogate, this.surrogate);
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
        /* compiled from: FetchJointAccountCreatedResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010$\u001a\u0004\b,\u0010-¨\u00061"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto$Surrogate;", "", "", "hero_url", "title_text", "body_text", "cta_deeplink", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", AccountOverviewOptionsSettingCard4.CTA, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_joint_accounts_onboarding_v1_externalRelease", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHero_url", "getHero_url$annotations", "()V", "getTitle_text", "getTitle_text$annotations", "getBody_text", "getBody_text$annotations", "getCta_deeplink", "getCta_deeplink$annotations", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", "getCta", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", "getCta$annotations", "Companion", "$serializer", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String body_text;
            private final AccountCreationCtaDto cta;
            private final String cta_deeplink;
            private final String hero_url;
            private final String title_text;

            public Surrogate() {
                this((String) null, (String) null, (String) null, (String) null, (AccountCreationCtaDto) null, 31, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.hero_url, surrogate.hero_url) && Intrinsics.areEqual(this.title_text, surrogate.title_text) && Intrinsics.areEqual(this.body_text, surrogate.body_text) && Intrinsics.areEqual(this.cta_deeplink, surrogate.cta_deeplink) && Intrinsics.areEqual(this.cta, surrogate.cta);
            }

            public int hashCode() {
                int iHashCode = ((((((this.hero_url.hashCode() * 31) + this.title_text.hashCode()) * 31) + this.body_text.hashCode()) * 31) + this.cta_deeplink.hashCode()) * 31;
                AccountCreationCtaDto accountCreationCtaDto = this.cta;
                return iHashCode + (accountCreationCtaDto == null ? 0 : accountCreationCtaDto.hashCode());
            }

            public String toString() {
                return "Surrogate(hero_url=" + this.hero_url + ", title_text=" + this.title_text + ", body_text=" + this.body_text + ", cta_deeplink=" + this.cta_deeplink + ", cta=" + this.cta + ")";
            }

            /* compiled from: FetchJointAccountCreatedResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto$Surrogate;", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return FetchJointAccountCreatedResponseDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, AccountCreationCtaDto accountCreationCtaDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.hero_url = "";
                } else {
                    this.hero_url = str;
                }
                if ((i & 2) == 0) {
                    this.title_text = "";
                } else {
                    this.title_text = str2;
                }
                if ((i & 4) == 0) {
                    this.body_text = "";
                } else {
                    this.body_text = str3;
                }
                if ((i & 8) == 0) {
                    this.cta_deeplink = "";
                } else {
                    this.cta_deeplink = str4;
                }
                if ((i & 16) == 0) {
                    this.cta = null;
                } else {
                    this.cta = accountCreationCtaDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$bonfire_joint_accounts_onboarding_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.hero_url, "")) {
                    output.encodeStringElement(serialDesc, 0, self.hero_url);
                }
                if (!Intrinsics.areEqual(self.title_text, "")) {
                    output.encodeStringElement(serialDesc, 1, self.title_text);
                }
                if (!Intrinsics.areEqual(self.body_text, "")) {
                    output.encodeStringElement(serialDesc, 2, self.body_text);
                }
                if (!Intrinsics.areEqual(self.cta_deeplink, "")) {
                    output.encodeStringElement(serialDesc, 3, self.cta_deeplink);
                }
                AccountCreationCtaDto accountCreationCtaDto = self.cta;
                if (accountCreationCtaDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, AccountCreationCtaDto.Serializer.INSTANCE, accountCreationCtaDto);
                }
            }

            public Surrogate(String hero_url, String title_text, String body_text, String cta_deeplink, AccountCreationCtaDto accountCreationCtaDto) {
                Intrinsics.checkNotNullParameter(hero_url, "hero_url");
                Intrinsics.checkNotNullParameter(title_text, "title_text");
                Intrinsics.checkNotNullParameter(body_text, "body_text");
                Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
                this.hero_url = hero_url;
                this.title_text = title_text;
                this.body_text = body_text;
                this.cta_deeplink = cta_deeplink;
                this.cta = accountCreationCtaDto;
            }

            public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, AccountCreationCtaDto accountCreationCtaDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : accountCreationCtaDto);
            }

            public final String getHero_url() {
                return this.hero_url;
            }

            public final String getTitle_text() {
                return this.title_text;
            }

            public final String getBody_text() {
                return this.body_text;
            }

            public final String getCta_deeplink() {
                return this.cta_deeplink;
            }

            public final AccountCreationCtaDto getCta() {
                return this.cta;
            }
        }

        /* compiled from: FetchJointAccountCreatedResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponse$ViewModel;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<ViewModelDto, FetchJointAccountCreatedResponse.ViewModel> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ViewModelDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ViewModelDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ViewModelDto> getBinaryBase64Serializer() {
                return (KSerializer) ViewModelDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FetchJointAccountCreatedResponse.ViewModel> getProtoAdapter() {
                return FetchJointAccountCreatedResponse.ViewModel.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ViewModelDto getZeroValue() {
                return ViewModelDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ViewModelDto fromProto(FetchJointAccountCreatedResponse.ViewModel proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String hero_url = proto.getHero_url();
                String title_text = proto.getTitle_text();
                String body_text = proto.getBody_text();
                String cta_deeplink = proto.getCta_deeplink();
                AccountCreationCta cta = proto.getCta();
                return new ViewModelDto(new Surrogate(hero_url, title_text, body_text, cta_deeplink, cta != null ? AccountCreationCtaDto.INSTANCE.fromProto(cta) : null), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.FetchJointAccountCreatedResponseDto$ViewModelDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FetchJointAccountCreatedResponseDto.ViewModelDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ViewModelDto(null, null, null, null, null, 31, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FetchJointAccountCreatedResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public static final class Serializer implements KSerializer<ViewModelDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.joint_accounts_onboarding.v1.FetchJointAccountCreatedResponse.ViewModel", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ViewModelDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ViewModelDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ViewModelDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: FetchJointAccountCreatedResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$ViewModelDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4185_1)
            public final String provideIntoMap() {
                return "bonfire.proto.idl.joint_accounts_onboarding.v1.FetchJointAccountCreatedResponseDto$ViewModelDto";
            }
        }
    }

    /* compiled from: FetchJointAccountCreatedResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<FetchJointAccountCreatedResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.joint_accounts_onboarding.v1.FetchJointAccountCreatedResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FetchJointAccountCreatedResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FetchJointAccountCreatedResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FetchJointAccountCreatedResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FetchJointAccountCreatedResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.joint_accounts_onboarding.v1.FetchJointAccountCreatedResponseDto";
        }
    }
}
