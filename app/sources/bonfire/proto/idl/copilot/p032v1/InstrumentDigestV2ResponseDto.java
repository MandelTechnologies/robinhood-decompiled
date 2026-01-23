package bonfire.proto.idl.copilot.p032v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.copilot.p032v1.InstrumentDigestDetailDto;
import bonfire.proto.idl.copilot.p032v1.InstrumentDigestPreviewDto;
import bonfire.proto.idl.copilot.p032v1.InstrumentTypeDto;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import p479j$.time.Instant;

/* compiled from: InstrumentDigestV2ResponseDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000498:;B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Be\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001bR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001bR\u0019\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006<"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2Response;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto$Surrogate;)V", "", "account_number", "instrument_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "updated_at", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;", ErrorResponse.DETAIL, "digest_id", "", "has_signed_agreement", "Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;", "instrument_type", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;Ljava/lang/String;ZLbonfire/proto/idl/copilot/v1/InstrumentTypeDto;)V", "toProto", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2Response;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto$Surrogate;", "getAccount_number", "getInstrument_id", "getUpdated_at", "()Lj$/time/Instant;", "getPreview", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;", "getDetail", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;", "getDigest_id", "getHas_signed_agreement", "()Z", "getInstrument_type", "()Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class InstrumentDigestV2ResponseDto implements Dto3<InstrumentDigestV2Response>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InstrumentDigestV2ResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InstrumentDigestV2ResponseDto, InstrumentDigestV2Response>> binaryBase64Serializer$delegate;
    private static final InstrumentDigestV2ResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InstrumentDigestV2ResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InstrumentDigestV2ResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final Instant getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final InstrumentDigestPreviewDto getPreview() {
        return this.surrogate.getPreview();
    }

    public final InstrumentDigestDetailDto getDetail() {
        return this.surrogate.getDetail();
    }

    public final String getDigest_id() {
        return this.surrogate.getDigest_id();
    }

    public final boolean getHas_signed_agreement() {
        return this.surrogate.getHas_signed_agreement();
    }

    public final InstrumentTypeDto getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public /* synthetic */ InstrumentDigestV2ResponseDto(String str, String str2, Instant instant, InstrumentDigestPreviewDto instrumentDigestPreviewDto, InstrumentDigestDetailDto instrumentDigestDetailDto, String str3, boolean z, InstrumentTypeDto instrumentTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instrumentDigestPreviewDto, (i & 16) != 0 ? null : instrumentDigestDetailDto, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? false : z, (i & 128) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstrumentDigestV2ResponseDto(String account_number, String instrument_id, Instant instant, InstrumentDigestPreviewDto instrumentDigestPreviewDto, InstrumentDigestDetailDto instrumentDigestDetailDto, String digest_id, boolean z, InstrumentTypeDto instrument_type) {
        this(new Surrogate(account_number, instrument_id, instant, instrumentDigestPreviewDto, instrumentDigestDetailDto, digest_id, z, instrument_type));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InstrumentDigestV2Response toProto() {
        String account_number = this.surrogate.getAccount_number();
        String instrument_id = this.surrogate.getInstrument_id();
        Instant updated_at = this.surrogate.getUpdated_at();
        InstrumentDigestPreviewDto preview = this.surrogate.getPreview();
        InstrumentDigestPreview proto = preview != null ? preview.toProto() : null;
        InstrumentDigestDetailDto detail = this.surrogate.getDetail();
        return new InstrumentDigestV2Response(account_number, instrument_id, updated_at, proto, detail != null ? detail.toProto() : null, this.surrogate.getDigest_id(), this.surrogate.getHas_signed_agreement(), (InstrumentType) this.surrogate.getInstrument_type().toProto(), null, 256, null);
    }

    public String toString() {
        return "[InstrumentDigestV2ResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InstrumentDigestV2ResponseDto) && Intrinsics.areEqual(((InstrumentDigestV2ResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: InstrumentDigestV2ResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\b\u0083\b\u0018\u0000 G2\u00020\u0001:\u0002HGB\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bi\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010%RF\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b4\u0010.\u001a\u0004\b2\u00103R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b8\u0010.\u001a\u0004\b6\u00107R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00109\u0012\u0004\b<\u0010.\u001a\u0004\b:\u0010;R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010+\u0012\u0004\b>\u0010.\u001a\u0004\b=\u0010%R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010?\u0012\u0004\bB\u0010.\u001a\u0004\b@\u0010AR \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010C\u0012\u0004\bF\u0010.\u001a\u0004\bD\u0010E¨\u0006I"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto$Surrogate;", "", "", "account_number", "instrument_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "updated_at", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;", ErrorResponse.DETAIL, "digest_id", "", "has_signed_agreement", "Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;", "instrument_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;Ljava/lang/String;ZLbonfire/proto/idl/copilot/v1/InstrumentTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;Ljava/lang/String;ZLbonfire/proto/idl/copilot/v1/InstrumentTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_v1_externalRelease", "(Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "getInstrument_id", "getInstrument_id$annotations", "Lj$/time/Instant;", "getUpdated_at", "()Lj$/time/Instant;", "getUpdated_at$annotations", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;", "getPreview", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;", "getPreview$annotations", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;", "getDetail", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;", "getDetail$annotations", "getDigest_id", "getDigest_id$annotations", "Z", "getHas_signed_agreement", "()Z", "getHas_signed_agreement$annotations", "Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;", "getInstrument_type", "()Lbonfire/proto/idl/copilot/v1/InstrumentTypeDto;", "getInstrument_type$annotations", "Companion", "$serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final InstrumentDigestDetailDto detail;
        private final String digest_id;
        private final boolean has_signed_agreement;
        private final String instrument_id;
        private final InstrumentTypeDto instrument_type;
        private final InstrumentDigestPreviewDto preview;
        private final Instant updated_at;

        public Surrogate() {
            this((String) null, (String) null, (Instant) null, (InstrumentDigestPreviewDto) null, (InstrumentDigestDetailDto) null, (String) null, false, (InstrumentTypeDto) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.preview, surrogate.preview) && Intrinsics.areEqual(this.detail, surrogate.detail) && Intrinsics.areEqual(this.digest_id, surrogate.digest_id) && this.has_signed_agreement == surrogate.has_signed_agreement && this.instrument_type == surrogate.instrument_type;
        }

        public int hashCode() {
            int iHashCode = ((this.account_number.hashCode() * 31) + this.instrument_id.hashCode()) * 31;
            Instant instant = this.updated_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            InstrumentDigestPreviewDto instrumentDigestPreviewDto = this.preview;
            int iHashCode3 = (iHashCode2 + (instrumentDigestPreviewDto == null ? 0 : instrumentDigestPreviewDto.hashCode())) * 31;
            InstrumentDigestDetailDto instrumentDigestDetailDto = this.detail;
            return ((((((iHashCode3 + (instrumentDigestDetailDto != null ? instrumentDigestDetailDto.hashCode() : 0)) * 31) + this.digest_id.hashCode()) * 31) + Boolean.hashCode(this.has_signed_agreement)) * 31) + this.instrument_type.hashCode();
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", instrument_id=" + this.instrument_id + ", updated_at=" + this.updated_at + ", preview=" + this.preview + ", detail=" + this.detail + ", digest_id=" + this.digest_id + ", has_signed_agreement=" + this.has_signed_agreement + ", instrument_type=" + this.instrument_type + ")";
        }

        /* compiled from: InstrumentDigestV2ResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto$Surrogate;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InstrumentDigestV2ResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Instant instant, InstrumentDigestPreviewDto instrumentDigestPreviewDto, InstrumentDigestDetailDto instrumentDigestDetailDto, String str3, boolean z, InstrumentTypeDto instrumentTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 2) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str2;
            }
            if ((i & 4) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant;
            }
            if ((i & 8) == 0) {
                this.preview = null;
            } else {
                this.preview = instrumentDigestPreviewDto;
            }
            if ((i & 16) == 0) {
                this.detail = null;
            } else {
                this.detail = instrumentDigestDetailDto;
            }
            if ((i & 32) == 0) {
                this.digest_id = "";
            } else {
                this.digest_id = str3;
            }
            if ((i & 64) == 0) {
                this.has_signed_agreement = false;
            } else {
                this.has_signed_agreement = z;
            }
            if ((i & 128) == 0) {
                this.instrument_type = InstrumentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.instrument_type = instrumentTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.instrument_id);
            }
            Instant instant = self.updated_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            InstrumentDigestPreviewDto instrumentDigestPreviewDto = self.preview;
            if (instrumentDigestPreviewDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, InstrumentDigestPreviewDto.Serializer.INSTANCE, instrumentDigestPreviewDto);
            }
            InstrumentDigestDetailDto instrumentDigestDetailDto = self.detail;
            if (instrumentDigestDetailDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, InstrumentDigestDetailDto.Serializer.INSTANCE, instrumentDigestDetailDto);
            }
            if (!Intrinsics.areEqual(self.digest_id, "")) {
                output.encodeStringElement(serialDesc, 5, self.digest_id);
            }
            boolean z = self.has_signed_agreement;
            if (z) {
                output.encodeBooleanElement(serialDesc, 6, z);
            }
            if (self.instrument_type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, InstrumentTypeDto.Serializer.INSTANCE, self.instrument_type);
            }
        }

        public Surrogate(String account_number, String instrument_id, Instant instant, InstrumentDigestPreviewDto instrumentDigestPreviewDto, InstrumentDigestDetailDto instrumentDigestDetailDto, String digest_id, boolean z, InstrumentTypeDto instrument_type) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(digest_id, "digest_id");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            this.account_number = account_number;
            this.instrument_id = instrument_id;
            this.updated_at = instant;
            this.preview = instrumentDigestPreviewDto;
            this.detail = instrumentDigestDetailDto;
            this.digest_id = digest_id;
            this.has_signed_agreement = z;
            this.instrument_type = instrument_type;
        }

        public /* synthetic */ Surrogate(String str, String str2, Instant instant, InstrumentDigestPreviewDto instrumentDigestPreviewDto, InstrumentDigestDetailDto instrumentDigestDetailDto, String str3, boolean z, InstrumentTypeDto instrumentTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instrumentDigestPreviewDto, (i & 16) != 0 ? null : instrumentDigestDetailDto, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? false : z, (i & 128) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto);
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        public final InstrumentDigestPreviewDto getPreview() {
            return this.preview;
        }

        public final InstrumentDigestDetailDto getDetail() {
            return this.detail;
        }

        public final String getDigest_id() {
            return this.digest_id;
        }

        public final boolean getHas_signed_agreement() {
            return this.has_signed_agreement;
        }

        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }
    }

    /* compiled from: InstrumentDigestV2ResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2Response;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InstrumentDigestV2ResponseDto, InstrumentDigestV2Response> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InstrumentDigestV2ResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InstrumentDigestV2ResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InstrumentDigestV2ResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) InstrumentDigestV2ResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InstrumentDigestV2Response> getProtoAdapter() {
            return InstrumentDigestV2Response.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InstrumentDigestV2ResponseDto getZeroValue() {
            return InstrumentDigestV2ResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InstrumentDigestV2ResponseDto fromProto(InstrumentDigestV2Response proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            String instrument_id = proto.getInstrument_id();
            Instant updated_at = proto.getUpdated_at();
            InstrumentDigestPreview preview = proto.getPreview();
            DefaultConstructorMarker defaultConstructorMarker = null;
            InstrumentDigestPreviewDto instrumentDigestPreviewDtoFromProto = preview != null ? InstrumentDigestPreviewDto.INSTANCE.fromProto(preview) : null;
            InstrumentDigestDetail detail = proto.getDetail();
            return new InstrumentDigestV2ResponseDto(new Surrogate(account_number, instrument_id, updated_at, instrumentDigestPreviewDtoFromProto, detail != null ? InstrumentDigestDetailDto.INSTANCE.fromProto(detail) : null, proto.getDigest_id(), proto.getHas_signed_agreement(), InstrumentTypeDto.INSTANCE.fromProto(proto.getInstrument_type())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.copilot.v1.InstrumentDigestV2ResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentDigestV2ResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InstrumentDigestV2ResponseDto(null, null, null, null, null, null, false, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InstrumentDigestV2ResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InstrumentDigestV2ResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.copilot.v1.InstrumentDigestV2Response", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InstrumentDigestV2ResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InstrumentDigestV2ResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InstrumentDigestV2ResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InstrumentDigestV2ResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.copilot.v1.InstrumentDigestV2ResponseDto";
        }
    }
}
