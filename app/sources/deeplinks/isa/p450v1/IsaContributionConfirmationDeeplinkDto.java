package deeplinks.isa.p450v1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.DeeplinkMessage;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoDeeplinkCreator;
import com.robinhood.idl.DtoDeeplinkCreator2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDeeplink;
import com.robinhood.idl.RhDeeplinkSupportedUri;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.shared.app.type.AppType;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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

/* compiled from: IsaContributionConfirmationDeeplinkDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\u000f¨\u0006*"}, m3636d2 = {"Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto;", "Lcom/robinhood/idl/MessageDto;", "Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplink;", "Landroid/os/Parcelable;", "Lcom/robinhood/idl/DeeplinkMessage;", "Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto$Surrogate;", "surrogate", "<init>", "(Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto$Surrogate;)V", "", "contribution_id", "(Ljava/lang/String;)V", "toProto", "()Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplink;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/idl/RhDeeplinkSupportedUri;", "rhDeeplinkSupportedUri", "Landroid/net/Uri;", "encodeToUri", "(Lcom/robinhood/idl/RhDeeplinkSupportedUri;)Landroid/net/Uri;", "Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto$Surrogate;", "getContribution_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "deeplinks.isa_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@IdlDeeplink
@RhGenerated
/* loaded from: classes18.dex */
public final class IsaContributionConfirmationDeeplinkDto implements Dto3<IsaContributionConfirmationDeeplink>, Parcelable, DeeplinkMessage {

