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
import kotlinx.serialization.internal.StringSerializer;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: IconElementDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Lrh_server_driven_ui/v1/IconElementDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/IconElement;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/IconElementDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/IconElementDto$Surrogate;)V", "Lrh_server_driven_ui/v1/IconDto;", "icon", "", "accessibilty_label", "Lrh_server_driven_ui/v1/ThemedColorDto;", "tint", "Lrh_server_driven_ui/v1/ActionDto;", "action", "(Lrh_server_driven_ui/v1/IconDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ActionDto;)V", "toProto", "()Lrh_server_driven_ui/v1/IconElement;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/IconElementDto$Surrogate;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getAccessibilty_label", "getTint", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class IconElementDto implements Dto3<IconElement>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IconElementDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IconElementDto, IconElement>> binaryBase64Serializer$delegate;
    private static final IconElementDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IconElementDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IconElementDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IconDto getIcon() {
        return this.surrogate.getIcon();
    }

    public final String getAccessibilty_label() {
        return this.surrogate.getAccessibilty_label();
    }

    public final ThemedColorDto getTint() {
        return this.surrogate.getTint();
    }

    public /* synthetic */ IconElementDto(IconDto iconDto, String str, ThemedColorDto themedColorDto, ActionDto actionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IconDto.INSTANCE.getZeroValue() : iconDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : themedColorDto, (i & 8) != 0 ? null : actionDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconElementDto(IconDto icon, String str, ThemedColorDto themedColorDto, ActionDto actionDto) {
        this(new Surrogate(icon, str, themedColorDto, actionDto));
        Intrinsics.checkNotNullParameter(icon, "icon");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public IconElement toProto() {
        Icon icon = (Icon) this.surrogate.getIcon().toProto();
        String accessibilty_label = this.surrogate.getAccessibilty_label();
        ThemedColorDto tint = this.surrogate.getTint();
        ThemedColor proto = tint != null ? tint.toProto() : null;
        ActionDto action = this.surrogate.getAction();
        return new IconElement(icon, accessibilty_label, proto, action != null ? action.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[IconElementDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IconElementDto) && Intrinsics.areEqual(((IconElementDto) other).surrogate, this.surrogate);
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
    /* compiled from: IconElementDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010&\u001a\u0004\b+\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010&\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconElementDto$Surrogate;", "", "Lrh_server_driven_ui/v1/IconDto;", "icon", "", "accessibilty_label", "Lrh_server_driven_ui/v1/ThemedColorDto;", "tint", "Lrh_server_driven_ui/v1/ActionDto;", "action", "<init>", "(Lrh_server_driven_ui/v1/IconDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ActionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/IconDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ActionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/IconElementDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/IconDto;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getIcon$annotations", "()V", "Ljava/lang/String;", "getAccessibilty_label", "getAccessibilty_label$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getTint", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getTint$annotations", "Lrh_server_driven_ui/v1/ActionDto;", "getAction", "()Lrh_server_driven_ui/v1/ActionDto;", "getAction$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String accessibilty_label;
        private final ActionDto action;
        private final IconDto icon;
        private final ThemedColorDto tint;

        public Surrogate() {
            this((IconDto) null, (String) null, (ThemedColorDto) null, (ActionDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.icon == surrogate.icon && Intrinsics.areEqual(this.accessibilty_label, surrogate.accessibilty_label) && Intrinsics.areEqual(this.tint, surrogate.tint) && Intrinsics.areEqual(this.action, surrogate.action);
        }

        public int hashCode() {
            int iHashCode = this.icon.hashCode() * 31;
            String str = this.accessibilty_label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ThemedColorDto themedColorDto = this.tint;
            int iHashCode3 = (iHashCode2 + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
            ActionDto actionDto = this.action;
            return iHashCode3 + (actionDto != null ? actionDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(icon=" + this.icon + ", accessibilty_label=" + this.accessibilty_label + ", tint=" + this.tint + ", action=" + this.action + ")";
        }

        /* compiled from: IconElementDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconElementDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/IconElementDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IconElementDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IconDto iconDto, String str, ThemedColorDto themedColorDto, ActionDto actionDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.icon = (i & 1) == 0 ? IconDto.INSTANCE.getZeroValue() : iconDto;
            if ((i & 2) == 0) {
                this.accessibilty_label = null;
            } else {
                this.accessibilty_label = str;
            }
            if ((i & 4) == 0) {
                this.tint = null;
            } else {
                this.tint = themedColorDto;
            }
            if ((i & 8) == 0) {
                this.action = null;
            } else {
                this.action = actionDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.icon != IconDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, IconDto.Serializer.INSTANCE, self.icon);
            }
            String str = self.accessibilty_label;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }
            ThemedColorDto themedColorDto = self.tint;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            ActionDto actionDto = self.action;
            if (actionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ActionDto.Serializer.INSTANCE, actionDto);
            }
        }

        public Surrogate(IconDto icon, String str, ThemedColorDto themedColorDto, ActionDto actionDto) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.accessibilty_label = str;
            this.tint = themedColorDto;
            this.action = actionDto;
        }

        public final IconDto getIcon() {
            return this.icon;
        }

        public /* synthetic */ Surrogate(IconDto iconDto, String str, ThemedColorDto themedColorDto, ActionDto actionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? IconDto.INSTANCE.getZeroValue() : iconDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : themedColorDto, (i & 8) != 0 ? null : actionDto);
        }

        public final String getAccessibilty_label() {
            return this.accessibilty_label;
        }

        public final ThemedColorDto getTint() {
            return this.tint;
        }

        public final ActionDto getAction() {
            return this.action;
        }
    }

    /* compiled from: IconElementDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconElementDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/IconElementDto;", "Lrh_server_driven_ui/v1/IconElement;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/IconElementDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<IconElementDto, IconElement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IconElementDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IconElementDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IconElementDto> getBinaryBase64Serializer() {
            return (KSerializer) IconElementDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IconElement> getProtoAdapter() {
            return IconElement.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IconElementDto getZeroValue() {
            return IconElementDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IconElementDto fromProto(IconElement proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            IconDto iconDtoFromProto = IconDto.INSTANCE.fromProto(proto.getIcon());
            String accessibilty_label = proto.getAccessibilty_label();
            ThemedColor tint = proto.getTint();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ThemedColorDto themedColorDtoFromProto = tint != null ? ThemedColorDto.INSTANCE.fromProto(tint) : null;
            Action action = proto.getAction();
            return new IconElementDto(new Surrogate(iconDtoFromProto, accessibilty_label, themedColorDtoFromProto, action != null ? ActionDto.INSTANCE.fromProto(action) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.IconElementDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IconElementDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IconElementDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IconElementDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconElementDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/IconElementDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/IconElementDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IconElementDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.IconElement", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IconElementDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IconElementDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IconElementDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IconElementDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconElementDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.IconElementDto";
        }
    }
}
