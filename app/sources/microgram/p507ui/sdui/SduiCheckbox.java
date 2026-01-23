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
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBO\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b)\u0010*\u001a\u0004\b\u0006\u0010%R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010\u001cR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b1\u0010*\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiCheckbox;", "Lmicrogram/ui/sdui/SduiComponent;", "", "checked", "Lmicrogram/ui/sdui/SduiThemedColor;", "checkedColor", "isEnabled", "", "loggingIdentifier", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "<init>", "(ZLmicrogram/ui/sdui/SduiThemedColor;ZLjava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLmicrogram/ui/sdui/SduiThemedColor;ZLjava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiCheckbox;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getChecked", "()Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getCheckedColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "isEnabled$annotations", "()V", "Ljava/lang/String;", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiCheckbox extends SduiComponent {
    private final boolean checked;
    private final SduiThemedColor checkedColor;
    private final boolean isEnabled;
    private final String loggingIdentifier;
    private final SduiComponentType sduiComponentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, SduiComponentType.INSTANCE.serializer()};

    public SduiCheckbox() {
        this(false, (SduiThemedColor) null, false, (String) null, (SduiComponentType) null, 31, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiCheckbox)) {
            return false;
        }
        SduiCheckbox sduiCheckbox = (SduiCheckbox) other;
        return this.checked == sduiCheckbox.checked && Intrinsics.areEqual(this.checkedColor, sduiCheckbox.checkedColor) && this.isEnabled == sduiCheckbox.isEnabled && Intrinsics.areEqual(this.loggingIdentifier, sduiCheckbox.loggingIdentifier) && this.sduiComponentType == sduiCheckbox.sduiComponentType;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.checked) * 31;
        SduiThemedColor sduiThemedColor = this.checkedColor;
        return ((((((iHashCode + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.loggingIdentifier.hashCode()) * 31) + this.sduiComponentType.hashCode();
    }

    public String toString() {
        return "SduiCheckbox(checked=" + this.checked + ", checkedColor=" + this.checkedColor + ", isEnabled=" + this.isEnabled + ", loggingIdentifier=" + this.loggingIdentifier + ", sduiComponentType=" + this.sduiComponentType + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiCheckbox$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiCheckbox;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiCheckbox> serializer() {
            return SduiCheckbox$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiCheckbox(int i, boolean z, SduiThemedColor sduiThemedColor, @SerialName("is_enabled") boolean z2, @SerialName("logging_identifier") String str, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.checked = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.checkedColor = null;
        } else {
            this.checkedColor = sduiThemedColor;
        }
        if ((i & 4) == 0) {
            this.isEnabled = true;
        } else {
            this.isEnabled = z2;
        }
        if ((i & 8) == 0) {
            this.loggingIdentifier = "";
        } else {
            this.loggingIdentifier = str;
        }
        if ((i & 16) == 0) {
            this.sduiComponentType = SduiComponentType.CHECKBOX;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiCheckbox self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.checked) {
            output.encodeBooleanElement(serialDesc, 0, self.checked);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.checkedColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.checkedColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 2, self.isEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.loggingIdentifier, "")) {
            output.encodeStringElement(serialDesc, 3, self.loggingIdentifier);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.sduiComponentType == SduiComponentType.CHECKBOX) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.sduiComponentType);
    }

    public /* synthetic */ SduiCheckbox(boolean z, SduiThemedColor sduiThemedColor, boolean z2, String str, SduiComponentType sduiComponentType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : sduiThemedColor, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? SduiComponentType.CHECKBOX : sduiComponentType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SduiCheckbox(boolean z, SduiThemedColor sduiThemedColor, boolean z2, String loggingIdentifier, SduiComponentType sduiComponentType) {
        super(null);
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        Intrinsics.checkNotNullParameter(sduiComponentType, "sduiComponentType");
        this.checked = z;
        this.checkedColor = sduiThemedColor;
        this.isEnabled = z2;
        this.loggingIdentifier = loggingIdentifier;
        this.sduiComponentType = sduiComponentType;
    }
}
