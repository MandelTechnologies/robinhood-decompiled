package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: LottieDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041023B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BU\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0016R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00064"}, m3636d2 = {"Lrh_server_driven_ui/v1/LottieDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Lottie;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/LottieDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/LottieDto$Surrogate;)V", "", "light_mode_content_url", "dark_mode_content_url", "", "should_loop", "", "aspect_ratio", "start_position", "should_auto_play", "use_core_animation_renderer", "(Ljava/lang/String;Ljava/lang/String;ZFLjava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "toProto", "()Lrh_server_driven_ui/v1/Lottie;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/LottieDto$Surrogate;", "getLight_mode_content_url", "getDark_mode_content_url", "getShould_loop", "()Z", "getAspect_ratio", "()F", "getStart_position", "()Ljava/lang/Float;", "getShould_auto_play", "()Ljava/lang/Boolean;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class LottieDto implements Dto3<Lottie>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LottieDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LottieDto, Lottie>> binaryBase64Serializer$delegate;
    private static final LottieDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LottieDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LottieDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getLight_mode_content_url() {
        return this.surrogate.getLight_mode_content_url();
    }

    public final String getDark_mode_content_url() {
        return this.surrogate.getDark_mode_content_url();
    }

    public final boolean getShould_loop() {
        return this.surrogate.getShould_loop();
    }

    public final float getAspect_ratio() {
        return this.surrogate.getAspect_ratio();
    }

    public final Float getStart_position() {
        return this.surrogate.getStart_position();
    }

    public final Boolean getShould_auto_play() {
        return this.surrogate.getShould_auto_play();
    }

    public /* synthetic */ LottieDto(String str, String str2, boolean z, float f, Float f2, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? 0.0f : f, (i & 16) != 0 ? null : f2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LottieDto(String light_mode_content_url, String dark_mode_content_url, boolean z, float f, Float f2, Boolean bool, Boolean bool2) {
        this(new Surrogate(light_mode_content_url, dark_mode_content_url, z, f, f2, bool, bool2));
        Intrinsics.checkNotNullParameter(light_mode_content_url, "light_mode_content_url");
        Intrinsics.checkNotNullParameter(dark_mode_content_url, "dark_mode_content_url");
    }

    @Override // com.robinhood.idl.Dto
    public Lottie toProto() {
        return new Lottie(this.surrogate.getLight_mode_content_url(), this.surrogate.getDark_mode_content_url(), this.surrogate.getShould_loop(), this.surrogate.getAspect_ratio(), this.surrogate.getStart_position(), this.surrogate.getShould_auto_play(), this.surrogate.getUse_core_animation_renderer(), null, 128, null);
    }

    public String toString() {
        return "[LottieDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LottieDto) && Intrinsics.areEqual(((LottieDto) other).surrogate, this.surrogate);
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
    /* compiled from: LottieDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002?>Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010B]\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010 R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010 R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b/\u0010)\u001a\u0004\b-\u0010.R/\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b3\u0010)\u001a\u0004\b1\u00102R1\u0010\f\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00104\u0012\u0004\b7\u0010)\u001a\u0004\b5\u00106R\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00108\u0012\u0004\b;\u0010)\u001a\u0004\b9\u0010:R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00108\u0012\u0004\b=\u0010)\u001a\u0004\b<\u0010:¨\u0006@"}, m3636d2 = {"Lrh_server_driven_ui/v1/LottieDto$Surrogate;", "", "", "light_mode_content_url", "dark_mode_content_url", "", "should_loop", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "aspect_ratio", "start_position", "should_auto_play", "use_core_animation_renderer", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZFLjava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZFLjava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/LottieDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLight_mode_content_url", "getLight_mode_content_url$annotations", "()V", "getDark_mode_content_url", "getDark_mode_content_url$annotations", "Z", "getShould_loop", "()Z", "getShould_loop$annotations", "F", "getAspect_ratio", "()F", "getAspect_ratio$annotations", "Ljava/lang/Float;", "getStart_position", "()Ljava/lang/Float;", "getStart_position$annotations", "Ljava/lang/Boolean;", "getShould_auto_play", "()Ljava/lang/Boolean;", "getShould_auto_play$annotations", "getUse_core_animation_renderer", "getUse_core_animation_renderer$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final float aspect_ratio;
        private final String dark_mode_content_url;
        private final String light_mode_content_url;
        private final Boolean should_auto_play;
        private final boolean should_loop;
        private final Float start_position;
        private final Boolean use_core_animation_renderer;

        public Surrogate() {
            this((String) null, (String) null, false, 0.0f, (Float) null, (Boolean) null, (Boolean) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.light_mode_content_url, surrogate.light_mode_content_url) && Intrinsics.areEqual(this.dark_mode_content_url, surrogate.dark_mode_content_url) && this.should_loop == surrogate.should_loop && Float.compare(this.aspect_ratio, surrogate.aspect_ratio) == 0 && Intrinsics.areEqual((Object) this.start_position, (Object) surrogate.start_position) && Intrinsics.areEqual(this.should_auto_play, surrogate.should_auto_play) && Intrinsics.areEqual(this.use_core_animation_renderer, surrogate.use_core_animation_renderer);
        }

        public int hashCode() {
            int iHashCode = ((((((this.light_mode_content_url.hashCode() * 31) + this.dark_mode_content_url.hashCode()) * 31) + Boolean.hashCode(this.should_loop)) * 31) + Float.hashCode(this.aspect_ratio)) * 31;
            Float f = this.start_position;
            int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
            Boolean bool = this.should_auto_play;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.use_core_animation_renderer;
            return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(light_mode_content_url=" + this.light_mode_content_url + ", dark_mode_content_url=" + this.dark_mode_content_url + ", should_loop=" + this.should_loop + ", aspect_ratio=" + this.aspect_ratio + ", start_position=" + this.start_position + ", should_auto_play=" + this.should_auto_play + ", use_core_animation_renderer=" + this.use_core_animation_renderer + ")";
        }

        /* compiled from: LottieDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/LottieDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/LottieDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LottieDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, boolean z, float f, Float f2, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.light_mode_content_url = "";
            } else {
                this.light_mode_content_url = str;
            }
            if ((i & 2) == 0) {
                this.dark_mode_content_url = "";
            } else {
                this.dark_mode_content_url = str2;
            }
            if ((i & 4) == 0) {
                this.should_loop = false;
            } else {
                this.should_loop = z;
            }
            if ((i & 8) == 0) {
                this.aspect_ratio = 0.0f;
            } else {
                this.aspect_ratio = f;
            }
            if ((i & 16) == 0) {
                this.start_position = null;
            } else {
                this.start_position = f2;
            }
            if ((i & 32) == 0) {
                this.should_auto_play = null;
            } else {
                this.should_auto_play = bool;
            }
            if ((i & 64) == 0) {
                this.use_core_animation_renderer = null;
            } else {
                this.use_core_animation_renderer = bool2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.light_mode_content_url, "")) {
                output.encodeStringElement(serialDesc, 0, self.light_mode_content_url);
            }
            if (!Intrinsics.areEqual(self.dark_mode_content_url, "")) {
                output.encodeStringElement(serialDesc, 1, self.dark_mode_content_url);
            }
            boolean z = self.should_loop;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            if (Float.compare(self.aspect_ratio, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 3, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.aspect_ratio));
            }
            Float f = self.start_position;
            if (f != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, FloatAsNumberSerializer.INSTANCE, f);
            }
            Boolean bool = self.should_auto_play;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, bool);
            }
            Boolean bool2 = self.use_core_animation_renderer;
            if (bool2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, BooleanSerializer.INSTANCE, bool2);
            }
        }

        public Surrogate(String light_mode_content_url, String dark_mode_content_url, boolean z, float f, Float f2, Boolean bool, Boolean bool2) {
            Intrinsics.checkNotNullParameter(light_mode_content_url, "light_mode_content_url");
            Intrinsics.checkNotNullParameter(dark_mode_content_url, "dark_mode_content_url");
            this.light_mode_content_url = light_mode_content_url;
            this.dark_mode_content_url = dark_mode_content_url;
            this.should_loop = z;
            this.aspect_ratio = f;
            this.start_position = f2;
            this.should_auto_play = bool;
            this.use_core_animation_renderer = bool2;
        }

        public /* synthetic */ Surrogate(String str, String str2, boolean z, float f, Float f2, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? 0.0f : f, (i & 16) != 0 ? null : f2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2);
        }

        public final String getLight_mode_content_url() {
            return this.light_mode_content_url;
        }

        public final String getDark_mode_content_url() {
            return this.dark_mode_content_url;
        }

        public final boolean getShould_loop() {
            return this.should_loop;
        }

        public final float getAspect_ratio() {
            return this.aspect_ratio;
        }

        public final Float getStart_position() {
            return this.start_position;
        }

        public final Boolean getShould_auto_play() {
            return this.should_auto_play;
        }

        public final Boolean getUse_core_animation_renderer() {
            return this.use_core_animation_renderer;
        }
    }

    /* compiled from: LottieDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/LottieDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/LottieDto;", "Lrh_server_driven_ui/v1/Lottie;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/LottieDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<LottieDto, Lottie> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LottieDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LottieDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LottieDto> getBinaryBase64Serializer() {
            return (KSerializer) LottieDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Lottie> getProtoAdapter() {
            return Lottie.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LottieDto getZeroValue() {
            return LottieDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LottieDto fromProto(Lottie proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new LottieDto(new Surrogate(proto.getLight_mode_content_url(), proto.getDark_mode_content_url(), proto.getShould_loop(), proto.getAspect_ratio(), proto.getStart_position(), proto.getShould_auto_play(), proto.getUse_core_animation_renderer()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.LottieDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LottieDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new LottieDto(null, null, false, 0.0f, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LottieDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/LottieDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/LottieDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/LottieDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<LottieDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Lottie", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LottieDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LottieDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LottieDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LottieDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/LottieDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.LottieDto";
        }
    }
}
