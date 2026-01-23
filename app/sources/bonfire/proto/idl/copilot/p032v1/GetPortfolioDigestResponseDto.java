package bonfire.proto.idl.copilot.p032v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.copilot.p032v1.PortfolioDigestHasOnboardedDto;
import bonfire.proto.idl.copilot.p032v1.PortfolioDigestNeedsGoldDto;
import bonfire.proto.idl.copilot.p032v1.PortfolioDigestNeedsOnboardingDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import p479j$.time.Instant;

/* compiled from: GetPortfolioDigestResponseDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005-,./0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BM\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0015R\u0019\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00061"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$Surrogate;)V", "", "account_number", "digest_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "updated_at", "read_at", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto;", "digest_content", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto;)V", "toProto", "()Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$Surrogate;", "getAccount_number", "getDigest_id", "getUpdated_at", "()Lj$/time/Instant;", "getDigest_content", "()Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto;", "Companion", "Surrogate", "DigestContentDto", "Serializer", "MultibindingModule", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class GetPortfolioDigestResponseDto implements Dto3<GetPortfolioDigestResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetPortfolioDigestResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetPortfolioDigestResponseDto, GetPortfolioDigestResponse>> binaryBase64Serializer$delegate;
    private static final GetPortfolioDigestResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetPortfolioDigestResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetPortfolioDigestResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getDigest_id() {
        return this.surrogate.getDigest_id();
    }

    public final Instant getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final DigestContentDto getDigest_content() {
        if (this.surrogate.getDigest_content_needs_onboarding() != null) {
            return new DigestContentDto.DigestContentNeedsOnboarding(this.surrogate.getDigest_content_needs_onboarding());
        }
        if (this.surrogate.getDigest_content_has_onboarded() != null) {
            return new DigestContentDto.DigestContentHasOnboarded(this.surrogate.getDigest_content_has_onboarded());
        }
        if (this.surrogate.getDigest_content_needs_gold() != null) {
            return new DigestContentDto.DigestContentNeedsGold(this.surrogate.getDigest_content_needs_gold());
        }
        return null;
    }

    public /* synthetic */ GetPortfolioDigestResponseDto(String str, String str2, Instant instant, Instant instant2, DigestContentDto digestContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? null : digestContentDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GetPortfolioDigestResponseDto(String account_number, String digest_id, Instant instant, Instant instant2, DigestContentDto digestContentDto) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        DigestContentDto.DigestContentNeedsOnboarding digestContentNeedsOnboarding = digestContentDto instanceof DigestContentDto.DigestContentNeedsOnboarding ? (DigestContentDto.DigestContentNeedsOnboarding) digestContentDto : null;
        PortfolioDigestNeedsOnboardingDto value = digestContentNeedsOnboarding != null ? digestContentNeedsOnboarding.getValue() : null;
        DigestContentDto.DigestContentHasOnboarded digestContentHasOnboarded = digestContentDto instanceof DigestContentDto.DigestContentHasOnboarded ? (DigestContentDto.DigestContentHasOnboarded) digestContentDto : null;
        PortfolioDigestHasOnboardedDto value2 = digestContentHasOnboarded != null ? digestContentHasOnboarded.getValue() : null;
        DigestContentDto.DigestContentNeedsGold digestContentNeedsGold = digestContentDto instanceof DigestContentDto.DigestContentNeedsGold ? (DigestContentDto.DigestContentNeedsGold) digestContentDto : null;
        this(new Surrogate(account_number, digest_id, instant, instant2, value, value2, digestContentNeedsGold != null ? digestContentNeedsGold.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public GetPortfolioDigestResponse toProto() {
        String account_number = this.surrogate.getAccount_number();
        String digest_id = this.surrogate.getDigest_id();
        Instant updated_at = this.surrogate.getUpdated_at();
        Instant read_at = this.surrogate.getRead_at();
        PortfolioDigestNeedsOnboardingDto digest_content_needs_onboarding = this.surrogate.getDigest_content_needs_onboarding();
        PortfolioDigestNeedsOnboarding proto = digest_content_needs_onboarding != null ? digest_content_needs_onboarding.toProto() : null;
        PortfolioDigestHasOnboardedDto digest_content_has_onboarded = this.surrogate.getDigest_content_has_onboarded();
        PortfolioDigestHasOnboarded proto2 = digest_content_has_onboarded != null ? digest_content_has_onboarded.toProto() : null;
        PortfolioDigestNeedsGoldDto digest_content_needs_gold = this.surrogate.getDigest_content_needs_gold();
        return new GetPortfolioDigestResponse(account_number, digest_id, updated_at, read_at, proto, proto2, digest_content_needs_gold != null ? digest_content_needs_gold.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[GetPortfolioDigestResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetPortfolioDigestResponseDto) && Intrinsics.areEqual(((GetPortfolioDigestResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetPortfolioDigestResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0083\b\u0018\u0000 B2\u00020\u0001:\u0002CBB\u009f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Ba\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010#R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010#RF\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00100\u0012\u0004\b3\u0010-\u001a\u0004\b1\u00102RF\u0010\u000b\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b5\u0010-\u001a\u0004\b4\u00102R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00106\u0012\u0004\b9\u0010-\u001a\u0004\b7\u00108R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010:\u0012\u0004\b=\u0010-\u001a\u0004\b;\u0010<R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010>\u0012\u0004\bA\u0010-\u001a\u0004\b?\u0010@¨\u0006D"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$Surrogate;", "", "", "account_number", "digest_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "updated_at", "read_at", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto;", "digest_content_needs_onboarding", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto;", "digest_content_has_onboarded", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsGoldDto;", "digest_content_needs_gold", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsGoldDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto;Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsGoldDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_v1_externalRelease", "(Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "getDigest_id", "getDigest_id$annotations", "Lj$/time/Instant;", "getUpdated_at", "()Lj$/time/Instant;", "getUpdated_at$annotations", "getRead_at", "getRead_at$annotations", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto;", "getDigest_content_needs_onboarding", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto;", "getDigest_content_needs_onboarding$annotations", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto;", "getDigest_content_has_onboarded", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto;", "getDigest_content_has_onboarded$annotations", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsGoldDto;", "getDigest_content_needs_gold", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsGoldDto;", "getDigest_content_needs_gold$annotations", "Companion", "$serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final PortfolioDigestHasOnboardedDto digest_content_has_onboarded;
        private final PortfolioDigestNeedsGoldDto digest_content_needs_gold;
        private final PortfolioDigestNeedsOnboardingDto digest_content_needs_onboarding;
        private final String digest_id;
        private final Instant read_at;
        private final Instant updated_at;

        public Surrogate() {
            this((String) null, (String) null, (Instant) null, (Instant) null, (PortfolioDigestNeedsOnboardingDto) null, (PortfolioDigestHasOnboardedDto) null, (PortfolioDigestNeedsGoldDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.digest_id, surrogate.digest_id) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.read_at, surrogate.read_at) && Intrinsics.areEqual(this.digest_content_needs_onboarding, surrogate.digest_content_needs_onboarding) && Intrinsics.areEqual(this.digest_content_has_onboarded, surrogate.digest_content_has_onboarded) && Intrinsics.areEqual(this.digest_content_needs_gold, surrogate.digest_content_needs_gold);
        }

        public int hashCode() {
            int iHashCode = ((this.account_number.hashCode() * 31) + this.digest_id.hashCode()) * 31;
            Instant instant = this.updated_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.read_at;
            int iHashCode3 = (iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            PortfolioDigestNeedsOnboardingDto portfolioDigestNeedsOnboardingDto = this.digest_content_needs_onboarding;
            int iHashCode4 = (iHashCode3 + (portfolioDigestNeedsOnboardingDto == null ? 0 : portfolioDigestNeedsOnboardingDto.hashCode())) * 31;
            PortfolioDigestHasOnboardedDto portfolioDigestHasOnboardedDto = this.digest_content_has_onboarded;
            int iHashCode5 = (iHashCode4 + (portfolioDigestHasOnboardedDto == null ? 0 : portfolioDigestHasOnboardedDto.hashCode())) * 31;
            PortfolioDigestNeedsGoldDto portfolioDigestNeedsGoldDto = this.digest_content_needs_gold;
            return iHashCode5 + (portfolioDigestNeedsGoldDto != null ? portfolioDigestNeedsGoldDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", digest_id=" + this.digest_id + ", updated_at=" + this.updated_at + ", read_at=" + this.read_at + ", digest_content_needs_onboarding=" + this.digest_content_needs_onboarding + ", digest_content_has_onboarded=" + this.digest_content_has_onboarded + ", digest_content_needs_gold=" + this.digest_content_needs_gold + ")";
        }

        /* compiled from: GetPortfolioDigestResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$Surrogate;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetPortfolioDigestResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Instant instant, Instant instant2, PortfolioDigestNeedsOnboardingDto portfolioDigestNeedsOnboardingDto, PortfolioDigestHasOnboardedDto portfolioDigestHasOnboardedDto, PortfolioDigestNeedsGoldDto portfolioDigestNeedsGoldDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 2) == 0) {
                this.digest_id = "";
            } else {
                this.digest_id = str2;
            }
            if ((i & 4) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant;
            }
            if ((i & 8) == 0) {
                this.read_at = null;
            } else {
                this.read_at = instant2;
            }
            if ((i & 16) == 0) {
                this.digest_content_needs_onboarding = null;
            } else {
                this.digest_content_needs_onboarding = portfolioDigestNeedsOnboardingDto;
            }
            if ((i & 32) == 0) {
                this.digest_content_has_onboarded = null;
            } else {
                this.digest_content_has_onboarded = portfolioDigestHasOnboardedDto;
            }
            if ((i & 64) == 0) {
                this.digest_content_needs_gold = null;
            } else {
                this.digest_content_needs_gold = portfolioDigestNeedsGoldDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (!Intrinsics.areEqual(self.digest_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.digest_id);
            }
            Instant instant = self.updated_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.read_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant2);
            }
            PortfolioDigestNeedsOnboardingDto portfolioDigestNeedsOnboardingDto = self.digest_content_needs_onboarding;
            if (portfolioDigestNeedsOnboardingDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, PortfolioDigestNeedsOnboardingDto.Serializer.INSTANCE, portfolioDigestNeedsOnboardingDto);
            }
            PortfolioDigestHasOnboardedDto portfolioDigestHasOnboardedDto = self.digest_content_has_onboarded;
            if (portfolioDigestHasOnboardedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, PortfolioDigestHasOnboardedDto.Serializer.INSTANCE, portfolioDigestHasOnboardedDto);
            }
            PortfolioDigestNeedsGoldDto portfolioDigestNeedsGoldDto = self.digest_content_needs_gold;
            if (portfolioDigestNeedsGoldDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, PortfolioDigestNeedsGoldDto.Serializer.INSTANCE, portfolioDigestNeedsGoldDto);
            }
        }

        public Surrogate(String account_number, String digest_id, Instant instant, Instant instant2, PortfolioDigestNeedsOnboardingDto portfolioDigestNeedsOnboardingDto, PortfolioDigestHasOnboardedDto portfolioDigestHasOnboardedDto, PortfolioDigestNeedsGoldDto portfolioDigestNeedsGoldDto) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(digest_id, "digest_id");
            this.account_number = account_number;
            this.digest_id = digest_id;
            this.updated_at = instant;
            this.read_at = instant2;
            this.digest_content_needs_onboarding = portfolioDigestNeedsOnboardingDto;
            this.digest_content_has_onboarded = portfolioDigestHasOnboardedDto;
            this.digest_content_needs_gold = portfolioDigestNeedsGoldDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, Instant instant, Instant instant2, PortfolioDigestNeedsOnboardingDto portfolioDigestNeedsOnboardingDto, PortfolioDigestHasOnboardedDto portfolioDigestHasOnboardedDto, PortfolioDigestNeedsGoldDto portfolioDigestNeedsGoldDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? null : portfolioDigestNeedsOnboardingDto, (i & 32) != 0 ? null : portfolioDigestHasOnboardedDto, (i & 64) != 0 ? null : portfolioDigestNeedsGoldDto);
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getDigest_id() {
            return this.digest_id;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        public final Instant getRead_at() {
            return this.read_at;
        }

        public final PortfolioDigestNeedsOnboardingDto getDigest_content_needs_onboarding() {
            return this.digest_content_needs_onboarding;
        }

        public final PortfolioDigestHasOnboardedDto getDigest_content_has_onboarded() {
            return this.digest_content_has_onboarded;
        }

        public final PortfolioDigestNeedsGoldDto getDigest_content_needs_gold() {
            return this.digest_content_needs_gold;
        }
    }

    /* compiled from: GetPortfolioDigestResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetPortfolioDigestResponseDto, GetPortfolioDigestResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetPortfolioDigestResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetPortfolioDigestResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetPortfolioDigestResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetPortfolioDigestResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetPortfolioDigestResponse> getProtoAdapter() {
            return GetPortfolioDigestResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetPortfolioDigestResponseDto getZeroValue() {
            return GetPortfolioDigestResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetPortfolioDigestResponseDto fromProto(GetPortfolioDigestResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            String digest_id = proto.getDigest_id();
            Instant updated_at = proto.getUpdated_at();
            Instant read_at = proto.getRead_at();
            PortfolioDigestNeedsOnboarding digest_content_needs_onboarding = proto.getDigest_content_needs_onboarding();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PortfolioDigestNeedsOnboardingDto portfolioDigestNeedsOnboardingDtoFromProto = digest_content_needs_onboarding != null ? PortfolioDigestNeedsOnboardingDto.INSTANCE.fromProto(digest_content_needs_onboarding) : null;
            PortfolioDigestHasOnboarded digest_content_has_onboarded = proto.getDigest_content_has_onboarded();
            PortfolioDigestHasOnboardedDto portfolioDigestHasOnboardedDtoFromProto = digest_content_has_onboarded != null ? PortfolioDigestHasOnboardedDto.INSTANCE.fromProto(digest_content_has_onboarded) : null;
            PortfolioDigestNeedsGold digest_content_needs_gold = proto.getDigest_content_needs_gold();
            return new GetPortfolioDigestResponseDto(new Surrogate(account_number, digest_id, updated_at, read_at, portfolioDigestNeedsOnboardingDtoFromProto, portfolioDigestHasOnboardedDtoFromProto, digest_content_needs_gold != null ? PortfolioDigestNeedsGoldDto.INSTANCE.fromProto(digest_content_needs_gold) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.copilot.v1.GetPortfolioDigestResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetPortfolioDigestResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetPortfolioDigestResponseDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetPortfolioDigestResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "DigestContentNeedsOnboarding", "DigestContentHasOnboarded", "DigestContentNeedsGold", "Companion", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto$DigestContentHasOnboarded;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto$DigestContentNeedsGold;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto$DigestContentNeedsOnboarding;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DigestContentDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DigestContentDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DigestContentDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: GetPortfolioDigestResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto$DigestContentNeedsOnboarding;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto;", "value", "<init>", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto;", "getValue", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboardingDto;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DigestContentNeedsOnboarding extends DigestContentDto {
            private final PortfolioDigestNeedsOnboardingDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DigestContentNeedsOnboarding) && Intrinsics.areEqual(this.value, ((DigestContentNeedsOnboarding) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DigestContentNeedsOnboarding(value=" + this.value + ")";
            }

            public final PortfolioDigestNeedsOnboardingDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DigestContentNeedsOnboarding(PortfolioDigestNeedsOnboardingDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetPortfolioDigestResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto$DigestContentHasOnboarded;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto;", "value", "<init>", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto;", "getValue", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboardedDto;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DigestContentHasOnboarded extends DigestContentDto {
            private final PortfolioDigestHasOnboardedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DigestContentHasOnboarded) && Intrinsics.areEqual(this.value, ((DigestContentHasOnboarded) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DigestContentHasOnboarded(value=" + this.value + ")";
            }

            public final PortfolioDigestHasOnboardedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DigestContentHasOnboarded(PortfolioDigestHasOnboardedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetPortfolioDigestResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto$DigestContentNeedsGold;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsGoldDto;", "value", "<init>", "(Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsGoldDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsGoldDto;", "getValue", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsGoldDto;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DigestContentNeedsGold extends DigestContentDto {
            private final PortfolioDigestNeedsGoldDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DigestContentNeedsGold) && Intrinsics.areEqual(this.value, ((DigestContentNeedsGold) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DigestContentNeedsGold(value=" + this.value + ")";
            }

            public final PortfolioDigestNeedsGoldDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DigestContentNeedsGold(PortfolioDigestNeedsGoldDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetPortfolioDigestResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$DigestContentDto;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<DigestContentDto, GetPortfolioDigestResponse> {
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
            public ProtoAdapter<GetPortfolioDigestResponse> getProtoAdapter() {
                return GetPortfolioDigestResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DigestContentDto fromProto(GetPortfolioDigestResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getDigest_content_needs_onboarding() != null) {
                    return new DigestContentNeedsOnboarding(PortfolioDigestNeedsOnboardingDto.INSTANCE.fromProto(proto.getDigest_content_needs_onboarding()));
                }
                if (proto.getDigest_content_has_onboarded() != null) {
                    return new DigestContentHasOnboarded(PortfolioDigestHasOnboardedDto.INSTANCE.fromProto(proto.getDigest_content_has_onboarded()));
                }
                if (proto.getDigest_content_needs_gold() != null) {
                    return new DigestContentNeedsGold(PortfolioDigestNeedsGoldDto.INSTANCE.fromProto(proto.getDigest_content_needs_gold()));
                }
                return null;
            }
        }
    }

    /* compiled from: GetPortfolioDigestResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetPortfolioDigestResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.copilot.v1.GetPortfolioDigestResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetPortfolioDigestResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetPortfolioDigestResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetPortfolioDigestResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetPortfolioDigestResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.copilot.v1.GetPortfolioDigestResponseDto";
        }
    }
}
