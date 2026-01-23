package contracts.crypto.trade.proto.p431v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderResponse;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderResponseDto;
import java.lang.annotation.Annotation;
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
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rh_server_driven_ui.p531v1.Alert;
import rh_server_driven_ui.p531v1.AlertDto;
import rh_server_driven_ui.p531v1.Button;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.DeepLinkAction;
import rh_server_driven_ui.p531v1.DeepLinkActionDto;

/* compiled from: ValidateCryptoOrderResponseDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007%$&'()*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010#\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006+"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$TypeDto;", "type", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$TypeDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$Surrogate;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;", "getMobile", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;", "mobile", "Companion", "Surrogate", "TypeDto", "MobileDto", "WebDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class ValidateCryptoOrderResponseDto implements Dto3<ValidateCryptoOrderResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ValidateCryptoOrderResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ValidateCryptoOrderResponseDto, ValidateCryptoOrderResponse>> binaryBase64Serializer$delegate;
    private static final ValidateCryptoOrderResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ValidateCryptoOrderResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ValidateCryptoOrderResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MobileDto getMobile() {
        return this.surrogate.getMobile();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ValidateCryptoOrderResponseDto(TypeDto typeDto) {
        TypeDto.Mobile mobile = typeDto instanceof TypeDto.Mobile ? (TypeDto.Mobile) typeDto : null;
        MobileDto value = mobile != null ? mobile.getValue() : null;
        TypeDto.Web web = typeDto instanceof TypeDto.Web ? (TypeDto.Web) typeDto : null;
        this(new Surrogate(value, web != null ? web.getValue() : null));
    }

    public /* synthetic */ ValidateCryptoOrderResponseDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeDto);
    }

    @Override // com.robinhood.idl.Dto
    public ValidateCryptoOrderResponse toProto() {
        MobileDto mobile = this.surrogate.getMobile();
        ValidateCryptoOrderResponse.Mobile proto = mobile != null ? mobile.toProto() : null;
        WebDto web = this.surrogate.getWeb();
        return new ValidateCryptoOrderResponse(proto, web != null ? web.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[ValidateCryptoOrderResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ValidateCryptoOrderResponseDto) && Intrinsics.areEqual(((ValidateCryptoOrderResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: ValidateCryptoOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;", "mobile", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto;", "web", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;", "getMobile", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;", "getMobile$annotations", "()V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto;", "getWeb", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto;", "getWeb$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MobileDto mobile;
        private final WebDto web;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((MobileDto) null, (WebDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.mobile, surrogate.mobile) && Intrinsics.areEqual(this.web, surrogate.web);
        }

        public int hashCode() {
            MobileDto mobileDto = this.mobile;
            int iHashCode = (mobileDto == null ? 0 : mobileDto.hashCode()) * 31;
            WebDto webDto = this.web;
            return iHashCode + (webDto != null ? webDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(mobile=" + this.mobile + ", web=" + this.web + ")";
        }

        /* compiled from: ValidateCryptoOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ValidateCryptoOrderResponseDto$Surrogate$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MobileDto mobileDto, WebDto webDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.mobile = null;
            } else {
                this.mobile = mobileDto;
            }
            if ((i & 2) == 0) {
                this.web = null;
            } else {
                this.web = webDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MobileDto mobileDto = self.mobile;
            if (mobileDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MobileDto.Serializer.INSTANCE, mobileDto);
            }
            WebDto webDto = self.web;
            if (webDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WebDto.Serializer.INSTANCE, webDto);
            }
        }

        public Surrogate(MobileDto mobileDto, WebDto webDto) {
            this.mobile = mobileDto;
            this.web = webDto;
        }

        public /* synthetic */ Surrogate(MobileDto mobileDto, WebDto webDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : mobileDto, (i & 2) != 0 ? null : webDto);
        }

        public final MobileDto getMobile() {
            return this.mobile;
        }

        public final WebDto getWeb() {
            return this.web;
        }
    }

    /* compiled from: ValidateCryptoOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ValidateCryptoOrderResponseDto, ValidateCryptoOrderResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ValidateCryptoOrderResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValidateCryptoOrderResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValidateCryptoOrderResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) ValidateCryptoOrderResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ValidateCryptoOrderResponse> getProtoAdapter() {
            return ValidateCryptoOrderResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValidateCryptoOrderResponseDto getZeroValue() {
            return ValidateCryptoOrderResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValidateCryptoOrderResponseDto fromProto(ValidateCryptoOrderResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ValidateCryptoOrderResponse.Mobile mobile = proto.getMobile();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MobileDto mobileDtoFromProto = mobile != null ? MobileDto.INSTANCE.fromProto(mobile) : null;
            ValidateCryptoOrderResponse.Web web = proto.getWeb();
            return new ValidateCryptoOrderResponseDto(new Surrogate(mobileDtoFromProto, web != null ? WebDto.INSTANCE.fromProto(web) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ValidateCryptoOrderResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ValidateCryptoOrderResponseDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ValidateCryptoOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Mobile", "Web", "Companion", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$TypeDto$Mobile;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$TypeDto$Web;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

        /* compiled from: ValidateCryptoOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$TypeDto$Mobile;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Mobile extends TypeDto {
            private final MobileDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Mobile) && Intrinsics.areEqual(this.value, ((Mobile) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Mobile(value=" + this.value + ")";
            }

            public final MobileDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Mobile(MobileDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateCryptoOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$TypeDto$Web;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Web extends TypeDto {
            private final WebDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Web) && Intrinsics.areEqual(this.value, ((Web) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Web(value=" + this.value + ")";
            }

            public final WebDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Web(WebDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateCryptoOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<TypeDto, ValidateCryptoOrderResponse> {
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
            public ProtoAdapter<ValidateCryptoOrderResponse> getProtoAdapter() {
                return ValidateCryptoOrderResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(ValidateCryptoOrderResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getMobile() != null) {
                    return new Mobile(MobileDto.INSTANCE.fromProto(proto.getMobile()));
                }
                if (proto.getWeb() != null) {
                    return new Web(WebDto.INSTANCE.fromProto(proto.getWeb()));
                }
                return null;
            }
        }
    }

    /* compiled from: ValidateCryptoOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$Surrogate;)V", "Lrh_server_driven_ui/v1/AlertDto;", "alert", "(Lrh_server_driven_ui/v1/AlertDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$Surrogate;", "getAlert", "()Lrh_server_driven_ui/v1/AlertDto;", "Companion", "Surrogate", "ActionDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class MobileDto implements Dto3<ValidateCryptoOrderResponse.Mobile>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<MobileDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<MobileDto, ValidateCryptoOrderResponse.Mobile>> binaryBase64Serializer$delegate;
        private static final MobileDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ MobileDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private MobileDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final AlertDto getAlert() {
            return this.surrogate.getAlert();
        }

        public MobileDto(AlertDto alertDto) {
            this(new Surrogate(alertDto));
        }

        public /* synthetic */ MobileDto(AlertDto alertDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : alertDto);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public ValidateCryptoOrderResponse.Mobile toProto() {
            AlertDto alert = this.surrogate.getAlert();
            return new ValidateCryptoOrderResponse.Mobile(alert != null ? alert.toProto() : null, null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[MobileDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof MobileDto) && Intrinsics.areEqual(((MobileDto) other).surrogate, this.surrogate);
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
        /* compiled from: ValidateCryptoOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$Surrogate;", "", "Lrh_server_driven_ui/v1/AlertDto;", "alert", "<init>", "(Lrh_server_driven_ui/v1/AlertDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/AlertDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/AlertDto;", "getAlert", "()Lrh_server_driven_ui/v1/AlertDto;", "getAlert$annotations", "()V", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final AlertDto alert;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((AlertDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.alert, ((Surrogate) other).alert);
            }

            public int hashCode() {
                AlertDto alertDto = this.alert;
                if (alertDto == null) {
                    return 0;
                }
                return alertDto.hashCode();
            }

            public String toString() {
                return "Surrogate(alert=" + this.alert + ")";
            }

            /* compiled from: ValidateCryptoOrderResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return ValidateCryptoOrderResponseDto$MobileDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, AlertDto alertDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.alert = null;
                } else {
                    this.alert = alertDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                AlertDto alertDto = self.alert;
                if (alertDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, AlertDto.Serializer.INSTANCE, alertDto);
                }
            }

            public Surrogate(AlertDto alertDto) {
                this.alert = alertDto;
            }

            public /* synthetic */ Surrogate(AlertDto alertDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : alertDto);
            }

            public final AlertDto getAlert() {
                return this.alert;
            }
        }

        /* compiled from: ValidateCryptoOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<MobileDto, ValidateCryptoOrderResponse.Mobile> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MobileDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MobileDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MobileDto> getBinaryBase64Serializer() {
                return (KSerializer) MobileDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ValidateCryptoOrderResponse.Mobile> getProtoAdapter() {
                return ValidateCryptoOrderResponse.Mobile.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MobileDto getZeroValue() {
                return MobileDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MobileDto fromProto(ValidateCryptoOrderResponse.Mobile proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                Alert alert = proto.getAlert();
                return new MobileDto(new Surrogate(alert != null ? AlertDto.INSTANCE.fromProto(alert) : null), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ValidateCryptoOrderResponseDto.MobileDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new MobileDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ValidateCryptoOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b#\"$%&'()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006*"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$TypeDto;", "type", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$TypeDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$Surrogate;", "getType", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$TypeDto;", "Companion", "Surrogate", "TypeDto", "DismissDto", "AcknowledgeAndContinueDto", "SideEffectDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class ActionDto implements Dto3<ValidateCryptoOrderResponse.Mobile.Action>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<ActionDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<ActionDto, ValidateCryptoOrderResponse.Mobile.Action>> binaryBase64Serializer$delegate;
            private static final ActionDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ ActionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private ActionDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final TypeDto getType() {
                if (this.surrogate.getDismiss() != null) {
                    return new TypeDto.Dismiss(this.surrogate.getDismiss());
                }
                if (this.surrogate.getAcknowledge_and_continue() != null) {
                    return new TypeDto.AcknowledgeAndContinue(this.surrogate.getAcknowledge_and_continue());
                }
                return null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public ActionDto(TypeDto typeDto) {
                TypeDto.Dismiss dismiss = typeDto instanceof TypeDto.Dismiss ? (TypeDto.Dismiss) typeDto : null;
                DismissDto value = dismiss != null ? dismiss.getValue() : null;
                TypeDto.AcknowledgeAndContinue acknowledgeAndContinue = typeDto instanceof TypeDto.AcknowledgeAndContinue ? (TypeDto.AcknowledgeAndContinue) typeDto : null;
                this(new Surrogate(value, acknowledgeAndContinue != null ? acknowledgeAndContinue.getValue() : null));
            }

            public /* synthetic */ ActionDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : typeDto);
            }

            @Override // com.robinhood.idl.Dto
            public ValidateCryptoOrderResponse.Mobile.Action toProto() {
                DismissDto dismiss = this.surrogate.getDismiss();
                ValidateCryptoOrderResponse.Mobile.Action.Dismiss proto = dismiss != null ? dismiss.toProto() : null;
                AcknowledgeAndContinueDto acknowledge_and_continue = this.surrogate.getAcknowledge_and_continue();
                return new ValidateCryptoOrderResponse.Mobile.Action(proto, acknowledge_and_continue != null ? acknowledge_and_continue.toProto() : null, null, 4, null);
            }

            public String toString() {
                return "[ActionDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof ActionDto) && Intrinsics.areEqual(((ActionDto) other).surrogate, this.surrogate);
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
            /* compiled from: ValidateCryptoOrderResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto;", "dismiss", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto;", "acknowledge_and_continue", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto;", "getDismiss", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto;", "getDismiss$annotations", "()V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto;", "getAcknowledge_and_continue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto;", "getAcknowledge_and_continue$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final AcknowledgeAndContinueDto acknowledge_and_continue;
                private final DismissDto dismiss;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((DismissDto) null, (AcknowledgeAndContinueDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.dismiss, surrogate.dismiss) && Intrinsics.areEqual(this.acknowledge_and_continue, surrogate.acknowledge_and_continue);
                }

                public int hashCode() {
                    DismissDto dismissDto = this.dismiss;
                    int iHashCode = (dismissDto == null ? 0 : dismissDto.hashCode()) * 31;
                    AcknowledgeAndContinueDto acknowledgeAndContinueDto = this.acknowledge_and_continue;
                    return iHashCode + (acknowledgeAndContinueDto != null ? acknowledgeAndContinueDto.hashCode() : 0);
                }

                public String toString() {
                    return "Surrogate(dismiss=" + this.dismiss + ", acknowledge_and_continue=" + this.acknowledge_and_continue + ")";
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C44103xab244c2b.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, DismissDto dismissDto, AcknowledgeAndContinueDto acknowledgeAndContinueDto, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.dismiss = null;
                    } else {
                        this.dismiss = dismissDto;
                    }
                    if ((i & 2) == 0) {
                        this.acknowledge_and_continue = null;
                    } else {
                        this.acknowledge_and_continue = acknowledgeAndContinueDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    DismissDto dismissDto = self.dismiss;
                    if (dismissDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, DismissDto.Serializer.INSTANCE, dismissDto);
                    }
                    AcknowledgeAndContinueDto acknowledgeAndContinueDto = self.acknowledge_and_continue;
                    if (acknowledgeAndContinueDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, AcknowledgeAndContinueDto.Serializer.INSTANCE, acknowledgeAndContinueDto);
                    }
                }

                public Surrogate(DismissDto dismissDto, AcknowledgeAndContinueDto acknowledgeAndContinueDto) {
                    this.dismiss = dismissDto;
                    this.acknowledge_and_continue = acknowledgeAndContinueDto;
                }

                public /* synthetic */ Surrogate(DismissDto dismissDto, AcknowledgeAndContinueDto acknowledgeAndContinueDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : dismissDto, (i & 2) != 0 ? null : acknowledgeAndContinueDto);
                }

                public final DismissDto getDismiss() {
                    return this.dismiss;
                }

                public final AcknowledgeAndContinueDto getAcknowledge_and_continue() {
                    return this.acknowledge_and_continue;
                }
            }

            /* compiled from: ValidateCryptoOrderResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<ActionDto, ValidateCryptoOrderResponse.Mobile.Action> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ActionDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ActionDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ActionDto> getBinaryBase64Serializer() {
                    return (KSerializer) ActionDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<ValidateCryptoOrderResponse.Mobile.Action> getProtoAdapter() {
                    return ValidateCryptoOrderResponse.Mobile.Action.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ActionDto getZeroValue() {
                    return ActionDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ActionDto fromProto(ValidateCryptoOrderResponse.Mobile.Action proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    ValidateCryptoOrderResponse.Mobile.Action.Dismiss dismiss = proto.getDismiss();
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    DismissDto dismissDtoFromProto = dismiss != null ? DismissDto.INSTANCE.fromProto(dismiss) : null;
                    ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue acknowledge_and_continue = proto.getAcknowledge_and_continue();
                    return new ActionDto(new Surrogate(dismissDtoFromProto, acknowledge_and_continue != null ? AcknowledgeAndContinueDto.INSTANCE.fromProto(acknowledge_and_continue) : null), defaultConstructorMarker);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new ActionDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: ValidateCryptoOrderResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", BentoAlertSheet6.button2Title, "AcknowledgeAndContinue", "Companion", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$TypeDto$AcknowledgeAndContinue;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$TypeDto$Dismiss;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$TypeDto$Dismiss;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class Dismiss extends TypeDto {
                    private final DismissDto value;

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Dismiss) && Intrinsics.areEqual(this.value, ((Dismiss) other).value);
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "Dismiss(value=" + this.value + ")";
                    }

                    public final DismissDto getValue() {
                        return this.value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Dismiss(DismissDto value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$TypeDto$AcknowledgeAndContinue;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class AcknowledgeAndContinue extends TypeDto {
                    private final AcknowledgeAndContinueDto value;

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof AcknowledgeAndContinue) && Intrinsics.areEqual(this.value, ((AcknowledgeAndContinue) other).value);
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "AcknowledgeAndContinue(value=" + this.value + ")";
                    }

                    public final AcknowledgeAndContinueDto getValue() {
                        return this.value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AcknowledgeAndContinue(AcknowledgeAndContinueDto value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto4.Creator<TypeDto, ValidateCryptoOrderResponse.Mobile.Action> {
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
                    public ProtoAdapter<ValidateCryptoOrderResponse.Mobile.Action> getProtoAdapter() {
                        return ValidateCryptoOrderResponse.Mobile.Action.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public TypeDto fromProto(ValidateCryptoOrderResponse.Mobile.Action proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        if (proto.getDismiss() != null) {
                            return new Dismiss(DismissDto.INSTANCE.fromProto(proto.getDismiss()));
                        }
                        if (proto.getAcknowledge_and_continue() != null) {
                            return new AcknowledgeAndContinue(AcknowledgeAndContinueDto.INSTANCE.fromProto(proto.getAcknowledge_and_continue()));
                        }
                        return null;
                    }
                }
            }

            /* compiled from: ValidateCryptoOrderResponseDto.kt */
            @Serializable(with = Serializer.class)
            @RhGenerated
            @SourceDebugExtension
            @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$#%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$Dismiss;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto$Surrogate;)V", "", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto;", "side_effects", "(Ljava/util/List;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$Dismiss;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto$Surrogate;", "getSide_effects", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class DismissDto implements Dto3<ValidateCryptoOrderResponse.Mobile.Action.Dismiss>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<DismissDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<DismissDto, ValidateCryptoOrderResponse.Mobile.Action.Dismiss>> binaryBase64Serializer$delegate;
                private static final DismissDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ DismissDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private DismissDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public final List<SideEffectDto> getSide_effects() {
                    return this.surrogate.getSide_effects();
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public DismissDto(List<SideEffectDto> side_effects) {
                    this(new Surrogate(side_effects));
                    Intrinsics.checkNotNullParameter(side_effects, "side_effects");
                }

                public /* synthetic */ DismissDto(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((List<SideEffectDto>) ((i & 1) != 0 ? CollectionsKt.emptyList() : list));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.robinhood.idl.Dto
                public ValidateCryptoOrderResponse.Mobile.Action.Dismiss toProto() {
                    List<SideEffectDto> side_effects = this.surrogate.getSide_effects();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(side_effects, 10));
                    Iterator<T> it = side_effects.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((SideEffectDto) it.next()).toProto());
                    }
                    return new ValidateCryptoOrderResponse.Mobile.Action.Dismiss(arrayList, null, 2, 0 == true ? 1 : 0);
                }

                public String toString() {
                    return "[DismissDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof DismissDto) && Intrinsics.areEqual(((DismissDto) other).surrogate, this.surrogate);
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
                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto$Surrogate;", "", "", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto;", "side_effects", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSide_effects", "()Ljava/util/List;", "getSide_effects$annotations", "()V", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {
                    private final List<SideEffectDto> side_effects;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);

                    @JvmField
                    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto$Surrogate$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.DismissDto.Surrogate._childSerializers$_anonymous_();
                        }
                    })};

                    /* JADX WARN: Multi-variable type inference failed */
                    public Surrogate() {
                        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                        return new ArrayListSerializer(SideEffectDto.Serializer.INSTANCE);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Surrogate) && Intrinsics.areEqual(this.side_effects, ((Surrogate) other).side_effects);
                    }

                    public int hashCode() {
                        return this.side_effects.hashCode();
                    }

                    public String toString() {
                        return "Surrogate(side_effects=" + this.side_effects + ")";
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C44088xa50fa7a.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.side_effects = CollectionsKt.emptyList();
                        } else {
                            this.side_effects = list;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                        if (Intrinsics.areEqual(self.side_effects, CollectionsKt.emptyList())) {
                            return;
                        }
                        output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.side_effects);
                    }

                    public Surrogate(List<SideEffectDto> side_effects) {
                        Intrinsics.checkNotNullParameter(side_effects, "side_effects");
                        this.side_effects = side_effects;
                    }

                    public final List<SideEffectDto> getSide_effects() {
                        return this.side_effects;
                    }

                    public /* synthetic */ Surrogate(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$Dismiss;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                public static final class Companion implements Dto3.Creator<DismissDto, ValidateCryptoOrderResponse.Mobile.Action.Dismiss> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<DismissDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<DismissDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<DismissDto> getBinaryBase64Serializer() {
                        return (KSerializer) DismissDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<ValidateCryptoOrderResponse.Mobile.Action.Dismiss> getProtoAdapter() {
                        return ValidateCryptoOrderResponse.Mobile.Action.Dismiss.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public DismissDto getZeroValue() {
                        return DismissDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public DismissDto fromProto(ValidateCryptoOrderResponse.Mobile.Action.Dismiss proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        List<ValidateCryptoOrderResponse.Mobile.Action.SideEffect> side_effects = proto.getSide_effects();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(side_effects, 10));
                        Iterator<T> it = side_effects.iterator();
                        while (it.hasNext()) {
                            arrayList.add(SideEffectDto.INSTANCE.fromProto((ValidateCryptoOrderResponse.Mobile.Action.SideEffect) it.next()));
                        }
                        return new DismissDto(new Surrogate(arrayList), null);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.DismissDto.binaryBase64Serializer_delegate$lambda$1();
                        }
                    });
                    zeroValue = new DismissDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<DismissDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse.Mobile.Action.Dismiss", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, DismissDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public DismissDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new DismissDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4190_6)
                    public final String provideIntoMap() {
                        return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$DismissDto";
                    }
                }
            }

            /* compiled from: ValidateCryptoOrderResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000e¨\u0006$"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$AcknowledgeAndContinue;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto$Surrogate;)V", "", "acknowledge_id", "(Ljava/lang/String;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$AcknowledgeAndContinue;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto$Surrogate;", "getAcknowledge_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class AcknowledgeAndContinueDto implements Dto3<ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<AcknowledgeAndContinueDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<AcknowledgeAndContinueDto, ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue>> binaryBase64Serializer$delegate;
                private static final AcknowledgeAndContinueDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ AcknowledgeAndContinueDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private AcknowledgeAndContinueDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public final String getAcknowledge_id() {
                    return this.surrogate.getAcknowledge_id();
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public AcknowledgeAndContinueDto(String acknowledge_id) {
                    this(new Surrogate(acknowledge_id));
                    Intrinsics.checkNotNullParameter(acknowledge_id, "acknowledge_id");
                }

                public /* synthetic */ AcknowledgeAndContinueDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.robinhood.idl.Dto
                public ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue toProto() {
                    return new ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue(this.surrogate.getAcknowledge_id(), null, 2, 0 == true ? 1 : 0);
                }

                public String toString() {
                    return "[AcknowledgeAndContinueDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof AcknowledgeAndContinueDto) && Intrinsics.areEqual(((AcknowledgeAndContinueDto) other).surrogate, this.surrogate);
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
                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto$Surrogate;", "", "", "acknowledge_id", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAcknowledge_id", "getAcknowledge_id$annotations", "()V", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final String acknowledge_id;

                    /* JADX WARN: Multi-variable type inference failed */
                    public Surrogate() {
                        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Surrogate) && Intrinsics.areEqual(this.acknowledge_id, ((Surrogate) other).acknowledge_id);
                    }

                    public int hashCode() {
                        return this.acknowledge_id.hashCode();
                    }

                    public String toString() {
                        return "Surrogate(acknowledge_id=" + this.acknowledge_id + ")";
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C44085xafdd2284.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.acknowledge_id = "";
                        } else {
                            this.acknowledge_id = str;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        if (Intrinsics.areEqual(self.acknowledge_id, "")) {
                            return;
                        }
                        output.encodeStringElement(serialDesc, 0, self.acknowledge_id);
                    }

                    public Surrogate(String acknowledge_id) {
                        Intrinsics.checkNotNullParameter(acknowledge_id, "acknowledge_id");
                        this.acknowledge_id = acknowledge_id;
                    }

                    public final String getAcknowledge_id() {
                        return this.acknowledge_id;
                    }

                    public /* synthetic */ Surrogate(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "" : str);
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$AcknowledgeAndContinue;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto3.Creator<AcknowledgeAndContinueDto, ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<AcknowledgeAndContinueDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<AcknowledgeAndContinueDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<AcknowledgeAndContinueDto> getBinaryBase64Serializer() {
                        return (KSerializer) AcknowledgeAndContinueDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue> getProtoAdapter() {
                        return ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public AcknowledgeAndContinueDto getZeroValue() {
                        return AcknowledgeAndContinueDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public AcknowledgeAndContinueDto fromProto(ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        return new AcknowledgeAndContinueDto(new Surrogate(proto.getAcknowledge_id()), null);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.AcknowledgeAndContinueDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new AcknowledgeAndContinueDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<AcknowledgeAndContinueDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse.Mobile.Action.AcknowledgeAndContinue", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, AcknowledgeAndContinueDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public AcknowledgeAndContinueDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new AcknowledgeAndContinueDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4184_0)
                    public final String provideIntoMap() {
                        return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$AcknowledgeAndContinueDto";
                    }
                }
            }

            /* compiled from: ValidateCryptoOrderResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000b#\"$%&'()*+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006-"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto;", "type", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$Surrogate;", "getType", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto;", "Companion", "Surrogate", "TypeDto", "SetLimitPriceDto", "SetOrderSizeDto", "ConvertToSellAllDto", "StartDepositFlowDto", "SetPdtWarningAsSeenDto", "ShowPaymentMethodSelectionDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class SideEffectDto implements Dto3<ValidateCryptoOrderResponse.Mobile.Action.SideEffect>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<SideEffectDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<SideEffectDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect>> binaryBase64Serializer$delegate;
                private static final SideEffectDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ SideEffectDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private SideEffectDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public final TypeDto getType() {
                    if (this.surrogate.getDeeplink_action() != null) {
                        return new TypeDto.DeeplinkAction(this.surrogate.getDeeplink_action());
                    }
                    if (this.surrogate.getSet_limit_price() != null) {
                        return new TypeDto.SetLimitPrice(this.surrogate.getSet_limit_price());
                    }
                    if (this.surrogate.getSet_order_size() != null) {
                        return new TypeDto.SetOrderSize(this.surrogate.getSet_order_size());
                    }
                    if (this.surrogate.getConvert_to_sell_all() != null) {
                        return new TypeDto.ConvertToSellAll(this.surrogate.getConvert_to_sell_all());
                    }
                    if (this.surrogate.getStart_deposit_flow() != null) {
                        return new TypeDto.StartDepositFlow(this.surrogate.getStart_deposit_flow());
                    }
                    if (this.surrogate.getSet_pdt_warning_as_seen() != null) {
                        return new TypeDto.SetPdtWarningAsSeen(this.surrogate.getSet_pdt_warning_as_seen());
                    }
                    if (this.surrogate.getShow_payment_method_selection() != null) {
                        return new TypeDto.ShowPaymentMethodSelection(this.surrogate.getShow_payment_method_selection());
                    }
                    return null;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public SideEffectDto(TypeDto typeDto) {
                    TypeDto.DeeplinkAction deeplinkAction = typeDto instanceof TypeDto.DeeplinkAction ? (TypeDto.DeeplinkAction) typeDto : null;
                    DeepLinkActionDto value = deeplinkAction != null ? deeplinkAction.getValue() : null;
                    TypeDto.SetLimitPrice setLimitPrice = typeDto instanceof TypeDto.SetLimitPrice ? (TypeDto.SetLimitPrice) typeDto : null;
                    SetLimitPriceDto value2 = setLimitPrice != null ? setLimitPrice.getValue() : null;
                    TypeDto.SetOrderSize setOrderSize = typeDto instanceof TypeDto.SetOrderSize ? (TypeDto.SetOrderSize) typeDto : null;
                    SetOrderSizeDto value3 = setOrderSize != null ? setOrderSize.getValue() : null;
                    TypeDto.ConvertToSellAll convertToSellAll = typeDto instanceof TypeDto.ConvertToSellAll ? (TypeDto.ConvertToSellAll) typeDto : null;
                    ConvertToSellAllDto value4 = convertToSellAll != null ? convertToSellAll.getValue() : null;
                    TypeDto.StartDepositFlow startDepositFlow = typeDto instanceof TypeDto.StartDepositFlow ? (TypeDto.StartDepositFlow) typeDto : null;
                    StartDepositFlowDto value5 = startDepositFlow != null ? startDepositFlow.getValue() : null;
                    TypeDto.SetPdtWarningAsSeen setPdtWarningAsSeen = typeDto instanceof TypeDto.SetPdtWarningAsSeen ? (TypeDto.SetPdtWarningAsSeen) typeDto : null;
                    SetPdtWarningAsSeenDto value6 = setPdtWarningAsSeen != null ? setPdtWarningAsSeen.getValue() : null;
                    TypeDto.ShowPaymentMethodSelection showPaymentMethodSelection = typeDto instanceof TypeDto.ShowPaymentMethodSelection ? (TypeDto.ShowPaymentMethodSelection) typeDto : null;
                    this(new Surrogate(value, value2, value3, value4, value5, value6, showPaymentMethodSelection != null ? showPaymentMethodSelection.getValue() : null));
                }

                public /* synthetic */ SideEffectDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : typeDto);
                }

                @Override // com.robinhood.idl.Dto
                public ValidateCryptoOrderResponse.Mobile.Action.SideEffect toProto() {
                    DeepLinkActionDto deeplink_action = this.surrogate.getDeeplink_action();
                    DeepLinkAction proto = deeplink_action != null ? deeplink_action.toProto() : null;
                    SetLimitPriceDto set_limit_price = this.surrogate.getSet_limit_price();
                    ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice proto2 = set_limit_price != null ? set_limit_price.toProto() : null;
                    SetOrderSizeDto set_order_size = this.surrogate.getSet_order_size();
                    ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize proto3 = set_order_size != null ? set_order_size.toProto() : null;
                    ConvertToSellAllDto convert_to_sell_all = this.surrogate.getConvert_to_sell_all();
                    ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll proto4 = convert_to_sell_all != null ? convert_to_sell_all.toProto() : null;
                    StartDepositFlowDto start_deposit_flow = this.surrogate.getStart_deposit_flow();
                    ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow proto5 = start_deposit_flow != null ? start_deposit_flow.toProto() : null;
                    SetPdtWarningAsSeenDto set_pdt_warning_as_seen = this.surrogate.getSet_pdt_warning_as_seen();
                    ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen proto6 = set_pdt_warning_as_seen != null ? set_pdt_warning_as_seen.toProto() : null;
                    ShowPaymentMethodSelectionDto show_payment_method_selection = this.surrogate.getShow_payment_method_selection();
                    return new ValidateCryptoOrderResponse.Mobile.Action.SideEffect(proto, proto2, proto3, proto4, proto5, proto6, show_payment_method_selection != null ? show_payment_method_selection.toProto() : null, null, 128, null);
                }

                public String toString() {
                    return "[SideEffectDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof SideEffectDto) && Intrinsics.areEqual(((SideEffectDto) other).surrogate, this.surrogate);
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
                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\b\u0083\b\u0018\u0000 F2\u00020\u0001:\u0002GFB[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Ba\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b9\u0010-\u001a\u0004\b7\u00108R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010:\u0012\u0004\b=\u0010-\u001a\u0004\b;\u0010<R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\bA\u0010-\u001a\u0004\b?\u0010@R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010B\u0012\u0004\bE\u0010-\u001a\u0004\bC\u0010D¨\u0006H"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$Surrogate;", "", "Lrh_server_driven_ui/v1/DeepLinkActionDto;", "deeplink_action", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto;", "set_limit_price", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;", "set_order_size", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto;", "convert_to_sell_all", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto;", "start_deposit_flow", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto;", "set_pdt_warning_as_seen", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto;", "show_payment_method_selection", "<init>", "(Lrh_server_driven_ui/v1/DeepLinkActionDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/DeepLinkActionDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto;Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/DeepLinkActionDto;", "getDeeplink_action", "()Lrh_server_driven_ui/v1/DeepLinkActionDto;", "getDeeplink_action$annotations", "()V", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto;", "getSet_limit_price", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto;", "getSet_limit_price$annotations", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;", "getSet_order_size", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;", "getSet_order_size$annotations", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto;", "getConvert_to_sell_all", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto;", "getConvert_to_sell_all$annotations", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto;", "getStart_deposit_flow", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto;", "getStart_deposit_flow$annotations", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto;", "getSet_pdt_warning_as_seen", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto;", "getSet_pdt_warning_as_seen$annotations", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto;", "getShow_payment_method_selection", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto;", "getShow_payment_method_selection$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final ConvertToSellAllDto convert_to_sell_all;
                    private final DeepLinkActionDto deeplink_action;
                    private final SetLimitPriceDto set_limit_price;
                    private final SetOrderSizeDto set_order_size;
                    private final SetPdtWarningAsSeenDto set_pdt_warning_as_seen;
                    private final ShowPaymentMethodSelectionDto show_payment_method_selection;
                    private final StartDepositFlowDto start_deposit_flow;

                    public Surrogate() {
                        this((DeepLinkActionDto) null, (SetLimitPriceDto) null, (SetOrderSizeDto) null, (ConvertToSellAllDto) null, (StartDepositFlowDto) null, (SetPdtWarningAsSeenDto) null, (ShowPaymentMethodSelectionDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Surrogate)) {
                            return false;
                        }
                        Surrogate surrogate = (Surrogate) other;
                        return Intrinsics.areEqual(this.deeplink_action, surrogate.deeplink_action) && Intrinsics.areEqual(this.set_limit_price, surrogate.set_limit_price) && Intrinsics.areEqual(this.set_order_size, surrogate.set_order_size) && Intrinsics.areEqual(this.convert_to_sell_all, surrogate.convert_to_sell_all) && Intrinsics.areEqual(this.start_deposit_flow, surrogate.start_deposit_flow) && Intrinsics.areEqual(this.set_pdt_warning_as_seen, surrogate.set_pdt_warning_as_seen) && Intrinsics.areEqual(this.show_payment_method_selection, surrogate.show_payment_method_selection);
                    }

                    public int hashCode() {
                        DeepLinkActionDto deepLinkActionDto = this.deeplink_action;
                        int iHashCode = (deepLinkActionDto == null ? 0 : deepLinkActionDto.hashCode()) * 31;
                        SetLimitPriceDto setLimitPriceDto = this.set_limit_price;
                        int iHashCode2 = (iHashCode + (setLimitPriceDto == null ? 0 : setLimitPriceDto.hashCode())) * 31;
                        SetOrderSizeDto setOrderSizeDto = this.set_order_size;
                        int iHashCode3 = (iHashCode2 + (setOrderSizeDto == null ? 0 : setOrderSizeDto.hashCode())) * 31;
                        ConvertToSellAllDto convertToSellAllDto = this.convert_to_sell_all;
                        int iHashCode4 = (iHashCode3 + (convertToSellAllDto == null ? 0 : convertToSellAllDto.hashCode())) * 31;
                        StartDepositFlowDto startDepositFlowDto = this.start_deposit_flow;
                        int iHashCode5 = (iHashCode4 + (startDepositFlowDto == null ? 0 : startDepositFlowDto.hashCode())) * 31;
                        SetPdtWarningAsSeenDto setPdtWarningAsSeenDto = this.set_pdt_warning_as_seen;
                        int iHashCode6 = (iHashCode5 + (setPdtWarningAsSeenDto == null ? 0 : setPdtWarningAsSeenDto.hashCode())) * 31;
                        ShowPaymentMethodSelectionDto showPaymentMethodSelectionDto = this.show_payment_method_selection;
                        return iHashCode6 + (showPaymentMethodSelectionDto != null ? showPaymentMethodSelectionDto.hashCode() : 0);
                    }

                    public String toString() {
                        return "Surrogate(deeplink_action=" + this.deeplink_action + ", set_limit_price=" + this.set_limit_price + ", set_order_size=" + this.set_order_size + ", convert_to_sell_all=" + this.convert_to_sell_all + ", start_deposit_flow=" + this.start_deposit_flow + ", set_pdt_warning_as_seen=" + this.set_pdt_warning_as_seen + ", show_payment_method_selection=" + this.show_payment_method_selection + ")";
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C44102x2458e45e.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, DeepLinkActionDto deepLinkActionDto, SetLimitPriceDto setLimitPriceDto, SetOrderSizeDto setOrderSizeDto, ConvertToSellAllDto convertToSellAllDto, StartDepositFlowDto startDepositFlowDto, SetPdtWarningAsSeenDto setPdtWarningAsSeenDto, ShowPaymentMethodSelectionDto showPaymentMethodSelectionDto, SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.deeplink_action = null;
                        } else {
                            this.deeplink_action = deepLinkActionDto;
                        }
                        if ((i & 2) == 0) {
                            this.set_limit_price = null;
                        } else {
                            this.set_limit_price = setLimitPriceDto;
                        }
                        if ((i & 4) == 0) {
                            this.set_order_size = null;
                        } else {
                            this.set_order_size = setOrderSizeDto;
                        }
                        if ((i & 8) == 0) {
                            this.convert_to_sell_all = null;
                        } else {
                            this.convert_to_sell_all = convertToSellAllDto;
                        }
                        if ((i & 16) == 0) {
                            this.start_deposit_flow = null;
                        } else {
                            this.start_deposit_flow = startDepositFlowDto;
                        }
                        if ((i & 32) == 0) {
                            this.set_pdt_warning_as_seen = null;
                        } else {
                            this.set_pdt_warning_as_seen = setPdtWarningAsSeenDto;
                        }
                        if ((i & 64) == 0) {
                            this.show_payment_method_selection = null;
                        } else {
                            this.show_payment_method_selection = showPaymentMethodSelectionDto;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        DeepLinkActionDto deepLinkActionDto = self.deeplink_action;
                        if (deepLinkActionDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 0, DeepLinkActionDto.Serializer.INSTANCE, deepLinkActionDto);
                        }
                        SetLimitPriceDto setLimitPriceDto = self.set_limit_price;
                        if (setLimitPriceDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 1, SetLimitPriceDto.Serializer.INSTANCE, setLimitPriceDto);
                        }
                        SetOrderSizeDto setOrderSizeDto = self.set_order_size;
                        if (setOrderSizeDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 2, SetOrderSizeDto.Serializer.INSTANCE, setOrderSizeDto);
                        }
                        ConvertToSellAllDto convertToSellAllDto = self.convert_to_sell_all;
                        if (convertToSellAllDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 3, ConvertToSellAllDto.Serializer.INSTANCE, convertToSellAllDto);
                        }
                        StartDepositFlowDto startDepositFlowDto = self.start_deposit_flow;
                        if (startDepositFlowDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 4, StartDepositFlowDto.Serializer.INSTANCE, startDepositFlowDto);
                        }
                        SetPdtWarningAsSeenDto setPdtWarningAsSeenDto = self.set_pdt_warning_as_seen;
                        if (setPdtWarningAsSeenDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 5, SetPdtWarningAsSeenDto.Serializer.INSTANCE, setPdtWarningAsSeenDto);
                        }
                        ShowPaymentMethodSelectionDto showPaymentMethodSelectionDto = self.show_payment_method_selection;
                        if (showPaymentMethodSelectionDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 6, ShowPaymentMethodSelectionDto.Serializer.INSTANCE, showPaymentMethodSelectionDto);
                        }
                    }

                    public Surrogate(DeepLinkActionDto deepLinkActionDto, SetLimitPriceDto setLimitPriceDto, SetOrderSizeDto setOrderSizeDto, ConvertToSellAllDto convertToSellAllDto, StartDepositFlowDto startDepositFlowDto, SetPdtWarningAsSeenDto setPdtWarningAsSeenDto, ShowPaymentMethodSelectionDto showPaymentMethodSelectionDto) {
                        this.deeplink_action = deepLinkActionDto;
                        this.set_limit_price = setLimitPriceDto;
                        this.set_order_size = setOrderSizeDto;
                        this.convert_to_sell_all = convertToSellAllDto;
                        this.start_deposit_flow = startDepositFlowDto;
                        this.set_pdt_warning_as_seen = setPdtWarningAsSeenDto;
                        this.show_payment_method_selection = showPaymentMethodSelectionDto;
                    }

                    public /* synthetic */ Surrogate(DeepLinkActionDto deepLinkActionDto, SetLimitPriceDto setLimitPriceDto, SetOrderSizeDto setOrderSizeDto, ConvertToSellAllDto convertToSellAllDto, StartDepositFlowDto startDepositFlowDto, SetPdtWarningAsSeenDto setPdtWarningAsSeenDto, ShowPaymentMethodSelectionDto showPaymentMethodSelectionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : deepLinkActionDto, (i & 2) != 0 ? null : setLimitPriceDto, (i & 4) != 0 ? null : setOrderSizeDto, (i & 8) != 0 ? null : convertToSellAllDto, (i & 16) != 0 ? null : startDepositFlowDto, (i & 32) != 0 ? null : setPdtWarningAsSeenDto, (i & 64) != 0 ? null : showPaymentMethodSelectionDto);
                    }

                    public final DeepLinkActionDto getDeeplink_action() {
                        return this.deeplink_action;
                    }

                    public final SetLimitPriceDto getSet_limit_price() {
                        return this.set_limit_price;
                    }

                    public final SetOrderSizeDto getSet_order_size() {
                        return this.set_order_size;
                    }

                    public final ConvertToSellAllDto getConvert_to_sell_all() {
                        return this.convert_to_sell_all;
                    }

                    public final StartDepositFlowDto getStart_deposit_flow() {
                        return this.start_deposit_flow;
                    }

                    public final SetPdtWarningAsSeenDto getSet_pdt_warning_as_seen() {
                        return this.set_pdt_warning_as_seen;
                    }

                    public final ShowPaymentMethodSelectionDto getShow_payment_method_selection() {
                        return this.show_payment_method_selection;
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                public static final class Companion implements Dto3.Creator<SideEffectDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<SideEffectDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<SideEffectDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<SideEffectDto> getBinaryBase64Serializer() {
                        return (KSerializer) SideEffectDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<ValidateCryptoOrderResponse.Mobile.Action.SideEffect> getProtoAdapter() {
                        return ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public SideEffectDto getZeroValue() {
                        return SideEffectDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public SideEffectDto fromProto(ValidateCryptoOrderResponse.Mobile.Action.SideEffect proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        DeepLinkAction deeplink_action = proto.getDeeplink_action();
                        DefaultConstructorMarker defaultConstructorMarker = null;
                        DeepLinkActionDto deepLinkActionDtoFromProto = deeplink_action != null ? DeepLinkActionDto.INSTANCE.fromProto(deeplink_action) : null;
                        ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice set_limit_price = proto.getSet_limit_price();
                        SetLimitPriceDto setLimitPriceDtoFromProto = set_limit_price != null ? SetLimitPriceDto.INSTANCE.fromProto(set_limit_price) : null;
                        ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize set_order_size = proto.getSet_order_size();
                        SetOrderSizeDto setOrderSizeDtoFromProto = set_order_size != null ? SetOrderSizeDto.INSTANCE.fromProto(set_order_size) : null;
                        ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll convert_to_sell_all = proto.getConvert_to_sell_all();
                        ConvertToSellAllDto convertToSellAllDtoFromProto = convert_to_sell_all != null ? ConvertToSellAllDto.INSTANCE.fromProto(convert_to_sell_all) : null;
                        ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow start_deposit_flow = proto.getStart_deposit_flow();
                        StartDepositFlowDto startDepositFlowDtoFromProto = start_deposit_flow != null ? StartDepositFlowDto.INSTANCE.fromProto(start_deposit_flow) : null;
                        ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen set_pdt_warning_as_seen = proto.getSet_pdt_warning_as_seen();
                        SetPdtWarningAsSeenDto setPdtWarningAsSeenDtoFromProto = set_pdt_warning_as_seen != null ? SetPdtWarningAsSeenDto.INSTANCE.fromProto(set_pdt_warning_as_seen) : null;
                        ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection show_payment_method_selection = proto.getShow_payment_method_selection();
                        return new SideEffectDto(new Surrogate(deepLinkActionDtoFromProto, setLimitPriceDtoFromProto, setOrderSizeDtoFromProto, convertToSellAllDtoFromProto, startDepositFlowDtoFromProto, setPdtWarningAsSeenDtoFromProto, show_payment_method_selection != null ? ShowPaymentMethodSelectionDto.INSTANCE.fromProto(show_payment_method_selection) : null), defaultConstructorMarker);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new SideEffectDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000b2\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "DeeplinkAction", "SetLimitPrice", "SetOrderSize", "ConvertToSellAll", "StartDepositFlow", "SetPdtWarningAsSeen", "ShowPaymentMethodSelection", "Companion", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$ConvertToSellAll;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$DeeplinkAction;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$SetLimitPrice;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$SetOrderSize;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$SetPdtWarningAsSeen;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$ShowPaymentMethodSelection;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$StartDepositFlow;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$DeeplinkAction;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto;", "Lrh_server_driven_ui/v1/DeepLinkActionDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/DeepLinkActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/DeepLinkActionDto;", "getValue", "()Lrh_server_driven_ui/v1/DeepLinkActionDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class DeeplinkAction extends TypeDto {
                        private final DeepLinkActionDto value;

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof DeeplinkAction) && Intrinsics.areEqual(this.value, ((DeeplinkAction) other).value);
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "DeeplinkAction(value=" + this.value + ")";
                        }

                        public final DeepLinkActionDto getValue() {
                            return this.value;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public DeeplinkAction(DeepLinkActionDto value) {
                            super(null);
                            Intrinsics.checkNotNullParameter(value, "value");
                            this.value = value;
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$SetLimitPrice;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class SetLimitPrice extends TypeDto {
                        private final SetLimitPriceDto value;

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof SetLimitPrice) && Intrinsics.areEqual(this.value, ((SetLimitPrice) other).value);
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "SetLimitPrice(value=" + this.value + ")";
                        }

                        public final SetLimitPriceDto getValue() {
                            return this.value;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public SetLimitPrice(SetLimitPriceDto value) {
                            super(null);
                            Intrinsics.checkNotNullParameter(value, "value");
                            this.value = value;
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$SetOrderSize;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class SetOrderSize extends TypeDto {
                        private final SetOrderSizeDto value;

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof SetOrderSize) && Intrinsics.areEqual(this.value, ((SetOrderSize) other).value);
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "SetOrderSize(value=" + this.value + ")";
                        }

                        public final SetOrderSizeDto getValue() {
                            return this.value;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public SetOrderSize(SetOrderSizeDto value) {
                            super(null);
                            Intrinsics.checkNotNullParameter(value, "value");
                            this.value = value;
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$ConvertToSellAll;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class ConvertToSellAll extends TypeDto {
                        private final ConvertToSellAllDto value;

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof ConvertToSellAll) && Intrinsics.areEqual(this.value, ((ConvertToSellAll) other).value);
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "ConvertToSellAll(value=" + this.value + ")";
                        }

                        public final ConvertToSellAllDto getValue() {
                            return this.value;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public ConvertToSellAll(ConvertToSellAllDto value) {
                            super(null);
                            Intrinsics.checkNotNullParameter(value, "value");
                            this.value = value;
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$StartDepositFlow;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class StartDepositFlow extends TypeDto {
                        private final StartDepositFlowDto value;

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof StartDepositFlow) && Intrinsics.areEqual(this.value, ((StartDepositFlow) other).value);
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "StartDepositFlow(value=" + this.value + ")";
                        }

                        public final StartDepositFlowDto getValue() {
                            return this.value;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public StartDepositFlow(StartDepositFlowDto value) {
                            super(null);
                            Intrinsics.checkNotNullParameter(value, "value");
                            this.value = value;
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$SetPdtWarningAsSeen;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class SetPdtWarningAsSeen extends TypeDto {
                        private final SetPdtWarningAsSeenDto value;

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof SetPdtWarningAsSeen) && Intrinsics.areEqual(this.value, ((SetPdtWarningAsSeen) other).value);
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "SetPdtWarningAsSeen(value=" + this.value + ")";
                        }

                        public final SetPdtWarningAsSeenDto getValue() {
                            return this.value;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public SetPdtWarningAsSeen(SetPdtWarningAsSeenDto value) {
                            super(null);
                            Intrinsics.checkNotNullParameter(value, "value");
                            this.value = value;
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$ShowPaymentMethodSelection;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class ShowPaymentMethodSelection extends TypeDto {
                        private final ShowPaymentMethodSelectionDto value;

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof ShowPaymentMethodSelection) && Intrinsics.areEqual(this.value, ((ShowPaymentMethodSelection) other).value);
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "ShowPaymentMethodSelection(value=" + this.value + ")";
                        }

                        public final ShowPaymentMethodSelectionDto getValue() {
                            return this.value;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public ShowPaymentMethodSelection(ShowPaymentMethodSelectionDto value) {
                            super(null);
                            Intrinsics.checkNotNullParameter(value, "value");
                            this.value = value;
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion implements Dto4.Creator<TypeDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect> {
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
                        public ProtoAdapter<ValidateCryptoOrderResponse.Mobile.Action.SideEffect> getProtoAdapter() {
                            return ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ADAPTER;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public TypeDto fromProto(ValidateCryptoOrderResponse.Mobile.Action.SideEffect proto) {
                            Intrinsics.checkNotNullParameter(proto, "proto");
                            if (proto.getDeeplink_action() != null) {
                                return new DeeplinkAction(DeepLinkActionDto.INSTANCE.fromProto(proto.getDeeplink_action()));
                            }
                            if (proto.getSet_limit_price() != null) {
                                return new SetLimitPrice(SetLimitPriceDto.INSTANCE.fromProto(proto.getSet_limit_price()));
                            }
                            if (proto.getSet_order_size() != null) {
                                return new SetOrderSize(SetOrderSizeDto.INSTANCE.fromProto(proto.getSet_order_size()));
                            }
                            if (proto.getConvert_to_sell_all() != null) {
                                return new ConvertToSellAll(ConvertToSellAllDto.INSTANCE.fromProto(proto.getConvert_to_sell_all()));
                            }
                            if (proto.getStart_deposit_flow() != null) {
                                return new StartDepositFlow(StartDepositFlowDto.INSTANCE.fromProto(proto.getStart_deposit_flow()));
                            }
                            if (proto.getSet_pdt_warning_as_seen() != null) {
                                return new SetPdtWarningAsSeen(SetPdtWarningAsSeenDto.INSTANCE.fromProto(proto.getSet_pdt_warning_as_seen()));
                            }
                            if (proto.getShow_payment_method_selection() != null) {
                                return new ShowPaymentMethodSelection(ShowPaymentMethodSelectionDto.INSTANCE.fromProto(proto.getShow_payment_method_selection()));
                            }
                            return null;
                        }
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetLimitPrice;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "limit_price", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetLimitPrice;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto$Surrogate;", "getLimit_price", "()Lcom/robinhood/idl/IdlDecimal;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable(with = Serializer.class)
                @RhGenerated
                public static final class SetLimitPriceDto implements Dto3<ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice>, Parcelable {

                    @JvmField
                    public static final Parcelable.Creator<SetLimitPriceDto> CREATOR;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE;
                    private static final Lazy<BinaryBase64DtoSerializer<SetLimitPriceDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice>> binaryBase64Serializer$delegate;
                    private static final SetLimitPriceDto zeroValue;
                    private final Surrogate surrogate;

                    public /* synthetic */ SetLimitPriceDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                        this(surrogate);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    private SetLimitPriceDto(Surrogate surrogate) {
                        this.surrogate = surrogate;
                    }

                    public final IdlDecimal getLimit_price() {
                        return this.surrogate.getLimit_price();
                    }

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                    public SetLimitPriceDto(IdlDecimal limit_price) {
                        this(new Surrogate(limit_price));
                        Intrinsics.checkNotNullParameter(limit_price, "limit_price");
                    }

                    public /* synthetic */ SetLimitPriceDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.robinhood.idl.Dto
                    public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice toProto() {
                        return new ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice(this.surrogate.getLimit_price().getStringValue(), null, 2, 0 == true ? 1 : 0);
                    }

                    public String toString() {
                        return "[SetLimitPriceDto]:" + toProto();
                    }

                    public boolean equals(Object other) {
                        if (other != this) {
                            return (other instanceof SetLimitPriceDto) && Intrinsics.areEqual(((SetLimitPriceDto) other).surrogate, this.surrogate);
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
                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B \u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "limit_price", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getLimit_price", "()Lcom/robinhood/idl/IdlDecimal;", "getLimit_price$annotations", "()V", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @Serializable
                    static final /* data */ class Surrogate {

                        /* renamed from: Companion, reason: from kotlin metadata */
                        public static final Companion INSTANCE = new Companion(null);
                        private final IdlDecimal limit_price;

                        /* JADX WARN: Multi-variable type inference failed */
                        public Surrogate() {
                            this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof Surrogate) && Intrinsics.areEqual(this.limit_price, ((Surrogate) other).limit_price);
                        }

                        public int hashCode() {
                            return this.limit_price.hashCode();
                        }

                        public String toString() {
                            return "Surrogate(limit_price=" + this.limit_price + ")";
                        }

                        /* compiled from: ValidateCryptoOrderResponseDto.kt */
                        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public static final class Companion {
                            private Companion() {
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }

                            public final KSerializer<Surrogate> serializer() {
                                return C44093x7ab82061.INSTANCE;
                            }
                        }

                        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                            if ((i & 1) == 0) {
                                this.limit_price = new IdlDecimal("");
                            } else {
                                this.limit_price = idlDecimal;
                            }
                        }

                        @JvmStatic
                        public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                            if (Intrinsics.areEqual(self.limit_price, new IdlDecimal(""))) {
                                return;
                            }
                            output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.limit_price);
                        }

                        public Surrogate(IdlDecimal limit_price) {
                            Intrinsics.checkNotNullParameter(limit_price, "limit_price");
                            this.limit_price = limit_price;
                        }

                        public final IdlDecimal getLimit_price() {
                            return this.limit_price;
                        }

                        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                            this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetLimitPrice;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion implements Dto3.Creator<SetLimitPriceDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice> {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final KSerializer<SetLimitPriceDto> serializer() {
                            return Serializer.INSTANCE;
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<SetLimitPriceDto> getDefaultSerializer() {
                            return serializer();
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<SetLimitPriceDto> getBinaryBase64Serializer() {
                            return (KSerializer) SetLimitPriceDto.binaryBase64Serializer$delegate.getValue();
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ProtoAdapter<ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice> getProtoAdapter() {
                            return ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice.ADAPTER;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public SetLimitPriceDto getZeroValue() {
                            return SetLimitPriceDto.zeroValue;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public SetLimitPriceDto fromProto(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice proto) {
                            Intrinsics.checkNotNullParameter(proto, "proto");
                            return new SetLimitPriceDto(new Surrogate(new IdlDecimal(proto.getLimit_price())), null);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    static {
                        Companion companion = new Companion(null);
                        INSTANCE = companion;
                        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.SetLimitPriceDto.binaryBase64Serializer_delegate$lambda$0();
                            }
                        });
                        zeroValue = new SetLimitPriceDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                        CREATOR = new DtoParcelableCreator(companion);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                        return new BinaryBase64DtoSerializer(INSTANCE);
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Serializer implements KSerializer<SetLimitPriceDto> {
                        public static final Serializer INSTANCE = new Serializer();
                        private static final SerialDescriptor descriptor;
                        private static final KSerializer<Surrogate> surrogateSerializer;

                        private Serializer() {
                        }

                        static {
                            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                            surrogateSerializer = kSerializerSerializer;
                            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetLimitPrice", kSerializerSerializer.getDescriptor());
                        }

                        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                        public SerialDescriptor getDescriptor() {
                            return descriptor;
                        }

                        @Override // kotlinx.serialization.KSerializer3
                        public void serialize(Encoding4 encoder, SetLimitPriceDto value) {
                            Intrinsics.checkNotNullParameter(encoder, "encoder");
                            Intrinsics.checkNotNullParameter(value, "value");
                            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                        }

                        @Override // kotlinx.serialization.KSerializer2
                        public SetLimitPriceDto deserialize(Decoding2 decoder) {
                            Intrinsics.checkNotNullParameter(decoder, "decoder");
                            return new SetLimitPriceDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class MultibindingModule {
                        public static final MultibindingModule INSTANCE = new MultibindingModule();

                        private MultibindingModule() {
                        }

                        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
                        public final String provideIntoMap() {
                            return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetLimitPriceDto";
                        }
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\"¨\u0006("}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetOrderSize;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "asset_amount", "quote_amount", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetOrderSize;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto$Surrogate;", "getAsset_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getQuote_amount", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable(with = Serializer.class)
                @RhGenerated
                public static final class SetOrderSizeDto implements Dto3<ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize>, Parcelable {

                    @JvmField
                    public static final Parcelable.Creator<SetOrderSizeDto> CREATOR;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE;
                    private static final Lazy<BinaryBase64DtoSerializer<SetOrderSizeDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize>> binaryBase64Serializer$delegate;
                    private static final SetOrderSizeDto zeroValue;
                    private final Surrogate surrogate;

                    public /* synthetic */ SetOrderSizeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                        this(surrogate);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    private SetOrderSizeDto(Surrogate surrogate) {
                        this.surrogate = surrogate;
                    }

                    public final IdlDecimal getAsset_amount() {
                        return this.surrogate.getAsset_amount();
                    }

                    public final IdlDecimal getQuote_amount() {
                        return this.surrogate.getQuote_amount();
                    }

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                    public SetOrderSizeDto(IdlDecimal asset_amount, IdlDecimal quote_amount) {
                        this(new Surrogate(asset_amount, quote_amount));
                        Intrinsics.checkNotNullParameter(asset_amount, "asset_amount");
                        Intrinsics.checkNotNullParameter(quote_amount, "quote_amount");
                    }

                    public /* synthetic */ SetOrderSizeDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2);
                    }

                    @Override // com.robinhood.idl.Dto
                    public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize toProto() {
                        return new ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize(this.surrogate.getAsset_amount().getStringValue(), this.surrogate.getQuote_amount().getStringValue(), null, 4, null);
                    }

                    public String toString() {
                        return "[SetOrderSizeDto]:" + toProto();
                    }

                    public boolean equals(Object other) {
                        if (other != this) {
                            return (other instanceof SetOrderSizeDto) && Intrinsics.areEqual(((SetOrderSizeDto) other).surrogate, this.surrogate);
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
                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B9\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\b\u0010\tB/\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#¨\u0006*"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "asset_amount", "quote_amount", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getAsset_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getAsset_amount$annotations", "()V", "getQuote_amount", "getQuote_amount$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @Serializable
                    static final /* data */ class Surrogate {

                        /* renamed from: Companion, reason: from kotlin metadata */
                        public static final Companion INSTANCE = new Companion(null);
                        private final IdlDecimal asset_amount;
                        private final IdlDecimal quote_amount;

                        /* JADX WARN: Multi-variable type inference failed */
                        public Surrogate() {
                            this((IdlDecimal) null, (IdlDecimal) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof Surrogate)) {
                                return false;
                            }
                            Surrogate surrogate = (Surrogate) other;
                            return Intrinsics.areEqual(this.asset_amount, surrogate.asset_amount) && Intrinsics.areEqual(this.quote_amount, surrogate.quote_amount);
                        }

                        public int hashCode() {
                            return (this.asset_amount.hashCode() * 31) + this.quote_amount.hashCode();
                        }

                        public String toString() {
                            return "Surrogate(asset_amount=" + this.asset_amount + ", quote_amount=" + this.quote_amount + ")";
                        }

                        /* compiled from: ValidateCryptoOrderResponseDto.kt */
                        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public static final class Companion {
                            private Companion() {
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }

                            public final KSerializer<Surrogate> serializer() {
                                return C44095xe180558c.INSTANCE;
                            }
                        }

                        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, SerializationConstructorMarker serializationConstructorMarker) {
                            this.asset_amount = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
                            if ((i & 2) == 0) {
                                this.quote_amount = new IdlDecimal("");
                            } else {
                                this.quote_amount = idlDecimal2;
                            }
                        }

                        @JvmStatic
                        public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                            if (!Intrinsics.areEqual(self.asset_amount, new IdlDecimal(""))) {
                                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.asset_amount);
                            }
                            if (Intrinsics.areEqual(self.quote_amount, new IdlDecimal(""))) {
                                return;
                            }
                            output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.quote_amount);
                        }

                        public Surrogate(IdlDecimal asset_amount, IdlDecimal quote_amount) {
                            Intrinsics.checkNotNullParameter(asset_amount, "asset_amount");
                            Intrinsics.checkNotNullParameter(quote_amount, "quote_amount");
                            this.asset_amount = asset_amount;
                            this.quote_amount = quote_amount;
                        }

                        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                            this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2);
                        }

                        public final IdlDecimal getAsset_amount() {
                            return this.asset_amount;
                        }

                        public final IdlDecimal getQuote_amount() {
                            return this.quote_amount;
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetOrderSize;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion implements Dto3.Creator<SetOrderSizeDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize> {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final KSerializer<SetOrderSizeDto> serializer() {
                            return Serializer.INSTANCE;
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<SetOrderSizeDto> getDefaultSerializer() {
                            return serializer();
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<SetOrderSizeDto> getBinaryBase64Serializer() {
                            return (KSerializer) SetOrderSizeDto.binaryBase64Serializer$delegate.getValue();
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ProtoAdapter<ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize> getProtoAdapter() {
                            return ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize.ADAPTER;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public SetOrderSizeDto getZeroValue() {
                            return SetOrderSizeDto.zeroValue;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public SetOrderSizeDto fromProto(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize proto) {
                            Intrinsics.checkNotNullParameter(proto, "proto");
                            return new SetOrderSizeDto(new Surrogate(new IdlDecimal(proto.getAsset_amount()), new IdlDecimal(proto.getQuote_amount())), (DefaultConstructorMarker) null);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    static {
                        Companion companion = new Companion(null);
                        INSTANCE = companion;
                        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.SetOrderSizeDto.binaryBase64Serializer_delegate$lambda$0();
                            }
                        });
                        zeroValue = new SetOrderSizeDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                        CREATOR = new DtoParcelableCreator(companion);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                        return new BinaryBase64DtoSerializer(INSTANCE);
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Serializer implements KSerializer<SetOrderSizeDto> {
                        public static final Serializer INSTANCE = new Serializer();
                        private static final SerialDescriptor descriptor;
                        private static final KSerializer<Surrogate> surrogateSerializer;

                        private Serializer() {
                        }

                        static {
                            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                            surrogateSerializer = kSerializerSerializer;
                            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetOrderSize", kSerializerSerializer.getDescriptor());
                        }

                        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                        public SerialDescriptor getDescriptor() {
                            return descriptor;
                        }

                        @Override // kotlinx.serialization.KSerializer3
                        public void serialize(Encoding4 encoder, SetOrderSizeDto value) {
                            Intrinsics.checkNotNullParameter(encoder, "encoder");
                            Intrinsics.checkNotNullParameter(value, "value");
                            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                        }

                        @Override // kotlinx.serialization.KSerializer2
                        public SetOrderSizeDto deserialize(Decoding2 decoder) {
                            Intrinsics.checkNotNullParameter(decoder, "decoder");
                            return new SetOrderSizeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class MultibindingModule {
                        public static final MultibindingModule INSTANCE = new MultibindingModule();

                        private MultibindingModule() {
                        }

                        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
                        public final String provideIntoMap() {
                            return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetOrderSizeDto";
                        }
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ConvertToSellAll;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ConvertToSellAll;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable(with = Serializer.class)
                @RhGenerated
                public static final class ConvertToSellAllDto implements Dto3<ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll>, Parcelable {

                    @JvmField
                    public static final Parcelable.Creator<ConvertToSellAllDto> CREATOR;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE;
                    private static final Lazy<BinaryBase64DtoSerializer<ConvertToSellAllDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll>> binaryBase64Serializer$delegate;
                    private static final ConvertToSellAllDto zeroValue;
                    private final Surrogate surrogate;

                    public /* synthetic */ ConvertToSellAllDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                        this(surrogate);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    private ConvertToSellAllDto(Surrogate surrogate) {
                        this.surrogate = surrogate;
                    }

                    public ConvertToSellAllDto() {
                        this(Surrogate.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.robinhood.idl.Dto
                    public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll toProto() {
                        return new ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll(null, 1, 0 == true ? 1 : 0);
                    }

                    public String toString() {
                        return "[ConvertToSellAllDto]:" + toProto();
                    }

                    public boolean equals(Object other) {
                        if (other != this) {
                            return (other instanceof ConvertToSellAllDto) && Intrinsics.areEqual(((ConvertToSellAllDto) other).surrogate, this.surrogate);
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
                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @Serializable
                    static final /* data */ class Surrogate {
                        public static final Surrogate INSTANCE = new Surrogate();
                        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto$Surrogate$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.ConvertToSellAllDto.Surrogate._init_$_anonymous_();
                            }
                        });

                        public boolean equals(Object other) {
                            return this == other || (other instanceof Surrogate);
                        }

                        public int hashCode() {
                            return -2046683081;
                        }

                        public String toString() {
                            return "Surrogate";
                        }

                        private Surrogate() {
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                            return new ObjectSerializer("contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.ConvertToSellAllDto.Surrogate", INSTANCE, new Annotation[0]);
                        }

                        private final /* synthetic */ KSerializer get$cachedSerializer() {
                            return $cachedSerializer$delegate.getValue();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return get$cachedSerializer();
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ConvertToSellAll;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion implements Dto3.Creator<ConvertToSellAllDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll> {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final KSerializer<ConvertToSellAllDto> serializer() {
                            return Serializer.INSTANCE;
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<ConvertToSellAllDto> getDefaultSerializer() {
                            return serializer();
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<ConvertToSellAllDto> getBinaryBase64Serializer() {
                            return (KSerializer) ConvertToSellAllDto.binaryBase64Serializer$delegate.getValue();
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ProtoAdapter<ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll> getProtoAdapter() {
                            return ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll.ADAPTER;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ConvertToSellAllDto getZeroValue() {
                            return ConvertToSellAllDto.zeroValue;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ConvertToSellAllDto fromProto(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll proto) {
                            Intrinsics.checkNotNullParameter(proto, "proto");
                            return new ConvertToSellAllDto();
                        }
                    }

                    static {
                        Companion companion = new Companion(null);
                        INSTANCE = companion;
                        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.ConvertToSellAllDto.binaryBase64Serializer_delegate$lambda$0();
                            }
                        });
                        zeroValue = new ConvertToSellAllDto();
                        CREATOR = new DtoParcelableCreator(companion);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                        return new BinaryBase64DtoSerializer(INSTANCE);
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Serializer implements KSerializer<ConvertToSellAllDto> {
                        public static final Serializer INSTANCE = new Serializer();
                        private static final SerialDescriptor descriptor;
                        private static final KSerializer<Surrogate> surrogateSerializer;

                        private Serializer() {
                        }

                        static {
                            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                            surrogateSerializer = kSerializerSerializer;
                            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ConvertToSellAll", kSerializerSerializer.getDescriptor());
                        }

                        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                        public SerialDescriptor getDescriptor() {
                            return descriptor;
                        }

                        @Override // kotlinx.serialization.KSerializer3
                        public void serialize(Encoding4 encoder, ConvertToSellAllDto value) {
                            Intrinsics.checkNotNullParameter(encoder, "encoder");
                            Intrinsics.checkNotNullParameter(value, "value");
                            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                        }

                        @Override // kotlinx.serialization.KSerializer2
                        public ConvertToSellAllDto deserialize(Decoding2 decoder) {
                            Intrinsics.checkNotNullParameter(decoder, "decoder");
                            return new ConvertToSellAllDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class MultibindingModule {
                        public static final MultibindingModule INSTANCE = new MultibindingModule();

                        private MultibindingModule() {
                        }

                        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
                        public final String provideIntoMap() {
                            return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ConvertToSellAllDto";
                        }
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$StartDepositFlow;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$StartDepositFlow;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable(with = Serializer.class)
                @RhGenerated
                public static final class StartDepositFlowDto implements Dto3<ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow>, Parcelable {

                    @JvmField
                    public static final Parcelable.Creator<StartDepositFlowDto> CREATOR;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE;
                    private static final Lazy<BinaryBase64DtoSerializer<StartDepositFlowDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow>> binaryBase64Serializer$delegate;
                    private static final StartDepositFlowDto zeroValue;
                    private final Surrogate surrogate;

                    public /* synthetic */ StartDepositFlowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                        this(surrogate);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    private StartDepositFlowDto(Surrogate surrogate) {
                        this.surrogate = surrogate;
                    }

                    public StartDepositFlowDto() {
                        this(Surrogate.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.robinhood.idl.Dto
                    public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow toProto() {
                        return new ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow(null, 1, 0 == true ? 1 : 0);
                    }

                    public String toString() {
                        return "[StartDepositFlowDto]:" + toProto();
                    }

                    public boolean equals(Object other) {
                        if (other != this) {
                            return (other instanceof StartDepositFlowDto) && Intrinsics.areEqual(((StartDepositFlowDto) other).surrogate, this.surrogate);
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
                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @Serializable
                    static final /* data */ class Surrogate {
                        public static final Surrogate INSTANCE = new Surrogate();
                        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto$Surrogate$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.StartDepositFlowDto.Surrogate._init_$_anonymous_();
                            }
                        });

                        public boolean equals(Object other) {
                            return this == other || (other instanceof Surrogate);
                        }

                        public int hashCode() {
                            return -1364311762;
                        }

                        public String toString() {
                            return "Surrogate";
                        }

                        private Surrogate() {
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                            return new ObjectSerializer("contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.StartDepositFlowDto.Surrogate", INSTANCE, new Annotation[0]);
                        }

                        private final /* synthetic */ KSerializer get$cachedSerializer() {
                            return $cachedSerializer$delegate.getValue();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return get$cachedSerializer();
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$StartDepositFlow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion implements Dto3.Creator<StartDepositFlowDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow> {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final KSerializer<StartDepositFlowDto> serializer() {
                            return Serializer.INSTANCE;
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<StartDepositFlowDto> getDefaultSerializer() {
                            return serializer();
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<StartDepositFlowDto> getBinaryBase64Serializer() {
                            return (KSerializer) StartDepositFlowDto.binaryBase64Serializer$delegate.getValue();
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ProtoAdapter<ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow> getProtoAdapter() {
                            return ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow.ADAPTER;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public StartDepositFlowDto getZeroValue() {
                            return StartDepositFlowDto.zeroValue;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public StartDepositFlowDto fromProto(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow proto) {
                            Intrinsics.checkNotNullParameter(proto, "proto");
                            return new StartDepositFlowDto();
                        }
                    }

                    static {
                        Companion companion = new Companion(null);
                        INSTANCE = companion;
                        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.StartDepositFlowDto.binaryBase64Serializer_delegate$lambda$0();
                            }
                        });
                        zeroValue = new StartDepositFlowDto();
                        CREATOR = new DtoParcelableCreator(companion);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                        return new BinaryBase64DtoSerializer(INSTANCE);
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Serializer implements KSerializer<StartDepositFlowDto> {
                        public static final Serializer INSTANCE = new Serializer();
                        private static final SerialDescriptor descriptor;
                        private static final KSerializer<Surrogate> surrogateSerializer;

                        private Serializer() {
                        }

                        static {
                            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                            surrogateSerializer = kSerializerSerializer;
                            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse.Mobile.Action.SideEffect.StartDepositFlow", kSerializerSerializer.getDescriptor());
                        }

                        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                        public SerialDescriptor getDescriptor() {
                            return descriptor;
                        }

                        @Override // kotlinx.serialization.KSerializer3
                        public void serialize(Encoding4 encoder, StartDepositFlowDto value) {
                            Intrinsics.checkNotNullParameter(encoder, "encoder");
                            Intrinsics.checkNotNullParameter(value, "value");
                            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                        }

                        @Override // kotlinx.serialization.KSerializer2
                        public StartDepositFlowDto deserialize(Decoding2 decoder) {
                            Intrinsics.checkNotNullParameter(decoder, "decoder");
                            return new StartDepositFlowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class MultibindingModule {
                        public static final MultibindingModule INSTANCE = new MultibindingModule();

                        private MultibindingModule() {
                        }

                        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
                        public final String provideIntoMap() {
                            return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$StartDepositFlowDto";
                        }
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetPdtWarningAsSeen;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetPdtWarningAsSeen;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable(with = Serializer.class)
                @RhGenerated
                public static final class SetPdtWarningAsSeenDto implements Dto3<ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen>, Parcelable {

                    @JvmField
                    public static final Parcelable.Creator<SetPdtWarningAsSeenDto> CREATOR;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE;
                    private static final Lazy<BinaryBase64DtoSerializer<SetPdtWarningAsSeenDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen>> binaryBase64Serializer$delegate;
                    private static final SetPdtWarningAsSeenDto zeroValue;
                    private final Surrogate surrogate;

                    public /* synthetic */ SetPdtWarningAsSeenDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                        this(surrogate);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    private SetPdtWarningAsSeenDto(Surrogate surrogate) {
                        this.surrogate = surrogate;
                    }

                    public SetPdtWarningAsSeenDto() {
                        this(Surrogate.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.robinhood.idl.Dto
                    public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen toProto() {
                        return new ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen(null, 1, 0 == true ? 1 : 0);
                    }

                    public String toString() {
                        return "[SetPdtWarningAsSeenDto]:" + toProto();
                    }

                    public boolean equals(Object other) {
                        if (other != this) {
                            return (other instanceof SetPdtWarningAsSeenDto) && Intrinsics.areEqual(((SetPdtWarningAsSeenDto) other).surrogate, this.surrogate);
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
                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @Serializable
                    static final /* data */ class Surrogate {
                        public static final Surrogate INSTANCE = new Surrogate();
                        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto$Surrogate$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.SetPdtWarningAsSeenDto.Surrogate._init_$_anonymous_();
                            }
                        });

                        public boolean equals(Object other) {
                            return this == other || (other instanceof Surrogate);
                        }

                        public int hashCode() {
                            return 541619727;
                        }

                        public String toString() {
                            return "Surrogate";
                        }

                        private Surrogate() {
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                            return new ObjectSerializer("contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.SetPdtWarningAsSeenDto.Surrogate", INSTANCE, new Annotation[0]);
                        }

                        private final /* synthetic */ KSerializer get$cachedSerializer() {
                            return $cachedSerializer$delegate.getValue();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return get$cachedSerializer();
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$SetPdtWarningAsSeen;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion implements Dto3.Creator<SetPdtWarningAsSeenDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen> {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final KSerializer<SetPdtWarningAsSeenDto> serializer() {
                            return Serializer.INSTANCE;
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<SetPdtWarningAsSeenDto> getDefaultSerializer() {
                            return serializer();
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<SetPdtWarningAsSeenDto> getBinaryBase64Serializer() {
                            return (KSerializer) SetPdtWarningAsSeenDto.binaryBase64Serializer$delegate.getValue();
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ProtoAdapter<ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen> getProtoAdapter() {
                            return ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen.ADAPTER;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public SetPdtWarningAsSeenDto getZeroValue() {
                            return SetPdtWarningAsSeenDto.zeroValue;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public SetPdtWarningAsSeenDto fromProto(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen proto) {
                            Intrinsics.checkNotNullParameter(proto, "proto");
                            return new SetPdtWarningAsSeenDto();
                        }
                    }

                    static {
                        Companion companion = new Companion(null);
                        INSTANCE = companion;
                        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.SetPdtWarningAsSeenDto.binaryBase64Serializer_delegate$lambda$0();
                            }
                        });
                        zeroValue = new SetPdtWarningAsSeenDto();
                        CREATOR = new DtoParcelableCreator(companion);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                        return new BinaryBase64DtoSerializer(INSTANCE);
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Serializer implements KSerializer<SetPdtWarningAsSeenDto> {
                        public static final Serializer INSTANCE = new Serializer();
                        private static final SerialDescriptor descriptor;
                        private static final KSerializer<Surrogate> surrogateSerializer;

                        private Serializer() {
                        }

                        static {
                            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                            surrogateSerializer = kSerializerSerializer;
                            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse.Mobile.Action.SideEffect.SetPdtWarningAsSeen", kSerializerSerializer.getDescriptor());
                        }

                        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                        public SerialDescriptor getDescriptor() {
                            return descriptor;
                        }

                        @Override // kotlinx.serialization.KSerializer3
                        public void serialize(Encoding4 encoder, SetPdtWarningAsSeenDto value) {
                            Intrinsics.checkNotNullParameter(encoder, "encoder");
                            Intrinsics.checkNotNullParameter(value, "value");
                            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                        }

                        @Override // kotlinx.serialization.KSerializer2
                        public SetPdtWarningAsSeenDto deserialize(Decoding2 decoder) {
                            Intrinsics.checkNotNullParameter(decoder, "decoder");
                            return new SetPdtWarningAsSeenDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class MultibindingModule {
                        public static final MultibindingModule INSTANCE = new MultibindingModule();

                        private MultibindingModule() {
                        }

                        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
                        public final String provideIntoMap() {
                            return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$SetPdtWarningAsSeenDto";
                        }
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ShowPaymentMethodSelection;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ShowPaymentMethodSelection;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable(with = Serializer.class)
                @RhGenerated
                public static final class ShowPaymentMethodSelectionDto implements Dto3<ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection>, Parcelable {

                    @JvmField
                    public static final Parcelable.Creator<ShowPaymentMethodSelectionDto> CREATOR;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE;
                    private static final Lazy<BinaryBase64DtoSerializer<ShowPaymentMethodSelectionDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection>> binaryBase64Serializer$delegate;
                    private static final ShowPaymentMethodSelectionDto zeroValue;
                    private final Surrogate surrogate;

                    public /* synthetic */ ShowPaymentMethodSelectionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                        this(surrogate);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    private ShowPaymentMethodSelectionDto(Surrogate surrogate) {
                        this.surrogate = surrogate;
                    }

                    public ShowPaymentMethodSelectionDto() {
                        this(Surrogate.INSTANCE);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.robinhood.idl.Dto
                    public ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection toProto() {
                        return new ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection(null, 1, 0 == true ? 1 : 0);
                    }

                    public String toString() {
                        return "[ShowPaymentMethodSelectionDto]:" + toProto();
                    }

                    public boolean equals(Object other) {
                        if (other != this) {
                            return (other instanceof ShowPaymentMethodSelectionDto) && Intrinsics.areEqual(((ShowPaymentMethodSelectionDto) other).surrogate, this.surrogate);
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
                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @Serializable
                    static final /* data */ class Surrogate {
                        public static final Surrogate INSTANCE = new Surrogate();
                        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto$Surrogate$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.ShowPaymentMethodSelectionDto.Surrogate._init_$_anonymous_();
                            }
                        });

                        public boolean equals(Object other) {
                            return this == other || (other instanceof Surrogate);
                        }

                        public int hashCode() {
                            return 1642166902;
                        }

                        public String toString() {
                            return "Surrogate";
                        }

                        private Surrogate() {
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                            return new ObjectSerializer("contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.ShowPaymentMethodSelectionDto.Surrogate", INSTANCE, new Annotation[0]);
                        }

                        private final /* synthetic */ KSerializer get$cachedSerializer() {
                            return $cachedSerializer$delegate.getValue();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return get$cachedSerializer();
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Mobile$Action$SideEffect$ShowPaymentMethodSelection;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion implements Dto3.Creator<ShowPaymentMethodSelectionDto, ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection> {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final KSerializer<ShowPaymentMethodSelectionDto> serializer() {
                            return Serializer.INSTANCE;
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<ShowPaymentMethodSelectionDto> getDefaultSerializer() {
                            return serializer();
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<ShowPaymentMethodSelectionDto> getBinaryBase64Serializer() {
                            return (KSerializer) ShowPaymentMethodSelectionDto.binaryBase64Serializer$delegate.getValue();
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ProtoAdapter<ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection> getProtoAdapter() {
                            return ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection.ADAPTER;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ShowPaymentMethodSelectionDto getZeroValue() {
                            return ShowPaymentMethodSelectionDto.zeroValue;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ShowPaymentMethodSelectionDto fromProto(ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection proto) {
                            Intrinsics.checkNotNullParameter(proto, "proto");
                            return new ShowPaymentMethodSelectionDto();
                        }
                    }

                    static {
                        Companion companion = new Companion(null);
                        INSTANCE = companion;
                        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.ShowPaymentMethodSelectionDto.binaryBase64Serializer_delegate$lambda$0();
                            }
                        });
                        zeroValue = new ShowPaymentMethodSelectionDto();
                        CREATOR = new DtoParcelableCreator(companion);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                        return new BinaryBase64DtoSerializer(INSTANCE);
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Serializer implements KSerializer<ShowPaymentMethodSelectionDto> {
                        public static final Serializer INSTANCE = new Serializer();
                        private static final SerialDescriptor descriptor;
                        private static final KSerializer<Surrogate> surrogateSerializer;

                        private Serializer() {
                        }

                        static {
                            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                            surrogateSerializer = kSerializerSerializer;
                            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse.Mobile.Action.SideEffect.ShowPaymentMethodSelection", kSerializerSerializer.getDescriptor());
                        }

                        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                        public SerialDescriptor getDescriptor() {
                            return descriptor;
                        }

                        @Override // kotlinx.serialization.KSerializer3
                        public void serialize(Encoding4 encoder, ShowPaymentMethodSelectionDto value) {
                            Intrinsics.checkNotNullParameter(encoder, "encoder");
                            Intrinsics.checkNotNullParameter(value, "value");
                            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                        }

                        @Override // kotlinx.serialization.KSerializer2
                        public ShowPaymentMethodSelectionDto deserialize(Decoding2 decoder) {
                            Intrinsics.checkNotNullParameter(decoder, "decoder");
                            return new ShowPaymentMethodSelectionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                        }
                    }

                    /* compiled from: ValidateCryptoOrderResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class MultibindingModule {
                        public static final MultibindingModule INSTANCE = new MultibindingModule();

                        private MultibindingModule() {
                        }

                        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
                        public final String provideIntoMap() {
                            return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$ShowPaymentMethodSelectionDto";
                        }
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<SideEffectDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse.Mobile.Action.SideEffect", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, SideEffectDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public SideEffectDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new SideEffectDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: ValidateCryptoOrderResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4192_8)
                    public final String provideIntoMap() {
                        return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto";
                    }
                }
            }

            /* compiled from: ValidateCryptoOrderResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<ActionDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse.Mobile.Action", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, ActionDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public ActionDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new ActionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: ValidateCryptoOrderResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4185_1)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto$ActionDto";
                }
            }
        }

        /* compiled from: ValidateCryptoOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<MobileDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse.Mobile", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, MobileDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public MobileDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new MobileDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: ValidateCryptoOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$MobileDto";
            }
        }
    }

    /* compiled from: ValidateCryptoOrderResponseDto.kt */
    @Serializable(with = Serializer.class)
    @RhGenerated
    @SourceDebugExtension
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$#%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Web;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto$Surrogate;)V", "", "title", "description_markdown", "", "Lrh_server_driven_ui/v1/ButtonDto;", CarResultComposable2.BUTTONS, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Web;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class WebDto implements Dto3<ValidateCryptoOrderResponse.Web>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<WebDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<WebDto, ValidateCryptoOrderResponse.Web>> binaryBase64Serializer$delegate;
        private static final WebDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ WebDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private WebDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public /* synthetic */ WebDto(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public WebDto(String title, String description_markdown, List<ButtonDto> buttons) {
            this(new Surrogate(title, description_markdown, buttons));
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
            Intrinsics.checkNotNullParameter(buttons, "buttons");
        }

        @Override // com.robinhood.idl.Dto
        public ValidateCryptoOrderResponse.Web toProto() {
            String title = this.surrogate.getTitle();
            String description_markdown = this.surrogate.getDescription_markdown();
            List<ButtonDto> buttons = this.surrogate.getButtons();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
            Iterator<T> it = buttons.iterator();
            while (it.hasNext()) {
                arrayList.add(((ButtonDto) it.next()).toProto());
            }
            return new ValidateCryptoOrderResponse.Web(title, description_markdown, arrayList, null, 8, null);
        }

        public String toString() {
            return "[WebDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof WebDto) && Intrinsics.areEqual(((WebDto) other).surrogate, this.surrogate);
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
        /* compiled from: ValidateCryptoOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0019R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b)\u0010#\u001a\u0004\b'\u0010(¨\u0006,"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto$Surrogate;", "", "", "title", "description_markdown", "", "Lrh_server_driven_ui/v1/ButtonDto;", CarResultComposable2.BUTTONS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription_markdown", "getDescription_markdown$annotations", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "getButtons$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            private final List<ButtonDto> buttons;
            private final String description_markdown;
            private final String title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$WebDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ValidateCryptoOrderResponseDto.WebDto.Surrogate._childSerializers$_anonymous_();
                }
            })};

            public Surrogate() {
                this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(ButtonDto.Serializer.INSTANCE);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description_markdown, surrogate.description_markdown) && Intrinsics.areEqual(this.buttons, surrogate.buttons);
            }

            public int hashCode() {
                return (((this.title.hashCode() * 31) + this.description_markdown.hashCode()) * 31) + this.buttons.hashCode();
            }

            public String toString() {
                return "Surrogate(title=" + this.title + ", description_markdown=" + this.description_markdown + ", buttons=" + this.buttons + ")";
            }

            /* compiled from: ValidateCryptoOrderResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return ValidateCryptoOrderResponseDto$WebDto$Surrogate$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.title = "";
                } else {
                    this.title = str;
                }
                if ((i & 2) == 0) {
                    this.description_markdown = "";
                } else {
                    this.description_markdown = str2;
                }
                if ((i & 4) == 0) {
                    this.buttons = CollectionsKt.emptyList();
                } else {
                    this.buttons = list;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                if (!Intrinsics.areEqual(self.title, "")) {
                    output.encodeStringElement(serialDesc, 0, self.title);
                }
                if (!Intrinsics.areEqual(self.description_markdown, "")) {
                    output.encodeStringElement(serialDesc, 1, self.description_markdown);
                }
                if (Intrinsics.areEqual(self.buttons, CollectionsKt.emptyList())) {
                    return;
                }
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.buttons);
            }

            public Surrogate(String title, String description_markdown, List<ButtonDto> buttons) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                this.title = title;
                this.description_markdown = description_markdown;
                this.buttons = buttons;
            }

            public /* synthetic */ Surrogate(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getDescription_markdown() {
                return this.description_markdown;
            }

            public final List<ButtonDto> getButtons() {
                return this.buttons;
            }
        }

        /* compiled from: ValidateCryptoOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponse$Web;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<WebDto, ValidateCryptoOrderResponse.Web> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<WebDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<WebDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<WebDto> getBinaryBase64Serializer() {
                return (KSerializer) WebDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ValidateCryptoOrderResponse.Web> getProtoAdapter() {
                return ValidateCryptoOrderResponse.Web.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public WebDto getZeroValue() {
                return WebDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public WebDto fromProto(ValidateCryptoOrderResponse.Web proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String title = proto.getTitle();
                String description_markdown = proto.getDescription_markdown();
                List<Button> buttons = proto.getButtons();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
                Iterator<T> it = buttons.iterator();
                while (it.hasNext()) {
                    arrayList.add(ButtonDto.INSTANCE.fromProto((Button) it.next()));
                }
                return new WebDto(new Surrogate(title, description_markdown, arrayList), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$WebDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ValidateCryptoOrderResponseDto.WebDto.binaryBase64Serializer_delegate$lambda$1();
                }
            });
            zeroValue = new WebDto(null, null, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ValidateCryptoOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<WebDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse.Web", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, WebDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public WebDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new WebDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: ValidateCryptoOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$WebDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto$WebDto";
            }
        }
    }

    /* compiled from: ValidateCryptoOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ValidateCryptoOrderResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ValidateCryptoOrderResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ValidateCryptoOrderResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ValidateCryptoOrderResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ValidateCryptoOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "contracts.crypto.trade.proto.v1.ValidateCryptoOrderResponseDto";
        }
    }
}
