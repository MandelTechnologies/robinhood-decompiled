package black_widow_bff.service.p026v1;

import android.os.Parcel;
import android.os.Parcelable;
import black_widow_bff.model.p025v1.MobileAppChartUpdateAction;
import black_widow_bff.model.p025v1.MobileAppChartUpdateActionDto;
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

/* compiled from: MobileAppChartVersionResponseDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0011R\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0011¨\u0006*"}, m3636d2 = {"Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lblack_widow_bff/service/v1/MobileAppChartVersionResponse;", "Landroid/os/Parcelable;", "Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto$Surrogate;", "surrogate", "<init>", "(Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto$Surrogate;)V", "Lblack_widow_bff/model/v1/MobileAppChartUpdateActionDto;", "action", "", "chart_url", "chart_version", "(Lblack_widow_bff/model/v1/MobileAppChartUpdateActionDto;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lblack_widow_bff/service/v1/MobileAppChartVersionResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto$Surrogate;", "getAction", "()Lblack_widow_bff/model/v1/MobileAppChartUpdateActionDto;", "getChart_url", "getChart_version", "Companion", "Surrogate", "Serializer", "MultibindingModule", "black_widow_bff.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class MobileAppChartVersionResponseDto implements Dto3<MobileAppChartVersionResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MobileAppChartVersionResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MobileAppChartVersionResponseDto, MobileAppChartVersionResponse>> binaryBase64Serializer$delegate;
    private static final MobileAppChartVersionResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MobileAppChartVersionResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MobileAppChartVersionResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MobileAppChartUpdateActionDto getAction() {
        return this.surrogate.getAction();
    }

    public final String getChart_url() {
        return this.surrogate.getChart_url();
    }

    public final String getChart_version() {
        return this.surrogate.getChart_version();
    }

    public /* synthetic */ MobileAppChartVersionResponseDto(MobileAppChartUpdateActionDto mobileAppChartUpdateActionDto, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MobileAppChartUpdateActionDto.INSTANCE.getZeroValue() : mobileAppChartUpdateActionDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MobileAppChartVersionResponseDto(MobileAppChartUpdateActionDto action, String chart_url, String chart_version) {
        this(new Surrogate(action, chart_url, chart_version));
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(chart_url, "chart_url");
        Intrinsics.checkNotNullParameter(chart_version, "chart_version");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public MobileAppChartVersionResponse toProto() {
        return new MobileAppChartVersionResponse((MobileAppChartUpdateAction) this.surrogate.getAction().toProto(), this.surrogate.getChart_url(), this.surrogate.getChart_version(), null, 8, null);
    }

    public String toString() {
        return "[MobileAppChartVersionResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MobileAppChartVersionResponseDto) && Intrinsics.areEqual(((MobileAppChartVersionResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: MobileAppChartVersionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\u0018R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u0018¨\u0006+"}, m3636d2 = {"Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto$Surrogate;", "", "Lblack_widow_bff/model/v1/MobileAppChartUpdateActionDto;", "action", "", "chart_url", "chart_version", "<init>", "(Lblack_widow_bff/model/v1/MobileAppChartUpdateActionDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILblack_widow_bff/model/v1/MobileAppChartUpdateActionDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$black_widow_bff_service_v1_externalRelease", "(Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow_bff/model/v1/MobileAppChartUpdateActionDto;", "getAction", "()Lblack_widow_bff/model/v1/MobileAppChartUpdateActionDto;", "getAction$annotations", "()V", "Ljava/lang/String;", "getChart_url", "getChart_url$annotations", "getChart_version", "getChart_version$annotations", "Companion", "$serializer", "black_widow_bff.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MobileAppChartUpdateActionDto action;
        private final String chart_url;
        private final String chart_version;

        public Surrogate() {
            this((MobileAppChartUpdateActionDto) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.action == surrogate.action && Intrinsics.areEqual(this.chart_url, surrogate.chart_url) && Intrinsics.areEqual(this.chart_version, surrogate.chart_version);
        }

        public int hashCode() {
            return (((this.action.hashCode() * 31) + this.chart_url.hashCode()) * 31) + this.chart_version.hashCode();
        }

        public String toString() {
            return "Surrogate(action=" + this.action + ", chart_url=" + this.chart_url + ", chart_version=" + this.chart_version + ")";
        }

        /* compiled from: MobileAppChartVersionResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto$Surrogate;", "black_widow_bff.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MobileAppChartVersionResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MobileAppChartUpdateActionDto mobileAppChartUpdateActionDto, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.action = (i & 1) == 0 ? MobileAppChartUpdateActionDto.INSTANCE.getZeroValue() : mobileAppChartUpdateActionDto;
            if ((i & 2) == 0) {
                this.chart_url = "";
            } else {
                this.chart_url = str;
            }
            if ((i & 4) == 0) {
                this.chart_version = "";
            } else {
                this.chart_version = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$black_widow_bff_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.action != MobileAppChartUpdateActionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, MobileAppChartUpdateActionDto.Serializer.INSTANCE, self.action);
            }
            if (!Intrinsics.areEqual(self.chart_url, "")) {
                output.encodeStringElement(serialDesc, 1, self.chart_url);
            }
            if (Intrinsics.areEqual(self.chart_version, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 2, self.chart_version);
        }

        public Surrogate(MobileAppChartUpdateActionDto action, String chart_url, String chart_version) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(chart_url, "chart_url");
            Intrinsics.checkNotNullParameter(chart_version, "chart_version");
            this.action = action;
            this.chart_url = chart_url;
            this.chart_version = chart_version;
        }

        public final MobileAppChartUpdateActionDto getAction() {
            return this.action;
        }

        public /* synthetic */ Surrogate(MobileAppChartUpdateActionDto mobileAppChartUpdateActionDto, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MobileAppChartUpdateActionDto.INSTANCE.getZeroValue() : mobileAppChartUpdateActionDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
        }

        public final String getChart_url() {
            return this.chart_url;
        }

        public final String getChart_version() {
            return this.chart_version;
        }
    }

    /* compiled from: MobileAppChartVersionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto;", "Lblack_widow_bff/service/v1/MobileAppChartVersionResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "black_widow_bff.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<MobileAppChartVersionResponseDto, MobileAppChartVersionResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MobileAppChartVersionResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MobileAppChartVersionResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MobileAppChartVersionResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) MobileAppChartVersionResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MobileAppChartVersionResponse> getProtoAdapter() {
            return MobileAppChartVersionResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MobileAppChartVersionResponseDto getZeroValue() {
            return MobileAppChartVersionResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MobileAppChartVersionResponseDto fromProto(MobileAppChartVersionResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new MobileAppChartVersionResponseDto(new Surrogate(MobileAppChartUpdateActionDto.INSTANCE.fromProto(proto.getAction()), proto.getChart_url(), proto.getChart_version()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: black_widow_bff.service.v1.MobileAppChartVersionResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobileAppChartVersionResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MobileAppChartVersionResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MobileAppChartVersionResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto;", "<init>", "()V", "surrogateSerializer", "Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "black_widow_bff.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MobileAppChartVersionResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/black_widow_bff.service.v1.MobileAppChartVersionResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MobileAppChartVersionResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MobileAppChartVersionResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MobileAppChartVersionResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MobileAppChartVersionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lblack_widow_bff/service/v1/MobileAppChartVersionResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "black_widow_bff.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "black_widow_bff.service.v1.MobileAppChartVersionResponseDto";
        }
    }
}
