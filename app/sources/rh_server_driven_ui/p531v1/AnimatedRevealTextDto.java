package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.utils.extensions.ResourceTypes;
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
import rh_server_driven_ui.p531v1.TextStyleDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: AnimatedRevealTextDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00062"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedRevealTextDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/AnimatedRevealText;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/AnimatedRevealTextDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/AnimatedRevealTextDto$Surrogate;)V", "", "text", "", "initial_delay", "interval", "duration", "Lrh_server_driven_ui/v1/TextStyleDto;", ResourceTypes.STYLE, "Lrh_server_driven_ui/v1/ThemedColorDto;", ResourceTypes.COLOR, "(Ljava/lang/String;FFFLrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;)V", "toProto", "()Lrh_server_driven_ui/v1/AnimatedRevealText;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/AnimatedRevealTextDto$Surrogate;", "getText", "getInitial_delay", "()F", "getInterval", "getDuration", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class AnimatedRevealTextDto implements Dto3<AnimatedRevealText>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AnimatedRevealTextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AnimatedRevealTextDto, AnimatedRevealText>> binaryBase64Serializer$delegate;
    private static final AnimatedRevealTextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AnimatedRevealTextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AnimatedRevealTextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getText() {
        return this.surrogate.getText();
    }

    public final float getInitial_delay() {
        return this.surrogate.getInitial_delay();
    }

    public final float getInterval() {
        return this.surrogate.getInterval();
    }

    public final float getDuration() {
        return this.surrogate.getDuration();
    }

    public final ThemedColorDto getColor() {
        return this.surrogate.getColor();
    }

    public /* synthetic */ AnimatedRevealTextDto(String str, float f, float f2, float f3, TextStyleDto textStyleDto, ThemedColorDto themedColorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? TextStyleDto.INSTANCE.getZeroValue() : textStyleDto, (i & 32) != 0 ? null : themedColorDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedRevealTextDto(String text, float f, float f2, float f3, TextStyleDto style, ThemedColorDto themedColorDto) {
        this(new Surrogate(text, f, f2, f3, style, themedColorDto));
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AnimatedRevealText toProto() {
        String text = this.surrogate.getText();
        float initial_delay = this.surrogate.getInitial_delay();
        float interval = this.surrogate.getInterval();
        float duration = this.surrogate.getDuration();
        TextStyle textStyle = (TextStyle) this.surrogate.getStyle().toProto();
        ThemedColorDto color = this.surrogate.getColor();
        return new AnimatedRevealText(text, initial_delay, interval, duration, textStyle, color != null ? color.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[AnimatedRevealTextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AnimatedRevealTextDto) && Intrinsics.areEqual(((AnimatedRevealTextDto) other).surrogate, this.surrogate);
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
    /* compiled from: AnimatedRevealTextDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002<;Br\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010BQ\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010 R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R/\u0010\t\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010+\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010-R/\u0010\n\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010+\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010-R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00103\u0012\u0004\b6\u0010*\u001a\u0004\b4\u00105R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00107\u0012\u0004\b:\u0010*\u001a\u0004\b8\u00109¨\u0006="}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedRevealTextDto$Surrogate;", "", "", "text", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "initial_delay", "interval", "duration", "Lrh_server_driven_ui/v1/TextStyleDto;", ResourceTypes.STYLE, "Lrh_server_driven_ui/v1/ThemedColorDto;", ResourceTypes.COLOR, "<init>", "(Ljava/lang/String;FFFLrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;FFFLrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/AnimatedRevealTextDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "F", "getInitial_delay", "()F", "getInitial_delay$annotations", "getInterval", "getInterval$annotations", "getDuration", "getDuration$annotations", "Lrh_server_driven_ui/v1/TextStyleDto;", "getStyle", "()Lrh_server_driven_ui/v1/TextStyleDto;", "getStyle$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getColor$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ThemedColorDto color;
        private final float duration;
        private final float initial_delay;
        private final float interval;
        private final TextStyleDto style;
        private final String text;

        public Surrogate() {
            this((String) null, 0.0f, 0.0f, 0.0f, (TextStyleDto) null, (ThemedColorDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.text, surrogate.text) && Float.compare(this.initial_delay, surrogate.initial_delay) == 0 && Float.compare(this.interval, surrogate.interval) == 0 && Float.compare(this.duration, surrogate.duration) == 0 && this.style == surrogate.style && Intrinsics.areEqual(this.color, surrogate.color);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.text.hashCode() * 31) + Float.hashCode(this.initial_delay)) * 31) + Float.hashCode(this.interval)) * 31) + Float.hashCode(this.duration)) * 31) + this.style.hashCode()) * 31;
            ThemedColorDto themedColorDto = this.color;
            return iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode());
        }

        public String toString() {
            return "Surrogate(text=" + this.text + ", initial_delay=" + this.initial_delay + ", interval=" + this.interval + ", duration=" + this.duration + ", style=" + this.style + ", color=" + this.color + ")";
        }

        /* compiled from: AnimatedRevealTextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedRevealTextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/AnimatedRevealTextDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AnimatedRevealTextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, float f, float f2, float f3, TextStyleDto textStyleDto, ThemedColorDto themedColorDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.text = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.initial_delay = 0.0f;
            } else {
                this.initial_delay = f;
            }
            if ((i & 4) == 0) {
                this.interval = 0.0f;
            } else {
                this.interval = f2;
            }
            if ((i & 8) == 0) {
                this.duration = 0.0f;
            } else {
                this.duration = f3;
            }
            if ((i & 16) == 0) {
                this.style = TextStyleDto.INSTANCE.getZeroValue();
            } else {
                this.style = textStyleDto;
            }
            if ((i & 32) == 0) {
                this.color = null;
            } else {
                this.color = themedColorDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.text, "")) {
                output.encodeStringElement(serialDesc, 0, self.text);
            }
            if (Float.compare(self.initial_delay, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 1, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.initial_delay));
            }
            if (Float.compare(self.interval, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 2, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.interval));
            }
            if (Float.compare(self.duration, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 3, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.duration));
            }
            if (self.style != TextStyleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, TextStyleDto.Serializer.INSTANCE, self.style);
            }
            ThemedColorDto themedColorDto = self.color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
        }

        public Surrogate(String text, float f, float f2, float f3, TextStyleDto style, ThemedColorDto themedColorDto) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(style, "style");
            this.text = text;
            this.initial_delay = f;
            this.interval = f2;
            this.duration = f3;
            this.style = style;
            this.color = themedColorDto;
        }

        public final String getText() {
            return this.text;
        }

        public /* synthetic */ Surrogate(String str, float f, float f2, float f3, TextStyleDto textStyleDto, ThemedColorDto themedColorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? TextStyleDto.INSTANCE.getZeroValue() : textStyleDto, (i & 32) != 0 ? null : themedColorDto);
        }

        public final float getInitial_delay() {
            return this.initial_delay;
        }

        public final float getInterval() {
            return this.interval;
        }

        public final float getDuration() {
            return this.duration;
        }

        public final TextStyleDto getStyle() {
            return this.style;
        }

        public final ThemedColorDto getColor() {
            return this.color;
        }
    }

    /* compiled from: AnimatedRevealTextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedRevealTextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/AnimatedRevealTextDto;", "Lrh_server_driven_ui/v1/AnimatedRevealText;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/AnimatedRevealTextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AnimatedRevealTextDto, AnimatedRevealText> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AnimatedRevealTextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AnimatedRevealTextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AnimatedRevealTextDto> getBinaryBase64Serializer() {
            return (KSerializer) AnimatedRevealTextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AnimatedRevealText> getProtoAdapter() {
            return AnimatedRevealText.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AnimatedRevealTextDto getZeroValue() {
            return AnimatedRevealTextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AnimatedRevealTextDto fromProto(AnimatedRevealText proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String text = proto.getText();
            float initial_delay = proto.getInitial_delay();
            float interval = proto.getInterval();
            float duration = proto.getDuration();
            TextStyleDto textStyleDtoFromProto = TextStyleDto.INSTANCE.fromProto(proto.getStyle());
            ThemedColor color = proto.getColor();
            return new AnimatedRevealTextDto(new Surrogate(text, initial_delay, interval, duration, textStyleDtoFromProto, color != null ? ThemedColorDto.INSTANCE.fromProto(color) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.AnimatedRevealTextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnimatedRevealTextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AnimatedRevealTextDto(null, 0.0f, 0.0f, 0.0f, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AnimatedRevealTextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedRevealTextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/AnimatedRevealTextDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/AnimatedRevealTextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AnimatedRevealTextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.AnimatedRevealText", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AnimatedRevealTextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AnimatedRevealTextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AnimatedRevealTextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AnimatedRevealTextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedRevealTextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.AnimatedRevealTextDto";
        }
    }
}
