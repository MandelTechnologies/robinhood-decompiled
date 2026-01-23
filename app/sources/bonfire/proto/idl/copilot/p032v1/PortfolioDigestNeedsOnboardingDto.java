package bonfire.proto.idl.copilot.p032v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.copilot.p032v1.PortfolioDigestAgreementDto;
import bonfire.proto.idl.copilot.p032v1.PortfolioDigestPreviewDto;
import bonfire.proto.idl.copilot.p032v1.PortfolioDigestSplashDto;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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

/* compiled from: PortfolioDigestNeedsOnboardingDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboarding;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto$Surrogate;)V", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lbonfire/proto/idl/copilot/v1/PortfolioDigestAgreementDto;", "agreement", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestSplashDto;", "splash", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestAgreementDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestSplashDto;)V", "toProto", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboarding;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto$Surrogate;", "getPreview", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;", "getAgreement", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestAgreementDto;", "getSplash", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestSplashDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class PortfolioDigestNeedsOnboardingDto implements Dto3<PortfolioDigestNeedsOnboarding>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PortfolioDigestNeedsOnboardingDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PortfolioDigestNeedsOnboardingDto, PortfolioDigestNeedsOnboarding>> binaryBase64Serializer$delegate;
    private static final PortfolioDigestNeedsOnboardingDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PortfolioDigestNeedsOnboardingDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PortfolioDigestNeedsOnboardingDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final PortfolioDigestPreviewDto getPreview() {
        return this.surrogate.getPreview();
    }

    public final PortfolioDigestAgreementDto getAgreement() {
        return this.surrogate.getAgreement();
    }

    public final PortfolioDigestSplashDto getSplash() {
        return this.surrogate.getSplash();
    }

    public /* synthetic */ PortfolioDigestNeedsOnboardingDto(PortfolioDigestPreviewDto portfolioDigestPreviewDto, PortfolioDigestAgreementDto portfolioDigestAgreementDto, PortfolioDigestSplashDto portfolioDigestSplashDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : portfolioDigestPreviewDto, (i & 2) != 0 ? null : portfolioDigestAgreementDto, (i & 4) != 0 ? null : portfolioDigestSplashDto);
    }

    public PortfolioDigestNeedsOnboardingDto(PortfolioDigestPreviewDto portfolioDigestPreviewDto, PortfolioDigestAgreementDto portfolioDigestAgreementDto, PortfolioDigestSplashDto portfolioDigestSplashDto) {
        this(new Surrogate(portfolioDigestPreviewDto, portfolioDigestAgreementDto, portfolioDigestSplashDto));
    }

    @Override // com.robinhood.idl.Dto
    public PortfolioDigestNeedsOnboarding toProto() {
        PortfolioDigestPreviewDto preview = this.surrogate.getPreview();
        PortfolioDigestPreview proto = preview != null ? preview.toProto() : null;
        PortfolioDigestAgreementDto agreement = this.surrogate.getAgreement();
        PortfolioDigestAgreement proto2 = agreement != null ? agreement.toProto() : null;
        PortfolioDigestSplashDto splash = this.surrogate.getSplash();
        return new PortfolioDigestNeedsOnboarding(proto, proto2, splash != null ? splash.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[PortfolioDigestNeedsOnboardingDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PortfolioDigestNeedsOnboardingDto) && Intrinsics.areEqual(((PortfolioDigestNeedsOnboardingDto) other).surrogate, this.surrogate);
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
    /* compiled from: PortfolioDigestNeedsOnboardingDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto$Surrogate;", "", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lbonfire/proto/idl/copilot/v1/PortfolioDigestAgreementDto;", "agreement", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestSplashDto;", "splash", "<init>", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestAgreementDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestSplashDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestAgreementDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestSplashDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_v1_externalRelease", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;", "getPreview", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestPreviewDto;", "getPreview$annotations", "()V", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestAgreementDto;", "getAgreement", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestAgreementDto;", "getAgreement$annotations", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestSplashDto;", "getSplash", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestSplashDto;", "getSplash$annotations", "Companion", "$serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final PortfolioDigestAgreementDto agreement;
        private final PortfolioDigestPreviewDto preview;
        private final PortfolioDigestSplashDto splash;

        public Surrogate() {
            this((PortfolioDigestPreviewDto) null, (PortfolioDigestAgreementDto) null, (PortfolioDigestSplashDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.preview, surrogate.preview) && Intrinsics.areEqual(this.agreement, surrogate.agreement) && Intrinsics.areEqual(this.splash, surrogate.splash);
        }

        public int hashCode() {
            PortfolioDigestPreviewDto portfolioDigestPreviewDto = this.preview;
            int iHashCode = (portfolioDigestPreviewDto == null ? 0 : portfolioDigestPreviewDto.hashCode()) * 31;
            PortfolioDigestAgreementDto portfolioDigestAgreementDto = this.agreement;
            int iHashCode2 = (iHashCode + (portfolioDigestAgreementDto == null ? 0 : portfolioDigestAgreementDto.hashCode())) * 31;
            PortfolioDigestSplashDto portfolioDigestSplashDto = this.splash;
            return iHashCode2 + (portfolioDigestSplashDto != null ? portfolioDigestSplashDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(preview=" + this.preview + ", agreement=" + this.agreement + ", splash=" + this.splash + ")";
        }

        /* compiled from: PortfolioDigestNeedsOnboardingDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto$Surrogate;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PortfolioDigestNeedsOnboardingDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, PortfolioDigestPreviewDto portfolioDigestPreviewDto, PortfolioDigestAgreementDto portfolioDigestAgreementDto, PortfolioDigestSplashDto portfolioDigestSplashDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.preview = null;
            } else {
                this.preview = portfolioDigestPreviewDto;
            }
            if ((i & 2) == 0) {
                this.agreement = null;
            } else {
                this.agreement = portfolioDigestAgreementDto;
            }
            if ((i & 4) == 0) {
                this.splash = null;
            } else {
                this.splash = portfolioDigestSplashDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            PortfolioDigestPreviewDto portfolioDigestPreviewDto = self.preview;
            if (portfolioDigestPreviewDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, PortfolioDigestPreviewDto.Serializer.INSTANCE, portfolioDigestPreviewDto);
            }
            PortfolioDigestAgreementDto portfolioDigestAgreementDto = self.agreement;
            if (portfolioDigestAgreementDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, PortfolioDigestAgreementDto.Serializer.INSTANCE, portfolioDigestAgreementDto);
            }
            PortfolioDigestSplashDto portfolioDigestSplashDto = self.splash;
            if (portfolioDigestSplashDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, PortfolioDigestSplashDto.Serializer.INSTANCE, portfolioDigestSplashDto);
            }
        }

        public Surrogate(PortfolioDigestPreviewDto portfolioDigestPreviewDto, PortfolioDigestAgreementDto portfolioDigestAgreementDto, PortfolioDigestSplashDto portfolioDigestSplashDto) {
            this.preview = portfolioDigestPreviewDto;
            this.agreement = portfolioDigestAgreementDto;
            this.splash = portfolioDigestSplashDto;
        }

        public /* synthetic */ Surrogate(PortfolioDigestPreviewDto portfolioDigestPreviewDto, PortfolioDigestAgreementDto portfolioDigestAgreementDto, PortfolioDigestSplashDto portfolioDigestSplashDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : portfolioDigestPreviewDto, (i & 2) != 0 ? null : portfolioDigestAgreementDto, (i & 4) != 0 ? null : portfolioDigestSplashDto);
        }

        public final PortfolioDigestPreviewDto getPreview() {
            return this.preview;
        }

        public final PortfolioDigestAgreementDto getAgreement() {
            return this.agreement;
        }

        public final PortfolioDigestSplashDto getSplash() {
            return this.splash;
        }
    }

    /* compiled from: PortfolioDigestNeedsOnboardingDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboarding;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PortfolioDigestNeedsOnboardingDto, PortfolioDigestNeedsOnboarding> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PortfolioDigestNeedsOnboardingDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioDigestNeedsOnboardingDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioDigestNeedsOnboardingDto> getBinaryBase64Serializer() {
            return (KSerializer) PortfolioDigestNeedsOnboardingDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PortfolioDigestNeedsOnboarding> getProtoAdapter() {
            return PortfolioDigestNeedsOnboarding.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioDigestNeedsOnboardingDto getZeroValue() {
            return PortfolioDigestNeedsOnboardingDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioDigestNeedsOnboardingDto fromProto(PortfolioDigestNeedsOnboarding proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            PortfolioDigestPreview preview = proto.getPreview();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PortfolioDigestPreviewDto portfolioDigestPreviewDtoFromProto = preview != null ? PortfolioDigestPreviewDto.INSTANCE.fromProto(preview) : null;
            PortfolioDigestAgreement agreement = proto.getAgreement();
            PortfolioDigestAgreementDto portfolioDigestAgreementDtoFromProto = agreement != null ? PortfolioDigestAgreementDto.INSTANCE.fromProto(agreement) : null;
            PortfolioDigestSplash splash = proto.getSplash();
            return new PortfolioDigestNeedsOnboardingDto(new Surrogate(portfolioDigestPreviewDtoFromProto, portfolioDigestAgreementDtoFromProto, splash != null ? PortfolioDigestSplashDto.INSTANCE.fromProto(splash) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.copilot.v1.PortfolioDigestNeedsOnboardingDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PortfolioDigestNeedsOnboardingDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PortfolioDigestNeedsOnboardingDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PortfolioDigestNeedsOnboardingDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PortfolioDigestNeedsOnboardingDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.copilot.v1.PortfolioDigestNeedsOnboarding", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PortfolioDigestNeedsOnboardingDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PortfolioDigestNeedsOnboardingDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PortfolioDigestNeedsOnboardingDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PortfolioDigestNeedsOnboardingDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.copilot.v1.PortfolioDigestNeedsOnboardingDto";
        }
    }
}