    @JvmField
    public static final Parcelable.Creator<IsaContributionConfirmationDeeplinkDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IsaContributionConfirmationDeeplinkDto, IsaContributionConfirmationDeeplink>> binaryBase64Serializer$delegate;
    private static final boolean deeplinkDeprecated = false;
    private static final boolean deeplinkRequireAuthentication;
    private static final String deeplinkRoute;
    private static final List<AppType> deeplinkSupportedAppTypes;
    private static final IsaContributionConfirmationDeeplinkDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IsaContributionConfirmationDeeplinkDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IsaContributionConfirmationDeeplinkDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getContribution_id() {
        return this.surrogate.getContribution_id();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IsaContributionConfirmationDeeplinkDto(String contribution_id) {
        this(new Surrogate(contribution_id));
        Intrinsics.checkNotNullParameter(contribution_id, "contribution_id");
    }

    public /* synthetic */ IsaContributionConfirmationDeeplinkDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public IsaContributionConfirmationDeeplink toProto() {
        return new IsaContributionConfirmationDeeplink(this.surrogate.getContribution_id(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[IsaContributionConfirmationDeeplinkDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IsaContributionConfirmationDeeplinkDto) && Intrinsics.areEqual(((IsaContributionConfirmationDeeplinkDto) other).surrogate, this.surrogate);
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
    /* compiled from: IsaContributionConfirmationDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015¨\u0006\""}, m3636d2 = {"Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto$Surrogate;", "", "", "contribution_id", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$deeplinks_isa_externalRelease", "(Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContribution_id", "getContribution_id$annotations", "()V", "Companion", "$serializer", "deeplinks.isa_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String contribution_id;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && Intrinsics.areEqual(this.contribution_id, ((Surrogate) other).contribution_id);
        }

        public int hashCode() {
            return this.contribution_id.hashCode();
        }

        public String toString() {
            return "Surrogate(contribution_id=" + this.contribution_id + ")";
        }

        /* compiled from: IsaContributionConfirmationDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto$Surrogate;", "deeplinks.isa_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IsaContributionConfirmationDeeplinkDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.contribution_id = "";
            } else {
                this.contribution_id = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$deeplinks_isa_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (Intrinsics.areEqual(self.contribution_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 0, self.contribution_id);
        }

        public Surrogate(String contribution_id) {
            Intrinsics.checkNotNullParameter(contribution_id, "contribution_id");
            this.contribution_id = contribution_id;
        }

        public final String getContribution_id() {
            return this.contribution_id;
        }

        public /* synthetic */ Surrogate(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    @Override // com.robinhood.idl.DeeplinkMessage
    public Uri encodeToUri(RhDeeplinkSupportedUri rhDeeplinkSupportedUri) {
        Intrinsics.checkNotNullParameter(rhDeeplinkSupportedUri, "rhDeeplinkSupportedUri");
        return DtoDeeplinkCreator2.encodeToUri(INSTANCE, this, rhDeeplinkSupportedUri);
    }

    /* compiled from: IsaContributionConfirmationDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0016J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto;", "Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplink;", "Lcom/robinhood/idl/DtoDeeplinkCreator;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "deeplinkRoute", "", "getDeeplinkRoute", "()Ljava/lang/String;", "deeplinkRequireAuthentication", "", "getDeeplinkRequireAuthentication", "()Z", "deeplinkDeprecated", "getDeeplinkDeprecated", "deeplinkSupportedAppTypes", "", "Lcom/robinhood/shared/app/type/AppType;", "getDeeplinkSupportedAppTypes", "()Ljava/util/List;", "fromProto", "proto", "serializer", "deeplinks.isa_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<IsaContributionConfirmationDeeplinkDto, IsaContributionConfirmationDeeplink>, DtoDeeplinkCreator<IsaContributionConfirmationDeeplinkDto> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public IsaContributionConfirmationDeeplinkDto decodeFromUri(Uri uri) {
            return (IsaContributionConfirmationDeeplinkDto) DtoDeeplinkCreator.DefaultImpls.decodeFromUri(this, uri);
        }

        public final KSerializer<IsaContributionConfirmationDeeplinkDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IsaContributionConfirmationDeeplinkDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IsaContributionConfirmationDeeplinkDto> getBinaryBase64Serializer() {
            return (KSerializer) IsaContributionConfirmationDeeplinkDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IsaContributionConfirmationDeeplink> getProtoAdapter() {
            return IsaContributionConfirmationDeeplink.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IsaContributionConfirmationDeeplinkDto getZeroValue() {
            return IsaContributionConfirmationDeeplinkDto.zeroValue;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public String getDeeplinkRoute() {
            return IsaContributionConfirmationDeeplinkDto.deeplinkRoute;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public boolean getDeeplinkRequireAuthentication() {
            return IsaContributionConfirmationDeeplinkDto.deeplinkRequireAuthentication;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public boolean getDeeplinkDeprecated() {
            return IsaContributionConfirmationDeeplinkDto.deeplinkDeprecated;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public List<AppType> getDeeplinkSupportedAppTypes() {
            return IsaContributionConfirmationDeeplinkDto.deeplinkSupportedAppTypes;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IsaContributionConfirmationDeeplinkDto fromProto(IsaContributionConfirmationDeeplink proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new IsaContributionConfirmationDeeplinkDto(new Surrogate(proto.getContribution_id()), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: deeplinks.isa.v1.IsaContributionConfirmationDeeplinkDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsaContributionConfirmationDeeplinkDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IsaContributionConfirmationDeeplinkDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
        deeplinkRoute = "isa_contribution_confirmation";
        deeplinkRequireAuthentication = true;
        deeplinkSupportedAppTypes = CollectionsKt.listOf(AppType.TRADER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IsaContributionConfirmationDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto;", "<init>", "()V", "surrogateSerializer", "Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "deeplinks.isa_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IsaContributionConfirmationDeeplinkDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/deeplinks.isa.v1.IsaContributionConfirmationDeeplink", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IsaContributionConfirmationDeeplinkDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IsaContributionConfirmationDeeplinkDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IsaContributionConfirmationDeeplinkDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IsaContributionConfirmationDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ldeeplinks/isa/v1/IsaContributionConfirmationDeeplinkDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "deeplinks.isa_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "deeplinks.isa.v1.IsaContributionConfirmationDeeplinkDto";
        }
    }
}
