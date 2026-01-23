package bonfire.proto.idl.crypto.p033v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.crypto.p033v1.GetNonCurrencyPairAccountSwitcherResponse;
import bonfire.proto.idl.crypto.p033v1.GetNonCurrencyPairAccountSwitcherResponseDto;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.models.crypto.p314db.home.CryptoHomeCtaButtons;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import kotlinx.serialization.internal.StringSerializer;
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.Icon;
import rh_server_driven_ui.p531v1.IconDto;
import rosetta.account.BrokerageAccountType;
import rosetta.account.BrokerageAccountTypeDto;
import rosetta.account.ManagementType;
import rosetta.account.ManagementTypeDto;

/* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007#\"$%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006)"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$Surrogate;)V", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto;", CryptoHomeCtaButtons.DEFAULT_ID, "(Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$Surrogate;", "getHome", "()Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto;", "Companion", "Surrogate", "NonCurrencyPairAccountSwitcherTypeDto", "NonCurrencyPairAccountSwitcherAccountDto", "NonCurrencyPairAccountSwitcherDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class GetNonCurrencyPairAccountSwitcherResponseDto implements Dto3<GetNonCurrencyPairAccountSwitcherResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetNonCurrencyPairAccountSwitcherResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetNonCurrencyPairAccountSwitcherResponseDto, GetNonCurrencyPairAccountSwitcherResponse>> binaryBase64Serializer$delegate;
    private static final GetNonCurrencyPairAccountSwitcherResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetNonCurrencyPairAccountSwitcherResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetNonCurrencyPairAccountSwitcherResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final NonCurrencyPairAccountSwitcherDto getHome() {
        return this.surrogate.getHome();
    }

    public GetNonCurrencyPairAccountSwitcherResponseDto(NonCurrencyPairAccountSwitcherDto nonCurrencyPairAccountSwitcherDto) {
        this(new Surrogate(nonCurrencyPairAccountSwitcherDto));
    }

    public /* synthetic */ GetNonCurrencyPairAccountSwitcherResponseDto(NonCurrencyPairAccountSwitcherDto nonCurrencyPairAccountSwitcherDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nonCurrencyPairAccountSwitcherDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetNonCurrencyPairAccountSwitcherResponse toProto() {
        NonCurrencyPairAccountSwitcherDto home = this.surrogate.getHome();
        return new GetNonCurrencyPairAccountSwitcherResponse(home != null ? home.toProto() : null, null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[GetNonCurrencyPairAccountSwitcherResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetNonCurrencyPairAccountSwitcherResponseDto) && Intrinsics.areEqual(((GetNonCurrencyPairAccountSwitcherResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$Surrogate;", "", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto;", CryptoHomeCtaButtons.DEFAULT_ID, "<init>", "(Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto;", "getHome", "()Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto;", "getHome$annotations", "()V", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NonCurrencyPairAccountSwitcherDto home;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((NonCurrencyPairAccountSwitcherDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && Intrinsics.areEqual(this.home, ((Surrogate) other).home);
        }

        public int hashCode() {
            NonCurrencyPairAccountSwitcherDto nonCurrencyPairAccountSwitcherDto = this.home;
            if (nonCurrencyPairAccountSwitcherDto == null) {
                return 0;
            }
            return nonCurrencyPairAccountSwitcherDto.hashCode();
        }

        public String toString() {
            return "Surrogate(home=" + this.home + ")";
        }

        /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetNonCurrencyPairAccountSwitcherResponseDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, NonCurrencyPairAccountSwitcherDto nonCurrencyPairAccountSwitcherDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.home = null;
            } else {
                this.home = nonCurrencyPairAccountSwitcherDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            NonCurrencyPairAccountSwitcherDto nonCurrencyPairAccountSwitcherDto = self.home;
            if (nonCurrencyPairAccountSwitcherDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, NonCurrencyPairAccountSwitcherDto.Serializer.INSTANCE, nonCurrencyPairAccountSwitcherDto);
            }
        }

        public Surrogate(NonCurrencyPairAccountSwitcherDto nonCurrencyPairAccountSwitcherDto) {
            this.home = nonCurrencyPairAccountSwitcherDto;
        }

        public /* synthetic */ Surrogate(NonCurrencyPairAccountSwitcherDto nonCurrencyPairAccountSwitcherDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : nonCurrencyPairAccountSwitcherDto);
        }

        public final NonCurrencyPairAccountSwitcherDto getHome() {
            return this.home;
        }
    }

    /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetNonCurrencyPairAccountSwitcherResponseDto, GetNonCurrencyPairAccountSwitcherResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetNonCurrencyPairAccountSwitcherResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetNonCurrencyPairAccountSwitcherResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetNonCurrencyPairAccountSwitcherResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetNonCurrencyPairAccountSwitcherResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetNonCurrencyPairAccountSwitcherResponse> getProtoAdapter() {
            return GetNonCurrencyPairAccountSwitcherResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetNonCurrencyPairAccountSwitcherResponseDto getZeroValue() {
            return GetNonCurrencyPairAccountSwitcherResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetNonCurrencyPairAccountSwitcherResponseDto fromProto(GetNonCurrencyPairAccountSwitcherResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher home = proto.getHome();
            return new GetNonCurrencyPairAccountSwitcherResponseDto(new Surrogate(home != null ? NonCurrencyPairAccountSwitcherDto.INSTANCE.fromProto(home) : null), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetNonCurrencyPairAccountSwitcherResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetNonCurrencyPairAccountSwitcherResponseDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED", "NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class NonCurrencyPairAccountSwitcherTypeDto implements Dto2<GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NonCurrencyPairAccountSwitcherTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<NonCurrencyPairAccountSwitcherTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<NonCurrencyPairAccountSwitcherTypeDto, GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType>> binaryBase64Serializer$delegate;
        public static final NonCurrencyPairAccountSwitcherTypeDto NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED = new NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED("NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED", 0);
        public static final NonCurrencyPairAccountSwitcherTypeDto NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME = new NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME("NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME", 1);

        private static final /* synthetic */ NonCurrencyPairAccountSwitcherTypeDto[] $values() {
            return new NonCurrencyPairAccountSwitcherTypeDto[]{NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED, NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME};
        }

        public /* synthetic */ NonCurrencyPairAccountSwitcherTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<NonCurrencyPairAccountSwitcherTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private NonCurrencyPairAccountSwitcherTypeDto(String str, int i) {
        }

        /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto.NonCurrencyPairAccountSwitcherTypeDto.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto;", "toProto", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherType;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED extends NonCurrencyPairAccountSwitcherTypeDto {
            NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType toProto() {
                return GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED;
            }
        }

        static {
            NonCurrencyPairAccountSwitcherTypeDto[] nonCurrencyPairAccountSwitcherTypeDtoArr$values = $values();
            $VALUES = nonCurrencyPairAccountSwitcherTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(nonCurrencyPairAccountSwitcherTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetNonCurrencyPairAccountSwitcherResponseDto.NonCurrencyPairAccountSwitcherTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto.NonCurrencyPairAccountSwitcherTypeDto.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto;", "toProto", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherType;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME extends NonCurrencyPairAccountSwitcherTypeDto {
            NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType toProto() {
                return GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<NonCurrencyPairAccountSwitcherTypeDto, GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType> {

            /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.values().length];
                    try {
                        iArr[GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NonCurrencyPairAccountSwitcherTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NonCurrencyPairAccountSwitcherTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NonCurrencyPairAccountSwitcherTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) NonCurrencyPairAccountSwitcherTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType> getProtoAdapter() {
                return GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NonCurrencyPairAccountSwitcherTypeDto getZeroValue() {
                return NonCurrencyPairAccountSwitcherTypeDto.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NonCurrencyPairAccountSwitcherTypeDto fromProto(GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return NonCurrencyPairAccountSwitcherTypeDto.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_UNSPECIFIED;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return NonCurrencyPairAccountSwitcherTypeDto.NON_CURRENCY_PAIR_ACCOUNT_SWITCHER_TYPE_HOME;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<NonCurrencyPairAccountSwitcherTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<NonCurrencyPairAccountSwitcherTypeDto, GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType", NonCurrencyPairAccountSwitcherTypeDto.getEntries(), NonCurrencyPairAccountSwitcherTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public NonCurrencyPairAccountSwitcherTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (NonCurrencyPairAccountSwitcherTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, NonCurrencyPairAccountSwitcherTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static NonCurrencyPairAccountSwitcherTypeDto valueOf(String str) {
            return (NonCurrencyPairAccountSwitcherTypeDto) Enum.valueOf(NonCurrencyPairAccountSwitcherTypeDto.class, str);
        }

        public static NonCurrencyPairAccountSwitcherTypeDto[] values() {
            return (NonCurrencyPairAccountSwitcherTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004>=?@B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0081\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u0006\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001eR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001eR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001eR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u00106R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0019\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006A"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherAccount;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto$Surrogate;)V", "", "rhf_account_number", "rhs_account_number", "crypto_account_id", "entry_title", "title", "subtitle", "Lrh_server_driven_ui/v1/IconDto;", "icon", "", "is_selectable", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementTypeDto;", "management_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;ZLrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;Lj$/time/Instant;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherAccount;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto$Surrogate;", "getRhf_account_number", "getRhs_account_number", "getCrypto_account_id", "getEntry_title", "getTitle", "getSubtitle", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "()Z", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getManagement_type", "()Lrosetta/account/ManagementTypeDto;", "getCreated_at", "()Lj$/time/Instant;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class NonCurrencyPairAccountSwitcherAccountDto implements Dto3<GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<NonCurrencyPairAccountSwitcherAccountDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<NonCurrencyPairAccountSwitcherAccountDto, GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount>> binaryBase64Serializer$delegate;
        private static final NonCurrencyPairAccountSwitcherAccountDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ NonCurrencyPairAccountSwitcherAccountDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private NonCurrencyPairAccountSwitcherAccountDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getRhf_account_number() {
            return this.surrogate.getRhf_account_number();
        }

        public final String getRhs_account_number() {
            return this.surrogate.getRhs_account_number();
        }

        public final String getCrypto_account_id() {
            return this.surrogate.getCrypto_account_id();
        }

        public final String getEntry_title() {
            return this.surrogate.getEntry_title();
        }

        public final String getTitle() {
            return this.surrogate.getTitle();
        }

        public final String getSubtitle() {
            return this.surrogate.getSubtitle();
        }

        public final IconDto getIcon() {
            return this.surrogate.getIcon();
        }

        public final boolean is_selectable() {
            return this.surrogate.getIs_selectable();
        }

        public final BrokerageAccountTypeDto getBrokerage_account_type() {
            return this.surrogate.getBrokerage_account_type();
        }

        public final ManagementTypeDto getManagement_type() {
            return this.surrogate.getManagement_type();
        }

        public final Instant getCreated_at() {
            return this.surrogate.getCreated_at();
        }

        public /* synthetic */ NonCurrencyPairAccountSwitcherAccountDto(String str, String str2, String str3, String str4, String str5, String str6, IconDto iconDto, boolean z, BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? IconDto.INSTANCE.getZeroValue() : iconDto, (i & 128) != 0 ? false : z, (i & 256) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 512) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 1024) != 0 ? null : instant);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public NonCurrencyPairAccountSwitcherAccountDto(String rhf_account_number, String rhs_account_number, String str, String entry_title, String title, String subtitle, IconDto icon, boolean z, BrokerageAccountTypeDto brokerage_account_type, ManagementTypeDto management_type, Instant instant) {
            this(new Surrogate(rhf_account_number, rhs_account_number, str, entry_title, title, subtitle, icon, z, brokerage_account_type, management_type, instant));
            Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(entry_title, "entry_title");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
            Intrinsics.checkNotNullParameter(management_type, "management_type");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount toProto() {
            return new GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount(this.surrogate.getRhf_account_number(), this.surrogate.getRhs_account_number(), this.surrogate.getCrypto_account_id(), this.surrogate.getEntry_title(), this.surrogate.getTitle(), this.surrogate.getSubtitle(), (Icon) this.surrogate.getIcon().toProto(), this.surrogate.getIs_selectable(), (BrokerageAccountType) this.surrogate.getBrokerage_account_type().toProto(), (ManagementType) this.surrogate.getManagement_type().toProto(), this.surrogate.getCreated_at(), null, 2048, null);
        }

        public String toString() {
            return "[NonCurrencyPairAccountSwitcherAccountDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof NonCurrencyPairAccountSwitcherAccountDto) && Intrinsics.areEqual(((NonCurrencyPairAccountSwitcherAccountDto) other).surrogate, this.surrogate);
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
        /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b.\b\u0083\b\u0018\u0000 O2\u00020\u0001:\u0002POB\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u0011j\u0013\u0018\u0001`\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u0015¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0087\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010(R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010(R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010(R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010(R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010(R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010(R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010<\u0012\u0004\b?\u00101\u001a\u0004\b=\u0010>R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010@\u0012\u0004\bB\u00101\u001a\u0004\b\f\u0010AR \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010C\u0012\u0004\bF\u00101\u001a\u0004\bD\u0010ER \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010G\u0012\u0004\bJ\u00101\u001a\u0004\bH\u0010IRF\u0010\u0016\u001a(\u0018\u00010\u0011j\u0013\u0018\u0001`\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u0015¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\t0\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010K\u0012\u0004\bN\u00101\u001a\u0004\bL\u0010M¨\u0006Q"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto$Surrogate;", "", "", "rhf_account_number", "rhs_account_number", "crypto_account_id", "entry_title", "title", "subtitle", "Lrh_server_driven_ui/v1/IconDto;", "icon", "", "is_selectable", "Lrosetta/account/BrokerageAccountTypeDto;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementTypeDto;", "management_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;ZLrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;ZLrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/ManagementTypeDto;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRhf_account_number", "getRhf_account_number$annotations", "()V", "getRhs_account_number", "getRhs_account_number$annotations", "getCrypto_account_id", "getCrypto_account_id$annotations", "getEntry_title", "getEntry_title$annotations", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "Lrh_server_driven_ui/v1/IconDto;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getIcon$annotations", "Z", "()Z", "is_selectable$annotations", "Lrosetta/account/BrokerageAccountTypeDto;", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getBrokerage_account_type$annotations", "Lrosetta/account/ManagementTypeDto;", "getManagement_type", "()Lrosetta/account/ManagementTypeDto;", "getManagement_type$annotations", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final BrokerageAccountTypeDto brokerage_account_type;
            private final Instant created_at;
            private final String crypto_account_id;
            private final String entry_title;
            private final IconDto icon;
            private final boolean is_selectable;
            private final ManagementTypeDto management_type;
            private final String rhf_account_number;
            private final String rhs_account_number;
            private final String subtitle;
            private final String title;

            public Surrogate() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (IconDto) null, false, (BrokerageAccountTypeDto) null, (ManagementTypeDto) null, (Instant) null, 2047, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.rhf_account_number, surrogate.rhf_account_number) && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && Intrinsics.areEqual(this.crypto_account_id, surrogate.crypto_account_id) && Intrinsics.areEqual(this.entry_title, surrogate.entry_title) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && this.icon == surrogate.icon && this.is_selectable == surrogate.is_selectable && this.brokerage_account_type == surrogate.brokerage_account_type && this.management_type == surrogate.management_type && Intrinsics.areEqual(this.created_at, surrogate.created_at);
            }

            public int hashCode() {
                int iHashCode = ((this.rhf_account_number.hashCode() * 31) + this.rhs_account_number.hashCode()) * 31;
                String str = this.crypto_account_id;
                int iHashCode2 = (((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.entry_title.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.icon.hashCode()) * 31) + Boolean.hashCode(this.is_selectable)) * 31) + this.brokerage_account_type.hashCode()) * 31) + this.management_type.hashCode()) * 31;
                Instant instant = this.created_at;
                return iHashCode2 + (instant != null ? instant.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(rhf_account_number=" + this.rhf_account_number + ", rhs_account_number=" + this.rhs_account_number + ", crypto_account_id=" + this.crypto_account_id + ", entry_title=" + this.entry_title + ", title=" + this.title + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ", is_selectable=" + this.is_selectable + ", brokerage_account_type=" + this.brokerage_account_type + ", management_type=" + this.management_type + ", created_at=" + this.created_at + ")";
            }

            /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return GetNonCurrencyPairAccountSwitcherResponseDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, IconDto iconDto, boolean z, BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, Instant instant, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.rhf_account_number = "";
                } else {
                    this.rhf_account_number = str;
                }
                if ((i & 2) == 0) {
                    this.rhs_account_number = "";
                } else {
                    this.rhs_account_number = str2;
                }
                if ((i & 4) == 0) {
                    this.crypto_account_id = null;
                } else {
                    this.crypto_account_id = str3;
                }
                if ((i & 8) == 0) {
                    this.entry_title = "";
                } else {
                    this.entry_title = str4;
                }
                if ((i & 16) == 0) {
                    this.title = "";
                } else {
                    this.title = str5;
                }
                if ((i & 32) == 0) {
                    this.subtitle = "";
                } else {
                    this.subtitle = str6;
                }
                if ((i & 64) == 0) {
                    this.icon = IconDto.INSTANCE.getZeroValue();
                } else {
                    this.icon = iconDto;
                }
                if ((i & 128) == 0) {
                    this.is_selectable = false;
                } else {
                    this.is_selectable = z;
                }
                if ((i & 256) == 0) {
                    this.brokerage_account_type = BrokerageAccountTypeDto.INSTANCE.getZeroValue();
                } else {
                    this.brokerage_account_type = brokerageAccountTypeDto;
                }
                if ((i & 512) == 0) {
                    this.management_type = ManagementTypeDto.INSTANCE.getZeroValue();
                } else {
                    this.management_type = managementTypeDto;
                }
                if ((i & 1024) == 0) {
                    this.created_at = null;
                } else {
                    this.created_at = instant;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.rhf_account_number, "")) {
                    output.encodeStringElement(serialDesc, 0, self.rhf_account_number);
                }
                if (!Intrinsics.areEqual(self.rhs_account_number, "")) {
                    output.encodeStringElement(serialDesc, 1, self.rhs_account_number);
                }
                String str = self.crypto_account_id;
                if (str != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
                }
                if (!Intrinsics.areEqual(self.entry_title, "")) {
                    output.encodeStringElement(serialDesc, 3, self.entry_title);
                }
                if (!Intrinsics.areEqual(self.title, "")) {
                    output.encodeStringElement(serialDesc, 4, self.title);
                }
                if (!Intrinsics.areEqual(self.subtitle, "")) {
                    output.encodeStringElement(serialDesc, 5, self.subtitle);
                }
                if (self.icon != IconDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 6, IconDto.Serializer.INSTANCE, self.icon);
                }
                boolean z = self.is_selectable;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 7, z);
                }
                if (self.brokerage_account_type != BrokerageAccountTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 8, BrokerageAccountTypeDto.Serializer.INSTANCE, self.brokerage_account_type);
                }
                if (self.management_type != ManagementTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 9, ManagementTypeDto.Serializer.INSTANCE, self.management_type);
                }
                Instant instant = self.created_at;
                if (instant != null) {
                    output.encodeNullableSerializableElement(serialDesc, 10, WireInstantSerializer.INSTANCE, instant);
                }
            }

            public Surrogate(String rhf_account_number, String rhs_account_number, String str, String entry_title, String title, String subtitle, IconDto icon, boolean z, BrokerageAccountTypeDto brokerage_account_type, ManagementTypeDto management_type, Instant instant) {
                Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
                Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
                Intrinsics.checkNotNullParameter(entry_title, "entry_title");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
                Intrinsics.checkNotNullParameter(management_type, "management_type");
                this.rhf_account_number = rhf_account_number;
                this.rhs_account_number = rhs_account_number;
                this.crypto_account_id = str;
                this.entry_title = entry_title;
                this.title = title;
                this.subtitle = subtitle;
                this.icon = icon;
                this.is_selectable = z;
                this.brokerage_account_type = brokerage_account_type;
                this.management_type = management_type;
                this.created_at = instant;
            }

            public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, IconDto iconDto, boolean z, BrokerageAccountTypeDto brokerageAccountTypeDto, ManagementTypeDto managementTypeDto, Instant instant, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? IconDto.INSTANCE.getZeroValue() : iconDto, (i & 128) != 0 ? false : z, (i & 256) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 512) != 0 ? ManagementTypeDto.INSTANCE.getZeroValue() : managementTypeDto, (i & 1024) != 0 ? null : instant);
            }

            public final String getRhf_account_number() {
                return this.rhf_account_number;
            }

            public final String getRhs_account_number() {
                return this.rhs_account_number;
            }

            public final String getCrypto_account_id() {
                return this.crypto_account_id;
            }

            public final String getEntry_title() {
                return this.entry_title;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final IconDto getIcon() {
                return this.icon;
            }

            /* renamed from: is_selectable, reason: from getter */
            public final boolean getIs_selectable() {
                return this.is_selectable;
            }

            public final BrokerageAccountTypeDto getBrokerage_account_type() {
                return this.brokerage_account_type;
            }

            public final ManagementTypeDto getManagement_type() {
                return this.management_type;
            }

            public final Instant getCreated_at() {
                return this.created_at;
            }
        }

        /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcherAccount;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<NonCurrencyPairAccountSwitcherAccountDto, GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NonCurrencyPairAccountSwitcherAccountDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NonCurrencyPairAccountSwitcherAccountDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NonCurrencyPairAccountSwitcherAccountDto> getBinaryBase64Serializer() {
                return (KSerializer) NonCurrencyPairAccountSwitcherAccountDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount> getProtoAdapter() {
                return GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NonCurrencyPairAccountSwitcherAccountDto getZeroValue() {
                return NonCurrencyPairAccountSwitcherAccountDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NonCurrencyPairAccountSwitcherAccountDto fromProto(GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new NonCurrencyPairAccountSwitcherAccountDto(new Surrogate(proto.getRhf_account_number(), proto.getRhs_account_number(), proto.getCrypto_account_id(), proto.getEntry_title(), proto.getTitle(), proto.getSubtitle(), IconDto.INSTANCE.fromProto(proto.getIcon()), proto.getIs_selectable(), BrokerageAccountTypeDto.INSTANCE.fromProto(proto.getBrokerage_account_type()), ManagementTypeDto.INSTANCE.fromProto(proto.getManagement_type()), proto.getCreated_at()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetNonCurrencyPairAccountSwitcherResponseDto.NonCurrencyPairAccountSwitcherAccountDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new NonCurrencyPairAccountSwitcherAccountDto(null, null, null, null, null, null, null, false, null, null, null, 2047, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<NonCurrencyPairAccountSwitcherAccountDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, NonCurrencyPairAccountSwitcherAccountDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public NonCurrencyPairAccountSwitcherAccountDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new NonCurrencyPairAccountSwitcherAccountDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4191_7)
            public final String provideIntoMap() {
                return "bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto";
            }
        }
    }

    /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
    @Serializable(with = Serializer.class)
    @RhGenerated
    @SourceDebugExtension
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*)+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u000f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014¨\u0006-"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcher;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto$Surrogate;)V", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto;", "type", "", "title", "", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto;", "accounts", "positive_button_text", "(Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcher;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto$Surrogate;", "getTitle", "getAccounts", "()Ljava/util/List;", "getPositive_button_text", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NonCurrencyPairAccountSwitcherDto implements Dto3<GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<NonCurrencyPairAccountSwitcherDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<NonCurrencyPairAccountSwitcherDto, GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher>> binaryBase64Serializer$delegate;
        private static final NonCurrencyPairAccountSwitcherDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ NonCurrencyPairAccountSwitcherDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private NonCurrencyPairAccountSwitcherDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getTitle() {
            return this.surrogate.getTitle();
        }

        public final List<NonCurrencyPairAccountSwitcherAccountDto> getAccounts() {
            return this.surrogate.getAccounts();
        }

        public final String getPositive_button_text() {
            return this.surrogate.getPositive_button_text();
        }

        public /* synthetic */ NonCurrencyPairAccountSwitcherDto(NonCurrencyPairAccountSwitcherTypeDto nonCurrencyPairAccountSwitcherTypeDto, String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? NonCurrencyPairAccountSwitcherTypeDto.INSTANCE.getZeroValue() : nonCurrencyPairAccountSwitcherTypeDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public NonCurrencyPairAccountSwitcherDto(NonCurrencyPairAccountSwitcherTypeDto type2, String title, List<NonCurrencyPairAccountSwitcherAccountDto> accounts2, String positive_button_text) {
            this(new Surrogate(type2, title, accounts2, positive_button_text));
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(accounts2, "accounts");
            Intrinsics.checkNotNullParameter(positive_button_text, "positive_button_text");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher toProto() {
            GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType nonCurrencyPairAccountSwitcherType = (GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherType) this.surrogate.getType().toProto();
            String title = this.surrogate.getTitle();
            List<NonCurrencyPairAccountSwitcherAccountDto> accounts2 = this.surrogate.getAccounts();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts2, 10));
            Iterator<T> it = accounts2.iterator();
            while (it.hasNext()) {
                arrayList.add(((NonCurrencyPairAccountSwitcherAccountDto) it.next()).toProto());
            }
            return new GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher(nonCurrencyPairAccountSwitcherType, title, arrayList, this.surrogate.getPositive_button_text(), null, 16, null);
        }

        public String toString() {
            return "[NonCurrencyPairAccountSwitcherDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof NonCurrencyPairAccountSwitcherDto) && Intrinsics.areEqual(((NonCurrencyPairAccountSwitcherDto) other).surrogate, this.surrogate);
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
        /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001bR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b-\u0010&\u001a\u0004\b+\u0010,R \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010'\u0012\u0004\b/\u0010&\u001a\u0004\b.\u0010\u001b¨\u00062"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto$Surrogate;", "", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto;", "type", "", "title", "", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherAccountDto;", "accounts", "positive_button_text", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto;", "getType", "()Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherTypeDto;", "getType$annotations", "()V", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "Ljava/util/List;", "getAccounts", "()Ljava/util/List;", "getAccounts$annotations", "getPositive_button_text", "getPositive_button_text$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            private final List<NonCurrencyPairAccountSwitcherAccountDto> accounts;
            private final String positive_button_text;
            private final String title;
            private final NonCurrencyPairAccountSwitcherTypeDto type;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetNonCurrencyPairAccountSwitcherResponseDto.NonCurrencyPairAccountSwitcherDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null};

            public Surrogate() {
                this((NonCurrencyPairAccountSwitcherTypeDto) null, (String) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(NonCurrencyPairAccountSwitcherAccountDto.Serializer.INSTANCE);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.type == surrogate.type && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.accounts, surrogate.accounts) && Intrinsics.areEqual(this.positive_button_text, surrogate.positive_button_text);
            }

            public int hashCode() {
                return (((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.accounts.hashCode()) * 31) + this.positive_button_text.hashCode();
            }

            public String toString() {
                return "Surrogate(type=" + this.type + ", title=" + this.title + ", accounts=" + this.accounts + ", positive_button_text=" + this.positive_button_text + ")";
            }

            /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return GetNonCurrencyPairAccountSwitcherResponseDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, NonCurrencyPairAccountSwitcherTypeDto nonCurrencyPairAccountSwitcherTypeDto, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                this.type = (i & 1) == 0 ? NonCurrencyPairAccountSwitcherTypeDto.INSTANCE.getZeroValue() : nonCurrencyPairAccountSwitcherTypeDto;
                if ((i & 2) == 0) {
                    this.title = "";
                } else {
                    this.title = str;
                }
                if ((i & 4) == 0) {
                    this.accounts = CollectionsKt.emptyList();
                } else {
                    this.accounts = list;
                }
                if ((i & 8) == 0) {
                    this.positive_button_text = "";
                } else {
                    this.positive_button_text = str2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                if (self.type != NonCurrencyPairAccountSwitcherTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, NonCurrencyPairAccountSwitcherTypeDto.Serializer.INSTANCE, self.type);
                }
                if (!Intrinsics.areEqual(self.title, "")) {
                    output.encodeStringElement(serialDesc, 1, self.title);
                }
                if (!Intrinsics.areEqual(self.accounts, CollectionsKt.emptyList())) {
                    output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.accounts);
                }
                if (Intrinsics.areEqual(self.positive_button_text, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 3, self.positive_button_text);
            }

            public Surrogate(NonCurrencyPairAccountSwitcherTypeDto type2, String title, List<NonCurrencyPairAccountSwitcherAccountDto> accounts2, String positive_button_text) {
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                Intrinsics.checkNotNullParameter(positive_button_text, "positive_button_text");
                this.type = type2;
                this.title = title;
                this.accounts = accounts2;
                this.positive_button_text = positive_button_text;
            }

            public final NonCurrencyPairAccountSwitcherTypeDto getType() {
                return this.type;
            }

            public /* synthetic */ Surrogate(NonCurrencyPairAccountSwitcherTypeDto nonCurrencyPairAccountSwitcherTypeDto, String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? NonCurrencyPairAccountSwitcherTypeDto.INSTANCE.getZeroValue() : nonCurrencyPairAccountSwitcherTypeDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str2);
            }

            public final String getTitle() {
                return this.title;
            }

            public final List<NonCurrencyPairAccountSwitcherAccountDto> getAccounts() {
                return this.accounts;
            }

            public final String getPositive_button_text() {
                return this.positive_button_text;
            }
        }

        /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponse$NonCurrencyPairAccountSwitcher;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<NonCurrencyPairAccountSwitcherDto, GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NonCurrencyPairAccountSwitcherDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NonCurrencyPairAccountSwitcherDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NonCurrencyPairAccountSwitcherDto> getBinaryBase64Serializer() {
                return (KSerializer) NonCurrencyPairAccountSwitcherDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher> getProtoAdapter() {
                return GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NonCurrencyPairAccountSwitcherDto getZeroValue() {
                return NonCurrencyPairAccountSwitcherDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NonCurrencyPairAccountSwitcherDto fromProto(GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                NonCurrencyPairAccountSwitcherTypeDto nonCurrencyPairAccountSwitcherTypeDtoFromProto = NonCurrencyPairAccountSwitcherTypeDto.INSTANCE.fromProto(proto.getType());
                String title = proto.getTitle();
                List<GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount> accounts2 = proto.getAccounts();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(accounts2, 10));
                Iterator<T> it = accounts2.iterator();
                while (it.hasNext()) {
                    arrayList.add(NonCurrencyPairAccountSwitcherAccountDto.INSTANCE.fromProto((GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcherAccount) it.next()));
                }
                return new NonCurrencyPairAccountSwitcherDto(new Surrogate(nonCurrencyPairAccountSwitcherTypeDtoFromProto, title, arrayList, proto.getPositive_button_text()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetNonCurrencyPairAccountSwitcherResponseDto.NonCurrencyPairAccountSwitcherDto.binaryBase64Serializer_delegate$lambda$1();
                }
            });
            zeroValue = new NonCurrencyPairAccountSwitcherDto(null, null, null, null, 15, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<NonCurrencyPairAccountSwitcherDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponse.NonCurrencyPairAccountSwitcher", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, NonCurrencyPairAccountSwitcherDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public NonCurrencyPairAccountSwitcherDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new NonCurrencyPairAccountSwitcherDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4190_6)
            public final String provideIntoMap() {
                return "bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponseDto$NonCurrencyPairAccountSwitcherDto";
            }
        }
    }

    /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetNonCurrencyPairAccountSwitcherResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetNonCurrencyPairAccountSwitcherResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetNonCurrencyPairAccountSwitcherResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetNonCurrencyPairAccountSwitcherResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetNonCurrencyPairAccountSwitcherResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetNonCurrencyPairAccountSwitcherResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.crypto.v1.GetNonCurrencyPairAccountSwitcherResponseDto";
        }
    }
}
