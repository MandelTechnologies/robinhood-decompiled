package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
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
import rh_server_driven_ui.p531v1.NumberPogDto;
import rh_server_driven_ui.p531v1.PogWithPictogramDto;
import rh_server_driven_ui.p531v1.TextPogDto;

/* compiled from: StartElementDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lrh_server_driven_ui/v1/StartElementDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/StartElement;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/StartElementDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/StartElementDto$Surrogate;)V", "Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto;", "concrete", "(Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto;)V", "toProto", "()Lrh_server_driven_ui/v1/StartElement;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/StartElementDto$Surrogate;", "getConcrete", "()Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto;", "Companion", "Surrogate", "ConcreteDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class StartElementDto implements Dto3<StartElement>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StartElementDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StartElementDto, StartElement>> binaryBase64Serializer$delegate;
    private static final StartElementDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StartElementDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StartElementDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ConcreteDto getConcrete() {
        if (this.surrogate.getIcon() != null) {
            return new ConcreteDto.Icon(this.surrogate.getIcon());
        }
        if (this.surrogate.getNumber_pog() != null) {
            return new ConcreteDto.NumberPog(this.surrogate.getNumber_pog());
        }
        if (this.surrogate.getPictogram_pog() != null) {
            return new ConcreteDto.PictogramPog(this.surrogate.getPictogram_pog());
        }
        if (this.surrogate.getText_pog() != null) {
            return new ConcreteDto.TextPog(this.surrogate.getText_pog());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StartElementDto(ConcreteDto concreteDto) {
        ConcreteDto.Icon icon = concreteDto instanceof ConcreteDto.Icon ? (ConcreteDto.Icon) concreteDto : null;
        IconDto value = icon != null ? icon.getValue() : null;
        ConcreteDto.NumberPog numberPog = concreteDto instanceof ConcreteDto.NumberPog ? (ConcreteDto.NumberPog) concreteDto : null;
        NumberPogDto value2 = numberPog != null ? numberPog.getValue() : null;
        ConcreteDto.PictogramPog pictogramPog = concreteDto instanceof ConcreteDto.PictogramPog ? (ConcreteDto.PictogramPog) concreteDto : null;
        PogWithPictogramDto value3 = pictogramPog != null ? pictogramPog.getValue() : null;
        ConcreteDto.TextPog textPog = concreteDto instanceof ConcreteDto.TextPog ? (ConcreteDto.TextPog) concreteDto : null;
        this(new Surrogate(value, value2, value3, textPog != null ? textPog.getValue() : null));
    }

    public /* synthetic */ StartElementDto(ConcreteDto concreteDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : concreteDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public StartElement toProto() {
        IconDto icon = this.surrogate.getIcon();
        Icon icon2 = icon != null ? (Icon) icon.toProto() : null;
        NumberPogDto number_pog = this.surrogate.getNumber_pog();
        NumberPog proto = number_pog != null ? number_pog.toProto() : null;
        PogWithPictogramDto pictogram_pog = this.surrogate.getPictogram_pog();
        PogWithPictogram proto2 = pictogram_pog != null ? pictogram_pog.toProto() : null;
        TextPogDto text_pog = this.surrogate.getText_pog();
        return new StartElement(icon2, proto, proto2, text_pog != null ? text_pog.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[StartElementDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StartElementDto) && Intrinsics.areEqual(((StartElementDto) other).surrogate, this.surrogate);
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
    /* compiled from: StartElementDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102¨\u00066"}, m3636d2 = {"Lrh_server_driven_ui/v1/StartElementDto$Surrogate;", "", "Lrh_server_driven_ui/v1/IconDto;", "icon", "Lrh_server_driven_ui/v1/NumberPogDto;", "number_pog", "Lrh_server_driven_ui/v1/PogWithPictogramDto;", "pictogram_pog", "Lrh_server_driven_ui/v1/TextPogDto;", "text_pog", "<init>", "(Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/NumberPogDto;Lrh_server_driven_ui/v1/PogWithPictogramDto;Lrh_server_driven_ui/v1/TextPogDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/NumberPogDto;Lrh_server_driven_ui/v1/PogWithPictogramDto;Lrh_server_driven_ui/v1/TextPogDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/StartElementDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/IconDto;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getIcon$annotations", "()V", "Lrh_server_driven_ui/v1/NumberPogDto;", "getNumber_pog", "()Lrh_server_driven_ui/v1/NumberPogDto;", "getNumber_pog$annotations", "Lrh_server_driven_ui/v1/PogWithPictogramDto;", "getPictogram_pog", "()Lrh_server_driven_ui/v1/PogWithPictogramDto;", "getPictogram_pog$annotations", "Lrh_server_driven_ui/v1/TextPogDto;", "getText_pog", "()Lrh_server_driven_ui/v1/TextPogDto;", "getText_pog$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IconDto icon;
        private final NumberPogDto number_pog;
        private final PogWithPictogramDto pictogram_pog;
        private final TextPogDto text_pog;

        public Surrogate() {
            this((IconDto) null, (NumberPogDto) null, (PogWithPictogramDto) null, (TextPogDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.icon == surrogate.icon && Intrinsics.areEqual(this.number_pog, surrogate.number_pog) && Intrinsics.areEqual(this.pictogram_pog, surrogate.pictogram_pog) && Intrinsics.areEqual(this.text_pog, surrogate.text_pog);
        }

        public int hashCode() {
            IconDto iconDto = this.icon;
            int iHashCode = (iconDto == null ? 0 : iconDto.hashCode()) * 31;
            NumberPogDto numberPogDto = this.number_pog;
            int iHashCode2 = (iHashCode + (numberPogDto == null ? 0 : numberPogDto.hashCode())) * 31;
            PogWithPictogramDto pogWithPictogramDto = this.pictogram_pog;
            int iHashCode3 = (iHashCode2 + (pogWithPictogramDto == null ? 0 : pogWithPictogramDto.hashCode())) * 31;
            TextPogDto textPogDto = this.text_pog;
            return iHashCode3 + (textPogDto != null ? textPogDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(icon=" + this.icon + ", number_pog=" + this.number_pog + ", pictogram_pog=" + this.pictogram_pog + ", text_pog=" + this.text_pog + ")";
        }

        /* compiled from: StartElementDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/StartElementDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/StartElementDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StartElementDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IconDto iconDto, NumberPogDto numberPogDto, PogWithPictogramDto pogWithPictogramDto, TextPogDto textPogDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.icon = null;
            } else {
                this.icon = iconDto;
            }
            if ((i & 2) == 0) {
                this.number_pog = null;
            } else {
                this.number_pog = numberPogDto;
            }
            if ((i & 4) == 0) {
                this.pictogram_pog = null;
            } else {
                this.pictogram_pog = pogWithPictogramDto;
            }
            if ((i & 8) == 0) {
                this.text_pog = null;
            } else {
                this.text_pog = textPogDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            IconDto iconDto = self.icon;
            if (iconDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, IconDto.Serializer.INSTANCE, iconDto);
            }
            NumberPogDto numberPogDto = self.number_pog;
            if (numberPogDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, NumberPogDto.Serializer.INSTANCE, numberPogDto);
            }
            PogWithPictogramDto pogWithPictogramDto = self.pictogram_pog;
            if (pogWithPictogramDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, PogWithPictogramDto.Serializer.INSTANCE, pogWithPictogramDto);
            }
            TextPogDto textPogDto = self.text_pog;
            if (textPogDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TextPogDto.Serializer.INSTANCE, textPogDto);
            }
        }

        public Surrogate(IconDto iconDto, NumberPogDto numberPogDto, PogWithPictogramDto pogWithPictogramDto, TextPogDto textPogDto) {
            this.icon = iconDto;
            this.number_pog = numberPogDto;
            this.pictogram_pog = pogWithPictogramDto;
            this.text_pog = textPogDto;
        }

        public /* synthetic */ Surrogate(IconDto iconDto, NumberPogDto numberPogDto, PogWithPictogramDto pogWithPictogramDto, TextPogDto textPogDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : iconDto, (i & 2) != 0 ? null : numberPogDto, (i & 4) != 0 ? null : pogWithPictogramDto, (i & 8) != 0 ? null : textPogDto);
        }

        public final IconDto getIcon() {
            return this.icon;
        }

        public final NumberPogDto getNumber_pog() {
            return this.number_pog;
        }

        public final PogWithPictogramDto getPictogram_pog() {
            return this.pictogram_pog;
        }

        public final TextPogDto getText_pog() {
            return this.text_pog;
        }
    }

    /* compiled from: StartElementDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/StartElementDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/StartElementDto;", "Lrh_server_driven_ui/v1/StartElement;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/StartElementDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StartElementDto, StartElement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StartElementDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StartElementDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StartElementDto> getBinaryBase64Serializer() {
            return (KSerializer) StartElementDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StartElement> getProtoAdapter() {
            return StartElement.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StartElementDto getZeroValue() {
            return StartElementDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StartElementDto fromProto(StartElement proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Icon icon = proto.getIcon();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IconDto iconDtoFromProto = icon != null ? IconDto.INSTANCE.fromProto(icon) : null;
            NumberPog number_pog = proto.getNumber_pog();
            NumberPogDto numberPogDtoFromProto = number_pog != null ? NumberPogDto.INSTANCE.fromProto(number_pog) : null;
            PogWithPictogram pictogram_pog = proto.getPictogram_pog();
            PogWithPictogramDto pogWithPictogramDtoFromProto = pictogram_pog != null ? PogWithPictogramDto.INSTANCE.fromProto(pictogram_pog) : null;
            TextPog text_pog = proto.getText_pog();
            return new StartElementDto(new Surrogate(iconDtoFromProto, numberPogDtoFromProto, pogWithPictogramDtoFromProto, text_pog != null ? TextPogDto.INSTANCE.fromProto(text_pog) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.StartElementDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StartElementDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StartElementDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StartElementDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Icon", "NumberPog", "PictogramPog", "TextPog", "Companion", "Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto$Icon;", "Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto$NumberPog;", "Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto$PictogramPog;", "Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto$TextPog;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ConcreteDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ConcreteDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ConcreteDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: StartElementDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto$Icon;", "Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto;", "Lrh_server_driven_ui/v1/IconDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/IconDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/IconDto;", "getValue", "()Lrh_server_driven_ui/v1/IconDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Icon extends ConcreteDto {
            private final IconDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Icon) && this.value == ((Icon) other).value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Icon(value=" + this.value + ")";
            }

            public final IconDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Icon(IconDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StartElementDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto$NumberPog;", "Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto;", "Lrh_server_driven_ui/v1/NumberPogDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/NumberPogDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/NumberPogDto;", "getValue", "()Lrh_server_driven_ui/v1/NumberPogDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NumberPog extends ConcreteDto {
            private final NumberPogDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NumberPog) && Intrinsics.areEqual(this.value, ((NumberPog) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NumberPog(value=" + this.value + ")";
            }

            public final NumberPogDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NumberPog(NumberPogDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StartElementDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto$PictogramPog;", "Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto;", "Lrh_server_driven_ui/v1/PogWithPictogramDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/PogWithPictogramDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/PogWithPictogramDto;", "getValue", "()Lrh_server_driven_ui/v1/PogWithPictogramDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PictogramPog extends ConcreteDto {
            private final PogWithPictogramDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PictogramPog) && Intrinsics.areEqual(this.value, ((PictogramPog) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PictogramPog(value=" + this.value + ")";
            }

            public final PogWithPictogramDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PictogramPog(PogWithPictogramDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StartElementDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto$TextPog;", "Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto;", "Lrh_server_driven_ui/v1/TextPogDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/TextPogDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/TextPogDto;", "getValue", "()Lrh_server_driven_ui/v1/TextPogDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TextPog extends ConcreteDto {
            private final TextPogDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TextPog) && Intrinsics.areEqual(this.value, ((TextPog) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TextPog(value=" + this.value + ")";
            }

            public final TextPogDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextPog(TextPogDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StartElementDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lrh_server_driven_ui/v1/StartElementDto$ConcreteDto;", "Lrh_server_driven_ui/v1/StartElement;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<ConcreteDto, StartElement> {
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
            public ProtoAdapter<StartElement> getProtoAdapter() {
                return StartElement.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ConcreteDto fromProto(StartElement proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getIcon() != null) {
                    return new Icon(IconDto.INSTANCE.fromProto(proto.getIcon()));
                }
                if (proto.getNumber_pog() != null) {
                    return new NumberPog(NumberPogDto.INSTANCE.fromProto(proto.getNumber_pog()));
                }
                if (proto.getPictogram_pog() != null) {
                    return new PictogramPog(PogWithPictogramDto.INSTANCE.fromProto(proto.getPictogram_pog()));
                }
                if (proto.getText_pog() != null) {
                    return new TextPog(TextPogDto.INSTANCE.fromProto(proto.getText_pog()));
                }
                return null;
            }
        }
    }

    /* compiled from: StartElementDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/StartElementDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/StartElementDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/StartElementDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StartElementDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.StartElement", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StartElementDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StartElementDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StartElementDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StartElementDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/StartElementDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.StartElementDto";
        }
    }
}
