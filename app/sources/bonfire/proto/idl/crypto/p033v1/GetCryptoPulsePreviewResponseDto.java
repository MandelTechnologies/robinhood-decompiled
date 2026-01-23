package bonfire.proto.idl.crypto.p033v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.copilot.p032v1.InstrumentDigestV2Response;
import bonfire.proto.idl.copilot.p032v1.InstrumentDigestV2ResponseDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulsePreviewResponse;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulsePreviewResponseDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p479j$.time.Instant;

/* compiled from: GetCryptoPulsePreviewResponseDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000510234B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0017R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0017R\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00065"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$Surrogate;)V", "", "title", "subtitle", "text", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "updated_at", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;", "tap_action", "", "has_signed_agreement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;Z)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$Surrogate;", "getTitle", "getSubtitle", "getText", "getUpdated_at", "()Lj$/time/Instant;", "getTap_action", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;", "getHas_signed_agreement", "()Z", "Companion", "Surrogate", "TapActionDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class GetCryptoPulsePreviewResponseDto implements Dto3<GetCryptoPulsePreviewResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCryptoPulsePreviewResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCryptoPulsePreviewResponseDto, GetCryptoPulsePreviewResponse>> binaryBase64Serializer$delegate;
    private static final GetCryptoPulsePreviewResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCryptoPulsePreviewResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCryptoPulsePreviewResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final String getText() {
        return this.surrogate.getText();
    }

    public final Instant getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final TapActionDto getTap_action() {
        return this.surrogate.getTap_action();
    }

    public final boolean getHas_signed_agreement() {
        return this.surrogate.getHas_signed_agreement();
    }

    public /* synthetic */ GetCryptoPulsePreviewResponseDto(String str, String str2, String str3, Instant instant, TapActionDto tapActionDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : tapActionDto, (i & 32) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCryptoPulsePreviewResponseDto(String title, String subtitle, String text, Instant instant, TapActionDto tapActionDto, boolean z) {
        this(new Surrogate(title, subtitle, text, instant, tapActionDto, z));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(text, "text");
    }

    @Override // com.robinhood.idl.Dto
    public GetCryptoPulsePreviewResponse toProto() {
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        String text = this.surrogate.getText();
        Instant updated_at = this.surrogate.getUpdated_at();
        TapActionDto tap_action = this.surrogate.getTap_action();
        return new GetCryptoPulsePreviewResponse(title, subtitle, text, updated_at, tap_action != null ? tap_action.toProto() : null, this.surrogate.getHas_signed_agreement(), null, 64, null);
    }

    public String toString() {
        return "[GetCryptoPulsePreviewResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCryptoPulsePreviewResponseDto) && Intrinsics.areEqual(((GetCryptoPulsePreviewResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002<;Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011BU\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010!R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010!R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010!RF\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b0\u00101R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00103\u0012\u0004\b6\u0010*\u001a\u0004\b4\u00105R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00107\u0012\u0004\b:\u0010*\u001a\u0004\b8\u00109¨\u0006="}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$Surrogate;", "", "", "title", "subtitle", "text", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "updated_at", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;", "tap_action", "", "has_signed_agreement", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "getText", "getText$annotations", "Lj$/time/Instant;", "getUpdated_at", "()Lj$/time/Instant;", "getUpdated_at$annotations", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;", "getTap_action", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;", "getTap_action$annotations", "Z", "getHas_signed_agreement", "()Z", "getHas_signed_agreement$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean has_signed_agreement;
        private final String subtitle;
        private final TapActionDto tap_action;
        private final String text;
        private final String title;
        private final Instant updated_at;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (Instant) null, (TapActionDto) null, false, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.text, surrogate.text) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.tap_action, surrogate.tap_action) && this.has_signed_agreement == surrogate.has_signed_agreement;
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.text.hashCode()) * 31;
            Instant instant = this.updated_at;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            TapActionDto tapActionDto = this.tap_action;
            return ((iHashCode2 + (tapActionDto != null ? tapActionDto.hashCode() : 0)) * 31) + Boolean.hashCode(this.has_signed_agreement);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", subtitle=" + this.subtitle + ", text=" + this.text + ", updated_at=" + this.updated_at + ", tap_action=" + this.tap_action + ", has_signed_agreement=" + this.has_signed_agreement + ")";
        }

        /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCryptoPulsePreviewResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, Instant instant, TapActionDto tapActionDto, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str2;
            }
            if ((i & 4) == 0) {
                this.text = "";
            } else {
                this.text = str3;
            }
            if ((i & 8) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant;
            }
            if ((i & 16) == 0) {
                this.tap_action = null;
            } else {
                this.tap_action = tapActionDto;
            }
            if ((i & 32) == 0) {
                this.has_signed_agreement = false;
            } else {
                this.has_signed_agreement = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 1, self.subtitle);
            }
            if (!Intrinsics.areEqual(self.text, "")) {
                output.encodeStringElement(serialDesc, 2, self.text);
            }
            Instant instant = self.updated_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            TapActionDto tapActionDto = self.tap_action;
            if (tapActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, TapActionDto.Serializer.INSTANCE, tapActionDto);
            }
            boolean z = self.has_signed_agreement;
            if (z) {
                output.encodeBooleanElement(serialDesc, 5, z);
            }
        }

        public Surrogate(String title, String subtitle, String text, Instant instant, TapActionDto tapActionDto, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(text, "text");
            this.title = title;
            this.subtitle = subtitle;
            this.text = text;
            this.updated_at = instant;
            this.tap_action = tapActionDto;
            this.has_signed_agreement = z;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, Instant instant, TapActionDto tapActionDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : tapActionDto, (i & 32) != 0 ? false : z);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getText() {
            return this.text;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        public final TapActionDto getTap_action() {
            return this.tap_action;
        }

        public final boolean getHas_signed_agreement() {
            return this.has_signed_agreement;
        }
    }

    /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetCryptoPulsePreviewResponseDto, GetCryptoPulsePreviewResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCryptoPulsePreviewResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoPulsePreviewResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoPulsePreviewResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCryptoPulsePreviewResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCryptoPulsePreviewResponse> getProtoAdapter() {
            return GetCryptoPulsePreviewResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoPulsePreviewResponseDto getZeroValue() {
            return GetCryptoPulsePreviewResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoPulsePreviewResponseDto fromProto(GetCryptoPulsePreviewResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            String text = proto.getText();
            Instant updated_at = proto.getUpdated_at();
            GetCryptoPulsePreviewResponse.TapAction tap_action = proto.getTap_action();
            return new GetCryptoPulsePreviewResponseDto(new Surrogate(title, subtitle, text, updated_at, tap_action != null ? TapActionDto.INSTANCE.fromProto(tap_action) : null, proto.getHas_signed_agreement()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCryptoPulsePreviewResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetCryptoPulsePreviewResponseDto(null, null, null, null, null, false, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006#\"$%&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006("}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$Surrogate;)V", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$TypeDto;", "type", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$TypeDto;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$Surrogate;", "getType", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$TypeDto;", "Companion", "Surrogate", "TypeDto", "ShowFeedDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TapActionDto implements Dto3<GetCryptoPulsePreviewResponse.TapAction>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TapActionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TapActionDto, GetCryptoPulsePreviewResponse.TapAction>> binaryBase64Serializer$delegate;
        private static final TapActionDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TapActionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TapActionDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final TypeDto getType() {
            if (this.surrogate.getShow_digest_details() != null) {
                return new TypeDto.ShowDigestDetails(this.surrogate.getShow_digest_details());
            }
            if (this.surrogate.getShow_feed() != null) {
                return new TypeDto.ShowFeed(this.surrogate.getShow_feed());
            }
            return null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TapActionDto(TypeDto typeDto) {
            TypeDto.ShowDigestDetails showDigestDetails = typeDto instanceof TypeDto.ShowDigestDetails ? (TypeDto.ShowDigestDetails) typeDto : null;
            InstrumentDigestV2ResponseDto value = showDigestDetails != null ? showDigestDetails.getValue() : null;
            TypeDto.ShowFeed showFeed = typeDto instanceof TypeDto.ShowFeed ? (TypeDto.ShowFeed) typeDto : null;
            this(new Surrogate(value, showFeed != null ? showFeed.getValue() : null));
        }

        public /* synthetic */ TapActionDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : typeDto);
        }

        @Override // com.robinhood.idl.Dto
        public GetCryptoPulsePreviewResponse.TapAction toProto() {
            InstrumentDigestV2ResponseDto show_digest_details = this.surrogate.getShow_digest_details();
            InstrumentDigestV2Response proto = show_digest_details != null ? show_digest_details.toProto() : null;
            ShowFeedDto show_feed = this.surrogate.getShow_feed();
            return new GetCryptoPulsePreviewResponse.TapAction(proto, show_feed != null ? show_feed.toProto() : null, null, 4, null);
        }

        public String toString() {
            return "[TapActionDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TapActionDto) && Intrinsics.areEqual(((TapActionDto) other).surrogate, this.surrogate);
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
        /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$Surrogate;", "", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;", "show_digest_details", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto;", "show_feed", "<init>", "(Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;", "getShow_digest_details", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;", "getShow_digest_details$annotations", "()V", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto;", "getShow_feed", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto;", "getShow_feed$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final InstrumentDigestV2ResponseDto show_digest_details;
            private final ShowFeedDto show_feed;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((InstrumentDigestV2ResponseDto) null, (ShowFeedDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.show_digest_details, surrogate.show_digest_details) && Intrinsics.areEqual(this.show_feed, surrogate.show_feed);
            }

            public int hashCode() {
                InstrumentDigestV2ResponseDto instrumentDigestV2ResponseDto = this.show_digest_details;
                int iHashCode = (instrumentDigestV2ResponseDto == null ? 0 : instrumentDigestV2ResponseDto.hashCode()) * 31;
                ShowFeedDto showFeedDto = this.show_feed;
                return iHashCode + (showFeedDto != null ? showFeedDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(show_digest_details=" + this.show_digest_details + ", show_feed=" + this.show_feed + ")";
            }

            /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return GetCryptoPulsePreviewResponseDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, InstrumentDigestV2ResponseDto instrumentDigestV2ResponseDto, ShowFeedDto showFeedDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.show_digest_details = null;
                } else {
                    this.show_digest_details = instrumentDigestV2ResponseDto;
                }
                if ((i & 2) == 0) {
                    this.show_feed = null;
                } else {
                    this.show_feed = showFeedDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                InstrumentDigestV2ResponseDto instrumentDigestV2ResponseDto = self.show_digest_details;
                if (instrumentDigestV2ResponseDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, InstrumentDigestV2ResponseDto.Serializer.INSTANCE, instrumentDigestV2ResponseDto);
                }
                ShowFeedDto showFeedDto = self.show_feed;
                if (showFeedDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, ShowFeedDto.Serializer.INSTANCE, showFeedDto);
                }
            }

            public Surrogate(InstrumentDigestV2ResponseDto instrumentDigestV2ResponseDto, ShowFeedDto showFeedDto) {
                this.show_digest_details = instrumentDigestV2ResponseDto;
                this.show_feed = showFeedDto;
            }

            public /* synthetic */ Surrogate(InstrumentDigestV2ResponseDto instrumentDigestV2ResponseDto, ShowFeedDto showFeedDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : instrumentDigestV2ResponseDto, (i & 2) != 0 ? null : showFeedDto);
            }

            public final InstrumentDigestV2ResponseDto getShow_digest_details() {
                return this.show_digest_details;
            }

            public final ShowFeedDto getShow_feed() {
                return this.show_feed;
            }
        }

        /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<TapActionDto, GetCryptoPulsePreviewResponse.TapAction> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TapActionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TapActionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TapActionDto> getBinaryBase64Serializer() {
                return (KSerializer) TapActionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetCryptoPulsePreviewResponse.TapAction> getProtoAdapter() {
                return GetCryptoPulsePreviewResponse.TapAction.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TapActionDto getZeroValue() {
                return TapActionDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TapActionDto fromProto(GetCryptoPulsePreviewResponse.TapAction proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                InstrumentDigestV2Response show_digest_details = proto.getShow_digest_details();
                DefaultConstructorMarker defaultConstructorMarker = null;
                InstrumentDigestV2ResponseDto instrumentDigestV2ResponseDtoFromProto = show_digest_details != null ? InstrumentDigestV2ResponseDto.INSTANCE.fromProto(show_digest_details) : null;
                GetCryptoPulsePreviewResponse.TapAction.ShowFeed show_feed = proto.getShow_feed();
                return new TapActionDto(new Surrogate(instrumentDigestV2ResponseDtoFromProto, show_feed != null ? ShowFeedDto.INSTANCE.fromProto(show_feed) : null), defaultConstructorMarker);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponseDto$TapActionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetCryptoPulsePreviewResponseDto.TapActionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TapActionDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "ShowDigestDetails", "ShowFeed", "Companion", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$TypeDto$ShowDigestDetails;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$TypeDto$ShowFeed;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @RhGenerated
        public static abstract class TypeDto implements Dto4 {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TypeDto() {
            }

            @Override // com.robinhood.idl.Dto
            public Void toProto() {
                return Dto4.DefaultImpls.toProto(this);
            }

            /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$TypeDto$ShowDigestDetails;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$TypeDto;", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;", "value", "<init>", "(Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;", "getValue", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2ResponseDto;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class ShowDigestDetails extends TypeDto {
                private final InstrumentDigestV2ResponseDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ShowDigestDetails) && Intrinsics.areEqual(this.value, ((ShowDigestDetails) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ShowDigestDetails(value=" + this.value + ")";
                }

                public final InstrumentDigestV2ResponseDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ShowDigestDetails(InstrumentDigestV2ResponseDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$TypeDto$ShowFeed;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$TypeDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto;", "value", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto;", "getValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class ShowFeed extends TypeDto {
                private final ShowFeedDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ShowFeed) && Intrinsics.areEqual(this.value, ((ShowFeed) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ShowFeed(value=" + this.value + ")";
                }

                public final ShowFeedDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ShowFeed(ShowFeedDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$TypeDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto4.Creator<TypeDto, GetCryptoPulsePreviewResponse.TapAction> {
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
                public ProtoAdapter<GetCryptoPulsePreviewResponse.TapAction> getProtoAdapter() {
                    return GetCryptoPulsePreviewResponse.TapAction.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TypeDto fromProto(GetCryptoPulsePreviewResponse.TapAction proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    if (proto.getShow_digest_details() != null) {
                        return new ShowDigestDetails(InstrumentDigestV2ResponseDto.INSTANCE.fromProto(proto.getShow_digest_details()));
                    }
                    if (proto.getShow_feed() != null) {
                        return new ShowFeed(ShowFeedDto.INSTANCE.fromProto(proto.getShow_feed()));
                    }
                    return null;
                }
            }
        }

        /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction$ShowFeed;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto$Surrogate;)V", "()V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction$ShowFeed;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class ShowFeedDto implements Dto3<GetCryptoPulsePreviewResponse.TapAction.ShowFeed>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<ShowFeedDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<ShowFeedDto, GetCryptoPulsePreviewResponse.TapAction.ShowFeed>> binaryBase64Serializer$delegate;
            private static final ShowFeedDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ ShowFeedDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private ShowFeedDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public ShowFeedDto() {
                this(Surrogate.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public GetCryptoPulsePreviewResponse.TapAction.ShowFeed toProto() {
                return new GetCryptoPulsePreviewResponse.TapAction.ShowFeed(null, 1, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[ShowFeedDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof ShowFeedDto) && Intrinsics.areEqual(((ShowFeedDto) other).surrogate, this.surrogate);
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
            /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {
                public static final Surrogate INSTANCE = new Surrogate();
                private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto$Surrogate$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GetCryptoPulsePreviewResponseDto.TapActionDto.ShowFeedDto.Surrogate._init_$_anonymous_();
                    }
                });

                public boolean equals(Object other) {
                    return this == other || (other instanceof Surrogate);
                }

                public int hashCode() {
                    return 1571354780;
                }

                public String toString() {
                    return "Surrogate";
                }

                private Surrogate() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                    return new ObjectSerializer("bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponseDto.TapActionDto.ShowFeedDto.Surrogate", INSTANCE, new Annotation[0]);
                }

                private final /* synthetic */ KSerializer get$cachedSerializer() {
                    return $cachedSerializer$delegate.getValue();
                }

                public final KSerializer<Surrogate> serializer() {
                    return get$cachedSerializer();
                }
            }

            /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponse$TapAction$ShowFeed;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<ShowFeedDto, GetCryptoPulsePreviewResponse.TapAction.ShowFeed> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<ShowFeedDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ShowFeedDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<ShowFeedDto> getBinaryBase64Serializer() {
                    return (KSerializer) ShowFeedDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<GetCryptoPulsePreviewResponse.TapAction.ShowFeed> getProtoAdapter() {
                    return GetCryptoPulsePreviewResponse.TapAction.ShowFeed.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ShowFeedDto getZeroValue() {
                    return ShowFeedDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ShowFeedDto fromProto(GetCryptoPulsePreviewResponse.TapAction.ShowFeed proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new ShowFeedDto();
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GetCryptoPulsePreviewResponseDto.TapActionDto.ShowFeedDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new ShowFeedDto();
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<ShowFeedDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponse.TapAction.ShowFeed", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, ShowFeedDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public ShowFeedDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new ShowFeedDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4193_9)
                public final String provideIntoMap() {
                    return "bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponseDto$TapActionDto$ShowFeedDto";
                }
            }
        }

        /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TapActionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponse.TapAction", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TapActionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TapActionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TapActionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$TapActionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponseDto$TapActionDto";
            }
        }
    }

    /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetCryptoPulsePreviewResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCryptoPulsePreviewResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCryptoPulsePreviewResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCryptoPulsePreviewResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetCryptoPulsePreviewResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulsePreviewResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.crypto.v1.GetCryptoPulsePreviewResponseDto";
        }
    }
}
