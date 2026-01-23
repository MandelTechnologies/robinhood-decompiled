package microgram.p507ui.sdui;

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
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiLoadingSpinner;", "Lmicrogram/ui/sdui/SduiComponent;", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiLoadingSpinnerSize;", "size", "<init>", "(Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiLoadingSpinnerSize;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiLoadingSpinnerSize;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiLoadingSpinner;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "()V", "Lmicrogram/ui/sdui/SduiLoadingSpinnerSize;", "getSize", "()Lmicrogram/ui/sdui/SduiLoadingSpinnerSize;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiLoadingSpinner extends SduiComponent {
    private final SduiComponentType sduiComponentType;
    private final SduiLoadingSpinnerSize size;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {SduiComponentType.INSTANCE.serializer(), SduiLoadingSpinnerSize.INSTANCE.serializer()};

    /* JADX WARN: Multi-variable type inference failed */
    public SduiLoadingSpinner() {
        this((SduiComponentType) null, (SduiLoadingSpinnerSize) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiLoadingSpinner)) {
            return false;
        }
        SduiLoadingSpinner sduiLoadingSpinner = (SduiLoadingSpinner) other;
        return this.sduiComponentType == sduiLoadingSpinner.sduiComponentType && this.size == sduiLoadingSpinner.size;
    }

    public int hashCode() {
        return (this.sduiComponentType.hashCode() * 31) + this.size.hashCode();
    }

    public String toString() {
        return "SduiLoadingSpinner(sduiComponentType=" + this.sduiComponentType + ", size=" + this.size + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiLoadingSpinner$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiLoadingSpinner;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiLoadingSpinner> serializer() {
            return SduiLoadingSpinner$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiLoadingSpinner(int i, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiLoadingSpinnerSize sduiLoadingSpinnerSize, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.sduiComponentType = (i & 1) == 0 ? SduiComponentType.LOADING_SPINNER : sduiComponentType;
        if ((i & 2) == 0) {
            this.size = SduiLoadingSpinnerSize.SMALL;
        } else {
            this.size = sduiLoadingSpinnerSize;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiLoadingSpinner self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.sduiComponentType != SduiComponentType.LOADING_SPINNER) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.sduiComponentType);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.size == SduiLoadingSpinnerSize.SMALL) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.size);
    }

    public /* synthetic */ SduiLoadingSpinner(SduiComponentType sduiComponentType, SduiLoadingSpinnerSize sduiLoadingSpinnerSize, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SduiComponentType.LOADING_SPINNER : sduiComponentType, (i & 2) != 0 ? SduiLoadingSpinnerSize.SMALL : sduiLoadingSpinnerSize);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SduiLoadingSpinner(SduiComponentType sduiComponentType, SduiLoadingSpinnerSize size) {
        super(null);
        Intrinsics.checkNotNullParameter(sduiComponentType, "sduiComponentType");
        Intrinsics.checkNotNullParameter(size, "size");
        this.sduiComponentType = sduiComponentType;
        this.size = size;
    }
}
