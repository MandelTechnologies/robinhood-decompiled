package bff_vitals.service.p021v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_vitals.service.p021v1.FetchVitalsRequest;
import bff_vitals.service.p021v1.FetchVitalsRequestDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: FetchVitalsRequestDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006+*,-./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0013¨\u00060"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_vitals/service/v1/FetchVitalsRequest;", "Landroid/os/Parcelable;", "Lbff_vitals/service/v1/FetchVitalsRequestDto$Surrogate;", "surrogate", "<init>", "(Lbff_vitals/service/v1/FetchVitalsRequestDto$Surrogate;)V", "Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;", "platform", "Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "app", "", "os_version", "app_version", "(Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lbff_vitals/service/v1/FetchVitalsRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_vitals/service/v1/FetchVitalsRequestDto$Surrogate;", "getPlatform", "()Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;", "getApp", "()Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "getOs_version", "getApp_version", "Companion", "Surrogate", "PlatformDto", "AppDto", "Serializer", "MultibindingModule", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class FetchVitalsRequestDto implements Dto3<FetchVitalsRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FetchVitalsRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FetchVitalsRequestDto, FetchVitalsRequest>> binaryBase64Serializer$delegate;
    private static final FetchVitalsRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FetchVitalsRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FetchVitalsRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final PlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final AppDto getApp() {
        return this.surrogate.getApp();
    }

    public final String getOs_version() {
        return this.surrogate.getOs_version();
    }

    public final String getApp_version() {
        return this.surrogate.getApp_version();
    }

    public /* synthetic */ FetchVitalsRequestDto(PlatformDto platformDto, AppDto appDto, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PlatformDto.INSTANCE.getZeroValue() : platformDto, (i & 2) != 0 ? AppDto.INSTANCE.getZeroValue() : appDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FetchVitalsRequestDto(PlatformDto platform, AppDto app, String os_version, String app_version) {
        this(new Surrogate(platform, app, os_version, app_version));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FetchVitalsRequest toProto() {
        return new FetchVitalsRequest((FetchVitalsRequest.Platform) this.surrogate.getPlatform().toProto(), (FetchVitalsRequest.App) this.surrogate.getApp().toProto(), this.surrogate.getOs_version(), this.surrogate.getApp_version(), null, 16, null);
    }

    public String toString() {
        return "[FetchVitalsRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FetchVitalsRequestDto) && Intrinsics.areEqual(((FetchVitalsRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: FetchVitalsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b,\u0010%\u001a\u0004\b+\u0010\u001aR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010\u001a¨\u00061"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequestDto$Surrogate;", "", "Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;", "platform", "Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "app", "", "os_version", "app_version", "<init>", "(Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_vitals_v1_externalRelease", "(Lbff_vitals/service/v1/FetchVitalsRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;", "getPlatform", "()Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;", "getPlatform$annotations", "()V", "Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "getApp", "()Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "getApp$annotations", "Ljava/lang/String;", "getOs_version", "getOs_version$annotations", "getApp_version", "getApp_version$annotations", "Companion", "$serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AppDto app;
        private final String app_version;
        private final String os_version;
        private final PlatformDto platform;

        public Surrogate() {
            this((PlatformDto) null, (AppDto) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && this.app == surrogate.app && Intrinsics.areEqual(this.os_version, surrogate.os_version) && Intrinsics.areEqual(this.app_version, surrogate.app_version);
        }

        public int hashCode() {
            return (((((this.platform.hashCode() * 31) + this.app.hashCode()) * 31) + this.os_version.hashCode()) * 31) + this.app_version.hashCode();
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", app=" + this.app + ", os_version=" + this.os_version + ", app_version=" + this.app_version + ")";
        }

        /* compiled from: FetchVitalsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsRequestDto$Surrogate;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FetchVitalsRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, PlatformDto platformDto, AppDto appDto, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? PlatformDto.INSTANCE.getZeroValue() : platformDto;
            if ((i & 2) == 0) {
                this.app = AppDto.INSTANCE.getZeroValue();
            } else {
                this.app = appDto;
            }
            if ((i & 4) == 0) {
                this.os_version = "";
            } else {
                this.os_version = str;
            }
            if ((i & 8) == 0) {
                this.app_version = "";
            } else {
                this.app_version = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_vitals_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.platform != PlatformDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, PlatformDto.Serializer.INSTANCE, self.platform);
            }
            if (self.app != AppDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, AppDto.Serializer.INSTANCE, self.app);
            }
            if (!Intrinsics.areEqual(self.os_version, "")) {
                output.encodeStringElement(serialDesc, 2, self.os_version);
            }
            if (Intrinsics.areEqual(self.app_version, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.app_version);
        }

        public Surrogate(PlatformDto platform, AppDto app, String os_version, String app_version) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(os_version, "os_version");
            Intrinsics.checkNotNullParameter(app_version, "app_version");
            this.platform = platform;
            this.app = app;
            this.os_version = os_version;
            this.app_version = app_version;
        }

        public final PlatformDto getPlatform() {
            return this.platform;
        }

        public /* synthetic */ Surrogate(PlatformDto platformDto, AppDto appDto, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? PlatformDto.INSTANCE.getZeroValue() : platformDto, (i & 2) != 0 ? AppDto.INSTANCE.getZeroValue() : appDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
        }

        public final AppDto getApp() {
            return this.app;
        }

        public final String getOs_version() {
            return this.os_version;
        }

        public final String getApp_version() {
            return this.app_version;
        }
    }

    /* compiled from: FetchVitalsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_vitals/service/v1/FetchVitalsRequestDto;", "Lbff_vitals/service/v1/FetchVitalsRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_vitals/service/v1/FetchVitalsRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<FetchVitalsRequestDto, FetchVitalsRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FetchVitalsRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FetchVitalsRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FetchVitalsRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) FetchVitalsRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FetchVitalsRequest> getProtoAdapter() {
            return FetchVitalsRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FetchVitalsRequestDto getZeroValue() {
            return FetchVitalsRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FetchVitalsRequestDto fromProto(FetchVitalsRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new FetchVitalsRequestDto(new Surrogate(PlatformDto.INSTANCE.fromProto(proto.getPlatform()), AppDto.INSTANCE.fromProto(proto.getApp()), proto.getOs_version(), proto.getApp_version()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_vitals.service.v1.FetchVitalsRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FetchVitalsRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FetchVitalsRequestDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FetchVitalsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;", "Lcom/robinhood/idl/EnumDto;", "Lbff_vitals/service/v1/FetchVitalsRequest$Platform;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "PLATFORM_UNSPECIFIED", "PLATFORM_ANDROID", "PLATFORM_IOS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PlatformDto implements Dto2<FetchVitalsRequest.Platform>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PlatformDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<PlatformDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PlatformDto, FetchVitalsRequest.Platform>> binaryBase64Serializer$delegate;
        public static final PlatformDto PLATFORM_UNSPECIFIED = new PLATFORM_UNSPECIFIED("PLATFORM_UNSPECIFIED", 0);
        public static final PlatformDto PLATFORM_ANDROID = new PLATFORM_ANDROID("PLATFORM_ANDROID", 1);
        public static final PlatformDto PLATFORM_IOS = new PLATFORM_IOS("PLATFORM_IOS", 2);

        private static final /* synthetic */ PlatformDto[] $values() {
            return new PlatformDto[]{PLATFORM_UNSPECIFIED, PLATFORM_ANDROID, PLATFORM_IOS};
        }

        public /* synthetic */ PlatformDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<PlatformDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: FetchVitalsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bff_vitals/service/v1/FetchVitalsRequestDto.PlatformDto.PLATFORM_UNSPECIFIED", "Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;", "toProto", "Lbff_vitals/service/v1/FetchVitalsRequest$Platform;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PLATFORM_UNSPECIFIED extends PlatformDto {
            PLATFORM_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FetchVitalsRequest.Platform toProto() {
                return FetchVitalsRequest.Platform.PLATFORM_UNSPECIFIED;
            }
        }

        private PlatformDto(String str, int i) {
        }

        static {
            PlatformDto[] platformDtoArr$values = $values();
            $VALUES = platformDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(platformDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_vitals.service.v1.FetchVitalsRequestDto$PlatformDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FetchVitalsRequestDto.PlatformDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: FetchVitalsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bff_vitals/service/v1/FetchVitalsRequestDto.PlatformDto.PLATFORM_ANDROID", "Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;", "toProto", "Lbff_vitals/service/v1/FetchVitalsRequest$Platform;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PLATFORM_ANDROID extends PlatformDto {
            PLATFORM_ANDROID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FetchVitalsRequest.Platform toProto() {
                return FetchVitalsRequest.Platform.PLATFORM_ANDROID;
            }
        }

        /* compiled from: FetchVitalsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bff_vitals/service/v1/FetchVitalsRequestDto.PlatformDto.PLATFORM_IOS", "Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;", "toProto", "Lbff_vitals/service/v1/FetchVitalsRequest$Platform;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PLATFORM_IOS extends PlatformDto {
            PLATFORM_IOS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FetchVitalsRequest.Platform toProto() {
                return FetchVitalsRequest.Platform.PLATFORM_IOS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: FetchVitalsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;", "Lbff_vitals/service/v1/FetchVitalsRequest$Platform;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<PlatformDto, FetchVitalsRequest.Platform> {

            /* compiled from: FetchVitalsRequestDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes16.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FetchVitalsRequest.Platform.values().length];
                    try {
                        iArr[FetchVitalsRequest.Platform.PLATFORM_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FetchVitalsRequest.Platform.PLATFORM_ANDROID.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FetchVitalsRequest.Platform.PLATFORM_IOS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PlatformDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PlatformDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PlatformDto> getBinaryBase64Serializer() {
                return (KSerializer) PlatformDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FetchVitalsRequest.Platform> getProtoAdapter() {
                return FetchVitalsRequest.Platform.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PlatformDto getZeroValue() {
                return PlatformDto.PLATFORM_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PlatformDto fromProto(FetchVitalsRequest.Platform proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return PlatformDto.PLATFORM_UNSPECIFIED;
                }
                if (i == 2) {
                    return PlatformDto.PLATFORM_ANDROID;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return PlatformDto.PLATFORM_IOS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FetchVitalsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsRequestDto$PlatformDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public static final class Serializer implements KSerializer<PlatformDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<PlatformDto, FetchVitalsRequest.Platform> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bff_vitals.service.v1.FetchVitalsRequest.Platform", PlatformDto.getEntries(), PlatformDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public PlatformDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (PlatformDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PlatformDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static PlatformDto valueOf(String str) {
            return (PlatformDto) Enum.valueOf(PlatformDto.class, str);
        }

        public static PlatformDto[] values() {
            return (PlatformDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FetchVitalsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "Lcom/robinhood/idl/EnumDto;", "Lbff_vitals/service/v1/FetchVitalsRequest$App;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "APP_UNSPECIFIED", "APP_ROBINHOOD_TRADER", "APP_ROBINHOOD_WALLET", "APP_ROBINHOOD_GLOBAL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AppDto implements Dto2<FetchVitalsRequest.App>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AppDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AppDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AppDto, FetchVitalsRequest.App>> binaryBase64Serializer$delegate;
        public static final AppDto APP_UNSPECIFIED = new APP_UNSPECIFIED("APP_UNSPECIFIED", 0);
        public static final AppDto APP_ROBINHOOD_TRADER = new APP_ROBINHOOD_TRADER("APP_ROBINHOOD_TRADER", 1);
        public static final AppDto APP_ROBINHOOD_WALLET = new APP_ROBINHOOD_WALLET("APP_ROBINHOOD_WALLET", 2);
        public static final AppDto APP_ROBINHOOD_GLOBAL = new APP_ROBINHOOD_GLOBAL("APP_ROBINHOOD_GLOBAL", 3);

        private static final /* synthetic */ AppDto[] $values() {
            return new AppDto[]{APP_UNSPECIFIED, APP_ROBINHOOD_TRADER, APP_ROBINHOOD_WALLET, APP_ROBINHOOD_GLOBAL};
        }

        public /* synthetic */ AppDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AppDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: FetchVitalsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bff_vitals/service/v1/FetchVitalsRequestDto.AppDto.APP_UNSPECIFIED", "Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "toProto", "Lbff_vitals/service/v1/FetchVitalsRequest$App;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APP_UNSPECIFIED extends AppDto {
            APP_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FetchVitalsRequest.App toProto() {
                return FetchVitalsRequest.App.APP_UNSPECIFIED;
            }
        }

        private AppDto(String str, int i) {
        }

        static {
            AppDto[] appDtoArr$values = $values();
            $VALUES = appDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(appDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_vitals.service.v1.FetchVitalsRequestDto$AppDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FetchVitalsRequestDto.AppDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: FetchVitalsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bff_vitals/service/v1/FetchVitalsRequestDto.AppDto.APP_ROBINHOOD_TRADER", "Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "toProto", "Lbff_vitals/service/v1/FetchVitalsRequest$App;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APP_ROBINHOOD_TRADER extends AppDto {
            APP_ROBINHOOD_TRADER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FetchVitalsRequest.App toProto() {
                return FetchVitalsRequest.App.APP_ROBINHOOD_TRADER;
            }
        }

        /* compiled from: FetchVitalsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bff_vitals/service/v1/FetchVitalsRequestDto.AppDto.APP_ROBINHOOD_WALLET", "Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "toProto", "Lbff_vitals/service/v1/FetchVitalsRequest$App;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APP_ROBINHOOD_WALLET extends AppDto {
            APP_ROBINHOOD_WALLET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FetchVitalsRequest.App toProto() {
                return FetchVitalsRequest.App.APP_ROBINHOOD_WALLET;
            }
        }

        /* compiled from: FetchVitalsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bff_vitals/service/v1/FetchVitalsRequestDto.AppDto.APP_ROBINHOOD_GLOBAL", "Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "toProto", "Lbff_vitals/service/v1/FetchVitalsRequest$App;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APP_ROBINHOOD_GLOBAL extends AppDto {
            APP_ROBINHOOD_GLOBAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FetchVitalsRequest.App toProto() {
                return FetchVitalsRequest.App.APP_ROBINHOOD_GLOBAL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: FetchVitalsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "Lbff_vitals/service/v1/FetchVitalsRequest$App;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AppDto, FetchVitalsRequest.App> {

            /* compiled from: FetchVitalsRequestDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes16.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FetchVitalsRequest.App.values().length];
                    try {
                        iArr[FetchVitalsRequest.App.APP_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FetchVitalsRequest.App.APP_ROBINHOOD_TRADER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FetchVitalsRequest.App.APP_ROBINHOOD_WALLET.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[FetchVitalsRequest.App.APP_ROBINHOOD_GLOBAL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AppDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AppDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AppDto> getBinaryBase64Serializer() {
                return (KSerializer) AppDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FetchVitalsRequest.App> getProtoAdapter() {
                return FetchVitalsRequest.App.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AppDto getZeroValue() {
                return AppDto.APP_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AppDto fromProto(FetchVitalsRequest.App proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AppDto.APP_UNSPECIFIED;
                }
                if (i == 2) {
                    return AppDto.APP_ROBINHOOD_TRADER;
                }
                if (i == 3) {
                    return AppDto.APP_ROBINHOOD_WALLET;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return AppDto.APP_ROBINHOOD_GLOBAL;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FetchVitalsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsRequestDto$AppDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public static final class Serializer implements KSerializer<AppDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AppDto, FetchVitalsRequest.App> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bff_vitals.service.v1.FetchVitalsRequest.App", AppDto.getEntries(), AppDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AppDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AppDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AppDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AppDto valueOf(String str) {
            return (AppDto) Enum.valueOf(AppDto.class, str);
        }

        public static AppDto[] values() {
            return (AppDto[]) $VALUES.clone();
        }
    }

    /* compiled from: FetchVitalsRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_vitals/service/v1/FetchVitalsRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbff_vitals/service/v1/FetchVitalsRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<FetchVitalsRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_vitals.service.v1.FetchVitalsRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FetchVitalsRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FetchVitalsRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FetchVitalsRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FetchVitalsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_vitals/service/v1/FetchVitalsRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff.vitals.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bff_vitals.service.v1.FetchVitalsRequestDto";
        }
    }
}
