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

/* compiled from: ChartAxisLabelDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisLabelDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/ChartAxisLabel;", "Landroid/os/Parcelable;", "surrogate", "Lrh_server_driven_ui/v1/ChartAxisLabelDto$Surrogate;", "<init>", "(Lrh_server_driven_ui/v1/ChartAxisLabelDto$Surrogate;)V", "value", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColorDto;", "text_style", "Lrh_server_driven_ui/v1/TextStyleDto;", "text", "", "(FLrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/TextStyleDto;Ljava/lang/String;)V", "getValue", "()F", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getText_style", "()Lrh_server_driven_ui/v1/TextStyleDto;", "getText", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class ChartAxisLabelDto implements Dto3<ChartAxisLabel>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ChartAxisLabelDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ChartAxisLabelDto, ChartAxisLabel>> binaryBase64Serializer$delegate;
    private static final ChartAxisLabelDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ChartAxisLabelDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ChartAxisLabelDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final float getValue() {
        return this.surrogate.getValue();
    }

    public final ThemedColorDto getColor() {
        return this.surrogate.getColor();
    }

    public final TextStyleDto getText_style() {
        return this.surrogate.getText_style();
    }

    public final String getText() {
        return this.surrogate.getText();
    }

    public /* synthetic */ ChartAxisLabelDto(float f, ThemedColorDto themedColorDto, TextStyleDto textStyleDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? null : themedColorDto, (i & 4) != 0 ? TextStyleDto.INSTANCE.getZeroValue() : textStyleDto, (i & 8) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartAxisLabelDto(float f, ThemedColorDto themedColorDto, TextStyleDto text_style, String text) {
        this(new Surrogate(f, themedColorDto, text_style, text));
        Intrinsics.checkNotNullParameter(text_style, "text_style");
        Intrinsics.checkNotNullParameter(text, "text");
    }

    public static /* synthetic */ ChartAxisLabelDto copy$default(ChartAxisLabelDto chartAxisLabelDto, float f, ThemedColorDto themedColorDto, TextStyleDto textStyleDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            f = chartAxisLabelDto.surrogate.getValue();
        }
        if ((i & 2) != 0) {
            themedColorDto = chartAxisLabelDto.surrogate.getColor();
        }
        if ((i & 4) != 0) {
            textStyleDto = chartAxisLabelDto.surrogate.getText_style();
        }
        if ((i & 8) != 0) {
            str = chartAxisLabelDto.surrogate.getText();
        }
        return chartAxisLabelDto.copy(f, themedColorDto, textStyleDto, str);
    }

    public final ChartAxisLabelDto copy(float value, ThemedColorDto color, TextStyleDto text_style, String text) {
        Intrinsics.checkNotNullParameter(text_style, "text_style");
        Intrinsics.checkNotNullParameter(text, "text");
        return new ChartAxisLabelDto(new Surrogate(value, color, text_style, text));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ChartAxisLabel toProto() {
        float value = this.surrogate.getValue();
        ThemedColorDto color = this.surrogate.getColor();
        return new ChartAxisLabel(value, color != null ? color.toProto() : null, (TextStyle) this.surrogate.getText_style().toProto(), this.surrogate.getText(), null, 16, null);
    }

    public String toString() {
        return "[ChartAxisLabelDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ChartAxisLabelDto) && Intrinsics.areEqual(((ChartAxisLabelDto) other).surrogate, this.surrogate);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChartAxisLabelDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265B@\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBA\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\b4\u0010)\u001a\u0004\b3\u0010\u001e¨\u00067"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisLabelDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "value", "Lrh_server_driven_ui/v1/ThemedColorDto;", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/TextStyleDto;", "text_style", "", "text", "<init>", "(FLrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/TextStyleDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFLrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/TextStyleDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ChartAxisLabelDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getValue", "()F", "getValue$annotations", "()V", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getColor$annotations", "Lrh_server_driven_ui/v1/TextStyleDto;", "getText_style", "()Lrh_server_driven_ui/v1/TextStyleDto;", "getText_style$annotations", "Ljava/lang/String;", "getText", "getText$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ThemedColorDto color;
        private final String text;
        private final TextStyleDto text_style;
        private final float value;

        public Surrogate() {
            this(0.0f, (ThemedColorDto) null, (TextStyleDto) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Float.compare(this.value, surrogate.value) == 0 && Intrinsics.areEqual(this.color, surrogate.color) && this.text_style == surrogate.text_style && Intrinsics.areEqual(this.text, surrogate.text);
        }

        public int hashCode() {
            int iHashCode = Float.hashCode(this.value) * 31;
            ThemedColorDto themedColorDto = this.color;
            return ((((iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31) + this.text_style.hashCode()) * 31) + this.text.hashCode();
        }

        public String toString() {
            return "Surrogate(value=" + this.value + ", color=" + this.color + ", text_style=" + this.text_style + ", text=" + this.text + ")";
        }

        /* compiled from: ChartAxisLabelDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisLabelDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartAxisLabelDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ChartAxisLabelDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, float f, ThemedColorDto themedColorDto, TextStyleDto textStyleDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.value = (i & 1) == 0 ? 0.0f : f;
            if ((i & 2) == 0) {
                this.color = null;
            } else {
                this.color = themedColorDto;
            }
            if ((i & 4) == 0) {
                this.text_style = TextStyleDto.INSTANCE.getZeroValue();
            } else {
                this.text_style = textStyleDto;
            }
            if ((i & 8) == 0) {
                this.text = "";
            } else {
                this.text = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (Float.compare(self.value, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 0, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.value));
            }
            ThemedColorDto themedColorDto = self.color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            if (self.text_style != TextStyleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, TextStyleDto.Serializer.INSTANCE, self.text_style);
            }
            if (Intrinsics.areEqual(self.text, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.text);
        }

        public Surrogate(float f, ThemedColorDto themedColorDto, TextStyleDto text_style, String text) {
            Intrinsics.checkNotNullParameter(text_style, "text_style");
            Intrinsics.checkNotNullParameter(text, "text");
            this.value = f;
            this.color = themedColorDto;
            this.text_style = text_style;
            this.text = text;
        }

        public final float getValue() {
            return this.value;
        }

        public final ThemedColorDto getColor() {
            return this.color;
        }

        public final TextStyleDto getText_style() {
            return this.text_style;
        }

        public /* synthetic */ Surrogate(float f, ThemedColorDto themedColorDto, TextStyleDto textStyleDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? null : themedColorDto, (i & 4) != 0 ? TextStyleDto.INSTANCE.getZeroValue() : textStyleDto, (i & 8) != 0 ? "" : str);
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: ChartAxisLabelDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisLabelDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ChartAxisLabelDto;", "Lrh_server_driven_ui/v1/ChartAxisLabel;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ChartAxisLabelDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ChartAxisLabelDto, ChartAxisLabel> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ChartAxisLabelDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChartAxisLabelDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChartAxisLabelDto> getBinaryBase64Serializer() {
            return (KSerializer) ChartAxisLabelDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ChartAxisLabel> getProtoAdapter() {
            return ChartAxisLabel.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChartAxisLabelDto getZeroValue() {
            return ChartAxisLabelDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChartAxisLabelDto fromProto(ChartAxisLabel proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            float value = proto.getValue();
            ThemedColor color = proto.getColor();
            return new ChartAxisLabelDto(new Surrogate(value, color != null ? ThemedColorDto.INSTANCE.fromProto(color) : null, TextStyleDto.INSTANCE.fromProto(proto.getText_style()), proto.getText()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ChartAxisLabelDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartAxisLabelDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ChartAxisLabelDto(0.0f, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ChartAxisLabelDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisLabelDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartAxisLabelDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ChartAxisLabelDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ChartAxisLabelDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.ChartAxisLabel", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ChartAxisLabelDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ChartAxisLabelDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ChartAxisLabelDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ChartAxisLabelDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisLabelDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.ChartAxisLabelDto";
        }
    }
}
