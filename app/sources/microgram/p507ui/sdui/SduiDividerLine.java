package microgram.p507ui.sdui;

import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*¨\u0006/"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiDividerLine;", "Lmicrogram/ui/sdui/SduiComponent;", "Lmicrogram/ui/sdui/SduiThemedColor;", ResourceTypes.COLOR, "", "height", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "<init>", "(Lmicrogram/ui/sdui/SduiThemedColor;JLmicrogram/ui/sdui/SduiComponentType;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/sdui/SduiThemedColor;JLmicrogram/ui/sdui/SduiComponentType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiDividerLine;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "J", "getHeight", "()J", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "()V", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiDividerLine extends SduiComponent {
    private final SduiThemedColor color;
    private final long height;
    private final SduiComponentType sduiComponentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, SduiComponentType.INSTANCE.serializer()};

    public SduiDividerLine() {
        this((SduiThemedColor) null, 0L, (SduiComponentType) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiDividerLine)) {
            return false;
        }
        SduiDividerLine sduiDividerLine = (SduiDividerLine) other;
        return Intrinsics.areEqual(this.color, sduiDividerLine.color) && this.height == sduiDividerLine.height && this.sduiComponentType == sduiDividerLine.sduiComponentType;
    }

    public int hashCode() {
        return (((this.color.hashCode() * 31) + Long.hashCode(this.height)) * 31) + this.sduiComponentType.hashCode();
    }

    public String toString() {
        return "SduiDividerLine(color=" + this.color + ", height=" + this.height + ", sduiComponentType=" + this.sduiComponentType + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiDividerLine$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiDividerLine;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiDividerLine> serializer() {
            return SduiDividerLine$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiDividerLine(int i, SduiThemedColor sduiThemedColor, long j, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((i & 1) == 0) {
            SduiColor sduiColor = SduiColor.BG3;
            sduiThemedColor = new SduiThemedColor(sduiColor, sduiColor);
        }
        this.color = sduiThemedColor;
        if ((i & 2) == 0) {
            this.height = 1L;
        } else {
            this.height = j;
        }
        if ((i & 4) == 0) {
            this.sduiComponentType = SduiComponentType.DIVIDER_LINE;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_ui(SduiDividerLine self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.color);
        } else {
            SduiThemedColor sduiThemedColor = self.color;
            SduiColor sduiColor = SduiColor.BG3;
            if (!Intrinsics.areEqual(sduiThemedColor, new SduiThemedColor(sduiColor, sduiColor))) {
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.height != 1) {
            output.encodeLongElement(serialDesc, 1, self.height);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.sduiComponentType == SduiComponentType.DIVIDER_LINE) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.sduiComponentType);
    }

    public /* synthetic */ SduiDividerLine(SduiThemedColor sduiThemedColor, long j, SduiComponentType sduiComponentType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            SduiColor sduiColor = SduiColor.BG3;
            sduiThemedColor = new SduiThemedColor(sduiColor, sduiColor);
        }
        this(sduiThemedColor, (i & 2) != 0 ? 1L : j, (i & 4) != 0 ? SduiComponentType.DIVIDER_LINE : sduiComponentType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SduiDividerLine(SduiThemedColor color, long j, SduiComponentType sduiComponentType) {
        super(null);
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(sduiComponentType, "sduiComponentType");
        this.color = color;
        this.height = j;
        this.sduiComponentType = sduiComponentType;
    }
}
