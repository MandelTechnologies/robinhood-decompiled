package bonfire.proto.idl.copilot.p032v1;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: DigestOnboardingResponseDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0014R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0014R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010(¨\u0006."}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto$Surrogate;)V", "", "splash_title", "splash_description", "splash_disclosure", "", "has_signed_agreement", "has_gold", "is_gold_required", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "toProto", "()Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto$Surrogate;", "getSplash_title", "getSplash_description", "getSplash_disclosure", "getHas_signed_agreement", "()Z", "getHas_gold", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class DigestOnboardingResponseDto implements Dto3<DigestOnboardingResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DigestOnboardingResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DigestOnboardingResponseDto, DigestOnboardingResponse>> binaryBase64Serializer$delegate;
    private static final DigestOnboardingResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DigestOnboardingResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DigestOnboardingResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getSplash_title() {
        return this.surrogate.getSplash_title();
    }

    public final String getSplash_description() {
        return this.surrogate.getSplash_description();
    }

    public final String getSplash_disclosure() {
        return this.surrogate.getSplash_disclosure();
    }

    public final boolean getHas_signed_agreement() {
        return this.surrogate.getHas_signed_agreement();
    }

    public final boolean getHas_gold() {
        return this.surrogate.getHas_gold();
    }

    public final boolean is_gold_required() {
        return this.surrogate.getIs_gold_required();
    }

    public /* synthetic */ DigestOnboardingResponseDto(String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DigestOnboardingResponseDto(String splash_title, String splash_description, String str, boolean z, boolean z2, boolean z3) {
        this(new Surrogate(splash_title, splash_description, str, z, z2, z3));
        Intrinsics.checkNotNullParameter(splash_title, "splash_title");
        Intrinsics.checkNotNullParameter(splash_description, "splash_description");
    }

    @Override // com.robinhood.idl.Dto
    public DigestOnboardingResponse toProto() {
        return new DigestOnboardingResponse(this.surrogate.getSplash_title(), this.surrogate.getSplash_description(), this.surrogate.getSplash_disclosure(), this.surrogate.getHas_signed_agreement(), this.surrogate.getHas_gold(), this.surrogate.getIs_gold_required(), null, 64, null);
    }

    public String toString() {
        return "[DigestOnboardingResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DigestOnboardingResponseDto) && Intrinsics.areEqual(((DigestOnboardingResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: DigestOnboardingResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bBQ\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\u001bR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b.\u0010$\u001a\u0004\b-\u0010+R \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b/\u0010$\u001a\u0004\b\t\u0010+¨\u00062"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto$Surrogate;", "", "", "splash_title", "splash_description", "splash_disclosure", "", "has_signed_agreement", "has_gold", "is_gold_required", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_v1_externalRelease", "(Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSplash_title", "getSplash_title$annotations", "()V", "getSplash_description", "getSplash_description$annotations", "getSplash_disclosure", "getSplash_disclosure$annotations", "Z", "getHas_signed_agreement", "()Z", "getHas_signed_agreement$annotations", "getHas_gold", "getHas_gold$annotations", "is_gold_required$annotations", "Companion", "$serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean has_gold;
        private final boolean has_signed_agreement;
        private final boolean is_gold_required;
        private final String splash_description;
        private final String splash_disclosure;
        private final String splash_title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, false, false, false, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.splash_title, surrogate.splash_title) && Intrinsics.areEqual(this.splash_description, surrogate.splash_description) && Intrinsics.areEqual(this.splash_disclosure, surrogate.splash_disclosure) && this.has_signed_agreement == surrogate.has_signed_agreement && this.has_gold == surrogate.has_gold && this.is_gold_required == surrogate.is_gold_required;
        }

        public int hashCode() {
            int iHashCode = ((this.splash_title.hashCode() * 31) + this.splash_description.hashCode()) * 31;
            String str = this.splash_disclosure;
            return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.has_signed_agreement)) * 31) + Boolean.hashCode(this.has_gold)) * 31) + Boolean.hashCode(this.is_gold_required);
        }

        public String toString() {
            return "Surrogate(splash_title=" + this.splash_title + ", splash_description=" + this.splash_description + ", splash_disclosure=" + this.splash_disclosure + ", has_signed_agreement=" + this.has_signed_agreement + ", has_gold=" + this.has_gold + ", is_gold_required=" + this.is_gold_required + ")";
        }

        /* compiled from: DigestOnboardingResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto$Surrogate;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DigestOnboardingResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.splash_title = "";
            } else {
                this.splash_title = str;
            }
            if ((i & 2) == 0) {
                this.splash_description = "";
            } else {
                this.splash_description = str2;
            }
            if ((i & 4) == 0) {
                this.splash_disclosure = null;
            } else {
                this.splash_disclosure = str3;
            }
            if ((i & 8) == 0) {
                this.has_signed_agreement = false;
            } else {
                this.has_signed_agreement = z;
            }
            if ((i & 16) == 0) {
                this.has_gold = false;
            } else {
                this.has_gold = z2;
            }
            if ((i & 32) == 0) {
                this.is_gold_required = false;
            } else {
                this.is_gold_required = z3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.splash_title, "")) {
                output.encodeStringElement(serialDesc, 0, self.splash_title);
            }
            if (!Intrinsics.areEqual(self.splash_description, "")) {
                output.encodeStringElement(serialDesc, 1, self.splash_description);
            }
            String str = self.splash_disclosure;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            boolean z = self.has_signed_agreement;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
            boolean z2 = self.has_gold;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 4, z2);
            }
            boolean z3 = self.is_gold_required;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 5, z3);
            }
        }

        public Surrogate(String splash_title, String splash_description, String str, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(splash_title, "splash_title");
            Intrinsics.checkNotNullParameter(splash_description, "splash_description");
            this.splash_title = splash_title;
            this.splash_description = splash_description;
            this.splash_disclosure = str;
            this.has_signed_agreement = z;
            this.has_gold = z2;
            this.is_gold_required = z3;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
        }

        public final String getSplash_title() {
            return this.splash_title;
        }

        public final String getSplash_description() {
            return this.splash_description;
        }

        public final String getSplash_disclosure() {
            return this.splash_disclosure;
        }

        public final boolean getHas_signed_agreement() {
            return this.has_signed_agreement;
        }

        public final boolean getHas_gold() {
            return this.has_gold;
        }

        /* renamed from: is_gold_required, reason: from getter */
        public final boolean getIs_gold_required() {
            return this.is_gold_required;
        }
    }

    /* compiled from: DigestOnboardingResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto;", "Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<DigestOnboardingResponseDto, DigestOnboardingResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DigestOnboardingResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DigestOnboardingResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DigestOnboardingResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) DigestOnboardingResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DigestOnboardingResponse> getProtoAdapter() {
            return DigestOnboardingResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DigestOnboardingResponseDto getZeroValue() {
            return DigestOnboardingResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DigestOnboardingResponseDto fromProto(DigestOnboardingResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new DigestOnboardingResponseDto(new Surrogate(proto.getSplash_title(), proto.getSplash_description(), proto.getSplash_disclosure(), proto.getHas_signed_agreement(), proto.getHas_gold(), proto.getIs_gold_required()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.copilot.v1.DigestOnboardingResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DigestOnboardingResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DigestOnboardingResponseDto(null, null, null, false, false, false, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DigestOnboardingResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<DigestOnboardingResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.copilot.v1.DigestOnboardingResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DigestOnboardingResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DigestOnboardingResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DigestOnboardingResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DigestOnboardingResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/DigestOnboardingResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.copilot.v1.DigestOnboardingResponseDto";
        }
    }
}
