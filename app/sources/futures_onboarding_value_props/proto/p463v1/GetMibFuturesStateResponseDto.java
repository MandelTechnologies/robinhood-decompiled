package futures_onboarding_value_props.proto.p463v1;

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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: GetMibFuturesStateResponseDto.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006$"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponse;", "Landroid/os/Parcelable;", "Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto$Surrogate;", "surrogate", "<init>", "(Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto$Surrogate;)V", "", "has_multiple_rhs_accounts", "", "futures_allowed_rhs_account_display_name", "(ZLjava/lang/String;)V", "toProto", "()Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class GetMibFuturesStateResponseDto implements Dto3<GetMibFuturesStateResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetMibFuturesStateResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetMibFuturesStateResponseDto, GetMibFuturesStateResponse>> binaryBase64Serializer$delegate;
    private static final GetMibFuturesStateResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetMibFuturesStateResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetMibFuturesStateResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetMibFuturesStateResponseDto(boolean z, String futures_allowed_rhs_account_display_name) {
        this(new Surrogate(z, futures_allowed_rhs_account_display_name));
        Intrinsics.checkNotNullParameter(futures_allowed_rhs_account_display_name, "futures_allowed_rhs_account_display_name");
    }

    public /* synthetic */ GetMibFuturesStateResponseDto(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }

    @Override // com.robinhood.idl.Dto
    public GetMibFuturesStateResponse toProto() {
        return new GetMibFuturesStateResponse(this.surrogate.getHas_multiple_rhs_accounts(), this.surrogate.getFutures_allowed_rhs_account_display_name(), null, 4, null);
    }

    public String toString() {
        return "[GetMibFuturesStateResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetMibFuturesStateResponseDto) && Intrinsics.areEqual(((GetMibFuturesStateResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetMibFuturesStateResponseDto.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u0017¨\u0006'"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto$Surrogate;", "", "", "has_multiple_rhs_accounts", "", "futures_allowed_rhs_account_display_name", "<init>", "(ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$futures_onboarding_value_props_proto_v1_externalRelease", "(Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHas_multiple_rhs_accounts", "()Z", "getHas_multiple_rhs_accounts$annotations", "()V", "Ljava/lang/String;", "getFutures_allowed_rhs_account_display_name", "getFutures_allowed_rhs_account_display_name$annotations", "Companion", "$serializer", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String futures_allowed_rhs_account_display_name;
        private final boolean has_multiple_rhs_accounts;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this(false, (String) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.has_multiple_rhs_accounts == surrogate.has_multiple_rhs_accounts && Intrinsics.areEqual(this.futures_allowed_rhs_account_display_name, surrogate.futures_allowed_rhs_account_display_name);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.has_multiple_rhs_accounts) * 31) + this.futures_allowed_rhs_account_display_name.hashCode();
        }

        public String toString() {
            return "Surrogate(has_multiple_rhs_accounts=" + this.has_multiple_rhs_accounts + ", futures_allowed_rhs_account_display_name=" + this.futures_allowed_rhs_account_display_name + ")";
        }

        /* compiled from: GetMibFuturesStateResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto$Surrogate;", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetMibFuturesStateResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.has_multiple_rhs_accounts = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.futures_allowed_rhs_account_display_name = "";
            } else {
                this.futures_allowed_rhs_account_display_name = str;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$futures_onboarding_value_props_proto_v1_externalRelease */
        public static final /* synthetic */ void m3284x9ef7d20e(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.has_multiple_rhs_accounts;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            if (Intrinsics.areEqual(self.futures_allowed_rhs_account_display_name, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 1, self.futures_allowed_rhs_account_display_name);
        }

        public Surrogate(boolean z, String futures_allowed_rhs_account_display_name) {
            Intrinsics.checkNotNullParameter(futures_allowed_rhs_account_display_name, "futures_allowed_rhs_account_display_name");
            this.has_multiple_rhs_accounts = z;
            this.futures_allowed_rhs_account_display_name = futures_allowed_rhs_account_display_name;
        }

        public final boolean getHas_multiple_rhs_accounts() {
            return this.has_multiple_rhs_accounts;
        }

        public final String getFutures_allowed_rhs_account_display_name() {
            return this.futures_allowed_rhs_account_display_name;
        }

        public /* synthetic */ Surrogate(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
        }
    }

    /* compiled from: GetMibFuturesStateResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto;", "Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetMibFuturesStateResponseDto, GetMibFuturesStateResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetMibFuturesStateResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMibFuturesStateResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMibFuturesStateResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetMibFuturesStateResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetMibFuturesStateResponse> getProtoAdapter() {
            return GetMibFuturesStateResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMibFuturesStateResponseDto getZeroValue() {
            return GetMibFuturesStateResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMibFuturesStateResponseDto fromProto(GetMibFuturesStateResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetMibFuturesStateResponseDto(new Surrogate(proto.getHas_multiple_rhs_accounts(), proto.getFutures_allowed_rhs_account_display_name()), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: futures_onboarding_value_props.proto.v1.GetMibFuturesStateResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetMibFuturesStateResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetMibFuturesStateResponseDto(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetMibFuturesStateResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto;", "<init>", "()V", "surrogateSerializer", "Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetMibFuturesStateResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/futures_onboarding_value_props.proto.v1.GetMibFuturesStateResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetMibFuturesStateResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetMibFuturesStateResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetMibFuturesStateResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: GetMibFuturesStateResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "futures_onboarding_value_props.proto.v1.GetMibFuturesStateResponseDto";
        }
    }
}
