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
import deeplinks.isa.p450v1.IsaUpdateDetailsDeeplinkDto;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ObjectSerializer;

/* compiled from: IsaUpdateDetailsDeeplinkDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#¨\u0006("}, m3636d2 = {"Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplinkDto;", "Lcom/robinhood/idl/MessageDto;", "Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplink;", "Landroid/os/Parcelable;", "Lcom/robinhood/idl/DeeplinkMessage;", "Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplinkDto$Surrogate;", "surrogate", "<init>", "(Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplinkDto$Surrogate;)V", "()V", "toProto", "()Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplink;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/idl/RhDeeplinkSupportedUri;", "rhDeeplinkSupportedUri", "Landroid/net/Uri;", "encodeToUri", "(Lcom/robinhood/idl/RhDeeplinkSupportedUri;)Landroid/net/Uri;", "Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplinkDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "deeplinks.isa_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@IdlDeeplink
@RhGenerated
/* loaded from: classes18.dex */
public final class IsaUpdateDetailsDeeplinkDto implements Dto3<IsaUpdateDetailsDeeplink>, Parcelable, DeeplinkMessage {

    @JvmField
    public static final Parcelable.Creator<IsaUpdateDetailsDeeplinkDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IsaUpdateDetailsDeeplinkDto, IsaUpdateDetailsDeeplink>> binaryBase64Serializer$delegate;
    private static final boolean deeplinkDeprecated = false;
    private static final boolean deeplinkRequireAuthentication;
    private static final String deeplinkRoute;
    private static final List<AppType> deeplinkSupportedAppTypes;
    private static final IsaUpdateDetailsDeeplinkDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IsaUpdateDetailsDeeplinkDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IsaUpdateDetailsDeeplinkDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public IsaUpdateDetailsDeeplinkDto() {
        this(Surrogate.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public IsaUpdateDetailsDeeplink toProto() {
        return new IsaUpdateDetailsDeeplink(null, 1, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[IsaUpdateDetailsDeeplinkDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IsaUpdateDetailsDeeplinkDto) && Intrinsics.areEqual(((IsaUpdateDetailsDeeplinkDto) other).surrogate, this.surrogate);
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

    @Override // com.robinhood.idl.DeeplinkMessage
    public Uri encodeToUri(RhDeeplinkSupportedUri rhDeeplinkSupportedUri) {
        Intrinsics.checkNotNullParameter(rhDeeplinkSupportedUri, "rhDeeplinkSupportedUri");
        return DtoDeeplinkCreator2.encodeToUri(INSTANCE, this, rhDeeplinkSupportedUri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IsaUpdateDetailsDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplinkDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "deeplinks.isa_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        public static final Surrogate INSTANCE = new Surrogate();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: deeplinks.isa.v1.IsaUpdateDetailsDeeplinkDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsaUpdateDetailsDeeplinkDto.Surrogate._init_$_anonymous_();
            }
        });

        public boolean equals(Object other) {
            return this == other || (other instanceof Surrogate);
        }

        public int hashCode() {
            return -1872088186;
        }

        public String toString() {
            return "Surrogate";
        }

        private Surrogate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new ObjectSerializer("deeplinks.isa.v1.IsaUpdateDetailsDeeplinkDto.Surrogate", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Surrogate> serializer() {
            return get$cachedSerializer();
        }
    }

    /* compiled from: IsaUpdateDetailsDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0016J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplinkDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplinkDto;", "Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplink;", "Lcom/robinhood/idl/DtoDeeplinkCreator;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplinkDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "deeplinkRoute", "", "getDeeplinkRoute", "()Ljava/lang/String;", "deeplinkRequireAuthentication", "", "getDeeplinkRequireAuthentication", "()Z", "deeplinkDeprecated", "getDeeplinkDeprecated", "deeplinkSupportedAppTypes", "", "Lcom/robinhood/shared/app/type/AppType;", "getDeeplinkSupportedAppTypes", "()Ljava/util/List;", "fromProto", "proto", "serializer", "deeplinks.isa_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<IsaUpdateDetailsDeeplinkDto, IsaUpdateDetailsDeeplink>, DtoDeeplinkCreator<IsaUpdateDetailsDeeplinkDto> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public IsaUpdateDetailsDeeplinkDto decodeFromUri(Uri uri) {
            return (IsaUpdateDetailsDeeplinkDto) DtoDeeplinkCreator.DefaultImpls.decodeFromUri(this, uri);
        }

        public final KSerializer<IsaUpdateDetailsDeeplinkDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IsaUpdateDetailsDeeplinkDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IsaUpdateDetailsDeeplinkDto> getBinaryBase64Serializer() {
            return (KSerializer) IsaUpdateDetailsDeeplinkDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IsaUpdateDetailsDeeplink> getProtoAdapter() {
            return IsaUpdateDetailsDeeplink.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IsaUpdateDetailsDeeplinkDto getZeroValue() {
            return IsaUpdateDetailsDeeplinkDto.zeroValue;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public String getDeeplinkRoute() {
            return IsaUpdateDetailsDeeplinkDto.deeplinkRoute;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public boolean getDeeplinkRequireAuthentication() {
            return IsaUpdateDetailsDeeplinkDto.deeplinkRequireAuthentication;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public boolean getDeeplinkDeprecated() {
            return IsaUpdateDetailsDeeplinkDto.deeplinkDeprecated;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public List<AppType> getDeeplinkSupportedAppTypes() {
            return IsaUpdateDetailsDeeplinkDto.deeplinkSupportedAppTypes;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IsaUpdateDetailsDeeplinkDto fromProto(IsaUpdateDetailsDeeplink proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new IsaUpdateDetailsDeeplinkDto();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: deeplinks.isa.v1.IsaUpdateDetailsDeeplinkDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsaUpdateDetailsDeeplinkDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IsaUpdateDetailsDeeplinkDto();
        CREATOR = new DtoParcelableCreator(companion);
        deeplinkRoute = "isa_update_details";
        deeplinkRequireAuthentication = true;
        deeplinkSupportedAppTypes = CollectionsKt.listOf(AppType.TRADER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IsaUpdateDetailsDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplinkDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplinkDto;", "<init>", "()V", "surrogateSerializer", "Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplinkDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "deeplinks.isa_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IsaUpdateDetailsDeeplinkDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/deeplinks.isa.v1.IsaUpdateDetailsDeeplink", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IsaUpdateDetailsDeeplinkDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IsaUpdateDetailsDeeplinkDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IsaUpdateDetailsDeeplinkDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IsaUpdateDetailsDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ldeeplinks/isa/v1/IsaUpdateDetailsDeeplinkDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "deeplinks.isa_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "deeplinks.isa.v1.IsaUpdateDetailsDeeplinkDto";
        }
    }
}
