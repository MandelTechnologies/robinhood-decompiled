package bonfire.proto.idl.copilot.p032v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.copilot.p032v1.PortfolioDigestDetailDto;
import bonfire.proto.idl.copilot.p032v1.PortfolioDigestPreviewDto;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.models.api.ErrorResponse;
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

/* compiled from: PortfolioDigestHasOnboardedDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboarded;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto$Surrogate;)V", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto;", ErrorResponse.DETAIL, "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto;)V", "toProto", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboarded;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto$Surrogate;", "getPreview", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;", "getDetail", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class PortfolioDigestHasOnboardedDto implements Dto3<PortfolioDigestHasOnboarded>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PortfolioDigestHasOnboardedDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PortfolioDigestHasOnboardedDto, PortfolioDigestHasOnboarded>> binaryBase64Serializer$delegate;
    private static final PortfolioDigestHasOnboardedDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PortfolioDigestHasOnboardedDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PortfolioDigestHasOnboardedDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final PortfolioDigestPreviewDto getPreview() {
        return this.surrogate.getPreview();
    }

    public final PortfolioDigestDetailDto getDetail() {
        return this.surrogate.getDetail();
    }

    public PortfolioDigestHasOnboardedDto(PortfolioDigestPreviewDto portfolioDigestPreviewDto, PortfolioDigestDetailDto portfolioDigestDetailDto) {
        this(new Surrogate(portfolioDigestPreviewDto, portfolioDigestDetailDto));
    }

    public /* synthetic */ PortfolioDigestHasOnboardedDto(PortfolioDigestPreviewDto portfolioDigestPreviewDto, PortfolioDigestDetailDto portfolioDigestDetailDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : portfolioDigestPreviewDto, (i & 2) != 0 ? null : portfolioDigestDetailDto);
    }

    @Override // com.robinhood.idl.Dto
    public PortfolioDigestHasOnboarded toProto() {
        PortfolioDigestPreviewDto preview = this.surrogate.getPreview();
        PortfolioDigestPreview proto = preview != null ? preview.toProto() : null;
        PortfolioDigestDetailDto detail = this.surrogate.getDetail();
        return new PortfolioDigestHasOnboarded(proto, detail != null ? detail.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[PortfolioDigestHasOnboardedDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PortfolioDigestHasOnboardedDto) && Intrinsics.areEqual(((PortfolioDigestHasOnboardedDto) other).surrogate, this.surrogate);
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
    /* compiled from: PortfolioDigestHasOnboardedDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto$Surrogate;", "", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto;", ErrorResponse.DETAIL, "<init>", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_v1_externalRelease", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;", "getPreview", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;", "getPreview$annotations", "()V", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto;", "getDetail", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestDetailDto;", "getDetail$annotations", "Companion", "$serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final PortfolioDigestDetailDto detail;
        private final PortfolioDigestPreviewDto preview;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((PortfolioDigestPreviewDto) null, (PortfolioDigestDetailDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.preview, surrogate.preview) && Intrinsics.areEqual(this.detail, surrogate.detail);
        }

        public int hashCode() {
            PortfolioDigestPreviewDto portfolioDigestPreviewDto = this.preview;
            int iHashCode = (portfolioDigestPreviewDto == null ? 0 : portfolioDigestPreviewDto.hashCode()) * 31;
            PortfolioDigestDetailDto portfolioDigestDetailDto = this.detail;
            return iHashCode + (portfolioDigestDetailDto != null ? portfolioDigestDetailDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(preview=" + this.preview + ", detail=" + this.detail + ")";
        }

        /* compiled from: PortfolioDigestHasOnboardedDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto$Surrogate;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PortfolioDigestHasOnboardedDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, PortfolioDigestPreviewDto portfolioDigestPreviewDto, PortfolioDigestDetailDto portfolioDigestDetailDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.preview = null;
            } else {
                this.preview = portfolioDigestPreviewDto;
            }
            if ((i & 2) == 0) {
                this.detail = null;
            } else {
                this.detail = portfolioDigestDetailDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            PortfolioDigestPreviewDto portfolioDigestPreviewDto = self.preview;
            if (portfolioDigestPreviewDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, PortfolioDigestPreviewDto.Serializer.INSTANCE, portfolioDigestPreviewDto);
            }
            PortfolioDigestDetailDto portfolioDigestDetailDto = self.detail;
            if (portfolioDigestDetailDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, PortfolioDigestDetailDto.Serializer.INSTANCE, portfolioDigestDetailDto);
            }
        }

        public Surrogate(PortfolioDigestPreviewDto portfolioDigestPreviewDto, PortfolioDigestDetailDto portfolioDigestDetailDto) {
            this.preview = portfolioDigestPreviewDto;
            this.detail = portfolioDigestDetailDto;
        }

        public /* synthetic */ Surrogate(PortfolioDigestPreviewDto portfolioDigestPreviewDto, PortfolioDigestDetailDto portfolioDigestDetailDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : portfolioDigestPreviewDto, (i & 2) != 0 ? null : portfolioDigestDetailDto);
        }

        public final PortfolioDigestPreviewDto getPreview() {
            return this.preview;
        }

        public final PortfolioDigestDetailDto getDetail() {
            return this.detail;
        }
    }

    /* compiled from: PortfolioDigestHasOnboardedDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboarded;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PortfolioDigestHasOnboardedDto, PortfolioDigestHasOnboarded> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PortfolioDigestHasOnboardedDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioDigestHasOnboardedDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioDigestHasOnboardedDto> getBinaryBase64Serializer() {
            return (KSerializer) PortfolioDigestHasOnboardedDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PortfolioDigestHasOnboarded> getProtoAdapter() {
            return PortfolioDigestHasOnboarded.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioDigestHasOnboardedDto getZeroValue() {
            return PortfolioDigestHasOnboardedDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioDigestHasOnboardedDto fromProto(PortfolioDigestHasOnboarded proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            PortfolioDigestPreview preview = proto.getPreview();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PortfolioDigestPreviewDto portfolioDigestPreviewDtoFromProto = preview != null ? PortfolioDigestPreviewDto.INSTANCE.fromProto(preview) : null;
            PortfolioDigestDetail detail = proto.getDetail();
            return new PortfolioDigestHasOnboardedDto(new Surrogate(portfolioDigestPreviewDtoFromProto, detail != null ? PortfolioDigestDetailDto.INSTANCE.fromProto(detail) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.copilot.v1.PortfolioDigestHasOnboardedDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PortfolioDigestHasOnboardedDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PortfolioDigestHasOnboardedDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PortfolioDigestHasOnboardedDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PortfolioDigestHasOnboardedDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.copilot.v1.PortfolioDigestHasOnboarded", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PortfolioDigestHasOnboardedDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PortfolioDigestHasOnboardedDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PortfolioDigestHasOnboardedDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: PortfolioDigestHasOnboardedDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.copilot.v1.PortfolioDigestHasOnboardedDto";
        }
    }
}
