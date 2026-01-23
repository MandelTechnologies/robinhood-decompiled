package rh_server_driven_ui.p531v1;

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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.SwitchColorsDto;

/* compiled from: SwitchDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Be\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006,"}, m3636d2 = {"Lrh_server_driven_ui/v1/SwitchDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Switch;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/SwitchDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/SwitchDto$Surrogate;)V", "", "is_checked", "is_disabled", "Lrh_server_driven_ui/v1/IconDto;", "checked_icon", "unchecked_icon", "Lrh_server_driven_ui/v1/SwitchColorsDto;", "checked_colors", "unchecked_colors", "disabled_unchecked_colors", "disabled_checked_colors", "(ZZLrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/SwitchColorsDto;Lrh_server_driven_ui/v1/SwitchColorsDto;Lrh_server_driven_ui/v1/SwitchColorsDto;Lrh_server_driven_ui/v1/SwitchColorsDto;)V", "toProto", "()Lrh_server_driven_ui/v1/Switch;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/SwitchDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class SwitchDto implements Dto3<Switch>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SwitchDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SwitchDto, Switch>> binaryBase64Serializer$delegate;
    private static final SwitchDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SwitchDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SwitchDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ SwitchDto(boolean z, boolean z2, IconDto iconDto, IconDto iconDto2, SwitchColorsDto switchColorsDto, SwitchColorsDto switchColorsDto2, SwitchColorsDto switchColorsDto3, SwitchColorsDto switchColorsDto4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : iconDto, (i & 8) != 0 ? null : iconDto2, (i & 16) != 0 ? null : switchColorsDto, (i & 32) != 0 ? null : switchColorsDto2, (i & 64) != 0 ? null : switchColorsDto3, (i & 128) != 0 ? null : switchColorsDto4);
    }

    public SwitchDto(boolean z, boolean z2, IconDto iconDto, IconDto iconDto2, SwitchColorsDto switchColorsDto, SwitchColorsDto switchColorsDto2, SwitchColorsDto switchColorsDto3, SwitchColorsDto switchColorsDto4) {
        this(new Surrogate(z, z2, iconDto, iconDto2, switchColorsDto, switchColorsDto2, switchColorsDto3, switchColorsDto4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Switch toProto() {
        boolean is_checked = this.surrogate.getIs_checked();
        boolean is_disabled = this.surrogate.getIs_disabled();
        IconDto checked_icon = this.surrogate.getChecked_icon();
        Icon icon = checked_icon != null ? (Icon) checked_icon.toProto() : null;
        IconDto unchecked_icon = this.surrogate.getUnchecked_icon();
        Icon icon2 = unchecked_icon != null ? (Icon) unchecked_icon.toProto() : null;
        SwitchColorsDto checked_colors = this.surrogate.getChecked_colors();
        SwitchColors proto = checked_colors != null ? checked_colors.toProto() : null;
        SwitchColorsDto unchecked_colors = this.surrogate.getUnchecked_colors();
        SwitchColors proto2 = unchecked_colors != null ? unchecked_colors.toProto() : null;
        SwitchColorsDto disabled_unchecked_colors = this.surrogate.getDisabled_unchecked_colors();
        SwitchColors proto3 = disabled_unchecked_colors != null ? disabled_unchecked_colors.toProto() : null;
        SwitchColorsDto disabled_checked_colors = this.surrogate.getDisabled_checked_colors();
        return new Switch(is_checked, is_disabled, icon, icon2, proto, proto2, proto3, disabled_checked_colors != null ? disabled_checked_colors.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[SwitchDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SwitchDto) && Intrinsics.areEqual(((SwitchDto) other).surrogate, this.surrogate);
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
    /* compiled from: SwitchDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u0002;:Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b\u0003\u0010&R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b)\u0010(\u001a\u0004\b\u0004\u0010&R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b-\u0010(\u001a\u0004\b+\u0010,R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b/\u0010(\u001a\u0004\b.\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010(\u001a\u0004\b1\u00102R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00100\u0012\u0004\b5\u0010(\u001a\u0004\b4\u00102R\"\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b7\u0010(\u001a\u0004\b6\u00102R\"\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00100\u0012\u0004\b9\u0010(\u001a\u0004\b8\u00102¨\u0006<"}, m3636d2 = {"Lrh_server_driven_ui/v1/SwitchDto$Surrogate;", "", "", "is_checked", "is_disabled", "Lrh_server_driven_ui/v1/IconDto;", "checked_icon", "unchecked_icon", "Lrh_server_driven_ui/v1/SwitchColorsDto;", "checked_colors", "unchecked_colors", "disabled_unchecked_colors", "disabled_checked_colors", "<init>", "(ZZLrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/SwitchColorsDto;Lrh_server_driven_ui/v1/SwitchColorsDto;Lrh_server_driven_ui/v1/SwitchColorsDto;Lrh_server_driven_ui/v1/SwitchColorsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/SwitchColorsDto;Lrh_server_driven_ui/v1/SwitchColorsDto;Lrh_server_driven_ui/v1/SwitchColorsDto;Lrh_server_driven_ui/v1/SwitchColorsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/SwitchDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "is_checked$annotations", "()V", "is_disabled$annotations", "Lrh_server_driven_ui/v1/IconDto;", "getChecked_icon", "()Lrh_server_driven_ui/v1/IconDto;", "getChecked_icon$annotations", "getUnchecked_icon", "getUnchecked_icon$annotations", "Lrh_server_driven_ui/v1/SwitchColorsDto;", "getChecked_colors", "()Lrh_server_driven_ui/v1/SwitchColorsDto;", "getChecked_colors$annotations", "getUnchecked_colors", "getUnchecked_colors$annotations", "getDisabled_unchecked_colors", "getDisabled_unchecked_colors$annotations", "getDisabled_checked_colors", "getDisabled_checked_colors$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final SwitchColorsDto checked_colors;
        private final IconDto checked_icon;
        private final SwitchColorsDto disabled_checked_colors;
        private final SwitchColorsDto disabled_unchecked_colors;
        private final boolean is_checked;
        private final boolean is_disabled;
        private final SwitchColorsDto unchecked_colors;
        private final IconDto unchecked_icon;

        public Surrogate() {
            this(false, false, (IconDto) null, (IconDto) null, (SwitchColorsDto) null, (SwitchColorsDto) null, (SwitchColorsDto) null, (SwitchColorsDto) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.is_checked == surrogate.is_checked && this.is_disabled == surrogate.is_disabled && this.checked_icon == surrogate.checked_icon && this.unchecked_icon == surrogate.unchecked_icon && Intrinsics.areEqual(this.checked_colors, surrogate.checked_colors) && Intrinsics.areEqual(this.unchecked_colors, surrogate.unchecked_colors) && Intrinsics.areEqual(this.disabled_unchecked_colors, surrogate.disabled_unchecked_colors) && Intrinsics.areEqual(this.disabled_checked_colors, surrogate.disabled_checked_colors);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.is_checked) * 31) + Boolean.hashCode(this.is_disabled)) * 31;
            IconDto iconDto = this.checked_icon;
            int iHashCode2 = (iHashCode + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
            IconDto iconDto2 = this.unchecked_icon;
            int iHashCode3 = (iHashCode2 + (iconDto2 == null ? 0 : iconDto2.hashCode())) * 31;
            SwitchColorsDto switchColorsDto = this.checked_colors;
            int iHashCode4 = (iHashCode3 + (switchColorsDto == null ? 0 : switchColorsDto.hashCode())) * 31;
            SwitchColorsDto switchColorsDto2 = this.unchecked_colors;
            int iHashCode5 = (iHashCode4 + (switchColorsDto2 == null ? 0 : switchColorsDto2.hashCode())) * 31;
            SwitchColorsDto switchColorsDto3 = this.disabled_unchecked_colors;
            int iHashCode6 = (iHashCode5 + (switchColorsDto3 == null ? 0 : switchColorsDto3.hashCode())) * 31;
            SwitchColorsDto switchColorsDto4 = this.disabled_checked_colors;
            return iHashCode6 + (switchColorsDto4 != null ? switchColorsDto4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(is_checked=" + this.is_checked + ", is_disabled=" + this.is_disabled + ", checked_icon=" + this.checked_icon + ", unchecked_icon=" + this.unchecked_icon + ", checked_colors=" + this.checked_colors + ", unchecked_colors=" + this.unchecked_colors + ", disabled_unchecked_colors=" + this.disabled_unchecked_colors + ", disabled_checked_colors=" + this.disabled_checked_colors + ")";
        }

        /* compiled from: SwitchDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/SwitchDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/SwitchDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SwitchDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, boolean z2, IconDto iconDto, IconDto iconDto2, SwitchColorsDto switchColorsDto, SwitchColorsDto switchColorsDto2, SwitchColorsDto switchColorsDto3, SwitchColorsDto switchColorsDto4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.is_checked = false;
            } else {
                this.is_checked = z;
            }
            if ((i & 2) == 0) {
                this.is_disabled = false;
            } else {
                this.is_disabled = z2;
            }
            if ((i & 4) == 0) {
                this.checked_icon = null;
            } else {
                this.checked_icon = iconDto;
            }
            if ((i & 8) == 0) {
                this.unchecked_icon = null;
            } else {
                this.unchecked_icon = iconDto2;
            }
            if ((i & 16) == 0) {
                this.checked_colors = null;
            } else {
                this.checked_colors = switchColorsDto;
            }
            if ((i & 32) == 0) {
                this.unchecked_colors = null;
            } else {
                this.unchecked_colors = switchColorsDto2;
            }
            if ((i & 64) == 0) {
                this.disabled_unchecked_colors = null;
            } else {
                this.disabled_unchecked_colors = switchColorsDto3;
            }
            if ((i & 128) == 0) {
                this.disabled_checked_colors = null;
            } else {
                this.disabled_checked_colors = switchColorsDto4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.is_checked;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            boolean z2 = self.is_disabled;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 1, z2);
            }
            IconDto iconDto = self.checked_icon;
            if (iconDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IconDto.Serializer.INSTANCE, iconDto);
            }
            IconDto iconDto2 = self.unchecked_icon;
            if (iconDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, IconDto.Serializer.INSTANCE, iconDto2);
            }
            SwitchColorsDto switchColorsDto = self.checked_colors;
            if (switchColorsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, SwitchColorsDto.Serializer.INSTANCE, switchColorsDto);
            }
            SwitchColorsDto switchColorsDto2 = self.unchecked_colors;
            if (switchColorsDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, SwitchColorsDto.Serializer.INSTANCE, switchColorsDto2);
            }
            SwitchColorsDto switchColorsDto3 = self.disabled_unchecked_colors;
            if (switchColorsDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, SwitchColorsDto.Serializer.INSTANCE, switchColorsDto3);
            }
            SwitchColorsDto switchColorsDto4 = self.disabled_checked_colors;
            if (switchColorsDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, SwitchColorsDto.Serializer.INSTANCE, switchColorsDto4);
            }
        }

        public Surrogate(boolean z, boolean z2, IconDto iconDto, IconDto iconDto2, SwitchColorsDto switchColorsDto, SwitchColorsDto switchColorsDto2, SwitchColorsDto switchColorsDto3, SwitchColorsDto switchColorsDto4) {
            this.is_checked = z;
            this.is_disabled = z2;
            this.checked_icon = iconDto;
            this.unchecked_icon = iconDto2;
            this.checked_colors = switchColorsDto;
            this.unchecked_colors = switchColorsDto2;
            this.disabled_unchecked_colors = switchColorsDto3;
            this.disabled_checked_colors = switchColorsDto4;
        }

        public /* synthetic */ Surrogate(boolean z, boolean z2, IconDto iconDto, IconDto iconDto2, SwitchColorsDto switchColorsDto, SwitchColorsDto switchColorsDto2, SwitchColorsDto switchColorsDto3, SwitchColorsDto switchColorsDto4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : iconDto, (i & 8) != 0 ? null : iconDto2, (i & 16) != 0 ? null : switchColorsDto, (i & 32) != 0 ? null : switchColorsDto2, (i & 64) != 0 ? null : switchColorsDto3, (i & 128) != 0 ? null : switchColorsDto4);
        }

        /* renamed from: is_checked, reason: from getter */
        public final boolean getIs_checked() {
            return this.is_checked;
        }

        /* renamed from: is_disabled, reason: from getter */
        public final boolean getIs_disabled() {
            return this.is_disabled;
        }

        public final IconDto getChecked_icon() {
            return this.checked_icon;
        }

        public final IconDto getUnchecked_icon() {
            return this.unchecked_icon;
        }

        public final SwitchColorsDto getChecked_colors() {
            return this.checked_colors;
        }

        public final SwitchColorsDto getUnchecked_colors() {
            return this.unchecked_colors;
        }

        public final SwitchColorsDto getDisabled_unchecked_colors() {
            return this.disabled_unchecked_colors;
        }

        public final SwitchColorsDto getDisabled_checked_colors() {
            return this.disabled_checked_colors;
        }
    }

    /* compiled from: SwitchDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/SwitchDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/SwitchDto;", "Lrh_server_driven_ui/v1/Switch;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/SwitchDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SwitchDto, Switch> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SwitchDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SwitchDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SwitchDto> getBinaryBase64Serializer() {
            return (KSerializer) SwitchDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Switch> getProtoAdapter() {
            return Switch.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SwitchDto getZeroValue() {
            return SwitchDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SwitchDto fromProto(Switch proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            boolean is_checked = proto.getIs_checked();
            boolean is_disabled = proto.getIs_disabled();
            Icon checked_icon = proto.getChecked_icon();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IconDto iconDtoFromProto = checked_icon != null ? IconDto.INSTANCE.fromProto(checked_icon) : null;
            Icon unchecked_icon = proto.getUnchecked_icon();
            IconDto iconDtoFromProto2 = unchecked_icon != null ? IconDto.INSTANCE.fromProto(unchecked_icon) : null;
            SwitchColors checked_colors = proto.getChecked_colors();
            SwitchColorsDto switchColorsDtoFromProto = checked_colors != null ? SwitchColorsDto.INSTANCE.fromProto(checked_colors) : null;
            SwitchColors unchecked_colors = proto.getUnchecked_colors();
            SwitchColorsDto switchColorsDtoFromProto2 = unchecked_colors != null ? SwitchColorsDto.INSTANCE.fromProto(unchecked_colors) : null;
            SwitchColors disabled_unchecked_colors = proto.getDisabled_unchecked_colors();
            SwitchColorsDto switchColorsDtoFromProto3 = disabled_unchecked_colors != null ? SwitchColorsDto.INSTANCE.fromProto(disabled_unchecked_colors) : null;
            SwitchColors disabled_checked_colors = proto.getDisabled_checked_colors();
            return new SwitchDto(new Surrogate(is_checked, is_disabled, iconDtoFromProto, iconDtoFromProto2, switchColorsDtoFromProto, switchColorsDtoFromProto2, switchColorsDtoFromProto3, disabled_checked_colors != null ? SwitchColorsDto.INSTANCE.fromProto(disabled_checked_colors) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.SwitchDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SwitchDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SwitchDto(false, false, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SwitchDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/SwitchDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/SwitchDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/SwitchDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SwitchDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Switch", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SwitchDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SwitchDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SwitchDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SwitchDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/SwitchDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.SwitchDto";
        }
    }
}
