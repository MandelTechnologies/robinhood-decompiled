package hippo.model.p469v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import hippo.model.p469v1.AppColorThemeDto;
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

/* compiled from: GeneralSettingsDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lhippo/model/v1/GeneralSettingsDto;", "Lcom/robinhood/idl/MessageDto;", "Lhippo/model/v1/GeneralSettings;", "Landroid/os/Parcelable;", "Lhippo/model/v1/GeneralSettingsDto$Surrogate;", "surrogate", "<init>", "(Lhippo/model/v1/GeneralSettingsDto$Surrogate;)V", "", "loading_sound_enabled", "trading_sound_enabled", "session_change_sound_enabled", "Lhippo/model/v1/AppColorThemeDto;", "app_color_theme", "privacy_mode_enabled", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lhippo/model/v1/AppColorThemeDto;Ljava/lang/Boolean;)V", "toProto", "()Lhippo/model/v1/GeneralSettings;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lhippo/model/v1/GeneralSettingsDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class GeneralSettingsDto implements Dto3<GeneralSettings>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GeneralSettingsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GeneralSettingsDto, GeneralSettings>> binaryBase64Serializer$delegate;
    private static final GeneralSettingsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GeneralSettingsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GeneralSettingsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ GeneralSettingsDto(Boolean bool, Boolean bool2, Boolean bool3, AppColorThemeDto appColorThemeDto, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? AppColorThemeDto.INSTANCE.getZeroValue() : appColorThemeDto, (i & 16) != 0 ? null : bool4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GeneralSettingsDto(Boolean bool, Boolean bool2, Boolean bool3, AppColorThemeDto app_color_theme, Boolean bool4) {
        this(new Surrogate(bool, bool2, bool3, app_color_theme, bool4));
        Intrinsics.checkNotNullParameter(app_color_theme, "app_color_theme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GeneralSettings toProto() {
        return new GeneralSettings(this.surrogate.getLoading_sound_enabled(), this.surrogate.getTrading_sound_enabled(), this.surrogate.getSession_change_sound_enabled(), (AppColorTheme) this.surrogate.getApp_color_theme().toProto(), this.surrogate.getPrivacy_mode_enabled(), null, 32, null);
    }

    public String toString() {
        return "[GeneralSettingsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GeneralSettingsDto) && Intrinsics.areEqual(((GeneralSettingsDto) other).surrogate, this.surrogate);
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
    /* compiled from: GeneralSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010#R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010!\u0012\u0004\b/\u0010%\u001a\u0004\b.\u0010#¨\u00062"}, m3636d2 = {"Lhippo/model/v1/GeneralSettingsDto$Surrogate;", "", "", "loading_sound_enabled", "trading_sound_enabled", "session_change_sound_enabled", "Lhippo/model/v1/AppColorThemeDto;", "app_color_theme", "privacy_mode_enabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lhippo/model/v1/AppColorThemeDto;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lhippo/model/v1/AppColorThemeDto;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$hippo_v1_externalRelease", "(Lhippo/model/v1/GeneralSettingsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getLoading_sound_enabled", "()Ljava/lang/Boolean;", "getLoading_sound_enabled$annotations", "()V", "getTrading_sound_enabled", "getTrading_sound_enabled$annotations", "getSession_change_sound_enabled", "getSession_change_sound_enabled$annotations", "Lhippo/model/v1/AppColorThemeDto;", "getApp_color_theme", "()Lhippo/model/v1/AppColorThemeDto;", "getApp_color_theme$annotations", "getPrivacy_mode_enabled", "getPrivacy_mode_enabled$annotations", "Companion", "$serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AppColorThemeDto app_color_theme;
        private final Boolean loading_sound_enabled;
        private final Boolean privacy_mode_enabled;
        private final Boolean session_change_sound_enabled;
        private final Boolean trading_sound_enabled;

        public Surrogate() {
            this((Boolean) null, (Boolean) null, (Boolean) null, (AppColorThemeDto) null, (Boolean) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.loading_sound_enabled, surrogate.loading_sound_enabled) && Intrinsics.areEqual(this.trading_sound_enabled, surrogate.trading_sound_enabled) && Intrinsics.areEqual(this.session_change_sound_enabled, surrogate.session_change_sound_enabled) && this.app_color_theme == surrogate.app_color_theme && Intrinsics.areEqual(this.privacy_mode_enabled, surrogate.privacy_mode_enabled);
        }

        public int hashCode() {
            Boolean bool = this.loading_sound_enabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.trading_sound_enabled;
            int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.session_change_sound_enabled;
            int iHashCode3 = (((iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + this.app_color_theme.hashCode()) * 31;
            Boolean bool4 = this.privacy_mode_enabled;
            return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(loading_sound_enabled=" + this.loading_sound_enabled + ", trading_sound_enabled=" + this.trading_sound_enabled + ", session_change_sound_enabled=" + this.session_change_sound_enabled + ", app_color_theme=" + this.app_color_theme + ", privacy_mode_enabled=" + this.privacy_mode_enabled + ")";
        }

        /* compiled from: GeneralSettingsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lhippo/model/v1/GeneralSettingsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/GeneralSettingsDto$Surrogate;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GeneralSettingsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, Boolean bool, Boolean bool2, Boolean bool3, AppColorThemeDto appColorThemeDto, Boolean bool4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.loading_sound_enabled = null;
            } else {
                this.loading_sound_enabled = bool;
            }
            if ((i & 2) == 0) {
                this.trading_sound_enabled = null;
            } else {
                this.trading_sound_enabled = bool2;
            }
            if ((i & 4) == 0) {
                this.session_change_sound_enabled = null;
            } else {
                this.session_change_sound_enabled = bool3;
            }
            if ((i & 8) == 0) {
                this.app_color_theme = AppColorThemeDto.INSTANCE.getZeroValue();
            } else {
                this.app_color_theme = appColorThemeDto;
            }
            if ((i & 16) == 0) {
                this.privacy_mode_enabled = null;
            } else {
                this.privacy_mode_enabled = bool4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$hippo_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Boolean bool = self.loading_sound_enabled;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, bool);
            }
            Boolean bool2 = self.trading_sound_enabled;
            if (bool2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, bool2);
            }
            Boolean bool3 = self.session_change_sound_enabled;
            if (bool3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, bool3);
            }
            if (self.app_color_theme != AppColorThemeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, AppColorThemeDto.Serializer.INSTANCE, self.app_color_theme);
            }
            Boolean bool4 = self.privacy_mode_enabled;
            if (bool4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, bool4);
            }
        }

        public Surrogate(Boolean bool, Boolean bool2, Boolean bool3, AppColorThemeDto app_color_theme, Boolean bool4) {
            Intrinsics.checkNotNullParameter(app_color_theme, "app_color_theme");
            this.loading_sound_enabled = bool;
            this.trading_sound_enabled = bool2;
            this.session_change_sound_enabled = bool3;
            this.app_color_theme = app_color_theme;
            this.privacy_mode_enabled = bool4;
        }

        public final Boolean getLoading_sound_enabled() {
            return this.loading_sound_enabled;
        }

        public final Boolean getTrading_sound_enabled() {
            return this.trading_sound_enabled;
        }

        public final Boolean getSession_change_sound_enabled() {
            return this.session_change_sound_enabled;
        }

        public final AppColorThemeDto getApp_color_theme() {
            return this.app_color_theme;
        }

        public /* synthetic */ Surrogate(Boolean bool, Boolean bool2, Boolean bool3, AppColorThemeDto appColorThemeDto, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? AppColorThemeDto.INSTANCE.getZeroValue() : appColorThemeDto, (i & 16) != 0 ? null : bool4);
        }

        public final Boolean getPrivacy_mode_enabled() {
            return this.privacy_mode_enabled;
        }
    }

    /* compiled from: GeneralSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lhippo/model/v1/GeneralSettingsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lhippo/model/v1/GeneralSettingsDto;", "Lhippo/model/v1/GeneralSettings;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lhippo/model/v1/GeneralSettingsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GeneralSettingsDto, GeneralSettings> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GeneralSettingsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GeneralSettingsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GeneralSettingsDto> getBinaryBase64Serializer() {
            return (KSerializer) GeneralSettingsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GeneralSettings> getProtoAdapter() {
            return GeneralSettings.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GeneralSettingsDto getZeroValue() {
            return GeneralSettingsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GeneralSettingsDto fromProto(GeneralSettings proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GeneralSettingsDto(new Surrogate(proto.getLoading_sound_enabled(), proto.getTrading_sound_enabled(), proto.getSession_change_sound_enabled(), AppColorThemeDto.INSTANCE.fromProto(proto.getApp_color_theme()), proto.getPrivacy_mode_enabled()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: hippo.model.v1.GeneralSettingsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GeneralSettingsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GeneralSettingsDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GeneralSettingsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lhippo/model/v1/GeneralSettingsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/GeneralSettingsDto;", "<init>", "()V", "surrogateSerializer", "Lhippo/model/v1/GeneralSettingsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GeneralSettingsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/hippo.model.v1.GeneralSettings", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GeneralSettingsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GeneralSettingsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GeneralSettingsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GeneralSettingsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lhippo/model/v1/GeneralSettingsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "hippo.model.v1.GeneralSettingsDto";
        }
    }
}
