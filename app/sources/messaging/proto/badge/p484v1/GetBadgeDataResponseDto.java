package messaging.proto.badge.p484v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.utils.extensions.ResourceTypes;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import messaging.proto.badge.p484v1.GetBadgeDataResponse;
import messaging.proto.badge.p484v1.GetBadgeDataResponseDto;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.LinearGradientColor;
import rh_server_driven_ui.p531v1.LinearGradientColorDto;
import rh_server_driven_ui.p531v1.ThemedColor;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: GetBadgeDataResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\n#\"$%&'()*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006,"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse;", "Landroid/os/Parcelable;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$Surrogate;", "surrogate", "<init>", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$Surrogate;)V", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto;", "badge_data", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto;)V", "toProto", "()Lmessaging/proto/badge/v1/GetBadgeDataResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$Surrogate;", "getBadge_data", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto;", "Companion", "Surrogate", "BadgeDataDto", "HiddenBadgeDataDto", "CountdownBadgeDataDto", "TextBadgeDataDto", "CustomStyleParamsDto", "BadgeVisualStyleDto", "Serializer", "MultibindingModule", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class GetBadgeDataResponseDto implements Dto3<GetBadgeDataResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetBadgeDataResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetBadgeDataResponseDto, GetBadgeDataResponse>> binaryBase64Serializer$delegate;
    private static final GetBadgeDataResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetBadgeDataResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetBadgeDataResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final BadgeDataDto getBadge_data() {
        if (this.surrogate.getNo_badge() != null) {
            return new BadgeDataDto.NoBadge(this.surrogate.getNo_badge());
        }
        if (this.surrogate.getCountdown_badge() != null) {
            return new BadgeDataDto.CountdownBadge(this.surrogate.getCountdown_badge());
        }
        if (this.surrogate.getText_badge() != null) {
            return new BadgeDataDto.TextBadge(this.surrogate.getText_badge());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GetBadgeDataResponseDto(BadgeDataDto badgeDataDto) {
        BadgeDataDto.NoBadge noBadge = badgeDataDto instanceof BadgeDataDto.NoBadge ? (BadgeDataDto.NoBadge) badgeDataDto : null;
        HiddenBadgeDataDto value = noBadge != null ? noBadge.getValue() : null;
        BadgeDataDto.CountdownBadge countdownBadge = badgeDataDto instanceof BadgeDataDto.CountdownBadge ? (BadgeDataDto.CountdownBadge) badgeDataDto : null;
        CountdownBadgeDataDto value2 = countdownBadge != null ? countdownBadge.getValue() : null;
        BadgeDataDto.TextBadge textBadge = badgeDataDto instanceof BadgeDataDto.TextBadge ? (BadgeDataDto.TextBadge) badgeDataDto : null;
        this(new Surrogate(value, value2, textBadge != null ? textBadge.getValue() : null));
    }

    public /* synthetic */ GetBadgeDataResponseDto(BadgeDataDto badgeDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : badgeDataDto);
    }

    @Override // com.robinhood.idl.Dto
    public GetBadgeDataResponse toProto() {
        HiddenBadgeDataDto no_badge = this.surrogate.getNo_badge();
        GetBadgeDataResponse.HiddenBadgeData proto = no_badge != null ? no_badge.toProto() : null;
        CountdownBadgeDataDto countdown_badge = this.surrogate.getCountdown_badge();
        GetBadgeDataResponse.CountdownBadgeData proto2 = countdown_badge != null ? countdown_badge.toProto() : null;
        TextBadgeDataDto text_badge = this.surrogate.getText_badge();
        return new GetBadgeDataResponse(proto, proto2, text_badge != null ? text_badge.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[GetBadgeDataResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetBadgeDataResponseDto) && Intrinsics.areEqual(((GetBadgeDataResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetBadgeDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$Surrogate;", "", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto;", "no_badge", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto;", "countdown_badge", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto;", "text_badge", "<init>", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto;Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto;Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto;Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto;Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$messaging_badge_v1_externalRelease", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto;", "getNo_badge", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto;", "getNo_badge$annotations", "()V", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto;", "getCountdown_badge", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto;", "getCountdown_badge$annotations", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto;", "getText_badge", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto;", "getText_badge$annotations", "Companion", "$serializer", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CountdownBadgeDataDto countdown_badge;
        private final HiddenBadgeDataDto no_badge;
        private final TextBadgeDataDto text_badge;

        public Surrogate() {
            this((HiddenBadgeDataDto) null, (CountdownBadgeDataDto) null, (TextBadgeDataDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.no_badge, surrogate.no_badge) && Intrinsics.areEqual(this.countdown_badge, surrogate.countdown_badge) && Intrinsics.areEqual(this.text_badge, surrogate.text_badge);
        }

        public int hashCode() {
            HiddenBadgeDataDto hiddenBadgeDataDto = this.no_badge;
            int iHashCode = (hiddenBadgeDataDto == null ? 0 : hiddenBadgeDataDto.hashCode()) * 31;
            CountdownBadgeDataDto countdownBadgeDataDto = this.countdown_badge;
            int iHashCode2 = (iHashCode + (countdownBadgeDataDto == null ? 0 : countdownBadgeDataDto.hashCode())) * 31;
            TextBadgeDataDto textBadgeDataDto = this.text_badge;
            return iHashCode2 + (textBadgeDataDto != null ? textBadgeDataDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(no_badge=" + this.no_badge + ", countdown_badge=" + this.countdown_badge + ", text_badge=" + this.text_badge + ")";
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$Surrogate;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetBadgeDataResponseDto5.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, HiddenBadgeDataDto hiddenBadgeDataDto, CountdownBadgeDataDto countdownBadgeDataDto, TextBadgeDataDto textBadgeDataDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.no_badge = null;
            } else {
                this.no_badge = hiddenBadgeDataDto;
            }
            if ((i & 2) == 0) {
                this.countdown_badge = null;
            } else {
                this.countdown_badge = countdownBadgeDataDto;
            }
            if ((i & 4) == 0) {
                this.text_badge = null;
            } else {
                this.text_badge = textBadgeDataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$messaging_badge_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            HiddenBadgeDataDto hiddenBadgeDataDto = self.no_badge;
            if (hiddenBadgeDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, HiddenBadgeDataDto.Serializer.INSTANCE, hiddenBadgeDataDto);
            }
            CountdownBadgeDataDto countdownBadgeDataDto = self.countdown_badge;
            if (countdownBadgeDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CountdownBadgeDataDto.Serializer.INSTANCE, countdownBadgeDataDto);
            }
            TextBadgeDataDto textBadgeDataDto = self.text_badge;
            if (textBadgeDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TextBadgeDataDto.Serializer.INSTANCE, textBadgeDataDto);
            }
        }

        public Surrogate(HiddenBadgeDataDto hiddenBadgeDataDto, CountdownBadgeDataDto countdownBadgeDataDto, TextBadgeDataDto textBadgeDataDto) {
            this.no_badge = hiddenBadgeDataDto;
            this.countdown_badge = countdownBadgeDataDto;
            this.text_badge = textBadgeDataDto;
        }

        public /* synthetic */ Surrogate(HiddenBadgeDataDto hiddenBadgeDataDto, CountdownBadgeDataDto countdownBadgeDataDto, TextBadgeDataDto textBadgeDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : hiddenBadgeDataDto, (i & 2) != 0 ? null : countdownBadgeDataDto, (i & 4) != 0 ? null : textBadgeDataDto);
        }

        public final HiddenBadgeDataDto getNo_badge() {
            return this.no_badge;
        }

        public final CountdownBadgeDataDto getCountdown_badge() {
            return this.countdown_badge;
        }

        public final TextBadgeDataDto getText_badge() {
            return this.text_badge;
        }
    }

    /* compiled from: GetBadgeDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetBadgeDataResponseDto, GetBadgeDataResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetBadgeDataResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetBadgeDataResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetBadgeDataResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetBadgeDataResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetBadgeDataResponse> getProtoAdapter() {
            return GetBadgeDataResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetBadgeDataResponseDto getZeroValue() {
            return GetBadgeDataResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetBadgeDataResponseDto fromProto(GetBadgeDataResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            GetBadgeDataResponse.HiddenBadgeData no_badge = proto.getNo_badge();
            DefaultConstructorMarker defaultConstructorMarker = null;
            HiddenBadgeDataDto hiddenBadgeDataDtoFromProto = no_badge != null ? HiddenBadgeDataDto.INSTANCE.fromProto(no_badge) : null;
            GetBadgeDataResponse.CountdownBadgeData countdown_badge = proto.getCountdown_badge();
            CountdownBadgeDataDto countdownBadgeDataDtoFromProto = countdown_badge != null ? CountdownBadgeDataDto.INSTANCE.fromProto(countdown_badge) : null;
            GetBadgeDataResponse.TextBadgeData text_badge = proto.getText_badge();
            return new GetBadgeDataResponseDto(new Surrogate(hiddenBadgeDataDtoFromProto, countdownBadgeDataDtoFromProto, text_badge != null ? TextBadgeDataDto.INSTANCE.fromProto(text_badge) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: messaging.proto.badge.v1.GetBadgeDataResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetBadgeDataResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetBadgeDataResponseDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetBadgeDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "NoBadge", "CountdownBadge", "TextBadge", "Companion", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto$CountdownBadge;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto$NoBadge;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto$TextBadge;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class BadgeDataDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ BadgeDataDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private BadgeDataDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto$NoBadge;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto;", "value", "<init>", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto;", "getValue", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoBadge extends BadgeDataDto {
            private final HiddenBadgeDataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoBadge) && Intrinsics.areEqual(this.value, ((NoBadge) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NoBadge(value=" + this.value + ")";
            }

            public final HiddenBadgeDataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoBadge(HiddenBadgeDataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto$CountdownBadge;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto;", "value", "<init>", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto;", "getValue", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CountdownBadge extends BadgeDataDto {
            private final CountdownBadgeDataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CountdownBadge) && Intrinsics.areEqual(this.value, ((CountdownBadge) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CountdownBadge(value=" + this.value + ")";
            }

            public final CountdownBadgeDataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CountdownBadge(CountdownBadgeDataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto$TextBadge;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto;", "value", "<init>", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto;", "getValue", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TextBadge extends BadgeDataDto {
            private final TextBadgeDataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TextBadge) && Intrinsics.areEqual(this.value, ((TextBadge) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TextBadge(value=" + this.value + ")";
            }

            public final TextBadgeDataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextBadge(TextBadgeDataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeDataDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<BadgeDataDto, GetBadgeDataResponse> {
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
            public ProtoAdapter<GetBadgeDataResponse> getProtoAdapter() {
                return GetBadgeDataResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public BadgeDataDto fromProto(GetBadgeDataResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getNo_badge() != null) {
                    return new NoBadge(HiddenBadgeDataDto.INSTANCE.fromProto(proto.getNo_badge()));
                }
                if (proto.getCountdown_badge() != null) {
                    return new CountdownBadge(CountdownBadgeDataDto.INSTANCE.fromProto(proto.getCountdown_badge()));
                }
                if (proto.getText_badge() != null) {
                    return new TextBadge(TextBadgeDataDto.INSTANCE.fromProto(proto.getText_badge()));
                }
                return null;
            }
        }
    }

    /* compiled from: GetBadgeDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 \u001f!\"B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006#"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$HiddenBadgeData;", "Landroid/os/Parcelable;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto$Surrogate;", "surrogate", "<init>", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto$Surrogate;)V", "", "placeholder", "(Z)V", "toProto", "()Lmessaging/proto/badge/v1/GetBadgeDataResponse$HiddenBadgeData;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class HiddenBadgeDataDto implements Dto3<GetBadgeDataResponse.HiddenBadgeData>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<HiddenBadgeDataDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<HiddenBadgeDataDto, GetBadgeDataResponse.HiddenBadgeData>> binaryBase64Serializer$delegate;
        private static final HiddenBadgeDataDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ HiddenBadgeDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private HiddenBadgeDataDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public HiddenBadgeDataDto(boolean z) {
            this(new Surrogate(z));
        }

        public /* synthetic */ HiddenBadgeDataDto(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public GetBadgeDataResponse.HiddenBadgeData toProto() {
            return new GetBadgeDataResponse.HiddenBadgeData(this.surrogate.getPlaceholder(), null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[HiddenBadgeDataDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof HiddenBadgeDataDto) && Intrinsics.areEqual(((HiddenBadgeDataDto) other).surrogate, this.surrogate);
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
        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0083\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto$Surrogate;", "", "", "placeholder", "<init>", "(Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$messaging_badge_v1_externalRelease", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getPlaceholder", "()Z", "getPlaceholder$annotations", "()V", "Companion", "$serializer", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean placeholder;

            public Surrogate() {
                this(false, 1, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && this.placeholder == ((Surrogate) other).placeholder;
            }

            public int hashCode() {
                return Boolean.hashCode(this.placeholder);
            }

            public String toString() {
                return "Surrogate(placeholder=" + this.placeholder + ")";
            }

            /* compiled from: GetBadgeDataResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto$Surrogate;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return GetBadgeDataResponseDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.placeholder = false;
                } else {
                    this.placeholder = z;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$messaging_badge_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                boolean z = self.placeholder;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 0, z);
                }
            }

            public Surrogate(boolean z) {
                this.placeholder = z;
            }

            public /* synthetic */ Surrogate(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z);
            }

            public final boolean getPlaceholder() {
                return this.placeholder;
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$HiddenBadgeData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<HiddenBadgeDataDto, GetBadgeDataResponse.HiddenBadgeData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<HiddenBadgeDataDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<HiddenBadgeDataDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<HiddenBadgeDataDto> getBinaryBase64Serializer() {
                return (KSerializer) HiddenBadgeDataDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetBadgeDataResponse.HiddenBadgeData> getProtoAdapter() {
                return GetBadgeDataResponse.HiddenBadgeData.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public HiddenBadgeDataDto getZeroValue() {
                return HiddenBadgeDataDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public HiddenBadgeDataDto fromProto(GetBadgeDataResponse.HiddenBadgeData proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new HiddenBadgeDataDto(new Surrogate(proto.getPlaceholder()), null);
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion companion = new Companion(defaultConstructorMarker);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: messaging.proto.badge.v1.GetBadgeDataResponseDto$HiddenBadgeDataDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetBadgeDataResponseDto.HiddenBadgeDataDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new HiddenBadgeDataDto(false, 1, defaultConstructorMarker);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto;", "<init>", "()V", "surrogateSerializer", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<HiddenBadgeDataDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/messaging.proto.badge.v1.GetBadgeDataResponse.HiddenBadgeData", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, HiddenBadgeDataDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public HiddenBadgeDataDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new HiddenBadgeDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$HiddenBadgeDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "messaging.proto.badge.v1.GetBadgeDataResponseDto$HiddenBadgeDataDto";
            }
        }
    }

    /* compiled from: GetBadgeDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004EDFGB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BÉ\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0006\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020'H\u0016¢\u0006\u0004\b0\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u00106R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b7\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b8\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b9\u0010\"R\u0011\u0010\u0013\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b:\u0010\"R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b;\u0010\"R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b<\u0010\"R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b=\u0010\"R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b>\u0010\"R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b?\u0010\"R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b@\u0010\"R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bA\u0010\"R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006H"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$CountdownBadgeData;", "Landroid/os/Parcelable;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto$Surrogate;", "surrogate", "<init>", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto$Surrogate;)V", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", ResourceTypes.STYLE, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "target_timestamp", "", "is_pulsing", "", "lottie_url_light", "lottie_url_dark", "action_url", "icon_name", "bg_lottie_url_light", "bg_lottie_url_dark", "border_lottie_url_light", "border_lottie_url_dark", "logging_identifier", "use_inline_loading", "completion_text", "completion_icon", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "custom_style_params", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;Lj$/time/Instant;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;)V", "toProto", "()Lmessaging/proto/badge/v1/GetBadgeDataResponse$CountdownBadgeData;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto$Surrogate;", "getStyle", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "getTarget_timestamp", "()Lj$/time/Instant;", "()Z", "getLottie_url_light", "getLottie_url_dark", "getAction_url", "getIcon_name", "getBg_lottie_url_light", "getBg_lottie_url_dark", "getBorder_lottie_url_light", "getBorder_lottie_url_dark", "getLogging_identifier", "getCompletion_text", "getCompletion_icon", "getCustom_style_params", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CountdownBadgeDataDto implements Dto3<GetBadgeDataResponse.CountdownBadgeData>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<CountdownBadgeDataDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CountdownBadgeDataDto, GetBadgeDataResponse.CountdownBadgeData>> binaryBase64Serializer$delegate;
        private static final CountdownBadgeDataDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ CountdownBadgeDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CountdownBadgeDataDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final BadgeVisualStyleDto getStyle() {
            return this.surrogate.getStyle();
        }

        public final Instant getTarget_timestamp() {
            return this.surrogate.getTarget_timestamp();
        }

        public final boolean is_pulsing() {
            return this.surrogate.getIs_pulsing();
        }

        public final String getLottie_url_light() {
            return this.surrogate.getLottie_url_light();
        }

        public final String getLottie_url_dark() {
            return this.surrogate.getLottie_url_dark();
        }

        public final String getAction_url() {
            return this.surrogate.getAction_url();
        }

        public final String getIcon_name() {
            return this.surrogate.getIcon_name();
        }

        public final String getBg_lottie_url_light() {
            return this.surrogate.getBg_lottie_url_light();
        }

        public final String getBg_lottie_url_dark() {
            return this.surrogate.getBg_lottie_url_dark();
        }

        public final String getBorder_lottie_url_light() {
            return this.surrogate.getBorder_lottie_url_light();
        }

        public final String getBorder_lottie_url_dark() {
            return this.surrogate.getBorder_lottie_url_dark();
        }

        public final String getLogging_identifier() {
            return this.surrogate.getLogging_identifier();
        }

        public final String getCompletion_text() {
            return this.surrogate.getCompletion_text();
        }

        public final String getCompletion_icon() {
            return this.surrogate.getCompletion_icon();
        }

        public final CustomStyleParamsDto getCustom_style_params() {
            return this.surrogate.getCustom_style_params();
        }

        public /* synthetic */ CountdownBadgeDataDto(BadgeVisualStyleDto badgeVisualStyleDto, Instant instant, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, CustomStyleParamsDto customStyleParamsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BadgeVisualStyleDto.INSTANCE.getZeroValue() : badgeVisualStyleDto, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : customStyleParamsDto);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CountdownBadgeDataDto(BadgeVisualStyleDto style, Instant instant, boolean z, String str, String str2, String str3, String icon_name, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, CustomStyleParamsDto customStyleParamsDto) {
            this(new Surrogate(style, instant, z, str, str2, str3, icon_name, str4, str5, str6, str7, str8, bool, str9, str10, customStyleParamsDto));
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(icon_name, "icon_name");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public GetBadgeDataResponse.CountdownBadgeData toProto() {
            GetBadgeDataResponse.BadgeVisualStyle badgeVisualStyle = (GetBadgeDataResponse.BadgeVisualStyle) this.surrogate.getStyle().toProto();
            Instant target_timestamp = this.surrogate.getTarget_timestamp();
            boolean is_pulsing = this.surrogate.getIs_pulsing();
            String lottie_url_light = this.surrogate.getLottie_url_light();
            String lottie_url_dark = this.surrogate.getLottie_url_dark();
            String action_url = this.surrogate.getAction_url();
            String icon_name = this.surrogate.getIcon_name();
            String bg_lottie_url_light = this.surrogate.getBg_lottie_url_light();
            String bg_lottie_url_dark = this.surrogate.getBg_lottie_url_dark();
            String border_lottie_url_light = this.surrogate.getBorder_lottie_url_light();
            String border_lottie_url_dark = this.surrogate.getBorder_lottie_url_dark();
            String logging_identifier = this.surrogate.getLogging_identifier();
            Boolean use_inline_loading = this.surrogate.getUse_inline_loading();
            String completion_text = this.surrogate.getCompletion_text();
            String completion_icon = this.surrogate.getCompletion_icon();
            CustomStyleParamsDto custom_style_params = this.surrogate.getCustom_style_params();
            return new GetBadgeDataResponse.CountdownBadgeData(badgeVisualStyle, target_timestamp, is_pulsing, lottie_url_light, lottie_url_dark, action_url, icon_name, bg_lottie_url_light, bg_lottie_url_dark, border_lottie_url_light, border_lottie_url_dark, logging_identifier, use_inline_loading, completion_text, completion_icon, custom_style_params != null ? custom_style_params.toProto() : null, null, 65536, null);
        }

        public String toString() {
            return "[CountdownBadgeDataDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof CountdownBadgeDataDto) && Intrinsics.areEqual(((CountdownBadgeDataDto) other).surrogate, this.surrogate);
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
        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b8\b\u0083\b\u0018\u0000 ]2\u00020\u0001:\u0002^]Bå\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB¹\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J'\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00102\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b:\u00106\u001a\u0004\b8\u00109R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\b=\u00106\u001a\u0004\b\u000b\u0010<R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\b@\u00106\u001a\u0004\b?\u0010,R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010>\u0012\u0004\bB\u00106\u001a\u0004\bA\u0010,R\"\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010>\u0012\u0004\bD\u00106\u001a\u0004\bC\u0010,R \u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010>\u0012\u0004\bF\u00106\u001a\u0004\bE\u0010,R\"\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010>\u0012\u0004\bH\u00106\u001a\u0004\bG\u0010,R\"\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010>\u0012\u0004\bJ\u00106\u001a\u0004\bI\u0010,R\"\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010>\u0012\u0004\bL\u00106\u001a\u0004\bK\u0010,R\"\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010>\u0012\u0004\bN\u00106\u001a\u0004\bM\u0010,R\"\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010>\u0012\u0004\bP\u00106\u001a\u0004\bO\u0010,R\"\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010Q\u0012\u0004\bT\u00106\u001a\u0004\bR\u0010SR\"\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010>\u0012\u0004\bV\u00106\u001a\u0004\bU\u0010,R\"\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010>\u0012\u0004\bX\u00106\u001a\u0004\bW\u0010,R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010Y\u0012\u0004\b\\\u00106\u001a\u0004\bZ\u0010[¨\u0006_"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto$Surrogate;", "", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", ResourceTypes.STYLE, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "target_timestamp", "", "is_pulsing", "", "lottie_url_light", "lottie_url_dark", "action_url", "icon_name", "bg_lottie_url_light", "bg_lottie_url_dark", "border_lottie_url_light", "border_lottie_url_dark", "logging_identifier", "use_inline_loading", "completion_text", "completion_icon", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "custom_style_params", "<init>", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;Lj$/time/Instant;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;Lj$/time/Instant;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$messaging_badge_v1_externalRelease", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "getStyle", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "getStyle$annotations", "()V", "Lj$/time/Instant;", "getTarget_timestamp", "()Lj$/time/Instant;", "getTarget_timestamp$annotations", "Z", "()Z", "is_pulsing$annotations", "Ljava/lang/String;", "getLottie_url_light", "getLottie_url_light$annotations", "getLottie_url_dark", "getLottie_url_dark$annotations", "getAction_url", "getAction_url$annotations", "getIcon_name", "getIcon_name$annotations", "getBg_lottie_url_light", "getBg_lottie_url_light$annotations", "getBg_lottie_url_dark", "getBg_lottie_url_dark$annotations", "getBorder_lottie_url_light", "getBorder_lottie_url_light$annotations", "getBorder_lottie_url_dark", "getBorder_lottie_url_dark$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "Ljava/lang/Boolean;", "getUse_inline_loading", "()Ljava/lang/Boolean;", "getUse_inline_loading$annotations", "getCompletion_text", "getCompletion_text$annotations", "getCompletion_icon", "getCompletion_icon$annotations", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "getCustom_style_params", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "getCustom_style_params$annotations", "Companion", "$serializer", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String action_url;
            private final String bg_lottie_url_dark;
            private final String bg_lottie_url_light;
            private final String border_lottie_url_dark;
            private final String border_lottie_url_light;
            private final String completion_icon;
            private final String completion_text;
            private final CustomStyleParamsDto custom_style_params;
            private final String icon_name;
            private final boolean is_pulsing;
            private final String logging_identifier;
            private final String lottie_url_dark;
            private final String lottie_url_light;
            private final BadgeVisualStyleDto style;
            private final Instant target_timestamp;
            private final Boolean use_inline_loading;

            public Surrogate() {
                this((BadgeVisualStyleDto) null, (Instant) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (CustomStyleParamsDto) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.style == surrogate.style && Intrinsics.areEqual(this.target_timestamp, surrogate.target_timestamp) && this.is_pulsing == surrogate.is_pulsing && Intrinsics.areEqual(this.lottie_url_light, surrogate.lottie_url_light) && Intrinsics.areEqual(this.lottie_url_dark, surrogate.lottie_url_dark) && Intrinsics.areEqual(this.action_url, surrogate.action_url) && Intrinsics.areEqual(this.icon_name, surrogate.icon_name) && Intrinsics.areEqual(this.bg_lottie_url_light, surrogate.bg_lottie_url_light) && Intrinsics.areEqual(this.bg_lottie_url_dark, surrogate.bg_lottie_url_dark) && Intrinsics.areEqual(this.border_lottie_url_light, surrogate.border_lottie_url_light) && Intrinsics.areEqual(this.border_lottie_url_dark, surrogate.border_lottie_url_dark) && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && Intrinsics.areEqual(this.use_inline_loading, surrogate.use_inline_loading) && Intrinsics.areEqual(this.completion_text, surrogate.completion_text) && Intrinsics.areEqual(this.completion_icon, surrogate.completion_icon) && Intrinsics.areEqual(this.custom_style_params, surrogate.custom_style_params);
            }

            public int hashCode() {
                int iHashCode = this.style.hashCode() * 31;
                Instant instant = this.target_timestamp;
                int iHashCode2 = (((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + Boolean.hashCode(this.is_pulsing)) * 31;
                String str = this.lottie_url_light;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.lottie_url_dark;
                int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.action_url;
                int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.icon_name.hashCode()) * 31;
                String str4 = this.bg_lottie_url_light;
                int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.bg_lottie_url_dark;
                int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.border_lottie_url_light;
                int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.border_lottie_url_dark;
                int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.logging_identifier;
                int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
                Boolean bool = this.use_inline_loading;
                int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str9 = this.completion_text;
                int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.completion_icon;
                int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
                CustomStyleParamsDto customStyleParamsDto = this.custom_style_params;
                return iHashCode13 + (customStyleParamsDto != null ? customStyleParamsDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(style=" + this.style + ", target_timestamp=" + this.target_timestamp + ", is_pulsing=" + this.is_pulsing + ", lottie_url_light=" + this.lottie_url_light + ", lottie_url_dark=" + this.lottie_url_dark + ", action_url=" + this.action_url + ", icon_name=" + this.icon_name + ", bg_lottie_url_light=" + this.bg_lottie_url_light + ", bg_lottie_url_dark=" + this.bg_lottie_url_dark + ", border_lottie_url_light=" + this.border_lottie_url_light + ", border_lottie_url_dark=" + this.border_lottie_url_dark + ", logging_identifier=" + this.logging_identifier + ", use_inline_loading=" + this.use_inline_loading + ", completion_text=" + this.completion_text + ", completion_icon=" + this.completion_icon + ", custom_style_params=" + this.custom_style_params + ")";
            }

            /* compiled from: GetBadgeDataResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto$Surrogate;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return GetBadgeDataResponseDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, BadgeVisualStyleDto badgeVisualStyleDto, Instant instant, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, CustomStyleParamsDto customStyleParamsDto, SerializationConstructorMarker serializationConstructorMarker) {
                this.style = (i & 1) == 0 ? BadgeVisualStyleDto.INSTANCE.getZeroValue() : badgeVisualStyleDto;
                if ((i & 2) == 0) {
                    this.target_timestamp = null;
                } else {
                    this.target_timestamp = instant;
                }
                if ((i & 4) == 0) {
                    this.is_pulsing = false;
                } else {
                    this.is_pulsing = z;
                }
                if ((i & 8) == 0) {
                    this.lottie_url_light = null;
                } else {
                    this.lottie_url_light = str;
                }
                if ((i & 16) == 0) {
                    this.lottie_url_dark = null;
                } else {
                    this.lottie_url_dark = str2;
                }
                if ((i & 32) == 0) {
                    this.action_url = null;
                } else {
                    this.action_url = str3;
                }
                if ((i & 64) == 0) {
                    this.icon_name = "";
                } else {
                    this.icon_name = str4;
                }
                if ((i & 128) == 0) {
                    this.bg_lottie_url_light = null;
                } else {
                    this.bg_lottie_url_light = str5;
                }
                if ((i & 256) == 0) {
                    this.bg_lottie_url_dark = null;
                } else {
                    this.bg_lottie_url_dark = str6;
                }
                if ((i & 512) == 0) {
                    this.border_lottie_url_light = null;
                } else {
                    this.border_lottie_url_light = str7;
                }
                if ((i & 1024) == 0) {
                    this.border_lottie_url_dark = null;
                } else {
                    this.border_lottie_url_dark = str8;
                }
                if ((i & 2048) == 0) {
                    this.logging_identifier = null;
                } else {
                    this.logging_identifier = str9;
                }
                if ((i & 4096) == 0) {
                    this.use_inline_loading = null;
                } else {
                    this.use_inline_loading = bool;
                }
                if ((i & 8192) == 0) {
                    this.completion_text = null;
                } else {
                    this.completion_text = str10;
                }
                if ((i & 16384) == 0) {
                    this.completion_icon = null;
                } else {
                    this.completion_icon = str11;
                }
                if ((i & 32768) == 0) {
                    this.custom_style_params = null;
                } else {
                    this.custom_style_params = customStyleParamsDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$messaging_badge_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.style != BadgeVisualStyleDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, BadgeVisualStyleDto.Serializer.INSTANCE, self.style);
                }
                Instant instant = self.target_timestamp;
                if (instant != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
                }
                boolean z = self.is_pulsing;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 2, z);
                }
                String str = self.lottie_url_light;
                if (str != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
                }
                String str2 = self.lottie_url_dark;
                if (str2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str2);
                }
                String str3 = self.action_url;
                if (str3 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str3);
                }
                if (!Intrinsics.areEqual(self.icon_name, "")) {
                    output.encodeStringElement(serialDesc, 6, self.icon_name);
                }
                String str4 = self.bg_lottie_url_light;
                if (str4 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str4);
                }
                String str5 = self.bg_lottie_url_dark;
                if (str5 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str5);
                }
                String str6 = self.border_lottie_url_light;
                if (str6 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str6);
                }
                String str7 = self.border_lottie_url_dark;
                if (str7 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, str7);
                }
                String str8 = self.logging_identifier;
                if (str8 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, str8);
                }
                Boolean bool = self.use_inline_loading;
                if (bool != null) {
                    output.encodeNullableSerializableElement(serialDesc, 12, BooleanSerializer.INSTANCE, bool);
                }
                String str9 = self.completion_text;
                if (str9 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, str9);
                }
                String str10 = self.completion_icon;
                if (str10 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, str10);
                }
                CustomStyleParamsDto customStyleParamsDto = self.custom_style_params;
                if (customStyleParamsDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 15, CustomStyleParamsDto.Serializer.INSTANCE, customStyleParamsDto);
                }
            }

            public Surrogate(BadgeVisualStyleDto style, Instant instant, boolean z, String str, String str2, String str3, String icon_name, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, CustomStyleParamsDto customStyleParamsDto) {
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(icon_name, "icon_name");
                this.style = style;
                this.target_timestamp = instant;
                this.is_pulsing = z;
                this.lottie_url_light = str;
                this.lottie_url_dark = str2;
                this.action_url = str3;
                this.icon_name = icon_name;
                this.bg_lottie_url_light = str4;
                this.bg_lottie_url_dark = str5;
                this.border_lottie_url_light = str6;
                this.border_lottie_url_dark = str7;
                this.logging_identifier = str8;
                this.use_inline_loading = bool;
                this.completion_text = str9;
                this.completion_icon = str10;
                this.custom_style_params = customStyleParamsDto;
            }

            public final BadgeVisualStyleDto getStyle() {
                return this.style;
            }

            public /* synthetic */ Surrogate(BadgeVisualStyleDto badgeVisualStyleDto, Instant instant, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, CustomStyleParamsDto customStyleParamsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? BadgeVisualStyleDto.INSTANCE.getZeroValue() : badgeVisualStyleDto, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : customStyleParamsDto);
            }

            public final Instant getTarget_timestamp() {
                return this.target_timestamp;
            }

            /* renamed from: is_pulsing, reason: from getter */
            public final boolean getIs_pulsing() {
                return this.is_pulsing;
            }

            public final String getLottie_url_light() {
                return this.lottie_url_light;
            }

            public final String getLottie_url_dark() {
                return this.lottie_url_dark;
            }

            public final String getAction_url() {
                return this.action_url;
            }

            public final String getIcon_name() {
                return this.icon_name;
            }

            public final String getBg_lottie_url_light() {
                return this.bg_lottie_url_light;
            }

            public final String getBg_lottie_url_dark() {
                return this.bg_lottie_url_dark;
            }

            public final String getBorder_lottie_url_light() {
                return this.border_lottie_url_light;
            }

            public final String getBorder_lottie_url_dark() {
                return this.border_lottie_url_dark;
            }

            public final String getLogging_identifier() {
                return this.logging_identifier;
            }

            public final Boolean getUse_inline_loading() {
                return this.use_inline_loading;
            }

            public final String getCompletion_text() {
                return this.completion_text;
            }

            public final String getCompletion_icon() {
                return this.completion_icon;
            }

            public final CustomStyleParamsDto getCustom_style_params() {
                return this.custom_style_params;
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$CountdownBadgeData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<CountdownBadgeDataDto, GetBadgeDataResponse.CountdownBadgeData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CountdownBadgeDataDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CountdownBadgeDataDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CountdownBadgeDataDto> getBinaryBase64Serializer() {
                return (KSerializer) CountdownBadgeDataDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetBadgeDataResponse.CountdownBadgeData> getProtoAdapter() {
                return GetBadgeDataResponse.CountdownBadgeData.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CountdownBadgeDataDto getZeroValue() {
                return CountdownBadgeDataDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CountdownBadgeDataDto fromProto(GetBadgeDataResponse.CountdownBadgeData proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                BadgeVisualStyleDto badgeVisualStyleDtoFromProto = BadgeVisualStyleDto.INSTANCE.fromProto(proto.getStyle());
                Instant target_timestamp = proto.getTarget_timestamp();
                boolean is_pulsing = proto.getIs_pulsing();
                String lottie_url_light = proto.getLottie_url_light();
                String lottie_url_dark = proto.getLottie_url_dark();
                String action_url = proto.getAction_url();
                String icon_name = proto.getIcon_name();
                String bg_lottie_url_light = proto.getBg_lottie_url_light();
                String bg_lottie_url_dark = proto.getBg_lottie_url_dark();
                String border_lottie_url_light = proto.getBorder_lottie_url_light();
                String border_lottie_url_dark = proto.getBorder_lottie_url_dark();
                String logging_identifier = proto.getLogging_identifier();
                Boolean use_inline_loading = proto.getUse_inline_loading();
                String completion_text = proto.getCompletion_text();
                String completion_icon = proto.getCompletion_icon();
                GetBadgeDataResponse.CustomStyleParams custom_style_params = proto.getCustom_style_params();
                return new CountdownBadgeDataDto(new Surrogate(badgeVisualStyleDtoFromProto, target_timestamp, is_pulsing, lottie_url_light, lottie_url_dark, action_url, icon_name, bg_lottie_url_light, bg_lottie_url_dark, border_lottie_url_light, border_lottie_url_dark, logging_identifier, use_inline_loading, completion_text, completion_icon, custom_style_params != null ? CustomStyleParamsDto.INSTANCE.fromProto(custom_style_params) : null), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: messaging.proto.badge.v1.GetBadgeDataResponseDto$CountdownBadgeDataDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetBadgeDataResponseDto.CountdownBadgeDataDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new CountdownBadgeDataDto(null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto;", "<init>", "()V", "surrogateSerializer", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CountdownBadgeDataDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/messaging.proto.badge.v1.GetBadgeDataResponse.CountdownBadgeData", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CountdownBadgeDataDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public CountdownBadgeDataDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new CountdownBadgeDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CountdownBadgeDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4189_5)
            public final String provideIntoMap() {
                return "messaging.proto.badge.v1.GetBadgeDataResponseDto$CountdownBadgeDataDto";
            }
        }
    }

    /* compiled from: GetBadgeDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004BACDB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BÁ\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0006\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b2\u0010 R\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b3\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b4\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b5\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b6\u0010 R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u00107R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b8\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b9\u0010 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b:\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b;\u0010 R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b<\u0010 R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b=\u0010 R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010>R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006E"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$TextBadgeData;", "Landroid/os/Parcelable;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto$Surrogate;", "surrogate", "<init>", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto$Surrogate;)V", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", ResourceTypes.STYLE, "", "content", "icon_name", "lottie_url_light", "lottie_url_dark", "action_url", "", "is_pulsing", "bg_lottie_url_light", "bg_lottie_url_dark", "border_lottie_url_light", "border_lottie_url_dark", "logging_identifier", "use_inline_loading", "badge_identifier", "is_notification_dot_visible", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "custom_style_params", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;)V", "toProto", "()Lmessaging/proto/badge/v1/GetBadgeDataResponse$TextBadgeData;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto$Surrogate;", "getStyle", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "getContent", "getIcon_name", "getLottie_url_light", "getLottie_url_dark", "getAction_url", "()Z", "getBg_lottie_url_light", "getBg_lottie_url_dark", "getBorder_lottie_url_light", "getBorder_lottie_url_dark", "getLogging_identifier", "getBadge_identifier", "()Ljava/lang/Boolean;", "getCustom_style_params", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TextBadgeDataDto implements Dto3<GetBadgeDataResponse.TextBadgeData>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TextBadgeDataDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TextBadgeDataDto, GetBadgeDataResponse.TextBadgeData>> binaryBase64Serializer$delegate;
        private static final TextBadgeDataDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TextBadgeDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TextBadgeDataDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final BadgeVisualStyleDto getStyle() {
            return this.surrogate.getStyle();
        }

        public final String getContent() {
            return this.surrogate.getContent();
        }

        public final String getIcon_name() {
            return this.surrogate.getIcon_name();
        }

        public final String getLottie_url_light() {
            return this.surrogate.getLottie_url_light();
        }

        public final String getLottie_url_dark() {
            return this.surrogate.getLottie_url_dark();
        }

        public final String getAction_url() {
            return this.surrogate.getAction_url();
        }

        public final boolean is_pulsing() {
            return this.surrogate.getIs_pulsing();
        }

        public final String getBg_lottie_url_light() {
            return this.surrogate.getBg_lottie_url_light();
        }

        public final String getBg_lottie_url_dark() {
            return this.surrogate.getBg_lottie_url_dark();
        }

        public final String getBorder_lottie_url_light() {
            return this.surrogate.getBorder_lottie_url_light();
        }

        public final String getBorder_lottie_url_dark() {
            return this.surrogate.getBorder_lottie_url_dark();
        }

        public final String getLogging_identifier() {
            return this.surrogate.getLogging_identifier();
        }

        public final String getBadge_identifier() {
            return this.surrogate.getBadge_identifier();
        }

        public final Boolean is_notification_dot_visible() {
            return this.surrogate.getIs_notification_dot_visible();
        }

        public final CustomStyleParamsDto getCustom_style_params() {
            return this.surrogate.getCustom_style_params();
        }

        public /* synthetic */ TextBadgeDataDto(BadgeVisualStyleDto badgeVisualStyleDto, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, Boolean bool2, CustomStyleParamsDto customStyleParamsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BadgeVisualStyleDto.INSTANCE.getZeroValue() : badgeVisualStyleDto, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : bool2, (i & 32768) != 0 ? null : customStyleParamsDto);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TextBadgeDataDto(BadgeVisualStyleDto style, String content, String icon_name, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, Boolean bool2, CustomStyleParamsDto customStyleParamsDto) {
            this(new Surrogate(style, content, icon_name, str, str2, str3, z, str4, str5, str6, str7, str8, bool, str9, bool2, customStyleParamsDto));
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(icon_name, "icon_name");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public GetBadgeDataResponse.TextBadgeData toProto() {
            GetBadgeDataResponse.BadgeVisualStyle badgeVisualStyle = (GetBadgeDataResponse.BadgeVisualStyle) this.surrogate.getStyle().toProto();
            String content = this.surrogate.getContent();
            String icon_name = this.surrogate.getIcon_name();
            String lottie_url_light = this.surrogate.getLottie_url_light();
            String lottie_url_dark = this.surrogate.getLottie_url_dark();
            String action_url = this.surrogate.getAction_url();
            boolean is_pulsing = this.surrogate.getIs_pulsing();
            String bg_lottie_url_light = this.surrogate.getBg_lottie_url_light();
            String bg_lottie_url_dark = this.surrogate.getBg_lottie_url_dark();
            String border_lottie_url_light = this.surrogate.getBorder_lottie_url_light();
            String border_lottie_url_dark = this.surrogate.getBorder_lottie_url_dark();
            String logging_identifier = this.surrogate.getLogging_identifier();
            Boolean use_inline_loading = this.surrogate.getUse_inline_loading();
            String badge_identifier = this.surrogate.getBadge_identifier();
            Boolean is_notification_dot_visible = this.surrogate.getIs_notification_dot_visible();
            CustomStyleParamsDto custom_style_params = this.surrogate.getCustom_style_params();
            return new GetBadgeDataResponse.TextBadgeData(badgeVisualStyle, content, icon_name, lottie_url_light, lottie_url_dark, action_url, is_pulsing, bg_lottie_url_light, bg_lottie_url_dark, border_lottie_url_light, border_lottie_url_dark, logging_identifier, use_inline_loading, badge_identifier, is_notification_dot_visible, custom_style_params != null ? custom_style_params.toProto() : null, null, 65536, null);
        }

        public String toString() {
            return "[TextBadgeDataDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TextBadgeDataDto) && Intrinsics.areEqual(((TextBadgeDataDto) other).surrogate, this.surrogate);
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
        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b5\b\u0083\b\u0018\u0000 U2\u00020\u0001:\u0002VUB¿\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B¹\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010'R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00102\u0012\u0004\b6\u00101\u001a\u0004\b5\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b8\u00101\u001a\u0004\b7\u0010'R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b:\u00101\u001a\u0004\b9\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b<\u00101\u001a\u0004\b;\u0010'R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010=\u0012\u0004\b?\u00101\u001a\u0004\b\u000b\u0010>R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\bA\u00101\u001a\u0004\b@\u0010'R\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\bC\u00101\u001a\u0004\bB\u0010'R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00102\u0012\u0004\bE\u00101\u001a\u0004\bD\u0010'R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00102\u0012\u0004\bG\u00101\u001a\u0004\bF\u0010'R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00102\u0012\u0004\bI\u00101\u001a\u0004\bH\u0010'R\"\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010J\u0012\u0004\bM\u00101\u001a\u0004\bK\u0010LR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00102\u0012\u0004\bO\u00101\u001a\u0004\bN\u0010'R\"\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010J\u0012\u0004\bP\u00101\u001a\u0004\b\u0013\u0010LR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010Q\u0012\u0004\bT\u00101\u001a\u0004\bR\u0010S¨\u0006W"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto$Surrogate;", "", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", ResourceTypes.STYLE, "", "content", "icon_name", "lottie_url_light", "lottie_url_dark", "action_url", "", "is_pulsing", "bg_lottie_url_light", "bg_lottie_url_dark", "border_lottie_url_light", "border_lottie_url_dark", "logging_identifier", "use_inline_loading", "badge_identifier", "is_notification_dot_visible", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "custom_style_params", "<init>", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$messaging_badge_v1_externalRelease", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "getStyle", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "getStyle$annotations", "()V", "Ljava/lang/String;", "getContent", "getContent$annotations", "getIcon_name", "getIcon_name$annotations", "getLottie_url_light", "getLottie_url_light$annotations", "getLottie_url_dark", "getLottie_url_dark$annotations", "getAction_url", "getAction_url$annotations", "Z", "()Z", "is_pulsing$annotations", "getBg_lottie_url_light", "getBg_lottie_url_light$annotations", "getBg_lottie_url_dark", "getBg_lottie_url_dark$annotations", "getBorder_lottie_url_light", "getBorder_lottie_url_light$annotations", "getBorder_lottie_url_dark", "getBorder_lottie_url_dark$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "Ljava/lang/Boolean;", "getUse_inline_loading", "()Ljava/lang/Boolean;", "getUse_inline_loading$annotations", "getBadge_identifier", "getBadge_identifier$annotations", "is_notification_dot_visible$annotations", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "getCustom_style_params", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "getCustom_style_params$annotations", "Companion", "$serializer", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String action_url;
            private final String badge_identifier;
            private final String bg_lottie_url_dark;
            private final String bg_lottie_url_light;
            private final String border_lottie_url_dark;
            private final String border_lottie_url_light;
            private final String content;
            private final CustomStyleParamsDto custom_style_params;
            private final String icon_name;
            private final Boolean is_notification_dot_visible;
            private final boolean is_pulsing;
            private final String logging_identifier;
            private final String lottie_url_dark;
            private final String lottie_url_light;
            private final BadgeVisualStyleDto style;
            private final Boolean use_inline_loading;

            public Surrogate() {
                this((BadgeVisualStyleDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (Boolean) null, (CustomStyleParamsDto) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.style == surrogate.style && Intrinsics.areEqual(this.content, surrogate.content) && Intrinsics.areEqual(this.icon_name, surrogate.icon_name) && Intrinsics.areEqual(this.lottie_url_light, surrogate.lottie_url_light) && Intrinsics.areEqual(this.lottie_url_dark, surrogate.lottie_url_dark) && Intrinsics.areEqual(this.action_url, surrogate.action_url) && this.is_pulsing == surrogate.is_pulsing && Intrinsics.areEqual(this.bg_lottie_url_light, surrogate.bg_lottie_url_light) && Intrinsics.areEqual(this.bg_lottie_url_dark, surrogate.bg_lottie_url_dark) && Intrinsics.areEqual(this.border_lottie_url_light, surrogate.border_lottie_url_light) && Intrinsics.areEqual(this.border_lottie_url_dark, surrogate.border_lottie_url_dark) && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && Intrinsics.areEqual(this.use_inline_loading, surrogate.use_inline_loading) && Intrinsics.areEqual(this.badge_identifier, surrogate.badge_identifier) && Intrinsics.areEqual(this.is_notification_dot_visible, surrogate.is_notification_dot_visible) && Intrinsics.areEqual(this.custom_style_params, surrogate.custom_style_params);
            }

            public int hashCode() {
                int iHashCode = ((((this.style.hashCode() * 31) + this.content.hashCode()) * 31) + this.icon_name.hashCode()) * 31;
                String str = this.lottie_url_light;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.lottie_url_dark;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.action_url;
                int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.is_pulsing)) * 31;
                String str4 = this.bg_lottie_url_light;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.bg_lottie_url_dark;
                int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.border_lottie_url_light;
                int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.border_lottie_url_dark;
                int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.logging_identifier;
                int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
                Boolean bool = this.use_inline_loading;
                int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str9 = this.badge_identifier;
                int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
                Boolean bool2 = this.is_notification_dot_visible;
                int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                CustomStyleParamsDto customStyleParamsDto = this.custom_style_params;
                return iHashCode12 + (customStyleParamsDto != null ? customStyleParamsDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(style=" + this.style + ", content=" + this.content + ", icon_name=" + this.icon_name + ", lottie_url_light=" + this.lottie_url_light + ", lottie_url_dark=" + this.lottie_url_dark + ", action_url=" + this.action_url + ", is_pulsing=" + this.is_pulsing + ", bg_lottie_url_light=" + this.bg_lottie_url_light + ", bg_lottie_url_dark=" + this.bg_lottie_url_dark + ", border_lottie_url_light=" + this.border_lottie_url_light + ", border_lottie_url_dark=" + this.border_lottie_url_dark + ", logging_identifier=" + this.logging_identifier + ", use_inline_loading=" + this.use_inline_loading + ", badge_identifier=" + this.badge_identifier + ", is_notification_dot_visible=" + this.is_notification_dot_visible + ", custom_style_params=" + this.custom_style_params + ")";
            }

            /* compiled from: GetBadgeDataResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto$Surrogate;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return GetBadgeDataResponseDto7.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, BadgeVisualStyleDto badgeVisualStyleDto, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, Boolean bool2, CustomStyleParamsDto customStyleParamsDto, SerializationConstructorMarker serializationConstructorMarker) {
                this.style = (i & 1) == 0 ? BadgeVisualStyleDto.INSTANCE.getZeroValue() : badgeVisualStyleDto;
                if ((i & 2) == 0) {
                    this.content = "";
                } else {
                    this.content = str;
                }
                if ((i & 4) == 0) {
                    this.icon_name = "";
                } else {
                    this.icon_name = str2;
                }
                if ((i & 8) == 0) {
                    this.lottie_url_light = null;
                } else {
                    this.lottie_url_light = str3;
                }
                if ((i & 16) == 0) {
                    this.lottie_url_dark = null;
                } else {
                    this.lottie_url_dark = str4;
                }
                if ((i & 32) == 0) {
                    this.action_url = null;
                } else {
                    this.action_url = str5;
                }
                if ((i & 64) == 0) {
                    this.is_pulsing = false;
                } else {
                    this.is_pulsing = z;
                }
                if ((i & 128) == 0) {
                    this.bg_lottie_url_light = null;
                } else {
                    this.bg_lottie_url_light = str6;
                }
                if ((i & 256) == 0) {
                    this.bg_lottie_url_dark = null;
                } else {
                    this.bg_lottie_url_dark = str7;
                }
                if ((i & 512) == 0) {
                    this.border_lottie_url_light = null;
                } else {
                    this.border_lottie_url_light = str8;
                }
                if ((i & 1024) == 0) {
                    this.border_lottie_url_dark = null;
                } else {
                    this.border_lottie_url_dark = str9;
                }
                if ((i & 2048) == 0) {
                    this.logging_identifier = null;
                } else {
                    this.logging_identifier = str10;
                }
                if ((i & 4096) == 0) {
                    this.use_inline_loading = null;
                } else {
                    this.use_inline_loading = bool;
                }
                if ((i & 8192) == 0) {
                    this.badge_identifier = null;
                } else {
                    this.badge_identifier = str11;
                }
                if ((i & 16384) == 0) {
                    this.is_notification_dot_visible = null;
                } else {
                    this.is_notification_dot_visible = bool2;
                }
                if ((i & 32768) == 0) {
                    this.custom_style_params = null;
                } else {
                    this.custom_style_params = customStyleParamsDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$messaging_badge_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.style != BadgeVisualStyleDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, BadgeVisualStyleDto.Serializer.INSTANCE, self.style);
                }
                if (!Intrinsics.areEqual(self.content, "")) {
                    output.encodeStringElement(serialDesc, 1, self.content);
                }
                if (!Intrinsics.areEqual(self.icon_name, "")) {
                    output.encodeStringElement(serialDesc, 2, self.icon_name);
                }
                String str = self.lottie_url_light;
                if (str != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
                }
                String str2 = self.lottie_url_dark;
                if (str2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str2);
                }
                String str3 = self.action_url;
                if (str3 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str3);
                }
                boolean z = self.is_pulsing;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 6, z);
                }
                String str4 = self.bg_lottie_url_light;
                if (str4 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str4);
                }
                String str5 = self.bg_lottie_url_dark;
                if (str5 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str5);
                }
                String str6 = self.border_lottie_url_light;
                if (str6 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str6);
                }
                String str7 = self.border_lottie_url_dark;
                if (str7 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, str7);
                }
                String str8 = self.logging_identifier;
                if (str8 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, str8);
                }
                Boolean bool = self.use_inline_loading;
                if (bool != null) {
                    output.encodeNullableSerializableElement(serialDesc, 12, BooleanSerializer.INSTANCE, bool);
                }
                String str9 = self.badge_identifier;
                if (str9 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, str9);
                }
                Boolean bool2 = self.is_notification_dot_visible;
                if (bool2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 14, BooleanSerializer.INSTANCE, bool2);
                }
                CustomStyleParamsDto customStyleParamsDto = self.custom_style_params;
                if (customStyleParamsDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 15, CustomStyleParamsDto.Serializer.INSTANCE, customStyleParamsDto);
                }
            }

            public Surrogate(BadgeVisualStyleDto style, String content, String icon_name, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, Boolean bool2, CustomStyleParamsDto customStyleParamsDto) {
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(content, "content");
                Intrinsics.checkNotNullParameter(icon_name, "icon_name");
                this.style = style;
                this.content = content;
                this.icon_name = icon_name;
                this.lottie_url_light = str;
                this.lottie_url_dark = str2;
                this.action_url = str3;
                this.is_pulsing = z;
                this.bg_lottie_url_light = str4;
                this.bg_lottie_url_dark = str5;
                this.border_lottie_url_light = str6;
                this.border_lottie_url_dark = str7;
                this.logging_identifier = str8;
                this.use_inline_loading = bool;
                this.badge_identifier = str9;
                this.is_notification_dot_visible = bool2;
                this.custom_style_params = customStyleParamsDto;
            }

            public final BadgeVisualStyleDto getStyle() {
                return this.style;
            }

            public /* synthetic */ Surrogate(BadgeVisualStyleDto badgeVisualStyleDto, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, Boolean bool2, CustomStyleParamsDto customStyleParamsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? BadgeVisualStyleDto.INSTANCE.getZeroValue() : badgeVisualStyleDto, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : bool2, (i & 32768) != 0 ? null : customStyleParamsDto);
            }

            public final String getContent() {
                return this.content;
            }

            public final String getIcon_name() {
                return this.icon_name;
            }

            public final String getLottie_url_light() {
                return this.lottie_url_light;
            }

            public final String getLottie_url_dark() {
                return this.lottie_url_dark;
            }

            public final String getAction_url() {
                return this.action_url;
            }

            /* renamed from: is_pulsing, reason: from getter */
            public final boolean getIs_pulsing() {
                return this.is_pulsing;
            }

            public final String getBg_lottie_url_light() {
                return this.bg_lottie_url_light;
            }

            public final String getBg_lottie_url_dark() {
                return this.bg_lottie_url_dark;
            }

            public final String getBorder_lottie_url_light() {
                return this.border_lottie_url_light;
            }

            public final String getBorder_lottie_url_dark() {
                return this.border_lottie_url_dark;
            }

            public final String getLogging_identifier() {
                return this.logging_identifier;
            }

            public final Boolean getUse_inline_loading() {
                return this.use_inline_loading;
            }

            public final String getBadge_identifier() {
                return this.badge_identifier;
            }

            /* renamed from: is_notification_dot_visible, reason: from getter */
            public final Boolean getIs_notification_dot_visible() {
                return this.is_notification_dot_visible;
            }

            public final CustomStyleParamsDto getCustom_style_params() {
                return this.custom_style_params;
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$TextBadgeData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<TextBadgeDataDto, GetBadgeDataResponse.TextBadgeData> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TextBadgeDataDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TextBadgeDataDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TextBadgeDataDto> getBinaryBase64Serializer() {
                return (KSerializer) TextBadgeDataDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetBadgeDataResponse.TextBadgeData> getProtoAdapter() {
                return GetBadgeDataResponse.TextBadgeData.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TextBadgeDataDto getZeroValue() {
                return TextBadgeDataDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TextBadgeDataDto fromProto(GetBadgeDataResponse.TextBadgeData proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                BadgeVisualStyleDto badgeVisualStyleDtoFromProto = BadgeVisualStyleDto.INSTANCE.fromProto(proto.getStyle());
                String content = proto.getContent();
                String icon_name = proto.getIcon_name();
                String lottie_url_light = proto.getLottie_url_light();
                String lottie_url_dark = proto.getLottie_url_dark();
                String action_url = proto.getAction_url();
                boolean is_pulsing = proto.getIs_pulsing();
                String bg_lottie_url_light = proto.getBg_lottie_url_light();
                String bg_lottie_url_dark = proto.getBg_lottie_url_dark();
                String border_lottie_url_light = proto.getBorder_lottie_url_light();
                String border_lottie_url_dark = proto.getBorder_lottie_url_dark();
                String logging_identifier = proto.getLogging_identifier();
                Boolean use_inline_loading = proto.getUse_inline_loading();
                String badge_identifier = proto.getBadge_identifier();
                Boolean is_notification_dot_visible = proto.getIs_notification_dot_visible();
                GetBadgeDataResponse.CustomStyleParams custom_style_params = proto.getCustom_style_params();
                return new TextBadgeDataDto(new Surrogate(badgeVisualStyleDtoFromProto, content, icon_name, lottie_url_light, lottie_url_dark, action_url, is_pulsing, bg_lottie_url_light, bg_lottie_url_dark, border_lottie_url_light, border_lottie_url_dark, logging_identifier, use_inline_loading, badge_identifier, is_notification_dot_visible, custom_style_params != null ? CustomStyleParamsDto.INSTANCE.fromProto(custom_style_params) : null), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: messaging.proto.badge.v1.GetBadgeDataResponseDto$TextBadgeDataDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetBadgeDataResponseDto.TextBadgeDataDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TextBadgeDataDto(null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto;", "<init>", "()V", "surrogateSerializer", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TextBadgeDataDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/messaging.proto.badge.v1.GetBadgeDataResponse.TextBadgeData", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TextBadgeDataDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TextBadgeDataDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TextBadgeDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$TextBadgeDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
            public final String provideIntoMap() {
                return "messaging.proto.badge.v1.GetBadgeDataResponseDto$TextBadgeDataDto";
            }
        }
    }

    /* compiled from: GetBadgeDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00040/12B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bu\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b,\u0010+R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b.\u0010+¨\u00063"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "Lcom/robinhood/idl/MessageDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$CustomStyleParams;", "Landroid/os/Parcelable;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto$Surrogate;", "surrogate", "<init>", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto$Surrogate;)V", "Lrh_server_driven_ui/v1/ThemedColorDto;", "background_color", "border_color", "pulsating_color", "notification_dot_color", "", "should_shimmer", "Lrh_server_driven_ui/v1/LinearGradientColorDto;", "background_gradient", "text_gradient", "", "border_opacity", "text_color", "(Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/Boolean;Lrh_server_driven_ui/v1/LinearGradientColorDto;Lrh_server_driven_ui/v1/LinearGradientColorDto;Ljava/lang/Float;Lrh_server_driven_ui/v1/ThemedColorDto;)V", "toProto", "()Lmessaging/proto/badge/v1/GetBadgeDataResponse$CustomStyleParams;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto$Surrogate;", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getBorder_color", "getPulsating_color", "getText_color", "Companion", "Surrogate", "Serializer", "MultibindingModule", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CustomStyleParamsDto implements Dto3<GetBadgeDataResponse.CustomStyleParams>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<CustomStyleParamsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CustomStyleParamsDto, GetBadgeDataResponse.CustomStyleParams>> binaryBase64Serializer$delegate;
        private static final CustomStyleParamsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ CustomStyleParamsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CustomStyleParamsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final ThemedColorDto getBackground_color() {
            return this.surrogate.getBackground_color();
        }

        public final ThemedColorDto getBorder_color() {
            return this.surrogate.getBorder_color();
        }

        public final ThemedColorDto getPulsating_color() {
            return this.surrogate.getPulsating_color();
        }

        public final ThemedColorDto getText_color() {
            return this.surrogate.getText_color();
        }

        public /* synthetic */ CustomStyleParamsDto(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ThemedColorDto themedColorDto3, ThemedColorDto themedColorDto4, Boolean bool, LinearGradientColorDto linearGradientColorDto, LinearGradientColorDto linearGradientColorDto2, Float f, ThemedColorDto themedColorDto5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : themedColorDto, (i & 2) != 0 ? null : themedColorDto2, (i & 4) != 0 ? null : themedColorDto3, (i & 8) != 0 ? null : themedColorDto4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : linearGradientColorDto, (i & 64) != 0 ? null : linearGradientColorDto2, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : themedColorDto5);
        }

        public CustomStyleParamsDto(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ThemedColorDto themedColorDto3, ThemedColorDto themedColorDto4, Boolean bool, LinearGradientColorDto linearGradientColorDto, LinearGradientColorDto linearGradientColorDto2, Float f, ThemedColorDto themedColorDto5) {
            this(new Surrogate(themedColorDto, themedColorDto2, themedColorDto3, themedColorDto4, bool, linearGradientColorDto, linearGradientColorDto2, f, themedColorDto5));
        }

        @Override // com.robinhood.idl.Dto
        public GetBadgeDataResponse.CustomStyleParams toProto() {
            ThemedColorDto background_color = this.surrogate.getBackground_color();
            ThemedColor proto = background_color != null ? background_color.toProto() : null;
            ThemedColorDto border_color = this.surrogate.getBorder_color();
            ThemedColor proto2 = border_color != null ? border_color.toProto() : null;
            ThemedColorDto pulsating_color = this.surrogate.getPulsating_color();
            ThemedColor proto3 = pulsating_color != null ? pulsating_color.toProto() : null;
            ThemedColorDto notification_dot_color = this.surrogate.getNotification_dot_color();
            ThemedColor proto4 = notification_dot_color != null ? notification_dot_color.toProto() : null;
            Boolean should_shimmer = this.surrogate.getShould_shimmer();
            LinearGradientColorDto background_gradient = this.surrogate.getBackground_gradient();
            LinearGradientColor proto5 = background_gradient != null ? background_gradient.toProto() : null;
            LinearGradientColorDto text_gradient = this.surrogate.getText_gradient();
            LinearGradientColor proto6 = text_gradient != null ? text_gradient.toProto() : null;
            Float border_opacity = this.surrogate.getBorder_opacity();
            ThemedColorDto text_color = this.surrogate.getText_color();
            return new GetBadgeDataResponse.CustomStyleParams(proto, proto2, proto3, proto4, should_shimmer, proto5, proto6, border_opacity, text_color != null ? text_color.toProto() : null, null, 512, null);
        }

        public String toString() {
            return "[CustomStyleParamsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof CustomStyleParamsDto) && Intrinsics.areEqual(((CustomStyleParamsDto) other).surrogate, this.surrogate);
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
        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b%\b\u0083\b\u0018\u0000 E2\u00020\u0001:\u0002FEB\u0082\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0019\b\u0002\u0010\u0010\u001a\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013Bu\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010,R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b2\u0010.\u001a\u0004\b1\u0010,R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b4\u0010.\u001a\u0004\b3\u0010,R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\b8\u0010.\u001a\u0004\b6\u00107R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\b<\u0010.\u001a\u0004\b:\u0010;R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\b>\u0010.\u001a\u0004\b=\u0010;R1\u0010\u0010\u001a\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010?\u0012\u0004\bB\u0010.\u001a\u0004\b@\u0010AR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010*\u0012\u0004\bD\u0010.\u001a\u0004\bC\u0010,¨\u0006G"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto$Surrogate;", "", "Lrh_server_driven_ui/v1/ThemedColorDto;", "background_color", "border_color", "pulsating_color", "notification_dot_color", "", "should_shimmer", "Lrh_server_driven_ui/v1/LinearGradientColorDto;", "background_gradient", "text_gradient", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "border_opacity", "text_color", "<init>", "(Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/Boolean;Lrh_server_driven_ui/v1/LinearGradientColorDto;Lrh_server_driven_ui/v1/LinearGradientColorDto;Ljava/lang/Float;Lrh_server_driven_ui/v1/ThemedColorDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/Boolean;Lrh_server_driven_ui/v1/LinearGradientColorDto;Lrh_server_driven_ui/v1/LinearGradientColorDto;Ljava/lang/Float;Lrh_server_driven_ui/v1/ThemedColorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$messaging_badge_v1_externalRelease", "(Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color$annotations", "()V", "getBorder_color", "getBorder_color$annotations", "getPulsating_color", "getPulsating_color$annotations", "getNotification_dot_color", "getNotification_dot_color$annotations", "Ljava/lang/Boolean;", "getShould_shimmer", "()Ljava/lang/Boolean;", "getShould_shimmer$annotations", "Lrh_server_driven_ui/v1/LinearGradientColorDto;", "getBackground_gradient", "()Lrh_server_driven_ui/v1/LinearGradientColorDto;", "getBackground_gradient$annotations", "getText_gradient", "getText_gradient$annotations", "Ljava/lang/Float;", "getBorder_opacity", "()Ljava/lang/Float;", "getBorder_opacity$annotations", "getText_color", "getText_color$annotations", "Companion", "$serializer", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final ThemedColorDto background_color;
            private final LinearGradientColorDto background_gradient;
            private final ThemedColorDto border_color;
            private final Float border_opacity;
            private final ThemedColorDto notification_dot_color;
            private final ThemedColorDto pulsating_color;
            private final Boolean should_shimmer;
            private final ThemedColorDto text_color;
            private final LinearGradientColorDto text_gradient;

            public Surrogate() {
                this((ThemedColorDto) null, (ThemedColorDto) null, (ThemedColorDto) null, (ThemedColorDto) null, (Boolean) null, (LinearGradientColorDto) null, (LinearGradientColorDto) null, (Float) null, (ThemedColorDto) null, 511, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.background_color, surrogate.background_color) && Intrinsics.areEqual(this.border_color, surrogate.border_color) && Intrinsics.areEqual(this.pulsating_color, surrogate.pulsating_color) && Intrinsics.areEqual(this.notification_dot_color, surrogate.notification_dot_color) && Intrinsics.areEqual(this.should_shimmer, surrogate.should_shimmer) && Intrinsics.areEqual(this.background_gradient, surrogate.background_gradient) && Intrinsics.areEqual(this.text_gradient, surrogate.text_gradient) && Intrinsics.areEqual((Object) this.border_opacity, (Object) surrogate.border_opacity) && Intrinsics.areEqual(this.text_color, surrogate.text_color);
            }

            public int hashCode() {
                ThemedColorDto themedColorDto = this.background_color;
                int iHashCode = (themedColorDto == null ? 0 : themedColorDto.hashCode()) * 31;
                ThemedColorDto themedColorDto2 = this.border_color;
                int iHashCode2 = (iHashCode + (themedColorDto2 == null ? 0 : themedColorDto2.hashCode())) * 31;
                ThemedColorDto themedColorDto3 = this.pulsating_color;
                int iHashCode3 = (iHashCode2 + (themedColorDto3 == null ? 0 : themedColorDto3.hashCode())) * 31;
                ThemedColorDto themedColorDto4 = this.notification_dot_color;
                int iHashCode4 = (iHashCode3 + (themedColorDto4 == null ? 0 : themedColorDto4.hashCode())) * 31;
                Boolean bool = this.should_shimmer;
                int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
                LinearGradientColorDto linearGradientColorDto = this.background_gradient;
                int iHashCode6 = (iHashCode5 + (linearGradientColorDto == null ? 0 : linearGradientColorDto.hashCode())) * 31;
                LinearGradientColorDto linearGradientColorDto2 = this.text_gradient;
                int iHashCode7 = (iHashCode6 + (linearGradientColorDto2 == null ? 0 : linearGradientColorDto2.hashCode())) * 31;
                Float f = this.border_opacity;
                int iHashCode8 = (iHashCode7 + (f == null ? 0 : f.hashCode())) * 31;
                ThemedColorDto themedColorDto5 = this.text_color;
                return iHashCode8 + (themedColorDto5 != null ? themedColorDto5.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(background_color=" + this.background_color + ", border_color=" + this.border_color + ", pulsating_color=" + this.pulsating_color + ", notification_dot_color=" + this.notification_dot_color + ", should_shimmer=" + this.should_shimmer + ", background_gradient=" + this.background_gradient + ", text_gradient=" + this.text_gradient + ", border_opacity=" + this.border_opacity + ", text_color=" + this.text_color + ")";
            }

            /* compiled from: GetBadgeDataResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto$Surrogate;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return GetBadgeDataResponseDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ThemedColorDto themedColorDto3, ThemedColorDto themedColorDto4, Boolean bool, LinearGradientColorDto linearGradientColorDto, LinearGradientColorDto linearGradientColorDto2, Float f, ThemedColorDto themedColorDto5, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.background_color = null;
                } else {
                    this.background_color = themedColorDto;
                }
                if ((i & 2) == 0) {
                    this.border_color = null;
                } else {
                    this.border_color = themedColorDto2;
                }
                if ((i & 4) == 0) {
                    this.pulsating_color = null;
                } else {
                    this.pulsating_color = themedColorDto3;
                }
                if ((i & 8) == 0) {
                    this.notification_dot_color = null;
                } else {
                    this.notification_dot_color = themedColorDto4;
                }
                if ((i & 16) == 0) {
                    this.should_shimmer = null;
                } else {
                    this.should_shimmer = bool;
                }
                if ((i & 32) == 0) {
                    this.background_gradient = null;
                } else {
                    this.background_gradient = linearGradientColorDto;
                }
                if ((i & 64) == 0) {
                    this.text_gradient = null;
                } else {
                    this.text_gradient = linearGradientColorDto2;
                }
                if ((i & 128) == 0) {
                    this.border_opacity = null;
                } else {
                    this.border_opacity = f;
                }
                if ((i & 256) == 0) {
                    this.text_color = null;
                } else {
                    this.text_color = themedColorDto5;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$messaging_badge_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                ThemedColorDto themedColorDto = self.background_color;
                if (themedColorDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
                }
                ThemedColorDto themedColorDto2 = self.border_color;
                if (themedColorDto2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, ThemedColorDto.Serializer.INSTANCE, themedColorDto2);
                }
                ThemedColorDto themedColorDto3 = self.pulsating_color;
                if (themedColorDto3 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, ThemedColorDto.Serializer.INSTANCE, themedColorDto3);
                }
                ThemedColorDto themedColorDto4 = self.notification_dot_color;
                if (themedColorDto4 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, ThemedColorDto.Serializer.INSTANCE, themedColorDto4);
                }
                Boolean bool = self.should_shimmer;
                if (bool != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, bool);
                }
                LinearGradientColorDto linearGradientColorDto = self.background_gradient;
                if (linearGradientColorDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 5, LinearGradientColorDto.Serializer.INSTANCE, linearGradientColorDto);
                }
                LinearGradientColorDto linearGradientColorDto2 = self.text_gradient;
                if (linearGradientColorDto2 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 6, LinearGradientColorDto.Serializer.INSTANCE, linearGradientColorDto2);
                }
                Float f = self.border_opacity;
                if (f != null) {
                    output.encodeNullableSerializableElement(serialDesc, 7, FloatAsNumberSerializer.INSTANCE, f);
                }
                ThemedColorDto themedColorDto5 = self.text_color;
                if (themedColorDto5 != null) {
                    output.encodeNullableSerializableElement(serialDesc, 8, ThemedColorDto.Serializer.INSTANCE, themedColorDto5);
                }
            }

            public Surrogate(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ThemedColorDto themedColorDto3, ThemedColorDto themedColorDto4, Boolean bool, LinearGradientColorDto linearGradientColorDto, LinearGradientColorDto linearGradientColorDto2, Float f, ThemedColorDto themedColorDto5) {
                this.background_color = themedColorDto;
                this.border_color = themedColorDto2;
                this.pulsating_color = themedColorDto3;
                this.notification_dot_color = themedColorDto4;
                this.should_shimmer = bool;
                this.background_gradient = linearGradientColorDto;
                this.text_gradient = linearGradientColorDto2;
                this.border_opacity = f;
                this.text_color = themedColorDto5;
            }

            public /* synthetic */ Surrogate(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, ThemedColorDto themedColorDto3, ThemedColorDto themedColorDto4, Boolean bool, LinearGradientColorDto linearGradientColorDto, LinearGradientColorDto linearGradientColorDto2, Float f, ThemedColorDto themedColorDto5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : themedColorDto, (i & 2) != 0 ? null : themedColorDto2, (i & 4) != 0 ? null : themedColorDto3, (i & 8) != 0 ? null : themedColorDto4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : linearGradientColorDto, (i & 64) != 0 ? null : linearGradientColorDto2, (i & 128) != 0 ? null : f, (i & 256) != 0 ? null : themedColorDto5);
            }

            public final ThemedColorDto getBackground_color() {
                return this.background_color;
            }

            public final ThemedColorDto getBorder_color() {
                return this.border_color;
            }

            public final ThemedColorDto getPulsating_color() {
                return this.pulsating_color;
            }

            public final ThemedColorDto getNotification_dot_color() {
                return this.notification_dot_color;
            }

            public final Boolean getShould_shimmer() {
                return this.should_shimmer;
            }

            public final LinearGradientColorDto getBackground_gradient() {
                return this.background_gradient;
            }

            public final LinearGradientColorDto getText_gradient() {
                return this.text_gradient;
            }

            public final Float getBorder_opacity() {
                return this.border_opacity;
            }

            public final ThemedColorDto getText_color() {
                return this.text_color;
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$CustomStyleParams;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<CustomStyleParamsDto, GetBadgeDataResponse.CustomStyleParams> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CustomStyleParamsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CustomStyleParamsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CustomStyleParamsDto> getBinaryBase64Serializer() {
                return (KSerializer) CustomStyleParamsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetBadgeDataResponse.CustomStyleParams> getProtoAdapter() {
                return GetBadgeDataResponse.CustomStyleParams.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CustomStyleParamsDto getZeroValue() {
                return CustomStyleParamsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CustomStyleParamsDto fromProto(GetBadgeDataResponse.CustomStyleParams proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                ThemedColor background_color = proto.getBackground_color();
                DefaultConstructorMarker defaultConstructorMarker = null;
                ThemedColorDto themedColorDtoFromProto = background_color != null ? ThemedColorDto.INSTANCE.fromProto(background_color) : null;
                ThemedColor border_color = proto.getBorder_color();
                ThemedColorDto themedColorDtoFromProto2 = border_color != null ? ThemedColorDto.INSTANCE.fromProto(border_color) : null;
                ThemedColor pulsating_color = proto.getPulsating_color();
                ThemedColorDto themedColorDtoFromProto3 = pulsating_color != null ? ThemedColorDto.INSTANCE.fromProto(pulsating_color) : null;
                ThemedColor notification_dot_color = proto.getNotification_dot_color();
                ThemedColorDto themedColorDtoFromProto4 = notification_dot_color != null ? ThemedColorDto.INSTANCE.fromProto(notification_dot_color) : null;
                Boolean should_shimmer = proto.getShould_shimmer();
                LinearGradientColor background_gradient = proto.getBackground_gradient();
                LinearGradientColorDto linearGradientColorDtoFromProto = background_gradient != null ? LinearGradientColorDto.INSTANCE.fromProto(background_gradient) : null;
                LinearGradientColor text_gradient = proto.getText_gradient();
                LinearGradientColorDto linearGradientColorDtoFromProto2 = text_gradient != null ? LinearGradientColorDto.INSTANCE.fromProto(text_gradient) : null;
                Float border_opacity = proto.getBorder_opacity();
                ThemedColor text_color = proto.getText_color();
                return new CustomStyleParamsDto(new Surrogate(themedColorDtoFromProto, themedColorDtoFromProto2, themedColorDtoFromProto3, themedColorDtoFromProto4, should_shimmer, linearGradientColorDtoFromProto, linearGradientColorDtoFromProto2, border_opacity, text_color != null ? ThemedColorDto.INSTANCE.fromProto(text_color) : null), defaultConstructorMarker);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: messaging.proto.badge.v1.GetBadgeDataResponseDto$CustomStyleParamsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetBadgeDataResponseDto.CustomStyleParamsDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new CustomStyleParamsDto(null, null, null, null, null, null, null, null, null, 511, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto;", "<init>", "()V", "surrogateSerializer", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CustomStyleParamsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/messaging.proto.badge.v1.GetBadgeDataResponse.CustomStyleParams", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CustomStyleParamsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public CustomStyleParamsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new CustomStyleParamsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$CustomStyleParamsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "messaging.proto.badge.v1.GetBadgeDataResponseDto$CustomStyleParamsDto";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetBadgeDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "Lcom/robinhood/idl/EnumDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_UNSPECIFIED", "STANDARD", "GOLD", "CRYPTO", "CRYPTO_LIVE", "MARKET", "CUSTOM", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class BadgeVisualStyleDto implements Dto2<GetBadgeDataResponse.BadgeVisualStyle>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BadgeVisualStyleDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<BadgeVisualStyleDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<BadgeVisualStyleDto, GetBadgeDataResponse.BadgeVisualStyle>> binaryBase64Serializer$delegate;
        public static final BadgeVisualStyleDto STYLE_UNSPECIFIED = new STYLE_UNSPECIFIED("STYLE_UNSPECIFIED", 0);
        public static final BadgeVisualStyleDto STANDARD = new STANDARD("STANDARD", 1);
        public static final BadgeVisualStyleDto GOLD = new GOLD("GOLD", 2);
        public static final BadgeVisualStyleDto CRYPTO = new CRYPTO("CRYPTO", 3);
        public static final BadgeVisualStyleDto CRYPTO_LIVE = new CRYPTO_LIVE("CRYPTO_LIVE", 4);
        public static final BadgeVisualStyleDto MARKET = new MARKET("MARKET", 5);
        public static final BadgeVisualStyleDto CUSTOM = new CUSTOM("CUSTOM", 6);

        private static final /* synthetic */ BadgeVisualStyleDto[] $values() {
            return new BadgeVisualStyleDto[]{STYLE_UNSPECIFIED, STANDARD, GOLD, CRYPTO, CRYPTO_LIVE, MARKET, CUSTOM};
        }

        public /* synthetic */ BadgeVisualStyleDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<BadgeVisualStyleDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private BadgeVisualStyleDto(String str, int i) {
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"messaging/proto/badge/v1/GetBadgeDataResponseDto.BadgeVisualStyleDto.STYLE_UNSPECIFIED", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "toProto", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STYLE_UNSPECIFIED extends BadgeVisualStyleDto {
            STYLE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetBadgeDataResponse.BadgeVisualStyle toProto() {
                return GetBadgeDataResponse.BadgeVisualStyle.STYLE_UNSPECIFIED;
            }
        }

        static {
            BadgeVisualStyleDto[] badgeVisualStyleDtoArr$values = $values();
            $VALUES = badgeVisualStyleDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(badgeVisualStyleDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: messaging.proto.badge.v1.GetBadgeDataResponseDto$BadgeVisualStyleDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetBadgeDataResponseDto.BadgeVisualStyleDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"messaging/proto/badge/v1/GetBadgeDataResponseDto.BadgeVisualStyleDto.STANDARD", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "toProto", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STANDARD extends BadgeVisualStyleDto {
            STANDARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetBadgeDataResponse.BadgeVisualStyle toProto() {
                return GetBadgeDataResponse.BadgeVisualStyle.STANDARD;
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"messaging/proto/badge/v1/GetBadgeDataResponseDto.BadgeVisualStyleDto.GOLD", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "toProto", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD extends BadgeVisualStyleDto {
            GOLD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetBadgeDataResponse.BadgeVisualStyle toProto() {
                return GetBadgeDataResponse.BadgeVisualStyle.GOLD;
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"messaging/proto/badge/v1/GetBadgeDataResponseDto.BadgeVisualStyleDto.CRYPTO", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "toProto", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO extends BadgeVisualStyleDto {
            CRYPTO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetBadgeDataResponse.BadgeVisualStyle toProto() {
                return GetBadgeDataResponse.BadgeVisualStyle.CRYPTO;
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"messaging/proto/badge/v1/GetBadgeDataResponseDto.BadgeVisualStyleDto.CRYPTO_LIVE", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "toProto", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CRYPTO_LIVE extends BadgeVisualStyleDto {
            CRYPTO_LIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetBadgeDataResponse.BadgeVisualStyle toProto() {
                return GetBadgeDataResponse.BadgeVisualStyle.CRYPTO_LIVE;
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"messaging/proto/badge/v1/GetBadgeDataResponseDto.BadgeVisualStyleDto.MARKET", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "toProto", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARKET extends BadgeVisualStyleDto {
            MARKET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetBadgeDataResponse.BadgeVisualStyle toProto() {
                return GetBadgeDataResponse.BadgeVisualStyle.MARKET;
            }
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"messaging/proto/badge/v1/GetBadgeDataResponseDto.BadgeVisualStyleDto.CUSTOM", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "toProto", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CUSTOM extends BadgeVisualStyleDto {
            CUSTOM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetBadgeDataResponse.BadgeVisualStyle toProto() {
                return GetBadgeDataResponse.BadgeVisualStyle.CUSTOM;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "Lmessaging/proto/badge/v1/GetBadgeDataResponse$BadgeVisualStyle;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<BadgeVisualStyleDto, GetBadgeDataResponse.BadgeVisualStyle> {

            /* compiled from: GetBadgeDataResponseDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GetBadgeDataResponse.BadgeVisualStyle.values().length];
                    try {
                        iArr[GetBadgeDataResponse.BadgeVisualStyle.STYLE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GetBadgeDataResponse.BadgeVisualStyle.STANDARD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[GetBadgeDataResponse.BadgeVisualStyle.GOLD.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[GetBadgeDataResponse.BadgeVisualStyle.CRYPTO.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[GetBadgeDataResponse.BadgeVisualStyle.CRYPTO_LIVE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[GetBadgeDataResponse.BadgeVisualStyle.MARKET.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[GetBadgeDataResponse.BadgeVisualStyle.CUSTOM.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<BadgeVisualStyleDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<BadgeVisualStyleDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<BadgeVisualStyleDto> getBinaryBase64Serializer() {
                return (KSerializer) BadgeVisualStyleDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetBadgeDataResponse.BadgeVisualStyle> getProtoAdapter() {
                return GetBadgeDataResponse.BadgeVisualStyle.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public BadgeVisualStyleDto getZeroValue() {
                return BadgeVisualStyleDto.STYLE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public BadgeVisualStyleDto fromProto(GetBadgeDataResponse.BadgeVisualStyle proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return BadgeVisualStyleDto.STYLE_UNSPECIFIED;
                    case 2:
                        return BadgeVisualStyleDto.STANDARD;
                    case 3:
                        return BadgeVisualStyleDto.GOLD;
                    case 4:
                        return BadgeVisualStyleDto.CRYPTO;
                    case 5:
                        return BadgeVisualStyleDto.CRYPTO_LIVE;
                    case 6:
                        return BadgeVisualStyleDto.MARKET;
                    case 7:
                        return BadgeVisualStyleDto.CUSTOM;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetBadgeDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$BadgeVisualStyleDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<BadgeVisualStyleDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<BadgeVisualStyleDto, GetBadgeDataResponse.BadgeVisualStyle> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/messaging.proto.badge.v1.GetBadgeDataResponse.BadgeVisualStyle", BadgeVisualStyleDto.getEntries(), BadgeVisualStyleDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public BadgeVisualStyleDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (BadgeVisualStyleDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, BadgeVisualStyleDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static BadgeVisualStyleDto valueOf(String str) {
            return (BadgeVisualStyleDto) Enum.valueOf(BadgeVisualStyleDto.class, str);
        }

        public static BadgeVisualStyleDto[] values() {
            return (BadgeVisualStyleDto[]) $VALUES.clone();
        }
    }

    /* compiled from: GetBadgeDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetBadgeDataResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/messaging.proto.badge.v1.GetBadgeDataResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetBadgeDataResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetBadgeDataResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetBadgeDataResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetBadgeDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmessaging/proto/badge/v1/GetBadgeDataResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "messaging.badge.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "messaging.proto.badge.v1.GetBadgeDataResponseDto";
        }
    }
}
